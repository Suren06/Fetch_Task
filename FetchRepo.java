package Repository;

import Model.Users;
import org.springframework.data.repository.CrudRepository;

    public interface FetchRepo extends CrudRepository<Users, Integer> {
        Users findByFullName(String username);
}
