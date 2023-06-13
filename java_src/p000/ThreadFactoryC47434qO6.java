package p000;

import java.util.concurrent.ThreadFactory;
/* renamed from: qO6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class ThreadFactoryC47434qO6 implements ThreadFactory {

    /* renamed from: b */
    public final /* synthetic */ int f105258b = 0;

    /* renamed from: d */
    public static final ThreadFactory f105257d = new ThreadFactoryC47434qO6(null);

    /* renamed from: c */
    public static final ThreadFactory f105256c = new ThreadFactoryC47434qO6();

    private ThreadFactoryC47434qO6() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return this.f105258b != 0 ? new Thread(runnable, "AssetPackBackgroundExecutor") : new Thread(runnable, "UpdateListenerExecutor");
    }

    public ThreadFactoryC47434qO6(byte[] bArr) {
    }
}
