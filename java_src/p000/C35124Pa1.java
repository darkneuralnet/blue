package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bE\u0010FJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u001d\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J-\u0010&\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J0\u0010(\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J@\u0010+\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J-\u0010.\u001a\u00020\u00022\u0006\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/JH\u00104\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u00103\u001a\u0002022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u00105\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u0007H\u0016J-\u00109\u001a\u00020\u00022\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020#2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:JE\u0010A\u001a\u00020\u00022\u0006\u00107\u001a\u0002062\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020;2\u0006\u0010@\u001a\u00020=2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bA\u0010BJ\b\u0010C\u001a\u00020\u0002H\u0016J\b\u0010D\u001a\u00020\u0002H\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006G"}, m28432d2 = {"LPa1;", "Lme0;", "", "v", "p", "LOs4;", "bounds", "LkE3;", "paint", "x", "", "dx", "dy", "b", "sx", "sy", "l", "degrees", "u", "LhN2;", "matrix", "w", "([F)V", "left", "top", "right", "bottom", "LRk0;", "clipOp", C17296a.f69688o, "(FFFFI)V", "LcJ3;", "path", "c", "(LcJ3;I)V", "LCe3;", "p1", "p2", "g", "(JJLkE3;)V", "k", "radiusX", "radiusY", "h", "center", "radius", "j", "(JFLkE3;)V", "startAngle", "sweepAngle", "", "useCenter", "o", "t", "LMW1;", Entry.TYPE_IMAGE, "topLeftOffset", "q", "(LMW1;JLkE3;)V", "LA52;", "srcOffset", "LG52;", "srcSize", "dstOffset", "dstSize", DateTokenConverter.CONVERTER_KEY, "(LMW1;JJJJLkE3;)V", "r", "i", "<init>", "()V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Pa1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35124Pa1 implements InterfaceC45204me0 {
    @Override // p000.InterfaceC45204me0
    /* renamed from: a */
    public void mo25266a(float f, float f2, float f3, float f4, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: b */
    public void mo25265b(float f, float f2) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: c */
    public void mo25264c(InterfaceC39067cJ3 path, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: d */
    public void mo25263d(MW1 image, long j, long j2, long j3, long j4, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: g */
    public void mo25260g(long j, long j2, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: h */
    public void mo25259h(float f, float f2, float f3, float f4, float f5, float f6, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: i */
    public void mo25258i() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: j */
    public void mo25257j(long j, float f, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: k */
    public void mo25256k(float f, float f2, float f3, float f4, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: l */
    public void mo25255l(float f, float f2) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: o */
    public void mo25252o(float f, float f2, float f3, float f4, float f5, float f6, boolean z, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: p */
    public void mo25251p() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: q */
    public void mo25250q(MW1 image, long j, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: r */
    public void mo25249r() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: t */
    public void mo25247t(InterfaceC39067cJ3 path, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: u */
    public void mo25246u(float f) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: v */
    public void mo25245v() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: w */
    public void mo25244w(float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC45204me0
    /* renamed from: x */
    public void mo25243x(C35055Os4 bounds, InterfaceC43783kE3 paint) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(paint, "paint");
        throw new UnsupportedOperationException();
    }
}
