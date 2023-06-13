package kotlin.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequenceScope;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, m28432d2 = {"T", "Lkotlin/sequences/SequenceScope;", "", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m28418f = "SlidingWindow.kt", m28417i = {0, 0, 0, 2, 2, 3, 3}, m28416l = {34, 40, 49, 55, 58}, m28415m = "invokeSuspend", m28414n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, m28413s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes8.dex */
public final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super List<? extends T>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Iterator<T> $iterator;
    final /* synthetic */ boolean $partialWindows;
    final /* synthetic */ boolean $reuseBuffer;
    final /* synthetic */ int $size;
    final /* synthetic */ int $step;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SlidingWindowKt$windowedIterator$1(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, Continuation<? super SlidingWindowKt$windowedIterator$1> continuation) {
        super(2, continuation);
        this.$size = i;
        this.$step = i2;
        this.$iterator = it;
        this.$reuseBuffer = z;
        this.$partialWindows = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, continuation);
        slidingWindowKt$windowedIterator$1.L$0 = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0154  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a6 -> B:16:0x0058). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x011d -> B:59:0x0120). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x014b -> B:72:0x014e). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        int coerceAtMost;
        RingBuffer ringBuffer;
        Iterator it;
        SequenceScope sequenceScope;
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1;
        SequenceScope sequenceScope2;
        int i;
        ArrayList arrayList;
        Iterator it2;
        int i2;
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$12;
        RingBuffer ringBuffer2;
        SequenceScope sequenceScope3;
        RandomAccess arrayList2;
        RandomAccess arrayList3;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ringBuffer2 = (RingBuffer) this.L$1;
                            sequenceScope3 = (SequenceScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            slidingWindowKt$windowedIterator$1 = this;
                            ringBuffer2.removeFirst(slidingWindowKt$windowedIterator$1.$step);
                            if (ringBuffer2.size() <= slidingWindowKt$windowedIterator$1.$step) {
                                if (slidingWindowKt$windowedIterator$1.$reuseBuffer) {
                                    arrayList3 = ringBuffer2;
                                } else {
                                    arrayList3 = new ArrayList(ringBuffer2);
                                }
                                slidingWindowKt$windowedIterator$1.L$0 = sequenceScope3;
                                slidingWindowKt$windowedIterator$1.L$1 = ringBuffer2;
                                slidingWindowKt$windowedIterator$1.L$2 = null;
                                slidingWindowKt$windowedIterator$1.label = 4;
                                if (sequenceScope3.yield(arrayList3, slidingWindowKt$windowedIterator$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ringBuffer2.removeFirst(slidingWindowKt$windowedIterator$1.$step);
                                if (ringBuffer2.size() <= slidingWindowKt$windowedIterator$1.$step) {
                                    if (!ringBuffer2.isEmpty()) {
                                        slidingWindowKt$windowedIterator$1.L$0 = null;
                                        slidingWindowKt$windowedIterator$1.L$1 = null;
                                        slidingWindowKt$windowedIterator$1.L$2 = null;
                                        slidingWindowKt$windowedIterator$1.label = 5;
                                        if (sequenceScope3.yield(ringBuffer2, slidingWindowKt$windowedIterator$1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    } else {
                        it = (Iterator) this.L$2;
                        ringBuffer = (RingBuffer) this.L$1;
                        sequenceScope = (SequenceScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        slidingWindowKt$windowedIterator$1 = this;
                        ringBuffer.removeFirst(slidingWindowKt$windowedIterator$1.$step);
                        while (it.hasNext()) {
                            ringBuffer.add((RingBuffer) it.next());
                            if (ringBuffer.isFull()) {
                                int size = ringBuffer.size();
                                int i4 = slidingWindowKt$windowedIterator$1.$size;
                                if (size < i4) {
                                    ringBuffer = ringBuffer.expanded(i4);
                                } else {
                                    if (slidingWindowKt$windowedIterator$1.$reuseBuffer) {
                                        arrayList2 = ringBuffer;
                                    } else {
                                        arrayList2 = new ArrayList(ringBuffer);
                                    }
                                    slidingWindowKt$windowedIterator$1.L$0 = sequenceScope;
                                    slidingWindowKt$windowedIterator$1.L$1 = ringBuffer;
                                    slidingWindowKt$windowedIterator$1.L$2 = it;
                                    slidingWindowKt$windowedIterator$1.label = 3;
                                    if (sequenceScope.yield(arrayList2, slidingWindowKt$windowedIterator$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    ringBuffer.removeFirst(slidingWindowKt$windowedIterator$1.$step);
                                    while (it.hasNext()) {
                                    }
                                }
                            }
                        }
                        if (slidingWindowKt$windowedIterator$1.$partialWindows) {
                            ringBuffer2 = ringBuffer;
                            sequenceScope3 = sequenceScope;
                            if (ringBuffer2.size() <= slidingWindowKt$windowedIterator$1.$step) {
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            i2 = this.I$0;
            it2 = (Iterator) this.L$2;
            arrayList = (ArrayList) this.L$1;
            sequenceScope2 = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            slidingWindowKt$windowedIterator$12 = this;
            i = i2;
            if (!slidingWindowKt$windowedIterator$12.$reuseBuffer) {
                arrayList.clear();
            } else {
                arrayList = new ArrayList(slidingWindowKt$windowedIterator$12.$size);
            }
            i2 = i;
            while (it2.hasNext()) {
                Object next = it2.next();
                if (i > 0) {
                    i--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == slidingWindowKt$windowedIterator$12.$size) {
                        slidingWindowKt$windowedIterator$12.L$0 = sequenceScope2;
                        slidingWindowKt$windowedIterator$12.L$1 = arrayList;
                        slidingWindowKt$windowedIterator$12.L$2 = it2;
                        slidingWindowKt$windowedIterator$12.I$0 = i2;
                        slidingWindowKt$windowedIterator$12.label = 1;
                        if (sequenceScope2.yield(arrayList, slidingWindowKt$windowedIterator$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i = i2;
                        if (!slidingWindowKt$windowedIterator$12.$reuseBuffer) {
                        }
                        i2 = i;
                        while (it2.hasNext()) {
                        }
                    }
                }
            }
            if ((!arrayList.isEmpty()) && (slidingWindowKt$windowedIterator$12.$partialWindows || arrayList.size() == slidingWindowKt$windowedIterator$12.$size)) {
                slidingWindowKt$windowedIterator$12.L$0 = null;
                slidingWindowKt$windowedIterator$12.L$1 = null;
                slidingWindowKt$windowedIterator$12.L$2 = null;
                slidingWindowKt$windowedIterator$12.label = 2;
                if (sequenceScope2.yield(arrayList, slidingWindowKt$windowedIterator$12) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        SequenceScope sequenceScope4 = (SequenceScope) this.L$0;
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(this.$size, 1024);
        int i5 = this.$step - this.$size;
        if (i5 >= 0) {
            sequenceScope2 = sequenceScope4;
            i = 0;
            arrayList = new ArrayList(coerceAtMost);
            it2 = this.$iterator;
            i2 = i5;
            slidingWindowKt$windowedIterator$12 = this;
            while (it2.hasNext()) {
            }
            if (!arrayList.isEmpty()) {
                slidingWindowKt$windowedIterator$12.L$0 = null;
                slidingWindowKt$windowedIterator$12.L$1 = null;
                slidingWindowKt$windowedIterator$12.L$2 = null;
                slidingWindowKt$windowedIterator$12.label = 2;
                if (sequenceScope2.yield(arrayList, slidingWindowKt$windowedIterator$12) == coroutine_suspended) {
                }
            }
            return Unit.INSTANCE;
        }
        ringBuffer = new RingBuffer(coerceAtMost);
        it = this.$iterator;
        sequenceScope = sequenceScope4;
        slidingWindowKt$windowedIterator$1 = this;
        while (it.hasNext()) {
        }
        if (slidingWindowKt$windowedIterator$1.$partialWindows) {
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super List<? extends T>> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SlidingWindowKt$windowedIterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
