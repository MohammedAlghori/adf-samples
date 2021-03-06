/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package sample.common;

import oracle.jbo.common.JboResourceBundle;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---------------------------------------------------------------------
public class EmpImplMsgBundle extends JboResourceBundle {


    static final Object[][] sMessageStrings = 
    {
{ "Ename_LABEL", "Employee Name" },
{ "Ename_Rule_0", "Ename value cannot be XXXXX!" },
{ "Empno_LABEL", "Employee Id" },
{ "Job_LABEL", "Job Description" },
{ "Hiredate_FMT_FORMAT", "dd-MMM-yyyy" },
{ "Comm_LABEL", "Commission" },
{ "Mgr_LABEL", "Manager" },
{ "Deptno_LABEL", "Department" },
{ "Hiredate_FMT_FORMATTER", "oracle.jbo.format.DefaultDateFormatter" },
{ "Hiredate_LABEL", "Date of Hire" },
{ "Sal_LABEL", "Salary" }};

    /**This is the default constructor (do not remove)
     */
    public EmpImplMsgBundle() {
    }

    /**@return an array of key-value pairs.
     */
    public Object[][] getContents() {
        return super.getMergedArray(sMessageStrings, super.getContents());
    }
}
