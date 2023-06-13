package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a#\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0018\u0010\b\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, m28432d2 = {"T", "Lio/reactivex/K;", C17296a.f69688o, "(Lio/reactivex/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LWc0;", "Lio/reactivex/disposables/c;", DateTokenConverter.CONVERTER_KEY, "", "b", "kotlinx-coroutines-rx2"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: md5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45199md5 {

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, m28432d2 = {"md5$a", "Lio/reactivex/I;", "Lio/reactivex/disposables/c;", DateTokenConverter.CONVERTER_KEY, "", "onSubscribe", "t", "onSuccess", "(Ljava/lang/Object;)V", "", "error", "onError", "kotlinx-coroutines-rx2"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: md5$a */
    /* loaded from: classes8.dex */
    public static final class C26141a implements InterfaceC23445I<T> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC36779Wc0<T> f98456b;

        /* JADX WARN: Multi-variable type inference failed */
        public C26141a(InterfaceC36779Wc0<? super T> interfaceC36779Wc0) {
            this.f98456b = interfaceC36779Wc0;
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            Continuation continuation = this.f98456b;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(th)));
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            C45199md5.m25302b(this.f98456b, interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            this.f98456b.resumeWith(Result.m116783constructorimpl(t));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: md5$b */
    /* loaded from: classes8.dex */
    public static final class C26142b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC23465c f98457g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26142b(InterfaceC23465c interfaceC23465c) {
            super(1);
            this.f98457g = interfaceC23465c;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f98457g.dispose();
        }
    }

    /* renamed from: a */
    public static final <T> Object m25303a(InterfaceC23447K<T> interfaceC23447K, Continuation<? super T> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.m76766u();
        interfaceC23447K.mo33096a(new C26141a(c37013Xc0));
        Object m76770q = c37013Xc0.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m76770q;
    }

    /* renamed from: b */
    public static final void m25302b(InterfaceC36779Wc0<?> interfaceC36779Wc0, InterfaceC23465c interfaceC23465c) {
        interfaceC36779Wc0.mo76794H(new C26142b(interfaceC23465c));
    }
}
