package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.imageupload.ImageUploadBar;
/* renamed from: sc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48743sc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f109039a;

    /* renamed from: b */
    public final TextView f109040b;

    /* renamed from: c */
    public final ImageUploadBar f109041c;

    /* renamed from: d */
    public final TextView f109042d;

    /* renamed from: e */
    public final ImageView f109043e;

    /* renamed from: f */
    public final ImageView f109044f;

    public C48743sc2(ConstraintLayout constraintLayout, TextView textView, ImageUploadBar imageUploadBar, TextView textView2, ImageView imageView, ImageView imageView2) {
        this.f109039a = constraintLayout;
        this.f109040b = textView;
        this.f109041c = imageUploadBar;
        this.f109042d = textView2;
        this.f109043e = imageView;
        this.f109044f = imageView2;
    }

    /* renamed from: a */
    public static C48743sc2 m13947a(View view) {
        int i = C39912di4.containerOrderId;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39912di4.imageUploadBar;
            ImageUploadBar imageUploadBar = (ImageUploadBar) C34328Lp6.m96312a(view, i);
            if (imageUploadBar != null) {
                i = C39912di4.lineItem1;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C39912di4.statusIconFailure;
                    ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                    if (imageView != null) {
                        i = C39912di4.statusIconSuccess;
                        ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView2 != null) {
                            return new C48743sc2((ConstraintLayout) view, textView, imageUploadBar, textView2, imageView, imageView2);
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
        return this.f109039a;
    }
}
