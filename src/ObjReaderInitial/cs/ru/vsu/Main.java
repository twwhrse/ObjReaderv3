package ObjReaderInitial.cs.ru.vsu;

import ObjReaderInitial.cs.ru.vsu.model.Model;

import ObjReaderInitial.cs.ru.vsu.objr.NormalUtils;
import ObjReaderInitial.cs.ru.vsu.objr.ObjReader;
import ObjReaderInitial.cs.ru.vsu.objr.ReaderExceptions;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {

        Path fileName = Path.of("D:\\IntelliJ IDEA Community Edition 2022.2.1\\Task_10_10\\ObjReaderv2\\src\\3DModels\\FaceForm\\WrapHand.obj");
        String fileContent;
        try {
            fileContent = Files.readString(fileName);
        } catch (IOException exception) {
            throw new ReaderExceptions.WrongFileException("Can't read this file. Extension or encoding is wrong");
        }

        System.out.println("Loading model ...");
        Model model = ObjReader.read(fileContent);

        System.out.println("Vertices: " + model.getVertices().size());
        System.out.println("Texture vertices: " + model.getTextureVertices().size());
        System.out.println("Normals: " + model.getNormals().size());
        System.out.println("Polygons: " + model.getPolygons().size());

        System.out.println();

        NormalUtils.print(model);
        NormalUtils.addNormals(model);

        System.out.println();

        System.out.println("Vertices: " + model.getVertices().size());
        System.out.println("Texture vertices: " + model.getTextureVertices().size());
        System.out.println("Normals: " + model.getNormals().size());
        System.out.println("Polygons: " + model.getPolygons().size());
    }
}