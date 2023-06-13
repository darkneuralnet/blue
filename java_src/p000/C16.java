package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC44199kw1;
@Metadata(m28433d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010 \u001a\u00020\u0019\u0012\u0006\u0010&\u001a\u00020!¢\u0006\u0004\by\u0010zJo\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R$\u00104\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R+\u0010:\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00106\u001a\u0004\b.\u00107\"\u0004\b8\u00109R4\u0010A\u001a\u00020;2\u0006\u00105\u001a\u00020;8F@FX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010H\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\b<\u0010E\"\u0004\bF\u0010GR\u001c\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010J0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00106R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR+\u0010W\u001a\u00020R2\u0006\u00105\u001a\u00020R8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bS\u00106\u001a\u0004\b(\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010X\u001a\u0004\bY\u00107\"\u0004\bZ\u00109R+\u0010^\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u00106\u001a\u0004\b\\\u00107\"\u0004\b]\u00109R+\u0010b\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b_\u00106\u001a\u0004\b`\u00107\"\u0004\ba\u00109R+\u0010e\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bc\u00106\u001a\u0004\bc\u00107\"\u0004\bd\u00109R$\u0010g\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bY\u0010X\u001a\u0004\bf\u00107R\u0014\u0010j\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010iR\"\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010kR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010k\u001a\u0004\bS\u0010mR&\u0010o\u001a\u000e\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u000f0\r8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\bN\u0010k\u001a\u0004\bL\u0010mR\u0017\u0010s\u001a\u00020p8\u0006¢\u0006\f\n\u0004\bf\u0010q\u001a\u0004\b_\u0010rR(\u0010x\u001a\u0004\u0018\u00010J2\b\u0010t\u001a\u0004\u0018\u00010J8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010u\"\u0004\bv\u0010w\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006{"}, m28432d2 = {"LC16;", "", "LDf;", "untransformedText", "visualText", "LG26;", "textStyle", "", "softWrap", "Lg01;", "density", "Lkw1$b;", "fontFamilyResolver", "Lkotlin/Function1;", "LF16;", "", "onValueChange", "LZk2;", "keyboardActions", "LBv1;", "focusManager", "Lpm0;", "selectionBackgroundColor", "E", "(LDf;LDf;LG26;ZLg01;Lkw1$b;Lkotlin/jvm/functions/Function1;LZk2;LBv1;J)V", "LT06;", C17296a.f69688o, "LT06;", "r", "()LT06;", "setTextDelegate", "(LT06;)V", "textDelegate", "Lns4;", "b", "Lns4;", "l", "()Lns4;", "recomposeScope", "LP91;", "c", "LP91;", "k", "()LP91;", "processor", "La26;", DateTokenConverter.CONVERTER_KEY, "La26;", "e", "()La26;", "w", "(La26;)V", "inputSession", "<set-?>", "LEX2;", "()Z", "v", "(Z)V", "hasFocus", "Lk61;", "f", "h", "()F", "z", "(F)V", "minHeightForSingleLineField", "Lnm2;", "g", "Lnm2;", "()Lnm2;", "x", "(Lnm2;)V", "layoutCoordinates", "LEX2;", "Lj26;", "layoutResultState", "i", "LDf;", "s", "()LDf;", "setUntransformedText", "(LDf;)V", "LME1;", "j", "()LME1;", "u", "(LME1;)V", "handleState", "Z", "o", "B", "showFloatingToolbar", "q", "D", "showSelectionHandleStart", "m", "p", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "showSelectionHandleEnd", "n", "A", "showCursorHandle", "t", "isLayoutResultStale", "LXk2;", "LXk2;", "keyboardActionRunner", "Lkotlin/jvm/functions/Function1;", "onValueChangeOriginal", "()Lkotlin/jvm/functions/Function1;", "LFY1;", "onImeActionPerformed", "LkE3;", "LkE3;", "()LkE3;", "selectionPaint", "value", "()Lj26;", "y", "(Lj26;)V", "layoutResult", "<init>", "(LT06;Lns4;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/TextFieldState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1087:1\n154#2:1088\n76#3:1089\n102#3,2:1090\n76#3:1092\n102#3,2:1093\n76#3:1095\n102#3,2:1096\n76#3:1098\n102#3,2:1099\n76#3:1101\n102#3,2:1102\n76#3:1104\n102#3,2:1105\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/TextFieldState\n*L\n749#1:1088\n744#1:1089\n744#1:1090,2\n749#1:1092\n749#1:1093,2\n800#1:1095\n800#1:1096,2\n811#1:1098\n811#1:1099,2\n817#1:1101\n817#1:1102,2\n823#1:1104\n823#1:1105,2\n*E\n"})
/* renamed from: C16 */
/* loaded from: classes.dex */
public final class C16 {

