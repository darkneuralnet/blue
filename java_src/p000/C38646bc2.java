package p000;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
/* renamed from: bc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38646bc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f57754a;

    /* renamed from: b */
    public final Button f57755b;

    /* renamed from: c */
    public final ImageView f57756c;

    /* renamed from: d */
    public final CircularProgressIndicator f57757d;

    /* renamed from: e */
    public final TextView f57758e;

    public C38646bc2(ConstraintLayout constraintLayout, Button button, ImageView imageView, CircularProgressIndicator circularProgressIndicator, TextView textView) {
        this.f57754a = constraintLayout;
        this.f57755b = button;
        this.f57756c = imageView;
        this.f57757d = circularProgressIndicator;
        this.f57758e = textView;
    }

    /* renamed from: a */
    public static C38646bc2 m64278a(View view) {
        int i = C45248mi4.button;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C45248mi4.icon;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C45248mi4.qcProgressBar;
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
                if (circularProgressIndicator != null) {
                    i = C45248mi4.title;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null) {
                        return new C38646bc2((ConstraintLayout) view, button, imageView, circularProgressIndicator, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f57754a;
    }
}
