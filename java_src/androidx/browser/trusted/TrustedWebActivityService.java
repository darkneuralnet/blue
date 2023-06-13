package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import androidx.browser.trusted.C11141a;
import androidx.core.app.NotificationManagerCompat;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
import java.util.Locale;
import p000.InterfaceC44473lP1;
/* loaded from: classes.dex */
public abstract class TrustedWebActivityService extends Service {

    /* renamed from: b */
    public NotificationManager f52409b;

    /* renamed from: c */
    public int f52410c = -1;

    /* renamed from: d */
    public final InterfaceC44473lP1.AbstractBinderC25693a f52411d = new BinderC11140a();

    /* renamed from: androidx.browser.trusted.TrustedWebActivityService$a */
    /* loaded from: classes.dex */
    public class BinderC11140a extends InterfaceC44473lP1.AbstractBinderC25693a {
        public BinderC11140a() {
        }

        @Override // p000.InterfaceC44473lP1
        /* renamed from: B4 */
        public Bundle mo27332B4(Bundle bundle) {
            m69673c5();
            return new C11141a.C11146e(TrustedWebActivityService.this.m69680d(C11141a.C11144c.m69669a(bundle).f52416a)).m69667a();
        }

        @Override // p000.InterfaceC44473lP1
        /* renamed from: C2 */
        public Bundle mo27331C2(String str, Bundle bundle, IBinder iBinder) {
            m69673c5();
            return TrustedWebActivityService.this.m69678f(str, bundle, C52877za6.m1075a(iBinder));
        }

        @Override // p000.InterfaceC44473lP1
        /* renamed from: I4 */
        public void mo27330I4(Bundle bundle) {
            m69673c5();
            C11141a.C11143b m69670a = C11141a.C11143b.m69670a(bundle);
            TrustedWebActivityService.this.m69679e(m69670a.f52414a, m69670a.f52415b);
        }

        @Override // p000.InterfaceC44473lP1
        /* renamed from: Q2 */
        public Bundle mo27329Q2() {
            m69673c5();
            return TrustedWebActivityService.this.m69676h();
        }

        @Override // p000.InterfaceC44473lP1
        /* renamed from: W3 */
        public Bundle mo27328W3() {
            m69673c5();
            return new C11141a.C11142a(TrustedWebActivityService.this.m69677g()).m69671a();
        }

        /* renamed from: c5 */
        public final void m69673c5() {
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            int i = trustedWebActivityService.f52410c;
            if (i != -1) {
                if (i == Binder.getCallingUid()) {
                    return;
                }
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
            trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
            TrustedWebActivityService.this.m69681c();
            throw null;
        }

        @Override // p000.InterfaceC44473lP1
        /* renamed from: o0 */
        public Bundle mo27327o0(Bundle bundle) {
            m69673c5();
            C11141a.C11145d m69668a = C11141a.C11145d.m69668a(bundle);
            return new C11141a.C11146e(TrustedWebActivityService.this.m69674j(m69668a.f52417a, m69668a.f52418b, m69668a.f52419c, m69668a.f52420d)).m69667a();
        }

        @Override // p000.InterfaceC44473lP1
        /* renamed from: y4 */
        public int mo27326y4() {
            m69673c5();
            return TrustedWebActivityService.this.m69675i();
        }
    }

    /* renamed from: a */
    public static String m69683a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    /* renamed from: b */
    public final void m69682b() {
        if (this.f52409b != null) {
            return;
        }
        throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
    }

    /* renamed from: c */
    public abstract InterfaceC49036t56 m69681c();

    /* renamed from: d */
    public boolean m69680d(String str) {
        m69682b();
        if (!NotificationManagerCompat.from(this).areNotificationsEnabled()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        return C43388ja3.m30294b(this.f52409b, m69683a(str));
    }

    /* renamed from: e */
    public void m69679e(String str, int i) {
        m69682b();
        this.f52409b.cancel(str, i);
    }

    /* renamed from: f */
    public Bundle m69678f(String str, Bundle bundle, C52877za6 c52877za6) {
        return null;
    }

    /* renamed from: g */
    public Parcelable[] m69677g() {
        m69682b();
        return C39220ca3.m61192a(this.f52409b);
    }

    /* renamed from: h */
    public Bundle m69676h() {
        int m69675i = m69675i();
        Bundle bundle = new Bundle();
        if (m69675i == -1) {
            return bundle;
        }
        bundle.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(getResources(), m69675i));
        return bundle;
    }

    /* renamed from: i */
    public int m69675i() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /* renamed from: j */
    public boolean m69674j(String str, int i, Notification notification, String str2) {
        m69682b();
        if (!NotificationManagerCompat.from(this).areNotificationsEnabled()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String m69683a = m69683a(str2);
            notification = C43388ja3.m30295a(this, this.f52409b, notification, m69683a, str2);
            if (!C43388ja3.m30294b(this.f52409b, m69683a)) {
                return false;
            }
        }
        this.f52409b.notify(str, i, notification);
        return true;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f52411d;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f52409b = (NotificationManager) getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.f52410c = -1;
        return super.onUnbind(intent);
    }
}
