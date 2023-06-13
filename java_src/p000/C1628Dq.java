package p000;

import android.widget.Button;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LDq;", "LCq;", "", "body", "", "i", "b", "raw", DateTokenConverter.CONVERTER_KEY, "g", "Lio/reactivex/Observable;", C17296a.f69688o, "h", "f", "e", "c", "LS2;", "LS2;", "binding", "<init>", "(LS2;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Dq */
/* loaded from: classes2.dex */
public final class C1628Dq implements InterfaceC1216Cq {

    /* renamed from: a */
    public final C7315S2 f6415a;

    public C1628Dq(C7315S2 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f6415a = binding;
    }

    @Override // p000.InterfaceC1216Cq
    /* renamed from: a */
    public Observable<Unit> mo109869a() {
        Button button = this.f6415a.f33052f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.expireTokenButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC1216Cq
    /* renamed from: b */
    public void mo109868b(String body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f6415a.f33055i.setText(body);
    }

    @Override // p000.InterfaceC1216Cq
    /* renamed from: c */
    public Observable<Unit> mo109867c() {
        Button button = this.f6415a.f33050d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.clearLegacyTokenButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC1216Cq
    /* renamed from: d */
    public void mo109866d(String raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        this.f6415a.f33049c.setText(raw);
    }

    @Override // p000.InterfaceC1216Cq
    /* renamed from: e */
    public void mo109865e(String raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        this.f6415a.f33054h.setText(raw);
    }

    @Override // p000.InterfaceC1216Cq
    /* renamed from: f */
    public void mo109864f(String body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f6415a.f33053g.setText(body);
    }

    @Override // p000.InterfaceC1216Cq
    /* renamed from: g */
    public void mo109863g(String raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        this.f6415a.f33056j.setText(raw);
    }

    @Override // p000.InterfaceC1216Cq
    /* renamed from: h */
    public Observable<Unit> mo109862h() {
        Button button = this.f6415a.f33051e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.clearTokensButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC1216Cq
    /* renamed from: i */
    public void mo109861i(String body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f6415a.f33048b.setText(body);
    }
}
