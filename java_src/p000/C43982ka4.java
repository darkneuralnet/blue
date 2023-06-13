package p000;

import com.adyen.checkout.core.api.Environment;
import com.adyen.checkout.core.exception.CheckoutException;
import com.facebook.share.internal.C17296a;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m28432d2 = {"Lka4;", "", "Lcom/adyen/checkout/core/api/Environment;", "environment", "", "clientKey", C17296a.f69688o, "(Lcom/adyen/checkout/core/api/Environment;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: ka4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43982ka4 {

    @Metadata(m28431k = 3, m28430mv = {1, 5, 1}, m28428xi = 48)
    @DebugMetadata(m28419c = "com.adyen.checkout.card.repository.PublicKeyRepository", m28418f = "PublicKeyRepository.kt", m28417i = {0, 0}, m28416l = {39}, m28415m = "fetchPublicKey", m28414n = {"environment", "clientKey"}, m28413s = {"L$0", "L$1"})
    /* renamed from: ka4$a */
    /* loaded from: classes.dex */
    public static final class C25184a extends ContinuationImpl {

        /* renamed from: h */
        public Object f94532h;

        /* renamed from: i */
        public Object f94533i;

        /* renamed from: j */
        public int f94534j;

        /* renamed from: k */
        public int f94535k;

        /* renamed from: l */
        public /* synthetic */ Object f94536l;

        /* renamed from: n */
        public int f94538n;

        public C25184a(Continuation<? super C25184a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f94536l = obj;
            this.f94538n |= Integer.MIN_VALUE;
            return C43982ka4.this.m28820a(null, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "kotlin.jvm.PlatformType", "<anonymous>"}, m28431k = 3, m28430mv = {1, 5, 1})
    @DebugMetadata(m28419c = "com.adyen.checkout.components.api.ConnectionExtKt$suspendedCall$2", m28418f = "ConnectionExt.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: ka4$b */
    /* loaded from: classes.dex */
    public static final class C25185b extends SuspendLambda implements Function2<ZC0, Continuation<? super String>, Object> {

        /* renamed from: h */
        public int f94539h;

        /* renamed from: i */
        public final /* synthetic */ AbstractCallableC41253fy0 f94540i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25185b(AbstractCallableC41253fy0 abstractCallableC41253fy0, Continuation continuation) {
            super(2, continuation);
            this.f94540i = abstractCallableC41253fy0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25185b(this.f94540i, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super String> continuation) {
            return ((C25185b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f94539h == 0) {
                ResultKt.throwOnFailure(obj);
                return this.f94540i.call();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0083 -> B:33:0x009c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008e -> B:32:0x0093). Please submit an issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m28820a(Environment environment, String str, Continuation<? super String> continuation) {
        C25184a c25184a;
        Object coroutine_suspended;
        int i;
        String str2;
        int i2;
        Environment environment2;
        int i3;
        String str3;
        JSONException e;
        int i4;
        Environment environment3;
        String str4;
        String str5;
        IOException e2;
        String str6;
        if (continuation instanceof C25184a) {
            c25184a = (C25184a) continuation;
            int i5 = c25184a.f94538n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c25184a.f94538n = i5 - Integer.MIN_VALUE;
                Object obj = c25184a.f94536l;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c25184a.f94538n;
                if (i == 0) {
                    if (i == 1) {
                        i3 = c25184a.f94535k;
                        i4 = c25184a.f94534j;
                        str4 = (String) c25184a.f94533i;
                        environment3 = (Environment) c25184a.f94532h;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (IOException e3) {
                            e2 = e3;
                            str6 = C44575la4.f96357a;
                            C32290Cx2.m111211d(str6, "PublicKeyConnection Failed", e2);
                            str3 = str4;
                            i2 = i4 + 1;
                            environment2 = environment3;
                            if (i2 < i3) {
                            }
                        } catch (JSONException e4) {
                            e = e4;
                            str5 = C44575la4.f96357a;
                            C32290Cx2.m111211d(str5, "PublicKeyConnection unexpected result", e);
                            str3 = str4;
                            i2 = i4 + 1;
                            environment2 = environment3;
                            if (i2 < i3) {
                            }
                        }
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                str2 = C44575la4.f96357a;
                C32290Cx2.m111214a(str2, "fetching publicKey from API");
                i2 = 0;
                environment2 = environment;
                i3 = 3;
                str3 = str;
                if (i2 < i3) {
                    Boxing.boxInt(i2).intValue();
                    try {
                    } catch (IOException e5) {
                        environment3 = environment2;
                        i4 = i2;
                        str4 = str3;
                        e2 = e5;
                        str6 = C44575la4.f96357a;
                        C32290Cx2.m111211d(str6, "PublicKeyConnection Failed", e2);
                        str3 = str4;
                        i2 = i4 + 1;
                        environment2 = environment3;
                        if (i2 < i3) {
                        }
                    } catch (JSONException e6) {
                        environment3 = environment2;
                        i4 = i2;
                        str4 = str3;
                        e = e6;
                        str5 = C44575la4.f96357a;
                        C32290Cx2.m111211d(str5, "PublicKeyConnection unexpected result", e);
                        str3 = str4;
                        i2 = i4 + 1;
                        environment2 = environment3;
                        if (i2 < i3) {
                        }
                    }
                    C42203ha4 c42203ha4 = new C42203ha4(environment2, str3);
                    SC0 m84377b = T41.m84377b();
                    C25185b c25185b = new C25185b(c42203ha4, null);
                    c25184a.f94532h = environment2;
                    c25184a.f94533i = str3;
                    c25184a.f94534j = i2;
                    c25184a.f94535k = i3;
                    c25184a.f94538n = 1;
                    obj = X30.m77504g(m84377b, c25185b, c25184a);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return obj;
                }
                throw new CheckoutException("Unable to fetch public key");
            }
        }
        c25184a = new C25184a(continuation);
        Object obj2 = c25184a.f94536l;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c25184a.f94538n;
        if (i == 0) {
        }
    }
}
