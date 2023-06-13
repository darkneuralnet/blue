package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: dP6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39735dP6 implements InterfaceC50972wM6<Executor> {

    /* renamed from: a */
    public final /* synthetic */ int f76573a = 0;

    public C39735dP6() {
    }

    /* renamed from: b */
    public static Executor m44304b() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(ThreadFactoryC47434qO6.f105256c);
        C46814pL6.m19448k(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: c */
    public static Executor m44303c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(ThreadFactoryC47434qO6.f105257d);
        C46814pL6.m19448k(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: d */
    public static C44442lL6 m44302d() {
        return new C44442lL6();
    }

    /* renamed from: e */
    public static C51556xL6 m44301e() {
        return new C51556xL6();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.Executor, lL6] */
    /* JADX WARN: Type inference failed for: r0v4, types: [xL6, java.util.concurrent.Executor] */
    @Override // p000.InterfaceC50972wM6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Executor mo6967a() {
        int i = this.f76573a;
        return i != 0 ? i != 1 ? i != 2 ? m44301e() : m44302d() : m44303c() : m44304b();
    }

    public C39735dP6(byte[] bArr) {
    }

    public C39735dP6(char[] cArr) {
    }

    public C39735dP6(short[] sArr) {
    }
}
