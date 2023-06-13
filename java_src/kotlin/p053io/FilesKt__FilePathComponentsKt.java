package kotlin.p053io;

import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m28433d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u000b\u001a\u00020\f*\u00020\bH\u0002¢\u0006\u0002\b\r\u001a\u001c\u0010\u000e\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0000\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0002H\u0000\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0002*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"isRooted", "", "Ljava/io/File;", "(Ljava/io/File;)Z", "root", "getRoot", "(Ljava/io/File;)Ljava/io/File;", "rootName", "", "getRootName", "(Ljava/io/File;)Ljava/lang/String;", "getRootLength", "", "getRootLength$FilesKt__FilePathComponentsKt", "subPath", "beginIndex", "endIndex", "toComponents", "Lkotlin/io/FilePathComponents;", "kotlin-stdlib"}, m28431k = 5, m28430mv = {1, 8, 0}, m28428xi = 49, m28427xs = "kotlin/io/FilesKt")
@SourceDebugExtension({"SMAP\nFilePathComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1549#2:149\n1620#2,3:150\n*S KotlinDebug\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n*L\n133#1:149\n133#1:150,3\n*E\n"})
/* renamed from: kotlin.io.FilesKt__FilePathComponentsKt */
/* loaded from: classes8.dex */
public class FilesKt__FilePathComponentsKt {
    public static final File getRoot(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new File(getRootName(file));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        r0 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r8, r3, 2, false, 4, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int getRootLength$FilesKt__FilePathComponentsKt(String str) {
        int indexOf$default;
        boolean endsWith$default;
        int indexOf$default2;
        int indexOf$default3;
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, File.separatorChar, 0, false, 4, (Object) null);
        if (indexOf$default == 0) {
            if (str.length() > 1) {
                char charAt = str.charAt(1);
                char c = File.separatorChar;
                if (charAt == c && indexOf$default2 >= 0) {
                    indexOf$default3 = StringsKt__StringsKt.indexOf$default((CharSequence) str, File.separatorChar, indexOf$default2 + 1, false, 4, (Object) null);
                    if (indexOf$default3 >= 0) {
                        return indexOf$default3 + 1;
                    }
                    return str.length();
                }
            }
            return 1;
        } else if (indexOf$default > 0 && str.charAt(indexOf$default - 1) == ':') {
            return indexOf$default + 1;
        } else {
            if (indexOf$default == -1) {
                endsWith$default = StringsKt__StringsKt.endsWith$default((CharSequence) str, (char) CoreConstants.COLON_CHAR, false, 2, (Object) null);
                if (endsWith$default) {
                    return str.length();
                }
            }
            return 0;
        }
    }

    public static final String getRootName(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "path");
        String path2 = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path2, "path");
        String substring = path.substring(0, getRootLength$FilesKt__FilePathComponentsKt(path2));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final boolean isRooted(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "path");
        if (getRootLength$FilesKt__FilePathComponentsKt(path) > 0) {
            return true;
        }
        return false;
    }

    public static final File subPath(File file, int i, int i2) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return toComponents(file).subPath(i, i2);
    }

    public static final FilePathComponents toComponents(File file) {
        boolean z;
        List split$default;
        int collectionSizeOrDefault;
        List list;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "path");
        int rootLength$FilesKt__FilePathComponentsKt = getRootLength$FilesKt__FilePathComponentsKt(path);
        String substring = path.substring(0, rootLength$FilesKt__FilePathComponentsKt);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = path.substring(rootLength$FilesKt__FilePathComponentsKt);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
        if (substring2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            split$default = StringsKt__StringsKt.split$default((CharSequence) substring2, new char[]{File.separatorChar}, false, 0, 6, (Object) null);
            List<String> list2 = split$default;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (String str : list2) {
                arrayList.add(new File(str));
            }
            list = arrayList;
        } else {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        return new FilePathComponents(new File(substring), list);
    }
}
