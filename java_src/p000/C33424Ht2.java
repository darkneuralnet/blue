package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"LHt2;", "Lz04;", "", "inProgress", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Z", "b", "()Z", "<init>", "(Z)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ht2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33424Ht2 implements InterfaceC52541z04 {

    /* renamed from: a */
    public final boolean f14139a;

    public C33424Ht2() {
        this(false, 1, null);
    }

    public static /* synthetic */ C33424Ht2 copy$default(C33424Ht2 c33424Ht2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c33424Ht2.f14139a;
        }
        return c33424Ht2.m103243a(z);
    }

    /* renamed from: a */
    public final C33424Ht2 m103243a(boolean z) {
        return new C33424Ht2(z);
    }

    /* renamed from: b */
    public final boolean m103242b() {
        return this.f14139a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33424Ht2) && this.f14139a == ((C33424Ht2) obj).f14139a;
    }

    public int hashCode() {
        boolean z = this.f14139a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.f14139a;
        return "Loading(inProgress=" + z + ")";
    }

    public C33424Ht2(boolean z) {
        this.f14139a = z;
    }

    public /* synthetic */ C33424Ht2(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
