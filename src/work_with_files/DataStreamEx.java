package work_with_files;

import java.io.*;

public class DataStreamEx {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("my_test.bin"));
             DataInputStream  inputStream = new DataInputStream(new FileInputStream("my_test.bin"));
        ){
            outputStream.writeInt(200);
            outputStream.writeByte(5);
            outputStream.writeBoolean(true);
            outputStream.writeLong(1000000L);
            outputStream.writeFloat(0.4F);
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
