package p000;

import android.graphics.Matrix;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B?\u00126\u0010\u0010\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0004\u001a\u00020\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\bRD\u0010\u0010\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00030\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R!\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R!\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, m28432d2 = {"Lhm2;", "T", "", "", "c", "target", "LhN2;", "b", "(Ljava/lang/Object;)[F", C17296a.f69688o, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Landroid/graphics/Matrix;", "matrix", "Lkotlin/jvm/functions/Function2;", "getMatrix", "Landroid/graphics/Matrix;", "androidMatrixCache", "previousAndroidMatrix", DateTokenConverter.CONVERTER_KEY, "[F", "matrixCache", "e", "inverseMatrixCache", "", "f", "Z", "isDirty", "g", "isInverseDirty", "h", "isInverseValid", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hm2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42321hm2<T> {

    /* renamed from: a */
    public final Function2<T, Matrix, Unit> f85869a;

    /* renamed from: b */
    public Matrix f85870b;

    /* renamed from: c */
    public Matrix f85871c;

    /* renamed from: d */
    public float[] f85872d;

    /* renamed from: e */
    public float[] f85873e;

    /* renamed from: f */
    public boolean f85874f;

    /* renamed from: g */
    public boolean f85875g;

    /* renamed from: h */
    public boolean f85876h;

    /* JADX WARN: Multi-variable type inference failed */
    public C42321hm2(Function2<? super T, ? super Matrix, Unit> getMatrix) {
        Intrinsics.checkNotNullParameter(getMatrix, "getMatrix");
        this.f85869a = getMatrix;
        this.f85874f = true;
        this.f85875g = true;
        this.f85876h = true;
    }

    /* renamed from: a */
    public final float[] m35880a(T t) {
        float[] fArr = this.f85873e;
        if (fArr == null) {
            fArr = C42084hN2.m36494c(null, 1, null);
            this.f85873e = fArr;
        }
        if (this.f85875g) {
            this.f85876h = Q92.m88865a(m35879b(t), fArr);
            this.f85875g = false;
        }
        if (!this.f85876h) {
            return null;
        }
        return fArr;
    }

    /* renamed from: b */
    public final float[] m35879b(T t) {
        float[] fArr = this.f85872d;
        if (fArr == null) {
            fArr = C42084hN2.m36494c(null, 1, null);
            this.f85872d = fArr;
        }
        if (!this.f85874f) {
            return fArr;
        }
        Matrix matrix = this.f85870b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f85870b = matrix;
        }
        this.f85869a.invoke(t, matrix);
        Matrix matrix2 = this.f85871c;
        if (matrix2 == null || !Intrinsics.areEqual(matrix, matrix2)) {
            C12456bd.m64270b(fArr, matrix);
            this.f85870b = matrix2;
            this.f85871c = matrix;
        }
        this.f85874f = false;
        return fArr;
    }

    /* renamed from: c */
    public final void m35878c() {
        this.f85874f = true;
        this.f85875g = true;
    }
}
