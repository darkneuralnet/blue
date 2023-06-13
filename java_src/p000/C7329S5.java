package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: S5 */
/* loaded from: classes2.dex */
public final class C7329S5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ScrollView f33140a;

    /* renamed from: b */
    public final TextView f33141b;

    /* renamed from: c */
    public final Button f33142c;

    /* renamed from: d */
    public final Button f33143d;

    /* renamed from: e */
    public final TextView f33144e;

    /* renamed from: f */
    public final Button f33145f;

    /* renamed from: g */
    public final LinearProgressIndicator f33146g;

    /* renamed from: h */
    public final RelativeLayout f33147h;

    /* renamed from: i */
    public final Button f33148i;

    /* renamed from: j */
    public final TextView f33149j;

    public C7329S5(ScrollView scrollView, TextView textView, Button button, Button button2, TextView textView2, Button button3, LinearProgressIndicator linearProgressIndicator, RelativeLayout relativeLayout, Button button4, TextView textView3) {
        this.f33140a = scrollView;
        this.f33141b = textView;
        this.f33142c = button;
        this.f33143d = button2;
        this.f33144e = textView2;
        this.f33145f = button3;
        this.f33146g = linearProgressIndicator;
        this.f33147h = relativeLayout;
        this.f33148i = button4;
        this.f33149j = textView3;
    }

    /* renamed from: a */
    public static C7329S5 m86029a(View view) {
        int i = C36585Vg4.birdId;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.cancelRepair;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C36585Vg4.cantFix;
                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                if (button2 != null) {
                    i = C36585Vg4.header;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C36585Vg4.notDamaged;
                        Button button3 = (Button) C34328Lp6.m96312a(view, i);
                        if (button3 != null) {
                            i = C36585Vg4.progressBar;
                            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                            if (linearProgressIndicator != null) {
                                i = C36585Vg4.safetyInspectionActivityRoot;
                                RelativeLayout relativeLayout = (RelativeLayout) C34328Lp6.m96312a(view, i);
                                if (relativeLayout != null) {
                                    i = C36585Vg4.startRepair;
                                    Button button4 = (Button) C34328Lp6.m96312a(view, i);
                                    if (button4 != null) {
                                        i = C36585Vg4.subHeader;
                                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                        if (textView3 != null) {
                                            return new C7329S5((ScrollView) view, textView, button, button2, textView2, button3, linearProgressIndicator, relativeLayout, button4, textView3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C7329S5 m86027c(LayoutInflater layoutInflater) {
        return m86026d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C7329S5 m86026d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_safety_inspection, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m86029a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ScrollView getRoot() {
        return this.f33140a;
    }
}
