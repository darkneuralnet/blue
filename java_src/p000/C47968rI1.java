package p000;

import co.bird.android.model.constant.HealthStatus;
import co.bird.api.response.InventoryStatusResponse;
import co.bird.api.response.WireInventory;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\b"}, m28432d2 = {"Lco/bird/android/model/constant/HealthStatus;", "", "b", "Lco/bird/api/response/InventoryStatusResponse;", "inventoryStatus", "", "Lco/bird/api/response/WireInventory;", C17296a.f69688o, "co.bird.android.feature.operator-inventory"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: rI1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47968rI1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rI1$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C27896a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HealthStatus.values().length];
            try {
                iArr[HealthStatus.INCOMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HealthStatus.OUT_OF_STOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HealthStatus.RUNNING_LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final List<WireInventory> m16112a(HealthStatus healthStatus, InventoryStatusResponse inventoryStatus) {
        Intrinsics.checkNotNullParameter(healthStatus, "<this>");
        Intrinsics.checkNotNullParameter(inventoryStatus, "inventoryStatus");
        int i = C27896a.$EnumSwitchMapping$0[healthStatus.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return inventoryStatus.getRunningLow();
                }
                throw new NoWhenBranchMatchedException();
            }
            return inventoryStatus.getOutOfStock();
        }
        return inventoryStatus.getIncompleteInventory();
    }

    /* renamed from: b */
    public static final int m16111b(HealthStatus healthStatus) {
        Intrinsics.checkNotNullParameter(healthStatus, "<this>");
        int i = C27896a.$EnumSwitchMapping$0[healthStatus.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return C45871nl4.operator_inventory_status_running_low_title;
                }
                throw new NoWhenBranchMatchedException();
            }
            return C45871nl4.operator_inventory_status_oos_title;
        }
        return C45871nl4.operator_inventory_status_incomplete_title;
    }
}
