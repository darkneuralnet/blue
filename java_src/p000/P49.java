package p000;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
/* renamed from: P49 */
/* loaded from: classes5.dex */
public final class P49 {

    /* renamed from: a */
    public final Messenger f27853a;

    /* renamed from: b */
    public final zzd f27854b;

    public P49(IBinder iBinder) throws RemoteException {
        String str;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f27853a = new Messenger(iBinder);
            this.f27854b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f27854b = new zzd(iBinder);
            this.f27853a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                str = "Invalid interface descriptor: ".concat(valueOf);
            } else {
                str = new String("Invalid interface descriptor: ");
            }
            Log.w("MessengerIpcClient", str);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void m90878a(Message message) throws RemoteException {
        Messenger messenger = this.f27853a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzd zzdVar = this.f27854b;
        if (zzdVar != null) {
            zzdVar.m51618b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
