package androidx.compose.p003ui.graphics;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0094\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u000e\u0012\u0006\u0010\"\u001a\u00020\u000e\u0012\u0006\u0010$\u001a\u00020\u000e\u0012\u0006\u0010'\u001a\u00020\u000e\u0012\u0006\u0010)\u001a\u00020\u000e\u0012\u0006\u0010,\u001a\u00020\u000e\u0012\u0006\u00102\u001a\u00020-\u0012\u0006\u00108\u001a\u000203\u0012\u0006\u0010=\u001a\u00020\f\u0012\b\u0010C\u001a\u0004\u0018\u00010>\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010J\u001a\u00020D\u0012\u0006\u0010P\u001a\u00020Kø\u0001\u0000¢\u0006\u0004\bQ\u0010RJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u001c\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u001f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\"\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\u0012R\u0017\u0010$\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b#\u0010\u0012R\u0017\u0010'\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b%\u0010\u0010\u001a\u0004\b&\u0010\u0012R\u0017\u0010)\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b(\u0010\u0012R\u0017\u0010,\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010\u0010\u001a\u0004\b+\u0010\u0012R \u00102\u001a\u00020-8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00108\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010=\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010C\u001a\u0004\u0018\u00010>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010G\u001a\u00020D8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bE\u0010/\u001a\u0004\bF\u00101R \u0010J\u001a\u00020D8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bH\u0010/\u001a\u0004\bI\u00101R \u0010P\u001a\u00020K8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, m28432d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerModifierNodeElement;", "LrV2;", "Landroidx/compose/ui/graphics/e;", "h", "node", "j", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "b", "F", "getScaleX", "()F", "scaleX", "c", "getScaleY", "scaleY", DateTokenConverter.CONVERTER_KEY, "getAlpha", "alpha", "e", "getTranslationX", "translationX", "f", "getTranslationY", "translationY", "g", "getShadowElevation", "shadowElevation", "getRotationX", "rotationX", "i", "getRotationY", "rotationY", "getRotationZ", "rotationZ", "k", "getCameraDistance", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "l", "J", "getTransformOrigin-SzJe1aQ", "()J", "transformOrigin", "Lhy5;", "m", "Lhy5;", "getShape", "()Lhy5;", "shape", "n", "Z", "getClip", "()Z", "clip", "Low4;", "o", "Low4;", "getRenderEffect", "()Low4;", "renderEffect", "Lpm0;", "p", "getAmbientShadowColor-0d7_KjU", "ambientShadowColor", "q", "getSpotShadowColor-0d7_KjU", "spotShadowColor", "Landroidx/compose/ui/graphics/a;", "r", "I", "getCompositingStrategy--NrFUSI", "()I", "compositingStrategy", "<init>", "(FFFFFFFFFFJLhy5;ZLow4;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.GraphicsLayerModifierNodeElement */
/* loaded from: classes.dex */
final class GraphicsLayerModifierNodeElement extends AbstractC48086rV2<C11330e> {

    /* renamed from: b */
    public final float f53005b;

    /* renamed from: c */
    public final float f53006c;

    /* renamed from: d */
    public final float f53007d;

    /* renamed from: e */
    public final float f53008e;

    /* renamed from: f */
    public final float f53009f;

    /* renamed from: g */
    public final float f53010g;

    /* renamed from: h */
    public final float f53011h;

    /* renamed from: i */
    public final float f53012i;

    /* renamed from: j */
    public final float f53013j;

    /* renamed from: k */
    public final float f53014k;

    /* renamed from: l */
    public final long f53015l;

    /* renamed from: m */
    public final InterfaceC42444hy5 f53016m;

    /* renamed from: n */
    public final boolean f53017n;

    /* renamed from: o */
    public final AbstractC46574ow4 f53018o;

    /* renamed from: p */
    public final long f53019p;

    /* renamed from: q */
    public final long f53020q;

    /* renamed from: r */
    public final int f53021r;

