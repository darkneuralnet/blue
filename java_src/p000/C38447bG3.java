package p000;

import android.view.View;
import android.widget.Button;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.ParkingNest;
import co.bird.android.widget.ParkingNestView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LbG3;", "LaG3;", "Lco/bird/android/model/ParkingNest;", "nest", "", "distance", "", C17296a.f69688o, "Lio/reactivex/Observable;", "b", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/widget/ParkingNestView;", "Lco/bird/android/widget/ParkingNestView;", "parkingNestView", "Landroid/widget/Button;", "Lkotlin/Lazy;", "c", "()Landroid/widget/Button;", "nearestParkingButton", "<init>", "(Lco/bird/android/widget/ParkingNestView;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bG3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38447bG3 implements InterfaceC37854aG3 {

    /* renamed from: a */
    public final ParkingNestView f57206a;

    /* renamed from: b */
    public final Lazy f57207b;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroid/widget/Button;", "b", "()Landroid/widget/Button;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bG3$a */
    /* loaded from: classes2.dex */
    public static final class C12344a extends Lambda implements Function0<Button> {
        public C12344a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Button invoke() {
            return (Button) C49520tu6.m11243h(C38447bG3.this.f57206a, C52955zi4.showNearestParkingButton);
        }
    }

    public C38447bG3(ParkingNestView parkingNestView) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(parkingNestView, "parkingNestView");
        this.f57206a = parkingNestView;
        lazy = LazyKt__LazyJVMKt.lazy(new C12344a());
        this.f57207b = lazy;
    }

    @Override // p000.InterfaceC37854aG3
    /* renamed from: a */
    public void mo64749a(ParkingNest nest, float f) {
        Intrinsics.checkNotNullParameter(nest, "nest");
        this.f57206a.setParkingNest(nest, f);
    }

    @Override // p000.InterfaceC37854aG3
    /* renamed from: b */
    public Observable<Unit> mo64748b() {
        View findViewById = this.f57206a.findViewById(C36585Vg4.image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "parkingNestView.findViewById<View>(R.id.image)");
        return C44626lf5.clicksThrottle$default(findViewById, 0L, 1, null);
    }

    @Override // p000.InterfaceC37854aG3
    /* renamed from: c */
    public Button mo64747c() {
        return (Button) this.f57207b.getValue();
    }

    @Override // p000.InterfaceC37854aG3
    /* renamed from: d */
    public Observable<Unit> mo64746d() {
        View findViewById = this.f57206a.findViewById(C52955zi4.getDirectionsButton);
        Intrinsics.checkNotNullExpressionValue(findViewById, "parkingNestView.findView…W.id.getDirectionsButton)");
        return C44626lf5.clicksThrottle$default(findViewById, 0L, 1, null);
    }
}
