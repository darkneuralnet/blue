package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"Lab1;", "Les0;", "", "enableSubmit", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Z", "b", "()Z", "<init>", "(Z)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ab1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38042ab1 implements InterfaceC40600es0 {

    /* renamed from: a */
    public final boolean f50664a;

    public C38042ab1(boolean z) {
        this.f50664a = z;
    }

    public static /* synthetic */ C38042ab1 copy$default(C38042ab1 c38042ab1, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c38042ab1.f50664a;
        }
        return c38042ab1.m71176a(z);
    }

    /* renamed from: a */
    public final C38042ab1 m71176a(boolean z) {
        return new C38042ab1(z);
    }

    /* renamed from: b */
    public final boolean m71175b() {
        return this.f50664a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38042ab1) && this.f50664a == ((C38042ab1) obj).f50664a;
    }

    public int hashCode() {
        boolean z = this.f50664a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.f50664a;
        return "EnableSubmit(enableSubmit=" + z + ")";
    }
}
