package p000;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
/* renamed from: DX1 */
/* loaded from: classes6.dex */
public class DX1 extends Property<ImageView, Matrix> {

    /* renamed from: a */
    public final Matrix f5844a;

    public DX1() {
        super(Matrix.class, "imageMatrixProperty");
        this.f5844a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f5844a.set(imageView.getImageMatrix());
        return this.f5844a;
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
