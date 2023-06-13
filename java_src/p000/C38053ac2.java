package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.widget.BatteryViewV2;
/* renamed from: ac2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38053ac2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f50713a;

    /* renamed from: b */
    public final RecyclerView f50714b;

    /* renamed from: c */
    public final BatteryViewV2 f50715c;

    /* renamed from: d */
    public final TextView f50716d;

    /* renamed from: e */
    public final TextView f50717e;

    /* renamed from: f */
    public final TextView f50718f;

    /* renamed from: g */
    public final ImageView f50719g;

    /* renamed from: h */
    public final TextView f50720h;

    /* renamed from: i */
    public final ImageView f50721i;

    /* renamed from: j */
    public final TextView f50722j;

    /* renamed from: k */
    public final ImageView f50723k;

    public C38053ac2(ConstraintLayout constraintLayout, RecyclerView recyclerView, BatteryViewV2 batteryViewV2, TextView textView, TextView textView2, TextView textView3, ImageView imageView, TextView textView4, ImageView imageView2, TextView textView5, ImageView imageView3) {
        this.f50713a = constraintLayout;
        this.f50714b = recyclerView;
        this.f50715c = batteryViewV2;
        this.f50716d = textView;
        this.f50717e = textView2;
        this.f50718f = textView3;
        this.f50719g = imageView;
        this.f50720h = textView4;
        this.f50721i = imageView2;
        this.f50722j = textView5;
        this.f50723k = imageView3;
    }

    /* renamed from: a */
    public static C38053ac2 m71098a(View view) {
        int i = C45248mi4.badges;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null) {
            i = C45248mi4.battery;
            BatteryViewV2 batteryViewV2 = (BatteryViewV2) C34328Lp6.m96312a(view, i);
            if (batteryViewV2 != null) {
                i = C45248mi4.batteryText;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C45248mi4.code;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C45248mi4.markerLabel;
                        TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView3 != null) {
                            i = C45248mi4.rating;
                            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                            if (imageView != null) {
                                i = C45248mi4.ratingText;
                                TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView4 != null) {
                                    i = C45248mi4.signal;
                                    ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                    if (imageView2 != null) {
                                        i = C45248mi4.signalText;
                                        TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                                        if (textView5 != null) {
                                            i = C45248mi4.vehicleImage;
                                            ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                                            if (imageView3 != null) {
                                                return new C38053ac2((ConstraintLayout) view, recyclerView, batteryViewV2, textView, textView2, textView3, imageView, textView4, imageView2, textView5, imageView3);
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
    public ConstraintLayout getRoot() {
        return this.f50713a;
    }
}
