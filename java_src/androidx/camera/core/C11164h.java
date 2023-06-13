package androidx.camera.core;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.AbstractC11152d;
import androidx.camera.core.C11164h;
import androidx.camera.core.RunnableC11230j;
import androidx.camera.core.impl.C11192d;
import androidx.camera.core.impl.C11204i;
import androidx.camera.core.impl.C11209m;
import androidx.camera.core.impl.C11210n;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.InterfaceC11197f;
import androidx.camera.core.impl.InterfaceC11205j;
import androidx.camera.core.impl.InterfaceC11206k;
import androidx.camera.core.impl.InterfaceC11208l;
import androidx.camera.core.impl.InterfaceC11225s;
import androidx.camera.core.internal.utils.ImageUtil;
import co.bird.android.model.Detail;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000.InterfaceC36578Vf6;
import p000.KX1;
import p000.O80;
/* renamed from: androidx.camera.core.h */
/* loaded from: classes.dex */
public final class C11164h extends AbstractC11253p {

    /* renamed from: G */
    public static final C11172h f52481G = new C11172h();

    /* renamed from: H */
    public static final C39298ci1 f52482H = new C39298ci1();

    /* renamed from: A */
    public DeferrableSurface f52483A;

    /* renamed from: B */
    public C11174j f52484B;

    /* renamed from: C */
    public final Executor f52485C;

    /* renamed from: D */
    public EX1 f52486D;

    /* renamed from: E */
    public FY5 f52487E;

    /* renamed from: F */
    public final InterfaceC40394eX1 f52488F;

    /* renamed from: n */
    public boolean f52489n;

    /* renamed from: o */
    public final KX1.InterfaceC4462a f52490o;

    /* renamed from: p */
    public final Executor f52491p;

    /* renamed from: q */
    public final int f52492q;

    /* renamed from: r */
    public final AtomicReference<Integer> f52493r;

    /* renamed from: s */
    public final int f52494s;

    /* renamed from: t */
    public int f52495t;

    /* renamed from: u */
    public Rational f52496u;

    /* renamed from: v */
    public C11192d f52497v;

    /* renamed from: w */
    public boolean f52498w;

    /* renamed from: x */
    public C11213q.C11215b f52499x;

    /* renamed from: y */
    public C11242n f52500y;

    /* renamed from: z */
    public AbstractC46943pa0 f52501z;

    /* renamed from: androidx.camera.core.h$a */
    /* loaded from: classes.dex */
    public class C11165a extends AbstractC46943pa0 {
        public C11165a() {
        }
    }

    /* renamed from: androidx.camera.core.h$b */
    /* loaded from: classes.dex */
    public class C11166b extends AbstractC46943pa0 {
        public C11166b() {
        }
    }

    /* renamed from: androidx.camera.core.h$c */
    /* loaded from: classes.dex */
    public class C11167c implements RunnableC11230j.InterfaceC11232b {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC11179m f52504a;

        public C11167c(InterfaceC11179m interfaceC11179m) {
            this.f52504a = interfaceC11179m;
        }

        @Override // androidx.camera.core.RunnableC11230j.InterfaceC11232b
        /* renamed from: a */
        public void mo69191a(C11182o c11182o) {
            this.f52504a.mo54009a(c11182o);
        }

        @Override // androidx.camera.core.RunnableC11230j.InterfaceC11232b
        /* renamed from: b */
        public void mo69190b(RunnableC11230j.EnumC11233c enumC11233c, String str, Throwable th) {
            int i;
            if (enumC11233c == RunnableC11230j.EnumC11233c.FILE_IO_FAILED) {
                i = 1;
            } else {
                i = 0;
            }
            this.f52504a.mo54008b(new ImageCaptureException(i, str, th));
        }
    }

    /* renamed from: androidx.camera.core.h$d */
    /* loaded from: classes.dex */
    public class C11168d extends AbstractC11178l {

        /* renamed from: a */
        public final /* synthetic */ C11180n f52506a;

        /* renamed from: b */
        public final /* synthetic */ int f52507b;

        /* renamed from: c */
        public final /* synthetic */ Executor f52508c;

        /* renamed from: d */
        public final /* synthetic */ RunnableC11230j.InterfaceC11232b f52509d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC11179m f52510e;

        public C11168d(C11180n c11180n, int i, Executor executor, RunnableC11230j.InterfaceC11232b interfaceC11232b, InterfaceC11179m interfaceC11179m) {
            this.f52506a = c11180n;
            this.f52507b = i;
            this.f52508c = executor;
            this.f52509d = interfaceC11232b;
            this.f52510e = interfaceC11179m;
        }

        @Override // androidx.camera.core.C11164h.AbstractC11178l
        /* renamed from: a */
        public void mo54647a(InterfaceC11183i interfaceC11183i) {
            C11164h.this.f52491p.execute(new RunnableC11230j(interfaceC11183i, this.f52506a, interfaceC11183i.mo40428i1().mo3253c(), this.f52507b, this.f52508c, C11164h.this.f52485C, this.f52509d));
        }

        @Override // androidx.camera.core.C11164h.AbstractC11178l
        /* renamed from: b */
        public void mo54646b(ImageCaptureException imageCaptureException) {
            this.f52510e.mo54008b(imageCaptureException);
        }
    }

    /* renamed from: androidx.camera.core.h$e */
    /* loaded from: classes.dex */
    public class C11169e implements CA1<Void> {

        /* renamed from: a */
        public final /* synthetic */ O80.C5832a f52512a;

        public C11169e(O80.C5832a c5832a) {
            this.f52512a = c5832a;
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(Void r1) {
            C11164h.this.m69550W0();
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            C11164h.this.m69550W0();
            this.f52512a.m92858f(th);
        }
    }

    /* renamed from: androidx.camera.core.h$f */
    /* loaded from: classes.dex */
    public class C11170f implements InterfaceC40394eX1 {
        public C11170f() {
        }

        @Override // p000.InterfaceC40394eX1
        /* renamed from: a */
        public void mo42812a() {
            C11164h.this.m69565K0();
        }

        @Override // p000.InterfaceC40394eX1
        /* renamed from: b */
        public void mo42811b() {
            C11164h.this.m69550W0();
        }

        @Override // p000.InterfaceC40394eX1
        /* renamed from: c */
        public ListenableFuture<Void> mo42810c(List<C11192d> list) {
            return C11164h.this.m69559Q0(list);
        }
    }

