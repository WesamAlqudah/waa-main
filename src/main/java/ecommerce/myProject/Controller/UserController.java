package ecommerce.myProject.Controller;

import ecommerce.myProject.Domain.Users;
import ecommerce.myProject.Service.UserService;
import ecommerce.myProject.dto.UserAvailabilityRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public Iterable<Users> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public Users addUser(@RequestBody Users users){
        return  userService.addUser(users);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable long id){
          userService.deleteUser(id);
    }

    @GetMapping("/users/isUsernameAvailable")
    public Users checkUserExistence(@RequestBody UserAvailabilityRequestDto userAvailabilityRequestDto){
        return userService.isUsernameAvailable(userAvailabilityRequestDto);
    }


}
