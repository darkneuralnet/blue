package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u0001*\u0006\b\u0003\u0010\u0004 \u0001*\u0006\b\u0004\u0010\u0005 \u0001*\u0006\b\u0005\u0010\u0006 \u00012\u00020\u0007B7\u0012\u0006\u0010\u0011\u001a\u00028\u0000\u0012\u0006\u0010\u0012\u001a\u00028\u0001\u0012\u0006\u0010\u0013\u001a\u00028\u0002\u0012\u0006\u0010\u0014\u001a\u00028\u0003\u0012\u0006\u0010\u0015\u001a\u00028\u0004\u0012\u0006\u0010\u0016\u001a\u00028\u0005¢\u0006\u0004\b&\u0010'J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00028\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00028\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0010\u001a\u00028\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000bJp\u0010\u0017\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\b\b\u0002\u0010\u0011\u001a\u00028\u00002\b\b\u0002\u0010\u0012\u001a\u00028\u00012\b\b\u0002\u0010\u0013\u001a\u00028\u00022\b\b\u0002\u0010\u0014\u001a\u00028\u00032\b\b\u0002\u0010\u0015\u001a\u00028\u00042\b\b\u0002\u0010\u0016\u001a\u00028\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003R\u0017\u0010\u0011\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010\u000bR\u0017\u0010\u0012\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b!\u0010\u000bR\u0017\u0010\u0013\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b\"\u0010\u000bR\u0017\u0010\u0014\u001a\u00028\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b#\u0010\u000bR\u0017\u0010\u0015\u001a\u00028\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b$\u0010\u000bR\u0017\u0010\u0016\u001a\u00028\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b%\u0010\u000b¨\u0006("}, m28432d2 = {"LJx5;", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "D", "E", "F", "Ljava/io/Serializable;", "", "toString", C17296a.f69688o, "()Ljava/lang/Object;", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "first", "second", "third", "fourth", "fifth", "sixth", "g", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LJx5;", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Object;", "getFirst", "getSecond", "getThird", "getFourth", "getFifth", "getSixth", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Jx5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33931Jx5<A, B, C, D, E, F> implements Serializable {

    /* renamed from: b */
    public final A f18838b;

    /* renamed from: c */
    public final B f18839c;

    /* renamed from: d */
    public final C f18840d;

    /* renamed from: e */
    public final D f18841e;

    /* renamed from: f */
    public final E f18842f;

    /* renamed from: g */
    public final F f18843g;

    public C33931Jx5(A a, B b, C c, D d, E e, F f) {
        this.f18838b = a;
        this.f18839c = b;
        this.f18840d = c;
        this.f18841e = d;
        this.f18842f = e;
        this.f18843g = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C33931Jx5 copy$default(C33931Jx5 c33931Jx5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, Object obj7) {
        A a = obj;
        if ((i & 1) != 0) {
            a = c33931Jx5.f18838b;
        }
        B b = obj2;
        if ((i & 2) != 0) {
            b = c33931Jx5.f18839c;
        }
        B b2 = b;
        C c = obj3;
        if ((i & 4) != 0) {
            c = c33931Jx5.f18840d;
        }
        C c2 = c;
        D d = obj4;
        if ((i & 8) != 0) {
            d = c33931Jx5.f18841e;
        }
        D d2 = d;
        E e = obj5;
        if ((i & 16) != 0) {
            e = c33931Jx5.f18842f;
        }
        E e2 = e;
        F f = obj6;
        if ((i & 32) != 0) {
            f = c33931Jx5.f18843g;
        }
        return c33931Jx5.m99514g(a, b2, c2, d2, e2, f);
    }

    /* renamed from: a */
    public final A m99520a() {
        return this.f18838b;
    }

    /* renamed from: b */
    public final B m99519b() {
        return this.f18839c;
    }

    /* renamed from: c */
    public final C m99518c() {
        return this.f18840d;
    }

    /* renamed from: d */
    public final D m99517d() {
        return this.f18841e;
    }

    /* renamed from: e */
    public final E m99516e() {
        return this.f18842f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C33931Jx5) {
            C33931Jx5 c33931Jx5 = (C33931Jx5) obj;
            return Intrinsics.areEqual(this.f18838b, c33931Jx5.f18838b) && Intrinsics.areEqual(this.f18839c, c33931Jx5.f18839c) && Intrinsics.areEqual(this.f18840d, c33931Jx5.f18840d) && Intrinsics.areEqual(this.f18841e, c33931Jx5.f18841e) && Intrinsics.areEqual(this.f18842f, c33931Jx5.f18842f) && Intrinsics.areEqual(this.f18843g, c33931Jx5.f18843g);
        }
        return false;
    }

    /* renamed from: f */
    public final F m99515f() {
        return this.f18843g;
    }

    /* renamed from: g */
    public final C33931Jx5<A, B, C, D, E, F> m99514g(A a, B b, C c, D d, E e, F f) {
        return new C33931Jx5<>(a, b, c, d, e, f);
    }

    public int hashCode() {
        A a = this.f18838b;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f18839c;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.f18840d;
        int hashCode3 = (hashCode2 + (c == null ? 0 : c.hashCode())) * 31;
        D d = this.f18841e;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        E e = this.f18842f;
        int hashCode5 = (hashCode4 + (e == null ? 0 : e.hashCode())) * 31;
        F f = this.f18843g;
        return hashCode5 + (f != null ? f.hashCode() : 0);
    }

    public String toString() {
        A a = this.f18838b;
        B b = this.f18839c;
        C c = this.f18840d;
        D d = this.f18841e;
        E e = this.f18842f;
        F f = this.f18843g;
        return "(" + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ")";
    }
}
