package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0001\u001a\u00020\u0005H\u0017R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m28432d2 = {"LVy;", "T", "LxU;", "dataInitializer", "()Ljava/lang/Object;", "", "LZC0;", "k", "LZC0;", "getScope$interface_release", "()LZC0;", Action.SCOPE_ATTRIBUTE, "LGX2;", "l", "LGX2;", "R", "()LGX2;", MessageExtension.FIELD_DATA, "Lpy0;", "m", "Lpy0;", "S", "()Lpy0;", "dataHolder", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(LZC0;Landroid/content/Context;)V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Vy */
/* loaded from: classes2.dex */
public abstract class AbstractC8883Vy<T> extends AbstractC30179xU {

    /* renamed from: k */
    public final ZC0 f40138k;

    /* renamed from: l */
    public final GX2<T> f40139l;

    /* renamed from: m */
    public final C47183py0<T> f40140m;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.bluetooth.model.BaseBleManager$initialize$1", m28418f = "BaseBleManager.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Vy$a */
    /* loaded from: classes2.dex */
    public static final class C8884a extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f40141h;

        /* renamed from: i */
        public /* synthetic */ Object f40142i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC8883Vy<T> f40143j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8884a(AbstractC8883Vy<T> abstractC8883Vy, Continuation<? super C8884a> continuation) {
            super(2, continuation);
            this.f40143j = abstractC8883Vy;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C8884a c8884a = new C8884a(this.f40143j, continuation);
            c8884a.f40142i = obj;
            return c8884a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(T t, Continuation<? super Unit> continuation) {
            return ((C8884a) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f40141h == 0) {
                ResultKt.throwOnFailure(obj);
                this.f40143j.m79042S().m18371h(this.f40142i);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8883Vy(ZC0 scope, Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40139l = C50405vP5.m8742a(dataInitializer());
        this.f40140m = new C47183py0<>();
        this.f40138k = scope;
        mo3765T();
    }

    /* renamed from: R */
    public final GX2<T> m79043R() {
        return this.f40139l;
    }

    /* renamed from: S */
    public final C47183py0<T> m79042S() {
        return this.f40140m;
    }

    /* renamed from: T */
    public void mo3765T() {
        ZC0 zc0 = this.f40138k;
        C41318g46.m40163a("smartlock scope " + zc0, new Object[0]);
        m5228K(this.f40140m);
        C36708Vu1.m79279I(C36708Vu1.m79276L(this.f40139l, new C8884a(this, null)), this.f40138k);
        C41318g46.m40163a("launched smartlock coroutine", new Object[0]);
    }

    public abstract T dataInitializer();
}
