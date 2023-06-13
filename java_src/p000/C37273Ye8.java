package p000;

import java.util.Comparator;
/* renamed from: Ye8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37273Ye8 implements Comparator<AbstractC47966rH8> {
    public C37273Ye8(C34537Mm8 c34537Mm8) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(AbstractC47966rH8 abstractC47966rH8, AbstractC47966rH8 abstractC47966rH82) {
        return abstractC47966rH8.getClass().getCanonicalName().compareTo(abstractC47966rH82.getClass().getCanonicalName());
    }
}
