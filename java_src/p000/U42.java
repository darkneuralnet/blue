package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.stripe.android.core.networking.AnalyticsRequestV2Factory;
import java.util.List;
import p000.InterfaceC48614sO1;
/* renamed from: U42 */
/* loaded from: classes4.dex */
public class U42 extends InstallReferrerClient {

    /* renamed from: a */
    public int f36799a = 0;

    /* renamed from: b */
    public final Context f36800b;

    /* renamed from: c */
    public InterfaceC48614sO1 f36801c;

    /* renamed from: d */
    public ServiceConnection f36802d;

    /* renamed from: U42$b */
    /* loaded from: classes4.dex */
    public final class ServiceConnectionC8190b implements ServiceConnection {

        /* renamed from: b */
        public final InstallReferrerStateListener f36803b;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            V42.m80451a("InstallReferrerClient", "Install Referrer service connected.");
            U42.this.f36801c = InterfaceC48614sO1.AbstractBinderC28297a.m14247c5(iBinder);
            U42.this.f36799a = 2;
            this.f36803b.mo53509a(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            V42.m80450b("InstallReferrerClient", "Install Referrer service disconnected.");
            U42.this.f36801c = null;
            U42.this.f36799a = 0;
            this.f36803b.mo53508b();
        }

        public ServiceConnectionC8190b(@NonNull InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener != null) {
                this.f36803b = installReferrerStateListener;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
    }

    public U42(@NonNull Context context) {
        this.f36800b = context.getApplicationContext();
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: a */
    public ReferrerDetails mo53513a() throws RemoteException {
        if (m82010g()) {
            Bundle bundle = new Bundle();
            bundle.putString(AnalyticsRequestV2Factory.PARAM_PACKAGE_NAME, this.f36800b.getPackageName());
            try {
                return new ReferrerDetails(this.f36801c.mo14246E2(bundle));
            } catch (RemoteException e) {
                V42.m80450b("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f36799a = 0;
                throw e;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    /* renamed from: c */
    public void mo53511c(@NonNull InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (m82010g()) {
            V42.m80451a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.mo53509a(0);
            return;
        }
        int i = this.f36799a;
        if (i == 1) {
            V42.m80450b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.mo53509a(3);
        } else if (i == 3) {
            V42.m80450b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.mo53509a(3);
        } else {
            V42.m80451a("InstallReferrerClient", "Starting install referrer service setup.");
            this.f36802d = new ServiceConnectionC8190b(installReferrerStateListener);
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List<ResolveInfo> queryIntentServices = this.f36800b.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null && m82011f()) {
                    if (this.f36800b.bindService(new Intent(intent), this.f36802d, 1)) {
                        V42.m80451a("InstallReferrerClient", "Service was bonded successfully.");
                        return;
                    }
                    V42.m80450b("InstallReferrerClient", "Connection to service is blocked.");
                    this.f36799a = 0;
                    installReferrerStateListener.mo53509a(1);
                    return;
                }
                V42.m80450b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.f36799a = 0;
                installReferrerStateListener.mo53509a(2);
                return;
            }
            this.f36799a = 0;
            V42.m80451a("InstallReferrerClient", "Install Referrer service unavailable on device.");
            installReferrerStateListener.mo53509a(2);
        }
    }

    /* renamed from: f */
    public final boolean m82011f() {
        try {
            if (this.f36800b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode < 80837300) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: g */
    public boolean m82010g() {
        return (this.f36799a != 2 || this.f36801c == null || this.f36802d == null) ? false : true;
    }
}
