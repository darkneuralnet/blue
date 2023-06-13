package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"LP73;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Z", "()Z", "isConnected", "b", DateTokenConverter.CONVERTER_KEY, "isValidated", "c", "isMetered", "isNotRoaming", "<init>", "(ZZZZ)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: P73 */
/* loaded from: classes.dex */
public final class P73 {

    /* renamed from: a */
    public final boolean f27936a;

    /* renamed from: b */
    public final boolean f27937b;

    /* renamed from: c */
    public final boolean f27938c;

    /* renamed from: d */
    public final boolean f27939d;

    public P73(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f27936a = z;
        this.f27937b = z2;
        this.f27938c = z3;
        this.f27939d = z4;
    }

    /* renamed from: a */
    public final boolean m90733a() {
        return this.f27936a;
    }

    /* renamed from: b */
    public final boolean m90732b() {
        return this.f27938c;
    }

    /* renamed from: c */
    public final boolean m90731c() {
        return this.f27939d;
    }

    /* renamed from: d */
    public final boolean m90730d() {
        return this.f27937b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof P73) {
            P73 p73 = (P73) obj;
            return this.f27936a == p73.f27936a && this.f27937b == p73.f27937b && this.f27938c == p73.f27938c && this.f27939d == p73.f27939d;
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
        boolean z = this.f27936a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.f27937b;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.f27938c;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z2 = this.f27939d;
        return i5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f27936a + ", isValidated=" + this.f27937b + ", isMetered=" + this.f27938c + ", isNotRoaming=" + this.f27939d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
