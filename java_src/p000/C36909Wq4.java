package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LocationSelectionModel;
import co.bird.android.model.Report;
import co.bird.android.model.SelectedLoggedRepair;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00040\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00070\u00070\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\n0\n0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00140\u00140\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00170\u00170\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000f¨\u0006\u001c"}, m28432d2 = {"LWq4;", "LVq4;", "", "c", "Lco/bird/android/model/wire/WireBird;", "bird", C17296a.f69688o, "Lco/bird/android/model/LocationSelectionModel;", RequestHeadersFactory.MODEL, "b", "", "url", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/d;", "replaceQrSubject", "damageStatusSubject", "locationSelectSubject", "imageUploadedUrlSubject", "Lco/bird/android/model/Report;", "e", "reportSubject", "Lco/bird/android/model/SelectedLoggedRepair;", "f", "repairsSubject", "<init>", "()V", "eventbus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Wq4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36909Wq4 implements InterfaceC36675Vq4 {

    /* renamed from: a */
    public final C24558d<Unit> f42171a;

    /* renamed from: b */
    public final C24558d<WireBird> f42172b;

    /* renamed from: c */
    public final C24558d<LocationSelectionModel> f42173c;

    /* renamed from: d */
    public final C24558d<String> f42174d;

    /* renamed from: e */
    public final C24558d<Report> f42175e;

    /* renamed from: f */
    public final C24558d<SelectedLoggedRepair> f42176f;

    public C36909Wq4() {
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f42171a = m31902e;
        C24558d<WireBird> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<WireBird>()");
        this.f42172b = m31902e2;
        C24558d<LocationSelectionModel> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<LocationSelectionModel>()");
        this.f42173c = m31902e3;
        C24558d<String> m31902e4 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e4, "create<String>()");
        this.f42174d = m31902e4;
        C24558d<Report> m31902e5 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e5, "create<Report>()");
        this.f42175e = m31902e5;
        C24558d<SelectedLoggedRepair> m31902e6 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e6, "create<SelectedLoggedRepair>()");
        this.f42176f = m31902e6;
    }

    @Override // p000.InterfaceC36675Vq4
    /* renamed from: a */
    public void mo77816a(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f42172b.onNext(bird);
    }

    @Override // p000.InterfaceC36675Vq4
    /* renamed from: b */
    public void mo77815b(LocationSelectionModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f42173c.onNext(model);
    }

    @Override // p000.InterfaceC36675Vq4
    /* renamed from: c */
    public void mo77814c() {
        this.f42171a.onNext(Unit.INSTANCE);
    }

    @Override // p000.InterfaceC36675Vq4
    /* renamed from: d */
    public void mo77813d(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f42174d.onNext(url);
    }
}