    /* renamed from: androidx.camera.core.h$g */
    /* loaded from: classes.dex */
    public static final class C11171g implements InterfaceC11225s.InterfaceC11226a<C11164h, C11204i, C11171g>, InterfaceC11206k.InterfaceC11207a<C11171g> {

        /* renamed from: a */
        public final C11209m f52515a;

        public C11171g() {
            this(C11209m.m69372V());
        }

        /* renamed from: f */
        public static C11171g m69518f(InterfaceC11197f interfaceC11197f) {
            return new C11171g(C11209m.m69371W(interfaceC11197f));
        }

        @Override // p000.InterfaceC32388Di1
        /* renamed from: b */
        public InterfaceC11208l mo1343b() {
            return this.f52515a;
        }

        /* renamed from: e */
        public C11164h m69519e() {
            Integer num;
            Integer num2 = (Integer) mo1343b().mo69360d(C11204i.f52618I, null);
            if (num2 != null) {
                mo1343b().mo69373C(InterfaceC11205j.f52625k, num2);
            } else {
                mo1343b().mo69373C(InterfaceC11205j.f52625k, 256);
            }
            C11204i mo1341d = mo1341d();
            InterfaceC11206k.m69385F(mo1341d);
            C11164h c11164h = new C11164h(mo1341d);
            Size size = (Size) mo1343b().mo69360d(InterfaceC11206k.f52630p, null);
            if (size != null) {
                c11164h.m69562N0(new Rational(size.getWidth(), size.getHeight()));
            }
            HZ3.m103730h((Executor) mo1343b().mo69360d(W92.f40501a, C31631Ac0.m115447c()), "The IO executor can't be null");
            InterfaceC11208l mo1343b = mo1343b();
            InterfaceC11197f.AbstractC11198a<Integer> abstractC11198a = C11204i.f52616G;
            if (mo1343b.mo69359e(abstractC11198a) && ((num = (Integer) mo1343b().mo69363a(abstractC11198a)) == null || (num.intValue() != 0 && num.intValue() != 1 && num.intValue() != 2))) {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num);
            }
            return c11164h;
        }

        @Override // androidx.camera.core.impl.InterfaceC11225s.InterfaceC11226a
        /* renamed from: g */
        public C11204i mo1341d() {
            return new C11204i(C11210n.m69366T(this.f52515a));
        }

        /* renamed from: h */
        public C11171g m69516h(int i) {
            mo1343b().mo69373C(C11204i.f52615F, Integer.valueOf(i));
            return this;
        }

        /* renamed from: i */
        public C11171g m69515i(Executor executor) {
            mo1343b().mo69373C(W92.f40501a, executor);
            return this;
        }

        /* renamed from: j */
        public C11171g m69514j(int i) {
            HZ3.m103735c(i, 1, 100, "jpegQuality");
            mo1343b().mo69373C(C11204i.f52623N, Integer.valueOf(i));
            return this;
        }

        /* renamed from: k */
        public C11171g m69513k(int i) {
            mo1343b().mo69373C(InterfaceC11225s.f52676z, Integer.valueOf(i));
            return this;
        }

        /* renamed from: l */
        public C11171g m69512l(int i) {
            if (i == -1) {
                i = 0;
            }
            mo1343b().mo69373C(InterfaceC11206k.f52626l, Integer.valueOf(i));
            return this;
        }

