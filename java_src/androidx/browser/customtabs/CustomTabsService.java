package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsService;
import java.util.List;
import java.util.NoSuchElementException;
import p000.InterfaceC45650nO1;
/* loaded from: classes.dex */
public abstract class CustomTabsService extends Service {

    /* renamed from: b */
    public final NA5<IBinder, IBinder.DeathRecipient> f52404b = new NA5<>();

    /* renamed from: c */
    public InterfaceC45650nO1.AbstractBinderC26468a f52405c = new BinderC11138a();

    /* renamed from: androidx.browser.customtabs.CustomTabsService$a */
    /* loaded from: classes.dex */
    public class BinderC11138a extends InterfaceC45650nO1.AbstractBinderC26468a {
        public BinderC11138a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f5 */
        public /* synthetic */ void m69687f5(AF0 af0) {
            CustomTabsService.this.m69699a(af0);
        }

        @Override // p000.InterfaceC45650nO1
        /* renamed from: F3 */
        public boolean mo23921F3(InterfaceC45057mO1 interfaceC45057mO1, Bundle bundle) {
            return CustomTabsService.this.m69692h(new AF0(interfaceC45057mO1, m69688e5(bundle)), bundle);
        }

        @Override // p000.InterfaceC45650nO1
        /* renamed from: H0 */
        public int mo23920H0(InterfaceC45057mO1 interfaceC45057mO1, String str, Bundle bundle) {
            return CustomTabsService.this.m69695e(new AF0(interfaceC45057mO1, m69688e5(bundle)), str, bundle);
        }

        @Override // p000.InterfaceC45650nO1
        /* renamed from: J3 */
        public boolean mo23919J3(InterfaceC45057mO1 interfaceC45057mO1, Uri uri, Bundle bundle) {
            return CustomTabsService.this.m69693g(new AF0(interfaceC45057mO1, m69688e5(bundle)), uri);
        }

        @Override // p000.InterfaceC45650nO1
        /* renamed from: Q */
        public boolean mo23913Q(InterfaceC45057mO1 interfaceC45057mO1) {
            return m69686g5(interfaceC45057mO1, null);
        }

        @Override // p000.InterfaceC45650nO1
        /* renamed from: Z */
        public boolean mo23912Z(InterfaceC45057mO1 interfaceC45057mO1, Bundle bundle) {
            return m69686g5(interfaceC45057mO1, m69688e5(bundle));
        }

        @Override // p000.InterfaceC45650nO1
        /* renamed from: c1 */
        public boolean mo23911c1(long j) {
            return CustomTabsService.this.m69690j(j);
        }

        /* renamed from: e5 */
        public final PendingIntent m69688e5(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        /* renamed from: g5 */
        public final boolean m69686g5(InterfaceC45057mO1 interfaceC45057mO1, PendingIntent pendingIntent) {
            final AF0 af0 = new AF0(interfaceC45057mO1, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: xF0
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        CustomTabsService.BinderC11138a.this.m69687f5(af0);
                    }
                };
                synchronized (CustomTabsService.this.f52404b) {
                    interfaceC45057mO1.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.f52404b.put(interfaceC45057mO1.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.m69696d(af0);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // p000.InterfaceC45650nO1
        /* renamed from: o1 */
        public boolean mo23918o1(InterfaceC45057mO1 interfaceC45057mO1, Uri uri) {
            return CustomTabsService.this.m69693g(new AF0(interfaceC45057mO1, null), uri);
        }

        @Override // p000.InterfaceC45650nO1
        /* renamed from: q3 */
        public boolean mo23917q3(InterfaceC45057mO1 interfaceC45057mO1, int i, Uri uri, Bundle bundle) {
            return CustomTabsService.this.m69691i(new AF0(interfaceC45057mO1, m69688e5(bundle)), i, uri, bundle);
        }

        @Override // p000.InterfaceC45650nO1
        /* renamed from: t1 */
        public boolean mo23910t1(InterfaceC45057mO1 interfaceC45057mO1, Uri uri, Bundle bundle, List<Bundle> list) {
            return CustomTabsService.this.m69697c(new AF0(interfaceC45057mO1, m69688e5(bundle)), uri, bundle, list);
        }

        @Override // p000.InterfaceC45650nO1
        /* renamed from: w2 */
        public Bundle mo23916w2(String str, Bundle bundle) {
            return CustomTabsService.this.m69698b(str, bundle);
        }

        @Override // p000.InterfaceC45650nO1
        /* renamed from: x4 */
        public boolean mo23915x4(InterfaceC45057mO1 interfaceC45057mO1, Uri uri, int i, Bundle bundle) {
            return CustomTabsService.this.m69694f(new AF0(interfaceC45057mO1, m69688e5(bundle)), uri, i, bundle);
        }
    }

    /* renamed from: a */
    public boolean m69699a(AF0 af0) {
        try {
            synchronized (this.f52404b) {
                IBinder m115956a = af0.m115956a();
                if (m115956a == null) {
                    return false;
                }
                m115956a.unlinkToDeath(this.f52404b.get(m115956a), 0);
                this.f52404b.remove(m115956a);
                return true;
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public abstract Bundle m69698b(String str, Bundle bundle);

    /* renamed from: c */
    public abstract boolean m69697c(AF0 af0, Uri uri, Bundle bundle, List<Bundle> list);

    /* renamed from: d */
    public abstract boolean m69696d(AF0 af0);

    /* renamed from: e */
    public abstract int m69695e(AF0 af0, String str, Bundle bundle);

    /* renamed from: f */
    public abstract boolean m69694f(AF0 af0, Uri uri, int i, Bundle bundle);

    /* renamed from: g */
    public abstract boolean m69693g(AF0 af0, Uri uri);

    /* renamed from: h */
    public abstract boolean m69692h(AF0 af0, Bundle bundle);

    /* renamed from: i */
    public abstract boolean m69691i(AF0 af0, int i, Uri uri, Bundle bundle);

    /* renamed from: j */
    public abstract boolean m69690j(long j);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f52405c;
    }
}
