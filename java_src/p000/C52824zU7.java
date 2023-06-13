package p000;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
/* renamed from: zU7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52824zU7 implements MT7 {

    /* renamed from: c */
    public static C52824zU7 f121413c;

    /* renamed from: a */
    public final Context f121414a;

    /* renamed from: b */
    public final ContentObserver f121415b;

    private C52824zU7() {
        this.f121414a = null;
        this.f121415b = null;
    }

    /* renamed from: a */
    public static C52824zU7 m1318a(Context context) {
        C52824zU7 c52824zU7;
        C52824zU7 c52824zU72;
        synchronized (C52824zU7.class) {
            if (f121413c == null) {
                if (C49227tQ3.m12381c(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    c52824zU72 = new C52824zU7(context);
                } else {
                    c52824zU72 = new C52824zU7();
                }
                f121413c = c52824zU72;
            }
            c52824zU7 = f121413c;
        }
        return c52824zU7;
    }

    /* renamed from: d */
    public static synchronized void m1315d() {
        Context context;
        synchronized (C52824zU7.class) {
            C52824zU7 c52824zU7 = f121413c;
            if (c52824zU7 != null && (context = c52824zU7.f121414a) != null && c52824zU7.f121415b != null) {
                context.getContentResolver().unregisterContentObserver(f121413c.f121415b);
            }
            f121413c = null;
        }
    }

    @Override // p000.MT7
    /* renamed from: b */
    public final String zzb(final String str) {
        String str2;
        if (this.f121414a == null) {
            return null;
        }
        try {
            return (String) C43329jT7.m30578a(new InterfaceC52222yT7() { // from class: YT7
                @Override // p000.InterfaceC52222yT7
                public final Object zza() {
                    return C52824zU7.this.m1316c(str);
                }
            });
        } catch (IllegalStateException | SecurityException e) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Unable to read GServices for: ".concat(valueOf);
            } else {
                str2 = new String("Unable to read GServices for: ");
            }
            Log.e("GservicesLoader", str2, e);
            return null;
        }
    }

    /* renamed from: c */
    public final /* synthetic */ String m1316c(String str) {
        return C41532gR7.m39459a(this.f121414a.getContentResolver(), str, null);
    }

    public C52824zU7(Context context) {
        this.f121414a = context;
        C45117mU7 c45117mU7 = new C45117mU7(this, null);
        this.f121415b = c45117mU7;
        context.getContentResolver().registerContentObserver(C41532gR7.f82198a, true, c45117mU7);
    }
}
