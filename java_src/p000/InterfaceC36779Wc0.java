package p000;

import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J%\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\tH'J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0004H'J\u0014\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tH&J1\u0010\u0019\u001a\u00020\r2'\u0010\u0018\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u0017H&J\u001b\u0010\u001b\u001a\u00020\r*\u00020\u001a2\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b\u001b\u0010\u001cJ<\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00028\u00002#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH'¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m28432d2 = {"LWc0;", "T", "Lkotlin/coroutines/Continuation;", "value", "", "idempotent", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "onCancellation", "X", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "exception", "L", "token", "B", "", "v", "Lkotlinx/coroutines/CompletionHandler;", "handler", "H", "LSC0;", "S", "(LSC0;Ljava/lang/Object;)V", "t", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "c", "()Z", "isCompleted", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Wc0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC36779Wc0<T> extends Continuation<T> {

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Wc0$a */
    /* loaded from: classes8.dex */
    public static final class C9110a {
        /* renamed from: a */
        public static /* synthetic */ boolean m78140a(InterfaceC36779Wc0 interfaceC36779Wc0, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return interfaceC36779Wc0.mo76765v(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static /* synthetic */ Object m78139b(InterfaceC36779Wc0 interfaceC36779Wc0, Object obj, Object obj2, int i, Object obj3) {
            if (obj3 == null) {
                if ((i & 2) != 0) {
                    obj2 = null;
                }
                return interfaceC36779Wc0.mo76799C(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    /* renamed from: B */
    void mo76800B(Object obj);

    /* renamed from: C */
    Object mo76799C(T t, Object obj);

    /* renamed from: H */
    void mo76794H(Function1<? super Throwable, Unit> function1);

    /* renamed from: L */
    Object mo76790L(Throwable th);

    /* renamed from: S */
    void mo76787S(SC0 sc0, T t);

    /* renamed from: X */
    Object mo76786X(T t, Object obj, Function1<? super Throwable, Unit> function1);

    /* renamed from: c */
    boolean mo76783c();

    /* renamed from: t */
    void mo76767t(T t, Function1<? super Throwable, Unit> function1);

    /* renamed from: v */
    boolean mo76765v(Throwable th);
}
