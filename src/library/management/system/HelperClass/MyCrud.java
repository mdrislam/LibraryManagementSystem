
package library.management.system.HelperClass;


public interface MyCrud {
     void clear();

    void saveOrUpdate();

    void delete(String tabName);

    void loadAll(String sch);

    void loadSingleObject(int id);
}
