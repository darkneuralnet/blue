package p000;

import android.graphics.Bitmap;
import android.location.Location;
import co.bird.android.model.BirdInspectionPoint;
import co.bird.android.model.MechanicPhotoMode;
import co.bird.android.model.wire.WireBird;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H&J0\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015H&J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015H&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015H&J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015H&J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bH&J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0017H&J\b\u0010\u001f\u001a\u00020\u0004H&¨\u0006 "}, m28432d2 = {"LlP2;", "LaM5;", "LH31;", "LS74;", "", "Rh", "M1", "E6", "q4", "i", "Lco/bird/android/model/MechanicPhotoMode;", "mode", "Lco/bird/android/model/BirdInspectionPoint;", "inspectionPoint", "", "photoCount", "Lco/bird/android/model/wire/WireBird;", "bird", "Landroid/location/Location;", "location", "a3", "Lio/reactivex/Observable;", "Cd", "Landroid/graphics/Bitmap;", "Vk", "h0", "i7", "Lio/reactivex/F;", "Z", Entry.TYPE_IMAGE, "cg", "pc", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lP2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC44474lP2 extends InterfaceC37910aM5, H31, S74 {
    /* renamed from: Cd */
    Observable<Unit> mo23846Cd();

    /* renamed from: E6 */
    void mo23845E6();

    /* renamed from: M1 */
    void mo23844M1();

    /* renamed from: Rh */
    void mo23841Rh();

    /* renamed from: Vk */
    Observable<Bitmap> mo23840Vk();

    /* renamed from: Z */
    AbstractC23442F<Bitmap> mo23839Z();

    /* renamed from: a3 */
    void mo23838a3(MechanicPhotoMode mechanicPhotoMode, BirdInspectionPoint birdInspectionPoint, int i, WireBird wireBird, Location location);

    /* renamed from: cg */
    void mo23837cg(Bitmap bitmap);

    /* renamed from: h0 */
    Observable<Unit> mo23836h0();

    /* renamed from: i */
    void mo23835i();

    /* renamed from: i7 */
    Observable<Unit> mo23834i7();

    /* renamed from: pc */
    void mo23833pc();

    /* renamed from: q4 */
    void mo23832q4();
}
