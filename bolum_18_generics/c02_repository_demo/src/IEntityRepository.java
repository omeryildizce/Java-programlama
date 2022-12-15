public interface IEntityRepository<T extends IEntity > {
    void add(T entity);
    void delee(T entity);
    void update(T entity);
}
