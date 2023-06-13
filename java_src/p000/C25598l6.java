package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import co.bird.android.feature.suggestanest.bottomsheet.SuggestNestBottomSheet;
import com.google.android.gms.maps.MapView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: l6 */
/* loaded from: classes3.dex */
public final class C25598l6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CoordinatorLayout f95474a;

    /* renamed from: b */
    public final Button f95475b;

    /* renamed from: c */
    public final SuggestNestBottomSheet f95476c;

    /* renamed from: d */
    public final ConstraintLayout f95477d;

    /* renamed from: e */
    public final Button f95478e;

    /* renamed from: f */
    public final MapView f95479f;

    /* renamed from: g */
    public final FrameLayout f95480g;

    /* renamed from: h */
    public final ImageView f95481h;

    /* renamed from: i */
    public final LinearProgressIndicator f95482i;

    /* renamed from: j */
    public final Group f95483j;

    /* renamed from: k */
    public final Button f95484k;

    /* renamed from: l */
    public final ImageView f95485l;

    /* renamed from: m */
    public final TextView f95486m;

    public C25598l6(CoordinatorLayout coordinatorLayout, Button button, SuggestNestBottomSheet suggestNestBottomSheet, ConstraintLayout constraintLayout, Button button2, MapView mapView, FrameLayout frameLayout, ImageView imageView, LinearProgressIndicator linearProgressIndicator, Group group, Button button3, ImageView imageView2, TextView textView) {
        this.f95474a = coordinatorLayout;
        this.f95475b = button;
        this.f95476c = suggestNestBottomSheet;
        this.f95477d = constraintLayout;
        this.f95478e = button2;
        this.f95479f = mapView;
        this.f95480g = frameLayout;
        this.f95481h = imageView;
        this.f95482i = linearProgressIndicator;
        this.f95483j = group;
        this.f95484k = button3;
        this.f95485l = imageView2;
        this.f95486m = textView;
    }

    /* renamed from: a */
    public static C25598l6 m27873a(View view) {
        int i = C39301ci4.back;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C39301ci4.bottomSheet;
            SuggestNestBottomSheet suggestNestBottomSheet = (SuggestNestBottomSheet) C34328Lp6.m96312a(view, i);
            if (suggestNestBottomSheet != null) {
                i = C39301ci4.buttonContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
                if (constraintLayout != null) {
                    i = C39301ci4.confirm;
                    Button button2 = (Button) C34328Lp6.m96312a(view, i);
                    if (button2 != null) {
                        i = C39301ci4.map;
                        MapView mapView = (MapView) C34328Lp6.m96312a(view, i);
                        if (mapView != null) {
                            i = C39301ci4.mapContainer;
                            FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
                            if (frameLayout != null) {
                                i = C39301ci4.myLocation;
                                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                if (imageView != null) {
                                    i = C39301ci4.progressBar;
                                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                    if (linearProgressIndicator != null) {
                                        i = C39301ci4.secondaryButtons;
                                        Group group = (Group) C34328Lp6.m96312a(view, i);
                                        if (group != null) {
                                            i = C39301ci4.suggestNest;
                                            Button button3 = (Button) C34328Lp6.m96312a(view, i);
                                            if (button3 != null) {
                                                i = C39301ci4.suggestionPin;
                                                ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                                if (imageView2 != null) {
                                                    i = C39301ci4.validityMessage;
                                                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                                                    if (textView != null) {
                                                        return new C25598l6((CoordinatorLayout) view, button, suggestNestBottomSheet, constraintLayout, button2, mapView, frameLayout, imageView, linearProgressIndicator, group, button3, imageView2, textView);
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
    public static C25598l6 m27871c(LayoutInflater layoutInflater) {
        return m27870d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C25598l6 m27870d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35208Pj4.activity_suggest_a_nest, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m27873a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f95474a;
    }
}
