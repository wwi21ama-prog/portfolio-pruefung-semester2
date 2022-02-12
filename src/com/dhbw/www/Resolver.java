package com.dhbw.www;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Resolver {
    private static final String FOLDER_PREFIX = "websites/";

    private String loadFile(String path) throws FileNotFoundException, NullPointerException {
        StringBuilder fileContent = new StringBuilder();

        String absolutePath = this.getClass().getClassLoader().getResource(FOLDER_PREFIX + path).getPath();
        File file = new File(absolutePath);
        Scanner reader = new Scanner(file);

        while (reader.hasNextLine()) {
            fileContent.append(reader.nextLine());
        }

        return fileContent.toString();
    }

    private String urlToPath(String url) {
        // Remove protocol and "www." (if provided)
        String path = url.replaceAll("http(s?):\\/\\/(www\\.)?", "");
        // Remove hyphens
        path = path.replaceAll("-", "");
        // Replace . and / with - and _
        path = path.replaceAll("\\.", "-");
        path = path.replaceAll("/", "_");
        // Add file extension
        path += ".html";
        return path;
    }

    public Response getUrl(String url) {
        String path = this.urlToPath(url);

        Response response = new Response();

        Link link = new Link(url);
        response.setDomain(link.getDomain());
        response.setPath(link.getPath());

        try {
            String source = loadFile(path);
            response.setSource(source);

            response.setStatus(ResponseStatus.FOUND);
        } catch (Exception e) {
            response.setStatus(ResponseStatus.NOT_FOUND);
        }

        return response;
    }
}
