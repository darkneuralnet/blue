package p000;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.IntegrityServiceException;
import com.google.android.play.integrity.internal.zzu;
/* renamed from: Dl9 */
/* loaded from: classes6.dex */
public final class Dl9 extends AbstractRunnableC39054cH8 {

    /* renamed from: c */
    public final /* synthetic */ byte[] f6298c;

    /* renamed from: d */
    public final /* synthetic */ Long f6299d;

    /* renamed from: e */
    public final /* synthetic */ TaskCompletionSource f6300e;

    /* renamed from: f */
    public final /* synthetic */ V52 f6301f;

    /* renamed from: g */
    public final /* synthetic */ Nq9 f6302g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dl9(Nq9 nq9, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l, TaskCompletionSource taskCompletionSource2, V52 v52) {
        super(taskCompletionSource);
        this.f6302g = nq9;
        this.f6298c = bArr;
        this.f6299d = l;
        this.f6300e = taskCompletionSource2;
        this.f6301f = v52;
    }

    @Override // p000.AbstractRunnableC39054cH8
    /* renamed from: a */
    public final void mo61624a(Exception exc) {
        if (exc instanceof zzu) {
            super.mo61624a(new IntegrityServiceException(-9, exc));
        } else {
            super.mo61624a(exc);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, Ge8] */
    @Override // p000.AbstractRunnableC39054cH8
    /* renamed from: b */
    public final void mo10054b() {
        C51459xA8 c51459xA8;
        try {
            this.f6302g.f25295c.m91294e().mo19122e1(Nq9.m93282a(this.f6302g, this.f6298c, this.f6299d), new No9(this.f6302g, this.f6300e));
        } catch (RemoteException e) {
            c51459xA8 = this.f6302g.f25293a;
            c51459xA8.m5752c(e, "requestIntegrityToken(%s)", this.f6301f);
            this.f6300e.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
