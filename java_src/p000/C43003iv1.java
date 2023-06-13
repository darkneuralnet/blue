package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000F\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u008a\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u008c\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u008a\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0011\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u000320\b\u0001\u0010\f\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0013ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a¢\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0011\"\u0004\b\u0003\u0010\u0016\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00030\u000324\u0010\f\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0018ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a¼\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0011\"\u0004\b\u0003\u0010\u0016\"\u0004\b\u0004\u0010\u001b\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032:\u0010\f\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001dø\u0001\u0000¢\u0006\u0004\b\t\u0010\u001e\u001a#\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!0 \"\u0004\b\u0000\u0010\u001fH\u0002¢\u0006\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, m28432d2 = {"T1", "T2", "R", "LEu1;", "flow", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", C17296a.f69688o, "b", "Lkotlin/coroutines/Continuation;", "", "transform", "f", "(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;", "flow2", "e", "T3", "flow3", "Lkotlin/Function4;", DateTokenConverter.CONVERTER_KEY, "(LEu1;LEu1;LEu1;Lkotlin/jvm/functions/Function4;)LEu1;", "T4", "flow4", "Lkotlin/Function5;", "c", "(LEu1;LEu1;LEu1;LEu1;Lkotlin/jvm/functions/Function5;)LEu1;", "T5", "flow5", "Lkotlin/Function6;", "(LEu1;LEu1;LEu1;LEu1;LEu1;Lkotlin/jvm/functions/Function6;)LEu1;", "T", "Lkotlin/Function0;", "", "g", "()Lkotlin/jvm/functions/Function0;", "kotlinx-coroutines-core"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: iv1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C43003iv1 {

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: iv1$a */
    /* loaded from: classes8.dex */
    public static final class C24634a implements InterfaceC32730Eu1<R> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1[] f91683b;

        /* renamed from: c */
        public final /* synthetic */ Function4 f91684c;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
        @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", m28418f = "Zip.kt", m28417i = {}, m28416l = {333, 333}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: iv1$a$a */
        /* loaded from: classes8.dex */
        public static final class C24635a extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f91685h;

            /* renamed from: i */
            public /* synthetic */ Object f91686i;

            /* renamed from: j */
            public /* synthetic */ Object f91687j;

            /* renamed from: k */
            public final /* synthetic */ Function4 f91688k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24635a(Continuation continuation, Function4 function4) {
                super(3, continuation);
                this.f91688k = function4;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(InterfaceC33198Gu1<? super R> interfaceC33198Gu1, Object[] objArr, Continuation<? super Unit> continuation) {
                C24635a c24635a = new C24635a(continuation, this.f91688k);
                c24635a.f91686i = interfaceC33198Gu1;
                c24635a.f91687j = objArr;
                return c24635a.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                InterfaceC33198Gu1 interfaceC33198Gu1;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f91685h;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f91686i;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f91686i;
                    Object[] objArr = (Object[]) this.f91687j;
                    Function4 function4 = this.f91688k;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f91686i = interfaceC33198Gu1;
                    this.f91685h = 1;
                    InlineMarker.mark(6);
                    obj = function4.invoke(obj2, obj3, obj4, this);
                    InlineMarker.mark(7);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.f91686i = null;
                this.f91685h = 2;
                if (interfaceC33198Gu1.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        public C24634a(InterfaceC32730Eu1[] interfaceC32730Eu1Arr, Function4 function4) {
            this.f91683b = interfaceC32730Eu1Arr;
            this.f91684c = function4;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1 interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object m86325a = C35699Rm0.m86325a(interfaceC33198Gu1, this.f91683b, C43003iv1.m31647g(), new C24635a(null, this.f91684c), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (m86325a == coroutine_suspended) {
                return m86325a;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: iv1$b */
    /* loaded from: classes8.dex */
    public static final class C24636b implements InterfaceC32730Eu1<R> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1[] f91689b;

        /* renamed from: c */
        public final /* synthetic */ Function5 f91690c;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
        @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", m28418f = "Zip.kt", m28417i = {}, m28416l = {333, 333}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: iv1$b$a */
        /* loaded from: classes8.dex */
        public static final class C24637a extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f91691h;

            /* renamed from: i */
            public /* synthetic */ Object f91692i;

            /* renamed from: j */
            public /* synthetic */ Object f91693j;

            /* renamed from: k */
            public final /* synthetic */ Function5 f91694k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24637a(Continuation continuation, Function5 function5) {
                super(3, continuation);
                this.f91694k = function5;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(InterfaceC33198Gu1<? super R> interfaceC33198Gu1, Object[] objArr, Continuation<? super Unit> continuation) {
                C24637a c24637a = new C24637a(continuation, this.f91694k);
                c24637a.f91692i = interfaceC33198Gu1;
                c24637a.f91693j = objArr;
                return c24637a.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                InterfaceC33198Gu1 interfaceC33198Gu1;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f91691h;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f91692i;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f91692i;
                    Object[] objArr = (Object[]) this.f91693j;
                    Function5 function5 = this.f91694k;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f91692i = interfaceC33198Gu1;
                    this.f91691h = 1;
                    InlineMarker.mark(6);
                    obj = function5.invoke(obj2, obj3, obj4, obj5, this);
                    InlineMarker.mark(7);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.f91692i = null;
                this.f91691h = 2;
                if (interfaceC33198Gu1.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        public C24636b(InterfaceC32730Eu1[] interfaceC32730Eu1Arr, Function5 function5) {
            this.f91689b = interfaceC32730Eu1Arr;
            this.f91690c = function5;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1 interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object m86325a = C35699Rm0.m86325a(interfaceC33198Gu1, this.f91689b, C43003iv1.m31647g(), new C24637a(null, this.f91690c), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (m86325a == coroutine_suspended) {
                return m86325a;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: iv1$c */
    /* loaded from: classes8.dex */
    public static final class C24638c implements InterfaceC32730Eu1<R> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1[] f91695b;

        /* renamed from: c */
        public final /* synthetic */ Function6 f91696c;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
        @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", m28418f = "Zip.kt", m28417i = {}, m28416l = {333, 333}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: iv1$c$a */
        /* loaded from: classes8.dex */
        public static final class C24639a extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super R>, Object[], Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f91697h;

            /* renamed from: i */
            public /* synthetic */ Object f91698i;

            /* renamed from: j */
            public /* synthetic */ Object f91699j;

            /* renamed from: k */
            public final /* synthetic */ Function6 f91700k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24639a(Continuation continuation, Function6 function6) {
                super(3, continuation);
                this.f91700k = function6;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(InterfaceC33198Gu1<? super R> interfaceC33198Gu1, Object[] objArr, Continuation<? super Unit> continuation) {
                C24639a c24639a = new C24639a(continuation, this.f91700k);
                c24639a.f91698i = interfaceC33198Gu1;
                c24639a.f91699j = objArr;
                return c24639a.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                InterfaceC33198Gu1 interfaceC33198Gu1;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f91697h;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f91698i;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f91698i;
                    Object[] objArr = (Object[]) this.f91699j;
                    Function6 function6 = this.f91700k;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.f91698i = interfaceC33198Gu1;
                    this.f91697h = 1;
                    InlineMarker.mark(6);
                    obj = function6.invoke(obj2, obj3, obj4, obj5, obj6, this);
                    InlineMarker.mark(7);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.f91698i = null;
                this.f91697h = 2;
                if (interfaceC33198Gu1.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        public C24638c(InterfaceC32730Eu1[] interfaceC32730Eu1Arr, Function6 function6) {
            this.f91695b = interfaceC32730Eu1Arr;
            this.f91696c = function6;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1 interfaceC33198Gu1, Continuation continuation) {
            Object coroutine_suspended;
            Object m86325a = C35699Rm0.m86325a(interfaceC33198Gu1, this.f91695b, C43003iv1.m31647g(), new C24639a(null, this.f91696c), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (m86325a == coroutine_suspended) {
                return m86325a;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"iv1$d", "LEu1;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: iv1$d */
    /* loaded from: classes8.dex */
    public static final class C24640d implements InterfaceC32730Eu1<R> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC32730Eu1 f91701b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC32730Eu1 f91702c;

        /* renamed from: d */
        public final /* synthetic */ Function3 f91703d;

        public C24640d(InterfaceC32730Eu1 interfaceC32730Eu1, InterfaceC32730Eu1 interfaceC32730Eu12, Function3 function3) {
            this.f91701b = interfaceC32730Eu1;
            this.f91702c = interfaceC32730Eu12;
            this.f91703d = function3;
        }

        @Override // p000.InterfaceC32730Eu1
        public Object collect(InterfaceC33198Gu1<? super R> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object m86325a = C35699Rm0.m86325a(interfaceC33198Gu1, new InterfaceC32730Eu1[]{this.f91701b, this.f91702c}, C43003iv1.m31647g(), new C24641e(this.f91703d, null), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (m86325a == coroutine_suspended) {
                return m86325a;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u008a@"}, m28432d2 = {"T1", "T2", "R", "LGu1;", "", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", m28418f = "Zip.kt", m28417i = {}, m28416l = {33, 33}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: iv1$e */
    /* loaded from: classes8.dex */
    public static final class C24641e extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super R>, Object[], Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f91704h;

        /* renamed from: i */
        public /* synthetic */ Object f91705i;

        /* renamed from: j */
        public /* synthetic */ Object f91706j;

        /* renamed from: k */
        public final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> f91707k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C24641e(Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super C24641e> continuation) {
            super(3, continuation);
            this.f91707k = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC33198Gu1<? super R> interfaceC33198Gu1, Object[] objArr, Continuation<? super Unit> continuation) {
            C24641e c24641e = new C24641e(this.f91707k, continuation);
            c24641e.f91705i = interfaceC33198Gu1;
            c24641e.f91706j = objArr;
            return c24641e.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            InterfaceC33198Gu1 interfaceC33198Gu1;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f91704h;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f91705i;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f91705i;
                Object[] objArr = (Object[]) this.f91706j;
                Function3<T1, T2, Continuation<? super R>, Object> function3 = this.f91707k;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f91705i = interfaceC33198Gu1;
                this.f91704h = 1;
                obj = function3.invoke(obj2, obj3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f91705i = null;
            this.f91704h = 2;
            if (interfaceC33198Gu1.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"T", "", "b", "()Ljava/lang/Void;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: iv1$f */
    /* loaded from: classes8.dex */
    public static final class C24642f extends Lambda implements Function0 {

        /* renamed from: g */
        public static final C24642f f91708g = new C24642f();

        public C24642f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Void invoke() {
            return null;
        }
    }

    /* renamed from: b */
    public static final <T1, T2, T3, T4, T5, R> InterfaceC32730Eu1<R> m31652b(InterfaceC32730Eu1<? extends T1> interfaceC32730Eu1, InterfaceC32730Eu1<? extends T2> interfaceC32730Eu12, InterfaceC32730Eu1<? extends T3> interfaceC32730Eu13, InterfaceC32730Eu1<? extends T4> interfaceC32730Eu14, InterfaceC32730Eu1<? extends T5> interfaceC32730Eu15, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super R>, ? extends Object> function6) {
        return new C24638c(new InterfaceC32730Eu1[]{interfaceC32730Eu1, interfaceC32730Eu12, interfaceC32730Eu13, interfaceC32730Eu14, interfaceC32730Eu15}, function6);
    }

    /* renamed from: c */
    public static final <T1, T2, T3, T4, R> InterfaceC32730Eu1<R> m31651c(InterfaceC32730Eu1<? extends T1> interfaceC32730Eu1, InterfaceC32730Eu1<? extends T2> interfaceC32730Eu12, InterfaceC32730Eu1<? extends T3> interfaceC32730Eu13, InterfaceC32730Eu1<? extends T4> interfaceC32730Eu14, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> function5) {
        return new C24636b(new InterfaceC32730Eu1[]{interfaceC32730Eu1, interfaceC32730Eu12, interfaceC32730Eu13, interfaceC32730Eu14}, function5);
    }

    /* renamed from: d */
    public static final <T1, T2, T3, R> InterfaceC32730Eu1<R> m31650d(InterfaceC32730Eu1<? extends T1> interfaceC32730Eu1, InterfaceC32730Eu1<? extends T2> interfaceC32730Eu12, InterfaceC32730Eu1<? extends T3> interfaceC32730Eu13, @BuilderInference Function4<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> function4) {
        return new C24634a(new InterfaceC32730Eu1[]{interfaceC32730Eu1, interfaceC32730Eu12, interfaceC32730Eu13}, function4);
    }

    /* renamed from: e */
    public static final <T1, T2, R> InterfaceC32730Eu1<R> m31649e(InterfaceC32730Eu1<? extends T1> interfaceC32730Eu1, InterfaceC32730Eu1<? extends T2> interfaceC32730Eu12, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return C36708Vu1.m79282F(interfaceC32730Eu1, interfaceC32730Eu12, function3);
    }

    @JvmName(name = "flowCombine")
    /* renamed from: f */
    public static final <T1, T2, R> InterfaceC32730Eu1<R> m31648f(InterfaceC32730Eu1<? extends T1> interfaceC32730Eu1, InterfaceC32730Eu1<? extends T2> interfaceC32730Eu12, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return new C24640d(interfaceC32730Eu1, interfaceC32730Eu12, function3);
    }

    /* renamed from: g */
    public static final <T> Function0<T[]> m31647g() {
        return C24642f.f91708g;
    }
}
