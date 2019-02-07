class Item2{
	public void print(){
		System.out.println("Hello World!");
}
}

class ClasspathDemo2{
public static void main(String[] args){
	Item2 item = new Item2();
	item.print();
}
}

/*
* 1. compile this java code 'javac ClasspathDemo2.java'
* 2. check that there are two new class files generated (Item2.class, ClasspathDemo2.class)
* 3. then 'java ClasspathDemo2' or 'java -classpath "." ClasspathDemo2' to run this code
* 4. see if it works (it will.)
* 5. then move one of the two class files into a new directory called 'lib'
* 6. repeat the third step
* 7. it will not work, because one of the necessary class files is not in the current directory (ONLY IF YOU DIDNT SET .;lib AT 사용자변수)
* 8. if you put 'java -classpath ".;lib" ClasspathDemo2', it will work!
* 9. semicolon acts as a boundary between two directories.
* 10. it will help the compiler to scan multiple directories.
*/