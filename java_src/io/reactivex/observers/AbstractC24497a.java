package io.reactivex.observers;

import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.util.C24488t;
import io.reactivex.observers.AbstractC24497a;
import java.util.List;
import java.util.concurrent.CountDownLatch;
/* renamed from: io.reactivex.observers.a */
/* loaded from: classes8.dex */
public abstract class AbstractC24497a<T, U extends AbstractC24497a<T, U>> implements InterfaceC23465c {

    /* renamed from: e */
    public long f91096e;

    /* renamed from: f */
    public Thread f91097f;

    /* renamed from: g */
    public boolean f91098g;

    /* renamed from: h */
    public int f91099h;

    /* renamed from: i */
    public int f91100i;

    /* renamed from: c */
    public final List<T> f91094c = new C24488t();

    /* renamed from: d */
    public final List<Throwable> f91095d = new C24488t();

    /* renamed from: b */
    public final CountDownLatch f91093b = new CountDownLatch(1);
}
