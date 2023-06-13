package p000;

import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.AbstractC11952u;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: y0 */
/* loaded from: classes4.dex */
public abstract class AbstractC30391y0 extends AbstractC11952u {

    /* renamed from: a */
    public final ArrayList<RecyclerView.AbstractC11834D> f118556a;

    /* renamed from: b */
    public final ArrayList<RecyclerView.AbstractC11834D> f118557b;

    /* renamed from: c */
    public final ArrayList<C30402k> f118558c;

    /* renamed from: d */
    public final ArrayList<C30400i> f118559d;

    /* renamed from: e */
    public final ArrayList<ArrayList<RecyclerView.AbstractC11834D>> f118560e;

    /* renamed from: f */
    public final ArrayList<ArrayList<C30402k>> f118561f;

    /* renamed from: g */
    public final ArrayList<ArrayList<C30400i>> f118562g;

    /* renamed from: h */
    public final ArrayList<RecyclerView.AbstractC11834D> f118563h;

    /* renamed from: i */
    public final ArrayList<RecyclerView.AbstractC11834D> f118564i;

    /* renamed from: j */
    public final ArrayList<RecyclerView.AbstractC11834D> f118565j;

    /* renamed from: k */
    public final ArrayList<RecyclerView.AbstractC11834D> f118566k;

    /* renamed from: l */
    public Interpolator f118567l;

    /* renamed from: y0$a */
    /* loaded from: classes4.dex */
    public class RunnableC30392a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ArrayList f118568b;

