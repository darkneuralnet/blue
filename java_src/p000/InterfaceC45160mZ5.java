package p000;

import java.util.concurrent.Executor;
/* renamed from: mZ5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC45160mZ5 {
    /* renamed from: a */
    default void m25427a(Runnable runnable) {
        mo25425c().execute(runnable);
    }

    /* renamed from: b */
    Executor mo25426b();

    /* renamed from: c */
    InterfaceExecutorC35758Rs5 mo25425c();
}
