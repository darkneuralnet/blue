package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableMap;
import p000.FR3;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0006\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00020\u0004:\u0001\"B\u0007¢\u0006\u0004\b8\u00106J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\fJ\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J!\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0016\u001a\u00020\u00072\u0014\u0010\u0015\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u0018\u0010\fR$\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR,\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R \u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b\u001a\u0010#R \u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u00020-8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010/R&\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001028@X\u0080\u0004¢\u0006\f\u0012\u0004\b5\u00106\u001a\u0004\b3\u00104¨\u00069"}, m28432d2 = {"LOM5;", "K", "V", "", "LFP5;", "LHP5;", "value", "", "c", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "clear", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "remove", "j", "<set-?>", "b", "LHP5;", "h", "()LHP5;", "firstStateRecord", "", "", "Ljava/util/Set;", C17296a.f69688o, "()Ljava/util/Set;", "entries", DateTokenConverter.CONVERTER_KEY, UserMetadata.KEYDATA_FILENAME, "", "e", "Ljava/util/Collection;", "i", "()Ljava/util/Collection;", "values", "", "g", "()I", "size", "modification", "LOM5$a;", "f", "()LOM5$a;", "getReadable$runtime_release$annotations", "()V", "readable", "<init>", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n154#1:361\n121#1:362\n155#1,2:364\n125#1:366\n157#1,3:373\n162#1:379\n129#1,4:380\n133#1:385\n121#1:386\n134#1,7:388\n125#1:395\n141#1,6:401\n149#1,3:410\n129#1,4:413\n133#1:418\n121#1:419\n134#1,7:421\n125#1:428\n141#1,6:434\n149#1,3:443\n129#1,4:446\n133#1:451\n121#1:452\n134#1,7:454\n125#1:461\n141#1,6:467\n149#1,3:476\n129#1,4:482\n133#1:487\n121#1:488\n134#1,7:490\n125#1:497\n141#1,6:503\n149#1,3:512\n121#1:515\n121#1:528\n125#1:530\n121#1:541\n125#1:543\n2180#2:363\n2073#2,2:367\n1686#2:369\n2075#2,2:371\n2077#2,3:376\n2180#2:387\n2073#2,2:396\n1686#2:398\n2075#2,2:399\n2077#2,3:407\n2180#2:420\n2073#2,2:429\n1686#2:431\n2075#2,2:432\n2077#2,3:440\n2180#2:453\n2073#2,2:462\n1686#2:464\n2075#2,2:465\n2077#2,3:473\n2180#2:489\n2073#2,2:498\n1686#2:500\n2075#2,2:501\n2077#2,3:509\n2180#2:516\n2180#2:517\n2073#2,2:518\n1686#2:520\n2075#2,5:522\n2180#2:529\n2073#2,2:531\n1686#2:533\n2075#2,2:535\n2077#2,3:538\n2180#2:542\n2073#2,2:544\n1686#2:546\n2075#2,2:548\n2077#2,3:551\n70#3:370\n70#3:384\n70#3:417\n70#3:450\n70#3:486\n70#3:521\n70#3:527\n70#3:534\n70#3:537\n70#3:547\n70#3:550\n288#4,2:479\n1#5:481\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n*L\n69#1:361\n69#1:362\n69#1:364,2\n69#1:366\n69#1:373,3\n69#1:379\n70#1:380,4\n70#1:385\n70#1:386\n70#1:388,7\n70#1:395\n70#1:401,6\n70#1:410,3\n71#1:413,4\n71#1:418\n71#1:419\n71#1:421,7\n71#1:428\n71#1:434,6\n71#1:443,3\n72#1:446,4\n72#1:451\n72#1:452\n72#1:454,7\n72#1:461\n72#1:467,6\n72#1:476,3\n85#1:482,4\n85#1:487\n85#1:488\n85#1:490,7\n85#1:497\n85#1:503,6\n85#1:512,3\n117#1:515\n133#1:528\n140#1:530\n154#1:541\n156#1:543\n69#1:363\n69#1:367,2\n69#1:369\n69#1:371,2\n69#1:376,3\n70#1:387\n70#1:396,2\n70#1:398\n70#1:399,2\n70#1:407,3\n71#1:420\n71#1:429,2\n71#1:431\n71#1:432,2\n71#1:440,3\n72#1:453\n72#1:462,2\n72#1:464\n72#1:465,2\n72#1:473,3\n85#1:489\n85#1:498,2\n85#1:500\n85#1:501,2\n85#1:509,3\n117#1:516\n121#1:517\n125#1:518,2\n125#1:520\n125#1:522,5\n133#1:529\n140#1:531,2\n140#1:533\n140#1:535,2\n140#1:538,3\n154#1:542\n156#1:544,2\n156#1:546\n156#1:548,2\n156#1:551,3\n69#1:370\n70#1:384\n71#1:417\n72#1:450\n85#1:486\n125#1:521\n132#1:527\n140#1:534\n141#1:537\n156#1:547\n157#1:550\n77#1:479,2\n*E\n"})
/* renamed from: OM5 */
/* loaded from: classes.dex */
public final class OM5<K, V> implements Map<K, V>, FP5, KMutableMap {

    /* renamed from: b */
    public HP5 f26433b = new C5980a(C34494Mi1.m95010a());

    /* renamed from: c */
    public final Set<Map.Entry<K, V>> f26434c = new C52157yM5(this);

    /* renamed from: d */
    public final Set<K> f26435d = new C52750zM5(this);

    /* renamed from: e */
    public final Collection<V> f26436e = new BM5(this);

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001d\b\u0000\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016R.\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m28432d2 = {"LOM5$a;", "K", "V", "LHP5;", "value", "", C17296a.f69688o, "b", "LFR3;", "c", "LFR3;", "g", "()LFR3;", "i", "(LFR3;)V", "map", "", DateTokenConverter.CONVERTER_KEY, "I", "h", "()I", "j", "(I)V", "modification", "<init>", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,360:1\n70#2:361\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n*L\n174#1:361\n*E\n"})
    /* renamed from: OM5$a */
    /* loaded from: classes.dex */
    public static final class C5980a<K, V> extends HP5 {

        /* renamed from: c */
        public FR3<K, ? extends V> f26437c;

        /* renamed from: d */
        public int f26438d;

        public C5980a(FR3<K, ? extends V> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f26437c = map;
        }

        @Override // p000.HP5
        /* renamed from: a */
        public void mo13268a(HP5 value) {
            Object obj;
            Intrinsics.checkNotNullParameter(value, "value");
            C5980a c5980a = (C5980a) value;
            obj = PM5.f28349a;
            synchronized (obj) {
                this.f26437c = c5980a.f26437c;
                this.f26438d = c5980a.f26438d;
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // p000.HP5
        /* renamed from: b */
        public HP5 mo13267b() {
            return new C5980a(this.f26437c);
        }

        /* renamed from: g */
        public final FR3<K, V> m92374g() {
            return (FR3<K, ? extends V>) this.f26437c;
        }

        /* renamed from: h */
        public final int m92373h() {
            return this.f26438d;
        }

        /* renamed from: i */
        public final void m92372i(FR3<K, ? extends V> fr3) {
            Intrinsics.checkNotNullParameter(fr3, "<set-?>");
            this.f26437c = fr3;
        }

        /* renamed from: j */
        public final void m92371j(int i) {
            this.f26438d = i;
        }
    }

    /* renamed from: a */
    public Set<Map.Entry<K, V>> m92381a() {
        return this.f26434c;
    }

    /* renamed from: b */
    public Set<K> m92380b() {
        return this.f26435d;
    }

    @Override // p000.FP5
    /* renamed from: c */
    public void mo13273c(HP5 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f26433b = (C5980a) value;
    }

    @Override // java.util.Map
    public void clear() {
        AbstractC48600sM5 m14280b;
        Object obj;
        HP5 mo13271h = mo13271h();
        Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        C5980a c5980a = (C5980a) C51564xM5.m5415B((C5980a) mo13271h);
        c5980a.m92374g();
        FR3<K, V> m95010a = C34494Mi1.m95010a();
        if (m95010a != c5980a.m92374g()) {
            HP5 mo13271h2 = mo13271h();
            Intrinsics.checkNotNull(mo13271h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C5980a c5980a2 = (C5980a) mo13271h2;
            C51564xM5.m5411F();
            synchronized (C51564xM5.m5412E()) {
                m14280b = AbstractC48600sM5.f108670e.m14280b();
                C5980a c5980a3 = (C5980a) C51564xM5.m5385c0(c5980a2, this, m14280b);
                obj = PM5.f28349a;
                synchronized (obj) {
                    c5980a3.m92372i(m95010a);
                    c5980a3.m92371j(c5980a3.m92373h() + 1);
                }
            }
            C51564xM5.m5404M(m14280b, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m92378f().m92374g().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return m92378f().m92374g().containsValue(obj);
    }

    /* renamed from: d */
    public final int m92379d() {
        return m92378f().m92373h();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m92381a();
    }

    /* renamed from: f */
    public final C5980a<K, V> m92378f() {
        HP5 mo13271h = mo13271h();
        Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (C5980a) C51564xM5.m5398S((C5980a) mo13271h, this);
    }

    /* renamed from: g */
    public int m92377g() {
        return m92378f().m92374g().size();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return m92378f().m92374g().get(obj);
    }

    @Override // p000.FP5
    /* renamed from: h */
    public HP5 mo13271h() {
        return this.f26433b;
    }

    /* renamed from: i */
    public Collection<V> m92376i() {
        return this.f26436e;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return m92378f().m92374g().isEmpty();
    }

    /* renamed from: j */
    public final boolean m92375j(V v) {
        Object obj;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((Map.Entry) obj).getValue(), v)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return m92380b();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        Object obj;
        FR3<K, V> m92374g;
        int m92373h;
        V put;
        AbstractC48600sM5 m14280b;
        Object obj2;
        boolean z;
        do {
            obj = PM5.f28349a;
            synchronized (obj) {
                HP5 mo13271h = mo13271h();
                Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C5980a c5980a = (C5980a) C51564xM5.m5415B((C5980a) mo13271h);
                m92374g = c5980a.m92374g();
                m92373h = c5980a.m92373h();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(m92374g);
            FR3.InterfaceC2276a<K, V> builder = m92374g.builder();
            put = builder.put(k, v);
            FR3<K, V> build = builder.build();
            if (Intrinsics.areEqual(build, m92374g)) {
                break;
            }
            HP5 mo13271h2 = mo13271h();
            Intrinsics.checkNotNull(mo13271h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C5980a c5980a2 = (C5980a) mo13271h2;
            C51564xM5.m5411F();
            synchronized (C51564xM5.m5412E()) {
                m14280b = AbstractC48600sM5.f108670e.m14280b();
                C5980a c5980a3 = (C5980a) C51564xM5.m5385c0(c5980a2, this, m14280b);
                obj2 = PM5.f28349a;
                synchronized (obj2) {
                    if (c5980a3.m92373h() == m92373h) {
                        c5980a3.m92372i(build);
                        z = true;
                        c5980a3.m92371j(c5980a3.m92373h() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            C51564xM5.m5404M(m14280b, this);
        } while (!z);
        return put;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        Object obj;
        FR3<K, V> m92374g;
        int m92373h;
        AbstractC48600sM5 m14280b;
        Object obj2;
        boolean z;
        Intrinsics.checkNotNullParameter(from, "from");
        do {
            obj = PM5.f28349a;
            synchronized (obj) {
                HP5 mo13271h = mo13271h();
                Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C5980a c5980a = (C5980a) C51564xM5.m5415B((C5980a) mo13271h);
                m92374g = c5980a.m92374g();
                m92373h = c5980a.m92373h();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(m92374g);
            FR3.InterfaceC2276a<K, V> builder = m92374g.builder();
            builder.putAll(from);
            FR3<K, V> build = builder.build();
            if (!Intrinsics.areEqual(build, m92374g)) {
                HP5 mo13271h2 = mo13271h();
                Intrinsics.checkNotNull(mo13271h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C5980a c5980a2 = (C5980a) mo13271h2;
                C51564xM5.m5411F();
                synchronized (C51564xM5.m5412E()) {
                    m14280b = AbstractC48600sM5.f108670e.m14280b();
                    C5980a c5980a3 = (C5980a) C51564xM5.m5385c0(c5980a2, this, m14280b);
                    obj2 = PM5.f28349a;
                    synchronized (obj2) {
                        if (c5980a3.m92373h() == m92373h) {
                            c5980a3.m92372i(build);
                            z = true;
                            c5980a3.m92371j(c5980a3.m92373h() + 1);
                        } else {
                            z = false;
                        }
                    }
                }
                C51564xM5.m5404M(m14280b, this);
            } else {
                return;
            }
        } while (!z);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        Object obj2;
        FR3<K, V> m92374g;
        int m92373h;
        V remove;
        AbstractC48600sM5 m14280b;
        Object obj3;
        boolean z;
        do {
            obj2 = PM5.f28349a;
            synchronized (obj2) {
                HP5 mo13271h = mo13271h();
                Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C5980a c5980a = (C5980a) C51564xM5.m5415B((C5980a) mo13271h);
                m92374g = c5980a.m92374g();
                m92373h = c5980a.m92373h();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(m92374g);
            FR3.InterfaceC2276a<K, V> builder = m92374g.builder();
            remove = builder.remove(obj);
            FR3<K, V> build = builder.build();
            if (Intrinsics.areEqual(build, m92374g)) {
                break;
            }
            HP5 mo13271h2 = mo13271h();
            Intrinsics.checkNotNull(mo13271h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C5980a c5980a2 = (C5980a) mo13271h2;
            C51564xM5.m5411F();
            synchronized (C51564xM5.m5412E()) {
                m14280b = AbstractC48600sM5.f108670e.m14280b();
                C5980a c5980a3 = (C5980a) C51564xM5.m5385c0(c5980a2, this, m14280b);
                obj3 = PM5.f28349a;
                synchronized (obj3) {
                    if (c5980a3.m92373h() == m92373h) {
                        c5980a3.m92372i(build);
                        z = true;
                        c5980a3.m92371j(c5980a3.m92373h() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            C51564xM5.m5404M(m14280b, this);
        } while (!z);
        return remove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m92377g();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m92376i();
    }
}
