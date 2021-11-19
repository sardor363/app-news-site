package sardor.uz.appnewssite.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import sardor.uz.appnewssite.entity.enums.Permission;
import sardor.uz.appnewssite.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Role extends AbsEntity {

    @Column(unique = true, nullable = false)
    private String name;

    @ElementCollection
    private List<Permission> permissionList;
}
