package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireInventoryPart;
import co.bird.android.model.wire.WirePartCategory;
import co.bird.api.response.AdjustInventoryCountResponse;
import co.bird.api.response.InventoryStatusResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\nH&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\f\u001a\u00020\u0006H&J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u0006H&J$\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00030\u00022\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H&J.\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00030\u00022\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u00140\u0003H&R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m28432d2 = {"LXl3;", "", "Lio/reactivex/F;", "", "Lco/bird/android/model/wire/WirePartCategory;", "b", "", "categoryId", "Lco/bird/android/model/wire/WireInventoryPart;", "f", "Lio/reactivex/c;", "e", "sku", C17296a.f69688o, "query", "c", "", "quantity", "Lco/bird/api/response/AdjustInventoryCountResponse;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Pair;", "parts", "h", "Lio/reactivex/Observable;", "Lco/bird/api/response/InventoryStatusResponse;", "g", "()Lio/reactivex/Observable;", "healthStatus", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Xl3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC37097Xl3 {
    /* renamed from: a */
    AbstractC23442F<WireInventoryPart> mo40850a(String str);

    /* renamed from: b */
    AbstractC23442F<List<WirePartCategory>> mo40849b();

    /* renamed from: c */
    AbstractC23442F<List<WireInventoryPart>> mo40848c(String str);

    /* renamed from: d */
    AbstractC23442F<List<AdjustInventoryCountResponse>> mo40847d(String str, int i);

    /* renamed from: e */
    AbstractC23461c mo40846e();

    /* renamed from: f */
    AbstractC23442F<List<WireInventoryPart>> mo40845f(String str);

    /* renamed from: g */
    Observable<InventoryStatusResponse> mo40844g();

    /* renamed from: h */
    AbstractC23442F<List<AdjustInventoryCountResponse>> mo40843h(List<Pair<String, Integer>> list);
}