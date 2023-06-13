package p000;

import com.facebook.share.internal.C17296a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, m28432d2 = {"LnP5;", "Ljz5;", "LtP5;", "", "subscriptionCount", "LEu1;", "Lhz5;", C17296a.f69688o, "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: nP5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45663nP5 implements InterfaceC43640jz5 {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"LGu1;", "Lhz5;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.StartedLazily$command$1", m28418f = "SharingStarted.kt", m28417i = {}, m28416l = {155}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: nP5$a */
    /* loaded from: classes8.dex */
    public static final class C26495a extends SuspendLambda implements Function2<InterfaceC33198Gu1<? super EnumC42454hz5>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f99904h;

        /* renamed from: i */
        public /* synthetic */ Object f99905i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC49220tP5<Integer> f99906j;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "count", "", "c", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: nP5$a$a */
        /* loaded from: classes8.dex */
        public static final class C26496a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ Ref.BooleanRef f99907b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC33198Gu1<EnumC42454hz5> f99908c;

            @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
            @DebugMetadata(m28419c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", m28418f = "SharingStarted.kt", m28417i = {}, m28416l = {158}, m28415m = "emit", m28414n = {}, m28413s = {})
            /* renamed from: nP5$a$a$a */
            /* loaded from: classes8.dex */
            public static final class C26497a extends ContinuationImpl {

                /* renamed from: h */
                public /* synthetic */ Object f99909h;

                /* renamed from: i */
                public final /* synthetic */ C26496a<T> f99910i;

                /* renamed from: j */
                public int f99911j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C26497a(C26496a<? super T> c26496a, Continuation<? super C26497a> continuation) {
                    super(continuation);
                    this.f99910i = c26496a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f99909h = obj;
                    this.f99911j |= Integer.MIN_VALUE;
                    return this.f99910i.m23830c(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C26496a(Ref.BooleanRef booleanRef, InterfaceC33198Gu1<? super EnumC42454hz5> interfaceC33198Gu1) {
                this.f99907b = booleanRef;
                this.f99908c = interfaceC33198Gu1;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: c */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object m23830c(int i, Continuation<? super Unit> continuation) {
                C26497a c26497a;
                Object coroutine_suspended;
                int i2;
                if (continuation instanceof C26497a) {
                    c26497a = (C26497a) continuation;
                    int i3 = c26497a.f99911j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c26497a.f99911j = i3 - Integer.MIN_VALUE;
                        Object obj = c26497a.f99909h;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i2 = c26497a.f99911j;
                        if (i2 == 0) {
                            if (i2 == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            if (i > 0) {
                                Ref.BooleanRef booleanRef = this.f99907b;
                                if (!booleanRef.element) {
                                    booleanRef.element = true;
                                    InterfaceC33198Gu1<EnumC42454hz5> interfaceC33198Gu1 = this.f99908c;
                                    EnumC42454hz5 enumC42454hz5 = EnumC42454hz5.START;
                                    c26497a.f99911j = 1;
                                    if (interfaceC33198Gu1.emit(enumC42454hz5, c26497a) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                }
                c26497a = new C26497a(this, continuation);
                Object obj2 = c26497a.f99909h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c26497a.f99911j;
                if (i2 == 0) {
                }
                return Unit.INSTANCE;
            }

            @Override // p000.InterfaceC33198Gu1
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m23830c(((Number) obj).intValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26495a(InterfaceC49220tP5<Integer> interfaceC49220tP5, Continuation<? super C26495a> continuation) {
            super(2, continuation);
            this.f99906j = interfaceC49220tP5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C26495a c26495a = new C26495a(this.f99906j, continuation);
            c26495a.f99905i = obj;
            return c26495a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC33198Gu1<? super EnumC42454hz5> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            return ((C26495a) create(interfaceC33198Gu1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f99904h;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                InterfaceC49220tP5<Integer> interfaceC49220tP5 = this.f99906j;
                C26496a c26496a = new C26496a(booleanRef, (InterfaceC33198Gu1) this.f99905i);
                this.f99904h = 1;
                if (interfaceC49220tP5.collect(c26496a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // p000.InterfaceC43640jz5
    /* renamed from: a */
    public InterfaceC32730Eu1<EnumC42454hz5> mo21100a(InterfaceC49220tP5<Integer> interfaceC49220tP5) {
        return C36708Vu1.m79283E(new C26495a(interfaceC49220tP5, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
