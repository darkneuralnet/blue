package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* renamed from: VM2 */
/* loaded from: classes6.dex */
public class VM2 {

    /* renamed from: a */
    public static final int[] f38899a = {16842752, C49961uf4.theme};

    /* renamed from: b */
    public static final int[] f38900b = {C49961uf4.materialThemeOverlay};

    private VM2() {
    }

    /* renamed from: a */
    public static int m79937a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f38899a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId == 0) {
            return resourceId2;
        }
        return resourceId;
    }

    /* renamed from: b */
    public static int m79936b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f38900b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static Context m79935c(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z;
        int m79936b = m79936b(context, attributeSet, i, i2);
        if ((context instanceof C37806aB0) && ((C37806aB0) context).m71801c() == m79936b) {
            z = true;
        } else {
            z = false;
        }
        if (m79936b != 0 && !z) {
            C37806aB0 c37806aB0 = new C37806aB0(context, m79936b);
            int m79937a = m79937a(context, attributeSet);
            if (m79937a != 0) {
                c37806aB0.getTheme().applyStyle(m79937a, true);
            }
            return c37806aB0;
        }
        return context;
    }
}
