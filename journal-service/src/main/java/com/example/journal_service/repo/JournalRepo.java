package com.example.journal_service.repo;

import com.example.journal_service.entity.Journal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface JournalRepo extends JpaRepository<Journal, Long> {

//    List<Journal> findByUserIdAndIsDeletedFalseOrderByDateDesc(String userId);

    Page<Journal> findByUserIdAndIsDeletedFalse(String userId, Pageable pageable);

    Optional<Journal> findByUserIdAndDateAndIsDeletedFalse(String userId, LocalDate today);
}
