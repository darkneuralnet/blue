package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC48600sM5;
import p000.C50378vM5;
@Metadata(m28433d1 = {"\u0000\u0090\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0000\u001a\b\u0010\t\u001a\u00020\bH\u0000\u001a4\u0010\u0010\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002\u001aL\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0002\u001aB\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0002\u001a@\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0016\u001a\u00020\b2!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a8\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\b\u0010\u001e\u001a\u00020\u0006H\u0002\u001a<\u0010\u001f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\b2!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\bH\u0002\u001a \u0010%\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a \u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a3\u0010*\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020&2\u0006\u0010)\u001a\u00028\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+\u001a#\u0010.\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020&*\u00028\u00002\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/\u001a\b\u00101\u001a\u000200H\u0002\u001a\u0012\u00102\u001a\u0004\u0018\u00010&2\u0006\u0010-\u001a\u00020,H\u0002\u001a\u0010\u00103\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,H\u0002\u001a-\u00104\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020&*\u00028\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010!\u001a\u00020\bH\u0001¢\u0006\u0004\b4\u00105\u001a5\u00107\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020&*\u00028\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010!\u001a\u00020\b2\u0006\u00106\u001a\u00028\u0000H\u0000¢\u0006\u0004\b7\u00108\u001a-\u00109\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020&*\u00028\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010!\u001a\u00020\bH\u0000¢\u0006\u0004\b9\u00105\u001a-\u0010:\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020&*\u00028\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\b:\u00105\u001a%\u0010;\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020&*\u00028\u00002\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b;\u0010/\u001a\u0018\u0010<\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\b2\u0006\u0010-\u001a\u00020,H\u0001\u001a.\u0010A\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0018\u00010@2\u0006\u0010#\u001a\u00020=2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u0002H\u0002\u001a\b\u0010B\u001a\u000200H\u0002\u001a)\u0010C\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020&2\u0006\u0010)\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\bH\u0001¢\u0006\u0004\bC\u0010D\u001a!\u0010E\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020&2\u0006\u0010)\u001a\u00028\u0000H\u0001¢\u0006\u0004\bE\u0010F\u001a\u001c\u0010I\u001a\u00020\u0002*\u00020\u00022\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u0000H\u0000\"/\u0010L\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K\"\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\b0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O\" \u0010W\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bU\u0010V\u001a\u0004\bS\u0010T\"\u0016\u0010Z\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010Y\"\u0016\u0010\\\u001a\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\u0015\"\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_\"2\u0010f\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0c\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060b0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010e\"&\u0010h\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010e\"4\u0010o\u001a\"\u0012\f\u0012\n k*\u0004\u0018\u00010j0j0ij\u0010\u0012\f\u0012\n k*\u0004\u0018\u00010j0j`l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010n\" \u0010u\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bp\u0010q\u0012\u0004\bt\u0010V\u001a\u0004\br\u0010s¨\u0006v"}, m28432d2 = {"", "id", "LvM5;", "invalid", "X", "handle", "", "T", "LsM5;", "D", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "z", "parentObserver", "mergeReadObserver", "G", "writeObserver", "I", "previousGlobalSnapshot", "Lkotlin/ParameterName;", "name", "block", "V", "(LsM5;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "x", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "y", "W", "(Lkotlin/jvm/functions/Function1;)LsM5;", "snapshot", "b0", "currentSnapshot", "candidateSnapshot", "Z", "LHP5;", MessageExtension.FIELD_DATA, "a0", "r", "R", "(LHP5;ILvM5;)LHP5;", "LFP5;", TransferTable.COLUMN_STATE, "S", "(LHP5;LFP5;)LHP5;", "", "Q", "Y", "P", "c0", "(LHP5;LFP5;LsM5;)LHP5;", "candidate", "O", "(LHP5;LFP5;LsM5;LHP5;)LHP5;", "K", "L", "J", "M", "LCX2;", "applyingSnapshot", "invalidSnapshots", "", "N", "U", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "(LHP5;LsM5;)LHP5;", "B", "(LHP5;)LHP5;", "from", "until", "w", C17296a.f69688o, "Lkotlin/jvm/functions/Function1;", "emptyLambda", "LRM5;", "b", "LRM5;", "threadSnapshot", "c", "Ljava/lang/Object;", "E", "()Ljava/lang/Object;", "getLock$annotations", "()V", "lock", DateTokenConverter.CONVERTER_KEY, "LvM5;", "openSnapshots", "e", "nextSnapshotId", "LuM5;", "f", "LuM5;", "pinningTable", "", "Lkotlin/Function2;", "", "g", "Ljava/util/List;", "applyObservers", "h", "globalWriteObservers", "Ljava/util/concurrent/atomic/AtomicReference;", "LWC1;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "i", "Ljava/util/concurrent/atomic/AtomicReference;", "currentGlobalSnapshot", "j", "LsM5;", "F", "()LsM5;", "getSnapshotInitializer$annotations", "snapshotInitializer", "runtime_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2191:1\n1686#1:2192\n1686#1:2195\n1686#1:2197\n1686#1:2199\n1686#1:2207\n1686#1:2211\n1686#1:2214\n1686#1:2216\n1686#1:2218\n1686#1:2220\n1686#1:2222\n1686#1:2224\n70#2:2193\n70#2:2194\n70#2:2196\n70#2:2198\n70#2:2200\n70#2:2208\n70#2:2212\n70#2:2215\n70#2:2217\n70#2:2219\n70#2:2221\n70#2:2223\n70#2:2225\n33#3,6:2201\n1855#4,2:2209\n1#5:2213\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n596#1:2192\n1739#1:2195\n1757#1:2197\n1766#1:2199\n1772#1:2207\n1841#1:2211\n1985#1:2214\n1994#1:2216\n2062#1:2218\n2074#1:2220\n2102#1:2222\n2167#1:2224\n596#1:2193\n1686#1:2194\n1739#1:2196\n1757#1:2198\n1766#1:2200\n1772#1:2208\n1841#1:2212\n1985#1:2215\n1994#1:2217\n2062#1:2219\n2074#1:2221\n2102#1:2223\n2167#1:2225\n1767#1:2201,6\n1773#1:2209,2\n*E\n"})
/* renamed from: xM5 */
/* loaded from: classes.dex */
public final class C51564xM5 {

