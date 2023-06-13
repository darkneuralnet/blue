package p000;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: Zq6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37613Zq6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f49383a;

    /* renamed from: b */
    public final Button f49384b;

    /* renamed from: c */
    public final Button f49385c;

    /* renamed from: d */
    public final RecyclerView f49386d;

    /* renamed from: e */
    public final Button f49387e;

    public C37613Zq6(View view, Button button, Button button2, RecyclerView recyclerView, Button button3) {
        this.f49383a = view;
        this.f49384b = button;
        this.f49385c = button2;
        this.f49386d = recyclerView;
        this.f49387e = button3;
    }

    /* renamed from: a */
    public static C37613Zq6 m72400a(View view) {
        int i = C45841ni4.primary;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C45841ni4.questions;
            Button button2 = (Button) C34328Lp6.m96312a(view, i);
            if (button2 != null) {
                i = C45841ni4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    i = C45841ni4.share;
                    Button button3 = (Button) C34328Lp6.m96312a(view, i);
                    if (button3 != null) {
                        return new C37613Zq6(view, button, button2, recyclerView, button3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f49383a;
    }
}
