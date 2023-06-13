package p000;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: BZ5 */
/* loaded from: classes.dex */
public final class BZ5 implements Iterable<Intent> {

    /* renamed from: b */
    public final ArrayList<Intent> f2523b = new ArrayList<>();

    /* renamed from: c */
    public final Context f2524c;

    /* renamed from: BZ5$a */
    /* loaded from: classes.dex */
    public static class C0645a {
        private C0645a() {
        }

        /* renamed from: a */
        public static PendingIntent m113848a(Context context, int i, Intent[] intentArr, int i2, Bundle bundle) {
            return PendingIntent.getActivities(context, i, intentArr, i2, bundle);
        }
    }

    /* renamed from: BZ5$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0646b {
        Intent getSupportParentActivityIntent();
    }

    public BZ5(Context context) {
        this.f2524c = context;
    }

    /* renamed from: h */
    public static BZ5 m113853h(Context context) {
        return new BZ5(context);
    }

    /* renamed from: a */
    public BZ5 m113858a(Intent intent) {
        this.f2523b.add(intent);
        return this;
    }

    /* renamed from: b */
    public BZ5 m113857b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f2524c.getPackageManager());
        }
        if (component != null) {
            m113855e(component);
        }
        m113858a(intent);
        return this;
    }

    /* renamed from: c */
    public BZ5 m113856c(Activity activity) {
        Intent intent;
        if (activity instanceof InterfaceC0646b) {
            intent = ((InterfaceC0646b) activity).getSupportParentActivityIntent();
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = XY2.m76867a(activity);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(this.f2524c.getPackageManager());
            }
            m113855e(component);
            m113858a(intent);
        }
        return this;
    }

    /* renamed from: e */
    public BZ5 m113855e(ComponentName componentName) {
        int size = this.f2523b.size();
        try {
            Intent m76866b = XY2.m76866b(this.f2524c, componentName);
            while (m76866b != null) {
                this.f2523b.add(size, m76866b);
                m76866b = XY2.m76866b(this.f2524c, m76866b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: f */
    public BZ5 m113854f(Class<?> cls) {
        return m113855e(new ComponentName(this.f2524c, cls));
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f2523b.iterator();
    }

    /* renamed from: j */
    public PendingIntent m113852j(int i, int i2) {
        return m113851o(i, i2, null);
    }

    /* renamed from: o */
    public PendingIntent m113851o(int i, int i2, Bundle bundle) {
        if (!this.f2523b.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f2523b.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return C0645a.m113848a(this.f2524c, i, intentArr, i2, bundle);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    /* renamed from: s */
    public void m113850s() {
        m113849u(null);
    }

    /* renamed from: u */
    public void m113849u(Bundle bundle) {
        if (!this.f2523b.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f2523b.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!NA0.m94292l(this.f2524c, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f2524c.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
