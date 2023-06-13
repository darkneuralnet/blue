package p000;

import co.bird.android.model.persistence.FleetList;
import co.bird.android.model.persistence.FleetListSection;
import co.bird.android.model.persistence.FleetListVehicle;
import co.bird.android.model.persistence.FleetStatus;
import co.bird.android.model.persistence.FleetStatusSummary;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import no.nordicsemi.android.ble.AbstractC26684u0;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H&J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH&J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH&J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH&J$\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH&J,\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH&J\u0016\u0010\u001a\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H&J\"\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00050\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H&¨\u0006\u001c"}, m28432d2 = {"LBq1;", "", "Lio/reactivex/c;", "w0", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/FleetStatusSummary;", "x0", "", "fleetId", "v0", "y0", "", "includePredictions", "Lco/bird/android/model/persistence/FleetStatus;", "k", "list", AbstractC26684u0.f100690q, "Lco/bird/android/model/persistence/FleetList;", "J", "Lco/bird/android/model/persistence/FleetListSection;", "q0", "section", "Lco/bird/android/model/persistence/FleetListVehicle;", "H", "birdIds", "z", "c", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Bq1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC31992Bq1 {
    /* renamed from: H */
    Observable<List<FleetListVehicle>> mo111432H(String str, String str2, String str3);

    /* renamed from: J */
    Observable<FleetList> mo111431J(String str, String str2);

    /* renamed from: c */
    Observable<List<FleetListVehicle>> mo111430c(List<String> list);

    /* renamed from: k */
    Observable<List<FleetStatus>> mo111429k(String str, boolean z);

    /* renamed from: q0 */
    Observable<List<FleetListSection>> mo111428q0(String str, String str2);

    /* renamed from: u0 */
    AbstractC23461c mo111427u0(String str, String str2);

    /* renamed from: v0 */
    AbstractC23461c mo111426v0(String str);

    /* renamed from: w0 */
    AbstractC23461c mo111425w0();

    /* renamed from: x0 */
    Observable<List<FleetStatusSummary>> mo111424x0();

    /* renamed from: y0 */
    AbstractC23461c mo111423y0(String str);

    /* renamed from: z */
    AbstractC23461c mo111422z(List<String> list);
}
