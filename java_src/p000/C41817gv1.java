package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt___RangesKt;
import p000.InterfaceC43640jz5;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aC\u0010\u001e\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010\u001a\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m28432d2 = {"T", "LEu1;", "LZC0;", Action.SCOPE_ATTRIBUTE, "Ljz5;", "started", "", "replay", "LTy5;", "f", "Liz5;", "c", "(LEu1;I)Liz5;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "upstream", "LBX2;", "shared", "initialValue", "Lzh2;", DateTokenConverter.CONVERTER_KEY, "(LZC0;Lkotlin/coroutines/CoroutineContext;LEu1;LBX2;Ljz5;Ljava/lang/Object;)Lzh2;", "LtP5;", "g", "(LEu1;LZC0;Ljz5;Ljava/lang/Object;)LtP5;", "h", "(LEu1;LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lis0;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "e", "(LZC0;Lkotlin/coroutines/CoroutineContext;LEu1;Lis0;)V", C17296a.f69688o, "LGX2;", "b", "kotlinx-coroutines-core"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: gv1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C41817gv1 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", m28418f = "Share.kt", m28417i = {}, m28416l = {214, 218, 219, 225}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: gv1$a */
    /* loaded from: classes8.dex */
    public static final class C22510a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f84434h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC43640jz5 f84435i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC32730Eu1<T> f84436j;

        /* renamed from: k */
        public final /* synthetic */ BX2<T> f84437k;

        /* renamed from: l */
        public final /* synthetic */ T f84438l;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m28432d2 = {"T", "", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
        @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", m28418f = "Share.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: gv1$a$a */
        /* loaded from: classes8.dex */
        public static final class C22511a extends SuspendLambda implements Function2<Integer, Continuation<? super Boolean>, Object> {

            /* renamed from: h */
            public int f84439h;

            /* renamed from: i */
            public /* synthetic */ int f84440i;

            public C22511a(Continuation<? super C22511a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C22511a c22511a = new C22511a(continuation);
                c22511a.f84440i = ((Number) obj).intValue();
                return c22511a;
            }

            /* renamed from: e */
            public final Object m37330e(int i, Continuation<? super Boolean> continuation) {
                return ((C22511a) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Boolean> continuation) {
                return m37330e(num.intValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f84439h == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.f84440i > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boxing.boxBoolean(z);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m28432d2 = {"T", "Lhz5;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
        @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", m28418f = "Share.kt", m28417i = {}, m28416l = {227}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: gv1$a$b */
        /* loaded from: classes8.dex */
        public static final class C22512b extends SuspendLambda implements Function2<EnumC42454hz5, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f84441h;

            /* renamed from: i */
            public /* synthetic */ Object f84442i;

            /* renamed from: j */
            public final /* synthetic */ InterfaceC32730Eu1<T> f84443j;

            /* renamed from: k */
            public final /* synthetic */ BX2<T> f84444k;

            /* renamed from: l */
            public final /* synthetic */ T f84445l;

            @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
            /* renamed from: gv1$a$b$a */
            /* loaded from: classes8.dex */
            public /* synthetic */ class C22513a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnumC42454hz5.values().length];
                    iArr[EnumC42454hz5.START.ordinal()] = 1;
                    iArr[EnumC42454hz5.STOP.ordinal()] = 2;
                    iArr[EnumC42454hz5.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C22512b(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, BX2<T> bx2, T t, Continuation<? super C22512b> continuation) {
                super(2, continuation);
                this.f84443j = interfaceC32730Eu1;
                this.f84444k = bx2;
                this.f84445l = t;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C22512b c22512b = new C22512b(this.f84443j, this.f84444k, this.f84445l, continuation);
                c22512b.f84442i = obj;
                return c22512b;
            }

            /* renamed from: e */
            public final Object m37329e(EnumC42454hz5 enumC42454hz5, Continuation<? super Unit> continuation) {
                return ((C22512b) create(enumC42454hz5, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(EnumC42454hz5 enumC42454hz5, Continuation<? super Unit> continuation) {
                return m37329e(enumC42454hz5, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f84441h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    int i2 = C22513a.$EnumSwitchMapping$0[((EnumC42454hz5) this.f84442i).ordinal()];
                    if (i2 != 1) {
                        if (i2 == 3) {
                            Object obj2 = this.f84445l;
                            if (obj2 == C36748Vy5.f40167a) {
                                this.f84444k.mo10358a();
                            } else {
                                this.f84444k.mo10357b(obj2);
                            }
                        }
                    } else {
                        InterfaceC32730Eu1<T> interfaceC32730Eu1 = this.f84443j;
                        InterfaceC32730Eu1 interfaceC32730Eu12 = this.f84444k;
                        this.f84441h = 1;
                        if (interfaceC32730Eu1.collect(interfaceC32730Eu12, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22510a(InterfaceC43640jz5 interfaceC43640jz5, InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, BX2<T> bx2, T t, Continuation<? super C22510a> continuation) {
            super(2, continuation);
            this.f84435i = interfaceC43640jz5;
            this.f84436j = interfaceC32730Eu1;
            this.f84437k = bx2;
            this.f84438l = t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22510a(this.f84435i, this.f84436j, this.f84437k, this.f84438l, continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C22510a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            InterfaceC32730Eu1<T> interfaceC32730Eu1;
            InterfaceC32730Eu1 interfaceC32730Eu12;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f84434h;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3 && i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        interfaceC32730Eu1 = this.f84436j;
                        interfaceC32730Eu12 = this.f84437k;
                        this.f84434h = 3;
                        if (interfaceC32730Eu1.collect(interfaceC32730Eu12, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC43640jz5 interfaceC43640jz5 = this.f84435i;
            InterfaceC43640jz5.C25067a c25067a = InterfaceC43640jz5.f93705a;
            if (interfaceC43640jz5 == c25067a.m29521c()) {
                InterfaceC32730Eu1<T> interfaceC32730Eu13 = this.f84436j;
                InterfaceC32730Eu1 interfaceC32730Eu14 = this.f84437k;
                this.f84434h = 1;
                if (interfaceC32730Eu13.collect(interfaceC32730Eu14, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (this.f84435i == c25067a.m29520d()) {
                InterfaceC49220tP5<Integer> m113902d = this.f84437k.m113902d();
                C22511a c22511a = new C22511a(null);
                this.f84434h = 2;
                if (C36708Vu1.m79247x(m113902d, c22511a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC32730Eu1 = this.f84436j;
                interfaceC32730Eu12 = this.f84437k;
                this.f84434h = 3;
                if (interfaceC32730Eu1.collect(interfaceC32730Eu12, this) == coroutine_suspended) {
                }
            } else {
                InterfaceC32730Eu1 m79255p = C36708Vu1.m79255p(this.f84435i.mo21100a(this.f84437k.m113902d()));
                C22512b c22512b = new C22512b(this.f84436j, this.f84437k, this.f84438l, null);
                this.f84434h = 4;
                if (C36708Vu1.m79261j(m79255p, c22512b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return invoke2(zc0, continuation);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", m28418f = "Share.kt", m28417i = {}, m28416l = {340}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: gv1$b */
    /* loaded from: classes8.dex */
    public static final class C22514b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f84446h;

        /* renamed from: i */
        public /* synthetic */ Object f84447i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC32730Eu1<T> f84448j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC42972is0<InterfaceC49220tP5<T>> f84449k;

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: gv1$b$a */
        /* loaded from: classes8.dex */
        public static final class C22515a<T> implements InterfaceC33198Gu1 {

            /* renamed from: b */
            public final /* synthetic */ Ref.ObjectRef<GX2<T>> f84450b;

            /* renamed from: c */
            public final /* synthetic */ ZC0 f84451c;

            /* renamed from: d */
            public final /* synthetic */ InterfaceC42972is0<InterfaceC49220tP5<T>> f84452d;

            public C22515a(Ref.ObjectRef<GX2<T>> objectRef, ZC0 zc0, InterfaceC42972is0<InterfaceC49220tP5<T>> interfaceC42972is0) {
                this.f84450b = objectRef;
                this.f84451c = zc0;
                this.f84452d = interfaceC42972is0;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [GX2, T, tP5] */
            @Override // p000.InterfaceC33198Gu1
            public final Object emit(T t, Continuation<? super Unit> continuation) {
                Unit unit;
                GX2<T> gx2 = this.f84450b.element;
                if (gx2 != null) {
                    gx2.setValue(t);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    ZC0 zc0 = this.f84451c;
                    Ref.ObjectRef<GX2<T>> objectRef = this.f84450b;
                    InterfaceC42972is0<InterfaceC49220tP5<T>> interfaceC42972is0 = this.f84452d;
                    ?? r4 = (T) C50405vP5.m8742a(t);
                    interfaceC42972is0.mo29819r(new C37620Zr4(r4, C34018Kh2.m98498n(zc0.mo18342K())));
                    objectRef.element = r4;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22514b(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, InterfaceC42972is0<InterfaceC49220tP5<T>> interfaceC42972is0, Continuation<? super C22514b> continuation) {
            super(2, continuation);
            this.f84448j = interfaceC32730Eu1;
            this.f84449k = interfaceC42972is0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C22514b c22514b = new C22514b(this.f84448j, this.f84449k, continuation);
            c22514b.f84447i = obj;
            return c22514b;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C22514b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f84446h;
            try {
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ZC0 zc0 = (ZC0) this.f84447i;
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    InterfaceC32730Eu1<T> interfaceC32730Eu1 = this.f84448j;
                    C22515a c22515a = new C22515a(objectRef, zc0, this.f84449k);
                    this.f84446h = 1;
                    if (interfaceC32730Eu1.collect(c22515a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.f84449k.mo29823a(th);
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return invoke2(zc0, continuation);
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC36280Ty5<T> m37338a(BX2<T> bx2) {
        return new C37152Xr4(bx2, null);
    }

    /* renamed from: b */
    public static final <T> InterfaceC49220tP5<T> m37337b(GX2<T> gx2) {
        return new C37620Zr4(gx2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r3 == 0) goto L17;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> C43047iz5<T> m37336c(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, int i) {
        int coerceAtLeast;
        AbstractC33314Hh0 abstractC33314Hh0;
        InterfaceC32730Eu1<T> mo95047i;
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i, InterfaceC32846Fh0.f9955L.m106750a());
        int i2 = coerceAtLeast - i;
        if ((interfaceC32730Eu1 instanceof AbstractC33314Hh0) && (mo95047i = (abstractC33314Hh0 = (AbstractC33314Hh0) interfaceC32730Eu1).mo95047i()) != null) {
            int i3 = abstractC33314Hh0.f13761c;
            if (i3 != -3 && i3 != -2 && i3 != 0) {
                i2 = i3;
            } else if (abstractC33314Hh0.f13762d != EnumC43674k30.SUSPEND) {
                if (i == 0) {
                    i2 = 1;
                }
                i2 = 0;
            }
            return new C43047iz5<>(mo95047i, i2, abstractC33314Hh0.f13762d, abstractC33314Hh0.f13760b);
        }
        return new C43047iz5<>(interfaceC32730Eu1, i2, EnumC43674k30.SUSPEND, EmptyCoroutineContext.INSTANCE);
    }

    /* renamed from: d */
    public static final <T> InterfaceC52943zh2 m37335d(ZC0 zc0, CoroutineContext coroutineContext, InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, BX2<T> bx2, InterfaceC43640jz5 interfaceC43640jz5, T t) {
        EnumC38417bD0 enumC38417bD0;
        if (Intrinsics.areEqual(interfaceC43640jz5, InterfaceC43640jz5.f93705a.m29521c())) {
            enumC38417bD0 = EnumC38417bD0.DEFAULT;
        } else {
            enumC38417bD0 = EnumC38417bD0.UNDISPATCHED;
        }
        return X30.m77508c(zc0, coroutineContext, enumC38417bD0, new C22510a(interfaceC43640jz5, interfaceC32730Eu1, bx2, t, null));
    }

    /* renamed from: e */
    public static final <T> void m37334e(ZC0 zc0, CoroutineContext coroutineContext, InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, InterfaceC42972is0<InterfaceC49220tP5<T>> interfaceC42972is0) {
        Z30.m73800d(zc0, coroutineContext, null, new C22514b(interfaceC32730Eu1, interfaceC42972is0, null), 2, null);
    }

    /* renamed from: f */
    public static final <T> InterfaceC36280Ty5<T> m37333f(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, ZC0 zc0, InterfaceC43640jz5 interfaceC43640jz5, int i) {
        C43047iz5 m37336c = m37336c(interfaceC32730Eu1, i);
        BX2 m79032a = C36748Vy5.m79032a(i, m37336c.f91969b, m37336c.f91970c);
        return new C37152Xr4(m79032a, m37335d(zc0, m37336c.f91971d, m37336c.f91968a, m79032a, interfaceC43640jz5, C36748Vy5.f40167a));
    }

    /* renamed from: g */
    public static final <T> InterfaceC49220tP5<T> m37332g(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, ZC0 zc0, InterfaceC43640jz5 interfaceC43640jz5, T t) {
        C43047iz5 m37336c = m37336c(interfaceC32730Eu1, 1);
        GX2 m8742a = C50405vP5.m8742a(t);
        return new C37620Zr4(m8742a, m37335d(zc0, m37336c.f91971d, m37336c.f91968a, m8742a, interfaceC43640jz5, t));
    }

    /* renamed from: h */
    public static final <T> Object m37331h(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, ZC0 zc0, Continuation<? super InterfaceC49220tP5<? extends T>> continuation) {
        C43047iz5 m37336c = m37336c(interfaceC32730Eu1, 1);
        InterfaceC42972is0 m28258b = C44158ks0.m28258b(null, 1, null);
        m37334e(zc0, m37336c.f91971d, m37336c.f91968a, m28258b);
        return m28258b.mo29821k(continuation);
    }
}
