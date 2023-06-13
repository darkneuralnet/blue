package p000;

import co.bird.android.model.persistence.BrainSwapRecord;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0016R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"Lo10;", "Ln10;", "Lco/bird/android/model/persistence/BrainSwapRecord;", "record", "Lio/reactivex/c;", "l0", "Lio/reactivex/Observable;", "", "V", "", "birdId", "E0", "h0", "imei", "", "status", "U", "(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/c;", "B0", "Lq10;", C17296a.f69688o, "Lq10;", "brainSwapRepo", "<init>", "(Lq10;)V", "co.bird.android.manager.brain-swap"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: o10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46026o10 implements InterfaceC45433n10 {

    /* renamed from: a */
    public final InterfaceC47212q10 f101220a;

    public C46026o10(InterfaceC47212q10 brainSwapRepo) {
        Intrinsics.checkNotNullParameter(brainSwapRepo, "brainSwapRepo");
        this.f101220a = brainSwapRepo;
    }

    @Override // p000.InterfaceC45433n10
    /* renamed from: B0 */
    public AbstractC23461c mo21985B0(String imei) {
        Intrinsics.checkNotNullParameter(imei, "imei");
        AbstractC23461c m33063X = this.f101220a.mo13248B0(imei).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "brainSwapRepo.queryBrain…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC45433n10
    /* renamed from: E0 */
    public Observable<BrainSwapRecord> mo21984E0(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Observable<BrainSwapRecord> subscribeOn = this.f101220a.mo13247E0(birdId).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "brainSwapRepo.streamBrai…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC45433n10
    /* renamed from: U */
    public AbstractC23461c mo21983U(String imei, Boolean bool) {
        Intrinsics.checkNotNullParameter(imei, "imei");
        AbstractC23461c m33063X = this.f101220a.mo13244U(imei, bool).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "brainSwapRepo.updateBrai…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC45433n10
    /* renamed from: V */
    public Observable<List<BrainSwapRecord>> mo21982V() {
        Observable<List<BrainSwapRecord>> subscribeOn = this.f101220a.mo13243V().subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "brainSwapRepo.streamBrai…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC45433n10
    /* renamed from: h0 */
    public AbstractC23461c mo21981h0(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23461c m33063X = this.f101220a.mo13242h0(birdId).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "brainSwapRepo.deleteBrai…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC45433n10
    /* renamed from: l0 */
    public AbstractC23461c mo21980l0(BrainSwapRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        AbstractC23461c m33063X = this.f101220a.mo13241l0(record).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "brainSwapRepo.insertBrai…scribeOn(Schedulers.io())");
        return m33063X;
    }
}
