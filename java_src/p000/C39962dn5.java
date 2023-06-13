package p000;

import co.bird.android.model.VehicleScrapRequest;
import co.bird.android.model.constant.ScrapRequestReason;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"Ldn5;", "Lcn5;", "Lco/bird/android/model/wire/WireBird;", "bird", "", C17296a.f69688o, "Lco/bird/android/model/VehicleScrapRequest;", "request", "b", "LEa;", "LEa;", "analyticsManager", "", "Ljava/lang/String;", "sessionId", "c", "Lco/bird/android/model/wire/WireBird;", "<init>", "(LEa;)V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapAnalyticsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapAnalyticsManager.kt\nco/bird/android/feature/scrap/analytics/ScrapAnalyticsManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
/* renamed from: dn5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39962dn5 implements InterfaceC39352cn5 {

    /* renamed from: a */
    public final InterfaceC1880Ea f77221a;

    /* renamed from: b */
    public String f77222b;

    /* renamed from: c */
    public WireBird f77223c;

    public C39962dn5(InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f77221a = analyticsManager;
    }

    @Override // p000.InterfaceC39352cn5
    /* renamed from: a */
    public void mo43712a(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f77222b = uuid;
        this.f77223c = bird;
        this.f77221a.mo55905y(new C34777Nn5(null, bird.getId(), uuid, null, null, bird.getModel(), 25, null));
    }

    @Override // p000.InterfaceC39352cn5
    /* renamed from: b */
    public void mo43711b(VehicleScrapRequest request) {
        boolean z;
        String str;
        Intrinsics.checkNotNullParameter(request, "request");
        String str2 = this.f77222b;
        WireBird wireBird = this.f77223c;
        if (str2 != null && wireBird != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            InterfaceC1880Ea interfaceC1880Ea = this.f77221a;
            String id = wireBird.getId();
            String model = wireBird.getModel();
            String id2 = request.getId();
            ScrapRequestReason requestReason = request.getRequestReason();
            if (requestReason != null) {
                str = requestReason.toString();
            } else {
                str = null;
            }
            interfaceC1880Ea.mo55905y(new C32203Cn5(null, id, str2, null, null, model, id2, str, 25, null));
            this.f77222b = null;
            this.f77223c = null;
            return;
        }
        throw new IllegalArgumentException("Cannot complete Scrap Inspection without starting one first.".toString());
    }
}
