package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.widget.ContentLoadingProgressBar;
/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: b */
    public long f54301b;

    /* renamed from: c */
    public boolean f54302c;

    /* renamed from: d */
    public boolean f54303d;

    /* renamed from: e */
    public boolean f54304e;

    /* renamed from: f */
    public final Runnable f54305f;

    /* renamed from: g */
    public final Runnable f54306g;

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m67670c() {
        this.f54302c = false;
        this.f54301b = -1L;
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m67669d() {
        this.f54303d = false;
        if (!this.f54304e) {
            this.f54301b = System.currentTimeMillis();
            setVisibility(0);
        }
    }

    /* renamed from: e */
    public final void m67668e() {
        removeCallbacks(this.f54305f);
        removeCallbacks(this.f54306g);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m67668e();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m67668e();
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f54301b = -1L;
        this.f54302c = false;
        this.f54303d = false;
        this.f54304e = false;
        this.f54305f = new Runnable() { // from class: xA0
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.m67670c();
            }
        };
        this.f54306g = new Runnable() { // from class: yA0
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.m67669d();
            }
        };
    }
}
