package p000;

import co.bird.android.model.constant.MapMode;
import co.bird.android.model.wire.WirePhysicalLock;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/model/constant/MapMode;", "", "private", "unlocking", "isHelmetLock", "Lco/bird/android/model/wire/WirePhysicalLock;", "physicalLock", "", "fineString", "Lgx2;", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: UL5 */
/* loaded from: classes2.dex */
public final class UL5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: UL5$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C8261a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapMode.values().length];
            try {
                iArr[MapMode.RIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MapMode.OPERATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final EnumC41838gx2 m81617a(MapMode mapMode, boolean z, boolean z2, boolean z3, WirePhysicalLock wirePhysicalLock, String str) {
        Intrinsics.checkNotNullParameter(mapMode, "<this>");
        int i = C8261a.$EnumSwitchMapping$0[mapMode.ordinal()];
        EnumC41838gx2 enumC41838gx2 = null;
        boolean z4 = true;
        if (i != 1) {
            if (i == 2 && z2) {
                enumC41838gx2 = EnumC41838gx2.f84515u;
            }
        } else {
            if (wirePhysicalLock == null || !wirePhysicalLock.isBrainBasedBluetooth()) {
                z4 = false;
            }
            if (z4) {
                enumC41838gx2 = z2 ? EnumC41838gx2.f84516v : str != null ? EnumC41838gx2.f84518x : EnumC41838gx2.f84517w;
            } else if (z3) {
                enumC41838gx2 = z2 ? EnumC41838gx2.f84519y : EnumC41838gx2.f84520z;
            } else if (!z) {
                enumC41838gx2 = z2 ? EnumC41838gx2.f84509o : EnumC41838gx2.f84510p;
            } else if (z) {
                enumC41838gx2 = z2 ? EnumC41838gx2.f84514t : EnumC41838gx2.f84513s;
            }
        }
        if (enumC41838gx2 == null) {
            return EnumC41838gx2.f84508n;
        }
        return enumC41838gx2;
    }

    public static /* synthetic */ EnumC41838gx2 lockState$default(MapMode mapMode, boolean z, boolean z2, boolean z3, WirePhysicalLock wirePhysicalLock, String str, int i, Object obj) {
        if ((i & 16) != 0) {
            str = null;
        }
        return m81617a(mapMode, z, z2, z3, wirePhysicalLock, str);
    }
}
