package p000;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: MG8 */
/* loaded from: classes5.dex */
public final class MG8 {

    /* renamed from: b */
    public static volatile AbstractC42566iA8 f22939b;

    /* renamed from: a */
    public static final Object f22938a = new Object();

    /* renamed from: c */
    public static final AtomicReference f22940c = new AtomicReference();

    /* renamed from: d */
    public static final C48666sT8 f22941d = new C48666sT8(C40548em8.f78848a, null);

    /* renamed from: e */
    public static final AtomicInteger f22942e = new AtomicInteger();

    /* renamed from: a */
    public static void m95457a(final Context context) {
        if (f22939b == null) {
            Object obj = f22938a;
            synchronized (obj) {
                if (f22939b == null) {
                    synchronized (obj) {
                        AbstractC42566iA8 abstractC42566iA8 = f22939b;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (abstractC42566iA8 == null || abstractC42566iA8.mo34380a() != context) {
                            C44026ke8.m28703a();
                            C47427qN8.m17581a();
                            f22939b = new C39562d68(context, EE7.m109278a(new InterfaceC38424bD7() { // from class: et8
                            }));
                            f22942e.incrementAndGet();
                        }
                    }
                }
            }
        }
    }
}
