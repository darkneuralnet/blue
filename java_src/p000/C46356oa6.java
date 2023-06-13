package p000;

import java.util.Comparator;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0003j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Loa6;", "E", "Ljava/util/TreeSet;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "<init>", "(Ljava/util/Comparator;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oa6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46356oa6<E> extends TreeSet<E> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46356oa6(Comparator<? super E> comparator) {
        super(comparator);
        Intrinsics.checkNotNullParameter(comparator, "comparator");
    }

    /* renamed from: e */
    public /* bridge */ int m20826e() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return m20826e();
    }
}
