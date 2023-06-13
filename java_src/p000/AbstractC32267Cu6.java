package p000;

import android.view.View;
/* renamed from: Cu6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC32267Cu6 extends L96 {

    /* renamed from: a */
    public static final String[] f4880a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* renamed from: d */
    public static int m111365d(N96 n96, int i) {
        int[] iArr;
        if (n96 == null || (iArr = (int[]) n96.f24199a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // p000.L96
    /* renamed from: a */
    public void mo97643a(N96 n96) {
        View view = n96.f24200b;
        Integer num = (Integer) n96.f24199a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        n96.f24199a.put("android:visibilityPropagation:visibility", num);
        view.getLocationOnScreen(r2);
        int round = r2[0] + Math.round(view.getTranslationX());
        int[] iArr = {round};
        iArr[0] = round + (view.getWidth() / 2);
        int round2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = round2;
        iArr[1] = round2 + (view.getHeight() / 2);
        n96.f24199a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // p000.L96
    /* renamed from: b */
    public String[] mo97642b() {
        return f4880a;
    }

    /* renamed from: e */
    public int m111364e(N96 n96) {
        Integer num;
        if (n96 == null || (num = (Integer) n96.f24199a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    /* renamed from: f */
    public int m111363f(N96 n96) {
        return m111365d(n96, 0);
    }

    /* renamed from: g */
    public int m111362g(N96 n96) {
        return m111365d(n96, 1);
    }
}
