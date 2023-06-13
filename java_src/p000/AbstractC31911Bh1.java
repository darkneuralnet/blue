package p000;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* renamed from: Bh1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC31911Bh1 {
    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: a */
    public static Executor m113670a() {
        return new ExecutorC48204rh5(Executors.newSingleThreadExecutor());
    }
}
