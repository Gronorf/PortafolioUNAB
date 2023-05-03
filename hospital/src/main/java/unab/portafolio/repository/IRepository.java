//package unab.portafolio.repository;
//
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.function.Function;
//
//public interface IRepository<S, Long> extends JpaRepository<S, Long> {
//
//    @Override
//    default void flush() {
//
//    }
//
//    @Override
//    default Object saveAndFlush(Object entity) {
//        return null;
//    }
//
//    @Override
//    default List saveAllAndFlush(Iterable entities) {
//        return null;
//    }
//
//    @Override
//    default void deleteAllInBatch(Iterable entities) {
//
//    }
//
//    @Override
//    default void deleteAllByIdInBatch(Iterable iterable) {
//
//    }
//
//    @Override
//    default void deleteAllInBatch() {
//
//    }
//
//    @Override
//    default Object getOne(Object o) {
//        return null;
//    }
//
//    @Override
//    default Object getById(Object o) {
//        return null;
//    }
//
//    @Override
//    default Object getReferenceById(Object o) {
//        return null;
//    }
//
//    @Override
//    default List findAll(Example example) {
//        return null;
//    }
//
//    @Override
//    default List findAll(Example example, Sort sort) {
//        return null;
//    }
//
//    @Override
//    default List saveAll(Iterable entities) {
//        return null;
//    }
//
//    @Override
//    default List findAll() {
//        return null;
//    }
//
//    @Override
//    default List findAllById(Iterable iterable) {
//        return null;
//    }
//
//    @Override
//    default Object save(Object entity) {
//        return null;
//    }
//
//    @Override
//    default Optional findById(Object o) {
//        return Optional.empty();
//    }
//
//    @Override
//    default boolean existsById(Object o) {
//        return false;
//    }
//
//    @Override
//    default long count() {
//        return 0;
//    }
//
//    @Override
//    default void deleteById(Object o) {
//
//    }
//
//    @Override
//    default void delete(Object entity) {
//
//    }
//
//    @Override
//    default void deleteAllById(Iterable iterable) {
//
//    }
//
//    @Override
//    default void deleteAll(Iterable entities) {
//
//    }
//
//    @Override
//    default void deleteAll() {
//
//    }
//
//    @Override
//    default List findAll(Sort sort) {
//        return null;
//    }
//
//    @Override
//    default Page findAll(Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    default Optional findOne(Example example) {
//        return Optional.empty();
//    }
//
//    @Override
//    default Page findAll(Example example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    default long count(Example example) {
//        return 0;
//    }
//
//    @Override
//    default boolean exists(Example example) {
//        return false;
//    }
//
//    @Override
//    default Object findBy(Example example, Function queryFunction) {
//        return null;
//    }
//}
