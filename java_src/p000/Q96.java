package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\u00020\u00012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bH\u0016J\u000f\u0010\f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0017\u0010\u001eR(\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010$\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010#R$\u0010+\u001a\u00020%2\u0006\u0010&\u001a\u00020%8V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u00100\u001a\u00020,2\u0006\u0010&\u001a\u00020,8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010-\"\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u00101R\u0014\u00104\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010#¨\u00068"}, m28432d2 = {"LQ96;", "LsM5;", "", DateTokenConverter.CONVERTER_KEY, "LFP5;", TransferTable.COLUMN_STATE, "o", "(LFP5;)V", "Lkotlin/Function1;", "", "readObserver", "v", "n", "()V", "snapshot", "", "z", "(LsM5;)Ljava/lang/Void;", "A", "g", "LsM5;", "previousSnapshot", "", "h", "Z", "mergeParentObservers", "i", "ownsPreviousSnapshot", "j", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "k", "writeObserver", "l", "getRoot", "()LsM5;", "root", "", "value", "f", "()I", "setId$runtime_release", "(I)V", "id", "LvM5;", "()LvM5;", "setInvalid$runtime_release", "(LvM5;)V", "invalid", "()Z", "readOnly", "y", "currentSnapshot", "specifiedReadObserver", "<init>", "(LsM5;Lkotlin/jvm/functions/Function1;ZZ)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Q96 */
/* loaded from: classes.dex */
public final class Q96 extends AbstractC48600sM5 {

    /* renamed from: g */
    public final AbstractC48600sM5 f29903g;

    /* renamed from: h */
    public final boolean f29904h;

    /* renamed from: i */
    public final boolean f29905i;

    /* renamed from: j */
    public final Function1<Object, Unit> f29906j;

    /* renamed from: k */
    public final Function1<Object, Unit> f29907k;

    /* renamed from: l */
    public final AbstractC48600sM5 f29908l;

    public Q96(AbstractC48600sM5 abstractC48600sM5, Function1<Object, Unit> function1, boolean z, boolean z2) {
        super(0, C50378vM5.f113941f.m8775a(), null);
        AtomicReference atomicReference;
        Function1<Object, Unit> mo14298h;
        Function1<Object, Unit> m5410G;
        this.f29903g = abstractC48600sM5;
        this.f29904h = z;
        this.f29905i = z2;
        if (abstractC48600sM5 == null || (mo14298h = abstractC48600sM5.mo14298h()) == null) {
            atomicReference = C51564xM5.f117459i;
            mo14298h = ((WC1) atomicReference.get()).mo14298h();
        }
        m5410G = C51564xM5.m5410G(function1, mo14298h, z);
        this.f29906j = m5410G;
        this.f29908l = this;
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: A */
    public Void mo14293m(AbstractC48600sM5 snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        PM5.m90375b();
        throw new KotlinNothingValueException();
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: d */
    public void mo1848d() {
        AbstractC48600sM5 abstractC48600sM5;
        m14287s(true);
        if (this.f29905i && (abstractC48600sM5 = this.f29903g) != null) {
            abstractC48600sM5.mo1848d();
        }
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: f */
    public int mo14300f() {
        return m88855y().mo14300f();
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: g */
    public C50378vM5 mo14299g() {
        return m88855y().mo14299g();
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: h */
    public Function1<Object, Unit> mo14298h() {
        return this.f29906j;
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: i */
    public boolean mo14297i() {
        return m88855y().mo14297i();
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: j */
    public Function1<Object, Unit> mo14296j() {
        return this.f29907k;
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: n */
    public void mo14292n() {
        m88855y().mo14292n();
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: o */
    public void mo14291o(FP5 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        m88855y().mo14291o(state);
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: v */
    public AbstractC48600sM5 mo14284v(Function1<Object, Unit> function1) {
        AbstractC48600sM5 m5362z;
        Function1<Object, Unit> m5409H = C51564xM5.m5409H(function1, mo14298h(), false, 4, null);
        if (!this.f29904h) {
            m5362z = C51564xM5.m5362z(m88855y().mo14284v(null), m5409H, true);
            return m5362z;
        }
        return m88855y().mo14284v(m5409H);
    }

    /* renamed from: y */
    public final AbstractC48600sM5 m88855y() {
        AtomicReference atomicReference;
        AbstractC48600sM5 abstractC48600sM5 = this.f29903g;
        if (abstractC48600sM5 == null) {
            atomicReference = C51564xM5.f117459i;
            Object obj = atomicReference.get();
            Intrinsics.checkNotNullExpressionValue(obj, "currentGlobalSnapshot.get()");
            return (AbstractC48600sM5) obj;
        }
        return abstractC48600sM5;
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: z */
    public Void mo14294l(AbstractC48600sM5 snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        PM5.m90375b();
        throw new KotlinNothingValueException();
    }
}
