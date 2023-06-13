package p000;

import android.os.Process;
/* renamed from: Ye7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37272Ye7 extends Thread {
    public C37272Ye7(ThreadGroup threadGroup, String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
