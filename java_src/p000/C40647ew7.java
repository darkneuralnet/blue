package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzau;
import java.util.Iterator;
/* renamed from: ew7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40647ew7 implements Iterator {

    /* renamed from: b */
    public final Iterator f79165b;

    /* renamed from: c */
    public final /* synthetic */ zzau f79166c;

    public C40647ew7(zzau zzauVar) {
        Bundle bundle;
        this.f79166c = zzauVar;
        bundle = zzauVar.f71528b;
        this.f79165b = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final String next() {
        return (String) this.f79165b.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f79165b.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
