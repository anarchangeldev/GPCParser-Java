package GPCParser;

import GPCParser.GPCDataType074;
import GPCParser.GPCDataType075;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Zen1th\\IdeaProjects\\GPCParser\\src\\testingData.gpc";
        try {
            List<Object> entries = parseGPCFile(filePath);
            for (Object entry : entries) {
                System.out.println(entry.toString());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Object> parseGPCFile(String filePath) {
        List<Object> entries = new ArrayList<Object>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {

                if (line.startsWith("074")) {
                    GPCDataType074 payment = parseEntryType074(line);
                    entries.add(payment);
                } else if (line.startsWith("075")) {
                    GPCDataType075 payment = parseEntryType075(line);
                    entries.add(payment);
                } else {
                    System.out.println("Invalid entry: " + line);
                }
            }
        } catch (IOException e) {
            //throw new RuntimeException(e);
        } //catch (NumberFormatException e) {}

        return entries;
    }

    private static GPCDataType074 parseEntryType074(String line) {
        GPCDataType074 entry = new GPCDataType074();

        entry.setType(Integer.parseInt(line.substring(0, 3)));
        entry.setAccountNumber(String.valueOf(Integer.parseInt(line.substring(3, 19))));
        entry.setAccountName(line.substring(19, 39).trim());
        entry.setBalanceDate(line.substring(39, 45));
        entry.setOldBalanceAmount(Long.parseLong(line.substring(45, 59)));
        entry.setOldBalanceSign(line.charAt(59));
        entry.setNewBalanceAmount(Long.parseLong(line.substring(60, 74)));
        entry.setNewBalanceSign(line.charAt(74));
        entry.setDebitTurnover(Long.parseLong(line.substring(75, 89)));
        entry.setDebitTurnoverSign(line.charAt(89));
        entry.setCreditTurnover(Long.parseLong(line.substring(90, 104)));
        entry.setCreditTurnoverSign(line.charAt(104));
        entry.setStatementNumber(Integer.parseInt(line.substring(105, 108)));
        entry.setAccountingDate(line.substring(108, 114));

        return entry;
    }

    private static GPCDataType075 parseEntryType075(String line) {
        GPCDataType075 entry = new GPCDataType075();

        entry.setType(Integer.parseInt(line.substring(0, 3)));
        entry.setAssignedAccountNumber(line.substring(3, 19).trim());
        entry.setAccountNumber(line.substring(19, 35).trim());
        entry.setDocumentNumber(line.substring(35, 48).trim());
        entry.setBalanceAmount(Long.parseLong(line.substring(48, 60)));
        entry.setAccountingCode(Integer.parseInt(String.valueOf(line.charAt(60))));
        entry.setVariableSymbol(Integer.parseInt(line.substring(61, 71)));
        entry.setConstantSymbol(Integer.parseInt(line.substring(71, 81)));
        entry.setSpecificSymbol(Integer.parseInt(line.substring(81, 91)));
        entry.setClientName(line.substring(97, 117).trim());
        entry.setCurrencyCode(Integer.parseInt(line.substring(118, 122)));
        entry.setPaymentDate(line.substring(122, 128));

        return entry;
    }

}