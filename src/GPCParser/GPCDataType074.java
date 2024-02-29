package GPCParser;

public class GPCDataType074 {

    private int type;
    private String accountNumber;
    private String accountName;
    private String oldBalanceDate;
    private long oldBalanceAmount;
    private char oldBalanceSign;
    private long newBalanceAmount;
    private char newBalanceSign;
    private long debitTurnover;
    private char debitTurnoverSign;
    private long creditTurnover;
    private char creditTurnoverSign;
    private int statementNumber;
    private String accountingDate;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBalanceDate() {
        return oldBalanceDate;
    }

    public void setBalanceDate(String balanceDate) {
        this.oldBalanceDate = balanceDate;
    }

    public long getOldBalanceAmount() {
        return oldBalanceAmount;
    }

    public void setOldBalanceAmount(long oldBalanceAmount) {
        this.oldBalanceAmount = oldBalanceAmount;
    }

    public char getOldBalanceSign() {
        return oldBalanceSign;
    }

    public void setOldBalanceSign(char oldBalanceSign) {
        this.oldBalanceSign = oldBalanceSign;
    }

    public long getNewBalanceAmount() {
        return newBalanceAmount;
    }

    public void setNewBalanceAmount(long newBalanceAmount) {
        this.newBalanceAmount = newBalanceAmount;
    }

    public char getNewBalanceSign() {
        return newBalanceSign;
    }

    public void setNewBalanceSign(char newBalanceSign) {
        this.newBalanceSign = newBalanceSign;
    }

    public long getDebitTurnover() {
        return debitTurnover;
    }

    public void setDebitTurnover(long debitTurnover) {
        this.debitTurnover = debitTurnover;
    }

    public char getDebitTurnoverSign() {
        return debitTurnoverSign;
    }

    public void setDebitTurnoverSign(char debitTurnoverSign) {
        this.debitTurnoverSign = debitTurnoverSign;
    }

    public long getCreditTurnover() {
        return creditTurnover;
    }

    public void setCreditTurnover(long creditTurnover) {
        this.creditTurnover = creditTurnover;
    }

    public char getCreditTurnoverSign() {
        return creditTurnoverSign;
    }

    public void setCreditTurnoverSign(char creditTurnoverSign) {
        this.creditTurnoverSign = creditTurnoverSign;
    }

    public int getStatementNumber() {
        return statementNumber;
    }

    public void setStatementNumber(int statementNumber) {
        this.statementNumber = statementNumber;
    }

    public String getAccountingDate() {
        return accountingDate;
    }

    public void setAccountingDate(String accountingDate) {
        this.accountingDate = accountingDate;
    }

    @Override
    public String toString() {
        return "GPCDataType074{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountName='" + accountName + '\'' +
                ", oldBalanceDate='" + oldBalanceDate + '\'' +
                ", oldBalanceAmount=" + oldBalanceAmount +
                ", oldBalanceSign=" + oldBalanceSign +
                ", newBalanceAmount=" + newBalanceAmount +
                ", newBalanceSign=" + newBalanceSign +
                ", debitTurnover=" + debitTurnover +
                ", debitTurnoverSign=" + debitTurnoverSign +
                ", creditTurnover=" + creditTurnover +
                ", creditTurnoverSign=" + creditTurnoverSign +
                ", statementNumber=" + statementNumber +
                ", accountingDate='" + accountingDate + '\'' +
                '}';
    }
}
