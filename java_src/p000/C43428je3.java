package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u0001*\u0006\b\u0003\u0010\u0004 \u0001*\u0006\b\u0004\u0010\u0005 \u0001*\u0006\b\u0005\u0010\u0006 \u0001*\u0006\b\u0006\u0010\u0007 \u0001*\u0006\b\u0007\u0010\b \u00012\u00020\tBG\u0012\u0006\u0010\u0015\u001a\u00028\u0000\u0012\u0006\u0010\u0016\u001a\u00028\u0001\u0012\u0006\u0010\u0017\u001a\u00028\u0002\u0012\u0006\u0010\u0018\u001a\u00028\u0003\u0012\u0006\u0010\u0019\u001a\u00028\u0004\u0012\u0006\u0010\u001a\u001a\u00028\u0005\u0012\u0006\u0010\u001b\u001a\u00028\u0006\u0012\u0006\u0010\u001c\u001a\u00028\u0007¢\u0006\u0004\b.\u0010/J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00028\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00028\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00028\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00028\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0014\u001a\u00028\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJ\u0090\u0001\u0010\u001d\u001a2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u00002\b\b\u0002\u0010\u0015\u001a\u00028\u00002\b\b\u0002\u0010\u0016\u001a\u00028\u00012\b\b\u0002\u0010\u0017\u001a\u00028\u00022\b\b\u0002\u0010\u0018\u001a\u00028\u00032\b\b\u0002\u0010\u0019\u001a\u00028\u00042\b\b\u0002\u0010\u001a\u001a\u00028\u00052\b\b\u0002\u0010\u001b\u001a\u00028\u00062\b\b\u0002\u0010\u001c\u001a\u00028\u0007HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010 \u001a\u00020\u001fHÖ\u0001J\u0013\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003R\u0017\u0010\u0015\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010\rR\u0017\u0010\u0016\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b'\u0010\rR\u0017\u0010\u0017\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b(\u0010\rR\u0017\u0010\u0018\u001a\u00028\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b)\u0010\rR\u0017\u0010\u0019\u001a\u00028\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b*\u0010\rR\u0017\u0010\u001a\u001a\u00028\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b+\u0010\rR\u0017\u0010\u001b\u001a\u00028\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b,\u0010\rR\u0017\u0010\u001c\u001a\u00028\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b-\u0010\r¨\u00060"}, m28432d2 = {"Lje3;", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "D", "E", "F", "G", "H", "Ljava/io/Serializable;", "", "toString", C17296a.f69688o, "()Ljava/lang/Object;", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "i", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lje3;", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Object;", "getFirst", "getSecond", "getThird", "getFourth", "getFifth", "getSixth", "getSeventh", "getEighth", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: je3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43428je3<A, B, C, D, E, F, G, H> implements Serializable {

    /* renamed from: b */
    public final A f93075b;

    /* renamed from: c */
    public final B f93076c;

    /* renamed from: d */
    public final C f93077d;

    /* renamed from: e */
    public final D f93078e;

    /* renamed from: f */
    public final E f93079f;

    /* renamed from: g */
    public final F f93080g;

    /* renamed from: h */
    public final G f93081h;

    /* renamed from: i */
    public final H f93082i;

    public C43428je3(A a, B b, C c, D d, E e, F f, G g, H h) {
        this.f93075b = a;
        this.f93076c = b;
        this.f93077d = c;
        this.f93078e = d;
        this.f93079f = e;
        this.f93080g = f;
        this.f93081h = g;
        this.f93082i = h;
    }

    /* renamed from: a */
    public final A m30153a() {
        return this.f93075b;
    }

    /* renamed from: b */
    public final B m30152b() {
        return this.f93076c;
    }

    /* renamed from: c */
    public final C m30151c() {
        return this.f93077d;
    }

    /* renamed from: d */
    public final D m30150d() {
        return this.f93078e;
    }

    /* renamed from: e */
    public final E m30149e() {
        return this.f93079f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43428je3) {
            C43428je3 c43428je3 = (C43428je3) obj;
            return Intrinsics.areEqual(this.f93075b, c43428je3.f93075b) && Intrinsics.areEqual(this.f93076c, c43428je3.f93076c) && Intrinsics.areEqual(this.f93077d, c43428je3.f93077d) && Intrinsics.areEqual(this.f93078e, c43428je3.f93078e) && Intrinsics.areEqual(this.f93079f, c43428je3.f93079f) && Intrinsics.areEqual(this.f93080g, c43428je3.f93080g) && Intrinsics.areEqual(this.f93081h, c43428je3.f93081h) && Intrinsics.areEqual(this.f93082i, c43428je3.f93082i);
        }
        return false;
    }

    /* renamed from: f */
    public final F m30148f() {
        return this.f93080g;
    }

    /* renamed from: g */
    public final G m30147g() {
        return this.f93081h;
    }

    /* renamed from: h */
    public final H m30146h() {
        return this.f93082i;
    }

    public int hashCode() {
        A a = this.f93075b;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f93076c;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.f93077d;
        int hashCode3 = (hashCode2 + (c == null ? 0 : c.hashCode())) * 31;
        D d = this.f93078e;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        E e = this.f93079f;
        int hashCode5 = (hashCode4 + (e == null ? 0 : e.hashCode())) * 31;
        F f = this.f93080g;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        G g = this.f93081h;
        int hashCode7 = (hashCode6 + (g == null ? 0 : g.hashCode())) * 31;
        H h = this.f93082i;
        return hashCode7 + (h != null ? h.hashCode() : 0);
    }

    /* renamed from: i */
    public final C43428je3<A, B, C, D, E, F, G, H> m30145i(A a, B b, C c, D d, E e, F f, G g, H h) {
        return new C43428je3<>(a, b, c, d, e, f, g, h);
    }

    public String toString() {
        A a = this.f93075b;
        B b = this.f93076c;
        C c = this.f93077d;
        D d = this.f93078e;
        E e = this.f93079f;
        F f = this.f93080g;
        G g = this.f93081h;
        H h = this.f93082i;
        return "(" + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ", " + g + ", " + h + ")";
    }
}
