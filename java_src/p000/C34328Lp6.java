package p000;

import android.view.View;
import android.view.ViewGroup;
/* renamed from: Lp6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C34328Lp6 {
    private C34328Lp6() {
    }

    /* renamed from: a */
    public static <T extends View> T m96312a(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            T t = (T) viewGroup.getChildAt(i2).findViewById(i);
            if (t != null) {
                return t;
            }
        }
        return null;
    }
}