    /* renamed from: a */
    public T06 f3292a;

    /* renamed from: b */
    public final InterfaceC45941ns4 f3293b;

    /* renamed from: c */
    public final P91 f3294c;

    /* renamed from: d */
    public C37723a26 f3295d;

    /* renamed from: e */
    public final EX2 f3296e;

    /* renamed from: f */
    public final EX2 f3297f;

    /* renamed from: g */
    public InterfaceC45879nm2 f3298g;

    /* renamed from: h */
    public final EX2<C43077j26> f3299h;

    /* renamed from: i */
    public C1577Df f3300i;

    /* renamed from: j */
    public final EX2 f3301j;

    /* renamed from: k */
    public boolean f3302k;

    /* renamed from: l */
    public final EX2 f3303l;

    /* renamed from: m */
    public final EX2 f3304m;

    /* renamed from: n */
    public final EX2 f3305n;

    /* renamed from: o */
    public boolean f3306o;

    /* renamed from: p */
    public final C37087Xk2 f3307p;

    /* renamed from: q */
    public Function1<? super F16, Unit> f3308q;

    /* renamed from: r */
    public final Function1<F16, Unit> f3309r;

    /* renamed from: s */
    public final Function1<FY1, Unit> f3310s;

    /* renamed from: t */
    public final InterfaceC43783kE3 f3311t;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LFY1;", "imeAction", "", "b", "(I)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C16$a */
    /* loaded from: classes.dex */
    public static final class C0840a extends Lambda implements Function1<FY1, Unit> {
        public C0840a() {
            super(1);
        }

