package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.bottomsheet.BaseBottomSheet;
import co.bird.android.model.BottomSheetButton;
import co.bird.android.model.CampaignButton;
import co.bird.android.model.DrawableFlightSheetButton;
import co.bird.android.model.FlightSheetButton;
import co.bird.android.model.QuickCaptureButton;
import co.bird.android.model.VehicleCommand;
import co.bird.android.model.constant.BirdLocationSource;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.QuickCaptureState;
import co.bird.android.model.persistence.nestedstructures.FlightSheetBanner;
import co.bird.android.model.persistence.nestedstructures.FlightSheetDetail;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideRating;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideRatingTag;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.widget.standardcomponents.LabeledDetailItemView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import com.google.android.material.chip.Chip;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KClass;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import org.joda.time.Seconds;
import p000.AbstractC36392Ul0;
import p000.C37392Ys1;
@Metadata(m28433d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 <2\u00020\u0001:\u0010=>?@\u001f#(+037<ABCDB\u001d\u0012\b\b\u0002\u0010!\u001a\u00020\u001e\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b:\u0010;J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0016\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u001a\u0010\u001a\u001a\u00020\n2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u0017J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\nH\u0002R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00102\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R$\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001806058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006E"}, m28432d2 = {"LYs1;", "LoA;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "onDetachedFromRecyclerView", "LF6;", "r", "", "LH6;", "sections", "u", "w", "Lco/bird/android/model/VehicleCommand;", "command", "B", "Lkotlin/Function1;", "Lco/bird/android/model/FlightSheetButton;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "button", "D", "E", "Landroidx/recyclerview/widget/RecyclerView$o;", "e", "Landroidx/recyclerview/widget/RecyclerView$o;", "itemDecoration", "LEa;", "f", "LEa;", "analyticsManager", "Lco/bird/android/bottomsheet/BaseBottomSheet;", "Lco/bird/android/model/BottomSheetButton;", "g", "Lco/bird/android/bottomsheet/BaseBottomSheet;", "bottomSheet", "h", "Landroidx/recyclerview/widget/RecyclerView;", "", "", "", "i", "Ljava/util/Map;", "expanded", "j", "Lkotlin/jvm/functions/Function1;", "", "Lkotlin/reflect/KClass;", "k", "Ljava/util/Set;", "buttonsInProgress", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$o;LEa;)V", "l", C17296a.f69688o, "b", "c", DateTokenConverter.CONVERTER_KEY, "m", "n", "o", "p", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n*L\n1#1,669:1\n9#2,4:670\n9#2,4:679\n9#2,4:692\n1855#3,2:674\n288#3,2:676\n1360#3:683\n1446#3,5:684\n288#3,2:689\n1549#3:696\n1620#3,3:697\n1855#3,2:700\n18#4:678\n18#4:691\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter\n*L\n135#1:670,4\n160#1:679,4\n167#1:692,4\n150#1:674,2\n159#1:676,2\n165#1:683\n165#1:684,5\n166#1:689,2\n200#1:696\n200#1:697,3\n201#1:700,2\n160#1:678\n167#1:691\n*E\n"})
/* renamed from: Ys1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37392Ys1 extends AbstractC26846oA {

    /* renamed from: l */
    public static final C10052f f47506l = new C10052f(null);

    /* renamed from: e */
    public final RecyclerView.AbstractC11854o f47507e;

    /* renamed from: f */
    public final InterfaceC1880Ea f47508f;

    /* renamed from: g */
    public BaseBottomSheet<BottomSheetButton> f47509g;

    /* renamed from: h */
    public RecyclerView f47510h;

    /* renamed from: i */
    public Map<CharSequence, Boolean> f47511i;

    /* renamed from: j */
    public Function1<? super FlightSheetButton, Unit> f47512j;

    /* renamed from: k */
    public Set<KClass<? extends FlightSheetButton>> f47513k;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LYs1$a;", "Lw1;", "", "position", "", "bind", "LUb2;", "b", "LUb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LYs1;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$ActionHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$ActionHeaderViewHolder\n*L\n525#1:670\n525#1:671,4\n*E\n"})
    /* renamed from: Ys1$a */
    /* loaded from: classes3.dex */
    public final class C10043a extends C29735w1 {

        /* renamed from: b */
        public final C36304Ub2 f47514b;

        /* renamed from: c */
        public final /* synthetic */ C37392Ys1 f47515c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$ActionHeaderViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,669:1\n1#2:670\n18#3:671\n9#4,4:672\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$ActionHeaderViewHolder$1\n*L\n518#1:671\n518#1:672,4\n*E\n"})
        /* renamed from: Ys1$a$a */
        /* loaded from: classes3.dex */
        public static final class C10044a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C37392Ys1 f47517h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10044a(C37392Ys1 c37392Ys1) {
                super(1);
                this.f47517h = c37392Ys1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C2637G6 m109397e;
                FlightSheetButton m82110b;
                Integer safePosition = C10043a.this.getSafePosition();
                if (safePosition == null || (m109397e = this.f47517h.m94545o().m109397e(safePosition.intValue())) == null) {
                    return;
                }
                Object m105816c = m109397e.m105816c();
                if (!(m105816c instanceof U12)) {
                    m105816c = null;
                }
                U12 u12 = (U12) m105816c;
                if (u12 == null || (m82110b = u12.m82110b()) == null) {
                    return;
                }
                this.f47517h.f47512j.invoke(m82110b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10043a(C37392Ys1 c37392Ys1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f47515c = c37392Ys1;
            C36304Ub2 m81296a = C36304Ub2.m81296a(view);
            Intrinsics.checkNotNullExpressionValue(m81296a, "bind(view)");
            this.f47514b = m81296a;
            ConstraintLayout root = m81296a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C10044a(c37392Ys1));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            Object m105816c = this.f47515c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof U12)) {
                m105816c = null;
            }
            U12 u12 = (U12) m105816c;
            if (u12 != null) {
                this.f47514b.f37637d.setText(u12.m82108d());
                this.f47514b.f37636c.setText(u12.m82109c());
                ImageView imageView = this.f47514b.f37635b;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.chevron");
                if (u12.m82110b() != null) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.m11232s(imageView, z, 4);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LYs1$b;", "Lw1;", "", "position", "", "bind", "LWb2;", "b", "LWb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LYs1;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$BannerViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n1#4:675\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$BannerViewHolder\n*L\n213#1:670\n213#1:671,4\n*E\n"})
    /* renamed from: Ys1$b */
    /* loaded from: classes3.dex */
    public final class C10045b extends C29735w1 {

        /* renamed from: b */
        public final C36772Wb2 f47518b;

        /* renamed from: c */
        public final /* synthetic */ C37392Ys1 f47519c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10045b(C37392Ys1 c37392Ys1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f47519c = c37392Ys1;
            C36772Wb2 m78162a = C36772Wb2.m78162a(view);
            Intrinsics.checkNotNullExpressionValue(m78162a, "bind(view)");
            this.f47518b = m78162a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            ColorStateList valueOf;
            Drawable m103484a;
            Object m105816c = this.f47519c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof FlightSheetBanner)) {
                m105816c = null;
            }
            FlightSheetBanner flightSheetBanner = (FlightSheetBanner) m105816c;
            if (flightSheetBanner != null) {
                C37392Ys1 c37392Ys1 = this.f47519c;
                this.f47518b.f41380c.setText(flightSheetBanner.getText());
                this.f47518b.f41380c.setTextColor(flightSheetBanner.getTextColor().getLightMode());
                ClientIcon icon = flightSheetBanner.getIcon();
                if (icon != null && (m103484a = C33341Hk0.m103484a(icon, getContext())) != null) {
                    ImageView imageView = this.f47518b.f41379b;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.icon");
                    imageView.setImageDrawable(m103484a);
                }
                ThemedColors iconColor = flightSheetBanner.getIconColor();
                if (iconColor != null && (valueOf = ColorStateList.valueOf(iconColor.getLightMode())) != null) {
                    ImageView imageView2 = this.f47518b.f41379b;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "binding.icon");
                    imageView2.setImageTintList(valueOf);
                }
                ThemedColors backgroundColor = flightSheetBanner.getBackgroundColor();
                if (backgroundColor != null) {
                    int lightMode = backgroundColor.getLightMode();
                    LinearLayout root = this.f47518b.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "binding.root");
                    root.setBackgroundColor(lightMode);
                }
                BaseBottomSheet baseBottomSheet = c37392Ys1.f47509g;
                if (baseBottomSheet != null) {
                    View itemView = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    baseBottomSheet.m59064n("banner", itemView);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LYs1$c;", "Lw1;", "", "position", "", "bind", "Lgb2;", "b", "Lgb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LYs1;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$ButtonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$ButtonViewHolder\n*L\n563#1:670\n563#1:671,4\n*E\n"})
    /* renamed from: Ys1$c */
    /* loaded from: classes3.dex */
    public final class C10046c extends C29735w1 {

        /* renamed from: b */
        public final C41618gb2 f47520b;

        /* renamed from: c */
        public final /* synthetic */ C37392Ys1 f47521c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$ButtonViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n1#4:675\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$ButtonViewHolder$1\n*L\n559#1:670\n559#1:671,4\n*E\n"})
        /* renamed from: Ys1$c$a */
        /* loaded from: classes3.dex */
        public static final class C10047a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C37392Ys1 f47522g;

            /* renamed from: h */
            public final /* synthetic */ C10046c f47523h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10047a(C37392Ys1 c37392Ys1, C10046c c10046c) {
                super(1);
                this.f47522g = c37392Ys1;
                this.f47523h = c10046c;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f47522g.m94545o().m109394h().get(this.f47523h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof FlightSheetButton)) {
                    m105816c = null;
                }
                FlightSheetButton flightSheetButton = (FlightSheetButton) m105816c;
                if (flightSheetButton != null) {
                    this.f47522g.m74079D(flightSheetButton);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10046c(C37392Ys1 c37392Ys1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f47521c = c37392Ys1;
            C41618gb2 m39110a = C41618gb2.m39110a(view);
            Intrinsics.checkNotNullExpressionValue(m39110a, "bind(view)");
            this.f47520b = m39110a;
            Button root = m39110a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C10047a(c37392Ys1, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Button root = this.f47520b.getRoot();
            Object m105816c = this.f47521c.m94545o().m109397e(i).m105816c();
            String str = null;
            if (!(m105816c instanceof FlightSheetButton)) {
                m105816c = null;
            }
            FlightSheetButton flightSheetButton = (FlightSheetButton) m105816c;
            if (flightSheetButton != null) {
                str = flightSheetButton.getText();
            }
            root.setText(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LYs1$d;", "Lw1;", "", "position", "", "bind", "LXb2;", "b", "LXb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LYs1;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$CampaignViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n766#4:675\n857#4,2:676\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$CampaignViewHolder\n*L\n275#1:670\n275#1:671,4\n281#1:675\n281#1:676,2\n*E\n"})
    /* renamed from: Ys1$d */
    /* loaded from: classes3.dex */
    public final class C10048d extends C29735w1 {

        /* renamed from: b */
        public final C37006Xb2 f47524b;

        /* renamed from: c */
        public final /* synthetic */ C37392Ys1 f47525c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$CampaignViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n1#4:675\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$CampaignViewHolder$1\n*L\n270#1:670\n270#1:671,4\n*E\n"})
        /* renamed from: Ys1$d$a */
        /* loaded from: classes3.dex */
        public static final class C10049a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C37392Ys1 f47526g;

            /* renamed from: h */
            public final /* synthetic */ C10048d f47527h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10049a(C37392Ys1 c37392Ys1, C10048d c10048d) {
                super(1);
                this.f47526g = c37392Ys1;
                this.f47527h = c10048d;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f47526g.m94545o().m109397e(this.f47527h.getBindingAdapterPosition()).m105816c();
                if (!(m105816c instanceof CampaignButton)) {
                    m105816c = null;
                }
                CampaignButton campaignButton = (CampaignButton) m105816c;
                if (campaignButton != null) {
                    this.f47526g.m74079D(campaignButton);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10048d(C37392Ys1 c37392Ys1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f47525c = c37392Ys1;
            C37006Xb2 m76815a = C37006Xb2.m76815a(view);
            Intrinsics.checkNotNullExpressionValue(m76815a, "bind(view)");
            this.f47524b = m76815a;
            ConstraintLayout root = m76815a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C10049a(c37392Ys1, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            BaseBottomSheet baseBottomSheet;
            boolean z;
            Object m105816c = this.f47525c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof CampaignButton)) {
                m105816c = null;
            }
            CampaignButton campaignButton = (CampaignButton) m105816c;
            if (campaignButton != null) {
                C37392Ys1 c37392Ys1 = this.f47525c;
                this.f47524b.f43458e.setText(campaignButton.getMessage());
                this.f47524b.f43456c.setText(campaignButton.getDescription());
                ArrayList arrayList = new ArrayList();
                for (Object obj : c37392Ys1.m94545o().m109394h()) {
                    if (((C2637G6) obj).m105817b() == C37548Zj4.item_flight_sheet_campaign) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.indexOf(c37392Ys1.m94545o().m109397e(i)) == 0 && (baseBottomSheet = c37392Ys1.f47509g) != null) {
                    View itemView = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    baseBottomSheet.m59064n("campaign", itemView);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"LYs1$e;", "Lw1;", "", "position", "", "bind", "LYb2;", "b", "LYb2;", "binding", "Landroid/graphics/drawable/Drawable;", "c", "Landroid/graphics/drawable/Drawable;", "drawable", "", "value", DateTokenConverter.CONVERTER_KEY, "Z", "setEnabled", "(Z)V", "enabled", "Landroid/view/View;", "view", "<init>", "(LYs1;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$CommandViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n2624#4,3:675\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$CommandViewHolder\n*L\n504#1:670\n504#1:671,4\n507#1:675,3\n*E\n"})
    /* renamed from: Ys1$e */
    /* loaded from: classes3.dex */
    public final class C10050e extends C29735w1 {

        /* renamed from: b */
        public final C37240Yb2 f47528b;

        /* renamed from: c */
        public Drawable f47529c;

        /* renamed from: d */
        public boolean f47530d;

        /* renamed from: e */
        public final /* synthetic */ C37392Ys1 f47531e;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$CommandViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$CommandViewHolder$1\n*L\n494#1:670\n494#1:671,4\n*E\n"})
        /* renamed from: Ys1$e$a */
        /* loaded from: classes3.dex */
        public static final class C10051a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C37392Ys1 f47533h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10051a(C37392Ys1 c37392Ys1) {
                super(1);
                this.f47533h = c37392Ys1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                if (C10050e.this.getAdapterPosition() != -1) {
                    Object m105816c = this.f47533h.m94545o().m109397e(C10050e.this.getAdapterPosition()).m105816c();
                    if (!(m105816c instanceof VehicleCommand)) {
                        m105816c = null;
                    }
                    VehicleCommand vehicleCommand = (VehicleCommand) m105816c;
                    if (vehicleCommand != null) {
                        C37392Ys1 c37392Ys1 = this.f47533h;
                        c37392Ys1.m21707A().add(vehicleCommand);
                        c37392Ys1.m21703y().onNext(vehicleCommand);
                        c37392Ys1.m74078E();
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10050e(C37392Ys1 c37392Ys1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f47531e = c37392Ys1;
            C37240Yb2 m74831a = C37240Yb2.m74831a(view);
            Intrinsics.checkNotNullExpressionValue(m74831a, "bind(view)");
            this.f47528b = m74831a;
            this.f47530d = true;
            ConstraintLayout root = m74831a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C10051a(c37392Ys1));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            Object m105816c = this.f47531e.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof VehicleCommand)) {
                m105816c = null;
            }
            VehicleCommand vehicleCommand = (VehicleCommand) m105816c;
            if (vehicleCommand != null) {
                C37392Ys1 c37392Ys1 = this.f47531e;
                this.f47528b.f46054d.setText(vehicleCommand.getCommand());
                this.f47529c = NA0.m94299e(this.itemView.getContext(), vehicleCommand.getIcon());
                HashSet m21707A = c37392Ys1.m21707A();
                boolean z2 = true;
                if (!(m21707A instanceof Collection) || !m21707A.isEmpty()) {
                    Iterator it = m21707A.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((VehicleCommand) it.next()).getClass() == vehicleCommand.getClass()) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            z2 = false;
                            break;
                        }
                    }
                }
                setEnabled(z2);
            }
        }

        public final void setEnabled(boolean z) {
            this.f47530d = z;
            if (z) {
                this.f47528b.f46052b.setEnabled(true);
                CircularProgressIndicator circularProgressIndicator = this.f47528b.f46053c;
                Intrinsics.checkNotNullExpressionValue(circularProgressIndicator, "binding.progress");
                C49520tu6.show$default(circularProgressIndicator, false, 0, 2, null);
                this.f47528b.f46052b.setImageDrawable(this.f47529c);
                return;
            }
            this.f47528b.f46052b.setEnabled(false);
            this.f47528b.f46053c.m49246u();
            this.f47528b.f46052b.setImageDrawable(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LYs1$f;", "", "", "MAP_CAMERA_ZOOM", "F", "<init>", "()V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ys1$f */
    /* loaded from: classes3.dex */
    public static final class C10052f {
        public /* synthetic */ C10052f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C10052f() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LYs1$g;", "Lw1;", "", "position", "", "bind", "LFc2;", "b", "LFc2;", "binding", "Landroid/view/View;", "view", "<init>", "(LYs1;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$LabeledDetailViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n1#4:675\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$LabeledDetailViewHolder\n*L\n537#1:670\n537#1:671,4\n*E\n"})
    /* renamed from: Ys1$g */
    /* loaded from: classes3.dex */
    public final class C10053g extends C29735w1 {

        /* renamed from: b */
        public final C32803Fc2 f47534b;

        /* renamed from: c */
        public final /* synthetic */ C37392Ys1 f47535c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10053g(C37392Ys1 c37392Ys1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f47535c = c37392Ys1;
            C32803Fc2 m106908a = C32803Fc2.m106908a(view);
            Intrinsics.checkNotNullExpressionValue(m106908a, "bind(view)");
            this.f47534b = m106908a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f47535c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof FlightSheetDetail)) {
                m105816c = null;
            }
            FlightSheetDetail flightSheetDetail = (FlightSheetDetail) m105816c;
            if (flightSheetDetail != null) {
                String component1 = flightSheetDetail.component1();
                String component2 = flightSheetDetail.component2();
                this.f47534b.getRoot().setLabel(component1);
                LabeledDetailItemView root = this.f47534b.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "binding.root");
                LabeledDetailItemView.setDetailAndVisibility$default(root, component2, 0, 2, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LYs1$h;", "Lw1;", "", "position", "", "bind", "LGc2;", "b", "LGc2;", "binding", "Landroid/view/View;", "view", "<init>", "(LYs1;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$LabeledRatingViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n1#4:675\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$LabeledRatingViewHolder\n*L\n548#1:670\n548#1:671,4\n*E\n"})
    /* renamed from: Ys1$h */
    /* loaded from: classes3.dex */
    public final class C10054h extends C29735w1 {

        /* renamed from: b */
        public final C33037Gc2 f47536b;

        /* renamed from: c */
        public final /* synthetic */ C37392Ys1 f47537c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10054h(C37392Ys1 c37392Ys1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f47537c = c37392Ys1;
            C33037Gc2 m104969a = C33037Gc2.m104969a(view);
            Intrinsics.checkNotNullExpressionValue(m104969a, "bind(view)");
            this.f47536b = m104969a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f47537c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C46484on4)) {
                m105816c = null;
            }
            C46484on4 c46484on4 = (C46484on4) m105816c;
            if (c46484on4 != null) {
                String m20494a = c46484on4.m20494a();
                int m20493b = c46484on4.m20493b();
                this.f47536b.getRoot().setLabel(m20494a);
                this.f47536b.getRoot().setRating(m20493b);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LYs1$i;", "Lw1;", "", "position", "", "bind", "LKc2;", "b", "LKc2;", "binding", "Landroid/view/View;", "view", "<init>", "(LYs1;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$LastEndRidePhotoViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$LastEndRidePhotoViewHolder\n*L\n659#1:670\n659#1:671,4\n*E\n"})
    /* renamed from: Ys1$i */
    /* loaded from: classes3.dex */
    public final class C10055i extends C29735w1 {

        /* renamed from: b */
        public final C33973Kc2 f47538b;

        /* renamed from: c */
        public final /* synthetic */ C37392Ys1 f47539c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10055i(C37392Ys1 c37392Ys1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f47539c = c37392Ys1;
            C33973Kc2 m98688a = C33973Kc2.m98688a(view);
            Intrinsics.checkNotNullExpressionValue(m98688a, "bind(view)");
            this.f47538b = m98688a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            AbstractC33662It6<ImageView, Drawable> abstractC33662It6;
            Object m105816c = this.f47539c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            String str = (String) m105816c;
            if (str != null) {
                abstractC33662It6 = ComponentCallbacks2C17096a.m53137u(this.f47538b.getRoot()).m81653k(str).m16096R0(this.f47538b.f19930b);
            } else {
                abstractC33662It6 = null;
            }
            if (abstractC33662It6 == null) {
                this.f47538b.f19930b.setImageDrawable(null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\f\u0010\r\u001a\u00020\f*\u00020\u0006H\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R(\u0010\u0018\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m28432d2 = {"LYs1$j;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "location", "Lco/bird/android/model/constant/BirdModel;", RequestHeadersFactory.MODEL, "Lcom/google/android/gms/maps/model/MarkerOptions;", "i", "Lcom/google/android/gms/maps/model/LatLng;", "j", "LJc2;", "b", "LJc2;", "binding", "LcD1;", "value", "c", "LcD1;", "e", "(LcD1;)V", "map", "Landroid/view/View;", "view", "<init>", "(LYs1;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$LastRideMapViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n1#4:675\n1855#5,2:676\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$LastRideMapViewHolder\n*L\n607#1:670\n607#1:671,4\n618#1:676,2\n*E\n"})
    /* renamed from: Ys1$j */
    /* loaded from: classes3.dex */
    public final class C10056j extends C29735w1 {

        /* renamed from: b */
        public final C33739Jc2 f47540b;

        /* renamed from: c */
        public C39011cD1 f47541c;

        /* renamed from: d */
        public final /* synthetic */ C37392Ys1 f47542d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10056j(C37392Ys1 c37392Ys1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f47542d = c37392Ys1;
            C33739Jc2 m100119a = C33739Jc2.m100119a(view);
            Intrinsics.checkNotNullExpressionValue(m100119a, "bind(view)");
            this.f47540b = m100119a;
            m100119a.f17900b.m50725b(null);
            m100119a.f17900b.m50726a(new InterfaceC36350Ug3() { // from class: Zs1
                @Override // p000.InterfaceC36350Ug3
                public final void onMapReady(C39011cD1 c39011cD1) {
                    C37392Ys1.C10056j.m74076b(C37392Ys1.C10056j.this, c39011cD1);
                }
            });
        }

        /* renamed from: b */
        public static final void m74076b(C10056j this$0, C39011cD1 map) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(map, "map");
            this$0.m74075e(map);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object first;
            Object last;
            C39011cD1 c39011cD1 = this.f47541c;
            if (c39011cD1 == null) {
                return;
            }
            Object m105816c = this.f47542d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof XL2)) {
                m105816c = null;
            }
            XL2 xl2 = (XL2) m105816c;
            if (xl2 != null) {
                BirdModel m77105a = xl2.m77105a();
                Geolocation m77104b = xl2.m77104b();
                List<Geolocation> m77103c = xl2.m77103c();
                c39011cD1.m61680h();
                if (!m77103c.isEmpty()) {
                    LatLngBounds.C17620a c17620a = new LatLngBounds.C17620a();
                    PolylineOptions m50611j1 = new PolylineOptions().m50622E(C40788fB0.m41776f(getContext(), C32364Df4.birdESBlue)).m50610k1(new RoundCap()).m50620F(new RoundCap()).m50611j1(2);
                    Intrinsics.checkNotNullExpressionValue(m50611j1, "PolylineOptions()\n      …ointType(JointType.ROUND)");
                    for (Geolocation geolocation : m77103c) {
                        LatLng latLng = new LatLng(geolocation.getLatitude(), geolocation.getLongitude());
                        m50611j1.m50607s(latLng);
                        c17620a.m50666b(latLng);
                    }
                    c39011cD1.m61683e(m50611j1);
                    first = CollectionsKt___CollectionsKt.first((List<? extends Object>) m77103c);
                    c39011cD1.m61685c(m74074i((Geolocation) first, m77105a));
                    MarkerOptions markerOptions = new MarkerOptions();
                    Context context = this.f47540b.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "binding.root.context");
                    MarkerOptions m50644u = markerOptions.m50657N0(C40788fB0.m41777e(context, C33309Hg4.ic_receipt_ride_end)).m50644u(0.5f, 1.0f);
                    last = CollectionsKt___CollectionsKt.last((List<? extends Object>) m77103c);
                    c39011cD1.m61685c(m50644u.m50643u1(m74073j((Geolocation) last)));
                    c39011cD1.m61675m(C48149rc0.m15707c(c17620a.m50667a(), 100));
                    return;
                }
                c39011cD1.m61685c(m74074i(m77104b, m77105a));
                c39011cD1.m61675m(C48149rc0.m15705e(m74073j(m77104b), 14.0f));
            }
        }

        /* renamed from: e */
        public final void m74075e(C39011cD1 c39011cD1) {
            this.f47541c = c39011cD1;
            if (c39011cD1 != null) {
                c39011cD1.m61673o(false);
            }
            if (this.f47541c != null) {
                bind(getAdapterPosition());
            }
        }

        /* renamed from: i */
        public final MarkerOptions m74074i(Geolocation geolocation, BirdModel birdModel) {
            int i;
            MarkerOptions markerOptions = new MarkerOptions();
            Context context = this.f47540b.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "binding.root.context");
            boolean z = false;
            if (birdModel != null && birdModel.isCruiser()) {
                z = true;
            }
            if (z) {
                i = C48193rg4.ic_cruiser_default;
            } else {
                i = C48193rg4.ic_scooter_default;
            }
            MarkerOptions m50643u1 = markerOptions.m50657N0(C40788fB0.m41777e(context, i)).m50644u(0.5f, 1.0f).m50643u1(m74073j(geolocation));
            Intrinsics.checkNotNullExpressionValue(m50643u1, "MarkerOptions()\n        …tion(location.toLatLng())");
            return m50643u1;
        }

        /* renamed from: j */
        public final LatLng m74073j(Geolocation geolocation) {
            return new LatLng(geolocation.getLatitude(), geolocation.getLongitude());
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00110\u00110\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f¨\u0006\u0018"}, m28432d2 = {"LYs1$k;", "Lw1;", "", "onAttachedToWindow", "", "position", "bind", "Lbc2;", "b", "Lbc2;", "binding", "Lio/reactivex/subjects/a;", "Lco/bird/android/model/constant/QuickCaptureState;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/a;", "stateSubject", "Lorg/joda/time/DateTime;", DateTokenConverter.CONVERTER_KEY, "timeoutSubject", "Landroid/view/View;", "view", "<init>", "(LYs1;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$QuickCaptureViewHolder\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 5 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,669:1\n41#2:670\n180#3:671\n18#4:672\n18#4:678\n9#5,4:673\n9#5,4:679\n1#6:677\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$QuickCaptureViewHolder\n*L\n334#1:670\n334#1:671\n353#1:672\n297#1:678\n353#1:673,4\n297#1:679,4\n*E\n"})
    /* renamed from: Ys1$k */
    /* loaded from: classes3.dex */
    public final class C10057k extends C29735w1 {

        /* renamed from: b */
        public final C38646bc2 f47543b;

        /* renamed from: c */
        public final C24552a<QuickCaptureState> f47544c;

        /* renamed from: d */
        public final C24552a<DateTime> f47545d;

        /* renamed from: e */
        public final /* synthetic */ C37392Ys1 f47546e;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$QuickCaptureViewHolder$onAttachedToWindow$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,669:1\n1#2:670\n*E\n"})
        /* renamed from: Ys1$k$a */
        /* loaded from: classes3.dex */
        public static final class C10058a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C37392Ys1 f47547g;

            /* renamed from: h */
            public final /* synthetic */ C10057k f47548h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10058a(C37392Ys1 c37392Ys1, C10057k c10057k) {
                super(1);
                this.f47547g = c37392Ys1;
                this.f47548h = c10057k;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                QuickCaptureButton m74060r = C10057k.m74060r(this.f47548h, this.f47547g);
                if (m74060r != null) {
                    this.f47547g.f47513k.add(Reflection.getOrCreateKotlinClass(QuickCaptureButton.class));
                    this.f47547g.f47512j.invoke(m74060r);
                }
                Integer safePosition = this.f47548h.getSafePosition();
                if (safePosition != null) {
                    this.f47548h.bind(safePosition.intValue());
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/constant/QuickCaptureState;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/constant/QuickCaptureState;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$QuickCaptureViewHolder$onAttachedToWindow$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,669:1\n1#2:670\n*E\n"})
        /* renamed from: Ys1$k$b */
        /* loaded from: classes3.dex */
        public static final class C10059b extends Lambda implements Function1<QuickCaptureState, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C37392Ys1 f47549g;

            /* renamed from: h */
            public final /* synthetic */ C10057k f47550h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10059b(C37392Ys1 c37392Ys1, C10057k c10057k) {
                super(1);
                this.f47549g = c37392Ys1;
                this.f47550h = c10057k;
            }

            /* renamed from: a */
            public final void m74059a(QuickCaptureState quickCaptureState) {
                if (this.f47549g.f47513k.contains(Reflection.getOrCreateKotlinClass(QuickCaptureButton.class))) {
                    this.f47549g.f47513k.remove(Reflection.getOrCreateKotlinClass(QuickCaptureButton.class));
                    Integer safePosition = this.f47550h.getSafePosition();
                    if (safePosition != null) {
                        this.f47550h.bind(safePosition.intValue());
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(QuickCaptureState quickCaptureState) {
                m74059a(quickCaptureState);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/constant/QuickCaptureState;", TransferTable.COLUMN_STATE, "", C17296a.f69688o, "(Lco/bird/android/model/constant/QuickCaptureState;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ys1$k$c */
        /* loaded from: classes3.dex */
        public static final class C10060c extends Lambda implements Function1<QuickCaptureState, Boolean> {

            /* renamed from: g */
            public static final C10060c f47551g = new C10060c();

            public C10060c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(QuickCaptureState state) {
                boolean z;
                Intrinsics.checkNotNullParameter(state, "state");
                if (state == QuickCaptureState.INITIATED) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/constant/QuickCaptureState;", "<anonymous parameter 0>", "Lorg/joda/time/DateTime;", "timeout", C17296a.f69688o, "(Lco/bird/android/model/constant/QuickCaptureState;Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ys1$k$d */
        /* loaded from: classes3.dex */
        public static final class C10061d extends Lambda implements Function2<QuickCaptureState, DateTime, DateTime> {

            /* renamed from: g */
            public static final C10061d f47552g = new C10061d();

            public C10061d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final DateTime invoke(QuickCaptureState quickCaptureState, DateTime timeout) {
                Intrinsics.checkNotNullParameter(quickCaptureState, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(timeout, "timeout");
                return timeout;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lorg/joda/time/DateTime;", "timeout", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "b", "(Lorg/joda/time/DateTime;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ys1$k$e */
        /* loaded from: classes3.dex */
        public static final class C10062e extends Lambda implements Function1<DateTime, InterfaceC23434B<? extends DateTime>> {

            /* renamed from: g */
            public static final C10062e f47553g = new C10062e();

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Long;)Lorg/joda/time/DateTime;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Ys1$k$e$a */
            /* loaded from: classes3.dex */
            public static final class C10063a extends Lambda implements Function1<Long, DateTime> {

                /* renamed from: g */
                public final /* synthetic */ DateTime f47554g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10063a(DateTime dateTime) {
                    super(1);
                    this.f47554g = dateTime;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final DateTime invoke(Long it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return this.f47554g;
                }
            }

            public C10062e() {
                super(1);
            }

            /* renamed from: c */
            public static final DateTime m74054c(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (DateTime) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC23434B<? extends DateTime> invoke(DateTime timeout) {
                Intrinsics.checkNotNullParameter(timeout, "timeout");
                int seconds = Seconds.secondsBetween(DateTime.now(), timeout).getSeconds();
                if (seconds > 0) {
                    Observable<Long> subscribeOn = Observable.intervalRange(0L, seconds + 1, 0L, 1L, TimeUnit.SECONDS).subscribeOn(C24542a.m31934a());
                    final Function1 c10063a = new C10063a(timeout);
                    return subscribeOn.map(new InterfaceC23492o() { // from class: ft1
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            DateTime m74054c;
                            m74054c = C37392Ys1.C10057k.C10062e.m74054c(Function1.this, obj);
                            return m74054c;
                        }
                    });
                }
                return Observable.empty();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "timeout", "", C17296a.f69688o, "(Lorg/joda/time/DateTime;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ys1$k$f */
        /* loaded from: classes3.dex */
        public static final class C10064f extends Lambda implements Function1<DateTime, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C37392Ys1 f47556h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10064f(C37392Ys1 c37392Ys1) {
                super(1);
                this.f47556h = c37392Ys1;
            }

            /* renamed from: a */
            public final void m74052a(DateTime dateTime) {
                Integer num;
                int coerceAtLeast;
                int coerceAtLeast2;
                String str;
                Seconds secondsBetween = Seconds.secondsBetween(DateTime.now(), dateTime);
                Minutes standardMinutes = secondsBetween.toStandardMinutes();
                StringBuilder sb = new StringBuilder();
                Object obj = "";
                if (standardMinutes.getMinutes() >= 10) {
                    num = "";
                } else {
                    num = 0;
                }
                sb.append(num);
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(standardMinutes.getMinutes(), 0);
                sb.append(coerceAtLeast);
                sb.append(":");
                if (secondsBetween.getSeconds() % 60 < 10) {
                    obj = 0;
                }
                sb.append(obj);
                coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(secondsBetween.getSeconds() % 60, 0);
                sb.append(coerceAtLeast2);
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
                Button button = C10057k.this.f47543b.f57755b;
                QuickCaptureButton m74060r = C10057k.m74060r(C10057k.this, this.f47556h);
                if (m74060r != null) {
                    str = m74060r.getText();
                } else {
                    str = null;
                }
                button.setText(str + " (" + sb2 + ")");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DateTime dateTime) {
                m74052a(dateTime);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10057k(C37392Ys1 c37392Ys1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f47546e = c37392Ys1;
            C38646bc2 m64278a = C38646bc2.m64278a(view);
            Intrinsics.checkNotNullExpressionValue(m64278a, "bind(view)");
            this.f47543b = m64278a;
            C24552a<QuickCaptureState> m31922e = C24552a.m31922e();
            Intrinsics.checkNotNullExpressionValue(m31922e, "create<QuickCaptureState>()");
            this.f47544c = m31922e;
            C24552a<DateTime> m31922e2 = C24552a.m31922e();
            Intrinsics.checkNotNullExpressionValue(m31922e2, "create<DateTime>()");
            this.f47545d = m31922e2;
        }

        /* renamed from: m */
        public static final void m74065m(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: n */
        public static final boolean m74064n(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        /* renamed from: o */
        public static final DateTime m74063o(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (DateTime) tmp0.invoke(obj, obj2);
        }

        /* renamed from: p */
        public static final InterfaceC23434B m74062p(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        /* renamed from: q */
        public static final void m74061q(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: r */
        public static final QuickCaptureButton m74060r(C10057k c10057k, C37392Ys1 c37392Ys1) {
            C2637G6 m109397e;
            Integer safePosition = c10057k.getSafePosition();
            QuickCaptureButton quickCaptureButton = null;
            if (safePosition == null || (m109397e = c37392Ys1.m94545o().m109397e(safePosition.intValue())) == null) {
                return null;
            }
            Object m105816c = m109397e.m105816c();
            if (m105816c instanceof QuickCaptureButton) {
                quickCaptureButton = m105816c;
            }
            return quickCaptureButton;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f47546e.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof QuickCaptureButton)) {
                m105816c = null;
            }
            QuickCaptureButton quickCaptureButton = (QuickCaptureButton) m105816c;
            if (quickCaptureButton != null) {
                C37392Ys1 c37392Ys1 = this.f47546e;
                this.f47545d.onNext(quickCaptureButton.getTimeout());
                this.f47544c.onNext(quickCaptureButton.getState());
                this.f47543b.f57755b.setText(quickCaptureButton.getText());
                boolean contains = c37392Ys1.f47513k.contains(Reflection.getOrCreateKotlinClass(QuickCaptureButton.class));
                CircularProgressIndicator circularProgressIndicator = this.f47543b.f57757d;
                Intrinsics.checkNotNullExpressionValue(circularProgressIndicator, "binding.qcProgressBar");
                C49520tu6.show$default(circularProgressIndicator, contains, 0, 2, null);
                Button button = this.f47543b.f57755b;
                Intrinsics.checkNotNullExpressionValue(button, "binding.button");
                C49520tu6.show$default(button, !contains, 0, 2, null);
                BaseBottomSheet baseBottomSheet = c37392Ys1.f47509g;
                if (baseBottomSheet != null) {
                    ConstraintLayout root = this.f47543b.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "binding.root");
                    baseBottomSheet.m59064n("quick_capture", root);
                }
            }
        }

        @Override // p000.C29735w1
        public void onAttachedToWindow() {
            Button button = this.f47543b.f57755b;
            Intrinsics.checkNotNullExpressionValue(button, "binding.button");
            C34585Ms2.m94661j(button, new C10058a(this.f47546e, this));
            Observable<QuickCaptureState> observeOn = this.f47544c.distinctUntilChanged().observeOn(C23454a.m33087a());
            final Function1 c10059b = new C10059b(this.f47546e, this);
            Observable<QuickCaptureState> observeOn2 = observeOn.doOnNext(new InterfaceC23484g() { // from class: at1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C37392Ys1.C10057k.m74065m(Function1.this, obj);
                }
            }).observeOn(C24542a.m31934a());
            final Function1 c10060c = C10060c.f47551g;
            Observable<QuickCaptureState> delay = observeOn2.filter(new InterfaceC23494q() { // from class: bt1
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m74064n;
                    m74064n = C37392Ys1.C10057k.m74064n(Function1.this, obj);
                    return m74064n;
                }
            }).delay(100L, TimeUnit.MILLISECONDS);
            C24552a<DateTime> c24552a = this.f47545d;
            final Function2 c10061d = C10061d.f47552g;
            Observable<R> withLatestFrom = delay.withLatestFrom(c24552a, new InterfaceC23480c() { // from class: ct1
                @Override // io.reactivex.functions.InterfaceC23480c
                public final Object apply(Object obj, Object obj2) {
                    DateTime m74063o;
                    m74063o = C37392Ys1.C10057k.m74063o(Function2.this, obj, obj2);
                    return m74063o;
                }
            });
            final Function1 c10062e = C10062e.f47553g;
            Observable observeOn3 = withLatestFrom.switchMap(new InterfaceC23492o() { // from class: dt1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23434B m74062p;
                    m74062p = C37392Ys1.C10057k.m74062p(Function1.this, obj);
                    return m74062p;
                }
            }).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn3, "class FlightSheetV2Adapt…null)\n      }\n    }\n  }\n}");
            ConstraintLayout root = this.f47543b.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            ScopeProvider m45202a = ViewScopeProvider.m45202a(root);
            Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
            Object m33094as = observeOn3.m33094as(AutoDispose.m45239a(m45202a));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final Function1 c10064f = new C10064f(this.f47546e);
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: et1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C37392Ys1.C10057k.m74061q(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LYs1$l;", "Lw1;", "", "position", "", "bind", "Landroid/view/View;", "b", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "LHc2;", "c", "LHc2;", "binding", "<init>", "(LYs1;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$RideRatingTagsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n1855#4,2:675\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$RideRatingTagsViewHolder\n*L\n444#1:670\n444#1:671,4\n445#1:675,2\n*E\n"})
    /* renamed from: Ys1$l */
    /* loaded from: classes3.dex */
    public final class C10065l extends C29735w1 {

        /* renamed from: b */
        public final View f47557b;

        /* renamed from: c */
        public final C33271Hc2 f47558c;

        /* renamed from: d */
        public final /* synthetic */ C37392Ys1 f47559d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10065l(C37392Ys1 c37392Ys1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f47559d = c37392Ys1;
            this.f47557b = view;
            C33271Hc2 m103656a = C33271Hc2.m103656a(view);
            Intrinsics.checkNotNullExpressionValue(m103656a, "bind(view)");
            this.f47558c = m103656a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            this.f47558c.f13638c.removeAllViews();
            Object m105816c = this.f47559d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof List)) {
                m105816c = null;
            }
            List<FlightSheetRideRatingTag> list = (List) m105816c;
            if (list != null) {
                for (FlightSheetRideRatingTag flightSheetRideRatingTag : list) {
                    Context context = this.f47557b.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "view.context");
                    C35195Pi0 m89909c = C35195Pi0.m89909c(C40788fB0.m41772j(context));
                    Intrinsics.checkNotNullExpressionValue(m89909c, "inflate(view.context.layoutInflater)");
                    Chip root = m89909c.getRoot();
                    if (flightSheetRideRatingTag.getCount() > 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    root.setChipIconVisible(z);
                    m89909c.getRoot().setText(flightSheetRideRatingTag.getLabel());
                    if (flightSheetRideRatingTag.getCount() > 1) {
                        Context context2 = this.f47557b.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "view.context");
                        C37631Zs6 m72354c = C37631Zs6.m72354c(C40788fB0.m41772j(context2));
                        m72354c.getRoot().setLayoutParams(new ViewGroup.LayoutParams((int) C49347td3.m12001b(20), (int) C49347td3.m12001b(20)));
                        Intrinsics.checkNotNullExpressionValue(m72354c, "inflate(view.context.lay…Px.toInt())\n            }");
                        m72354c.getRoot().setText(String.valueOf(flightSheetRideRatingTag.getCount()));
                        TextView root2 = m72354c.getRoot();
                        Intrinsics.checkNotNullExpressionValue(root2, "countBinding.root");
                        C36209Tq6 c36209Tq6 = new C36209Tq6(root2);
                        c36209Tq6.setBounds(0, 0, (int) C49347td3.m12001b(20), (int) C49347td3.m12001b(20));
                        m89909c.getRoot().setChipIcon(c36209Tq6);
                    }
                    this.f47558c.f13638c.addView(m89909c.getRoot());
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LYs1$m;", "Lw1;", "", "position", "", "bind", "LDr6;", "b", "LDr6;", "binding", "Landroid/view/View;", "view", "<init>", "(LYs1;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$RideRatingsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$RideRatingsViewHolder\n*L\n427#1:670\n427#1:671,4\n*E\n"})
    /* renamed from: Ys1$m */
    /* loaded from: classes3.dex */
    public final class C10066m extends C29735w1 {

        /* renamed from: b */
        public final C32474Dr6 f47560b;

        /* renamed from: c */
        public final /* synthetic */ C37392Ys1 f47561c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10066m(C37392Ys1 c37392Ys1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f47561c = c37392Ys1;
            C32474Dr6 m109847a = C32474Dr6.m109847a(view);
            Intrinsics.checkNotNullExpressionValue(m109847a, "bind(view)");
            this.f47560b = m109847a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f47561c.m94545o().m109397e(i).m105816c();
            Unit unit = null;
            if (!(m105816c instanceof FlightSheetRideRating)) {
                m105816c = null;
            }
            FlightSheetRideRating flightSheetRideRating = (FlightSheetRideRating) m105816c;
            if (flightSheetRideRating != null) {
                this.f47560b.f6436b.setLabel(flightSheetRideRating.getLabel());
                this.f47560b.f6436b.setRating((float) flightSheetRideRating.getRating());
                String feedback = flightSheetRideRating.getFeedback();
                if (feedback != null) {
                    this.f47560b.f6437c.setText(feedback);
                    TextView textView = this.f47560b.f6437c;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.reviewBox");
                    C49520tu6.m11233r(textView);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    TextView textView2 = this.f47560b.f6437c;
                    Intrinsics.checkNotNullExpressionValue(textView2, "binding.reviewBox");
                    C49520tu6.m11239l(textView2);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LYs1$n;", "Lw1;", "", "position", "", "bind", "LZb2;", "b", "LZb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LYs1;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$StatusViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n177#4,2:675\n766#5:677\n857#5,2:678\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$StatusViewHolder\n*L\n393#1:670\n393#1:671,4\n401#1:675,2\n411#1:677\n411#1:678,2\n*E\n"})
    /* renamed from: Ys1$n */
    /* loaded from: classes3.dex */
    public final class C10067n extends C29735w1 {

        /* renamed from: b */
        public final C37474Zb2 f47562b;

        /* renamed from: c */
        public final /* synthetic */ C37392Ys1 f47563c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$StatusViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$StatusViewHolder$1\n*L\n374#1:670\n374#1:671,4\n*E\n"})
        /* renamed from: Ys1$n$a */
        /* loaded from: classes3.dex */
        public static final class C10068a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C37392Ys1 f47564g;

            /* renamed from: h */
            public final /* synthetic */ C10067n f47565h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10068a(C37392Ys1 c37392Ys1, C10067n c10067n) {
                super(1);
                this.f47564g = c37392Ys1;
                this.f47565h = c10067n;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f47564g.m94545o().m109397e(this.f47565h.getBindingAdapterPosition()).m105816c();
                if (!(m105816c instanceof GQ5)) {
                    m105816c = null;
                }
                GQ5 gq5 = (GQ5) m105816c;
                if (gq5 != null) {
                    C37392Ys1 c37392Ys1 = this.f47564g;
                    C10067n c10067n = this.f47565h;
                    CharSequence m105128f = gq5.m105128f();
                    if (m105128f == null) {
                        return;
                    }
                    boolean z = !Intrinsics.areEqual(c37392Ys1.f47511i.get(m105128f), Boolean.TRUE);
                    c37392Ys1.f47511i.put(m105128f, Boolean.valueOf(z));
                    InterfaceC1880Ea interfaceC1880Ea = c37392Ys1.f47508f;
                    if (interfaceC1880Ea != null) {
                        interfaceC1880Ea.mo55905y(new C36456Us1(null, null, null, gq5.m105132b(), gq5.m105128f().toString(), z, 7, null));
                    }
                    c37392Ys1.notifyItemChanged(c10067n.getBindingAdapterPosition());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10067n(C37392Ys1 c37392Ys1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f47563c = c37392Ys1;
            C37474Zb2 m72906a = C37474Zb2.m72906a(view);
            Intrinsics.checkNotNullExpressionValue(m72906a, "bind(view)");
            this.f47562b = m72906a;
            ImageView imageView = m72906a.f48800b;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.arrow");
            C34585Ms2.m94661j(imageView, new C10068a(c37392Ys1, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Unit unit;
            boolean z;
            float f;
            BaseBottomSheet baseBottomSheet;
            boolean z2;
            Object m105816c = this.f47563c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof GQ5)) {
                m105816c = null;
            }
            GQ5 gq5 = (GQ5) m105816c;
            if (gq5 != null) {
                C37392Ys1 c37392Ys1 = this.f47563c;
                this.f47562b.f48804f.setText(gq5.m105128f());
                this.f47562b.f48802d.setText(gq5.m105131c());
                this.f47562b.f48803e.setImageDrawable(gq5.m105130d());
                Integer m105129e = gq5.m105129e();
                if (m105129e != null) {
                    int intValue = m105129e.intValue();
                    this.f47562b.f48803e.setBackground(NA0.m94299e(getContext(), C33309Hg4.background_circle));
                    this.f47562b.f48803e.setBackgroundTintList(ColorStateList.valueOf(intValue));
                    ImageView imageView = this.f47562b.f48803e;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.statusIcon");
                    int m12001b = (int) C49347td3.m12001b(4);
                    imageView.setPadding(m12001b, m12001b, m12001b, m12001b);
                    this.f47562b.f48803e.setColorFilter(NA0.m94301c(getContext(), C32364Df4.birdWhite));
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    this.f47562b.f48803e.setBackground(null);
                }
                ImageView imageView2 = this.f47562b.f48800b;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.arrow");
                if (gq5.m105131c() != null) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(imageView2, z, 0, 2, null);
                ImageView imageView3 = this.f47562b.f48800b;
                Object obj = c37392Ys1.f47511i.get(gq5.m105128f());
                Boolean bool = Boolean.TRUE;
                if (!Intrinsics.areEqual(obj, bool)) {
                    f = 0.0f;
                } else {
                    f = 180.0f;
                }
                imageView3.setRotation(f);
                TextView textView = this.f47562b.f48802d;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.statusDescription");
                C49520tu6.show$default(textView, Intrinsics.areEqual(c37392Ys1.f47511i.get(gq5.m105128f()), bool), 0, 2, null);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : c37392Ys1.m94545o().m109394h()) {
                    if (((C2637G6) obj2).m105817b() == C37548Zj4.item_flight_sheet_campaign) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty() && (baseBottomSheet = c37392Ys1.f47509g) != null) {
                    View itemView = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    baseBottomSheet.m59064n("status", itemView);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LYs1$o;", "Lw1;", "", "position", "", "bind", "Lac2;", "b", "Lac2;", "binding", "Los1;", "c", "Los1;", "adapter", "Landroid/view/View;", "view", "<init>", "(LYs1;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$VehicleSummaryViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,669:1\n177#2,2:670\n18#3:672\n9#4,4:673\n1#5:677\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$VehicleSummaryViewHolder\n*L\n235#1:670,2\n241#1:672\n241#1:673,4\n*E\n"})
    /* renamed from: Ys1$o */
    /* loaded from: classes3.dex */
    public final class C10069o extends C29735w1 {

        /* renamed from: b */
        public final C38053ac2 f47566b;

        /* renamed from: c */
        public final C46531os1 f47567c;

        /* renamed from: d */
        public final /* synthetic */ C37392Ys1 f47568d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10069o(C37392Ys1 c37392Ys1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f47568d = c37392Ys1;
            C38053ac2 m71098a = C38053ac2.m71098a(view);
            Intrinsics.checkNotNullExpressionValue(m71098a, "bind(view)");
            this.f47566b = m71098a;
            C46531os1 c46531os1 = new C46531os1();
            this.f47567c = c46531os1;
            ConstraintLayout root = m71098a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            root.setPadding(0, 0, 0, 0);
            m71098a.f50714b.setAdapter(c46531os1);
            m71098a.f50714b.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            Drawable m90445a;
            Drawable m75240a;
            Object m105816c = this.f47568d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof TU5)) {
                m105816c = null;
            }
            TU5 tu5 = (TU5) m105816c;
            if (tu5 != null) {
                C37392Ys1 c37392Ys1 = this.f47568d;
                this.f47566b.f50717e.setText(tu5.m83567e());
                this.f47566b.f50715c.setBatteryLevel(tu5.m83568d() / 100.0f);
                this.f47566b.f50716d.setText(tu5.m83569c());
                ImageView imageView = this.f47566b.f50721i;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.signal");
                boolean z2 = true;
                if (tu5.m83566f() != null) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(imageView, z, 0, 2, null);
                BirdLocationSource m83565g = tu5.m83565g();
                if (m83565g != null && (m75240a = C9757YL.m75240a(m83565g, getContext())) != null) {
                    ImageView imageView2 = this.f47566b.f50721i;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "binding.signal");
                    imageView2.setImageDrawable(m75240a);
                }
                TextView textView = this.f47566b.f50722j;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.signalText");
                C49520tu6.setTextAndVisibility$default(textView, tu5.m83566f(), 0, 2, null);
                ImageView imageView3 = this.f47566b.f50719g;
                Intrinsics.checkNotNullExpressionValue(imageView3, "binding.rating");
                if (tu5.m83562j() == null) {
                    z2 = false;
                }
                C49520tu6.show$default(imageView3, z2, 0, 2, null);
                TextView textView2 = this.f47566b.f50720h;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.ratingText");
                C49520tu6.setTextAndVisibility$default(textView2, tu5.m83562j(), 0, 2, null);
                this.f47566b.f50718f.setText(tu5.m83564h());
                BirdModel m83563i = tu5.m83563i();
                if (m83563i != null && (m90445a = C6327PM.m90445a(m83563i, getContext())) != null) {
                    ImageView imageView4 = this.f47566b.f50723k;
                    Intrinsics.checkNotNullExpressionValue(imageView4, "binding.vehicleImage");
                    imageView4.setImageDrawable(m90445a);
                }
                this.f47567c.m20414p(tu5.m83570b());
                BaseBottomSheet baseBottomSheet = c37392Ys1.f47509g;
                if (baseBottomSheet != null) {
                    View itemView = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    baseBottomSheet.m59064n("summary", itemView);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LYs1$p;", "Lw1;", "", "position", "", "bind", "Lmg2;", "b", "Lmg2;", "binding", "Landroid/view/View;", "view", "<init>", "(LYs1;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$WhiteChevronButtonHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$WhiteChevronButtonHolder\n*L\n576#1:670\n576#1:671,4\n*E\n"})
    /* renamed from: Ys1$p */
    /* loaded from: classes3.dex */
    public final class C10070p extends C29735w1 {

        /* renamed from: b */
        public final C45226mg2 f47569b;

        /* renamed from: c */
        public final /* synthetic */ C37392Ys1 f47570c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$WhiteChevronButtonHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,669:1\n18#2:670\n9#3,4:671\n1#4:675\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$WhiteChevronButtonHolder$1\n*L\n572#1:670\n572#1:671,4\n*E\n"})
        /* renamed from: Ys1$p$a */
        /* loaded from: classes3.dex */
        public static final class C10071a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C37392Ys1 f47571g;

            /* renamed from: h */
            public final /* synthetic */ C10070p f47572h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10071a(C37392Ys1 c37392Ys1, C10070p c10070p) {
                super(1);
                this.f47571g = c37392Ys1;
                this.f47572h = c10070p;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f47571g.m94545o().m109394h().get(this.f47572h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof FlightSheetButton)) {
                    m105816c = null;
                }
                FlightSheetButton flightSheetButton = (FlightSheetButton) m105816c;
                if (flightSheetButton != null) {
                    this.f47571g.m74079D(flightSheetButton);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10070p(C37392Ys1 c37392Ys1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f47570c = c37392Ys1;
            C45226mg2 m25182a = C45226mg2.m25182a(view);
            Intrinsics.checkNotNullExpressionValue(m25182a, "bind(view)");
            this.f47569b = m25182a;
            m25182a.getRoot().setStateListAnimator(null);
            Button root = m25182a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C10071a(c37392Ys1, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            String str;
            Object m105816c = this.f47570c.m94545o().m109394h().get(i).m105816c();
            DrawableFlightSheetButton drawableFlightSheetButton = null;
            if (!(m105816c instanceof FlightSheetButton)) {
                m105816c = null;
            }
            FlightSheetButton flightSheetButton = (FlightSheetButton) m105816c;
            Button root = this.f47569b.getRoot();
            if (flightSheetButton != null) {
                str = flightSheetButton.getText();
            } else {
                str = null;
            }
            root.setText(str);
            if (flightSheetButton instanceof DrawableFlightSheetButton) {
                drawableFlightSheetButton = (DrawableFlightSheetButton) flightSheetButton;
            }
            if (drawableFlightSheetButton != null) {
                this.f47569b.getRoot().setCompoundDrawablesRelativeWithIntrinsicBounds(drawableFlightSheetButton.getDrawableStart(), drawableFlightSheetButton.getDrawableTop(), drawableFlightSheetButton.getDrawableEnd(), drawableFlightSheetButton.getDrawableBottom());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/FlightSheetButton;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/FlightSheetButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ys1$q */
    /* loaded from: classes3.dex */
    public static final class C10072q extends Lambda implements Function1<FlightSheetButton, Unit> {

        /* renamed from: g */
        public static final C10072q f47573g = new C10072q();

        public C10072q() {
            super(1);
        }

        /* renamed from: a */
        public final void m74051a(FlightSheetButton it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FlightSheetButton flightSheetButton) {
            m74051a(flightSheetButton);
            return Unit.INSTANCE;
        }
    }

    public C37392Ys1() {
        this(null, null, 3, null);
    }

    @Override // p000.AbstractC26846oA
    /* renamed from: B */
    public void mo21706B(VehicleCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        super.mo21706B(command);
        m74078E();
    }

    /* renamed from: C */
    public final void m74080C(Function1<? super FlightSheetButton, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f47512j = listener;
    }

    /* renamed from: D */
    public final void m74079D(FlightSheetButton flightSheetButton) {
        this.f47512j.invoke(flightSheetButton);
    }

    /* renamed from: E */
    public final void m74078E() {
        IntRange until;
        int collectionSizeOrDefault;
        C10050e c10050e;
        RecyclerView recyclerView = this.f47510h;
        if (recyclerView == null) {
            return;
        }
        until = RangesKt___RangesKt.until(0, recyclerView.getChildCount());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList<View> arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(recyclerView.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View child : arrayList) {
            Intrinsics.checkNotNullExpressionValue(child, "child");
            Integer m40591a = C41207ft4.m40591a(recyclerView, child);
            if (m40591a != null) {
                int intValue = m40591a.intValue();
                if (getItemViewType(intValue) == C37548Zj4.item_flight_sheet_command) {
                    RecyclerView.AbstractC11834D childViewHolder = recyclerView.getChildViewHolder(child);
                    if (childViewHolder instanceof C10050e) {
                        c10050e = (C10050e) childViewHolder;
                    } else {
                        c10050e = null;
                    }
                    if (c10050e != null) {
                        c10050e.bind(intValue);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
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
        this.f47509g = baseBottomSheet;
        if (baseBottomSheet != null) {
            BaseBottomSheet.clearPeekViews$default(baseBottomSheet, false, 1, null);
        }
        this.f47510h = recyclerView;
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(this.f47507e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        IntRange until;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f47509g = null;
        this.f47510h = null;
        until = RangesKt___RangesKt.until(0, recyclerView.getItemDecorationCount());
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            recyclerView.removeItemDecorationAt(((IntIterator) it).nextInt());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C41797gt1();
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:666)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:524)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:282)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:252)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[LOOP:1: B:20:0x0051->B:22:0x0057, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC5440My
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo24871u(java.util.Collection<p000.C3023H6> r5) {
        /*
            r4 = this;
            java.lang.String r0 = "sections"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            E6 r0 = r4.m94545o()
            java.util.List r0 = r0.m109394h()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            r3 = r1
            G6 r3 = (p000.C2637G6) r3
            java.lang.Object r3 = r3.m105816c()
            boolean r3 = r3 instanceof p000.C50043un6
            if (r3 == 0) goto L13
            goto L2b
        L2a:
            r1 = r2
        L2b:
            G6 r1 = (p000.C2637G6) r1
            if (r1 == 0) goto L42
            java.lang.Object r0 = r1.m105816c()
            boolean r1 = r0 instanceof p000.C50043un6
            if (r1 == 0) goto L38
            goto L39
        L38:
            r0 = r2
        L39:
            un6 r0 = (p000.C50043un6) r0
            if (r0 == 0) goto L42
            java.lang.String r0 = r0.m9755h()
            goto L43
        L42:
            r0 = r2
        L43:
            super.mo24871u(r5)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L51:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L67
            java.lang.Object r3 = r5.next()
            H6 r3 = (p000.C3023H6) r3
            java.util.List r3 = r3.m104408e()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            kotlin.collections.CollectionsKt.addAll(r1, r3)
            goto L51
        L67:
            java.util.Iterator r5 = r1.iterator()
        L6b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L81
            java.lang.Object r1 = r5.next()
            r3 = r1
            G6 r3 = (p000.C2637G6) r3
            java.lang.Object r3 = r3.m105816c()
            boolean r3 = r3 instanceof p000.C50043un6
            if (r3 == 0) goto L6b
            goto L82
        L81:
            r1 = r2
        L82:
            G6 r1 = (p000.C2637G6) r1
            if (r1 == 0) goto L99
            java.lang.Object r5 = r1.m105816c()
            boolean r1 = r5 instanceof p000.C50043un6
            if (r1 == 0) goto L8f
            goto L90
        L8f:
            r5 = r2
        L90:
            un6 r5 = (p000.C50043un6) r5
            if (r5 == 0) goto L99
            java.lang.String r5 = r5.m9755h()
            goto L9a
        L99:
            r5 = r2
        L9a:
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r5)
            if (r5 != 0) goto Lae
            co.bird.android.bottomsheet.BaseBottomSheet<co.bird.android.model.BottomSheetButton> r5 = r4.f47509g
            if (r5 == 0) goto La9
            r0 = 0
            r1 = 1
            co.bird.android.bottomsheet.BaseBottomSheet.clearPeekViews$default(r5, r0, r1, r2)
        La9:
            java.util.Set<kotlin.reflect.KClass<? extends co.bird.android.model.FlightSheetButton>> r5 = r4.f47513k
            r5.clear()
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C37392Ys1.mo24871u(java.util.Collection):void");
    }

    @Override // p000.AbstractC26846oA
    /* renamed from: w */
    public void mo21705w() {
        super.mo21705w();
        m74078E();
    }

    public /* synthetic */ C37392Ys1(RecyclerView.AbstractC11854o abstractC11854o, InterfaceC1880Ea interfaceC1880Ea, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C33414Hs1() : abstractC11854o, (i & 2) != 0 ? null : interfaceC1880Ea);
    }

    @Override // p000.AbstractC26846oA, androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C37548Zj4.item_flight_sheet_banner ? new C10045b(this, m41761u) : i == C37548Zj4.item_flight_sheet_summary ? new C10069o(this, m41761u) : i == C37548Zj4.item_flight_sheet_campaign ? new C10048d(this, m41761u) : i == C37548Zj4.item_flight_sheet_summary_quick_capture ? new C10057k(this, m41761u) : i == C37548Zj4.item_flight_sheet_status ? new C10067n(this, m41761u) : i == C37548Zj4.item_flight_sheet_command ? new C10050e(this, m41761u) : i == C37548Zj4.item_collapsable_header ? new AbstractC36392Ul0.View$OnClickListenerC8438a(this, m41761u) : i == C37548Zj4.item_flight_sheet_action_header ? new C10043a(this, m41761u) : i == C37548Zj4.item_labeled_detail ? new C10053g(this, m41761u) : i == C37548Zj4.item_labeled_rating ? new C10054h(this, m41761u) : i == C45268mk4.item_button_secondary ? new C10046c(this, m41761u) : i == C45268mk4.item_white_button_with_end_chevron ? new C10070p(this, m41761u) : i == C37548Zj4.item_last_ride_photo ? new C10055i(this, m41761u) : i == C37548Zj4.item_last_ride_map ? new C10056j(this, m41761u) : i == C45268mk4.view_labeled_ride_rating_with_review ? new C10066m(this, m41761u) : i == C45268mk4.item_labeled_tags ? new C10065l(this, m41761u) : new C29735w1(m41761u);
    }

    public C37392Ys1(RecyclerView.AbstractC11854o itemDecoration, InterfaceC1880Ea interfaceC1880Ea) {
        Intrinsics.checkNotNullParameter(itemDecoration, "itemDecoration");
        this.f47507e = itemDecoration;
        this.f47508f = interfaceC1880Ea;
        this.f47511i = new LinkedHashMap();
        this.f47512j = C10072q.f47573g;
        this.f47513k = new LinkedHashSet();
    }
}
