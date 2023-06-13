package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB0\u0012'\u0010!\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b>\u0010?JA\u0010\t\u001a\u00020\u0005\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\u00052!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\r0\u0004J\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0005J\b\u0010\u0013\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\u0005H\u0002J\u0016\u0010\u0017\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0002J\u0010\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J&\u0010\u001d\u001a\u00020\u001c\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0002R5\u0010!\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010&\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R,\u0010.\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0015\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00050*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010 R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u001c018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010(R\u0018\u0010=\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006@"}, m28432d2 = {"LQM5;", "", "T", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function1;", "", "onValueChangedForScope", "Lkotlin/Function0;", "block", "o", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/ParameterName;", "name", "", "predicate", "l", "s", "t", "k", "m", "r", "", "set", "j", "p", "", "q", "onChanged", "LQM5$a;", "n", "callback", C17296a.f69688o, "Lkotlin/jvm/functions/Function1;", "onChangedExecutor", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingChanges", "c", "Z", "sendingNotifications", "Lkotlin/Function2;", "LsM5;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function2;", "applyObserver", "e", "readObserver", "LLX2;", "f", "LLX2;", "observedScopeMaps", "Lge3;", "g", "Lge3;", "applyUnsubscribe", "h", "isPaused", "i", "LQM5$a;", "currentMap", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n1#1,549:1\n181#1,2:554\n183#1,2:567\n181#1,2:598\n183#1,2:611\n181#1,2:613\n183#1,2:626\n181#1,2:628\n183#1,2:641\n1182#2:550\n1161#2,2:551\n1#3:553\n460#4,11:556\n460#4,11:569\n460#4,11:600\n460#4,11:615\n460#4,11:630\n366#4,12:643\n728#4,2:655\n436#5,18:580\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n*L\n65#1:554,2\n65#1:567,2\n269#1:598,2\n269#1:611,2\n279#1:613,2\n279#1:626,2\n311#1:628,2\n311#1:641,2\n173#1:550\n173#1:551,2\n65#1:556,11\n182#1:569,11\n269#1:600,11\n279#1:615,11\n311#1:630,11\n324#1:643,12\n327#1:655,2\n229#1:580,18\n*E\n"})
/* renamed from: QM5 */
/* loaded from: classes.dex */
public final class QM5 {

    /* renamed from: a */
    public final Function1<Function0<Unit>, Unit> f30247a;

    /* renamed from: b */
    public final AtomicReference<Object> f30248b;

    /* renamed from: c */
    public boolean f30249c;

    /* renamed from: d */
    public final Function2<Set<? extends Object>, AbstractC48600sM5, Unit> f30250d;

    /* renamed from: e */
    public final Function1<Object, Unit> f30251e;

    /* renamed from: f */
    public final LX2<C6766a> f30252f;

    /* renamed from: g */
    public InterfaceC41649ge3 f30253g;

    /* renamed from: h */
    public boolean f30254h;

    /* renamed from: i */
    public C6766a f30255i;

