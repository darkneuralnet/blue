package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
@Metadata(m28433d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m28432d2 = {"T", "LEu1;", "", "count", C17296a.f69688o, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "predicate", "b", "(LEu1;Lkotlin/jvm/functions/Function2;)LEu1;", "kotlinx-coroutines-core"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: dv1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C40038dv1 {

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"dv1$a", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: dv1$a */
    /* loaded from: classes8.dex */
    public static final class C19902a implements InterfaceC32730Eu1<T> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f77412b;

        /* renamed from: c */
        public final /* synthetic */ int f77413c;

        public C19902a(InterfaceC32730Eu1 interfaceC32730Eu1, int i) {
            this.f77412b = interfaceC32730Eu1;
            this.f77413c = i;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object collect = this.f77412b.collect(new C19903b(new Ref.IntRef(), this.f77413c, interfaceC33198Gu1), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: dv1$b */
    /* loaded from: classes8.dex */
    public static final class C19903b<T> implements InterfaceC33198Gu1 {

        /* renamed from: b */
        public final /* synthetic */ Ref.IntRef f77414b;

        /* renamed from: c */
        public final /* synthetic */ int f77415c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC33198Gu1<T> f77416d;

        @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", m28418f = "Limit.kt", m28417i = {}, m28416l = {25}, m28415m = "emit", m28414n = {}, m28413s = {})
        /* renamed from: dv1$b$a */
        /* loaded from: classes8.dex */
        public static final class C19904a extends ContinuationImpl {

            /* renamed from: h */
            public /* synthetic */ Object f77417h;

            /* renamed from: i */
            public final /* synthetic */ C19903b<T> f77418i;

            /* renamed from: j */
            public int f77419j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C19904a(C19903b<? super T> c19903b, Continuation<? super C19904a> continuation) {
                super(continuation);
                this.f77418i = c19903b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f77417h = obj;
                this.f77419j |= Integer.MIN_VALUE;
                return this.f77418i.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C19903b(Ref.IntRef intRef, int i, InterfaceC33198Gu1<? super T> interfaceC33198Gu1) {
            this.f77414b = intRef;
            this.f77415c = i;
            this.f77416d = interfaceC33198Gu1;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // p000.InterfaceC33198Gu1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            C19904a c19904a;
            Object coroutine_suspended;
            int i;
            if (continuation instanceof C19904a) {
                c19904a = (C19904a) continuation;
                int i2 = c19904a.f77419j;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c19904a.f77419j = i2 - Integer.MIN_VALUE;
                    Object obj = c19904a.f77417h;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c19904a.f77419j;
                    if (i == 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        Ref.IntRef intRef = this.f77414b;
                        int i3 = intRef.element;
                        if (i3 >= this.f77415c) {
                            InterfaceC33198Gu1<T> interfaceC33198Gu1 = this.f77416d;
                            c19904a.f77419j = 1;
                            if (interfaceC33198Gu1.emit(t, c19904a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            intRef.element = i3 + 1;
                            return Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            c19904a = new C19904a(this, continuation);
            Object obj2 = c19904a.f77417h;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c19904a.f77419j;
            if (i == 0) {
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"dv1$c", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: dv1$c */
    /* loaded from: classes8.dex */
    public static final class C19905c implements InterfaceC32730Eu1<T> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f77420b;

        /* renamed from: c */
        public final /* synthetic */ Function2 f77421c;

        public C19905c(InterfaceC32730Eu1 interfaceC32730Eu1, Function2 function2) {
            this.f77420b = interfaceC32730Eu1;
            this.f77421c = function2;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object collect = this.f77420b.collect(new C19906d(new Ref.BooleanRef(), interfaceC33198Gu1, this.f77421c), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (collect == coroutine_suspended) {
                return collect;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: dv1$d */
    /* loaded from: classes8.dex */
    public static final class C19906d<T> implements InterfaceC33198Gu1 {

        /* renamed from: b */
        public final /* synthetic */ Ref.BooleanRef f77422b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC33198Gu1<T> f77423c;

        /* renamed from: d */
        public final /* synthetic */ Function2<T, Continuation<? super Boolean>, Object> f77424d;

        @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", m28418f = "Limit.kt", m28417i = {1, 1}, m28416l = {37, 38, 40}, m28415m = "emit", m28414n = {"this", "value"}, m28413s = {"L$0", "L$1"})
        /* renamed from: dv1$d$a */
        /* loaded from: classes8.dex */
        public static final class C19907a extends ContinuationImpl {

            /* renamed from: h */
            public Object f77425h;

            /* renamed from: i */
            public Object f77426i;

            /* renamed from: j */
            public /* synthetic */ Object f77427j;

            /* renamed from: k */
            public final /* synthetic */ C19906d<T> f77428k;

            /* renamed from: l */
            public int f77429l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C19907a(C19906d<? super T> c19906d, Continuation<? super C19907a> continuation) {
                super(continuation);
                this.f77428k = c19906d;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f77427j = obj;
                this.f77429l |= Integer.MIN_VALUE;
                return this.f77428k.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C19906d(Ref.BooleanRef booleanRef, InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
            this.f77422b = booleanRef;
            this.f77423c = interfaceC33198Gu1;
            this.f77424d = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        @Override // p000.InterfaceC33198Gu1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            C19907a c19907a;
            Object coroutine_suspended;
            int i;
            C19906d<T> c19906d;
            if (continuation instanceof C19907a) {
                c19907a = (C19907a) continuation;
                int i2 = c19907a.f77429l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c19907a.f77429l = i2 - Integer.MIN_VALUE;
                    Object obj = c19907a.f77427j;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c19907a.f77429l;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    ResultKt.throwOnFailure(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                t = (T) c19907a.f77426i;
                                c19906d = (C19906d) c19907a.f77425h;
                                ResultKt.throwOnFailure(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    c19906d.f77422b.element = true;
                                    c19907a.f77425h = null;
                                    c19907a.f77426i = null;
                                    c19907a.f77429l = 3;
                                    if (c19906d.f77423c.emit(t, c19907a) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    return Unit.INSTANCE;
                                }
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        if (this.f77422b.element) {
                            InterfaceC33198Gu1<T> interfaceC33198Gu1 = this.f77423c;
                            c19907a.f77429l = 1;
                            if (interfaceC33198Gu1.emit(t, c19907a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        Function2<T, Continuation<? super Boolean>, Object> function2 = this.f77424d;
                        c19907a.f77425h = this;
                        c19907a.f77426i = t;
                        c19907a.f77429l = 2;
                        obj = function2.invoke(t, c19907a);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c19906d = this;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            c19907a = new C19907a(this, continuation);
            Object obj2 = c19907a.f77427j;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = c19907a.f77429l;
            if (i == 0) {
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC32730Eu1<T> m43507a(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C19902a(interfaceC32730Eu1, i);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i).toString());
    }

    /* renamed from: b */
    public static final <T> InterfaceC32730Eu1<T> m43506b(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new C19905c(interfaceC32730Eu1, function2);
    }
}
