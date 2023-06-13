package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import androidx.compose.p003ui.graphics.C11333f;
import androidx.compose.p003ui.platform.AndroidComposeView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 a2\u00020\u00012\u00020\u0002:\u0001=B1\u0012\u0006\u0010D\u001a\u00020@\u0012\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u001f09\u0012\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001f0;¢\u0006\u0004\b_\u0010`J¯\u0001\u0010 \u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\u001d\u0010+\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020*H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010)J\b\u0010,\u001a\u00020\u001fH\u0016J\u0010\u0010/\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020-H\u0016J\b\u00100\u001a\u00020\u001fH\u0016J\b\u00101\u001a\u00020\u001fH\u0016J%\u00104\u001a\u00020\"2\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J\u0018\u00108\u001a\u00020\u001f2\u0006\u00107\u001a\u0002062\u0006\u00103\u001a\u00020\u0012H\u0016J*\u0010=\u001a\u00020\u001f2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u001f092\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001f0;H\u0016J\b\u0010>\u001a\u00020\u001fH\u0002J\u0010\u0010?\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020-H\u0002R\u0017\u0010D\u001a\u00020@8\u0006¢\u0006\f\n\u0004\b=\u0010A\u001a\u0004\bB\u0010CR$\u0010:\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u001f\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010ER\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010FR$\u0010K\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\u00128\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b4\u0010H\"\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010MR\u0016\u0010O\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010HR\u0016\u0010P\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010HR\u0018\u0010S\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010RR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020U0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010VR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010YR\u001f\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b>\u0010[R\u0014\u0010^\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006b"}, m28432d2 = {"Ljx4;", "LiD3;", "", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "Lhy5;", "shape", "", "clip", "Low4;", "renderEffect", "Lpm0;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/a;", "compositingStrategy", "Lpm2;", "layoutDirection", "Lg01;", "density", "", DateTokenConverter.CONVERTER_KEY, "(FFFFFFFFFFJLhy5;ZLow4;JJILpm2;Lg01;)V", "LCe3;", "position", "g", "(J)Z", "LG52;", "size", "f", "(J)V", "LA52;", "h", "invalidate", "Lme0;", "canvas", "c", "i", "destroy", "point", "inverse", "e", "(JZ)J", "LyX2;", "rect", C17296a.f69688o, "Lkotlin/Function1;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "b", "l", "j", "Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "value", "Z", "k", "(Z)V", "isDirty", "LOz3;", "LOz3;", "outlineResolver", "isDestroyed", "drawnWithZ", "LkE3;", "LkE3;", "softwareLayerPaint", "Lhm2;", "LX21;", "Lhm2;", "matrixCache", "Lqe0;", "Lqe0;", "canvasHolder", "J", "m", "LX21;", "renderNode", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "n", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRenderNodeLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeLayer.android.kt\nandroidx/compose/ui/platform/RenderNodeLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,378:1\n1#2:379\n*E\n"})
/* renamed from: jx4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43619jx4 implements InterfaceC42588iD3 {

    /* renamed from: n */
    public static final C25051b f93602n = new C25051b(null);

    /* renamed from: o */
    public static final Function2<X21, Matrix, Unit> f93603o = C25050a.f93616g;

    /* renamed from: b */
    public final AndroidComposeView f93604b;

    /* renamed from: c */
    public Function1<? super InterfaceC45204me0, Unit> f93605c;

    /* renamed from: d */
    public Function0<Unit> f93606d;

    /* renamed from: e */
    public boolean f93607e;

    /* renamed from: f */
    public final C35117Oz3 f93608f;

    /* renamed from: g */
    public boolean f93609g;

    /* renamed from: h */
    public boolean f93610h;

    /* renamed from: i */
    public InterfaceC43783kE3 f93611i;

    /* renamed from: j */
    public final C42321hm2<X21> f93612j;

    /* renamed from: k */
    public final C47576qe0 f93613k;

    /* renamed from: l */
    public long f93614l;

    /* renamed from: m */
    public final X21 f93615m;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LX21;", "rn", "Landroid/graphics/Matrix;", "matrix", "", C17296a.f69688o, "(LX21;Landroid/graphics/Matrix;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jx4$a */
    /* loaded from: classes.dex */
    public static final class C25050a extends Lambda implements Function2<X21, Matrix, Unit> {

        /* renamed from: g */
        public static final C25050a f93616g = new C25050a();

        public C25050a() {
            super(2);
        }

        /* renamed from: a */
        public final void m29660a(X21 rn, Matrix matrix) {
            Intrinsics.checkNotNullParameter(rn, "rn");
            Intrinsics.checkNotNullParameter(matrix, "matrix");
            rn.mo15052O(matrix);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(X21 x21, Matrix matrix) {
            m29660a(x21, matrix);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Ljx4$b;", "", "Lkotlin/Function2;", "LX21;", "Landroid/graphics/Matrix;", "", "getMatrix", "Lkotlin/jvm/functions/Function2;", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: jx4$b */
    /* loaded from: classes.dex */
    public static final class C25051b {
        public /* synthetic */ C25051b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C25051b() {
        }
    }

    public C43619jx4(AndroidComposeView ownerView, Function1<? super InterfaceC45204me0, Unit> drawBlock, Function0<Unit> invalidateParentLayer) {
        X21 c48353rw4;
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        this.f93604b = ownerView;
        this.f93605c = drawBlock;
        this.f93606d = invalidateParentLayer;
        this.f93608f = new C35117Oz3(ownerView.mo30995b());
        this.f93612j = new C42321hm2<>(f93603o);
        this.f93613k = new C47576qe0();
        this.f93614l = C11333f.f53066b.m68626a();
        if (Build.VERSION.SDK_INT >= 29) {
            c48353rw4 = new C41840gx4(ownerView);
        } else {
            c48353rw4 = new C48353rw4(ownerView);
        }
        c48353rw4.mo15053N(true);
        this.f93615m = c48353rw4;
    }

    @Override // p000.InterfaceC42588iD3
    /* renamed from: a */
    public void mo29672a(C52253yX2 rect, boolean z) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (z) {
            float[] m35880a = this.f93612j.m35880a(this.f93615m);
            if (m35880a == null) {
                rect.m3366g(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            } else {
                C42084hN2.m36490g(m35880a, rect);
                return;
            }
        }
        C42084hN2.m36490g(this.f93612j.m35879b(this.f93615m), rect);
    }

    @Override // p000.InterfaceC42588iD3
    /* renamed from: b */
    public void mo29671b(Function1<? super InterfaceC45204me0, Unit> drawBlock, Function0<Unit> invalidateParentLayer) {
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        m29662k(false);
        this.f93609g = false;
        this.f93610h = false;
        this.f93614l = C11333f.f53066b.m68626a();
        this.f93605c = drawBlock;
        this.f93606d = invalidateParentLayer;
    }

    @Override // p000.InterfaceC42588iD3
    /* renamed from: c */
    public void mo29670c(InterfaceC45204me0 canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Canvas m64279c = C12455bc.m64279c(canvas);
        boolean z = false;
        if (m64279c.isHardwareAccelerated()) {
            mo29664i();
            if (this.f93615m.mo15035c0() > 0.0f) {
                z = true;
            }
            this.f93610h = z;
            if (z) {
                canvas.mo25249r();
            }
            this.f93615m.mo15059H(m64279c);
            if (this.f93610h) {
                canvas.mo25258i();
                return;
            }
            return;
        }
        float mo15021w = this.f93615m.mo15021w();
        float mo15042Y = this.f93615m.mo15042Y();
        float mo15022v = this.f93615m.mo15022v();
        float mo15050Q = this.f93615m.mo15050Q();
        if (this.f93615m.mo15030h() < 1.0f) {
            InterfaceC43783kE3 interfaceC43783kE3 = this.f93611i;
            if (interfaceC43783kE3 == null) {
                interfaceC43783kE3 = C22702hd.m36156a();
                this.f93611i = interfaceC43783kE3;
            }
            interfaceC43783kE3.mo29178g(this.f93615m.mo15030h());
            m64279c.saveLayer(mo15021w, mo15042Y, mo15022v, mo15050Q, interfaceC43783kE3.mo29174k());
        } else {
            canvas.mo25245v();
        }
        canvas.mo25265b(mo15021w, mo15042Y);
        canvas.mo25244w(this.f93612j.m35879b(this.f93615m));
        m29663j(canvas);
        Function1<? super InterfaceC45204me0, Unit> function1 = this.f93605c;
        if (function1 != null) {
            function1.invoke(canvas);
        }
        canvas.mo25251p();
        m29662k(false);
    }

    @Override // p000.InterfaceC42588iD3
    /* renamed from: d */
    public void mo29669d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC42444hy5 shape, boolean z, AbstractC46574ow4 abstractC46574ow4, long j2, long j3, int i, EnumC47065pm2 layoutDirection, InterfaceC41273g01 density) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f93614l = j;
        boolean z2 = true;
        boolean z3 = this.f93615m.mo15054M() && !this.f93608f.m91128d();
        this.f93615m.mo15062D(f);
        this.f93615m.mo15061E(f2);
        this.f93615m.mo15031g(f3);
        this.f93615m.mo15060G(f4);
        this.f93615m.mo15029k(f5);
        this.f93615m.mo15057J(f6);
        this.f93615m.mo15039a0(C50619vm0.m8173h(j2));
        this.f93615m.mo15037b0(C50619vm0.m8173h(j3));
        this.f93615m.mo15023u(f9);
        this.f93615m.mo15025q(f7);
        this.f93615m.mo15024r(f8);
        this.f93615m.mo15026p(f10);
        this.f93615m.mo15049R(C11333f.m68631f(j) * this.f93615m.getWidth());
        this.f93615m.mo15048S(C11333f.m68630g(j) * this.f93615m.getHeight());
        this.f93615m.mo15046U(z && shape != C37629Zs4.m72365a());
        this.f93615m.mo15058I(z && shape == C37629Zs4.m72365a());
        this.f93615m.mo15028l(abstractC46574ow4);
        this.f93615m.mo15027m(i);
        boolean m91125g = this.f93608f.m91125g(shape, this.f93615m.mo15030h(), this.f93615m.mo15054M(), this.f93615m.mo15035c0(), layoutDirection, density);
        this.f93615m.mo15047T(this.f93608f.m91129c());
        if (!this.f93615m.mo15054M() || this.f93608f.m91128d()) {
            z2 = false;
        }
        if (z3 == z2 && (!z2 || !m91125g)) {
            m29661l();
        } else {
            invalidate();
        }
        if (!this.f93610h && this.f93615m.mo15035c0() > 0.0f && (function0 = this.f93606d) != null) {
            function0.invoke();
        }
        this.f93612j.m35878c();
    }

    @Override // p000.InterfaceC42588iD3
    public void destroy() {
        if (this.f93615m.mo15055L()) {
            this.f93615m.mo15044W();
        }
        this.f93605c = null;
        this.f93606d = null;
        this.f93609g = true;
        m29662k(false);
        this.f93604b.m68591U0();
        this.f93604b.m68593S0(this);
    }

    @Override // p000.InterfaceC42588iD3
    /* renamed from: e */
    public long mo29668e(long j, boolean z) {
        if (z) {
            float[] m35880a = this.f93612j.m35880a(this.f93615m);
            if (m35880a != null) {
                return C42084hN2.m36491f(m35880a, j);
            }
            return C32120Ce3.f4427b.m111934a();
        }
        return C42084hN2.m36491f(this.f93612j.m35879b(this.f93615m), j);
    }

    @Override // p000.InterfaceC42588iD3
    /* renamed from: f */
    public void mo29667f(long j) {
        int m105829g = G52.m105829g(j);
        int m105830f = G52.m105830f(j);
        float f = m105829g;
        this.f93615m.mo15049R(C11333f.m68631f(this.f93614l) * f);
        float f2 = m105830f;
        this.f93615m.mo15048S(C11333f.m68630g(this.f93614l) * f2);
        X21 x21 = this.f93615m;
        if (x21.mo15045V(x21.mo15021w(), this.f93615m.mo15042Y(), this.f93615m.mo15021w() + m105829g, this.f93615m.mo15042Y() + m105830f)) {
            this.f93608f.m91124h(CB5.m112663a(f, f2));
            this.f93615m.mo15047T(this.f93608f.m91129c());
            invalidate();
            this.f93612j.m35878c();
        }
    }

    @Override // p000.InterfaceC42588iD3
    /* renamed from: g */
    public boolean mo29666g(long j) {
        float m111944o = C32120Ce3.m111944o(j);
        float m111943p = C32120Ce3.m111943p(j);
        if (this.f93615m.mo15043X()) {
            if (0.0f <= m111944o && m111944o < this.f93615m.getWidth() && 0.0f <= m111943p && m111943p < this.f93615m.getHeight()) {
                return true;
            }
            return false;
        } else if (!this.f93615m.mo15054M()) {
            return true;
        } else {
            return this.f93608f.m91127e(j);
        }
    }

    @Override // p000.InterfaceC42588iD3
    /* renamed from: h */
    public void mo29665h(long j) {
        int mo15021w = this.f93615m.mo15021w();
        int mo15042Y = this.f93615m.mo15042Y();
        int m116111j = A52.m116111j(j);
        int m116110k = A52.m116110k(j);
        if (mo15021w != m116111j || mo15042Y != m116110k) {
            this.f93615m.mo15051P(m116111j - mo15021w);
            this.f93615m.mo15056K(m116110k - mo15042Y);
            m29661l();
            this.f93612j.m35878c();
        }
    }

    @Override // p000.InterfaceC42588iD3
    /* renamed from: i */
    public void mo29664i() {
        InterfaceC39067cJ3 interfaceC39067cJ3;
        if (this.f93607e || !this.f93615m.mo15055L()) {
            m29662k(false);
            if (this.f93615m.mo15054M() && !this.f93608f.m91128d()) {
                interfaceC39067cJ3 = this.f93608f.m91130b();
            } else {
                interfaceC39067cJ3 = null;
            }
            Function1<? super InterfaceC45204me0, Unit> function1 = this.f93605c;
            if (function1 != null) {
                this.f93615m.mo15041Z(this.f93613k, interfaceC39067cJ3, function1);
            }
        }
    }

    @Override // p000.InterfaceC42588iD3
    public void invalidate() {
        if (!this.f93607e && !this.f93609g) {
            this.f93604b.invalidate();
            m29662k(true);
        }
    }

    /* renamed from: j */
    public final void m29663j(InterfaceC45204me0 interfaceC45204me0) {
        if (this.f93615m.mo15054M() || this.f93615m.mo15043X()) {
            this.f93608f.m91131a(interfaceC45204me0);
        }
    }

    /* renamed from: k */
    public final void m29662k(boolean z) {
        if (z != this.f93607e) {
            this.f93607e = z;
            this.f93604b.m68598O0(this, z);
        }
    }

    /* renamed from: l */
    public final void m29661l() {
        if (Build.VERSION.SDK_INT >= 26) {
            C39663dH6.f76404a.m44412a(this.f93604b);
        } else {
            this.f93604b.invalidate();
        }
    }
}
