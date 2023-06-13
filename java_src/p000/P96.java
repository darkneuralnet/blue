package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020!¢\u0006\u0004\b@\u0010AJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nH\u0016J4\u0010\u0010\u001a\u00020\u00012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nH\u0016J\u000f\u0010\u0011\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R(\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR(\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R$\u0010-\u001a\u00020'2\u0006\u0010(\u001a\u00020'8V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00103\u001a\u00020.2\u0006\u0010(\u001a\u00020.8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R4\u00109\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001042\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001048P@VX\u0090\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u0010<\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006B"}, m28432d2 = {"LP96;", "LCX2;", "", DateTokenConverter.CONVERTER_KEY, "LtM5;", "A", "LFP5;", TransferTable.COLUMN_STATE, "o", "(LFP5;)V", "Lkotlin/Function1;", "", "readObserver", "LsM5;", "v", "writeObserver", "N", "n", "()V", "snapshot", "", "R", "(LsM5;)Ljava/lang/Void;", "S", "LCX2;", "previousSnapshot", "Lkotlin/jvm/functions/Function1;", "getSpecifiedReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "specifiedReadObserver", "p", "getSpecifiedWriteObserver$runtime_release", "specifiedWriteObserver", "", "q", "Z", "mergeParentObservers", "r", "ownsPreviousSnapshot", "", "value", "f", "()I", "t", "(I)V", "id", "LvM5;", "g", "()LvM5;", "u", "(LvM5;)V", "invalid", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()Ljava/util/Set;", "M", "(Ljava/util/Set;)V", "modified", "i", "()Z", "readOnly", "Q", "()LCX2;", "currentSnapshot", "<init>", "(LCX2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: P96 */
/* loaded from: classes.dex */
public final class P96 extends CX2 {

    /* renamed from: n */
    public final CX2 f28032n;

    /* renamed from: o */
    public final Function1<Object, Unit> f28033o;

    /* renamed from: p */
    public final Function1<Object, Unit> f28034p;

    /* renamed from: q */
    public final boolean f28035q;

    /* renamed from: r */
    public final boolean f28036r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public P96(CX2 cx2, Function1<Object, Unit> function1, Function1<Object, Unit> function12, boolean z, boolean z2) {
        super(0, r0, r1, r2);
        AtomicReference atomicReference;
        Function1<Object, Unit> mo14298h;
        Function1 m5410G;
        AtomicReference atomicReference2;
        Function1<Object, Unit> mo14296j;
        Function1 m5408I;
        C50378vM5 m8775a = C50378vM5.f113941f.m8775a();
        if (cx2 == null || (mo14298h = cx2.mo14298h()) == null) {
            atomicReference = C51564xM5.f117459i;
            mo14298h = ((WC1) atomicReference.get()).mo14298h();
        }
        m5410G = C51564xM5.m5410G(function1, mo14298h, z);
        if (cx2 == null || (mo14296j = cx2.mo14296j()) == null) {
            atomicReference2 = C51564xM5.f117459i;
            mo14296j = ((WC1) atomicReference2.get()).mo14296j();
        }
        m5408I = C51564xM5.m5408I(function12, mo14296j);
        this.f28032n = cx2;
        this.f28033o = function1;
        this.f28034p = function12;
        this.f28035q = z;
        this.f28036r = z2;
    }

    @Override // p000.CX2
    /* renamed from: A */
    public AbstractC49193tM5 mo1850A() {
        return m90623Q().mo1850A();
    }

    @Override // p000.CX2
    /* renamed from: C */
    public Set<FP5> mo90625C() {
        return m90623Q().mo90625C();
    }

    @Override // p000.CX2
    /* renamed from: M */
    public void mo90624M(Set<FP5> set) {
        PM5.m90375b();
        throw new KotlinNothingValueException();
    }

    @Override // p000.CX2
    /* renamed from: N */
    public CX2 mo78735N(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        Function1<Object, Unit> m5408I;
        Function1<Object, Unit> m5409H = C51564xM5.m5409H(function1, mo14298h(), false, 4, null);
        m5408I = C51564xM5.m5408I(function12, mo14296j());
        if (!this.f28035q) {
            return new P96(m90623Q().mo78735N(null, m5408I), m5409H, m5408I, false, true);
        }
        return m90623Q().mo78735N(m5409H, m5408I);
    }

    /* renamed from: Q */
    public final CX2 m90623Q() {
        AtomicReference atomicReference;
        CX2 cx2 = this.f28032n;
        if (cx2 == null) {
            atomicReference = C51564xM5.f117459i;
            Object obj = atomicReference.get();
            Intrinsics.checkNotNullExpressionValue(obj, "currentGlobalSnapshot.get()");
            return (CX2) obj;
        }
        return cx2;
    }

    @Override // p000.CX2, p000.AbstractC48600sM5
    /* renamed from: R */
    public Void mo14294l(AbstractC48600sM5 snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        PM5.m90375b();
        throw new KotlinNothingValueException();
    }

    @Override // p000.CX2, p000.AbstractC48600sM5
    /* renamed from: S */
    public Void mo14293m(AbstractC48600sM5 snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        PM5.m90375b();
        throw new KotlinNothingValueException();
    }

    @Override // p000.CX2, p000.AbstractC48600sM5
    /* renamed from: d */
    public void mo1848d() {
        CX2 cx2;
        m14287s(true);
        if (this.f28036r && (cx2 = this.f28032n) != null) {
            cx2.mo1848d();
        }
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: f */
    public int mo14300f() {
        return m90623Q().mo14300f();
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: g */
    public C50378vM5 mo14299g() {
        return m90623Q().mo14299g();
    }

    @Override // p000.CX2, p000.AbstractC48600sM5
    /* renamed from: i */
    public boolean mo14297i() {
        return m90623Q().mo14297i();
    }

    @Override // p000.CX2, p000.AbstractC48600sM5
    /* renamed from: n */
    public void mo14292n() {
        m90623Q().mo14292n();
    }

    @Override // p000.CX2, p000.AbstractC48600sM5
    /* renamed from: o */
    public void mo14291o(FP5 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        m90623Q().mo14291o(state);
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: t */
    public void mo14286t(int i) {
        PM5.m90375b();
        throw new KotlinNothingValueException();
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: u */
    public void mo14285u(C50378vM5 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        PM5.m90375b();
        throw new KotlinNothingValueException();
    }

    @Override // p000.CX2, p000.AbstractC48600sM5
    /* renamed from: v */
    public AbstractC48600sM5 mo14284v(Function1<Object, Unit> function1) {
        AbstractC48600sM5 m5362z;
        Function1<Object, Unit> m5409H = C51564xM5.m5409H(function1, mo14298h(), false, 4, null);
        if (!this.f28035q) {
            m5362z = C51564xM5.m5362z(m90623Q().mo14284v(null), m5409H, true);
            return m5362z;
        }
        return m90623Q().mo14284v(m5409H);
    }
}
