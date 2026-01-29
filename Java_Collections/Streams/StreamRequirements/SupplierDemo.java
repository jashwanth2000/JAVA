package Java_Collections.Streams.StreamRequirements;

import java.util.function.Supplier;

//doesnt take anything but gives something only get method is there
// useful for DB connection like that
public class SupplierDemo {
public static void main(String[] args) {
    Supplier<String> hi=()->"DB says hi";

}
}
