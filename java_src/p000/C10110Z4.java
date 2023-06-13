package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: Z4 */
/* loaded from: classes4.dex */
public final class C10110Z4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f47805a;

    /* renamed from: b */
    public final TextView f47806b;

    /* renamed from: c */
    public final Button f47807c;

    /* renamed from: d */
    public final Button f47808d;

    /* renamed from: e */
    public final Button f47809e;

    /* renamed from: f */
    public final LinearProgressIndicator f47810f;

    /* renamed from: g */
    public final RecyclerView f47811g;

    /* renamed from: h */
    public final ImageView f47812h;

    public C10110Z4(ConstraintLayout constraintLayout, TextView textView, Button button, Button button2, Button button3, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, ImageView imageView) {
        this.f47805a = constraintLayout;
        this.f47806b = textView;
        this.f47807c = button;
        this.f47808d = button2;
        this.f47809e = button3;
        this.f47810f = linearProgressIndicator;
        this.f47811g = recyclerView;
        this.f47812h = imageView;
    }

    /* renamed from: a */
    public static C10110Z4 m73788a(View view) {
        int i = C51176wi4.counter;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C51176wi4.edit;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C51176wi4.fail;
                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                if (button2 != null) {
                    i = C51176wi4.pass;
                    Button button3 = (Button) C34328Lp6.m96312a(view, i);
                    if (button3 != null) {
                        i = C51176wi4.progressBar;
                        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                        if (linearProgressIndicator != null) {
                            i = C51176wi4.recyclerView;
                            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                            if (recyclerView != null) {
                                i = C51176wi4.toastImage;
                                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                if (imageView != null) {
                                    return new C10110Z4((ConstraintLayout) view, textView, button, button2, button3, linearProgressIndicator, recyclerView, imageView);
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
    public static C10110Z4 m73786c(LayoutInflater layoutInflater) {
        return m73785d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C10110Z4 m73785d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C43489jk4.activity_quality_control_swipe, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m73788a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f47805a;
    }
}
