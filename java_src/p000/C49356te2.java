package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
/* renamed from: te2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49356te2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CardView f110812a;

    /* renamed from: b */
    public final TextView f110813b;

    /* renamed from: c */
    public final TextView f110814c;

    /* renamed from: d */
    public final ImageView f110815d;

    /* renamed from: e */
    public final TextView f110816e;

    /* renamed from: f */
    public final View f110817f;

    /* renamed from: g */
    public final ImageView f110818g;

    /* renamed from: h */
    public final View f110819h;

    /* renamed from: i */
    public final TextView f110820i;

    /* renamed from: j */
    public final TextView f110821j;

    /* renamed from: k */
    public final ImageView f110822k;

    /* renamed from: l */
    public final EditText f110823l;

    /* renamed from: m */
    public final TextView f110824m;

    /* renamed from: n */
    public final TextView f110825n;

    /* renamed from: o */
    public final TextView f110826o;

    public C49356te2(CardView cardView, TextView textView, TextView textView2, ImageView imageView, TextView textView3, View view, ImageView imageView2, View view2, TextView textView4, TextView textView5, ImageView imageView3, EditText editText, TextView textView6, TextView textView7, TextView textView8) {
        this.f110812a = cardView;
        this.f110813b = textView;
        this.f110814c = textView2;
        this.f110815d = imageView;
        this.f110816e = textView3;
        this.f110817f = view;
        this.f110818g = imageView2;
        this.f110819h = view2;
        this.f110820i = textView4;
        this.f110821j = textView5;
        this.f110822k = imageView3;
        this.f110823l = editText;
        this.f110824m = textView6;
        this.f110825n = textView7;
        this.f110826o = textView8;
    }

    /* renamed from: a */
    public static C49356te2 m11985a(View view) {
        View m96312a;
        View m96312a2;
        int i = C34488Mh4.healthyLevel;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C34488Mh4.inventoryLevelLabel;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C34488Mh4.minusButton;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C34488Mh4.outOfStockLabel;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null && (m96312a = C34328Lp6.m96312a(view, (i = C34488Mh4.partDetailsDivider))) != null) {
                        i = C34488Mh4.partImage;
                        ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView2 != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C34488Mh4.partQuantityDivider))) != null) {
                            i = C34488Mh4.partQuantityLabel;
                            TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView4 != null) {
                                i = C34488Mh4.partQuantityRecommended;
                                TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView5 != null) {
                                    i = C34488Mh4.plusButton;
                                    ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                                    if (imageView3 != null) {
                                        i = C34488Mh4.quantityEditText;
                                        EditText editText = (EditText) C34328Lp6.m96312a(view, i);
                                        if (editText != null) {
                                            i = C34488Mh4.runningLowLabel;
                                            TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                            if (textView6 != null) {
                                                i = C34488Mh4.subtitleText;
                                                TextView textView7 = (TextView) C34328Lp6.m96312a(view, i);
                                                if (textView7 != null) {
                                                    i = C34488Mh4.titleText;
                                                    TextView textView8 = (TextView) C34328Lp6.m96312a(view, i);
                                                    if (textView8 != null) {
                                                        return new C49356te2((CardView) view, textView, textView2, imageView, textView3, m96312a, imageView2, m96312a2, textView4, textView5, imageView3, editText, textView6, textView7, textView8);
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

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CardView getRoot() {
        return this.f110812a;
    }
}
