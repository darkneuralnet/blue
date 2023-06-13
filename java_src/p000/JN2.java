package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u00042\u00020\u0005B'\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00028\u0001\u0012\u0006\u0010\t\u001a\u00028\u0002\u0012\u0006\u0010\n\u001a\u00028\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\t\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0007J\u0010\u0010\n\u001a\u00028\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÖ\u0003R\u0017\u0010\u0006\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007R\u0017\u0010\b\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0014\u0010\u0007R\u0017\u0010\t\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0015\u0010\u0007R\u0017\u0010\n\u001a\u00028\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0019"}, m28432d2 = {"LJN2;", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "D", "", C17296a.f69688o, "()Ljava/lang/Object;", "b", "c", DateTokenConverter.CONVERTER_KEY, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Object;", "getA", "getB", "getC", "getD", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "mvrx-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: JN2 */
/* loaded from: classes2.dex */
public final class JN2<A, B, C, D> {

    /* renamed from: a */
    public final A f17422a;

    /* renamed from: b */
    public final B f17423b;

    /* renamed from: c */
    public final C f17424c;

    /* renamed from: d */
    public final D f17425d;

    public JN2(A a, B b, C c, D d) {
        this.f17422a = a;
        this.f17423b = b;
        this.f17424c = c;
        this.f17425d = d;
    }

    /* renamed from: a */
    public final A m100638a() {
        return this.f17422a;
    }

    /* renamed from: b */
    public final B m100637b() {
        return this.f17423b;
    }

    /* renamed from: c */
    public final C m100636c() {
        return this.f17424c;
    }

    /* renamed from: d */
    public final D m100635d() {
        return this.f17425d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JN2) {
            JN2 jn2 = (JN2) obj;
            return Intrinsics.areEqual(this.f17422a, jn2.f17422a) && Intrinsics.areEqual(this.f17423b, jn2.f17423b) && Intrinsics.areEqual(this.f17424c, jn2.f17424c) && Intrinsics.areEqual(this.f17425d, jn2.f17425d);
        }
        return false;
    }

    public int hashCode() {
        A a = this.f17422a;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f17423b;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.f17424c;
        int hashCode3 = (hashCode2 + (c == null ? 0 : c.hashCode())) * 31;
        D d = this.f17425d;
        return hashCode3 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        return "MavericksTuple4(a=" + this.f17422a + ", b=" + this.f17423b + ", c=" + this.f17424c + ", d=" + this.f17425d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
