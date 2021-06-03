package org.academiadecodigo.maindalorians;

public class FileManager {
    private boolean isLoggedIn;
    private File[] files = new File[3];

    public void login() {
        isLoggedIn = true;

    }

    public void logout() throws NotEnoughPermissionsException{
    if (!isLoggedIn) {
        throw new NotEnoughPermissionsException();
    }
    isLoggedIn = false;
    }

    public File getFile(String name) throws NotEnoughPermissionsException, FileNotFoundException {
       if(!isLoggedIn) {
           throw new NotEnoughPermissionsException();
       }
      for (int i = 0; i < files.length; i++){
          if (files[i] == null){
              throw new FileNotFoundException();
          }
          if (files[i].getName().equals(name)) {
              return files[i];
          }
      }
        throw new FileNotFoundException();

    }
    public void createFile(String name) throws NotEnoughSpaceException {
        for (int i = 0; i < files.length; i++){
            if (files[i] == null){
                files[i] = new File(name);
                return;
            }
            throw new NotEnoughSpaceException();
        }
    }
}
