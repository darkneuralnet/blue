package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.bottomsheet.BaseBottomSheet;
import co.bird.android.model.BottomSheetButton;
import co.bird.android.model.RefreshWarehouseButton;
import co.bird.android.model.WarehouseFlightSheetButton;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.FlightSheetDetailFormat;
import co.bird.android.model.persistence.nestedstructures.FormattedFlightSheetDetail;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.persistence.nestedstructures.WarehouseStatus;
import co.bird.android.model.persistence.nestedstructures.WarehouseSummary;
import co.bird.android.model.persistence.nestedstructures.WarehouseVehicle;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.joda.time.DateTime;
import p000.C32771Ey6;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0005\u001a\u001b\u0011\u0015\u001cB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\u0010\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\rR\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, m28432d2 = {"LEy6;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "onDetachedFromRecyclerView", "Lkotlin/Function1;", "Lco/bird/android/model/WarehouseFlightSheetButton;", "onButtonClick", "v", "c", "Lkotlin/jvm/functions/Function1;", "Lco/bird/android/bottomsheet/BaseBottomSheet;", "Lco/bird/android/model/BottomSheetButton;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/bottomsheet/BaseBottomSheet;", "bottomSheet", "<init>", "()V", C17296a.f69688o, "b", "e", "warehouse-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWarehouseFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseFlightSheetAdapter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetAdapter\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,183:1\n9#2,4:184\n1855#3,2:188\n*S KotlinDebug\n*F\n+ 1 WarehouseFlightSheetAdapter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetAdapter\n*L\n68#1:184,4\n76#1:188,2\n*E\n"})
/* renamed from: Ey6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32771Ey6 extends AbstractC52206yS0 {

    /* renamed from: c */
    public Function1<? super WarehouseFlightSheetButton, Unit> f8370c = C2040f.f8387g;

    /* renamed from: d */
    public BaseBottomSheet<BottomSheetButton> f8371d;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LEy6$a;", "Lw1;", "", "position", "", "bind", "Ldc2;", "b", "Ldc2;", "binding", "Landroid/view/View;", "view", "<init>", "(LEy6;Landroid/view/View;)V", "warehouse-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWarehouseFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseFlightSheetAdapter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetAdapter$DetailViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,183:1\n18#2:184\n9#3,4:185\n*S KotlinDebug\n*F\n+ 1 WarehouseFlightSheetAdapter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetAdapter$DetailViewHolder\n*L\n113#1:184\n113#1:185,4\n*E\n"})
    /* renamed from: Ey6$a */
    /* loaded from: classes3.dex */
    public final class C2033a extends C29735w1 {

        /* renamed from: b */
        public final C39850dc2 f8372b;

        /* renamed from: c */
        public final /* synthetic */ C32771Ey6 f8373c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2033a(C32771Ey6 c32771Ey6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f8373c = c32771Ey6;
            C39850dc2 m44023a = C39850dc2.m44023a(view);
            Intrinsics.checkNotNullExpressionValue(m44023a, "bind(view)");
            this.f8372b = m44023a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            CharSequence detail;
            boolean z;
            Object m105816c = this.f8373c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof FormattedFlightSheetDetail)) {
                m105816c = null;
            }
            FormattedFlightSheetDetail formattedFlightSheetDetail = (FormattedFlightSheetDetail) m105816c;
            if (formattedFlightSheetDetail != null) {
                FlightSheetDetailFormat format = formattedFlightSheetDetail.getFormat();
                FlightSheetDetailFormat flightSheetDetailFormat = FlightSheetDetailFormat.ADDRESS;
                if (format == flightSheetDetailFormat) {
                    detail = C45097mS5.m25592n(formattedFlightSheetDetail.getDetail(), formattedFlightSheetDetail.getDetail(), new UnderlineSpan());
                } else {
                    detail = formattedFlightSheetDetail.getDetail();
                }
                this.f8372b.f76876c.setText(formattedFlightSheetDetail.getTitle());
                this.f8372b.f76875b.setText(detail);
                TextView textView = this.f8372b.f76875b;
                if (formattedFlightSheetDetail.getFormat() == flightSheetDetailFormat) {
                    z = true;
                } else {
                    z = false;
                }
                textView.setClickable(z);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LEy6$b;", "Lw1;", "", "position", "", "bind", "Lig2;", "b", "Lig2;", "binding", "Landroid/view/View;", "view", "<init>", "(LEy6;Landroid/view/View;)V", "warehouse-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWarehouseFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseFlightSheetAdapter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetAdapter$StatusViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,183:1\n18#2:184\n9#3,4:185\n*S KotlinDebug\n*F\n+ 1 WarehouseFlightSheetAdapter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetAdapter$StatusViewHolder\n*L\n100#1:184\n100#1:185,4\n*E\n"})
    /* renamed from: Ey6$b */
    /* loaded from: classes3.dex */
    public final class C2034b extends C29735w1 {

        /* renamed from: b */
        public final C42854ig2 f8374b;

        /* renamed from: c */
        public final /* synthetic */ C32771Ey6 f8375c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2034b(C32771Ey6 c32771Ey6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f8375c = c32771Ey6;
            C42854ig2 m33602a = C42854ig2.m33602a(view);
            Intrinsics.checkNotNullExpressionValue(m33602a, "bind(view)");
            this.f8374b = m33602a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f8375c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof WarehouseStatus)) {
                m105816c = null;
            }
            WarehouseStatus warehouseStatus = (WarehouseStatus) m105816c;
            if (warehouseStatus != null) {
                C32771Ey6 c32771Ey6 = this.f8375c;
                this.f8374b.f87725d.setText(warehouseStatus.getTitle());
                TextView textView = this.f8374b.f87723b;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.details");
                C49520tu6.setTextAndVisibility$default(textView, warehouseStatus.getDetails(), 0, 2, null);
                BaseBottomSheet baseBottomSheet = c32771Ey6.f8371d;
                if (baseBottomSheet != null) {
                    ConstraintLayout root = this.f8374b.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "binding.root");
                    baseBottomSheet.m59064n("status", root);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LEy6$c;", "Lw1;", "", "position", "", "bind", "Ljg2;", "b", "Ljg2;", "binding", "Landroid/view/View;", "view", "<init>", "(LEy6;Landroid/view/View;)V", "warehouse-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWarehouseFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseFlightSheetAdapter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetAdapter$SummaryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,183:1\n18#2:184\n9#3,4:185\n*S KotlinDebug\n*F\n+ 1 WarehouseFlightSheetAdapter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetAdapter$SummaryViewHolder\n*L\n87#1:184\n87#1:185,4\n*E\n"})
    /* renamed from: Ey6$c */
    /* loaded from: classes3.dex */
    public final class C2035c extends C29735w1 {

        /* renamed from: b */
        public final C43447jg2 f8376b;

        /* renamed from: c */
        public final /* synthetic */ C32771Ey6 f8377c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2035c(C32771Ey6 c32771Ey6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f8377c = c32771Ey6;
            C43447jg2 m30123a = C43447jg2.m30123a(view);
            Intrinsics.checkNotNullExpressionValue(m30123a, "bind(view)");
            this.f8376b = m30123a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f8377c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof WarehouseSummary)) {
                m105816c = null;
            }
            WarehouseSummary warehouseSummary = (WarehouseSummary) m105816c;
            if (warehouseSummary != null) {
                C32771Ey6 c32771Ey6 = this.f8377c;
                this.f8376b.f93126d.setText(warehouseSummary.getTitle());
                this.f8376b.f93124b.setText(String.valueOf(warehouseSummary.getCount()));
                BaseBottomSheet baseBottomSheet = c32771Ey6.f8371d;
                if (baseBottomSheet != null) {
                    LinearLayout root = this.f8376b.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "binding.root");
                    baseBottomSheet.m59064n("summary", root);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LEy6$d;", "Lw1;", "", "position", "", "bind", "Lkg2;", "b", "Lkg2;", "binding", "Landroid/view/View;", "view", "<init>", "(LEy6;Landroid/view/View;)V", "warehouse-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWarehouseFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseFlightSheetAdapter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetAdapter$VehicleDetailViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n18#2:184\n9#3,4:185\n1#4:189\n*S KotlinDebug\n*F\n+ 1 WarehouseFlightSheetAdapter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetAdapter$VehicleDetailViewHolder\n*L\n169#1:184\n169#1:185,4\n*E\n"})
    /* renamed from: Ey6$d */
    /* loaded from: classes3.dex */
    public final class C2036d extends C29735w1 {

        /* renamed from: b */
        public final C44040kg2 f8378b;

        /* renamed from: c */
        public final /* synthetic */ C32771Ey6 f8379c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2036d(C32771Ey6 c32771Ey6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f8379c = c32771Ey6;
            C44040kg2 m28653a = C44040kg2.m28653a(view);
            Intrinsics.checkNotNullExpressionValue(m28653a, "bind(view)");
            this.f8378b = m28653a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Drawable drawable;
            Object m105816c = this.f8379c.m94545o().m109397e(i).m105816c();
            ColorStateList colorStateList = null;
            if (!(m105816c instanceof WarehouseVehicle)) {
                m105816c = null;
            }
            WarehouseVehicle warehouseVehicle = (WarehouseVehicle) m105816c;
            if (warehouseVehicle != null) {
                ImageView imageView = this.f8378b.f94773e;
                ClientIcon statusIcon = warehouseVehicle.getStatusIcon();
                if (statusIcon != null) {
                    Context context = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                    drawable = C33341Hk0.m103484a(statusIcon, context);
                } else {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                ImageView imageView2 = this.f8378b.f94773e;
                ThemedColors statusIconBackgroundColor = warehouseVehicle.getStatusIconBackgroundColor();
                if (statusIconBackgroundColor != null) {
                    colorStateList = ColorStateList.valueOf(statusIconBackgroundColor.getLightMode());
                }
                imageView2.setBackgroundTintList(colorStateList);
                this.f8378b.f94772d.setText(warehouseVehicle.getTitle());
                this.f8378b.f94771c.setText(this.itemView.getContext().getString(C45871nl4.battery_percent, Integer.valueOf(warehouseVehicle.getBattery())));
                this.f8378b.f94770b.setBatteryLevel(warehouseVehicle.getBattery() / 100.0f);
            }
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"LEy6$e;", "Lw1;", "", "position", "", "bind", "Lorg/joda/time/DateTime;", "updatedAt", "i", "Llg2;", "b", "Llg2;", "binding", "Lio/reactivex/disposables/c;", "c", "Lio/reactivex/disposables/c;", "disposable", "Landroid/view/View;", "view", "<init>", "(LEy6;Landroid/view/View;)V", "warehouse-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWarehouseFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseFlightSheetAdapter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetAdapter$VehicleDetailsTitleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 5 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,183:1\n18#2:184\n9#3,4:185\n41#4:189\n180#5:190\n*S KotlinDebug\n*F\n+ 1 WarehouseFlightSheetAdapter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetAdapter$VehicleDetailsTitleViewHolder\n*L\n142#1:184\n142#1:185,4\n149#1:189\n149#1:190\n*E\n"})
    /* renamed from: Ey6$e */
    /* loaded from: classes3.dex */
    public final class C2037e extends C29735w1 {

        /* renamed from: b */
        public final C44633lg2 f8380b;

        /* renamed from: c */
        public InterfaceC23465c f8381c;

        /* renamed from: d */
        public final /* synthetic */ C32771Ey6 f8382d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nWarehouseFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseFlightSheetAdapter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetAdapter$VehicleDetailsTitleViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n18#2:184\n9#3,4:185\n1#4:189\n*S KotlinDebug\n*F\n+ 1 WarehouseFlightSheetAdapter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetAdapter$VehicleDetailsTitleViewHolder$1\n*L\n136#1:184\n136#1:185,4\n*E\n"})
        /* renamed from: Ey6$e$a */
        /* loaded from: classes3.dex */
        public static final class C2038a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C32771Ey6 f8383g;

            /* renamed from: h */
            public final /* synthetic */ C2037e f8384h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2038a(C32771Ey6 c32771Ey6, C2037e c2037e) {
                super(1);
                this.f8383g = c32771Ey6;
                this.f8384h = c2037e;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C1737E6 m94545o = this.f8383g.m94545o();
                Integer safePosition = this.f8384h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof RefreshWarehouseButton)) {
                        m105816c = null;
                    }
                    RefreshWarehouseButton refreshWarehouseButton = (RefreshWarehouseButton) m105816c;
                    if (refreshWarehouseButton != null) {
                        this.f8383g.f8370c.invoke(refreshWarehouseButton);
                    }
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ey6$e$b */
        /* loaded from: classes3.dex */
        public static final class C2039b extends Lambda implements Function1<Long, Unit> {

            /* renamed from: h */
            public final /* synthetic */ RefreshWarehouseButton f8386h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2039b(RefreshWarehouseButton refreshWarehouseButton) {
                super(1);
                this.f8386h = refreshWarehouseButton;
            }

            /* renamed from: a */
            public final void m108160a(Long l) {
                C2037e.this.m108161i(this.f8386h.getUpdatedAt());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                m108160a(l);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2037e(C32771Ey6 c32771Ey6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f8382d = c32771Ey6;
            C44633lg2 m27009a = C44633lg2.m27009a(view);
            Intrinsics.checkNotNullExpressionValue(m27009a, "bind(view)");
            this.f8380b = m27009a;
            ImageView imageView = m27009a.f96540c;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.icon");
            C34585Ms2.m94661j(imageView, new C2038a(c32771Ey6, this));
        }

        /* renamed from: e */
        public static final void m108162e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f8382d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof RefreshWarehouseButton)) {
                m105816c = null;
            }
            RefreshWarehouseButton refreshWarehouseButton = (RefreshWarehouseButton) m105816c;
            if (refreshWarehouseButton != null) {
                C32771Ey6 c32771Ey6 = this.f8382d;
                this.f8380b.f96541d.setText(refreshWarehouseButton.getTitle());
                m108161i(refreshWarehouseButton.getUpdatedAt());
                InterfaceC23465c interfaceC23465c = this.f8381c;
                if (interfaceC23465c != null) {
                    interfaceC23465c.dispose();
                }
                Observable<Long> observeOn = Observable.interval(1L, TimeUnit.SECONDS).observeOn(C23454a.m33087a());
                Intrinsics.checkNotNullExpressionValue(observeOn, "interval(1L, TimeUnit.SE…dSchedulers.mainThread())");
                BaseBottomSheet baseBottomSheet = c32771Ey6.f8371d;
                if (baseBottomSheet != null) {
                    ScopeProvider m45202a = ViewScopeProvider.m45202a(baseBottomSheet);
                    Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
                    if (m45202a != null) {
                        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m45202a));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final C2039b c2039b = new C2039b(refreshWarehouseButton);
                        this.f8381c = ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Fy6
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj) {
                                C32771Ey6.C2037e.m108162e(Function1.this, obj);
                            }
                        });
                    }
                }
            }
        }

        /* renamed from: i */
        public final void m108161i(DateTime dateTime) {
            TextView textView = this.f8380b.f96539b;
            Context context = this.itemView.getContext();
            int i = C45871nl4.updated_time_format;
            Context context2 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "itemView.context");
            textView.setText(context.getString(i, C46880pT0.m19259c(dateTime, context2, false)));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/WarehouseFlightSheetButton;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/WarehouseFlightSheetButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ey6$f */
    /* loaded from: classes3.dex */
    public static final class C2040f extends Lambda implements Function1<WarehouseFlightSheetButton, Unit> {

        /* renamed from: g */
        public static final C2040f f8387g = new C2040f();

        public C2040f() {
            super(1);
        }

        /* renamed from: a */
        public final void m108159a(WarehouseFlightSheetButton it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WarehouseFlightSheetButton warehouseFlightSheetButton) {
            m108159a(warehouseFlightSheetButton);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C34643My6());
        }
        ViewParent parent = recyclerView.getParent();
        if (parent != null) {
            z = parent instanceof BaseBottomSheet;
        } else {
            z = true;
        }
        if (!z) {
            parent = null;
        }
        BaseBottomSheet<BottomSheetButton> baseBottomSheet = (BaseBottomSheet) parent;
        this.f8371d = baseBottomSheet;
        if (baseBottomSheet != null) {
            BaseBottomSheet.clearPeekViews$default(baseBottomSheet, false, 1, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        IntRange until;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        until = RangesKt___RangesKt.until(0, recyclerView.getItemDecorationCount());
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            recyclerView.removeItemDecorationAt(((IntIterator) it).nextInt());
        }
    }

    /* renamed from: v */
    public final void m108165v(Function1<? super WarehouseFlightSheetButton, Unit> onButtonClick) {
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        this.f8370c = onButtonClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        if (i == C36612Vj4.item_warehouse_flight_sheet_summary) {
            return new C2035c(this, m41761u);
        }
        if (i == C36612Vj4.item_warehouse_flight_sheet_status) {
            return new C2034b(this, m41761u);
        }
        return i == C38728bk4.item_formatted_flight_sheet_detail_short || i == C38728bk4.item_formatted_flight_sheet_detail_long ? new C2033a(this, m41761u) : i == C36612Vj4.item_warehouse_flight_sheet_vehicle_details_title ? new C2037e(this, m41761u) : i == C36612Vj4.item_warehouse_flight_sheet_vehicle_detail ? new C2036d(this, m41761u) : new C29735w1(m41761u);
    }
}
