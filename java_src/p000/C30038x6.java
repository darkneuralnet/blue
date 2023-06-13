package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: x6 */
/* loaded from: classes3.dex */
public final class C30038x6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f117096a;

    /* renamed from: b */
    public final LinearProgressIndicator f117097b;

    /* renamed from: c */
    public final RecyclerView f117098c;

    public C30038x6(FrameLayout frameLayout, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView) {
        this.f117096a = frameLayout;
        this.f117097b = linearProgressIndicator;
        this.f117098c = recyclerView;
    }

    /* renamed from: a */
    public static C30038x6 m5852a(View view) {
        int i = C44062ki4.progressBar;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
        if (linearProgressIndicator != null) {
            i = C44062ki4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                return new C30038x6((FrameLayout) view, linearProgressIndicator, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C30038x6 m5850c(LayoutInflater layoutInflater) {
        return m5849d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C30038x6 m5849d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37080Xj4.activity_work_order_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m5852a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f117096a;
    }
}
