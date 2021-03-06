/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package demo.model;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DeptViewWithBindVariableImpl extends ViewObjectImpl {
  /**This is the default constructor (do not remove)
   */
  public DeptViewWithBindVariableImpl() {
  }

  /**Gets the bind variable value for TheName
   */
  public String getTheName() {
    return (String)getNamedWhereClauseParam("TheName");
  }

  /**Sets <code>value</code> for bind variable TheName
   */
  public void setTheName(String value) {
    setNamedWhereClauseParam("TheName", value);
  }
}
