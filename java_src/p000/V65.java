package p000;

import androidx.recyclerview.widget.C11905h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Detail;
import co.bird.android.model.RideStatusBottomSheetButton;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\f\u0010\u000b\u001a\u00020\u0004*\u00020\nH\u0002J\f\u0010\f\u001a\u00020\u0004*\u00020\nH\u0002¨\u0006\u000f"}, m28432d2 = {"LV65;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "Lb75;", "e", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideStatusBottomSheetAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStatusBottomSheetAdapterDiff.kt\nco/bird/android/feature/rider/bottomsheets/adapters/RideStatusBottomSheetAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,30:1\n18#2:31\n18#2:36\n9#3,4:32\n9#3,4:37\n*S KotlinDebug\n*F\n+ 1 RideStatusBottomSheetAdapterDiff.kt\nco/bird/android/feature/rider/bottomsheets/adapters/RideStatusBottomSheetAdapterDiff\n*L\n12#1:31\n20#1:36\n12#1:32,4\n20#1:37,4\n*E\n"})
/* renamed from: V65 */
/* loaded from: classes3.dex */
public final class V65 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String m80387e;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        if (adapterItem.m105817b() != C33570Ij4.item_ride_state_header) {
            return "";
        }
        Object m105816c = adapterItem.m105816c();
        if (!(m105816c instanceof C38365b75)) {
            m105816c = null;
        }
        C38365b75 c38365b75 = (C38365b75) m105816c;
        if (c38365b75 == null || (m80387e = m80387e(c38365b75)) == null) {
            return "";
        }
        return m80387e;
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        C38365b75 c38365b75;
        String str;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        boolean z = m105816c instanceof C38365b75;
        if (z) {
            String str2 = null;
            if (z) {
                c38365b75 = (C38365b75) m105816c;
            } else {
                c38365b75 = null;
            }
            if (c38365b75 != null) {
                str = m80388d(c38365b75);
            } else {
                str = null;
            }
            Object m105816c2 = newItem.m105816c();
            if (!(m105816c2 instanceof C38365b75)) {
                m105816c2 = null;
            }
            C38365b75 c38365b752 = (C38365b75) m105816c2;
            if (c38365b752 != null) {
                str2 = m80388d(c38365b752);
            }
            if (!Intrinsics.areEqual(str, str2)) {
                return true;
            }
        } else if (!Intrinsics.areEqual(m105816c, newItem.m105816c())) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final String m80388d(C38365b75 c38365b75) {
        int m64938k = c38365b75.m64938k();
        String m64939j = c38365b75.m64939j();
        String m64943f = c38365b75.m64943f();
        RideStatusBottomSheetButton m64944e = c38365b75.m64944e();
        RideStatusBottomSheetButton m64942g = c38365b75.m64942g();
        boolean m64941h = c38365b75.m64941h();
        boolean m64946c = c38365b75.m64946c();
        R46 m64940i = c38365b75.m64940i();
        return m64938k + Detail.EMPTY_CHAR + m64939j + Detail.EMPTY_CHAR + m64943f + Detail.EMPTY_CHAR + m64944e + Detail.EMPTY_CHAR + m64942g + Detail.EMPTY_CHAR + m64941h + Detail.EMPTY_CHAR + m64946c + Detail.EMPTY_CHAR + m64940i;
    }

    /* renamed from: e */
    public final String m80387e(C38365b75 c38365b75) {
        return c38365b75.m64939j();
    }
}
