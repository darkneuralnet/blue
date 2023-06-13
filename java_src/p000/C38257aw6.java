package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"Law6;", "LZv6;", "", "resultRequired", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Z", "b", "()Z", "<init>", "(Z)V", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: aw6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38257aw6 implements InterfaceC37658Zv6 {

    /* renamed from: a */
    public final boolean f56633a;

    public C38257aw6(boolean z) {
        this.f56633a = z;
    }

    public static /* synthetic */ C38257aw6 copy$default(C38257aw6 c38257aw6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c38257aw6.f56633a;
        }
        return c38257aw6.m65216a(z);
    }

    /* renamed from: a */
    public final C38257aw6 m65216a(boolean z) {
        return new C38257aw6(z);
    }

    /* renamed from: b */
    public final boolean m65215b() {
        return this.f56633a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38257aw6) && this.f56633a == ((C38257aw6) obj).f56633a;
    }

    public int hashCode() {
        boolean z = this.f56633a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.f56633a;
        return "VpsResolvingError(resultRequired=" + z + ")";
    }
}
