package net.benazzouz.walid.billingservice.repository;

import net.benazzouz.walid.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
}
