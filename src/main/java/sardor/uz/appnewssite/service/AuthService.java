package sardor.uz.appnewssite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sardor.uz.appnewssite.entity.Role;
import sardor.uz.appnewssite.entity.User;
import sardor.uz.appnewssite.payload.ApiResponse;
import sardor.uz.appnewssite.payload.RegisterDto;
import sardor.uz.appnewssite.repository.RoleRepository;
import sardor.uz.appnewssite.repository.UserRepository;

@Service
public class AuthService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    public ApiResponse registerUser(RegisterDto registerDto) {
        if (userRepository.existsByUsername(registerDto.getUsername()))
            return new ApiResponse("Bunday username allaqachon royxatdan o'tgan", false);
//        User user = new User(
//                registerDto.getFullName(),
//                registerDto.getUsername(),
//                null,


        return null;
    }
}
