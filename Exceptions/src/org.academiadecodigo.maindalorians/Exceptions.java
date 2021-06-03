package org.academiadecodigo.maindalorians;

public class Exceptions {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();

        try {
            fileManager.login();
            fileManager.logout();
            fileManager.login();
            fileManager.createFile("Hello");
            fileManager.getFile("Hello");
            fileManager.login();
            fileManager.createFile("boas");
            fileManager.createFile("troas");
            fileManager.createFile("noas");

        } catch (NotEnoughPermissionsException ex){
            System.out.println("No Permissirino");
        } catch (FileNotFoundException ex) {
            System.out.println("No Filerino");;
        }
        catch (NotEnoughSpaceException ex){
            System.out.println("No Spacerino");
        }
    }
}
