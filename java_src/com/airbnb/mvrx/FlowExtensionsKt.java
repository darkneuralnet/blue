package com.airbnb.mvrx;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
@Metadata(m28433d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001az\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00060\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a<\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u0013\u001a\u00020\u0005H\u0000\u001a\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"T", "LEu1;", "LLifecycleOwner;", "lifecycleOwner", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "lastDeliveredStates", "", "activeSubscriptions", "La01;", "deliveryMode", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "action", "Lzh2;", "c", "(LEu1;LLifecycleOwner;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/Set;La01;Lkotlin/jvm/functions/Function2;)Lzh2;", "subscriptionId", "b", DateTokenConverter.CONVERTER_KEY, "mvrx_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FlowExtensionsKt {

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, m28432d2 = {"T", "LGu1;", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.FlowExtensionsKt$assertOneActiveSubscription$1", m28418f = "FlowExtensions.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.airbnb.mvrx.FlowExtensionsKt$a */
    /* loaded from: classes2.dex */
    public static final class C16859a extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super T>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f68491h;

        /* renamed from: i */
        public final /* synthetic */ Set<String> f68492i;

        /* renamed from: j */
        public final /* synthetic */ String f68493j;

        /* renamed from: k */
        public final /* synthetic */ LifecycleOwner f68494k;

        /* renamed from: l */
        public final /* synthetic */ FlowExtensionsKt$assertOneActiveSubscription$observer$1 f68495l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16859a(Set<String> set, String str, LifecycleOwner lifecycleOwner, FlowExtensionsKt$assertOneActiveSubscription$observer$1 flowExtensionsKt$assertOneActiveSubscription$observer$1, Continuation<? super C16859a> continuation) {
            super(3, continuation);
            this.f68492i = set;
            this.f68493j = str;
            this.f68494k = lifecycleOwner;
            this.f68495l = flowExtensionsKt$assertOneActiveSubscription$observer$1;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: e */
        public final Object invoke(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Throwable th, Continuation<? super Unit> continuation) {
            return new C16859a(this.f68492i, this.f68493j, this.f68494k, this.f68495l, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f68491h == 0) {
                ResultKt.throwOnFailure(obj);
                this.f68492i.remove(this.f68493j);
                this.f68494k.getLifecycle().mo67006d(this.f68495l);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.FlowExtensionsKt$collectLatest$1", m28418f = "FlowExtensions.kt", m28417i = {}, m28416l = {43, 44}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.airbnb.mvrx.FlowExtensionsKt$b */
    /* loaded from: classes2.dex */
    public static final class C16860b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f68496h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC32730Eu1<T> f68497i;

        /* renamed from: j */
        public final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> f68498j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16860b(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C16860b> continuation) {
            super(2, continuation);
            this.f68497i = interfaceC32730Eu1;
            this.f68498j = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C16860b(this.f68497i, this.f68498j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C16860b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f68496h;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.f68496h = 1;
                if (C40857fI6.m41600a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            InterfaceC32730Eu1<T> interfaceC32730Eu1 = this.f68497i;
            Function2<T, Continuation<? super Unit>, Object> function2 = this.f68498j;
            this.f68496h = 2;
            if (C36708Vu1.m79261j(interfaceC32730Eu1, function2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.FlowExtensionsKt$collectLatest$flow$1", m28418f = "FlowExtensions.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.airbnb.mvrx.FlowExtensionsKt$c */
    /* loaded from: classes2.dex */
    public static final class C16861c extends SuspendLambda implements Function2<T, Continuation<? super Boolean>, Object> {

        /* renamed from: h */
        public int f68499h;

        /* renamed from: i */
        public /* synthetic */ Object f68500i;

        /* renamed from: j */
        public final /* synthetic */ ConcurrentHashMap<String, Object> f68501j;

        /* renamed from: k */
        public final /* synthetic */ AbstractC37698a01 f68502k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16861c(ConcurrentHashMap<String, Object> concurrentHashMap, AbstractC37698a01 abstractC37698a01, Continuation<? super C16861c> continuation) {
            super(2, continuation);
            this.f68501j = concurrentHashMap;
            this.f68502k = abstractC37698a01;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C16861c c16861c = new C16861c(this.f68501j, this.f68502k, continuation);
            c16861c.f68500i = obj;
            return c16861c;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(T t, Continuation<? super Boolean> continuation) {
            return ((C16861c) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f68499h == 0) {
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.f68500i;
                if (this.f68501j.containsKey(this.f68502k.mo37364b()) && Intrinsics.areEqual(obj2, this.f68501j.get(this.f68502k.mo37364b()))) {
                    z = true;
                } else {
                    z = false;
                }
                return Boxing.boxBoolean(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.FlowExtensionsKt$collectLatest$flow$2", m28418f = "FlowExtensions.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.airbnb.mvrx.FlowExtensionsKt$d */
    /* loaded from: classes2.dex */
    public static final class C16862d extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f68503h;

        /* renamed from: i */
        public /* synthetic */ Object f68504i;

        /* renamed from: j */
        public final /* synthetic */ ConcurrentHashMap<String, Object> f68505j;

        /* renamed from: k */
        public final /* synthetic */ AbstractC37698a01 f68506k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16862d(ConcurrentHashMap<String, Object> concurrentHashMap, AbstractC37698a01 abstractC37698a01, Continuation<? super C16862d> continuation) {
            super(2, continuation);
            this.f68505j = concurrentHashMap;
            this.f68506k = abstractC37698a01;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C16862d c16862d = new C16862d(this.f68505j, this.f68506k, continuation);
            c16862d.f68504i = obj;
            return c16862d;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(T t, Continuation<? super Unit> continuation) {
            return ((C16862d) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f68503h == 0) {
                ResultKt.throwOnFailure(obj);
                this.f68505j.put(this.f68506k.mo37364b(), this.f68504i);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.airbnb.mvrx.FlowExtensionsKt$assertOneActiveSubscription$observer$1, Fq2] */
    /* renamed from: b */
    public static final <T> InterfaceC32730Eu1<T> m53532b(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, LifecycleOwner lifecycleOwner, final Set<String> activeSubscriptions, final String subscriptionId) {
        Intrinsics.checkNotNullParameter(interfaceC32730Eu1, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(activeSubscriptions, "activeSubscriptions");
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        ?? r5 = new VX0() { // from class: com.airbnb.mvrx.FlowExtensionsKt$assertOneActiveSubscription$observer$1
            @Override // p000.VX0
            public void onCreate(LifecycleOwner owner) {
                String m53530d;
                Intrinsics.checkNotNullParameter(owner, "owner");
                if (!activeSubscriptions.contains(subscriptionId)) {
                    activeSubscriptions.add(subscriptionId);
                } else {
                    m53530d = FlowExtensionsKt.m53530d(subscriptionId);
                    throw new IllegalStateException(m53530d.toString());
                }
            }

            @Override // p000.VX0
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                activeSubscriptions.remove(subscriptionId);
            }
        };
        lifecycleOwner.getLifecycle().mo67008a(r5);
        return C36708Vu1.m79277K(interfaceC32730Eu1, new C16859a(activeSubscriptions, subscriptionId, lifecycleOwner, r5, null));
    }

    /* renamed from: c */
    public static final <T> InterfaceC52943zh2 m53531c(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, LifecycleOwner lifecycleOwner, ConcurrentHashMap<String, Object> lastDeliveredStates, Set<String> activeSubscriptions, AbstractC37698a01 deliveryMode, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> action) {
        InterfaceC52943zh2 m73800d;
        Intrinsics.checkNotNullParameter(interfaceC32730Eu1, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(lastDeliveredStates, "lastDeliveredStates");
        Intrinsics.checkNotNullParameter(activeSubscriptions, "activeSubscriptions");
        Intrinsics.checkNotNullParameter(deliveryMode, "deliveryMode");
        Intrinsics.checkNotNullParameter(action, "action");
        Boolean FORCE_DISABLE_LIFECYCLE_AWARE_OBSERVER = FN2.f9263a;
        Intrinsics.checkNotNullExpressionValue(FORCE_DISABLE_LIFECYCLE_AWARE_OBSERVER, "FORCE_DISABLE_LIFECYCLE_AWARE_OBSERVER");
        if (!FORCE_DISABLE_LIFECYCLE_AWARE_OBSERVER.booleanValue()) {
            if (deliveryMode instanceof C35624Rd6) {
                interfaceC32730Eu1 = C36708Vu1.m79276L(C36708Vu1.m79255p(MavericksLifecycleAwareFlowKt.m53525b(C36708Vu1.m79253r(m53532b(interfaceC32730Eu1, lifecycleOwner, activeSubscriptions, deliveryMode.mo37364b()), new C16861c(lastDeliveredStates, deliveryMode, null)), lifecycleOwner)), new C16862d(lastDeliveredStates, deliveryMode, null));
            } else {
                interfaceC32730Eu1 = MavericksLifecycleAwareFlowKt.m53525b(interfaceC32730Eu1, lifecycleOwner);
            }
        }
        m73800d = Z30.m73800d(C37824aD0.m71784g(C33163Gq2.m104689a(lifecycleOwner), C48014rN2.f106907a.m16036a().m83711c()), null, EnumC38417bD0.UNDISPATCHED, new C16860b(interfaceC32730Eu1, action, null), 1, null);
        return m73800d;
    }

    /* renamed from: d */
    public static final String m53530d(String str) {
        String trimIndent;
        trimIndent = StringsKt__IndentKt.trimIndent("\n        Subscribing with a duplicate subscription id: " + str + ".\n        If you have multiple uniqueOnly subscriptions in a Mavericks view that listen to the same properties\n        you must use a custom subscription id. If you are using a custom MavericksView, make sure you are using the proper\n        lifecycle owner. See BaseMvRxFragment for an example.\n");
        return trimIndent;
    }
}
