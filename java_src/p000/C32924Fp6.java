package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
/* renamed from: Fp6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32924Fp6 {

    /* renamed from: a */
    public final View f10273a;

    /* renamed from: b */
    public final WindowManager f10274b;

    /* renamed from: d */
    public final FrameLayout f10276d;

    /* renamed from: c */
    public final WindowManager.LayoutParams f10275c = m106434d();

    /* renamed from: e */
    public final ViewGroup.LayoutParams f10277e = m106435c();

    public C32924Fp6(Context context, View view) {
        this.f10273a = view;
        this.f10274b = (WindowManager) context.getSystemService("window");
        this.f10276d = new FrameLayout(context);
    }

    /* renamed from: c */
    public static ViewGroup.LayoutParams m106435c() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    /* renamed from: d */
    public static WindowManager.LayoutParams m106434d() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 1000, 16777752, -3);
        layoutParams.setTitle("ViewRenderableWindow");
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m106433e() {
        if (this.f10276d.getParent() == null && this.f10273a.isAttachedToWindow()) {
            this.f10274b.addView(this.f10276d, this.f10275c);
        }
    }

    /* renamed from: b */
    public void m106436b(View view) {
        ViewParent parent = view.getParent();
        FrameLayout frameLayout = this.f10276d;
        if (parent == frameLayout) {
            return;
        }
        frameLayout.addView(view, this.f10277e);
    }

    /* renamed from: f */
    public void m106432f() {
        if (this.f10276d.getParent() != null) {
            this.f10274b.removeView(this.f10276d);
        }
    }

    /* renamed from: g */
    public void m106431g() {
        this.f10273a.post(new Runnable() { // from class: Ep6
            @Override // java.lang.Runnable
            public final void run() {
                C32924Fp6.this.m106433e();
            }
        });
    }

    /* renamed from: h */
    public void m106430h(View view) {
        ViewParent parent = view.getParent();
        FrameLayout frameLayout = this.f10276d;
        if (parent != frameLayout) {
            return;
        }
        frameLayout.removeView(view);
    }
}
