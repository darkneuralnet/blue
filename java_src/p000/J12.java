package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b'\u0010(J#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002R\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002R\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R&\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002R\u00020\u00000\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R+\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R+\u0010&\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001e¨\u0006)"}, m28432d2 = {"LJ12;", "", "LJ12$a;", "animation", "", "f", "(LJ12$a;)V", "j", "k", "(LEt0;I)V", "", "playTimeNanos", "i", "", C17296a.f69688o, "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "LLX2;", "b", "LLX2;", "_animations", "", "<set-?>", "c", "LEX2;", "g", "()Z", "l", "(Z)V", "refreshChildNeeded", DateTokenConverter.CONVERTER_KEY, "J", "startTimeNanos", "e", "h", "m", "isRunning", "<init>", "(Ljava/lang/String;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,364:1\n1182#2:365\n1161#2,2:366\n76#3:368\n102#3,2:369\n76#3:371\n102#3,2:372\n25#4:374\n1057#5,6:375\n460#6,11:381\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n*L\n150#1:365\n150#1:366,2\n151#1:368\n151#1:369,2\n153#1:371\n153#1:372,2\n173#1:374\n173#1:375,6\n217#1:381,11\n*E\n"})
/* renamed from: J12 */
/* loaded from: classes.dex */
public final class J12 {

    /* renamed from: f */
    public static final int f16588f = 8;

    /* renamed from: a */
    public final String f16589a;

    /* renamed from: b */
    public final LX2<C3834a<?, ?>> f16590b;

    /* renamed from: c */
    public final EX2 f16591c;

    /* renamed from: d */
    public long f16592d;

    /* renamed from: e */
    public final EX2 f16593e;

