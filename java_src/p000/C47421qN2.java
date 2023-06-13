package p000;

import android.graphics.Matrix;
import android.graphics.RectF;
/* renamed from: qN2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C47421qN2 {

    /* renamed from: a */
    public static final Matrix f105198a = new C27589a();

    /* renamed from: qN2$a */
    /* loaded from: classes.dex */
    public static class C27589a extends Matrix {
        /* renamed from: a */
        public void m17584a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public boolean postConcat(Matrix matrix) {
            m17584a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f, float f2, float f3) {
            m17584a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f, float f2, float f3, float f4) {
            m17584a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f, float f2, float f3, float f4) {
            m17584a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postTranslate(float f, float f2) {
            m17584a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preConcat(Matrix matrix) {
            m17584a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f, float f2, float f3) {
            m17584a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f, float f2, float f3, float f4) {
            m17584a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f, float f2, float f3, float f4) {
            m17584a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preTranslate(float f, float f2) {
            m17584a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void reset() {
            m17584a();
        }

        @Override // android.graphics.Matrix
        public void set(Matrix matrix) {
            m17584a();
        }

        @Override // android.graphics.Matrix
        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            m17584a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setPolyToPoly(float[] fArr, int i, float[] fArr2, int i2, int i3) {
            m17584a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            m17584a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f, float f2, float f3) {
            m17584a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f, float f2, float f3, float f4) {
            m17584a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f, float f2, float f3, float f4) {
            m17584a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f, float f2, float f3, float f4) {
            m17584a();
        }

        @Override // android.graphics.Matrix
        public void setTranslate(float f, float f2) {
            m17584a();
        }

        @Override // android.graphics.Matrix
        public void setValues(float[] fArr) {
            m17584a();
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f) {
            m17584a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f, float f2) {
            m17584a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f, float f2) {
            m17584a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f) {
            m17584a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f, float f2) {
            m17584a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f, float f2) {
            m17584a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f) {
            m17584a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f, float f2) {
            m17584a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f, float f2) {
            m17584a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f, float f2) {
            m17584a();
        }
    }

    private C47421qN2() {
    }
}
