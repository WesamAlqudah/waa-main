package ecommerce.myProject.Service;
import ecommerce.myProject.Domain.Users;
import ecommerce.myProject.dto.UserAvailabilityRequestDto;
import ecommerce.myProject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Users getUserByUsername(String username) {
        return userRepository.findByUsername(username).get();
    }

    @Override
    public Iterable<Users> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Users getUserById(long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public Users addUser(Users users) {
        return userRepository.save(users);
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);

    }

    @Override
    public Users isUsernameAvailable(UserAvailabilityRequestDto userAvailabilityRequestDto) {
        return userRepository.findByUsername(userAvailabilityRequestDto.getUsername()).get();
    }
}
