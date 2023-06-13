package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001\u0015B\u001a\u0012\u0006\u0010\r\u001a\u00020\u0018\u0012\u0006\u00103\u001a\u00020.ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0080\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR*\u0010$\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00058\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010'\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00058\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R$\u0010+\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00058\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!R$\u0010-\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00058\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b,\u0010!R\u001f\u00100\u001a\u0004\u0018\u00010.8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b)\u0010/R\u001d\u00103\u001a\u00020.8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b1\u00102R$\u00104\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00058@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b5\u0010!\"\u0004\b6\u0010#R\u0014\u00108\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, m28432d2 = {"LS91;", "", "", "l", "()Z", "", "index", "", "c", "(I)C", "start", "end", "", Entry.TYPE_TEXT, "", "m", "(IILjava/lang/String;)V", "b", "(II)V", "p", "n", C17296a.f69688o, "()V", "toString", "LDf;", "s", "()LDf;", "LEI3;", "LEI3;", "gapBuffer", "value", "I", "k", "()I", "r", "(I)V", "selectionStart", "j", "q", "selectionEnd", "<set-?>", DateTokenConverter.CONVERTER_KEY, "f", "compositionStart", "e", "compositionEnd", "Ls26;", "()Ls26;", "composition", "i", "()J", BaseSheetViewModel.SAVE_SELECTION, "cursor", "g", "o", "h", "length", "<init>", "(LDf;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,402:1\n1#2:403\n*E\n"})
/* renamed from: S91 */
/* loaded from: classes.dex */
public final class S91 {

    /* renamed from: f */
    public static final C7348a f33260f = new C7348a(null);

    /* renamed from: g */
    public static final int f33261g = 8;

    /* renamed from: a */
    public final EI3 f33262a;

    /* renamed from: b */
    public int f33263b;

    /* renamed from: c */
    public int f33264c;

    /* renamed from: d */
    public int f33265d;

    /* renamed from: e */
    public int f33266e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LS91$a;", "", "", "NOWHERE", "I", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: S91$a */
    /* loaded from: classes.dex */
    public static final class C7348a {
        public /* synthetic */ C7348a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7348a() {
        }
    }

    public /* synthetic */ S91(C1577Df c1577Df, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1577Df, j);
    }

    /* renamed from: a */
    public final void m85897a() {
        this.f33265d = -1;
        this.f33266e = -1;
    }

    /* renamed from: b */
    public final void m85896b(int i, int i2) {
        long m13200b = C49006t26.m13200b(i, i2);
        this.f33262a.m109233c(i, i2, "");
        long m84272a = T91.m84272a(C49006t26.m13200b(this.f33263b, this.f33264c), m13200b);
        m85880r(C48413s26.m14834l(m84272a));
        m85881q(C48413s26.m14835k(m84272a));
        if (m85886l()) {
            long m84272a2 = T91.m84272a(C49006t26.m13200b(this.f33265d, this.f33266e), m13200b);
            if (C48413s26.m14838h(m84272a2)) {
                m85897a();
                return;
            }
            this.f33265d = C48413s26.m14834l(m84272a2);
            this.f33266e = C48413s26.m14835k(m84272a2);
        }
    }

    /* renamed from: c */
    public final char m85895c(int i) {
        return this.f33262a.m109235a(i);
    }

    /* renamed from: d */
    public final C48413s26 m85894d() {
        if (m85886l()) {
            return C48413s26.m14844b(C49006t26.m13200b(this.f33265d, this.f33266e));
        }
        return null;
    }

    /* renamed from: e */
    public final int m85893e() {
        return this.f33266e;
    }

    /* renamed from: f */
    public final int m85892f() {
        return this.f33265d;
    }

    /* renamed from: g */
    public final int m85891g() {
        int i = this.f33263b;
        int i2 = this.f33264c;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    /* renamed from: h */
    public final int m85890h() {
        return this.f33262a.m109234b();
    }

    /* renamed from: i */
    public final long m85889i() {
        return C49006t26.m13200b(this.f33263b, this.f33264c);
    }

    /* renamed from: j */
    public final int m85888j() {
        return this.f33264c;
    }

    /* renamed from: k */
    public final int m85887k() {
        return this.f33263b;
    }

    /* renamed from: l */
    public final boolean m85886l() {
        return this.f33265d != -1;
    }

    /* renamed from: m */
    public final void m85885m(int i, int i2, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (i >= 0 && i <= this.f33262a.m109234b()) {
            if (i2 >= 0 && i2 <= this.f33262a.m109234b()) {
                if (i <= i2) {
                    this.f33262a.m109233c(i, i2, text);
                    m85880r(text.length() + i);
                    m85881q(i + text.length());
                    this.f33265d = -1;
                    this.f33266e = -1;
                    return;
                }
                throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
            }
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.f33262a.m109234b());
        }
        throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.f33262a.m109234b());
    }

    /* renamed from: n */
    public final void m85884n(int i, int i2) {
        if (i >= 0 && i <= this.f33262a.m109234b()) {
            if (i2 >= 0 && i2 <= this.f33262a.m109234b()) {
                if (i < i2) {
                    this.f33265d = i;
                    this.f33266e = i2;
                    return;
                }
                throw new IllegalArgumentException("Do not set reversed or empty range: " + i + " > " + i2);
            }
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.f33262a.m109234b());
        }
        throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.f33262a.m109234b());
    }

    /* renamed from: o */
    public final void m85883o(int i) {
        m85882p(i, i);
    }

    /* renamed from: p */
    public final void m85882p(int i, int i2) {
        if (i >= 0 && i <= this.f33262a.m109234b()) {
            if (i2 >= 0 && i2 <= this.f33262a.m109234b()) {
                if (i <= i2) {
                    m85880r(i);
                    m85881q(i2);
                    return;
                }
                throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
            }
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.f33262a.m109234b());
        }
        throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.f33262a.m109234b());
    }

    /* renamed from: q */
    public final void m85881q(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f33264c = i;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i).toString());
    }

    /* renamed from: r */
    public final void m85880r(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f33263b = i;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i).toString());
    }

    /* renamed from: s */
    public final C1577Df m85879s() {
        return new C1577Df(toString(), null, null, 6, null);
    }

    public String toString() {
        return this.f33262a.toString();
    }

    public S91(C1577Df c1577Df, long j) {
        this.f33262a = new EI3(c1577Df.m110052j());
        this.f33263b = C48413s26.m14834l(j);
        this.f33264c = C48413s26.m14835k(j);
        this.f33265d = -1;
        this.f33266e = -1;
        int m14834l = C48413s26.m14834l(j);
        int m14835k = C48413s26.m14835k(j);
        if (m14834l >= 0 && m14834l <= c1577Df.length()) {
            if (m14835k < 0 || m14835k > c1577Df.length()) {
                throw new IndexOutOfBoundsException("end (" + m14835k + ") offset is outside of text region " + c1577Df.length());
            } else if (m14834l <= m14835k) {
                return;
            } else {
                throw new IllegalArgumentException("Do not set reversed range: " + m14834l + " > " + m14835k);
            }
        }
        throw new IndexOutOfBoundsException("start (" + m14834l + ") offset is outside of text region " + c1577Df.length());
    }
}
