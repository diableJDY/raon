package com.raon.core.domain.login;
import com.raon.core.domain.CommonVo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "TB_MEMBER")
@Entity
@Getter
@Setter
@Data
public class Member extends CommonVo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;


}
