package p000;

import android.os.Build;
import android.view.View;
/* renamed from: E56 */
/* loaded from: classes.dex */
public class E56 {

    /* renamed from: E56$a */
    /* loaded from: classes.dex */
    public static class C1736a {
        private C1736a() {
        }

        /* renamed from: a */
        public static void m109402a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    private E56() {
    }

    /* renamed from: a */
    public static void m109403a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C1736a.m109402a(view, charSequence);
        } else {
            H56.m104416h(view, charSequence);
        }
    }
}
