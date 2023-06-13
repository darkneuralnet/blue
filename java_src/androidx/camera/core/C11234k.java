package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.AbstractC11152d;
import androidx.camera.core.C11234k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p000.KX1;
/* renamed from: androidx.camera.core.k */
/* loaded from: classes.dex */
public class C11234k implements KX1, AbstractC11152d.InterfaceC11153a {

    /* renamed from: a */
    public final Object f52714a;

    /* renamed from: b */
    public AbstractC46943pa0 f52715b;

    /* renamed from: c */
    public int f52716c;

    /* renamed from: d */
    public KX1.InterfaceC4462a f52717d;

    /* renamed from: e */
    public boolean f52718e;

    /* renamed from: f */
    public final KX1 f52719f;

    /* renamed from: g */
    public KX1.InterfaceC4462a f52720g;

    /* renamed from: h */
    public Executor f52721h;

    /* renamed from: i */
    public final LongSparseArray<InterfaceC51066wX1> f52722i;

    /* renamed from: j */
    public final LongSparseArray<InterfaceC11183i> f52723j;

    /* renamed from: k */
    public int f52724k;

    /* renamed from: l */
    public final List<InterfaceC11183i> f52725l;

    /* renamed from: m */
    public final List<InterfaceC11183i> f52726m;

    /* renamed from: androidx.camera.core.k$a */
    /* loaded from: classes.dex */
    public class C11235a extends AbstractC46943pa0 {
        public C11235a() {
        }

        @Override // p000.AbstractC46943pa0
        /* renamed from: b */
        public void mo4448b(InterfaceC51685xa0 interfaceC51685xa0) {
            super.mo4448b(interfaceC51685xa0);
            C11234k.this.m69177t(interfaceC51685xa0);
        }
    }

    public C11234k(int i, int i2, int i3, int i4) {
        this(m69186k(i, i2, i3, i4));
    }

