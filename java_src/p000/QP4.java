package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J;\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0018"}, m28432d2 = {"LQP4;", "", "", "applyTax", "useBilledMinutes", "hideTime", "enableRiderParkingReview", "displayPartnerName", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Z", "b", "()Z", "f", "c", "e", DateTokenConverter.CONVERTER_KEY, "<init>", "(ZZZZZ)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: QP4 */
/* loaded from: classes2.dex */
public final class QP4 {

    /* renamed from: a */
    public final boolean f30330a;

    /* renamed from: b */
    public final boolean f30331b;

    /* renamed from: c */
    public final boolean f30332c;

    /* renamed from: d */
    public final boolean f30333d;

    /* renamed from: e */
    public final boolean f30334e;

    public QP4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f30330a = z;
        this.f30331b = z2;
        this.f30332c = z3;
        this.f30333d = z4;
        this.f30334e = z5;
    }

    public static /* synthetic */ QP4 copy$default(QP4 qp4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = qp4.f30330a;
        }
        if ((i & 2) != 0) {
            z2 = qp4.f30331b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = qp4.f30332c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = qp4.f30333d;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            z5 = qp4.f30334e;
        }
        return qp4.m88528a(z, z6, z7, z8, z5);
    }

    /* renamed from: a */
    public final QP4 m88528a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new QP4(z, z2, z3, z4, z5);
    }

    /* renamed from: b */
    public final boolean m88527b() {
        return this.f30330a;
    }

    /* renamed from: c */
    public final boolean m88526c() {
        return this.f30334e;
    }

    /* renamed from: d */
    public final boolean m88525d() {
        return this.f30333d;
    }

    /* renamed from: e */
    public final boolean m88524e() {
        return this.f30332c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QP4) {
            QP4 qp4 = (QP4) obj;
            return this.f30330a == qp4.f30330a && this.f30331b == qp4.f30331b && this.f30332c == qp4.f30332c && this.f30333d == qp4.f30333d && this.f30334e == qp4.f30334e;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m88523f() {
        return this.f30331b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public int hashCode() {
        boolean z = this.f30330a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.f30331b;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.f30332c;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.f30333d;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z2 = this.f30334e;
        return i7 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.f30330a;
        boolean z2 = this.f30331b;
        boolean z3 = this.f30332c;
        boolean z4 = this.f30333d;
        boolean z5 = this.f30334e;
        return "RideDetailFlags(applyTax=" + z + ", useBilledMinutes=" + z2 + ", hideTime=" + z3 + ", enableRiderParkingReview=" + z4 + ", displayPartnerName=" + z5 + ")";
    }
}
