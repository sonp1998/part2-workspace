/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.personnel;

import static org.junit.Assert.*;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Before;
import org.junit.Test;

public class EmployeeStreamsTest {
  
  private Collection<Employee> allEmployees;
  
  @Before
  public void setUp() {
    allEmployees = Department.getDepartment().getEmployees();
  }
  
  /**
   * TASK: find all Employees with salary < 40000.0 and sort them by natural order.
   * Employee implements Comparable: natural order is id increasing.
   * 
   * RESULT: Employees 2 and 15, in that order.
   */
  @Test
  public void testSalaryLessThanSortNaturalOrder() {
    List<Employee> employees = allEmployees // allEmployees is a collection. All collections can be turned into a stream.
        .stream()  //Feeding a stream with a list on a 'conveyor belt'. Starting a sequence of operations.
      .filter(emp -> emp.getSalary() < 40000.0) // if empSalary <40,000 this expression true. Lambda is instance of predicate functional interface.
      .sorted()  // natural order
      .collect(Collectors.toList()); // now collect all into a list.
    
    assertEquals(2, employees.size()); // gather that size, we are expecting 2 from it.
    assertEquals(Long.valueOf(2),  employees.get(0).getId()); // In a list, with a concept of position.
    assertEquals(Long.valueOf(15), employees.get(1).getId());
  }
}