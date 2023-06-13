package p000;

import java.util.concurrent.ThreadFactory;
/* renamed from: XK6 */
/* loaded from: classes6.dex */
public final class XK6 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