        public RunnableC30392a(ArrayList arrayList) {
            this.f118568b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f118568b.iterator();
            while (it.hasNext()) {
                C30402k c30402k = (C30402k) it.next();
                AbstractC30391y0.this.m4261i(c30402k.f118600a, c30402k.f118601b, c30402k.f118602c, c30402k.f118603d, c30402k.f118604e);
            }
            this.f118568b.clear();
            AbstractC30391y0.this.f118561f.remove(this.f118568b);
        }
    }

    /* renamed from: y0$b */
    /* loaded from: classes4.dex */
    public class RunnableC30393b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ArrayList f118570b;

        public RunnableC30393b(ArrayList arrayList) {
            this.f118570b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f118570b.iterator();
            while (it.hasNext()) {
                AbstractC30391y0.this.m4262h((C30400i) it.next());
            }
            this.f118570b.clear();
            AbstractC30391y0.this.f118562g.remove(this.f118570b);
        }
    }

    /* renamed from: y0$c */
    /* loaded from: classes4.dex */
    public class RunnableC30394c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ArrayList f118572b;

        public RunnableC30394c(ArrayList arrayList) {
            this.f118572b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f118572b.iterator();
            while (it.hasNext()) {
                AbstractC30391y0.this.mo4263g((RecyclerView.AbstractC11834D) it.next());
            }
            this.f118572b.clear();
            AbstractC30391y0.this.f118560e.remove(this.f118572b);
        }
    }

    /* renamed from: y0$d */
    /* loaded from: classes4.dex */
    public class C30395d extends C30403l {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC11834D f118574a;

        /* renamed from: b */
        public final /* synthetic */ C34823Ns6 f118575b;

        public C30395d(RecyclerView.AbstractC11834D abstractC11834D, C34823Ns6 c34823Ns6) {
            this.f118574a = abstractC11834D;
            this.f118575b = c34823Ns6;
        }

        @Override // p000.AbstractC30391y0.C30403l, p000.InterfaceC35291Ps6
        /* renamed from: b */
        public void mo4254b(View view) {
            this.f118575b.m93242h(null);
            C38790bq6.m62444z0(view, 1.0f);
            AbstractC30391y0.this.dispatchRemoveFinished(this.f118574a);
            AbstractC30391y0.this.f118565j.remove(this.f118574a);
            AbstractC30391y0.this.dispatchFinishedWhenDone();
        }

        @Override // p000.AbstractC30391y0.C30403l, p000.InterfaceC35291Ps6
        /* renamed from: c */
        public void mo4253c(View view) {
            AbstractC30391y0.this.dispatchRemoveStarting(this.f118574a);
        }
    }

    /* renamed from: y0$e */
    /* loaded from: classes4.dex */
    public class C30396e extends C30403l {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC11834D f118577a;

        /* renamed from: b */
        public final /* synthetic */ C34823Ns6 f118578b;

        public C30396e(RecyclerView.AbstractC11834D abstractC11834D, C34823Ns6 c34823Ns6) {
            this.f118577a = abstractC11834D;
            this.f118578b = c34823Ns6;
        }

        @Override // p000.AbstractC30391y0.C30403l, p000.InterfaceC35291Ps6
        /* renamed from: a */
        public void mo4255a(View view) {
            C38790bq6.m62444z0(view, 1.0f);
        }

        @Override // p000.AbstractC30391y0.C30403l, p000.InterfaceC35291Ps6
        /* renamed from: b */
        public void mo4254b(View view) {
            this.f118578b.m93242h(null);
            AbstractC30391y0.this.dispatchAddFinished(this.f118577a);
            AbstractC30391y0.this.f118563h.remove(this.f118577a);
            AbstractC30391y0.this.dispatchFinishedWhenDone();
        }

        @Override // p000.AbstractC30391y0.C30403l, p000.InterfaceC35291Ps6
        /* renamed from: c */
        public void mo4253c(View view) {
            AbstractC30391y0.this.dispatchAddStarting(this.f118577a);
        }
    }

    /* renamed from: y0$f */
    /* loaded from: classes4.dex */
    public class C30397f extends C30403l {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC11834D f118580a;

        /* renamed from: b */
        public final /* synthetic */ int f118581b;

        /* renamed from: c */
        public final /* synthetic */ int f118582c;

        /* renamed from: d */
        public final /* synthetic */ C34823Ns6 f118583d;

        public C30397f(RecyclerView.AbstractC11834D abstractC11834D, int i, int i2, C34823Ns6 c34823Ns6) {
            this.f118580a = abstractC11834D;
            this.f118581b = i;
            this.f118582c = i2;
            this.f118583d = c34823Ns6;
        }

        @Override // p000.AbstractC30391y0.C30403l, p000.InterfaceC35291Ps6
        /* renamed from: a */
        public void mo4255a(View view) {
            if (this.f118581b != 0) {
                C38790bq6.m62503Z0(view, 0.0f);
            }
            if (this.f118582c != 0) {
                C38790bq6.m62500a1(view, 0.0f);
            }
        }

        @Override // p000.AbstractC30391y0.C30403l, p000.InterfaceC35291Ps6
        /* renamed from: b */
        public void mo4254b(View view) {
            this.f118583d.m93242h(null);
            AbstractC30391y0.this.dispatchMoveFinished(this.f118580a);
            AbstractC30391y0.this.f118564i.remove(this.f118580a);
            AbstractC30391y0.this.dispatchFinishedWhenDone();
        }

        @Override // p000.AbstractC30391y0.C30403l, p000.InterfaceC35291Ps6
        /* renamed from: c */
        public void mo4253c(View view) {
            AbstractC30391y0.this.dispatchMoveStarting(this.f118580a);
        }
    }

    /* renamed from: y0$g */
    /* loaded from: classes4.dex */
    public class C30398g extends C30403l {

        /* renamed from: a */
        public final /* synthetic */ C30400i f118585a;

        /* renamed from: b */
        public final /* synthetic */ C34823Ns6 f118586b;

        public C30398g(C30400i c30400i, C34823Ns6 c34823Ns6) {
            this.f118585a = c30400i;
            this.f118586b = c34823Ns6;
        }

        @Override // p000.AbstractC30391y0.C30403l, p000.InterfaceC35291Ps6
        /* renamed from: b */
        public void mo4254b(View view) {
            this.f118586b.m93242h(null);
            C38790bq6.m62444z0(view, 1.0f);
            C38790bq6.m62503Z0(view, 0.0f);
            C38790bq6.m62500a1(view, 0.0f);
            AbstractC30391y0.this.dispatchChangeFinished(this.f118585a.f118592a, true);
            AbstractC30391y0.this.f118566k.remove(this.f118585a.f118592a);
            AbstractC30391y0.this.dispatchFinishedWhenDone();
        }

        @Override // p000.AbstractC30391y0.C30403l, p000.InterfaceC35291Ps6
        /* renamed from: c */
        public void mo4253c(View view) {
            AbstractC30391y0.this.dispatchChangeStarting(this.f118585a.f118592a, true);
        }
    }

    /* renamed from: y0$h */
    /* loaded from: classes4.dex */
    public class C30399h extends C30403l {

        /* renamed from: a */
        public final /* synthetic */ C30400i f118588a;

        /* renamed from: b */
        public final /* synthetic */ C34823Ns6 f118589b;

        /* renamed from: c */
        public final /* synthetic */ View f118590c;

        public C30399h(C30400i c30400i, C34823Ns6 c34823Ns6, View view) {
            this.f118588a = c30400i;
            this.f118589b = c34823Ns6;
            this.f118590c = view;
        }

        @Override // p000.AbstractC30391y0.C30403l, p000.InterfaceC35291Ps6
        /* renamed from: b */
        public void mo4254b(View view) {
            this.f118589b.m93242h(null);
            C38790bq6.m62444z0(this.f118590c, 1.0f);
            C38790bq6.m62503Z0(this.f118590c, 0.0f);
            C38790bq6.m62500a1(this.f118590c, 0.0f);
            AbstractC30391y0.this.dispatchChangeFinished(this.f118588a.f118593b, false);
            AbstractC30391y0.this.f118566k.remove(this.f118588a.f118593b);
            AbstractC30391y0.this.dispatchFinishedWhenDone();
        }

        @Override // p000.AbstractC30391y0.C30403l, p000.InterfaceC35291Ps6
        /* renamed from: c */
        public void mo4253c(View view) {
            AbstractC30391y0.this.dispatchChangeStarting(this.f118588a.f118593b, false);
        }
    }

    /* renamed from: y0$i */
    /* loaded from: classes4.dex */
    public static class C30400i {

        /* renamed from: a */
        public RecyclerView.AbstractC11834D f118592a;

        /* renamed from: b */
        public RecyclerView.AbstractC11834D f118593b;

        /* renamed from: c */
        public int f118594c;

        /* renamed from: d */
        public int f118595d;

        /* renamed from: e */
        public int f118596e;

        /* renamed from: f */
        public int f118597f;

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f118592a + ", newHolder=" + this.f118593b + ", fromX=" + this.f118594c + ", fromY=" + this.f118595d + ", toX=" + this.f118596e + ", toY=" + this.f118597f + CoreConstants.CURLY_RIGHT;
        }

        public C30400i(RecyclerView.AbstractC11834D abstractC11834D, RecyclerView.AbstractC11834D abstractC11834D2) {
            this.f118592a = abstractC11834D;
            this.f118593b = abstractC11834D2;
        }

        public C30400i(RecyclerView.AbstractC11834D abstractC11834D, RecyclerView.AbstractC11834D abstractC11834D2, int i, int i2, int i3, int i4) {
            this(abstractC11834D, abstractC11834D2);
            this.f118594c = i;
            this.f118595d = i2;
            this.f118596e = i3;
            this.f118597f = i4;
        }
    }

    /* renamed from: y0$j */
    /* loaded from: classes4.dex */
    public class C30401j extends C30403l {

        /* renamed from: a */
        public final RecyclerView.AbstractC11834D f118598a;

        public C30401j(RecyclerView.AbstractC11834D abstractC11834D) {
            this.f118598a = abstractC11834D;
        }

        @Override // p000.AbstractC30391y0.C30403l, p000.InterfaceC35291Ps6
        /* renamed from: a */
        public void mo4255a(View view) {
            AbstractC30391y0.this.m4268b(view);
        }

        @Override // p000.AbstractC30391y0.C30403l, p000.InterfaceC35291Ps6
        /* renamed from: b */
        public void mo4254b(View view) {
            AbstractC30391y0.this.m4268b(view);
            AbstractC30391y0.this.dispatchAddFinished(this.f118598a);
            AbstractC30391y0.this.f118563h.remove(this.f118598a);
            AbstractC30391y0.this.dispatchFinishedWhenDone();
        }

        @Override // p000.AbstractC30391y0.C30403l, p000.InterfaceC35291Ps6
        /* renamed from: c */
        public void mo4253c(View view) {
            AbstractC30391y0.this.dispatchAddStarting(this.f118598a);
        }
    }

    /* renamed from: y0$k */
    /* loaded from: classes4.dex */
    public static class C30402k {

        /* renamed from: a */
        public final RecyclerView.AbstractC11834D f118600a;

        /* renamed from: b */
        public final int f118601b;

        /* renamed from: c */
        public final int f118602c;

        /* renamed from: d */
        public final int f118603d;

        /* renamed from: e */
        public final int f118604e;

        public C30402k(RecyclerView.AbstractC11834D abstractC11834D, int i, int i2, int i3, int i4) {
            this.f118600a = abstractC11834D;
            this.f118601b = i;
            this.f118602c = i2;
            this.f118603d = i3;
            this.f118604e = i4;
        }
    }

    /* renamed from: y0$l */
    /* loaded from: classes4.dex */
    public static class C30403l implements InterfaceC35291Ps6 {
        @Override // p000.InterfaceC35291Ps6
        /* renamed from: a */
        public void mo4255a(View view) {
        }

        @Override // p000.InterfaceC35291Ps6
        /* renamed from: b */
        public void mo4254b(View view) {
        }

        @Override // p000.InterfaceC35291Ps6
        /* renamed from: c */
        public void mo4253c(View view) {
        }
    }

    public AbstractC30391y0() {
        this.f118556a = new ArrayList<>();
        this.f118557b = new ArrayList<>();
        this.f118558c = new ArrayList<>();
        this.f118559d = new ArrayList<>();
        this.f118560e = new ArrayList<>();
        this.f118561f = new ArrayList<>();
        this.f118562g = new ArrayList<>();
        this.f118563h = new ArrayList<>();
        this.f118564i = new ArrayList<>();
        this.f118565j = new ArrayList<>();
        this.f118566k = new ArrayList<>();
        this.f118567l = new LinearInterpolator();
        setSupportsChangeAnimations(true);
    }

    @Override // androidx.recyclerview.widget.AbstractC11952u
    public boolean animateAdd(RecyclerView.AbstractC11834D abstractC11834D) {
        resetAnimation(abstractC11834D);
        m4257m(abstractC11834D);
        this.f118557b.add(abstractC11834D);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC11952u
    public boolean animateChange(RecyclerView.AbstractC11834D abstractC11834D, RecyclerView.AbstractC11834D abstractC11834D2, int i, int i2, int i3, int i4) {
        if (abstractC11834D == abstractC11834D2) {
            return animateMove(abstractC11834D, i, i2, i3, i4);
        }
        float m62528N = C38790bq6.m62528N(abstractC11834D.itemView);
        float m62526O = C38790bq6.m62526O(abstractC11834D.itemView);
        float m62459s = C38790bq6.m62459s(abstractC11834D.itemView);
        resetAnimation(abstractC11834D);
        int i5 = (int) ((i3 - i) - m62528N);
        int i6 = (int) ((i4 - i2) - m62526O);
        C38790bq6.m62503Z0(abstractC11834D.itemView, m62528N);
        C38790bq6.m62500a1(abstractC11834D.itemView, m62526O);
        C38790bq6.m62444z0(abstractC11834D.itemView, m62459s);
        if (abstractC11834D2 != null) {
            resetAnimation(abstractC11834D2);
            C38790bq6.m62503Z0(abstractC11834D2.itemView, -i5);
            C38790bq6.m62500a1(abstractC11834D2.itemView, -i6);
            C38790bq6.m62444z0(abstractC11834D2.itemView, 0.0f);
        }
        this.f118559d.add(new C30400i(abstractC11834D, abstractC11834D2, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC11952u
    public boolean animateMove(RecyclerView.AbstractC11834D abstractC11834D, int i, int i2, int i3, int i4) {
        View view = abstractC11834D.itemView;
        int m62528N = (int) (i + C38790bq6.m62528N(view));
        int m62526O = (int) (i2 + C38790bq6.m62526O(abstractC11834D.itemView));
        resetAnimation(abstractC11834D);
        int i5 = i3 - m62528N;
        int i6 = i4 - m62526O;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(abstractC11834D);
            return false;
        }
        if (i5 != 0) {
            C38790bq6.m62503Z0(view, -i5);
        }
        if (i6 != 0) {
            C38790bq6.m62500a1(view, -i6);
        }
        this.f118558c.add(new C30402k(abstractC11834D, m62528N, m62526O, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC11952u
    public boolean animateRemove(RecyclerView.AbstractC11834D abstractC11834D) {
        resetAnimation(abstractC11834D);
        m4256n(abstractC11834D);
        this.f118556a.add(abstractC11834D);
        return true;
    }

    /* renamed from: b */
    public void m4268b(View view) {
        C38790bq6.m62444z0(view, 1.0f);
        C38790bq6.m62513U0(view, 1.0f);
        C38790bq6.m62515T0(view, 1.0f);
        C38790bq6.m62500a1(view, 0.0f);
        C38790bq6.m62503Z0(view, 0.0f);
        C38790bq6.m62521Q0(view, 0.0f);
        C38790bq6.m62517S0(view, 0.0f);
        C38790bq6.m62519R0(view, 0.0f);
        C38790bq6.m62525O0(view, view.getMeasuredHeight() / 2);
        C38790bq6.m62527N0(view, view.getMeasuredWidth() / 2);
        C38790bq6.m62490e(view).m93243g(null).m93240j(0L);
    }

    /* renamed from: c */
    public final void m4267c(C30400i c30400i) {
        RecyclerView.AbstractC11834D abstractC11834D = c30400i.f118592a;
        if (abstractC11834D != null) {
            m4266d(c30400i, abstractC11834D);
        }
        RecyclerView.AbstractC11834D abstractC11834D2 = c30400i.f118593b;
        if (abstractC11834D2 != null) {
            m4266d(c30400i, abstractC11834D2);
        }
    }

    public void cancelAll(List<RecyclerView.AbstractC11834D> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C38790bq6.m62490e(list.get(size).itemView).m93247c();
        }
    }

    /* renamed from: d */
    public final boolean m4266d(C30400i c30400i, RecyclerView.AbstractC11834D abstractC11834D) {
        boolean z = false;
        if (c30400i.f118593b == abstractC11834D) {
            c30400i.f118593b = null;
        } else if (c30400i.f118592a != abstractC11834D) {
            return false;
        } else {
            c30400i.f118592a = null;
            z = true;
        }
        C38790bq6.m62444z0(abstractC11834D.itemView, 1.0f);
        C38790bq6.m62503Z0(abstractC11834D.itemView, 0.0f);
        C38790bq6.m62500a1(abstractC11834D.itemView, 0.0f);
        dispatchChangeFinished(abstractC11834D, z);
        return true;
    }

    public void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    /* renamed from: e */
    public long m4265e(RecyclerView.AbstractC11834D abstractC11834D) {
        return Math.abs((abstractC11834D.getAdapterPosition() * getAddDuration()) / 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11849m
    public void endAnimation(RecyclerView.AbstractC11834D abstractC11834D) {
        View view = abstractC11834D.itemView;
        C38790bq6.m62490e(view).m93247c();
        int size = this.f118558c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f118558c.get(size).f118600a == abstractC11834D) {
                C38790bq6.m62500a1(view, 0.0f);
                C38790bq6.m62503Z0(view, 0.0f);
                dispatchMoveFinished(abstractC11834D);
                this.f118558c.remove(size);
            }
        }
        endChangeAnimation(this.f118559d, abstractC11834D);
        if (this.f118556a.remove(abstractC11834D)) {
            C38790bq6.m62444z0(view, 1.0f);
            dispatchRemoveFinished(abstractC11834D);
        }
        if (this.f118557b.remove(abstractC11834D)) {
            C38790bq6.m62444z0(view, 1.0f);
            dispatchAddFinished(abstractC11834D);
        }
        for (int size2 = this.f118562g.size() - 1; size2 >= 0; size2--) {
            ArrayList<C30400i> arrayList = this.f118562g.get(size2);
            endChangeAnimation(arrayList, abstractC11834D);
            if (arrayList.isEmpty()) {
                this.f118562g.remove(size2);
            }
        }
        for (int size3 = this.f118561f.size() - 1; size3 >= 0; size3--) {
            ArrayList<C30402k> arrayList2 = this.f118561f.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f118600a == abstractC11834D) {
                    C38790bq6.m62500a1(view, 0.0f);
                    C38790bq6.m62503Z0(view, 0.0f);
                    dispatchMoveFinished(abstractC11834D);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f118561f.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f118560e.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC11834D> arrayList3 = this.f118560e.get(size5);
            if (arrayList3.remove(abstractC11834D)) {
                C38790bq6.m62444z0(view, 1.0f);
                dispatchAddFinished(abstractC11834D);
                if (arrayList3.isEmpty()) {
                    this.f118560e.remove(size5);
                }
            }
        }
        this.f118565j.remove(abstractC11834D);
        this.f118563h.remove(abstractC11834D);
        this.f118566k.remove(abstractC11834D);
        this.f118564i.remove(abstractC11834D);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11849m
    public void endAnimations() {
        int size = this.f118558c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C30402k c30402k = this.f118558c.get(size);
            View view = c30402k.f118600a.itemView;
            C38790bq6.m62500a1(view, 0.0f);
            C38790bq6.m62503Z0(view, 0.0f);
            dispatchMoveFinished(c30402k.f118600a);
            this.f118558c.remove(size);
        }
        for (int size2 = this.f118556a.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.f118556a.get(size2));
            this.f118556a.remove(size2);
        }
        int size3 = this.f118557b.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC11834D abstractC11834D = this.f118557b.get(size3);
            C38790bq6.m62444z0(abstractC11834D.itemView, 1.0f);
            dispatchAddFinished(abstractC11834D);
            this.f118557b.remove(size3);
        }
        for (int size4 = this.f118559d.size() - 1; size4 >= 0; size4--) {
            m4267c(this.f118559d.get(size4));
        }
        this.f118559d.clear();
        if (!isRunning()) {
            return;
        }
        for (int size5 = this.f118561f.size() - 1; size5 >= 0; size5--) {
            ArrayList<C30402k> arrayList = this.f118561f.get(size5);
            for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                C30402k c30402k2 = arrayList.get(size6);
                View view2 = c30402k2.f118600a.itemView;
                C38790bq6.m62500a1(view2, 0.0f);
                C38790bq6.m62503Z0(view2, 0.0f);
                dispatchMoveFinished(c30402k2.f118600a);
                arrayList.remove(size6);
                if (arrayList.isEmpty()) {
                    this.f118561f.remove(arrayList);
                }
            }
        }
        for (int size7 = this.f118560e.size() - 1; size7 >= 0; size7--) {
            ArrayList<RecyclerView.AbstractC11834D> arrayList2 = this.f118560e.get(size7);
            for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                RecyclerView.AbstractC11834D abstractC11834D2 = arrayList2.get(size8);
                C38790bq6.m62444z0(abstractC11834D2.itemView, 1.0f);
                dispatchAddFinished(abstractC11834D2);
                arrayList2.remove(size8);
                if (arrayList2.isEmpty()) {
                    this.f118560e.remove(arrayList2);
                }
            }
        }
        for (int size9 = this.f118562g.size() - 1; size9 >= 0; size9--) {
            ArrayList<C30400i> arrayList3 = this.f118562g.get(size9);
            for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                m4267c(arrayList3.get(size10));
                if (arrayList3.isEmpty()) {
                    this.f118562g.remove(arrayList3);
                }
            }
        }
        cancelAll(this.f118565j);
        cancelAll(this.f118564i);
        cancelAll(this.f118563h);
        cancelAll(this.f118566k);
        dispatchAnimationsFinished();
    }

    public final void endChangeAnimation(List<C30400i> list, RecyclerView.AbstractC11834D abstractC11834D) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C30400i c30400i = list.get(size);
            if (m4266d(c30400i, abstractC11834D) && c30400i.f118592a == null && c30400i.f118593b == null) {
                list.remove(c30400i);
            }
        }
    }

    /* renamed from: f */
    public long m4264f(RecyclerView.AbstractC11834D abstractC11834D) {
        return Math.abs((abstractC11834D.getOldPosition() * getRemoveDuration()) / 4);
    }

    /* renamed from: g */
    public void mo4263g(RecyclerView.AbstractC11834D abstractC11834D) {
        C34823Ns6 m62490e = C38790bq6.m62490e(abstractC11834D.itemView);
        this.f118563h.add(abstractC11834D);
        m62490e.m93248b(1.0f).m93244f(getAddDuration()).m93242h(new C30396e(abstractC11834D, m62490e)).m93238l();
    }

    /* renamed from: h */
    public final void m4262h(C30400i c30400i) {
        View view;
        RecyclerView.AbstractC11834D abstractC11834D = c30400i.f118592a;
        View view2 = null;
        if (abstractC11834D == null) {
            view = null;
        } else {
            view = abstractC11834D.itemView;
        }
        RecyclerView.AbstractC11834D abstractC11834D2 = c30400i.f118593b;
        if (abstractC11834D2 != null) {
            view2 = abstractC11834D2.itemView;
        }
        if (view != null) {
            C34823Ns6 m93244f = C38790bq6.m62490e(view).m93244f(getChangeDuration());
            this.f118566k.add(c30400i.f118592a);
            m93244f.m93237m(c30400i.f118596e - c30400i.f118594c);
            m93244f.m93236n(c30400i.f118597f - c30400i.f118595d);
            m93244f.m93248b(0.0f).m93242h(new C30398g(c30400i, m93244f)).m93238l();
        }
        if (view2 != null) {
            C34823Ns6 m62490e = C38790bq6.m62490e(view2);
            this.f118566k.add(c30400i.f118593b);
            m62490e.m93237m(0.0f).m93236n(0.0f).m93244f(getChangeDuration()).m93248b(1.0f).m93242h(new C30399h(c30400i, m62490e, view2)).m93238l();
        }
    }

    /* renamed from: i */
    public void m4261i(RecyclerView.AbstractC11834D abstractC11834D, int i, int i2, int i3, int i4) {
        View view = abstractC11834D.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            C38790bq6.m62490e(view).m93237m(0.0f);
        }
        if (i6 != 0) {
            C38790bq6.m62490e(view).m93236n(0.0f);
        }
        C34823Ns6 m62490e = C38790bq6.m62490e(view);
        this.f118564i.add(abstractC11834D);
        m62490e.m93244f(getMoveDuration()).m93242h(new C30397f(abstractC11834D, i5, i6, m62490e)).m93238l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11849m
    public boolean isRunning() {
        if (this.f118557b.isEmpty() && this.f118559d.isEmpty() && this.f118558c.isEmpty() && this.f118556a.isEmpty() && this.f118564i.isEmpty() && this.f118565j.isEmpty() && this.f118563h.isEmpty() && this.f118566k.isEmpty() && this.f118561f.isEmpty() && this.f118560e.isEmpty() && this.f118562g.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public void mo4260j(RecyclerView.AbstractC11834D abstractC11834D) {
        C34823Ns6 m62490e = C38790bq6.m62490e(abstractC11834D.itemView);
        this.f118565j.add(abstractC11834D);
        m62490e.m93244f(getRemoveDuration()).m93248b(0.0f).m93242h(new C30395d(abstractC11834D, m62490e)).m93238l();
    }

    /* renamed from: k */
    public void mo4259k(RecyclerView.AbstractC11834D abstractC11834D) {
    }

    /* renamed from: l */
    public void m4258l(RecyclerView.AbstractC11834D abstractC11834D) {
    }

    /* renamed from: m */
    public final void m4257m(RecyclerView.AbstractC11834D abstractC11834D) {
        m4268b(abstractC11834D.itemView);
        mo4259k(abstractC11834D);
    }

    /* renamed from: n */
    public final void m4256n(RecyclerView.AbstractC11834D abstractC11834D) {
        m4268b(abstractC11834D.itemView);
        m4258l(abstractC11834D);
    }

    public final void resetAnimation(RecyclerView.AbstractC11834D abstractC11834D) {
        endAnimation(abstractC11834D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11849m
    public void runPendingAnimations() {
        long j;
        long j2;
        boolean z = !this.f118556a.isEmpty();
        boolean z2 = !this.f118558c.isEmpty();
        boolean z3 = !this.f118559d.isEmpty();
        boolean z4 = !this.f118557b.isEmpty();
        if (!z && !z2 && !z4 && !z3) {
            return;
        }
        Iterator<RecyclerView.AbstractC11834D> it = this.f118556a.iterator();
        while (it.hasNext()) {
            mo4260j(it.next());
        }
        this.f118556a.clear();
        if (z2) {
            ArrayList<C30402k> arrayList = new ArrayList<>();
            arrayList.addAll(this.f118558c);
            this.f118561f.add(arrayList);
            this.f118558c.clear();
            RunnableC30392a runnableC30392a = new RunnableC30392a(arrayList);
            if (z) {
                C38790bq6.m62466o0(arrayList.get(0).f118600a.itemView, runnableC30392a, getRemoveDuration());
            } else {
                runnableC30392a.run();
            }
        }
        if (z3) {
            ArrayList<C30400i> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f118559d);
            this.f118562g.add(arrayList2);
            this.f118559d.clear();
            RunnableC30393b runnableC30393b = new RunnableC30393b(arrayList2);
            if (z) {
                C38790bq6.m62466o0(arrayList2.get(0).f118592a.itemView, runnableC30393b, getRemoveDuration());
            } else {
                runnableC30393b.run();
            }
        }
        if (z4) {
            ArrayList<RecyclerView.AbstractC11834D> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.f118557b);
            this.f118560e.add(arrayList3);
            this.f118557b.clear();
            RunnableC30394c runnableC30394c = new RunnableC30394c(arrayList3);
            if (!z && !z2 && !z3) {
                runnableC30394c.run();
                return;
            }
            long j3 = 0;
            if (z) {
                j = getRemoveDuration();
            } else {
                j = 0;
            }
            if (z2) {
                j2 = getMoveDuration();
            } else {
                j2 = 0;
            }
            if (z3) {
                j3 = getChangeDuration();
            }
            C38790bq6.m62466o0(arrayList3.get(0).itemView, runnableC30394c, j + Math.max(j2, j3));
        }
    }

    public AbstractC30391y0(Interpolator interpolator) {
        this.f118556a = new ArrayList<>();
        this.f118557b = new ArrayList<>();
        this.f118558c = new ArrayList<>();
        this.f118559d = new ArrayList<>();
        this.f118560e = new ArrayList<>();
        this.f118561f = new ArrayList<>();
        this.f118562g = new ArrayList<>();
        this.f118563h = new ArrayList<>();
        this.f118564i = new ArrayList<>();
        this.f118565j = new ArrayList<>();
        this.f118566k = new ArrayList<>();
        this.f118567l = new LinearInterpolator();
        setSupportsChangeAnimations(true);
        this.f118567l = interpolator;
    }
}
