package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.C11905h;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.NearbyBirdViewModel;
import co.bird.android.model.Vehicle;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireServiceCenterStatus;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b;\u0010<J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0014\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012R\"\u0010\u001e\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\"\u0010&\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\"\u0010*\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR*\u0010/\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00178\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010\u001b\"\u0004\b.\u0010\u001dR\"\u00104\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\u000f0\u000f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\"\u00106\u001a\u0010\u0012\f\u0012\n 1*\u0004\u0018\u00010\u000f0\u000f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006>"}, m28432d2 = {"Lw13;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lw1;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "getItemViewType", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBird;", "w", "o", "", "LH6;", "sections", "x", "p", "", "b", "Z", "t", "()Z", "B", "(Z)V", "showExtraInformation", "c", "v", "D", "showServiceCenterInfo", DateTokenConverter.CONVERTER_KEY, "u", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "showOptionsButton", "e", "q", "y", "showAddButton", "value", "f", "r", "A", "showBirdModel", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "g", "Lio/reactivex/subjects/d;", "optionsClicksSubject", "h", "addClicksSubject", "LE6;", "i", "LE6;", "adapterData", "<init>", "()V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: w13  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50771w13 extends RecyclerView.AbstractC11843h<C29735w1> {

    /* renamed from: b */
    public boolean f115157b;

    /* renamed from: c */
    public boolean f115158c;

    /* renamed from: d */
    public boolean f115159d = true;

    /* renamed from: e */
    public boolean f115160e;

    /* renamed from: f */
    public boolean f115161f;

    /* renamed from: g */
    public final C24558d<WireBird> f115162g;

    /* renamed from: h */
    public final C24558d<WireBird> f115163h;

    /* renamed from: i */
    public final C1737E6 f115164i;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"Lw13$a;", "Lw1;", "", "position", "", "bind", "Landroid/view/View;", "b", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "<init>", "(Lw13;Landroid/view/View;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNearbyBirdsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NearbyBirdsAdapter.kt\nco/bird/android/app/feature/nearbybirds/adapters/NearbyBirdsAdapter$NearbyBirdViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,159:1\n18#2:160\n9#3,4:161\n*S KotlinDebug\n*F\n+ 1 NearbyBirdsAdapter.kt\nco/bird/android/app/feature/nearbybirds/adapters/NearbyBirdsAdapter$NearbyBirdViewHolder\n*L\n124#1:160\n124#1:161,4\n*E\n"})
    /* renamed from: w13$a */
    /* loaded from: classes2.dex */
    public final class C29739a extends C29735w1 {

        /* renamed from: b */
        public final View f115165b;

        /* renamed from: c */
        public final /* synthetic */ C50771w13 f115166c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nNearbyBirdsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NearbyBirdsAdapter.kt\nco/bird/android/app/feature/nearbybirds/adapters/NearbyBirdsAdapter$NearbyBirdViewHolder$1$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n18#2:160\n9#3,4:161\n1#4:165\n*S KotlinDebug\n*F\n+ 1 NearbyBirdsAdapter.kt\nco/bird/android/app/feature/nearbybirds/adapters/NearbyBirdsAdapter$NearbyBirdViewHolder$1$1\n*L\n101#1:160\n101#1:161,4\n*E\n"})
        /* renamed from: w13$a$a */
        /* loaded from: classes2.dex */
        public static final class C29740a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C50771w13 f115168h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29740a(C50771w13 c50771w13) {
                super(1);
                this.f115168h = c50771w13;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Vehicle vehicle;
                int adapterPosition = C29739a.this.getAdapterPosition();
                if (adapterPosition != -1) {
                    Object m105816c = this.f115168h.f115164i.m109394h().get(adapterPosition).m105816c();
                    WireBird wireBird = null;
                    if (!(m105816c instanceof NearbyBirdViewModel)) {
                        m105816c = null;
                    }
                    NearbyBirdViewModel nearbyBirdViewModel = (NearbyBirdViewModel) m105816c;
                    if (nearbyBirdViewModel != null && (vehicle = nearbyBirdViewModel.getVehicle()) != null) {
                        wireBird = vehicle.getBird();
                    }
                    if (wireBird != null) {
                        this.f115168h.f115162g.onNext(wireBird);
                    }
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nNearbyBirdsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NearbyBirdsAdapter.kt\nco/bird/android/app/feature/nearbybirds/adapters/NearbyBirdsAdapter$NearbyBirdViewHolder$1$2\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n18#2:160\n9#3,4:161\n1#4:165\n*S KotlinDebug\n*F\n+ 1 NearbyBirdsAdapter.kt\nco/bird/android/app/feature/nearbybirds/adapters/NearbyBirdsAdapter$NearbyBirdViewHolder$1$2\n*L\n109#1:160\n109#1:161,4\n*E\n"})
        /* renamed from: w13$a$b */
        /* loaded from: classes2.dex */
        public static final class C29741b extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C50771w13 f115170h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29741b(C50771w13 c50771w13) {
                super(1);
                this.f115170h = c50771w13;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Vehicle vehicle;
                int adapterPosition = C29739a.this.getAdapterPosition();
                if (adapterPosition != -1) {
                    Object m105816c = this.f115170h.f115164i.m109394h().get(adapterPosition).m105816c();
                    WireBird wireBird = null;
                    if (!(m105816c instanceof NearbyBirdViewModel)) {
                        m105816c = null;
                    }
                    NearbyBirdViewModel nearbyBirdViewModel = (NearbyBirdViewModel) m105816c;
                    if (nearbyBirdViewModel != null && (vehicle = nearbyBirdViewModel.getVehicle()) != null) {
                        wireBird = vehicle.getBird();
                    }
                    if (wireBird != null) {
                        this.f115170h.f115163h.onNext(wireBird);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29739a(C50771w13 c50771w13, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f115166c = c50771w13;
            this.f115165b = view;
            ImageButton imageButton = (ImageButton) C49520tu6.m11243h(view, C36585Vg4.optionsButton);
            ImageButton imageButton2 = (ImageButton) C49520tu6.m11243h(view, C36585Vg4.addButton);
            C49520tu6.show$default(imageButton, c50771w13.m7557u(), 0, 2, null);
            C34585Ms2.m94661j(imageButton, new C29740a(c50771w13));
            C49520tu6.show$default(imageButton2, c50771w13.m7560q(), 0, 2, null);
            C34585Ms2.m94661j(imageButton2, new C29741b(c50771w13));
            C49520tu6.show$default(C49520tu6.m11243h(view, C36585Vg4.serialNumber), c50771w13.m7558t(), 0, 2, null);
            C49520tu6.show$default(C49520tu6.m11243h(view, C36585Vg4.serialNumberLabel), c50771w13.m7558t(), 0, 2, null);
            C49520tu6.show$default(C49520tu6.m11243h(view, C36585Vg4.signalStrengthNumber), c50771w13.m7558t(), 0, 2, null);
            C49520tu6.show$default(C49520tu6.m11243h(view, C36585Vg4.serviceCenterLabel), c50771w13.m7556v(), 0, 2, null);
            C49520tu6.show$default(C49520tu6.m11243h(view, C36585Vg4.serviceCenterStatus), c50771w13.m7556v(), 0, 2, null);
            C49520tu6.show$default(C49520tu6.m11243h(view, C36585Vg4.birdModelLabel), c50771w13.m7559r(), 0, 2, null);
            C49520tu6.show$default(C49520tu6.m11243h(view, C36585Vg4.birdModel), c50771w13.m7559r(), 0, 2, null);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            String str;
            boolean z;
            boolean z2;
            boolean z3;
            int i2;
            TextView textView;
            String str2;
            Object m105816c = this.f115166c.f115164i.m109394h().get(i).m105816c();
            if (!(m105816c instanceof NearbyBirdViewModel)) {
                m105816c = null;
            }
            NearbyBirdViewModel nearbyBirdViewModel = (NearbyBirdViewModel) m105816c;
            if (nearbyBirdViewModel == null) {
                return;
            }
            TextView textView2 = (TextView) C49520tu6.m11243h(this.f115165b, C36585Vg4.codeLabel);
            TextView textView3 = (TextView) C49520tu6.m11243h(this.f115165b, C36585Vg4.code);
            TextView textView4 = (TextView) C49520tu6.m11243h(this.f115165b, C36585Vg4.birdModel);
            TextView textView5 = (TextView) C49520tu6.m11243h(this.f115165b, C36585Vg4.serialNumberLabel);
            TextView textView6 = (TextView) C49520tu6.m11243h(this.f115165b, C36585Vg4.serialNumber);
            TextView textView7 = (TextView) C49520tu6.m11243h(this.f115165b, C36585Vg4.batteryLabel);
            TextView textView8 = (TextView) C49520tu6.m11243h(this.f115165b, C36585Vg4.battery);
            TextView textView9 = (TextView) C49520tu6.m11243h(this.f115165b, C36585Vg4.beaconHashLabel);
            TextView textView10 = (TextView) C49520tu6.m11243h(this.f115165b, C36585Vg4.beaconHash);
            TextView textView11 = (TextView) C49520tu6.m11243h(this.f115165b, C36585Vg4.signalStrengthNumber);
            ImageView imageView = (ImageView) C49520tu6.m11243h(this.f115165b, C36585Vg4.signalStrength);
            TextView textView12 = (TextView) C49520tu6.m11243h(this.f115165b, C36585Vg4.serviceCenterStatus);
            if (nearbyBirdViewModel.isIBeacon() && nearbyBirdViewModel.getShouldShowIBeaconLabel()) {
                str = "[iBeacon] ";
            } else {
                str = "";
            }
            textView2.setText(nearbyBirdViewModel.getCodeLabelText());
            textView3.setText(nearbyBirdViewModel.getVehicle().getBird().getCode());
            textView4.setText(str + nearbyBirdViewModel.getVehicle().getBird().getModel());
            C49520tu6.m11232s(textView5, !nearbyBirdViewModel.isIBeacon(), 8);
            C49520tu6.m11232s(textView6, !nearbyBirdViewModel.isIBeacon(), 8);
            textView6.setText(nearbyBirdViewModel.getVehicle().getBird().getSerialNumber());
            boolean z4 = false;
            if (nearbyBirdViewModel.isIBeacon() && nearbyBirdViewModel.getShouldShowIBeaconLabel()) {
                z = true;
            } else {
                z = false;
            }
            C49520tu6.m11232s(textView9, z, 8);
            if (nearbyBirdViewModel.isIBeacon() && nearbyBirdViewModel.getShouldShowIBeaconLabel()) {
                z2 = true;
            } else {
                z2 = false;
            }
            C49520tu6.m11232s(textView10, z2, 8);
            textView10.setText(nearbyBirdViewModel.getVehicle().getBeaconHash());
            int batteryLevel = nearbyBirdViewModel.getVehicle().getBird().getBatteryLevel();
            if (batteryLevel >= 0 && batteryLevel < 101) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && !nearbyBirdViewModel.isIBeacon()) {
                z4 = true;
            }
            C49520tu6.m11232s(textView7, z4, 8);
            C49520tu6.m11232s(textView8, z4, 8);
            C51916xx1 c51916xx1 = C51916xx1.f118396a;
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
            textView8.setText(c51916xx1.m4411a(context, nearbyBirdViewModel.getVehicle().getBird().getBatteryLevel(), true));
            textView11.setText(String.valueOf(nearbyBirdViewModel.getVehicle().getRssi()));
            JA5 m4236a = C51957y13.m4236a(nearbyBirdViewModel.getVehicle());
            if (m4236a != null) {
                i2 = m4236a.m101051b();
            } else {
                i2 = C48193rg4.ic_ui_signal_one;
            }
            imageView.setImageResource(i2);
            WireServiceCenterStatus serviceCenterStatus = nearbyBirdViewModel.getServiceCenterStatus();
            if (serviceCenterStatus != null) {
                str2 = serviceCenterStatus.getDisplayName();
                textView = textView12;
            } else {
                textView = textView12;
                str2 = null;
            }
            textView.setText(str2);
        }
    }

    public C50771w13() {
        C24558d<WireBird> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<WireBird>()");
        this.f115162g = m31902e;
        C24558d<WireBird> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<WireBird>()");
        this.f115163h = m31902e2;
        this.f115164i = new C1737E6(this);
    }

    /* renamed from: A */
    public final void m7566A(boolean z) {
        this.f115161f = z;
        notifyDataSetChanged();
    }

    /* renamed from: B */
    public final void m7565B(boolean z) {
        this.f115157b = z;
    }

    /* renamed from: C */
    public final void m7564C(boolean z) {
        this.f115159d = z;
    }

    /* renamed from: D */
    public final void m7563D(boolean z) {
        this.f115158c = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f115164i.m109395g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemViewType(int i) {
        return this.f115164i.m109394h().get(i).m105817b();
    }

    /* renamed from: o */
    public final Observable<WireBird> m7562o() {
        return this.f115163h;
    }

    /* renamed from: p */
    public final List<C3023H6> m7561p() {
        return this.f115164i.m109392j();
    }

    /* renamed from: q */
    public final boolean m7560q() {
        return this.f115160e;
    }

    /* renamed from: r */
    public final boolean m7559r() {
        return this.f115161f;
    }

    /* renamed from: t */
    public final boolean m7558t() {
        return this.f115157b;
    }

    /* renamed from: u */
    public final boolean m7557u() {
        return this.f115159d;
    }

    /* renamed from: v */
    public final boolean m7556v() {
        return this.f115158c;
    }

    /* renamed from: w */
    public final Observable<WireBird> m7555w() {
        return this.f115162g;
    }

    /* renamed from: x */
    public final void m7554x(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        if (this.f115164i.m109395g() == 0) {
            this.f115164i.m109401a(sections);
            return;
        }
        C11905h.C11910e mo30a = new C51364x13().mo30a(this.f115164i.m109392j(), sections);
        this.f115164i.m109399c();
        this.f115164i.m109401a(sections);
        mo30a.m66261d(this);
    }

    /* renamed from: y */
    public final void m7553y(boolean z) {
        this.f115160e = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(C29735w1 holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        return new C29739a(this, C40788fB0.m41761u(context, i, parent, false));
    }
}
