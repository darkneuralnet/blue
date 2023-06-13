package p000;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC24578y;
import io.reactivex.InterfaceC24579z;
import io.reactivex.Observable;
import io.reactivex.disposables.C23466d;
import io.reactivex.functions.InterfaceC23478a;
/* renamed from: Lk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34277Lk0 implements InterfaceC34043Kk0 {

    /* renamed from: b */
    public final C39911di3 f21990b = new C39911di3();

    /* renamed from: Lk0$a */
    /* loaded from: classes6.dex */
    public class RunnableC5071a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ AbstractC23437E f21991b;

        public RunnableC5071a(AbstractC23437E abstractC23437E) {
            this.f21991b = abstractC23437E;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    C37302Yi1<?> m43872d = C34277Lk0.this.f21990b.m43872d();
                    InterfaceC37295Yh3<?> interfaceC37295Yh3 = m43872d.f46315c;
                    long currentTimeMillis = System.currentTimeMillis();
                    C35098Ox2.m91157s(interfaceC37295Yh3);
                    C35098Ox2.m91159q(interfaceC37295Yh3);
                    C41047fd4 c41047fd4 = new C41047fd4();
                    m43872d.m74435b(c41047fd4, this.f21991b);
                    c41047fd4.m41097a();
                    C35098Ox2.m91162n(interfaceC37295Yh3, currentTimeMillis, System.currentTimeMillis());
                } catch (InterruptedException e) {
                    C52323ye5.m3124e(e, "Error while processing client operation queue", new Object[0]);
                }
            }
        }
    }

    /* renamed from: Lk0$b */
    /* loaded from: classes6.dex */
    public class C5072b implements InterfaceC24579z<T> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC37295Yh3 f21993b;

        /* renamed from: Lk0$b$a */
        /* loaded from: classes6.dex */
        public class C5073a implements InterfaceC23478a {

            /* renamed from: b */
            public final /* synthetic */ C37302Yi1 f21995b;

            public C5073a(C37302Yi1 c37302Yi1) {
                this.f21995b = c37302Yi1;
            }

            @Override // io.reactivex.functions.InterfaceC23478a
            public void run() {
                if (C34277Lk0.this.f21990b.m43873c(this.f21995b)) {
                    C35098Ox2.m91160p(C5072b.this.f21993b);
                }
            }
        }

        public C5072b(InterfaceC37295Yh3 interfaceC37295Yh3) {
            this.f21993b = interfaceC37295Yh3;
        }

        @Override // io.reactivex.InterfaceC24579z
        public void subscribe(InterfaceC24578y<T> interfaceC24578y) {
            C37302Yi1 c37302Yi1 = new C37302Yi1(this.f21993b, interfaceC24578y);
            interfaceC24578y.mo11915b(C23466d.m33021c(new C5073a(c37302Yi1)));
            C35098Ox2.m91161o(this.f21993b);
            C34277Lk0.this.f21990b.m43875a(c37302Yi1);
        }
    }

    public C34277Lk0(AbstractC23437E abstractC23437E) {
        new Thread(new RunnableC5071a(abstractC23437E)).start();
    }

    @Override // p000.InterfaceC34043Kk0
    /* renamed from: a */
    public <T> Observable<T> mo14979a(InterfaceC37295Yh3<T> interfaceC37295Yh3) {
        return Observable.create(new C5072b(interfaceC37295Yh3));
    }
}
