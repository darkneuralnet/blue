package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C47979rJ3;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u00108\u001a\u000204¢\u0006\u0004\bP\u0010QJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J(\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J(\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J8\u0010\u0018\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J8\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001fH\u0016J%\u0010%\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\b\u0010'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J\u001d\u0010)\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\b\u0010+\u001a\u00020\u001cH\u0016J-\u00101\u001a\u0002002\u0006\u0010,\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\u00012\u0006\u0010/\u001a\u00020.H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u0002002\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u0017\u00108\u001a\u0002048\u0006¢\u0006\f\n\u0004\b\u001b\u00105\u001a\u0004\b6\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010:R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR-\u0010I\u001a\u00020C2\u0006\u0010D\u001a\u00020C8V@VX\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010N\u001a\u0002008VX\u0096\u0004¢\u0006\f\u0012\u0004\bL\u0010M\u001a\u0004\bJ\u0010KR\u0014\u0010O\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010K\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006R"}, m28432d2 = {"Lod;", "LcJ3;", "", "x", "y", "", "j", "dx", "dy", C17296a.f69688o, "k", "p", "x1", "y1", "x2", "y2", "m", "dx1", "dy1", "dx2", "dy2", DateTokenConverter.CONVERTER_KEY, "x3", "y3", "o", "dx3", "dy3", "b", "LOs4;", "rect", "h", "LWb5;", "roundRect", "g", "path", "LCe3;", "offset", "c", "(LcJ3;J)V", "close", "reset", "f", "(J)V", "getBounds", "path1", "path2", "LrJ3;", "operation", "", "i", "(LcJ3;LcJ3;I)Z", "q", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "r", "()Landroid/graphics/Path;", "internalPath", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "rectF", "", "[F", "radii", "Landroid/graphics/Matrix;", "e", "Landroid/graphics/Matrix;", "mMatrix", "LjJ3;", "value", "getFillType-Rg-k1Os", "()I", "n", "(I)V", "fillType", "l", "()Z", "isConvex$annotations", "()V", "isConvex", "isEmpty", "<init>", "(Landroid/graphics/Path;)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidPath.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,235:1\n35#2,5:236\n35#2,5:241\n*S KotlinDebug\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n*L\n172#1:236,5\n211#1:241,5\n*E\n"})
/* renamed from: od */
/* loaded from: classes.dex */
public final class C27014od implements InterfaceC39067cJ3 {

    /* renamed from: b */
    public final Path f102202b;

    /* renamed from: c */
    public final RectF f102203c;

    /* renamed from: d */
    public final float[] f102204d;

    /* renamed from: e */
    public final Matrix f102205e;

    public C27014od() {
        this(null, 1, null);
    }

    @Override // p000.InterfaceC39067cJ3
    /* renamed from: a */
    public void mo20789a(float f, float f2) {
        this.f102202b.rMoveTo(f, f2);
    }

    @Override // p000.InterfaceC39067cJ3
    /* renamed from: b */
    public void mo20788b(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f102202b.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // p000.InterfaceC39067cJ3
    /* renamed from: c */
    public void mo20787c(InterfaceC39067cJ3 path, long j) {
        Intrinsics.checkNotNullParameter(path, "path");
        Path path2 = this.f102202b;
        if (path instanceof C27014od) {
            path2.addPath(((C27014od) path).m20773r(), C32120Ce3.m111944o(j), C32120Ce3.m111943p(j));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // p000.InterfaceC39067cJ3
    public void close() {
        this.f102202b.close();
    }

    @Override // p000.InterfaceC39067cJ3
    /* renamed from: d */
    public void mo20786d(float f, float f2, float f3, float f4) {
        this.f102202b.rQuadTo(f, f2, f3, f4);
    }

    @Override // p000.InterfaceC39067cJ3
    /* renamed from: f */
    public void mo20785f(long j) {
        this.f102205e.reset();
        this.f102205e.setTranslate(C32120Ce3.m111944o(j), C32120Ce3.m111943p(j));
        this.f102202b.transform(this.f102205e);
    }

    @Override // p000.InterfaceC39067cJ3
    /* renamed from: g */
    public void mo20784g(C36775Wb5 roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "roundRect");
        this.f102203c.set(roundRect.m78155e(), roundRect.m78153g(), roundRect.m78154f(), roundRect.m78159a());
        this.f102204d[0] = LC0.m97601d(roundRect.m78152h());
        this.f102204d[1] = LC0.m97600e(roundRect.m78152h());
        this.f102204d[2] = LC0.m97601d(roundRect.m78151i());
        this.f102204d[3] = LC0.m97600e(roundRect.m78151i());
        this.f102204d[4] = LC0.m97601d(roundRect.m78157c());
        this.f102204d[5] = LC0.m97600e(roundRect.m78157c());
        this.f102204d[6] = LC0.m97601d(roundRect.m78158b());
        this.f102204d[7] = LC0.m97600e(roundRect.m78158b());
        this.f102202b.addRoundRect(this.f102203c, this.f102204d, Path.Direction.CCW);
    }

    @Override // p000.InterfaceC39067cJ3
    public C35055Os4 getBounds() {
        this.f102202b.computeBounds(this.f102203c, true);
        RectF rectF = this.f102203c;
        return new C35055Os4(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // p000.InterfaceC39067cJ3
    /* renamed from: h */
    public void mo20783h(C35055Os4 rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (m20774q(rect)) {
            this.f102203c.set(rect.m91258i(), rect.m91255l(), rect.m91257j(), rect.m91262e());
            this.f102202b.addRect(this.f102203c, Path.Direction.CCW);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // p000.InterfaceC39067cJ3
    /* renamed from: i */
    public boolean mo20782i(InterfaceC39067cJ3 path1, InterfaceC39067cJ3 path2, int i) {
        Path.Op op;
        Intrinsics.checkNotNullParameter(path1, "path1");
        Intrinsics.checkNotNullParameter(path2, "path2");
        C47979rJ3.C27899a c27899a = C47979rJ3.f106848a;
        if (C47979rJ3.m16070f(i, c27899a.m16069a())) {
            op = Path.Op.DIFFERENCE;
        } else if (C47979rJ3.m16070f(i, c27899a.m16068b())) {
            op = Path.Op.INTERSECT;
        } else if (C47979rJ3.m16070f(i, c27899a.m16067c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (C47979rJ3.m16070f(i, c27899a.m16066d())) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        Path path = this.f102202b;
        if (path1 instanceof C27014od) {
            Path m20773r = ((C27014od) path1).m20773r();
            if (path2 instanceof C27014od) {
                return path.op(m20773r, ((C27014od) path2).m20773r(), op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // p000.InterfaceC39067cJ3
    public boolean isEmpty() {
        return this.f102202b.isEmpty();
    }

    @Override // p000.InterfaceC39067cJ3
    /* renamed from: j */
    public void mo20781j(float f, float f2) {
        this.f102202b.moveTo(f, f2);
    }

    @Override // p000.InterfaceC39067cJ3
    /* renamed from: k */
    public void mo20780k(float f, float f2) {
        this.f102202b.lineTo(f, f2);
    }

    @Override // p000.InterfaceC39067cJ3
    /* renamed from: l */
    public boolean mo20779l() {
        return this.f102202b.isConvex();
    }

    @Override // p000.InterfaceC39067cJ3
    /* renamed from: m */
    public void mo20778m(float f, float f2, float f3, float f4) {
        this.f102202b.quadTo(f, f2, f3, f4);
    }

    @Override // p000.InterfaceC39067cJ3
    /* renamed from: n */
    public void mo20777n(int i) {
        Path.FillType fillType;
        Path path = this.f102202b;
        if (C43235jJ3.m30796f(i, C43235jJ3.f92533b.m30792a())) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    @Override // p000.InterfaceC39067cJ3
    /* renamed from: o */
    public void mo20776o(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f102202b.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // p000.InterfaceC39067cJ3
    /* renamed from: p */
    public void mo20775p(float f, float f2) {
        this.f102202b.rLineTo(f, f2);
    }

    /* renamed from: q */
    public final boolean m20774q(C35055Os4 c35055Os4) {
        if (!Float.isNaN(c35055Os4.m91258i())) {
            if (!Float.isNaN(c35055Os4.m91255l())) {
                if (!Float.isNaN(c35055Os4.m91257j())) {
                    if (!Float.isNaN(c35055Os4.m91262e())) {
                        return true;
                    }
                    throw new IllegalStateException("Rect.bottom is NaN".toString());
                }
                throw new IllegalStateException("Rect.right is NaN".toString());
            }
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        throw new IllegalStateException("Rect.left is NaN".toString());
    }

    /* renamed from: r */
    public final Path m20773r() {
        return this.f102202b;
    }

    @Override // p000.InterfaceC39067cJ3
    public void reset() {
        this.f102202b.reset();
    }

    public C27014od(Path internalPath) {
        Intrinsics.checkNotNullParameter(internalPath, "internalPath");
        this.f102202b = internalPath;
        this.f102203c = new RectF();
        this.f102204d = new float[8];
        this.f102205e = new Matrix();
    }

    public /* synthetic */ C27014od(Path path, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Path() : path);
    }
}
