package p000;

import android.annotation.SuppressLint;
import android.location.Location;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C11243o;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
import p000.AbstractC49831uR5;
import p000.AbstractC50655vp6;
import p000.AbstractC51248wp6;
import p000.C33417Hs4;
import p000.FP2;
import p000.InterfaceC44582lb1;
import p000.InterfaceC49470tp6;
import p000.O80;
/* renamed from: Hs4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33417Hs4 implements InterfaceC49470tp6 {

    /* renamed from: c0 */
    public static final Set<EnumC3253j> f13987c0 = Collections.unmodifiableSet(EnumSet.of(EnumC3253j.PENDING_RECORDING, EnumC3253j.PENDING_PAUSED));

    /* renamed from: d0 */
    public static final Set<EnumC3253j> f13988d0 = Collections.unmodifiableSet(EnumSet.of(EnumC3253j.CONFIGURING, EnumC3253j.IDLING, EnumC3253j.RESETTING, EnumC3253j.STOPPING, EnumC3253j.ERROR));

    /* renamed from: e0 */
    public static final C35613Rc4 f13989e0;

    /* renamed from: f0 */
    public static final AbstractC51248wp6 f13990f0;

    /* renamed from: g0 */
    public static final FP2 f13991g0;

    /* renamed from: h0 */
    public static final Exception f13992h0;

    /* renamed from: i0 */
    public static final InterfaceC51103wb1 f13993i0;

    /* renamed from: j0 */
    public static final Executor f13994j0;

    /* renamed from: A */
    public final HX2<FP2> f13995A;

    /* renamed from: B */
    public InterfaceC44582lb1 f13996B;

    /* renamed from: C */
    public InterfaceC35819Rz3 f13997C;

    /* renamed from: D */
    public InterfaceC44582lb1 f13998D;

    /* renamed from: E */
    public InterfaceC35819Rz3 f13999E;

    /* renamed from: F */
    public EnumC3248g f14000F;

    /* renamed from: G */
    public Uri f14001G;

    /* renamed from: H */
    public long f14002H;

    /* renamed from: I */
    public long f14003I;

    /* renamed from: J */
    public long f14004J;

    /* renamed from: K */
    public int f14005K;

    /* renamed from: L */
    public Range<Integer> f14006L;

    /* renamed from: M */
    public long f14007M;

    /* renamed from: N */
    public long f14008N;

    /* renamed from: O */
    public long f14009O;

    /* renamed from: P */
    public long f14010P;

    /* renamed from: Q */
    public long f14011Q;

    /* renamed from: R */
    public int f14012R;

    /* renamed from: S */
    public Throwable f14013S;

    /* renamed from: T */
    public InterfaceC41617gb1 f14014T;

    /* renamed from: U */
    public final InterfaceC45179mb5<InterfaceC41617gb1> f14015U;

    /* renamed from: V */
    public Throwable f14016V;

    /* renamed from: W */
    public boolean f14017W;

    /* renamed from: X */
    public InterfaceC49470tp6.EnumC28829a f14018X;

    /* renamed from: Y */
    public ScheduledFuture<?> f14019Y;

    /* renamed from: Z */
    public boolean f14020Z;

    /* renamed from: a */
    public final HX2<AbstractC49831uR5> f14021a;

    /* renamed from: a0 */
    public C48285rp6 f14022a0;

    /* renamed from: b */
    public final Executor f14023b;

    /* renamed from: b0 */
    public C48285rp6 f14024b0;

    /* renamed from: c */
    public final Executor f14025c;

    /* renamed from: d */
    public final Executor f14026d;

    /* renamed from: e */
    public final InterfaceC51103wb1 f14027e;

    /* renamed from: f */
    public final InterfaceC51103wb1 f14028f;

    /* renamed from: g */
    public final Object f14029g = new Object();

    /* renamed from: h */
    public final boolean f14030h;

    /* renamed from: i */
    public EnumC3253j f14031i;

    /* renamed from: j */
    public EnumC3253j f14032j;

    /* renamed from: k */
    public int f14033k;

    /* renamed from: l */
    public AbstractC3250i f14034l;

    /* renamed from: m */
    public AbstractC3250i f14035m;

    /* renamed from: n */
    public long f14036n;

    /* renamed from: o */
    public AbstractC3250i f14037o;

    /* renamed from: p */
    public boolean f14038p;

    /* renamed from: q */
    public C11243o.AbstractC11251h f14039q;

    /* renamed from: r */
    public AbstractC52434yp6 f14040r;

    /* renamed from: s */
    public final List<ListenableFuture<Void>> f14041s;

    /* renamed from: t */
    public Integer f14042t;

    /* renamed from: u */
    public Integer f14043u;

    /* renamed from: v */
    public C11243o f14044v;

    /* renamed from: w */
    public EnumC47841r46 f14045w;

    /* renamed from: x */
    public Surface f14046x;

    /* renamed from: y */
    public Surface f14047y;

    /* renamed from: z */
    public MediaMuxer f14048z;

    /* renamed from: Hs4$a */
    /* loaded from: classes.dex */
    public class C3242a implements CA1<InterfaceC44582lb1> {

        /* renamed from: a */
        public final /* synthetic */ C48285rp6 f14049a;

        public C3242a(C48285rp6 c48285rp6) {
            this.f14049a = c48285rp6;
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(InterfaceC44582lb1 interfaceC44582lb1) {
            boolean z;
            C33928Jx2.m99533a("Recorder", "VideoEncoder is created. " + interfaceC44582lb1);
            if (interfaceC44582lb1 == null) {
                return;
            }
            boolean z2 = true;
            if (C33417Hs4.this.f14022a0 == this.f14049a) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103729i(z);
            if (C33417Hs4.this.f13996B != null) {
                z2 = false;
            }
            HZ3.m103729i(z2);
            C33417Hs4.this.m103343X(this.f14049a);
            C33417Hs4.this.m103350Q();
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            C33928Jx2.m99533a("Recorder", "VideoEncoder Setup error: " + th);
            C33417Hs4.this.m103349R(th);
        }
    }

    /* renamed from: Hs4$b */
    /* loaded from: classes.dex */
    public class C3243b implements CA1<InterfaceC44582lb1> {

        /* renamed from: a */
        public final /* synthetic */ C48285rp6 f14051a;

        public C3243b(C48285rp6 c48285rp6) {
            this.f14051a = c48285rp6;
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(InterfaceC44582lb1 interfaceC44582lb1) {
            InterfaceC44582lb1 interfaceC44582lb12;
            C33928Jx2.m99533a("Recorder", "VideoEncoder can be released: " + interfaceC44582lb1);
            if (interfaceC44582lb1 == null) {
                return;
            }
            ScheduledFuture<?> scheduledFuture = C33417Hs4.this.f14019Y;
            if (scheduledFuture != null && scheduledFuture.cancel(false) && (interfaceC44582lb12 = C33417Hs4.this.f13996B) != null && interfaceC44582lb12 == interfaceC44582lb1) {
                C33417Hs4.m103351P(interfaceC44582lb12);
            }
            C33417Hs4 c33417Hs4 = C33417Hs4.this;
            c33417Hs4.f14024b0 = this.f14051a;
            c33417Hs4.m103336e0(null);
            C33417Hs4.this.m103341Z(4, null);
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            C33928Jx2.m99533a("Recorder", "Error in ReadyToReleaseFuture: " + th);
        }
    }

    /* renamed from: Hs4$c */
    /* loaded from: classes.dex */
    public class C3244c implements InterfaceC48732sb1 {

        /* renamed from: b */
        public final /* synthetic */ O80.C5832a f14053b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC3250i f14054c;

        public C3244c(O80.C5832a c5832a, AbstractC3250i abstractC3250i) {
            this.f14053b = c5832a;
            this.f14054c = abstractC3250i;
        }

        @Override // p000.InterfaceC48732sb1
        /* renamed from: a */
        public void mo13969a(InterfaceC41617gb1 interfaceC41617gb1) {
            boolean z;
            C33417Hs4 c33417Hs4 = C33417Hs4.this;
            if (c33417Hs4.f14048z == null) {
                if (!c33417Hs4.f14038p) {
                    InterfaceC41617gb1 interfaceC41617gb12 = c33417Hs4.f14014T;
                    if (interfaceC41617gb12 != null) {
                        interfaceC41617gb12.close();
                        C33417Hs4.this.f14014T = null;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (interfaceC41617gb1.mo33777Z()) {
                        C33417Hs4 c33417Hs42 = C33417Hs4.this;
                        c33417Hs42.f14014T = interfaceC41617gb1;
                        if (c33417Hs42.m103365B() && C33417Hs4.this.f14015U.isEmpty()) {
                            if (z) {
                                C33928Jx2.m99533a("Recorder", "Replaced cached video keyframe with newer keyframe.");
                                return;
                            } else {
                                C33928Jx2.m99533a("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
                                return;
                            }
                        }
                        C33928Jx2.m99533a("Recorder", "Received video keyframe. Starting muxer...");
                        C33417Hs4.this.m103330h0(this.f14054c);
                        return;
                    }
                    if (z) {
                        C33928Jx2.m99533a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                    }
                    C33928Jx2.m99533a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                    C33417Hs4.this.f13996B.mo27105e();
                    interfaceC41617gb1.close();
                    return;
                }
                C33928Jx2.m99533a("Recorder", "Drop video data since recording is stopping.");
                interfaceC41617gb1.close();
                return;
            }
            try {
                c33417Hs4.m103306t0(interfaceC41617gb1, this.f14054c);
                if (interfaceC41617gb1 != null) {
                    interfaceC41617gb1.close();
                }
            } catch (Throwable th) {
                if (interfaceC41617gb1 != null) {
                    try {
                        interfaceC41617gb1.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // p000.InterfaceC48732sb1
        /* renamed from: c */
        public void mo13968c() {
        }

        @Override // p000.InterfaceC48732sb1
        /* renamed from: d */
        public void mo13967d(EncodeException encodeException) {
            this.f14053b.m92858f(encodeException);
        }

        @Override // p000.InterfaceC48732sb1
        /* renamed from: e */
        public void mo13966e() {
            this.f14053b.m92861c(null);
        }

        @Override // p000.InterfaceC48732sb1
        /* renamed from: f */
        public void mo13965f(InterfaceC35819Rz3 interfaceC35819Rz3) {
            C33417Hs4.this.f13997C = interfaceC35819Rz3;
        }
    }

    /* renamed from: Hs4$d */
    /* loaded from: classes.dex */
    public class C3245d {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC48378rz0 f14056a;

        public C3245d(InterfaceC48378rz0 interfaceC48378rz0) {
            this.f14056a = interfaceC48378rz0;
        }
    }

    /* renamed from: Hs4$e */
    /* loaded from: classes.dex */
    public class C3246e implements CA1<List<Void>> {
        public C3246e() {
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(List<Void> list) {
            C33928Jx2.m99533a("Recorder", "Encodings end successfully.");
            C33417Hs4 c33417Hs4 = C33417Hs4.this;
            c33417Hs4.m103307t(c33417Hs4.f14012R, c33417Hs4.f14013S);
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            int i;
            C33928Jx2.m99533a("Recorder", "Encodings end with error: " + th);
            C33417Hs4 c33417Hs4 = C33417Hs4.this;
            if (c33417Hs4.f14048z == null) {
                i = 8;
            } else {
                i = 6;
            }
            c33417Hs4.m103307t(i, th);
        }
    }

    /* renamed from: Hs4$f */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C3247f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14059a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f14060b;

        static {
            int[] iArr = new int[EnumC3248g.values().length];
            f14060b = iArr;
            try {
                iArr[EnumC3248g.ERROR_ENCODER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14060b[EnumC3248g.ERROR_SOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14060b[EnumC3248g.ACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14060b[EnumC3248g.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14060b[EnumC3248g.IDLING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14060b[EnumC3248g.INITIALIZING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[EnumC3253j.values().length];
            f14059a = iArr2;
            try {
                iArr2[EnumC3253j.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14059a[EnumC3253j.RECORDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14059a[EnumC3253j.PENDING_PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14059a[EnumC3253j.PENDING_RECORDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14059a[EnumC3253j.RESETTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14059a[EnumC3253j.STOPPING.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14059a[EnumC3253j.CONFIGURING.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f14059a[EnumC3253j.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f14059a[EnumC3253j.IDLING.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* renamed from: Hs4$g */
    /* loaded from: classes.dex */
    public enum EnumC3248g {
        INITIALIZING,
        IDLING,
        DISABLED,
        ACTIVE,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    /* renamed from: Hs4$h */
    /* loaded from: classes.dex */
    public static final class C3249h {

        /* renamed from: a */
        public final FP2.AbstractC2236a f14068a;

        /* renamed from: b */
        public Executor f14069b = null;

        /* renamed from: c */
        public InterfaceC51103wb1 f14070c;

        /* renamed from: d */
        public InterfaceC51103wb1 f14071d;

        public C3249h() {
            InterfaceC51103wb1 interfaceC51103wb1 = C33417Hs4.f13993i0;
            this.f14070c = interfaceC51103wb1;
            this.f14071d = interfaceC51103wb1;
            this.f14068a = FP2.m107255a();
        }

        /* renamed from: b */
        public C33417Hs4 m103294b() {
            return new C33417Hs4(this.f14069b, this.f14068a.mo91216a(), this.f14070c, this.f14071d);
        }

        /* renamed from: d */
        public C3249h m103292d(final C35613Rc4 c35613Rc4) {
            HZ3.m103730h(c35613Rc4, "The specified quality selector can't be null.");
            this.f14068a.m107250b(new InterfaceC48378rz0() { // from class: Is4
                @Override // p000.InterfaceC48378rz0
                public final void accept(Object obj) {
                    ((AbstractC51248wp6.AbstractC29965a) obj).mo6277e(C35613Rc4.this);
                }
            });
            return this;
        }
    }

    /* renamed from: Hs4$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3250i implements AutoCloseable {

        /* renamed from: b */
        public final C43495jl0 f14072b = C43495jl0.m30004b();

        /* renamed from: c */
        public final AtomicBoolean f14073c = new AtomicBoolean(false);

        /* renamed from: d */
        public final AtomicReference<InterfaceC3252b> f14074d = new AtomicReference<>(null);

        /* renamed from: e */
        public final AtomicReference<InterfaceC3251a> f14075e = new AtomicReference<>(null);

        /* renamed from: f */
        public final AtomicReference<InterfaceC48378rz0<Uri>> f14076f = new AtomicReference<>(new InterfaceC48378rz0() { // from class: Js4
            @Override // p000.InterfaceC48378rz0
            public final void accept(Object obj) {
                C33417Hs4.AbstractC3250i.m103283l((Uri) obj);
            }
        });

        /* renamed from: Hs4$i$a */
        /* loaded from: classes.dex */
        public interface InterfaceC3251a {
            /* renamed from: a */
            C1995Ep m103278a(AbstractC0749Bp abstractC0749Bp, Executor executor) throws AudioSourceAccessException;
        }

        /* renamed from: Hs4$i$b */
        /* loaded from: classes.dex */
        public interface InterfaceC3252b {
            /* renamed from: a */
            MediaMuxer m103277a(int i, InterfaceC48378rz0<Uri> interfaceC48378rz0) throws IOException;
        }

        /* renamed from: l */
        public static /* synthetic */ void m103283l(Uri uri) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m103282m(AbstractC50655vp6 abstractC50655vp6) {
            m103286g().accept(abstractC50655vp6);
        }

        /* renamed from: c */
        public void m103289c(Uri uri) {
            if (!this.f14073c.get()) {
                return;
            }
            m103288d(this.f14076f.getAndSet(null), uri);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            m103289c(Uri.EMPTY);
        }

        /* renamed from: d */
        public final void m103288d(InterfaceC48378rz0<Uri> interfaceC48378rz0, Uri uri) {
            if (interfaceC48378rz0 != null) {
                this.f14072b.m30005a();
                interfaceC48378rz0.accept(uri);
                return;
            }
            throw new AssertionError("Recording " + this + " has already been finalized");
        }

        /* renamed from: f */
        public abstract Executor m103287f();

        public void finalize() throws Throwable {
            try {
                this.f14072b.m30003c();
                InterfaceC48378rz0<Uri> andSet = this.f14076f.getAndSet(null);
                if (andSet != null) {
                    m103288d(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        /* renamed from: g */
        public abstract InterfaceC48378rz0<AbstractC50655vp6> m103286g();

        /* renamed from: i */
        public abstract AbstractC39597dA3 m103285i();

        /* renamed from: k */
        public abstract boolean m103284k();

        /* renamed from: n */
        public C1995Ep m103281n(AbstractC0749Bp abstractC0749Bp, Executor executor) throws AudioSourceAccessException {
            if (m103284k()) {
                InterfaceC3251a andSet = this.f14075e.getAndSet(null);
                if (andSet != null) {
                    andSet.m103278a(abstractC0749Bp, executor);
                    return null;
                }
                throw new AssertionError("One-time audio source creation has already occurred for recording " + this);
            }
            throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + this);
        }

        /* renamed from: p */
        public MediaMuxer m103280p(int i, InterfaceC48378rz0<Uri> interfaceC48378rz0) throws IOException {
            if (this.f14073c.get()) {
                InterfaceC3252b andSet = this.f14074d.getAndSet(null);
                if (andSet != null) {
                    return andSet.m103277a(i, interfaceC48378rz0);
                }
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            throw new AssertionError("Recording " + this + " has not been initialized");
        }

        /* renamed from: q */
        public void m103279q(final AbstractC50655vp6 abstractC50655vp6) {
            AbstractC50655vp6.C29661a c29661a;
            if (Objects.equals(abstractC50655vp6.m7962c(), m103285i())) {
                String str = "Sending VideoRecordEvent " + abstractC50655vp6.getClass().getSimpleName();
                if (abstractC50655vp6 instanceof AbstractC50655vp6.C29661a) {
                    if (((AbstractC50655vp6.C29661a) abstractC50655vp6).m7956i()) {
                        str = str + String.format(" [error: %s]", AbstractC50655vp6.C29661a.m7958g(c29661a.m7957h()));
                    }
                }
                C33928Jx2.m99533a("Recorder", str);
                if (m103287f() != null && m103286g() != null) {
                    try {
                        m103287f().execute(new Runnable() { // from class: Ks4
                            @Override // java.lang.Runnable
                            public final void run() {
                                C33417Hs4.AbstractC3250i.this.m103282m(abstractC50655vp6);
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e) {
                        C33928Jx2.m99530d("Recorder", "The callback executor is invalid.", e);
                        return;
                    }
                }
                return;
            }
            throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + abstractC50655vp6.m7962c() + ", Expected: " + m103285i() + "]");
        }
    }

    /* renamed from: Hs4$j */
    /* loaded from: classes.dex */
    public enum EnumC3253j {
        CONFIGURING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        C52885zb4 c52885zb4 = C52885zb4.f121576c;
        C35613Rc4 m86555e = C35613Rc4.m86555e(Arrays.asList(c52885zb4, C52885zb4.f121575b, C52885zb4.f121574a), C33567Ij1.m101750a(c52885zb4));
        f13989e0 = m86555e;
        AbstractC51248wp6 mo6281a = AbstractC51248wp6.m6287a().mo6277e(m86555e).mo6280b(-1).mo6281a();
        f13990f0 = mo6281a;
        f13991g0 = FP2.m107255a().mo91213e(-1).mo91212f(mo6281a).mo91216a();
        f13992h0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        f13993i0 = new InterfaceC51103wb1() { // from class: ys4
            @Override // p000.InterfaceC51103wb1
            /* renamed from: a */
            public final InterfaceC44582lb1 mo2354a(Executor executor, InterfaceC49918ub1 interfaceC49918ub1) {
                return new C34899Ob1(executor, interfaceC49918ub1);
            }
        };
        f13994j0 = C31631Ac0.m115444f(C31631Ac0.m115447c());
    }

    public C33417Hs4(Executor executor, FP2 fp2, InterfaceC51103wb1 interfaceC51103wb1, InterfaceC51103wb1 interfaceC51103wb12) {
        boolean z;
        if (Q21.m89097a(C43406jc1.class) != null) {
            z = true;
        } else {
            z = false;
        }
        this.f14030h = z;
        this.f14031i = EnumC3253j.CONFIGURING;
        this.f14032j = null;
        this.f14033k = 0;
        this.f14034l = null;
        this.f14035m = null;
        this.f14036n = 0L;
        this.f14037o = null;
        this.f14038p = false;
        this.f14039q = null;
        this.f14040r = null;
        this.f14041s = new ArrayList();
        this.f14042t = null;
        this.f14043u = null;
        this.f14046x = null;
        this.f14047y = null;
        this.f14048z = null;
        this.f13996B = null;
        this.f13997C = null;
        this.f13998D = null;
        this.f13999E = null;
        this.f14000F = EnumC3248g.INITIALIZING;
        this.f14001G = Uri.EMPTY;
        this.f14002H = 0L;
        this.f14003I = 0L;
        this.f14004J = LongCompanionObject.MAX_VALUE;
        this.f14005K = 0;
        this.f14006L = null;
        this.f14007M = LongCompanionObject.MAX_VALUE;
        this.f14008N = LongCompanionObject.MAX_VALUE;
        this.f14009O = LongCompanionObject.MAX_VALUE;
        this.f14010P = 0L;
        this.f14011Q = 0L;
        this.f14012R = 1;
        this.f14013S = null;
        this.f14014T = null;
        this.f14015U = new C29962wo(60);
        this.f14016V = null;
        this.f14017W = false;
        this.f14018X = InterfaceC49470tp6.EnumC28829a.INACTIVE;
        this.f14019Y = null;
        this.f14020Z = false;
        this.f14024b0 = null;
        this.f14023b = executor;
        executor = executor == null ? C31631Ac0.m115447c() : executor;
        this.f14025c = executor;
        Executor m115444f = C31631Ac0.m115444f(executor);
        this.f14026d = m115444f;
        this.f13995A = HX2.m103792h(m103311r(fp2));
        this.f14021a = HX2.m103792h(AbstractC49831uR5.m10277c(this.f14033k, m103366A(this.f14031i)));
        this.f14027e = interfaceC51103wb1;
        this.f14028f = interfaceC51103wb12;
        this.f14022a0 = new C48285rp6(interfaceC51103wb1, m115444f, executor);
    }

    /* renamed from: D */
    public static /* synthetic */ void m103363D(AbstractC51248wp6.AbstractC29965a abstractC29965a) {
        abstractC29965a.mo6280b(f13990f0.mo6286b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m103362E(C11243o.AbstractC11251h abstractC11251h) {
        this.f14039q = abstractC11251h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ Object m103361F(AbstractC3250i abstractC3250i, O80.C5832a c5832a) throws Exception {
        this.f13996B.mo27108b(new C3244c(c5832a, abstractC3250i), this.f14026d);
        return "videoEncodingFuture";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m103360G(O80.C5832a c5832a, Throwable th) {
        if (this.f14016V == null) {
            if (th instanceof EncodeException) {
                m103337d0(EnumC3248g.ERROR_ENCODER);
            } else {
                m103337d0(EnumC3248g.ERROR_SOURCE);
            }
            this.f14016V = th;
            m103312q0();
            c5832a.m92861c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ Object m103359H(AbstractC3250i abstractC3250i, final O80.C5832a c5832a) throws Exception {
        new C3245d(new InterfaceC48378rz0() { // from class: xs4
            @Override // p000.InterfaceC48378rz0
            public final void accept(Object obj) {
                C33417Hs4.this.m103360G(c5832a, (Throwable) obj);
            }
        });
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m103356K(Uri uri) {
        this.f14001G = uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m103355L(C11243o c11243o, EnumC47841r46 enumC47841r46) {
        if (!c11243o.m69102q() && !this.f14022a0.m15295n(c11243o)) {
            C48285rp6 c48285rp6 = new C48285rp6(this.f14027e, this.f14026d, this.f14025c);
            ListenableFuture<InterfaceC44582lb1> m15300i = c48285rp6.m15300i(c11243o, enumC47841r46, (FP2) m103302x(this.f13995A), this.f14040r);
            this.f14022a0 = c48285rp6;
            IA1.m102842b(m15300i, new C3242a(c48285rp6), this.f14026d);
            return;
        }
        C33928Jx2.m99522l("Recorder", "Ignore the SurfaceRequest " + c11243o + " isServiced: " + c11243o.m69102q() + " VideoEncoderSession: " + this.f14022a0);
    }

    /* renamed from: M */
    public static /* synthetic */ void m103354M(InterfaceC44582lb1 interfaceC44582lb1) {
        C33928Jx2.m99533a("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
        if (Q21.m89097a(C49251tT0.class) != null) {
            m103351P(interfaceC44582lb1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m103353N(final InterfaceC44582lb1 interfaceC44582lb1) {
        this.f14026d.execute(new Runnable() { // from class: Fs4
            @Override // java.lang.Runnable
            public final void run() {
                C33417Hs4.m103354M(InterfaceC44582lb1.this);
            }
        });
    }

    /* renamed from: P */
    public static void m103351P(InterfaceC44582lb1 interfaceC44582lb1) {
        if (interfaceC44582lb1 instanceof C34899Ob1) {
            ((C34899Ob1) interfaceC44582lb1).m91960f0();
        }
    }

    /* renamed from: o0 */
    public static int m103316o0(AbstractC52434yp6 abstractC52434yp6, int i) {
        if (abstractC52434yp6 != null) {
            int mo6193a = abstractC52434yp6.mo6193a();
            if (mo6193a != 1) {
                if (mo6193a == 2) {
                    return 0;
                }
                if (mo6193a == 9) {
                    return 1;
                }
            } else if (Build.VERSION.SDK_INT < 26) {
                return 0;
            } else {
                return 2;
            }
        }
        return i;
    }

    /* renamed from: A */
    public final AbstractC49831uR5.EnumC29195a m103366A(EnumC3253j enumC3253j) {
        C49251tT0 c49251tT0 = (C49251tT0) Q21.m89097a(C49251tT0.class);
        if (enumC3253j != EnumC3253j.RECORDING && (enumC3253j != EnumC3253j.STOPPING || c49251tT0 != null)) {
            return AbstractC49831uR5.EnumC29195a.INACTIVE;
        }
        return AbstractC49831uR5.EnumC29195a.ACTIVE;
    }

    /* renamed from: B */
    public boolean m103365B() {
        return this.f14000F == EnumC3248g.ACTIVE;
    }

    /* renamed from: C */
    public boolean m103364C() {
        return ((FP2) m103302x(this.f13995A)).mo91220b().mo40601c() != 0;
    }

    /* renamed from: O */
    public final AbstractC3250i m103352O(EnumC3253j enumC3253j) {
        boolean z;
        if (enumC3253j == EnumC3253j.PENDING_PAUSED) {
            z = true;
        } else if (enumC3253j == EnumC3253j.PENDING_RECORDING) {
            z = false;
        } else {
            throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
        }
        if (this.f14034l == null) {
            AbstractC3250i abstractC3250i = this.f14035m;
            if (abstractC3250i != null) {
                this.f14034l = abstractC3250i;
                this.f14035m = null;
                if (z) {
                    m103334f0(EnumC3253j.PAUSED);
                } else {
                    m103334f0(EnumC3253j.RECORDING);
                }
                return abstractC3250i;
            }
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        throw new AssertionError("Cannot make pending recording active because another recording is already active.");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[Catch: all -> 0x007e, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000f, B:27:0x0071, B:7:0x0013, B:8:0x001b, B:9:0x0021, B:12:0x0026, B:13:0x002d, B:16:0x0031, B:19:0x0038, B:21:0x003e, B:22:0x0049, B:23:0x0054, B:24:0x006c), top: B:36:0x0003 }] */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m103350Q() {
        AbstractC3250i abstractC3250i;
        boolean z;
        int i;
        AbstractC3250i abstractC3250i2;
        Throwable th;
        synchronized (this.f14029g) {
            abstractC3250i = null;
            switch (C3247f.f14059a[this.f14031i.ordinal()]) {
                case 1:
                case 2:
                case 5:
                case 9:
                    throw new AssertionError("Incorrectly invoke onConfigured() in state " + this.f14031i);
                case 3:
                    z = true;
                    if (this.f14034l == null) {
                        th = null;
                        i = 0;
                        abstractC3250i2 = th;
                        break;
                    } else if (this.f14018X == InterfaceC49470tp6.EnumC28829a.INACTIVE) {
                        abstractC3250i2 = this.f14035m;
                        this.f14035m = null;
                        m103339b0();
                        th = f13992h0;
                        i = 4;
                    } else {
                        i = 0;
                        abstractC3250i2 = null;
                        abstractC3250i = m103352O(this.f14031i);
                        th = null;
                    }
                case 4:
                    z = false;
                    if (this.f14034l == null) {
                    }
                    break;
                case 6:
                    if (!this.f14030h) {
                        throw new AssertionError("Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface.");
                    }
                    th = null;
                    z = false;
                    i = 0;
                    abstractC3250i2 = th;
                    break;
                case 7:
                    m103334f0(EnumC3253j.IDLING);
                    th = null;
                    z = false;
                    i = 0;
                    abstractC3250i2 = th;
                    break;
                case 8:
                    C33928Jx2.m99531c("Recorder", "onConfigured() was invoked when the Recorder had encountered error");
                    th = null;
                    z = false;
                    i = 0;
                    abstractC3250i2 = th;
                    break;
                default:
                    th = null;
                    z = false;
                    i = 0;
                    abstractC3250i2 = th;
                    break;
            }
        }
        if (abstractC3250i != null) {
            m103320m0(abstractC3250i, z);
        } else if (abstractC3250i2 != null) {
            m103305u(abstractC3250i2, i, th);
        }
    }

    /* renamed from: R */
    public void m103349R(Throwable th) {
        AbstractC3250i abstractC3250i;
        synchronized (this.f14029g) {
            abstractC3250i = null;
            switch (C3247f.f14059a[this.f14031i.ordinal()]) {
                case 1:
                case 2:
                case 5:
                case 6:
                case 9:
                    throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.f14031i + ": " + th);
                case 3:
                case 4:
                    AbstractC3250i abstractC3250i2 = this.f14035m;
                    this.f14035m = null;
                    abstractC3250i = abstractC3250i2;
                case 7:
                    m103332g0(-1);
                    m103334f0(EnumC3253j.ERROR);
                    break;
            }
        }
        if (abstractC3250i != null) {
            m103305u(abstractC3250i, 7, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[Catch: all -> 0x0050, TryCatch #0 {, blocks: (B:6:0x0007, B:7:0x0012, B:17:0x0043, B:9:0x0016, B:10:0x002e, B:11:0x002f, B:12:0x0036, B:15:0x003b, B:16:0x0042), top: B:26:0x0007 }] */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m103348S(AbstractC3250i abstractC3250i, int i, Throwable th) {
        boolean z;
        if (abstractC3250i == this.f14037o) {
            synchronized (this.f14029g) {
                z = false;
                switch (C3247f.f14059a[this.f14031i.ordinal()]) {
                    case 1:
                    case 2:
                        m103334f0(EnumC3253j.STOPPING);
                        z = true;
                        if (abstractC3250i == this.f14034l) {
                            throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                        }
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        if (abstractC3250i == this.f14034l) {
                        }
                        break;
                    case 7:
                    case 8:
                    case 9:
                        throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f14031i);
                }
            }
            if (z) {
                m103318n0(abstractC3250i, -1L, i, th);
                return;
            }
            return;
        }
        throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[Catch: all -> 0x00e2, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x001a, B:42:0x0098, B:15:0x002a, B:17:0x0030, B:18:0x0040, B:20:0x0044, B:22:0x004a, B:26:0x0052, B:27:0x005c, B:29:0x0060, B:31:0x0072, B:33:0x0076, B:35:0x007c, B:39:0x0084, B:40:0x008e, B:56:0x00c1, B:57:0x00d9, B:58:0x00da, B:59:0x00e1), top: B:63:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[Catch: all -> 0x00e2, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x001a, B:42:0x0098, B:15:0x002a, B:17:0x0030, B:18:0x0040, B:20:0x0044, B:22:0x004a, B:26:0x0052, B:27:0x005c, B:29:0x0060, B:31:0x0072, B:33:0x0076, B:35:0x007c, B:39:0x0084, B:40:0x008e, B:56:0x00c1, B:57:0x00d9, B:58:0x00da, B:59:0x00e1), top: B:63:0x0003 }] */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m103347T(AbstractC3250i abstractC3250i) {
        AbstractC3250i abstractC3250i2;
        boolean z;
        Throwable th;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        AbstractC3250i abstractC3250i3;
        synchronized (this.f14029g) {
            if (this.f14034l == abstractC3250i) {
                abstractC3250i2 = null;
                this.f14034l = null;
                int i2 = C3247f.f14059a[this.f14031i.ordinal()];
                if (i2 != 9) {
                    boolean z5 = true;
                    z = false;
                    switch (i2) {
                        case 1:
                        case 2:
                        case 6:
                            if (this.f14030h) {
                                this.f14047y = null;
                                C11243o c11243o = this.f14044v;
                                if (c11243o == null || c11243o.m69102q()) {
                                    z5 = false;
                                }
                                m103334f0(EnumC3253j.CONFIGURING);
                                th = null;
                                z2 = z5;
                                i = 0;
                                z3 = false;
                                abstractC3250i3 = th;
                                break;
                            } else {
                                m103334f0(EnumC3253j.IDLING);
                                abstractC3250i3 = null;
                                th = null;
                                z2 = false;
                                i = 0;
                                z3 = false;
                            }
                            break;
                        case 3:
                            z4 = true;
                            if (this.f14018X != InterfaceC49470tp6.EnumC28829a.INACTIVE) {
                                abstractC3250i3 = this.f14035m;
                                this.f14035m = null;
                                m103334f0(EnumC3253j.CONFIGURING);
                                th = f13992h0;
                                i = 4;
                                z3 = z4;
                                z2 = false;
                            } else {
                                if (this.f14030h) {
                                    this.f14047y = null;
                                    C11243o c11243o2 = this.f14044v;
                                    if (c11243o2 == null || c11243o2.m69102q()) {
                                        z5 = false;
                                    }
                                    m103310r0(EnumC3253j.CONFIGURING);
                                    th = null;
                                    z3 = z4;
                                    z2 = z5;
                                    i = 0;
                                } else if (this.f13996B != null) {
                                    th = null;
                                    z3 = z4;
                                    z2 = false;
                                    i = 0;
                                    abstractC3250i2 = m103352O(this.f14031i);
                                } else {
                                    abstractC3250i3 = null;
                                    th = null;
                                    z3 = z4;
                                    z2 = false;
                                    i = 0;
                                }
                                abstractC3250i3 = th;
                            }
                            break;
                        case 4:
                            z4 = false;
                            if (this.f14018X != InterfaceC49470tp6.EnumC28829a.INACTIVE) {
                            }
                            break;
                        case 5:
                            th = null;
                            z2 = false;
                            i = 0;
                            z3 = false;
                            z = true;
                            abstractC3250i3 = th;
                            break;
                        default:
                            abstractC3250i3 = null;
                            th = null;
                            z2 = false;
                            i = 0;
                            z3 = false;
                            break;
                    }
                } else {
                    throw new AssertionError("Unexpected state on finalize of recording: " + this.f14031i);
                }
            } else {
                throw new AssertionError("Active recording did not match finalized recording on finalize.");
            }
        }
        if (z2) {
            m103309s(this.f14044v, this.f14045w);
        } else if (z) {
            m103340a0();
        } else if (abstractC3250i2 != null) {
            if (!this.f14030h) {
                m103320m0(abstractC3250i2, z3);
                return;
            }
            throw new AssertionError("Attempt to start a pending recording while the Recorder is waiting for a new surface request.");
        } else if (abstractC3250i3 != null) {
            m103305u(abstractC3250i3, i, th);
        }
    }

    /* renamed from: U */
    public final void m103346U() {
        synchronized (this.f14029g) {
            switch (C3247f.f14059a[this.f14031i.ordinal()]) {
                case 1:
                case 2:
                case 5:
                case 6:
                case 8:
                case 9:
                    m103334f0(EnumC3253j.CONFIGURING);
                    break;
                case 3:
                case 4:
                    m103310r0(EnumC3253j.CONFIGURING);
                    break;
            }
        }
        this.f14020Z = false;
        C11243o c11243o = this.f14044v;
        if (c11243o != null && !c11243o.m69102q()) {
            m103309s(this.f14044v, this.f14045w);
        }
    }

    /* renamed from: V */
    public void m103358I(InterfaceC49470tp6.EnumC28829a enumC28829a) {
        ScheduledFuture<?> scheduledFuture;
        InterfaceC44582lb1 interfaceC44582lb1;
        InterfaceC49470tp6.EnumC28829a enumC28829a2 = this.f14018X;
        this.f14018X = enumC28829a;
        if (enumC28829a2 != enumC28829a) {
            C33928Jx2.m99533a("Recorder", "Video source has transitioned to state: " + enumC28829a);
            if (enumC28829a == InterfaceC49470tp6.EnumC28829a.INACTIVE) {
                if (this.f14047y == null) {
                    m103341Z(4, null);
                    return;
                }
                this.f14020Z = true;
                AbstractC3250i abstractC3250i = this.f14037o;
                if (abstractC3250i != null) {
                    m103348S(abstractC3250i, 4, null);
                    return;
                }
                return;
            } else if (enumC28829a == InterfaceC49470tp6.EnumC28829a.ACTIVE_NON_STREAMING && (scheduledFuture = this.f14019Y) != null && scheduledFuture.cancel(false) && (interfaceC44582lb1 = this.f13996B) != null) {
                m103351P(interfaceC44582lb1);
                return;
            } else {
                return;
            }
        }
        C33928Jx2.m99533a("Recorder", "Video source transitions to the same state: " + enumC28829a);
    }

    /* renamed from: W */
    public final void m103357J(C11243o c11243o, EnumC47841r46 enumC47841r46) {
        C11243o c11243o2 = this.f14044v;
        if (c11243o2 != null && !c11243o2.m69102q()) {
            this.f14044v.m69119D();
        }
        this.f14044v = c11243o;
        this.f14045w = enumC47841r46;
        m103309s(c11243o, enumC47841r46);
    }

    /* renamed from: X */
    public void m103343X(C48285rp6 c48285rp6) {
        InterfaceC44582lb1 m15296m = c48285rp6.m15296m();
        this.f13996B = m15296m;
        this.f14006L = ((InterfaceC42355hp6) m15296m.mo27109a()).mo29873b();
        this.f14005K = this.f13996B.mo27104f();
        Surface m15298k = c48285rp6.m15298k();
        this.f14047y = m15298k;
        m103336e0(m15298k);
        c48285rp6.m15287v(this.f14026d, new InterfaceC44582lb1.InterfaceC25734b.InterfaceC25735a() { // from class: ws4
            @Override // p000.InterfaceC44582lb1.InterfaceC25734b.InterfaceC25735a
            /* renamed from: a */
            public final void mo6197a(Surface surface) {
                C33417Hs4.this.m103336e0(surface);
            }
        });
        IA1.m102842b(c48285rp6.m15297l(), new C3243b(c48285rp6), this.f14026d);
    }

    /* renamed from: Y */
    public final void m103342Y(AbstractC3250i abstractC3250i) {
        if (this.f14037o == abstractC3250i && !this.f14038p) {
            if (m103365B()) {
                this.f13998D.pause();
            }
            this.f13996B.pause();
            AbstractC3250i abstractC3250i2 = this.f14037o;
            abstractC3250i2.m103279q(AbstractC50655vp6.m7961d(abstractC3250i2.m103285i(), m103303w()));
        }
    }

    /* renamed from: Z */
    public void m103341Z(int i, Throwable th) {
        boolean z;
        boolean z2;
        synchronized (this.f14029g) {
            z = true;
            z2 = false;
            switch (C3247f.f14059a[this.f14031i.ordinal()]) {
                case 1:
                case 2:
                    if (this.f14034l != this.f14037o) {
                        throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                    }
                    m103334f0(EnumC3253j.RESETTING);
                    z2 = z;
                    z = false;
                    break;
                case 3:
                case 4:
                    m103310r0(EnumC3253j.RESETTING);
                    break;
                case 5:
                default:
                    z = false;
                    break;
                case 6:
                    z = false;
                    m103334f0(EnumC3253j.RESETTING);
                    z2 = z;
                    z = false;
                    break;
                case 7:
                case 8:
                case 9:
                    break;
            }
        }
        if (z) {
            m103340a0();
        } else if (z2) {
            m103318n0(this.f14037o, -1L, i, th);
        }
    }

    @Override // p000.InterfaceC49470tp6
    /* renamed from: a */
    public void mo11705a(C11243o c11243o) {
        mo11701e(c11243o, EnumC47841r46.UPTIME);
    }

    /* renamed from: a0 */
    public final void m103340a0() {
        if (this.f13998D != null) {
            C33928Jx2.m99533a("Recorder", "Releasing audio encoder.");
            this.f13998D.release();
            this.f13998D = null;
            this.f13999E = null;
        }
        m103314p0();
        m103337d0(EnumC3248g.INITIALIZING);
        m103346U();
    }

    @Override // p000.InterfaceC49470tp6
    /* renamed from: b */
    public InterfaceC37493Zd3<FP2> mo11704b() {
        return this.f13995A;
    }

    /* renamed from: b0 */
    public final void m103339b0() {
        if (f13987c0.contains(this.f14031i)) {
            m103334f0(this.f14032j);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.f14031i);
    }

    @Override // p000.InterfaceC49470tp6
    /* renamed from: c */
    public InterfaceC37493Zd3<AbstractC49831uR5> mo11703c() {
        return this.f14021a;
    }

    /* renamed from: c0 */
    public final ListenableFuture<Void> m103338c0() {
        C33928Jx2.m99533a("Recorder", "Try to safely release video encoder: " + this.f13996B);
        return this.f14022a0.m15286w();
    }

    @Override // p000.InterfaceC49470tp6
    /* renamed from: d */
    public void mo11702d(final InterfaceC49470tp6.EnumC28829a enumC28829a) {
        this.f14026d.execute(new Runnable() { // from class: As4
            @Override // java.lang.Runnable
            public final void run() {
                C33417Hs4.this.m103358I(enumC28829a);
            }
        });
    }

    /* renamed from: d0 */
    public void m103337d0(EnumC3248g enumC3248g) {
        C33928Jx2.m99533a("Recorder", "Transitioning audio state: " + this.f14000F + " --> " + enumC3248g);
        this.f14000F = enumC3248g;
    }

    @Override // p000.InterfaceC49470tp6
    /* renamed from: e */
    public void mo11701e(final C11243o c11243o, final EnumC47841r46 enumC47841r46) {
        synchronized (this.f14029g) {
            C33928Jx2.m99533a("Recorder", "Surface is requested in state: " + this.f14031i + ", Current surface: " + this.f14033k);
            if (this.f14031i == EnumC3253j.ERROR) {
                m103334f0(EnumC3253j.CONFIGURING);
            }
        }
        this.f14026d.execute(new Runnable() { // from class: Bs4
            @Override // java.lang.Runnable
            public final void run() {
                C33417Hs4.this.m103357J(c11243o, enumC47841r46);
            }
        });
    }

    /* renamed from: e0 */
    public void m103336e0(Surface surface) {
        int hashCode;
        if (this.f14046x == surface) {
            return;
        }
        this.f14046x = surface;
        synchronized (this.f14029g) {
            if (surface != null) {
                try {
                    hashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                hashCode = 0;
            }
            m103332g0(hashCode);
        }
    }

    /* renamed from: f0 */
    public void m103334f0(EnumC3253j enumC3253j) {
        if (this.f14031i != enumC3253j) {
            C33928Jx2.m99533a("Recorder", "Transitioning Recorder internal state: " + this.f14031i + " --> " + enumC3253j);
            Set<EnumC3253j> set = f13987c0;
            AbstractC49831uR5.EnumC29195a enumC29195a = null;
            if (set.contains(enumC3253j)) {
                if (!set.contains(this.f14031i)) {
                    if (f13988d0.contains(this.f14031i)) {
                        EnumC3253j enumC3253j2 = this.f14031i;
                        this.f14032j = enumC3253j2;
                        enumC29195a = m103366A(enumC3253j2);
                    } else {
                        throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f14031i);
                    }
                }
            } else if (this.f14032j != null) {
                this.f14032j = null;
            }
            this.f14031i = enumC3253j;
            if (enumC29195a == null) {
                enumC29195a = m103366A(enumC3253j);
            }
            this.f14021a.m103793g(AbstractC49831uR5.m10277c(this.f14033k, enumC29195a));
            return;
        }
        throw new AssertionError("Attempted to transition to state " + enumC3253j + ", but Recorder is already in state " + enumC3253j);
    }

    /* renamed from: g0 */
    public final void m103332g0(int i) {
        if (this.f14033k == i) {
            return;
        }
        C33928Jx2.m99533a("Recorder", "Transitioning streamId: " + this.f14033k + " --> " + i);
        this.f14033k = i;
        this.f14021a.m103793g(AbstractC49831uR5.m10277c(i, m103366A(this.f14031i)));
    }

    /* renamed from: h0 */
    public void m103330h0(AbstractC3250i abstractC3250i) {
        int m107252g;
        if (this.f14048z == null) {
            if (m103365B() && this.f14015U.isEmpty()) {
                throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
            }
            InterfaceC41617gb1 interfaceC41617gb1 = this.f14014T;
            if (interfaceC41617gb1 != null) {
                try {
                    this.f14014T = null;
                    List<InterfaceC41617gb1> m103304v = m103304v(interfaceC41617gb1.mo33771q0());
                    long size = interfaceC41617gb1.size();
                    for (InterfaceC41617gb1 interfaceC41617gb12 : m103304v) {
                        size += interfaceC41617gb12.size();
                    }
                    long j = this.f14010P;
                    if (j != 0 && size > j) {
                        C33928Jx2.m99533a("Recorder", String.format("Initial data exceeds file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f14010P)));
                        m103348S(abstractC3250i, 2, null);
                        interfaceC41617gb1.close();
                        return;
                    }
                    try {
                        FP2 fp2 = (FP2) m103302x(this.f13995A);
                        if (fp2.mo91219c() == -1) {
                            m107252g = m103316o0(this.f14040r, FP2.m107252g(f13991g0.mo91219c()));
                        } else {
                            m107252g = FP2.m107252g(fp2.mo91219c());
                        }
                        MediaMuxer m103280p = abstractC3250i.m103280p(m107252g, new InterfaceC48378rz0() { // from class: us4
                            @Override // p000.InterfaceC48378rz0
                            public final void accept(Object obj) {
                                C33417Hs4.this.m103356K((Uri) obj);
                            }
                        });
                        C11243o.AbstractC11251h abstractC11251h = this.f14039q;
                        if (abstractC11251h != null) {
                            m103280p.setOrientationHint(abstractC11251h.mo69084b());
                        }
                        Location m44557c = abstractC3250i.m103285i().m44557c();
                        if (m44557c != null) {
                            try {
                                Pair<Double, Double> m39869a = C41399gD0.m39869a(m44557c.getLatitude(), m44557c.getLongitude());
                                m103280p.setLocation((float) ((Double) m39869a.first).doubleValue(), (float) ((Double) m39869a.second).doubleValue());
                            } catch (IllegalArgumentException e) {
                                m103280p.release();
                                m103348S(abstractC3250i, 5, e);
                                interfaceC41617gb1.close();
                                return;
                            }
                        }
                        this.f14043u = Integer.valueOf(m103280p.addTrack(this.f13997C.mo42725a()));
                        if (m103365B()) {
                            this.f14042t = Integer.valueOf(m103280p.addTrack(this.f13999E.mo42725a()));
                        }
                        m103280p.start();
                        this.f14048z = m103280p;
                        m103306t0(interfaceC41617gb1, abstractC3250i);
                        for (InterfaceC41617gb1 interfaceC41617gb13 : m103304v) {
                            m103308s0(interfaceC41617gb13, abstractC3250i);
                        }
                        interfaceC41617gb1.close();
                        return;
                    } catch (IOException e2) {
                        m103348S(abstractC3250i, 5, e2);
                        interfaceC41617gb1.close();
                        return;
                    }
                } catch (Throwable th) {
                    if (interfaceC41617gb1 != null) {
                        try {
                            interfaceC41617gb1.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        throw new AssertionError("Unable to set up media muxer when one already exists.");
    }

    /* renamed from: i0 */
    public final void m103328i0(AbstractC3250i abstractC3250i) throws AudioSourceAccessException, InvalidConfigException {
        FP2 fp2 = (FP2) m103302x(this.f13995A);
        AbstractC45112mU2 m4598c = C30318xp.m4598c(fp2, this.f14040r);
        EnumC47841r46 enumC47841r46 = EnumC47841r46.UPTIME;
        m103326j0(abstractC3250i, C30318xp.m4597d(m4598c, fp2.mo91220b()));
        throw null;
    }

    /* renamed from: j0 */
    public final C1995Ep m103326j0(AbstractC3250i abstractC3250i, AbstractC0749Bp abstractC0749Bp) throws AudioSourceAccessException {
        abstractC3250i.m103281n(abstractC0749Bp, f13994j0);
        return null;
    }

    /* renamed from: k0 */
    public final void m103324k0(final C11243o c11243o, final EnumC47841r46 enumC47841r46) {
        m103338c0().addListener(new Runnable() { // from class: Es4
            @Override // java.lang.Runnable
            public final void run() {
                C33417Hs4.this.m103355L(c11243o, enumC47841r46);
            }
        }, this.f14026d);
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: l0 */
    public final void m103322l0(AbstractC3250i abstractC3250i) {
        EnumC3248g enumC3248g;
        EnumC3248g enumC3248g2;
        if (this.f14037o == null) {
            if (abstractC3250i.m103285i().m44558b() > 0) {
                this.f14010P = Math.round(abstractC3250i.m103285i().m44558b() * 0.95d);
                C33928Jx2.m99533a("Recorder", "File size limit in bytes: " + this.f14010P);
            } else {
                this.f14010P = 0L;
            }
            if (abstractC3250i.m103285i().m44559a() > 0) {
                this.f14011Q = TimeUnit.MILLISECONDS.toNanos(abstractC3250i.m103285i().m44559a());
                C33928Jx2.m99533a("Recorder", "Duration limit in nanoseconds: " + this.f14011Q);
            } else {
                this.f14011Q = 0L;
            }
            this.f14037o = abstractC3250i;
            switch (C3247f.f14060b[this.f14000F.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    throw new AssertionError("Incorrectly invoke startInternal in audio state " + this.f14000F);
                case 5:
                    if (abstractC3250i.m103284k()) {
                        enumC3248g = EnumC3248g.ACTIVE;
                    } else {
                        enumC3248g = EnumC3248g.DISABLED;
                    }
                    m103337d0(enumC3248g);
                    break;
                case 6:
                    if (abstractC3250i.m103284k()) {
                        if (m103364C()) {
                            try {
                                m103328i0(abstractC3250i);
                                m103337d0(EnumC3248g.ACTIVE);
                                break;
                            } catch (AudioSourceAccessException | InvalidConfigException e) {
                                C33928Jx2.m99530d("Recorder", "Unable to create audio resource with error: ", e);
                                if (e instanceof InvalidConfigException) {
                                    enumC3248g2 = EnumC3248g.ERROR_ENCODER;
                                } else {
                                    enumC3248g2 = EnumC3248g.ERROR_SOURCE;
                                }
                                m103337d0(enumC3248g2);
                                this.f14016V = e;
                                break;
                            }
                        } else {
                            throw new AssertionError("The Recorder doesn't support recording with audio");
                        }
                    }
                    break;
            }
            m103301y(abstractC3250i);
            if (!m103365B()) {
                this.f13996B.start();
                AbstractC3250i abstractC3250i2 = this.f14037o;
                abstractC3250i2.m103279q(AbstractC50655vp6.m7960e(abstractC3250i2.m103285i(), m103303w()));
                return;
            }
            throw null;
        }
        throw new AssertionError("Attempted to start a new recording while another was in progress.");
    }

    /* renamed from: m0 */
    public final void m103320m0(AbstractC3250i abstractC3250i, boolean z) {
        m103322l0(abstractC3250i);
        if (z) {
            m103342Y(abstractC3250i);
        }
    }

    /* renamed from: n0 */
    public void m103318n0(AbstractC3250i abstractC3250i, long j, int i, Throwable th) {
        if (this.f14037o == abstractC3250i && !this.f14038p) {
            this.f14038p = true;
            this.f14012R = i;
            this.f14013S = th;
            if (m103365B()) {
                m103313q();
                this.f13998D.stop(j);
            }
            InterfaceC41617gb1 interfaceC41617gb1 = this.f14014T;
            if (interfaceC41617gb1 != null) {
                interfaceC41617gb1.close();
                this.f14014T = null;
            }
            if (this.f14018X != InterfaceC49470tp6.EnumC28829a.ACTIVE_NON_STREAMING) {
                final InterfaceC44582lb1 interfaceC44582lb1 = this.f13996B;
                this.f14019Y = C31631Ac0.m115446d().schedule(new Runnable() { // from class: Ds4
                    @Override // java.lang.Runnable
                    public final void run() {
                        C33417Hs4.this.m103353N(interfaceC44582lb1);
                    }
                }, 1000L, TimeUnit.MILLISECONDS);
            } else {
                m103351P(this.f13996B);
            }
            this.f13996B.stop(j);
        }
    }

    /* renamed from: p0 */
    public final void m103314p0() {
        boolean z;
        C48285rp6 c48285rp6 = this.f14024b0;
        if (c48285rp6 != null) {
            if (c48285rp6.m15296m() == this.f13996B) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103729i(z);
            C33928Jx2.m99533a("Recorder", "Releasing video encoder: " + this.f13996B);
            this.f14024b0.m15285x();
            this.f14024b0 = null;
            this.f13996B = null;
            this.f13997C = null;
            m103336e0(null);
            return;
        }
        m103338c0();
    }

    /* renamed from: q */
    public final void m103313q() {
        while (!this.f14015U.isEmpty()) {
            this.f14015U.mo6312a();
        }
    }

    /* renamed from: q0 */
    public void m103312q0() {
        AbstractC3250i abstractC3250i = this.f14037o;
        if (abstractC3250i != null) {
            abstractC3250i.m103279q(AbstractC50655vp6.m7959f(abstractC3250i.m103285i(), m103303w()));
        }
    }

    /* renamed from: r */
    public final FP2 m103311r(FP2 fp2) {
        FP2.AbstractC2236a mo91217i = fp2.mo91217i();
        if (fp2.mo91218d().mo6286b() == -1) {
            mo91217i.m107250b(new InterfaceC48378rz0() { // from class: zs4
                @Override // p000.InterfaceC48378rz0
                public final void accept(Object obj) {
                    C33417Hs4.m103363D((AbstractC51248wp6.AbstractC29965a) obj);
                }
            });
        }
        return mo91217i.mo91216a();
    }

    /* renamed from: r0 */
    public final void m103310r0(EnumC3253j enumC3253j) {
        if (f13987c0.contains(this.f14031i)) {
            if (f13988d0.contains(enumC3253j)) {
                if (this.f14032j != enumC3253j) {
                    this.f14032j = enumC3253j;
                    this.f14021a.m103793g(AbstractC49831uR5.m10277c(this.f14033k, m103366A(enumC3253j)));
                    return;
                }
                return;
            }
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + enumC3253j);
        }
        throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f14031i);
    }

    /* renamed from: s */
    public final void m103309s(C11243o c11243o, EnumC47841r46 enumC47841r46) {
        if (c11243o.m69102q()) {
            C33928Jx2.m99522l("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        c11243o.m69121B(this.f14026d, new C11243o.InterfaceC11252i() { // from class: Cs4
            @Override // androidx.camera.core.C11243o.InterfaceC11252i
            /* renamed from: a */
            public final void mo29414a(C11243o.AbstractC11251h abstractC11251h) {
                C33417Hs4.this.m103362E(abstractC11251h);
            }
        });
        Size m69105n = c11243o.m69105n();
        C34553Mo6 m94775d = C34553Mo6.m94775d(c11243o.m69108k().mo23505b());
        C52885zb4 m94776c = m94775d.m94776c(m69105n);
        C33928Jx2.m99533a("Recorder", "Using supported quality of " + m94776c + " for surface size " + m69105n);
        if (m94776c != C52885zb4.f121580g) {
            AbstractC52434yp6 m94773f = m94775d.m94773f(m94776c);
            this.f14040r = m94773f;
            if (m94773f == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        m103324k0(c11243o, enumC47841r46);
    }

    /* renamed from: s0 */
    public void m103308s0(InterfaceC41617gb1 interfaceC41617gb1, AbstractC3250i abstractC3250i) {
        boolean z;
        long size = this.f14002H + interfaceC41617gb1.size();
        long j = this.f14010P;
        if (j != 0 && size > j) {
            C33928Jx2.m99533a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f14010P)));
            m103348S(abstractC3250i, 2, null);
            return;
        }
        long mo33771q0 = interfaceC41617gb1.mo33771q0();
        long j2 = this.f14007M;
        if (j2 == LongCompanionObject.MAX_VALUE) {
            this.f14007M = mo33771q0;
            C33928Jx2.m99533a("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(mo33771q0), C42154hV0.m36345j(this.f14007M)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(mo33771q0 - Math.min(this.f14004J, j2));
            if (this.f14009O != LongCompanionObject.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103728j(z, "There should be a previous data for adjusting the duration.");
            long nanos2 = nanos + timeUnit.toNanos(mo33771q0 - this.f14009O);
            long j3 = this.f14011Q;
            if (j3 != 0 && nanos2 > j3) {
                C33928Jx2.m99533a("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f14011Q)));
                m103348S(abstractC3250i, 9, null);
                return;
            }
        }
        this.f14048z.writeSampleData(this.f14042t.intValue(), interfaceC41617gb1.mo33772j2(), interfaceC41617gb1.mo33778U());
        this.f14002H = size;
        this.f14009O = mo33771q0;
    }

    /* renamed from: t */
    public void m103307t(int i, Throwable th) {
        AbstractC50655vp6.C29661a m7963b;
        if (this.f14037o != null) {
            MediaMuxer mediaMuxer = this.f14048z;
            if (mediaMuxer != null) {
                try {
                    mediaMuxer.stop();
                    this.f14048z.release();
                } catch (IllegalStateException e) {
                    C33928Jx2.m99531c("Recorder", "MediaMuxer failed to stop or release with error: " + e.getMessage());
                    if (i == 0) {
                        i = 1;
                    }
                }
                this.f14048z = null;
            } else if (i == 0) {
                i = 8;
            }
            this.f14037o.m103289c(this.f14001G);
            AbstractC39597dA3 m103285i = this.f14037o.m103285i();
            AbstractC34821Ns4 m103303w = m103303w();
            AbstractC40782fA3 m41782b = AbstractC40782fA3.m41782b(this.f14001G);
            AbstractC3250i abstractC3250i = this.f14037o;
            if (i == 0) {
                m7963b = AbstractC50655vp6.m7964a(m103285i, m103303w, m41782b);
            } else {
                m7963b = AbstractC50655vp6.m7963b(m103285i, m103303w, m41782b, i, th);
            }
            abstractC3250i.m103279q(m7963b);
            AbstractC3250i abstractC3250i2 = this.f14037o;
            this.f14037o = null;
            this.f14038p = false;
            this.f14042t = null;
            this.f14043u = null;
            this.f14041s.clear();
            this.f14001G = Uri.EMPTY;
            this.f14002H = 0L;
            this.f14003I = 0L;
            this.f14004J = LongCompanionObject.MAX_VALUE;
            this.f14007M = LongCompanionObject.MAX_VALUE;
            this.f14008N = LongCompanionObject.MAX_VALUE;
            this.f14009O = LongCompanionObject.MAX_VALUE;
            this.f14012R = 1;
            this.f14013S = null;
            this.f14016V = null;
            m103313q();
            int i2 = C3247f.f14060b[this.f14000F.ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    if (i2 == 5) {
                        throw new AssertionError("Incorrectly finalize recording when audio state is IDLING");
                    }
                } else {
                    m103337d0(EnumC3248g.IDLING);
                    throw null;
                }
            } else {
                m103337d0(EnumC3248g.INITIALIZING);
            }
            m103347T(abstractC3250i2);
            return;
        }
        throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
    }

    /* renamed from: t0 */
    public void m103306t0(InterfaceC41617gb1 interfaceC41617gb1, AbstractC3250i abstractC3250i) {
        boolean z;
        if (this.f14043u != null) {
            long size = this.f14002H + interfaceC41617gb1.size();
            long j = this.f14010P;
            long j2 = 0;
            if (j != 0 && size > j) {
                C33928Jx2.m99533a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f14010P)));
                m103348S(abstractC3250i, 2, null);
                return;
            }
            long mo33771q0 = interfaceC41617gb1.mo33771q0();
            long j3 = this.f14004J;
            if (j3 == LongCompanionObject.MAX_VALUE) {
                this.f14004J = mo33771q0;
                C33928Jx2.m99533a("Recorder", String.format("First video time: %d (%s)", Long.valueOf(mo33771q0), C42154hV0.m36345j(this.f14004J)));
            } else {
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                long nanos = timeUnit.toNanos(mo33771q0 - Math.min(j3, this.f14007M));
                if (this.f14008N != LongCompanionObject.MAX_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                HZ3.m103728j(z, "There should be a previous data for adjusting the duration.");
                long nanos2 = timeUnit.toNanos(mo33771q0 - this.f14008N) + nanos;
                long j4 = this.f14011Q;
                if (j4 != 0 && nanos2 > j4) {
                    C33928Jx2.m99533a("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f14011Q)));
                    m103348S(abstractC3250i, 9, null);
                    return;
                }
                j2 = nanos;
            }
            this.f14048z.writeSampleData(this.f14043u.intValue(), interfaceC41617gb1.mo33772j2(), interfaceC41617gb1.mo33778U());
            this.f14002H = size;
            this.f14003I = j2;
            this.f14008N = mo33771q0;
            m103312q0();
            return;
        }
        throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
    }

    /* renamed from: u */
    public final void m103305u(AbstractC3250i abstractC3250i, int i, Throwable th) {
        abstractC3250i.m103289c(Uri.EMPTY);
        abstractC3250i.m103279q(AbstractC50655vp6.m7963b(abstractC3250i.m103285i(), AbstractC34821Ns4.m93251d(0L, 0L, AbstractC2954Gp.m104700c(1, this.f14016V)), AbstractC40782fA3.m41782b(Uri.EMPTY), i, th));
    }

    /* renamed from: v */
    public final List<InterfaceC41617gb1> m103304v(long j) {
        ArrayList arrayList = new ArrayList();
        while (!this.f14015U.isEmpty()) {
            InterfaceC41617gb1 mo6312a = this.f14015U.mo6312a();
            if (mo6312a.mo33771q0() >= j) {
                arrayList.add(mo6312a);
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    public AbstractC34821Ns4 m103303w() {
        return AbstractC34821Ns4.m93251d(this.f14003I, this.f14002H, AbstractC2954Gp.m104700c(m103300z(this.f14000F), this.f14016V));
    }

    /* renamed from: x */
    public <T> T m103302x(GP5<T> gp5) {
        try {
            return gp5.mo72842d().get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: y */
    public final void m103301y(final AbstractC3250i abstractC3250i) {
        this.f14041s.add(O80.m92864a(new O80.InterfaceC5834c() { // from class: Gs4
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m103361F;
                m103361F = C33417Hs4.this.m103361F(abstractC3250i, c5832a);
                return m103361F;
            }
        }));
        if (m103365B()) {
            this.f14041s.add(O80.m92864a(new O80.InterfaceC5834c() { // from class: vs4
                @Override // p000.O80.InterfaceC5834c
                /* renamed from: a */
                public final Object mo3207a(O80.C5832a c5832a) {
                    Object m103359H;
                    m103359H = C33417Hs4.this.m103359H(abstractC3250i, c5832a);
                    return m103359H;
                }
            }));
        }
        IA1.m102842b(IA1.m102841c(this.f14041s), new C3246e(), C31631Ac0.m115449a());
    }

    /* renamed from: z */
    public final int m103300z(EnumC3248g enumC3248g) {
        int i = C3247f.f14060b[enumC3248g.ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            if (i == 4 || i == 6) {
                return 1;
            }
            throw new AssertionError("Invalid internal audio state: " + enumC3248g);
        } else if (this.f14017W) {
            return 2;
        } else {
            return 0;
        }
    }
}
