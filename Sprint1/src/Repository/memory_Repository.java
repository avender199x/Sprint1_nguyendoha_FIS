package Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class memory_Repository<Class, TypeKeyId> {
    private Map<TypeKeyId, Class> List = new HashMap<>();

    public Class CreateAndUpdate(Class c, TypeKeyId keyId) {
        this.List.put(keyId, c);
        return c;
    }

    public List<Class> FindAll() {
        List<Class> FindAll = List.values().stream().collect(Collectors.toList());
        return FindAll;
    }

    public void Delete(TypeKeyId id) {
        this.List.remove(id);
    }
}
