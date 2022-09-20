package com.codeclan.example.filesfoldersperson.repositories;

import com.codeclan.example.filesfoldersperson.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
