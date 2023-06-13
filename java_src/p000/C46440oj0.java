package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
/* renamed from: oj0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46440oj0 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f102403a;

    /* renamed from: b */
    public final ImageView f102404b;

    /* renamed from: c */
    public final TextView f102405c;

    /* renamed from: d */
    public final Group f102406d;

    /* renamed from: e */
    public final CircularProgressIndicator f102407e;

    /* renamed from: f */
    public final RecyclerView f102408f;

    public C46440oj0(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, Group group, CircularProgressIndicator circularProgressIndicator, RecyclerView recyclerView) {
        this.f102403a = constraintLayout;
        this.f102404b = imageView;
        this.f102405c = textView;
        this.f102406d = group;
        this.f102407e = circularProgressIndicator;
        this.f102408f = recyclerView;
    }

    /* renamed from: a */
    public static C46440oj0 m20563a(View view) {
        int i = C33093Gi4.emptyPayloadImage;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            i = C33093Gi4.emptyPayloadTextView;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C33093Gi4.emptyStateGroup;
                Group group = (Group) C34328Lp6.m96312a(view, i);
                if (group != null) {
                    i = C33093Gi4.loadingProgress;
                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
                    if (circularProgressIndicator != null) {
                        i = C33093Gi4.payloadRecyclerView;
                        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                        if (recyclerView != null) {
                            return new C46440oj0((ConstraintLayout) view, imageView, textView, group, circularProgressIndicator, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C46440oj0 m20561c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C48825sk4.chucker_fragment_transaction_payload, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20563a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f102403a;
    }
}
