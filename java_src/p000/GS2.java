package p000;

import android.view.MenuItem;
import co.bird.android.model.wire.WireMerchantSite;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H&J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\u0016\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\bH&J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\bH&R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m28432d2 = {"LGS2;", "LZ03;", "LaM5;", "LH31;", "LS74;", "Lio/reactivex/Observable;", "Landroid/view/MenuItem;", "ag", "", "U6", "", "title", "", "t", "", "Lco/bird/android/model/wire/WireMerchantSite;", "stores", "n8", "show", "el", "Ua", "y6", "()Lio/reactivex/Observable;", "storeChanges", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: GS2 */
/* loaded from: classes3.dex */
public interface GS2 extends Z03, InterfaceC37910aM5, H31, S74 {
    /* renamed from: U6 */
    Observable<Boolean> mo100440U6();

    /* renamed from: Ua */
    void mo100439Ua(boolean z);

    /* renamed from: ag */
    Observable<MenuItem> mo100436ag();

    /* renamed from: el */
    void mo100433el(boolean z);

    /* renamed from: n8 */
    void mo100432n8(List<WireMerchantSite> list);

    /* renamed from: t */
    void mo100431t(String str);

    /* renamed from: y6 */
    Observable<WireMerchantSite> mo100430y6();
}
