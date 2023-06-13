package p000;

import co.bird.android.model.DialogResponse;
import co.bird.android.model.HardCountStatus;
import co.bird.android.model.constant.InventoryScanningIdentifierCategory;
import co.bird.android.model.persistence.HardCountScan;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J\u0016\u0010\u0011\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006H&J\b\u0010\u0014\u001a\u00020\u0007H&J\b\u0010\u0015\u001a\u00020\u0007H&J\b\u0010\u0016\u001a\u00020\u0007H&J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0014\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0006H&J \u0010\u001f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001a\u0012\u0004\u0012\u00020\u001e0\u001d0\u0006H&J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H&J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\nH&J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&H&J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\nH&J\b\u0010+\u001a\u00020\u0007H&J\b\u0010,\u001a\u00020\u0007H&¨\u0006-"}, m28432d2 = {"LoH1;", "LS74;", "LLo6;", "LaM5;", "LH31;", "Lh56;", "Lio/reactivex/Observable;", "", "n", "B2", "", "scanned", "completed", "a4", "", "LH6;", "sections", "b", "", "T", "onResume", "onPause", "Il", "", "show", "Lk", "", "Lco/bird/android/model/persistence/HardCountScan;", "l8", "Lkotlin/Pair;", "Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;", "D6", "Ek", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "f9", "expectedScans", "R1", "Lco/bird/android/model/HardCountStatus;", "status", "Za", "count", "S2", "v5", "Zj", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oH1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC46180oH1 extends S74, InterfaceC34319Lo6, InterfaceC37910aM5, H31, InterfaceC41921h56 {
    /* renamed from: B2 */
    Observable<Unit> mo19591B2();

    /* renamed from: D6 */
    Observable<Pair<Collection<String>, InventoryScanningIdentifierCategory>> mo19590D6();

    /* renamed from: Ek */
    Observable<Unit> mo19589Ek();

    /* renamed from: Il */
    void mo19588Il();

    /* renamed from: Lk */
    void mo19587Lk(boolean z);

    /* renamed from: R1 */
    void mo19586R1(int i);

    /* renamed from: S2 */
    void mo19585S2(int i);

    /* renamed from: T */
    Observable<String> mo19584T();

    /* renamed from: Za */
    void mo19583Za(HardCountStatus hardCountStatus);

    /* renamed from: Zj */
    void mo19582Zj();

    /* renamed from: a4 */
    void mo19581a4(int i, int i2);

    /* renamed from: b */
    void mo19580b(List<C3023H6> list);

    /* renamed from: f9 */
    AbstractC23442F<DialogResponse> mo19579f9();

    /* renamed from: l8 */
    Observable<Collection<HardCountScan>> mo19578l8();

    /* renamed from: n */
    Observable<Unit> mo19577n();

    void onPause();

    void onResume();

    /* renamed from: v5 */
    void mo19576v5();
}
