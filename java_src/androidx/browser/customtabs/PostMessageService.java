package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import p000.YO1;
/* loaded from: classes.dex */
public class PostMessageService extends Service {

    /* renamed from: b */
    public YO1.AbstractBinderC9766a f52407b = new BinderC11139a();

    /* renamed from: androidx.browser.customtabs.PostMessageService$a */
    /* loaded from: classes.dex */
    public class BinderC11139a extends YO1.AbstractBinderC9766a {
        public BinderC11139a() {
        }

        @Override // p000.YO1
        /* renamed from: B3 */
        public void mo69685B3(InterfaceC45057mO1 interfaceC45057mO1, Bundle bundle) throws RemoteException {
            interfaceC45057mO1.mo8951X4(bundle);
        }

        @Override // p000.YO1
        /* renamed from: N4 */
        public void mo69684N4(InterfaceC45057mO1 interfaceC45057mO1, String str, Bundle bundle) throws RemoteException {
            interfaceC45057mO1.mo8952U4(str, bundle);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f52407b;
    }
}
