package p000;

import com.google.android.gms.phenotype.zzi;
import java.util.Comparator;
/* renamed from: WG8 */
/* loaded from: classes6.dex */
public final class WG8 implements Comparator<zzi> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzi zziVar, zzi zziVar2) {
        zzi zziVar3 = zziVar;
        zzi zziVar4 = zziVar2;
        int i = zziVar3.f71773i;
        int i2 = zziVar4.f71773i;
        return i == i2 ? zziVar3.f71766b.compareTo(zziVar4.f71766b) : i - i2;
    }
}