    public /* synthetic */ GraphicsLayerModifierNodeElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC42444hy5 interfaceC42444hy5, boolean z, AbstractC46574ow4 abstractC46574ow4, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, interfaceC42444hy5, z, abstractC46574ow4, j2, j3, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GraphicsLayerModifierNodeElement) {
            GraphicsLayerModifierNodeElement graphicsLayerModifierNodeElement = (GraphicsLayerModifierNodeElement) obj;
            return Float.compare(this.f53005b, graphicsLayerModifierNodeElement.f53005b) == 0 && Float.compare(this.f53006c, graphicsLayerModifierNodeElement.f53006c) == 0 && Float.compare(this.f53007d, graphicsLayerModifierNodeElement.f53007d) == 0 && Float.compare(this.f53008e, graphicsLayerModifierNodeElement.f53008e) == 0 && Float.compare(this.f53009f, graphicsLayerModifierNodeElement.f53009f) == 0 && Float.compare(this.f53010g, graphicsLayerModifierNodeElement.f53010g) == 0 && Float.compare(this.f53011h, graphicsLayerModifierNodeElement.f53011h) == 0 && Float.compare(this.f53012i, graphicsLayerModifierNodeElement.f53012i) == 0 && Float.compare(this.f53013j, graphicsLayerModifierNodeElement.f53013j) == 0 && Float.compare(this.f53014k, graphicsLayerModifierNodeElement.f53014k) == 0 && C11333f.m68632e(this.f53015l, graphicsLayerModifierNodeElement.f53015l) && Intrinsics.areEqual(this.f53016m, graphicsLayerModifierNodeElement.f53016m) && this.f53017n == graphicsLayerModifierNodeElement.f53017n && Intrinsics.areEqual(this.f53018o, graphicsLayerModifierNodeElement.f53018o) && C47063pm0.m18741o(this.f53019p, graphicsLayerModifierNodeElement.f53019p) && C47063pm0.m18741o(this.f53020q, graphicsLayerModifierNodeElement.f53020q) && C11325a.m68720e(this.f53021r, graphicsLayerModifierNodeElement.f53021r);
        }
        return false;
    }

    @Override // p000.AbstractC48086rV2
    /* renamed from: h */
    public C11330e mo15844a() {
        return new C11330e(this.f53005b, this.f53006c, this.f53007d, this.f53008e, this.f53009f, this.f53010g, this.f53011h, this.f53012i, this.f53013j, this.f53014k, this.f53015l, this.f53016m, this.f53017n, this.f53018o, this.f53019p, this.f53020q, this.f53021r, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((Float.hashCode(this.f53005b) * 31) + Float.hashCode(this.f53006c)) * 31) + Float.hashCode(this.f53007d)) * 31) + Float.hashCode(this.f53008e)) * 31) + Float.hashCode(this.f53009f)) * 31) + Float.hashCode(this.f53010g)) * 31) + Float.hashCode(this.f53011h)) * 31) + Float.hashCode(this.f53012i)) * 31) + Float.hashCode(this.f53013j)) * 31) + Float.hashCode(this.f53014k)) * 31) + C11333f.m68629h(this.f53015l)) * 31) + this.f53016m.hashCode()) * 31;
        boolean z = this.f53017n;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        AbstractC46574ow4 abstractC46574ow4 = this.f53018o;
        return ((((((i2 + (abstractC46574ow4 == null ? 0 : abstractC46574ow4.hashCode())) * 31) + C47063pm0.m18735u(this.f53019p)) * 31) + C47063pm0.m18735u(this.f53020q)) * 31) + C11325a.m68719f(this.f53021r);
    }

    @Override // p000.AbstractC48086rV2
    /* renamed from: j */
    public C11330e mo15842g(C11330e node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.m68667G0(this.f53005b);
        node.m68666H0(this.f53006c);
        node.m68640x0(this.f53007d);
        node.m68661M0(this.f53008e);
        node.m68660N0(this.f53009f);
        node.m68665I0(this.f53010g);
        node.m68670D0(this.f53011h);
        node.m68669E0(this.f53012i);
        node.m68668F0(this.f53013j);
        node.m68638z0(this.f53014k);
        node.m68662L0(this.f53015l);
        node.m68664J0(this.f53016m);
        node.m68673A0(this.f53017n);
        node.m68671C0(this.f53018o);
        node.m68639y0(this.f53019p);
        node.m68663K0(this.f53020q);
        node.m68672B0(this.f53021r);
        node.m68641w0();
        return node;
    }

    public String toString() {
        return "GraphicsLayerModifierNodeElement(scaleX=" + this.f53005b + ", scaleY=" + this.f53006c + ", alpha=" + this.f53007d + ", translationX=" + this.f53008e + ", translationY=" + this.f53009f + ", shadowElevation=" + this.f53010g + ", rotationX=" + this.f53011h + ", rotationY=" + this.f53012i + ", rotationZ=" + this.f53013j + ", cameraDistance=" + this.f53014k + ", transformOrigin=" + ((Object) C11333f.m68628i(this.f53015l)) + ", shape=" + this.f53016m + ", clip=" + this.f53017n + ", renderEffect=" + this.f53018o + ", ambientShadowColor=" + ((Object) C47063pm0.m18734v(this.f53019p)) + ", spotShadowColor=" + ((Object) C47063pm0.m18734v(this.f53020q)) + ", compositingStrategy=" + ((Object) C11325a.m68718g(this.f53021r)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public GraphicsLayerModifierNodeElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC42444hy5 interfaceC42444hy5, boolean z, AbstractC46574ow4 abstractC46574ow4, long j2, long j3, int i) {
        this.f53005b = f;
        this.f53006c = f2;
        this.f53007d = f3;
        this.f53008e = f4;
        this.f53009f = f5;
        this.f53010g = f6;
        this.f53011h = f7;
        this.f53012i = f8;
        this.f53013j = f9;
        this.f53014k = f10;
        this.f53015l = j;
        this.f53016m = interfaceC42444hy5;
        this.f53017n = z;
        this.f53018o = abstractC46574ow4;
        this.f53019p = j2;
        this.f53020q = j3;
        this.f53021r = i;
    }
}
