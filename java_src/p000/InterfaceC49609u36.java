package p000;

import androidx.camera.core.impl.InterfaceC11197f;
import androidx.camera.core.impl.InterfaceC11212p;
import java.util.concurrent.Executor;
/* renamed from: u36  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC49609u36 extends InterfaceC11212p {

    /* renamed from: d */
    public static final InterfaceC11197f.AbstractC11198a<Executor> f111631d = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.thread.backgroundExecutor", Executor.class);

    /* renamed from: x */
    default Executor m10932x(Executor executor) {
        return (Executor) mo69360d(f111631d, executor);
    }
}
