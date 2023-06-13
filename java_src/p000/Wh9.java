package p000;

import android.os.Process;
/* renamed from: Wh9 */
/* loaded from: classes5.dex */
public final class Wh9 extends Thread {
    public Wh9(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