    /* renamed from: k */
    public static KX1 m69186k(int i, int i2, int i3, int i4) {
        return new C7888Tc(ImageReader.newInstance(i, i2, i3, i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m69181p(KX1.InterfaceC4462a interfaceC4462a) {
        interfaceC4462a.mo12500a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m69180q(KX1 kx1) {
        synchronized (this.f52714a) {
            this.f52716c++;
        }
        m69182o(kx1);
    }

    @Override // p000.KX1
    /* renamed from: a */
    public Surface mo69137a() {
        Surface mo69137a;
        synchronized (this.f52714a) {
            mo69137a = this.f52719f.mo69137a();
        }
        return mo69137a;
    }

    @Override // p000.KX1
    /* renamed from: b */
    public int mo69136b() {
        int mo69136b;
        synchronized (this.f52714a) {
            mo69136b = this.f52719f.mo69136b();
        }
        return mo69136b;
    }

    @Override // p000.KX1
    /* renamed from: c */
    public int mo69135c() {
        int mo69135c;
        synchronized (this.f52714a) {
            mo69135c = this.f52719f.mo69135c();
        }
        return mo69135c;
    }

    @Override // p000.KX1
    public void close() {
        synchronized (this.f52714a) {
            if (this.f52718e) {
                return;
            }
            for (InterfaceC11183i interfaceC11183i : new ArrayList(this.f52725l)) {
                interfaceC11183i.close();
            }
            this.f52725l.clear();
            this.f52719f.close();
            this.f52718e = true;
        }
    }

    @Override // p000.KX1
    /* renamed from: d */
    public void mo69134d(KX1.InterfaceC4462a interfaceC4462a, Executor executor) {
        synchronized (this.f52714a) {
            this.f52720g = (KX1.InterfaceC4462a) HZ3.m103731g(interfaceC4462a);
            this.f52721h = (Executor) HZ3.m103731g(executor);
            this.f52719f.mo69134d(this.f52717d, executor);
        }
    }

    @Override // p000.KX1
    /* renamed from: e */
    public InterfaceC11183i mo69133e() {
        synchronized (this.f52714a) {
            if (this.f52725l.isEmpty()) {
                return null;
            }
            if (this.f52724k < this.f52725l.size()) {
                List<InterfaceC11183i> list = this.f52725l;
                int i = this.f52724k;
                this.f52724k = i + 1;
                InterfaceC11183i interfaceC11183i = list.get(i);
                this.f52726m.add(interfaceC11183i);
                return interfaceC11183i;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    @Override // androidx.camera.core.AbstractC11152d.InterfaceC11153a
    /* renamed from: f */
    public void mo43878f(InterfaceC11183i interfaceC11183i) {
        synchronized (this.f52714a) {
            m69185l(interfaceC11183i);
        }
    }

    @Override // p000.KX1
    /* renamed from: g */
    public InterfaceC11183i mo69131g() {
        synchronized (this.f52714a) {
            if (this.f52725l.isEmpty()) {
                return null;
            }
            if (this.f52724k < this.f52725l.size()) {
                ArrayList<InterfaceC11183i> arrayList = new ArrayList();
                for (int i = 0; i < this.f52725l.size() - 1; i++) {
                    if (!this.f52726m.contains(this.f52725l.get(i))) {
                        arrayList.add(this.f52725l.get(i));
                    }
                }
                for (InterfaceC11183i interfaceC11183i : arrayList) {
                    interfaceC11183i.close();
                }
                int size = this.f52725l.size() - 1;
                List<InterfaceC11183i> list = this.f52725l;
                this.f52724k = size + 1;
                InterfaceC11183i interfaceC11183i2 = list.get(size);
                this.f52726m.add(interfaceC11183i2);
                return interfaceC11183i2;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    @Override // p000.KX1
    public int getHeight() {
        int height;
        synchronized (this.f52714a) {
            height = this.f52719f.getHeight();
        }
        return height;
    }

    @Override // p000.KX1
    public int getWidth() {
        int width;
        synchronized (this.f52714a) {
            width = this.f52719f.getWidth();
        }
        return width;
    }

    @Override // p000.KX1
    /* renamed from: h */
    public void mo69130h() {
        synchronized (this.f52714a) {
            this.f52719f.mo69130h();
            this.f52720g = null;
            this.f52721h = null;
            this.f52716c = 0;
        }
    }

    /* renamed from: l */
    public final void m69185l(InterfaceC11183i interfaceC11183i) {
        synchronized (this.f52714a) {
            int indexOf = this.f52725l.indexOf(interfaceC11183i);
            if (indexOf >= 0) {
                this.f52725l.remove(indexOf);
                int i = this.f52724k;
                if (indexOf <= i) {
                    this.f52724k = i - 1;
                }
            }
            this.f52726m.remove(interfaceC11183i);
            if (this.f52716c > 0) {
                m69182o(this.f52719f);
            }
        }
    }

    /* renamed from: m */
    public final void m69184m(C41238fw5 c41238fw5) {
        final KX1.InterfaceC4462a interfaceC4462a;
        Executor executor;
        synchronized (this.f52714a) {
            if (this.f52725l.size() < mo69135c()) {
                c41238fw5.m69639a(this);
                this.f52725l.add(c41238fw5);
                interfaceC4462a = this.f52720g;
                executor = this.f52721h;
            } else {
                C33928Jx2.m99533a("TAG", "Maximum image number reached.");
                c41238fw5.close();
                interfaceC4462a = null;
                executor = null;
            }
        }
        if (interfaceC4462a != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: JT2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11234k.this.m69181p(interfaceC4462a);
                    }
                });
            } else {
                interfaceC4462a.mo12500a(this);
            }
        }
    }

    /* renamed from: n */
    public AbstractC46943pa0 m69183n() {
        return this.f52715b;
    }

    /* renamed from: o */
    public void m69182o(KX1 kx1) {
        InterfaceC11183i interfaceC11183i;
        synchronized (this.f52714a) {
            if (this.f52718e) {
                return;
            }
            int size = this.f52723j.size() + this.f52725l.size();
            if (size >= kx1.mo69135c()) {
                C33928Jx2.m99533a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                return;
            }
            do {
                try {
                    interfaceC11183i = kx1.mo69133e();
                    if (interfaceC11183i != null) {
                        this.f52716c--;
                        size++;
                        this.f52723j.put(interfaceC11183i.mo40428i1().getTimestamp(), interfaceC11183i);
                        m69179r();
                    }
                } catch (IllegalStateException e) {
                    C33928Jx2.m99532b("MetadataImageReader", "Failed to acquire next image.", e);
                    interfaceC11183i = null;
                }
                if (interfaceC11183i == null || this.f52716c <= 0) {
                    break;
                }
            } while (size < kx1.mo69135c());
        }
    }

    /* renamed from: r */
    public final void m69179r() {
        synchronized (this.f52714a) {
            for (int size = this.f52722i.size() - 1; size >= 0; size--) {
                InterfaceC51066wX1 valueAt = this.f52722i.valueAt(size);
                long timestamp = valueAt.getTimestamp();
                InterfaceC11183i interfaceC11183i = this.f52723j.get(timestamp);
                if (interfaceC11183i != null) {
                    this.f52723j.remove(timestamp);
                    this.f52722i.removeAt(size);
                    m69184m(new C41238fw5(interfaceC11183i, valueAt));
                }
            }
            m69178s();
        }
    }

    /* renamed from: s */
    public final void m69178s() {
        synchronized (this.f52714a) {
            if (this.f52723j.size() != 0 && this.f52722i.size() != 0) {
                boolean z = false;
                Long valueOf = Long.valueOf(this.f52723j.keyAt(0));
                Long valueOf2 = Long.valueOf(this.f52722i.keyAt(0));
                if (!valueOf2.equals(valueOf)) {
                    z = true;
                }
                HZ3.m103737a(z);
                if (valueOf2.longValue() > valueOf.longValue()) {
                    for (int size = this.f52723j.size() - 1; size >= 0; size--) {
                        if (this.f52723j.keyAt(size) < valueOf2.longValue()) {
                            this.f52723j.valueAt(size).close();
                            this.f52723j.removeAt(size);
                        }
                    }
                } else {
                    for (int size2 = this.f52722i.size() - 1; size2 >= 0; size2--) {
                        if (this.f52722i.keyAt(size2) < valueOf.longValue()) {
                            this.f52722i.removeAt(size2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: t */
    public void m69177t(InterfaceC51685xa0 interfaceC51685xa0) {
        synchronized (this.f52714a) {
            if (this.f52718e) {
                return;
            }
            this.f52722i.put(interfaceC51685xa0.getTimestamp(), new C52278ya0(interfaceC51685xa0));
            m69179r();
        }
    }

    public C11234k(KX1 kx1) {
        this.f52714a = new Object();
        this.f52715b = new C11235a();
        this.f52716c = 0;
        this.f52717d = new KX1.InterfaceC4462a() { // from class: IT2
            @Override // p000.KX1.InterfaceC4462a
            /* renamed from: a */
            public final void mo12500a(KX1 kx12) {
                C11234k.this.m69180q(kx12);
            }
        };
        this.f52718e = false;
        this.f52722i = new LongSparseArray<>();
        this.f52723j = new LongSparseArray<>();
        this.f52726m = new ArrayList();
        this.f52719f = kx1;
        this.f52724k = 0;
        this.f52725l = new ArrayList(mo69135c());
    }
}
