package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u0001*\u0006\b\u0003\u0010\u0004 \u00012\u00020\u0005B'\u0012\u0006\u0010\r\u001a\u00028\u0000\u0012\u0006\u0010\u000e\u001a\u00028\u0001\u0012\u0006\u0010\u000f\u001a\u00028\u0002\u0012\u0006\u0010\u0010\u001a\u00028\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\f\u001a\u00028\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\tJP\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\r\u001a\u00028\u00002\b\b\u0002\u0010\u000e\u001a\u00028\u00012\b\b\u0002\u0010\u000f\u001a\u00028\u00022\b\b\u0002\u0010\u0010\u001a\u00028\u0003HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\u0017\u0010\r\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u000e\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u000f\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001c\u0010\tR\u0017\u0010\u0010\u001a\u00028\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001d\u0010\t¨\u0006 "}, m28432d2 = {"Lwb4;", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "D", "Ljava/io/Serializable;", "", "toString", C17296a.f69688o, "()Ljava/lang/Object;", "b", "c", DateTokenConverter.CONVERTER_KEY, "first", "second", "third", "fourth", "e", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lwb4;", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Object;", "getFirst", "getSecond", "getThird", "getFourth", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wb4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51106wb4<A, B, C, D> implements Serializable {

    /* renamed from: b */
    public final A f116242b;

    /* renamed from: c */
    public final B f116243c;

    /* renamed from: d */
    public final C f116244d;

    /* renamed from: e */
    public final D f116245e;

    public C51106wb4(A a, B b, C c, D d) {
        this.f116242b = a;
        this.f116243c = b;
        this.f116244d = c;
        this.f116245e = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C51106wb4 copy$default(C51106wb4 c51106wb4, Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5) {
        if ((i & 1) != 0) {
            obj = c51106wb4.f116242b;
        }
        if ((i & 2) != 0) {
            obj2 = c51106wb4.f116243c;
        }
        if ((i & 4) != 0) {
            obj3 = c51106wb4.f116244d;
        }
        if ((i & 8) != 0) {
            obj4 = c51106wb4.f116245e;
        }
        return c51106wb4.m6610e(obj, obj2, obj3, obj4);
    }

    /* renamed from: a */
    public final A m6614a() {
        return this.f116242b;
    }

    /* renamed from: b */
    public final B m6613b() {
        return this.f116243c;
    }

    /* renamed from: c */
    public final C m6612c() {
        return this.f116244d;
    }

    /* renamed from: d */
    public final D m6611d() {
        return this.f116245e;
    }

    /* renamed from: e */
    public final C51106wb4<A, B, C, D> m6610e(A a, B b, C c, D d) {
        return new C51106wb4<>(a, b, c, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C51106wb4) {
            C51106wb4 c51106wb4 = (C51106wb4) obj;
            return Intrinsics.areEqual(this.f116242b, c51106wb4.f116242b) && Intrinsics.areEqual(this.f116243c, c51106wb4.f116243c) && Intrinsics.areEqual(this.f116244d, c51106wb4.f116244d) && Intrinsics.areEqual(this.f116245e, c51106wb4.f116245e);
        }
        return false;
    }

    public int hashCode() {
        A a = this.f116242b;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f116243c;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.f116244d;
        int hashCode3 = (hashCode2 + (c == null ? 0 : c.hashCode())) * 31;
        D d = this.f116245e;
        return hashCode3 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        A a = this.f116242b;
        B b = this.f116243c;
        C c = this.f116244d;
        D d = this.f116245e;
        return "(" + a + ", " + b + ", " + c + ", " + d + ")";
    }
}
