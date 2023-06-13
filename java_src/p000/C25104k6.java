package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import co.bird.android.app.feature.legacyrepair.startrepair.RepairDamageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: k6 */
/* loaded from: classes2.dex */
public final class C25104k6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f93891a;

    /* renamed from: b */
    public final TextView f93892b;

    /* renamed from: c */
    public final Button f93893c;

    /* renamed from: d */
    public final Button f93894d;

    /* renamed from: e */
    public final TextView f93895e;

    /* renamed from: f */
    public final Button f93896f;

    /* renamed from: g */
    public final LinearProgressIndicator f93897g;

    /* renamed from: h */
    public final RepairDamageView f93898h;

    /* renamed from: i */
    public final TextView f93899i;

    /* renamed from: j */
    public final Button f93900j;

    /* renamed from: k */
    public final ImageView f93901k;

    public C25104k6(FrameLayout frameLayout, TextView textView, Button button, Button button2, TextView textView2, Button button3, LinearProgressIndicator linearProgressIndicator, RepairDamageView repairDamageView, TextView textView3, Button button4, ImageView imageView) {
        this.f93891a = frameLayout;
        this.f93892b = textView;
        this.f93893c = button;
        this.f93894d = button2;
        this.f93895e = textView2;
        this.f93896f = button3;
        this.f93897g = linearProgressIndicator;
        this.f93898h = repairDamageView;
        this.f93899i = textView3;
        this.f93900j = button4;
        this.f93901k = imageView;
    }

    /* renamed from: a */
    public static C25104k6 m29313a(View view) {
        int i = C36585Vg4.birdCode;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.cancelTask;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C36585Vg4.cantFix;
                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                if (button2 != null) {
                    i = C36585Vg4.header;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C36585Vg4.markRepaired;
                        Button button3 = (Button) C34328Lp6.m96312a(view, i);
                        if (button3 != null) {
                            i = C36585Vg4.progressBar;
                            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                            if (linearProgressIndicator != null) {
                                i = C36585Vg4.repairDamage;
                                RepairDamageView repairDamageView = (RepairDamageView) C34328Lp6.m96312a(view, i);
                                if (repairDamageView != null) {
                                    i = C36585Vg4.repairMessage;
                                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                    if (textView3 != null) {
                                        i = C36585Vg4.startOver;
                                        Button button4 = (Button) C34328Lp6.m96312a(view, i);
                                        if (button4 != null) {
                                            i = C36585Vg4.wrench;
                                            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                            if (imageView != null) {
                                                return new C25104k6((FrameLayout) view, textView, button, button2, textView2, button3, linearProgressIndicator, repairDamageView, textView3, button4, imageView);
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
    public static C25104k6 m29311c(LayoutInflater layoutInflater) {
        return m29310d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C25104k6 m29310d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_start_repair, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m29313a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f93891a;
    }
}
