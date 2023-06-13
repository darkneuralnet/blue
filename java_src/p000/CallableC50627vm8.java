package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;
/* renamed from: vm8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC50627vm8 implements Callable<Long> {

    /* renamed from: b */
    public final /* synthetic */ SharedPreferences f114649b;

    /* renamed from: c */
    public final /* synthetic */ String f114650c;

    /* renamed from: d */
    public final /* synthetic */ Long f114651d;

    public CallableC50627vm8(SharedPreferences sharedPreferences, String str, Long l) {
        this.f114649b = sharedPreferences;
        this.f114650c = str;
        this.f114651d = l;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() throws Exception {
        return Long.valueOf(this.f114649b.getLong(this.f114650c, this.f114651d.longValue()));
    }
}
