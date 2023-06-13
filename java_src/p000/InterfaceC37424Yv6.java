package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.GravityVector;
import com.google.p034ar.core.ArCoreApk;
import com.google.p034ar.core.Earth;
import com.google.p034ar.core.Session;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R&\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0007R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001b"}, m28432d2 = {"LYv6;", "Lrx4;", "LZv6;", "LZ84;", "Lco/bird/android/buava/Optional;", "Lcom/google/ar/core/Earth;", "r9", "()LZ84;", "earth", "", "LBx;", "A6", "barcodeUpdates", "Lcom/google/ar/core/Session;", "C4", "session", "Lio/reactivex/Observable;", "Lco/bird/android/model/DialogResponse;", "L8", "()Lio/reactivex/Observable;", "errorDialogResponse", "Lco/bird/android/model/GravityVector;", "E8", "sensorChanged", "Lcom/google/ar/core/ArCoreApk$InstallStatus;", "getArCoreInstallStatus", "arCoreInstallStatus", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Yv6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC37424Yv6 extends InterfaceC48362rx4<InterfaceC37658Zv6> {
    /* renamed from: A6 */
    Z84<Optional<List<C0774Bx>>> mo58921A6();

    /* renamed from: C4 */
    Z84<Optional<Session>> mo58920C4();

    /* renamed from: E8 */
    Observable<GravityVector> mo58919E8();

    /* renamed from: L8 */
    Observable<DialogResponse> mo58918L8();

    Observable<Optional<ArCoreApk.InstallStatus>> getArCoreInstallStatus();

    /* renamed from: r9 */
    Z84<Optional<Earth>> mo58902r9();
}
