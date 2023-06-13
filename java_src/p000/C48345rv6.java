package p000;

import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.p010ar.view.ParkingStatusMapBottomSheetView;
import co.bird.android.feature.p010ar.view.ScanSurroundingsBottomSheetView;
import co.bird.android.feature.p010ar.view.SemiCircleMapView;
import co.bird.android.feature.p010ar.view.VpsView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\b\u0007\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b6\u00107J\u0010\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 R\u001b\u0010$\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010 R\u001b\u0010)\u001a\u00020%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0014\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0014\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0014\u001a\u0004\b1\u00102¨\u00068"}, m28432d2 = {"Lrv6;", "LxE;", "LH31;", "Lh56;", "", "messageResId", "", "Yl", "Vl", "Xl", "Ul", "", Entry.TYPE_TEXT, "Wl", "Ls6;", "b", "Ls6;", "binding", "Lco/bird/android/feature/ar/view/VpsView;", "c", "Lkotlin/Lazy;", "Tl", "()Lco/bird/android/feature/ar/view/VpsView;", "vpsView", "Lcom/google/android/material/progressindicator/LinearProgressIndicator;", DateTokenConverter.CONVERTER_KEY, "getProgressView", "()Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "progressView", "Landroid/widget/ImageView;", "e", "Rl", "()Landroid/widget/ImageView;", "qrCodeOverlay", "f", "Pl", "buildingsOverlay", "Lco/bird/android/feature/ar/view/ScanSurroundingsBottomSheetView;", "g", "Sl", "()Lco/bird/android/feature/ar/view/ScanSurroundingsBottomSheetView;", "scanSurroundingsBottomSheet", "Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;", "h", "Ql", "()Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;", "parkingStatusMapBottomSheet", "Lco/bird/android/feature/ar/view/SemiCircleMapView;", "i", "getMapView", "()Lco/bird/android/feature/ar/view/SemiCircleMapView;", "mapView", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Ls6;)V", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rv6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48345rv6 extends AbstractC30071xE {

    /* renamed from: b */
    public final C28178s6 f107896b;

    /* renamed from: c */
    public final Lazy f107897c;

    /* renamed from: d */
    public final Lazy f107898d;

    /* renamed from: e */
    public final Lazy f107899e;

    /* renamed from: f */
    public final Lazy f107900f;

    /* renamed from: g */
    public final Lazy f107901g;

    /* renamed from: h */
    public final Lazy f107902h;

    /* renamed from: i */
    public final Lazy f107903i;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Landroid/widget/ImageView;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rv6$a */
    /* loaded from: classes3.dex */
    public static final class C28058a extends Lambda implements Function0<ImageView> {
        public C28058a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ImageView invoke() {
            ImageView imageView = C48345rv6.this.f107896b.f108249b;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.buildingsOverlay");
            return imageView;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/android/feature/ar/view/SemiCircleMapView;", "b", "()Lco/bird/android/feature/ar/view/SemiCircleMapView;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rv6$b */
    /* loaded from: classes3.dex */
    public static final class C28059b extends Lambda implements Function0<SemiCircleMapView> {
        public C28059b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final SemiCircleMapView invoke() {
            return C48345rv6.this.f107896b.f108253f.m58881i();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;", "b", "()Lco/bird/android/feature/ar/view/ParkingStatusMapBottomSheetView;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rv6$c */
    /* loaded from: classes3.dex */
    public static final class C28060c extends Lambda implements Function0<ParkingStatusMapBottomSheetView> {
        public C28060c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final ParkingStatusMapBottomSheetView invoke() {
            ParkingStatusMapBottomSheetView parkingStatusMapBottomSheetView = C48345rv6.this.f107896b.f108253f;
            Intrinsics.checkNotNullExpressionValue(parkingStatusMapBottomSheetView, "binding.parkingStatusMapBottomSheet");
            return parkingStatusMapBottomSheetView;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rv6$d */
    /* loaded from: classes3.dex */
    public static final class C28061d extends Lambda implements Function0<LinearProgressIndicator> {
        public C28061d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final LinearProgressIndicator invoke() {
            return C48345rv6.this.f107896b.f108254g;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Landroid/widget/ImageView;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rv6$e */
    /* loaded from: classes3.dex */
    public static final class C28062e extends Lambda implements Function0<ImageView> {
        public C28062e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ImageView invoke() {
            ImageView imageView = C48345rv6.this.f107896b.f108255h;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.qrCodeOverlay");
            return imageView;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/android/feature/ar/view/ScanSurroundingsBottomSheetView;", "b", "()Lco/bird/android/feature/ar/view/ScanSurroundingsBottomSheetView;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rv6$f */
    /* loaded from: classes3.dex */
    public static final class C28063f extends Lambda implements Function0<ScanSurroundingsBottomSheetView> {
        public C28063f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final ScanSurroundingsBottomSheetView invoke() {
            ScanSurroundingsBottomSheetView scanSurroundingsBottomSheetView = C48345rv6.this.f107896b.f108256i;
            Intrinsics.checkNotNullExpressionValue(scanSurroundingsBottomSheetView, "binding.scanSurroundingsBottomSheet");
            return scanSurroundingsBottomSheetView;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/android/feature/ar/view/VpsView;", "b", "()Lco/bird/android/feature/ar/view/VpsView;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rv6$g */
    /* loaded from: classes3.dex */
    public static final class C28064g extends Lambda implements Function0<VpsView> {
        public C28064g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final VpsView invoke() {
            VpsView vpsView = C48345rv6.this.f107896b.f108257j;
            Intrinsics.checkNotNullExpressionValue(vpsView, "binding.vpsView");
            return vpsView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48345rv6(BaseActivity activity, C28178s6 binding) {
        super(activity);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Lazy lazy6;
        Lazy lazy7;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f107896b = binding;
        lazy = LazyKt__LazyJVMKt.lazy(new C28064g());
        this.f107897c = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C28061d());
        this.f107898d = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C28062e());
        this.f107899e = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new C28058a());
        this.f107900f = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new C28063f());
        this.f107901g = lazy5;
        lazy6 = LazyKt__LazyJVMKt.lazy(new C28060c());
        this.f107902h = lazy6;
        lazy7 = LazyKt__LazyJVMKt.lazy(new C28059b());
        this.f107903i = lazy7;
    }

    public static /* synthetic */ void showScanSurroundingBottomSheet$default(C48345rv6 c48345rv6, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = C45871nl4.vps_scan_directions;
        }
        c48345rv6.m15073Yl(i);
    }

    /* renamed from: Pl */
    public final ImageView m15082Pl() {
        return (ImageView) this.f107900f.getValue();
    }

    /* renamed from: Ql */
    public final ParkingStatusMapBottomSheetView m15081Ql() {
        return (ParkingStatusMapBottomSheetView) this.f107902h.getValue();
    }

    /* renamed from: Rl */
    public final ImageView m15080Rl() {
        return (ImageView) this.f107899e.getValue();
    }

    /* renamed from: Sl */
    public final ScanSurroundingsBottomSheetView m15079Sl() {
        return (ScanSurroundingsBottomSheetView) this.f107901g.getValue();
    }

    /* renamed from: Tl */
    public final VpsView m15078Tl() {
        return (VpsView) this.f107897c.getValue();
    }

    /* renamed from: Ul */
    public final void m15077Ul() {
        m15081Ql().m58876n().start();
    }

    /* renamed from: Vl */
    public final void m15076Vl() {
        m15079Sl().m58865m().start();
    }

    /* renamed from: Wl */
    public final void m15075Wl(String str) {
        boolean z;
        this.f107896b.f108250c.setText(str);
        TextView textView = this.f107896b.f108250c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.debug");
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(textView, z, 0, 2, null);
    }

    /* renamed from: Xl */
    public final void m15074Xl() {
        m15081Ql().m58879k().start();
    }

    /* renamed from: Yl */
    public final void m15073Yl(int i) {
        m15079Sl().m58869i().setText(i);
        m15079Sl().m58868j().start();
    }
}
