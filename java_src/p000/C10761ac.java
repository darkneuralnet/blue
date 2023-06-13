package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bV\u0010PJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u001d\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#*\u00020\u001bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J-\u0010)\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J0\u0010+\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J@\u0010.\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J-\u00101\u001a\u00020\u00022\u0006\u0010/\u001a\u00020&2\u0006\u00100\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102JH\u00107\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u00104\u001a\u00020\n2\u0006\u00106\u001a\u0002052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u00108\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u0007H\u0016J-\u0010<\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=JE\u0010D\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020>2\u0006\u0010C\u001a\u00020@2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010EJ\b\u0010F\u001a\u00020\u0002H\u0016J\b\u0010G\u001a\u00020\u0002H\u0016R,\u0010Q\u001a\u00060Hj\u0002`I8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010J\u0012\u0004\bO\u0010P\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0014\u0010T\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010SR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010S\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006W"}, m28432d2 = {"Lac;", "Lme0;", "", "v", "p", "LOs4;", "bounds", "LkE3;", "paint", "x", "", "dx", "dy", "b", "sx", "sy", "l", "degrees", "u", "LhN2;", "matrix", "w", "([F)V", "left", "top", "right", "bottom", "LRk0;", "clipOp", C17296a.f69688o, "(FFFFI)V", "LcJ3;", "path", "c", "(LcJ3;I)V", "Landroid/graphics/Region$Op;", "A", "(I)Landroid/graphics/Region$Op;", "LCe3;", "p1", "p2", "g", "(JJLkE3;)V", "k", "radiusX", "radiusY", "h", "center", "radius", "j", "(JFLkE3;)V", "startAngle", "sweepAngle", "", "useCenter", "o", "t", "LMW1;", Entry.TYPE_IMAGE, "topLeftOffset", "q", "(LMW1;JLkE3;)V", "LA52;", "srcOffset", "LG52;", "srcSize", "dstOffset", "dstSize", DateTokenConverter.CONVERTER_KEY, "(LMW1;JJJJLkE3;)V", "r", "i", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "Landroid/graphics/Canvas;", "y", "()Landroid/graphics/Canvas;", "z", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "()V", "internalCanvas", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "srcRect", "dstRect", "<init>", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
@SourceDebugExtension({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,428:1\n35#2,5:429\n35#2,5:434\n33#3,6:439\n*S KotlinDebug\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n*L\n154#1:429,5\n242#1:434,5\n315#1:439,6\n*E\n"})
/* renamed from: ac */
/* loaded from: classes.dex */
public final class C10761ac implements InterfaceC45204me0 {

    /* renamed from: a */
    public Canvas f50708a;

    /* renamed from: b */
    public final Rect f50709b;

    /* renamed from: c */
    public final Rect f50710c;

    public C10761ac() {
        Canvas canvas;
        canvas = C12455bc.f57749a;
        this.f50708a = canvas;
        this.f50709b = new Rect();
        this.f50710c = new Rect();
    }

    /* renamed from: A */
    public final Region.Op m71103A(int i) {
        if (C35681Rk0.m86406d(i, C35681Rk0.f32493a.m86405a())) {
            return Region.Op.DIFFERENCE;
        }
        return Region.Op.INTERSECT;
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: a */
    public void mo25266a(float f, float f2, float f3, float f4, int i) {
        this.f50708a.clipRect(f, f2, f3, f4, m71103A(i));
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: b */
    public void mo25265b(float f, float f2) {
        this.f50708a.translate(f, f2);
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: c */
    public void mo25264c(InterfaceC39067cJ3 path, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        Canvas canvas = this.f50708a;
        if (path instanceof C27014od) {
            canvas.clipPath(((C27014od) path).m20773r(), m71103A(i));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: d */
    public void mo25263d(MW1 image, long j, long j2, long j3, long j4, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f50708a;
        Bitmap m88363b = C6809Qc.m88363b(image);
        Rect rect = this.f50709b;
        rect.left = A52.m116111j(j);
        rect.top = A52.m116110k(j);
        rect.right = A52.m116111j(j) + G52.m105829g(j2);
        rect.bottom = A52.m116110k(j) + G52.m105830f(j2);
        Unit unit = Unit.INSTANCE;
        Rect rect2 = this.f50710c;
        rect2.left = A52.m116111j(j3);
        rect2.top = A52.m116110k(j3);
        rect2.right = A52.m116111j(j3) + G52.m105829g(j4);
        rect2.bottom = A52.m116110k(j3) + G52.m105830f(j4);
        canvas.drawBitmap(m88363b, rect, rect2, paint.mo29174k());
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: g */
    public void mo25260g(long j, long j2, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f50708a.drawLine(C32120Ce3.m111944o(j), C32120Ce3.m111943p(j), C32120Ce3.m111944o(j2), C32120Ce3.m111943p(j2), paint.mo29174k());
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: h */
    public void mo25259h(float f, float f2, float f3, float f4, float f5, float f6, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f50708a.drawRoundRect(f, f2, f3, f4, f5, f6, paint.mo29174k());
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: i */
    public void mo25258i() {
        C49947ue0.f112691a.m9929a(this.f50708a, false);
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: j */
    public void mo25257j(long j, float f, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f50708a.drawCircle(C32120Ce3.m111944o(j), C32120Ce3.m111943p(j), f, paint.mo29174k());
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: k */
    public void mo25256k(float f, float f2, float f3, float f4, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f50708a.drawRect(f, f2, f3, f4, paint.mo29174k());
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: l */
    public void mo25255l(float f, float f2) {
        this.f50708a.scale(f, f2);
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: o */
    public void mo25252o(float f, float f2, float f3, float f4, float f5, float f6, boolean z, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f50708a.drawArc(f, f2, f3, f4, f5, f6, z, paint.mo29174k());
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: p */
    public void mo25251p() {
        this.f50708a.restore();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: q */
    public void mo25250q(MW1 image, long j, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f50708a.drawBitmap(C6809Qc.m88363b(image), C32120Ce3.m111944o(j), C32120Ce3.m111943p(j), paint.mo29174k());
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: r */
    public void mo25249r() {
        C49947ue0.f112691a.m9929a(this.f50708a, true);
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: t */
    public void mo25247t(InterfaceC39067cJ3 path, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f50708a;
        if (path instanceof C27014od) {
            canvas.drawPath(((C27014od) path).m20773r(), paint.mo29174k());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: u */
    public void mo25246u(float f) {
        this.f50708a.rotate(f);
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: v */
    public void mo25245v() {
        this.f50708a.save();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: w */
    public void mo25244w(float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (!C46235oN2.m21250a(matrix)) {
            Matrix matrix2 = new Matrix();
            C12456bd.m64271a(matrix2, matrix);
            this.f50708a.concat(matrix2);
        }
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: x */
    public void mo25243x(C35055Os4 bounds, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f50708a.saveLayer(bounds.m91258i(), bounds.m91255l(), bounds.m91257j(), bounds.m91262e(), paint.mo29174k(), 31);
    }

    /* renamed from: y */
    public final Canvas m71102y() {
        return this.f50708a;
    }

    /* renamed from: z */
    public final void m71101z(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "<set-?>");
        this.f50708a = canvas;
    }
}
