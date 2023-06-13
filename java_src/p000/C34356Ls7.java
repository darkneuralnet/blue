package p000;

import java.util.Comparator;
import kotlin.UByte;
/* renamed from: Ls7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34356Ls7 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC44175kt7 abstractC44175kt7 = (AbstractC44175kt7) obj;
        AbstractC44175kt7 abstractC44175kt72 = (AbstractC44175kt7) obj2;
        InterfaceC35058Os7 it = abstractC44175kt7.iterator();
        InterfaceC35058Os7 it2 = abstractC44175kt72.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int m98204a = C34122Ks7.m98204a(it.zza() & UByte.MAX_VALUE, it2.zza() & UByte.MAX_VALUE);
            if (m98204a != 0) {
                return m98204a;
            }
        }
        return C34122Ks7.m98204a(abstractC44175kt7.mo28217e(), abstractC44175kt72.mo28217e());
    }
}
