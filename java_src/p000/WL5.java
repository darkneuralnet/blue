package p000;

import co.bird.android.model.DialogResponse;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0012\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\nH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\nH&J\b\u0010\u000e\u001a\u00020\u0005H&J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H&J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H&J\u001c\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&¨\u0006\u0019"}, m28432d2 = {"LWL5;", "LH31;", "LaM5;", "", "resId", "", "Y", "", "show", "X4", "Lio/reactivex/Observable;", "b0", "zk", "wi", "b9", "layoutResId", "Lgx2;", "lockState", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "Dc", "x9", "", "fineString", "kj", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: WL5 */
/* loaded from: classes2.dex */
public interface WL5 extends H31, InterfaceC37910aM5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WL5$a */
    /* loaded from: classes2.dex */
    public static final class C8990a {
        public static /* synthetic */ void configureAssets$default(WL5 wl5, EnumC41838gx2 enumC41838gx2, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: configureAssets");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            wl5.mo77089kj(enumC41838gx2, str);
        }
    }

    /* renamed from: Dc */
    AbstractC23442F<DialogResponse> mo77096Dc(int i, EnumC41838gx2 enumC41838gx2);

    /* renamed from: X4 */
    void mo77093X4(boolean z);

    /* renamed from: Y */
    void mo77092Y(int i);

    /* renamed from: b0 */
    Observable<Unit> mo77091b0();

    /* renamed from: b9 */
    void mo77090b9();

    /* renamed from: kj */
    void mo77089kj(EnumC41838gx2 enumC41838gx2, String str);

    /* renamed from: wi */
    Observable<Unit> mo77088wi();

    /* renamed from: x9 */
    AbstractC23442F<DialogResponse> mo77087x9(int i, EnumC41838gx2 enumC41838gx2);

    /* renamed from: zk */
    Observable<Unit> mo77086zk();
}
