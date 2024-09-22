package academy.digitallab.store.shopping.repository;

import academy.digitallab.store.shopping.entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
}
