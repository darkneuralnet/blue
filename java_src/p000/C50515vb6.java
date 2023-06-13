package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.wire.WireLocation;
import java.util.Calendar;
/* renamed from: vb6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C50515vb6 {

    /* renamed from: d */
    public static C50515vb6 f114381d;

    /* renamed from: a */
    public final Context f114382a;

    /* renamed from: b */
    public final LocationManager f114383b;

    /* renamed from: c */
    public final C29596a f114384c = new C29596a();

    /* renamed from: vb6$a */
    /* loaded from: classes.dex */
    public static class C29596a {

        /* renamed from: a */
        public boolean f114385a;

        /* renamed from: b */
        public long f114386b;
    }

    public C50515vb6(Context context, LocationManager locationManager) {
        this.f114382a = context;
        this.f114383b = locationManager;
    }

    /* renamed from: a */
    public static C50515vb6 m8392a(Context context) {
        if (f114381d == null) {
            Context applicationContext = context.getApplicationContext();
            f114381d = new C50515vb6(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f114381d;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public final Location m8391b() {
        Location location;
        Location location2 = null;
        if (C49227tQ3.m12381c(this.f114382a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = m8390c("network");
        } else {
            location = null;
        }
        if (C49227tQ3.m12381c(this.f114382a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = m8390c(WireLocation.DEFAULT_SOURCE);
        }
        if (location2 != null && location != null) {
            if (location2.getTime() > location.getTime()) {
                return location2;
            }
            return location;
        } else if (location2 != null) {
            return location2;
        } else {
            return location;
        }
    }

    /* renamed from: c */
    public final Location m8390c(String str) {
        try {
            if (this.f114383b.isProviderEnabled(str)) {
                return this.f114383b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: d */
    public boolean m8389d() {
        C29596a c29596a = this.f114384c;
        if (m8388e()) {
            return c29596a.f114385a;
        }
        Location m8391b = m8391b();
        if (m8391b != null) {
            m8387f(m8391b);
            return c29596a.f114385a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        if (i >= 6 && i < 22) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m8388e() {
        return this.f114384c.f114386b > System.currentTimeMillis();
    }

    /* renamed from: f */
    public final void m8387f(Location location) {
        long j;
        long j2;
        C29596a c29596a = this.f114384c;
        long currentTimeMillis = System.currentTimeMillis();
        C49923ub6 m9995b = C49923ub6.m9995b();
        m9995b.m9996a(currentTimeMillis - CoreConstants.MILLIS_IN_ONE_DAY, location.getLatitude(), location.getLongitude());
        m9995b.m9996a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = true;
        if (m9995b.f112663c != 1) {
            z = false;
        }
        boolean z2 = z;
        long j3 = m9995b.f112662b;
        long j4 = m9995b.f112661a;
        m9995b.m9996a(currentTimeMillis + CoreConstants.MILLIS_IN_ONE_DAY, location.getLatitude(), location.getLongitude());
        long j5 = m9995b.f112662b;
        if (j3 != -1 && j4 != -1) {
            if (currentTimeMillis > j4) {
                j2 = j5 + 0;
            } else if (currentTimeMillis > j3) {
                j2 = j4 + 0;
            } else {
                j2 = j3 + 0;
            }
            j = j2 + 60000;
        } else {
            j = 43200000 + currentTimeMillis;
        }
        c29596a.f114385a = z2;
        c29596a.f114386b = j;
    }
}
