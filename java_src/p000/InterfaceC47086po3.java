package p000;

import co.bird.android.model.DialogResponse;
import co.bird.android.model.NestFlightSheetButton;
import co.bird.android.model.persistence.NestFlightSheetDetails;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\nH&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\nH&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H&J \u0010\u001a\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH&J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u001e\u001a\u00020\u0012H&J\u0010\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0012H&J\b\u0010\"\u001a\u00020\bH&J\u0010\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u001bH&J\u001c\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0&0\u00142\u0006\u0010%\u001a\u00020\u001bH&¨\u0006("}, m28432d2 = {"Lpo3;", "LJj3;", "LRk3;", "Lzu3;", "LaM5;", "LS74;", "Lco/bird/android/model/persistence/NestFlightSheetDetails;", "nestFlightSheetDetails", "", "ua", "Lio/reactivex/Observable;", "Lco/bird/android/model/NestFlightSheetButton;", "h8", "", "enabled", "ce", "w5", "xl", "", "spaces", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "Pg", "totalDurationMinutes", "Lorg/joda/time/DateTime;", "expiresAt", "vd", "", "message", "u4", "cooldownMinutes", "lh", "count", "R0", "Ha", "newClaimErrorMessage", "nb", "nestId", "", "Qj", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: po3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC47086po3 extends InterfaceC33803Jj3, InterfaceC35684Rk3, InterfaceC53074zu3, InterfaceC37910aM5, S74 {
    /* renamed from: Ha */
    void mo18683Ha();

    /* renamed from: Pg */
    AbstractC23442F<DialogResponse> mo18682Pg(int i);

    /* renamed from: Qj */
    AbstractC23442F<List<String>> mo18681Qj(String str);

    /* renamed from: R0 */
    void mo18680R0(int i);

    /* renamed from: ce */
    void mo18679ce(boolean z);

    /* renamed from: h8 */
    Observable<NestFlightSheetButton> mo18678h8();

    /* renamed from: lh */
    AbstractC23442F<DialogResponse> mo18677lh(int i);

    /* renamed from: nb */
    void mo18676nb(String str);

    /* renamed from: u4 */
    void mo18675u4(String str);

    /* renamed from: ua */
    void mo18674ua(NestFlightSheetDetails nestFlightSheetDetails);

    /* renamed from: vd */
    void mo18673vd(int i, int i2, DateTime dateTime);

    /* renamed from: w5 */
    Observable<Unit> mo18672w5();

    /* renamed from: xl */
    Observable<Unit> mo18671xl();
}
