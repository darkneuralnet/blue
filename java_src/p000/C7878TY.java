package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0014"}, m28432d2 = {"LTY;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Z", "()Z", "setX", "(Z)V", "x", "b", "setY", "y", "<init>", "(ZZ)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: TY */
/* loaded from: classes7.dex */
public final class C7878TY {

    /* renamed from: a */
    public boolean f35642a;

    /* renamed from: b */
    public boolean f35643b;

    public C7878TY() {
        this(false, false, 3, null);
    }

    /* renamed from: a */
    public final boolean m83425a() {
        return this.f35642a;
    }

    /* renamed from: b */
    public final boolean m83424b() {
        return this.f35643b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7878TY) {
            C7878TY c7878ty = (C7878TY) obj;
            return this.f35642a == c7878ty.f35642a && this.f35643b == c7878ty.f35643b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f35642a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.f35643b;
        return i + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "Bool2(x=" + this.f35642a + ", y=" + this.f35643b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C7878TY(boolean z, boolean z2) {
        this.f35642a = z;
        this.f35643b = z2;
    }

    public /* synthetic */ C7878TY(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
