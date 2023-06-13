package p000;

import co.bird.android.model.constant.PartKind;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import me.dm7.barcodescanner.zxing.ZXingScannerView;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006J\b\u0010\b\u001a\u00020\u0007H&J\u001a\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\tH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\tH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\tH&J\b\u0010\u0010\u001a\u00020\u0007H&J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\u0007H&J\u0012\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&J\b\u0010\u0018\u001a\u00020\u0007H&J\b\u0010\u0019\u001a\u00020\u0007H&J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0011H&J\b\u0010\u001c\u001a\u00020\u0007H&J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0011H&¨\u0006\u001f"}, m28432d2 = {"LQj5;", "LS74;", "LaM5;", "LH31;", "LLo6;", "Lme/dm7/barcodescanner/zxing/ZXingScannerView$ResultHandler;", "Ldl2;", "", "init", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Ls32;", "T", "M9", "v0", "p3", "", "enabled", "O3", "B6", "Lco/bird/android/model/constant/PartKind;", "partKind", "d1", "onResume", "onPause", "enable", "tf", "ud", "visible", "R3", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qj5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC35443Qj5 extends S74, InterfaceC37910aM5, H31, InterfaceC34319Lo6, ZXingScannerView.ResultHandler, InterfaceC39940dl2 {
    /* renamed from: B6 */
    void mo84845B6();

    /* renamed from: M9 */
    Observable<Unit> mo84843M9();

    /* renamed from: O3 */
    void mo84842O3(boolean z);

    /* renamed from: R3 */
    void mo84839R3(boolean z);

    /* renamed from: T */
    Observable<Pair<String, EnumC48419s32>> mo84837T();

    /* renamed from: d1 */
    void mo84836d1(PartKind partKind);

    void init();

    void onPause();

    void onResume();

    /* renamed from: p3 */
    void mo84835p3();

    /* renamed from: tf */
    void mo84834tf(boolean z);

    /* renamed from: ud */
    void mo84833ud();

    /* renamed from: v0 */
    Observable<Unit> mo84832v0();
}
