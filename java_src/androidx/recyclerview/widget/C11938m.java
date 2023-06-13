package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
/* renamed from: androidx.recyclerview.widget.m */
/* loaded from: classes.dex */
public class C11938m {

    /* renamed from: b */
    public int f55568b;

    /* renamed from: c */
    public int f55569c;

    /* renamed from: d */
    public int f55570d;

    /* renamed from: e */
    public int f55571e;

    /* renamed from: h */
    public boolean f55574h;

    /* renamed from: i */
    public boolean f55575i;

    /* renamed from: a */
    public boolean f55567a = true;

    /* renamed from: f */
    public int f55572f = 0;

    /* renamed from: g */
    public int f55573g = 0;

    /* renamed from: a */
    public boolean m66177a(RecyclerView.C11872z c11872z) {
        int i = this.f55569c;
        return i >= 0 && i < c11872z.m66490b();
    }

    /* renamed from: b */
    public View m66176b(RecyclerView.C11866v c11866v) {
        View m66510o = c11866v.m66510o(this.f55569c);
        this.f55569c += this.f55570d;
        return m66510o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f55568b + ", mCurrentPosition=" + this.f55569c + ", mItemDirection=" + this.f55570d + ", mLayoutDirection=" + this.f55571e + ", mStartLine=" + this.f55572f + ", mEndLine=" + this.f55573g + CoreConstants.CURLY_RIGHT;
    }
}
