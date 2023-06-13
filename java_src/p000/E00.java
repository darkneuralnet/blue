package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.bottomsheet.BaseBottomSheet;
import co.bird.android.model.BottomSheetButton;
import co.bird.android.model.BountyFlightSheetButton;
import co.bird.android.model.CopyTextButton;
import co.bird.android.model.DirectionsButton;
import co.bird.android.model.ExternalLinkButton;
import co.bird.android.model.Point;
import co.bird.android.model.RefreshSurplusStateButton;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.persistence.BountyFlightSheetDetails;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetAction;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetSectionText;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetSectionVehicleList;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetVehicle;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.widget.BatteryViewV2;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0006()\u0016\u0019\u001b\u001fB\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bJ\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0016\u0010\u0014\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006*"}, m28432d2 = {"LE00;", "LUl0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lkotlin/Function1;", "Lco/bird/android/model/BountyFlightSheetButton;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "x", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "onDetachedFromRecyclerView", "", "LH6;", "sections", "u", "Landroidx/recyclerview/widget/RecyclerView$o;", "c", "Landroidx/recyclerview/widget/RecyclerView$o;", "itemDecoration", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function1;", "e", "Landroidx/recyclerview/widget/RecyclerView;", "Lco/bird/android/bottomsheet/BaseBottomSheet;", "Lco/bird/android/model/BottomSheetButton;", "f", "Lco/bird/android/bottomsheet/BaseBottomSheet;", "w", "()Lco/bird/android/bottomsheet/BaseBottomSheet;", "setBottomSheet", "(Lco/bird/android/bottomsheet/BaseBottomSheet;)V", "bottomSheet", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$o;)V", C17296a.f69688o, "b", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBountyFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n*L\n1#1,265:1\n9#2,4:266\n9#2,4:275\n9#2,4:282\n1855#3,2:270\n288#3,2:272\n288#3,2:279\n18#4:274\n18#4:281\n*S KotlinDebug\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter\n*L\n73#1:266,4\n91#1:275,4\n98#1:282,4\n85#1:270,2\n90#1:272,2\n97#1:279,2\n91#1:274\n98#1:281\n*E\n"})
/* renamed from: E00 */
/* loaded from: classes3.dex */
public final class E00 extends AbstractC36392Ul0 {

    /* renamed from: c */
    public final RecyclerView.AbstractC11854o f6812c;

    /* renamed from: d */
    public Function1<? super BountyFlightSheetButton, Unit> f6813d;

    /* renamed from: e */
    public RecyclerView f6814e;