    @Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BC\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010%\u001a\u00020!¢\u0006\u0004\b@\u0010AJ-\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0011R\"\u0010\u0005\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R#\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010%\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$R+\u0010+\u001a\u00028\u00002\u0006\u0010&\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R0\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/RB\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001002\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001008\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010<\u001a\u0002078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u00108\u001a\u0004\b'\u00109\"\u0004\b:\u0010;R\u0016\u0010=\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u00108R\u0016\u0010?\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010>¨\u0006B"}, m28432d2 = {"LJ12$a;", "T", "Lvf;", "V", "LsP5;", "initialValue", "targetValue", "Llf;", "animationSpec", "", "l", "(Ljava/lang/Object;Ljava/lang/Object;Llf;)V", "", "playTimeNanos", "h", "(J)V", "k", "()V", "i", "b", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "setInitialValue$animation_core_release", "(Ljava/lang/Object;)V", "e", "setTargetValue$animation_core_release", "Lwb6;", DateTokenConverter.CONVERTER_KEY, "Lwb6;", "getTypeConverter", "()Lwb6;", "typeConverter", "", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "label", "<set-?>", "f", "LEX2;", "getValue", "j", "value", "g", "Llf;", "getAnimationSpec", "()Llf;", "LQY5;", "LQY5;", "getAnimation", "()LQY5;", "setAnimation$animation_core_release", "(LQY5;)V", "animation", "", "Z", "()Z", "setFinished$animation_core_release", "(Z)V", "isFinished", "startOnTheNextFrame", "J", "playTimeNanosOffset", "<init>", "(LJ12;Ljava/lang/Object;Ljava/lang/Object;Lwb6;Llf;Ljava/lang/String;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,364:1\n76#2:365\n102#2,2:366\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n*L\n76#1:365\n76#1:366,2\n*E\n"})
    /* renamed from: J12$a */
    /* loaded from: classes.dex */
    public final class C3834a<T, V extends AbstractC29607vf> implements InterfaceC48627sP5<T> {

        /* renamed from: b */
        public T f16594b;

        /* renamed from: c */
        public T f16595c;

        /* renamed from: d */
        public final InterfaceC51108wb6<T, V> f16596d;

        /* renamed from: e */
        public final String f16597e;

        /* renamed from: f */
        public final EX2 f16598f;

        /* renamed from: g */
        public InterfaceC25753lf<T> f16599g;

        /* renamed from: h */
        public QY5<T, V> f16600h;

        /* renamed from: i */
        public boolean f16601i;

        /* renamed from: j */
        public boolean f16602j;

        /* renamed from: k */
        public long f16603k;

        /* renamed from: l */
        public final /* synthetic */ J12 f16604l;

        public C3834a(J12 j12, T t, T t2, InterfaceC51108wb6<T, V> typeConverter, InterfaceC25753lf<T> animationSpec, String label) {
            EX2 m97025e;
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(label, "label");
            this.f16604l = j12;
            this.f16594b = t;
            this.f16595c = t2;
            this.f16596d = typeConverter;
            this.f16597e = label;
            m97025e = LM5.m97025e(t, null, 2, null);
            this.f16598f = m97025e;
            this.f16599g = animationSpec;
            this.f16600h = new QY5<>(this.f16599g, typeConverter, this.f16594b, this.f16595c, null, 16, null);
        }

        /* renamed from: c */
        public final T m101374c() {
            return this.f16594b;
        }

        /* renamed from: e */
        public final T m101373e() {
            return this.f16595c;
        }

        /* renamed from: f */
        public final boolean m101372f() {
            return this.f16601i;
        }

        @Override // p000.InterfaceC48627sP5
        public T getValue() {
            return this.f16598f.getValue();
        }

        /* renamed from: h */
        public final void m101371h(long j) {
            this.f16604l.m101376l(false);
            if (this.f16602j) {
                this.f16602j = false;
                this.f16603k = j;
            }
            long j2 = j - this.f16603k;
            m101369j(this.f16600h.mo33857e(j2));
            this.f16601i = this.f16600h.m42661b(j2);
        }

        /* renamed from: i */
        public final void m101370i() {
            this.f16602j = true;
        }

        /* renamed from: j */
        public void m101369j(T t) {
            this.f16598f.setValue(t);
        }

        /* renamed from: k */
        public final void m101368k() {
            m101369j(this.f16600h.mo33856f());
            this.f16602j = true;
        }

        /* renamed from: l */
        public final void m101367l(T t, T t2, InterfaceC25753lf<T> animationSpec) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            this.f16594b = t;
            this.f16595c = t2;
            this.f16599g = animationSpec;
            this.f16600h = new QY5<>(animationSpec, this.f16596d, t, t2, null, 16, null);
            this.f16604l.m101376l(true);
            this.f16601i = false;
            this.f16602j = true;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.animation.core.InfiniteTransition$run$1", m28418f = "InfiniteTransition.kt", m28417i = {0, 0, 1, 1}, m28416l = {181, 205}, m28415m = "invokeSuspend", m28414n = {"$this$LaunchedEffect", "durationScale", "$this$LaunchedEffect", "durationScale"}, m28413s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: J12$b */
    /* loaded from: classes.dex */
    public static final class C3835b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f16605h;

        /* renamed from: i */
        public int f16606i;

        /* renamed from: j */
        public /* synthetic */ Object f16607j;

        /* renamed from: k */
        public final /* synthetic */ EX2<InterfaceC48627sP5<Long>> f16608k;

        /* renamed from: l */
        public final /* synthetic */ J12 f16609l;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$run$1$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,364:1\n460#2,11:365\n460#2,11:376\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$run$1$1\n*L\n187#1:365,11\n194#1:376,11\n*E\n"})
        /* renamed from: J12$b$a */
        /* loaded from: classes.dex */
        public static final class C3836a extends Lambda implements Function1<Long, Unit> {

            /* renamed from: g */
            public final /* synthetic */ EX2<InterfaceC48627sP5<Long>> f16610g;

            /* renamed from: h */
            public final /* synthetic */ J12 f16611h;

            /* renamed from: i */
            public final /* synthetic */ Ref.FloatRef f16612i;

            /* renamed from: j */
            public final /* synthetic */ ZC0 f16613j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3836a(EX2<InterfaceC48627sP5<Long>> ex2, J12 j12, Ref.FloatRef floatRef, ZC0 zc0) {
                super(1);
                this.f16610g = ex2;
                this.f16611h = j12;
                this.f16612i = floatRef;
                this.f16613j = zc0;
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
                if (r2 == false) goto L27;
             */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m101366a(long j) {
                long j2;
                boolean z;
                boolean z2;
                InterfaceC48627sP5<Long> value = this.f16610g.getValue();
                if (value != null) {
                    j2 = value.getValue().longValue();
                } else {
                    j2 = j;
                }
                int i = 0;
                if (this.f16611h.f16592d != Long.MIN_VALUE) {
                    if (this.f16612i.element == C49876uW5.m10128n(this.f16613j.mo18342K())) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                this.f16611h.f16592d = j;
                LX2 lx2 = this.f16611h.f16590b;
                int m96690u = lx2.m96690u();
                if (m96690u > 0) {
                    Object[] m96691s = lx2.m96691s();
                    int i2 = 0;
                    do {
                        ((C3834a) m96691s[i2]).m101370i();
                        i2++;
                    } while (i2 < m96690u);
                    this.f16612i.element = C49876uW5.m10128n(this.f16613j.mo18342K());
                    if (this.f16612i.element != 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        LX2 lx22 = this.f16611h.f16590b;
                        int m96690u2 = lx22.m96690u();
                        if (m96690u2 > 0) {
                            Object[] m96691s2 = lx22.m96691s();
                            do {
                                ((C3834a) m96691s2[i]).m101368k();
                                i++;
                            } while (i < m96690u2);
                            return;
                        }
                        return;
                    }
                    this.f16611h.m101379i(((float) (j2 - this.f16611h.f16592d)) / this.f16612i.element);
                    return;
                }
                this.f16612i.element = C49876uW5.m10128n(this.f16613j.mo18342K());
                if (this.f16612i.element != 0.0f) {
                }
                if (!z) {
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                m101366a(l.longValue());
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: J12$b$b */
        /* loaded from: classes.dex */
        public static final class C3837b extends Lambda implements Function0<Float> {

            /* renamed from: g */
            public final /* synthetic */ ZC0 f16614g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3837b(ZC0 zc0) {
                super(0);
                this.f16614g = zc0;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b */
            public final Float invoke() {
                return Float.valueOf(C49876uW5.m10128n(this.f16614g.mo18342K()));
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.animation.core.InfiniteTransition$run$1$3", m28418f = "InfiniteTransition.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: J12$b$c */
        /* loaded from: classes.dex */
        public static final class C3838c extends SuspendLambda implements Function2<Float, Continuation<? super Boolean>, Object> {

            /* renamed from: h */
            public int f16615h;

            /* renamed from: i */
            public /* synthetic */ float f16616i;

            public C3838c(Continuation<? super C3838c> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C3838c c3838c = new C3838c(continuation);
                c3838c.f16616i = ((Number) obj).floatValue();
                return c3838c;
            }

            /* renamed from: e */
            public final Object m101364e(float f, Continuation<? super Boolean> continuation) {
                return ((C3838c) create(Float.valueOf(f), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Float f, Continuation<? super Boolean> continuation) {
                return m101364e(f.floatValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f16615h == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.f16616i > 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boxing.boxBoolean(z);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3835b(EX2<InterfaceC48627sP5<Long>> ex2, J12 j12, Continuation<? super C3835b> continuation) {
            super(2, continuation);
            this.f16608k = ex2;
            this.f16609l = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C3835b c3835b = new C3835b(this.f16608k, this.f16609l, continuation);
            c3835b.f16607j = obj;
            return c3835b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C3835b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0062 -> B:12:0x0042). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007d -> B:12:0x0042). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f16606i
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r8.f16605h
                kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
                java.lang.Object r4 = r8.f16607j
                ZC0 r4 = (p000.ZC0) r4
                kotlin.ResultKt.throwOnFailure(r9)
                r9 = r4
                goto L41
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                java.lang.Object r1 = r8.f16605h
                kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
                java.lang.Object r4 = r8.f16607j
                ZC0 r4 = (p000.ZC0) r4
                kotlin.ResultKt.throwOnFailure(r9)
                r9 = r4
                r4 = r8
                goto L58
            L31:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.Object r9 = r8.f16607j
                ZC0 r9 = (p000.ZC0) r9
                kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.element = r4
            L41:
                r4 = r8
            L42:
                J12$b$a r5 = new J12$b$a
                EX2<sP5<java.lang.Long>> r6 = r4.f16608k
                J12 r7 = r4.f16609l
                r5.<init>(r6, r7, r1, r9)
                r4.f16607j = r9
                r4.f16605h = r1
                r4.f16606i = r3
                java.lang.Object r5 = p000.H12.m104498a(r5, r4)
                if (r5 != r0) goto L58
                return r0
            L58:
                float r5 = r1.element
                r6 = 0
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 != 0) goto L61
                r5 = r3
                goto L62
            L61:
                r5 = 0
            L62:
                if (r5 == 0) goto L42
                J12$b$b r5 = new J12$b$b
                r5.<init>(r9)
                Eu1 r5 = p000.GM5.m105192o(r5)
                J12$b$c r6 = new J12$b$c
                r7 = 0
                r6.<init>(r7)
                r4.f16607j = r9
                r4.f16605h = r1
                r4.f16606i = r2
                java.lang.Object r5 = p000.C36708Vu1.m79247x(r5, r6, r4)
                if (r5 != r0) goto L42
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.J12.C3835b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: J12$c */
    /* loaded from: classes.dex */
    public static final class C3839c extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: h */
        public final /* synthetic */ int f16618h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3839c(int i) {
            super(2);
            this.f16618h = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            J12.this.m101377k(interfaceC32720Et0, this.f16618h | 1);
        }
    }

    public J12(String label) {
        EX2 m97025e;
        EX2 m97025e2;
        Intrinsics.checkNotNullParameter(label, "label");
        this.f16589a = label;
        this.f16590b = new LX2<>(new C3834a[16], 0);
        m97025e = LM5.m97025e(Boolean.FALSE, null, 2, null);
        this.f16591c = m97025e;
        this.f16592d = Long.MIN_VALUE;
        m97025e2 = LM5.m97025e(Boolean.TRUE, null, 2, null);
        this.f16593e = m97025e2;
    }

    /* renamed from: f */
    public final void m101382f(C3834a<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f16590b.m96701b(animation);
        m101376l(true);
    }

    /* renamed from: g */
    public final boolean m101381g() {
        return ((Boolean) this.f16591c.getValue()).booleanValue();
    }

    /* renamed from: h */
    public final boolean m101380h() {
        return ((Boolean) this.f16593e.getValue()).booleanValue();
    }

    /* renamed from: i */
    public final void m101379i(long j) {
        boolean z;
        LX2<C3834a<?, ?>> lx2 = this.f16590b;
        int m96690u = lx2.m96690u();
        if (m96690u > 0) {
            C3834a<?, ?>[] m96691s = lx2.m96691s();
            z = true;
            int i = 0;
            do {
                C3834a<?, ?> c3834a = m96691s[i];
                if (!c3834a.m101372f()) {
                    c3834a.m101371h(j);
                }
                if (!c3834a.m101372f()) {
                    z = false;
                }
                i++;
            } while (i < m96690u);
        } else {
            z = true;
        }
        m101375m(!z);
    }

    /* renamed from: j */
    public final void m101378j(C3834a<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f16590b.m96709A(animation);
    }

    /* renamed from: k */
    public final void m101377k(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-318043801);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-318043801, i, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
        }
        mo89518u.mo89638F(-492369756);
        Object mo89635G = mo89518u.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = LM5.m97025e(null, null, 2, null);
            mo89518u.mo89503z(mo89635G);
        }
        mo89518u.mo89605Q();
        EX2 ex2 = (EX2) mo89635G;
        if (m101380h() || m101381g()) {
            Y91.m75533f(this, new C3835b(ex2, this, null), mo89518u, 72);
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C3839c(i));
        }
    }

    /* renamed from: l */
    public final void m101376l(boolean z) {
        this.f16591c.setValue(Boolean.valueOf(z));
    }

    /* renamed from: m */
    public final void m101375m(boolean z) {
        this.f16593e.setValue(Boolean.valueOf(z));
    }
}
