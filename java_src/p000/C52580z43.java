package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC49193tM5;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0002R\u0017\u0010\u000b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m28432d2 = {"Lz43;", "LCX2;", "", DateTokenConverter.CONVERTER_KEY, "LtM5;", "A", "Q", "n", "LCX2;", "getParent", "()LCX2;", "parent", "", "o", "Z", "deactivated", "", "id", "LvM5;", "invalid", "Lkotlin/Function1;", "", "readObserver", "writeObserver", "<init>", "(ILvM5;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LCX2;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n70#3:2193\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n*L\n1390#1:2192\n1390#1:2193\n*E\n"})
/* renamed from: z43  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52580z43 extends CX2 {

    /* renamed from: n */
    public final CX2 f120741n;

    /* renamed from: o */
    public boolean f120742o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52580z43(int i, C50378vM5 invalid, Function1<Object, Unit> function1, Function1<Object, Unit> function12, CX2 parent) {
        super(i, invalid, function1, function12);
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f120741n = parent;
        parent.mo14294l(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[Catch: all -> 0x00bb, TryCatch #0 {, blocks: (B:13:0x002d, B:15:0x0032, B:18:0x0039, B:22:0x0053, B:24:0x005b, B:25:0x0065, B:27:0x006c, B:29:0x0074, B:30:0x0079, B:26:0x0069), top: B:39:0x002d }] */
    @Override // p000.CX2
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC49193tM5 mo1850A() {
        Map<HP5, ? extends HP5> map;
        if (!this.f120741n.m112172B() && !this.f120741n.m14301e()) {
            Set<FP5> mo90625C = mo90625C();
            int mo14300f = mo14300f();
            if (mo90625C != null) {
                CX2 cx2 = this.f120741n;
                map = C51564xM5.m5403N(cx2, this, cx2.mo14299g());
            } else {
                map = null;
            }
            synchronized (C51564xM5.m5412E()) {
                C51564xM5.m5387b0(this);
                if (mo90625C != null && mo90625C.size() != 0) {
                    AbstractC49193tM5 m112169F = m112169F(this.f120741n.mo14300f(), map, this.f120741n.mo14299g());
                    if (!Intrinsics.areEqual(m112169F, AbstractC49193tM5.C28682b.f110334a)) {
                        return m112169F;
                    }
                    Set<FP5> mo90625C2 = this.f120741n.mo90625C();
                    if (mo90625C2 == null) {
                        mo90625C2 = new HashSet<>();
                        this.f120741n.mo90624M(mo90625C2);
                    }
                    mo90625C2.addAll(mo90625C);
                    if (this.f120741n.mo14300f() < mo14300f) {
                        this.f120741n.m112159z();
                    }
                    CX2 cx22 = this.f120741n;
                    cx22.mo14285u(cx22.mo14299g().m8780j(mo14300f).m8781h(m112171D()));
                    this.f120741n.m112168G(mo14300f);
                    this.f120741n.m112166I(m14283w());
                    this.f120741n.m112167H(m112171D());
                    this.f120741n.m112165J(m112170E());
                    Unit unit = Unit.INSTANCE;
                    m112163L(true);
                    m1849Q();
                    return AbstractC49193tM5.C28682b.f110334a;
                }
                m14303b();
                if (this.f120741n.mo14300f() < mo14300f) {
                }
                CX2 cx222 = this.f120741n;
                cx222.mo14285u(cx222.mo14299g().m8780j(mo14300f).m8781h(m112171D()));
                this.f120741n.m112168G(mo14300f);
                this.f120741n.m112166I(m14283w());
                this.f120741n.m112167H(m112171D());
                this.f120741n.m112165J(m112170E());
                Unit unit2 = Unit.INSTANCE;
                m112163L(true);
                m1849Q();
                return AbstractC49193tM5.C28682b.f110334a;
            }
        }
        return new AbstractC49193tM5.C28681a(this);
    }

    /* renamed from: Q */
    public final void m1849Q() {
        if (!this.f120742o) {
            this.f120742o = true;
            this.f120741n.mo14293m(this);
        }
    }

    @Override // p000.CX2, p000.AbstractC48600sM5
    /* renamed from: d */
    public void mo1848d() {
        if (!m14301e()) {
            super.mo1848d();
            m1849Q();
        }
    }
}
