package com.raon.core.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class  CommonVo {

    @Column(name = "REG_ID")
    private String regId;
    @CreatedDate
    @Column(name = "REG_DT" , updatable = false)
    private LocalDate regDt;

    @Column(name = "MOD_ID")
    private String modId;
    @Column(name = "MOD_DT")
    @LastModifiedDate
    private LocalDate modDt;


  /*  @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;*/

}
