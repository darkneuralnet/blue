package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC49193tM5;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001BE\b\u0000\u0012\u0006\u0010!\u001a\u00020\u0017\u0012\u0006\u0010R\u001a\u00020\u001c\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\bS\u0010TJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J8\u0010\b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u001e\u0010\f\u001a\u00020\u00012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0016J\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0012J5\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0000¢\u0006\u0004\b \u0010\u0012J\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0017H\u0000¢\u0006\u0004\b$\u0010#J\u0017\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0002H\u0000¢\u0006\u0004\b)\u0010\u0012J\u0017\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u001cH\u0000¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0010¢\u0006\u0004\b/\u00100R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b3\u00102\u001a\u0004\b5\u00104R:\u0010>\u001a\n\u0012\u0004\u0012\u00020-\u0018\u0001062\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020-\u0018\u0001068\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010C\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010,R\"\u0010I\u001a\u00020%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010(R\u0016\u0010*\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010$R\"\u0010P\u001a\u00020J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010M¨\u0006U"}, m28432d2 = {"LCX2;", "LsM5;", "", "y", "Lkotlin/Function1;", "", "readObserver", "writeObserver", "N", "LtM5;", "A", DateTokenConverter.CONVERTER_KEY, "v", "snapshot", "l", "(LsM5;)V", "m", "n", "()V", "c", "q", "O", "P", "", "snapshotId", "", "LHP5;", "optimisticMerges", "LvM5;", "invalidSnapshots", "F", "(ILjava/util/Map;LvM5;)LtM5;", "z", "id", "G", "(I)V", "I", "", "handles", "J", "([I)V", "K", "snapshots", "H", "(LvM5;)V", "LFP5;", TransferTable.COLUMN_STATE, "o", "(LFP5;)V", "g", "Lkotlin/jvm/functions/Function1;", "h", "()Lkotlin/jvm/functions/Function1;", "j", "", "<set-?>", "i", "Ljava/util/Set;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()Ljava/util/Set;", "M", "(Ljava/util/Set;)V", "modified", "LvM5;", "D", "()LvM5;", "setPreviousIds$runtime_release", "previousIds", "k", "[I", "E", "()[I", "setPreviousPinnedSnapshots$runtime_release", "previousPinnedSnapshots", "", "Z", "B", "()Z", "L", "(Z)V", "applied", "readOnly", "invalid", "<init>", "(ILvM5;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2191:1\n955#1,2:2192\n961#1,3:2196\n964#1,6:2201\n955#1,2:2227\n961#1,3:2231\n964#1,6:2236\n955#1,9:2252\n964#1,6:2263\n1686#2:2194\n1686#2:2199\n1686#2:2207\n1686#2:2221\n1686#2:2229\n1686#2:2234\n1686#2:2247\n1686#2:2250\n1686#2:2261\n1686#2:2269\n1686#2:2271\n70#3:2195\n70#3:2200\n70#3:2208\n70#3:2222\n70#3:2230\n70#3:2235\n70#3:2248\n70#3:2251\n70#3:2262\n70#3:2270\n70#3:2272\n33#4,6:2209\n33#4,6:2215\n33#4,4:2243\n38#4:2249\n1855#5,2:2223\n1855#5,2:2225\n184#6:2242\n1#7:2273\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n*L\n661#1:2192,2\n661#1:2196,3\n661#1:2201,6\n786#1:2227,2\n786#1:2231,3\n786#1:2236,6\n972#1:2252,9\n972#1:2263,6\n662#1:2194\n661#1:2199\n710#1:2207\n761#1:2221\n787#1:2229\n786#1:2234\n939#1:2247\n963#1:2250\n972#1:2261\n975#1:2269\n1000#1:2271\n662#1:2195\n661#1:2200\n710#1:2208\n761#1:2222\n787#1:2230\n786#1:2235\n939#1:2248\n963#1:2251\n972#1:2262\n975#1:2270\n1000#1:2272\n747#1:2209,6\n753#1:2215,6\n936#1:2243,4\n936#1:2249\n764#1:2223,2\n765#1:2225,2\n833#1:2242\n*E\n"})
/* renamed from: CX2 */
/* loaded from: classes.dex */
public class CX2 extends AbstractC48600sM5 {

