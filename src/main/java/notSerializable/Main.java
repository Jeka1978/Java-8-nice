package notSerializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Jeka on 02/09/2015.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        TreeSet treeSet = new TreeSet<>((Serializable & Comparator<Integer>) Integer::compareUnsigned);
        treeSet.add(12);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:\\temp\\a.txt"));
        oos.writeObject(treeSet);
    }
}
