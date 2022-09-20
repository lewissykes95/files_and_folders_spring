package com.codeclan.example.filesfoldersperson.repositories;
import com.codeclan.example.filesfoldersperson.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {



}
