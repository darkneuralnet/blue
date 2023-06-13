package p000;

import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: uZ8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49906uZ8 extends AbstractRunnableC39054cH8 {

    /* renamed from: c */
    public final /* synthetic */ AbstractRunnableC39054cH8 f112619c;

    /* renamed from: d */
    public final /* synthetic */ Oq9 f112620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49906uZ8(Oq9 oq9, TaskCompletionSource taskCompletionSource, AbstractRunnableC39054cH8 abstractRunnableC39054cH8) {
        super(taskCompletionSource);
        this.f112620d = oq9;
        this.f112619c = abstractRunnableC39054cH8;
    }

    @Override // p000.AbstractRunnableC39054cH8
    /* renamed from: b */
    public final void mo10054b() {
        Oq9.m91286m(this.f112620d, this.f112619c);
    }
}
