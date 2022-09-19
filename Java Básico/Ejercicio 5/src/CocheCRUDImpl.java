public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {
        System.out.println("Usando el método save");
    }

    @Override
    public void findAll() {
        System.out.println("Usando el método findAll");
    }

    @Override
    public void delete() {
        System.out.println("Usando el método delete");
    }
}
