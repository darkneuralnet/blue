package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.C11947r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.bottomsheet.BaseBottomSheet;
import co.bird.android.model.BottomSheetButton;
import co.bird.android.model.NestAddressButton;
import co.bird.android.model.NestFlightSheetButton;
import co.bird.android.model.NestFlightSheetGenericButton;
import co.bird.android.model.RefreshNestButton;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.FlightSheetDetailFormat;
import co.bird.android.model.constant.NestIcon;
import co.bird.android.model.persistence.nestedstructures.FormattedFlightSheetDetail;
import co.bird.android.model.persistence.nestedstructures.NestAllowedVehicleDetails;
import co.bird.android.model.persistence.nestedstructures.NestCapacityRecommendation;
import co.bird.android.model.persistence.nestedstructures.NestImages;
import co.bird.android.model.persistence.nestedstructures.NestStatus;
import co.bird.android.model.persistence.nestedstructures.NestSummary;
import co.bird.android.model.persistence.nestedstructures.NestVehicle;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import org.joda.time.Seconds;
import p000.D33;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 '2\u00020\u0001:\f()\u0019\u001e\"'*+,-./B\u0007¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u001a\u0010\u0014\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u0011J\u0014\u0010\u0018\u001a\u00020\n*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0002R\"\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u00060"}, m28432d2 = {"LD33;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "onDetachedFromRecyclerView", "", "LH6;", "sections", "u", "Lkotlin/Function1;", "Lco/bird/android/model/NestFlightSheetButton;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "x", "Landroid/widget/ImageView;", "Lco/bird/android/model/constant/NestIcon;", "icon", "y", "c", "Lkotlin/jvm/functions/Function1;", "onButtonClick", "Lco/bird/android/bottomsheet/BaseBottomSheet;", "Lco/bird/android/model/BottomSheetButton;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/bottomsheet/BaseBottomSheet;", "bottomSheet", "Lio/reactivex/disposables/b;", "e", "Lio/reactivex/disposables/b;", "disposable", "<init>", "()V", "f", C17296a.f69688o, "b", "g", "h", "i", "j", "k", "l", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n*L\n1#1,463:1\n41#2:464\n180#3:465\n9#4,4:466\n9#4,4:475\n9#4,4:488\n1855#5,2:470\n288#5,2:472\n1360#5:479\n1446#5,5:480\n288#5,2:485\n18#6:474\n18#6:487\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter\n*L\n111#1:464\n111#1:465\n124#1:466,4\n139#1:475,4\n146#1:488,4\n133#1:470,2\n138#1:472,2\n144#1:479\n144#1:480,5\n145#1:485,2\n139#1:474\n146#1:487\n*E\n"})
/* renamed from: D33 */
/* loaded from: classes3.dex */
public final class D33 extends AbstractC52206yS0 {

    /* renamed from: f */
    public static final C1345f f5130f = new C1345f(null);

    /* renamed from: d */
    public BaseBottomSheet<BottomSheetButton> f5132d;

    /* renamed from: c */
    public Function1<? super NestFlightSheetButton, Unit> f5131c = C1360o.f5171g;

    /* renamed from: e */
    public C23464b f5133e = new C23464b();

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LD33$a;", "Lw1;", "", "position", "", "bind", "Lwd2;", "b", "Lwd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LD33;Landroid/view/View;)V", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNestFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$AllowedVehiclesViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,463:1\n18#2:464\n9#3,4:465\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$AllowedVehiclesViewHolder\n*L\n428#1:464\n428#1:465,4\n*E\n"})
    /* renamed from: D33$a */
    /* loaded from: classes3.dex */
    public final class C1339a extends C29735w1 {

        /* renamed from: b */
        public final C51124wd2 f5134b;

        /* renamed from: c */
        public final /* synthetic */ D33 f5135c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1339a(D33 d33, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5135c = d33;
            C51124wd2 m6588a = C51124wd2.m6588a(view);
            Intrinsics.checkNotNullExpressionValue(m6588a, "bind(view)");
            this.f5134b = m6588a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f5135c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof NestAllowedVehicleDetails)) {
                m105816c = null;
            }
            NestAllowedVehicleDetails nestAllowedVehicleDetails = (NestAllowedVehicleDetails) m105816c;
            if (nestAllowedVehicleDetails != null) {
                this.f5134b.getRoot().setText(nestAllowedVehicleDetails.getTitle());
                this.f5134b.getRoot().setCompoundDrawablesRelativeWithIntrinsicBounds(C33341Hk0.m103484a(nestAllowedVehicleDetails.getIcon(), getContext()), (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LD33$b;", "Lw1;", "", "position", "", "bind", "Lxd2;", "b", "Lxd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LD33;Landroid/view/View;)V", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNestFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$BirdleIconViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n18#2:464\n9#3,4:465\n1#4:469\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$BirdleIconViewHolder\n*L\n177#1:464\n177#1:465,4\n*E\n"})
    /* renamed from: D33$b */
    /* loaded from: classes3.dex */
    public final class C1340b extends C29735w1 {

        /* renamed from: b */
        public final C51717xd2 f5136b;

        /* renamed from: c */
        public final /* synthetic */ D33 f5137c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1340b(D33 d33, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5137c = d33;
            C51717xd2 m4922a = C51717xd2.m4922a(view);
            Intrinsics.checkNotNullExpressionValue(m4922a, "bind(view)");
            this.f5136b = m4922a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            BaseBottomSheet baseBottomSheet;
            Object m105816c = this.f5137c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                D33 d33 = this.f5137c;
                int intValue = ((Number) pair.component1()).intValue();
                ImageView root = this.f5136b.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "binding.root");
                d33.m110997y(root, (NestIcon) pair.component2());
                if (intValue % 10 == 0 && (baseBottomSheet = d33.f5132d) != null) {
                    String str = "birdleIcon " + intValue;
                    ImageView root2 = this.f5136b.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root2, "binding.root");
                    baseBottomSheet.m59064n(str, root2);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LD33$c;", "Lw1;", "", "position", "", "bind", "Lyd2;", "b", "Lyd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LD33;Landroid/view/View;)V", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNestFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$ButtonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,463:1\n18#2:464\n9#3,4:465\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$ButtonViewHolder\n*L\n411#1:464\n411#1:465,4\n*E\n"})
    /* renamed from: D33$c */
    /* loaded from: classes3.dex */
    public final class C1341c extends C29735w1 {

        /* renamed from: b */
        public final C52310yd2 f5138b;

        /* renamed from: c */
        public final /* synthetic */ D33 f5139c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nNestFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$ButtonViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,463:1\n1#2:464\n18#3:465\n9#4,4:466\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$ButtonViewHolder$1\n*L\n405#1:465\n405#1:466,4\n*E\n"})
        /* renamed from: D33$c$a */
        /* loaded from: classes3.dex */
        public static final class C1342a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ D33 f5141h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1342a(D33 d33) {
                super(1);
                this.f5141h = d33;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C2637G6 m109397e;
                Integer safePosition = C1341c.this.getSafePosition();
                if (safePosition == null || (m109397e = this.f5141h.m94545o().m109397e(safePosition.intValue())) == null) {
                    return;
                }
                Object m105816c = m109397e.m105816c();
                if (!(m105816c instanceof NestFlightSheetButton)) {
                    m105816c = null;
                }
                NestFlightSheetButton nestFlightSheetButton = (NestFlightSheetButton) m105816c;
                if (nestFlightSheetButton != null) {
                    this.f5141h.f5131c.invoke(nestFlightSheetButton);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1341c(D33 d33, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5139c = d33;
            C52310yd2 m3153a = C52310yd2.m3153a(view);
            Intrinsics.checkNotNullExpressionValue(m3153a, "bind(view)");
            this.f5138b = m3153a;
            Button root = m3153a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C1342a(d33));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f5139c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof NestFlightSheetGenericButton)) {
                m105816c = null;
            }
            NestFlightSheetGenericButton nestFlightSheetGenericButton = (NestFlightSheetGenericButton) m105816c;
            if (nestFlightSheetGenericButton != null) {
                this.f5138b.getRoot().setText(nestFlightSheetGenericButton.getButtonText());
                this.f5138b.getRoot().setTextColor(nestFlightSheetGenericButton.getTextColor());
                this.f5138b.getRoot().setCompoundDrawablesRelativeWithIntrinsicBounds(nestFlightSheetGenericButton.getIcon(), (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LD33$d;", "Lw1;", "", "position", "", "bind", "Lzd2;", "b", "Lzd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LD33;Landroid/view/View;)V", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNestFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$CapacityHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,463:1\n18#2:464\n9#3,4:465\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$CapacityHeaderViewHolder\n*L\n273#1:464\n273#1:465,4\n*E\n"})
    /* renamed from: D33$d */
    /* loaded from: classes3.dex */
    public final class C1343d extends C29735w1 {

        /* renamed from: b */
        public final C52903zd2 f5142b;

        /* renamed from: c */
        public final /* synthetic */ D33 f5143c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1343d(D33 d33, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5143c = d33;
            C52903zd2 m970a = C52903zd2.m970a(view);
            Intrinsics.checkNotNullExpressionValue(m970a, "bind(view)");
            this.f5142b = m970a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView textView = this.f5142b.f121656b;
            Object m105816c = this.f5143c.m94545o().m109397e(i).m105816c();
            String str = null;
            if (!(m105816c instanceof Integer)) {
                m105816c = null;
            }
            Integer num = (Integer) m105816c;
            if (num != null) {
                str = num.toString();
            }
            textView.setText(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LD33$e;", "Lw1;", "", "position", "", "bind", "LAd2;", "b", "LAd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LD33;Landroid/view/View;)V", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNestFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$CapacityViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,463:1\n18#2:464\n9#3,4:465\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$CapacityViewHolder\n*L\n281#1:464\n281#1:465,4\n*E\n"})
    /* renamed from: D33$e */
    /* loaded from: classes3.dex */
    public final class C1344e extends C29735w1 {

        /* renamed from: b */
        public final C31642Ad2 f5144b;

        /* renamed from: c */
        public final /* synthetic */ D33 f5145c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1344e(D33 d33, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5145c = d33;
            C31642Ad2 m115430a = C31642Ad2.m115430a(view);
            Intrinsics.checkNotNullExpressionValue(m115430a, "bind(view)");
            this.f5144b = m115430a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f5145c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof NestCapacityRecommendation)) {
                m105816c = null;
            }
            NestCapacityRecommendation nestCapacityRecommendation = (NestCapacityRecommendation) m105816c;
            if (nestCapacityRecommendation != null) {
                D33 d33 = this.f5145c;
                ImageView imageView = this.f5144b.f880c;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.icon");
                d33.m110997y(imageView, nestCapacityRecommendation.getIcon());
                this.f5144b.f881d.setText(nestCapacityRecommendation.getTitle());
                this.f5144b.f879b.setText(String.valueOf(nestCapacityRecommendation.getQuantity()));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LD33$f;", "", "", "DEFAULT_STATUS_ICON_PADDING_DP", "I", "<init>", "()V", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: D33$f */
    /* loaded from: classes3.dex */
    public static final class C1345f {
        public /* synthetic */ C1345f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1345f() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LD33$g;", "Lw1;", "", "position", "", "bind", "Ldc2;", "b", "Ldc2;", "binding", "Landroid/view/View;", "view", "<init>", "(LD33;Landroid/view/View;)V", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNestFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$DetailViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,463:1\n18#2:464\n9#3,4:465\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$DetailViewHolder\n*L\n304#1:464\n304#1:465,4\n*E\n"})
    /* renamed from: D33$g */
    /* loaded from: classes3.dex */
    public final class C1346g extends C29735w1 {

        /* renamed from: b */
        public final C39850dc2 f5146b;

        /* renamed from: c */
        public final /* synthetic */ D33 f5147c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nNestFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$DetailViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,463:1\n18#2:464\n9#3,4:465\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$DetailViewHolder$1\n*L\n295#1:464\n295#1:465,4\n*E\n"})
        /* renamed from: D33$g$a */
        /* loaded from: classes3.dex */
        public static final class C1347a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ D33 f5148g;

            /* renamed from: h */
            public final /* synthetic */ C1346g f5149h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1347a(D33 d33, C1346g c1346g) {
                super(1);
                this.f5148g = d33;
                this.f5149h = c1346g;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C1737E6 m94545o = this.f5148g.m94545o();
                Integer safePosition = this.f5149h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof FormattedFlightSheetDetail)) {
                        m105816c = null;
                    }
                    FormattedFlightSheetDetail formattedFlightSheetDetail = (FormattedFlightSheetDetail) m105816c;
                    if (formattedFlightSheetDetail != null) {
                        this.f5148g.f5131c.invoke(new NestAddressButton(formattedFlightSheetDetail.getDetail()));
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1346g(D33 d33, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5147c = d33;
            C39850dc2 m44023a = C39850dc2.m44023a(view);
            Intrinsics.checkNotNullExpressionValue(m44023a, "bind(view)");
            this.f5146b = m44023a;
            TextView textView = m44023a.f76875b;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.detail");
            C34585Ms2.m94661j(textView, new C1347a(d33, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            CharSequence detail;
            boolean z;
            Object m105816c = this.f5147c.m94545o().m109397e(i).m105816c();
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
                this.f5146b.f76876c.setText(formattedFlightSheetDetail.getTitle());
                this.f5146b.f76875b.setText(detail);
                TextView textView = this.f5146b.f76875b;
                if (formattedFlightSheetDetail.getFormat() == flightSheetDetailFormat) {
                    z = true;
                } else {
                    z = false;
                }
                textView.setClickable(z);
            }
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"LD33$h;", "Lw1;", "", "position", "", "bind", "LCd2;", "b", "LCd2;", "binding", "LM33;", "c", "LM33;", "adapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", DateTokenConverter.CONVERTER_KEY, "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "Landroid/view/View;", "view", "<init>", "(LD33;Landroid/view/View;)V", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNestFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$ImagesViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,463:1\n18#2:464\n9#3,4:465\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$ImagesViewHolder\n*L\n261#1:464\n261#1:465,4\n*E\n"})
    /* renamed from: D33$h */
    /* loaded from: classes3.dex */
    public final class C1348h extends C29735w1 {

        /* renamed from: b */
        public final C32110Cd2 f5150b;

        /* renamed from: c */
        public final M33 f5151c;

        /* renamed from: d */
        public final LinearLayoutManager f5152d;

        /* renamed from: e */
        public final /* synthetic */ D33 f5153e;

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"D33$h$a", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: D33$h$a */
        /* loaded from: classes3.dex */
        public static final class C1349a extends RecyclerView.AbstractC11863t {
            public C1349a() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    ImageView imageView = C1348h.this.f5150b.f4408b;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.leftArrow");
                    C49520tu6.m11232s(imageView, C1348h.this.f5150b.f4409c.canScrollHorizontally(-1), 4);
                    ImageView imageView2 = C1348h.this.f5150b.f4410d;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "binding.rightArrow");
                    C49520tu6.m11232s(imageView2, C1348h.this.f5150b.f4409c.canScrollHorizontally(1), 4);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: D33$h$b */
        /* loaded from: classes3.dex */
        public static final class C1350b extends Lambda implements Function1<View, Unit> {
            public C1350b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C1348h.this.f5150b.f4409c.smoothScrollToPosition(C1348h.this.f5152d.m66711n2() - 1);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: D33$h$c */
        /* loaded from: classes3.dex */
        public static final class C1351c extends Lambda implements Function1<View, Unit> {
            public C1351c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C1348h.this.f5150b.f4409c.smoothScrollToPosition(C1348h.this.f5152d.m66711n2() + 1);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1348h(D33 d33, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5153e = d33;
            C32110Cd2 m111962a = C32110Cd2.m111962a(view);
            Intrinsics.checkNotNullExpressionValue(m111962a, "bind(view)");
            this.f5150b = m111962a;
            M33 m33 = new M33();
            this.f5151c = m33;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.itemView.getContext(), 0, false);
            this.f5152d = linearLayoutManager;
            m111962a.f4409c.setLayoutManager(linearLayoutManager);
            m111962a.f4409c.setAdapter(m33);
            m111962a.f4409c.setItemAnimator(new C11894g());
            new C11947r().m66132b(m111962a.f4409c);
            m111962a.f4409c.addOnScrollListener(new C1349a());
            ImageView imageView = m111962a.f4408b;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.leftArrow");
            C34585Ms2.m94661j(imageView, new C1350b());
            ImageView imageView2 = m111962a.f4410d;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.rightArrow");
            C34585Ms2.m94661j(imageView2, new C1351c());
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f5153e.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof NestImages)) {
                m105816c = null;
            }
            NestImages nestImages = (NestImages) m105816c;
            if (nestImages != null) {
                this.f5151c.m95893o(nestImages.getImageUrls());
                ImageView imageView = this.f5150b.f4410d;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.rightArrow");
                boolean z = true;
                if (nestImages.getImageUrls().size() <= 1) {
                    z = false;
                }
                C49520tu6.m11232s(imageView, z, 4);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LD33$i;", "Lw1;", "", "position", "", "bind", "LDd2;", "b", "LDd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LD33;Landroid/view/View;)V", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNestFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$StatusViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,463:1\n18#2:464\n9#3,4:465\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$StatusViewHolder\n*L\n191#1:464\n191#1:465,4\n*E\n"})
    /* renamed from: D33$i */
    /* loaded from: classes3.dex */
    public final class C1352i extends C29735w1 {

        /* renamed from: b */
        public final C32344Dd2 f5157b;

        /* renamed from: c */
        public final /* synthetic */ D33 f5158c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1352i(D33 d33, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5158c = d33;
            C32344Dd2 m110078a = C32344Dd2.m110078a(view);
            Intrinsics.checkNotNullExpressionValue(m110078a, "bind(view)");
            this.f5157b = m110078a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f5158c.m94545o().m109397e(i).m105816c();
            Drawable drawable = null;
            if (!(m105816c instanceof NestStatus)) {
                m105816c = null;
            }
            NestStatus nestStatus = (NestStatus) m105816c;
            if (nestStatus != null) {
                D33 d33 = this.f5158c;
                int i2 = 0;
                if (nestStatus.getClaimExpiresAt() != null) {
                    this.f5157b.f6105c.setImageDrawable(NA0.m94299e(this.itemView.getContext(), C48193rg4.ic_filled_clock));
                    this.f5157b.f6105c.setBackgroundTintList(ColorStateList.valueOf(0));
                    this.f5157b.f6105c.setPaddingRelative(0, 0, 0, 0);
                } else {
                    ImageView imageView = this.f5157b.f6105c;
                    NestIcon nestIcon = nestStatus.getNestIcon();
                    if (nestIcon != null) {
                        Context context = this.itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                        drawable = S33.m86052a(nestIcon, context);
                    }
                    imageView.setImageDrawable(drawable);
                    ImageView imageView2 = this.f5157b.f6105c;
                    ThemedColors iconBackgroundColor = nestStatus.getIconBackgroundColor();
                    if (iconBackgroundColor != null) {
                        i2 = iconBackgroundColor.getLightMode();
                    }
                    imageView2.setBackgroundTintList(ColorStateList.valueOf(i2));
                    int m12001b = (int) C49347td3.m12001b(4);
                    this.f5157b.f6105c.setPaddingRelative(m12001b, m12001b, m12001b, m12001b);
                }
                this.f5157b.f6106d.setText(nestStatus.getTitle());
                this.f5157b.f6104b.setText(nestStatus.getDetails());
                BaseBottomSheet baseBottomSheet = d33.f5132d;
                if (baseBottomSheet != null) {
                    ConstraintLayout root = this.f5157b.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "binding.root");
                    baseBottomSheet.m59064n("status", root);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LD33$j;", "Lw1;", "", "position", "", "bind", "LEd2;", "b", "LEd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LD33;Landroid/view/View;)V", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNestFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$SummaryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,463:1\n18#2:464\n9#3,4:465\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$SummaryViewHolder\n*L\n164#1:464\n164#1:465,4\n*E\n"})
    /* renamed from: D33$j */
    /* loaded from: classes3.dex */
    public final class C1353j extends C29735w1 {

        /* renamed from: b */
        public final C32578Ed2 f5159b;

        /* renamed from: c */
        public final /* synthetic */ D33 f5160c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1353j(D33 d33, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5160c = d33;
            C32578Ed2 m108637a = C32578Ed2.m108637a(view);
            Intrinsics.checkNotNullExpressionValue(m108637a, "bind(view)");
            this.f5159b = m108637a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f5160c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof NestSummary)) {
                m105816c = null;
            }
            NestSummary nestSummary = (NestSummary) m105816c;
            if (nestSummary != null) {
                D33 d33 = this.f5160c;
                this.f5159b.f7891d.setText(nestSummary.getTitle());
                this.f5159b.f7889b.setText(String.valueOf(nestSummary.getCapacity()));
                BaseBottomSheet baseBottomSheet = d33.f5132d;
                if (baseBottomSheet != null) {
                    ConstraintLayout root = this.f5159b.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "binding.root");
                    baseBottomSheet.m59064n("summary", root);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"LD33$k;", "Lw1;", "", "position", "", "bind", "Lorg/joda/time/DateTime;", "updatedAt", "i", "LGd2;", "b", "LGd2;", "binding", "Lio/reactivex/disposables/c;", "c", "Lio/reactivex/disposables/c;", "disposable", "Landroid/view/View;", "view", "<init>", "(LD33;Landroid/view/View;)V", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNestFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$VehicleHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 5 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,463:1\n18#2:464\n9#3,4:465\n41#4:469\n180#5:470\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$VehicleHeaderViewHolder\n*L\n333#1:464\n333#1:465,4\n340#1:469\n340#1:470\n*E\n"})
    /* renamed from: D33$k */
    /* loaded from: classes3.dex */
    public final class C1354k extends C29735w1 {

        /* renamed from: b */
        public final C33046Gd2 f5161b;

        /* renamed from: c */
        public InterfaceC23465c f5162c;

        /* renamed from: d */
        public final /* synthetic */ D33 f5163d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nNestFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$VehicleHeaderViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n18#2:464\n9#3,4:465\n1#4:469\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$VehicleHeaderViewHolder$1\n*L\n327#1:464\n327#1:465,4\n*E\n"})
        /* renamed from: D33$k$a */
        /* loaded from: classes3.dex */
        public static final class C1355a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ D33 f5164g;

            /* renamed from: h */
            public final /* synthetic */ C1354k f5165h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1355a(D33 d33, C1354k c1354k) {
                super(1);
                this.f5164g = d33;
                this.f5165h = c1354k;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C1737E6 m94545o = this.f5164g.m94545o();
                Integer safePosition = this.f5165h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof RefreshNestButton)) {
                        m105816c = null;
                    }
                    RefreshNestButton refreshNestButton = (RefreshNestButton) m105816c;
                    if (refreshNestButton != null) {
                        this.f5164g.f5131c.invoke(refreshNestButton);
                    }
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: D33$k$b */
        /* loaded from: classes3.dex */
        public static final class C1356b extends Lambda implements Function1<Long, Unit> {

            /* renamed from: h */
            public final /* synthetic */ RefreshNestButton f5167h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1356b(RefreshNestButton refreshNestButton) {
                super(1);
                this.f5167h = refreshNestButton;
            }

            /* renamed from: a */
            public final void m110990a(Long l) {
                C1354k.this.m110991i(this.f5167h.getUpdatedAt());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                m110990a(l);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1354k(D33 d33, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5163d = d33;
            C33046Gd2 m104945a = C33046Gd2.m104945a(view);
            Intrinsics.checkNotNullExpressionValue(m104945a, "bind(view)");
            this.f5161b = m104945a;
            ImageView imageView = m104945a.f12182c;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.icon");
            C34585Ms2.m94661j(imageView, new C1355a(d33, this));
        }

        /* renamed from: e */
        public static final void m110992e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f5163d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof RefreshNestButton)) {
                m105816c = null;
            }
            RefreshNestButton refreshNestButton = (RefreshNestButton) m105816c;
            if (refreshNestButton != null) {
                D33 d33 = this.f5163d;
                this.f5161b.f12183d.setText(refreshNestButton.getTitle());
                m110991i(refreshNestButton.getUpdatedAt());
                InterfaceC23465c interfaceC23465c = this.f5162c;
                if (interfaceC23465c != null) {
                    interfaceC23465c.dispose();
                }
                Observable<Long> observeOn = Observable.interval(1L, TimeUnit.SECONDS).observeOn(C23454a.m33087a());
                Intrinsics.checkNotNullExpressionValue(observeOn, "interval(1L, TimeUnit.SE…dSchedulers.mainThread())");
                BaseBottomSheet baseBottomSheet = d33.f5132d;
                if (baseBottomSheet != null) {
                    ScopeProvider m45202a = ViewScopeProvider.m45202a(baseBottomSheet);
                    Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
                    if (m45202a != null) {
                        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m45202a));
                        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
                        final Function1 c1356b = new C1356b(refreshNestButton);
                        this.f5162c = ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: E33
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj) {
                                D33.C1354k.m110992e(Function1.this, obj);
                            }
                        });
                    }
                }
            }
        }

        /* renamed from: i */
        public final void m110991i(DateTime dateTime) {
            TextView textView = this.f5161b.f12181b;
            Context context = this.itemView.getContext();
            int i = C45871nl4.updated_time_format;
            Context context2 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "itemView.context");
            textView.setText(context.getString(i, C46880pT0.m19259c(dateTime, context2, false)));
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m28432d2 = {"LD33$l;", "Lw1;", "", "position", "", "bind", C17296a.f69688o, "LFd2;", "b", "LFd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LD33;Landroid/view/View;)V", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNestFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$VehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n18#2:464\n18#2:470\n9#3,4:465\n9#3,4:471\n1#4:469\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$VehicleViewHolder\n*L\n360#1:464\n377#1:470\n360#1:465,4\n377#1:471,4\n*E\n"})
    /* renamed from: D33$l */
    /* loaded from: classes3.dex */
    public final class C1357l extends C29735w1 {

        /* renamed from: b */
        public final C32812Fd2 f5168b;

        /* renamed from: c */
        public final /* synthetic */ D33 f5169c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1357l(D33 d33, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5169c = d33;
            C32812Fd2 m106851a = C32812Fd2.m106851a(view);
            Intrinsics.checkNotNullExpressionValue(m106851a, "bind(view)");
            this.f5168b = m106851a;
        }

        /* renamed from: a */
        public final void m110989a() {
            C2637G6 m109397e;
            boolean z;
            Integer num;
            int coerceAtLeast;
            int coerceAtLeast2;
            Integer safePosition = getSafePosition();
            if (safePosition != null && (m109397e = this.f5169c.m94545o().m109397e(safePosition.intValue())) != null) {
                Object m105816c = m109397e.m105816c();
                if (!(m105816c instanceof NestVehicle)) {
                    m105816c = null;
                }
                NestVehicle nestVehicle = (NestVehicle) m105816c;
                if (nestVehicle != null) {
                    Group group = this.f5168b.f9836f;
                    Intrinsics.checkNotNullExpressionValue(group, "binding.expirationGroup");
                    if (nestVehicle.getExpiresAt() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C49520tu6.show$default(group, z, 0, 2, null);
                    if (nestVehicle.getExpiresAt() != null) {
                        Seconds secondsBetween = Seconds.secondsBetween(DateTime.now(), nestVehicle.getExpiresAt());
                        Minutes standardMinutes = secondsBetween.toStandardMinutes();
                        StringBuilder sb = new StringBuilder();
                        int i = "";
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
                            i = 0;
                        }
                        sb.append(i);
                        coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(secondsBetween.getSeconds() % 60, 0);
                        sb.append(coerceAtLeast2);
                        String sb2 = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
                        this.f5168b.f9835e.setText(sb2);
                    }
                }
            }
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f5169c.m94545o().m109397e(i).m105816c();
            Drawable drawable = null;
            if (!(m105816c instanceof NestVehicle)) {
                m105816c = null;
            }
            NestVehicle nestVehicle = (NestVehicle) m105816c;
            if (nestVehicle != null) {
                ImageView imageView = this.f5168b.f9839i;
                ClientIcon statusIcon = nestVehicle.getStatusIcon();
                if (statusIcon != null) {
                    Context context = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                    drawable = C33341Hk0.m103484a(statusIcon, context);
                }
                imageView.setImageDrawable(drawable);
                this.f5168b.f9839i.setBackgroundTintList(ColorStateList.valueOf(nestVehicle.getStatusBackgroundColor().getLightMode()));
                this.f5168b.f9834d.setText(nestVehicle.getTitle());
                this.f5168b.f9833c.setText(this.itemView.getContext().getString(C45871nl4.battery_percent, Integer.valueOf(nestVehicle.getBattery())));
                this.f5168b.f9832b.setBatteryLevel(nestVehicle.getBattery() / 100.0f);
                m110989a();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D33$m */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C1358m {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NestIcon.values().length];
            try {
                iArr[NestIcon.BIRD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NestIcon.REBALANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNestFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$onAttachedToRecyclerView$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,463:1\n1549#2:464\n1620#2,3:465\n1549#2:468\n1620#2,3:469\n800#2,11:472\n1855#2,2:483\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$onAttachedToRecyclerView$1\n*L\n113#1:464\n113#1:465,3\n114#1:468\n114#1:469,3\n115#1:472,11\n116#1:483,2\n*E\n"})
    /* renamed from: D33$n */
    /* loaded from: classes3.dex */
    public static final class C1359n extends Lambda implements Function1<Long, Unit> {

        /* renamed from: g */
        public final /* synthetic */ RecyclerView f5170g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1359n(RecyclerView recyclerView) {
            super(1);
            this.f5170g = recyclerView;
        }

        /* renamed from: a */
        public final void m110988a(Long l) {
            IntRange until;
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            until = RangesKt___RangesKt.until(0, this.f5170g.getChildCount());
            RecyclerView recyclerView = this.f5170g;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
            ArrayList<View> arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                arrayList.add(recyclerView.getChildAt(((IntIterator) it).nextInt()));
            }
            RecyclerView recyclerView2 = this.f5170g;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (View view : arrayList) {
                arrayList2.add(recyclerView2.getChildViewHolder(view));
            }
            ArrayList<C1357l> arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof C1357l) {
                    arrayList3.add(obj);
                }
            }
            for (C1357l c1357l : arrayList3) {
                c1357l.m110989a();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m110988a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/NestFlightSheetButton;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/NestFlightSheetButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: D33$o */
    /* loaded from: classes3.dex */
    public static final class C1360o extends Lambda implements Function1<NestFlightSheetButton, Unit> {

        /* renamed from: g */
        public static final C1360o f5171g = new C1360o();

        public C1360o() {
            super(1);
        }

        /* renamed from: a */
        public final void m110987a(NestFlightSheetButton it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NestFlightSheetButton nestFlightSheetButton) {
            m110987a(nestFlightSheetButton);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: w */
    public static final void m110999w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (this.f5133e.mo1769e()) {
            this.f5133e = new C23464b();
        }
        Observable<Long> observeOn = Observable.interval(1L, TimeUnit.SECONDS).subscribeOn(C24542a.m31932c()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "interval(1, TimeUnit.SEC…dSchedulers.mainThread())");
        ScopeProvider m45202a = ViewScopeProvider.m45202a(recyclerView);
        Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m45202a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final Function1 c1359n = new C1359n(recyclerView);
        InterfaceC23465c subscribe = ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: C33
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D33.m110999w(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "recyclerView: RecyclerVi…efreshExpiration)\n      }");
        C37279Yf5.m74523y(subscribe, this.f5133e);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new N33());
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
        this.f5132d = baseBottomSheet;
        if (baseBottomSheet != null) {
            BaseBottomSheet.clearPeekViews$default(baseBottomSheet, false, 1, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        IntRange until;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f5133e.dispose();
        until = RangesKt___RangesKt.until(0, recyclerView.getItemDecorationCount());
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            recyclerView.removeItemDecorationAt(((IntIterator) it).nextInt());
        }
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
    /* JADX WARN: Removed duplicated region for block: B:50:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
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
            boolean r3 = r3 instanceof co.bird.android.model.persistence.nestedstructures.NestSummary
            if (r3 == 0) goto L13
            goto L2b
        L2a:
            r1 = r2
        L2b:
            G6 r1 = (p000.C2637G6) r1
            if (r1 == 0) goto L42
            java.lang.Object r0 = r1.m105816c()
            boolean r1 = r0 instanceof co.bird.android.model.persistence.nestedstructures.NestSummary
            if (r1 == 0) goto L38
            goto L39
        L38:
            r0 = r2
        L39:
            co.bird.android.model.persistence.nestedstructures.NestSummary r0 = (co.bird.android.model.persistence.nestedstructures.NestSummary) r0
            if (r0 == 0) goto L42
            java.lang.String r0 = r0.getTitle()
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
            boolean r3 = r3 instanceof co.bird.android.model.persistence.nestedstructures.NestSummary
            if (r3 == 0) goto L6b
            goto L82
        L81:
            r1 = r2
        L82:
            G6 r1 = (p000.C2637G6) r1
            if (r1 == 0) goto L99
            java.lang.Object r5 = r1.m105816c()
            boolean r1 = r5 instanceof co.bird.android.model.persistence.nestedstructures.NestSummary
            if (r1 == 0) goto L8f
            goto L90
        L8f:
            r5 = r2
        L90:
            co.bird.android.model.persistence.nestedstructures.NestSummary r5 = (co.bird.android.model.persistence.nestedstructures.NestSummary) r5
            if (r5 == 0) goto L99
            java.lang.String r5 = r5.getTitle()
            goto L9a
        L99:
            r5 = r2
        L9a:
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r5)
            if (r5 != 0) goto La9
            co.bird.android.bottomsheet.BaseBottomSheet<co.bird.android.model.BottomSheetButton> r5 = r4.f5132d
            if (r5 == 0) goto La9
            r0 = 0
            r1 = 1
            co.bird.android.bottomsheet.BaseBottomSheet.clearPeekViews$default(r5, r0, r1, r2)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.D33.mo24871u(java.util.Collection):void");
    }

    /* renamed from: x */
    public final void m110998x(Function1<? super NestFlightSheetButton, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f5131c = listener;
    }

    /* renamed from: y */
    public final void m110997y(ImageView imageView, NestIcon nestIcon) {
        ColorStateList colorStateList;
        Drawable drawable;
        int i;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        imageView.setImageDrawable(S33.m86052a(nestIcon, context));
        GradientDrawable gradientDrawable = null;
        if (nestIcon == NestIcon.REBALANCE) {
            colorStateList = ColorStateList.valueOf(-1);
        } else {
            colorStateList = null;
        }
        imageView.setImageTintList(colorStateList);
        Drawable background = imageView.getBackground();
        if (background != null) {
            drawable = background.mutate();
        } else {
            drawable = null;
        }
        if (drawable instanceof GradientDrawable) {
            gradientDrawable = (GradientDrawable) drawable;
        }
        if (gradientDrawable != null) {
            Context context2 = imageView.getContext();
            int i2 = C1358m.$EnumSwitchMapping$0[nestIcon.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    i = C32364Df4.baseBG;
                } else {
                    i = C32364Df4.birdNewRoad;
                }
            } else {
                i = C32364Df4.birdLightGray;
            }
            gradientDrawable.setColor(NA0.m94301c(context2, i));
        }
        imageView.setBackground(gradientDrawable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        if (i == C48223rj4.item_nest_flight_sheet_summary) {
            return new C1353j(this, m41761u);
        }
        if (i == C48223rj4.item_nest_flight_sheet_birdle_icon) {
            return new C1340b(this, m41761u);
        }
        if (i == C48223rj4.item_nest_flight_sheet_status) {
            return new C1352i(this, m41761u);
        }
        if (i == C48223rj4.item_nest_flight_sheet_images) {
            return new C1348h(this, m41761u);
        }
        if (i == C48223rj4.item_nest_flight_sheet_capacity_header) {
            return new C1343d(this, m41761u);
        }
        if (i == C48223rj4.item_nest_flight_sheet_capacity_recommendation) {
            return new C1344e(this, m41761u);
        }
        return i == C38728bk4.item_formatted_flight_sheet_detail_short || i == C38728bk4.item_formatted_flight_sheet_detail_long ? new C1346g(this, m41761u) : i == C48223rj4.item_nest_flight_sheet_vehicle_header ? new C1354k(this, m41761u) : i == C48223rj4.item_nest_flight_sheet_vehicle ? new C1357l(this, m41761u) : i == C48223rj4.item_nest_flight_sheet_button ? new C1341c(this, m41761u) : i == C48223rj4.item_nest_flight_sheet_allowed_vehicles ? new C1339a(this, m41761u) : new C29735w1(m41761u);
    }
}
