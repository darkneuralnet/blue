package p000;

import java.lang.Comparable;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b`\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m28432d2 = {"LQh3;", "", "T", "", "", "isEmpty", "getStart", "()Ljava/lang/Comparable;", "start", "getEndExclusive", "endExclusive", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qh3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC35423Qh3<T extends Comparable<? super T>> {
    T getEndExclusive();

    T getStart();

    default boolean isEmpty() {
        return getStart().compareTo(getEndExclusive()) >= 0;
    }
}
