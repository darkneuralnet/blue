package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
/* renamed from: Zd3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC37493Zd3<T> {

    /* renamed from: Zd3$a */
    /* loaded from: classes.dex */
    public interface InterfaceC10303a<T> {
        /* renamed from: a */
        void mo68963a(T t);

        void onError(Throwable th);
    }

    /* renamed from: b */
    void mo72844b(InterfaceC10303a<? super T> interfaceC10303a);

    /* renamed from: c */
    void mo72843c(Executor executor, InterfaceC10303a<? super T> interfaceC10303a);

    /* renamed from: d */
    ListenableFuture<T> mo72842d();
}
