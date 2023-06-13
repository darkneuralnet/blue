package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import p000.AbstractC29120uE;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0007\b \u0018\u0000 a*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001\u0017B4\u0012\u0006\u0010@\u001a\u00020<\u0012\u0006\u0010D\u001a\u00020A\u0012\b\u0010H\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010M\u001a\u00020I\u0012\u0006\u0010S\u001a\u00020Nø\u0001\u0000¢\u0006\u0004\b_\u0010`J\u000f\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\b\u0010\t\u001a\u00020\bH\u0002J\u0017\u0010\r\u001a\u00020\u000b*\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0082\u0010J\u0017\u0010\u000e\u001a\u00020\u000b*\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0082\u0010J\u0016\u0010\u000f\u001a\u00020\u000b*\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\u0016\u0010\u0010\u001a\u00020\u000b*\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\u0014\u0010\u0012\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\b\u0010\u0013\u001a\u00020\u000bH\u0002J\b\u0010\u0014\u001a\u00020\u000bH\u0002J\b\u0010\u0015\u001a\u00020\u000bH\u0002J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u000bH\u0002J\b\u0010\u0019\u001a\u00020\u000bH\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000bH\u0004J\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000bH\u0004J\r\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0001\u0010\u0004J\r\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010\u0004J\r\u0010 \u001a\u00028\u0000¢\u0006\u0004\b \u0010\u0004J\r\u0010!\u001a\u00028\u0000¢\u0006\u0004\b!\u0010\u0004J&\u0010%\u001a\u00028\u00002\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001a0\"¢\u0006\u0002\b#¢\u0006\u0004\b%\u0010&J&\u0010'\u001a\u00028\u00002\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001a0\"¢\u0006\u0002\b#¢\u0006\u0004\b'\u0010&J\u0006\u0010(\u001a\u00020\u000bJ\u0006\u0010)\u001a\u00020\u000bJ\r\u0010*\u001a\u00028\u0000¢\u0006\u0004\b*\u0010\u0004J\r\u0010+\u001a\u00028\u0000¢\u0006\u0004\b+\u0010\u0004J\r\u0010,\u001a\u00028\u0000¢\u0006\u0004\b,\u0010\u0004J\r\u0010-\u001a\u00028\u0000¢\u0006\u0004\b-\u0010\u0004J\u000f\u0010.\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b0\u0010/J\r\u00101\u001a\u00028\u0000¢\u0006\u0004\b1\u0010\u0004J\r\u00102\u001a\u00028\u0000¢\u0006\u0004\b2\u0010\u0004J\r\u00103\u001a\u00028\u0000¢\u0006\u0004\b3\u0010\u0004J\r\u00104\u001a\u00028\u0000¢\u0006\u0004\b4\u0010\u0004J\u000f\u00105\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b5\u0010/J\r\u00106\u001a\u00028\u0000¢\u0006\u0004\b6\u0010\u0004J\u000f\u00107\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b7\u0010/J\r\u00108\u001a\u00028\u0000¢\u0006\u0004\b8\u0010\u0004J\r\u00109\u001a\u00028\u0000¢\u0006\u0004\b9\u0010\u0004J\r\u0010:\u001a\u00028\u0000¢\u0006\u0004\b:\u0010\u0004J\r\u0010;\u001a\u00028\u0000¢\u0006\u0004\b;\u0010\u0004R\u0017\u0010@\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b\u0017\u0010=\u001a\u0004\b>\u0010?R \u0010D\u001a\u00020A8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\u0007\u001a\u0004\bB\u0010CR\u0019\u0010H\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b'\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010M\u001a\u00020I8\u0006¢\u0006\f\n\u0004\b\u001f\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010S\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR+\u0010W\u001a\u00020A8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b7\u0010\u0007\u001a\u0004\bT\u0010C\"\u0004\bU\u0010VR\"\u0010Z\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010=\u001a\u0004\bO\u0010?\"\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006b"}, m28432d2 = {"LuE;", "T", "", "H", "()LuE;", "E", "G", "J", "", "z", "Li26;", "", "currentOffset", "n", "t", "j", "g", "linesAmount", "A", "X", "Z", "Y", "offset", C17296a.f69688o, "r", "q", "", "V", "start", "end", "W", DateTokenConverter.CONVERTER_KEY, Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "K", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "or", "b", "(Lkotlin/jvm/functions/Function1;)LuE;", "c", "s", "l", "N", "M", "D", "L", "m", "()Ljava/lang/Integer;", "v", "I", "F", "S", "B", "i", "R", "f", "O", "P", "Q", "U", "LDf;", "LDf;", "getOriginalText", "()LDf;", "originalText", "Ls26;", "getOriginalSelection-d9O1mEE", "()J", "originalSelection", "Li26;", "getLayoutResult", "()Li26;", "layoutResult", "LHe3;", "LHe3;", "p", "()LHe3;", "offsetMapping", "Lr26;", "e", "Lr26;", "x", "()Lr26;", TransferTable.COLUMN_STATE, "w", "setSelection-5zc-tL8", "(J)V", BaseSheetViewModel.SAVE_SELECTION, "setAnnotatedString", "(LDf;)V", "annotatedString", "", "y", "()Ljava/lang/String;", Entry.TYPE_TEXT, "<init>", "(LDf;JLi26;LHe3;Lr26;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "h", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n73#1,8:433\n73#1,8:441\n73#1,8:449\n73#1,8:457\n73#1,8:465\n73#1,8:473\n73#1,8:481\n73#1,8:489\n73#1,8:497\n73#1,8:505\n73#1,8:513\n73#1,8:521\n73#1,6:529\n80#1:536\n73#1,8:537\n73#1,8:545\n73#1,8:553\n74#1,7:561\n74#1,7:568\n73#1,8:575\n73#1,8:583\n73#1,8:591\n73#1,8:599\n74#1,7:607\n1#2:535\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n*L\n91#1:433,8\n95#1:441,8\n99#1:449,8\n107#1:457,8\n118#1:465,8\n134#1:473,8\n158#1:481,8\n163#1:489,8\n168#1:497,8\n172#1:505,8\n176#1:513,8\n184#1:521,8\n194#1:529,6\n194#1:536\n200#1:537,8\n204#1:545,8\n208#1:553,8\n212#1:561,7\n216#1:568,7\n222#1:575,8\n228#1:583,8\n232#1:591,8\n240#1:599,8\n249#1:607,7\n*E\n"})
/* renamed from: uE */
/* loaded from: classes.dex */
public abstract class AbstractC29120uE<T extends AbstractC29120uE<T>> {

    /* renamed from: h */
    public static final C29121a f111982h = new C29121a(null);

    /* renamed from: a */
    public final C1577Df f111983a;

    /* renamed from: b */
    public final long f111984b;

    /* renamed from: c */
    public final C42484i26 f111985c;

    /* renamed from: d */
    public final InterfaceC33290He3 f111986d;

    /* renamed from: e */
    public final C47821r26 f111987e;

    /* renamed from: f */
    public long f111988f;

    /* renamed from: g */
    public C1577Df f111989g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LuE$a;", "", "", "NoCharacterFound", "I", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: uE$a */
    /* loaded from: classes.dex */
    public static final class C29121a {
        public /* synthetic */ C29121a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C29121a() {
        }
    }

    public /* synthetic */ AbstractC29120uE(C1577Df c1577Df, long j, C42484i26 c42484i26, InterfaceC33290He3 interfaceC33290He3, C47821r26 c47821r26, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1577Df, j, c42484i26, interfaceC33290He3, c47821r26);
    }

    /* renamed from: h */
    public static /* synthetic */ int m10557h(AbstractC29120uE abstractC29120uE, C42484i26 c42484i26, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = abstractC29120uE.m10566Y();
            }
            return abstractC29120uE.m10558g(c42484i26, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
    }

    /* renamed from: k */
    public static /* synthetic */ int m10554k(AbstractC29120uE abstractC29120uE, C42484i26 c42484i26, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = abstractC29120uE.m10565Z();
            }
            return abstractC29120uE.m10555j(c42484i26, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
    }

    /* renamed from: o */
    public static /* synthetic */ int m10550o(AbstractC29120uE abstractC29120uE, C42484i26 c42484i26, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = abstractC29120uE.m10567X();
            }
            return abstractC29120uE.m10551n(c42484i26, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
    }

    /* renamed from: u */
    public static /* synthetic */ int m10544u(AbstractC29120uE abstractC29120uE, C42484i26 c42484i26, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = abstractC29120uE.m10567X();
            }
            return abstractC29120uE.m10545t(c42484i26, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
    }

    /* renamed from: A */
    public final int m10590A(C42484i26 c42484i26, int i) {
        int m10567X = m10567X();
        if (this.f111987e.m16576a() == null) {
            this.f111987e.m16574c(Float.valueOf(c42484i26.m34604d(m10567X).m91258i()));
        }
        int m34592p = c42484i26.m34592p(m10567X) + i;
        if (m34592p < 0) {
            return 0;
        }
        if (m34592p >= c42484i26.m34595m()) {
            return m10540y().length();
        }
        float m34596l = c42484i26.m34596l(m34592p) - 1;
        Float m16576a = this.f111987e.m16576a();
        Intrinsics.checkNotNull(m16576a);
        float floatValue = m16576a.floatValue();
        if ((m10539z() && floatValue >= c42484i26.m34589s(m34592p)) || (!m10539z() && floatValue <= c42484i26.m34590r(m34592p))) {
            return c42484i26.m34594n(m34592p, true);
        }
        return this.f111986d.transformedToOriginal(c42484i26.m34585w(C33056Ge3.m104938a(m16576a.floatValue(), m34596l)));
    }

    /* renamed from: B */
    public final T m10589B() {
        boolean z;
        C42484i26 c42484i26;
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (c42484i26 = this.f111985c) != null) {
            m10569V(m10590A(c42484i26, 1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: C */
    public final T m10588C() {
        boolean z;
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (m10539z()) {
                m10583H();
            } else {
                m10586E();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: D */
    public final T m10587D() {
        boolean z;
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (m10539z()) {
                m10581J();
            } else {
                m10584G();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: E */
    public final T m10586E() {
        boolean z;
        int m10553l;
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (m10553l = m10553l()) != -1) {
            m10569V(m10553l);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: F */
    public final T m10585F() {
        boolean z;
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m10569V(m10548q());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: G */
    public final T m10584G() {
        boolean z;
        Integer m10552m;
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (m10552m = m10552m()) != null) {
            m10569V(m10552m.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: H */
    public final T m10583H() {
        boolean z;
        int m10546s;
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (m10546s = m10546s()) != -1) {
            m10569V(m10546s);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: I */
    public final T m10582I() {
        boolean z;
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m10569V(m10547r());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: J */
    public final T m10581J() {
        boolean z;
        Integer m10543v;
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (m10543v = m10543v()) != null) {
            m10569V(m10543v.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: K */
    public final T m10580K() {
        boolean z;
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (m10539z()) {
                m10586E();
            } else {
                m10583H();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: L */
    public final T m10579L() {
        boolean z;
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (m10539z()) {
                m10584G();
            } else {
                m10581J();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: M */
    public final T m10578M() {
        boolean z;
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m10569V(m10540y().length());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: N */
    public final T m10577N() {
        boolean z;
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m10569V(0);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: O */
    public final T m10576O() {
        boolean z;
        Integer m10559f;
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (m10559f = m10559f()) != null) {
            m10569V(m10559f.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: P */
    public final T m10575P() {
        boolean z;
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (m10539z()) {
                m10573R();
            } else {
                m10576O();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: Q */
    public final T m10574Q() {
        boolean z;
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (m10539z()) {
                m10576O();
            } else {
                m10573R();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: R */
    public final T m10573R() {
        boolean z;
        Integer m10556i;
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (m10556i = m10556i()) != null) {
            m10569V(m10556i.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: S */
    public final T m10572S() {
        boolean z;
        C42484i26 c42484i26;
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (c42484i26 = this.f111985c) != null) {
            m10569V(m10590A(c42484i26, -1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: T */
    public final T m10571T() {
        boolean z;
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m10568W(0, m10540y().length());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: U */
    public final T m10570U() {
        boolean z;
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f111988f = C49006t26.m13200b(C48413s26.m14832n(this.f111984b), C48413s26.m14837i(this.f111988f));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: V */
    public final void m10569V(int i) {
        m10568W(i, i);
    }

    /* renamed from: W */
    public final void m10568W(int i, int i2) {
        this.f111988f = C49006t26.m13200b(i, i2);
    }

    /* renamed from: X */
    public final int m10567X() {
        return this.f111986d.originalToTransformed(C48413s26.m14837i(this.f111988f));
    }

    /* renamed from: Y */
    public final int m10566Y() {
        return this.f111986d.originalToTransformed(C48413s26.m14835k(this.f111988f));
    }

    /* renamed from: Z */
    public final int m10565Z() {
        return this.f111986d.originalToTransformed(C48413s26.m14834l(this.f111988f));
    }

    /* renamed from: a */
    public final int m10564a(int i) {
        int coerceAtMost;
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(i, m10540y().length() - 1);
        return coerceAtMost;
    }

    /* renamed from: b */
    public final T m10563b(Function1<? super T, Unit> or) {
        boolean z;
        Intrinsics.checkNotNullParameter(or, "or");
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (C48413s26.m14838h(this.f111988f)) {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                or.invoke(this);
            } else if (m10539z()) {
                m10569V(C48413s26.m14834l(this.f111988f));
            } else {
                m10569V(C48413s26.m14835k(this.f111988f));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: c */
    public final T m10562c(Function1<? super T, Unit> or) {
        boolean z;
        Intrinsics.checkNotNullParameter(or, "or");
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (C48413s26.m14838h(this.f111988f)) {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                or.invoke(this);
            } else if (m10539z()) {
                m10569V(C48413s26.m14835k(this.f111988f));
            } else {
                m10569V(C48413s26.m14834l(this.f111988f));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: d */
    public final T m10561d() {
        boolean z;
        m10541x().m16575b();
        if (m10540y().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m10569V(C48413s26.m14837i(this.f111988f));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* renamed from: e */
    public final C1577Df m10560e() {
        return this.f111989g;
    }

    /* renamed from: f */
    public final Integer m10559f() {
        C42484i26 c42484i26 = this.f111985c;
        if (c42484i26 != null) {
            return Integer.valueOf(m10557h(this, c42484i26, 0, 1, null));
        }
        return null;
    }

    /* renamed from: g */
    public final int m10558g(C42484i26 c42484i26, int i) {
        return this.f111986d.transformedToOriginal(c42484i26.m34594n(c42484i26.m34592p(i), true));
    }

    /* renamed from: i */
    public final Integer m10556i() {
        C42484i26 c42484i26 = this.f111985c;
        if (c42484i26 != null) {
            return Integer.valueOf(m10554k(this, c42484i26, 0, 1, null));
        }
        return null;
    }

    /* renamed from: j */
    public final int m10555j(C42484i26 c42484i26, int i) {
        return this.f111986d.transformedToOriginal(c42484i26.m34588t(c42484i26.m34592p(i)));
    }

    /* renamed from: l */
    public final int m10553l() {
        return UR5.m81544a(this.f111989g.m110052j(), C48413s26.m14837i(this.f111988f));
    }

    /* renamed from: m */
    public final Integer m10552m() {
        C42484i26 c42484i26 = this.f111985c;
        if (c42484i26 != null) {
            return Integer.valueOf(m10550o(this, c42484i26, 0, 1, null));
        }
        return null;
    }

    /* renamed from: n */
    public final int m10551n(C42484i26 c42484i26, int i) {
        while (i < this.f111983a.length()) {
            long m34608B = c42484i26.m34608B(m10564a(i));
            if (C48413s26.m14837i(m34608B) <= i) {
                i++;
            } else {
                return this.f111986d.transformedToOriginal(C48413s26.m14837i(m34608B));
            }
        }
        return this.f111983a.length();
    }

    /* renamed from: p */
    public final InterfaceC33290He3 m10549p() {
        return this.f111986d;
    }

    /* renamed from: q */
    public final int m10548q() {
        return TR5.m83605a(m10540y(), C48413s26.m14835k(this.f111988f));
    }

    /* renamed from: r */
    public final int m10547r() {
        return TR5.m83604b(m10540y(), C48413s26.m14834l(this.f111988f));
    }

    /* renamed from: s */
    public final int m10546s() {
        return UR5.m81543b(this.f111989g.m110052j(), C48413s26.m14837i(this.f111988f));
    }

    /* renamed from: t */
    public final int m10545t(C42484i26 c42484i26, int i) {
        while (i > 0) {
            long m34608B = c42484i26.m34608B(m10564a(i));
            if (C48413s26.m14832n(m34608B) >= i) {
                i--;
            } else {
                return this.f111986d.transformedToOriginal(C48413s26.m14832n(m34608B));
            }
        }
        return 0;
    }

    /* renamed from: v */
    public final Integer m10543v() {
        C42484i26 c42484i26 = this.f111985c;
        if (c42484i26 != null) {
            return Integer.valueOf(m10544u(this, c42484i26, 0, 1, null));
        }
        return null;
    }

    /* renamed from: w */
    public final long m10542w() {
        return this.f111988f;
    }

    /* renamed from: x */
    public final C47821r26 m10541x() {
        return this.f111987e;
    }

    /* renamed from: y */
    public final String m10540y() {
        return this.f111989g.m110052j();
    }

    /* renamed from: z */
    public final boolean m10539z() {
        UL4 ul4;
        C42484i26 c42484i26 = this.f111985c;
        if (c42484i26 != null) {
            ul4 = c42484i26.m34584x(m10567X());
        } else {
            ul4 = null;
        }
        if (ul4 != UL4.Rtl) {
            return true;
        }
        return false;
    }

    public AbstractC29120uE(C1577Df c1577Df, long j, C42484i26 c42484i26, InterfaceC33290He3 interfaceC33290He3, C47821r26 c47821r26) {
        this.f111983a = c1577Df;
        this.f111984b = j;
        this.f111985c = c42484i26;
        this.f111986d = interfaceC33290He3;
        this.f111987e = c47821r26;
        this.f111988f = j;
        this.f111989g = c1577Df;
    }
}
