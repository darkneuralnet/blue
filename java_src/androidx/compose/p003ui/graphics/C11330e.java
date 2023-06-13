package androidx.compose.p003ui.graphics;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.InterfaceC41563gV2;
import p000.OU3;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0096\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u000f\u0012\u0006\u0010\"\u001a\u00020\u000f\u0012\u0006\u0010&\u001a\u00020\u000f\u0012\u0006\u0010*\u001a\u00020\u000f\u0012\u0006\u0010.\u001a\u00020\u000f\u0012\u0006\u00102\u001a\u00020\u000f\u0012\u0006\u00106\u001a\u00020\u000f\u0012\u0006\u0010:\u001a\u00020\u000f\u0012\u0006\u0010B\u001a\u00020;\u0012\u0006\u0010J\u001a\u00020C\u0012\u0006\u0010R\u001a\u00020K\u0012\b\u0010Z\u001a\u0004\u0018\u00010S\u0012\u0006\u0010_\u001a\u00020[\u0012\u0006\u0010c\u001a\u00020[\u0012\b\b\u0002\u0010k\u001a\u00020dø\u0001\u0001¢\u0006\u0004\br\u0010sJ\u0006\u0010\u0004\u001a\u00020\u0003J)\u0010\u000b\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\"\u0010\u001e\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\"\u0010\"\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\"\u0010&\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0011\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\"\u0010*\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0011\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\"\u0010.\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0011\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R\"\u00102\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0011\u001a\u0004\b0\u0010\u0013\"\u0004\b1\u0010\u0015R\"\u00106\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0011\u001a\u0004\b4\u0010\u0013\"\u0004\b5\u0010\u0015R\"\u0010:\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0011\u001a\u0004\b8\u0010\u0013\"\u0004\b9\u0010\u0015R+\u0010B\u001a\u00020;8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010Z\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR+\u0010_\u001a\u00020[8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\\\u0010=\u001a\u0004\b]\u0010?\"\u0004\b^\u0010AR+\u0010c\u001a\u00020[8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b`\u0010=\u001a\u0004\ba\u0010?\"\u0004\bb\u0010AR+\u0010k\u001a\u00020d8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR'\u0010q\u001a\u0013\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020\u00030l¢\u0006\u0002\bn8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010p\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006t"}, m28432d2 = {"Landroidx/compose/ui/graphics/e;", "LDm2;", "LgV2$c;", "", "w0", "LzO2;", "LvO2;", "measurable", "Lkz0;", "constraints", "LyO2;", "f", "(LzO2;LvO2;J)LyO2;", "", "toString", "", "l", "F", "o0", "()F", "G0", "(F)V", "scaleX", "m", "p0", "H0", "scaleY", "n", "f0", "x0", "alpha", "o", AbstractC26684u0.f100690q, "M0", "translationX", "p", "v0", "N0", "translationY", "q", "q0", "I0", "shadowElevation", "r", "l0", "D0", "rotationX", "s", "m0", "E0", "rotationY", "t", "n0", "F0", "rotationZ", "u", "h0", "z0", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "v", "J", "t0", "()J", "L0", "(J)V", "transformOrigin", "Lhy5;", "w", "Lhy5;", "r0", "()Lhy5;", "J0", "(Lhy5;)V", "shape", "", "x", "Z", "i0", "()Z", "A0", "(Z)V", "clip", "Low4;", "y", "Low4;", "k0", "()Low4;", "C0", "(Low4;)V", "renderEffect", "Lpm0;", "z", "g0", "y0", "ambientShadowColor", "A", "s0", "K0", "spotShadowColor", "Landroidx/compose/ui/graphics/a;", "B", "I", "j0", "()I", "B0", "(I)V", "compositingStrategy", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "Lkotlin/ExtensionFunctionType;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lkotlin/jvm/functions/Function1;", "layerBlock", "<init>", "(FFFFFFFFFFJLhy5;ZLow4;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGraphicsLayerModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,661:1\n69#2:662\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n*L\n625#1:662\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.e */
/* loaded from: classes.dex */
public final class C11330e extends InterfaceC41563gV2.AbstractC20914c implements InterfaceC32425Dm2 {

    /* renamed from: A */
    public long f53045A;

    /* renamed from: B */
    public int f53046B;

    /* renamed from: C */
    public Function1<? super InterfaceC11328c, Unit> f53047C;

    /* renamed from: l */
    public float f53048l;

    /* renamed from: m */
    public float f53049m;

    /* renamed from: n */
    public float f53050n;

    /* renamed from: o */
    public float f53051o;

    /* renamed from: p */
    public float f53052p;

    /* renamed from: q */
    public float f53053q;

    /* renamed from: r */
    public float f53054r;

    /* renamed from: s */
    public float f53055s;

    /* renamed from: t */
    public float f53056t;

    /* renamed from: u */
    public float f53057u;

    /* renamed from: v */
    public long f53058v;

    /* renamed from: w */
    public InterfaceC42444hy5 f53059w;

    /* renamed from: x */
    public boolean f53060x;

    /* renamed from: y */
    public AbstractC46574ow4 f53061y;

    /* renamed from: z */
    public long f53062z;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Landroidx/compose/ui/graphics/c;", "", "invoke", "(Landroidx/compose/ui/graphics/c;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.e$a */
    /* loaded from: classes.dex */
    public static final class C11331a extends Lambda implements Function1<InterfaceC11328c, Unit> {
        public C11331a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC11328c interfaceC11328c) {
            invoke2(interfaceC11328c);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC11328c interfaceC11328c) {
            Intrinsics.checkNotNullParameter(interfaceC11328c, "$this$null");
            interfaceC11328c.mo68708D(C11330e.this.m68649o0());
            interfaceC11328c.mo68706E(C11330e.this.m68648p0());
            interfaceC11328c.mo68690g(C11330e.this.m68658f0());
            interfaceC11328c.mo68705G(C11330e.this.m68643u0());
            interfaceC11328c.mo68687k(C11330e.this.m68642v0());
            interfaceC11328c.mo68698T(C11330e.this.m68647q0());
            interfaceC11328c.mo68681q(C11330e.this.m68652l0());
            interfaceC11328c.mo68680r(C11330e.this.m68651m0());
            interfaceC11328c.mo68678u(C11330e.this.m68650n0());
            interfaceC11328c.mo68682p(C11330e.this.m68656h0());
            interfaceC11328c.mo68700P(C11330e.this.m68644t0());
            interfaceC11328c.mo68699S0(C11330e.this.m68646r0());
            interfaceC11328c.mo68701O(C11330e.this.m68655i0());
            interfaceC11328c.mo68686l(C11330e.this.m68653k0());
            interfaceC11328c.mo68709A0(C11330e.this.m68657g0());
            interfaceC11328c.mo68704G0(C11330e.this.m68645s0());
            interfaceC11328c.mo68685m(C11330e.this.m68654j0());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LOU3$a;", "", C17296a.f69688o, "(LOU3$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.e$b */
    /* loaded from: classes.dex */
    public static final class C11332b extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

        /* renamed from: g */
        public final /* synthetic */ OU3 f53064g;

        /* renamed from: h */
        public final /* synthetic */ C11330e f53065h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11332b(OU3 ou3, C11330e c11330e) {
            super(1);
            this.f53064g = ou3;
            this.f53065h = c11330e;
        }

        /* renamed from: a */
        public final void m68637a(OU3.AbstractC6015a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            OU3.AbstractC6015a.m92197z(layout, this.f53064g, 0, 0, 0.0f, this.f53065h.f53047C, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
            m68637a(abstractC6015a);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C11330e(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC42444hy5 interfaceC42444hy5, boolean z, AbstractC46574ow4 abstractC46574ow4, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, interfaceC42444hy5, z, abstractC46574ow4, j2, j3, i);
    }

    /* renamed from: A0 */
    public final void m68673A0(boolean z) {
        this.f53060x = z;
    }

    /* renamed from: B0 */
    public final void m68672B0(int i) {
        this.f53046B = i;
    }

    /* renamed from: C0 */
    public final void m68671C0(AbstractC46574ow4 abstractC46574ow4) {
        this.f53061y = abstractC46574ow4;
    }

    /* renamed from: D0 */
    public final void m68670D0(float f) {
        this.f53054r = f;
    }

    /* renamed from: E0 */
    public final void m68669E0(float f) {
        this.f53055s = f;
    }

    /* renamed from: F0 */
    public final void m68668F0(float f) {
        this.f53056t = f;
    }

    /* renamed from: G0 */
    public final void m68667G0(float f) {
        this.f53048l = f;
    }

    /* renamed from: H0 */
    public final void m68666H0(float f) {
        this.f53049m = f;
    }

    /* renamed from: I0 */
    public final void m68665I0(float f) {
        this.f53053q = f;
    }

    /* renamed from: J0 */
    public final void m68664J0(InterfaceC42444hy5 interfaceC42444hy5) {
        Intrinsics.checkNotNullParameter(interfaceC42444hy5, "<set-?>");
        this.f53059w = interfaceC42444hy5;
    }

    /* renamed from: K0 */
    public final void m68663K0(long j) {
        this.f53045A = j;
    }

    /* renamed from: L0 */
    public final void m68662L0(long j) {
        this.f53058v = j;
    }

    /* renamed from: M0 */
    public final void m68661M0(float f) {
        this.f53051o = f;
    }

    /* renamed from: N0 */
    public final void m68660N0(float f) {
        this.f53052p = f;
    }

    @Override // p000.InterfaceC32425Dm2
    /* renamed from: f */
    public InterfaceC52172yO2 mo21524f(InterfaceC52765zO2 measure, InterfaceC50393vO2 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        OU3 mo8763P0 = measurable.mo8763P0(j);
        return InterfaceC52765zO2.m1430Y(measure, mo8763P0.m92226i1(), mo8763P0.m92229d1(), null, new C11332b(mo8763P0, this), 4, null);
    }

    /* renamed from: f0 */
    public final float m68658f0() {
        return this.f53050n;
    }

    /* renamed from: g0 */
    public final long m68657g0() {
        return this.f53062z;
    }

    /* renamed from: h0 */
    public final float m68656h0() {
        return this.f53057u;
    }

    /* renamed from: i0 */
    public final boolean m68655i0() {
        return this.f53060x;
    }

    /* renamed from: j0 */
    public final int m68654j0() {
        return this.f53046B;
    }

    /* renamed from: k0 */
    public final AbstractC46574ow4 m68653k0() {
        return this.f53061y;
    }

    /* renamed from: l0 */
    public final float m68652l0() {
        return this.f53054r;
    }

    /* renamed from: m0 */
    public final float m68651m0() {
        return this.f53055s;
    }

    /* renamed from: n0 */
    public final float m68650n0() {
        return this.f53056t;
    }

    /* renamed from: o0 */
    public final float m68649o0() {
        return this.f53048l;
    }

    /* renamed from: p0 */
    public final float m68648p0() {
        return this.f53049m;
    }

    /* renamed from: q0 */
    public final float m68647q0() {
        return this.f53053q;
    }

    /* renamed from: r0 */
    public final InterfaceC42444hy5 m68646r0() {
        return this.f53059w;
    }

    /* renamed from: s0 */
    public final long m68645s0() {
        return this.f53045A;
    }

    /* renamed from: t0 */
    public final long m68644t0() {
        return this.f53058v;
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.f53048l + ", scaleY=" + this.f53049m + ", alpha = " + this.f53050n + ", translationX=" + this.f53051o + ", translationY=" + this.f53052p + ", shadowElevation=" + this.f53053q + ", rotationX=" + this.f53054r + ", rotationY=" + this.f53055s + ", rotationZ=" + this.f53056t + ", cameraDistance=" + this.f53057u + ", transformOrigin=" + ((Object) C11333f.m68628i(this.f53058v)) + ", shape=" + this.f53059w + ", clip=" + this.f53060x + ", renderEffect=" + this.f53061y + ", ambientShadowColor=" + ((Object) C47063pm0.m18734v(this.f53062z)) + ", spotShadowColor=" + ((Object) C47063pm0.m18734v(this.f53045A)) + ", compositingStrategy=" + ((Object) C11325a.m68718g(this.f53046B)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* renamed from: u0 */
    public final float m68643u0() {
        return this.f53051o;
    }

    /* renamed from: v0 */
    public final float m68642v0() {
        return this.f53052p;
    }

    /* renamed from: w0 */
    public final void m68641w0() {
        H83 m104310i2 = C51083wZ0.m6662g(this, K83.m99169a(2)).m104310i2();
        if (m104310i2 != null) {
            m104310i2.m104330R2(this.f53047C, true);
        }
    }

    /* renamed from: x0 */
    public final void m68640x0(float f) {
        this.f53050n = f;
    }

    /* renamed from: y0 */
    public final void m68639y0(long j) {
        this.f53062z = j;
    }

    /* renamed from: z0 */
    public final void m68638z0(float f) {
        this.f53057u = f;
    }

    public C11330e(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC42444hy5 interfaceC42444hy5, boolean z, AbstractC46574ow4 abstractC46574ow4, long j2, long j3, int i) {
        this.f53048l = f;
        this.f53049m = f2;
        this.f53050n = f3;
        this.f53051o = f4;
        this.f53052p = f5;
        this.f53053q = f6;
        this.f53054r = f7;
        this.f53055s = f8;
        this.f53056t = f9;
        this.f53057u = f10;
        this.f53058v = j;
        this.f53059w = interfaceC42444hy5;
        this.f53060x = z;
        this.f53061y = abstractC46574ow4;
        this.f53062z = j2;
        this.f53045A = j3;
        this.f53046B = i;
        this.f53047C = new C11331a();
    }
}
