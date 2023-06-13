package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.imageupload.ImageUploadBar;
import co.bird.android.widget.CallToActionLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: g3 */
/* loaded from: classes3.dex */
public final class C20696g3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CallToActionLayout f81439a;

    /* renamed from: b */
    public final ImageUploadBar f81440b;

    /* renamed from: c */
    public final TextView f81441c;

    /* renamed from: d */
    public final TextView f81442d;

    /* renamed from: e */
    public final EditText f81443e;

    /* renamed from: f */
    public final LinearLayout f81444f;

    /* renamed from: g */
    public final TextView f81445g;

    /* renamed from: h */
    public final AppCompatSpinner f81446h;

    /* renamed from: i */
    public final RecyclerView f81447i;

    /* renamed from: j */
    public final LinearProgressIndicator f81448j;

    /* renamed from: k */
    public final CallToActionLayout f81449k;

    /* renamed from: l */
    public final TextView f81450l;

    public C20696g3(CallToActionLayout callToActionLayout, ImageUploadBar imageUploadBar, TextView textView, TextView textView2, EditText editText, LinearLayout linearLayout, TextView textView3, AppCompatSpinner appCompatSpinner, RecyclerView recyclerView, LinearProgressIndicator linearProgressIndicator, CallToActionLayout callToActionLayout2, TextView textView4) {
        this.f81439a = callToActionLayout;
        this.f81440b = imageUploadBar;
        this.f81441c = textView;
        this.f81442d = textView2;
        this.f81443e = editText;
        this.f81444f = linearLayout;
        this.f81445g = textView3;
        this.f81446h = appCompatSpinner;
        this.f81447i = recyclerView;
        this.f81448j = linearProgressIndicator;
        this.f81449k = callToActionLayout2;
        this.f81450l = textView4;
    }

    /* renamed from: a */
    public static C20696g3 m40253a(View view) {
        int i = C41680gh4.imageUploadBar;
        ImageUploadBar imageUploadBar = (ImageUploadBar) C34328Lp6.m96312a(view, i);
        if (imageUploadBar != null) {
            i = C41680gh4.includeDetailsTextView;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C41680gh4.includePhotosTextView;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C41680gh4.issueTextBox;
                    EditText editText = (EditText) C34328Lp6.m96312a(view, i);
                    if (editText != null) {
                        i = C41680gh4.numBirdsContainer;
                        LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                        if (linearLayout != null) {
                            i = C41680gh4.numberBirdsInvolvedTextView;
                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView3 != null) {
                                i = C41680gh4.numberOfBirdsSelector;
                                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) C34328Lp6.m96312a(view, i);
                                if (appCompatSpinner != null) {
                                    i = C41680gh4.optionsView;
                                    RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                                    if (recyclerView != null) {
                                        i = C41680gh4.progressBar;
                                        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                        if (linearProgressIndicator != null) {
                                            CallToActionLayout callToActionLayout = (CallToActionLayout) view;
                                            i = C41680gh4.selectReasonTextView;
                                            TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                            if (textView4 != null) {
                                                return new C20696g3(callToActionLayout, imageUploadBar, textView, textView2, editText, linearLayout, textView3, appCompatSpinner, recyclerView, linearProgressIndicator, callToActionLayout, textView4);
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

    /* renamed from: c */
    public static C20696g3 m40251c(LayoutInflater layoutInflater) {
        return m40250d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C20696g3 m40250d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36135Ti4.activity_cannot_access, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m40253a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CallToActionLayout getRoot() {
        return this.f81439a;
    }
}
