package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import p000.InterfaceC46252oP1;
/* loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* renamed from: b */
    public InterfaceC46252oP1.AbstractBinderC26933a f54288b = new BinderC11551a();

    /* renamed from: androidx.core.content.UnusedAppRestrictionsBackportService$a */
    /* loaded from: classes.dex */
    public class BinderC11551a extends InterfaceC46252oP1.AbstractBinderC26933a {
        public BinderC11551a() {
        }

        @Override // p000.InterfaceC46252oP1
        /* renamed from: n2 */
        public void mo21218n2(InterfaceC45659nP1 interfaceC45659nP1) throws RemoteException {
            if (interfaceC45659nP1 == null) {
                return;
            }
            UnusedAppRestrictionsBackportService.this.m67707a(new C32591Ee6(interfaceC45659nP1));
        }
    }

    /* renamed from: a */
    public abstract void m67707a(C32591Ee6 c32591Ee6);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f54288b;
    }
}
