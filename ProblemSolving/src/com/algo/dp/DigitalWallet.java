package com.algo.dp;


/*
 * Create TransactionException, DigitalWallet, and DigitalWalletTransaction classes here.
 */
 class TransactionException extends RuntimeException{
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String toString() {
		return "TransactionException [errorMessage=" + errorMessage + ", errorCode=" + errorCode + "]";
	}

	private final String errorMessage;
    private final String errorCode;
     public TransactionException(String errorMessage,String errorCode){
    	 super(errorMessage);
         this.errorMessage = errorMessage;
         this.errorCode = errorCode;
     }
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
     
   
 }
 class DigitalWallet{
     private String walletId;
     private String username;
     private String userAccessCode;
     private int walletBalance;
     public DigitalWallet(String walletId,String userName){
         this.walletId = walletId;
         this.username = userName;
     }
     public DigitalWallet(String walletId,String userName,String userAccessCode){
         this.walletId = walletId;
         this.username = userName;
         this.userAccessCode = userAccessCode;
     }
         public String getWalletId() {
        return walletId;
    }
    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }
    
    public String getUserAccessCode() {
        return userAccessCode;
    }
    public void setUserAccessCode(String userAccessCode) {
        this.userAccessCode = userAccessCode;
    }
    public int getWalletBalance() {
        return walletBalance;
    }
    public void setWalletBalance(int walletBalance) {
        this.walletBalance = walletBalance;
    }
 }
 
 class DigitalWalletTransaction{
	 
     void addMoney(DigitalWallet digitalWallet,int amount) throws TransactionException{
         if(digitalWallet.getUserAccessCode() == null || digitalWallet.getUserAccessCode().length() == 0){
             throw new TransactionException("User not authorized.","USER_NOT_AUTHORIZED");
         }
         if(digitalWallet.getWalletBalance() < amount){
             throw new TransactionException("Insufficient balance.","INSUFFICIENT_BALANCE");
         }
         if(amount < 0){
             throw new TransactionException("Amount should be greater than zero.","INVALID_AMOUNT");
         }
         int newAmount = digitalWallet.getWalletBalance() + amount;
         digitalWallet.setWalletBalance(newAmount);
         System.out.print("Wallet successfully credited.");
         return;
     }
     
     void payMoney(DigitalWallet DigitalWallet,int amount){
         
     }
 }