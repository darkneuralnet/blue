package p000;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
/* renamed from: rx8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48366rx8 implements InterfaceC51320ww8 {

    /* renamed from: c */
    public static C48366rx8 f107953c;

    /* renamed from: a */
    public final Context f107954a;

    /* renamed from: b */
    public final ContentObserver f107955b;

    private C48366rx8() {
        this.f107954a = null;
        this.f107955b = null;
    }

    /* renamed from: a */
    public static C48366rx8 m14983a(Context context) {
        C48366rx8 c48366rx8;
        C48366rx8 c48366rx82;
        synchronized (C48366rx8.class) {
            if (f107953c == null) {
                if (C49227tQ3.m12381c(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    c48366rx82 = new C48366rx8(context);
                } else {
                    c48366rx82 = new C48366rx8();
                }
                f107953c = c48366rx82;
            }
            c48366rx8 = f107953c;
        }
        return c48366rx8;
    }

    /* renamed from: d */
    public static synchronized void m14980d() {
        Context context;
        synchronized (C48366rx8.class) {
            C48366rx8 c48366rx8 = f107953c;
            if (c48366rx8 != null && (context = c48366rx8.f107954a) != null && c48366rx8.f107955b != null) {
                context.getContentResolver().unregisterContentObserver(f107953c.f107955b);
            }
            f107953c = null;
        }
    }

    @Override // p000.InterfaceC51320ww8
    /* renamed from: b */
    public final String zzb(final String str) {
        Context context = this.f107954a;
        if (context != null && !C41814gu8.m37344a(context)) {
            try {
                return (String) C36724Vv8.m79226a(new InterfaceC43020iw8() { // from class: Iw8
                    @Override // p000.InterfaceC43020iw8
                    public final Object zza() {
                        return C48366rx8.this.m14981c(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ String m14981c(String str) {
        return C35770Rt8.m86244a(this.f107954a.getContentResolver(), str, null);
    }

    public C48366rx8(Context context) {
        this.f107954a = context;
        C36967Ww8 c36967Ww8 = new C36967Ww8(this, null);
        this.f107955b = c36967Ww8;
        context.getContentResolver().registerContentObserver(C35770Rt8.f32807a, true, c36967Ww8);
    }
}
