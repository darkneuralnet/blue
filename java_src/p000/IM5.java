package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aU\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001ai\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m28432d2 = {"T", "initialValue", "Lkotlin/Function2;", "Lk74;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "producer", "LsP5;", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)LsP5;", "key1", "key2", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)LsP5;", "runtime_release"}, m28431k = 5, m28430mv = {1, 8, 0}, m28427xs = "androidx/compose/runtime/SnapshotStateKt")
@SourceDebugExtension({"SMAP\nProduceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/SnapshotStateKt__ProduceStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,224:1\n25#2:225\n25#2:232\n25#2:239\n25#2:246\n25#2:253\n1114#3,6:226\n1114#3,6:233\n1114#3,6:240\n1114#3,6:247\n1114#3,6:254\n*S KotlinDebug\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/SnapshotStateKt__ProduceStateKt\n*L\n82#1:225\n115#1:232\n149#1:239\n184#1:246\n217#1:253\n82#1:226,6\n115#1:233,6\n149#1:240,6\n184#1:247,6\n217#1:254,6\n*E\n"})
/* renamed from: IM5 */
/* loaded from: classes.dex */
public final /* synthetic */ class IM5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1", m28418f = "ProduceState.kt", m28417i = {}, m28416l = {84}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: IM5$a */
    /* loaded from: classes.dex */
    public static final class C3515a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f15394h;

        /* renamed from: i */
        public /* synthetic */ Object f15395i;

        /* renamed from: j */
        public final /* synthetic */ Function2<InterfaceC43718k74<T>, Continuation<? super Unit>, Object> f15396j;

        /* renamed from: k */
        public final /* synthetic */ EX2<T> f15397k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3515a(Function2<? super InterfaceC43718k74<T>, ? super Continuation<? super Unit>, ? extends Object> function2, EX2<T> ex2, Continuation<? super C3515a> continuation) {
            super(2, continuation);
            this.f15396j = function2;
            this.f15397k = ex2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C3515a c3515a = new C3515a(this.f15396j, this.f15397k, continuation);
            c3515a.f15395i = obj;
            return c3515a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C3515a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f15394h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Function2<InterfaceC43718k74<T>, Continuation<? super Unit>, Object> function2 = this.f15396j;
                C44311l74 c44311l74 = new C44311l74(this.f15397k, ((ZC0) this.f15395i).mo18342K());
                this.f15394h = 1;
                if (function2.invoke(c44311l74, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3", m28418f = "ProduceState.kt", m28417i = {}, m28416l = {151}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: IM5$b */
    /* loaded from: classes.dex */
    public static final class C3516b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f15398h;

        /* renamed from: i */
        public /* synthetic */ Object f15399i;

        /* renamed from: j */
        public final /* synthetic */ Function2<InterfaceC43718k74<T>, Continuation<? super Unit>, Object> f15400j;

        /* renamed from: k */
        public final /* synthetic */ EX2<T> f15401k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3516b(Function2<? super InterfaceC43718k74<T>, ? super Continuation<? super Unit>, ? extends Object> function2, EX2<T> ex2, Continuation<? super C3516b> continuation) {
            super(2, continuation);
            this.f15400j = function2;
            this.f15401k = ex2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C3516b c3516b = new C3516b(this.f15400j, this.f15401k, continuation);
            c3516b.f15399i = obj;
            return c3516b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C3516b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f15398h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Function2<InterfaceC43718k74<T>, Continuation<? super Unit>, Object> function2 = this.f15400j;
                C44311l74 c44311l74 = new C44311l74(this.f15401k, ((ZC0) this.f15399i).mo18342K());
                this.f15398h = 1;
                if (function2.invoke(c44311l74, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC48627sP5<T> m102454a(T t, Object obj, Object obj2, Function2<? super InterfaceC43718k74<T>, ? super Continuation<? super Unit>, ? extends Object> producer, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(producer, "producer");
        interfaceC32720Et0.mo89638F(-1703169085);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1703169085, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:142)");
        }
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = LM5.m97025e(t, null, 2, null);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        EX2 ex2 = (EX2) mo89635G;
        Y91.m75534e(obj, obj2, new C3516b(producer, ex2, null), interfaceC32720Et0, 584);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return ex2;
    }

    /* renamed from: b */
    public static final <T> InterfaceC48627sP5<T> m102453b(T t, Function2<? super InterfaceC43718k74<T>, ? super Continuation<? super Unit>, ? extends Object> producer, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(producer, "producer");
        interfaceC32720Et0.mo89638F(10454275);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(10454275, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:77)");
        }
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = LM5.m97025e(t, null, 2, null);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        EX2 ex2 = (EX2) mo89635G;
        Y91.m75533f(Unit.INSTANCE, new C3515a(producer, ex2, null), interfaceC32720Et0, 70);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return ex2;
    }
}
