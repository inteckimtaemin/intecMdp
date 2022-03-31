package com.webmister.semicolon.repository;

import com.webmister.semicolon.domain.Report;
import com.webmister.semicolon.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {

    Report getById();
}
