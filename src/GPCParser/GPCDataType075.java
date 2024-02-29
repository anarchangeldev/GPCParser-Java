package GPCParser;
public class GPCDataType075 {

    private int type;
    private String assignedAccountNumber;
    private String accountNumber;
    private String documentNumber;
    private long balanceAmount;
    private int accountingCode;
    private int variableSymbol;
    private int constantSymbol;
    private int specificSymbol;
    private String clientName;
    private int currencyCode;
    private String paymentDate;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAssignedAccountNumber() {
        return assignedAccountNumber;
    }

    public void setAssignedAccountNumber(String assignedAccountNumber) {
        this.assignedAccountNumber = assignedAccountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public long getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(long balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public int getAccountingCode() {
        return accountingCode;
    }

    public void setAccountingCode(int accountingCode) {
        this.accountingCode = accountingCode;
    }

    public int getVariableSymbol() {
        return variableSymbol;
    }

    public void setVariableSymbol(int variableSymbol) {
        this.variableSymbol = variableSymbol;
    }

    public int getConstantSymbol() {
        return constantSymbol;
    }

    public void setConstantSymbol(int constantSymbol) {
        this.constantSymbol = constantSymbol;
    }

    public int getSpecificSymbol() {
        return specificSymbol;
    }

    public void setSpecificSymbol(int specificSymbol) {
        this.specificSymbol = specificSymbol;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(int currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "GPCDataType075{" +
                "assignedAccountNumber='" + assignedAccountNumber + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                ", balanceAmount=" + balanceAmount +
                ", accountingCode=" + accountingCode +
                ", variableSymbol=" + variableSymbol +
                ", constantSymbol=" + constantSymbol +
                ", specificSymbol=" + specificSymbol +
                ", clientName='" + clientName + '\'' +
                ", currencyCode=" + currencyCode +
                ", paymentDate='" + paymentDate + '\'' +
                '}';
    }
}
