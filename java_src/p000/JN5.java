package p000;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.StringsKt___StringsKt;
import p000.C1577Df;
import p000.C46522or2;
import p000.O26;
import p000.R06;
@Metadata(m28433d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a&\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a9\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a-\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a[\u0010&\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2\u0006\u0010\r\u001a\u00020\f2&\u0010%\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u001fH\u0000ø\u0001\u0001\u001a\"\u0010(\u001a\u00020\u0006*\u00020\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\r\u001a\u00020\fH\u0002\u001aS\u0010)\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2&\u0010%\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u001fH\u0002ø\u0001\u0001\u001aF\u0010-\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2\u001e\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060+H\u0000\u001a'\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u001a&\u00104\u001a\u00020\u0006*\u00020\u00002\b\u00103\u001a\u0004\u0018\u0001022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a&\u00107\u001a\u00020\u0006*\u00020\u00002\b\u00106\u001a\u0004\u0018\u0001052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a1\u0010:\u001a\u00020\u0006*\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;\u001a&\u0010>\u001a\u00020\u0006*\u00020\u00002\b\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a&\u0010A\u001a\u00020\u0006*\u00020\u00002\b\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a&\u0010D\u001a\u00020\u0006*\u00020\u00002\b\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a9\u0010F\u001a\u00020\u0006*\u00020\u00002\u0006\u0010E\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010G\u001a&\u0010J\u001a\u00020\u0006*\u00020\u00002\b\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a1\u0010K\u001a\u00020\u0006*\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bK\u0010;\u001a3\u0010N\u001a\u00020\u0006*\u00020\u00002\b\u0010M\u001a\u0004\u0018\u00010L2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bN\u0010O\u001a.\u0010S\u001a\u00020\u0006*\u00020\u00002\b\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010R\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a\f\u0010U\u001a\u00020T*\u00020\u0019H\u0002\u001a\u0016\u0010W\u001a\u00020\u001d*\u0004\u0018\u00010\u001d2\u0006\u0010V\u001a\u00020\u001dH\u0002\"\u0018\u0010Z\u001a\u00020T*\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006["}, m28432d2 = {"Landroid/text/Spannable;", "", "span", "", "start", "end", "", "t", "LN16;", "textIndent", "", "contextFontSize", "Lg01;", "density", "x", "LM26;", "lineHeight", "Lor2;", "lineHeightStyle", "p", "(Landroid/text/Spannable;JFLg01;Lor2;)V", "q", "(Landroid/text/Spannable;JFLg01;)V", "f", "(JFLg01;)F", "LG26;", "contextTextStyle", "", "LDf$b;", "LGN5;", "spanStyles", "Lkotlin/Function4;", "Lkw1;", "LJw1;", "LEw1;", "LFw1;", "Landroid/graphics/Typeface;", "resolveTypeface", "v", "spanStyleRange", "u", "l", "contextFontSpanStyle", "Lkotlin/Function3;", "block", "b", "letterSpacing", "Landroid/text/style/MetricAffectingSpan;", C17296a.f69688o, "(JLg01;)Landroid/text/style/MetricAffectingSpan;", "LPx5;", "shadow", "s", "LJ61;", "drawStyle", "k", "Lpm0;", "color", "g", "(Landroid/text/Spannable;JII)V", "Luv2;", "localeList", "r", "LL16;", "textGeometricTransform", "o", "", "fontFeatureSettings", "m", "fontSize", "n", "(Landroid/text/Spannable;JLg01;II)V", "LR06;", "textDecoration", "w", "j", "LHE;", "baselineShift", "h", "(Landroid/text/Spannable;LHE;II)V", "La30;", "brush", "alpha", "i", "", DateTokenConverter.CONVERTER_KEY, "spanStyle", "e", "c", "(LGN5;)Z", "needsLetterSpacingSpan", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSpannableExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,552:1\n1#2:553\n35#3,3:554\n38#3,2:561\n40#3:564\n33#4,4:557\n38#4:563\n69#4,6:565\n33#4,6:571\n646#5:577\n646#5:578\n*S KotlinDebug\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n*L\n282#1:554,3\n282#1:561,2\n282#1:564\n282#1:557,4\n282#1:563\n350#1:565,6\n370#1:571,6\n434#1:577\n507#1:578\n*E\n"})
/* renamed from: JN5 */
/* loaded from: classes.dex */
public final class JN5 {

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LGN5;", "spanStyle", "", "start", "end", "", C17296a.f69688o, "(LGN5;II)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: JN5$a */
    /* loaded from: classes.dex */
    public static final class C4059a extends Lambda implements Function3<GN5, Integer, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Spannable f17458g;

        /* renamed from: h */
        public final /* synthetic */ Function4<AbstractC44199kw1, C33918Jw1, C32748Ew1, C32982Fw1, Typeface> f17459h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4059a(Spannable spannable, Function4<? super AbstractC44199kw1, ? super C33918Jw1, ? super C32748Ew1, ? super C32982Fw1, ? extends Typeface> function4) {
            super(3);
            this.f17458g = spannable;
            this.f17459h = function4;
        }

        /* renamed from: a */
        public final void m100565a(GN5 spanStyle, int i, int i2) {
            int m108201b;
            int m106232a;
            Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
            Spannable spannable = this.f17458g;
            Function4<AbstractC44199kw1, C33918Jw1, C32748Ew1, C32982Fw1, Typeface> function4 = this.f17459h;
            AbstractC44199kw1 m105166i = spanStyle.m105166i();
            C33918Jw1 m105161n = spanStyle.m105161n();
            if (m105161n == null) {
                m105161n = C33918Jw1.f18784c.m99540d();
            }
            C32748Ew1 m105163l = spanStyle.m105163l();
            if (m105163l != null) {
                m108201b = m105163l.m108203i();
            } else {
                m108201b = C32748Ew1.f8309b.m108201b();
            }
            C32748Ew1 m108209c = C32748Ew1.m108209c(m108201b);
            C32982Fw1 m105162m = spanStyle.m105162m();
            if (m105162m != null) {
                m106232a = m105162m.m106233m();
            } else {
                m106232a = C32982Fw1.f10526b.m106232a();
            }
            spannable.setSpan(new C32339Dc6(function4.invoke(m105166i, m105161n, m108209c, C32982Fw1.m106241e(m106232a))), i, i2, 33);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(GN5 gn5, Integer num, Integer num2) {
            m100565a(gn5, num.intValue(), num2.intValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final MetricAffectingSpan m100589a(long j, InterfaceC41273g01 interfaceC41273g01) {
        long m95973g = M26.m95973g(j);
        O26.C5817a c5817a = O26.f25571b;
        if (O26.m92975g(m95973g, c5817a.m92970b())) {
            return new C46512oq2(interfaceC41273g01.mo3415I0(j));
        }
        if (O26.m92975g(m95973g, c5817a.m92971a())) {
            return new C45919nq2(M26.m95972h(j));
        }
        return null;
    }

    /* renamed from: b */
    public static final void m100588b(GN5 gn5, List<C1577Df.C1580b<GN5>> spanStyles, Function3<? super GN5, ? super Integer, ? super Integer, Unit> block) {
        Object first;
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(block, "block");
        if (spanStyles.size() <= 1) {
            if (!spanStyles.isEmpty()) {
                block.invoke(m100585e(gn5, spanStyles.get(0).m110028e()), Integer.valueOf(spanStyles.get(0).m110027f()), Integer.valueOf(spanStyles.get(0).m110029d()));
                return;
            }
            return;
        }
        int size = spanStyles.size();
        int i = size * 2;
        Integer[] numArr = new Integer[i];
        for (int i2 = 0; i2 < i; i2++) {
            numArr[i2] = 0;
        }
        int size2 = spanStyles.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C1577Df.C1580b<GN5> c1580b = spanStyles.get(i3);
            numArr[i3] = Integer.valueOf(c1580b.m110027f());
            numArr[i3 + size] = Integer.valueOf(c1580b.m110029d());
        }
        ArraysKt___ArraysJvmKt.sort((Object[]) numArr);
        first = ArraysKt___ArraysKt.first(numArr);
        int intValue = ((Number) first).intValue();
        for (int i4 = 0; i4 < i; i4++) {
            int intValue2 = numArr[i4].intValue();
            if (intValue2 != intValue) {
                int size3 = spanStyles.size();
                GN5 gn52 = gn5;
                for (int i5 = 0; i5 < size3; i5++) {
                    C1577Df.C1580b<GN5> c1580b2 = spanStyles.get(i5);
                    if (c1580b2.m110027f() != c1580b2.m110029d() && C1921Ef.m108601l(intValue, intValue2, c1580b2.m110027f(), c1580b2.m110029d())) {
                        gn52 = m100585e(gn52, c1580b2.m110028e());
                    }
                }
                if (gn52 != null) {
                    block.invoke(gn52, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                }
                intValue = intValue2;
            }
        }
    }

    /* renamed from: c */
    public static final boolean m100587c(GN5 gn5) {
        long m95973g = M26.m95973g(gn5.m105160o());
        O26.C5817a c5817a = O26.f25571b;
        return O26.m92975g(m95973g, c5817a.m92970b()) || O26.m92975g(M26.m95973g(gn5.m105160o()), c5817a.m92971a());
    }

    /* renamed from: d */
    public static final boolean m100586d(G26 g26) {
        return C46042o26.m21955d(g26.m105925L()) || g26.m105909p() != null;
    }

    /* renamed from: e */
    public static final GN5 m100585e(GN5 gn5, GN5 gn52) {
        return gn5 == null ? gn52 : gn5.m105151x(gn52);
    }

    /* renamed from: f */
    public static final float m100584f(long j, float f, InterfaceC41273g01 interfaceC41273g01) {
        long m95973g = M26.m95973g(j);
        O26.C5817a c5817a = O26.f25571b;
        if (O26.m92975g(m95973g, c5817a.m92970b())) {
            return interfaceC41273g01.mo3415I0(j);
        }
        if (O26.m92975g(m95973g, c5817a.m92971a())) {
            return M26.m95972h(j) * f;
        }
        return Float.NaN;
    }

    /* renamed from: g */
    public static final void m100583g(Spannable setBackground, long j, int i, int i2) {
        boolean z;
        Intrinsics.checkNotNullParameter(setBackground, "$this$setBackground");
        if (j != C47063pm0.f104050b.m18726g()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m100570t(setBackground, new BackgroundColorSpan(C50619vm0.m8173h(j)), i, i2);
        }
    }

    /* renamed from: h */
    public static final void m100582h(Spannable spannable, C3091HE c3091he, int i, int i2) {
        if (c3091he != null) {
            m100570t(spannable, new C3938JE(c3091he.m104155h()), i, i2);
        }
    }

    /* renamed from: i */
    public static final void m100581i(Spannable spannable, AbstractC37727a30 abstractC37727a30, float f, int i, int i2) {
        if (abstractC37727a30 != null) {
            if (abstractC37727a30 instanceof C46831pN5) {
                m100580j(spannable, ((C46831pN5) abstractC37727a30).m19361b(), i, i2);
            } else if (abstractC37727a30 instanceof AbstractC34399Lx5) {
                m100570t(spannable, new C34633Mx5((AbstractC34399Lx5) abstractC37727a30, f), i, i2);
            }
        }
    }

    /* renamed from: j */
    public static final void m100580j(Spannable setColor, long j, int i, int i2) {
        boolean z;
        Intrinsics.checkNotNullParameter(setColor, "$this$setColor");
        if (j != C47063pm0.f104050b.m18726g()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m100570t(setColor, new ForegroundColorSpan(C50619vm0.m8173h(j)), i, i2);
        }
    }

    /* renamed from: k */
    public static final void m100579k(Spannable spannable, J61 j61, int i, int i2) {
        if (j61 != null) {
            m100570t(spannable, new K61(j61), i, i2);
        }
    }

    /* renamed from: l */
    public static final void m100578l(Spannable spannable, G26 g26, List<C1577Df.C1580b<GN5>> list, Function4<? super AbstractC44199kw1, ? super C33918Jw1, ? super C32748Ew1, ? super C32982Fw1, ? extends Typeface> function4) {
        GN5 gn5;
        boolean z;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1577Df.C1580b<GN5> c1580b = list.get(i);
            C1577Df.C1580b<GN5> c1580b2 = c1580b;
            if (!C46042o26.m21955d(c1580b2.m110028e()) && c1580b2.m110028e().m105162m() == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(c1580b);
            }
        }
        if (m100586d(g26)) {
            gn5 = new GN5(0L, 0L, g26.m105908q(), g26.m105910o(), g26.m105909p(), g26.m105913l(), (String) null, 0L, (C3091HE) null, (L16) null, (C50119uv2) null, 0L, (R06) null, (C35335Px5) null, 16323, (DefaultConstructorMarker) null);
        } else {
            gn5 = null;
        }
        m100588b(gn5, arrayList, new C4059a(spannable, function4));
    }

    /* renamed from: m */
    public static final void m100577m(Spannable spannable, String str, int i, int i2) {
        if (str != null) {
            m100570t(spannable, new C47164pw1(str), i, i2);
        }
    }

    /* renamed from: n */
    public static final void m100576n(Spannable setFontSize, long j, InterfaceC41273g01 density, int i, int i2) {
        int roundToInt;
        Intrinsics.checkNotNullParameter(setFontSize, "$this$setFontSize");
        Intrinsics.checkNotNullParameter(density, "density");
        long m95973g = M26.m95973g(j);
        O26.C5817a c5817a = O26.f25571b;
        if (O26.m92975g(m95973g, c5817a.m92970b())) {
            roundToInt = MathKt__MathJVMKt.roundToInt(density.mo3415I0(j));
            m100570t(setFontSize, new AbsoluteSizeSpan(roundToInt, false), i, i2);
        } else if (O26.m92975g(m95973g, c5817a.m92971a())) {
            m100570t(setFontSize, new RelativeSizeSpan(M26.m95972h(j)), i, i2);
        }
    }

    /* renamed from: o */
    public static final void m100575o(Spannable spannable, L16 l16, int i, int i2) {
        if (l16 != null) {
            m100570t(spannable, new ScaleXSpan(l16.m97920b()), i, i2);
            m100570t(spannable, new JB5(l16.m97919c()), i, i2);
        }
    }

    /* renamed from: p */
    public static final void m100574p(Spannable setLineHeight, long j, float f, InterfaceC41273g01 density, C46522or2 lineHeightStyle) {
        boolean z;
        int length;
        char last;
        Intrinsics.checkNotNullParameter(setLineHeight, "$this$setLineHeight");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(lineHeightStyle, "lineHeightStyle");
        float m100584f = m100584f(j, f, density);
        if (!Float.isNaN(m100584f)) {
            if (setLineHeight.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                last = StringsKt___StringsKt.last(setLineHeight);
                if (last != '\n') {
                    length = setLineHeight.length();
                    m100570t(setLineHeight, new C47115pr2(m100584f, 0, length, C46522or2.C27073c.m20442e(lineHeightStyle.m20454c()), C46522or2.C27073c.m20441f(lineHeightStyle.m20454c()), lineHeightStyle.m20455b()), 0, setLineHeight.length());
                }
            }
            length = setLineHeight.length() + 1;
            m100570t(setLineHeight, new C47115pr2(m100584f, 0, length, C46522or2.C27073c.m20442e(lineHeightStyle.m20454c()), C46522or2.C27073c.m20441f(lineHeightStyle.m20454c()), lineHeightStyle.m20455b()), 0, setLineHeight.length());
        }
    }

    /* renamed from: q */
    public static final void m100573q(Spannable setLineHeight, long j, float f, InterfaceC41273g01 density) {
        Intrinsics.checkNotNullParameter(setLineHeight, "$this$setLineHeight");
        Intrinsics.checkNotNullParameter(density, "density");
        float m100584f = m100584f(j, f, density);
        if (!Float.isNaN(m100584f)) {
            m100570t(setLineHeight, new C45929nr2(m100584f), 0, setLineHeight.length());
        }
    }

    /* renamed from: r */
    public static final void m100572r(Spannable spannable, C50119uv2 c50119uv2, int i, int i2) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        if (c50119uv2 != null) {
            m100570t(spannable, C51304wv2.f116826a.m6103a(c50119uv2), i, i2);
        }
    }

    /* renamed from: s */
    public static final void m100571s(Spannable spannable, C35335Px5 c35335Px5, int i, int i2) {
        if (c35335Px5 != null) {
            m100570t(spannable, new C36271Tx5(C50619vm0.m8173h(c35335Px5.m89240c()), C32120Ce3.m111944o(c35335Px5.m89239d()), C32120Ce3.m111943p(c35335Px5.m89239d()), C46042o26.m21957b(c35335Px5.m89241b())), i, i2);
        }
    }

    /* renamed from: t */
    public static final void m100570t(Spannable spannable, Object span, int i, int i2) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(span, "span");
        spannable.setSpan(span, i, i2, 33);
    }

    /* renamed from: u */
    public static final void m100569u(Spannable spannable, C1577Df.C1580b<GN5> c1580b, InterfaceC41273g01 interfaceC41273g01) {
        int m110027f = c1580b.m110027f();
        int m110029d = c1580b.m110029d();
        GN5 m110028e = c1580b.m110028e();
        m100582h(spannable, m110028e.m105170e(), m110027f, m110029d);
        m100580j(spannable, m110028e.m105168g(), m110027f, m110029d);
        m100581i(spannable, m110028e.m105169f(), m110028e.m105172c(), m110027f, m110029d);
        m100567w(spannable, m110028e.m105156s(), m110027f, m110029d);
        m100576n(spannable, m110028e.m105164k(), interfaceC41273g01, m110027f, m110029d);
        m100577m(spannable, m110028e.m105165j(), m110027f, m110029d);
        m100575o(spannable, m110028e.m105154u(), m110027f, m110029d);
        m100572r(spannable, m110028e.m105159p(), m110027f, m110029d);
        m100583g(spannable, m110028e.m105171d(), m110027f, m110029d);
        m100571s(spannable, m110028e.m105157r(), m110027f, m110029d);
        m100579k(spannable, m110028e.m105167h(), m110027f, m110029d);
    }

    /* renamed from: v */
    public static final void m100568v(Spannable spannable, G26 contextTextStyle, List<C1577Df.C1580b<GN5>> spanStyles, InterfaceC41273g01 density, Function4<? super AbstractC44199kw1, ? super C33918Jw1, ? super C32748Ew1, ? super C32982Fw1, ? extends Typeface> resolveTypeface) {
        MetricAffectingSpan m100589a;
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(contextTextStyle, "contextTextStyle");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        m100578l(spannable, contextTextStyle, spanStyles, resolveTypeface);
        int size = spanStyles.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C1577Df.C1580b<GN5> c1580b = spanStyles.get(i);
            int m110027f = c1580b.m110027f();
            int m110029d = c1580b.m110029d();
            if (m110027f >= 0 && m110027f < spannable.length() && m110029d > m110027f && m110029d <= spannable.length()) {
                m100569u(spannable, c1580b, density);
                if (m100587c(c1580b.m110028e())) {
                    z = true;
                }
            }
        }
        if (z) {
            int size2 = spanStyles.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C1577Df.C1580b<GN5> c1580b2 = spanStyles.get(i2);
                int m110027f2 = c1580b2.m110027f();
                int m110029d2 = c1580b2.m110029d();
                GN5 m110028e = c1580b2.m110028e();
                if (m110027f2 >= 0 && m110027f2 < spannable.length() && m110029d2 > m110027f2 && m110029d2 <= spannable.length() && (m100589a = m100589a(m110028e.m105160o(), density)) != null) {
                    m100570t(spannable, m100589a, m110027f2, m110029d2);
                }
            }
        }
    }

    /* renamed from: w */
    public static final void m100567w(Spannable spannable, R06 r06, int i, int i2) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        if (r06 != null) {
            R06.C7050a c7050a = R06.f31395b;
            m100570t(spannable, new S06(r06.m87432d(c7050a.m87427d()), r06.m87432d(c7050a.m87429b())), i, i2);
        }
    }

    /* renamed from: x */
    public static final void m100566x(Spannable spannable, N16 n16, float f, InterfaceC41273g01 density) {
        float f2;
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        if (n16 != null) {
            if ((!M26.m95975e(n16.m94450b(), N26.m94414f(0)) || !M26.m95975e(n16.m94449c(), N26.m94414f(0))) && !N26.m94413g(n16.m94450b()) && !N26.m94413g(n16.m94449c())) {
                long m95973g = M26.m95973g(n16.m94450b());
                O26.C5817a c5817a = O26.f25571b;
                float f3 = 0.0f;
                if (O26.m92975g(m95973g, c5817a.m92970b())) {
                    f2 = density.mo3415I0(n16.m94450b());
                } else if (O26.m92975g(m95973g, c5817a.m92971a())) {
                    f2 = M26.m95972h(n16.m94450b()) * f;
                } else {
                    f2 = 0.0f;
                }
                long m95973g2 = M26.m95973g(n16.m94449c());
                if (O26.m92975g(m95973g2, c5817a.m92970b())) {
                    f3 = density.mo3415I0(n16.m94449c());
                } else if (O26.m92975g(m95973g2, c5817a.m92971a())) {
                    f3 = M26.m95972h(n16.m94449c()) * f;
                }
                m100570t(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(f2), (int) Math.ceil(f3)), 0, spannable.length());
            }
        }
    }
}
