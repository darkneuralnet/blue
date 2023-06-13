package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
/* renamed from: yr6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52454yr6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f120340a;

    /* renamed from: b */
    public final Button f120341b;

    /* renamed from: c */
    public final AppCompatCheckBox f120342c;

    /* renamed from: d */
    public final LinearLayout f120343d;

    /* renamed from: e */
    public final TextView f120344e;

    public C52454yr6(View view, Button button, AppCompatCheckBox appCompatCheckBox, LinearLayout linearLayout, TextView textView) {
        this.f120340a = view;
        this.f120341b = button;
        this.f120342c = appCompatCheckBox;
        this.f120343d = linearLayout;
        this.f120344e = textView;
    }

    /* renamed from: a */
    public static C52454yr6 m2385a(View view) {
        int i = C44062ki4.button;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C44062ki4.check;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) C34328Lp6.m96312a(view, i);
            if (appCompatCheckBox != null) {
                i = C44062ki4.linearLayout;
                LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                if (linearLayout != null) {
                    i = C44062ki4.title;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null) {
                        return new C52454yr6(view, button, appCompatCheckBox, linearLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C52454yr6 m2384b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C37080Xj4.view_item_summary, viewGroup);
            return m2385a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f120340a;
    }
}