    /* renamed from: a */
    public static final Function1<C50378vM5, Unit> f117451a = C30134b.f117462g;

    /* renamed from: b */
    public static final RM5<AbstractC48600sM5> f117452b = new RM5<>();

    /* renamed from: c */
    public static final Object f117453c = new Object();

    /* renamed from: d */
    public static C50378vM5 f117454d;

    /* renamed from: e */
    public static int f117455e;

    /* renamed from: f */
    public static final C49786uM5 f117456f;

    /* renamed from: g */
    public static final List<Function2<Set<? extends Object>, AbstractC48600sM5, Unit>> f117457g;

    /* renamed from: h */
    public static final List<Function1<Object, Unit>> f117458h;

    /* renamed from: i */
    public static final AtomicReference<WC1> f117459i;

    /* renamed from: j */
    public static final AbstractC48600sM5 f117460j;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LvM5;", "it", "", C17296a.f69688o, "(LvM5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xM5$a */
    /* loaded from: classes.dex */
    public static final class C30133a extends Lambda implements Function1<C50378vM5, Unit> {

        /* renamed from: g */
        public static final C30133a f117461g = new C30133a();

        public C30133a() {
            super(1);
        }

        /* renamed from: a */
        public final void m5361a(C50378vM5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50378vM5 c50378vM5) {
            m5361a(c50378vM5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LvM5;", "it", "", C17296a.f69688o, "(LvM5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xM5$b */
    /* loaded from: classes.dex */
    public static final class C30134b extends Lambda implements Function1<C50378vM5, Unit> {

        /* renamed from: g */
        public static final C30134b f117462g = new C30134b();

        public C30134b() {
            super(1);
        }

        /* renamed from: a */
        public final void m5360a(C50378vM5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50378vM5 c50378vM5) {
            m5360a(c50378vM5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", TransferTable.COLUMN_STATE, "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xM5$c */
    /* loaded from: classes.dex */
    public static final class C30135c extends Lambda implements Function1<Object, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<Object, Unit> f117463g;

        /* renamed from: h */
        public final /* synthetic */ Function1<Object, Unit> f117464h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30135c(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
            super(1);
            this.f117463g = function1;
            this.f117464h = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(Object state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.f117463g.invoke(state);
            this.f117464h.invoke(state);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", TransferTable.COLUMN_STATE, "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xM5$d */
    /* loaded from: classes.dex */
    public static final class C30136d extends Lambda implements Function1<Object, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<Object, Unit> f117465g;

        /* renamed from: h */
        public final /* synthetic */ Function1<Object, Unit> f117466h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30136d(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
            super(1);
            this.f117465g = function1;
            this.f117466h = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(Object state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.f117465g.invoke(state);
            this.f117466h.invoke(state);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LsM5;", "T", "LvM5;", "invalid", C17296a.f69688o, "(LvM5;)LsM5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt$takeNewSnapshot$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n70#3:2193\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt$takeNewSnapshot$1\n*L\n1784#1:2192\n1784#1:2193\n*E\n"})
    /* renamed from: xM5$e */
    /* loaded from: classes.dex */
    public static final class C30137e extends Lambda implements Function1<C50378vM5, T> {

        /* renamed from: g */
        public final /* synthetic */ Function1<C50378vM5, T> f117467g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C30137e(Function1<? super C50378vM5, ? extends T> function1) {
            super(1);
            this.f117467g = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC48600sM5 invoke(C50378vM5 invalid) {
            Intrinsics.checkNotNullParameter(invalid, "invalid");
            AbstractC48600sM5 abstractC48600sM5 = (AbstractC48600sM5) this.f117467g.invoke(invalid);
            synchronized (C51564xM5.m5412E()) {
                C51564xM5.f117454d = C51564xM5.f117454d.m8776v(abstractC48600sM5.mo14300f());
                Unit unit = Unit.INSTANCE;
            }
            return abstractC48600sM5;
        }
    }

    static {
        C50378vM5.C29518a c29518a = C50378vM5.f113941f;
        f117454d = c29518a.m8775a();
        f117455e = 1;
        f117456f = new C49786uM5();
        f117457g = new ArrayList();
        f117458h = new ArrayList();
        int i = f117455e;
        f117455e = i + 1;
        WC1 wc1 = new WC1(i, c29518a.m8775a());
        f117454d = f117454d.m8776v(wc1.mo14300f());
        AtomicReference<WC1> atomicReference = new AtomicReference<>(wc1);
        f117459i = atomicReference;
        WC1 wc12 = atomicReference.get();
        Intrinsics.checkNotNullExpressionValue(wc12, "currentGlobalSnapshot.get()");
        f117460j = wc12;
    }

    /* renamed from: A */
    public static /* synthetic */ AbstractC48600sM5 m5416A(AbstractC48600sM5 abstractC48600sM5, Function1 function1, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return m5362z(abstractC48600sM5, function1, z);
    }

    @PublishedApi
    /* renamed from: B */
    public static final <T extends HP5> T m5415B(T r) {
        T t;
        Intrinsics.checkNotNullParameter(r, "r");
        AbstractC48600sM5.C28290a c28290a = AbstractC48600sM5.f108670e;
        AbstractC48600sM5 m14280b = c28290a.m14280b();
        T t2 = (T) m5399R(r, m14280b.mo14300f(), m14280b.mo14299g());
        if (t2 == null) {
            synchronized (m5412E()) {
                AbstractC48600sM5 m14280b2 = c28290a.m14280b();
                t = (T) m5399R(r, m14280b2.mo14300f(), m14280b2.mo14299g());
            }
            if (t != null) {
                return t;
            }
            m5400Q();
            throw new KotlinNothingValueException();
        }
        return t2;
    }

    @PublishedApi
    /* renamed from: C */
    public static final <T extends HP5> T m5414C(T r, AbstractC48600sM5 snapshot) {
        Intrinsics.checkNotNullParameter(r, "r");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        T t = (T) m5399R(r, snapshot.mo14300f(), snapshot.mo14299g());
        if (t != null) {
            return t;
        }
        m5400Q();
        throw new KotlinNothingValueException();
    }

    /* renamed from: D */
    public static final AbstractC48600sM5 m5413D() {
        AbstractC48600sM5 m86809a = f117452b.m86809a();
        if (m86809a == null) {
            WC1 wc1 = f117459i.get();
            Intrinsics.checkNotNullExpressionValue(wc1, "currentGlobalSnapshot.get()");
            return wc1;
        }
        return m86809a;
    }

    /* renamed from: E */
    public static final Object m5412E() {
        return f117453c;
    }

    /* renamed from: F */
    public static final AbstractC48600sM5 m5411F() {
        return f117460j;
    }

    /* renamed from: G */
    public static final Function1<Object, Unit> m5410G(Function1<Object, Unit> function1, Function1<Object, Unit> function12, boolean z) {
        if (!z) {
            function12 = null;
        }
        if (function1 != null && function12 != null && !Intrinsics.areEqual(function1, function12)) {
            return new C30135c(function1, function12);
        }
        if (function1 == null) {
            return function12;
        }
        return function1;
    }

    /* renamed from: H */
    public static /* synthetic */ Function1 m5409H(Function1 function1, Function1 function12, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return m5410G(function1, function12, z);
    }

    /* renamed from: I */
    public static final Function1<Object, Unit> m5408I(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        if (function1 != null && function12 != null && !Intrinsics.areEqual(function1, function12)) {
            return new C30136d(function1, function12);
        }
        if (function1 == null) {
            return function12;
        }
        return function1;
    }

    /* renamed from: J */
    public static final <T extends HP5> T m5407J(T t, FP5 state) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        T t2 = (T) m5392Y(state);
        if (t2 != null) {
            t2.m103905f(Integer.MAX_VALUE);
            return t2;
        }
        T t3 = (T) t.mo13267b();
        t3.m103905f(Integer.MAX_VALUE);
        t3.m103906e(state.mo13271h());
        Intrinsics.checkNotNull(t3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$13");
        state.mo13273c(t3);
        Intrinsics.checkNotNull(t3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t3;
    }

    /* renamed from: K */
    public static final <T extends HP5> T m5406K(T t, FP5 state, AbstractC48600sM5 snapshot) {
        T t2;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        synchronized (m5412E()) {
            t2 = (T) m5405L(t, state, snapshot);
        }
        return t2;
    }

    /* renamed from: L */
    public static final <T extends HP5> T m5405L(T t, FP5 fp5, AbstractC48600sM5 abstractC48600sM5) {
        T t2 = (T) m5407J(t, fp5);
        t2.mo13268a(t);
        t2.m103905f(abstractC48600sM5.mo14300f());
        return t2;
    }

    @PublishedApi
    /* renamed from: M */
    public static final void m5404M(AbstractC48600sM5 snapshot, FP5 state) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(state, "state");
        Function1<Object, Unit> mo14296j = snapshot.mo14296j();
        if (mo14296j != null) {
            mo14296j.invoke(state);
        }
    }

    /* renamed from: N */
    public static final Map<HP5, HP5> m5403N(CX2 cx2, CX2 cx22, C50378vM5 c50378vM5) {
        HP5 m5399R;
        Set<FP5> mo90625C = cx22.mo90625C();
        int mo14300f = cx2.mo14300f();
        if (mo90625C == null) {
            return null;
        }
        C50378vM5 m8777u = cx22.mo14299g().m8776v(cx22.mo14300f()).m8777u(cx22.m112171D());
        HashMap hashMap = null;
        for (FP5 fp5 : mo90625C) {
            HP5 mo13271h = fp5.mo13271h();
            HP5 m5399R2 = m5399R(mo13271h, mo14300f, c50378vM5);
            if (m5399R2 != null && (m5399R = m5399R(mo13271h, mo14300f, m8777u)) != null && !Intrinsics.areEqual(m5399R2, m5399R)) {
                HP5 m5399R3 = m5399R(mo13271h, cx22.mo14300f(), cx22.mo14299g());
                if (m5399R3 != null) {
                    HP5 mo107179e = fp5.mo107179e(m5399R, m5399R2, m5399R3);
                    if (mo107179e == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(m5399R2, mo107179e);
                    hashMap = hashMap;
                } else {
                    m5400Q();
                    throw new KotlinNothingValueException();
                }
            }
        }
        return hashMap;
    }

    /* renamed from: O */
    public static final <T extends HP5> T m5402O(T t, FP5 state, AbstractC48600sM5 snapshot, T candidate) {
        T t2;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (snapshot.mo14297i()) {
            snapshot.mo14291o(state);
        }
        int mo14300f = snapshot.mo14300f();
        if (candidate.m103907d() == mo14300f) {
            return candidate;
        }
        synchronized (m5412E()) {
            t2 = (T) m5407J(t, state);
        }
        t2.m103905f(mo14300f);
        snapshot.mo14291o(state);
        return t2;
    }

    /* renamed from: P */
    public static final boolean m5401P(FP5 fp5) {
        HP5 hp5;
        int m10367e = f117456f.m10367e(f117455e) - 1;
        HP5 hp52 = null;
        int i = 0;
        for (HP5 mo13271h = fp5.mo13271h(); mo13271h != null; mo13271h = mo13271h.m103908c()) {
            int m103907d = mo13271h.m103907d();
            if (m103907d != 0) {
                if (m103907d <= m10367e) {
                    if (hp52 == null) {
                        hp52 = mo13271h;
                    } else {
                        if (mo13271h.m103907d() < hp52.m103907d()) {
                            hp5 = hp52;
                            hp52 = mo13271h;
                        } else {
                            hp5 = mo13271h;
                        }
                        hp52.m103905f(0);
                        hp52.mo13268a(hp5);
                        hp52 = hp5;
                    }
                } else {
                    i++;
                }
            }
        }
        if (i < 1) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public static final Void m5400Q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    /* renamed from: R */
    public static final <T extends HP5> T m5399R(T t, int i, C50378vM5 c50378vM5) {
        T t2 = null;
        while (t != null) {
            if (m5389a0(t, i, c50378vM5) && (t2 == null || t2.m103907d() < t.m103907d())) {
                t2 = t;
            }
            t = (T) t.m103908c();
        }
        if (t2 == null) {
            return null;
        }
        return t2;
    }

    /* renamed from: S */
    public static final <T extends HP5> T m5398S(T t, FP5 state) {
        T t2;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        AbstractC48600sM5.C28290a c28290a = AbstractC48600sM5.f108670e;
        AbstractC48600sM5 m14280b = c28290a.m14280b();
        Function1<Object, Unit> mo14298h = m14280b.mo14298h();
        if (mo14298h != null) {
            mo14298h.invoke(state);
        }
        T t3 = (T) m5399R(t, m14280b.mo14300f(), m14280b.mo14299g());
        if (t3 == null) {
            synchronized (m5412E()) {
                AbstractC48600sM5 m14280b2 = c28290a.m14280b();
                HP5 mo13271h = state.mo13271h();
                Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$7");
                t2 = (T) m5399R(mo13271h, m14280b2.mo14300f(), m14280b2.mo14299g());
                if (t2 == null) {
                    m5400Q();
                    throw new KotlinNothingValueException();
                }
            }
            return t2;
        }
        return t3;
    }

    /* renamed from: T */
    public static final void m5397T(int i) {
        f117456f.m10366f(i);
    }

    /* renamed from: U */
    public static final Void m5396U() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    /* renamed from: V */
    public static final <T> T m5395V(AbstractC48600sM5 abstractC48600sM5, Function1<? super C50378vM5, ? extends T> function1) {
        T invoke = function1.invoke(f117454d.m8780j(abstractC48600sM5.mo14300f()));
        synchronized (m5412E()) {
            int i = f117455e;
            f117455e = i + 1;
            f117454d = f117454d.m8780j(abstractC48600sM5.mo14300f());
            f117459i.set(new WC1(i, f117454d));
            abstractC48600sM5.mo1848d();
            f117454d = f117454d.m8776v(i);
            Unit unit = Unit.INSTANCE;
        }
        return invoke;
    }

    /* renamed from: W */
    public static final <T extends AbstractC48600sM5> T m5394W(Function1<? super C50378vM5, ? extends T> function1) {
        return (T) m5364x(new C30137e(function1));
    }

    /* renamed from: X */
    public static final int m5393X(int i, C50378vM5 invalid) {
        int m10371a;
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        int m8778s = invalid.m8778s(i);
        synchronized (m5412E()) {
            m10371a = f117456f.m10371a(m8778s);
        }
        return m10371a;
    }

    /* renamed from: Y */
    public static final HP5 m5392Y(FP5 fp5) {
        int m10367e = f117456f.m10367e(f117455e) - 1;
        C50378vM5 m8775a = C50378vM5.f113941f.m8775a();
        HP5 hp5 = null;
        for (HP5 mo13271h = fp5.mo13271h(); mo13271h != null; mo13271h = mo13271h.m103908c()) {
            if (mo13271h.m103907d() == 0) {
                return mo13271h;
            }
            if (m5389a0(mo13271h, m10367e, m8775a)) {
                if (hp5 == null) {
                    hp5 = mo13271h;
                } else if (mo13271h.m103907d() >= hp5.m103907d()) {
                    return hp5;
                } else {
                    return mo13271h;
                }
            }
        }
        return null;
    }

    /* renamed from: Z */
    public static final boolean m5391Z(int i, int i2, C50378vM5 c50378vM5) {
        return (i2 == 0 || i2 > i || c50378vM5.m8779o(i2)) ? false : true;
    }

    /* renamed from: a0 */
    public static final boolean m5389a0(HP5 hp5, int i, C50378vM5 c50378vM5) {
        return m5391Z(i, hp5.m103907d(), c50378vM5);
    }

    /* renamed from: b0 */
    public static final void m5387b0(AbstractC48600sM5 abstractC48600sM5) {
        if (!f117454d.m8779o(abstractC48600sM5.mo14300f())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    @PublishedApi
    /* renamed from: c0 */
    public static final <T extends HP5> T m5385c0(T t, FP5 state, AbstractC48600sM5 snapshot) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        if (snapshot.mo14297i()) {
            snapshot.mo14291o(state);
        }
        T t2 = (T) m5399R(t, snapshot.mo14300f(), snapshot.mo14299g());
        if (t2 != null) {
            if (t2.m103907d() == snapshot.mo14300f()) {
                return t2;
            }
            T t3 = (T) m5406K(t2, state, snapshot);
            snapshot.mo14291o(state);
            return t3;
        }
        m5400Q();
        throw new KotlinNothingValueException();
    }

    /* renamed from: w */
    public static final C50378vM5 m5365w(C50378vM5 c50378vM5, int i, int i2) {
        Intrinsics.checkNotNullParameter(c50378vM5, "<this>");
        while (i < i2) {
            c50378vM5 = c50378vM5.m8776v(i);
            i++;
        }
        return c50378vM5;
    }

    /* renamed from: x */
    public static final <T> T m5364x(Function1<? super C50378vM5, ? extends T> function1) {
        WC1 wc1;
        T t;
        List mutableList;
        AbstractC48600sM5 abstractC48600sM5 = f117460j;
        Intrinsics.checkNotNull(abstractC48600sM5, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        WC1 wc12 = (WC1) abstractC48600sM5;
        synchronized (m5412E()) {
            wc1 = f117459i.get();
            Intrinsics.checkNotNullExpressionValue(wc1, "currentGlobalSnapshot.get()");
            t = (T) m5395V(wc1, function1);
        }
        Set<FP5> mo90625C = wc1.mo90625C();
        if (mo90625C != null) {
            synchronized (m5412E()) {
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) f117457g);
            }
            int size = mutableList.size();
            for (int i = 0; i < size; i++) {
                ((Function2) mutableList.get(i)).invoke(mo90625C, wc1);
            }
        }
        synchronized (m5412E()) {
            if (mo90625C != null) {
                for (FP5 fp5 : mo90625C) {
                    m5401P(fp5);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        return t;
    }

    /* renamed from: y */
    public static final void m5363y() {
        m5364x(C30133a.f117461g);
    }

    /* renamed from: z */
    public static final AbstractC48600sM5 m5362z(AbstractC48600sM5 abstractC48600sM5, Function1<Object, Unit> function1, boolean z) {
        CX2 cx2;
        boolean z2 = abstractC48600sM5 instanceof CX2;
        if (!z2 && abstractC48600sM5 != null) {
            return new Q96(abstractC48600sM5, function1, false, z);
        }
        if (z2) {
            cx2 = (CX2) abstractC48600sM5;
        } else {
            cx2 = null;
        }
        return new P96(cx2, function1, null, false, z);
    }
}
