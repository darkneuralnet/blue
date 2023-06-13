package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"LIt2;", "LL14;", "", "inProgress", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Z", "b", "()Z", "<init>", "(Z)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: It2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33658It2 implements L14 {

    /* renamed from: a */
    public final boolean f16382a;

    public C33658It2() {
        this(false, 1, null);
    }

    public static /* synthetic */ C33658It2 copy$default(C33658It2 c33658It2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c33658It2.f16382a;
        }
        return c33658It2.m101567a(z);
    }

    /* renamed from: a */
    public final C33658It2 m101567a(boolean z) {
        return new C33658It2(z);
    }

    /* renamed from: b */
    public final boolean m101566b() {
        return this.f16382a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33658It2) && this.f16382a == ((C33658It2) obj).f16382a;
    }

    public int hashCode() {
        boolean z = this.f16382a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.f16382a;
        return "Loading(inProgress=" + z + ")";
    }

    public C33658It2(boolean z) {
        this.f16382a = z;
    }

    public /* synthetic */ C33658It2(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
