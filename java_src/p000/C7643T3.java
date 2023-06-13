package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import co.bird.android.widget.BirdActionView;
import co.bird.android.widget.CameraxView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: T3 */
/* loaded from: classes2.dex */
public final class C7643T3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f34690a;

    /* renamed from: b */
    public final BirdActionView f34691b;

    /* renamed from: c */
    public final CameraxView f34692c;

    /* renamed from: d */
    public final Button f34693d;

    /* renamed from: e */
    public final ImageView f34694e;

    /* renamed from: f */
    public final TextView f34695f;

    /* renamed from: g */
    public final LinearProgressIndicator f34696g;

    /* renamed from: h */
    public final Button f34697h;

    /* renamed from: i */
    public final Button f34698i;

    /* renamed from: j */
    public final Button f34699j;

    public C7643T3(RelativeLayout relativeLayout, BirdActionView birdActionView, CameraxView cameraxView, Button button, ImageView imageView, TextView textView, LinearProgressIndicator linearProgressIndicator, Button button2, Button button3, Button button4) {
        this.f34690a = relativeLayout;
        this.f34691b = birdActionView;
        this.f34692c = cameraxView;
        this.f34693d = button;
        this.f34694e = imageView;
        this.f34695f = textView;
        this.f34696g = linearProgressIndicator;
        this.f34697h = button2;
        this.f34698i = button3;
        this.f34699j = button4;
    }

    /* renamed from: a */
    public static C7643T3 m84404a(View view) {
        int i = C36585Vg4.birdStatus;
        BirdActionView birdActionView = (BirdActionView) C34328Lp6.m96312a(view, i);
        if (birdActionView != null) {
            i = C36585Vg4.camera;
            CameraxView cameraxView = (CameraxView) C34328Lp6.m96312a(view, i);
            if (cameraxView != null) {
                i = C36585Vg4.flashLightButton;
                Button button = (Button) C34328Lp6.m96312a(view, i);
                if (button != null) {
                    i = C36585Vg4.imagePreview;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        i = C36585Vg4.infoText;
                        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView != null) {
                            i = C36585Vg4.progressBar;
                            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                            if (linearProgressIndicator != null) {
                                i = C36585Vg4.retakeButton;
                                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                if (button2 != null) {
                                    i = C36585Vg4.takePhotoButton;
                                    Button button3 = (Button) C34328Lp6.m96312a(view, i);
                                    if (button3 != null) {
                                        i = C36585Vg4.usePhotoButton;
                                        Button button4 = (Button) C34328Lp6.m96312a(view, i);
                                        if (button4 != null) {
                                            return new C7643T3((RelativeLayout) view, birdActionView, cameraxView, button, imageView, textView, linearProgressIndicator, button2, button3, button4);
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

    /* renamed from: c */
    public static C7643T3 m84402c(LayoutInflater layoutInflater) {
        return m84401d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C7643T3 m84401d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_inspection_photo, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84404a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f34690a;
    }
}
