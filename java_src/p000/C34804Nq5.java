package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"LNq5;", "", "", "header", "", "required", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Z", "c", "()Z", "<init>", "(Ljava/lang/String;Z)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Nq5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34804Nq5 {

    /* renamed from: a */
    public final String f25287a;

    /* renamed from: b */
    public final boolean f25288b;

    public C34804Nq5(String header, boolean z) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.f25287a = header;
        this.f25288b = z;
    }

    public static /* synthetic */ C34804Nq5 copy$default(C34804Nq5 c34804Nq5, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c34804Nq5.f25287a;
        }
        if ((i & 2) != 0) {
            z = c34804Nq5.f25288b;
        }
        return c34804Nq5.m93287a(str, z);
    }

    /* renamed from: a */
    public final C34804Nq5 m93287a(String header, boolean z) {
        Intrinsics.checkNotNullParameter(header, "header");
        return new C34804Nq5(header, z);
    }

    /* renamed from: b */
    public final String m93286b() {
        return this.f25287a;
    }

    /* renamed from: c */
    public final boolean m93285c() {
        return this.f25288b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34804Nq5) {
            C34804Nq5 c34804Nq5 = (C34804Nq5) obj;
            return Intrinsics.areEqual(this.f25287a, c34804Nq5.f25287a) && this.f25288b == c34804Nq5.f25288b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f25287a.hashCode() * 31;
        boolean z = this.f25288b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f25287a;
        boolean z = this.f25288b;
        return "SectionHeaderViewModel(header=" + str + ", required=" + z + ")";
    }
}
