package yjjeondlvry.domain;

import yjjeondlvry.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="tsts", path="tsts")
public interface TstRepository extends PagingAndSortingRepository<Tst, >{
}