package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* renamed from: yC */
/* loaded from: classes6.dex */
public abstract class AbstractC30476yC {

    /* renamed from: a */
    public int f118947a;

    /* renamed from: b */
    public int f118948b;

    /* renamed from: c */
    public int[] f118949c = new int[0];

    /* renamed from: d */
    public int f118950d;

    /* renamed from: e */
    public int f118951e;

    /* renamed from: f */
    public int f118952f;

    public AbstractC30476yC(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C35172Pf4.mtrl_progress_track_thickness);
        TypedArray m21866i = C46052o36.m21866i(context, attributeSet, C37098Xl4.BaseProgressIndicator, i, i2, new int[0]);
        this.f118947a = NM2.m94027d(context, m21866i, C37098Xl4.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.f118948b = Math.min(NM2.m94027d(context, m21866i, C37098Xl4.BaseProgressIndicator_trackCornerRadius, 0), this.f118947a / 2);
        this.f118951e = m21866i.getInt(C37098Xl4.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f118952f = m21866i.getInt(C37098Xl4.BaseProgressIndicator_hideAnimationBehavior, 0);
        m3857c(context, m21866i);
        m3856d(context, m21866i);
        m21866i.recycle();
    }

    /* renamed from: a */
    public boolean m3859a() {
        return this.f118952f != 0;
    }

    /* renamed from: b */
    public boolean m3858b() {
        return this.f118951e != 0;
    }

    /* renamed from: c */
    public final void m3857c(Context context, TypedArray typedArray) {
        int i = C37098Xl4.BaseProgressIndicator_indicatorColor;
        if (!typedArray.hasValue(i)) {
            this.f118949c = new int[]{HM2.m103954b(context, C49961uf4.colorPrimary, -1)};
        } else if (typedArray.peekValue(i).type != 1) {
            this.f118949c = new int[]{typedArray.getColor(i, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i, -1));
            this.f118949c = intArray;
            if (intArray.length != 0) {
                return;
            }
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    /* renamed from: d */
    public final void m3856d(Context context, TypedArray typedArray) {
        int i = C37098Xl4.BaseProgressIndicator_trackColor;
        if (typedArray.hasValue(i)) {
            this.f118950d = typedArray.getColor(i, -1);
            return;
        }
        this.f118950d = this.f118949c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f118950d = HM2.m103955a(this.f118950d, (int) (f * 255.0f));
    }

    /* renamed from: e */
    public abstract void mo3855e();
}
