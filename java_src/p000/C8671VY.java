package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u0016\u0010\u000e¨\u0006\u001d"}, m28432d2 = {"LVY;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Z", "b", "()Z", "setX", "(Z)V", "x", "c", "setY", "y", DateTokenConverter.CONVERTER_KEY, "setZ", "z", "setW", "w", "<init>", "(ZZZZ)V", "LUY;", "v", "(LUY;Z)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: VY */
/* loaded from: classes7.dex */
public final class C8671VY {

    /* renamed from: a */
    public boolean f39209a;

    /* renamed from: b */
    public boolean f39210b;

    /* renamed from: c */
    public boolean f39211c;

    /* renamed from: d */
    public boolean f39212d;

    public C8671VY() {
        this(false, false, false, false, 15, null);
    }

    /* renamed from: a */
    public final boolean m79792a() {
        return this.f39212d;
    }

    /* renamed from: b */
    public final boolean m79791b() {
        return this.f39209a;
    }

    /* renamed from: c */
    public final boolean m79790c() {
        return this.f39210b;
    }

    /* renamed from: d */
    public final boolean m79789d() {
        return this.f39211c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8671VY) {
            C8671VY c8671vy = (C8671VY) obj;
            return this.f39209a == c8671vy.f39209a && this.f39210b == c8671vy.f39210b && this.f39211c == c8671vy.f39211c && this.f39212d == c8671vy.f39212d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z = this.f39209a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.f39210b;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.f39211c;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z2 = this.f39212d;
        return i5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "Bool4(x=" + this.f39209a + ", y=" + this.f39210b + ", z=" + this.f39211c + ", w=" + this.f39212d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C8671VY(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f39209a = z;
        this.f39210b = z2;
        this.f39211c = z3;
        this.f39212d = z4;
    }

    public /* synthetic */ C8671VY(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8671VY(C8309UY v, boolean z) {
        this(v.m81367a(), v.m81366b(), v.m81365c(), z);
        Intrinsics.checkNotNullParameter(v, "v");
    }
}
