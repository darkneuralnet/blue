package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u001a\u0004\b\n\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"LXc5;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "", C17296a.f69688o, "F", "c", "()F", "f", "(F)V", "weight", "b", "Z", "()Z", "e", "(Z)V", "fill", "LQE0;", "LQE0;", "()LQE0;", DateTokenConverter.CONVERTER_KEY, "(LQE0;)V", "crossAxisAlignment", "<init>", "(FZLQE0;)V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Xc5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37018Xc5 {

    /* renamed from: a */
    public float f43479a;

    /* renamed from: b */
    public boolean f43480b;

    /* renamed from: c */
    public QE0 f43481c;

    public C37018Xc5() {
        this(0.0f, false, null, 7, null);
    }

    /* renamed from: a */
    public final QE0 m76759a() {
        return this.f43481c;
    }

    /* renamed from: b */
    public final boolean m76758b() {
        return this.f43480b;
    }

    /* renamed from: c */
    public final float m76757c() {
        return this.f43479a;
    }

    /* renamed from: d */
    public final void m76756d(QE0 qe0) {
        this.f43481c = qe0;
    }

    /* renamed from: e */
    public final void m76755e(boolean z) {
        this.f43480b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37018Xc5) {
            C37018Xc5 c37018Xc5 = (C37018Xc5) obj;
            return Float.compare(this.f43479a, c37018Xc5.f43479a) == 0 && this.f43480b == c37018Xc5.f43480b && Intrinsics.areEqual(this.f43481c, c37018Xc5.f43481c);
        }
        return false;
    }

    /* renamed from: f */
    public final void m76754f(float f) {
        this.f43479a = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Float.hashCode(this.f43479a) * 31;
        boolean z = this.f43480b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        QE0 qe0 = this.f43481c;
        return i2 + (qe0 == null ? 0 : qe0.hashCode());
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.f43479a + ", fill=" + this.f43480b + ", crossAxisAlignment=" + this.f43481c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C37018Xc5(float f, boolean z, QE0 qe0) {
        this.f43479a = f;
        this.f43480b = z;
        this.f43481c = qe0;
    }

    public /* synthetic */ C37018Xc5(float f, boolean z, QE0 qe0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : qe0);
    }
}