    /* renamed from: g */
    public final Function1<Object, Unit> f4187g;

    /* renamed from: h */
    public final Function1<Object, Unit> f4188h;

    /* renamed from: i */
    public Set<FP5> f4189i;

    /* renamed from: j */
    public C50378vM5 f4190j;

    /* renamed from: k */
    public int[] f4191k;

    /* renamed from: l */
    public int f4192l;

    /* renamed from: m */
    public boolean f4193m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CX2(int i, C50378vM5 invalid, Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        super(i, invalid, null);
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        this.f4187g = function1;
        this.f4188h = function12;
        this.f4190j = C50378vM5.f113941f.m8775a();
        this.f4191k = new int[0];
        this.f4192l = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC49193tM5 mo1850A() {
        Map<HP5, ? extends HP5> map;
        AtomicReference atomicReference;
        Function1 function1;
        List emptyList;
        Pair m28425to;
        List list;
        List mutableList;
        Set<FP5> set;
        boolean z;
        AtomicReference atomicReference2;
        int i;
        Function1 function12;
        List list2;
        List mutableList2;
        AtomicReference atomicReference3;
        AtomicReference atomicReference4;
        Set<FP5> mo90625C = mo90625C();
        if (mo90625C != null) {
            atomicReference3 = C51564xM5.f117459i;
            Object obj = atomicReference3.get();
            Intrinsics.checkNotNullExpressionValue(obj, "currentGlobalSnapshot.get()");
            C50378vM5 c50378vM5 = C51564xM5.f117454d;
            atomicReference4 = C51564xM5.f117459i;
            map = C51564xM5.m5403N((CX2) obj, this, c50378vM5.m8780j(((WC1) atomicReference4.get()).mo14300f()));
        } else {
            map = null;
        }
        synchronized (C51564xM5.m5412E()) {
            C51564xM5.m5387b0(this);
            boolean z2 = true;
            if (mo90625C != null && mo90625C.size() != 0) {
                atomicReference2 = C51564xM5.f117459i;
                WC1 previousGlobalSnapshot = (WC1) atomicReference2.get();
                i = C51564xM5.f117455e;
                AbstractC49193tM5 m112169F = m112169F(i, map, C51564xM5.f117454d.m8780j(previousGlobalSnapshot.mo14300f()));
                if (!Intrinsics.areEqual(m112169F, AbstractC49193tM5.C28682b.f110334a)) {
                    return m112169F;
                }
                mo14302c();
                Intrinsics.checkNotNullExpressionValue(previousGlobalSnapshot, "previousGlobalSnapshot");
                function12 = C51564xM5.f117451a;
                C51564xM5.m5395V(previousGlobalSnapshot, function12);
                Set<FP5> mo90625C2 = previousGlobalSnapshot.mo90625C();
                mo90624M(null);
                previousGlobalSnapshot.mo90624M(null);
                list2 = C51564xM5.f117457g;
                mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) list2);
                m28425to = TuplesKt.m28425to(mutableList2, mo90625C2);
                List list3 = (List) m28425to.component1();
                set = (Set) m28425to.component2();
                this.f4193m = true;
                if (set == null && !set.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    int size = list3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((Function2) list3.get(i2)).invoke(set, this);
                    }
                }
                if (mo90625C != null && !mo90625C.isEmpty()) {
                    z2 = false;
                }
                if (!z2) {
                    int size2 = list3.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((Function2) list3.get(i3)).invoke(mo90625C, this);
                    }
                }
                synchronized (C51564xM5.m5412E()) {
                    mo14289q();
                    if (set != null) {
                        for (FP5 fp5 : set) {
                            C51564xM5.m5401P(fp5);
                        }
                    }
                    if (mo90625C != null) {
                        for (FP5 fp52 : mo90625C) {
                            C51564xM5.m5401P(fp52);
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
                return AbstractC49193tM5.C28682b.f110334a;
            }
            mo14302c();
            atomicReference = C51564xM5.f117459i;
            WC1 previousGlobalSnapshot2 = (WC1) atomicReference.get();
            Intrinsics.checkNotNullExpressionValue(previousGlobalSnapshot2, "previousGlobalSnapshot");
            function1 = C51564xM5.f117451a;
            C51564xM5.m5395V(previousGlobalSnapshot2, function1);
            Set<FP5> mo90625C3 = previousGlobalSnapshot2.mo90625C();
            if (mo90625C3 != null && (!mo90625C3.isEmpty())) {
                list = C51564xM5.f117457g;
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
                m28425to = TuplesKt.m28425to(mutableList, mo90625C3);
            } else {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                m28425to = TuplesKt.m28425to(emptyList, null);
            }
            List list32 = (List) m28425to.component1();
            set = (Set) m28425to.component2();
            this.f4193m = true;
            if (set == null) {
            }
            z = true;
            if (!z) {
            }
            if (mo90625C != null) {
                z2 = false;
            }
            if (!z2) {
            }
            synchronized (C51564xM5.m5412E()) {
            }
        }
    }

