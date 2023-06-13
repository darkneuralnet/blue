package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.PlanItemModel;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J\u0016\u0010\f\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH&J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH&J\u001a\u0010\u0015\u001a\u00020\b2\b\b\u0001\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH&J\u001a\u0010\u0018\u001a\u00020\b2\b\b\u0001\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H&J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0016H&J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0006H&J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0006H&J\u0012\u0010\u001e\u001a\u00020\b2\b\b\u0001\u0010\u0013\u001a\u00020\u0012H&J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0016H&J\u0010\u0010 \u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0016H&J\u0012\u0010!\u001a\u00020\b2\b\b\u0001\u0010\u0013\u001a\u00020\u0012H&J\u0010\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u000fH&J\u0010\u0010$\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0016H&J\u0010\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0016H&J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J\u0010\u0010)\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0016H&J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J\u0012\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010,\u001a\u00020\u000fH&J\u0010\u0010/\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0016H&J\u0018\u00102\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u000fH&¨\u00063"}, m28432d2 = {"Lqs;", "LS74;", "LaM5;", "Lio/reactivex/Observable;", "Lco/bird/android/model/PlanItemModel;", "j2", "Lz24;", "b0", "", DateTokenConverter.CONVERTER_KEY, "", "plans", "xe", "plan", "Yd", "", "balance", "Ia", "", "resId", "reloadValue", "S3", "", "addTermsAndConditionsLink", "Gh", "show", "Ej", TransferTable.COLUMN_STATE, "jb", "Rg", "n6", "F9", "Yc", "E", "title", "vi", "y", "enabled", "p0", "J", "mk", AbstractC3831J1.f16564d, "Q", "A", "token", "LG10;", "R", "S", "bonusAmount", "currency", "Y4", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qs */
/* loaded from: classes2.dex */
public interface InterfaceC27711qs extends S74, InterfaceC37910aM5 {
    /* renamed from: A */
    Observable<Unit> mo11587A();

    /* renamed from: E */
    void mo11586E(int i);

    /* renamed from: Ej */
    void mo11585Ej(boolean z);

    /* renamed from: F9 */
    void mo11584F9(boolean z);

    /* renamed from: Gh */
    void mo11583Gh(int i, boolean z);

    /* renamed from: Ia */
    void mo11582Ia(String str);

    /* renamed from: J */
    Observable<Unit> mo11581J();

    /* renamed from: J1 */
    void mo11580J1(boolean z);

    /* renamed from: Q */
    Observable<Unit> mo11578Q();

    /* renamed from: R */
    G10 mo11576R(String str);

    /* renamed from: Rg */
    void mo11575Rg(EnumC52561z24 enumC52561z24);

    /* renamed from: S */
    void mo11573S(boolean z);

    /* renamed from: S3 */
    void mo11572S3(int i, String str);

    /* renamed from: Y4 */
    void mo11568Y4(int i, String str);

    /* renamed from: Yc */
    void mo11567Yc(boolean z);

    /* renamed from: Yd */
    void mo11566Yd(PlanItemModel planItemModel);

    /* renamed from: b0 */
    Observable<EnumC52561z24> mo11565b0();

    /* renamed from: d */
    Observable<Unit> mo11564d();

    /* renamed from: j2 */
    Observable<PlanItemModel> mo11563j2();

    /* renamed from: jb */
    void mo11562jb(EnumC52561z24 enumC52561z24);

    /* renamed from: mk */
    Observable<Unit> mo11561mk();

    /* renamed from: n6 */
    void mo11560n6(int i);

    /* renamed from: p0 */
    void mo11559p0(boolean z);

    /* renamed from: vi */
    void mo11558vi(String str);

    /* renamed from: xe */
    void mo11557xe(List<PlanItemModel> list);

    /* renamed from: y */
    void mo11556y(boolean z);
}
