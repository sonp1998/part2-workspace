package com.javatunes.personnel;

import static org.junit.Assert.*;

import gov.irs.TaxPayer;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {

  private SalariedEmployee emp;

  private static final double SALARY = 100_000;
  private static final double TOLERANCE = 0.001;
  private static final double TAX = SALARY * TaxPayer.SALARIED_TAX_RATE;

  @Before
  public void setUp() {
    emp = new SalariedEmployee("Philip Son", new Date(120,1,1), SALARY);
  }

  @Test
  public void pay() {
    assertEquals(SALARY, emp.pay(), TOLERANCE);
  }

  @Test
  public void payTaxes() {
    assertEquals(TAX, emp.payTaxes(),TOLERANCE);
  }
}