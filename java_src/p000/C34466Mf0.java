package p000;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import p000.AbstractC30391y0;
/* renamed from: Mf0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C34466Mf0 extends AbstractC30391y0 {

    /* renamed from: Mf0$a */
    /* loaded from: classes4.dex */
    public class C5339a extends AbstractC30391y0.C30403l {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC11834D f23363a;

        /* renamed from: b */
        public final /* synthetic */ C34823Ns6 f23364b;

        public C5339a(RecyclerView.AbstractC11834D abstractC11834D, C34823Ns6 c34823Ns6) {
            this.f23363a = abstractC11834D;
            this.f23364b = c34823Ns6;
        }

        @Override // p000.AbstractC30391y0.C30403l, p000.InterfaceC35291Ps6
        /* renamed from: b */
        public void mo4254b(View view) {
            C34466Mf0.this.m4268b(view);
            this.f23364b.m93242h(null);
            C34466Mf0.this.dispatchRemoveFinished(this.f23363a);
            C34466Mf0.this.f118565j.remove(this.f23363a);
            C34466Mf0.this.dispatchFinishedWhenDone();
        }

        @Override // p000.AbstractC30391y0.C30403l, p000.InterfaceC35291Ps6
        /* renamed from: c */
        public void mo4253c(View view) {
            C34466Mf0.this.dispatchRemoveStarting(this.f23363a);
        }
    }

    public C34466Mf0(Interpolator interpolator) {
        super(interpolator);
    }

    @Override // p000.AbstractC30391y0
    /* renamed from: g */
    public void mo4263g(RecyclerView.AbstractC11834D abstractC11834D) {
        C38790bq6.m62490e(abstractC11834D.itemView).m93236n(0.0f).m93248b(1.0f).m93244f(250L).m93243g(this.f118567l).m93242h(new AbstractC30391y0.C30401j(abstractC11834D)).m93240j(m4265e(abstractC11834D)).m93238l();
    }

    @Override // p000.AbstractC30391y0
    /* renamed from: j */
    public void mo4260j(RecyclerView.AbstractC11834D abstractC11834D) {
        C34823Ns6 m93243g = C38790bq6.m62490e(abstractC11834D.itemView).m93237m(abstractC11834D.itemView.getRootView().getWidth()).m93243g(this.f118567l);
        this.f118565j.add(abstractC11834D);
        m93243g.m93244f(250L).m93240j(m4264f(abstractC11834D)).m93242h(new C5339a(abstractC11834D, m93243g)).m93238l();
    }

    @Override // p000.AbstractC30391y0
    /* renamed from: k */
    public void mo4259k(RecyclerView.AbstractC11834D abstractC11834D) {
        View view = abstractC11834D.itemView;
        C38790bq6.m62500a1(view, view.getHeight());
        C38790bq6.m62444z0(abstractC11834D.itemView, 0.0f);
    }
}
