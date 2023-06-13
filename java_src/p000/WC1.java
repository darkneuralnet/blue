package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J4\u0010\t\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0010\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016¨\u0006\u001a"}, m28432d2 = {"LWC1;", "LCX2;", "Lkotlin/Function1;", "", "", "readObserver", "LsM5;", "v", "writeObserver", "N", "n", "()V", "snapshot", "", "R", "(LsM5;)Ljava/lang/Void;", "Q", "LtM5;", "A", DateTokenConverter.CONVERTER_KEY, "", "id", "LvM5;", "invalid", "<init>", "(ILvM5;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n1686#2:2194\n70#3:2193\n70#3:2195\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n*L\n1292#1:2192\n1346#1:2194\n1292#1:2193\n1346#1:2195\n*E\n"})
/* renamed from: WC1 */
/* loaded from: classes.dex */
public final class WC1 extends CX2 {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", TransferTable.COLUMN_STATE, "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,2191:1\n33#2,6:2192\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$1$1$1\n*L\n1303#1:2192,6\n*E\n"})
    /* renamed from: WC1$a */
    /* loaded from: classes.dex */
    public static final class C8951a extends Lambda implements Function1<Object, Unit> {

        /* renamed from: g */
        public final /* synthetic */ List<Function1<Object, Unit>> f40541g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8951a(List<Function1<Object, Unit>> list) {
            super(1);
            this.f40541g = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object state) {
            Intrinsics.checkNotNullParameter(state, "state");
            List<Function1<Object, Unit>> list = this.f40541g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).invoke(state);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LvM5;", "invalid", "LCX2;", C17296a.f69688o, "(LvM5;)LCX2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedMutableSnapshot$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n70#3:2193\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedMutableSnapshot$1\n*L\n1323#1:2192\n1323#1:2193\n*E\n"})
    /* renamed from: WC1$b */
    /* loaded from: classes.dex */
    public static final class C8952b extends Lambda implements Function1<C50378vM5, CX2> {

        /* renamed from: g */
        public final /* synthetic */ Function1<Object, Unit> f40542g;

        /* renamed from: h */
        public final /* synthetic */ Function1<Object, Unit> f40543h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8952b(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
            super(1);
            this.f40542g = function1;
            this.f40543h = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CX2 invoke(C50378vM5 invalid) {
            int i;
            Intrinsics.checkNotNullParameter(invalid, "invalid");
            synchronized (C51564xM5.m5412E()) {
                i = C51564xM5.f117455e;
                C51564xM5.f117455e = i + 1;
            }
            return new CX2(i, invalid, this.f40542g, this.f40543h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LvM5;", "invalid", "LYr4;", C17296a.f69688o, "(LvM5;)LYr4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedSnapshot$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n70#3:2193\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedSnapshot$1\n*L\n1312#1:2192\n1312#1:2193\n*E\n"})
    /* renamed from: WC1$c */
    /* loaded from: classes.dex */
    public static final class C8953c extends Lambda implements Function1<C50378vM5, C37386Yr4> {

        /* renamed from: g */
        public final /* synthetic */ Function1<Object, Unit> f40544g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8953c(Function1<Object, Unit> function1) {
            super(1);
            this.f40544g = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C37386Yr4 invoke(C50378vM5 invalid) {
            int i;
            Intrinsics.checkNotNullParameter(invalid, "invalid");
            synchronized (C51564xM5.m5412E()) {
                i = C51564xM5.f117455e;
                C51564xM5.f117455e = i + 1;
            }
            return new C37386Yr4(i, invalid, this.f40544g);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WC1(int i, C50378vM5 invalid) {
        super(i, invalid, null, r3);
        List list;
        List list2;
        Function1 function1;
        Object singleOrNull;
        List list3;
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        synchronized (C51564xM5.m5412E()) {
            list = C51564xM5.f117458h;
            if (!list.isEmpty()) {
                list3 = C51564xM5.f117458h;
                list2 = CollectionsKt___CollectionsKt.toMutableList((Collection) list3);
            } else {
                list2 = null;
            }
            if (list2 != null) {
                singleOrNull = CollectionsKt___CollectionsKt.singleOrNull((List<? extends Object>) list2);
                function1 = (Function1) singleOrNull;
                if (function1 == null) {
                    function1 = new C8951a(list2);
                }
            } else {
                function1 = null;
            }
        }
    }

    @Override // p000.CX2
    /* renamed from: A */
    public AbstractC49193tM5 mo1850A() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // p000.CX2
    /* renamed from: N */
    public CX2 mo78735N(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        AbstractC48600sM5 m5394W;
        m5394W = C51564xM5.m5394W(new C8952b(function1, function12));
        return (CX2) m5394W;
    }

    @Override // p000.CX2, p000.AbstractC48600sM5
    /* renamed from: Q */
    public Void mo14294l(AbstractC48600sM5 snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        PM5.m90375b();
        throw new KotlinNothingValueException();
    }

    @Override // p000.CX2, p000.AbstractC48600sM5
    /* renamed from: R */
    public Void mo14293m(AbstractC48600sM5 snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        PM5.m90375b();
        throw new KotlinNothingValueException();
    }

    @Override // p000.CX2, p000.AbstractC48600sM5
    /* renamed from: d */
    public void mo1848d() {
        synchronized (C51564xM5.m5412E()) {
            m14290p();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p000.CX2, p000.AbstractC48600sM5
    /* renamed from: n */
    public void mo14292n() {
        C51564xM5.m5363y();
    }

    @Override // p000.CX2, p000.AbstractC48600sM5
    /* renamed from: v */
    public AbstractC48600sM5 mo14284v(Function1<Object, Unit> function1) {
        AbstractC48600sM5 m5394W;
        m5394W = C51564xM5.m5394W(new C8953c(function1));
        return m5394W;
    }
}
