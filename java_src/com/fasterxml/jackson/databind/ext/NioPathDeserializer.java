package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.ServiceLoader;
/* loaded from: classes5.dex */
public class NioPathDeserializer extends StdScalarDeserializer<Path> {
    private static final boolean areWindowsFilePathsSupported;
    private static final long serialVersionUID = 1;

    static {
        File[] listRoots = File.listRoots();
        int length = listRoots.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String path = listRoots[i].getPath();
            if (path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':') {
                z = true;
                break;
            }
            i++;
        }
        areWindowsFilePathsSupported = z;
    }

    public NioPathDeserializer() {
        super(Path.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Path deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String scheme;
        Path path;
        Path path2;
        Path path3;
        Path path4;
        if (!jsonParser.hasToken(JsonToken.VALUE_STRING)) {
            return C41355g83.m39981a(deserializationContext.handleUnexpectedToken(Path.class, jsonParser));
        }
        String text = jsonParser.getText();
        if (text.indexOf(58) < 0) {
            path4 = Paths.get(text, new String[0]);
            return path4;
        } else if (areWindowsFilePathsSupported && text.length() >= 2 && Character.isLetter(text.charAt(0)) && text.charAt(1) == ':') {
            path3 = Paths.get(text, new String[0]);
            return path3;
        } else {
            try {
                URI uri = new URI(text);
                try {
                    path2 = Paths.get(uri);
                    return path2;
                } catch (FileSystemNotFoundException e) {
                    try {
                        String scheme2 = uri.getScheme();
                        Iterator it = ServiceLoader.load(FileSystemProvider.class).iterator();
                        while (it.hasNext()) {
                            FileSystemProvider m31063a = C43134j83.m31063a(it.next());
                            scheme = m31063a.getScheme();
                            if (scheme.equalsIgnoreCase(scheme2)) {
                                path = m31063a.getPath(uri);
                                return path;
                            }
                        }
                        return C41355g83.m39981a(deserializationContext.handleInstantiationProblem(handledType(), text, e));
                    } catch (Throwable th) {
                        th.addSuppressed(e);
                        return C41355g83.m39981a(deserializationContext.handleInstantiationProblem(handledType(), text, th));
                    }
                } catch (Throwable th2) {
                    return C41355g83.m39981a(deserializationContext.handleInstantiationProblem(handledType(), text, th2));
                }
            } catch (URISyntaxException e2) {
                return C41355g83.m39981a(deserializationContext.handleInstantiationProblem(handledType(), text, e2));
            }
        }
    }
}
