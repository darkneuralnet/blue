package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import co.bird.android.widget.BlockingEnterLocationView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: W3 */
/* loaded from: classes3.dex */
public final class C8921W3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f40313a;

    /* renamed from: b */
    public final ImageButton f40314b;

    /* renamed from: c */
    public final Button f40315c;

    /* renamed from: d */
    public final TextView f40316d;

    /* renamed from: e */
    public final TextView f40317e;

    /* renamed from: f */
    public final TextView f40318f;

    /* renamed from: g */
    public final BlockingEnterLocationView f40319g;

    /* renamed from: h */
    public final ConstraintLayout f40320h;

    /* renamed from: i */
    public final TextView f40321i;

    /* renamed from: j */
    public final TextView f40322j;

    /* renamed from: k */
    public final TextView f40323k;

    /* renamed from: l */
    public final TextView f40324l;

    /* renamed from: m */
    public final TextView f40325m;

    /* renamed from: n */
    public final LinearProgressIndicator f40326n;

    /* renamed from: o */
    public final NestedScrollView f40327o;

    /* renamed from: p */
    public final TextView f40328p;

    /* renamed from: q */
    public final ImageButton f40329q;

    /* renamed from: r */
    public final Button f40330r;

    /* renamed from: s */
    public final TextView f40331s;

    public C8921W3(ConstraintLayout constraintLayout, ImageButton imageButton, Button button, TextView textView, TextView textView2, TextView textView3, BlockingEnterLocationView blockingEnterLocationView, ConstraintLayout constraintLayout2, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, LinearProgressIndicator linearProgressIndicator, NestedScrollView nestedScrollView, TextView textView9, ImageButton imageButton2, Button button2, TextView textView10) {
        this.f40313a = constraintLayout;
        this.f40314b = imageButton;
        this.f40315c = button;
        this.f40316d = textView;
        this.f40317e = textView2;
        this.f40318f = textView3;
        this.f40319g = blockingEnterLocationView;
        this.f40320h = constraintLayout2;
        this.f40321i = textView4;
        this.f40322j = textView5;
        this.f40323k = textView6;
        this.f40324l = textView7;
        this.f40325m = textView8;
        this.f40326n = linearProgressIndicator;
        this.f40327o = nestedScrollView;
        this.f40328p = textView9;
        this.f40329q = imageButton2;
        this.f40330r = button2;
        this.f40331s = textView10;
    }

    /* renamed from: a */
    public static C8921W3 m78892a(View view) {
        int i = C38115ai4.add;
        ImageButton imageButton = (ImageButton) C34328Lp6.m96312a(view, i);
        if (imageButton != null) {
            i = C38115ai4.addExcessInventory;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C38115ai4.binQuantity;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C38115ai4.binSize;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C38115ai4.binWeight;
                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView3 != null) {
                            i = C38115ai4.blockEnterLocationOverlay;
                            BlockingEnterLocationView blockingEnterLocationView = (BlockingEnterLocationView) C34328Lp6.m96312a(view, i);
                            if (blockingEnterLocationView != null) {
                                i = C38115ai4.buttonContainer;
                                ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
                                if (constraintLayout != null) {
                                    i = C38115ai4.count;
                                    TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView4 != null) {
                                        i = C38115ai4.currentStock;
                                        TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                        if (textView5 != null) {
                                            i = C38115ai4.excessInventoryQuantity;
                                            TextView textView6 = (TextView) C34328Lp6.m96312a(view, i);
                                            if (textView6 != null) {
                                                i = C38115ai4.itemName;
                                                TextView textView7 = (TextView) C34328Lp6.m96312a(view, i);
                                                if (textView7 != null) {
                                                    i = C38115ai4.location;
                                                    TextView textView8 = (TextView) C34328Lp6.m96312a(view, i);
                                                    if (textView8 != null) {
                                                        i = C38115ai4.progressBar;
                                                        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                                        if (linearProgressIndicator != null) {
                                                            i = C38115ai4.scrollView;
                                                            NestedScrollView nestedScrollView = (NestedScrollView) C34328Lp6.m96312a(view, i);
                                                            if (nestedScrollView != null) {
                                                                i = C38115ai4.sku;
                                                                TextView textView9 = (TextView) C34328Lp6.m96312a(view, i);
                                                                if (textView9 != null) {
                                                                    i = C38115ai4.subtract;
                                                                    ImageButton imageButton2 = (ImageButton) C34328Lp6.m96312a(view, i);
                                                                    if (imageButton2 != null) {
                                                                        i = C38115ai4.update;
                                                                        Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                                                        if (button2 != null) {
                                                                            i = C38115ai4.updatedStock;
                                                                            TextView textView10 = (TextView) C34328Lp6.m96312a(view, i);
                                                                            if (textView10 != null) {
                                                                                return new C8921W3((ConstraintLayout) view, imageButton, button, textView, textView2, textView3, blockingEnterLocationView, constraintLayout, textView4, textView5, textView6, textView7, textView8, linearProgressIndicator, nestedScrollView, textView9, imageButton2, button2, textView10);
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
    public static C8921W3 m78890c(LayoutInflater layoutInflater) {
        return m78889d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C8921W3 m78889d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34740Nj4.activity_inventory_count, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m78892a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f40313a;
    }
}
