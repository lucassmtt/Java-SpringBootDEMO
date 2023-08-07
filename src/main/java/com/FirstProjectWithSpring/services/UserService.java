package com.FirstProjectWithSpring.services;

import com.FirstProjectWithSpring.entities.User;
import com.FirstProjectWithSpring.repositories.UserRepository;
import com.FirstProjectWithSpring.services.exceptions.DatabaseException;
import com.FirstProjectWithSpring.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAllUsers(){
        return repository.findAll();
    }

    public User findById(Long Id) throws ResourceNotFoundException {
        Optional<User> obj = repository.findById(Id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(Id));
    }

    public User insert(User user) {
        return repository.save(user);
    }

    public void delete(Long id) {
        try {
            repository.deleteById(id);
        }
        catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        }
        catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User user) {
        try {
            User entity = repository.getReferenceById(id);
            updateData(entity, user);
            return repository.save(entity);
        }
        catch(EntityNotFoundException e){
            throw new ResourceNotFoundException(e.getMessage());
        }
    }

    private void updateData(User entity, User user) {
        entity.setEmail(user.getEmail());
        entity.setName(user.getName());
        entity.setPhone(user.getPhone());
    }
}
