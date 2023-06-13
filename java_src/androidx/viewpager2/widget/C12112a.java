package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
/* renamed from: androidx.viewpager2.widget.a */
/* loaded from: classes.dex */
public final class C12112a extends ViewPager2.AbstractC12103i {

    /* renamed from: a */
    public final List<ViewPager2.AbstractC12103i> f56144a;

    public C12112a(int i) {
        this.f56144a = new ArrayList(i);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12103i
    /* renamed from: a */
    public void mo48696a(int i) {
        try {
            for (ViewPager2.AbstractC12103i abstractC12103i : this.f56144a) {
                abstractC12103i.mo48696a(i);
            }
        } catch (ConcurrentModificationException e) {
            m65644f(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12103i
    /* renamed from: b */
    public void mo48695b(int i, float f, int i2) {
        try {
            for (ViewPager2.AbstractC12103i abstractC12103i : this.f56144a) {
                abstractC12103i.mo48695b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m65644f(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12103i
    /* renamed from: c */
    public void mo224c(int i) {
        try {
            for (ViewPager2.AbstractC12103i abstractC12103i : this.f56144a) {
                abstractC12103i.mo224c(i);
            }
        } catch (ConcurrentModificationException e) {
            m65644f(e);
        }
    }

    /* renamed from: d */
    public void m65646d(ViewPager2.AbstractC12103i abstractC12103i) {
        this.f56144a.add(abstractC12103i);
    }

    /* renamed from: e */
    public void m65645e(ViewPager2.AbstractC12103i abstractC12103i) {
        this.f56144a.remove(abstractC12103i);
    }

    /* renamed from: f */
    public final void m65644f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }
}
