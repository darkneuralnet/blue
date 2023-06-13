package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Lnx5;", "Lrv1;", "", "show", "enabled", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Z", "c", "()Z", "b", "<init>", "(ZZ)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nx5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45992nx5 extends AbstractC48340rv1 {

    /* renamed from: a */
    public final boolean f101116a;

    /* renamed from: b */
    public final boolean f101117b;

    public C45992nx5(boolean z, boolean z2) {
        super(null);
        this.f101116a = z;
        this.f101117b = z2;
    }

    public static /* synthetic */ C45992nx5 copy$default(C45992nx5 c45992nx5, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c45992nx5.f101116a;
        }
        if ((i & 2) != 0) {
            z2 = c45992nx5.f101117b;
        }
        return c45992nx5.m22137a(z, z2);
    }

    /* renamed from: a */
    public final C45992nx5 m22137a(boolean z, boolean z2) {
        return new C45992nx5(z, z2);
    }

    /* renamed from: b */
    public final boolean m22136b() {
        return this.f101117b;
    }

    /* renamed from: c */
    public final boolean m22135c() {
        return this.f101116a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45992nx5) {
            C45992nx5 c45992nx5 = (C45992nx5) obj;
            return this.f101116a == c45992nx5.f101116a && this.f101117b == c45992nx5.f101117b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f101116a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.f101117b;
        return i + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f101116a;
        boolean z2 = this.f101117b;
        return "SetupCloseIncomplete(show=" + z + ", enabled=" + z2 + ")";
    }
}
