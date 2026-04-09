package com.app.ecom.repository;

import com.app.ecom.model.CartItem;
import com.app.ecom.model.User;
import org.jspecify.annotations.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Nullable List<CartItem> findById(String userId);
}
