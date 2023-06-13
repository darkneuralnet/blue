package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.rider.bottomsheets.RideStatusBottomSheet;
import co.bird.android.model.RideStatusBottomSheetButton;
import co.bird.android.widget.CountdownView;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000eR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, m28432d2 = {"LU65;", "LUl0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lkotlin/Function1;", "Lco/bird/android/model/RideStatusBottomSheetButton;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "w", "Lco/bird/android/feature/rider/bottomsheets/RideStatusBottomSheet;", "c", "Lco/bird/android/feature/rider/bottomsheets/RideStatusBottomSheet;", "rideStatusBottomSheet", DateTokenConverter.CONVERTER_KEY, "Landroidx/recyclerview/widget/RecyclerView;", "e", "Lkotlin/jvm/functions/Function1;", "onClick", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideStatusBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStatusBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/RideStatusBottomSheetAdapter\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,105:1\n9#2,4:106\n*S KotlinDebug\n*F\n+ 1 RideStatusBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/RideStatusBottomSheetAdapter\n*L\n44#1:106,4\n*E\n"})
/* renamed from: U65 */
/* loaded from: classes3.dex */
public final class U65 extends AbstractC36392Ul0 {

    /* renamed from: c */
    public RideStatusBottomSheet f36861c;

    /* renamed from: d */
    public RecyclerView f36862d;

    /* renamed from: e */
    public Function1<? super RideStatusBottomSheetButton, Unit> f36863e = C8197b.f36869g;

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"LU65$a;", "Lw1;", "", "position", "", "bind", "onAttachedToWindow", "onDetachedFromWindow", "Lb75;", "viewModel", C17296a.f69688o, "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "Landroidx/constraintlayout/widget/ConstraintLayout;", "headerView", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "c", "Lorg/joda/time/DateTime;", "bindTime", "Landroid/view/View;", "view", "<init>", "(LU65;Landroid/view/View;)V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideStatusBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStatusBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/RideStatusBottomSheetAdapter$RideStateHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n18#2:106\n18#2:112\n9#3,4:107\n9#3,4:113\n1#4:111\n*S KotlinDebug\n*F\n+ 1 RideStatusBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/RideStatusBottomSheetAdapter$RideStateHeaderViewHolder\n*L\n75#1:106\n86#1:112\n75#1:107,4\n86#1:113,4\n*E\n"})
    /* renamed from: U65$a */
    /* loaded from: classes3.dex */
    public final class C8193a extends C29735w1 {

        /* renamed from: b */
        public final ConstraintLayout f36864b;

        /* renamed from: c */
        public DateTime f36865c;

