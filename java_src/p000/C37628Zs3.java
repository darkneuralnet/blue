package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.OperatorRideHistoryItem;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireLocationKt;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"LZs3;", "", "Landroid/content/Intent;", "intent", "", "b", "Ldr4;", C17296a.f69688o, "Ldr4;", "locationManager", "Lom3;", "Lom3;", "operatorManager", "LEa;", "c", "LEa;", "analyticsManager", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lbt3;", "e", "Lbt3;", "ui", "<init>", "(Ldr4;Lom3;LEa;Lcom/uber/autodispose/ScopeProvider;Lbt3;)V", "ridedetail_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorRideDetailPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorRideDetailPresenter.kt\nco/bird/android/feature/operator/ridedetail/OperatorRideDetailPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,39:1\n180#2:40\n*S KotlinDebug\n*F\n+ 1 OperatorRideDetailPresenter.kt\nco/bird/android/feature/operator/ridedetail/OperatorRideDetailPresenter\n*L\n30#1:40\n*E\n"})
/* renamed from: Zs3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37628Zs3 {

    /* renamed from: a */
    public final InterfaceC40001dr4 f49427a;

    /* renamed from: b */
    public final InterfaceC46473om3 f49428b;

    /* renamed from: c */
    public final InterfaceC1880Ea f49429c;

    /* renamed from: d */
    public final ScopeProvider f49430d;

    /* renamed from: e */
    public final C38817bt3 f49431e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/OperatorRideHistoryItem;", "kotlin.jvm.PlatformType", "item", "", C17296a.f69688o, "(Lco/bird/android/model/OperatorRideHistoryItem;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zs3$a */
    /* loaded from: classes3.dex */
    public static final class C10423a extends Lambda implements Function1<OperatorRideHistoryItem, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Intent f49432g;

        /* renamed from: h */
        public final /* synthetic */ C37628Zs3 f49433h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10423a(Intent intent, C37628Zs3 c37628Zs3) {
            super(1);
            this.f49432g = intent;
            this.f49433h = c37628Zs3;
        }

        /* renamed from: a */
        public final void m72366a(OperatorRideHistoryItem item) {
            WireLocation wireLocation = (WireLocation) this.f49432g.getParcelableExtra("location");
            if (wireLocation == null) {
                wireLocation = WireLocationKt.toLocation$default(this.f49433h.f49427a.mo43616p().m73665a(), null, 1, null);
            }
            C38817bt3 c38817bt3 = this.f49433h.f49431e;
            Intrinsics.checkNotNullExpressionValue(item, "item");
            c38817bt3.m62202e(item, wireLocation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OperatorRideHistoryItem operatorRideHistoryItem) {
            m72366a(operatorRideHistoryItem);
            return Unit.INSTANCE;
        }
    }

    public C37628Zs3(InterfaceC40001dr4 locationManager, InterfaceC46473om3 operatorManager, InterfaceC1880Ea analyticsManager, ScopeProvider scopeProvider, C38817bt3 ui) {
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f49427a = locationManager;
        this.f49428b = operatorManager;
        this.f49429c = analyticsManager;
        this.f49430d = scopeProvider;
        this.f49431e = ui;
    }

    /* renamed from: c */
    public static final void m72367c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b */
    public final void m72368b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f49431e.m62203d();
        String stringExtra = intent.getStringExtra("ride_id");
        if (stringExtra != null) {
            Observable<OperatorRideHistoryItem> observeOn = this.f49428b.mo8128V(stringExtra).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn, "operatorManager.streamRi…dSchedulers.mainThread())");
            Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f49430d));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C10423a c10423a = new C10423a(intent, this);
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Ys3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C37628Zs3.m72367c(Function1.this, obj);
                }
            });
        }
    }
}
