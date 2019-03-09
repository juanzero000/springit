package com.juanzero.springit.repository;

import com.juanzero.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
    Link findByTitle(String title);
}
