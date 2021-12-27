package com.example.Jobs.repository;

import com.example.Jobs.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.Date;

public interface JobRepository extends JpaRepository<Job, Long>{//}, JpaSpecificationExecutor<Job> {
    @Query("select j from Job j where mod(:minutes,j.period)=j.period_mod")
    Collection<Job> getReadyJobs(@Param("minutes")int minutes);
}
