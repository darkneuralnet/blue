package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H&J.\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0014H&J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH&J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH&J\b\u0010 \u001a\u00020\u0004H&R\u0014\u0010\u0007\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0014\u0010\n\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u0014\u0010'\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\"R\u0014\u0010)\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\"R\u001c\u0010/\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u00102\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\u001c\u00105\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R\u001c\u00108\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.R\u001c\u0010;\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\u001c\u0010?\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b<\u0010\"\"\u0004\b=\u0010>R\u001c\u0010B\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b@\u0010\"\"\u0004\bA\u0010>R\u001c\u0010E\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\bC\u0010,\"\u0004\bD\u0010.R\u001c\u0010H\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\bF\u0010,\"\u0004\bG\u0010.R\u001c\u0010K\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\bI\u0010,\"\u0004\bJ\u0010.R\u001c\u0010N\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\bL\u0010,\"\u0004\bM\u0010.R\u001c\u0010Q\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\bO\u0010,\"\u0004\bP\u0010.R\u001c\u0010T\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\bR\u0010,\"\u0004\bS\u0010.R\u001c\u0010Y\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001c\u0010\\\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bZ\u0010V\"\u0004\b[\u0010XR\u001c\u0010_\u001a\u00020*8&@&X¦\u000e¢\u0006\f\u001a\u0004\b]\u0010,\"\u0004\b^\u0010.R\u001e\u0010e\u001a\u0004\u0018\u00010`8&@&X¦\u000e¢\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0014\u0010g\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010VR%\u0010k\u001a\u00020h8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\bi\u0010\"\"\u0004\bj\u0010>ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006lÀ\u0006\u0001"}, m28432d2 = {"LX21;", "", "Landroid/graphics/Outline;", "outline", "", "T", "", "left", "top", "right", "bottom", "", "V", "offset", "P", "K", "Lqe0;", "canvasHolder", "LcJ3;", "clipPath", "Lkotlin/Function1;", "Lme0;", "drawBlock", "Z", "Landroid/graphics/Matrix;", "matrix", "O", "Landroid/graphics/Canvas;", "canvas", "H", "hasOverlappingRendering", "N", "W", "w", "()I", "Y", "v", "Q", "getWidth", "width", "getHeight", "height", "", "getScaleX", "()F", "D", "(F)V", "scaleX", "getScaleY", "E", "scaleY", "getTranslationX", "G", "translationX", "getTranslationY", "k", "translationY", "c0", "J", "elevation", "getAmbientShadowColor", "a0", "(I)V", "ambientShadowColor", "getSpotShadowColor", "b0", "spotShadowColor", "getRotationZ", "u", "rotationZ", "getRotationX", "q", "rotationX", "getRotationY", "r", "rotationY", "getCameraDistance", "p", "cameraDistance", "getPivotX", "R", "pivotX", "getPivotY", "S", "pivotY", "M", "()Z", "U", "(Z)V", "clipToOutline", "X", "I", "clipToBounds", "h", "g", "alpha", "Low4;", "getRenderEffect", "()Low4;", "l", "(Low4;)V", "renderEffect", "L", "hasDisplayList", "Landroidx/compose/ui/graphics/a;", "getCompositingStrategy--NrFUSI", "m", "compositingStrategy", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: X21 */
/* loaded from: classes.dex */
public interface X21 {
    /* renamed from: D */
    void mo15062D(float f);

    /* renamed from: E */
    void mo15061E(float f);

    /* renamed from: G */
    void mo15060G(float f);

    /* renamed from: H */
    void mo15059H(Canvas canvas);

    /* renamed from: I */
    void mo15058I(boolean z);

    /* renamed from: J */
    void mo15057J(float f);

    /* renamed from: K */
    void mo15056K(int i);

    /* renamed from: L */
    boolean mo15055L();

    /* renamed from: M */
    boolean mo15054M();

    /* renamed from: N */
    boolean mo15053N(boolean z);

    /* renamed from: O */
    void mo15052O(Matrix matrix);

    /* renamed from: P */
    void mo15051P(int i);

    /* renamed from: Q */
    int mo15050Q();

    /* renamed from: R */
    void mo15049R(float f);

    /* renamed from: S */
    void mo15048S(float f);

    /* renamed from: T */
    void mo15047T(Outline outline);

    /* renamed from: U */
    void mo15046U(boolean z);

    /* renamed from: V */
    boolean mo15045V(int i, int i2, int i3, int i4);

    /* renamed from: W */
    void mo15044W();

    /* renamed from: X */
    boolean mo15043X();

    /* renamed from: Y */
    int mo15042Y();

    /* renamed from: Z */
    void mo15041Z(C47576qe0 c47576qe0, InterfaceC39067cJ3 interfaceC39067cJ3, Function1<? super InterfaceC45204me0, Unit> function1);

    /* renamed from: a0 */
    void mo15039a0(int i);

    /* renamed from: b0 */
    void mo15037b0(int i);

    /* renamed from: c0 */
    float mo15035c0();

    /* renamed from: g */
    void mo15031g(float f);

    int getHeight();

    int getWidth();

    /* renamed from: h */
    float mo15030h();

    /* renamed from: k */
    void mo15029k(float f);

    /* renamed from: l */
    void mo15028l(AbstractC46574ow4 abstractC46574ow4);

    /* renamed from: m */
    void mo15027m(int i);

    /* renamed from: p */
    void mo15026p(float f);

    /* renamed from: q */
    void mo15025q(float f);

    /* renamed from: r */
    void mo15024r(float f);

    /* renamed from: u */
    void mo15023u(float f);

    /* renamed from: v */
    int mo15022v();

    /* renamed from: w */
    int mo15021w();
}
