package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import p000.C41185fr2;
@Metadata(m28433d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B,\u0012\u0006\u0010O\u001a\u00020J\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010V\u001a\u000200\u0012\u0006\u0010[\u001a\u00020Wø\u0001\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002JJ\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001d\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0018\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bH\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J \u0010&\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u000bH\u0016J\u0010\u0010*\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u000bH\u0016J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u000bH\u0016J\u0017\u0010,\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u000bH\u0000¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u000bH\u0016J\u0010\u0010/\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000bH\u0016J\u0018\u00102\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000b2\u0006\u00101\u001a\u000200H\u0016J\u0010\u00103\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0018\u00105\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u00104\u001a\u000200H\u0016J\u0010\u00107\u001a\u0002062\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0010\u00108\u001a\u0002062\u0006\u0010\u001d\u001a\u00020\u000bH\u0016JK\u0010C\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010:\u001a\u0002092\b\u0010<\u001a\u0004\u0018\u00010;2\b\u0010>\u001a\u0004\u0018\u00010=2\b\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010B\u001a\u00020AH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010DJS\u0010H\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020\u00162\b\u0010<\u001a\u0004\u0018\u00010;2\b\u0010>\u001a\u0004\u0018\u00010=2\b\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010B\u001a\u00020AH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010IR\u0017\u0010O\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010V\u001a\u0002008\u0006¢\u0006\f\n\u0004\b+\u0010S\u001a\u0004\bT\u0010UR \u0010[\u001a\u00020W8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010X\u001a\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R \u0010e\u001a\u00020_8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010`\u0012\u0004\bc\u0010d\u001a\u0004\ba\u0010bR\"\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010g\u001a\u0004\bh\u0010iR\u001b\u0010o\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010l\u001a\u0004\bm\u0010nR\u0014\u0010r\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010t\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010qR\u0014\u0010u\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010qR\u0014\u0010v\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010qR\u0014\u0010x\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010qR\u0014\u0010z\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010UR\u001a\u0010\u007f\u001a\u00020{8@X\u0081\u0004¢\u0006\f\u0012\u0004\b~\u0010d\u001a\u0004\b|\u0010}R\u0016\u0010\u0081\u0001\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010RR\u001f\u0010\u0086\u0001\u001a\u00030\u0082\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b\u0085\u0001\u0010d\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0089\u0001"}, m28432d2 = {"Lid;", "LxE3;", "Le26;", "", "LMx5;", "B", "(Le26;)[LMx5;", "Lme0;", "canvas", "", "F", "", "alignment", "justificationMode", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "maxLines", "hyphens", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "z", "", "vertical", "i", "LCe3;", "position", "f", "(J)I", "offset", "LOs4;", "w", "start", "end", "LcJ3;", "p", "l", "Ls26;", DateTokenConverter.CONVERTER_KEY, "(I)J", "lineIndex", "j", "n", "c", "A", "(I)F", "k", "g", "", "visibleEnd", "h", "u", "usePrimaryDirection", "q", "LUL4;", "b", "v", "Lpm0;", "color", "LPx5;", "shadow", "LR06;", "textDecoration", "LJ61;", "drawStyle", "LLW;", "blendMode", "t", "(Lme0;JLPx5;LR06;LJ61;I)V", "La30;", "brush", "alpha", "r", "(Lme0;La30;FLPx5;LR06;LJ61;I)V", "Lkd;", C17296a.f69688o, "Lkd;", "getParagraphIntrinsics", "()Lkd;", "paragraphIntrinsics", "I", "getMaxLines", "()I", "Z", "getEllipsis", "()Z", "ellipsis", "Lkz0;", "J", "getConstraints-msEJaDk", "()J", "constraints", "e", "Le26;", "layout", "", "Ljava/lang/CharSequence;", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getCharSequence$ui_text_release$annotations", "()V", "charSequence", "", "Ljava/util/List;", "x", "()Ljava/util/List;", "placeholderRects", "LBC6;", "Lkotlin/Lazy;", "E", "()LBC6;", "wordBoundary", "getWidth", "()F", "width", "getHeight", "height", "minIntrinsicWidth", "firstBaseline", "s", "lastBaseline", "o", "didExceedMaxLines", "Ljava/util/Locale;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()Ljava/util/Locale;", "getTextLocale$ui_text_release$annotations", "textLocale", "m", "lineCount", "LQd;", "D", "()LQd;", "getTextPaint$ui_text_release$annotations", "textPaint", "<init>", "(Lkd;IZJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidParagraph.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,621:1\n1#2:622\n13579#3,2:623\n11335#3:625\n11670#3,3:626\n26#4:629\n26#4:630\n*S KotlinDebug\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n*L\n204#1:623,2\n244#1:625\n244#1:626,3\n439#1:629\n443#1:630\n*E\n"})
/* renamed from: id */
/* loaded from: classes.dex */
public final class C23291id implements InterfaceC51490xE3 {

    /* renamed from: a */
    public final C25194kd f87531a;

    /* renamed from: b */
    public final int f87532b;

    /* renamed from: c */
    public final boolean f87533c;

    /* renamed from: d */
    public final long f87534d;

    /* renamed from: e */
    public final C40112e26 f87535e;

    /* renamed from: f */
    public final CharSequence f87536f;

    /* renamed from: g */
    public final List<C35055Os4> f87537g;

    /* renamed from: h */
    public final Lazy f87538h;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: id$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C23292a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UL4.values().length];
            try {
                iArr[UL4.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UL4.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LBC6;", "b", "()LBC6;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: id$b */
    /* loaded from: classes.dex */
    public static final class C23293b extends Lambda implements Function0<BC6> {
        public C23293b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final BC6 invoke() {
            return new BC6(C23291id.this.m33734C(), C23291id.this.f87535e.m43350D());
        }
    }

    public /* synthetic */ C23291id(C25194kd c25194kd, int i, boolean z, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(c25194kd, i, z, j);
    }

    /* renamed from: A */
    public final float m33736A(int i) {
        return this.f87535e.m43338i(i);
    }

    /* renamed from: B */
    public final C34633Mx5[] m33735B(C40112e26 c40112e26) {
        boolean z;
        if (!(c40112e26.m43350D() instanceof Spanned)) {
            return new C34633Mx5[0];
        }
        CharSequence m43350D = c40112e26.m43350D();
        Intrinsics.checkNotNull(m43350D, "null cannot be cast to non-null type android.text.Spanned");
        C34633Mx5[] brushSpans = (C34633Mx5[]) ((Spanned) m43350D).getSpans(0, c40112e26.m43350D().length(), C34633Mx5.class);
        Intrinsics.checkNotNullExpressionValue(brushSpans, "brushSpans");
        if (brushSpans.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C34633Mx5[0];
        }
        return brushSpans;
    }

    /* renamed from: C */
    public final Locale m33734C() {
        Locale textLocale = this.f87531a.m28719k().getTextLocale();
        Intrinsics.checkNotNullExpressionValue(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return textLocale;
    }

    /* renamed from: D */
    public final C6816Qd m33733D() {
        return this.f87531a.m28719k();
    }

    /* renamed from: E */
    public final BC6 m33732E() {
        return (BC6) this.f87538h.getValue();
    }

    /* renamed from: F */
    public final void m33731F(InterfaceC45204me0 interfaceC45204me0) {
        Canvas m64279c = C12455bc.m64279c(interfaceC45204me0);
        if (mo5629o()) {
            m64279c.save();
            m64279c.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.f87535e.m43347G(m64279c);
        if (mo5629o()) {
            m64279c.restore();
        }
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: a */
    public float mo5643a() {
        return this.f87531a.mo28729a();
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: b */
    public UL4 mo5642b(int i) {
        if (this.f87535e.m43323x(this.f87535e.m43332o(i)) == 1) {
            return UL4.Ltr;
        }
        return UL4.Rtl;
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: c */
    public float mo5641c(int i) {
        return this.f87535e.m43326u(i);
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: d */
    public long mo5640d(int i) {
        return C49006t26.m13200b(m33732E().m114215b(i), m33732E().m114216a(i));
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: e */
    public float mo5639e() {
        return m33736A(0);
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: f */
    public int mo5638f(long j) {
        return this.f87535e.m43324w(this.f87535e.m43331p((int) C32120Ce3.m111943p(j)), C32120Ce3.m111944o(j));
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: g */
    public int mo5637g(int i) {
        return this.f87535e.m43327t(i);
    }

    @Override // p000.InterfaceC51490xE3
    public float getHeight() {
        return this.f87535e.m43343d();
    }

    @Override // p000.InterfaceC51490xE3
    public float getWidth() {
        return C44228kz0.m28063n(this.f87534d);
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: h */
    public int mo5636h(int i, boolean z) {
        if (z) {
            return this.f87535e.m43325v(i);
        }
        return this.f87535e.m43333n(i);
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: i */
    public int mo5635i(float f) {
        return this.f87535e.m43331p((int) f);
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: j */
    public float mo5634j(int i) {
        return this.f87535e.m43329r(i);
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: k */
    public float mo5633k(int i) {
        return this.f87535e.m43337j(i);
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: l */
    public C35055Os4 mo5632l(int i) {
        boolean z;
        if (i >= 0 && i <= this.f87536f.length()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float m43321z = C40112e26.m43321z(this.f87535e, i, false, 2, null);
            int m43332o = this.f87535e.m43332o(i);
            return new C35055Os4(m43321z, this.f87535e.m43326u(m43332o), m43321z, this.f87535e.m43337j(m43332o));
        }
        throw new AssertionError("offset(" + i + ") is out of bounds (0," + this.f87536f.length());
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: m */
    public int mo5631m() {
        return this.f87535e.m43336k();
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: n */
    public float mo5630n(int i) {
        return this.f87535e.m43328s(i);
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: o */
    public boolean mo5629o() {
        return this.f87535e.m43345b();
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: p */
    public InterfaceC39067cJ3 mo5628p(int i, int i2) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z && i2 <= this.f87536f.length()) {
            Path path = new Path();
            this.f87535e.m43351C(i, i2, path);
            return C28793td.m12006b(path);
        }
        throw new AssertionError("Start(" + i + ") or End(" + i2 + ") is out of Range(0.." + this.f87536f.length() + "), or start > end!");
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: q */
    public float mo5627q(int i, boolean z) {
        if (z) {
            return C40112e26.m43321z(this.f87535e, i, false, 2, null);
        }
        return C40112e26.m43352B(this.f87535e, i, false, 2, null);
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: r */
    public void mo5626r(InterfaceC45204me0 canvas, AbstractC37727a30 brush, float f, C35335Px5 c35335Px5, R06 r06, J61 j61, int i) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        int m88313a = m33733D().m88313a();
        C6816Qd m33733D = m33733D();
        m33733D.m88311c(brush, CB5.m112663a(getWidth(), getHeight()), f);
        m33733D.m88308f(c35335Px5);
        m33733D.m88307g(r06);
        m33733D.m88309e(j61);
        m33733D.m88312b(i);
        m33731F(canvas);
        m33733D().m88312b(m88313a);
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: s */
    public float mo5625s() {
        return m33736A(mo5631m() - 1);
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: t */
    public void mo5624t(InterfaceC45204me0 canvas, long j, C35335Px5 c35335Px5, R06 r06, J61 j61, int i) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int m88313a = m33733D().m88313a();
        C6816Qd m33733D = m33733D();
        m33733D.m88310d(j);
        m33733D.m88308f(c35335Px5);
        m33733D.m88307g(r06);
        m33733D.m88309e(j61);
        m33733D.m88312b(i);
        m33731F(canvas);
        m33733D().m88312b(m88313a);
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: u */
    public int mo5623u(int i) {
        return this.f87535e.m43332o(i);
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: v */
    public UL4 mo5622v(int i) {
        if (this.f87535e.m43348F(i)) {
            return UL4.Rtl;
        }
        return UL4.Ltr;
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: w */
    public C35055Os4 mo5621w(int i) {
        RectF m43346a = this.f87535e.m43346a(i);
        return new C35055Os4(m43346a.left, m43346a.top, m43346a.right, m43346a.bottom);
    }

    @Override // p000.InterfaceC51490xE3
    /* renamed from: x */
    public List<C35055Os4> mo5620x() {
        return this.f87537g;
    }

    /* renamed from: z */
    public final C40112e26 m33729z(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7) {
        return new C40112e26(this.f87536f, getWidth(), m33733D(), i, truncateAt, this.f87531a.m28720j(), 1.0f, 0.0f, C24958jd.m30196b(this.f87531a.m28721i()), true, i3, i5, i6, i7, i4, i2, null, null, this.f87531a.m28722h(), 196736, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public C23291id(C25194kd c25194kd, int i, boolean z, long j) {
        CharSequence m28724f;
        List<C35055Os4> list;
        C35055Os4 c35055Os4;
        float mo5627q;
        float m43338i;
        int m79844b;
        float m43326u;
        float f;
        float m43338i2;
        Lazy lazy;
        int coerceAtLeast;
        this.f87531a = c25194kd;
        this.f87532b = i;
        this.f87533c = z;
        this.f87534d = j;
        if ((C44228kz0.m28062o(j) == 0 && C44228kz0.m28061p(j) == 0) != true) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if ((i >= 1) != false) {
            G26 m28721i = c25194kd.m28721i();
            if (C26555nd.m23424c(m28721i, z)) {
                m28724f = C26555nd.m23426a(c25194kd.m28724f());
            } else {
                m28724f = c25194kd.m28724f();
            }
            this.f87536f = m28724f;
            int m23423d = C26555nd.m23423d(m28721i.m105935B());
            C47801r06 m105935B = m28721i.m105935B();
            int i2 = m105935B == null ? 0 : C47801r06.m16682j(m105935B.m16679m(), C47801r06.f106195b.m16676c()) ? 1 : 0;
            int m23421f = C26555nd.m23421f(m28721i.m105901x().m110659c());
            C41185fr2 m105905t = m28721i.m105905t();
            int m23422e = C26555nd.m23422e(m105905t != null ? C41185fr2.C20554b.m40737d(C41185fr2.m40747f(m105905t.m40742k())) : null);
            C41185fr2 m105905t2 = m28721i.m105905t();
            int m23420g = C26555nd.m23420g(m105905t2 != null ? C41185fr2.C20556c.m40723e(C41185fr2.m40746g(m105905t2.m40742k())) : null);
            C41185fr2 m105905t3 = m28721i.m105905t();
            int m23419h = C26555nd.m23419h(m105905t3 != null ? C41185fr2.C20558d.m40710c(C41185fr2.m40745h(m105905t3.m40742k())) : null);
            TextUtils.TruncateAt truncateAt = z ? TextUtils.TruncateAt.END : null;
            C40112e26 m33729z = m33729z(m23423d, i2, truncateAt, i, m23421f, m23422e, m23420g, m23419h);
            if (z && m33729z.m43343d() > C44228kz0.m28064m(j) && i > 1) {
                int m23425b = C26555nd.m23425b(m33729z, C44228kz0.m28064m(j));
                if (m23425b >= 0 && m23425b != i) {
                    coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(m23425b, 1);
                    m33729z = m33729z(m23423d, i2, truncateAt, coerceAtLeast, m23421f, m23422e, m23420g, m23419h);
                }
                this.f87535e = m33729z;
            } else {
                this.f87535e = m33729z;
            }
            m33733D().m88311c(m28721i.m105916i(), CB5.m112663a(getWidth(), getHeight()), m28721i.m105919f());
            for (C34633Mx5 c34633Mx5 : m33735B(this.f87535e)) {
                c34633Mx5.m94546a(CB5.m112663a(getWidth(), getHeight()));
            }
            CharSequence charSequence = this.f87536f;
            if (charSequence instanceof Spanned) {
                Object[] spans = ((Spanned) charSequence).getSpans(0, charSequence.length(), VU3.class);
                Intrinsics.checkNotNullExpressionValue(spans, "getSpans(0, length, PlaceholderSpan::class.java)");
                ArrayList arrayList = new ArrayList(spans.length);
                for (Object obj : spans) {
                    VU3 vu3 = (VU3) obj;
                    Spanned spanned = (Spanned) charSequence;
                    int spanStart = spanned.getSpanStart(vu3);
                    int spanEnd = spanned.getSpanEnd(vu3);
                    int m43332o = this.f87535e.m43332o(spanStart);
                    ?? r10 = m43332o >= this.f87532b;
                    ?? r11 = this.f87535e.m43335l(m43332o) > 0 && spanEnd > this.f87535e.m43334m(m43332o);
                    ?? r6 = spanEnd > this.f87535e.m43333n(m43332o);
                    if (r11 == true || r6 == true || r10 == true) {
                        c35055Os4 = null;
                    } else {
                        int i3 = C23292a.$EnumSwitchMapping$0[mo5622v(spanStart).ordinal()];
                        if (i3 == 1) {
                            mo5627q = mo5627q(spanStart, true);
                        } else if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            mo5627q = mo5627q(spanStart, true) - vu3.m79842d();
                        }
                        float m79842d = vu3.m79842d() + mo5627q;
                        C40112e26 c40112e26 = this.f87535e;
                        switch (vu3.m79843c()) {
                            case 0:
                                m43338i = c40112e26.m43338i(m43332o);
                                m79844b = vu3.m79844b();
                                m43326u = m43338i - m79844b;
                                break;
                            case 1:
                                m43326u = c40112e26.m43326u(m43332o);
                                break;
                            case 2:
                                m43338i = c40112e26.m43337j(m43332o);
                                m79844b = vu3.m79844b();
                                m43326u = m43338i - m79844b;
                                break;
                            case 3:
                                m43326u = ((c40112e26.m43326u(m43332o) + c40112e26.m43337j(m43332o)) - vu3.m79844b()) / 2;
                                break;
                            case 4:
                                f = vu3.m79845a().ascent;
                                m43338i2 = c40112e26.m43338i(m43332o);
                                m43326u = f + m43338i2;
                                break;
                            case 5:
                                m43326u = (vu3.m79845a().descent + c40112e26.m43338i(m43332o)) - vu3.m79844b();
                                break;
                            case 6:
                                Paint.FontMetricsInt m79845a = vu3.m79845a();
                                f = ((m79845a.ascent + m79845a.descent) - vu3.m79844b()) / 2;
                                m43338i2 = c40112e26.m43338i(m43332o);
                                m43326u = f + m43338i2;
                                break;
                            default:
                                throw new IllegalStateException("unexpected verticalAlignment");
                        }
                        c35055Os4 = new C35055Os4(mo5627q, m43326u, m79842d, vu3.m79844b() + m43326u);
                    }
                    arrayList.add(c35055Os4);
                }
                list = arrayList;
            } else {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            this.f87537g = list;
            lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C23293b());
            this.f87538h = lazy;
            return;
        }
        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
    }
}
