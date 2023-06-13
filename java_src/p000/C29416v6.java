package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
/* renamed from: v6 */
/* loaded from: classes2.dex */
public final class C29416v6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f113519a;

    /* renamed from: b */
    public final Button f113520b;

    /* renamed from: c */
    public final Button f113521c;

    /* renamed from: d */
    public final Button f113522d;

    /* renamed from: e */
    public final Button f113523e;

    /* renamed from: f */
    public final Button f113524f;

    /* renamed from: g */
    public final Button f113525g;

    public C29416v6(LinearLayout linearLayout, Button button, Button button2, Button button3, Button button4, Button button5, Button button6) {
        this.f113519a = linearLayout;
        this.f113520b = button;
        this.f113521c = button2;
        this.f113522d = button3;
        this.f113523e = button4;
        this.f113524f = button5;
        this.f113525g = button6;
    }

    /* renamed from: a */
    public static C29416v6 m9198a(View view) {
        int i = C36585Vg4.bulk_scan_to_wake;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C36585Vg4.hibernation;
            Button button2 = (Button) C34328Lp6.m96312a(view, i);
            if (button2 != null) {
                i = C36585Vg4.sleep_a_bird;
                Button button3 = (Button) C34328Lp6.m96312a(view, i);
                if (button3 != null) {
                    i = C36585Vg4.sweep_to_wake;
                    Button button4 = (Button) C34328Lp6.m96312a(view, i);
                    if (button4 != null) {
                        i = C36585Vg4.wake_a_vehicle;
                        Button button5 = (Button) C34328Lp6.m96312a(view, i);
                        if (button5 != null) {
                            i = C36585Vg4.wake_batch;
                            Button button6 = (Button) C34328Lp6.m96312a(view, i);
                            if (button6 != null) {
                                return new C29416v6((LinearLayout) view, button, button2, button3, button4, button5, button6);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C29416v6 m9196c(LayoutInflater layoutInflater) {
        return m9195d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29416v6 m9195d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_wake_sleep, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m9198a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f113519a;
    }
}
