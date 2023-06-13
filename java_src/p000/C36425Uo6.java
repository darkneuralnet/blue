package p000;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.AbstractC11253p;
import androidx.camera.core.C11243o;
import androidx.camera.core.impl.C11209m;
import androidx.camera.core.impl.C11210n;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.InterfaceC11197f;
import androidx.camera.core.impl.InterfaceC11206k;
import androidx.camera.core.impl.InterfaceC11208l;
import androidx.camera.core.impl.InterfaceC11225s;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import co.bird.android.model.Detail;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC49831uR5;
import p000.C36425Uo6;
import p000.InterfaceC36578Vf6;
import p000.InterfaceC37493Zd3;
import p000.InterfaceC49470tp6;
import p000.LY0;
import p000.O80;
import p000.YV5;
/* renamed from: Uo6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36425Uo6<T extends InterfaceC49470tp6> extends AbstractC11253p {

    /* renamed from: A */
    public static final boolean f38022A;

    /* renamed from: y */
    public static final C8452e f38023y = new C8452e();

    /* renamed from: z */
    public static boolean f38024z;

    /* renamed from: n */
    public DeferrableSurface f38025n;

    /* renamed from: o */
    public MV5 f38026o;

    /* renamed from: p */
    public AbstractC49831uR5 f38027p;

    /* renamed from: q */
    public C11213q.C11215b f38028q;

    /* renamed from: r */
    public ListenableFuture<Void> f38029r;

    /* renamed from: s */
    public C11243o f38030s;

    /* renamed from: t */
    public InterfaceC49470tp6.EnumC28829a f38031t;

    /* renamed from: u */
    public YV5 f38032u;

    /* renamed from: v */
    public InterfaceC42355hp6 f38033v;

    /* renamed from: w */
    public Rect f38034w;

    /* renamed from: x */
    public final InterfaceC37493Zd3.InterfaceC10303a<AbstractC49831uR5> f38035x;

    /* renamed from: Uo6$a */
    /* loaded from: classes.dex */
    public class C8448a implements InterfaceC37493Zd3.InterfaceC10303a<AbstractC49831uR5> {
        public C8448a() {
        }

        @Override // p000.InterfaceC37493Zd3.InterfaceC10303a
        /* renamed from: b */
        public void mo68963a(AbstractC49831uR5 abstractC49831uR5) {
            if (abstractC49831uR5 != null) {
                if (C36425Uo6.this.f38031t == InterfaceC49470tp6.EnumC28829a.INACTIVE) {
                    return;
                }
                C33928Jx2.m99533a("VideoCapture", "Stream info update: old: " + C36425Uo6.this.f38027p + " new: " + abstractC49831uR5);
                C36425Uo6 c36425Uo6 = C36425Uo6.this;
                AbstractC49831uR5 abstractC49831uR52 = c36425Uo6.f38027p;
                c36425Uo6.f38027p = abstractC49831uR5;
                Set<Integer> set = AbstractC49831uR5.f112376b;
                if (!set.contains(Integer.valueOf(abstractC49831uR52.mo10279a())) && !set.contains(Integer.valueOf(abstractC49831uR5.mo10279a())) && abstractC49831uR52.mo10279a() != abstractC49831uR5.mo10279a()) {
                    C36425Uo6 c36425Uo62 = C36425Uo6.this;
                    c36425Uo62.m80863D0(c36425Uo62.m69059h(), (C37361Yo6) C36425Uo6.this.m69058i(), (BR5) HZ3.m103731g(C36425Uo6.this.m69063d()));
                    return;
                } else if ((abstractC49831uR52.mo10279a() != -1 && abstractC49831uR5.mo10279a() == -1) || (abstractC49831uR52.mo10279a() == -1 && abstractC49831uR5.mo10279a() != -1)) {
                    C36425Uo6 c36425Uo63 = C36425Uo6.this;
                    c36425Uo63.m80835l0(c36425Uo63.f38028q, abstractC49831uR5);
                    C36425Uo6 c36425Uo64 = C36425Uo6.this;
                    c36425Uo64.m69068S(c36425Uo64.f38028q.m69331m());
                    C36425Uo6.this.m69078C();
                    return;
                } else if (abstractC49831uR52.mo10278b() != abstractC49831uR5.mo10278b()) {
                    C36425Uo6 c36425Uo65 = C36425Uo6.this;
                    c36425Uo65.m80835l0(c36425Uo65.f38028q, abstractC49831uR5);
                    C36425Uo6 c36425Uo66 = C36425Uo6.this;
                    c36425Uo66.m69068S(c36425Uo66.f38028q.m69331m());
                    C36425Uo6.this.m69076E();
                    return;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("StreamInfo can't be null");
        }

        @Override // p000.InterfaceC37493Zd3.InterfaceC10303a
        public void onError(Throwable th) {
            C33928Jx2.m99521m("VideoCapture", "Receive onError from StreamState observer", th);
        }
    }

    /* renamed from: Uo6$b */
    /* loaded from: classes.dex */
    public class C8449b extends AbstractC46943pa0 {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f38037a;

        /* renamed from: b */
        public final /* synthetic */ O80.C5832a f38038b;

        /* renamed from: c */
        public final /* synthetic */ C11213q.C11215b f38039c;

        public C8449b(AtomicBoolean atomicBoolean, O80.C5832a c5832a, C11213q.C11215b c11215b) {
            this.f38037a = atomicBoolean;
            this.f38038b = c5832a;
            this.f38039c = c11215b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m80818e(C11213q.C11215b c11215b) {
            c11215b.m69327q(this);
        }

        @Override // p000.AbstractC46943pa0
        /* renamed from: b */
        public void mo4448b(InterfaceC51685xa0 interfaceC51685xa0) {
            Object m5016c;
            super.mo4448b(interfaceC51685xa0);
            if (!this.f38037a.get() && (m5016c = interfaceC51685xa0.mo2304b().m5016c("androidx.camera.video.VideoCapture.streamUpdate")) != null && ((Integer) m5016c).intValue() == this.f38038b.hashCode() && this.f38038b.m92861c(null) && !this.f38037a.getAndSet(true)) {
                ScheduledExecutorService m115446d = C31631Ac0.m115446d();
                final C11213q.C11215b c11215b = this.f38039c;
                m115446d.execute(new Runnable() { // from class: Vo6
                    @Override // java.lang.Runnable
                    public final void run() {
                        C36425Uo6.C8449b.this.m80818e(c11215b);
                    }
                });
            }
        }
    }

    /* renamed from: Uo6$c */
    /* loaded from: classes.dex */
    public class C8450c implements CA1<Void> {

        /* renamed from: a */
        public final /* synthetic */ ListenableFuture f38041a;

        /* renamed from: b */
        public final /* synthetic */ boolean f38042b;

        public C8450c(ListenableFuture listenableFuture, boolean z) {
            this.f38041a = listenableFuture;
            this.f38042b = z;
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(Void r3) {
            InterfaceC49470tp6.EnumC28829a enumC28829a;
            ListenableFuture<Void> listenableFuture = this.f38041a;
            C36425Uo6 c36425Uo6 = C36425Uo6.this;
            if (listenableFuture == c36425Uo6.f38029r && c36425Uo6.f38031t != InterfaceC49470tp6.EnumC28829a.INACTIVE) {
                if (this.f38042b) {
                    enumC28829a = InterfaceC49470tp6.EnumC28829a.ACTIVE_STREAMING;
                } else {
                    enumC28829a = InterfaceC49470tp6.EnumC28829a.ACTIVE_NON_STREAMING;
                }
                c36425Uo6.m80860G0(enumC28829a);
            }
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            if (!(th instanceof CancellationException)) {
                C33928Jx2.m99530d("VideoCapture", "Surface update completed with unexpected exception", th);
            }
        }
    }

    /* renamed from: Uo6$d */
    /* loaded from: classes.dex */
    public static final class C8451d<T extends InterfaceC49470tp6> implements InterfaceC11225s.InterfaceC11226a<C36425Uo6<T>, C37361Yo6<T>, C8451d<T>>, InterfaceC11206k.InterfaceC11207a<C8451d<T>> {

        /* renamed from: a */
        public final C11209m f38044a;

        public C8451d(T t) {
            this(m80815f(t));
        }

        /* renamed from: f */
        public static <T extends InterfaceC49470tp6> C11209m m80815f(T t) {
            C11209m m69372V = C11209m.m69372V();
            m69372V.mo69373C(C37361Yo6.f46676F, t);
            return m69372V;
        }

        /* renamed from: g */
        public static C8451d<? extends InterfaceC49470tp6> m80814g(InterfaceC11197f interfaceC11197f) {
            return new C8451d<>(C11209m.m69371W(interfaceC11197f));
        }

        @Override // p000.InterfaceC32388Di1
        /* renamed from: b */
        public InterfaceC11208l mo1343b() {
            return this.f38044a;
        }

        /* renamed from: e */
        public C36425Uo6<T> m80816e() {
            return new C36425Uo6<>(mo1341d());
        }

        @Override // androidx.camera.core.impl.InterfaceC11225s.InterfaceC11226a
        /* renamed from: h */
        public C37361Yo6<T> mo1341d() {
            return new C37361Yo6<>(C11210n.m69366T(this.f38044a));
        }

        /* renamed from: i */
        public C8451d<T> m80812i(int i) {
            mo1343b().mo69373C(InterfaceC11225s.f52676z, Integer.valueOf(i));
            return this;
        }

        /* renamed from: j */
        public C8451d<T> m80811j(Class<C36425Uo6<T>> cls) {
            mo1343b().mo69373C(RY5.f32204c, cls);
            if (mo1343b().mo69360d(RY5.f32203b, null) == null) {
                m80810k(cls.getCanonicalName() + Detail.EMPTY_CHAR + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: k */
        public C8451d<T> m80810k(String str) {
            mo1343b().mo69373C(RY5.f32203b, str);
            return this;
        }

        @Override // androidx.camera.core.impl.InterfaceC11206k.InterfaceC11207a
        /* renamed from: l */
        public C8451d<T> mo69157c(Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        @Override // androidx.camera.core.impl.InterfaceC11206k.InterfaceC11207a
        /* renamed from: m */
        public C8451d<T> mo69158a(int i) {
            mo1343b().mo69373C(InterfaceC11206k.f52627m, Integer.valueOf(i));
            return this;
        }

        /* renamed from: n */
        public C8451d<T> m80807n(InterfaceC51452xA1<AbstractC39983dp6, InterfaceC42355hp6> interfaceC51452xA1) {
            mo1343b().mo69373C(C37361Yo6.f46677G, interfaceC51452xA1);
            return this;
        }

        public C8451d(C11209m c11209m) {
            this.f38044a = c11209m;
            if (c11209m.mo69359e(C37361Yo6.f46676F)) {
                Class cls = (Class) c11209m.mo69360d(RY5.f32204c, null);
                if (cls != null && !cls.equals(C36425Uo6.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                m80811j(C36425Uo6.class);
                return;
            }
            throw new IllegalArgumentException("VideoOutput is required");
        }
    }

    /* renamed from: Uo6$e */
    /* loaded from: classes.dex */
    public static final class C8452e {

        /* renamed from: a */
        public static final InterfaceC49470tp6 f38045a;

        /* renamed from: b */
        public static final C37361Yo6<?> f38046b;

        /* renamed from: c */
        public static final InterfaceC51452xA1<AbstractC39983dp6, InterfaceC42355hp6> f38047c;

        /* renamed from: d */
        public static final Range<Integer> f38048d;

        static {
            InterfaceC49470tp6 interfaceC49470tp6 = new InterfaceC49470tp6() { // from class: Wo6
                @Override // p000.InterfaceC49470tp6
                /* renamed from: a */
                public final void mo11705a(C11243o c11243o) {
                    c11243o.m69119D();
                }
            };
            f38045a = interfaceC49470tp6;
            InterfaceC51452xA1<AbstractC39983dp6, InterfaceC42355hp6> m80805b = m80805b();
            f38047c = m80805b;
            f38048d = new Range<>(30, 30);
            f38046b = (C37361Yo6<T>) new C8451d(interfaceC49470tp6).m80812i(5).m80807n(m80805b).mo1341d();
        }

        /* renamed from: b */
        public static InterfaceC51452xA1<AbstractC39983dp6, InterfaceC42355hp6> m80805b() {
            return new InterfaceC51452xA1() { // from class: Xo6
                @Override // p000.InterfaceC51452xA1
                public final Object apply(Object obj) {
                    InterfaceC42355hp6 m80803d;
                    m80803d = C36425Uo6.C8452e.m80803d((AbstractC39983dp6) obj);
                    return m80803d;
                }
            };
        }

        /* renamed from: d */
        public static /* synthetic */ InterfaceC42355hp6 m80803d(AbstractC39983dp6 abstractC39983dp6) {
            try {
                return C42948ip6.m31765j(abstractC39983dp6);
            } catch (InvalidConfigException e) {
                C33928Jx2.m99521m("VideoCapture", "Unable to find VideoEncoderInfo", e);
                return null;
            }
        }

        /* renamed from: c */
        public C37361Yo6<?> m80804c() {
            return f38046b;
        }
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = true;
        if (Q21.m89097a(C41296g24.class) != null) {
            z = true;
        } else {
            z = false;
        }
        if (Q21.m89097a(Y14.class) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (Q21.m89097a(C41580gX1.class) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean m80826u0 = m80826u0();
        if (Q21.m89097a(C36366Ui1.class) != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z && !z2 && !z3) {
            z5 = false;
        } else {
            z5 = true;
        }
        f38022A = z5;
        if (!z2 && !z3 && !m80826u0 && !z4) {
            z6 = false;
        }
        f38024z = z6;
    }

    public C36425Uo6(C37361Yo6<T> c37361Yo6) {
        super(c37361Yo6);
        this.f38027p = AbstractC49831uR5.f112375a;
        this.f38028q = new C11213q.C11215b();
        this.f38029r = null;
        this.f38031t = InterfaceC49470tp6.EnumC28829a.INACTIVE;
        this.f38035x = new C8448a();
    }

    /* renamed from: A0 */
    public static /* synthetic */ void m80866A0(AtomicBoolean atomicBoolean, C11213q.C11215b c11215b, AbstractC46943pa0 abstractC46943pa0) {
        HZ3.m103728j(O36.m92959c(), "Surface update cancellation should only occur on main thread.");
        atomicBoolean.set(true);
        c11215b.m69327q(abstractC46943pa0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0 */
    public /* synthetic */ Object m80865B0(final C11213q.C11215b c11215b, O80.C5832a c5832a) throws Exception {
        c11215b.m69332l("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(c5832a.hashCode()));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final C8449b c8449b = new C8449b(atomicBoolean, c5832a, c11215b);
        c5832a.m92863a(new Runnable() { // from class: To6
            @Override // java.lang.Runnable
            public final void run() {
                C36425Uo6.m80866A0(atomicBoolean, c11215b, c8449b);
            }
        }, C31631Ac0.m115449a());
        c11215b.m69335i(c8449b);
        return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(c5832a.hashCode()));
    }

    /* renamed from: E0 */
    public static InterfaceC42355hp6 m80862E0(InterfaceC51452xA1<AbstractC39983dp6, InterfaceC42355hp6> interfaceC51452xA1, AbstractC52434yp6 abstractC52434yp6, FP2 fp2, Size size, Range<Integer> range) {
        return interfaceC51452xA1.apply(C37595Zo6.m72478b(C37595Zo6.m72477c(fp2, abstractC52434yp6), EnumC47841r46.UPTIME, fp2.mo91218d(), size, range));
    }

    /* renamed from: J0 */
    public static boolean m80857J0(Rect rect, Size size) {
        if (size.getWidth() == rect.width() && size.getHeight() == rect.height()) {
            return false;
        }
        return true;
    }

    /* renamed from: K0 */
    public static boolean m80856K0(InterfaceC34196Lb0 interfaceC34196Lb0) {
        return interfaceC34196Lb0.mo4458q() && f38024z;
    }

    /* renamed from: N0 */
    public static <T extends InterfaceC49470tp6> C36425Uo6<T> m80853N0(T t) {
        return new C8451d((InterfaceC49470tp6) HZ3.m103731g(t)).m80816e();
    }

    /* renamed from: g0 */
    public static void m80840g0(Set<Size> set, int i, int i2, Size size, InterfaceC42355hp6 interfaceC42355hp6) {
        if (i <= size.getWidth() && i2 <= size.getHeight()) {
            try {
                set.add(new Size(i, interfaceC42355hp6.mo29872c(i).clamp(Integer.valueOf(i2)).intValue()));
            } catch (IllegalArgumentException e) {
                C33928Jx2.m99521m("VideoCapture", "No supportedHeights for width: " + i, e);
            }
            try {
                set.add(new Size(interfaceC42355hp6.mo29874a(i2).clamp(Integer.valueOf(i)).intValue(), i2));
            } catch (IllegalArgumentException e2) {
                C33928Jx2.m99521m("VideoCapture", "No supportedWidths for height: " + i2, e2);
            }
        }
    }

    /* renamed from: h0 */
    public static Rect m80839h0(final Rect rect, Size size, InterfaceC42355hp6 interfaceC42355hp6) {
        boolean z;
        C33928Jx2.m99533a("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", C46705p96.m19864k(rect), Integer.valueOf(interfaceC42355hp6.mo29867h()), Integer.valueOf(interfaceC42355hp6.mo29869f()), interfaceC42355hp6.mo29871d(), interfaceC42355hp6.mo29870e()));
        int mo29867h = interfaceC42355hp6.mo29867h();
        int mo29869f = interfaceC42355hp6.mo29869f();
        Range<Integer> mo29871d = interfaceC42355hp6.mo29871d();
        Range<Integer> mo29870e = interfaceC42355hp6.mo29870e();
        int m80837j0 = m80837j0(rect.width(), mo29867h, mo29871d);
        int m80836k0 = m80836k0(rect.width(), mo29867h, mo29871d);
        int m80837j02 = m80837j0(rect.height(), mo29869f, mo29870e);
        int m80836k02 = m80836k0(rect.height(), mo29869f, mo29870e);
        HashSet hashSet = new HashSet();
        m80840g0(hashSet, m80837j0, m80837j02, size, interfaceC42355hp6);
        m80840g0(hashSet, m80837j0, m80836k02, size, interfaceC42355hp6);
        m80840g0(hashSet, m80836k0, m80837j02, size, interfaceC42355hp6);
        m80840g0(hashSet, m80836k0, m80836k02, size, interfaceC42355hp6);
        if (hashSet.isEmpty()) {
            C33928Jx2.m99522l("VideoCapture", "Can't find valid cropped size");
            return rect;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        C33928Jx2.m99533a("VideoCapture", "candidatesList = " + arrayList);
        Collections.sort(arrayList, new Comparator() { // from class: So6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m80825v0;
                m80825v0 = C36425Uo6.m80825v0(rect, (Size) obj, (Size) obj2);
                return m80825v0;
            }
        });
        C33928Jx2.m99533a("VideoCapture", "sorted candidatesList = " + arrayList);
        Size size2 = (Size) arrayList.get(0);
        int width = size2.getWidth();
        int height = size2.getHeight();
        if (width == rect.width() && height == rect.height()) {
            C33928Jx2.m99533a("VideoCapture", "No need to adjust cropRect because crop size is valid.");
            return rect;
        }
        if (width % 2 == 0 && height % 2 == 0 && width <= size.getWidth() && height <= size.getHeight()) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103729i(z);
        Rect rect2 = new Rect(rect);
        if (width != rect.width()) {
            int max = Math.max(0, rect.centerX() - (width / 2));
            rect2.left = max;
            int i = max + width;
            rect2.right = i;
            if (i > size.getWidth()) {
                int width2 = size.getWidth();
                rect2.right = width2;
                rect2.left = width2 - width;
            }
        }
        if (height != rect.height()) {
            int max2 = Math.max(0, rect.centerY() - (height / 2));
            rect2.top = max2;
            int i2 = max2 + height;
            rect2.bottom = i2;
            if (i2 > size.getHeight()) {
                int height2 = size.getHeight();
                rect2.bottom = height2;
                rect2.top = height2 - height;
            }
        }
        C33928Jx2.m99533a("VideoCapture", String.format("Adjust cropRect from %s to %s", C46705p96.m19864k(rect), C46705p96.m19864k(rect2)));
        return rect2;
    }

    /* renamed from: i0 */
    public static int m80838i0(boolean z, int i, int i2, Range<Integer> range) {
        int i3 = i % i2;
        if (i3 != 0) {
            if (z) {
                i -= i3;
            } else {
                i += i2 - i3;
            }
        }
        return range.clamp(Integer.valueOf(i)).intValue();
    }

    /* renamed from: j0 */
    public static int m80837j0(int i, int i2, Range<Integer> range) {
        return m80838i0(true, i, i2, range);
    }

    /* renamed from: k0 */
    public static int m80836k0(int i, int i2, Range<Integer> range) {
        return m80838i0(false, i, i2, range);
    }

    /* renamed from: q0 */
    public static <T> T m80830q0(InterfaceC37493Zd3<T> interfaceC37493Zd3, T t) {
        ListenableFuture<T> mo72842d = interfaceC37493Zd3.mo72842d();
        if (!mo72842d.isDone()) {
            return t;
        }
        try {
            return mo72842d.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: u0 */
    public static boolean m80826u0() {
        for (InterfaceC50063up6 interfaceC50063up6 : Q21.m89096b(InterfaceC50063up6.class)) {
            if (interfaceC50063up6.mo9692a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v0 */
    public static /* synthetic */ int m80825v0(Rect rect, Size size, Size size2) {
        return (Math.abs(size.getWidth() - rect.width()) + Math.abs(size.getHeight() - rect.height())) - (Math.abs(size2.getWidth() - rect.width()) + Math.abs(size2.getHeight() - rect.height()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public /* synthetic */ void m80822y0(DeferrableSurface deferrableSurface) {
        if (deferrableSurface == this.f38025n) {
            m80833n0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public /* synthetic */ void m80821z0(String str, C37361Yo6 c37361Yo6, BR5 br5, C11213q c11213q, C11213q.EnumC11220f enumC11220f) {
        m80863D0(str, c37361Yo6, br5);
    }

    /* renamed from: C0 */
    public final void m80823x0(MV5 mv5, InterfaceC34196Lb0 interfaceC34196Lb0, C37361Yo6<T> c37361Yo6, EnumC47841r46 enumC47841r46) {
        if (interfaceC34196Lb0 == m69061f()) {
            this.f38030s = mv5.m95264j(interfaceC34196Lb0);
            c37361Yo6.m74183S().mo11701e(this.f38030s, enumC47841r46);
            m80861F0();
        }
    }

    /* renamed from: D0 */
    public void m80863D0(String str, C37361Yo6<T> c37361Yo6, BR5 br5) {
        m80833n0();
        if (m69047w(str)) {
            C11213q.C11215b m80831p0 = m80831p0(str, c37361Yo6, br5);
            this.f38028q = m80831p0;
            m80835l0(m80831p0, this.f38027p);
            m69068S(this.f38028q.m69331m());
            m69078C();
        }
    }

    /* renamed from: F0 */
    public final void m80861F0() {
        InterfaceC34196Lb0 m69061f = m69061f();
        C11243o c11243o = this.f38030s;
        Rect rect = this.f38034w;
        if (m69061f != null && c11243o != null && rect != null) {
            int m69052p = m69052p(m69061f, m69045y(m69061f));
            int m69064c = m69064c();
            MV5 mv5 = this.f38026o;
            if (mv5 != null) {
                mv5.m95274D(m69052p);
            } else {
                c11243o.m69120C(C11243o.AbstractC11251h.m69081e(rect, m69052p, m69064c, m69061f.mo4458q()));
            }
        }
    }

    /* renamed from: G0 */
    public void m80860G0(InterfaceC49470tp6.EnumC28829a enumC28829a) {
        if (enumC28829a != this.f38031t) {
            this.f38031t = enumC28829a;
            m80828s0().mo11702d(enumC28829a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.core.impl.s<?>, androidx.camera.core.impl.s] */
    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: H */
    public InterfaceC11225s<?> mo3496H(InterfaceC33962Kb0 interfaceC33962Kb0, InterfaceC11225s.InterfaceC11226a<?, ?, ?> interfaceC11226a) {
        m80854M0(interfaceC33962Kb0, interfaceC11226a);
        return interfaceC11226a.mo1341d();
    }

    /* renamed from: H0 */
    public void m80859H0(int i) {
        if (m69071P(i)) {
            m80861F0();
        }
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: I */
    public void mo3495I() {
        boolean z;
        super.mo3495I();
        HZ3.m103730h(m69063d(), "The suggested stream specification should be already updated and shouldn't be null.");
        if (this.f38030s == null) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103728j(z, "The surface request should be null when VideoCapture is attached.");
        this.f38027p = (AbstractC49831uR5) m80830q0(m80828s0().mo11703c(), AbstractC49831uR5.f112375a);
        C11213q.C11215b m80831p0 = m80831p0(m69059h(), (C37361Yo6) m69058i(), m69063d());
        this.f38028q = m80831p0;
        m80835l0(m80831p0, this.f38027p);
        m69068S(this.f38028q.m69331m());
        m69080A();
        m80828s0().mo11703c().mo72843c(C31631Ac0.m115446d(), this.f38035x);
        m80860G0(InterfaceC49470tp6.EnumC28829a.ACTIVE_NON_STREAMING);
    }

    /* renamed from: I0 */
    public final void m80858I0(final C11213q.C11215b c11215b, boolean z) {
        ListenableFuture<Void> listenableFuture = this.f38029r;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            C33928Jx2.m99533a("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        ListenableFuture<Void> m92864a = O80.m92864a(new O80.InterfaceC5834c() { // from class: No6
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m80865B0;
                m80865B0 = C36425Uo6.this.m80865B0(c11215b, c5832a);
                return m80865B0;
            }
        });
        this.f38029r = m92864a;
        IA1.m102842b(m92864a, new C8450c(m92864a, z), C31631Ac0.m115446d());
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: J */
    public void mo3494J() {
        HZ3.m103728j(O36.m92959c(), "VideoCapture can only be detached on the main thread.");
        m80860G0(InterfaceC49470tp6.EnumC28829a.INACTIVE);
        m80828s0().mo11703c().mo72844b(this.f38035x);
        ListenableFuture<Void> listenableFuture = this.f38029r;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            C33928Jx2.m99533a("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        m80833n0();
    }

    /* renamed from: L0 */
    public final boolean m80855L0(InterfaceC34196Lb0 interfaceC34196Lb0) {
        return interfaceC34196Lb0.mo4458q() && m69045y(interfaceC34196Lb0);
    }

    /* renamed from: M0 */
    public final void m80854M0(InterfaceC33962Kb0 interfaceC33962Kb0, InterfaceC11225s.InterfaceC11226a<?, ?, ?> interfaceC11226a) throws IllegalArgumentException {
        boolean z;
        FP2 m80829r0 = m80829r0();
        if (m80829r0 != null) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103736b(z, "Unable to update target resolution by null MediaSpec.");
        if (C35613Rc4.m86551i(interfaceC33962Kb0).isEmpty()) {
            C33928Jx2.m99522l("VideoCapture", "Can't find any supported quality on the device.");
            return;
        }
        C35613Rc4 mo6283e = m80829r0.mo91218d().mo6283e();
        List<C52885zb4> m86554f = mo6283e.m86554f(interfaceC33962Kb0);
        C33928Jx2.m99533a("VideoCapture", "Found selectedQualities " + m86554f + " by " + mo6283e);
        if (!m86554f.isEmpty()) {
            int mo6286b = m80829r0.mo91218d().mo6286b();
            C35379Qc4 c35379Qc4 = new C35379Qc4(interfaceC33962Kb0.mo98715l(m69056l()), C35613Rc4.m86552h(interfaceC33962Kb0));
            ArrayList arrayList = new ArrayList();
            for (C52885zb4 c52885zb4 : m86554f) {
                arrayList.addAll(c35379Qc4.m88324g(c52885zb4, mo6286b));
            }
            C33928Jx2.m99533a("VideoCapture", "Set supported resolutions = " + arrayList);
            interfaceC11226a.mo1343b().mo69373C(InterfaceC11206k.f52635u, arrayList);
            return;
        }
        throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: Q */
    public void mo69070Q(Rect rect) {
        super.mo69070Q(rect);
        m80861F0();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.camera.core.impl.s<?>, androidx.camera.core.impl.s] */
    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: j */
    public InterfaceC11225s<?> mo3483j(boolean z, InterfaceC36578Vf6 interfaceC36578Vf6) {
        InterfaceC11197f mo25424a = interfaceC36578Vf6.mo25424a(InterfaceC36578Vf6.EnumC8718b.VIDEO_CAPTURE, 1);
        if (z) {
            mo25424a = InterfaceC11197f.m69421N(mo25424a, f38023y.m80804c());
        }
        if (mo25424a == null) {
            return null;
        }
        return mo3481u(mo25424a).mo1341d();
    }

    /* renamed from: l0 */
    public void m80835l0(C11213q.C11215b c11215b, AbstractC49831uR5 abstractC49831uR5) {
        boolean z;
        boolean z2 = true;
        if (abstractC49831uR5.mo10279a() == -1) {
            z = true;
        } else {
            z = false;
        }
        if (abstractC49831uR5.mo10278b() != AbstractC49831uR5.EnumC29195a.ACTIVE) {
            z2 = false;
        }
        if (z && z2) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        c11215b.m69330n();
        if (!z) {
            if (z2) {
                c11215b.m69333k(this.f38025n);
            } else {
                c11215b.m69336h(this.f38025n);
            }
        }
        m80858I0(c11215b, z2);
    }

    /* renamed from: m0 */
    public final Rect m80834m0(Size size, InterfaceC42355hp6 interfaceC42355hp6) {
        Rect rect;
        if (m69048v() != null) {
            rect = m69048v();
        } else {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        if (interfaceC42355hp6 != null && !interfaceC42355hp6.mo29868g(rect.width(), rect.height())) {
            return m80839h0(rect, size, interfaceC42355hp6);
        }
        return rect;
    }

    /* renamed from: n0 */
    public final void m80833n0() {
        O36.m92961a();
        DeferrableSurface deferrableSurface = this.f38025n;
        if (deferrableSurface != null) {
            deferrableSurface.m69470c();
            this.f38025n = null;
        }
        YV5 yv5 = this.f38032u;
        if (yv5 != null) {
            yv5.m74961h();
            this.f38032u = null;
        }
        MV5 mv5 = this.f38026o;
        if (mv5 != null) {
            mv5.m95266h();
            this.f38026o = null;
        }
        this.f38033v = null;
        this.f38034w = null;
        this.f38030s = null;
        this.f38027p = AbstractC49831uR5.f112375a;
    }

    /* renamed from: o0 */
    public final YV5 m80832o0(InterfaceC34196Lb0 interfaceC34196Lb0, Rect rect, Size size) {
        UV5 m96644a;
        if (m69057k() == null && !m80856K0(interfaceC34196Lb0) && !m80857J0(rect, size) && !m80855L0(interfaceC34196Lb0)) {
            return null;
        }
        C33928Jx2.m99533a("VideoCapture", "Surface processing is enabled.");
        InterfaceC34196Lb0 m69061f = m69061f();
        Objects.requireNonNull(m69061f);
        InterfaceC34196Lb0 interfaceC34196Lb02 = m69061f;
        if (m69057k() != null) {
            m96644a = m69057k().m3212a();
        } else {
            m96644a = LY0.C5025a.m96644a();
        }
        return new YV5(interfaceC34196Lb02, m96644a);
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: p0 */
    public final C11213q.C11215b m80831p0(final String str, final C37361Yo6<T> c37361Yo6, final BR5 br5) {
        EnumC47841r46 mo98714n;
        boolean z;
        O36.m92961a();
        final InterfaceC34196Lb0 interfaceC34196Lb0 = (InterfaceC34196Lb0) HZ3.m103731g(m69061f());
        Size mo31669c = br5.mo31669c();
        Runnable runnable = new Runnable() { // from class: Oo6
            @Override // java.lang.Runnable
            public final void run() {
                C36425Uo6.this.m69078C();
            }
        };
        Range<Integer> m69274M = c37361Yo6.m69274M(C8452e.f38048d);
        Objects.requireNonNull(m69274M);
        FP2 m80829r0 = m80829r0();
        Objects.requireNonNull(m80829r0);
        Rect m80834m0 = m80834m0(mo31669c, m80827t0(c37361Yo6.m74184R(), C34553Mo6.m94775d(interfaceC34196Lb0.mo23505b()), m80829r0, mo31669c, m69274M));
        this.f38034w = m80834m0;
        YV5 m80832o0 = m80832o0(interfaceC34196Lb0, m80834m0, mo31669c);
        this.f38032u = m80832o0;
        if (m80832o0 == null && interfaceC34196Lb0.mo4458q()) {
            mo98714n = EnumC47841r46.UPTIME;
        } else {
            mo98714n = interfaceC34196Lb0.mo4467d().mo98714n();
        }
        final EnumC47841r46 enumC47841r46 = mo98714n;
        if (this.f38032u != null) {
            if (this.f38026o == null) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103729i(z);
            MV5 mv5 = new MV5(2, 34, br5, m69051q(), interfaceC34196Lb0.mo4458q(), this.f38034w, m69052p(interfaceC34196Lb0, m69045y(interfaceC34196Lb0)), m80855L0(interfaceC34196Lb0));
            mv5.m95269e(runnable);
            this.f38026o = mv5;
            YV5.AbstractC9796d m74952i = YV5.AbstractC9796d.m74952i(mv5);
            final MV5 mv52 = this.f38032u.m74957l(YV5.AbstractC9794b.m74954c(mv5, Collections.singletonList(m74952i))).get(m74952i);
            Objects.requireNonNull(mv52);
            mv52.m95269e(new Runnable() { // from class: Po6
                @Override // java.lang.Runnable
                public final void run() {
                    C36425Uo6.this.m80823x0(mv52, interfaceC34196Lb0, c37361Yo6, enumC47841r46);
                }
            });
            this.f38030s = mv52.m95263k(interfaceC34196Lb0, m69274M);
            final DeferrableSurface m95259o = mv5.m95259o();
            this.f38025n = m95259o;
            m95259o.m69464i().addListener(new Runnable() { // from class: Qo6
                @Override // java.lang.Runnable
                public final void run() {
                    C36425Uo6.this.m80822y0(m95259o);
                }
            }, C31631Ac0.m115446d());
        } else {
            C11243o c11243o = new C11243o(mo31669c, interfaceC34196Lb0, m69274M, runnable);
            this.f38030s = c11243o;
            this.f38025n = c11243o.m69107l();
        }
        c37361Yo6.m74183S().mo11701e(this.f38030s, enumC47841r46);
        m80861F0();
        this.f38025n.m69458p(MediaCodec.class);
        C11213q.C11215b m69329o = C11213q.C11215b.m69329o(c37361Yo6, br5.mo31669c());
        m69329o.m69326r(br5.mo31670b());
        m69329o.m69338f(new C11213q.InterfaceC11216c() { // from class: Ro6
            @Override // androidx.camera.core.impl.C11213q.InterfaceC11216c
            /* renamed from: a */
            public final void mo1277a(C11213q c11213q, C11213q.EnumC11220f enumC11220f) {
                C36425Uo6.this.m80821z0(str, c37361Yo6, br5, c11213q, enumC11220f);
            }
        });
        if (f38022A) {
            m69329o.m69323u(1);
        }
        return m69329o;
    }

    /* renamed from: r0 */
    public final FP2 m80829r0() {
        return (FP2) m80830q0(m80828s0().mo11704b(), null);
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: s */
    public Set<Integer> mo3482s() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    /* renamed from: s0 */
    public T m80828s0() {
        return (T) ((C37361Yo6) m69058i()).m74183S();
    }

    /* renamed from: t0 */
    public final InterfaceC42355hp6 m80827t0(InterfaceC51452xA1<AbstractC39983dp6, InterfaceC42355hp6> interfaceC51452xA1, C34553Mo6 c34553Mo6, FP2 fp2, Size size, Range<Integer> range) {
        InterfaceC42355hp6 interfaceC42355hp6 = this.f38033v;
        if (interfaceC42355hp6 != null) {
            return interfaceC42355hp6;
        }
        AbstractC52434yp6 m94777b = c34553Mo6.m94777b(size);
        InterfaceC42355hp6 m80862E0 = m80862E0(interfaceC51452xA1, m94777b, fp2, size, range);
        Size size2 = null;
        if (m80862E0 == null) {
            C33928Jx2.m99522l("VideoCapture", "Can't find videoEncoderInfo");
            return null;
        }
        if (m94777b != null) {
            size2 = new Size(m94777b.mo2519h().mo4511k(), m94777b.mo2519h().mo4514h());
        }
        InterfaceC42355hp6 m29866i = C43541jp6.m29866i(m80862E0, size2);
        this.f38033v = m29866i;
        return m29866i;
    }

    public String toString() {
        return "VideoCapture:" + m69054n();
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: u */
    public InterfaceC11225s.InterfaceC11226a<?, ?, ?> mo3481u(InterfaceC11197f interfaceC11197f) {
        return C8451d.m80814g(interfaceC11197f);
    }
}
