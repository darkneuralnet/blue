package p000;

import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: lC1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C44356lC1 implements AP5 {

    /* renamed from: a */
    public final TaskCompletionSource<String> f95709a;

    public C44356lC1(TaskCompletionSource<String> taskCompletionSource) {
        this.f95709a = taskCompletionSource;
    }

    @Override // p000.AP5
    /* renamed from: a */
    public boolean mo27682a(Exception exc) {
        return false;
    }

    @Override // p000.AP5
    /* renamed from: b */
    public boolean mo27681b(AbstractC45679nR3 abstractC45679nR3) {
        if (!abstractC45679nR3.m23769l() && !abstractC45679nR3.m23770k() && !abstractC45679nR3.m23772i()) {
            return false;
        }
        this.f95709a.trySetResult(abstractC45679nR3.mo23777d());
        return true;
    }
}
