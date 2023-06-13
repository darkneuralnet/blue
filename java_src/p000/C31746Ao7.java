package p000;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
/* renamed from: Ao7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C31746Ao7 {

    /* renamed from: k */
    public static AbstractC50453vU8 f1152k;

    /* renamed from: l */
    public static final QU8 f1153l = QU8.m88460c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a */
    public final String f1154a;

    /* renamed from: b */
    public final String f1155b;

    /* renamed from: c */
    public final InterfaceC53018zo7 f1156c;

    /* renamed from: d */
    public final C37684Zy5 f1157d;

    /* renamed from: e */
    public final Task f1158e;

    /* renamed from: f */
    public final Task f1159f;

    /* renamed from: g */
    public final String f1160g;

    /* renamed from: h */
    public final int f1161h;

    /* renamed from: i */
    public final Map f1162i = new HashMap();

    /* renamed from: j */
    public final Map f1163j = new HashMap();

    public C31746Ao7(Context context, final C37684Zy5 c37684Zy5, InterfaceC53018zo7 interfaceC53018zo7, final String str) {
        int i;
        this.f1154a = context.getPackageName();
        this.f1155b = C32216Cp0.m111503a(context);
        this.f1157d = c37684Zy5;
        this.f1156c = interfaceC53018zo7;
        this.f1160g = str;
        this.f1158e = ME2.m95480a().m95479b(new Callable() { // from class: yo7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                AbstractC50453vU8 abstractC50453vU8 = C31746Ao7.f1152k;
                return LibraryVersion.getInstance().getVersion(str2);
            }
        });
        ME2 m95480a = ME2.m95480a();
        c37684Zy5.getClass();
        this.f1159f = m95480a.m95479b(new Callable() { // from class: xo7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C37684Zy5.this.m72165a();
            }
        });
        QU8 qu8 = f1153l;
        if (qu8.containsKey(str)) {
            i = DynamiteModule.m51593c(context, (String) qu8.get(str));
        } else {
            i = -1;
        }
        this.f1161h = i;
    }

    /* renamed from: d */
    public static synchronized AbstractC50453vU8 m115142d() {
        synchronized (C31746Ao7.class) {
            AbstractC50453vU8 abstractC50453vU8 = f1152k;
            if (abstractC50453vU8 != null) {
                return abstractC50453vU8;
            }
            C50711vv2 m40423a = C41243fx0.m40423a(Resources.getSystem().getConfiguration());
            C44516lT8 c44516lT8 = new C44516lT8();
            for (int i = 0; i < m40423a.m7766h(); i++) {
                c44516lT8.m27250c(C32216Cp0.m111502b(m40423a.m7771c(i)));
            }
            AbstractC50453vU8 m27249d = c44516lT8.m27249d();
            f1152k = m27249d;
            return m27249d;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void m115145a(InterfaceC48868so7 interfaceC48868so7, EnumC36858Wk7 enumC36858Wk7, String str) {
        String m72165a;
        interfaceC48868so7.mo13614b(enumC36858Wk7);
        String zzd = interfaceC48868so7.zzd();
        C32196Cm7 c32196Cm7 = new C32196Cm7();
        c32196Cm7.m111717b(this.f1154a);
        c32196Cm7.m111716c(this.f1155b);
        c32196Cm7.m111711h(m115142d());
        c32196Cm7.m111712g(Boolean.TRUE);
        c32196Cm7.m111707l(zzd);
        c32196Cm7.m111709j(str);
        if (this.f1159f.isSuccessful()) {
            m72165a = (String) this.f1159f.getResult();
        } else {
            m72165a = this.f1157d.m72165a();
        }
        c32196Cm7.m111710i(m72165a);
        c32196Cm7.m111715d(10);
        c32196Cm7.m111708k(Integer.valueOf(this.f1161h));
        interfaceC48868so7.mo13613c(c32196Cm7);
        this.f1156c.mo405a(interfaceC48868so7);
    }

    /* renamed from: b */
    public final void m115144b(InterfaceC48868so7 interfaceC48868so7, EnumC36858Wk7 enumC36858Wk7) {
        String version;
        if (this.f1158e.isSuccessful()) {
            version = (String) this.f1158e.getResult();
        } else {
            version = LibraryVersion.getInstance().getVersion(this.f1160g);
        }
        m115143c(interfaceC48868so7, enumC36858Wk7, version);
    }

    /* renamed from: c */
    public final void m115143c(final InterfaceC48868so7 interfaceC48868so7, final EnumC36858Wk7 enumC36858Wk7, final String str) {
        ME2.m95477d().execute(new Runnable() { // from class: wo7
            @Override // java.lang.Runnable
            public final void run() {
                C31746Ao7.this.m115145a(interfaceC48868so7, enumC36858Wk7, str);
            }
        });
    }
}
