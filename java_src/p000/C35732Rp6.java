package p000;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: Rp6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35732Rp6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f32710a;

    /* renamed from: b */
    public final RecyclerView f32711b;

    /* renamed from: c */
    public final RelativeLayout f32712c;

    /* renamed from: d */
    public final LinearProgressIndicator f32713d;

    /* renamed from: e */
    public final ImageView f32714e;

    /* renamed from: f */
    public final TextView f32715f;

    /* renamed from: g */
    public final TextView f32716g;

    /* renamed from: h */
    public final Button f32717h;

    public C35732Rp6(View view, RecyclerView recyclerView, RelativeLayout relativeLayout, LinearProgressIndicator linearProgressIndicator, ImageView imageView, TextView textView, TextView textView2, Button button) {
        this.f32710a = view;
        this.f32711b = recyclerView;
        this.f32712c = relativeLayout;
        this.f32713d = linearProgressIndicator;
        this.f32714e = imageView;
        this.f32715f = textView;
        this.f32716g = textView2;
        this.f32717h = button;
    }

    /* renamed from: a */
    public static C35732Rp6 m86277a(View view) {
        int i = C41087fh4.birdListRecyclerView;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null) {
            i = C41087fh4.container;
            RelativeLayout relativeLayout = (RelativeLayout) C34328Lp6.m96312a(view, i);
            if (relativeLayout != null) {
                i = C41087fh4.progressBar;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                if (linearProgressIndicator != null) {
                    i = C41087fh4.pullIndicator;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        i = C41087fh4.totalScannedCount;
                        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView != null) {
                            i = C41087fh4.totalScannedLabel;
                            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView2 != null) {
                                i = C41087fh4.updateButton;
                                Button button = (Button) C34328Lp6.m96312a(view, i);
                                if (button != null) {
                                    return new C35732Rp6(view, recyclerView, relativeLayout, linearProgressIndicator, imageView, textView, textView2, button);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f32710a;
    }
}
