package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004B\u001f\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0006J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004HÖ\u0003R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0006R\u0017\u0010\u0007\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\b\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0013\u0010\u0006¨\u0006\u0016"}, m28432d2 = {"LIN2;", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "", C17296a.f69688o, "()Ljava/lang/Object;", "b", "c", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Object;", "getA", "getB", "getC", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "mvrx-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: IN2 */
/* loaded from: classes2.dex */
public final class IN2<A, B, C> {

    /* renamed from: a */
    public final A f15413a;

    /* renamed from: b */
    public final B f15414b;

    /* renamed from: c */
    public final C f15415c;

    public IN2(A a, B b, C c) {
        this.f15413a = a;
        this.f15414b = b;
        this.f15415c = c;
    }

    /* renamed from: a */
    public final A m102447a() {
        return this.f15413a;
    }

    /* renamed from: b */
    public final B m102446b() {
        return this.f15414b;
    }

    /* renamed from: c */
    public final C m102445c() {
        return this.f15415c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IN2) {
            IN2 in2 = (IN2) obj;
            return Intrinsics.areEqual(this.f15413a, in2.f15413a) && Intrinsics.areEqual(this.f15414b, in2.f15414b) && Intrinsics.areEqual(this.f15415c, in2.f15415c);
        }
        return false;
    }

    public int hashCode() {
        A a = this.f15413a;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f15414b;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.f15415c;
        return hashCode2 + (c != null ? c.hashCode() : 0);
    }

    public String toString() {
        return "MavericksTuple3(a=" + this.f15413a + ", b=" + this.f15414b + ", c=" + this.f15415c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
