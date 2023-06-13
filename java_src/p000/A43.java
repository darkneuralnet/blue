package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b%\u0010&J\u001e\u0010\u0006\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010\u0007\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0016J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001a¨\u0006'"}, m28432d2 = {"LA43;", "LsM5;", "Lkotlin/Function1;", "", "", "readObserver", "B", "n", "()V", DateTokenConverter.CONVERTER_KEY, "LFP5;", TransferTable.COLUMN_STATE, "", "A", "(LFP5;)Ljava/lang/Void;", "snapshot", "z", "(LsM5;)Ljava/lang/Void;", "y", "g", "LsM5;", "getParent", "()LsM5;", "parent", "h", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "", "i", "()Z", "readOnly", "j", "writeObserver", "", "id", "LvM5;", "invalid", "<init>", "(ILvM5;Lkotlin/jvm/functions/Function1;LsM5;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: A43 */
/* loaded from: classes.dex */
public final class A43 extends AbstractC48600sM5 {

    /* renamed from: g */
    public final AbstractC48600sM5 f95g;

    /* renamed from: h */
    public final Function1<Object, Unit> f96h;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", TransferTable.COLUMN_STATE, "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: A43$a */
    /* loaded from: classes.dex */
    public static final class C0013a extends Lambda implements Function1<Object, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<Object, Unit> f97g;

        /* renamed from: h */
        public final /* synthetic */ Function1<Object, Unit> f98h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0013a(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
            super(1);
            this.f97g = function1;
            this.f98h = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.f97g.invoke(state);
            this.f98h.invoke(state);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A43(int i, C50378vM5 invalid, Function1<Object, Unit> function1, AbstractC48600sM5 parent) {
        super(i, invalid, null);
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f95g = parent;
        parent.mo14294l(this);
        if (function1 != null) {
            Function1<Object, Unit> mo14298h = parent.mo14298h();
            if (mo14298h != null) {
                function1 = new C0013a(function1, mo14298h);
            }
        } else {
            function1 = parent.mo14298h();
        }
        this.f96h = function1;
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: A */
    public Void mo14291o(FP5 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        C51564xM5.m5396U();
        throw new KotlinNothingValueException();
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: B */
    public A43 mo14284v(Function1<Object, Unit> function1) {
        return new A43(mo14300f(), mo14299g(), function1, this.f95g);
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: d */
    public void mo1848d() {
        if (!m14301e()) {
            if (mo14300f() != this.f95g.mo14300f()) {
                m14303b();
            }
            this.f95g.mo14293m(this);
            super.mo1848d();
        }
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: h */
    public Function1<Object, Unit> mo14298h() {
        return this.f96h;
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: i */
    public boolean mo14297i() {
        return true;
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: j */
    public Function1<Object, Unit> mo14296j() {
        return null;
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: n */
    public void mo14292n() {
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: y */
    public Void mo14294l(AbstractC48600sM5 snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        PM5.m90375b();
        throw new KotlinNothingValueException();
    }

    @Override // p000.AbstractC48600sM5
    /* renamed from: z */
    public Void mo14293m(AbstractC48600sM5 snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        PM5.m90375b();
        throw new KotlinNothingValueException();
    }
}
