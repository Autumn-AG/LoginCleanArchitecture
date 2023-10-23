package data_access;

import use_case.clear_users.ClearUserDataAccessInterface;

import java.io.*;
public class ClearDataAccessObject implements ClearUserDataAccessInterface {
    private final File csvFile;

    public ClearDataAccessObject(String csvPath) throws IOException {

        csvFile = new File(csvPath);}

    @Override
    public void clearAllData() {

    }
}