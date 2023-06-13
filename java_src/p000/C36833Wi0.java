package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
/* renamed from: Wi0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C36833Wi0 {

    /* renamed from: Wi0$a */
    /* loaded from: classes2.dex */
    public static class ServiceConnectionC9156a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    public static Intent m77972a(Context context, Intent intent) {
        if (m77971b(context)) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
            intent.addFlags(134250496);
        }
        return intent;
    }

    /* renamed from: b */
    public static boolean m77971b(Context context) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService").setPackage("com.android.chrome");
        ServiceConnectionC9156a serviceConnectionC9156a = new ServiceConnectionC9156a();
        boolean bindService = context.bindService(intent, serviceConnectionC9156a, 33);
        context.unbindService(serviceConnectionC9156a);
        return bindService;
    }
}
