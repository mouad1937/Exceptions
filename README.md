# Exceptions

the job of Exception is to handle the Error ;
how to create a new File and fix the error ,
public Static Void createNewFile(){
File file = new File("resources/nonexistant.txt");
file.createNewFile(); // this will give us an error and to handle with it we have two methods ;

1/ try /catch

we add try after creating the File and catch before the calling the error ,
ex;
try {file.createNewFile();
}{catch (Exceptions  a ){sout ("put a message ")}




Exceptions is the super Class of all exceptions ,



we can use multiple catch depends on how many type of errors we have to handle .

we can use defferent exception type in one () separated by | 
ex; catch (InputMismatchException | FileNotFoundExceptions e )

if we don t  want to use sout after catches we can just write the name of the exception created and we have different option to use
ex 
e.printStackTrack();
e.message



we have the finally clause is optional to clause ,
so after try catch we can add finally{ fileReader.close();
}

second method to handle exceptions ;
rethrowing exceptions :
create a new file program but do not catch anything ,
we use the key word ( throws ) after the () method's name than we can write what exception is it after the key 


and before calling inside the main use the same key word after the mathods arguments



