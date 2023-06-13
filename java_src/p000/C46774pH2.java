package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.rider.bottomsheets.ManageGroupRidesBottomSheet;
import co.bird.android.model.RideStatusBottomSheetButton;
import co.bird.android.model.SelectedRideButton;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0003#$\u0019B\u0007¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0015\u001a\u00020\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0013H\u0002R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, m28432d2 = {"LpH2;", "LUl0;", "", "rideId", "", "w", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lkotlin/Function1;", "Lco/bird/android/model/RideStatusBottomSheetButton;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "x", "button", "y", "Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;", "c", "Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;", "manageGroupRidesBottomSheet", DateTokenConverter.CONVERTER_KEY, "Landroidx/recyclerview/widget/RecyclerView;", "e", "Lkotlin/jvm/functions/Function1;", "onClickListener", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nManageGroupRidesBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageGroupRidesBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetAdapter\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,131:1\n9#2,4:132\n*S KotlinDebug\n*F\n+ 1 ManageGroupRidesBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetAdapter\n*L\n55#1:132,4\n*E\n"})
/* renamed from: pH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46774pH2 extends AbstractC36392Ul0 {

    /* renamed from: c */
    public ManageGroupRidesBottomSheet f103413c;

    /* renamed from: d */
    public RecyclerView f103414d;

    /* renamed from: e */
    public Function1<? super RideStatusBottomSheetButton, Unit> f103415e = C27241d.f103430g;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LpH2$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "button", "Landroid/view/View;", "view", "<init>", "(LpH2;Landroid/view/View;)V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nManageGroupRidesBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageGroupRidesBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetAdapter$ButtonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,131:1\n18#2:132\n9#3,4:133\n*S KotlinDebug\n*F\n+ 1 ManageGroupRidesBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetAdapter$ButtonViewHolder\n*L\n92#1:132\n92#1:133,4\n*E\n"})
    /* renamed from: pH2$a */
    /* loaded from: classes3.dex */
    public final class C27234a extends C29735w1 {

        /* renamed from: b */
        public final Button f103416b;

        /* renamed from: c */
        public final /* synthetic */ C46774pH2 f103417c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nManageGroupRidesBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageGroupRidesBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetAdapter$ButtonViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n18#2:132\n9#3,4:133\n1#4:137\n*S KotlinDebug\n*F\n+ 1 ManageGroupRidesBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetAdapter$ButtonViewHolder$1\n*L\n87#1:132\n87#1:133,4\n*E\n"})
        /* renamed from: pH2$a$a */
        /* loaded from: classes3.dex */
        public static final class C27235a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C46774pH2 f103419h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27235a(C46774pH2 c46774pH2) {
                super(1);
                this.f103419h = c46774pH2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                if (C27234a.this.getAdapterPosition() == -1) {
                    return;
                }
                Object m105816c = this.f103419h.m94545o().m109394h().get(C27234a.this.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof RideStatusBottomSheetButton)) {
                    m105816c = null;
                }
                RideStatusBottomSheetButton rideStatusBottomSheetButton = (RideStatusBottomSheetButton) m105816c;
                if (rideStatusBottomSheetButton != null) {
                    this.f103419h.m19573y(rideStatusBottomSheetButton);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27234a(C46774pH2 c46774pH2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f103417c = c46774pH2;
            Button button = (Button) view;
            this.f103416b = button;
            C34585Ms2.m94661j(button, new C27235a(c46774pH2));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f103417c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof RideStatusBottomSheetButton)) {
                m105816c = null;
            }
            RideStatusBottomSheetButton rideStatusBottomSheetButton = (RideStatusBottomSheetButton) m105816c;
            if (rideStatusBottomSheetButton == null) {
                return;
            }
            this.f103416b.setText(rideStatusBottomSheetButton.getText());
            this.f103416b.setEnabled(rideStatusBottomSheetButton.isEnabled());
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LpH2$b;", "Lw1;", "", "position", "", "bind", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "Landroidx/constraintlayout/widget/ConstraintLayout;", "entryView", "Lco/bird/android/model/SelectedRideButton;", "c", "Lco/bird/android/model/SelectedRideButton;", "selectedRideButton", "Landroid/view/View;", "view", "<init>", "(LpH2;Landroid/view/View;)V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nManageGroupRidesBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageGroupRidesBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetAdapter$ManageGroupRidesEntryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,131:1\n18#2:132\n9#3,4:133\n*S KotlinDebug\n*F\n+ 1 ManageGroupRidesBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetAdapter$ManageGroupRidesEntryViewHolder\n*L\n118#1:132\n118#1:133,4\n*E\n"})
    /* renamed from: pH2$b */
    /* loaded from: classes3.dex */
    public final class C27236b extends C29735w1 {

        /* renamed from: b */
        public final ConstraintLayout f103420b;

        /* renamed from: c */
        public SelectedRideButton f103421c;

        /* renamed from: d */
        public final /* synthetic */ C46774pH2 f103422d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nManageGroupRidesBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageGroupRidesBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetAdapter$ManageGroupRidesEntryViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
        /* renamed from: pH2$b$a */
        /* loaded from: classes3.dex */
        public static final class C27237a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C46774pH2 f103423g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27237a(C46774pH2 c46774pH2) {
                super(1);
                this.f103423g = c46774pH2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object tag = view != null ? view.getTag() : null;
                RideStatusBottomSheetButton rideStatusBottomSheetButton = tag instanceof RideStatusBottomSheetButton ? (RideStatusBottomSheetButton) tag : null;
                if (rideStatusBottomSheetButton != null) {
                    this.f103423g.m19573y(rideStatusBottomSheetButton);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nManageGroupRidesBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageGroupRidesBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetAdapter$ManageGroupRidesEntryViewHolder$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
        /* renamed from: pH2$b$b */
        /* loaded from: classes3.dex */
        public static final class C27238b extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C46774pH2 f103425h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27238b(C46774pH2 c46774pH2) {
                super(1);
                this.f103425h = c46774pH2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                SelectedRideButton selectedRideButton = C27236b.this.f103421c;
                if (selectedRideButton != null) {
                    this.f103425h.m19573y(selectedRideButton);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nManageGroupRidesBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageGroupRidesBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetAdapter$ManageGroupRidesEntryViewHolder$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
        /* renamed from: pH2$b$c */
        /* loaded from: classes3.dex */
        public static final class C27239c extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C46774pH2 f103427h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27239c(C46774pH2 c46774pH2) {
                super(1);
                this.f103427h = c46774pH2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                SelectedRideButton selectedRideButton = C27236b.this.f103421c;
                if (selectedRideButton != null) {
                    this.f103427h.m19573y(selectedRideButton);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27236b(C46774pH2 c46774pH2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f103422d = c46774pH2;
            this.f103420b = (ConstraintLayout) view;
            Button button = (Button) C49520tu6.m11238m(view, C36828Wh4.button);
            if (button != null) {
                C34585Ms2.m94661j(button, new C27237a(c46774pH2));
            }
            RadioButton radioButton = (RadioButton) C49520tu6.m11238m(view, C36828Wh4.radioButton);
            if (radioButton != null) {
                C34585Ms2.m94661j(radioButton, new C27238b(c46774pH2));
            }
            C34585Ms2.m94661j(view, new C27239c(c46774pH2));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            super.bind(i);
            Object m105816c = this.f103422d.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof C49738uH2)) {
                m105816c = null;
            }
            C49738uH2 c49738uH2 = (C49738uH2) m105816c;
            if (c49738uH2 != null) {
                C46774pH2 c46774pH2 = this.f103422d;
                this.f103421c = new SelectedRideButton(c49738uH2.m10487c(), c49738uH2.m10486d(), "", false, false, 24, null);
                c49738uH2.m10489a(this.f103420b);
                ManageGroupRidesBottomSheet manageGroupRidesBottomSheet = c46774pH2.f103413c;
                if (manageGroupRidesBottomSheet != null) {
                    View itemView = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    manageGroupRidesBottomSheet.m59078X(itemView);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LpH2$c;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "headerView", "Landroid/view/View;", "view", "<init>", "(LpH2;Landroid/view/View;)V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nManageGroupRidesBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageGroupRidesBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetAdapter$ManageGroupRidesHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,131:1\n18#2:132\n9#3,4:133\n*S KotlinDebug\n*F\n+ 1 ManageGroupRidesBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetAdapter$ManageGroupRidesHeaderViewHolder\n*L\n77#1:132\n77#1:133,4\n*E\n"})
    /* renamed from: pH2$c */
    /* loaded from: classes3.dex */
    public final class C27240c extends C29735w1 {

        /* renamed from: b */
        public final TextView f103428b;

        /* renamed from: c */
        public final /* synthetic */ C46774pH2 f103429c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27240c(C46774pH2 c46774pH2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f103429c = c46774pH2;
            this.f103428b = (TextView) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            super.bind(i);
            TextView textView = this.f103428b;
            Object m105816c = this.f103429c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            textView.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/RideStatusBottomSheetButton;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideStatusBottomSheetButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: pH2$d */
    /* loaded from: classes3.dex */
    public static final class C27241d extends Lambda implements Function1<RideStatusBottomSheetButton, Unit> {

        /* renamed from: g */
        public static final C27241d f103430g = new C27241d();

        public C27241d() {
            super(1);
        }

        /* renamed from: a */
        public final void m19571a(RideStatusBottomSheetButton it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideStatusBottomSheetButton rideStatusBottomSheetButton) {
            m19571a(rideStatusBottomSheetButton);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f103414d = recyclerView;
        ViewParent parent = recyclerView.getParent();
        if (parent != null) {
            z = parent instanceof ManageGroupRidesBottomSheet;
        } else {
            z = true;
        }
        if (!z) {
            parent = null;
        }
        this.f103413c = (ManageGroupRidesBottomSheet) parent;
        if (recyclerView.getItemDecorationCount() == 0) {
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "recyclerView.context");
            recyclerView.addItemDecoration(new C48552sH2(context));
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return null;
    }

    /* renamed from: w */
    public final boolean m19575w(String str) {
        int itemCount;
        C49738uH2 c49738uH2;
        if (str != null && (itemCount = getItemCount()) >= 0) {
            int i = 0;
            while (true) {
                Object m105816c = m94544p(i).m105816c();
                String str2 = null;
                if (m105816c instanceof C49738uH2) {
                    c49738uH2 = (C49738uH2) m105816c;
                } else {
                    c49738uH2 = null;
                }
                if (c49738uH2 != null) {
                    str2 = c49738uH2.m10487c();
                }
                if (Intrinsics.areEqual(str2, str)) {
                    return true;
                }
                if (i == itemCount) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: x */
    public final void m19574x(Function1<? super RideStatusBottomSheetButton, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f103415e = listener;
    }

    /* renamed from: y */
    public final void m19573y(RideStatusBottomSheetButton rideStatusBottomSheetButton) {
        this.f103415e.invoke(rideStatusBottomSheetButton);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C33570Ij4.item_manage_group_rides_header ? new C27240c(this, m41761u) : i == C33570Ij4.item_manage_group_rides_entry ? new C27236b(this, m41761u) : i == C45268mk4.item_button ? new C27234a(this, m41761u) : new C29735w1(m41761u);
    }
}
