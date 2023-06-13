package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
/* loaded from: classes.dex */
public final class AppLocalesMetadataHolderService extends Service {

    /* renamed from: androidx.appcompat.app.AppLocalesMetadataHolderService$a */
    /* loaded from: classes.dex */
    public static class C10989a {
        private C10989a() {
        }

        /* renamed from: a */
        public static int m70321a() {
            return 512;
        }
    }

    /* renamed from: a */
    public static ServiceInfo m70322a(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, AppLocalesMetadataHolderService.class), C10989a.m70321a() | 128);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