        /* renamed from: m */
        public C11171g m69511m(Class<C11164h> cls) {
            mo1343b().mo69373C(RY5.f32204c, cls);
            if (mo1343b().mo69360d(RY5.f32203b, null) == null) {
                m69510n(cls.getCanonicalName() + Detail.EMPTY_CHAR + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: n */
        public C11171g m69510n(String str) {
            mo1343b().mo69373C(RY5.f32203b, str);
            return this;
        }

        @Override // androidx.camera.core.impl.InterfaceC11206k.InterfaceC11207a
        /* renamed from: o */
        public C11171g mo69157c(Size size) {
            mo1343b().mo69373C(InterfaceC11206k.f52630p, size);
            return this;
        }

        @Override // androidx.camera.core.impl.InterfaceC11206k.InterfaceC11207a
        /* renamed from: p */
        public C11171g mo69158a(int i) {
            mo1343b().mo69373C(InterfaceC11206k.f52627m, Integer.valueOf(i));
            return this;
        }

        public C11171g(C11209m c11209m) {
            this.f52515a = c11209m;
            Class cls = (Class) c11209m.mo69360d(RY5.f32204c, null);
            if (cls != null && !cls.equals(C11164h.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            m69511m(C11164h.class);
        }
    }

    /* renamed from: androidx.camera.core.h$h */
    /* loaded from: classes.dex */
    public static final class C11172h {

        /* renamed from: a */
        public static final C11204i f52516a = new C11171g().m69513k(4).m69512l(0).mo1341d();

        /* renamed from: a */
        public C11204i m69507a() {
            return f52516a;
        }
    }

    /* renamed from: androidx.camera.core.h$i */
    /* loaded from: classes.dex */
    public static class C11173i {

        /* renamed from: a */
        public final int f52517a;

        /* renamed from: b */
        public final int f52518b;

        /* renamed from: c */
        public final Rational f52519c;

        /* renamed from: d */
        public final Executor f52520d;

        /* renamed from: e */
        public final AbstractC11178l f52521e;

        /* renamed from: f */
        public AtomicBoolean f52522f = new AtomicBoolean(false);

        /* renamed from: g */
        public final Rect f52523g;

        /* renamed from: h */
        public final Matrix f52524h;

        public C11173i(int i, int i2, Rational rational, Rect rect, Matrix matrix, Executor executor, AbstractC11178l abstractC11178l) {
            this.f52517a = i;
            this.f52518b = i2;
            if (rational != null) {
                HZ3.m103736b(!rational.isZero(), "Target ratio cannot be zero");
                HZ3.m103736b(rational.floatValue() > 0.0f, "Target ratio must be positive");
            }
            this.f52519c = rational;
            this.f52523g = rect;
            this.f52524h = matrix;
            this.f52520d = executor;
            this.f52521e = abstractC11178l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m69503d(InterfaceC11183i interfaceC11183i) {
            this.f52521e.mo54647a(interfaceC11183i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m69502e(int i, String str, Throwable th) {
            this.f52521e.mo54646b(new ImageCaptureException(i, str, th));
        }

        /* renamed from: c */
        public void m69504c(InterfaceC11183i interfaceC11183i) {
            Size size;
            int m81160s;
            if (!this.f52522f.compareAndSet(false, true)) {
                interfaceC11183i.close();
                return;
            }
            if (C11164h.f52482H.m61030b(interfaceC11183i)) {
                try {
                    ByteBuffer mo69476e = interfaceC11183i.mo69480A0()[0].mo69476e();
                    mo69476e.rewind();
                    byte[] bArr = new byte[mo69476e.capacity()];
                    mo69476e.get(bArr);
                    C36357Uh1 m81168k = C36357Uh1.m81168k(new ByteArrayInputStream(bArr));
                    mo69476e.rewind();
                    size = new Size(m81168k.m81158u(), m81168k.m81163p());
                    m81160s = m81168k.m81160s();
                } catch (IOException e) {
                    m69501f(1, "Unable to parse JPEG exif", e);
                    interfaceC11183i.close();
                    return;
                }
            } else {
                size = new Size(interfaceC11183i.getWidth(), interfaceC11183i.getHeight());
                m81160s = this.f52517a;
            }
            final C41238fw5 c41238fw5 = new C41238fw5(interfaceC11183i, size, TY1.m83423d(interfaceC11183i.mo40428i1().mo3254b(), interfaceC11183i.mo40428i1().getTimestamp(), m81160s, this.f52524h));
            c41238fw5.setCropRect(C11164h.m69536k0(this.f52523g, this.f52519c, this.f52517a, size, m81160s));
            try {
                this.f52520d.execute(new Runnable() { // from class: cX1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11164h.C11173i.this.m69503d(c41238fw5);
                    }
                });
            } catch (RejectedExecutionException unused) {
                C33928Jx2.m99531c("ImageCapture", "Unable to post to the supplied executor.");
                interfaceC11183i.close();
            }
        }

        /* renamed from: f */
        public void m69501f(final int i, final String str, final Throwable th) {
            if (!this.f52522f.compareAndSet(false, true)) {
                return;
            }
            try {
                this.f52520d.execute(new Runnable() { // from class: bX1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11164h.C11173i.this.m69502e(i, str, th);
                    }
                });
            } catch (RejectedExecutionException unused) {
                C33928Jx2.m99531c("ImageCapture", "Unable to post to the supplied executor.");
            }
        }
    }

    /* renamed from: androidx.camera.core.h$j */
    /* loaded from: classes.dex */
    public static class C11174j implements AbstractC11152d.InterfaceC11153a {

        /* renamed from: e */
        public final InterfaceC11176b f52529e;

        /* renamed from: f */
        public final int f52530f;

        /* renamed from: a */
        public final Deque<C11173i> f52525a = new ArrayDeque();

        /* renamed from: b */
        public C11173i f52526b = null;

        /* renamed from: c */
        public ListenableFuture<InterfaceC11183i> f52527c = null;

        /* renamed from: d */
        public int f52528d = 0;

        /* renamed from: g */
        public final Object f52531g = new Object();

        /* renamed from: androidx.camera.core.h$j$a */
        /* loaded from: classes.dex */
        public class C11175a implements CA1<InterfaceC11183i> {

            /* renamed from: a */
            public final /* synthetic */ C11173i f52532a;

            public C11175a(C11173i c11173i) {
                this.f52532a = c11173i;
            }

            @Override // p000.CA1
            /* renamed from: a */
            public void onSuccess(InterfaceC11183i interfaceC11183i) {
                synchronized (C11174j.this.f52531g) {
                    HZ3.m103731g(interfaceC11183i);
                    C43165jB5 c43165jB5 = new C43165jB5(interfaceC11183i);
                    c43165jB5.m69639a(C11174j.this);
                    C11174j.this.f52528d++;
                    this.f52532a.m69504c(c43165jB5);
                    C11174j c11174j = C11174j.this;
                    c11174j.f52526b = null;
                    c11174j.f52527c = null;
                    c11174j.m69499b();
                }
            }

            @Override // p000.CA1
            public void onFailure(Throwable th) {
                String str;
                synchronized (C11174j.this.f52531g) {
                    if (!(th instanceof CancellationException)) {
                        C11173i c11173i = this.f52532a;
                        int m69531p0 = C11164h.m69531p0(th);
                        if (th != null) {
                            str = th.getMessage();
                        } else {
                            str = "Unknown error";
                        }
                        c11173i.m69501f(m69531p0, str, th);
                    }
                    C11174j c11174j = C11174j.this;
                    c11174j.f52526b = null;
                    c11174j.f52527c = null;
                    c11174j.m69499b();
                }
            }
        }

        /* renamed from: androidx.camera.core.h$j$b */
        /* loaded from: classes.dex */
        public interface InterfaceC11176b {
            /* renamed from: a */
            ListenableFuture<InterfaceC11183i> mo69495a(C11173i c11173i);
        }

        public C11174j(int i, InterfaceC11176b interfaceC11176b) {
            this.f52530f = i;
            this.f52529e = interfaceC11176b;
        }

        /* renamed from: a */
        public void m69500a(Throwable th) {
            C11173i c11173i;
            ListenableFuture<InterfaceC11183i> listenableFuture;
            ArrayList<C11173i> arrayList;
            synchronized (this.f52531g) {
                c11173i = this.f52526b;
                this.f52526b = null;
                listenableFuture = this.f52527c;
                this.f52527c = null;
                arrayList = new ArrayList(this.f52525a);
                this.f52525a.clear();
            }
            if (c11173i != null && listenableFuture != null) {
                c11173i.m69501f(C11164h.m69531p0(th), th.getMessage(), th);
                listenableFuture.cancel(true);
            }
            for (C11173i c11173i2 : arrayList) {
                c11173i2.m69501f(C11164h.m69531p0(th), th.getMessage(), th);
            }
        }

        /* renamed from: b */
        public void m69499b() {
            synchronized (this.f52531g) {
                if (this.f52526b != null) {
                    return;
                }
                if (this.f52528d >= this.f52530f) {
                    C33928Jx2.m99522l("ImageCapture", "Too many acquire images. Close image to be able to process next.");
                    return;
                }
                C11173i poll = this.f52525a.poll();
                if (poll == null) {
                    return;
                }
                this.f52526b = poll;
                ListenableFuture<InterfaceC11183i> mo69495a = this.f52529e.mo69495a(poll);
                this.f52527c = mo69495a;
                IA1.m102842b(mo69495a, new C11175a(poll), C31631Ac0.m115446d());
            }
        }

        /* renamed from: c */
        public List<C11173i> m69498c() {
            ArrayList arrayList;
            ListenableFuture<InterfaceC11183i> listenableFuture;
            synchronized (this.f52531g) {
                arrayList = new ArrayList(this.f52525a);
                this.f52525a.clear();
                C11173i c11173i = this.f52526b;
                this.f52526b = null;
                if (c11173i != null && (listenableFuture = this.f52527c) != null && listenableFuture.cancel(true)) {
                    arrayList.add(0, c11173i);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        public void m69497d(C11173i c11173i) {
            int i;
            synchronized (this.f52531g) {
                this.f52525a.offer(c11173i);
                Locale locale = Locale.US;
                Object[] objArr = new Object[2];
                if (this.f52526b != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                objArr[0] = Integer.valueOf(i);
                objArr[1] = Integer.valueOf(this.f52525a.size());
                C33928Jx2.m99533a("ImageCapture", String.format(locale, "Send image capture request [current, pending] = [%d, %d]", objArr));
                m69499b();
            }
        }

        @Override // androidx.camera.core.AbstractC11152d.InterfaceC11153a
        /* renamed from: f */
        public void mo43878f(InterfaceC11183i interfaceC11183i) {
            synchronized (this.f52531g) {
                this.f52528d--;
                C31631Ac0.m115446d().execute(new Runnable() { // from class: dX1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11164h.C11174j.this.m69499b();
                    }
                });
            }
        }
    }

    /* renamed from: androidx.camera.core.h$k */
    /* loaded from: classes.dex */
    public static final class C11177k {

        /* renamed from: a */
        public boolean f52534a;

        /* renamed from: b */
        public boolean f52535b = false;

        /* renamed from: c */
        public boolean f52536c;

        /* renamed from: d */
        public Location f52537d;

        /* renamed from: a */
        public Location m69494a() {
            return this.f52537d;
        }

        /* renamed from: b */
        public boolean m69493b() {
            return this.f52534a;
        }

        /* renamed from: c */
        public boolean m69492c() {
            return this.f52535b;
        }

        /* renamed from: d */
        public boolean m69491d() {
            return this.f52536c;
        }

        /* renamed from: e */
        public void m69490e(boolean z) {
            this.f52534a = z;
            this.f52535b = true;
        }

        public String toString() {
            return "Metadata{mIsReversedHorizontal=" + this.f52534a + ", mIsReversedVertical=" + this.f52536c + ", mLocation=" + this.f52537d + "}";
        }
    }

    /* renamed from: androidx.camera.core.h$l */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11178l {
        /* renamed from: a */
        public void mo54647a(InterfaceC11183i interfaceC11183i) {
        }

        /* renamed from: b */
        public void mo54646b(ImageCaptureException imageCaptureException) {
        }
    }

    /* renamed from: androidx.camera.core.h$m */
    /* loaded from: classes.dex */
    public interface InterfaceC11179m {
        /* renamed from: a */
        void mo54009a(C11182o c11182o);

        /* renamed from: b */
        void mo54008b(ImageCaptureException imageCaptureException);
    }

    /* renamed from: androidx.camera.core.h$n */
    /* loaded from: classes.dex */
    public static final class C11180n {

        /* renamed from: a */
        public final File f52538a;

        /* renamed from: b */
        public final ContentResolver f52539b;

        /* renamed from: c */
        public final Uri f52540c;

        /* renamed from: d */
        public final ContentValues f52541d;

        /* renamed from: e */
        public final OutputStream f52542e;

        /* renamed from: f */
        public final C11177k f52543f;

        /* renamed from: androidx.camera.core.h$n$a */
        /* loaded from: classes.dex */
        public static final class C11181a {

            /* renamed from: a */
            public File f52544a;

            /* renamed from: b */
            public ContentResolver f52545b;

            /* renamed from: c */
            public Uri f52546c;

            /* renamed from: d */
            public ContentValues f52547d;

            /* renamed from: e */
            public OutputStream f52548e;

            /* renamed from: f */
            public C11177k f52549f;

            public C11181a(File file) {
                this.f52544a = file;
            }

            /* renamed from: a */
            public C11180n m69483a() {
                return new C11180n(this.f52544a, this.f52545b, this.f52546c, this.f52547d, this.f52548e, this.f52549f);
            }

            /* renamed from: b */
            public C11181a m69482b(C11177k c11177k) {
                this.f52549f = c11177k;
                return this;
            }
        }

        public C11180n(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues, OutputStream outputStream, C11177k c11177k) {
            this.f52538a = file;
            this.f52539b = contentResolver;
            this.f52540c = uri;
            this.f52541d = contentValues;
            this.f52542e = outputStream;
            this.f52543f = c11177k == null ? new C11177k() : c11177k;
        }

        /* renamed from: a */
        public ContentResolver m69489a() {
            return this.f52539b;
        }

        /* renamed from: b */
        public ContentValues m69488b() {
            return this.f52541d;
        }

        /* renamed from: c */
        public File m69487c() {
            return this.f52538a;
        }

        /* renamed from: d */
        public C11177k m69486d() {
            return this.f52543f;
        }

        /* renamed from: e */
        public OutputStream m69485e() {
            return this.f52542e;
        }

        /* renamed from: f */
        public Uri m69484f() {
            return this.f52540c;
        }

        public String toString() {
            return "OutputFileOptions{mFile=" + this.f52538a + ", mContentResolver=" + this.f52539b + ", mSaveCollection=" + this.f52540c + ", mContentValues=" + this.f52541d + ", mOutputStream=" + this.f52542e + ", mMetadata=" + this.f52543f + "}";
        }
    }

    /* renamed from: androidx.camera.core.h$o */
    /* loaded from: classes.dex */
    public static class C11182o {

        /* renamed from: a */
        public final Uri f52550a;

        public C11182o(Uri uri) {
            this.f52550a = uri;
        }

        /* renamed from: a */
        public Uri m69481a() {
            return this.f52550a;
        }
    }

    public C11164h(C11204i c11204i) {
        super(c11204i);
        this.f52489n = true;
        this.f52490o = new KX1.InterfaceC4462a() { // from class: PW1
            @Override // p000.KX1.InterfaceC4462a
            /* renamed from: a */
            public final void mo12500a(KX1 kx1) {
                C11164h.m69574B0(kx1);
            }
        };
        this.f52493r = new AtomicReference<>(null);
        this.f52495t = -1;
        this.f52496u = null;
        this.f52498w = false;
        this.f52488F = new C11170f();
        C11204i c11204i2 = (C11204i) m69058i();
        if (c11204i2.mo69359e(C11204i.f52615F)) {
            this.f52492q = c11204i2.m69394T();
        } else {
            this.f52492q = 1;
        }
        this.f52494s = c11204i2.m69392V(0);
        Executor executor = (Executor) HZ3.m103731g(c11204i2.m69390X(C31631Ac0.m115447c()));
        this.f52491p = executor;
        this.f52485C = C31631Ac0.m115444f(executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public /* synthetic */ void m69575A0(String str, C11204i c11204i, BR5 br5, C11213q c11213q, C11213q.EnumC11220f enumC11220f) {
        if (m69047w(str)) {
            this.f52487E.m106960k();
            m69537j0(true);
            C11213q.C11215b m69535l0 = m69535l0(str, c11204i, br5);
            this.f52499x = m69535l0;
            m69068S(m69535l0.m69331m());
            m69078C();
            this.f52487E.m106959l();
            return;
        }
        m69538i0();
    }

    /* renamed from: B0 */
    public static /* synthetic */ void m69574B0(KX1 kx1) {
        try {
            InterfaceC11183i mo69131g = kx1.mo69131g();
            Log.d("ImageCapture", "Discarding ImageProxy which was inadvertently acquired: " + mo69131g);
            if (mo69131g != null) {
                mo69131g.close();
            }
        } catch (IllegalStateException e) {
            Log.e("ImageCapture", "Failed to acquire latest image.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public /* synthetic */ void m69573C0(AbstractC11178l abstractC11178l) {
        abstractC11178l.mo54646b(new ImageCaptureException(4, "Not bound to a valid Camera [" + this + "]", null));
    }

    /* renamed from: D0 */
    public static /* synthetic */ void m69572D0(AbstractC11178l abstractC11178l) {
        abstractC11178l.mo54646b(new ImageCaptureException(0, "Request is canceled", null));
    }

    /* renamed from: E0 */
    public static /* synthetic */ Void m69571E0(List list) {
        return null;
    }

    /* renamed from: H0 */
    public static /* synthetic */ void m69568H0(O80.C5832a c5832a, KX1 kx1) {
        try {
            InterfaceC11183i mo69131g = kx1.mo69131g();
            if (mo69131g != null) {
                if (!c5832a.m92861c(mo69131g)) {
                    mo69131g.close();
                }
            } else {
                c5832a.m92858f(new IllegalStateException("Unable to acquire image"));
            }
        } catch (IllegalStateException e) {
            c5832a.m92858f(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0 */
    public /* synthetic */ Object m69566J0(C11173i c11173i, final O80.C5832a c5832a) throws Exception {
        this.f52500y.mo69134d(new KX1.InterfaceC4462a() { // from class: QW1
            @Override // p000.KX1.InterfaceC4462a
            /* renamed from: a */
            public final void mo12500a(KX1 kx1) {
                C11164h.m69568H0(O80.C5832a.this, kx1);
            }
        }, C31631Ac0.m115446d());
        m69565K0();
        final ListenableFuture<Void> m69522y0 = m69522y0(c11173i);
        IA1.m102842b(m69522y0, new C11169e(c5832a), C31631Ac0.m115446d());
        c5832a.m92863a(new Runnable() { // from class: RW1
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFuture.this.cancel(true);
            }
        }, C31631Ac0.m115449a());
        return "takePictureInternal";
    }

    /* renamed from: k0 */
    public static Rect m69536k0(Rect rect, Rational rational, int i, Size size, int i2) {
        if (rect != null) {
            return ImageUtil.m69228b(rect, i, size, i2);
        }
        if (rational != null) {
            if (i2 % 180 != 0) {
                rational = new Rational(rational.getDenominator(), rational.getNumerator());
            }
            if (ImageUtil.m69221i(size, rational)) {
                Rect m69229a = ImageUtil.m69229a(size, rational);
                Objects.requireNonNull(m69229a);
                return m69229a;
            }
        }
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    /* renamed from: p0 */
    public static int m69531p0(Throwable th) {
        if (th instanceof C37229Ya0) {
            return 3;
        }
        if (th instanceof ImageCaptureException) {
            return ((ImageCaptureException) th).m69656a();
        }
        return 0;
    }

    /* renamed from: v0 */
    public static boolean m69525v0(List<Pair<Integer, Size[]>> list, int i) {
        if (list == null) {
            return false;
        }
        for (Pair<Integer, Size[]> pair : list) {
            if (((Integer) pair.first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public /* synthetic */ void m69521z0(String str, C11204i c11204i, BR5 br5, C11213q c11213q, C11213q.EnumC11220f enumC11220f) {
        List<C11173i> emptyList;
        C11174j c11174j = this.f52484B;
        if (c11174j != null) {
            emptyList = c11174j.m69498c();
        } else {
            emptyList = Collections.emptyList();
        }
        m69539h0();
        if (m69047w(str)) {
            this.f52499x = m69535l0(str, c11204i, br5);
            if (this.f52484B != null) {
                for (C11173i c11173i : emptyList) {
                    this.f52484B.m69497d(c11173i);
                }
            }
            m69068S(this.f52499x.m69331m());
            m69078C();
        }
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: F */
    public void mo3497F() {
        C11204i c11204i = (C11204i) m69058i();
        this.f52497v = C11192d.C11193a.m69434j(c11204i).m69436h();
        this.f52498w = c11204i.m69387a0();
        HZ3.m103730h(m69061f(), "Attached camera cannot be null");
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: G */
    public void mo69075G() {
        m69552V0();
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [androidx.camera.core.impl.s<?>, androidx.camera.core.impl.s] */
    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: H */
    public InterfaceC11225s<?> mo3496H(InterfaceC33962Kb0 interfaceC33962Kb0, InterfaceC11225s.InterfaceC11226a<?, ?, ?> interfaceC11226a) {
        boolean z;
        if (interfaceC33962Kb0.mo98716k().m83239a(InterfaceC45052mN5.class)) {
            Boolean bool = Boolean.FALSE;
            InterfaceC11208l mo1343b = interfaceC11226a.mo1343b();
            InterfaceC11197f.AbstractC11198a<Boolean> abstractC11198a = C11204i.f52621L;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(mo1343b.mo69360d(abstractC11198a, bool2))) {
                C33928Jx2.m99522l("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                C33928Jx2.m99529e("ImageCapture", "Requesting software JPEG due to device quirk.");
                interfaceC11226a.mo1343b().mo69373C(abstractC11198a, bool2);
            }
        }
        boolean m69533n0 = m69533n0(interfaceC11226a.mo1343b());
        Integer num = (Integer) interfaceC11226a.mo1343b().mo69360d(C11204i.f52618I, null);
        int i = 35;
        if (num != null) {
            if (m69523x0() && num.intValue() != 256) {
                z = false;
            } else {
                z = true;
            }
            HZ3.m103736b(z, "Cannot set non-JPEG buffer format with Extensions enabled.");
            InterfaceC11208l mo1343b2 = interfaceC11226a.mo1343b();
            InterfaceC11197f.AbstractC11198a<Integer> abstractC11198a2 = InterfaceC11205j.f52625k;
            if (!m69533n0) {
                i = num.intValue();
            }
            mo1343b2.mo69373C(abstractC11198a2, Integer.valueOf(i));
        } else if (m69533n0) {
            interfaceC11226a.mo1343b().mo69373C(InterfaceC11205j.f52625k, 35);
        } else {
            List list = (List) interfaceC11226a.mo1343b().mo69360d(InterfaceC11206k.f52633s, null);
            if (list == null) {
                interfaceC11226a.mo1343b().mo69373C(InterfaceC11205j.f52625k, 256);
            } else if (m69525v0(list, 256)) {
                interfaceC11226a.mo1343b().mo69373C(InterfaceC11205j.f52625k, 256);
            } else if (m69525v0(list, 35)) {
                interfaceC11226a.mo1343b().mo69373C(InterfaceC11205j.f52625k, 35);
            }
        }
        return interfaceC11226a.mo1341d();
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: J */
    public void mo3494J() {
        m69540g0();
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: K */
    public BR5 mo3493K(BR5 br5) {
        C11213q.C11215b m69535l0 = m69535l0(m69059h(), (C11204i) m69058i(), br5);
        this.f52499x = m69535l0;
        m69068S(m69535l0.m69331m());
        m69080A();
        return br5;
    }

    /* renamed from: K0 */
    public void m69565K0() {
        synchronized (this.f52493r) {
            if (this.f52493r.get() != null) {
                return;
            }
            this.f52493r.set(Integer.valueOf(m69530q0()));
        }
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: L */
    public void mo3492L() {
        m69540g0();
        m69539h0();
        this.f52498w = false;
    }

    /* renamed from: L0 */
    public final void m69564L0(Executor executor, final AbstractC11178l abstractC11178l, boolean z) {
        InterfaceC34196Lb0 m69061f = m69061f();
        if (m69061f == null) {
            executor.execute(new Runnable() { // from class: YW1
                @Override // java.lang.Runnable
                public final void run() {
                    C11164h.this.m69573C0(abstractC11178l);
                }
            });
            return;
        }
        C11174j c11174j = this.f52484B;
        if (c11174j == null) {
            executor.execute(new Runnable() { // from class: ZW1
                @Override // java.lang.Runnable
                public final void run() {
                    C11164h.m69572D0(C11164h.AbstractC11178l.this);
                }
            });
        } else {
            c11174j.m69497d(new C11173i(m69053o(m69061f), m69529r0(m69061f, z), this.f52496u, m69048v(), m69051q(), executor, abstractC11178l));
        }
    }

    /* renamed from: M0 */
    public final void m69563M0(Executor executor, AbstractC11178l abstractC11178l, InterfaceC11179m interfaceC11179m) {
        ImageCaptureException imageCaptureException = new ImageCaptureException(4, "Not bound to a valid Camera [" + this + "]", null);
        if (abstractC11178l != null) {
            abstractC11178l.mo54646b(imageCaptureException);
        } else if (interfaceC11179m != null) {
            interfaceC11179m.mo54008b(imageCaptureException);
        } else {
            throw new IllegalArgumentException("Must have either in-memory or on-disk callback.");
        }
    }

    /* renamed from: N0 */
    public void m69562N0(Rational rational) {
        this.f52496u = rational;
    }

    /* renamed from: O0 */
    public void m69561O0(int i) {
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException("Invalid flash mode: " + i);
        }
        synchronized (this.f52493r) {
            this.f52495t = i;
            m69552V0();
        }
    }

    /* renamed from: P0 */
    public void m69560P0(int i) {
        int m69526u0 = m69526u0();
        if (m69071P(i) && this.f52496u != null) {
            this.f52496u = ImageUtil.m69224f(Math.abs(C38051ac0.m71099b(i) - C38051ac0.m71099b(m69526u0)), this.f52496u);
        }
    }

    /* renamed from: Q0 */
    public ListenableFuture<Void> m69559Q0(List<C11192d> list) {
        O36.m92961a();
        return IA1.m102829o(m69060g().mo16404c(list, this.f52492q, this.f52494s), new InterfaceC51452xA1() { // from class: XW1
            @Override // p000.InterfaceC51452xA1
            public final Object apply(Object obj) {
                Void m69571E0;
                m69571E0 = C11164h.m69571E0((List) obj);
                return m69571E0;
            }
        }, C31631Ac0.m115449a());
    }

    /* renamed from: R0 */
    public void m69569G0(final C11180n c11180n, final Executor executor, final InterfaceC11179m interfaceC11179m) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C31631Ac0.m115446d().execute(new Runnable() { // from class: UW1
                @Override // java.lang.Runnable
                public final void run() {
                    C11164h.this.m69569G0(c11180n, executor, interfaceC11179m);
                }
            });
        } else if (m69524w0()) {
            m69554U0(executor, null, interfaceC11179m, c11180n);
        } else {
            m69564L0(C31631Ac0.m115446d(), new C11168d(c11180n, m69528s0(), executor, new C11167c(interfaceC11179m), interfaceC11179m), true);
        }
    }

    /* renamed from: S0 */
    public void m69570F0(final Executor executor, final AbstractC11178l abstractC11178l) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C31631Ac0.m115446d().execute(new Runnable() { // from class: WW1
                @Override // java.lang.Runnable
                public final void run() {
                    C11164h.this.m69570F0(executor, abstractC11178l);
                }
            });
        } else if (m69524w0()) {
            m69554U0(executor, abstractC11178l, null, null);
        } else {
            m69564L0(executor, abstractC11178l, false);
        }
    }

    /* renamed from: T0 */
    public final ListenableFuture<InterfaceC11183i> m69556T0(final C11173i c11173i) {
        return O80.m92864a(new O80.InterfaceC5834c() { // from class: aX1
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m69566J0;
                m69566J0 = C11164h.this.m69566J0(c11173i, c5832a);
                return m69566J0;
            }
        });
    }

    /* renamed from: U0 */
    public final void m69554U0(Executor executor, AbstractC11178l abstractC11178l, InterfaceC11179m interfaceC11179m, C11180n c11180n) {
        O36.m92961a();
        Log.d("ImageCapture", "takePictureWithNode");
        InterfaceC34196Lb0 m69061f = m69061f();
        if (m69061f == null) {
            m69563M0(executor, abstractC11178l, interfaceC11179m);
        } else {
            this.f52487E.m106961j(JY5.m100235r(executor, abstractC11178l, interfaceC11179m, c11180n, m69527t0(), m69051q(), m69053o(m69061f), m69528s0(), m69532o0(), this.f52499x.m69328p()));
        }
    }

    /* renamed from: V0 */
    public final void m69552V0() {
        synchronized (this.f52493r) {
            if (this.f52493r.get() != null) {
                return;
            }
            m69060g().mo16392i(m69530q0());
        }
    }

    /* renamed from: W0 */
    public void m69550W0() {
        synchronized (this.f52493r) {
            Integer andSet = this.f52493r.getAndSet(null);
            if (andSet == null) {
                return;
            }
            if (andSet.intValue() != m69530q0()) {
                m69552V0();
            }
        }
    }

    /* renamed from: g0 */
    public final void m69540g0() {
        FY5 fy5 = this.f52487E;
        if (fy5 != null) {
            fy5.m106966d();
        } else if (this.f52484B != null) {
            this.f52484B.m69500a(new C37229Ya0("Camera is closed."));
        }
    }

    /* renamed from: h0 */
    public void m69539h0() {
        O36.m92961a();
        if (m69524w0()) {
            m69538i0();
            return;
        }
        C11174j c11174j = this.f52484B;
        if (c11174j != null) {
            c11174j.m69500a(new CancellationException("Request is canceled."));
            this.f52484B = null;
        }
        DeferrableSurface deferrableSurface = this.f52483A;
        this.f52483A = null;
        this.f52500y = null;
        if (deferrableSurface != null) {
            deferrableSurface.m69470c();
        }
    }

    /* renamed from: i0 */
    public final void m69538i0() {
        m69537j0(false);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.camera.core.impl.s<?>, androidx.camera.core.impl.s] */
    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: j */
    public InterfaceC11225s<?> mo3483j(boolean z, InterfaceC36578Vf6 interfaceC36578Vf6) {
        InterfaceC11197f mo25424a = interfaceC36578Vf6.mo25424a(InterfaceC36578Vf6.EnumC8718b.IMAGE_CAPTURE, m69532o0());
        if (z) {
            mo25424a = InterfaceC11197f.m69421N(mo25424a, f52481G.m69507a());
        }
        if (mo25424a == null) {
            return null;
        }
        return mo3481u(mo25424a).mo1341d();
    }

    /* renamed from: j0 */
    public final void m69537j0(boolean z) {
        FY5 fy5;
        Log.d("ImageCapture", "clearPipelineWithNode");
        O36.m92961a();
        EX1 ex1 = this.f52486D;
        if (ex1 != null) {
            ex1.m108867a();
            this.f52486D = null;
        }
        if (!z && (fy5 = this.f52487E) != null) {
            fy5.m106966d();
            this.f52487E = null;
        }
    }

    /* renamed from: l0 */
    public C11213q.C11215b m69535l0(final String str, final C11204i c11204i, final BR5 br5) {
        O36.m92961a();
        if (m69524w0()) {
            return m69534m0(str, c11204i, br5);
        }
        C11213q.C11215b m69329o = C11213q.C11215b.m69329o(c11204i, br5.mo31669c());
        if (m69532o0() == 2) {
            m69060g().mo16408a(m69329o);
        }
        Size mo31669c = br5.mo31669c();
        if (c11204i.m69391W() != null) {
            this.f52500y = new C11242n(c11204i.m69391W().m96710a(mo31669c.getWidth(), mo31669c.getHeight(), m69056l(), 2, 0L));
            this.f52501z = new C11165a();
        } else if (m69523x0()) {
            if (m69056l() == 256) {
                KX1 m95184a = MX1.m95184a(mo31669c.getWidth(), mo31669c.getHeight(), 256, 2);
                this.f52501z = new C11166b();
                this.f52500y = new C11242n(m95184a);
            } else {
                throw new IllegalArgumentException("Unsupported image format:" + m69056l());
            }
        } else {
            C11234k c11234k = new C11234k(mo31669c.getWidth(), mo31669c.getHeight(), m69056l(), 2);
            this.f52501z = c11234k.m69183n();
            this.f52500y = new C11242n(c11234k);
        }
        C11174j c11174j = this.f52484B;
        if (c11174j != null) {
            c11174j.m69500a(new CancellationException("Request is canceled."));
        }
        this.f52484B = new C11174j(2, new C11174j.InterfaceC11176b() { // from class: SW1
            @Override // androidx.camera.core.C11164h.C11174j.InterfaceC11176b
            /* renamed from: a */
            public final ListenableFuture mo69495a(C11164h.C11173i c11173i) {
                ListenableFuture m69556T0;
                m69556T0 = C11164h.this.m69556T0(c11173i);
                return m69556T0;
            }
        });
        this.f52500y.mo69134d(this.f52490o, C31631Ac0.m115446d());
        DeferrableSurface deferrableSurface = this.f52483A;
        if (deferrableSurface != null) {
            deferrableSurface.m69470c();
        }
        Surface mo69137a = this.f52500y.mo69137a();
        Objects.requireNonNull(mo69137a);
        NY1 ny1 = new NY1(mo69137a, new Size(this.f52500y.getWidth(), this.f52500y.getHeight()), m69056l());
        this.f52483A = ny1;
        ListenableFuture<Void> m69464i = ny1.m69464i();
        C11242n c11242n = this.f52500y;
        Objects.requireNonNull(c11242n);
        m69464i.addListener(new RunnableC49760uJ6(c11242n), C31631Ac0.m115446d());
        m69329o.m69336h(this.f52483A);
        m69329o.m69338f(new C11213q.InterfaceC11216c() { // from class: TW1
            @Override // androidx.camera.core.impl.C11213q.InterfaceC11216c
            /* renamed from: a */
            public final void mo1277a(C11213q c11213q, C11213q.EnumC11220f enumC11220f) {
                C11164h.this.m69521z0(str, c11204i, br5, c11213q, enumC11220f);
            }
        });
        return m69329o;
    }

    /* renamed from: m0 */
    public final C11213q.C11215b m69534m0(final String str, final C11204i c11204i, final BR5 br5) {
        O36.m92961a();
        boolean z = false;
        Log.d("ImageCapture", String.format("createPipelineWithNode(cameraId: %s, streamSpec: %s)", str, br5));
        Size mo31669c = br5.mo31669c();
        if (this.f52486D == null) {
            z = true;
        }
        HZ3.m103729i(z);
        this.f52486D = new EX1(c11204i, mo31669c, m69057k());
        if (this.f52487E == null) {
            this.f52487E = new FY5(this.f52488F);
        }
        this.f52487E.m106958m(this.f52486D);
        C11213q.C11215b m108862f = this.f52486D.m108862f(br5.mo31669c());
        if (m69532o0() == 2) {
            m69060g().mo16408a(m108862f);
        }
        m108862f.m69338f(new C11213q.InterfaceC11216c() { // from class: VW1
            @Override // androidx.camera.core.impl.C11213q.InterfaceC11216c
            /* renamed from: a */
            public final void mo1277a(C11213q c11213q, C11213q.EnumC11220f enumC11220f) {
                C11164h.this.m69575A0(str, c11204i, br5, c11213q, enumC11220f);
            }
        });
        return m108862f;
    }

    /* renamed from: n0 */
    public boolean m69533n0(InterfaceC11208l interfaceC11208l) {
        boolean z;
        Boolean bool = Boolean.TRUE;
        InterfaceC11197f.AbstractC11198a<Boolean> abstractC11198a = C11204i.f52621L;
        Boolean bool2 = Boolean.FALSE;
        boolean z2 = false;
        if (bool.equals(interfaceC11208l.mo69360d(abstractC11198a, bool2))) {
            if (m69523x0()) {
                C33928Jx2.m99522l("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z = false;
            } else {
                z = true;
            }
            Integer num = (Integer) interfaceC11208l.mo69360d(C11204i.f52618I, null);
            if (num != null && num.intValue() != 256) {
                C33928Jx2.m99522l("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            } else {
                z2 = z;
            }
            if (!z2) {
                C33928Jx2.m99522l("ImageCapture", "Unable to support software JPEG. Disabling.");
                interfaceC11208l.mo69373C(abstractC11198a, bool2);
            }
        }
        return z2;
    }

    /* renamed from: o0 */
    public int m69532o0() {
        return this.f52492q;
    }

    /* renamed from: q0 */
    public int m69530q0() {
        int i;
        synchronized (this.f52493r) {
            i = this.f52495t;
            if (i == -1) {
                i = ((C11204i) m69058i()).m69393U(2);
            }
        }
        return i;
    }

    /* renamed from: r0 */
    public final int m69529r0(InterfaceC34196Lb0 interfaceC34196Lb0, boolean z) {
        if (z) {
            int m69053o = m69053o(interfaceC34196Lb0);
            Size m69062e = m69062e();
            Objects.requireNonNull(m69062e);
            Rect m69536k0 = m69536k0(m69048v(), this.f52496u, m69053o, m69062e, m69053o);
            if (ImageUtil.m69216n(m69062e.getWidth(), m69062e.getHeight(), m69536k0.width(), m69536k0.height())) {
                if (this.f52492q == 0) {
                    return 100;
                }
                return 95;
            }
            return m69528s0();
        }
        return m69528s0();
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: s */
    public Set<Integer> mo3482s() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    /* renamed from: s0 */
    public final int m69528s0() {
        C11204i c11204i = (C11204i) m69058i();
        if (c11204i.mo69359e(C11204i.f52623N)) {
            return c11204i.m69389Y();
        }
        int i = this.f52492q;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("CaptureMode " + this.f52492q + " is invalid");
            }
            return 95;
        }
        return 100;
    }

    /* renamed from: t0 */
    public final Rect m69527t0() {
        Rect m69048v = m69048v();
        Size m69062e = m69062e();
        Objects.requireNonNull(m69062e);
        if (m69048v != null) {
            return m69048v;
        }
        if (ImageUtil.m69222h(this.f52496u)) {
            InterfaceC34196Lb0 m69061f = m69061f();
            Objects.requireNonNull(m69061f);
            int m69053o = m69053o(m69061f);
            Rational rational = new Rational(this.f52496u.getDenominator(), this.f52496u.getNumerator());
            if (!C46705p96.m19868g(m69053o)) {
                rational = this.f52496u;
            }
            Rect m69229a = ImageUtil.m69229a(m69062e, rational);
            Objects.requireNonNull(m69229a);
            return m69229a;
        }
        return new Rect(0, 0, m69062e.getWidth(), m69062e.getHeight());
    }

    public String toString() {
        return "ImageCapture:" + m69054n();
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: u */
    public InterfaceC11225s.InterfaceC11226a<?, ?, ?> mo3481u(InterfaceC11197f interfaceC11197f) {
        return C11171g.m69518f(interfaceC11197f);
    }

    /* renamed from: u0 */
    public int m69526u0() {
        return m69049t();
    }

    /* renamed from: w0 */
    public final boolean m69524w0() {
        O36.m92961a();
        C11204i c11204i = (C11204i) m69058i();
        if (c11204i.m69391W() != null || m69523x0() || c11204i.m69396R(256).intValue() != 256) {
            return false;
        }
        return this.f52489n;
    }

    /* renamed from: x0 */
    public final boolean m69523x0() {
        if (m69061f() == null || m69061f().mo96608l().m69454Q(null) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: y0 */
    public ListenableFuture<Void> m69522y0(C11173i c11173i) {
        C33928Jx2.m99533a("ImageCapture", "issueTakePicture");
        C11192d.C11193a c11193a = new C11192d.C11193a();
        c11193a.m69425s(this.f52497v.m69445h());
        c11193a.m69439e(this.f52497v.m69448e());
        c11193a.m69443a(this.f52499x.m69328p());
        c11193a.m69438f(this.f52483A);
        if (m69056l() == 256) {
            if (f52482H.m61031a()) {
                c11193a.m69440d(C11192d.f52582i, Integer.valueOf(c11173i.f52517a));
            }
            c11193a.m69440d(C11192d.f52583j, Integer.valueOf(c11173i.f52518b));
        }
        c11193a.m69441c(this.f52501z);
        return m69559Q0(Arrays.asList(c11193a.m69436h()));
    }
}
