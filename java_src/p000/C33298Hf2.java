package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Hf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33298Hf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f13729a;

    /* renamed from: b */
    public final RadioButton f13730b;

    /* renamed from: c */
    public final RadioButton f13731c;

    /* renamed from: d */
    public final RadioGroup f13732d;

    /* renamed from: e */
    public final EditText f13733e;

    /* renamed from: f */
    public final RadioButton f13734f;

    /* renamed from: g */
    public final ImageView f13735g;

    /* renamed from: h */
    public final TextView f13736h;

    /* renamed from: i */
    public final TextView f13737i;

    public C33298Hf2(ConstraintLayout constraintLayout, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, EditText editText, RadioButton radioButton3, ImageView imageView, TextView textView, TextView textView2) {
        this.f13729a = constraintLayout;
        this.f13730b = radioButton;
        this.f13731c = radioButton2;
        this.f13732d = radioGroup;
        this.f13733e = editText;
        this.f13734f = radioButton3;
        this.f13735g = imageView;
        this.f13736h = textView;
        this.f13737i = textView2;
    }

    /* renamed from: a */
    public static C33298Hf2 m103556a(View view) {
        int i = C39912di4.leftBehindOption;
        RadioButton radioButton = (RadioButton) C34328Lp6.m96312a(view, i);
        if (radioButton != null) {
            i = C39912di4.lostInTransitOption;
            RadioButton radioButton2 = (RadioButton) C34328Lp6.m96312a(view, i);
            if (radioButton2 != null) {
                i = C39912di4.missingOptions;
                RadioGroup radioGroup = (RadioGroup) C34328Lp6.m96312a(view, i);
                if (radioGroup != null) {
                    i = C39912di4.otherEditText;
                    EditText editText = (EditText) C34328Lp6.m96312a(view, i);
                    if (editText != null) {
                        i = C39912di4.otherOption;
                        RadioButton radioButton3 = (RadioButton) C34328Lp6.m96312a(view, i);
                        if (radioButton3 != null) {
                            i = C39912di4.skuImage;
                            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView != null) {
                                i = C39912di4.skuMissingLabel;
                                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView != null) {
                                    i = C39912di4.skuTitle;
                                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView2 != null) {
                                        return new C33298Hf2((ConstraintLayout) view, radioButton, radioButton2, radioGroup, editText, radioButton3, imageView, textView, textView2);
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
    public ConstraintLayout getRoot() {
        return this.f13729a;
    }
}