    /* renamed from: f */
    public BaseBottomSheet<BottomSheetButton> f6815f;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LE00$a;", "Lw1;", "", "position", "", "bind", "Lab2;", "b", "Lab2;", "binding", "Landroid/view/View;", "view", "<init>", "(LE00;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBountyFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,265:1\n18#2:266\n9#3,4:267\n*S KotlinDebug\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyHeaderViewHolder\n*L\n110#1:266\n110#1:267,4\n*E\n"})
    /* renamed from: E00$a */
    /* loaded from: classes3.dex */
    public final class C1695a extends C29735w1 {

        /* renamed from: b */
        public final C38043ab2 f6816b;

        /* renamed from: c */
        public final /* synthetic */ E00 f6817c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1695a(E00 e00, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f6817c = e00;
            C38043ab2 m71174a = C38043ab2.m71174a(view);
            Intrinsics.checkNotNullExpressionValue(m71174a, "bind(view)");
            this.f6816b = m71174a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f6817c.m94545o().m109397e(i).m105816c();
            Unit unit = null;
            if (!(m105816c instanceof BountyFlightSheetDetails)) {
                m105816c = null;
            }
            BountyFlightSheetDetails bountyFlightSheetDetails = (BountyFlightSheetDetails) m105816c;
            if (bountyFlightSheetDetails != null) {
                E00 e00 = this.f6817c;
                ImageView imageView = this.f6816b.f50666b;
                ClientIcon fleetIcon = bountyFlightSheetDetails.getHeader().getMarker().getFleetIcon();
                Context context = imageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                imageView.setImageDrawable(C33341Hk0.m103484a(fleetIcon, context));
                imageView.setImageTintList(ColorStateList.valueOf(bountyFlightSheetDetails.getHeader().getMarker().getIconColor().getLightMode()));
                imageView.setBackgroundTintList(ColorStateList.valueOf(bountyFlightSheetDetails.getHeader().getMarker().getBackgroundPinColor().getLightMode()));
                this.f6816b.f50668d.setText(bountyFlightSheetDetails.getHeader().getTitle());
                String subtitle = bountyFlightSheetDetails.getHeader().getSubtitle();
                if (subtitle != null) {
                    this.f6816b.f50667c.setText(subtitle);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    TextView textView = this.f6816b.f50667c;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.subtitle");
                    C49520tu6.m11239l(textView);
                }
                BaseBottomSheet<BottomSheetButton> m109504w = e00.m109504w();
                if (m109504w != null) {
                    View itemView = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    m109504w.m59064n("header", itemView);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LE00$b;", "Lw1;", "", "position", "", "bind", "Lcb2;", "b", "Lcb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LE00;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBountyFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyPhotoHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,265:1\n18#2:266\n9#3,4:267\n*S KotlinDebug\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyPhotoHeaderViewHolder\n*L\n247#1:266\n247#1:267,4\n*E\n"})
    /* renamed from: E00$b */
    /* loaded from: classes3.dex */
    public final class C1696b extends C29735w1 {

        /* renamed from: b */
        public final C39229cb2 f6818b;

        /* renamed from: c */
        public final /* synthetic */ E00 f6819c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1696b(E00 e00, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f6819c = e00;
            C39229cb2 m61188a = C39229cb2.m61188a(view);
            Intrinsics.checkNotNullExpressionValue(m61188a, "bind(view)");
            this.f6818b = m61188a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f6819c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            String str = (String) m105816c;
            if (str != null) {
                this.f6818b.getRoot().setText(str);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LE00$c;", "Lw1;", "", "position", "", "bind", "Lbb2;", "b", "Lbb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LE00;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBountyFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyPhotoViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,265:1\n18#2:266\n9#3,4:267\n*S KotlinDebug\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyPhotoViewHolder\n*L\n257#1:266\n257#1:267,4\n*E\n"})
    /* renamed from: E00$c */
    /* loaded from: classes3.dex */
    public final class C1697c extends C29735w1 {

        /* renamed from: b */
        public final C38636bb2 f6820b;

        /* renamed from: c */
        public final /* synthetic */ E00 f6821c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1697c(E00 e00, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f6821c = e00;
            C38636bb2 m64295a = C38636bb2.m64295a(view);
            Intrinsics.checkNotNullExpressionValue(m64295a, "bind(view)");
            this.f6820b = m64295a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f6821c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            String str = (String) m105816c;
            if (str != null) {
                ComponentCallbacks2C17096a.m53137u(this.f6820b.getRoot()).m81653k(str).m16096R0(this.f6820b.f57744b);
            }
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"LE00$d;", "Lw1;", "", "position", "", "bind", "Ldb2;", "b", "Ldb2;", "binding", "Lco/bird/android/model/Point;", "c", "Lco/bird/android/model/Point;", "point", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "url", "Landroid/view/View;", "view", "<init>", "(LE00;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBountyFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyTextViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,265:1\n18#2:266\n9#3,4:267\n*S KotlinDebug\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyTextViewHolder\n*L\n154#1:266\n154#1:267,4\n*E\n"})
    /* renamed from: E00$d */
    /* loaded from: classes3.dex */
    public final class C1698d extends C29735w1 {

        /* renamed from: b */
        public final C39840db2 f6822b;

        /* renamed from: c */
        public Point f6823c;

        /* renamed from: d */
        public String f6824d;

        /* renamed from: e */
        public final /* synthetic */ E00 f6825e;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: E00$d$a */
        /* loaded from: classes3.dex */
        public static final class C1699a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ E00 f6827h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1699a(E00 e00) {
                super(1);
                this.f6827h = e00;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Point point = C1698d.this.f6823c;
                if (point != null) {
                    this.f6827h.f6813d.invoke(new DirectionsButton(point));
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/view/View;", "it", "", C17296a.f69688o, "(Landroid/view/View;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBountyFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyTextViewHolder$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,265:1\n1#2:266\n18#3:267\n9#4,4:268\n*S KotlinDebug\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyTextViewHolder$2\n*L\n140#1:267\n140#1:268,4\n*E\n"})
        /* renamed from: E00$d$b */
        /* loaded from: classes3.dex */
        public static final class C1700b extends Lambda implements Function1<View, Boolean> {

            /* renamed from: h */
            public final /* synthetic */ E00 f6829h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1700b(E00 e00) {
                super(1);
                this.f6829h = e00;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(View view) {
                boolean z;
                C2637G6 m109397e;
                Integer safePosition = C1698d.this.getSafePosition();
                if (safePosition != null && (m109397e = this.f6829h.m94545o().m109397e(safePosition.intValue())) != null) {
                    Object m105816c = m109397e.m105816c();
                    String str = null;
                    if (!(m105816c instanceof BountyFlightSheetSectionText)) {
                        m105816c = null;
                    }
                    BountyFlightSheetSectionText bountyFlightSheetSectionText = (BountyFlightSheetSectionText) m105816c;
                    if (bountyFlightSheetSectionText != null) {
                        if (bountyFlightSheetSectionText.getAutoDetectLinks()) {
                            str = bountyFlightSheetSectionText.getBody();
                        }
                        if (str != null) {
                            this.f6829h.f6813d.invoke(new CopyTextButton(str));
                            Unit unit = Unit.INSTANCE;
                            z = true;
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nBountyFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyTextViewHolder$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n1#2:266\n*E\n"})
        /* renamed from: E00$d$c */
        /* loaded from: classes3.dex */
        public static final class C1701c extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ E00 f6831h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1701c(E00 e00) {
                super(1);
                this.f6831h = e00;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                String str = C1698d.this.f6824d;
                if (str != null) {
                    this.f6831h.f6813d.invoke(new ExternalLinkButton(str));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1698d(E00 e00, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f6825e = e00;
            C39840db2 m44073a = C39840db2.m44073a(view);
            Intrinsics.checkNotNullExpressionValue(m44073a, "bind(view)");
            this.f6822b = m44073a;
            ImageView imageView = m44073a.f76823c;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.directions");
            C34585Ms2.m94661j(imageView, new C1699a(e00));
            ConstraintLayout root = m44073a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94653r(root, new C1700b(e00));
            TextView textView = m44073a.f76822b;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.body");
            C34585Ms2.m94661j(textView, new C1701c(e00));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            BountyFlightSheetAction.Navigate navigate;
            Point point;
            CharSequence body;
            Object m105816c = this.f6825e.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof BountyFlightSheetSectionText)) {
                m105816c = null;
            }
            BountyFlightSheetSectionText bountyFlightSheetSectionText = (BountyFlightSheetSectionText) m105816c;
            if (bountyFlightSheetSectionText != null) {
                E00 e00 = this.f6825e;
                BountyFlightSheetAction action = bountyFlightSheetSectionText.getAction();
                if (action instanceof BountyFlightSheetAction.Navigate) {
                    navigate = (BountyFlightSheetAction.Navigate) action;
                } else {
                    navigate = null;
                }
                if (navigate != null) {
                    point = navigate.getNavigationLocation();
                } else {
                    point = null;
                }
                this.f6823c = point;
                this.f6824d = null;
                TextView textView = this.f6822b.f76824d;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.title");
                C49520tu6.setTextAndVisibility$default(textView, bountyFlightSheetSectionText.getTitle(), 0, 2, null);
                if (bountyFlightSheetSectionText.getAutoDetectLinks() && bountyFlightSheetSectionText.getBody() != null) {
                    Pattern pattern = ZK3.f48252c;
                    String body2 = bountyFlightSheetSectionText.getBody();
                    if (body2 == null) {
                        body2 = "";
                    }
                    Matcher matcher = pattern.matcher(body2);
                    if (matcher.find()) {
                        this.f6824d = matcher.group(0);
                        String body3 = bountyFlightSheetSectionText.getBody();
                        if (body3 != null) {
                            body = C45097mS5.m25592n(body3, this.f6824d, new URLSpan(this.f6824d));
                        } else {
                            body = null;
                        }
                    } else {
                        body = bountyFlightSheetSectionText.getBody();
                    }
                } else {
                    body = bountyFlightSheetSectionText.getBody();
                }
                TextView textView2 = this.f6822b.f76822b;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.body");
                C49520tu6.setTextAndVisibility$default(textView2, body, 0, 2, null);
                ImageView imageView = this.f6822b.f76823c;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.directions");
                C49520tu6.show$default(imageView, bountyFlightSheetSectionText.getAction() instanceof BountyFlightSheetAction.Navigate, 0, 2, null);
                if (i == 1) {
                    BaseBottomSheet<BottomSheetButton> m109504w = e00.m109504w();
                    if (m109504w != null) {
                        View itemView = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                        m109504w.m59064n("status", itemView);
                    }
                    BaseBottomSheet<BottomSheetButton> m109504w2 = e00.m109504w();
                    if (m109504w2 != null) {
                        m109504w2.m59065m((int) C49347td3.m12001b(16));
                    }
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LE00$e;", "Lw1;", "", "position", "", "bind", "Leg2;", "b", "Leg2;", "binding", "Landroid/view/View;", "view", "<init>", "(LE00;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBountyFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyVehicleInvolvedViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,265:1\n18#2:266\n9#3,4:267\n*S KotlinDebug\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyVehicleInvolvedViewHolder\n*L\n221#1:266\n221#1:267,4\n*E\n"})
    /* renamed from: E00$e */
    /* loaded from: classes3.dex */
    public final class C1702e extends C29735w1 {

        /* renamed from: b */
        public final C40482eg2 f6832b;

        /* renamed from: c */
        public final /* synthetic */ E00 f6833c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1702e(E00 e00, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f6833c = e00;
            C40482eg2 m42635a = C40482eg2.m42635a(view);
            Intrinsics.checkNotNullExpressionValue(m42635a, "bind(view)");
            this.f6832b = m42635a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Integer battery;
            Object m105816c = this.f6833c.m94545o().m109397e(i).m105816c();
            Unit unit = null;
            if (!(m105816c instanceof BountyFlightSheetVehicle)) {
                m105816c = null;
            }
            BountyFlightSheetVehicle bountyFlightSheetVehicle = (BountyFlightSheetVehicle) m105816c;
            if (bountyFlightSheetVehicle != null) {
                this.f6832b.f78680d.setText(bountyFlightSheetVehicle.getCode());
                if (bountyFlightSheetVehicle.getBattery() != null) {
                    this.f6832b.f78678b.setBatteryLevel(battery.intValue() / 100.0f);
                    this.f6832b.f78679c.setText(this.itemView.getContext().getString(C45871nl4.battery_percent, bountyFlightSheetVehicle.getBattery()));
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    BatteryViewV2 batteryViewV2 = this.f6832b.f78678b;
                    Intrinsics.checkNotNullExpressionValue(batteryViewV2, "binding.battery");
                    C49520tu6.m11239l(batteryViewV2);
                }
                ImageView imageView = this.f6832b.f78681e;
                ClientIcon icon = bountyFlightSheetVehicle.getIcon();
                if (icon != null) {
                    Context context = imageView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "context");
                    imageView.setImageDrawable(C33341Hk0.m103484a(icon, context));
                }
                ThemedColors iconColor = bountyFlightSheetVehicle.getIconColor();
                if (iconColor != null) {
                    imageView.setImageTintList(ColorStateList.valueOf(iconColor.getLightMode()));
                }
                imageView.setBackgroundTintList(ColorStateList.valueOf(bountyFlightSheetVehicle.getIconBackgroundColor().getLightMode()));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LE00$f;", "Lw1;", "", "position", "", "bind", "Leb2;", "b", "Leb2;", "binding", "", "c", "Ljava/lang/String;", "surplusId", "Landroid/view/View;", "view", "<init>", "(LE00;Landroid/view/View;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBountyFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyVehiclesViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,265:1\n18#2:266\n9#3,4:267\n*S KotlinDebug\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyVehiclesViewHolder\n*L\n200#1:266\n200#1:267,4\n*E\n"})
    /* renamed from: E00$f */
    /* loaded from: classes3.dex */
    public final class C1703f extends C29735w1 {

        /* renamed from: b */
        public final C40432eb2 f6834b;

        /* renamed from: c */
        public String f6835c;

        /* renamed from: d */
        public final /* synthetic */ E00 f6836d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: E00$f$a */
        /* loaded from: classes3.dex */
        public static final class C1704a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ E00 f6838h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1704a(E00 e00) {
                super(1);
                this.f6838h = e00;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                String str = C1703f.this.f6835c;
                if (str != null) {
                    this.f6838h.f6813d.invoke(new RefreshSurplusStateButton(str));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1703f(E00 e00, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f6836d = e00;
            C40432eb2 m42731a = C40432eb2.m42731a(view);
            Intrinsics.checkNotNullExpressionValue(m42731a, "bind(view)");
            this.f6834b = m42731a;
            ImageView imageView = m42731a.f78593c;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.refresh");
            C34585Ms2.m94661j(imageView, new C1704a(e00));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Unit unit;
            Object m105816c = this.f6836d.m94545o().m109397e(i).m105816c();
            Unit unit2 = null;
            if (!(m105816c instanceof BountyFlightSheetSectionVehicleList)) {
                m105816c = null;
            }
            BountyFlightSheetSectionVehicleList bountyFlightSheetSectionVehicleList = (BountyFlightSheetSectionVehicleList) m105816c;
            if (bountyFlightSheetSectionVehicleList != null) {
                String title = bountyFlightSheetSectionVehicleList.getTitle();
                if (title != null) {
                    this.f6834b.f78594d.setText(title);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    TextView textView = this.f6834b.f78594d;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.title");
                    C49520tu6.m11239l(textView);
                }
                String subtitle = bountyFlightSheetSectionVehicleList.getSubtitle();
                if (subtitle != null) {
                    this.f6834b.f78592b.setText(subtitle);
                    unit2 = Unit.INSTANCE;
                }
                if (unit2 == null) {
                    TextView textView2 = this.f6834b.f78592b;
                    Intrinsics.checkNotNullExpressionValue(textView2, "binding.body");
                    C49520tu6.m11239l(textView2);
                }
                BountyFlightSheetAction action = bountyFlightSheetSectionVehicleList.getAction();
                if (action instanceof BountyFlightSheetAction.RecheckSurplus) {
                    ImageView imageView = this.f6834b.f78593c;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.refresh");
                    C49520tu6.m11233r(imageView);
                    this.f6835c = ((BountyFlightSheetAction.RecheckSurplus) action).getSurplusId();
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/BountyFlightSheetButton;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/BountyFlightSheetButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: E00$g */
    /* loaded from: classes3.dex */
    public static final class C1705g extends Lambda implements Function1<BountyFlightSheetButton, Unit> {

        /* renamed from: g */
        public static final C1705g f6839g = new C1705g();

        public C1705g() {
            super(1);
        }

        /* renamed from: a */
        public final void m109498a(BountyFlightSheetButton it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BountyFlightSheetButton bountyFlightSheetButton) {
            m109498a(bountyFlightSheetButton);
            return Unit.INSTANCE;
        }
    }

    public E00() {
        this(null, 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f6814e = recyclerView;
        ViewParent parent = recyclerView.getParent();
        if (parent != null) {
            z = parent instanceof BaseBottomSheet;
        } else {
            z = true;
        }
        if (!z) {
            parent = null;
        }
        this.f6815f = (BaseBottomSheet) parent;
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(this.f6812c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        IntRange until;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f6814e = null;
        this.f6815f = null;
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
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
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
            boolean r3 = r3 instanceof co.bird.android.model.persistence.BountyFlightSheetDetails
            if (r3 == 0) goto L13
            goto L2b
        L2a:
            r1 = r2
        L2b:
            G6 r1 = (p000.C2637G6) r1
            if (r1 == 0) goto L42
            java.lang.Object r0 = r1.m105816c()
            boolean r1 = r0 instanceof co.bird.android.model.persistence.BountyFlightSheetDetails
            if (r1 == 0) goto L38
            goto L39
        L38:
            r0 = r2
        L39:
            co.bird.android.model.persistence.BountyFlightSheetDetails r0 = (co.bird.android.model.persistence.BountyFlightSheetDetails) r0
            if (r0 == 0) goto L42
            java.lang.String r0 = r0.getBountyId()
            goto L43
        L42:
            r0 = r2
        L43:
            super.mo24871u(r5)
            E6 r5 = r4.m94545o()
            java.util.List r5 = r5.m109394h()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L54:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r5.next()
            r3 = r1
            G6 r3 = (p000.C2637G6) r3
            java.lang.Object r3 = r3.m105816c()
            boolean r3 = r3 instanceof co.bird.android.model.persistence.BountyFlightSheetDetails
            if (r3 == 0) goto L54
            goto L6b
        L6a:
            r1 = r2
        L6b:
            G6 r1 = (p000.C2637G6) r1
            if (r1 == 0) goto L82
            java.lang.Object r5 = r1.m105816c()
            boolean r1 = r5 instanceof co.bird.android.model.persistence.BountyFlightSheetDetails
            if (r1 == 0) goto L78
            goto L79
        L78:
            r5 = r2
        L79:
            co.bird.android.model.persistence.BountyFlightSheetDetails r5 = (co.bird.android.model.persistence.BountyFlightSheetDetails) r5
            if (r5 == 0) goto L82
            java.lang.String r5 = r5.getBountyId()
            goto L83
        L82:
            r5 = r2
        L83:
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r5)
            if (r5 != 0) goto L92
            co.bird.android.bottomsheet.BaseBottomSheet<co.bird.android.model.BottomSheetButton> r5 = r4.f6815f
            if (r5 == 0) goto L92
            r0 = 0
            r1 = 1
            co.bird.android.bottomsheet.BaseBottomSheet.clearPeekViews$default(r5, r0, r1, r2)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.E00.mo24871u(java.util.Collection):void");
    }

    /* renamed from: w */
    public final BaseBottomSheet<BottomSheetButton> m109504w() {
        return this.f6815f;
    }

    /* renamed from: x */
    public final void m109503x(Function1<? super BountyFlightSheetButton, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f6813d = listener;
    }

    public /* synthetic */ E00(RecyclerView.AbstractC11854o abstractC11854o, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new J00() : abstractC11854o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C37548Zj4.item_bounty_flight_sheet_header ? new C1695a(this, m41761u) : i == C37548Zj4.item_bounty_flight_sheet_section_text ? new C1698d(this, m41761u) : i == C37548Zj4.item_bounty_flight_sheet_section_vehicle_list ? new C1703f(this, m41761u) : i == C37548Zj4.item_vehicle_involved ? new C1702e(this, m41761u) : i == C37548Zj4.item_bounty_flight_sheet_section_photo_header ? new C1696b(this, m41761u) : i == C37548Zj4.item_bounty_flight_sheet_photo ? new C1697c(this, m41761u) : new C29735w1(m41761u);
    }

    public E00(RecyclerView.AbstractC11854o itemDecoration) {
        Intrinsics.checkNotNullParameter(itemDecoration, "itemDecoration");
        this.f6812c = itemDecoration;
        this.f6813d = C1705g.f6839g;
    }
}
