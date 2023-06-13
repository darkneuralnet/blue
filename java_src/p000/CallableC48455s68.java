package p000;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;
/* renamed from: s68  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC48455s68 implements Callable<Integer> {

    /* renamed from: b */
    public final /* synthetic */ SharedPreferences f108286b;

    /* renamed from: c */
    public final /* synthetic */ String f108287c;

    /* renamed from: d */
    public final /* synthetic */ Integer f108288d;

    public CallableC48455s68(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f108286b = sharedPreferences;
        this.f108287c = str;
        this.f108288d = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Integer call() throws Exception {
        return Integer.valueOf(this.f108286b.getInt(this.f108287c, this.f108288d.intValue()));
    }
}
