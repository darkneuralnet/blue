package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;
/* renamed from: zA8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC52645zA8 implements Callable<String> {

    /* renamed from: b */
    public final /* synthetic */ SharedPreferences f120898b;

    /* renamed from: c */
    public final /* synthetic */ String f120899c;

    /* renamed from: d */
    public final /* synthetic */ String f120900d;

    public CallableC52645zA8(SharedPreferences sharedPreferences, String str, String str2) {
        this.f120898b = sharedPreferences;
        this.f120899c = str;
        this.f120900d = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        return this.f120898b.getString(this.f120899c, this.f120900d);
    }
}
