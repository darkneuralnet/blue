package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import androidx.core.app.NotificationManagerCompat;
/* renamed from: BQ3 */
/* loaded from: classes3.dex */
public final class BQ3 implements InterfaceC48812sj1<AQ3> {

    /* renamed from: a */
    public final Y94<Context> f2275a;

    /* renamed from: b */
    public final Y94<PackageManager> f2276b;

    /* renamed from: c */
    public final Y94<BluetoothAdapter> f2277c;

    /* renamed from: d */
    public final Y94<LocationManager> f2278d;

    /* renamed from: e */
    public final Y94<NotificationManagerCompat> f2279e;

    /* renamed from: f */
    public final Y94<C22454gl> f2280f;

    /* renamed from: g */
    public final Y94<ConnectivityManager> f2281g;

    public BQ3(Y94<Context> y94, Y94<PackageManager> y942, Y94<BluetoothAdapter> y943, Y94<LocationManager> y944, Y94<NotificationManagerCompat> y945, Y94<C22454gl> y946, Y94<ConnectivityManager> y947) {
        this.f2275a = y94;
        this.f2276b = y942;
        this.f2277c = y943;
        this.f2278d = y944;
        this.f2279e = y945;
        this.f2280f = y946;
        this.f2281g = y947;
    }

    /* renamed from: a */
    public static BQ3 m114047a(Y94<Context> y94, Y94<PackageManager> y942, Y94<BluetoothAdapter> y943, Y94<LocationManager> y944, Y94<NotificationManagerCompat> y945, Y94<C22454gl> y946, Y94<ConnectivityManager> y947) {
        return new BQ3(y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static AQ3 m114045c(Context context, PackageManager packageManager, BluetoothAdapter bluetoothAdapter, LocationManager locationManager, NotificationManagerCompat notificationManagerCompat, C22454gl c22454gl, ConnectivityManager connectivityManager) {
        return new AQ3(context, packageManager, bluetoothAdapter, locationManager, notificationManagerCompat, c22454gl, connectivityManager);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AQ3 get() {
        return m114045c(this.f2275a.get(), this.f2276b.get(), this.f2277c.get(), this.f2278d.get(), this.f2279e.get(), this.f2280f.get(), this.f2281g.get());
    }
}
