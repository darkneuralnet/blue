package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.viewpagerindicator.CirclePageIndicator;
/* renamed from: T33 */
/* loaded from: classes3.dex */
public final class T33 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f34704a;

    /* renamed from: b */
    public final TextView f34705b;

    /* renamed from: c */
    public final TextView f34706c;

    /* renamed from: d */
    public final TextView f34707d;

    /* renamed from: e */
    public final TextView f34708e;

    /* renamed from: f */
    public final TextView f34709f;

    /* renamed from: g */
    public final TextView f34710g;

    /* renamed from: h */
    public final TextView f34711h;

    /* renamed from: i */
    public final CirclePageIndicator f34712i;

    /* renamed from: j */
    public final ViewPager f34713j;

    public T33(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, CirclePageIndicator circlePageIndicator, ViewPager viewPager) {
        this.f34704a = constraintLayout;
        this.f34705b = textView;
        this.f34706c = textView2;
        this.f34707d = textView3;
        this.f34708e = textView4;
        this.f34709f = textView5;
        this.f34710g = textView6;
        this.f34711h = textView7;
        this.f34712i = circlePageIndicator;
        this.f34713j = viewPager;
    }

    /* renamed from: a */
    public static T33 m84394a(View view) {
        int i = C32148Ch4.AvailableVehiclesLabel;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C32148Ch4.address;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C32148Ch4.availableParking;
                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView3 != null) {
                    i = C32148Ch4.availableParkingLabel;
                    TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView4 != null) {
                        i = C32148Ch4.nameLabel;
                        TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView5 != null) {
                            i = C32148Ch4.notes;
                            TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView6 != null) {
                                i = C32148Ch4.notesLabel;
                                TextView textView7 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView7 != null) {
                                    i = C32148Ch4.pageIndicator;
                                    CirclePageIndicator circlePageIndicator = (CirclePageIndicator) C34328Lp6.m96312a(view, i);
                                    if (circlePageIndicator != null) {
                                        i = C32148Ch4.viewPager;
                                        ViewPager viewPager = (ViewPager) C34328Lp6.m96312a(view, i);
                                        if (viewPager != null) {
                                            return new T33((ConstraintLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7, circlePageIndicator, viewPager);
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
    public ConstraintLayout getRoot() {
        return this.f34704a;
    }
}
