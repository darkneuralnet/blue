package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u0004*\u0004\b\u0004\u0010\u00052\u00020\u0006B/\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\t\u001a\u00028\u0001\u0012\u0006\u0010\n\u001a\u00028\u0002\u0012\u0006\u0010\u000b\u001a\u00028\u0003\u0012\u0006\u0010\f\u001a\u00028\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0007\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\u000b\u001a\u00028\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\bJ\u0010\u0010\f\u001a\u00028\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u0007\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\t\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\n\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u000b\u001a\u00028\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\f\u001a\u00028\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0019\u0010\b¨\u0006\u001c"}, m28432d2 = {"LKN2;", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "D", "E", "", C17296a.f69688o, "()Ljava/lang/Object;", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Object;", "getA", "getB", "getC", "getD", "getE", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "mvrx-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: KN2 */
/* loaded from: classes2.dex */
public final class KN2<A, B, C, D, E> {

    /* renamed from: a */
    public final A f19502a;

    /* renamed from: b */
    public final B f19503b;

    /* renamed from: c */
    public final C f19504c;

    /* renamed from: d */
    public final D f19505d;

    /* renamed from: e */
    public final E f19506e;

    public KN2(A a, B b, C c, D d, E e) {
        this.f19502a = a;
        this.f19503b = b;
        this.f19504c = c;
        this.f19505d = d;
        this.f19506e = e;
    }

    /* renamed from: a */
    public final A m98957a() {
        return this.f19502a;
    }

    /* renamed from: b */
    public final B m98956b() {
        return this.f19503b;
    }

    /* renamed from: c */
    public final C m98955c() {
        return this.f19504c;
    }

    /* renamed from: d */
    public final D m98954d() {
        return this.f19505d;
    }

    /* renamed from: e */
    public final E m98953e() {
        return this.f19506e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KN2) {
            KN2 kn2 = (KN2) obj;
            return Intrinsics.areEqual(this.f19502a, kn2.f19502a) && Intrinsics.areEqual(this.f19503b, kn2.f19503b) && Intrinsics.areEqual(this.f19504c, kn2.f19504c) && Intrinsics.areEqual(this.f19505d, kn2.f19505d) && Intrinsics.areEqual(this.f19506e, kn2.f19506e);
        }
        return false;
    }

    public int hashCode() {
        A a = this.f19502a;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f19503b;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.f19504c;
        int hashCode3 = (hashCode2 + (c == null ? 0 : c.hashCode())) * 31;
        D d = this.f19505d;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        E e = this.f19506e;
        return hashCode4 + (e != null ? e.hashCode() : 0);
    }

    public String toString() {
        return "MavericksTuple5(a=" + this.f19502a + ", b=" + this.f19503b + ", c=" + this.f19504c + ", d=" + this.f19505d + ", e=" + this.f19506e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
