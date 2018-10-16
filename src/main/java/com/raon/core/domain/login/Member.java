package com.raon.core.domain.login;
import com.raon.core.domain.CommonVo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;

@Table(name = "TB_MEMBER")
@Entity
@Getter
@Setter
@Data
public class Member extends CommonVo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Idx")
    private Long idx;

    @Column(name = "name")
    private String name;

    @Column(name = "id")
    private String id;

    @Column(name = "pw")
    private String pw;

    @Column(name = "email")
    private String email;

    @Column(name = "cellphone")
    private String cellphone;

    public Member() {}
    public Member(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    @Override
    public String toString() {
        return new StringBuilder("{ idx : ").append(idx).append(", id : ").append(id).append(", name : ").append(name).append(", email : ").append(email).append(", cellphone : ").append(cellphone).append(" }").toString();
    }
}
