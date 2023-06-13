package p000;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* renamed from: wd6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC51128wd6 implements Executor {
    INSTANCE;
    
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: c */
    public static final Handler f116291c = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f116291c.post(runnable);
    }
}
