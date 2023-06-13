package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.widget.standardcomponents.OptionalImeEditText;
/* renamed from: H3 */
/* loaded from: classes3.dex */
public final class C3013H3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f12754a;

    /* renamed from: b */
    public final ImageView f12755b;

    /* renamed from: c */
    public final TextView f12756c;

    /* renamed from: d */
    public final Group f12757d;

    /* renamed from: e */
    public final TextView f12758e;

    /* renamed from: f */
    public final View f12759f;

    /* renamed from: g */
    public final TextView f12760g;

    /* renamed from: h */
    public final TextView f12761h;

    /* renamed from: i */
    public final OptionalImeEditText f12762i;

    /* renamed from: j */
    public final ProgressBar f12763j;

    /* renamed from: k */
    public final View f12764k;

    /* renamed from: l */
    public final RecyclerView f12765l;

    /* renamed from: m */
    public final Button f12766m;

    /* renamed from: n */
    public final ImageView f12767n;

    /* renamed from: o */
    public final LinearLayout f12768o;

    /* renamed from: p */
    public final ConstraintLayout f12769p;

    /* renamed from: q */
    public final TextView f12770q;

    /* renamed from: r */
    public final TextView f12771r;

    /* renamed from: s */
    public final TextView f12772s;

    /* renamed from: t */
    public final TextView f12773t;

    /* renamed from: u */
    public final TextView f12774u;

    /* renamed from: v */
    public final TextView f12775v;

    /* renamed from: w */
    public final ConstraintLayout f12776w;

    /* renamed from: x */
    public final TextView f12777x;

    /* renamed from: y */
    public final View f12778y;

    /* renamed from: z */
    public final ImageView f12779z;

    public C3013H3(LinearLayout linearLayout, ImageView imageView, TextView textView, Group group, TextView textView2, View view, TextView textView3, TextView textView4, OptionalImeEditText optionalImeEditText, ProgressBar progressBar, View view2, RecyclerView recyclerView, Button button, ImageView imageView2, LinearLayout linearLayout2, ConstraintLayout constraintLayout, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, ConstraintLayout constraintLayout2, TextView textView11, View view3, ImageView imageView3) {
        this.f12754a = linearLayout;
        this.f12755b = imageView;
        this.f12756c = textView;
        this.f12757d = group;
        this.f12758e = textView2;
        this.f12759f = view;
        this.f12760g = textView3;
        this.f12761h = textView4;
        this.f12762i = optionalImeEditText;
        this.f12763j = progressBar;
        this.f12764k = view2;
        this.f12765l = recyclerView;
        this.f12766m = button;
        this.f12767n = imageView2;
        this.f12768o = linearLayout2;
        this.f12769p = constraintLayout;
        this.f12770q = textView5;
        this.f12771r = textView6;
        this.f12772s = textView7;
        this.f12773t = textView8;
        this.f12774u = textView9;
        this.f12775v = textView10;
        this.f12776w = constraintLayout2;
        this.f12777x = textView11;
        this.f12778y = view3;
        this.f12779z = imageView3;
    }

    /* renamed from: a */
    public static C3013H3 m104475a(View view) {
        View m96312a;
        View m96312a2;
        View m96312a3;
        int i = C48203rh4.codeButton;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C48203rh4.expectedScans;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C48203rh4.expectedScansGroup;
                Group group = (Group) C34328Lp6.m96312a(view, i);
                if (group != null) {
                    i = C48203rh4.failedScansCount;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null && (m96312a = C34328Lp6.m96312a(view, (i = C48203rh4.lapDivider))) != null) {
                        i = C48203rh4.lapLabel;
                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView3 != null) {
                            i = C48203rh4.lapScanCount;
                            TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView4 != null) {
                                i = C48203rh4.peripheralEditText;
                                OptionalImeEditText optionalImeEditText = (OptionalImeEditText) C34328Lp6.m96312a(view, i);
                                if (optionalImeEditText != null) {
                                    i = C48203rh4.progressBar;
                                    ProgressBar progressBar = (ProgressBar) C34328Lp6.m96312a(view, i);
                                    if (progressBar != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C48203rh4.progressDivider))) != null) {
                                        i = C48203rh4.recyclerView;
                                        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                                        if (recyclerView != null) {
                                            i = C48203rh4.resetLap;
                                            Button button = (Button) C34328Lp6.m96312a(view, i);
                                            if (button != null) {
                                                i = C48203rh4.scanButton;
                                                ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                                if (imageView2 != null) {
                                                    i = C48203rh4.scanMethodContainer;
                                                    LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                                                    if (linearLayout != null) {
                                                        i = C48203rh4.scanStatusContainer;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
                                                        if (constraintLayout != null) {
                                                            i = C48203rh4.scansCompletedLabel;
                                                            TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                                            if (textView5 != null) {
                                                                i = C48203rh4.scansFailedLabel;
                                                                TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                                                if (textView6 != null) {
                                                                    i = C48203rh4.scansVerticalDivider;
                                                                    TextView textView7 = (TextView) C34328Lp6.m96312a(view, i);
                                                                    if (textView7 != null) {
                                                                        i = C48203rh4.slashLabel;
                                                                        TextView textView8 = (TextView) C34328Lp6.m96312a(view, i);
                                                                        if (textView8 != null) {
                                                                            i = C48203rh4.uploadCount;
                                                                            TextView textView9 = (TextView) C34328Lp6.m96312a(view, i);
                                                                            if (textView9 != null) {
                                                                                i = C48203rh4.uploadingStatus;
                                                                                TextView textView10 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                if (textView10 != null) {
                                                                                    i = C48203rh4.wifiContainer;
                                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) C34328Lp6.m96312a(view, i);
                                                                                    if (constraintLayout2 != null) {
                                                                                        i = C48203rh4.wifiDescription;
                                                                                        TextView textView11 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                        if (textView11 != null && (m96312a3 = C34328Lp6.m96312a(view, (i = C48203rh4.wifiDivider))) != null) {
                                                                                            i = C48203rh4.wifiIcon;
                                                                                            ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                                                                                            if (imageView3 != null) {
                                                                                                return new C3013H3((LinearLayout) view, imageView, textView, group, textView2, m96312a, textView3, textView4, optionalImeEditText, progressBar, m96312a2, recyclerView, button, imageView2, linearLayout, constraintLayout, textView5, textView6, textView7, textView8, textView9, textView10, constraintLayout2, textView11, m96312a3, imageView3);
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

    /* renamed from: c */
    public static C3013H3 m104473c(LayoutInflater layoutInflater) {
        return m104472d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C3013H3 m104472d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40514ej4.activity_hard_count, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m104475a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f12754a;
    }
}
