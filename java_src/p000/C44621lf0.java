package p000;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.AbstractC11152d;
import androidx.camera.core.C11234k;
import androidx.camera.core.C11242n;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.InterfaceC11183i;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p000.KX1;
/* renamed from: lf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C44621lf0 {

    /* renamed from: a */
    public final Set<Integer> f96509a = new HashSet();

    /* renamed from: b */
    public C40753f74 f96510b = null;

    /* renamed from: c */
    public C11242n f96511c;

    /* renamed from: d */
    public AbstractC25756c f96512d;

    /* renamed from: e */
    public AbstractC25755b f96513e;

    /* renamed from: lf0$a */
    /* loaded from: classes.dex */
    public class C25754a implements CA1<Void> {

        /* renamed from: a */
        public final /* synthetic */ C40753f74 f96514a;

        public C25754a(C40753f74 c40753f74) {
            this.f96514a = c40753f74;
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(Void r1) {
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            O36.m92961a();
            C40753f74 c40753f74 = this.f96514a;
            C44621lf0 c44621lf0 = C44621lf0.this;
            if (c40753f74 == c44621lf0.f96510b) {
                c44621lf0.f96510b = null;
            }
        }
    }

    /* renamed from: lf0$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC25755b {

        /* renamed from: a */
        public AbstractC46943pa0 f96516a;

        /* renamed from: b */
        public DeferrableSurface f96517b;

        /* renamed from: g */
        public static AbstractC25755b m27031g(Size size, int i) {
            return new C27729qt(size, i, new C48478s91(), new C48478s91());
        }

        /* renamed from: a */
        public AbstractC46943pa0 m27033a() {
            return this.f96516a;
        }

        /* renamed from: b */
        public abstract C48478s91<ImageCaptureException> mo16814b();

        /* renamed from: c */
        public abstract int mo16813c();

        /* renamed from: d */
        public abstract C48478s91<C40753f74> mo16812d();

        /* renamed from: e */
        public abstract Size mo16811e();

        /* renamed from: f */
        public DeferrableSurface m27032f() {
            return this.f96517b;
        }

        /* renamed from: h */
        public void m27030h(AbstractC46943pa0 abstractC46943pa0) {
            this.f96516a = abstractC46943pa0;
        }

        /* renamed from: i */
        public void m27029i(Surface surface) {
            boolean z;
            if (this.f96517b == null) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103728j(z, "The surface is already set.");
            this.f96517b = new NY1(surface, mo16811e(), mo16813c());
        }
    }

    /* renamed from: lf0$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC25756c {
        /* renamed from: d */
        public static AbstractC25756c m27028d(int i) {
            return new C28046rt(new C48478s91(), new C48478s91(), i);
        }

        /* renamed from: a */
        public abstract int mo15141a();

        /* renamed from: b */
        public abstract C48478s91<InterfaceC11183i> mo15140b();

        /* renamed from: c */
        public abstract C48478s91<C40753f74> mo15139c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m27043c(KX1 kx1) {
        try {
            InterfaceC11183i mo69131g = kx1.mo69131g();
            if (mo69131g != null) {
                m27041e(mo69131g);
            } else {
                m27037i(new ImageCaptureException(2, "Failed to acquire latest image", null));
            }
        } catch (IllegalStateException e) {
            m27037i(new ImageCaptureException(2, "Failed to acquire latest image", e));
        }
    }

    /* renamed from: b */
    public int m27044b() {
        boolean z;
        O36.m92961a();
        if (this.f96511c != null) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103728j(z, "The ImageReader is not initialized.");
        return this.f96511c.m69128j();
    }

    /* renamed from: d */
    public final void m27042d(InterfaceC11183i interfaceC11183i) {
        Object m5016c = interfaceC11183i.mo40428i1().mo3254b().m5016c(this.f96510b.m41985h());
        Objects.requireNonNull(m5016c);
        int intValue = ((Integer) m5016c).intValue();
        boolean contains = this.f96509a.contains(Integer.valueOf(intValue));
        HZ3.m103728j(contains, "Received an unexpected stage id" + intValue);
        this.f96509a.remove(Integer.valueOf(intValue));
        AbstractC25756c abstractC25756c = this.f96512d;
        Objects.requireNonNull(abstractC25756c);
        abstractC25756c.mo15140b().accept(interfaceC11183i);
        if (this.f96509a.isEmpty()) {
            C40753f74 c40753f74 = this.f96510b;
            this.f96510b = null;
            c40753f74.m41979n();
        }
    }

    /* renamed from: e */
    public void m27041e(InterfaceC11183i interfaceC11183i) {
        O36.m92961a();
        if (this.f96510b == null) {
            C33928Jx2.m99533a("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + interfaceC11183i);
            interfaceC11183i.close();
            return;
        }
        m27042d(interfaceC11183i);
    }

    /* renamed from: f */
    public void m27040f(C40753f74 c40753f74) {
        boolean z;
        O36.m92961a();
        boolean z2 = true;
        if (m27044b() > 0) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103728j(z, "Too many acquire images. Close image to be able to process next.");
        if (this.f96510b != null && !this.f96509a.isEmpty()) {
            z2 = false;
        }
        HZ3.m103728j(z2, "The previous request is not complete");
        this.f96510b = c40753f74;
        this.f96509a.addAll(c40753f74.m41986g());
        AbstractC25756c abstractC25756c = this.f96512d;
        Objects.requireNonNull(abstractC25756c);
        abstractC25756c.mo15139c().accept(c40753f74);
        IA1.m102842b(c40753f74.m41992a(), new C25754a(c40753f74), C31631Ac0.m115449a());
    }

    /* renamed from: g */
    public void m27039g() {
        O36.m92961a();
        AbstractC25755b abstractC25755b = this.f96513e;
        Objects.requireNonNull(abstractC25755b);
        C11242n c11242n = this.f96511c;
        Objects.requireNonNull(c11242n);
        m27038h(abstractC25755b, c11242n);
    }

    /* renamed from: h */
    public final void m27038h(AbstractC25755b abstractC25755b, C11242n c11242n) {
        abstractC25755b.m27032f().m69470c();
        ListenableFuture<Void> m69464i = abstractC25755b.m27032f().m69464i();
        Objects.requireNonNull(c11242n);
        m69464i.addListener(new RunnableC49760uJ6(c11242n), C31631Ac0.m115446d());
    }

    /* renamed from: i */
    public void m27037i(ImageCaptureException imageCaptureException) {
        O36.m92961a();
        C40753f74 c40753f74 = this.f96510b;
        if (c40753f74 != null) {
            c40753f74.m41982k(imageCaptureException);
        }
    }

    /* renamed from: j */
    public void m27036j(AbstractC11152d.InterfaceC11153a interfaceC11153a) {
        boolean z;
        O36.m92961a();
        if (this.f96511c != null) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103728j(z, "The ImageReader is not initialized.");
        this.f96511c.m69124n(interfaceC11153a);
    }

    /* renamed from: k */
    public AbstractC25756c m27035k(AbstractC25755b abstractC25755b) {
        boolean z;
        if (this.f96513e == null && this.f96511c == null) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103728j(z, "CaptureNode does not support recreation yet.");
        this.f96513e = abstractC25755b;
        Size mo16811e = abstractC25755b.mo16811e();
        C11234k c11234k = new C11234k(mo16811e.getWidth(), mo16811e.getHeight(), abstractC25755b.mo16813c(), 4);
        this.f96511c = new C11242n(c11234k);
        abstractC25755b.m27030h(c11234k.m69183n());
        Surface mo69137a = c11234k.mo69137a();
        Objects.requireNonNull(mo69137a);
        abstractC25755b.m27029i(mo69137a);
        c11234k.mo69134d(new KX1.InterfaceC4462a() { // from class: if0
            @Override // p000.KX1.InterfaceC4462a
            /* renamed from: a */
            public final void mo12500a(KX1 kx1) {
                C44621lf0.this.m27043c(kx1);
            }
        }, C31631Ac0.m115446d());
        abstractC25755b.mo16812d().m14666a(new InterfaceC48378rz0() { // from class: jf0
            @Override // p000.InterfaceC48378rz0
            public final void accept(Object obj) {
                C44621lf0.this.m27040f((C40753f74) obj);
            }
        });
        abstractC25755b.mo16814b().m14666a(new InterfaceC48378rz0() { // from class: kf0
            @Override // p000.InterfaceC48378rz0
            public final void accept(Object obj) {
                C44621lf0.this.m27037i((ImageCaptureException) obj);
            }
        });
        AbstractC25756c m27028d = AbstractC25756c.m27028d(abstractC25755b.mo16813c());
        this.f96512d = m27028d;
        return m27028d;
    }
}
