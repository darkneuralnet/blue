package p000;

import androidx.lifecycle.LiveData;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C44189kv1;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0004"}, m28432d2 = {"T", "Landroidx/lifecycle/LiveData;", "LEu1;", C17296a.f69688o, "lifecycle-livedata-ktx_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@JvmName(name = "FlowLiveDataConversions")
/* renamed from: kv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44189kv1 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m28432d2 = {"T", "Ln74;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", m28418f = "FlowLiveData.kt", m28417i = {0, 0}, m28416l = {110, 114}, m28415m = "invokeSuspend", m28414n = {"$this$callbackFlow", "observer"}, m28413s = {"L$0", "L$1"})
    /* renamed from: kv1$a */
    /* loaded from: classes.dex */
    public static final class C25549a extends SuspendLambda implements Function2<InterfaceC45497n74<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f95195h;

        /* renamed from: i */
        public int f95196i;

        /* renamed from: j */
        public /* synthetic */ Object f95197j;

        /* renamed from: k */
        public final /* synthetic */ LiveData<T> f95198k;

        @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", m28418f = "FlowLiveData.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: kv1$a$a */
        /* loaded from: classes.dex */
        public static final class C25550a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f95199h;

            /* renamed from: i */
            public final /* synthetic */ LiveData<T> f95200i;

            /* renamed from: j */
            public final /* synthetic */ InterfaceC41056fe3<T> f95201j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25550a(LiveData<T> liveData, InterfaceC41056fe3<T> interfaceC41056fe3, Continuation<? super C25550a> continuation) {
                super(2, continuation);
                this.f95200i = liveData;
                this.f95201j = interfaceC41056fe3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C25550a(this.f95200i, this.f95201j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C25550a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f95199h == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f95200i.observeForever(this.f95201j);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "T", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: kv1$a$b */
        /* loaded from: classes.dex */
        public static final class C25551b extends Lambda implements Function0<Unit> {

            /* renamed from: g */
            public final /* synthetic */ LiveData<T> f95202g;

            /* renamed from: h */
            public final /* synthetic */ InterfaceC41056fe3<T> f95203h;

            @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @DebugMetadata(m28419c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2$1", m28418f = "FlowLiveData.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
            /* renamed from: kv1$a$b$a */
            /* loaded from: classes.dex */
            public static final class C25552a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                /* renamed from: h */
                public int f95204h;

                /* renamed from: i */
                public final /* synthetic */ LiveData<T> f95205i;

                /* renamed from: j */
                public final /* synthetic */ InterfaceC41056fe3<T> f95206j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C25552a(LiveData<T> liveData, InterfaceC41056fe3<T> interfaceC41056fe3, Continuation<? super C25552a> continuation) {
                    super(2, continuation);
                    this.f95205i = liveData;
                    this.f95206j = interfaceC41056fe3;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C25552a(this.f95205i, this.f95206j, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                    return ((C25552a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f95204h == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f95205i.removeObserver(this.f95206j);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25551b(LiveData<T> liveData, InterfaceC41056fe3<T> interfaceC41056fe3) {
                super(0);
                this.f95202g = liveData;
                this.f95203h = interfaceC41056fe3;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                X30.m77507d(VC1.f38731b, T41.m84376c().mo14156G(), null, new C25552a(this.f95202g, this.f95203h, null), 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25549a(LiveData<T> liveData, Continuation<? super C25549a> continuation) {
            super(2, continuation);
            this.f95198k = liveData;
        }

        /* renamed from: f */
        public static final void m28163f(InterfaceC45497n74 interfaceC45497n74, Object obj) {
            interfaceC45497n74.mo2349h(obj);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25549a c25549a = new C25549a(this.f95198k, continuation);
            c25549a.f95197j = obj;
            return c25549a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC45497n74<? super T> interfaceC45497n74, Continuation<? super Unit> continuation) {
            return ((C25549a) create(interfaceC45497n74, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            InterfaceC41056fe3 interfaceC41056fe3;
            InterfaceC45497n74 interfaceC45497n74;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f95196i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC41056fe3 = (InterfaceC41056fe3) this.f95195h;
                interfaceC45497n74 = (InterfaceC45497n74) this.f95197j;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                final InterfaceC45497n74 interfaceC45497n742 = (InterfaceC45497n74) this.f95197j;
                interfaceC41056fe3 = new InterfaceC41056fe3() { // from class: jv1
                    @Override // p000.InterfaceC41056fe3
                    public final void onChanged(Object obj2) {
                        C44189kv1.C25549a.m28163f(InterfaceC45497n74.this, obj2);
                    }
                };
                AbstractC46765pG2 mo14156G = T41.m84376c().mo14156G();
                C25550a c25550a = new C25550a(this.f95198k, interfaceC41056fe3, null);
                this.f95197j = interfaceC45497n742;
                this.f95195h = interfaceC41056fe3;
                this.f95196i = 1;
                if (X30.m77504g(mo14156G, c25550a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC45497n74 = interfaceC45497n742;
            }
            C25551b c25551b = new C25551b(this.f95198k, interfaceC41056fe3);
            this.f95197j = null;
            this.f95195h = null;
            this.f95196i = 2;
            if (C43125j74.m31072a(interfaceC45497n74, c25551b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC32730Eu1<T> m28165a(LiveData<T> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        return C36708Vu1.m79256o(C36708Vu1.m79266e(new C25549a(liveData, null)));
    }
}
