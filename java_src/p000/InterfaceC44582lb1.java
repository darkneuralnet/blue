package p000;

import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
/* renamed from: lb1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC44582lb1 {

    /* renamed from: lb1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC25733a {
    }

    /* renamed from: lb1$b */
    /* loaded from: classes.dex */
    public interface InterfaceC25734b extends InterfaceC25733a {

        /* renamed from: lb1$b$a */
        /* loaded from: classes.dex */
        public interface InterfaceC25735a {
            /* renamed from: a */
            void mo6197a(Surface surface);
        }

        /* renamed from: a */
        void mo27103a(Executor executor, InterfaceC25735a interfaceC25735a);
    }

    /* renamed from: a */
    InterfaceC42220hc1 mo27109a();

    /* renamed from: b */
    void mo27108b(InterfaceC48732sb1 interfaceC48732sb1, Executor executor);

    /* renamed from: c */
    InterfaceC25733a mo27107c();

    /* renamed from: d */
    ListenableFuture<Void> mo27106d();

    /* renamed from: e */
    void mo27105e();

    /* renamed from: f */
    int mo27104f();

    void pause();

    void release();

    void start();

    void stop(long j);
}
