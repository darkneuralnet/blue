package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.p003ui.graphics.C11325a;
import androidx.compose.p003ui.platform.AndroidComposeView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\bB\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010&\u001a\u00020!¢\u0006\u0004\b|\u0010}J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016J.\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016R\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001f\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u0010\b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00104R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00104R\u0014\u0010\n\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00104R\u0014\u00109\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00104R\u0014\u0010;\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00104R$\u0010B\u001a\u00020<2\u0006\u0010=\u001a\u00020<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010E\u001a\u00020<2\u0006\u0010=\u001a\u00020<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bC\u0010?\"\u0004\bD\u0010AR$\u0010H\u001a\u00020<2\u0006\u0010=\u001a\u00020<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bF\u0010?\"\u0004\bG\u0010AR$\u0010K\u001a\u00020<2\u0006\u0010=\u001a\u00020<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bI\u0010?\"\u0004\bJ\u0010AR$\u0010N\u001a\u00020<2\u0006\u0010=\u001a\u00020<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bL\u0010?\"\u0004\bM\u0010AR$\u0010R\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bO\u00104\"\u0004\bP\u0010QR$\u0010U\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bS\u00104\"\u0004\bT\u0010QR$\u0010X\u001a\u00020<2\u0006\u0010=\u001a\u00020<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bV\u0010?\"\u0004\bW\u0010AR$\u0010[\u001a\u00020<2\u0006\u0010=\u001a\u00020<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bY\u0010?\"\u0004\bZ\u0010AR$\u0010^\u001a\u00020<2\u0006\u0010=\u001a\u00020<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\\\u0010?\"\u0004\b]\u0010AR$\u0010a\u001a\u00020<2\u0006\u0010=\u001a\u00020<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b_\u0010?\"\u0004\b`\u0010AR$\u0010d\u001a\u00020<2\u0006\u0010=\u001a\u00020<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bb\u0010?\"\u0004\bc\u0010AR$\u0010g\u001a\u00020<2\u0006\u0010=\u001a\u00020<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\be\u0010?\"\u0004\bf\u0010AR$\u0010l\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010n\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bm\u0010i\"\u0004\b1\u0010kR$\u0010q\u001a\u00020<2\u0006\u0010=\u001a\u00020<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bo\u0010?\"\u0004\bp\u0010AR(\u0010v\u001a\u0004\u0018\u00010+2\b\u0010=\u001a\u0004\u0018\u00010+8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR-\u0010y\u001a\u00020/2\u0006\u0010=\u001a\u00020/8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\bw\u00104\"\u0004\bx\u0010QR\u0014\u0010{\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010i\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006~"}, m28432d2 = {"Lgx4;", "LX21;", "Landroid/graphics/Outline;", "outline", "", "T", "", "left", "top", "right", "bottom", "", "V", "offset", "P", "K", "Lqe0;", "canvasHolder", "LcJ3;", "clipPath", "Lkotlin/Function1;", "Lme0;", "drawBlock", "Z", "Landroid/graphics/Matrix;", "matrix", "O", "Landroid/graphics/Canvas;", "canvas", "H", "hasOverlappingRendering", "N", "W", "Landroidx/compose/ui/platform/AndroidComposeView;", C17296a.f69688o, "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroid/graphics/RenderNode;", "b", "Landroid/graphics/RenderNode;", "renderNode", "Low4;", "c", "Low4;", "internalRenderEffect", "Landroidx/compose/ui/graphics/a;", DateTokenConverter.CONVERTER_KEY, "I", "internalCompositingStrategy", "w", "()I", "Y", "v", "Q", "getWidth", "width", "getHeight", "height", "", "value", "getScaleX", "()F", "D", "(F)V", "scaleX", "getScaleY", "E", "scaleY", "getTranslationX", "G", "translationX", "getTranslationY", "k", "translationY", "c0", "J", "elevation", "getAmbientShadowColor", "a0", "(I)V", "ambientShadowColor", "getSpotShadowColor", "b0", "spotShadowColor", "getRotationZ", "u", "rotationZ", "getRotationX", "q", "rotationX", "getRotationY", "r", "rotationY", "getCameraDistance", "p", "cameraDistance", "getPivotX", "R", "pivotX", "getPivotY", "S", "pivotY", "M", "()Z", "U", "(Z)V", "clipToOutline", "X", "clipToBounds", "h", "g", "alpha", "getRenderEffect", "()Low4;", "l", "(Low4;)V", "renderEffect", "getCompositingStrategy--NrFUSI", "m", "compositingStrategy", "L", "hasDisplayList", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRenderNodeApi29.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,274:1\n47#2,5:275\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n*L\n204#1:275,5\n*E\n"})
/* renamed from: gx4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41840gx4 implements X21 {

    /* renamed from: a */
    public final AndroidComposeView f84534a;

    /* renamed from: b */
    public final RenderNode f84535b;

    /* renamed from: c */
    public AbstractC46574ow4 f84536c;

    /* renamed from: d */
    public int f84537d;

    public C41840gx4(AndroidComposeView ownerView) {
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        this.f84534a = ownerView;
        C37431Yw4.m73959a();
        this.f84535b = C37197Xw4.m76039a("Compose");
        this.f84537d = C11325a.f53022a.m68717a();
    }

    @Override // p000.X21
    /* renamed from: D */
    public void mo15062D(float f) {
        this.f84535b.setScaleX(f);
    }

    @Override // p000.X21
    /* renamed from: E */
    public void mo15061E(float f) {
        this.f84535b.setScaleY(f);
    }

    @Override // p000.X21
    /* renamed from: G */
    public void mo15060G(float f) {
        this.f84535b.setTranslationX(f);
    }

    @Override // p000.X21
    /* renamed from: H */
    public void mo15059H(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawRenderNode(this.f84535b);
    }

    @Override // p000.X21
    /* renamed from: I */
    public void mo15058I(boolean z) {
        this.f84535b.setClipToBounds(z);
    }

    @Override // p000.X21
    /* renamed from: J */
    public void mo15057J(float f) {
        this.f84535b.setElevation(f);
    }

    @Override // p000.X21
    /* renamed from: K */
    public void mo15056K(int i) {
        this.f84535b.offsetTopAndBottom(i);
    }

    @Override // p000.X21
    /* renamed from: L */
    public boolean mo15055L() {
        boolean hasDisplayList;
        hasDisplayList = this.f84535b.hasDisplayList();
        return hasDisplayList;
    }

    @Override // p000.X21
    /* renamed from: M */
    public boolean mo15054M() {
        boolean clipToOutline;
        clipToOutline = this.f84535b.getClipToOutline();
        return clipToOutline;
    }

    @Override // p000.X21
    /* renamed from: N */
    public boolean mo15053N(boolean z) {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.f84535b.setHasOverlappingRendering(z);
        return hasOverlappingRendering;
    }

    @Override // p000.X21
    /* renamed from: O */
    public void mo15052O(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f84535b.getMatrix(matrix);
    }

    @Override // p000.X21
    /* renamed from: P */
    public void mo15051P(int i) {
        this.f84535b.offsetLeftAndRight(i);
    }

    @Override // p000.X21
    /* renamed from: Q */
    public int mo15050Q() {
        int bottom;
        bottom = this.f84535b.getBottom();
        return bottom;
    }

    @Override // p000.X21
    /* renamed from: R */
    public void mo15049R(float f) {
        this.f84535b.setPivotX(f);
    }

    @Override // p000.X21
    /* renamed from: S */
    public void mo15048S(float f) {
        this.f84535b.setPivotY(f);
    }

    @Override // p000.X21
    /* renamed from: T */
    public void mo15047T(Outline outline) {
        this.f84535b.setOutline(outline);
    }

    @Override // p000.X21
    /* renamed from: U */
    public void mo15046U(boolean z) {
        this.f84535b.setClipToOutline(z);
    }

    @Override // p000.X21
    /* renamed from: V */
    public boolean mo15045V(int i, int i2, int i3, int i4) {
        boolean position;
        position = this.f84535b.setPosition(i, i2, i3, i4);
        return position;
    }

    @Override // p000.X21
    /* renamed from: W */
    public void mo15044W() {
        this.f84535b.discardDisplayList();
    }

    @Override // p000.X21
    /* renamed from: X */
    public boolean mo15043X() {
        boolean clipToBounds;
        clipToBounds = this.f84535b.getClipToBounds();
        return clipToBounds;
    }

    @Override // p000.X21
    /* renamed from: Y */
    public int mo15042Y() {
        int top;
        top = this.f84535b.getTop();
        return top;
    }

    @Override // p000.X21
    /* renamed from: Z */
    public void mo15041Z(C47576qe0 canvasHolder, InterfaceC39067cJ3 interfaceC39067cJ3, Function1<? super InterfaceC45204me0, Unit> drawBlock) {
        RecordingCanvas beginRecording;
        Intrinsics.checkNotNullParameter(canvasHolder, "canvasHolder");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        beginRecording = this.f84535b.beginRecording();
        Intrinsics.checkNotNullExpressionValue(beginRecording, "renderNode.beginRecording()");
        Canvas m71102y = canvasHolder.m17308a().m71102y();
        canvasHolder.m17308a().m71101z(beginRecording);
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
        this.f84535b.endRecording();
    }

    @Override // p000.X21
    /* renamed from: a0 */
    public void mo15039a0(int i) {
        this.f84535b.setAmbientShadowColor(i);
    }

    @Override // p000.X21
    /* renamed from: b0 */
    public void mo15037b0(int i) {
        this.f84535b.setSpotShadowColor(i);
    }

    @Override // p000.X21
    /* renamed from: c0 */
    public float mo15035c0() {
        float elevation;
        elevation = this.f84535b.getElevation();
        return elevation;
    }

    @Override // p000.X21
    /* renamed from: g */
    public void mo15031g(float f) {
        this.f84535b.setAlpha(f);
    }

    @Override // p000.X21
    public int getHeight() {
        int height;
        height = this.f84535b.getHeight();
        return height;
    }

    @Override // p000.X21
    public int getWidth() {
        int width;
        width = this.f84535b.getWidth();
        return width;
    }

    @Override // p000.X21
    /* renamed from: h */
    public float mo15030h() {
        float alpha;
        alpha = this.f84535b.getAlpha();
        return alpha;
    }

    @Override // p000.X21
    /* renamed from: k */
    public void mo15029k(float f) {
        this.f84535b.setTranslationY(f);
    }

    @Override // p000.X21
    /* renamed from: l */
    public void mo15028l(AbstractC46574ow4 abstractC46574ow4) {
        this.f84536c = abstractC46574ow4;
        if (Build.VERSION.SDK_INT >= 31) {
            C43026ix4.f91767a.m31559a(this.f84535b, abstractC46574ow4);
        }
    }

    @Override // p000.X21
    /* renamed from: m */
    public void mo15027m(int i) {
        RenderNode renderNode = this.f84535b;
        C11325a.C11326a c11326a = C11325a.f53022a;
        if (C11325a.m68720e(i, c11326a.m68715c())) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (C11325a.m68720e(i, c11326a.m68716b())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.f84537d = i;
    }

    @Override // p000.X21
    /* renamed from: p */
    public void mo15026p(float f) {
        this.f84535b.setCameraDistance(f);
    }

    @Override // p000.X21
    /* renamed from: q */
    public void mo15025q(float f) {
        this.f84535b.setRotationX(f);
    }

    @Override // p000.X21
    /* renamed from: r */
    public void mo15024r(float f) {
        this.f84535b.setRotationY(f);
    }

    @Override // p000.X21
    /* renamed from: u */
    public void mo15023u(float f) {
        this.f84535b.setRotationZ(f);
    }

    @Override // p000.X21
    /* renamed from: v */
    public int mo15022v() {
        int right;
        right = this.f84535b.getRight();
        return right;
    }

    @Override // p000.X21
    /* renamed from: w */
    public int mo15021w() {
        int left;
        left = this.f84535b.getLeft();
        return left;
    }
}