    @Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b>\u0010?J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J)\u0010\u000b\u001a\u00020\u00032!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005J\u0006\u0010\f\u001a\u00020\u0003J\u0014\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rJ\u0006\u0010\u0010\u001a\u00020\u0003J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0002J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001b0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R'\u00102\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030/\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b0\u0010\u0014\u001a\u0004\b1\u0010\u0016R'\u00105\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030/\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b3\u0010\u0014\u001a\u0004\b4\u0010\u0016R\u0016\u00107\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010!R\u001e\u00109\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003080#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R<\u0010=\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u000308\u0012\u0006\u0012\u0004\u0018\u00010\u00010:j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u000308\u0012\u0006\u0012\u0004\u0018\u00010\u0001`;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010<¨\u0006@"}, m28432d2 = {"LQM5$a;", "", "value", "", "r", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", Action.SCOPE_ATTRIBUTE, "", "predicate", "t", "k", "", "changes", "q", "p", "l", "s", C17296a.f69688o, "Lkotlin/jvm/functions/Function1;", "o", "()Lkotlin/jvm/functions/Function1;", "onChanged", "b", "Ljava/lang/Object;", "currentScope", "LjW1;", "c", "LjW1;", "currentScopeReads", "", DateTokenConverter.CONVERTER_KEY, "I", "currentToken", "LnW1;", "e", "LnW1;", "valueToScopes", "LkW1;", "f", "LkW1;", "scopeToValues", "LlW1;", "g", "LlW1;", "invalidated", "LsP5;", "h", "m", "derivedStateEnterObserver", "i", "n", "derivedStateExitObserver", "j", "deriveStateScopeCount", "Lu01;", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "recordedDerivedStateValues", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n+ 2 IdentityArrayIntMap.kt\nandroidx/compose/runtime/collection/IdentityArrayIntMap\n+ 3 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n+ 4 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n+ 5 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n1#1,549:1\n132#2,18:550\n159#2,4:568\n159#2,4:579\n118#3,7:572\n125#3,15:583\n89#4,3:598\n89#4,3:604\n93#4:612\n93#4:614\n89#4,3:615\n93#4:623\n105#5,3:601\n105#5,5:607\n109#5:613\n105#5,5:618\n105#5,5:624\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n456#1:550,18\n470#1:568,4\n482#1:579,4\n479#1:572,7\n479#1:583,15\n517#1:598,3\n524#1:604,3\n524#1:612\n517#1:614\n532#1:615,3\n532#1:623\n517#1:601,3\n524#1:607,5\n517#1:613\n532#1:618,5\n544#1:624,5\n*E\n"})
    /* renamed from: QM5$a */
    /* loaded from: classes.dex */
    public static final class C6766a {

        /* renamed from: a */
        public final Function1<Object, Unit> f30256a;

        /* renamed from: b */
        public Object f30257b;

        /* renamed from: c */
        public C43350jW1 f30258c;

        /* renamed from: d */
        public int f30259d;

        /* renamed from: e */
        public final C45722nW1<Object> f30260e;

        /* renamed from: f */
        public final C43943kW1<Object, C43350jW1> f30261f;

        /* renamed from: g */
        public final C44536lW1<Object> f30262g;

        /* renamed from: h */
        public final Function1<InterfaceC48627sP5<?>, Unit> f30263h;

        /* renamed from: i */
        public final Function1<InterfaceC48627sP5<?>, Unit> f30264i;

        /* renamed from: j */
        public int f30265j;

        /* renamed from: k */
        public final C45722nW1<InterfaceC49574u01<?>> f30266k;

        /* renamed from: l */
        public final HashMap<InterfaceC49574u01<?>, Object> f30267l;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LsP5;", "it", "", C17296a.f69688o, "(LsP5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: QM5$a$a */
        /* loaded from: classes.dex */
        public static final class C6767a extends Lambda implements Function1<InterfaceC48627sP5<?>, Unit> {
            public C6767a() {
                super(1);
            }

            /* renamed from: a */
            public final void m88596a(InterfaceC48627sP5<?> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                C6766a.this.f30265j++;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48627sP5<?> interfaceC48627sP5) {
                m88596a(interfaceC48627sP5);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LsP5;", "it", "", C17296a.f69688o, "(LsP5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: QM5$a$b */
        /* loaded from: classes.dex */
        public static final class C6768b extends Lambda implements Function1<InterfaceC48627sP5<?>, Unit> {
            public C6768b() {
                super(1);
            }

            /* renamed from: a */
            public final void m88595a(InterfaceC48627sP5<?> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                C6766a c6766a = C6766a.this;
                c6766a.f30265j--;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48627sP5<?> interfaceC48627sP5) {
                m88595a(interfaceC48627sP5);
                return Unit.INSTANCE;
            }
        }

        public C6766a(Function1<Object, Unit> onChanged) {
            Intrinsics.checkNotNullParameter(onChanged, "onChanged");
            this.f30256a = onChanged;
            this.f30259d = -1;
            this.f30260e = new C45722nW1<>();
            this.f30261f = new C43943kW1<>(0, 1, null);
            this.f30262g = new C44536lW1<>();
            this.f30263h = new C6767a();
            this.f30264i = new C6768b();
            this.f30266k = new C45722nW1<>();
            this.f30267l = new HashMap<>();
        }

        /* renamed from: k */
        public final void m88606k() {
            this.f30260e.m23579d();
            this.f30261f.m28901a();
            this.f30266k.m23579d();
            this.f30267l.clear();
        }

        /* renamed from: l */
        public final void m88605l(Object obj) {
            boolean z;
            C43350jW1 c43350jW1 = this.f30258c;
            if (c43350jW1 != null) {
                int m30400e = c43350jW1.m30400e();
                int i = 0;
                for (int i2 = 0; i2 < m30400e; i2++) {
                    Object obj2 = c43350jW1.m30401d()[i2];
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Any");
                    int i3 = c43350jW1.m30399f()[i2];
                    if (i3 != this.f30259d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        m88598s(obj, obj2);
                    }
                    if (!z) {
                        if (i != i2) {
                            c43350jW1.m30401d()[i] = obj2;
                            c43350jW1.m30399f()[i] = i3;
                        }
                        i++;
                    }
                }
                int m30400e2 = c43350jW1.m30400e();
                for (int i4 = i; i4 < m30400e2; i4++) {
                    c43350jW1.m30401d()[i4] = null;
                }
                c43350jW1.m30398g(i);
            }
        }

        /* renamed from: m */
        public final Function1<InterfaceC48627sP5<?>, Unit> m88604m() {
            return this.f30263h;
        }

        /* renamed from: n */
        public final Function1<InterfaceC48627sP5<?>, Unit> m88603n() {
            return this.f30264i;
        }

        /* renamed from: o */
        public final Function1<Object, Unit> m88602o() {
            return this.f30256a;
        }

        /* renamed from: p */
        public final void m88601p() {
            C44536lW1<Object> c44536lW1 = this.f30262g;
            Function1<Object, Unit> function1 = this.f30256a;
            int size = c44536lW1.size();
            for (int i = 0; i < size; i++) {
                function1.invoke(c44536lW1.get(i));
            }
            this.f30262g.clear();
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
            r7 = (r8 = r11.f30260e).m23577f(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
            r5 = (r3 = r11.f30266k).m23577f(r2);
         */
        /* renamed from: q */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean m88600q(Set<? extends Object> changes) {
            int m23577f;
            C44536lW1 m23568o;
            C45722nW1<InterfaceC49574u01<?>> c45722nW1;
            int m23577f2;
            C44536lW1 m23568o2;
            C45722nW1<Object> c45722nW12;
            int m23577f3;
            C44536lW1 m23568o3;
            Intrinsics.checkNotNullParameter(changes, "changes");
            Iterator<? extends Object> it = changes.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f30266k.m23578e(next) && m23577f2 >= 0) {
                    m23568o2 = c45722nW1.m23568o(m23577f2);
                    int size = m23568o2.size();
                    for (int i = 0; i < size; i++) {
                        InterfaceC49574u01 interfaceC49574u01 = (InterfaceC49574u01) m23568o2.get(i);
                        Intrinsics.checkNotNull(interfaceC49574u01, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                        Object obj = this.f30267l.get(interfaceC49574u01);
                        EM5 mo11110a = interfaceC49574u01.mo11110a();
                        if (mo11110a == null) {
                            mo11110a = GM5.m105191p();
                        }
                        if (!mo11110a.mo26703a(interfaceC49574u01.mo11109d(), obj) && m23577f3 >= 0) {
                            m23568o3 = c45722nW12.m23568o(m23577f3);
                            int size2 = m23568o3.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                this.f30262g.add(m23568o3.get(i2));
                                i2++;
                                z = true;
                            }
                        }
                    }
                }
                C45722nW1<Object> c45722nW13 = this.f30260e;
                m23577f = c45722nW13.m23577f(next);
                if (m23577f >= 0) {
                    m23568o = c45722nW13.m23568o(m23577f);
                    int size3 = m23568o.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        this.f30262g.add(m23568o.get(i3));
                        i3++;
                        z = true;
                    }
                }
            }
            return z;
        }

        /* renamed from: r */
        public final void m88599r(Object value) {
            Object[] mo11108g;
            Intrinsics.checkNotNullParameter(value, "value");
            if (this.f30265j > 0) {
                return;
            }
            Object obj = this.f30257b;
            Intrinsics.checkNotNull(obj);
            C43350jW1 c43350jW1 = this.f30258c;
            if (c43350jW1 == null) {
                c43350jW1 = new C43350jW1();
                this.f30258c = c43350jW1;
                this.f30261f.m28891k(obj, c43350jW1);
            }
            int m30404a = c43350jW1.m30404a(value, this.f30259d);
            if ((value instanceof InterfaceC49574u01) && m30404a != this.f30259d) {
                InterfaceC49574u01 interfaceC49574u01 = (InterfaceC49574u01) value;
                for (Object obj2 : interfaceC49574u01.mo11108g()) {
                    if (obj2 == null) {
                        break;
                    }
                    this.f30266k.m23580c(obj2, value);
                }
                this.f30267l.put(value, interfaceC49574u01.mo11109d());
            }
            if (m30404a == -1) {
                this.f30260e.m23580c(value, obj);
            }
        }

        /* renamed from: s */
        public final void m88598s(Object obj, Object obj2) {
            this.f30260e.m23570m(obj2, obj);
            if ((obj2 instanceof InterfaceC49574u01) && !this.f30260e.m23578e(obj2)) {
                this.f30266k.m23569n(obj2);
                this.f30267l.remove(obj2);
            }
        }

        /* renamed from: t */
        public final void m88597t(Function1<Object, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            C43943kW1<Object, C43350jW1> c43943kW1 = this.f30261f;
            int m28895g = c43943kW1.m28895g();
            int i = 0;
            for (int i2 = 0; i2 < m28895g; i2++) {
                Object obj = c43943kW1.m28896f()[i2];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                C43350jW1 c43350jW1 = (C43350jW1) c43943kW1.m28894h()[i2];
                Boolean invoke = predicate.invoke(obj);
                if (invoke.booleanValue()) {
                    int m30400e = c43350jW1.m30400e();
                    for (int i3 = 0; i3 < m30400e; i3++) {
                        Object obj2 = c43350jW1.m30401d()[i3];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Any");
                        int i4 = c43350jW1.m30399f()[i3];
                        m88598s(obj, obj2);
                    }
                }
                if (!invoke.booleanValue()) {
                    if (i != i2) {
                        c43943kW1.m28896f()[i] = obj;
                        c43943kW1.m28894h()[i] = c43943kW1.m28894h()[i2];
                    }
                    i++;
                }
            }
            if (c43943kW1.m28895g() > i) {
                int m28895g2 = c43943kW1.m28895g();
                for (int i5 = i; i5 < m28895g2; i5++) {
                    c43943kW1.m28896f()[i5] = null;
                    c43943kW1.m28894h()[i5] = null;
                }
                c43943kW1.m28890l(i);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "applied", "LsM5;", "<anonymous parameter 1>", "", C17296a.f69688o, "(Ljava/util/Set;LsM5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: QM5$b */
    /* loaded from: classes.dex */
    public static final class C6769b extends Lambda implements Function2<Set<? extends Object>, AbstractC48600sM5, Unit> {
        public C6769b() {
            super(2);
        }

        /* renamed from: a */
        public final void m88594a(Set<? extends Object> applied, AbstractC48600sM5 abstractC48600sM5) {
            Intrinsics.checkNotNullParameter(applied, "applied");
            Intrinsics.checkNotNullParameter(abstractC48600sM5, "<anonymous parameter 1>");
            QM5.this.m88627j(applied);
            if (QM5.this.m88624m()) {
                QM5.this.m88619r();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, AbstractC48600sM5 abstractC48600sM5) {
            m88594a(set, abstractC48600sM5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "T", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: QM5$c */
    /* loaded from: classes.dex */
    public static final class C6770c extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ Function0<Unit> f30272h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6770c(Function0<Unit> function0) {
            super(0);
            this.f30272h = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AbstractC48600sM5.f108670e.m14278d(QM5.this.f30251e, null, this.f30272h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", TransferTable.COLUMN_STATE, "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: QM5$d */
    /* loaded from: classes.dex */
    public static final class C6771d extends Lambda implements Function1<Object, Unit> {
        public C6771d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (QM5.this.f30254h) {
                return;
            }
            LX2 lx2 = QM5.this.f30252f;
            QM5 qm5 = QM5.this;
            synchronized (lx2) {
                C6766a c6766a = qm5.f30255i;
                Intrinsics.checkNotNull(c6766a);
                c6766a.m88599r(state);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,549:1\n460#2,11:550\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n*L\n84#1:550,11\n*E\n"})
    /* renamed from: QM5$e */
    /* loaded from: classes.dex */
    public static final class C6772e extends Lambda implements Function0<Unit> {
        public C6772e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            do {
                LX2 lx2 = QM5.this.f30252f;
                QM5 qm5 = QM5.this;
                synchronized (lx2) {
                    if (!qm5.f30249c) {
                        qm5.f30249c = true;
                        LX2 lx22 = qm5.f30252f;
                        int m96690u = lx22.m96690u();
                        if (m96690u > 0) {
                            Object[] m96691s = lx22.m96691s();
                            int i = 0;
                            do {
                                ((C6766a) m96691s[i]).m88601p();
                                i++;
                            } while (i < m96690u);
                            qm5.f30249c = false;
                        } else {
                            qm5.f30249c = false;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } while (QM5.this.m88624m());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QM5(Function1<? super Function0<Unit>, Unit> onChangedExecutor) {
        Intrinsics.checkNotNullParameter(onChangedExecutor, "onChangedExecutor");
        this.f30247a = onChangedExecutor;
        this.f30248b = new AtomicReference<>(null);
        this.f30250d = new C6769b();
        this.f30251e = new C6771d();
        this.f30252f = new LX2<>(new C6766a[16], 0);
    }

    /* renamed from: j */
    public final void m88627j(Set<? extends Object> set) {
        Object obj;
        List listOf;
        List plus;
        List list;
        List listOf2;
        do {
            obj = this.f30248b.get();
            if (obj == null) {
                list = set;
            } else if (obj instanceof Set) {
                listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Set[]{(Set) obj, set});
                list = listOf2;
            } else if (obj instanceof List) {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(set);
                plus = CollectionsKt___CollectionsKt.plus((Collection) obj, (Iterable) listOf);
                list = plus;
            } else {
                m88620q();
                throw new KotlinNothingValueException();
            }
        } while (!C42482i24.m35337a(this.f30248b, obj, list));
    }

    /* renamed from: k */
    public final void m88626k() {
        synchronized (this.f30252f) {
            LX2<C6766a> lx2 = this.f30252f;
            int m96690u = lx2.m96690u();
            if (m96690u > 0) {
                C6766a[] m96691s = lx2.m96691s();
                int i = 0;
                do {
                    m96691s[i].m88606k();
                    i++;
                } while (i < m96690u);
                Unit unit = Unit.INSTANCE;
            } else {
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    /* renamed from: l */
    public final void m88625l(Function1<Object, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        synchronized (this.f30252f) {
            LX2<C6766a> lx2 = this.f30252f;
            int m96690u = lx2.m96690u();
            if (m96690u > 0) {
                C6766a[] m96691s = lx2.m96691s();
                int i = 0;
                do {
                    m96691s[i].m88597t(predicate);
                    i++;
                } while (i < m96690u);
                Unit unit = Unit.INSTANCE;
            } else {
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    /* renamed from: m */
    public final boolean m88624m() {
        boolean z;
        synchronized (this.f30252f) {
            z = this.f30249c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set<? extends Object> m88621p = m88621p();
            if (m88621p == null) {
                return z2;
            }
            synchronized (this.f30252f) {
                LX2<C6766a> lx2 = this.f30252f;
                int m96690u = lx2.m96690u();
                if (m96690u > 0) {
                    C6766a[] m96691s = lx2.m96691s();
                    int i = 0;
                    do {
                        if (!m96691s[i].m88600q(m88621p) && !z2) {
                            z2 = false;
                            i++;
                        }
                        z2 = true;
                        i++;
                    } while (i < m96690u);
                    Unit unit = Unit.INSTANCE;
                } else {
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
    }

    /* renamed from: n */
    public final <T> C6766a m88623n(Function1<? super T, Unit> function1) {
        C6766a c6766a;
        boolean z;
        LX2<C6766a> lx2 = this.f30252f;
        int m96690u = lx2.m96690u();
        if (m96690u > 0) {
            C6766a[] m96691s = lx2.m96691s();
            int i = 0;
            do {
                c6766a = m96691s[i];
                if (c6766a.m88602o() == function1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            } while (i < m96690u);
            c6766a = null;
        } else {
            c6766a = null;
        }
        C6766a c6766a2 = c6766a;
        if (c6766a2 == null) {
            Intrinsics.checkNotNull(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
            C6766a c6766a3 = new C6766a((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1));
            this.f30252f.m96701b(c6766a3);
            return c6766a3;
        }
        return c6766a2;
    }

    /* renamed from: o */
    public final <T> void m88622o(T scope, Function1<? super T, Unit> onValueChangedForScope, Function0<Unit> block) {
        C6766a m88623n;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onValueChangedForScope, "onValueChangedForScope");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this.f30252f) {
            m88623n = m88623n(onValueChangedForScope);
        }
        boolean z = this.f30254h;
        C6766a c6766a = this.f30255i;
        try {
            this.f30254h = false;
            this.f30255i = m88623n;
            Object obj = m88623n.f30257b;
            C43350jW1 c43350jW1 = m88623n.f30258c;
            int i = m88623n.f30259d;
            m88623n.f30257b = scope;
            m88623n.f30258c = (C43350jW1) m88623n.f30261f.m28897e(scope);
            if (m88623n.f30259d == -1) {
                m88623n.f30259d = C51564xM5.m5413D().mo14300f();
            }
            GM5.m105197j(m88623n.m88604m(), m88623n.m88603n(), new C6770c(block));
            Object obj2 = m88623n.f30257b;
            Intrinsics.checkNotNull(obj2);
            m88623n.m88605l(obj2);
            m88623n.f30257b = obj;
            m88623n.f30258c = c43350jW1;
            m88623n.f30259d = i;
        } finally {
            this.f30255i = c6766a;
            this.f30254h = z;
        }
    }

    /* renamed from: p */
    public final Set<Object> m88621p() {
        Object obj;
        Object obj2;
        Set<Object> set;
        do {
            obj = this.f30248b.get();
            obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else if (obj instanceof List) {
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
                set = set2;
            } else {
                m88620q();
                throw new KotlinNothingValueException();
            }
        } while (!C42482i24.m35337a(this.f30248b, obj, obj2));
        return set;
    }

    /* renamed from: q */
    public final Void m88620q() {
        C35528Qt0.m87792x("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    /* renamed from: r */
    public final void m88619r() {
        this.f30247a.invoke(new C6772e());
    }

    /* renamed from: s */
    public final void m88618s() {
        this.f30253g = AbstractC48600sM5.f108670e.m14277e(this.f30250d);
    }

    /* renamed from: t */
    public final void m88617t() {
        InterfaceC41649ge3 interfaceC41649ge3 = this.f30253g;
        if (interfaceC41649ge3 != null) {
            interfaceC41649ge3.dispose();
        }
    }
}