        /* renamed from: d */
        public final /* synthetic */ U65 f36866d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nRideStatusBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStatusBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/RideStatusBottomSheetAdapter$RideStateHeaderViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
        /* renamed from: U65$a$a */
        /* loaded from: classes3.dex */
        public static final class C8194a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ U65 f36867g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8194a(U65 u65) {
                super(1);
                this.f36867g = u65;
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
                    this.f36867g.f36863e.invoke(rideStatusBottomSheetButton);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nRideStatusBottomSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStatusBottomSheetAdapter.kt\nco/bird/android/feature/rider/bottomsheets/adapters/RideStatusBottomSheetAdapter$RideStateHeaderViewHolder$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
        /* renamed from: U65$a$b */
        /* loaded from: classes3.dex */
        public static final class C8195b extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ U65 f36868g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8195b(U65 u65) {
                super(1);
                this.f36868g = u65;
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
                    this.f36868g.f36863e.invoke(rideStatusBottomSheetButton);
                }
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: U65$a$c */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C8196c {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[R46.values().length];
                try {
                    iArr[R46.STOPPED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[R46.INCREASING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[R46.DECREASING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8193a(U65 u65, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f36866d = u65;
            this.f36864b = (ConstraintLayout) view;
            this.f36865c = DateTime.now();
            Button button = (Button) C49520tu6.m11238m(view, C36828Wh4.primaryButton);
            if (button != null) {
                C34585Ms2.onClickWithThrottle$default(button, 0L, new C8194a(u65), 1, null);
            }
            Button button2 = (Button) C49520tu6.m11238m(view, C36828Wh4.secondaryButton);
            if (button2 != null) {
                C34585Ms2.onClickWithThrottle$default(button2, 0L, new C8195b(u65), 1, null);
            }
        }

        /* renamed from: a */
        public final int m81965a(C38365b75 c38365b75) {
            int i = C8196c.$EnumSwitchMapping$0[c38365b75.m64940i().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        int m64945d = c38365b75.m64945d();
                        DateTime bindTime = this.f36865c;
                        Intrinsics.checkNotNullExpressionValue(bindTime, "bindTime");
                        return Math.max(m64945d - C46880pT0.m19254h(bindTime), 0);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                int m64945d2 = c38365b75.m64945d();
                DateTime bindTime2 = this.f36865c;
                Intrinsics.checkNotNullExpressionValue(bindTime2, "bindTime");
                return m64945d2 + C46880pT0.m19254h(bindTime2);
            }
            return c38365b75.m64945d();
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f36865c = DateTime.now();
            RideStatusBottomSheet rideStatusBottomSheet = this.f36866d.f36861c;
            if (rideStatusBottomSheet == null) {
                return;
            }
            super.bind(i);
            Object m105816c = this.f36866d.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof C38365b75)) {
                m105816c = null;
            }
            C38365b75 c38365b75 = (C38365b75) m105816c;
            if (c38365b75 != null) {
                c38365b75.m64948a(this.f36864b);
                View itemView = this.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                rideStatusBottomSheet.m59078X(itemView);
            }
        }

        @Override // p000.C29735w1
        public void onAttachedToWindow() {
            boolean z;
            super.onAttachedToWindow();
            Integer valueOf = Integer.valueOf(getAdapterPosition());
            if (valueOf.intValue() != -1) {
                z = true;
            } else {
                z = false;
            }
            C38365b75 c38365b75 = null;
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                CountdownView countdownView = (CountdownView) C49520tu6.m11238m(this.f36864b, C36828Wh4.durationText);
                if (countdownView == null) {
                    return;
                }
                countdownView.m54602x();
                Object m105816c = this.f36866d.m94545o().m109394h().get(intValue).m105816c();
                if (m105816c instanceof C38365b75) {
                    c38365b75 = m105816c;
                }
                C38365b75 c38365b752 = c38365b75;
                if (c38365b752 == null) {
                    return;
                }
                C41318g46.m40163a("TimerState: " + c38365b752.m64940i() + " with duration " + c38365b752.m64945d() + " with modified duration since bind " + m81965a(c38365b752), new Object[0]);
                countdownView.setTimerState(c38365b752.m64940i());
                CountdownView.init$default(countdownView, m81965a(c38365b752), null, null, null, null, null, null, null, 254, null);
            }
        }

        @Override // p000.C29735w1
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            CountdownView countdownView = (CountdownView) C49520tu6.m11238m(itemView, C36828Wh4.durationText);
            if (countdownView != null) {
                countdownView.m54602x();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/RideStatusBottomSheetButton;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/RideStatusBottomSheetButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: U65$b */
    /* loaded from: classes3.dex */
    public static final class C8197b extends Lambda implements Function1<RideStatusBottomSheetButton, Unit> {

        /* renamed from: g */
        public static final C8197b f36869g = new C8197b();

        public C8197b() {
            super(1);
        }

        /* renamed from: a */
        public final void m81964a(RideStatusBottomSheetButton it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RideStatusBottomSheetButton rideStatusBottomSheetButton) {
            m81964a(rideStatusBottomSheetButton);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f36862d = recyclerView;
        ViewParent parent = recyclerView.getParent();
        if (parent != null) {
            z = parent instanceof RideStatusBottomSheet;
        } else {
            z = true;
        }
        if (!z) {
            parent = null;
        }
        this.f36861c = (RideStatusBottomSheet) parent;
        if (recyclerView.getItemDecorationCount() == 0) {
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "recyclerView.context");
            recyclerView.addItemDecoration(new Y65(context));
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new V65();
    }

    /* renamed from: w */
    public final void m81966w(Function1<? super RideStatusBottomSheetButton, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f36863e = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C33570Ij4.item_ride_state_header ? new C8193a(this, m41761u) : new C29735w1(m41761u);
    }
}
