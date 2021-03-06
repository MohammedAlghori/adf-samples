/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
// $Header: /cvs/ADFToyStoreJSF/ToyStoreModel/src/toystore/model/services/client/ToyStoreServiceClient.java,v 1.1.1.1 2006/01/26 21:47:22 steve Exp $
package toystore.model.services.client;
import oracle.jbo.client.remote.ApplicationModuleImpl;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------
public class ToyStoreServiceClient extends ApplicationModuleImpl implements toystore.model.services.common.ToyStoreService {
  /**
   *
   *  This is the default constructor (do not remove)
   */
  public ToyStoreServiceClient() {
  }

  public void createNewOrder() {
    Object _ret = this.riInvokeExportedMethod(this, "createNewOrder", null, null);
    return;
  }
  public void addItemToCart(String itemid) {
    Object _ret = 
      this.riInvokeExportedMethod(this,"addItemToCart",new String [] {"java.lang.String"},new Object[] {itemid});
    return;
  }
  public boolean adjustQuantityInCart(String[] itemid, long[] qty) {
    Object _ret = 
      this.riInvokeExportedMethod(this,"adjustQuantityInCart",new String [] {"[Ljava.lang.String;","[J"},new Object[] {itemid, qty});
    return ((Boolean)_ret).booleanValue();
  }
  public void createNewOrder(String currentUsername) {
    Object _ret = 
      this.riInvokeExportedMethod(this,"createNewOrder",new String [] {"java.lang.String"},new Object[] {currentUsername});
    return;
  }
  public long currentQuantityInCart(String itemid) {
    Object _ret = 
      this.riInvokeExportedMethod(this,"currentQuantityInCart",new String [] {"java.lang.String"},new Object[] {itemid});
    return ((Long)_ret).longValue();
  }
  public String finalizeOrder() {
    Object _ret = this.riInvokeExportedMethod(this,"finalizeOrder",null,null);
    return (String)_ret;
  }
  public Double getCartTotal() {
    Object _ret = this.riInvokeExportedMethod(this,"getCartTotal",null,null);
    return (Double)_ret;
  }
  public boolean isCartEmpty() {
    Object _ret = this.riInvokeExportedMethod(this,"isCartEmpty",null,null);
    return ((Boolean)_ret).booleanValue();
  }
  public void prepareToCreateNewAccount() {
    Object _ret = 
      this.riInvokeExportedMethod(this,"prepareToCreateNewAccount",null,null);
    return;
  }
  public boolean prepareToEditAccountInfoFor(String username) {
    Object _ret = 
      this.riInvokeExportedMethod(this,"prepareToEditAccountInfoFor",new String [] {"java.lang.String"},new Object[] {username});
    return ((Boolean)_ret).booleanValue();
  }
  public void removeItemFromCart(String itemid) {
    Object _ret = 
      this.riInvokeExportedMethod(this,"removeItemFromCart",new String [] {"java.lang.String"},new Object[] {itemid});
    return;
  }
  public void removeShoppingCartItemsWithZeroQuantity() {
    Object _ret = 
      this.riInvokeExportedMethod(this,"removeShoppingCartItemsWithZeroQuantity",null,null);
    return;
  }
  public boolean validSignon(String username, String password) {
    Object _ret = 
      this.riInvokeExportedMethod(this,"validSignon",new String [] {"java.lang.String","java.lang.String"},new Object[] {username, password});
    return ((Boolean)_ret).booleanValue();
  }
}
