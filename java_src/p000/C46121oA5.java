package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"LoA5;", "LyW4;", "", "shouldShow", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Z", "b", "()Z", "<init>", "(Z)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oA5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46121oA5 extends AbstractC52246yW4 {

    /* renamed from: a */
    public final boolean f101549a;

    public C46121oA5(boolean z) {
        super(null);
        this.f101549a = z;
    }

    public static /* synthetic */ C46121oA5 copy$default(C46121oA5 c46121oA5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c46121oA5.f101549a;
        }
        return c46121oA5.m21678a(z);
    }

    /* renamed from: a */
    public final C46121oA5 m21678a(boolean z) {
        return new C46121oA5(z);
    }

    /* renamed from: b */
    public final boolean m21677b() {
        return this.f101549a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46121oA5) && this.f101549a == ((C46121oA5) obj).f101549a;
    }

    public int hashCode() {
        boolean z = this.f101549a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.f101549a;
        return "ShowRideNowButton(shouldShow=" + z + ")";
    }
}