        /* renamed from: b */
        public final void m112969b(int i) {
            C16.this.f3307p.m76485d(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FY1 fy1) {
            m112969b(fy1.m107004o());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LF16;", "it", "", "invoke", "(LF16;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C16$b */
    /* loaded from: classes.dex */
    public static final class C0841b extends Lambda implements Function1<F16, Unit> {
        public C0841b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(F16 f16) {
            invoke2(f16);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(F16 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String m108102h = it.m108102h();
            C1577Df m112977s = C16.this.m112977s();
            if (!Intrinsics.areEqual(m108102h, m112977s != null ? m112977s.m110052j() : null)) {
                C16.this.m112975u(ME1.None);
            }
            C16.this.f3308q.invoke(it);
            C16.this.m112984l().invalidate();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LF16;", "it", "", "invoke", "(LF16;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: C16$c */
    /* loaded from: classes.dex */
    public static final class C0842c extends Lambda implements Function1<F16, Unit> {

        /* renamed from: g */
        public static final C0842c f3314g = new C0842c();

        public C0842c() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(F16 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(F16 f16) {
            invoke2(f16);
            return Unit.INSTANCE;
        }
    }

    public C16(T06 textDelegate, InterfaceC45941ns4 recomposeScope) {
        EX2 m97025e;
        EX2 m97025e2;
        EX2<C43077j26> m97025e3;
        EX2 m97025e4;
        EX2 m97025e5;
        EX2 m97025e6;
        EX2 m97025e7;
        Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
        Intrinsics.checkNotNullParameter(recomposeScope, "recomposeScope");
        this.f3292a = textDelegate;
        this.f3293b = recomposeScope;
        this.f3294c = new P91();
        Boolean bool = Boolean.FALSE;
        m97025e = LM5.m97025e(bool, null, 2, null);
        this.f3296e = m97025e;
        m97025e2 = LM5.m97025e(C43705k61.m29306d(C43705k61.m29303g(0)), null, 2, null);
        this.f3297f = m97025e2;
        m97025e3 = LM5.m97025e(null, null, 2, null);
        this.f3299h = m97025e3;
        m97025e4 = LM5.m97025e(ME1.None, null, 2, null);
        this.f3301j = m97025e4;
        m97025e5 = LM5.m97025e(bool, null, 2, null);
        this.f3303l = m97025e5;
        m97025e6 = LM5.m97025e(bool, null, 2, null);
        this.f3304m = m97025e6;
        m97025e7 = LM5.m97025e(bool, null, 2, null);
        this.f3305n = m97025e7;
        this.f3306o = true;
        this.f3307p = new C37087Xk2();
        this.f3308q = C0842c.f3314g;
        this.f3309r = new C0841b();
        this.f3310s = new C0840a();
        this.f3311t = C22702hd.m36156a();
    }

    /* renamed from: A */
    public final void m113000A(boolean z) {
        this.f3305n.setValue(Boolean.valueOf(z));
    }

    /* renamed from: B */
    public final void m112999B(boolean z) {
        this.f3302k = z;
    }

    /* renamed from: C */
    public final void m112998C(boolean z) {
        this.f3304m.setValue(Boolean.valueOf(z));
    }

    /* renamed from: D */
    public final void m112997D(boolean z) {
        this.f3303l.setValue(Boolean.valueOf(z));
    }

    /* renamed from: E */
    public final void m112996E(C1577Df untransformedText, C1577Df visualText, G26 textStyle, boolean z, InterfaceC41273g01 density, AbstractC44199kw1.InterfaceC25559b fontFamilyResolver, Function1<? super F16, Unit> onValueChange, C37555Zk2 keyboardActions, InterfaceC32037Bv1 focusManager, long j) {
        List emptyList;
        Intrinsics.checkNotNullParameter(untransformedText, "untransformedText");
        Intrinsics.checkNotNullParameter(visualText, "visualText");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(keyboardActions, "keyboardActions");
        Intrinsics.checkNotNullParameter(focusManager, "focusManager");
        this.f3308q = onValueChange;
        this.f3311t.mo29179f(j);
        C37087Xk2 c37087Xk2 = this.f3307p;
        c37087Xk2.m76482g(keyboardActions);
        c37087Xk2.m76484e(focusManager);
        c37087Xk2.m76483f(this.f3295d);
        this.f3300i = untransformedText;
        T06 t06 = this.f3292a;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        T06 m101027d = JC0.m101027d(t06, visualText, textStyle, density, fontFamilyResolver, z, 0, 0, 0, emptyList, 448, null);
        if (this.f3292a != m101027d) {
            this.f3306o = true;
        }
        this.f3292a = m101027d;
    }

    /* renamed from: c */
    public final ME1 m112993c() {
        return (ME1) this.f3301j.getValue();
    }

    /* renamed from: d */
    public final boolean m112992d() {
        return ((Boolean) this.f3296e.getValue()).booleanValue();
    }

    /* renamed from: e */
    public final C37723a26 m112991e() {
        return this.f3295d;
    }

    /* renamed from: f */
    public final InterfaceC45879nm2 m112990f() {
        return this.f3298g;
    }

    /* renamed from: g */
    public final C43077j26 m112989g() {
        return this.f3299h.getValue();
    }

    /* renamed from: h */
    public final float m112988h() {
        return ((C43705k61) this.f3297f.getValue()).m29298l();
    }

    /* renamed from: i */
    public final Function1<FY1, Unit> m112987i() {
        return this.f3310s;
    }

    /* renamed from: j */
    public final Function1<F16, Unit> m112986j() {
        return this.f3309r;
    }

    /* renamed from: k */
    public final P91 m112985k() {
        return this.f3294c;
    }

    /* renamed from: l */
    public final InterfaceC45941ns4 m112984l() {
        return this.f3293b;
    }

    /* renamed from: m */
    public final InterfaceC43783kE3 m112983m() {
        return this.f3311t;
    }

    /* renamed from: n */
    public final boolean m112982n() {
        return ((Boolean) this.f3305n.getValue()).booleanValue();
    }

    /* renamed from: o */
    public final boolean m112981o() {
        return this.f3302k;
    }

    /* renamed from: p */
    public final boolean m112980p() {
        return ((Boolean) this.f3304m.getValue()).booleanValue();
    }

    /* renamed from: q */
    public final boolean m112979q() {
        return ((Boolean) this.f3303l.getValue()).booleanValue();
    }

    /* renamed from: r */
    public final T06 m112978r() {
        return this.f3292a;
    }

    /* renamed from: s */
    public final C1577Df m112977s() {
        return this.f3300i;
    }

    /* renamed from: t */
    public final boolean m112976t() {
        return this.f3306o;
    }

    /* renamed from: u */
    public final void m112975u(ME1 me1) {
        Intrinsics.checkNotNullParameter(me1, "<set-?>");
        this.f3301j.setValue(me1);
    }

    /* renamed from: v */
    public final void m112974v(boolean z) {
        this.f3296e.setValue(Boolean.valueOf(z));
    }

    /* renamed from: w */
    public final void m112973w(C37723a26 c37723a26) {
        this.f3295d = c37723a26;
    }

    /* renamed from: x */
    public final void m112972x(InterfaceC45879nm2 interfaceC45879nm2) {
        this.f3298g = interfaceC45879nm2;
    }

    /* renamed from: y */
    public final void m112971y(C43077j26 c43077j26) {
        this.f3299h.setValue(c43077j26);
        this.f3306o = false;
    }

    /* renamed from: z */
    public final void m112970z(float f) {
        this.f3297f.setValue(C43705k61.m29306d(f));
    }
}
