package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0011B\u001d\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b \u0010!J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\"\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R*\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, m28432d2 = {"LDM5;", "T", "LFP5;", "LCM5;", "LHP5;", "value", "", "c", "previous", "current", "applied", "e", "", "toString", "LEM5;", "b", "LEM5;", C17296a.f69688o, "()LEM5;", "policy", "LDM5$a;", "LDM5$a;", "next", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "()V", "h", "()LHP5;", "firstStateRecord", "<init>", "(Ljava/lang/Object;LEM5;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,298:1\n2180#2:299\n2101#2,2:300\n1686#2:302\n2103#2,5:304\n2180#2:309\n2180#2:310\n70#3:303\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n*L\n131#1:299\n133#1:300,2\n133#1:302\n133#1:304,5\n174#1:309\n210#1:310\n133#1:303\n*E\n"})
/* renamed from: DM5 */
/* loaded from: classes.dex */
public class DM5<T> implements FP5, CM5<T> {

    /* renamed from: b */
    public final EM5<T> f5550b;

    /* renamed from: c */
    public C1449a<T> f5551c;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\"\u0010\u0003\u001a\u00028\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m28432d2 = {"LDM5$a;", "T", "LHP5;", "value", "", C17296a.f69688o, "b", "c", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "h", "(Ljava/lang/Object;)V", "myValue", "<init>", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: DM5$a */
    /* loaded from: classes.dex */
    public static final class C1449a<T> extends HP5 {

        /* renamed from: c */
        public T f5552c;

        public C1449a(T t) {
            this.f5552c = t;
        }

        @Override // p000.HP5
        /* renamed from: a */
        public void mo13268a(HP5 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5552c = ((C1449a) value).f5552c;
        }

        @Override // p000.HP5
        /* renamed from: b */
        public HP5 mo13267b() {
            return new C1449a(this.f5552c);
        }

        /* renamed from: g */
        public final T m110563g() {
            return this.f5552c;
        }

        /* renamed from: h */
        public final void m110562h(T t) {
            this.f5552c = t;
        }
    }

    public DM5(T t, EM5<T> policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        this.f5550b = policy;
        this.f5551c = new C1449a<>(t);
    }

    @Override // p000.CM5
    /* renamed from: a */
    public EM5<T> mo110564a() {
        return this.f5550b;
    }

    @Override // p000.FP5
    /* renamed from: c */
    public void mo13273c(HP5 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f5551c = (C1449a) value;
    }

    @Override // p000.FP5
    /* renamed from: e */
    public HP5 mo107179e(HP5 previous, HP5 current, HP5 applied) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(applied, "applied");
        C1449a c1449a = (C1449a) previous;
        C1449a c1449a2 = (C1449a) current;
        C1449a c1449a3 = (C1449a) applied;
        if (!mo110564a().mo26703a((T) c1449a2.m110563g(), (T) c1449a3.m110563g())) {
            T m109110b = mo110564a().m109110b((T) c1449a.m110563g(), (T) c1449a2.m110563g(), (T) c1449a3.m110563g());
            if (m109110b != null) {
                HP5 mo13267b = c1449a3.mo13267b();
                Intrinsics.checkNotNull(mo13267b, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$2>");
                ((C1449a) mo13267b).m110562h(m109110b);
                return mo13267b;
            }
            return null;
        }
        return current;
    }

    @Override // p000.EX2, p000.InterfaceC48627sP5
    public T getValue() {
        return (T) ((C1449a) C51564xM5.m5398S(this.f5551c, this)).m110563g();
    }

    @Override // p000.FP5
    /* renamed from: h */
    public HP5 mo13271h() {
        return this.f5551c;
    }

    @Override // p000.EX2
    public void setValue(T t) {
        AbstractC48600sM5 m14280b;
        C1449a c1449a = (C1449a) C51564xM5.m5415B(this.f5551c);
        if (!mo110564a().mo26703a((T) c1449a.m110563g(), t)) {
            C1449a<T> c1449a2 = this.f5551c;
            C51564xM5.m5411F();
            synchronized (C51564xM5.m5412E()) {
                m14280b = AbstractC48600sM5.f108670e.m14280b();
                ((C1449a) C51564xM5.m5402O(c1449a2, this, m14280b, c1449a)).m110562h(t);
                Unit unit = Unit.INSTANCE;
            }
            C51564xM5.m5404M(m14280b, this);
        }
    }

    public String toString() {
        return "MutableState(value=" + ((C1449a) C51564xM5.m5415B(this.f5551c)).m110563g() + ")@" + hashCode();
    }
}
