package p000;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.Range;
import android.view.Surface;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
import p000.C34899Ob1;
import p000.InterfaceC37493Zd3;
import p000.InterfaceC44582lb1;
import p000.O80;
/* renamed from: Ob1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C34899Ob1 implements InterfaceC44582lb1 {

    /* renamed from: E */
    public static final Range<Long> f26801E;

    /* renamed from: D */
    public final C51696xb1 f26805D;

    /* renamed from: a */
    public final String f26806a;

    /* renamed from: c */
    public final boolean f26808c;

    /* renamed from: d */
    public final MediaFormat f26809d;

    /* renamed from: e */
    public final MediaCodec f26810e;

    /* renamed from: f */
    public final InterfaceC44582lb1.InterfaceC25733a f26811f;

    /* renamed from: g */
    public final InterfaceC42220hc1 f26812g;

    /* renamed from: h */
    public final Executor f26813h;

    /* renamed from: i */
    public final ListenableFuture<Void> f26814i;

    /* renamed from: j */
    public final O80.C5832a<Void> f26815j;

    /* renamed from: p */
    public final EnumC47841r46 f26821p;

    /* renamed from: t */
    public EnumC6040e f26825t;

    /* renamed from: b */
    public final Object f26807b = new Object();

    /* renamed from: k */
    public final Queue<Integer> f26816k = new ArrayDeque();

    /* renamed from: l */
    public final Queue<O80.C5832a<O22>> f26817l = new ArrayDeque();

    /* renamed from: m */
    public final Set<O22> f26818m = new HashSet();

    /* renamed from: n */
    public final Set<C42803ib1> f26819n = new HashSet();

    /* renamed from: o */
    public final Deque<Range<Long>> f26820o = new ArrayDeque();

    /* renamed from: q */
    public final InterfaceC45469n46 f26822q = new C44558lY5();

    /* renamed from: r */
    public InterfaceC48732sb1 f26823r = InterfaceC48732sb1.f109021a;

    /* renamed from: s */
    public Executor f26824s = C31631Ac0.m115449a();

    /* renamed from: u */
    public Range<Long> f26826u = f26801E;

    /* renamed from: v */
    public long f26827v = 0;

    /* renamed from: w */
    public boolean f26828w = false;

    /* renamed from: x */
    public Long f26829x = null;

    /* renamed from: y */
    public Future<?> f26830y = null;

    /* renamed from: z */
    public C6041f f26831z = null;

    /* renamed from: A */
    public boolean f26802A = false;

    /* renamed from: B */
    public boolean f26803B = false;

    /* renamed from: C */
    public boolean f26804C = false;

    /* renamed from: Ob1$a */
    /* loaded from: classes.dex */
    public class C6035a implements CA1<O22> {

        /* renamed from: Ob1$a$a */
        /* loaded from: classes.dex */
        public class C6036a implements CA1<Void> {
            public C6036a() {
            }

            @Override // p000.CA1
            /* renamed from: a */
            public void onSuccess(Void r1) {
            }

            @Override // p000.CA1
            public void onFailure(Throwable th) {
                if (th instanceof MediaCodec.CodecException) {
                    C34899Ob1.this.m91989C((MediaCodec.CodecException) th);
                } else {
                    C34899Ob1.this.m91990B(0, th.getMessage(), th);
                }
            }
        }

        public C6035a() {
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(O22 o22) {
            o22.mo89092d(C34899Ob1.this.m91938z());
            o22.mo89095a(true);
            o22.mo89094b();
            IA1.m102842b(o22.mo89093c(), new C6036a(), C34899Ob1.this.f26813h);
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            C34899Ob1.this.m91990B(0, "Unable to acquire InputBuffer.", th);
        }
    }

    /* renamed from: Ob1$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C6037b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26834a;

        static {
            int[] iArr = new int[EnumC6040e.values().length];
            f26834a = iArr;
            try {
                iArr[EnumC6040e.CONFIGURED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26834a[EnumC6040e.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26834a[EnumC6040e.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26834a[EnumC6040e.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26834a[EnumC6040e.PENDING_START_PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26834a[EnumC6040e.PENDING_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26834a[EnumC6040e.PENDING_RELEASE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26834a[EnumC6040e.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26834a[EnumC6040e.RELEASED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: Ob1$c */
    /* loaded from: classes.dex */
    public static class C6038c {
        private C6038c() {
        }

        /* renamed from: a */
        public static Surface m91935a() {
            return MediaCodec.createPersistentInputSurface();
        }

        /* renamed from: b */
        public static void m91934b(MediaCodec mediaCodec, Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }

    /* renamed from: Ob1$d */
    /* loaded from: classes.dex */
    public class C6039d implements InterfaceC44582lb1.InterfaceC25733a, InterfaceC37493Zd3 {

        /* renamed from: a */
        public final Map<InterfaceC37493Zd3.InterfaceC10303a<? super EnumC44267l30>, Executor> f26835a = new LinkedHashMap();

        /* renamed from: b */
        public EnumC44267l30 f26836b = EnumC44267l30.INACTIVE;

        /* renamed from: c */
        public final List<ListenableFuture<O22>> f26837c = new ArrayList();

        public C6039d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m91926l(final InterfaceC37493Zd3.InterfaceC10303a interfaceC10303a, Executor executor) {
            this.f26835a.put((InterfaceC37493Zd3.InterfaceC10303a) HZ3.m103731g(interfaceC10303a), (Executor) HZ3.m103731g(executor));
            final EnumC44267l30 enumC44267l30 = this.f26836b;
            executor.execute(new Runnable() { // from class: Pb1
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC37493Zd3.InterfaceC10303a.this.mo68963a(enumC44267l30);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m91925m(O80.C5832a c5832a) {
            c5832a.m92861c(this.f26836b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ Object m91924n(final O80.C5832a c5832a) throws Exception {
            C34899Ob1.this.f26813h.execute(new Runnable() { // from class: Qb1
                @Override // java.lang.Runnable
                public final void run() {
                    C34899Ob1.C6039d.this.m91925m(c5832a);
                }
            });
            return "fetchData";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m91923o(InterfaceC37493Zd3.InterfaceC10303a interfaceC10303a) {
            this.f26835a.remove(HZ3.m103731g(interfaceC10303a));
        }

        /* renamed from: p */
        public static /* synthetic */ void m91922p(Map.Entry entry, EnumC44267l30 enumC44267l30) {
            ((InterfaceC37493Zd3.InterfaceC10303a) entry.getKey()).mo68963a(enumC44267l30);
        }

        @Override // p000.InterfaceC37493Zd3
        /* renamed from: b */
        public void mo72844b(final InterfaceC37493Zd3.InterfaceC10303a<? super EnumC44267l30> interfaceC10303a) {
            C34899Ob1.this.f26813h.execute(new Runnable() { // from class: Sb1
                @Override // java.lang.Runnable
                public final void run() {
                    C34899Ob1.C6039d.this.m91923o(interfaceC10303a);
                }
            });
        }

        @Override // p000.InterfaceC37493Zd3
        /* renamed from: c */
        public void mo72843c(final Executor executor, final InterfaceC37493Zd3.InterfaceC10303a<? super EnumC44267l30> interfaceC10303a) {
            C34899Ob1.this.f26813h.execute(new Runnable() { // from class: Ub1
                @Override // java.lang.Runnable
                public final void run() {
                    C34899Ob1.C6039d.this.m91926l(interfaceC10303a, executor);
                }
            });
        }

        @Override // p000.InterfaceC37493Zd3
        /* renamed from: d */
        public ListenableFuture<EnumC44267l30> mo72842d() {
            return O80.m92864a(new O80.InterfaceC5834c() { // from class: Tb1
                @Override // p000.O80.InterfaceC5834c
                /* renamed from: a */
                public final Object mo3207a(O80.C5832a c5832a) {
                    Object m91924n;
                    m91924n = C34899Ob1.C6039d.this.m91924n(c5832a);
                    return m91924n;
                }
            });
        }

        /* renamed from: q */
        public void m91921q(boolean z) {
            final EnumC44267l30 enumC44267l30;
            if (z) {
                enumC44267l30 = EnumC44267l30.ACTIVE;
            } else {
                enumC44267l30 = EnumC44267l30.INACTIVE;
            }
            if (this.f26836b == enumC44267l30) {
                return;
            }
            this.f26836b = enumC44267l30;
            if (enumC44267l30 == EnumC44267l30.INACTIVE) {
                for (ListenableFuture<O22> listenableFuture : this.f26837c) {
                    listenableFuture.cancel(true);
                }
                this.f26837c.clear();
            }
            for (final Map.Entry<InterfaceC37493Zd3.InterfaceC10303a<? super EnumC44267l30>, Executor> entry : this.f26835a.entrySet()) {
                try {
                    entry.getValue().execute(new Runnable() { // from class: Rb1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C34899Ob1.C6039d.m91922p(entry, enumC44267l30);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    C33928Jx2.m99530d(C34899Ob1.this.f26806a, "Unable to post to the supplied executor.", e);
                }
            }
        }
    }

    /* renamed from: Ob1$e */
    /* loaded from: classes.dex */
    public enum EnumC6040e {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    /* renamed from: Ob1$f */
    /* loaded from: classes.dex */
    public class C6041f extends MediaCodec.Callback {

        /* renamed from: a */
        public final C51841xp6 f26849a;

        /* renamed from: b */
        public boolean f26850b = false;

        /* renamed from: c */
        public boolean f26851c = false;

        /* renamed from: d */
        public boolean f26852d = false;

        /* renamed from: e */
        public long f26853e = 0;

        /* renamed from: f */
        public long f26854f = 0;

        /* renamed from: g */
        public boolean f26855g = false;

        /* renamed from: h */
        public boolean f26856h = false;

        /* renamed from: i */
        public boolean f26857i = false;

        /* renamed from: Ob1$f$a */
        /* loaded from: classes.dex */
        public class C6042a implements CA1<Void> {

            /* renamed from: a */
            public final /* synthetic */ C42803ib1 f26859a;

            public C6042a(C42803ib1 c42803ib1) {
                this.f26859a = c42803ib1;
            }

            @Override // p000.CA1
            /* renamed from: a */
            public void onSuccess(Void r2) {
                C34899Ob1.this.f26819n.remove(this.f26859a);
            }

            @Override // p000.CA1
            public void onFailure(Throwable th) {
                C34899Ob1.this.f26819n.remove(this.f26859a);
                if (th instanceof MediaCodec.CodecException) {
                    C34899Ob1.this.m91989C((MediaCodec.CodecException) th);
                } else {
                    C34899Ob1.this.m91990B(0, th.getMessage(), th);
                }
            }
        }

        public C6041f() {
            if (C34899Ob1.this.f26808c) {
                this.f26849a = new C51841xp6(C34899Ob1.this.f26822q, Q21.m89097a(C49927uc0.class) == null ? C34899Ob1.this.f26821p : null);
            } else {
                this.f26849a = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m91908l(MediaCodec.CodecException codecException) {
            switch (C6037b.f26834a[C34899Ob1.this.f26825t.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    C34899Ob1.this.m91989C(codecException);
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C34899Ob1.this.f26825t);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m91907m(int i) {
            if (this.f26857i) {
                C33928Jx2.m99522l(C34899Ob1.this.f26806a, "Receives input frame after codec is reset.");
                return;
            }
            switch (C6037b.f26834a[C34899Ob1.this.f26825t.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    C34899Ob1.this.f26816k.offer(Integer.valueOf(i));
                    C34899Ob1.this.m91969W();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C34899Ob1.this.f26825t);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m91906n(Executor executor, final InterfaceC48732sb1 interfaceC48732sb1) {
            if (C34899Ob1.this.f26825t == EnumC6040e.ERROR) {
                return;
            }
            try {
                Objects.requireNonNull(interfaceC48732sb1);
                executor.execute(new Runnable() { // from class: fc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC48732sb1.this.mo13966e();
                    }
                });
            } catch (RejectedExecutionException e) {
                C33928Jx2.m99530d(C34899Ob1.this.f26806a, "Unable to post to the supplied executor.", e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m91905o(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
            final InterfaceC48732sb1 interfaceC48732sb1;
            final Executor executor;
            if (this.f26857i) {
                C33928Jx2.m99522l(C34899Ob1.this.f26806a, "Receives frame after codec is reset.");
                return;
            }
            switch (C6037b.f26834a[C34899Ob1.this.f26825t.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    synchronized (C34899Ob1.this.f26807b) {
                        C34899Ob1 c34899Ob1 = C34899Ob1.this;
                        interfaceC48732sb1 = c34899Ob1.f26823r;
                        executor = c34899Ob1.f26824s;
                    }
                    if (!this.f26850b) {
                        this.f26850b = true;
                        try {
                            Objects.requireNonNull(interfaceC48732sb1);
                            executor.execute(new Runnable() { // from class: bc1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    InterfaceC48732sb1.this.mo13968c();
                                }
                            });
                        } catch (RejectedExecutionException e) {
                            C33928Jx2.m99530d(C34899Ob1.this.f26806a, "Unable to post to the supplied executor.", e);
                        }
                    }
                    if (m91911i(bufferInfo)) {
                        if (!this.f26851c) {
                            this.f26851c = true;
                        }
                        MediaCodec.BufferInfo m91900t = m91900t(bufferInfo);
                        this.f26854f = m91900t.presentationTimeUs;
                        try {
                            m91899u(new C42803ib1(mediaCodec, i, m91900t), interfaceC48732sb1, executor);
                        } catch (MediaCodec.CodecException e2) {
                            C34899Ob1.this.m91989C(e2);
                            return;
                        }
                    } else if (i != -9999) {
                        try {
                            C34899Ob1.this.f26810e.releaseOutputBuffer(i, false);
                        } catch (MediaCodec.CodecException e3) {
                            C34899Ob1.this.m91989C(e3);
                            return;
                        }
                    }
                    if (!this.f26852d && m91910j(bufferInfo)) {
                        this.f26852d = true;
                        C34899Ob1.this.m91958g0(new Runnable() { // from class: cc1
                            @Override // java.lang.Runnable
                            public final void run() {
                                C34899Ob1.C6041f.this.m91906n(executor, interfaceC48732sb1);
                            }
                        });
                        return;
                    }
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + C34899Ob1.this.f26825t);
            }
        }

        /* renamed from: p */
        public static /* synthetic */ MediaFormat m91904p(MediaFormat mediaFormat) {
            return mediaFormat;
        }

        /* renamed from: q */
        public static /* synthetic */ void m91903q(InterfaceC48732sb1 interfaceC48732sb1, final MediaFormat mediaFormat) {
            interfaceC48732sb1.mo13965f(new InterfaceC35819Rz3() { // from class: ec1
                @Override // p000.InterfaceC35819Rz3
                /* renamed from: a */
                public final MediaFormat mo42725a() {
                    MediaFormat m91904p;
                    m91904p = C34899Ob1.C6041f.m91904p(mediaFormat);
                    return m91904p;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m91902r(final MediaFormat mediaFormat) {
            final InterfaceC48732sb1 interfaceC48732sb1;
            Executor executor;
            if (this.f26857i) {
                C33928Jx2.m99522l(C34899Ob1.this.f26806a, "Receives onOutputFormatChanged after codec is reset.");
                return;
            }
            switch (C6037b.f26834a[C34899Ob1.this.f26825t.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    synchronized (C34899Ob1.this.f26807b) {
                        C34899Ob1 c34899Ob1 = C34899Ob1.this;
                        interfaceC48732sb1 = c34899Ob1.f26823r;
                        executor = c34899Ob1.f26824s;
                    }
                    try {
                        executor.execute(new Runnable() { // from class: ac1
                            @Override // java.lang.Runnable
                            public final void run() {
                                C34899Ob1.C6041f.m91903q(InterfaceC48732sb1.this, mediaFormat);
                            }
                        });
                        return;
                    } catch (RejectedExecutionException e) {
                        C33928Jx2.m99530d(C34899Ob1.this.f26806a, "Unable to post to the supplied executor.", e);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + C34899Ob1.this.f26825t);
            }
        }

        /* renamed from: i */
        public final boolean m91911i(MediaCodec.BufferInfo bufferInfo) {
            if (this.f26852d) {
                C33928Jx2.m99533a(C34899Ob1.this.f26806a, "Drop buffer by already reach end of stream.");
                return false;
            } else if (bufferInfo.size <= 0) {
                C33928Jx2.m99533a(C34899Ob1.this.f26806a, "Drop buffer by invalid buffer size.");
                return false;
            } else if ((bufferInfo.flags & 2) != 0) {
                C33928Jx2.m99533a(C34899Ob1.this.f26806a, "Drop buffer by codec config.");
                return false;
            } else {
                C51841xp6 c51841xp6 = this.f26849a;
                if (c51841xp6 != null) {
                    bufferInfo.presentationTimeUs = c51841xp6.m4587b(bufferInfo.presentationTimeUs);
                }
                long j = bufferInfo.presentationTimeUs;
                if (j <= this.f26853e) {
                    C33928Jx2.m99533a(C34899Ob1.this.f26806a, "Drop buffer by out of order buffer from MediaCodec.");
                    return false;
                }
                this.f26853e = j;
                if (!C34899Ob1.this.f26826u.contains((Range<Long>) Long.valueOf(j))) {
                    C33928Jx2.m99533a(C34899Ob1.this.f26806a, "Drop buffer by not in start-stop range.");
                    C34899Ob1 c34899Ob1 = C34899Ob1.this;
                    if (c34899Ob1.f26828w && bufferInfo.presentationTimeUs >= c34899Ob1.f26826u.getUpper().longValue()) {
                        Future<?> future = C34899Ob1.this.f26830y;
                        if (future != null) {
                            future.cancel(true);
                        }
                        C34899Ob1.this.f26829x = Long.valueOf(bufferInfo.presentationTimeUs);
                        C34899Ob1.this.m91962d0();
                        C34899Ob1.this.f26828w = false;
                    }
                    return false;
                } else if (m91897w(bufferInfo)) {
                    C33928Jx2.m99533a(C34899Ob1.this.f26806a, "Drop buffer by pause.");
                    return false;
                } else if (C34899Ob1.this.m91991A(bufferInfo) <= this.f26854f) {
                    C33928Jx2.m99533a(C34899Ob1.this.f26806a, "Drop buffer by adjusted time is less than the last sent time.");
                    if (C34899Ob1.this.f26808c && C34899Ob1.m91985G(bufferInfo)) {
                        this.f26856h = true;
                    }
                    return false;
                } else {
                    if (!this.f26851c && !this.f26856h && C34899Ob1.this.f26808c) {
                        this.f26856h = true;
                    }
                    if (this.f26856h) {
                        if (!C34899Ob1.m91985G(bufferInfo)) {
                            C33928Jx2.m99533a(C34899Ob1.this.f26806a, "Drop buffer by not a key frame.");
                            C34899Ob1.this.m91966Z();
                            return false;
                        }
                        this.f26856h = false;
                    }
                    return true;
                }
            }
        }

        /* renamed from: j */
        public final boolean m91910j(MediaCodec.BufferInfo bufferInfo) {
            return C34899Ob1.m91987E(bufferInfo) || m91909k(bufferInfo);
        }

        /* renamed from: k */
        public final boolean m91909k(MediaCodec.BufferInfo bufferInfo) {
            C34899Ob1 c34899Ob1 = C34899Ob1.this;
            if (c34899Ob1.f26804C && bufferInfo.presentationTimeUs > c34899Ob1.f26826u.getUpper().longValue()) {
                return true;
            }
            return false;
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, final MediaCodec.CodecException codecException) {
            C34899Ob1.this.f26813h.execute(new Runnable() { // from class: Vb1
                @Override // java.lang.Runnable
                public final void run() {
                    C34899Ob1.C6041f.this.m91908l(codecException);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, final int i) {
            C34899Ob1.this.f26813h.execute(new Runnable() { // from class: Yb1
                @Override // java.lang.Runnable
                public final void run() {
                    C34899Ob1.C6041f.this.m91907m(i);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i, final MediaCodec.BufferInfo bufferInfo) {
            C34899Ob1.this.f26813h.execute(new Runnable() { // from class: Xb1
                @Override // java.lang.Runnable
                public final void run() {
                    C34899Ob1.C6041f.this.m91905o(bufferInfo, mediaCodec, i);
                }
            });
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, final MediaFormat mediaFormat) {
            C34899Ob1.this.f26813h.execute(new Runnable() { // from class: Zb1
                @Override // java.lang.Runnable
                public final void run() {
                    C34899Ob1.C6041f.this.m91902r(mediaFormat);
                }
            });
        }

        /* renamed from: t */
        public final MediaCodec.BufferInfo m91900t(MediaCodec.BufferInfo bufferInfo) {
            boolean z;
            long m91991A = C34899Ob1.this.m91991A(bufferInfo);
            if (bufferInfo.presentationTimeUs == m91991A) {
                return bufferInfo;
            }
            if (m91991A > this.f26854f) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103729i(z);
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            bufferInfo2.set(bufferInfo.offset, bufferInfo.size, m91991A, bufferInfo.flags);
            return bufferInfo2;
        }

        /* renamed from: u */
        public final void m91899u(final C42803ib1 c42803ib1, final InterfaceC48732sb1 interfaceC48732sb1, Executor executor) {
            C34899Ob1.this.f26819n.add(c42803ib1);
            IA1.m102842b(c42803ib1.m33775b(), new C6042a(c42803ib1), C34899Ob1.this.f26813h);
            try {
                executor.execute(new Runnable() { // from class: Wb1
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC48732sb1.this.mo13969a(c42803ib1);
                    }
                });
            } catch (RejectedExecutionException e) {
                C33928Jx2.m99530d(C34899Ob1.this.f26806a, "Unable to post to the supplied executor.", e);
                c42803ib1.close();
            }
        }

        /* renamed from: v */
        public void m91898v() {
            this.f26857i = true;
        }

        /* renamed from: w */
        public final boolean m91897w(MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            final InterfaceC48732sb1 interfaceC48732sb1;
            C34899Ob1.this.m91956h0(bufferInfo.presentationTimeUs);
            boolean m91986F = C34899Ob1.this.m91986F(bufferInfo.presentationTimeUs);
            boolean z = this.f26855g;
            if (!z && m91986F) {
                C33928Jx2.m99533a(C34899Ob1.this.f26806a, "Switch to pause state");
                this.f26855g = true;
                synchronized (C34899Ob1.this.f26807b) {
                    C34899Ob1 c34899Ob1 = C34899Ob1.this;
                    executor = c34899Ob1.f26824s;
                    interfaceC48732sb1 = c34899Ob1.f26823r;
                }
                Objects.requireNonNull(interfaceC48732sb1);
                executor.execute(new Runnable() { // from class: dc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC48732sb1.this.m13970b();
                    }
                });
                C34899Ob1 c34899Ob12 = C34899Ob1.this;
                if (c34899Ob12.f26825t == EnumC6040e.PAUSED && ((c34899Ob12.f26808c || Q21.m89097a(C31514zp.class) == null) && (!C34899Ob1.this.f26808c || Q21.m89097a(C48877sp6.class) == null))) {
                    InterfaceC44582lb1.InterfaceC25733a interfaceC25733a = C34899Ob1.this.f26811f;
                    if (interfaceC25733a instanceof C6039d) {
                        ((C6039d) interfaceC25733a).m91921q(false);
                    }
                    C34899Ob1.this.m91964b0(true);
                }
                C34899Ob1.this.f26829x = Long.valueOf(bufferInfo.presentationTimeUs);
                C34899Ob1 c34899Ob13 = C34899Ob1.this;
                if (c34899Ob13.f26828w) {
                    Future<?> future = c34899Ob13.f26830y;
                    if (future != null) {
                        future.cancel(true);
                    }
                    C34899Ob1.this.m91962d0();
                    C34899Ob1.this.f26828w = false;
                }
            } else if (z && !m91986F) {
                C33928Jx2.m99533a(C34899Ob1.this.f26806a, "Switch to resume state");
                this.f26855g = false;
                if (C34899Ob1.this.f26808c && !C34899Ob1.m91985G(bufferInfo)) {
                    this.f26856h = true;
                }
            }
            return this.f26855g;
        }
    }

    /* renamed from: Ob1$g */
    /* loaded from: classes.dex */
    public class C6043g implements InterfaceC44582lb1.InterfaceC25734b {

        /* renamed from: b */
        public Surface f26862b;

        /* renamed from: d */
        public InterfaceC44582lb1.InterfaceC25734b.InterfaceC25735a f26864d;

        /* renamed from: e */
        public Executor f26865e;

        /* renamed from: a */
        public final Object f26861a = new Object();

        /* renamed from: c */
        public final Set<Surface> f26863c = new HashSet();

        public C6043g() {
        }

        @Override // p000.InterfaceC44582lb1.InterfaceC25734b
        /* renamed from: a */
        public void mo27103a(Executor executor, InterfaceC44582lb1.InterfaceC25734b.InterfaceC25735a interfaceC25735a) {
            Surface surface;
            synchronized (this.f26861a) {
                this.f26864d = (InterfaceC44582lb1.InterfaceC25734b.InterfaceC25735a) HZ3.m103731g(interfaceC25735a);
                this.f26865e = (Executor) HZ3.m103731g(executor);
                surface = this.f26862b;
            }
            if (surface != null) {
                m91893d(executor, interfaceC25735a, surface);
            }
        }

        /* renamed from: d */
        public final void m91893d(Executor executor, final InterfaceC44582lb1.InterfaceC25734b.InterfaceC25735a interfaceC25735a, final Surface surface) {
            try {
                executor.execute(new Runnable() { // from class: gc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC44582lb1.InterfaceC25734b.InterfaceC25735a.this.mo6197a(surface);
                    }
                });
            } catch (RejectedExecutionException e) {
                C33928Jx2.m99530d(C34899Ob1.this.f26806a, "Unable to post to the supplied executor.", e);
            }
        }

        /* renamed from: e */
        public void m91892e() {
            Surface surface;
            HashSet<Surface> hashSet;
            synchronized (this.f26861a) {
                surface = this.f26862b;
                this.f26862b = null;
                hashSet = new HashSet(this.f26863c);
                this.f26863c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            for (Surface surface2 : hashSet) {
                surface2.release();
            }
        }

        @SuppressLint({"NewApi"})
        /* renamed from: f */
        public void m91891f() {
            Surface createInputSurface;
            InterfaceC44582lb1.InterfaceC25734b.InterfaceC25735a interfaceC25735a;
            Executor executor;
            C43406jc1 c43406jc1 = (C43406jc1) Q21.m89097a(C43406jc1.class);
            synchronized (this.f26861a) {
                if (c43406jc1 == null) {
                    if (this.f26862b == null) {
                        createInputSurface = C6038c.m91935a();
                        this.f26862b = createInputSurface;
                    } else {
                        createInputSurface = null;
                    }
                    C6038c.m91934b(C34899Ob1.this.f26810e, this.f26862b);
                } else {
                    Surface surface = this.f26862b;
                    if (surface != null) {
                        this.f26863c.add(surface);
                    }
                    createInputSurface = C34899Ob1.this.f26810e.createInputSurface();
                    this.f26862b = createInputSurface;
                }
                interfaceC25735a = this.f26864d;
                executor = this.f26865e;
            }
            if (createInputSurface != null && interfaceC25735a != null && executor != null) {
                m91893d(executor, interfaceC25735a, createInputSurface);
            }
        }
    }

    static {
        Long valueOf = Long.valueOf((long) LongCompanionObject.MAX_VALUE);
        f26801E = Range.create(valueOf, valueOf);
    }

    public C34899Ob1(Executor executor, InterfaceC49918ub1 interfaceC49918ub1) throws InvalidConfigException {
        C51696xb1 c51696xb1 = new C51696xb1();
        this.f26805D = c51696xb1;
        HZ3.m103731g(executor);
        HZ3.m103731g(interfaceC49918ub1);
        this.f26813h = C31631Ac0.m115444f(executor);
        if (interfaceC49918ub1 instanceof AbstractC30706yp) {
            this.f26806a = "AudioEncoder";
            this.f26808c = false;
            this.f26811f = new C6039d();
        } else if (interfaceC49918ub1 instanceof AbstractC39983dp6) {
            this.f26806a = "VideoEncoder";
            this.f26808c = true;
            this.f26811f = new C6043g();
        } else {
            throw new InvalidConfigException("Unknown encoder config type");
        }
        EnumC47841r46 mo10003b = interfaceC49918ub1.mo10003b();
        this.f26821p = mo10003b;
        String str = this.f26806a;
        C33928Jx2.m99533a(str, "mInputTimebase = " + mo10003b);
        MediaFormat mo2554c = interfaceC49918ub1.mo2554c();
        this.f26809d = mo2554c;
        String str2 = this.f26806a;
        C33928Jx2.m99533a(str2, "mMediaFormat = " + mo2554c);
        MediaCodec m4971a = c51696xb1.m4971a(mo2554c);
        this.f26810e = m4971a;
        String str3 = this.f26806a;
        C33928Jx2.m99529e(str3, "Selected encoder: " + m4971a.getName());
        InterfaceC42220hc1 m91939y = m91939y(this.f26808c, m4971a.getCodecInfo(), interfaceC49918ub1.mo2555a());
        this.f26812g = m91939y;
        if (this.f26808c) {
            m91940x((InterfaceC42355hp6) m91939y, mo2554c);
        }
        try {
            m91965a0();
            final AtomicReference atomicReference = new AtomicReference();
            this.f26814i = IA1.m102834j(O80.m92864a(new O80.InterfaceC5834c() { // from class: Ab1
                @Override // p000.O80.InterfaceC5834c
                /* renamed from: a */
                public final Object mo3207a(O80.C5832a c5832a) {
                    Object obj;
                    obj = atomicReference.set(c5832a);
                    return obj;
                }
            }));
            this.f26815j = (O80.C5832a) HZ3.m103731g((O80.C5832a) atomicReference.get());
            m91963c0(EnumC6040e.CONFIGURED);
        } catch (MediaCodec.CodecException e) {
            throw new InvalidConfigException(e);
        }
    }

    /* renamed from: E */
    public static boolean m91987E(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 4) != 0;
    }

    /* renamed from: G */
    public static boolean m91985G(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m91983I(O80.C5832a c5832a) {
        this.f26817l.remove(c5832a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m91981K(Q22 q22) {
        this.f26818m.remove(q22);
    }

    /* renamed from: M */
    public static /* synthetic */ void m91979M(InterfaceC48732sb1 interfaceC48732sb1, int i, String str, Throwable th) {
        interfaceC48732sb1.mo13967d(new EncodeException(i, str, th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m91978N(long j) {
        switch (C6037b.f26834a[this.f26825t.ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 8:
                return;
            case 2:
                String str = this.f26806a;
                C33928Jx2.m99533a(str, "Pause on " + C42154hV0.m36345j(j));
                this.f26820o.addLast(Range.create(Long.valueOf(j), Long.valueOf((long) LongCompanionObject.MAX_VALUE)));
                m91963c0(EnumC6040e.PAUSED);
                return;
            case 6:
                m91963c0(EnumC6040e.PENDING_START_PAUSED);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f26825t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m91977O() {
        switch (C6037b.f26834a[this.f26825t.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 8:
                m91967Y();
                return;
            case 4:
            case 5:
            case 6:
                m91963c0(EnumC6040e.PENDING_RELEASE);
                return;
            case 7:
            case 9:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + this.f26825t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m91976P() {
        int i = C6037b.f26834a[this.f26825t.ordinal()];
        if (i != 2) {
            if (i == 7 || i == 9) {
                throw new IllegalStateException("Encoder is released");
            }
            return;
        }
        m91966Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m91975Q() {
        this.f26803B = true;
        if (this.f26802A) {
            this.f26810e.stop();
            m91965a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m91974R(long j) {
        boolean z;
        long longValue;
        switch (C6037b.f26834a[this.f26825t.ordinal()]) {
            case 1:
                this.f26829x = null;
                C33928Jx2.m99533a(this.f26806a, "Start on " + C42154hV0.m36345j(j));
                try {
                    if (this.f26802A) {
                        m91965a0();
                    }
                    this.f26826u = Range.create(Long.valueOf(j), Long.valueOf((long) LongCompanionObject.MAX_VALUE));
                    this.f26810e.start();
                    InterfaceC44582lb1.InterfaceC25733a interfaceC25733a = this.f26811f;
                    if (interfaceC25733a instanceof C6039d) {
                        ((C6039d) interfaceC25733a).m91921q(true);
                    }
                    m91963c0(EnumC6040e.STARTED);
                    return;
                } catch (MediaCodec.CodecException e) {
                    m91989C(e);
                    return;
                }
            case 2:
            case 6:
            case 8:
                return;
            case 3:
                this.f26829x = null;
                Range<Long> removeLast = this.f26820o.removeLast();
                if (removeLast != null && removeLast.getUpper().longValue() == LongCompanionObject.MAX_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                HZ3.m103728j(z, "There should be a \"pause\" before \"resume\"");
                this.f26820o.addLast(Range.create(Long.valueOf(removeLast.getLower().longValue()), Long.valueOf(j)));
                C33928Jx2.m99533a(this.f26806a, "Resume on " + C42154hV0.m36345j(j) + "\nPaused duration = " + C42154hV0.m36345j(j - longValue));
                if ((this.f26808c || Q21.m89097a(C31514zp.class) == null) && (!this.f26808c || Q21.m89097a(C48877sp6.class) == null)) {
                    m91964b0(false);
                    InterfaceC44582lb1.InterfaceC25733a interfaceC25733a2 = this.f26811f;
                    if (interfaceC25733a2 instanceof C6039d) {
                        ((C6039d) interfaceC25733a2).m91921q(true);
                    }
                }
                if (this.f26808c) {
                    m91966Z();
                }
                m91963c0(EnumC6040e.STARTED);
                return;
            case 4:
            case 5:
                m91963c0(EnumC6040e.PENDING_START);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f26825t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m91973S() {
        if (this.f26828w) {
            C33928Jx2.m99522l(this.f26806a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
            this.f26829x = null;
            m91962d0();
            this.f26828w = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m91972T() {
        this.f26813h.execute(new Runnable() { // from class: Db1
            @Override // java.lang.Runnable
            public final void run() {
                C34899Ob1.this.m91973S();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m91971U(long j, long j2) {
        switch (C6037b.f26834a[this.f26825t.ordinal()]) {
            case 1:
            case 4:
            case 8:
                return;
            case 2:
            case 3:
                EnumC6040e enumC6040e = this.f26825t;
                m91963c0(EnumC6040e.STOPPING);
                long longValue = this.f26826u.getLower().longValue();
                if (longValue != LongCompanionObject.MAX_VALUE) {
                    if (j != -1) {
                        if (j < longValue) {
                            C33928Jx2.m99522l(this.f26806a, "The expected stop time is less than the start time. Use current time as stop time.");
                        }
                        if (j < longValue) {
                            this.f26826u = Range.create(Long.valueOf(longValue), Long.valueOf(j));
                            String str = this.f26806a;
                            C33928Jx2.m99533a(str, "Stop on " + C42154hV0.m36345j(j));
                            if (enumC6040e == EnumC6040e.PAUSED && this.f26829x != null) {
                                m91962d0();
                                return;
                            }
                            this.f26828w = true;
                            this.f26830y = C31631Ac0.m115446d().schedule(new Runnable() { // from class: Mb1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C34899Ob1.this.m91972T();
                                }
                            }, 1000L, TimeUnit.MILLISECONDS);
                            return;
                        }
                        throw new AssertionError("The start time should be before the stop time.");
                    }
                    j = j2;
                    if (j < longValue) {
                    }
                } else {
                    throw new AssertionError("There should be a \"start\" before \"stop\"");
                }
                break;
            case 5:
            case 6:
                m91963c0(EnumC6040e.CONFIGURED);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.f26825t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ void m91970V(List list, Runnable runnable) {
        if (this.f26825t != EnumC6040e.ERROR) {
            if (!list.isEmpty()) {
                C33928Jx2.m99533a(this.f26806a, "encoded data and input buffers are returned");
            }
            if ((this.f26811f instanceof C6043g) && !this.f26803B) {
                this.f26810e.flush();
                this.f26802A = true;
            } else {
                this.f26810e.stop();
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        m91988D();
    }

    /* renamed from: y */
    public static InterfaceC42220hc1 m91939y(boolean z, MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        if (z) {
            return new C42948ip6(mediaCodecInfo, str);
        }
        return new C0250Ap(mediaCodecInfo, str);
    }

    /* renamed from: A */
    public long m91991A(MediaCodec.BufferInfo bufferInfo) {
        long j = this.f26827v;
        if (j > 0) {
            return bufferInfo.presentationTimeUs - j;
        }
        return bufferInfo.presentationTimeUs;
    }

    /* renamed from: B */
    public void m91990B(final int i, final String str, final Throwable th) {
        switch (C6037b.f26834a[this.f26825t.ordinal()]) {
            case 1:
                m91982J(i, str, th);
                m91965a0();
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                m91963c0(EnumC6040e.ERROR);
                m91958g0(new Runnable() { // from class: zb1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C34899Ob1.this.m91982J(i, str, th);
                    }
                });
                return;
            case 8:
                String str2 = this.f26806a;
                C33928Jx2.m99521m(str2, "Get more than one error: " + str + "(" + i + ")", th);
                return;
            default:
                return;
        }
    }

    /* renamed from: C */
    public void m91989C(MediaCodec.CodecException codecException) {
        m91990B(1, codecException.getMessage(), codecException);
    }

    /* renamed from: D */
    public void m91988D() {
        EnumC6040e enumC6040e = this.f26825t;
        if (enumC6040e == EnumC6040e.PENDING_RELEASE) {
            m91967Y();
            return;
        }
        if (!this.f26802A) {
            m91965a0();
        }
        m91963c0(EnumC6040e.CONFIGURED);
        if (enumC6040e == EnumC6040e.PENDING_START || enumC6040e == EnumC6040e.PENDING_START_PAUSED) {
            start();
            if (enumC6040e == EnumC6040e.PENDING_START_PAUSED) {
                pause();
            }
        }
    }

    /* renamed from: F */
    public boolean m91986F(long j) {
        for (Range<Long> range : this.f26820o) {
            if (range.contains((Range<Long>) Long.valueOf(j))) {
                return true;
            }
            if (j < range.getLower().longValue()) {
                break;
            }
        }
        return false;
    }

    /* renamed from: W */
    public void m91969W() {
        while (!this.f26817l.isEmpty() && !this.f26816k.isEmpty()) {
            O80.C5832a<O22> poll = this.f26817l.poll();
            Objects.requireNonNull(poll);
            Integer poll2 = this.f26816k.poll();
            Objects.requireNonNull(poll2);
            try {
                final Q22 q22 = new Q22(this.f26810e, poll2.intValue());
                if (poll.m92861c(q22)) {
                    this.f26818m.add(q22);
                    q22.mo89093c().addListener(new Runnable() { // from class: Lb1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C34899Ob1.this.m91981K(q22);
                        }
                    }, this.f26813h);
                } else {
                    q22.m89090f();
                }
            } catch (MediaCodec.CodecException e) {
                m91989C(e);
                return;
            }
        }
    }

    /* renamed from: X */
    public void m91982J(final int i, final String str, final Throwable th) {
        final InterfaceC48732sb1 interfaceC48732sb1;
        Executor executor;
        synchronized (this.f26807b) {
            interfaceC48732sb1 = this.f26823r;
            executor = this.f26824s;
        }
        try {
            executor.execute(new Runnable() { // from class: Eb1
                @Override // java.lang.Runnable
                public final void run() {
                    C34899Ob1.m91979M(InterfaceC48732sb1.this, i, str, th);
                }
            });
        } catch (RejectedExecutionException e) {
            C33928Jx2.m99530d(this.f26806a, "Unable to post to the supplied executor.", e);
        }
    }

    /* renamed from: Y */
    public final void m91967Y() {
        if (this.f26802A) {
            this.f26810e.stop();
            this.f26802A = false;
        }
        this.f26810e.release();
        InterfaceC44582lb1.InterfaceC25733a interfaceC25733a = this.f26811f;
        if (interfaceC25733a instanceof C6043g) {
            ((C6043g) interfaceC25733a).m91892e();
        }
        m91963c0(EnumC6040e.RELEASED);
        this.f26815j.m92861c(null);
    }

    /* renamed from: Z */
    public void m91966Z() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.f26810e.setParameters(bundle);
    }

    @Override // p000.InterfaceC44582lb1
    /* renamed from: a */
    public InterfaceC42220hc1 mo27109a() {
        return this.f26812g;
    }

    /* renamed from: a0 */
    public final void m91965a0() {
        this.f26826u = f26801E;
        this.f26827v = 0L;
        this.f26820o.clear();
        this.f26816k.clear();
        for (O80.C5832a<O22> c5832a : this.f26817l) {
            c5832a.m92860d();
        }
        this.f26817l.clear();
        this.f26810e.reset();
        this.f26802A = false;
        this.f26803B = false;
        this.f26804C = false;
        this.f26828w = false;
        Future<?> future = this.f26830y;
        if (future != null) {
            future.cancel(true);
            this.f26830y = null;
        }
        C6041f c6041f = this.f26831z;
        if (c6041f != null) {
            c6041f.m91898v();
        }
        C6041f c6041f2 = new C6041f();
        this.f26831z = c6041f2;
        this.f26810e.setCallback(c6041f2);
        this.f26810e.configure(this.f26809d, (Surface) null, (MediaCrypto) null, 1);
        InterfaceC44582lb1.InterfaceC25733a interfaceC25733a = this.f26811f;
        if (interfaceC25733a instanceof C6043g) {
            ((C6043g) interfaceC25733a).m91891f();
        }
    }

    @Override // p000.InterfaceC44582lb1
    /* renamed from: b */
    public void mo27108b(InterfaceC48732sb1 interfaceC48732sb1, Executor executor) {
        synchronized (this.f26807b) {
            this.f26823r = interfaceC48732sb1;
            this.f26824s = executor;
        }
    }

    /* renamed from: b0 */
    public void m91964b0(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z ? 1 : 0);
        this.f26810e.setParameters(bundle);
    }

    @Override // p000.InterfaceC44582lb1
    /* renamed from: c */
    public InterfaceC44582lb1.InterfaceC25733a mo27107c() {
        return this.f26811f;
    }

    /* renamed from: c0 */
    public final void m91963c0(EnumC6040e enumC6040e) {
        if (this.f26825t == enumC6040e) {
            return;
        }
        String str = this.f26806a;
        C33928Jx2.m99533a(str, "Transitioning encoder internal state: " + this.f26825t + " --> " + enumC6040e);
        this.f26825t = enumC6040e;
    }

    @Override // p000.InterfaceC44582lb1
    /* renamed from: d */
    public ListenableFuture<Void> mo27106d() {
        return this.f26814i;
    }

    /* renamed from: d0 */
    public void m91962d0() {
        InterfaceC44582lb1.InterfaceC25733a interfaceC25733a = this.f26811f;
        if (interfaceC25733a instanceof C6039d) {
            ((C6039d) interfaceC25733a).m91921q(false);
            ArrayList arrayList = new ArrayList();
            for (O22 o22 : this.f26818m) {
                arrayList.add(o22.mo89093c());
            }
            IA1.m102830n(arrayList).addListener(new Runnable() { // from class: Bb1
                @Override // java.lang.Runnable
                public final void run() {
                    C34899Ob1.this.m91961e0();
                }
            }, this.f26813h);
        } else if (interfaceC25733a instanceof C6043g) {
            try {
                this.f26810e.signalEndOfInputStream();
                this.f26804C = true;
            } catch (MediaCodec.CodecException e) {
                m91989C(e);
            }
        }
    }

    @Override // p000.InterfaceC44582lb1
    /* renamed from: e */
    public void mo27105e() {
        this.f26813h.execute(new Runnable() { // from class: Gb1
            @Override // java.lang.Runnable
            public final void run() {
                C34899Ob1.this.m91976P();
            }
        });
    }

    /* renamed from: e0 */
    public final void m91961e0() {
        IA1.m102842b(m91941w(), new C6035a(), this.f26813h);
    }

    @Override // p000.InterfaceC44582lb1
    /* renamed from: f */
    public int mo27104f() {
        if (this.f26809d.containsKey("bitrate")) {
            return this.f26809d.getInteger("bitrate");
        }
        return 0;
    }

    /* renamed from: f0 */
    public void m91960f0() {
        this.f26813h.execute(new Runnable() { // from class: Hb1
            @Override // java.lang.Runnable
            public final void run() {
                C34899Ob1.this.m91975Q();
            }
        });
    }

    /* renamed from: g0 */
    public void m91958g0(final Runnable runnable) {
        final ArrayList arrayList = new ArrayList();
        for (C42803ib1 c42803ib1 : this.f26819n) {
            arrayList.add(c42803ib1.m33775b());
        }
        for (O22 o22 : this.f26818m) {
            arrayList.add(o22.mo89093c());
        }
        if (!arrayList.isEmpty()) {
            String str = this.f26806a;
            C33928Jx2.m99533a(str, "Waiting for resources to return. encoded data = " + this.f26819n.size() + ", input buffers = " + this.f26818m.size());
        }
        IA1.m102830n(arrayList).addListener(new Runnable() { // from class: Cb1
            @Override // java.lang.Runnable
            public final void run() {
                C34899Ob1.this.m91970V(arrayList, runnable);
            }
        }, this.f26813h);
    }

    /* renamed from: h0 */
    public void m91956h0(long j) {
        while (!this.f26820o.isEmpty()) {
            Range<Long> first = this.f26820o.getFirst();
            if (j > first.getUpper().longValue()) {
                this.f26820o.removeFirst();
                this.f26827v += first.getUpper().longValue() - first.getLower().longValue();
                C33928Jx2.m99533a(this.f26806a, "Total paused duration = " + C42154hV0.m36345j(this.f26827v));
            } else {
                return;
            }
        }
    }

    @Override // p000.InterfaceC44582lb1
    public void pause() {
        final long m91938z = m91938z();
        this.f26813h.execute(new Runnable() { // from class: Kb1
            @Override // java.lang.Runnable
            public final void run() {
                C34899Ob1.this.m91978N(m91938z);
            }
        });
    }

    @Override // p000.InterfaceC44582lb1
    public void release() {
        this.f26813h.execute(new Runnable() { // from class: Ib1
            @Override // java.lang.Runnable
            public final void run() {
                C34899Ob1.this.m91977O();
            }
        });
    }

    @Override // p000.InterfaceC44582lb1
    public void start() {
        final long m91938z = m91938z();
        this.f26813h.execute(new Runnable() { // from class: Nb1
            @Override // java.lang.Runnable
            public final void run() {
                C34899Ob1.this.m91974R(m91938z);
            }
        });
    }

    @Override // p000.InterfaceC44582lb1
    public void stop(final long j) {
        final long m91938z = m91938z();
        this.f26813h.execute(new Runnable() { // from class: Jb1
            @Override // java.lang.Runnable
            public final void run() {
                C34899Ob1.this.m91971U(j, m91938z);
            }
        });
    }

    /* renamed from: w */
    public ListenableFuture<O22> m91941w() {
        switch (C6037b.f26834a[this.f26825t.ordinal()]) {
            case 1:
                return IA1.m102838f(new IllegalStateException("Encoder is not started yet."));
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                final AtomicReference atomicReference = new AtomicReference();
                ListenableFuture<O22> m92864a = O80.m92864a(new O80.InterfaceC5834c() { // from class: yb1
                    @Override // p000.O80.InterfaceC5834c
                    /* renamed from: a */
                    public final Object mo3207a(O80.C5832a c5832a) {
                        Object obj;
                        obj = atomicReference.set(c5832a);
                        return obj;
                    }
                });
                final O80.C5832a<O22> c5832a = (O80.C5832a) HZ3.m103731g((O80.C5832a) atomicReference.get());
                this.f26817l.offer(c5832a);
                c5832a.m92863a(new Runnable() { // from class: Fb1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C34899Ob1.this.m91983I(c5832a);
                    }
                }, this.f26813h);
                m91969W();
                return m92864a;
            case 8:
                return IA1.m102838f(new IllegalStateException("Encoder is in error state."));
            case 9:
                return IA1.m102838f(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.f26825t);
        }
    }

    /* renamed from: x */
    public final void m91940x(InterfaceC42355hp6 interfaceC42355hp6, MediaFormat mediaFormat) {
        HZ3.m103729i(this.f26808c);
        if (mediaFormat.containsKey("bitrate")) {
            int integer = mediaFormat.getInteger("bitrate");
            int intValue = interfaceC42355hp6.mo29873b().clamp(Integer.valueOf(integer)).intValue();
            if (integer != intValue) {
                mediaFormat.setInteger("bitrate", intValue);
                String str = this.f26806a;
                C33928Jx2.m99533a(str, "updated bitrate from " + integer + " to " + intValue);
            }
        }
    }

    /* renamed from: z */
    public long m91938z() {
        return this.f26822q.mo24489b();
    }
}
