package p000;

import android.content.ContentResolver;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import co.bird.android.model.wire.WireLocation;
/* renamed from: xi0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C51765xi0 {

    /* renamed from: a */
    public final ContentResolver f117990a;

    /* renamed from: b */
    public final LocationManager f117991b;

    public C51765xi0(ContentResolver contentResolver, LocationManager locationManager) {
        this.f117990a = contentResolver;
        this.f117991b = locationManager;
    }

    /* renamed from: a */
    public boolean m4861a() {
        boolean isLocationEnabled;
        if (Build.VERSION.SDK_INT >= 28) {
            isLocationEnabled = this.f117991b.isLocationEnabled();
            return isLocationEnabled;
        }
        return m4859c();
    }

    /* renamed from: b */
    public final boolean m4860b() {
        if (!this.f117991b.isProviderEnabled("network") && !this.f117991b.isProviderEnabled(WireLocation.DEFAULT_SOURCE)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m4859c() {
        try {
            if (Settings.Secure.getInt(this.f117990a, "location_mode") == 0) {
                return false;
            }
            return true;
        } catch (Settings.SettingNotFoundException e) {
            C52323ye5.m3110s(e, "Could not use LOCATION_MODE check. Falling back to a legacy/heuristic function.", new Object[0]);
            return m4860b();
        }
    }
}
