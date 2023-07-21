import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class ArrayListClass = Class.forName("java.util.ArrayList");
        Class AbstractListClass = Class.forName("java.util.AbstractList");
        Class CollectionClass = Class.forName("java.util.Collection");

        int arrayListClassModifiers = ArrayListClass.getModifiers();
        int abstractListClassModifiers = AbstractListClass.getModifiers();
        int collectionClassModifiers = CollectionClass.getModifiers();

        System.out.println("Array is public: " + Modifier.isPublic(arrayListClassModifiers));
        System.out.println("Array is protected: " + Modifier.isProtected(arrayListClassModifiers));
        System.out.println("AbstractList is static: " + Modifier.isStatic(abstractListClassModifiers));
        System.out.println("AbstractList is abstract: " + Modifier.isAbstract(abstractListClassModifiers));
        System.out.println("Collection is interface: " + Modifier.isInterface(collectionClassModifiers));
    }
}