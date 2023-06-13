package p000;

import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: kC1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C43763kC1 implements AP5 {

    /* renamed from: a */
    public final C35201Pi6 f94069a;

    /* renamed from: b */
    public final TaskCompletionSource<AbstractC37749a52> f94070b;

    public C43763kC1(C35201Pi6 c35201Pi6, TaskCompletionSource<AbstractC37749a52> taskCompletionSource) {
        this.f94069a = c35201Pi6;
        this.f94070b = taskCompletionSource;
    }

    @Override // p000.AP5
    /* renamed from: a */
    public boolean mo27682a(Exception exc) {
        this.f94070b.trySetException(exc);
        return true;
    }

    @Override // p000.AP5
    /* renamed from: b */
    public boolean mo27681b(AbstractC45679nR3 abstractC45679nR3) {
        if (abstractC45679nR3.m23770k() && !this.f94069a.m89898f(abstractC45679nR3)) {
            this.f94070b.setResult(AbstractC37749a52.m71915a().mo71910b(abstractC45679nR3.mo23779b()).mo71908d(abstractC45679nR3.mo23778c()).mo71909c(abstractC45679nR3.mo23773h()).mo71911a());
            return true;
        }
        return false;
    }
}
