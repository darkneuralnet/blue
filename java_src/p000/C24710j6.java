package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: j6 */
/* loaded from: classes3.dex */
public final class C24710j6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f92142a;

    /* renamed from: b */
    public final TextView f92143b;

    /* renamed from: c */
    public final EditText f92144c;

    /* renamed from: d */
    public final ImageView f92145d;

    /* renamed from: e */
    public final EditText f92146e;

    /* renamed from: f */
    public final TextView f92147f;

    public C24710j6(ConstraintLayout constraintLayout, TextView textView, EditText editText, ImageView imageView, EditText editText2, TextView textView2) {
        this.f92142a = constraintLayout;
        this.f92143b = textView;
        this.f92144c = editText;
        this.f92145d = imageView;
        this.f92146e = editText2;
        this.f92147f = textView2;
    }

    /* renamed from: a */
    public static C24710j6 m31125a(View view) {
        int i = C38708bi4.body;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C38708bi4.hint;
            EditText editText = (EditText) C34328Lp6.m96312a(view, i);
            if (editText != null) {
                i = C38708bi4.illustration;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C38708bi4.input;
                    EditText editText2 = (EditText) C34328Lp6.m96312a(view, i);
                    if (editText2 != null) {
                        i = C38708bi4.title;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            return new C24710j6((ConstraintLayout) view, textView, editText, imageView, editText2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C24710j6 m31123c(LayoutInflater layoutInflater) {
        return m31122d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C24710j6 m31122d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34974Oj4.activity_sober_start, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m31125a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f92142a;
    }
}
