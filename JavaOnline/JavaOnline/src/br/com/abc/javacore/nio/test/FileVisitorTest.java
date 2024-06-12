package br.com.abc.javacore.nio.test;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class AcharTodosOsBkp extends SimpleFileVisitor<Path>{
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {		
		  if(file.getFileName().toString().endsWith(".bkp")) {
		  System.out.println(file.getFileName()); }
		 
		return FileVisitResult.CONTINUE;
	}
}

public class FileVisitorTest {
	public static void main(String[] args) throws IOException {
		Files.walkFileTree(Paths.get("pasta"), new PrintDirs());
	}
}

class PrintDirs extends SimpleFileVisitor<Path>{
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
		System.out.println("pre: "+dir);
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		System.out.println("file: "+file.getFileName());
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) 
		throws IOException {
		return FileVisitResult.CONTINUE;
	}
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) 
		throws IOException {
		System.out.println("post: "+dir);
		return FileVisitResult.CONTINUE;
	}
}
