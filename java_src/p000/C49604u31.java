package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: u31  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49604u31 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f111623a;

    /* renamed from: b */
    public final Button f111624b;

    /* renamed from: c */
    public final ImageView f111625c;

    /* renamed from: d */
    public final TextView f111626d;

    /* renamed from: e */
    public final Button f111627e;

    public C49604u31(LinearLayout linearLayout, Button button, ImageView imageView, TextView textView, Button button2) {
        this.f111623a = linearLayout;
        this.f111624b = button;
        this.f111625c = imageView;
        this.f111626d = textView;
        this.f111627e = button2;
    }

    /* renamed from: a */
    public static C49604u31 m10935a(View view) {
        int i = C44062ki4.cancel;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C44062ki4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C44062ki4.issue;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C44062ki4.noRepairNeeded;
                    Button button2 = (Button) C34328Lp6.m96312a(view, i);
                    if (button2 != null) {
                        return new C49604u31((LinearLayout) view, button, imageView, textView, button2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C49604u31 m10933c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37080Xj4.dialog_inspection_dispute, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m10935a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f111623a;
    }
}
