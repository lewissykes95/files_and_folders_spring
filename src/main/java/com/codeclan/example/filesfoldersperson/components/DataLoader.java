package com.codeclan.example.filesfoldersperson.components;

import com.codeclan.example.filesfoldersperson.models.File;
import com.codeclan.example.filesfoldersperson.models.Folder;
import com.codeclan.example.filesfoldersperson.models.Person;
import com.codeclan.example.filesfoldersperson.repositories.FileRepository;
import com.codeclan.example.filesfoldersperson.repositories.FolderRepository;
import com.codeclan.example.filesfoldersperson.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


//@Component
public class DataLoader implements ApplicationRunner {

    public DataLoader() {

    }

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {


        Person person = new Person("Lewis");
        personRepository.save(person);


        Folder folder1 = new Folder("Python Module", person);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("JavaScript Module", person);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Java Module", person);
        folderRepository.save(folder3);


        File file1 = new File("Variables", ".py", 5, folder1);
        fileRepository.save(file1);

        File file2 = new File("Loops", ".py", 8, folder1);
        fileRepository.save(file2);

        File file3 = new File("React", ".js", 10, folder2);
        fileRepository.save(file3);

        File file4 = new File("Routes", ".js", 12, folder2);
        fileRepository.save(file4);

        File file5 = new File("Spring", ".java", 10, folder3);
        fileRepository.save(file5);

        File file6 = new File("Polymorphism", ".java", 13, folder3);
        fileRepository.save(file6);


        folder1.addFile(file1);
        folder1.addFile(file2);
        folderRepository.save(folder1);

        folder2.addFile(file3);
        folder2.addFile(file4);
        folderRepository.save(folder2);

        folder3.addFile(file5);
        folder3.addFile(file6);
        folderRepository.save(folder3);

        person.addFolder(folder1);
        person.addFolder(folder2);
        person.addFolder(folder3);
        personRepository.save(person);

    }

}
