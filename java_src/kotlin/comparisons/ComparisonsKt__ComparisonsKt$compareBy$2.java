package kotlin.comparisons;

import ch.qos.logback.core.net.SyslogConstants;
import com.facebook.share.internal.C17296a;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = SyslogConstants.LOG_LOCAL6)
@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n*L\n1#1,328:1\n*E\n"})
/* loaded from: classes8.dex */
public final class ComparisonsKt__ComparisonsKt$compareBy$2<T> implements Comparator {
    final /* synthetic */ Function1<T, Comparable<?>> $selector;

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonsKt__ComparisonsKt$compareBy$2(Function1<? super T, ? extends Comparable<?>> function1) {
        this.$selector = function1;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compareValues;
        Function1<T, Comparable<?>> function1 = this.$selector;
        compareValues = ComparisonsKt__ComparisonsKt.compareValues(function1.invoke(t), function1.invoke(t2));
        return compareValues;
    }
}
