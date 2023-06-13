package p000;

import ch.qos.logback.core.joran.action.Action;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00028\u00010\u0005¨\u0006\n"}, m28432d2 = {"T1", "R", "LtP5;", "LZC0;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", C17296a.f69688o, "transform", "coroutine_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransformedStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedStateFlow.kt\nco/bird/android/lib/coroutine/TransformedStateFlowKt\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,49:1\n190#2:50\n*S KotlinDebug\n*F\n+ 1 TransformedStateFlow.kt\nco/bird/android/lib/coroutine/TransformedStateFlowKt\n*L\n45#1:50\n*E\n"})
/* renamed from: z96  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52633z96 {

    @Metadata(m28433d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T1", "R", C17296a.f69688o, "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.lib.coroutine.TransformedStateFlowKt$mapState$1", m28418f = "TransformedStateFlow.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: z96$a */
    /* loaded from: classes3.dex */
    public static final class C30922a extends SuspendLambda implements Function2<T1, Continuation<? super R>, Object> {

        /* renamed from: h */
        public int f120890h;

        /* renamed from: i */
        public /* synthetic */ Object f120891i;

        /* renamed from: j */
        public final /* synthetic */ Function1<T1, R> f120892j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C30922a(Function1<? super T1, ? extends R> function1, Continuation<? super C30922a> continuation) {
            super(2, continuation);
            this.f120892j = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30922a c30922a = new C30922a(this.f120892j, continuation);
            c30922a.f120891i = obj;
            return c30922a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(T1 t1, Continuation<? super R> continuation) {
            return ((C30922a) create(t1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f120890h == 0) {
                ResultKt.throwOnFailure(obj);
                return this.f120892j.invoke(this.f120891i);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public static final <T1, R> InterfaceC49220tP5<R> m1739a(InterfaceC49220tP5<? extends T1> interfaceC49220tP5, ZC0 zc0, Function1<? super T1, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(interfaceC49220tP5, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new C52040y96(transform.invoke((T1) interfaceC49220tP5.getValue()), C36708Vu1.m79278J(interfaceC49220tP5, new C30922a(transform, null)), zc0);
    }

    public static /* synthetic */ InterfaceC49220tP5 mapState$default(InterfaceC49220tP5 interfaceC49220tP5, ZC0 zc0, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            zc0 = null;
        }
        return m1739a(interfaceC49220tP5, zc0, function1);
    }
}
