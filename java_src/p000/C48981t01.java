package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC48600sM5;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0019B%\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0017¢\u0006\u0004\b*\u0010+J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J:\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u000bH\u0002R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010#R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, m28432d2 = {"Lt01;", "T", "LFP5;", "Lu01;", "LsM5;", "snapshot", "LHP5;", "f", "value", "", "c", "", "toString", "Lt01$a;", "readable", "", "forceDependencyReads", "Lkotlin/Function0;", "calculation", "i", "j", "b", "Lkotlin/jvm/functions/Function0;", "LEM5;", "LEM5;", C17296a.f69688o, "()LEM5;", "policy", DateTokenConverter.CONVERTER_KEY, "Lt01$a;", "first", "h", "()LHP5;", "firstStateRecord", "getValue", "()Ljava/lang/Object;", "currentValue", "", "", "g", "()[Ljava/lang/Object;", "dependencies", "<init>", "(Lkotlin/jvm/functions/Function0;LEM5;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n+ 2 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 7 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 8 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,346:1\n311#2:347\n312#2:349\n313#2,2:361\n316#2,2:368\n311#2:370\n312#2:372\n313#2,5:384\n1162#3:348\n1162#3:371\n460#4,11:350\n460#4,11:373\n146#5,5:363\n1686#6:389\n2180#6:391\n2180#6:392\n2180#6:393\n2180#6:395\n2180#6:396\n2180#6:397\n70#7:390\n26#8:394\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState\n*L\n143#1:347\n143#1:349\n143#1:361,2\n143#1:368,2\n158#1:370\n158#1:372\n158#1:384,5\n143#1:348\n158#1:371\n143#1:350,11\n158#1:373,11\n146#1:363,5\n180#1:389\n222#1:391\n229#1:392\n235#1:393\n241#1:395\n252#1:396\n260#1:397\n180#1:390\n238#1:394\n*E\n"})
/* renamed from: t01  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48981t01<T> implements FP5, InterfaceC49574u01<T> {

    /* renamed from: b */
    public final Function0<T> f109650b;

    /* renamed from: c */
    public final EM5<T> f109651c;

    /* renamed from: d */
    public C28495a<T> f109652d;

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0007\u0018\u0000 )*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\u000e\u001a\u00020\r2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\tR0\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006*"}, m28432d2 = {"Lt01$a;", "T", "LHP5;", "value", "", C17296a.f69688o, "b", "Lu01;", "derivedState", "LsM5;", "snapshot", "", "j", "", "k", "LkW1;", "LFP5;", "c", "LkW1;", "h", "()LkW1;", "l", "(LkW1;)V", "dependencies", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "m", "(Ljava/lang/Object;)V", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "e", "I", "getResultHash", "()I", "n", "(I)V", "resultHash", "<init>", "()V", "f", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 7 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n1#1,346:1\n1686#2:347\n70#3:348\n311#4:349\n312#4:351\n313#4,2:363\n316#4,2:370\n1162#5:350\n460#6,11:352\n146#7,5:365\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n*L\n95#1:347\n95#1:348\n97#1:349\n97#1:351\n97#1:363,2\n97#1:370,2\n97#1:350\n97#1:352,11\n98#1:365,5\n*E\n"})
    /* renamed from: t01$a */
    /* loaded from: classes.dex */
    public static final class C28495a<T> extends HP5 {

        /* renamed from: f */
        public static final C28496a f109653f = new C28496a(null);

        /* renamed from: g */
        public static final int f109654g = 8;

        /* renamed from: h */
        public static final Object f109655h = new Object();

        /* renamed from: c */
        public C43943kW1<FP5, Integer> f109656c;

        /* renamed from: d */
        public Object f109657d = f109655h;

        /* renamed from: e */
        public int f109658e;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"Lt01$a$a;", "", "Unset", "Ljava/lang/Object;", C17296a.f69688o, "()Ljava/lang/Object;", "<init>", "()V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: t01$a$a */
        /* loaded from: classes.dex */
        public static final class C28496a {
            public /* synthetic */ C28496a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Object m13258a() {
                return C28495a.f109655h;
            }

            private C28496a() {
            }
        }

        @Override // p000.HP5
        /* renamed from: a */
        public void mo13268a(HP5 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            C28495a c28495a = (C28495a) value;
            this.f109656c = c28495a.f109656c;
            this.f109657d = c28495a.f109657d;
            this.f109658e = c28495a.f109658e;
        }

        @Override // p000.HP5
        /* renamed from: b */
        public HP5 mo13267b() {
            return new C28495a();
        }

        /* renamed from: h */
        public final C43943kW1<FP5, Integer> m13265h() {
            return this.f109656c;
        }

        /* renamed from: i */
        public final Object m13264i() {
            return this.f109657d;
        }

        /* renamed from: j */
        public final boolean m13263j(InterfaceC49574u01<?> derivedState, AbstractC48600sM5 snapshot) {
            Intrinsics.checkNotNullParameter(derivedState, "derivedState");
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            if (this.f109657d != f109655h && this.f109658e == m13262k(derivedState, snapshot)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:16:0x0045, B:18:0x004c, B:26:0x0089, B:21:0x0068, B:23:0x006c, B:25:0x007b, B:24:0x0073, B:27:0x008c), top: B:48:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int m13262k(InterfaceC49574u01<?> derivedState, AbstractC48600sM5 snapshot) {
            C43943kW1<FP5, Integer> c43943kW1;
            RM5 rm5;
            int m28895g;
            int i;
            int m96690u;
            HP5 m5414C;
            Intrinsics.checkNotNullParameter(derivedState, "derivedState");
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            synchronized (C51564xM5.m5412E()) {
                c43943kW1 = this.f109656c;
            }
            int i2 = 7;
            if (c43943kW1 != null) {
                rm5 = HM5.f13315b;
                LX2 lx2 = (LX2) rm5.m86809a();
                int i3 = 0;
                if (lx2 == null) {
                    lx2 = new LX2(new Pair[0], 0);
                }
                int m96690u2 = lx2.m96690u();
                if (m96690u2 > 0) {
                    Object[] m96691s = lx2.m96691s();
                    int i4 = 0;
                    do {
                        ((Function1) ((Pair) m96691s[i4]).component1()).invoke(derivedState);
                        i4++;
                    } while (i4 < m96690u2);
                    try {
                        m28895g = c43943kW1.m28895g();
                        for (i = 0; i < m28895g; i++) {
                            Object obj = c43943kW1.m28896f()[i];
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                            FP5 fp5 = (FP5) obj;
                            if (((Number) c43943kW1.m28894h()[i]).intValue() == 1) {
                                if (fp5 instanceof C48981t01) {
                                    m5414C = ((C48981t01) fp5).m13272f(snapshot);
                                } else {
                                    m5414C = C51564xM5.m5414C(fp5.mo13271h(), snapshot);
                                }
                                i2 = (((i2 * 31) + C0521B6.m114362a(m5414C)) * 31) + m5414C.m103907d();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        m96690u = lx2.m96690u();
                        if (m96690u > 0) {
                            Object[] m96691s2 = lx2.m96691s();
                            do {
                                ((Function1) ((Pair) m96691s2[i3]).component2()).invoke(derivedState);
                                i3++;
                            } while (i3 < m96690u);
                        }
                    } catch (Throwable th) {
                        int m96690u3 = lx2.m96690u();
                        if (m96690u3 > 0) {
                            Object[] m96691s3 = lx2.m96691s();
                            do {
                                ((Function1) ((Pair) m96691s3[i3]).component2()).invoke(derivedState);
                                i3++;
                            } while (i3 < m96690u3);
                            throw th;
                        }
                        throw th;
                    }
                } else {
                    m28895g = c43943kW1.m28895g();
                    while (i < m28895g) {
                    }
                    Unit unit2 = Unit.INSTANCE;
                    m96690u = lx2.m96690u();
                    if (m96690u > 0) {
                    }
                }
            }
            return i2;
        }

        /* renamed from: l */
        public final void m13261l(C43943kW1<FP5, Integer> c43943kW1) {
            this.f109656c = c43943kW1;
        }

        /* renamed from: m */
        public final void m13260m(Object obj) {
            this.f109657d = obj;
        }

        /* renamed from: n */
        public final void m13259n(int i) {
            this.f109658e = i;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: t01$b */
    /* loaded from: classes.dex */
    public static final class C28497b extends Lambda implements Function1<Object, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C48981t01<T> f109659g;

        /* renamed from: h */
        public final /* synthetic */ C43943kW1<FP5, Integer> f109660h;

        /* renamed from: i */
        public final /* synthetic */ int f109661i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28497b(C48981t01<T> c48981t01, C43943kW1<FP5, Integer> c43943kW1, int i) {
            super(1);
            this.f109659g = c48981t01;
            this.f109660h = c43943kW1;
            this.f109661i = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object it) {
            RM5 rm5;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it != this.f109659g) {
                if (it instanceof FP5) {
                    rm5 = HM5.f13314a;
                    Object m86809a = rm5.m86809a();
                    Intrinsics.checkNotNull(m86809a);
                    int intValue = ((Number) m86809a).intValue();
                    C43943kW1<FP5, Integer> c43943kW1 = this.f109660h;
                    int i = intValue - this.f109661i;
                    Integer m28897e = c43943kW1.m28897e(it);
                    c43943kW1.m28891k(it, Integer.valueOf(Math.min(i, m28897e != null ? m28897e.intValue() : Integer.MAX_VALUE)));
                    return;
                }
                return;
            }
            throw new IllegalStateException("A derived state calculation cannot read itself".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C48981t01(Function0<? extends T> calculation, EM5<T> em5) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        this.f109650b = calculation;
        this.f109651c = em5;
        this.f109652d = new C28495a<>();
    }

    @Override // p000.InterfaceC49574u01
    /* renamed from: a */
    public EM5<T> mo11110a() {
        return this.f109651c;
    }

    @Override // p000.FP5
    /* renamed from: c */
    public void mo13273c(HP5 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f109652d = (C28495a) value;
    }

    @Override // p000.InterfaceC49574u01
    /* renamed from: d */
    public T mo11109d() {
        return (T) m13270i((C28495a) C51564xM5.m5415B(this.f109652d), AbstractC48600sM5.f108670e.m14280b(), false, this.f109650b).m13264i();
    }

    /* renamed from: f */
    public final HP5 m13272f(AbstractC48600sM5 snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        return m13270i((C28495a) C51564xM5.m5414C(this.f109652d, snapshot), snapshot, false, this.f109650b);
    }

    @Override // p000.InterfaceC49574u01
    /* renamed from: g */
    public Object[] mo11108g() {
        Object[] m28896f;
        C43943kW1<FP5, Integer> m13265h = m13270i((C28495a) C51564xM5.m5415B(this.f109652d), AbstractC48600sM5.f108670e.m14280b(), false, this.f109650b).m13265h();
        if (m13265h == null || (m28896f = m13265h.m28896f()) == null) {
            return new Object[0];
        }
        return m28896f;
    }

    @Override // p000.InterfaceC48627sP5
    public T getValue() {
        AbstractC48600sM5.C28290a c28290a = AbstractC48600sM5.f108670e;
        Function1<Object, Unit> mo14298h = c28290a.m14280b().mo14298h();
        if (mo14298h != null) {
            mo14298h.invoke(this);
        }
        return (T) m13270i((C28495a) C51564xM5.m5415B(this.f109652d), c28290a.m14280b(), true, this.f109650b).m13264i();
    }

    @Override // p000.FP5
    /* renamed from: h */
    public HP5 mo13271h() {
        return this.f109652d;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:13:0x0038, B:15:0x0048, B:18:0x0050, B:20:0x0057, B:22:0x0082, B:23:0x0085, B:24:0x0088), top: B:86:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:13:0x0038, B:15:0x0048, B:18:0x0050, B:20:0x0057, B:22:0x0082, B:23:0x0085, B:24:0x0088), top: B:86:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C28495a<T> m13270i(C28495a<T> c28495a, AbstractC48600sM5 abstractC48600sM5, boolean z, Function0<? extends T> function0) {
        RM5 rm5;
        int i;
        RM5 rm52;
        RM5 rm53;
        RM5 rm54;
        int m96690u;
        AbstractC48600sM5.C28290a c28290a;
        RM5 rm55;
        int m96690u2;
        C43943kW1<FP5, Integer> m13265h;
        RM5 rm56;
        Integer num;
        int i2;
        RM5 rm57;
        int m96690u3;
        RM5 rm58;
        int i3 = 1;
        int i4 = 0;
        if (c28495a.m13263j(this, abstractC48600sM5)) {
            if (z) {
                rm55 = HM5.f13315b;
                LX2 lx2 = (LX2) rm55.m86809a();
                if (lx2 == null) {
                    lx2 = new LX2(new Pair[0], 0);
                }
                int m96690u4 = lx2.m96690u();
                if (m96690u4 > 0) {
                    Object[] m96691s = lx2.m96691s();
                    int i5 = 0;
                    do {
                        ((Function1) ((Pair) m96691s[i5]).component1()).invoke(this);
                        i5++;
                    } while (i5 < m96690u4);
                    try {
                        m13265h = c28495a.m13265h();
                        rm56 = HM5.f13314a;
                        num = (Integer) rm56.m86809a();
                        if (num == null) {
                            i2 = num.intValue();
                        } else {
                            i2 = 0;
                        }
                        if (m13265h != null) {
                            int m28895g = m13265h.m28895g();
                            for (int i6 = 0; i6 < m28895g; i6++) {
                                Object obj = m13265h.m28896f()[i6];
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                                int intValue = ((Number) m13265h.m28894h()[i6]).intValue();
                                FP5 fp5 = (FP5) obj;
                                rm58 = HM5.f13314a;
                                rm58.m86808b(Integer.valueOf(intValue + i2));
                                Function1<Object, Unit> mo14298h = abstractC48600sM5.mo14298h();
                                if (mo14298h != null) {
                                    mo14298h.invoke(fp5);
                                }
                            }
                        }
                        rm57 = HM5.f13314a;
                        rm57.m86808b(Integer.valueOf(i2));
                        Unit unit = Unit.INSTANCE;
                        m96690u3 = lx2.m96690u();
                        if (m96690u3 > 0) {
                            Object[] m96691s2 = lx2.m96691s();
                            do {
                                ((Function1) ((Pair) m96691s2[i4]).component2()).invoke(this);
                                i4++;
                            } while (i4 < m96690u3);
                        }
                    } catch (Throwable th) {
                        if (m96690u2 > 0) {
                            throw th;
                        }
                        throw th;
                    }
                } else {
                    m13265h = c28495a.m13265h();
                    rm56 = HM5.f13314a;
                    num = (Integer) rm56.m86809a();
                    if (num == null) {
                    }
                    if (m13265h != null) {
                    }
                    rm57 = HM5.f13314a;
                    rm57.m86808b(Integer.valueOf(i2));
                    Unit unit2 = Unit.INSTANCE;
                    m96690u3 = lx2.m96690u();
                    if (m96690u3 > 0) {
                    }
                }
            }
            return c28495a;
        }
        rm5 = HM5.f13314a;
        Integer num2 = (Integer) rm5.m86809a();
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        C43943kW1<FP5, Integer> c43943kW1 = new C43943kW1<>(0, 1, null);
        rm52 = HM5.f13315b;
        LX2 lx22 = (LX2) rm52.m86809a();
        if (lx22 == null) {
            lx22 = new LX2(new Pair[0], 0);
        }
        int m96690u5 = lx22.m96690u();
        if (m96690u5 > 0) {
            Object[] m96691s3 = lx22.m96691s();
            int i7 = 0;
            do {
                ((Function1) ((Pair) m96691s3[i7]).component1()).invoke(this);
                i7++;
            } while (i7 < m96690u5);
            try {
                rm53 = HM5.f13314a;
                rm53.m86808b(Integer.valueOf(i + 1));
                T t = (T) AbstractC48600sM5.f108670e.m14278d(new C28497b(this, c43943kW1, i), null, function0);
                rm54 = HM5.f13314a;
                rm54.m86808b(Integer.valueOf(i));
                m96690u = lx22.m96690u();
                if (m96690u <= 0) {
                    Object[] m96691s4 = lx22.m96691s();
                    int i8 = 0;
                    do {
                        ((Function1) ((Pair) m96691s4[i8]).component2()).invoke(this);
                        i8++;
                    } while (i8 < m96690u);
                    synchronized (C51564xM5.m5412E()) {
                        c28290a = AbstractC48600sM5.f108670e;
                        AbstractC48600sM5 m14280b = c28290a.m14280b();
                        if (c28495a.m13264i() != C28495a.f109653f.m13258a()) {
                            EM5<T> mo11110a = mo11110a();
                            if (mo11110a == null || !mo11110a.mo26703a(t, (T) c28495a.m13264i())) {
                                i3 = 0;
                            }
                            if (i3 != 0) {
                                c28495a.m13261l(c43943kW1);
                                c28495a.m13259n(c28495a.m13262k(this, m14280b));
                            }
                        }
                        c28495a = (C28495a) C51564xM5.m5406K(this.f109652d, this, m14280b);
                        c28495a.m13261l(c43943kW1);
                        c28495a.m13259n(c28495a.m13262k(this, m14280b));
                        c28495a.m13260m(t);
                    }
                    if (i == 0) {
                        c28290a.m14279c();
                    }
                    return c28495a;
                }
                synchronized (C51564xM5.m5412E()) {
                }
            } finally {
                int m96690u6 = lx22.m96690u();
                if (m96690u6 > 0) {
                    Object[] m96691s5 = lx22.m96691s();
                    do {
                        ((Function1) ((Pair) m96691s5[i4]).component2()).invoke(this);
                        i4++;
                    } while (i4 < m96690u6);
                }
            }
        } else {
            rm53 = HM5.f13314a;
            rm53.m86808b(Integer.valueOf(i + 1));
            T t2 = (T) AbstractC48600sM5.f108670e.m14278d(new C28497b(this, c43943kW1, i), null, function0);
            rm54 = HM5.f13314a;
            rm54.m86808b(Integer.valueOf(i));
            m96690u = lx22.m96690u();
            if (m96690u <= 0) {
            }
        }
    }

    /* renamed from: j */
    public final String m13269j() {
        C28495a c28495a = (C28495a) C51564xM5.m5415B(this.f109652d);
        if (c28495a.m13263j(this, AbstractC48600sM5.f108670e.m14280b())) {
            return String.valueOf(c28495a.m13264i());
        }
        return "<Not calculated>";
    }

    public String toString() {
        C28495a c28495a = (C28495a) C51564xM5.m5415B(this.f109652d);
        return "DerivedState(value=" + m13269j() + ")@" + hashCode();
    }
}
