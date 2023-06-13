package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.HttpException;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0007j\u0002`\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u000b\u001a\u00020\u00022\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0007j\u0002`\bH\u0002R+\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, m28432d2 = {"LkJ4;", "Ljava/util/concurrent/Callable;", "LFM4;", "b", "LpI4;", "request", "h", "Lkotlin/Pair;", "Lcom/github/kittinunf/fuel/core/requests/RequestTaskResult;", "c", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "i", "Lkotlin/Function1;", "", "Lcom/github/kittinunf/fuel/core/InterruptCallback;", "Lkotlin/Lazy;", "f", "()Lkotlin/jvm/functions/Function1;", "interruptCallback", "LII4;", "e", "()LII4;", "executor", "Lfk0;", DateTokenConverter.CONVERTER_KEY, "()Lfk0;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "LpI4;", "g", "()LpI4;", "<init>", "(LpI4;)V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: kJ4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC43829kJ4 implements Callable<FM4> {

    /* renamed from: b */
    public final Lazy f94233b;

    /* renamed from: c */
    public final Lazy f94234c;

    /* renamed from: d */
    public final Lazy f94235d;

    /* renamed from: e */
    public final InterfaceC46785pI4 f94236e;

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "com/github/kittinunf/fuel/core/requests/RequestTask$call$3$2$1$1"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: kJ4$a */
    /* loaded from: classes5.dex */
    public static final class C25139a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Throwable f94237g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25139a(Throwable th) {
            super(0);
            this.f94237g = th;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "[RequestTask] execution error\n\r\t" + this.f94237g;
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: kJ4$b */
    /* loaded from: classes5.dex */
    public static final class C25140b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Throwable f94238g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25140b(Throwable th) {
            super(0);
            this.f94238g = th;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("[RequestTask] on failure (interrupted=");
            Object obj = this.f94238g;
            FuelError fuelError = (FuelError) (!(obj instanceof FuelError) ? null : obj);
            if (fuelError != null) {
                obj = Boolean.valueOf(fuelError.m52054b());
            }
            sb.append(obj);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb.toString();
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: kJ4$c */
    /* loaded from: classes5.dex */
    public static final class C25141c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Throwable f94239g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25141c(Throwable th) {
            super(0);
            this.f94239g = th;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "[RequestTask] execution error\n\r\t" + this.f94239g;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lfk0;", "b", "()Lfk0;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: kJ4$d */
    /* loaded from: classes5.dex */
    public static final class C25142d extends Lambda implements Function0<InterfaceC41113fk0> {
        public C25142d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC41113fk0 invoke() {
            return CallableC43829kJ4.this.m29063e().m102550b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LII4;", "b", "()LII4;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: kJ4$e */
    /* loaded from: classes5.dex */
    public static final class C25143e extends Lambda implements Function0<II4> {
        public C25143e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final II4 invoke() {
            return CallableC43829kJ4.this.m29061g().mo8565c();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lkotlin/Function1;", "LpI4;", "", "Lcom/github/kittinunf/fuel/core/InterruptCallback;", "b", "()Lkotlin/jvm/functions/Function1;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: kJ4$f */
    /* loaded from: classes5.dex */
    public static final class C25144f extends Lambda implements Function0<Function1<? super InterfaceC46785pI4, ? extends Unit>> {
        public C25144f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Function1<InterfaceC46785pI4, Unit> invoke() {
            return CallableC43829kJ4.this.m29063e().m102546f();
        }
    }

    public CallableC43829kJ4(InterfaceC46785pI4 request) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(request, "request");
        this.f94236e = request;
        lazy = LazyKt__LazyJVMKt.lazy(new C25144f());
        this.f94233b = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C25143e());
        this.f94234c = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C25142d());
        this.f94235d = lazy3;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FM4 call() throws FuelError {
        Object m116783constructorimpl;
        Object m116783constructorimpl2;
        Pair<? extends InterfaceC46785pI4, FM4> pair;
        Object m116783constructorimpl3;
        Throwable m116786exceptionOrNullimpl;
        Object m116783constructorimpl4;
        Throwable m116786exceptionOrNullimpl2;
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(m29060h(this.f94236e));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
            try {
                m116783constructorimpl2 = Result.m116783constructorimpl(m29065c((InterfaceC46785pI4) m116783constructorimpl));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.Companion;
                m116783constructorimpl = ResultKt.createFailure(th2);
            }
            if (Result.m116790isSuccessimpl(m116783constructorimpl2)) {
                try {
                    pair = (Pair) m116783constructorimpl2;
                    m116783constructorimpl3 = Result.m116783constructorimpl(m29059i(pair));
                    m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl3);
                } catch (Throwable th3) {
                    Result.Companion companion4 = Result.Companion;
                    m116783constructorimpl2 = ResultKt.createFailure(th3);
                }
                if (m116786exceptionOrNullimpl == null) {
                    ResultKt.throwOnFailure(m116783constructorimpl3);
                    m116783constructorimpl4 = Result.m116783constructorimpl((FM4) m116783constructorimpl3);
                    m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116783constructorimpl4);
                    if (m116786exceptionOrNullimpl2 != null) {
                        C47303qA1 c47303qA1 = C47303qA1.f104815c;
                        c47303qA1.m18033b(new C25140b(m116786exceptionOrNullimpl2));
                        if ((m116786exceptionOrNullimpl2 instanceof FuelError) && ((FuelError) m116786exceptionOrNullimpl2).m52054b()) {
                            c47303qA1.m18033b(new C25141c(m116786exceptionOrNullimpl2));
                            m29062f().invoke(this.f94236e);
                        }
                    }
                    ResultKt.throwOnFailure(m116783constructorimpl4);
                    return (FM4) m116783constructorimpl4;
                }
                C47303qA1.f104815c.m18033b(new C25139a(m116786exceptionOrNullimpl));
                throw FuelError.f69982c.m52051a(m116786exceptionOrNullimpl, pair.getSecond());
            }
            m116783constructorimpl4 = Result.m116783constructorimpl(m116783constructorimpl2);
            m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116783constructorimpl4);
            if (m116786exceptionOrNullimpl2 != null) {
            }
            ResultKt.throwOnFailure(m116783constructorimpl4);
            return (FM4) m116783constructorimpl4;
        }
        m116783constructorimpl2 = Result.m116783constructorimpl(m116783constructorimpl);
        if (Result.m116790isSuccessimpl(m116783constructorimpl2)) {
        }
        m116783constructorimpl4 = Result.m116783constructorimpl(m116783constructorimpl2);
        m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116783constructorimpl4);
        if (m116786exceptionOrNullimpl2 != null) {
        }
        ResultKt.throwOnFailure(m116783constructorimpl4);
        return (FM4) m116783constructorimpl4;
    }

    /* renamed from: c */
    public final Pair<InterfaceC46785pI4, FM4> m29065c(InterfaceC46785pI4 interfaceC46785pI4) throws FuelError {
        Object m116783constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(new Pair(interfaceC46785pI4, m29064d().mo40979a(interfaceC46785pI4)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl == null) {
            ResultKt.throwOnFailure(m116783constructorimpl);
            return (Pair) m116783constructorimpl;
        }
        throw FuelError.f69982c.m52051a(m116786exceptionOrNullimpl, new FM4(interfaceC46785pI4.mo8567a(), 0, null, null, 0L, null, 62, null));
    }

    /* renamed from: d */
    public final InterfaceC41113fk0 m29064d() {
        return (InterfaceC41113fk0) this.f94235d.getValue();
    }

    /* renamed from: e */
    public final II4 m29063e() {
        return (II4) this.f94234c.getValue();
    }

    /* renamed from: f */
    public final Function1<InterfaceC46785pI4, Unit> m29062f() {
        return (Function1) this.f94233b.getValue();
    }

    /* renamed from: g */
    public final InterfaceC46785pI4 m29061g() {
        return this.f94236e;
    }

    /* renamed from: h */
    public final InterfaceC46785pI4 m29060h(InterfaceC46785pI4 interfaceC46785pI4) {
        return m29063e().m102543i().invoke(interfaceC46785pI4);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FM4 m29059i(Pair<? extends InterfaceC46785pI4, FM4> pair) throws FuelError {
        Object m116783constructorimpl;
        FM4 fm4;
        Object m116783constructorimpl2;
        Throwable m116786exceptionOrNullimpl;
        InterfaceC46785pI4 component1 = pair.component1();
        FM4 component2 = pair.component2();
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(m29063e().m102541k().invoke(component1, component2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m116790isSuccessimpl(m116783constructorimpl)) {
            try {
                fm4 = (FM4) m116783constructorimpl;
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.Companion;
                m116783constructorimpl = ResultKt.createFailure(th2);
            }
            if (m29063e().m102540l().invoke(fm4).booleanValue()) {
                m116783constructorimpl2 = Result.m116783constructorimpl(fm4);
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl2);
                if (m116786exceptionOrNullimpl != null) {
                    ResultKt.throwOnFailure(m116783constructorimpl2);
                    return (FM4) m116783constructorimpl2;
                }
                throw FuelError.f69982c.m52051a(m116786exceptionOrNullimpl, component2);
            }
            throw FuelError.f69982c.m52051a(new HttpException(fm4.m107280d(), fm4.m107281c()), fm4);
        }
        m116783constructorimpl2 = Result.m116783constructorimpl(m116783constructorimpl);
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl2);
        if (m116786exceptionOrNullimpl != null) {
        }
    }
}
