package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u00106\u001a\u000202\u0012\u0006\u0010'\u001a\u00020&ø\u0001\u0001¢\u0006\u0004\bO\u0010PJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\bJ\u0016\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0002J\u001b\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u0002J\u001e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u0002J\u0016\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002J'\u0010(\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010,\u001a\u00020\u0002H\u0016J\b\u0010.\u001a\u00020-H\u0016R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b(\u0010/\u001a\u0004\b0\u00101R\u0017\u00106\u001a\u0002028\u0006¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\b4\u00105R \u0010'\u001a\u00020&8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u00107\u001a\u0004\b8\u00109R\u0017\u0010=\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010@\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b?\u0010<R\u001f\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0011\u0010H\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b>\u0010GR\u0011\u0010I\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bB\u0010GR\u0011\u0010K\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bJ\u0010GR\u0011\u0010N\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bL\u0010M\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006Q"}, m28432d2 = {"Li26;", "", "", "lineIndex", "t", "", "visibleEnd", "n", "", "u", "l", "r", "s", "offset", "p", "vertical", "q", "usePrimaryDirection", "i", "LUL4;", "x", "b", "LCe3;", "position", "w", "(J)I", "LOs4;", "c", "Ls26;", "B", "(I)J", DateTokenConverter.CONVERTER_KEY, "start", "end", "LcJ3;", "y", "Lg26;", "layoutInput", "LG52;", "size", C17296a.f69688o, "(Lg26;J)Li26;", LegacyRepairType.OTHER_KEY, "equals", "hashCode", "", "toString", "Lg26;", "k", "()Lg26;", "LRW2;", "LRW2;", "v", "()LRW2;", "multiParagraph", "J", "A", "()J", "F", "g", "()F", "firstBaseline", "e", "j", "lastBaseline", "", "f", "Ljava/util/List;", "z", "()Ljava/util/List;", "placeholderRects", "()Z", "didOverflowHeight", "didOverflowWidth", "h", "hasVisualOverflow", "m", "()I", "lineCount", "<init>", "(Lg26;LRW2;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: i26  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42484i26 {

    /* renamed from: a */
    public final C41298g26 f86643a;

    /* renamed from: b */
    public final RW2 f86644b;

    /* renamed from: c */
    public final long f86645c;

    /* renamed from: d */
    public final float f86646d;

    /* renamed from: e */
    public final float f86647e;

    /* renamed from: f */
    public final List<C35055Os4> f86648f;

    public /* synthetic */ C42484i26(C41298g26 c41298g26, RW2 rw2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(c41298g26, rw2, j);
    }

    /* renamed from: o */
    public static /* synthetic */ int m34593o(C42484i26 c42484i26, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return c42484i26.m34594n(i, z);
    }

    /* renamed from: A */
    public final long m34609A() {
        return this.f86645c;
    }

    /* renamed from: B */
    public final long m34608B(int i) {
        return this.f86644b.m86645z(i);
    }

    /* renamed from: a */
    public final C42484i26 m34607a(C41298g26 layoutInput, long j) {
        Intrinsics.checkNotNullParameter(layoutInput, "layoutInput");
        return new C42484i26(layoutInput, this.f86644b, j, null);
    }

    /* renamed from: b */
    public final UL4 m34606b(int i) {
        return this.f86644b.m86669b(i);
    }

    /* renamed from: c */
    public final C35055Os4 m34605c(int i) {
        return this.f86644b.m86668c(i);
    }

    /* renamed from: d */
    public final C35055Os4 m34604d(int i) {
        return this.f86644b.m86667d(i);
    }

    /* renamed from: e */
    public final boolean m34603e() {
        if (!this.f86644b.m86666e() && G52.m105830f(this.f86645c) >= this.f86644b.m86664g()) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42484i26)) {
            return false;
        }
        C42484i26 c42484i26 = (C42484i26) obj;
        if (!Intrinsics.areEqual(this.f86643a, c42484i26.f86643a) || !Intrinsics.areEqual(this.f86644b, c42484i26.f86644b) || !G52.m105831e(this.f86645c, c42484i26.f86645c)) {
            return false;
        }
        if (this.f86646d == c42484i26.f86646d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.f86647e == c42484i26.f86647e) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && Intrinsics.areEqual(this.f86648f, c42484i26.f86648f)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m34602f() {
        return ((float) G52.m105829g(this.f86645c)) < this.f86644b.m86646y();
    }

    /* renamed from: g */
    public final float m34601g() {
        return this.f86646d;
    }

    /* renamed from: h */
    public final boolean m34600h() {
        return m34602f() || m34603e();
    }

    public int hashCode() {
        return (((((((((this.f86643a.hashCode() * 31) + this.f86644b.hashCode()) * 31) + G52.m105828h(this.f86645c)) * 31) + Float.hashCode(this.f86646d)) * 31) + Float.hashCode(this.f86647e)) * 31) + this.f86648f.hashCode();
    }

    /* renamed from: i */
    public final float m34599i(int i, boolean z) {
        return this.f86644b.m86663h(i, z);
    }

    /* renamed from: j */
    public final float m34598j() {
        return this.f86647e;
    }

    /* renamed from: k */
    public final C41298g26 m34597k() {
        return this.f86643a;
    }

    /* renamed from: l */
    public final float m34596l(int i) {
        return this.f86644b.m86660k(i);
    }

    /* renamed from: m */
    public final int m34595m() {
        return this.f86644b.m86659l();
    }

    /* renamed from: n */
    public final int m34594n(int i, boolean z) {
        return this.f86644b.m86658m(i, z);
    }

    /* renamed from: p */
    public final int m34592p(int i) {
        return this.f86644b.m86657n(i);
    }

    /* renamed from: q */
    public final int m34591q(float f) {
        return this.f86644b.m86656o(f);
    }

    /* renamed from: r */
    public final float m34590r(int i) {
        return this.f86644b.m86655p(i);
    }

    /* renamed from: s */
    public final float m34589s(int i) {
        return this.f86644b.m86654q(i);
    }

    /* renamed from: t */
    public final int m34588t(int i) {
        return this.f86644b.m86653r(i);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f86643a + ", multiParagraph=" + this.f86644b + ", size=" + ((Object) G52.m105827i(this.f86645c)) + ", firstBaseline=" + this.f86646d + ", lastBaseline=" + this.f86647e + ", placeholderRects=" + this.f86648f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* renamed from: u */
    public final float m34587u(int i) {
        return this.f86644b.m86652s(i);
    }

    /* renamed from: v */
    public final RW2 m34586v() {
        return this.f86644b;
    }

    /* renamed from: w */
    public final int m34585w(long j) {
        return this.f86644b.m86651t(j);
    }

    /* renamed from: x */
    public final UL4 m34584x(int i) {
        return this.f86644b.m86650u(i);
    }

    /* renamed from: y */
    public final InterfaceC39067cJ3 m34583y(int i, int i2) {
        return this.f86644b.m86648w(i, i2);
    }

    /* renamed from: z */
    public final List<C35055Os4> m34582z() {
        return this.f86648f;
    }

    public C42484i26(C41298g26 c41298g26, RW2 rw2, long j) {
        this.f86643a = c41298g26;
        this.f86644b = rw2;
        this.f86645c = j;
        this.f86646d = rw2.m86665f();
        this.f86647e = rw2.m86661j();
        this.f86648f = rw2.m86647x();
    }
}
