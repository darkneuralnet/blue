package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: i4 */
/* loaded from: classes3.dex */
public final class C23121i4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f86682a;

    /* renamed from: b */
    public final ImageView f86683b;

    /* renamed from: c */
    public final Button f86684c;

    /* renamed from: d */
    public final Button f86685d;

    /* renamed from: e */
    public final TextView f86686e;

    public C23121i4(ConstraintLayout constraintLayout, ImageView imageView, Button button, Button button2, TextView textView) {
        this.f86682a = constraintLayout;
        this.f86683b = imageView;
        this.f86684c = button;
        this.f86685d = button2;
        this.f86686e = textView;
    }

    /* renamed from: a */
    public static C23121i4 m34508a(View view) {
        int i = C51759xh4.illustration;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C51759xh4.next;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C51759xh4.skip;
                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                if (button2 != null) {
                    i = C51759xh4.title;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null) {
                        return new C23121i4((ConstraintLayout) view, imageView, button, button2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C23121i4 m34506c(LayoutInflater layoutInflater) {
        return m34505d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C23121i4 m34505d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C44072kj4.activity_locals_survey, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m34508a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f86682a;
    }
}
