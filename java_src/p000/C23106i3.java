package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: i3 */
/* loaded from: classes2.dex */
public final class C23106i3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f86649a;

    /* renamed from: b */
    public final TextView f86650b;

    /* renamed from: c */
    public final Button f86651c;

    /* renamed from: d */
    public final CheckBox f86652d;

    /* renamed from: e */
    public final TextView f86653e;

    /* renamed from: f */
    public final TextView f86654f;

    /* renamed from: g */
    public final LinearProgressIndicator f86655g;

    /* renamed from: h */
    public final ImageView f86656h;

    public C23106i3(RelativeLayout relativeLayout, TextView textView, Button button, CheckBox checkBox, TextView textView2, TextView textView3, LinearProgressIndicator linearProgressIndicator, ImageView imageView) {
        this.f86649a = relativeLayout;
        this.f86650b = textView;
        this.f86651c = button;
        this.f86652d = checkBox;
        this.f86653e = textView2;
        this.f86654f = textView3;
        this.f86655g = linearProgressIndicator;
        this.f86656h = imageView;
    }

    /* renamed from: a */
    public static C23106i3 m34581a(View view) {
        int i = C36585Vg4.birdId;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.certifyButton;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C36585Vg4.certifyCheckBox;
                CheckBox checkBox = (CheckBox) C34328Lp6.m96312a(view, i);
                if (checkBox != null) {
                    i = C36585Vg4.certifyMessage;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C36585Vg4.header;
                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView3 != null) {
                            i = C36585Vg4.progressBar;
                            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                            if (linearProgressIndicator != null) {
                                i = C36585Vg4.wrench;
                                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                if (imageView != null) {
                                    return new C23106i3((RelativeLayout) view, textView, button, checkBox, textView2, textView3, linearProgressIndicator, imageView);
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
    public static C23106i3 m34579c(LayoutInflater layoutInflater) {
        return m34578d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C23106i3 m34578d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_certify_repair, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m34581a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f86649a;
    }
}
