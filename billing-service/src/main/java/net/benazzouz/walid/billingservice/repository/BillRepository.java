package net.benazzouz.walid.billingservice.repository;

import net.benazzouz.walid.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository  extends JpaRepository<Bill, Long> {
}
