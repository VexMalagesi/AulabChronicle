package it.aulab.aulab_chronicle.utils;

public class StringManipulation {

    public static String getFileExtension(String nameFile) {
        int dotIndex = nameFile.lastIndexOf('.');
        String extension = nameFile.substring(dotIndex + 1);
        return extension;
    }

    //Supabase non accetta lettere accentate e caratteri speciali nel nome del file, quindi li sostituisco con _
    public static String cleanFileName(String nameFile) {
        return nameFile.replaceAll("[^A-Za-z0-9._-]", "_");
    }
}
