package jvm.pablohdz.courseapplication.role;

import java.util.List;

public interface RoleService {
    /**
     * Stores a role in the implemented persistence service.
     *
     * @param role the object role to persistence
     * @return role saved in the persistence service
     */
    Role saveRole(Role role);

    List<Role> findRoles();
}
