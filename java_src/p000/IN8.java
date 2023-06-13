package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;
/* renamed from: IN8 */
/* loaded from: classes5.dex */
public final class IN8 implements Callable<SharedPreferences> {

    /* renamed from: b */
    public final /* synthetic */ Context f15424b;

    public IN8(Context context) {
        this.f15424b = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ SharedPreferences call() throws Exception {
        return this.f15424b.getSharedPreferences("google_sdk_flags", 0);
    }
}
