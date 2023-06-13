package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
/* renamed from: g00  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41272g00 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f81268a;

    /* renamed from: b */
    public final Button f81269b;

    /* renamed from: c */
    public final Button f81270c;

    /* renamed from: d */
    public final Guideline f81271d;

    /* renamed from: e */
    public final ImageView f81272e;

    /* renamed from: f */
    public final TextView f81273f;

    /* renamed from: g */
    public final TextView f81274g;

    public C41272g00(ConstraintLayout constraintLayout, Button button, Button button2, Guideline guideline, ImageView imageView, TextView textView, TextView textView2) {
        this.f81268a = constraintLayout;
        this.f81269b = button;
        this.f81270c = button2;
        this.f81271d = guideline;
        this.f81272e = imageView;
        this.f81273f = textView;
        this.f81274g = textView2;
    }

    /* renamed from: a */
    public static C41272g00 m40374a(View view) {
        int i = C37521Zg4.cancel;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C37521Zg4.confirm;
            Button button2 = (Button) C34328Lp6.m96312a(view, i);
            if (button2 != null) {
                i = C37521Zg4.guide;
                Guideline guideline = (Guideline) C34328Lp6.m96312a(view, i);
                if (guideline != null) {
                    i = C37521Zg4.icon1;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        i = C37521Zg4.message;
                        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView != null) {
                            i = C37521Zg4.title;
                            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView2 != null) {
                                return new C41272g00((ConstraintLayout) view, button, button2, guideline, imageView, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C41272g00 m40372c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36378Uj4.bottom_sheet_scan_surroundings, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m40374a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f81268a;
    }
}
