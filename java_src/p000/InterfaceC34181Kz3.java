package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.wire.WireSkuScanItem;
import co.bird.android.vehiclescanner.common.mrp.InterfaceC16428a;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H&J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0003H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H&J.\u0010\u0013\u001a\u00020\t2$\u0010\u0012\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00110\u00100\u000fH&J\u001a\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u00100\u0003H&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H&¨\u0006\u0018"}, m28432d2 = {"LKz3;", "Lco/bird/android/vehiclescanner/common/mrp/a;", "LLz3;", "Lio/reactivex/Observable;", "", "s0", "", "a0", "o3", "", "I", "Lco/bird/android/buava/Optional;", "LPC5;", "A1", "V", "Lkotlin/Function0;", "Lkotlin/Pair;", "", "saveInstance", "y2", "Lco/bird/android/model/wire/WireSkuScanItem;", "r4", "z1", "W", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Kz3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC34181Kz3 extends InterfaceC16428a<C34415Lz3> {
    /* renamed from: A1 */
    Observable<Optional<PC5>> mo56476A1();

    /* renamed from: I */
    Observable<Unit> mo56429I();

    /* renamed from: V */
    Observable<PC5> mo56475V();

    /* renamed from: W */
    Observable<Unit> mo56474W();

    /* renamed from: a0 */
    Observable<Boolean> mo56472a0();

    /* renamed from: o3 */
    Observable<C34415Lz3> mo56462o3();

    /* renamed from: r4 */
    Observable<Pair<WireSkuScanItem, String>> mo56424r4();

    /* renamed from: s0 */
    Observable<String> mo56460s0();

    /* renamed from: y2 */
    void mo56457y2(Function0<? extends Pair<? extends List<PC5>, ? extends List<String>>> function0);

    /* renamed from: z1 */
    Observable<Unit> mo56456z1();
}
