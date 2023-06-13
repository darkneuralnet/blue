package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC48600sM5;
@Metadata(m28433d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00028\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u001a-\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m28432d2 = {"T", "LtP5;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "LsP5;", "c", "(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;", "R", "LEu1;", "initial", "b", "(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;", "Lkotlin/Function0;", "block", "e", "", LegacyRepairType.OTHER_KEY, "", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Set;Ljava/util/Set;)Z", "runtime_release"}, m28431k = 5, m28430mv = {1, 8, 0}, m28427xs = "androidx/compose/runtime/SnapshotStateKt")
@SourceDebugExtension({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n1747#2,3:175\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n*L\n173#1:175,3\n*E\n"})
/* renamed from: JM5 */
/* loaded from: classes.dex */
public final /* synthetic */ class JM5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", m28418f = "SnapshotFlow.kt", m28417i = {}, m28416l = {65, 66}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: JM5$a */
    /* loaded from: classes.dex */
    public static final class C4031a extends SuspendLambda implements Function2<InterfaceC43718k74<R>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f17400h;

        /* renamed from: i */
        public /* synthetic */ Object f17401i;

        /* renamed from: j */
        public final /* synthetic */ CoroutineContext f17402j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC32730Eu1<T> f17403k;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: JM5$a$a */
        /* loaded from: classes.dex */
        public static final class C4032a implements InterfaceC33198Gu1<T> {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC43718k74<R> f17404b;

            public C4032a(InterfaceC43718k74<R> interfaceC43718k74) {
                this.f17404b = interfaceC43718k74;
            }

            @Override // p000.InterfaceC33198Gu1
            public final Object emit(T t, Continuation<? super Unit> continuation) {
                this.f17404b.setValue(t);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @DebugMetadata(m28419c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", m28418f = "SnapshotFlow.kt", m28417i = {}, m28416l = {67}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: JM5$a$b */
        /* loaded from: classes.dex */
        public static final class C4033b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f17405h;

            /* renamed from: i */
            public final /* synthetic */ InterfaceC32730Eu1<T> f17406i;

            /* renamed from: j */
            public final /* synthetic */ InterfaceC43718k74<R> f17407j;

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: JM5$a$b$a */
            /* loaded from: classes.dex */
            public static final class C4034a implements InterfaceC33198Gu1<T> {

                /* renamed from: b */
                public final /* synthetic */ InterfaceC43718k74<R> f17408b;

                public C4034a(InterfaceC43718k74<R> interfaceC43718k74) {
                    this.f17408b = interfaceC43718k74;
                }

                @Override // p000.InterfaceC33198Gu1
                public final Object emit(T t, Continuation<? super Unit> continuation) {
                    this.f17408b.setValue(t);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4033b(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, InterfaceC43718k74<R> interfaceC43718k74, Continuation<? super C4033b> continuation) {
                super(2, continuation);
                this.f17406i = interfaceC32730Eu1;
                this.f17407j = interfaceC43718k74;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C4033b(this.f17406i, this.f17407j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C4033b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f17405h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC32730Eu1<T> interfaceC32730Eu1 = this.f17406i;
                    C4034a c4034a = new C4034a(this.f17407j);
                    this.f17405h = 1;
                    if (interfaceC32730Eu1.collect(c4034a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4031a(CoroutineContext coroutineContext, InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Continuation<? super C4031a> continuation) {
            super(2, continuation);
            this.f17402j = coroutineContext;
            this.f17403k = interfaceC32730Eu1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C4031a c4031a = new C4031a(this.f17402j, this.f17403k, continuation);
            c4031a.f17401i = obj;
            return c4031a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC43718k74<R> interfaceC43718k74, Continuation<? super Unit> continuation) {
            return ((C4031a) create(interfaceC43718k74, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f17400h;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC43718k74 interfaceC43718k74 = (InterfaceC43718k74) this.f17401i;
                if (Intrinsics.areEqual(this.f17402j, EmptyCoroutineContext.INSTANCE)) {
                    InterfaceC32730Eu1<T> interfaceC32730Eu1 = this.f17403k;
                    C4032a c4032a = new C4032a(interfaceC43718k74);
                    this.f17400h = 1;
                    if (interfaceC32730Eu1.collect(c4032a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    CoroutineContext coroutineContext = this.f17402j;
                    C4033b c4033b = new C4033b(this.f17403k, interfaceC43718k74, null);
                    this.f17400h = 2;
                    if (X30.m77504g(coroutineContext, c4033b, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m28432d2 = {"T", "LGu1;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", m28418f = "SnapshotFlow.kt", m28417i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, m28416l = {134, 138, SyslogConstants.LOG_LOCAL4}, m28415m = "invokeSuspend", m28414n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, m28413s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    @SourceDebugExtension({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,174:1\n122#2,5:175\n122#2,5:180\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n*L\n129#1:175,5\n152#1:180,5\n*E\n"})
    /* renamed from: JM5$b */
    /* loaded from: classes.dex */
    public static final class C4035b extends SuspendLambda implements Function2<InterfaceC33198Gu1<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f17409h;

        /* renamed from: i */
        public Object f17410i;

        /* renamed from: j */
        public Object f17411j;

        /* renamed from: k */
        public Object f17412k;

        /* renamed from: l */
        public Object f17413l;

        /* renamed from: m */
        public int f17414m;

        /* renamed from: n */
        public int f17415n;

        /* renamed from: o */
        public /* synthetic */ Object f17416o;

        /* renamed from: p */
        public final /* synthetic */ Function0<T> f17417p;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: JM5$b$a */
        /* loaded from: classes.dex */
        public static final class C4036a extends Lambda implements Function1<Object, Unit> {

            /* renamed from: g */
            public final /* synthetic */ Set<Object> f17418g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4036a(Set<Object> set) {
                super(1);
                this.f17418g = set;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.f17418g.add(it);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"T", "", "", "changed", "LsM5;", "<anonymous parameter 1>", "", C17296a.f69688o, "(Ljava/util/Set;LsM5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: JM5$b$b */
        /* loaded from: classes.dex */
        public static final class C4037b extends Lambda implements Function2<Set<? extends Object>, AbstractC48600sM5, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC32846Fh0<Set<Object>> f17419g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4037b(InterfaceC32846Fh0<Set<Object>> interfaceC32846Fh0) {
                super(2);
                this.f17419g = interfaceC32846Fh0;
            }

            /* renamed from: a */
            public final void m100641a(Set<? extends Object> changed, AbstractC48600sM5 abstractC48600sM5) {
                Intrinsics.checkNotNullParameter(changed, "changed");
                Intrinsics.checkNotNullParameter(abstractC48600sM5, "<anonymous parameter 1>");
                this.f17419g.mo2349h(changed);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, AbstractC48600sM5 abstractC48600sM5) {
                m100641a(set, abstractC48600sM5);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4035b(Function0<? extends T> function0, Continuation<? super C4035b> continuation) {
            super(2, continuation);
            this.f17417p = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C4035b c4035b = new C4035b(this.f17417p, continuation);
            c4035b.f17416o = obj;
            return c4035b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            return ((C4035b) create(interfaceC33198Gu1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0100 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #4 {all -> 0x0053, blocks: (B:34:0x00e4, B:36:0x00e8, B:41:0x00f2, B:44:0x0100, B:48:0x0116, B:50:0x011f, B:11:0x004b, B:45:0x010b, B:47:0x0113, B:46:0x010f), top: B:75:0x004b }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x014c -> B:30:0x00c5). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            InterfaceC33198Gu1 interfaceC33198Gu1;
            Set linkedHashSet;
            Function1<Object, Unit> c4036a;
            InterfaceC32846Fh0 m89918b;
            InterfaceC41649ge3 m14277e;
            AbstractC48600sM5 m14273i;
            AbstractC48600sM5 m14295k;
            Object obj2;
            Object obj3;
            C4035b c4035b;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f17415n;
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                obj2 = this.f17413l;
                                m14277e = (InterfaceC41649ge3) this.f17412k;
                                m89918b = (InterfaceC32846Fh0) this.f17411j;
                                c4036a = (Function1) this.f17410i;
                                linkedHashSet = (Set) this.f17409h;
                                interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f17416o;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            int i2 = this.f17414m;
                            Object obj4 = this.f17413l;
                            InterfaceC41649ge3 interfaceC41649ge3 = (InterfaceC41649ge3) this.f17412k;
                            InterfaceC32846Fh0 interfaceC32846Fh0 = (InterfaceC32846Fh0) this.f17411j;
                            Function1<Object, Unit> function1 = (Function1) this.f17410i;
                            Set set = (Set) this.f17409h;
                            InterfaceC33198Gu1 interfaceC33198Gu12 = (InterfaceC33198Gu1) this.f17416o;
                            try {
                                ResultKt.throwOnFailure(obj);
                                obj3 = obj;
                                C4035b c4035b2 = this;
                                Set set2 = (Set) obj3;
                                do {
                                    if (i2 == 0 && !JM5.m100643d(set, set2)) {
                                        i2 = 0;
                                        set2 = (Set) C35420Qh0.m88184f(interfaceC32846Fh0.mo28254l());
                                    }
                                    i2 = 1;
                                    set2 = (Set) C35420Qh0.m88184f(interfaceC32846Fh0.mo28254l());
                                } while (set2 != null);
                                if (i2 != 0) {
                                    set.clear();
                                    m14273i = AbstractC48600sM5.f108670e.m14273i(function1);
                                    Function0<T> function0 = c4035b2.f17417p;
                                    m14295k = m14273i.m14295k();
                                    Object invoke = function0.invoke();
                                    m14273i.mo1848d();
                                    if (!Intrinsics.areEqual(invoke, obj4)) {
                                        c4035b2.f17416o = interfaceC33198Gu12;
                                        c4035b2.f17409h = set;
                                        c4035b2.f17410i = function1;
                                        c4035b2.f17411j = interfaceC32846Fh0;
                                        c4035b2.f17412k = interfaceC41649ge3;
                                        c4035b2.f17413l = invoke;
                                        c4035b2.f17415n = 3;
                                        if (interfaceC33198Gu12.emit(invoke, c4035b2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        m14277e = interfaceC41649ge3;
                                        m89918b = interfaceC32846Fh0;
                                        c4036a = function1;
                                        linkedHashSet = set;
                                        interfaceC33198Gu1 = interfaceC33198Gu12;
                                        obj2 = invoke;
                                        c4035b = c4035b2;
                                        c4035b.f17416o = interfaceC33198Gu1;
                                        c4035b.f17409h = linkedHashSet;
                                        c4035b.f17410i = c4036a;
                                        c4035b.f17411j = m89918b;
                                        c4035b.f17412k = m14277e;
                                        c4035b.f17413l = obj2;
                                        c4035b.f17414m = 0;
                                        c4035b.f17415n = 2;
                                        obj3 = m89918b.mo28256G(c4035b);
                                        if (obj3 == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        c4035b2 = c4035b;
                                        interfaceC33198Gu12 = interfaceC33198Gu1;
                                        set = linkedHashSet;
                                        function1 = c4036a;
                                        interfaceC32846Fh0 = m89918b;
                                        interfaceC41649ge3 = m14277e;
                                        obj4 = obj2;
                                        i2 = 0;
                                        Set set22 = (Set) obj3;
                                        do {
                                            if (i2 == 0) {
                                                i2 = 0;
                                                set22 = (Set) C35420Qh0.m88184f(interfaceC32846Fh0.mo28254l());
                                            }
                                            i2 = 1;
                                            set22 = (Set) C35420Qh0.m88184f(interfaceC32846Fh0.mo28254l());
                                        } while (set22 != null);
                                        if (i2 != 0) {
                                        }
                                    }
                                }
                                obj2 = obj4;
                                m14277e = interfaceC41649ge3;
                                m89918b = interfaceC32846Fh0;
                                c4036a = function1;
                                linkedHashSet = set;
                                interfaceC33198Gu1 = interfaceC33198Gu12;
                                c4035b = c4035b2;
                                c4035b.f17416o = interfaceC33198Gu1;
                                c4035b.f17409h = linkedHashSet;
                                c4035b.f17410i = c4036a;
                                c4035b.f17411j = m89918b;
                                c4035b.f17412k = m14277e;
                                c4035b.f17413l = obj2;
                                c4035b.f17414m = 0;
                                c4035b.f17415n = 2;
                                obj3 = m89918b.mo28256G(c4035b);
                                if (obj3 == coroutine_suspended) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                InterfaceC41649ge3 interfaceC41649ge32 = interfaceC41649ge3;
                                interfaceC41649ge32.dispose();
                                throw th;
                            }
                        }
                    } else {
                        obj2 = this.f17413l;
                        m14277e = (InterfaceC41649ge3) this.f17412k;
                        m89918b = (InterfaceC32846Fh0) this.f17411j;
                        c4036a = (Function1) this.f17410i;
                        linkedHashSet = (Set) this.f17409h;
                        interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f17416o;
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f17416o;
                    linkedHashSet = new LinkedHashSet();
                    c4036a = new C4036a(linkedHashSet);
                    m89918b = C35186Ph0.m89918b(Integer.MAX_VALUE, null, null, 6, null);
                    AbstractC48600sM5.C28290a c28290a = AbstractC48600sM5.f108670e;
                    m14277e = c28290a.m14277e(new C4037b(m89918b));
                    m14273i = c28290a.m14273i(c4036a);
                    Function0<T> function02 = this.f17417p;
                    m14295k = m14273i.m14295k();
                    try {
                        Object invoke2 = function02.invoke();
                        m14273i.m14288r(m14295k);
                        m14273i.mo1848d();
                        this.f17416o = interfaceC33198Gu1;
                        this.f17409h = linkedHashSet;
                        this.f17410i = c4036a;
                        this.f17411j = m89918b;
                        this.f17412k = m14277e;
                        this.f17413l = invoke2;
                        this.f17415n = 1;
                        if (interfaceC33198Gu1.emit(invoke2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = invoke2;
                    } finally {
                        m14273i.m14288r(m14295k);
                    }
                }
                c4035b = this;
                c4035b.f17416o = interfaceC33198Gu1;
                c4035b.f17409h = linkedHashSet;
                c4035b.f17410i = c4036a;
                c4035b.f17411j = m89918b;
                c4035b.f17412k = m14277e;
                c4035b.f17413l = obj2;
                c4035b.f17414m = 0;
                c4035b.f17415n = 2;
                obj3 = m89918b.mo28256G(c4035b);
                if (obj3 == coroutine_suspended) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: b */
    public static final <T extends R, R> InterfaceC48627sP5<R> m100645b(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, R r, CoroutineContext coroutineContext, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(interfaceC32730Eu1, "<this>");
        interfaceC32720Et0.mo89638F(-606625098);
        if ((i2 & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-606625098, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:59)");
        }
        int i3 = i >> 3;
        InterfaceC48627sP5<R> m105196k = GM5.m105196k(r, interfaceC32730Eu1, coroutineContext2, new C4031a(coroutineContext2, interfaceC32730Eu1, null), interfaceC32720Et0, (i3 & 8) | 4672 | (i3 & 14));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105196k;
    }

    /* renamed from: c */
    public static final <T> InterfaceC48627sP5<T> m100644c(InterfaceC49220tP5<? extends T> interfaceC49220tP5, CoroutineContext coroutineContext, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(interfaceC49220tP5, "<this>");
        interfaceC32720Et0.mo89638F(-1439883919);
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1439883919, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:45)");
        }
        InterfaceC48627sP5<T> m105206a = GM5.m105206a(interfaceC49220tP5, interfaceC49220tP5.getValue(), coroutineContext2, interfaceC32720Et0, 520, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m105206a;
    }

    /* renamed from: d */
    public static final <T> boolean m100643d(Set<? extends T> set, Set<? extends T> set2) {
        if (set.size() < set2.size()) {
            if (!set.isEmpty()) {
                for (T t : set) {
                    if (set2.contains(t)) {
                        return true;
                    }
                }
            }
        } else if (!set2.isEmpty()) {
            for (T t2 : set2) {
                if (set.contains(t2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final <T> InterfaceC32730Eu1<T> m100642e(Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return C36708Vu1.m79283E(new C4035b(block, null));
    }
}
