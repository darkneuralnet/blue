package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireInventoryPart;
import co.bird.android.model.wire.WirePartCategory;
import co.bird.api.request.AdjustInventoryCountRequest;
import co.bird.api.response.AdjustInventoryCountResponse;
import co.bird.api.response.InventoryStatusResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.AbstractC23442F;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'J6\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\t\u001a\u00020\u0006H'J.\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00030\u00022\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\t\u001a\u00020\u0006H'J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0006H'¨\u0006\u0014"}, m28432d2 = {"LWl3;", "", "Lio/reactivex/F;", "", "Lco/bird/android/model/wire/WirePartCategory;", "c", "", "categoryId", Entry.TYPE_TEXT, "warehouseId", "Lco/bird/android/model/wire/WireInventoryPart;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/api/response/InventoryStatusResponse;", C17296a.f69688o, "Lco/bird/api/request/AdjustInventoryCountRequest;", "body", "Lco/bird/api/response/AdjustInventoryCountResponse;", "e", "sku", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Wl3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC36863Wl3 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Wl3$a */
    /* loaded from: classes4.dex */
    public static final class C9164a {
        public static /* synthetic */ AbstractC23442F searchParts$default(InterfaceC36863Wl3 interfaceC36863Wl3, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                if ((i & 2) != 0) {
                    str2 = null;
                }
                return interfaceC36863Wl3.m77881d(str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchParts");
        }
    }

    @NA1("/inventory-counts/health")
    /* renamed from: a */
    AbstractC23442F<InventoryStatusResponse> m77884a(@InterfaceC37017Xc4("warehouse_id") String str);

    @NA1("/warehouse-inventory/part")
    /* renamed from: b */
    AbstractC23442F<WireInventoryPart> m77883b(@InterfaceC37017Xc4("warehouse_id") String str, @InterfaceC37017Xc4("sku") String str2);

    @NA1("/sku-categories/all")
    /* renamed from: c */
    AbstractC23442F<List<WirePartCategory>> m77882c();

    @NA1("/warehouse-inventory/filter")
    /* renamed from: d */
    AbstractC23442F<List<WireInventoryPart>> m77881d(@InterfaceC37017Xc4("category_id") String str, @InterfaceC37017Xc4("search") String str2, @InterfaceC37017Xc4("warehouse_id") String str3);

    @CD3("/warehouse-inventory/adjust-quantities")
    /* renamed from: e */
    AbstractC23442F<List<AdjustInventoryCountResponse>> m77880e(@InterfaceC6404PY List<AdjustInventoryCountRequest> list, @InterfaceC37017Xc4("warehouse_id") String str);
}
