package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.p003ui.graphics.C11325a;
import androidx.compose.p003ui.platform.AndroidComposeView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b6\b\u0001\u0018\u0000 \u0080\u00012\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010)\u001a\u00020%¢\u0006\u0004\b~\u0010\u007fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016J.\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000fH\u0016J\b\u0010$\u001a\u00020\u0002H\u0016R\u0017\u0010)\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001f\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b-\u0010.R\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u0010.\u001a\u0004\b1\u00102\"\u0004\b-\u00103R\"\u0010\f\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00102\"\u0004\b4\u00103R\"\u0010\r\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010.\u001a\u0004\b6\u00102\"\u0004\b0\u00103R\"\u0010\u000e\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b7\u0010.\u001a\u0004\b8\u00102\"\u0004\b*\u00103R$\u0010@\u001a\u0004\u0018\u0001098\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010F\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bB\u0010\u001b\u001a\u0004\bC\u0010D\"\u0004\b.\u0010ER\u0014\u0010H\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u00102R\u0014\u0010J\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u00102R$\u0010P\u001a\u00020K2\u0006\u0010A\u001a\u00020K8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010S\u001a\u00020K2\u0006\u0010A\u001a\u00020K8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR$\u0010V\u001a\u00020K2\u0006\u0010A\u001a\u00020K8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bT\u0010M\"\u0004\bU\u0010OR$\u0010Y\u001a\u00020K2\u0006\u0010A\u001a\u00020K8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bW\u0010M\"\u0004\bX\u0010OR$\u0010\\\u001a\u00020K2\u0006\u0010A\u001a\u00020K8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bZ\u0010M\"\u0004\b[\u0010OR$\u0010_\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b]\u00102\"\u0004\b^\u00103R$\u0010b\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b`\u00102\"\u0004\ba\u00103R$\u0010e\u001a\u00020K2\u0006\u0010A\u001a\u00020K8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bc\u0010M\"\u0004\bd\u0010OR$\u0010h\u001a\u00020K2\u0006\u0010A\u001a\u00020K8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bf\u0010M\"\u0004\bg\u0010OR$\u0010k\u001a\u00020K2\u0006\u0010A\u001a\u00020K8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bi\u0010M\"\u0004\bj\u0010OR$\u0010n\u001a\u00020K2\u0006\u0010A\u001a\u00020K8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bl\u0010M\"\u0004\bm\u0010OR$\u0010q\u001a\u00020K2\u0006\u0010A\u001a\u00020K8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bo\u0010M\"\u0004\bp\u0010OR$\u0010t\u001a\u00020K2\u0006\u0010A\u001a\u00020K8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\br\u0010M\"\u0004\bs\u0010OR$\u0010w\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bu\u0010D\"\u0004\bv\u0010ER$\u0010x\u001a\u00020K2\u0006\u0010A\u001a\u00020K8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b:\u0010M\"\u0004\b7\u0010OR-\u0010{\u001a\u00020,2\u0006\u0010A\u001a\u00020,8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\by\u00102\"\u0004\bz\u00103R\u0014\u0010}\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010D\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0081\u0001"}, m28432d2 = {"Lrw4;", "LX21;", "", C17296a.f69688o, "Landroid/view/RenderNode;", "renderNode", "f", "Landroid/graphics/Outline;", "outline", "T", "", "left", "top", "right", "bottom", "", "V", "offset", "P", "K", "Lqe0;", "canvasHolder", "LcJ3;", "clipPath", "Lkotlin/Function1;", "Lme0;", "drawBlock", "Z", "Landroid/graphics/Matrix;", "matrix", "O", "Landroid/graphics/Canvas;", "canvas", "H", "hasOverlappingRendering", "N", "W", "Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "b", "Landroid/view/RenderNode;", "Landroidx/compose/ui/graphics/a;", "c", "I", "internalCompositingStrategy", DateTokenConverter.CONVERTER_KEY, "w", "()I", "(I)V", "e", "Y", "v", "g", "Q", "Low4;", "h", "Low4;", "getRenderEffect", "()Low4;", "l", "(Low4;)V", "renderEffect", "value", "i", "X", "()Z", "(Z)V", "clipToBounds", "getWidth", "width", "getHeight", "height", "", "getScaleX", "()F", "D", "(F)V", "scaleX", "getScaleY", "E", "scaleY", "getTranslationX", "G", "translationX", "getTranslationY", "k", "translationY", "c0", "J", "elevation", "getAmbientShadowColor", "a0", "ambientShadowColor", "getSpotShadowColor", "b0", "spotShadowColor", "getRotationZ", "u", "rotationZ", "getRotationX", "q", "rotationX", "getRotationY", "r", "rotationY", "getCameraDistance", "p", "cameraDistance", "getPivotX", "R", "pivotX", "getPivotY", "S", "pivotY", "M", "U", "clipToOutline", "alpha", "getCompositingStrategy--NrFUSI", "m", "compositingStrategy", "L", "hasDisplayList", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "j", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRenderNodeApi23.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,417:1\n47#2,5:418\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n*L\n275#1:418,5\n*E\n"})
/* renamed from: rw4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48353rw4 implements X21 {

    /* renamed from: k */
    public static boolean f107919k;

    /* renamed from: a */
    public final AndroidComposeView f107921a;

    /* renamed from: b */
    public final RenderNode f107922b;

    /* renamed from: c */
    public int f107923c;

    /* renamed from: d */
    public int f107924d;

    /* renamed from: e */
    public int f107925e;

    /* renamed from: f */
    public int f107926f;

    /* renamed from: g */
    public int f107927g;

    /* renamed from: h */
    public AbstractC46574ow4 f107928h;

    /* renamed from: i */
    public boolean f107929i;

    /* renamed from: j */
    public static final C28066a f107918j = new C28066a(null);

    /* renamed from: l */
    public static boolean f107920l = true;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lrw4$a;", "", "", "needToValidateAccess", "Z", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: rw4$a */
    /* loaded from: classes.dex */
    public static final class C28066a {
        public /* synthetic */ C28066a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C28066a() {
        }
    }

    public C48353rw4(AndroidComposeView ownerView) {
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        this.f107921a = ownerView;
        RenderNode create = RenderNode.create("Compose", ownerView);
        Intrinsics.checkNotNullExpressionValue(create, "create(\"Compose\", ownerView)");
        this.f107922b = create;
        this.f107923c = C11325a.f53022a.m68717a();
        if (f107920l) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            m15032f(create);
            m15040a();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f107920l = false;
        }
        if (!f107919k) {
            return;
        }
        throw new NoClassDefFoundError();
    }

    @Override // p000.X21
    /* renamed from: D */
    public void mo15062D(float f) {
        this.f107922b.setScaleX(f);
    }

    @Override // p000.X21
    /* renamed from: E */
    public void mo15061E(float f) {
        this.f107922b.setScaleY(f);
    }

    @Override // p000.X21
    /* renamed from: G */
    public void mo15060G(float f) {
        this.f107922b.setTranslationX(f);
    }

    @Override // p000.X21
    /* renamed from: H */
    public void mo15059H(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f107922b);
    }

    @Override // p000.X21
    /* renamed from: I */
    public void mo15058I(boolean z) {
        this.f107929i = z;
        this.f107922b.setClipToBounds(z);
    }

    @Override // p000.X21
    /* renamed from: J */
    public void mo15057J(float f) {
        this.f107922b.setElevation(f);
    }

    @Override // p000.X21
    /* renamed from: K */
    public void mo15056K(int i) {
        m15033e(mo15042Y() + i);
        m15038b(mo15050Q() + i);
        this.f107922b.offsetTopAndBottom(i);
    }

    @Override // p000.X21
    /* renamed from: L */
    public boolean mo15055L() {
        return this.f107922b.isValid();
    }

    @Override // p000.X21
    /* renamed from: M */
    public boolean mo15054M() {
        return this.f107922b.getClipToOutline();
    }

    @Override // p000.X21
    /* renamed from: N */
    public boolean mo15053N(boolean z) {
        return this.f107922b.setHasOverlappingRendering(z);
    }

    @Override // p000.X21
    /* renamed from: O */
    public void mo15052O(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f107922b.getMatrix(matrix);
    }

    @Override // p000.X21
    /* renamed from: P */
    public void mo15051P(int i) {
        m15036c(mo15021w() + i);
        m15034d(mo15022v() + i);
        this.f107922b.offsetLeftAndRight(i);
    }

    @Override // p000.X21
    /* renamed from: Q */
    public int mo15050Q() {
        return this.f107927g;
    }

    @Override // p000.X21
    /* renamed from: R */
    public void mo15049R(float f) {
        this.f107922b.setPivotX(f);
    }

    @Override // p000.X21
    /* renamed from: S */
    public void mo15048S(float f) {
        this.f107922b.setPivotY(f);
    }

    @Override // p000.X21
    /* renamed from: T */
    public void mo15047T(Outline outline) {
        this.f107922b.setOutline(outline);
    }

    @Override // p000.X21
    /* renamed from: U */
    public void mo15046U(boolean z) {
        this.f107922b.setClipToOutline(z);
    }

    @Override // p000.X21
    /* renamed from: V */
    public boolean mo15045V(int i, int i2, int i3, int i4) {
        m15036c(i);
        m15033e(i2);
        m15034d(i3);
        m15038b(i4);
        return this.f107922b.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p000.X21
    /* renamed from: W */
    public void mo15044W() {
        m15040a();
    }

    @Override // p000.X21
    /* renamed from: X */
    public boolean mo15043X() {
        return this.f107929i;
    }

    @Override // p000.X21
    /* renamed from: Y */
    public int mo15042Y() {
        return this.f107925e;
    }

    @Override // p000.X21
    /* renamed from: Z */
    public void mo15041Z(C47576qe0 canvasHolder, InterfaceC39067cJ3 interfaceC39067cJ3, Function1<? super InterfaceC45204me0, Unit> drawBlock) {
        Intrinsics.checkNotNullParameter(canvasHolder, "canvasHolder");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        DisplayListCanvas start = this.f107922b.start(getWidth(), getHeight());
        Intrinsics.checkNotNullExpressionValue(start, "renderNode.start(width, height)");
        Canvas m71102y = canvasHolder.m17308a().m71102y();
        canvasHolder.m17308a().m71101z((Canvas) start);
        C10761ac m17308a = canvasHolder.m17308a();
        if (interfaceC39067cJ3 != null) {
            m17308a.mo25245v();
            InterfaceC45204me0.m25261f(m17308a, interfaceC39067cJ3, 0, 2, null);
        }
        drawBlock.invoke(m17308a);
        if (interfaceC39067cJ3 != null) {
            m17308a.mo25251p();
        }
        canvasHolder.m17308a().m71101z(m71102y);
        this.f107922b.end(start);
    }

    /* renamed from: a */
    public final void m15040a() {
        C44212kx4.f95287a.m28094a(this.f107922b);
    }

    @Override // p000.X21
    /* renamed from: a0 */
    public void mo15039a0(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            C44805lx4.f97005a.m26601c(this.f107922b, i);
        }
    }

    /* renamed from: b */
    public void m15038b(int i) {
        this.f107927g = i;
    }

    @Override // p000.X21
    /* renamed from: b0 */
    public void mo15037b0(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            C44805lx4.f97005a.m26600d(this.f107922b, i);
        }
    }

    /* renamed from: c */
    public void m15036c(int i) {
        this.f107924d = i;
    }

    @Override // p000.X21
    /* renamed from: c0 */
    public float mo15035c0() {
        return this.f107922b.getElevation();
    }

    /* renamed from: d */
    public void m15034d(int i) {
        this.f107926f = i;
    }

    /* renamed from: e */
    public void m15033e(int i) {
        this.f107925e = i;
    }

    /* renamed from: f */
    public final void m15032f(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            C44805lx4 c44805lx4 = C44805lx4.f97005a;
            c44805lx4.m26601c(renderNode, c44805lx4.m26603a(renderNode));
            c44805lx4.m26600d(renderNode, c44805lx4.m26602b(renderNode));
        }
    }

    @Override // p000.X21
    /* renamed from: g */
    public void mo15031g(float f) {
        this.f107922b.setAlpha(f);
    }

    @Override // p000.X21
    public int getHeight() {
        return mo15050Q() - mo15042Y();
    }

    @Override // p000.X21
    public int getWidth() {
        return mo15022v() - mo15021w();
    }

    @Override // p000.X21
    /* renamed from: h */
    public float mo15030h() {
        return this.f107922b.getAlpha();
    }

    @Override // p000.X21
    /* renamed from: k */
    public void mo15029k(float f) {
        this.f107922b.setTranslationY(f);
    }

    @Override // p000.X21
    /* renamed from: l */
    public void mo15028l(AbstractC46574ow4 abstractC46574ow4) {
        this.f107928h = abstractC46574ow4;
    }

    @Override // p000.X21
    /* renamed from: m */
    public void mo15027m(int i) {
        C11325a.C11326a c11326a = C11325a.f53022a;
        if (C11325a.m68720e(i, c11326a.m68715c())) {
            this.f107922b.setLayerType(2);
            this.f107922b.setHasOverlappingRendering(true);
        } else if (C11325a.m68720e(i, c11326a.m68716b())) {
            this.f107922b.setLayerType(0);
            this.f107922b.setHasOverlappingRendering(false);
        } else {
            this.f107922b.setLayerType(0);
            this.f107922b.setHasOverlappingRendering(true);
        }
        this.f107923c = i;
    }

    @Override // p000.X21
    /* renamed from: p */
    public void mo15026p(float f) {
        this.f107922b.setCameraDistance(-f);
    }

    @Override // p000.X21
    /* renamed from: q */
    public void mo15025q(float f) {
        this.f107922b.setRotationX(f);
    }

    @Override // p000.X21
    /* renamed from: r */
    public void mo15024r(float f) {
        this.f107922b.setRotationY(f);
    }

    @Override // p000.X21
    /* renamed from: u */
    public void mo15023u(float f) {
        this.f107922b.setRotation(f);
    }

    @Override // p000.X21
    /* renamed from: v */
    public int mo15022v() {
        return this.f107926f;
    }

    @Override // p000.X21
    /* renamed from: w */
    public int mo15021w() {
        return this.f107924d;
    }
}
