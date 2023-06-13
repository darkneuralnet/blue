package p000;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
/* renamed from: Rq6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35741Rq6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f32738a;

    /* renamed from: b */
    public final Button f32739b;

    /* renamed from: c */
    public final Button f32740c;

    /* renamed from: d */
    public final TextView f32741d;

    /* renamed from: e */
    public final MaterialCardView f32742e;

    /* renamed from: f */
    public final TextView f32743f;

    /* renamed from: g */
    public final ImageView f32744g;

    public C35741Rq6(ConstraintLayout constraintLayout, Button button, Button button2, TextView textView, MaterialCardView materialCardView, TextView textView2, ImageView imageView) {
        this.f32738a = constraintLayout;
        this.f32739b = button;
        this.f32740c = button2;
        this.f32741d = textView;
        this.f32742e = materialCardView;
        this.f32743f = textView2;
        this.f32744g = imageView;
    }

    /* renamed from: a */
    public static C35741Rq6 m86273a(View view) {
        int i = C52955zi4.destination_cancel_btn;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C52955zi4.destination_confirm_btn;
            Button button2 = (Button) C34328Lp6.m96312a(view, i);
            if (button2 != null) {
                i = C52955zi4.destination_title_tv;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C52955zi4.displayed_address_container;
                    MaterialCardView materialCardView = (MaterialCardView) C34328Lp6.m96312a(view, i);
                    if (materialCardView != null) {
                        i = C52955zi4.displayed_address_tv;
                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView2 != null) {
                            i = C52955zi4.search_icon;
                            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView != null) {
                                return new C35741Rq6((ConstraintLayout) view, button, button2, textView, materialCardView, textView2, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f32738a;
    }
}
