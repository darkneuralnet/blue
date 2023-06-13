package p000;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\bJ!\u0010\f\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u001d\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u0016\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001a"}, m28432d2 = {"Lm80;", "Ll80;", "Landroid/view/View;", "view", "LhN2;", "matrix", "", C17296a.f69688o, "(Landroid/view/View;[F)V", DateTokenConverter.CONVERTER_KEY, "Landroid/graphics/Matrix;", LegacyRepairType.OTHER_KEY, "b", "([FLandroid/graphics/Matrix;)V", "", "x", "y", "c", "([FFF)V", "", "[I", "tmpLocation", "[F", "tmpMatrix", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: m80  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44910m80 implements InterfaceC44317l80 {

    /* renamed from: a */
    public final int[] f97392a = new int[2];

    /* renamed from: b */
    public final float[] f97393b = C42084hN2.m36494c(null, 1, null);

    @Override // p000.InterfaceC44317l80
    /* renamed from: a */
    public void mo21727a(View view, float[] matrix) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        C42084hN2.m36489h(matrix);
        m26296d(view, matrix);
    }

    /* renamed from: b */
    public final void m26298b(float[] fArr, Matrix matrix) {
        C12456bd.m64270b(this.f97393b, matrix);
        C30240xc.m4952g(fArr, this.f97393b);
    }

    /* renamed from: c */
    public final void m26297c(float[] fArr, float f, float f2) {
        C42084hN2.m36489h(this.f97393b);
        C42084hN2.m36484m(this.f97393b, f, f2, 0.0f, 4, null);
        C30240xc.m4952g(fArr, this.f97393b);
    }

    /* renamed from: d */
    public final void m26296d(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            m26296d((View) parent, fArr);
            m26297c(fArr, -view.getScrollX(), -view.getScrollY());
            m26297c(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.f97392a;
            view.getLocationInWindow(iArr);
            m26297c(fArr, -view.getScrollX(), -view.getScrollY());
            m26297c(fArr, iArr[0], iArr[1]);
        }
        Matrix viewMatrix = view.getMatrix();
        if (!viewMatrix.isIdentity()) {
            Intrinsics.checkNotNullExpressionValue(viewMatrix, "viewMatrix");
            m26298b(fArr, viewMatrix);
        }
    }
}
