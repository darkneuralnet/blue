package co.bird.android.feature.coreinventory.scan.adapters;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireVehicleInventoryScan;
import co.bird.android.widget.BatteryViewV2;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000b0\u000b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000b0\u000b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "Lio/reactivex/Observable;", "", "c1", "I2", "Lma4;", "kotlin.jvm.PlatformType", "c", "Lma4;", "actionClicksRelay", DateTokenConverter.CONVERTER_KEY, "disabledClicksRelay", "<init>", "()V", "HeaderViewHolder", "VehicleViewHolder", "core-inventory_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class CoreInventoryScanAdapter extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C45168ma4<Unit> f63892c;

    /* renamed from: d */
    public final C45168ma4<Unit> f63893d;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$HeaderViewHolder;", "Lw1;", "", "position", "", "bind", "LEb2;", "b", "LEb2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;Landroid/view/View;)V", "core-inventory_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoreInventoryScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanAdapter.kt\nco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,119:1\n18#2:120\n9#3,4:121\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanAdapter.kt\nco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$HeaderViewHolder\n*L\n71#1:120\n71#1:121,4\n*E\n"})
    /* loaded from: classes3.dex */
    public final class HeaderViewHolder extends C29735w1 {

        /* renamed from: b */
        public final C32560Eb2 f63894b;

        /* renamed from: c */
        public final /* synthetic */ CoreInventoryScanAdapter f63895c;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "Landroid/view/MotionEvent;", "event", "", C17296a.f69688o, "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.coreinventory.scan.adapters.CoreInventoryScanAdapter$HeaderViewHolder$1 */
        /* loaded from: classes3.dex */
        public static final class C147731 extends Lambda implements Function2<View, MotionEvent, Boolean> {

            /* renamed from: h */
            public final /* synthetic */ CoreInventoryScanAdapter f63897h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C147731(CoreInventoryScanAdapter coreInventoryScanAdapter) {
                super(2);
                this.f63897h = coreInventoryScanAdapter;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final Boolean invoke(View view, MotionEvent event) {
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (HeaderViewHolder.this.f63894b.f7767c.isActivated()) {
                    return Boolean.FALSE;
                }
                if (event.getAction() == 0) {
                    this.f63897h.f63893d.accept(Unit.INSTANCE);
                    return Boolean.TRUE;
                }
                return Boolean.TRUE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.feature.coreinventory.scan.adapters.CoreInventoryScanAdapter$HeaderViewHolder$2 */
        /* loaded from: classes3.dex */
        public static final class C147742 extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ CoreInventoryScanAdapter f63898g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C147742(CoreInventoryScanAdapter coreInventoryScanAdapter) {
                super(1);
                this.f63898g = coreInventoryScanAdapter;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f63898g.f63892c.accept(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderViewHolder(CoreInventoryScanAdapter coreInventoryScanAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f63895c = coreInventoryScanAdapter;
            C32560Eb2 m108737a = C32560Eb2.m108737a(view);
            Intrinsics.checkNotNullExpressionValue(m108737a, "bind(view)");
            this.f63894b = m108737a;
            Button button = m108737a.f7767c;
            Intrinsics.checkNotNullExpressionValue(button, "binding.action");
            C34585Ms2.m94649v(button, new C147731(coreInventoryScanAdapter));
            Button button2 = m108737a.f7767c;
            Intrinsics.checkNotNullExpressionValue(button2, "binding.action");
            C34585Ms2.m94661j(button2, new C147742(coreInventoryScanAdapter));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f63895c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C43762kC0)) {
                m105816c = null;
            }
            C43762kC0 c43762kC0 = (C43762kC0) m105816c;
            if (c43762kC0 != null) {
                this.f63894b.f7769e.setText(String.valueOf(c43762kC0.m29196c()));
                this.f63894b.f7768d.setText(c43762kC0.m29194e());
                this.f63894b.f7767c.setText(c43762kC0.m29197b());
                this.f63894b.f7767c.setActivated(c43762kC0.m29195d());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder;", "Lw1;", "", "position", "", "bind", "Luf2;", "b", "Luf2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter;Landroid/view/View;)V", "core-inventory_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoreInventoryScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanAdapter.kt\nco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n18#2:120\n9#3,4:121\n1#4:125\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanAdapter.kt\nco/bird/android/feature/coreinventory/scan/adapters/CoreInventoryScanAdapter$VehicleViewHolder\n*L\n88#1:120\n88#1:121,4\n*E\n"})
    /* loaded from: classes3.dex */
    public final class VehicleViewHolder extends C29735w1 {

        /* renamed from: b */
        public final C49959uf2 f63899b;

        /* renamed from: c */
        public final /* synthetic */ CoreInventoryScanAdapter f63900c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VehicleViewHolder(CoreInventoryScanAdapter coreInventoryScanAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f63900c = coreInventoryScanAdapter;
            C49959uf2 m9897a = C49959uf2.m9897a(view);
            Intrinsics.checkNotNullExpressionValue(m9897a, "bind(view)");
            this.f63899b = m9897a;
            ImageView imageView = m9897a.f112738i;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.scan");
            C49520tu6.show$default(imageView, false, 0, 2, null);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            int i2;
            int i3;
            int i4;
            int i5;
            Object m105816c = this.f63900c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                WireVehicleInventoryScan wireVehicleInventoryScan = (WireVehicleInventoryScan) pair.component1();
                Boolean bool = (Boolean) pair.component2();
                TextView textView = this.f63899b.f112736g;
                String itemDisplayTitle = wireVehicleInventoryScan.getItemDisplayTitle();
                if (itemDisplayTitle == null) {
                    itemDisplayTitle = wireVehicleInventoryScan.getScanIdentifier();
                }
                textView.setText(itemDisplayTitle);
                TextView textView2 = this.f63899b.f112737h;
                String failureMessage = wireVehicleInventoryScan.getFailureMessage();
                if (failureMessage == null) {
                    failureMessage = wireVehicleInventoryScan.getItemDisplayDetail();
                }
                textView2.setText(failureMessage);
                Group group = this.f63899b.f112732c;
                Intrinsics.checkNotNullExpressionValue(group, "binding.batteryGroup");
                boolean z2 = true;
                if (wireVehicleInventoryScan.getBattery() != null) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(group, z, 0, 2, null);
                BatteryViewV2 batteryViewV2 = this.f63899b.f112731b;
                Integer battery = wireVehicleInventoryScan.getBattery();
                if (battery != null) {
                    i2 = battery.intValue();
                } else {
                    i2 = 0;
                }
                batteryViewV2.setBatteryLevel(i2 / 100.0f);
                TextView textView3 = this.f63899b.f112734e;
                Context context = getContext();
                int i6 = C45871nl4.battery_percent;
                Object[] objArr = new Object[1];
                Integer battery2 = wireVehicleInventoryScan.getBattery();
                if (battery2 != null) {
                    i3 = battery2.intValue();
                } else {
                    i3 = 0;
                }
                objArr[0] = Integer.valueOf(i3);
                textView3.setText(context.getString(i6, objArr));
                ImageView imageView = this.f63899b.f112735f;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.check");
                if (bool == null) {
                    z2 = false;
                }
                C49520tu6.show$default(imageView, z2, 0, 2, null);
                C49959uf2 c49959uf2 = this.f63899b;
                ImageView imageView2 = c49959uf2.f112735f;
                Context context2 = c49959uf2.getRoot().getContext();
                Boolean bool2 = Boolean.FALSE;
                if (Intrinsics.areEqual(bool, bool2)) {
                    i4 = C48193rg4.ic_close;
                } else {
                    i4 = C48193rg4.ic_check;
                }
                imageView2.setImageDrawable(NA0.m94299e(context2, i4));
                Context context3 = this.f63899b.getRoot().getContext();
                if (Intrinsics.areEqual(bool, bool2)) {
                    i5 = C32364Df4.errorRed;
                } else {
                    i5 = C32364Df4.primaryText;
                }
                int m94301c = NA0.m94301c(context3, i5);
                this.f63899b.f112736g.setTextColor(m94301c);
                this.f63899b.f112737h.setTextColor(m94301c);
                this.f63899b.f112735f.setImageTintList(ColorStateList.valueOf(m94301c));
            }
        }
    }

    public CoreInventoryScanAdapter() {
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f63892c = m25409g;
        C45168ma4<Unit> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Unit>()");
        this.f63893d = m25409g2;
    }

    /* renamed from: I2 */
    public final Observable<Unit> m58256I2() {
        Observable<Unit> hide = this.f63893d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "disabledClicksRelay.hide()");
        return hide;
    }

    /* renamed from: c1 */
    public final Observable<Unit> m58255c1() {
        Observable<Unit> hide = this.f63892c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "actionClicksRelay.hide()");
        return hide;
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new CoreInventoryScanAdapterDiff();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C37071Xi4.item_core_inventory_scan_header ? new HeaderViewHolder(this, m41761u) : i == C45268mk4.item_scan_vehicle ? new VehicleViewHolder(this, m41761u) : new C29735w1(m41761u);
    }
}
