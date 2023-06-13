package ch.qos.logback.core.rolling.helper;

import java.io.File;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
abstract class PathPart {
    String part;

    public PathPart(String str) {
        this.part = str;
    }

    public abstract List<File> listFiles(FileProvider fileProvider);

    public List<File> listFiles(FileProvider fileProvider, String str) {
        File[] listFiles = fileProvider.listFiles(new File(str).getAbsoluteFile(), null);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        return Arrays.asList(listFiles);
    }

    public abstract boolean matches(File file);
}
