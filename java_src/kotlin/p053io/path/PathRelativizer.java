package kotlin.p053io.path;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m28432d2 = {"Lkotlin/io/path/PathRelativizer;", "", "()V", "emptyPath", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "parentPath", "tryRelativeTo", "path", "base", "kotlin-stdlib-jdk7"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: kotlin.io.path.PathRelativizer */
/* loaded from: classes8.dex */
final class PathRelativizer {
    public static final PathRelativizer INSTANCE = new PathRelativizer();
    private static final Path emptyPath;
    private static final Path parentPath;

    static {
        Path path;
        Path path2;
        path = Paths.get("", new String[0]);
        emptyPath = path;
        path2 = Paths.get(CallerDataConverter.DEFAULT_RANGE_DELIMITER, new String[0]);
        parentPath = path2;
    }

    private PathRelativizer() {
    }

    public final Path tryRelativeTo(Path path, Path base) {
        Path normalize;
        Path r;
        Path relativize;
        int nameCount;
        int nameCount2;
        FileSystem fileSystem;
        String separator;
        boolean endsWith$default;
        FileSystem fileSystem2;
        FileSystem fileSystem3;
        String separator2;
        String dropLast;
        Path name;
        Path name2;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(base, "base");
        normalize = base.normalize();
        r = path.normalize();
        relativize = normalize.relativize(r);
        nameCount = normalize.getNameCount();
        nameCount2 = r.getNameCount();
        int min = Math.min(nameCount, nameCount2);
        for (int i = 0; i < min; i++) {
            name = normalize.getName(i);
            Path path2 = parentPath;
            if (!Intrinsics.areEqual(name, path2)) {
                break;
            }
            name2 = r.getName(i);
            if (!Intrinsics.areEqual(name2, path2)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (Intrinsics.areEqual(r, normalize) || !Intrinsics.areEqual(normalize, emptyPath)) {
            String obj = relativize.toString();
            fileSystem = relativize.getFileSystem();
            separator = fileSystem.getSeparator();
            Intrinsics.checkNotNullExpressionValue(separator, "rn.fileSystem.separator");
            endsWith$default = StringsKt__StringsJVMKt.endsWith$default(obj, separator, false, 2, null);
            if (endsWith$default) {
                fileSystem2 = relativize.getFileSystem();
                fileSystem3 = relativize.getFileSystem();
                separator2 = fileSystem3.getSeparator();
                dropLast = StringsKt___StringsKt.dropLast(obj, separator2.length());
                r = fileSystem2.getPath(dropLast, new String[0]);
            } else {
                r = relativize;
            }
        }
        Intrinsics.checkNotNullExpressionValue(r, "r");
        return r;
    }
}
