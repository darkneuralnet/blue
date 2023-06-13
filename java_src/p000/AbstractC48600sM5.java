package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 +2\u00020\u0001:\u0001\u001cB\u0019\b\u0004\u0012\u0006\u0010(\u001a\u00020\u0018\u0012\u0006\u0010\"\u001a\u00020\u001b¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0006\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0011J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0011J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0000H ¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0000H ¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH ¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H ¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010(\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00188\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010'R\"\u0010/\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u00100\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u00102\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010,R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048 X \u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\"\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048 X \u0004¢\u0006\u0006\u001a\u0004\b5\u00104\u0082\u0001\u00049:;<¨\u0006="}, m28432d2 = {"LsM5;", "", "", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Function1;", "readObserver", "v", "k", "snapshot", "r", "l", "(LsM5;)V", "m", "LFP5;", TransferTable.COLUMN_STATE, "o", "(LFP5;)V", "n", "()V", "b", "c", "q", "x", "p", "", "w", "()I", "LvM5;", C17296a.f69688o, "LvM5;", "g", "()LvM5;", "u", "(LvM5;)V", "invalid", "<set-?>", "I", "f", "t", "(I)V", "id", "", "Z", "e", "()Z", "s", "(Z)V", "disposed", "pinningTrackingHandle", "i", "readOnly", "h", "()Lkotlin/jvm/functions/Function1;", "j", "writeObserver", "<init>", "(ILvM5;)V", "LCX2;", "LA43;", "LYr4;", "LQ96;", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2191:1\n1686#2:2192\n1686#2:2194\n70#3:2193\n70#3:2195\n1#4:2196\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n84#1:2192\n233#1:2194\n84#1:2193\n233#1:2195\n*E\n"})
/* renamed from: sM5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC48600sM5 {

    /* renamed from: e */
    public static final C28290a f108670e = new C28290a(null);

    /* renamed from: f */
    public static final int f108671f = 8;

    /* renamed from: a */
    public C50378vM5 f108672a;

    /* renamed from: b */
    public int f108673b;

    /* renamed from: c */
    public boolean f108674c;

    /* renamed from: d */
    public int f108675d;

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J6\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002JQ\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0005H\u0001J&\u0010\u0014\u001a\u00020\u00132\u001e\u0010\u0012\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0011\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0010J\u001a\u0010\u0015\u001a\u00020\u00132\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0016\u001a\u00020\u0003J\u0006\u0010\u0017\u001a\u00020\u0003R\u0011\u0010\u001a\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"LsM5$a;", "", "Lkotlin/Function1;", "", "readObserver", "LsM5;", "i", "writeObserver", "LCX2;", "h", "T", "Lkotlin/Function0;", "block", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", C17296a.f69688o, "Lkotlin/Function2;", "", "observer", "Lge3;", "e", "f", "c", "g", "b", "()LsM5;", "current", "<init>", "()V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1#2:2192\n122#3,5:2193\n122#3,5:2198\n122#3,5:2203\n1686#4:2208\n1686#4:2210\n1686#4:2212\n70#5:2209\n70#5:2211\n70#5:2213\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n424#1:2193,5\n461#1:2198,5\n483#1:2203,5\n499#1:2208\n526#1:2210\n564#1:2212\n499#1:2209\n526#1:2211\n564#1:2213\n*E\n"})
    /* renamed from: sM5$a */
    /* loaded from: classes.dex */
    public static final class C28290a {

        @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, m28432d2 = {"", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion$registerApplyObserver$2\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n70#3:2193\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion$registerApplyObserver$2\n*L\n503#1:2192\n503#1:2193\n*E\n"})
        /* renamed from: sM5$a$a */
        /* loaded from: classes.dex */
        public static final class C28291a implements InterfaceC41649ge3 {

            /* renamed from: a */
            public final /* synthetic */ Function2<Set<? extends Object>, AbstractC48600sM5, Unit> f108676a;

            /* JADX WARN: Multi-variable type inference failed */
            public C28291a(Function2<? super Set<? extends Object>, ? super AbstractC48600sM5, Unit> function2) {
                this.f108676a = function2;
            }

            @Override // p000.InterfaceC41649ge3
            public final void dispose() {
                Function2<Set<? extends Object>, AbstractC48600sM5, Unit> function2 = this.f108676a;
                synchronized (C51564xM5.m5412E()) {
                    C51564xM5.m5384d().remove(function2);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, m28432d2 = {"", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion$registerGlobalWriteObserver$2\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n70#3:2193\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion$registerGlobalWriteObserver$2\n*L\n531#1:2192\n531#1:2193\n*E\n"})
        /* renamed from: sM5$a$b */
        /* loaded from: classes.dex */
        public static final class C28292b implements InterfaceC41649ge3 {

            /* renamed from: a */
            public final /* synthetic */ Function1<Object, Unit> f108677a;

            public C28292b(Function1<Object, Unit> function1) {
                this.f108677a = function1;
            }

            @Override // p000.InterfaceC41649ge3
            public final void dispose() {
                Function1<Object, Unit> function1 = this.f108677a;
                synchronized (C51564xM5.m5412E()) {
                    C51564xM5.m5381g().remove(function1);
                }
                C51564xM5.m5388b();
            }
        }

        public /* synthetic */ C28290a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @PublishedApi
        /* renamed from: a */
        public final AbstractC48600sM5 m14281a() {
            return C51564xM5.m5416A((AbstractC48600sM5) C51564xM5.m5378j().m86809a(), null, false, 6, null);
        }

        /* renamed from: b */
        public final AbstractC48600sM5 m14280b() {
            return C51564xM5.m5413D();
        }

        /* renamed from: c */
        public final void m14279c() {
            C51564xM5.m5413D().mo14292n();
        }

        /* renamed from: d */
        public final <T> T m14278d(Function1<Object, Unit> function1, Function1<Object, Unit> function12, Function0<? extends T> block) {
            CX2 cx2;
            AbstractC48600sM5 p96;
            Intrinsics.checkNotNullParameter(block, "block");
            if (function1 == null && function12 == null) {
                return block.invoke();
            }
            AbstractC48600sM5 abstractC48600sM5 = (AbstractC48600sM5) C51564xM5.m5378j().m86809a();
            if (abstractC48600sM5 != null && !(abstractC48600sM5 instanceof CX2)) {
                if (function1 == null) {
                    return block.invoke();
                }
                p96 = abstractC48600sM5.mo14284v(function1);
            } else {
                if (abstractC48600sM5 instanceof CX2) {
                    cx2 = (CX2) abstractC48600sM5;
                } else {
                    cx2 = null;
                }
                p96 = new P96(cx2, function1, function12, true, false);
            }
            try {
                AbstractC48600sM5 m14295k = p96.m14295k();
                T invoke = block.invoke();
                p96.m14288r(m14295k);
                return invoke;
            } finally {
                p96.mo1848d();
            }
        }

        /* renamed from: e */
        public final InterfaceC41649ge3 m14277e(Function2<? super Set<? extends Object>, ? super AbstractC48600sM5, Unit> observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            C51564xM5.m5390a(C51564xM5.m5382f());
            synchronized (C51564xM5.m5412E()) {
                C51564xM5.m5384d().add(observer);
            }
            return new C28291a(observer);
        }

        /* renamed from: f */
        public final InterfaceC41649ge3 m14276f(Function1<Object, Unit> observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            synchronized (C51564xM5.m5412E()) {
                C51564xM5.m5381g().add(observer);
            }
            C51564xM5.m5388b();
            return new C28292b(observer);
        }

        /* renamed from: g */
        public final void m14275g() {
            Set<FP5> mo90625C;
            boolean z;
            synchronized (C51564xM5.m5412E()) {
                z = false;
                if (((WC1) C51564xM5.m5383e().get()).mo90625C() != null) {
                    if (!mo90625C.isEmpty()) {
                        z = true;
                    }
                }
            }
            if (z) {
                C51564xM5.m5388b();
            }
        }

        /* renamed from: h */
        public final CX2 m14274h(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
            CX2 cx2;
            CX2 mo78735N;
            AbstractC48600sM5 m5413D = C51564xM5.m5413D();
            if (m5413D instanceof CX2) {
                cx2 = (CX2) m5413D;
            } else {
                cx2 = null;
            }
            if (cx2 != null && (mo78735N = cx2.mo78735N(function1, function12)) != null) {
                return mo78735N;
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }

        /* renamed from: i */
        public final AbstractC48600sM5 m14273i(Function1<Object, Unit> function1) {
            return C51564xM5.m5413D().mo14284v(function1);
        }

        private C28290a() {
        }
    }

    public /* synthetic */ AbstractC48600sM5(int i, C50378vM5 c50378vM5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, c50378vM5);
    }

    /* renamed from: b */
    public final void m14303b() {
        synchronized (C51564xM5.m5412E()) {
            mo14302c();
            mo14289q();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: c */
    public void mo14302c() {
        C51564xM5.m5369s(C51564xM5.m5379i().m8780j(mo14300f()));
    }

    /* renamed from: d */
    public void mo1848d() {
        this.f108674c = true;
        synchronized (C51564xM5.m5412E()) {
            m14290p();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: e */
    public final boolean m14301e() {
        return this.f108674c;
    }

    /* renamed from: f */
    public int mo14300f() {
        return this.f108673b;
    }

    /* renamed from: g */
    public C50378vM5 mo14299g() {
        return this.f108672a;
    }

    /* renamed from: h */
    public abstract Function1<Object, Unit> mo14298h();

    /* renamed from: i */
    public abstract boolean mo14297i();

    /* renamed from: j */
    public abstract Function1<Object, Unit> mo14296j();

    @PublishedApi
    /* renamed from: k */
    public AbstractC48600sM5 m14295k() {
        AbstractC48600sM5 abstractC48600sM5 = (AbstractC48600sM5) C51564xM5.m5378j().m86809a();
        C51564xM5.m5378j().m86808b(this);
        return abstractC48600sM5;
    }

    /* renamed from: l */
    public abstract void mo14294l(AbstractC48600sM5 abstractC48600sM5);

    /* renamed from: m */
    public abstract void mo14293m(AbstractC48600sM5 abstractC48600sM5);

    /* renamed from: n */
    public abstract void mo14292n();

    /* renamed from: o */
    public abstract void mo14291o(FP5 fp5);

    /* renamed from: p */
    public final void m14290p() {
        int i = this.f108675d;
        if (i >= 0) {
            C51564xM5.m5397T(i);
            this.f108675d = -1;
        }
    }

    /* renamed from: q */
    public void mo14289q() {
        m14290p();
    }

    @PublishedApi
    /* renamed from: r */
    public void m14288r(AbstractC48600sM5 abstractC48600sM5) {
        C51564xM5.m5378j().m86808b(abstractC48600sM5);
    }

    /* renamed from: s */
    public final void m14287s(boolean z) {
        this.f108674c = z;
    }

    /* renamed from: t */
    public void mo14286t(int i) {
        this.f108673b = i;
    }

    /* renamed from: u */
    public void mo14285u(C50378vM5 c50378vM5) {
        Intrinsics.checkNotNullParameter(c50378vM5, "<set-?>");
        this.f108672a = c50378vM5;
    }

    /* renamed from: v */
    public abstract AbstractC48600sM5 mo14284v(Function1<Object, Unit> function1);

    /* renamed from: w */
    public final int m14283w() {
        int i = this.f108675d;
        this.f108675d = -1;
        return i;
    }

    /* renamed from: x */
    public final void m14282x() {
        if (!(!this.f108674c)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
    }

    public AbstractC48600sM5(int i, C50378vM5 c50378vM5) {
        this.f108672a = c50378vM5;
        this.f108673b = i;
        this.f108675d = i != 0 ? C51564xM5.m5393X(i, mo14299g()) : -1;
    }
}
