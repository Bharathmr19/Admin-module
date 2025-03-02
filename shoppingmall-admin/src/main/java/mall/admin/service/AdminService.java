package mall.admin.service;

import mall.admin.model.Admin;
import mall.admin.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    // Get all admins
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    // Get admin by ID
    public Optional<Admin> getAdminById(Long id) {
        return adminRepository.findById(id);
    }

    // Create new admin
    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    // Update existing admin
    public Admin updateAdmin(Long id, Admin adminDetails) {
        return adminRepository.findById(id).map(admin -> {
            admin.setUsername(adminDetails.getUsername());
            admin.setPassword(adminDetails.getPassword());
            admin.setRole(adminDetails.getRole());
            return adminRepository.save(admin);
        }).orElse(null);
    }

    // Delete admin
    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }
}
