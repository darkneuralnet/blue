package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.util.zip.ZipEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"LsI6;", "", "Ljava/util/zip/ZipEntry;", C17296a.f69688o, "Ljava/io/File;", "b", "entry", "output", "c", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/zip/ZipEntry;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/zip/ZipEntry;", "Ljava/io/File;", "e", "()Ljava/io/File;", "<init>", "(Ljava/util/zip/ZipEntry;Ljava/io/File;)V", "extension_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sI6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48565sI6 {

    /* renamed from: a */
    public final ZipEntry f108563a;

    /* renamed from: b */
    public final File f108564b;

    public C48565sI6(ZipEntry entry, File output) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(output, "output");
        this.f108563a = entry;
        this.f108564b = output;
    }

    public static /* synthetic */ C48565sI6 copy$default(C48565sI6 c48565sI6, ZipEntry zipEntry, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            zipEntry = c48565sI6.f108563a;
        }
        if ((i & 2) != 0) {
            file = c48565sI6.f108564b;
        }
        return c48565sI6.m14460c(zipEntry, file);
    }

    /* renamed from: a */
    public final ZipEntry m14462a() {
        return this.f108563a;
    }

    /* renamed from: b */
    public final File m14461b() {
        return this.f108564b;
    }

    /* renamed from: c */
    public final C48565sI6 m14460c(ZipEntry entry, File output) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(output, "output");
        return new C48565sI6(entry, output);
    }

    /* renamed from: d */
    public final ZipEntry m14459d() {
        return this.f108563a;
    }

    /* renamed from: e */
    public final File m14458e() {
        return this.f108564b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C48565sI6) {
            C48565sI6 c48565sI6 = (C48565sI6) obj;
            return Intrinsics.areEqual(this.f108563a, c48565sI6.f108563a) && Intrinsics.areEqual(this.f108564b, c48565sI6.f108564b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f108563a.hashCode() * 31) + this.f108564b.hashCode();
    }

    public String toString() {
        ZipEntry zipEntry = this.f108563a;
        File file = this.f108564b;
        return "ZipIO(entry=" + zipEntry + ", output=" + file + ")";
    }
}
