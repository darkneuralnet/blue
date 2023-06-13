package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006\u001a"}, m28432d2 = {"LUY;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Z", "()Z", "setX", "(Z)V", "x", "b", "setY", "y", "c", "setZ", "z", "<init>", "(ZZZ)V", "LTY;", "v", "(LTY;Z)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: UY */
/* loaded from: classes7.dex */
public final class C8309UY {

    /* renamed from: a */
    public boolean f37517a;

    /* renamed from: b */
    public boolean f37518b;

    /* renamed from: c */
    public boolean f37519c;

    public C8309UY() {
        this(false, false, false, 7, null);
    }

    /* renamed from: a */
    public final boolean m81367a() {
        return this.f37517a;
    }

    /* renamed from: b */
    public final boolean m81366b() {
        return this.f37518b;
    }

    /* renamed from: c */
    public final boolean m81365c() {
        return this.f37519c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8309UY) {
            C8309UY c8309uy = (C8309UY) obj;
            return this.f37517a == c8309uy.f37517a && this.f37518b == c8309uy.f37518b && this.f37519c == c8309uy.f37519c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.f37517a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.f37518b;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        boolean z2 = this.f37519c;
        return i3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "Bool3(x=" + this.f37517a + ", y=" + this.f37518b + ", z=" + this.f37519c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C8309UY(boolean z, boolean z2, boolean z3) {
        this.f37517a = z;
        this.f37518b = z2;
        this.f37519c = z3;
    }

    public /* synthetic */ C8309UY(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8309UY(C7878TY v, boolean z) {
        this(v.m83425a(), v.m83424b(), z);
        Intrinsics.checkNotNullParameter(v, "v");
    }
}
