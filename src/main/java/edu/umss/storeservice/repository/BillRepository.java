/**
 * @author: Jose Iriarte
 */

package edu.umss.storeservice.repository;

import edu.umss.storeservice.model.Bill;
import org.springframework.stereotype.Repository;

@Repository
public class BillRepository extends StoredProcedureRepositoryImpl<Bill> {

}