package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;
/* renamed from: vQ7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC50416vQ7 implements Callable<Boolean> {

    /* renamed from: b */
    public final /* synthetic */ SharedPreferences f114055b;

    /* renamed from: c */
    public final /* synthetic */ String f114056c;

    /* renamed from: d */
    public final /* synthetic */ Boolean f114057d;

    public CallableC50416vQ7(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f114055b = sharedPreferences;
        this.f114056c = str;
        this.f114057d = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Boolean call() throws Exception {
        return Boolean.valueOf(this.f114055b.getBoolean(this.f114056c, this.f114057d.booleanValue()));
    }
}
