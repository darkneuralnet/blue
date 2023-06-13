package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0007\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"LmM2;", "", "", "Lco/bird/android/coreinterface/manager/MarkerOverrideId;", "overrideId", "", "required", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Z", "c", "()Z", "<init>", "(Ljava/lang/String;Z)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mM2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45040mM2 {

    /* renamed from: a */
    public final String f97842a;

    /* renamed from: b */
    public final boolean f97843b;

    public C45040mM2(String overrideId, boolean z) {
        Intrinsics.checkNotNullParameter(overrideId, "overrideId");
        this.f97842a = overrideId;
        this.f97843b = z;
    }

    public static /* synthetic */ C45040mM2 copy$default(C45040mM2 c45040mM2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c45040mM2.f97842a;
        }
        if ((i & 2) != 0) {
            z = c45040mM2.f97843b;
        }
        return c45040mM2.m25814a(str, z);
    }

    /* renamed from: a */
    public final C45040mM2 m25814a(String overrideId, boolean z) {
        Intrinsics.checkNotNullParameter(overrideId, "overrideId");
        return new C45040mM2(overrideId, z);
    }

    /* renamed from: b */
    public final String m25813b() {
        return this.f97842a;
    }

    /* renamed from: c */
    public final boolean m25812c() {
        return this.f97843b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45040mM2) {
            C45040mM2 c45040mM2 = (C45040mM2) obj;
            return Intrinsics.areEqual(this.f97842a, c45040mM2.f97842a) && this.f97843b == c45040mM2.f97843b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f97842a.hashCode() * 31;
        boolean z = this.f97843b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f97842a;
        boolean z = this.f97843b;
        return "MarkerOverride(overrideId=" + str + ", required=" + z + ")";
    }
}