    /* renamed from: B */
    public final boolean m112172B() {
        return this.f4193m;
    }

    /* renamed from: C */
    public Set<FP5> mo90625C() {
        return this.f4189i;
    }

    /* renamed from: D */
    public final C50378vM5 m112171D() {
        return this.f4190j;
    }

    /* renamed from: E */
    public final int[] m112170E() {
        return this.f4191k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
        r8 = p000.C51564xM5.m5399R(r6, mo14300f(), r0);
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC49193tM5 m112169F(int i, Map<HP5, ? extends HP5> map, C50378vM5 invalidSnapshots) {
        HP5 m5399R;
        HP5 m5399R2;
        HP5 m5399R3;
        HP5 mo107179e;
        Pair m28425to;
        Intrinsics.checkNotNullParameter(invalidSnapshots, "invalidSnapshots");
        C50378vM5 m8777u = mo14299g().m8776v(mo14300f()).m8777u(this.f4190j);
        Set<FP5> mo90625C = mo90625C();
        Intrinsics.checkNotNull(mo90625C);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (FP5 fp5 : mo90625C) {
            HP5 mo13271h = fp5.mo13271h();
            m5399R = C51564xM5.m5399R(mo13271h, i, invalidSnapshots);
            if (m5399R != null && m5399R2 != null && !Intrinsics.areEqual(m5399R, m5399R2)) {
                m5399R3 = C51564xM5.m5399R(mo13271h, mo14300f(), mo14299g());
                if (m5399R3 != null) {
                    if (map == null || (mo107179e = map.get(m5399R)) == null) {
                        mo107179e = fp5.mo107179e(m5399R2, m5399R, m5399R3);
                    }
                    if (mo107179e == null) {
                        return new AbstractC49193tM5.C28681a(this);
                    }
                    if (!Intrinsics.areEqual(mo107179e, m5399R3)) {
                        if (Intrinsics.areEqual(mo107179e, m5399R)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(TuplesKt.m28425to(fp5, m5399R.mo13267b()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(fp5);
                        } else {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            if (!Intrinsics.areEqual(mo107179e, m5399R2)) {
                                m28425to = TuplesKt.m28425to(fp5, mo107179e);
                            } else {
                                m28425to = TuplesKt.m28425to(fp5, m5399R2.mo13267b());
                            }
                            arrayList.add(m28425to);
                        }
                    }
                } else {
                    C51564xM5.m5400Q();
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (arrayList != null) {
            m112159z();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) arrayList.get(i2);
                FP5 fp52 = (FP5) pair.component1();
                HP5 hp5 = (HP5) pair.component2();
                hp5.m103905f(mo14300f());
                synchronized (C51564xM5.m5412E()) {
                    hp5.m103906e(fp52.mo13271h());
                    fp52.mo13273c(hp5);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        if (arrayList2 != null) {
            mo90625C.removeAll(arrayList2);
        }
        return AbstractC49193tM5.C28682b.f110334a;
    }

    /* renamed from: G */
    public final void m112168G(int i) {
        synchronized (C51564xM5.m5412E()) {
            this.f4190j = this.f4190j.m8776v(i);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: H */
    public final void m112167H(C50378vM5 snapshots) {
        Intrinsics.checkNotNullParameter(snapshots, "snapshots");
        synchronized (C51564xM5.m5412E()) {
            this.f4190j = this.f4190j.m8777u(snapshots);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: I */
    public final void m112166I(int i) {
        int[] plus;
        if (i >= 0) {
            plus = ArraysKt___ArraysJvmKt.plus(this.f4191k, i);
            this.f4191k = plus;
        }
    }

    /* renamed from: J */
    public final void m112165J(int[] handles) {
        boolean z;
        int[] plus;
        Intrinsics.checkNotNullParameter(handles, "handles");
        boolean z2 = true;
        if (handles.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        int[] iArr = this.f4191k;
        if (iArr.length != 0) {
            z2 = false;
        }
        if (!z2) {
            plus = ArraysKt___ArraysJvmKt.plus(iArr, handles);
            this.f4191k = plus;
            return;
        }
        this.f4191k = handles;
    }

    /* renamed from: K */
    public final void m112164K() {
        int length = this.f4191k.length;
        for (int i = 0; i < length; i++) {
            C51564xM5.m5397T(this.f4191k[i]);
        }
    }

    /* renamed from: L */
    public final void m112163L(boolean z) {
        this.f4193m = z;
    }

    /* renamed from: M */
    public void mo90624M(Set<FP5> set) {
        this.f4189i = set;
    }

    /* renamed from: N */
    public CX2 mo78735N(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        int i;
        C52580z43 c52580z43;
        Function1 m5408I;
        int i2;
        m14282x();
        m112161P();
        m112168G(mo14300f());
        synchronized (C51564xM5.m5412E()) {
            i = C51564xM5.f117455e;
            C51564xM5.f117455e = i + 1;
            C51564xM5.f117454d = C51564xM5.f117454d.m8776v(i);
            C50378vM5 mo14299g = mo14299g();
            mo14285u(mo14299g.m8776v(i));
            C50378vM5 m5365w = C51564xM5.m5365w(mo14299g, mo14300f() + 1, i);
            Function1 m5409H = C51564xM5.m5409H(function1, mo14298h(), false, 4, null);
            m5408I = C51564xM5.m5408I(function12, mo14296j());
            c52580z43 = new C52580z43(i, m5365w, m5409H, m5408I, this);
        }
        if (!m112172B() && !m14301e()) {
            int mo14300f = mo14300f();
            synchronized (C51564xM5.m5412E()) {
                i2 = C51564xM5.f117455e;
                C51564xM5.f117455e = i2 + 1;
                mo14286t(i2);
                C51564xM5.f117454d = C51564xM5.f117454d.m8776v(mo14300f());
                Unit unit = Unit.INSTANCE;
            }
            mo14285u(C51564xM5.m5365w(mo14299g(), mo14300f + 1, mo14300f()));
        }
        return c52580z43;
    }

    /* renamed from: O */
    public final void m112162O() {
        if (!(!this.f4193m)) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    /* renamed from: P */
    public final void m112161P() {
        int i;
        boolean z;
        boolean z2 = true;
        if (this.f4193m) {
            i = this.f108675d;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = false;
            }
        }
        if (z2) {
            return;
        }
        throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: c */
    public void mo14302c() {
        C51564xM5.f117454d = C51564xM5.f117454d.m8780j(mo14300f()).m8781h(this.f4190j);
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: d */
    public void mo1848d() {
        if (!m14301e()) {
            super.mo1848d();
            mo14293m(this);
        }
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: h */
    public Function1<Object, Unit> mo14298h() {
        return this.f4187g;
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: i */
    public boolean mo14297i() {
        return false;
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: j */
    public Function1<Object, Unit> mo14296j() {
        return this.f4188h;
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: l */
    public void mo14294l(AbstractC48600sM5 snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.f4192l++;
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: m */
    public void mo14293m(AbstractC48600sM5 snapshot) {
        boolean z;
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        int i = this.f4192l;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = i - 1;
            this.f4192l = i2;
            if (i2 == 0 && !this.f4193m) {
                m112160y();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: n */
    public void mo14292n() {
        if (!this.f4193m && !m14301e()) {
            m112159z();
        }
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: o */
    public void mo14291o(FP5 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Set<FP5> mo90625C = mo90625C();
        if (mo90625C == null) {
            mo90625C = new HashSet<>();
            mo90624M(mo90625C);
        }
        mo90625C.add(state);
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: q */
    public void mo14289q() {
        m112164K();
        super.mo14289q();
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: v */
    public AbstractC48600sM5 mo14284v(Function1<Object, Unit> function1) {
        int i;
        A43 a43;
        int i2;
        m14282x();
        m112161P();
        int mo14300f = mo14300f();
        m112168G(mo14300f());
        synchronized (C51564xM5.m5412E()) {
            i = C51564xM5.f117455e;
            C51564xM5.f117455e = i + 1;
            C51564xM5.f117454d = C51564xM5.f117454d.m8776v(i);
            a43 = new A43(i, C51564xM5.m5365w(mo14299g(), mo14300f + 1, i), function1, this);
        }
        if (!m112172B() && !m14301e()) {
            int mo14300f2 = mo14300f();
            synchronized (C51564xM5.m5412E()) {
                i2 = C51564xM5.f117455e;
                C51564xM5.f117455e = i2 + 1;
                mo14286t(i2);
                C51564xM5.f117454d = C51564xM5.f117454d.m8776v(mo14300f());
                Unit unit = Unit.INSTANCE;
            }
            mo14285u(C51564xM5.m5365w(mo14299g(), mo14300f2 + 1, mo14300f()));
        }
        return a43;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r3 != false) goto L15;
     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m112160y() {
        boolean contains;
        Set<FP5> mo90625C = mo90625C();
        if (mo90625C != null) {
            m112162O();
            mo90624M(null);
            int mo14300f = mo14300f();
            for (FP5 fp5 : mo90625C) {
                for (HP5 mo13271h = fp5.mo13271h(); mo13271h != null; mo13271h = mo13271h.m103908c()) {
                    if (mo13271h.m103907d() != mo14300f) {
                        contains = CollectionsKt___CollectionsKt.contains(this.f4190j, Integer.valueOf(mo13271h.m103907d()));
                    }
                    mo13271h.m103905f(0);
                }
            }
        }
        m14303b();
    }

    /* renamed from: z */
    public final void m112159z() {
        int i;
        m112168G(mo14300f());
        Unit unit = Unit.INSTANCE;
        if (!m112172B() && !m14301e()) {
            int mo14300f = mo14300f();
            synchronized (C51564xM5.m5412E()) {
                i = C51564xM5.f117455e;
                C51564xM5.f117455e = i + 1;
                mo14286t(i);
                C51564xM5.f117454d = C51564xM5.f117454d.m8776v(mo14300f());
            }
            mo14285u(C51564xM5.m5365w(mo14299g(), mo14300f + 1, mo14300f()));
        }
    }
}
