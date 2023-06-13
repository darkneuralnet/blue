package p000;

import android.os.Handler;
import java.util.concurrent.Executor;
/* renamed from: yt8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC52476yt8 implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler;
        handler = ME2.m95480a().f22915a;
        handler.post(runnable);
    }
}
