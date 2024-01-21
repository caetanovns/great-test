package br.com.great.greatapi.domain.inse;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface InseRepository extends MongoRepository<Inse, Long>, InseRepositoryCustom {
    Inse findById(String id);
}
