package com.bookSphere.bookSphere.repositories;

import com.bookSphere.bookSphere.models.OrderBuy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderBuyRepository extends JpaRepository<OrderBuy,Long> {
}
