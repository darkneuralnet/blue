package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, m28432d2 = {"T", "R", "Lkotlin/sequences/SequenceScope;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", m28418f = "_Sequences.kt", m28417i = {0, 1, 1, 1}, m28416l = {2318, 2323}, m28415m = "invokeSuspend", m28414n = {"$this$sequence", "$this$sequence", "accumulator", "index"}, m28413s = {"L$0", "L$0", "L$1", "I$0"})
/* loaded from: classes8.dex */
public final class SequencesKt___SequencesKt$runningFoldIndexed$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ R $initial;
    final /* synthetic */ Function3<Integer, R, T, R> $operation;
    final /* synthetic */ Sequence<T> $this_runningFoldIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$runningFoldIndexed$1(R r, Sequence<? extends T> sequence, Function3<? super Integer, ? super R, ? super T, ? extends R> function3, Continuation<? super SequencesKt___SequencesKt$runningFoldIndexed$1> continuation) {
        super(2, continuation);
        this.$initial = r;
        this.$this_runningFoldIndexed = sequence;
        this.$operation = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequencesKt___SequencesKt$runningFoldIndexed$1 sequencesKt___SequencesKt$runningFoldIndexed$1 = new SequencesKt___SequencesKt$runningFoldIndexed$1(this.$initial, this.$this_runningFoldIndexed, this.$operation, continuation);
        sequencesKt___SequencesKt$runningFoldIndexed$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFoldIndexed$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        SequenceScope sequenceScope;
        Object obj2;
        Iterator it;
        int i;
        SequenceScope sequenceScope2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.I$0;
                    it = (Iterator) this.L$2;
                    Object obj3 = this.L$1;
                    sequenceScope2 = (SequenceScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj3;
                    i = i3;
                    while (it.hasNext()) {
                        Object next = it.next();
                        Function3<Integer, R, T, R> function3 = this.$operation;
                        int i4 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        Object invoke = function3.invoke(Boxing.boxInt(i), obj2, next);
                        this.L$0 = sequenceScope2;
                        this.L$1 = invoke;
                        this.L$2 = it;
                        this.I$0 = i4;
                        this.label = 2;
                        if (sequenceScope2.yield(invoke, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = invoke;
                        i = i4;
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sequenceScope = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
            R r = this.$initial;
            this.L$0 = sequenceScope;
            this.label = 1;
            if (sequenceScope.yield(r, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        obj2 = this.$initial;
        it = this.$this_runningFoldIndexed.iterator();
        i = 0;
        sequenceScope2 = sequenceScope;
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super R> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SequencesKt___SequencesKt$runningFoldIndexed$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}