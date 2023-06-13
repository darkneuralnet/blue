package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"kotlin/sequences/SequencesKt__SequenceBuilderKt", "kotlin/sequences/SequencesKt__SequencesJVMKt", "kotlin/sequences/SequencesKt__SequencesKt", "kotlin/sequences/SequencesKt___SequencesJvmKt", "kotlin/sequences/SequencesKt___SequencesKt"}, m28431k = 4, m28430mv = {1, 8, 0}, m28428xi = 49)
/* loaded from: classes8.dex */
public final class SequencesKt extends SequencesKt___SequencesKt {
    private SequencesKt() {
    }

    public static /* bridge */ /* synthetic */ Sequence asSequence(Iterator it) {
        return SequencesKt__SequencesKt.asSequence(it);
    }

    public static /* bridge */ /* synthetic */ Sequence filter(Sequence sequence, Function1 function1) {
        return SequencesKt___SequencesKt.filter(sequence, function1);
    }

    @LowPriorityInOverloadResolution
    public static /* bridge */ /* synthetic */ Sequence generateSequence(Object obj, Function1 function1) {
        return SequencesKt__SequencesKt.generateSequence(obj, function1);
    }

    public static /* bridge */ /* synthetic */ Sequence map(Sequence sequence, Function1 function1) {
        return SequencesKt___SequencesKt.map(sequence, function1);
    }
}
