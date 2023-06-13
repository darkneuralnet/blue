package p000;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Is6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33653Is6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f16356a;

    /* renamed from: b */
    public final ImageButton f16357b;

    /* renamed from: c */
    public final LinearLayout f16358c;

    /* renamed from: d */
    public final ImageButton f16359d;

    /* renamed from: e */
    public final ImageButton f16360e;

    /* renamed from: f */
    public final ImageButton f16361f;

    /* renamed from: g */
    public final ImageButton f16362g;

    /* renamed from: h */
    public final LinearLayout f16363h;

    /* renamed from: i */
    public final TextView f16364i;

    /* renamed from: j */
    public final TextView f16365j;

    /* renamed from: k */
    public final LinearLayout f16366k;

    /* renamed from: l */
    public final ImageView f16367l;

    public C33653Is6(LinearLayout linearLayout, ImageButton imageButton, LinearLayout linearLayout2, ImageButton imageButton2, ImageButton imageButton3, ImageButton imageButton4, ImageButton imageButton5, LinearLayout linearLayout3, TextView textView, TextView textView2, LinearLayout linearLayout4, ImageView imageView) {
        this.f16356a = linearLayout;
        this.f16357b = imageButton;
        this.f16358c = linearLayout2;
        this.f16359d = imageButton2;
        this.f16360e = imageButton3;
        this.f16361f = imageButton4;
        this.f16362g = imageButton5;
        this.f16363h = linearLayout3;
        this.f16364i = textView;
        this.f16365j = textView2;
        this.f16366k = linearLayout4;
        this.f16367l = imageView;
    }

    /* renamed from: a */
    public static C33653Is6 m101571a(View view) {
        int i = C52955zi4.actionChirp;
        ImageButton imageButton = (ImageButton) C34328Lp6.m96312a(view, i);
        if (imageButton != null) {
            i = C52955zi4.actionContainer;
            LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
            if (linearLayout != null) {
                i = C52955zi4.actionLightOff;
                ImageButton imageButton2 = (ImageButton) C34328Lp6.m96312a(view, i);
                if (imageButton2 != null) {
                    i = C52955zi4.actionLightOn;
                    ImageButton imageButton3 = (ImageButton) C34328Lp6.m96312a(view, i);
                    if (imageButton3 != null) {
                        i = C52955zi4.actionLock;
                        ImageButton imageButton4 = (ImageButton) C34328Lp6.m96312a(view, i);
                        if (imageButton4 != null) {
                            i = C52955zi4.actionUnlock;
                            ImageButton imageButton5 = (ImageButton) C34328Lp6.m96312a(view, i);
                            if (imageButton5 != null) {
                                i = C52955zi4.privateBirdBatteryContainer;
                                LinearLayout linearLayout2 = (LinearLayout) C34328Lp6.m96312a(view, i);
                                if (linearLayout2 != null) {
                                    i = C52955zi4.privateBirdBatteryLevel;
                                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView != null) {
                                        i = C52955zi4.privateBirdCode;
                                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                        if (textView2 != null) {
                                            i = C52955zi4.privateBirdCodeContainer;
                                            LinearLayout linearLayout3 = (LinearLayout) C34328Lp6.m96312a(view, i);
                                            if (linearLayout3 != null) {
                                                i = C52955zi4.vehicleIcon;
                                                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                                if (imageView != null) {
                                                    return new C33653Is6((LinearLayout) view, imageButton, linearLayout, imageButton2, imageButton3, imageButton4, imageButton5, linearLayout2, textView, textView2, linearLayout3, imageView);
                                                }
                                            }
                                        }
                                    }
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
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f16356a;
    }
}
