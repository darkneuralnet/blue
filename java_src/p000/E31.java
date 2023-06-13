package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: E31 */
/* loaded from: classes4.dex */
public final class E31 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f6898a;

    /* renamed from: b */
    public final FrameLayout f6899b;

    /* renamed from: c */
    public final Button f6900c;

    /* renamed from: d */
    public final LinearProgressIndicator f6901d;

    /* renamed from: e */
    public final RecyclerView f6902e;

    public E31(FrameLayout frameLayout, FrameLayout frameLayout2, Button button, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView) {
        this.f6898a = frameLayout;
        this.f6899b = frameLayout2;
        this.f6900c = button;
        this.f6901d = linearProgressIndicator;
        this.f6902e = recyclerView;
    }

    /* renamed from: a */
    public static E31 m109471a(View view) {
        int i = C51176wi4.buttonContainer;
        FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
        if (frameLayout != null) {
            i = C51176wi4.done;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C51176wi4.progressBar;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                if (linearProgressIndicator != null) {
                    i = C51176wi4.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                    if (recyclerView != null) {
                        return new E31((FrameLayout) view, frameLayout, button, linearProgressIndicator, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static E31 m109469c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C43489jk4.dialog_qc_auto_checks, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109471a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f6898a;
    }
}
