package p000;

import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSuccessfulScannedItem;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, m28432d2 = {"LOC5;", "", "Lco/bird/android/model/wire/WireSkuOrder;", C17296a.f69688o, "()Lco/bird/android/model/wire/WireSkuOrder;", "skuOrder", "", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "b", "()Ljava/util/List;", "scannedItems", "", "getError", "()Ljava/lang/Throwable;", "error", "LSf1;", "LZe6;", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: OC5 */
/* loaded from: classes3.dex */
public interface OC5 {
    /* renamed from: a */
    WireSkuOrder mo72802a();

    /* renamed from: b */
    List<WireSuccessfulScannedItem> mo72801b();

    Throwable getError();
}
