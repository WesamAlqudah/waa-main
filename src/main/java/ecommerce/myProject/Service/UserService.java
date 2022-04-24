package ecommerce.myProject.Service;

import ecommerce.myProject.Domain.Users;
import ecommerce.myProject.dto.UserAvailabilityRequestDto;


public interface UserService {

    Users getUserByUsername(String username);

    Iterable<Users> getAllUsers();

    Users getUserById(long id);

    Users addUser(Users users);

    void deleteUser(long id);

    Users isUsernameAvailable(UserAvailabilityRequestDto userAvailabilityRequestDto);

}
