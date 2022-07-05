package org.igokaw.repository.sdatajpa;

import org.igokaw.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//w interfejsie JpaRepository mamy juz wszystkie potrzebne metody, add/findall/find/delete/CRUDRepository/...
public interface SpringDataJpaUserRepository extends JpaRepository<User, Integer> {


//TODO -- stworzyć SPRING DATA JPA repozytorium dla usera i klienta i orderów ->
// w serwisie podmienić bazy danych i utworzyć nowy qualifier dla springdatajparep


}
