package com.example.Library;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RepositoryLibrary extends JpaRepository<LibraryDetails, Integer> {

	
}
