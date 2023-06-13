package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AggregateFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class CollectionFuture<V, C> extends AggregateFuture<V, C> {
    private List<Present<V>> values;

    /* loaded from: classes6.dex */
    public static final class ListFuture<V> extends CollectionFuture<V, List<V>> {
        public ListFuture(QY1<? extends ListenableFuture<? extends V>> qy1, boolean z) {
            super(qy1, z);
            init();
        }

        @Override // com.google.common.util.concurrent.CollectionFuture
        public List<V> combine(List<Present<V>> list) {
            ArrayList m93252j = C34819Ns2.m93252j(list.size());
            Iterator<Present<V>> it = list.iterator();
            while (it.hasNext()) {
                Present<V> next = it.next();
                m93252j.add(next != null ? next.value : null);
            }
            return Collections.unmodifiableList(m93252j);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Present<V> {
        V value;

        public Present(V v) {
            this.value = v;
        }
    }

    public CollectionFuture(QY1<? extends ListenableFuture<? extends V>> qy1, boolean z) {
        super(qy1, z, true);
        List<Present<V>> m93252j;
        if (qy1.isEmpty()) {
            m93252j = Collections.emptyList();
        } else {
            m93252j = C34819Ns2.m93252j(qy1.size());
        }
        for (int i = 0; i < qy1.size(); i++) {
            m93252j.add(null);
        }
        this.values = m93252j;
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public final void collectOneValue(int i, @ParametricNullness V v) {
        List<Present<V>> list = this.values;
        if (list != null) {
            list.set(i, new Present<>(v));
        }
    }

    public abstract C combine(List<Present<V>> list);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.util.concurrent.AggregateFuture
    public final void handleAllCompleted() {
        List<Present<V>> list = this.values;
        if (list != null) {
            set(combine(list));
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public void releaseResources(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.releaseResources(releaseResourcesReason);
        this.values = null;
    }
}
