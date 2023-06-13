package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.wire.ReleaseValidationResult;
import co.bird.android.vehiclescanner.common.mrp.InterfaceC16428a;
import io.reactivex.Observable;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u0003H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H&¨\u0006\u0011"}, m28432d2 = {"LJv4;", "Lco/bird/android/vehiclescanner/common/mrp/a;", "LKv4;", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "", "N", "z2", "", "t4", "", "V2", "Lco/bird/android/model/wire/ReleaseValidationResult;", "H1", "Ljava/io/File;", "e3", "n2", "release_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Jv4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC33912Jv4 extends InterfaceC16428a<C34146Kv4> {
    /* renamed from: H1 */
    Observable<ReleaseValidationResult> mo57661H1();

    /* renamed from: N */
    Observable<Optional<String>> mo57657N();

    /* renamed from: V2 */
    Observable<Unit> mo57656V2();

    /* renamed from: e3 */
    Observable<File> mo57652e3();

    /* renamed from: n2 */
    Observable<Unit> mo57644n2();

    /* renamed from: t4 */
    Observable<Optional<Boolean>> mo57639t4();

    /* renamed from: z2 */
    Observable<Optional<String>> mo57636z2();
}
