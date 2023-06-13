package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzau;
import java.util.Iterator;
/* renamed from: xu7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51892xu7 {

    /* renamed from: a */
    public final String f118328a;

    /* renamed from: b */
    public final String f118329b;

    /* renamed from: c */
    public final String f118330c;

    /* renamed from: d */
    public final long f118331d;

    /* renamed from: e */
    public final long f118332e;

    /* renamed from: f */
    public final zzau f118333f;

    public C51892xu7(C35248Pn8 c35248Pn8, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzau zzauVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.f118328a = str2;
        this.f118329b = str3;
        this.f118330c = true == TextUtils.isEmpty(str) ? null : str;
        this.f118331d = j;
        this.f118332e = j2;
        if (j2 != 0 && j2 > j) {
            c35248Pn8.mo22258a().m106888t().m42707b("Event created with reverse previous/current timestamps. appId", C32809Fc8.m106885w(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c35248Pn8.mo22258a().m106893o().m42708a("Param name can't be null");
                    it.remove();
                } else {
                    Object m92066l = c35248Pn8.m89776N().m92066l(next, bundle2.get(next));
                    if (m92066l == null) {
                        c35248Pn8.mo22258a().m106888t().m42707b("Param value can't be null", c35248Pn8.m89786D().m17331e(next));
                        it.remove();
                    } else {
                        c35248Pn8.m89776N().m92101D(bundle2, next, m92066l);
                    }
                }
            }
            zzauVar = new zzau(bundle2);
        } else {
            zzauVar = new zzau(new Bundle());
        }
        this.f118333f = zzauVar;
    }

    /* renamed from: a */
    public final C51892xu7 m4447a(C35248Pn8 c35248Pn8, long j) {
        return new C51892xu7(c35248Pn8, this.f118330c, this.f118328a, this.f118329b, this.f118331d, j, this.f118333f);
    }

    public final String toString() {
        String str = this.f118328a;
        String str2 = this.f118329b;
        String obj = this.f118333f.toString();
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + obj + "}";
    }

    public C51892xu7(C35248Pn8 c35248Pn8, String str, String str2, String str3, long j, long j2, zzau zzauVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzauVar);
        this.f118328a = str2;
        this.f118329b = str3;
        this.f118330c = true == TextUtils.isEmpty(str) ? null : str;
        this.f118331d = j;
        this.f118332e = j2;
        if (j2 != 0 && j2 > j) {
            c35248Pn8.mo22258a().m106888t().m42706c("Event created with reverse previous/current timestamps. appId, name", C32809Fc8.m106885w(str2), C32809Fc8.m106885w(str3));
        }
        this.f118333f = zzauVar;
    }
}
