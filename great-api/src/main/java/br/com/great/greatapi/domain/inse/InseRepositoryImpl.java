package br.com.great.greatapi.domain.inse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InseRepositoryImpl implements InseRepositoryCustom {

    @Autowired
    MongoTemplate mongoTemplate;

    public List<Inse> customQuery(String city, String school, String uf) {
        Query query = new Query();

        if (city != null) {
            query.addCriteria(Criteria.where("NO_MUNICIPIO").regex(city, "i"));
        }
        if (school != null) {
            query.addCriteria(Criteria.where("NO_ESCOLA").regex(school, "i"));
        }

        if (uf != null) {
            query.addCriteria(Criteria.where("SG_UF").regex(uf, "i"));
        }

        return this.mongoTemplate.find(query, Inse.class);
    }
}
