package p000;

import com.facebook.share.internal.C17296a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__IteratorsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p053io.ByteStreamsKt;
import kotlin.p053io.CloseableKt;
import kotlin.p053io.FilesKt__UtilsKt;
import kotlin.ranges.CharRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0016\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0000\u001a\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001¨\u0006\b"}, m28432d2 = {"Ljava/io/File;", "", C17296a.f69688o, "unzipLocationRoot", "c", "length", "", "b", "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFile+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 File+.kt\nco/bird/android/library/extension/File_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1#2:60\n1295#3,2:61\n819#4:63\n847#4,2:64\n1549#4:66\n1620#4,3:67\n*S KotlinDebug\n*F\n+ 1 File+.kt\nco/bird/android/library/extension/File_Kt\n*L\n46#1:61,2\n57#1:63\n57#1:64,2\n57#1:66\n57#1:67,3\n*E\n"})
/* renamed from: xl1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51796xl1 {

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ljava/util/zip/ZipEntry;", "kotlin.jvm.PlatformType", "zipEntry", "LsI6;", C17296a.f69688o, "(Ljava/util/zip/ZipEntry;)LsI6;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xl1$a */
    /* loaded from: classes3.dex */
    public static final class C30291a extends Lambda implements Function1<ZipEntry, C48565sI6> {

        /* renamed from: g */
        public final /* synthetic */ File f118054g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30291a(File file) {
            super(1);
            this.f118054g = file;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C48565sI6 invoke(ZipEntry zipEntry) {
            String absolutePath = this.f118054g.getAbsolutePath();
            String str = File.separator;
            String name = zipEntry.getName();
            File file = new File(absolutePath + str + name);
            Intrinsics.checkNotNullExpressionValue(zipEntry, "zipEntry");
            C48565sI6 c48565sI6 = new C48565sI6(zipEntry, file);
            File parentFile = c48565sI6.m14458e().getParentFile();
            if (parentFile != null) {
                Intrinsics.checkNotNullExpressionValue(parentFile, "parentFile");
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
            }
            return c48565sI6;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LsI6;", "it", "", C17296a.f69688o, "(LsI6;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xl1$b */
    /* loaded from: classes3.dex */
    public static final class C30292b extends Lambda implements Function1<C48565sI6, Boolean> {

        /* renamed from: g */
        public static final C30292b f118055g = new C30292b();

        public C30292b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(C48565sI6 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!it.m14459d().isDirectory());
        }
    }

    /* renamed from: a */
    public static final int m4747a(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String m76655g = new C37059Xh1(file.toString()).m76655g("Orientation");
        if (m76655g != null) {
            int hashCode = m76655g.hashCode();
            if (hashCode != 48) {
                if (hashCode != 51) {
                    if (hashCode != 54) {
                        if (hashCode == 56 && m76655g.equals("8")) {
                            return 270;
                        }
                    } else if (m76655g.equals("6")) {
                        return 90;
                    }
                } else if (m76655g.equals("3")) {
                    return 180;
                }
            } else if (m76655g.equals("0")) {
                return 90;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static final String m4746b(int i) {
        int collectionSizeOrDefault;
        List shuffled;
        String joinToString$default;
        CharRange charRange = new CharRange('A', 'z');
        ArrayList<Character> arrayList = new ArrayList();
        Iterator<Character> it = charRange.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Character next = it.next();
            char charValue = next.charValue();
            if ('[' <= charValue && charValue < 'a') {
                z = true;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (Character ch2 : arrayList) {
            arrayList2.add(Character.valueOf(ch2.charValue()));
        }
        shuffled = CollectionsKt__CollectionsJVMKt.shuffled(arrayList2);
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(shuffled.subList(0, i), "", null, null, 0, null, null, 62, null);
        return joinToString$default;
    }

    /* renamed from: c */
    public static final File m4745c(File file, File file2) {
        Iterator it;
        Sequence asSequence;
        Sequence map;
        Sequence<C48565sI6> filter;
        String nameWithoutExtension;
        boolean z;
        Intrinsics.checkNotNullParameter(file, "<this>");
        if (file2 == null) {
            String absolutePath = file.getParentFile().getAbsolutePath();
            String str = File.separator;
            nameWithoutExtension = FilesKt__UtilsKt.getNameWithoutExtension(file);
            file2 = new File(absolutePath + str + nameWithoutExtension);
            if (file2.exists() && !file2.isDirectory()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                file2 = null;
            }
            if (file2 == null) {
                file2 = new File(file.getParentFile().getAbsolutePath() + str + m4746b(16));
            }
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }
        ZipFile zipFile = new ZipFile(file);
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            Intrinsics.checkNotNullExpressionValue(entries, "zipFile.entries()");
            it = CollectionsKt__IteratorsJVMKt.iterator(entries);
            asSequence = SequencesKt__SequencesKt.asSequence(it);
            map = SequencesKt___SequencesKt.map(asSequence, new C30291a(file2));
            filter = SequencesKt___SequencesKt.filter(map, C30292b.f118055g);
            for (C48565sI6 c48565sI6 : filter) {
                ZipEntry m14462a = c48565sI6.m14462a();
                File m14461b = c48565sI6.m14461b();
                InputStream input = zipFile.getInputStream(m14462a);
                FileOutputStream fileOutputStream = new FileOutputStream(m14461b);
                Intrinsics.checkNotNullExpressionValue(input, "input");
                ByteStreamsKt.copyTo$default(input, fileOutputStream, 0, 2, null);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
                CloseableKt.closeFinally(input, null);
            }
            Unit unit2 = Unit.INSTANCE;
            CloseableKt.closeFinally(zipFile, null);
            return file2;
        } finally {
        }
    }

    public static /* synthetic */ File unzip$default(File file, File file2, int i, Object obj) {
        if ((i & 1) != 0) {
            file2 = null;
        }
        return m4745c(file, file2);
    }
}
