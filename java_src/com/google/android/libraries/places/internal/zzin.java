package com.google.android.libraries.places.internal;

import java.util.Iterator;
/* loaded from: classes6.dex */
abstract class zzin implements Iterator {
    final Iterator zzb;

    public zzin(Iterator it) {
        it.getClass();
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza(this.zzb.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzb.remove();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zza(Object obj);
}
