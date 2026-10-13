package library.repository;

import library.Exception.LibraryException;

import java.util.List;
import java.util.Optional;

interface LibraryRepository<T, ID>  {
   void save(T entity) throws LibraryException;
   Optional<T> findById(ID id) throws LibraryException;
   List<T> findAll() throws LibraryException;
   boolean deleteById(ID id) throws LibraryException;
}
