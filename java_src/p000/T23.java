package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.persistence.nestedstructures.NestFavoritePartner;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LT23;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestFavoritePartnerAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFavoritePartnerAdapterDiff.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/adapters/NestFavoritePartnerAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,20:1\n18#2:21\n18#2:26\n18#2:31\n9#3,4:22\n9#3,4:27\n9#3,4:32\n*S KotlinDebug\n*F\n+ 1 NestFavoritePartnerAdapterDiff.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/adapters/NestFavoritePartnerAdapterDiff\n*L\n10#1:21\n14#1:26\n15#1:31\n10#1:22,4\n14#1:27,4\n15#1:32,4\n*E\n"})
/* renamed from: T23 */
/* loaded from: classes2.dex */
public final class T23 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        NestFavoritePartner nestFavoritePartner;
        String partnerId;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        Object m105816c = adapterItem.m105816c();
        if (!(m105816c instanceof Pair)) {
            m105816c = null;
        }
        Pair pair = (Pair) m105816c;
        if (pair == null || (nestFavoritePartner = (NestFavoritePartner) pair.getFirst()) == null || (partnerId = nestFavoritePartner.getPartnerId()) == null) {
            return "";
        }
        return partnerId;
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        Boolean bool2 = null;
        if (!(m105816c instanceof Pair)) {
            m105816c = null;
        }
        Pair pair = (Pair) m105816c;
        if (pair != null) {
            bool = (Boolean) pair.getSecond();
        } else {
            bool = null;
        }
        Object m105816c2 = newItem.m105816c();
        if (!(m105816c2 instanceof Pair)) {
            m105816c2 = null;
        }
        Pair pair2 = (Pair) m105816c2;
        if (pair2 != null) {
            bool2 = (Boolean) pair2.getSecond();
        }
        return !Intrinsics.areEqual(bool, bool2);
    }
}
