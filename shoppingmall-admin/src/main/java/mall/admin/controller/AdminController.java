package mall.admin.controller;

import mall.admin.model.Admin;
import mall.admin.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admins")
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    // Insert (POST)
    @PostMapping("/add")
    public Admin createAdmin(@RequestBody Admin admin) {
        return adminRepository.save(admin);
    }

    // Get all admins
    @GetMapping("/list")
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    // Update Admin (PUT)
    @PutMapping("/update/{id}")
    public Admin updateAdmin(@PathVariable Long id, @RequestBody Admin adminDetails) {
        Admin admin = adminRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Admin not found"));
        admin.setUsername(adminDetails.getUsername());
        admin.setPassword(adminDetails.getPassword());
        admin.setRole(adminDetails.getRole());
        return adminRepository.save(admin);
    }

    // Delete Admin (DELETE)
    @DeleteMapping("/delete/{id}")
    public String deleteAdmin(@PathVariable Long id) {
        adminRepository.deleteById(id);
        return "Admin deleted with id: " + id;
    }
}
