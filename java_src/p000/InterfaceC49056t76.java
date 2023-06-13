package p000;

import co.bird.android.model.wire.WireMerchantTransaction;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H&J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H&¨\u0006\u0015"}, m28432d2 = {"Lt76;", "", "Lio/reactivex/Observable;", "", "M0", "Lco/bird/android/model/wire/WireMerchantTransaction;", "L", "LZD3;", "transactions", "N0", "", "title", "P0", "R0", "", "show", "Q0", "O0", "", "id", "getString", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: t76  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC49056t76 {
    /* renamed from: L */
    Observable<WireMerchantTransaction> mo9164L();

    /* renamed from: M0 */
    Observable<Unit> mo9163M0();

    /* renamed from: N0 */
    void mo9162N0(ZD3<WireMerchantTransaction> zd3);

    /* renamed from: O0 */
    void mo9161O0(boolean z);

    /* renamed from: P0 */
    void mo9160P0(String str);

    /* renamed from: Q0 */
    void mo9159Q0(boolean z);

    /* renamed from: R0 */
    void mo9158R0(String str);

    String getString(int i);
}
