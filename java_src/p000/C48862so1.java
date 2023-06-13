package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.FleetListActionKind;
import co.bird.android.model.persistence.FleetListVehicle;
import co.bird.android.model.persistence.nestedstructures.FleetListAction;
import co.bird.android.model.persistence.nestedstructures.FleetListComplication;
import co.bird.android.model.persistence.nestedstructures.FleetListMessage;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0003 !\u0017B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eR\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u000f0\u000f0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00130\u00130\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00110\u00110\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\""}, m28432d2 = {"Lso1;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "LuN5;", "v", "Lco/bird/android/model/persistence/nestedstructures/FleetListAction;", "w", "Lco/bird/android/model/persistence/FleetListVehicle;", "x", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "sortOrderingSubject", DateTokenConverter.CONVERTER_KEY, "vehicleSelectsSubject", "e", "vehicleSelectsActionSubject", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: so1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48862so1 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<EnumC49795uN5> f109287c;

    /* renamed from: d */
    public final C24558d<FleetListVehicle> f109288d;

    /* renamed from: e */
    public final C24558d<FleetListAction> f109289e;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lso1$a;", "Lw1;", "", "position", "", "bind", "LLb2;", "b", "LLb2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lso1;Landroid/view/View;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetListAdapter.kt\nco/bird/android/feature/fleetstatus/state/list/adapters/FleetListAdapter$MessageViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,218:1\n18#2:219\n9#3,4:220\n*S KotlinDebug\n*F\n+ 1 FleetListAdapter.kt\nco/bird/android/feature/fleetstatus/state/list/adapters/FleetListAdapter$MessageViewHolder\n*L\n78#1:219\n78#1:220,4\n*E\n"})
    /* renamed from: so1$a */
    /* loaded from: classes3.dex */
    public final class C28395a extends C29735w1 {

        /* renamed from: b */
        public final C34198Lb2 f109290b;

        /* renamed from: c */
        public final /* synthetic */ C48862so1 f109291c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28395a(C48862so1 c48862so1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f109291c = c48862so1;
            C34198Lb2 m96604a = C34198Lb2.m96604a(view);
            Intrinsics.checkNotNullExpressionValue(m96604a, "bind(view)");
            this.f109290b = m96604a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f109291c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof FleetListMessage)) {
                m105816c = null;
            }
            FleetListMessage fleetListMessage = (FleetListMessage) m105816c;
            if (fleetListMessage != null) {
                this.f109290b.getRoot().setBackgroundTintList(ColorStateList.valueOf(fleetListMessage.getBackgroundColor().getLightMode()));
                this.f109290b.f21745e.setText(fleetListMessage.getTitle());
                this.f109290b.f21745e.setTextColor(fleetListMessage.getTitleColor().getLightMode());
                ImageView imageView = this.f109290b.f21744d;
                ClientIcon icon = fleetListMessage.getIcon();
                Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                imageView.setImageDrawable(C33341Hk0.m103484a(icon, context));
                this.f109290b.f21744d.setImageTintList(ColorStateList.valueOf(fleetListMessage.getTitleColor().getLightMode()));
                this.f109290b.f21743c.setText(fleetListMessage.getDescription());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lso1$b;", "Lw1;", "", "position", "", "bind", "LMb2;", "b", "LMb2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lso1;Landroid/view/View;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetListAdapter.kt\nco/bird/android/feature/fleetstatus/state/list/adapters/FleetListAdapter$TitleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n18#2:219\n18#2:225\n9#3,4:220\n9#3,4:226\n1#4:224\n*S KotlinDebug\n*F\n+ 1 FleetListAdapter.kt\nco/bird/android/feature/fleetstatus/state/list/adapters/FleetListAdapter$TitleViewHolder\n*L\n111#1:219\n94#1:225\n111#1:220,4\n94#1:226,4\n*E\n"})
    /* renamed from: so1$b */
    /* loaded from: classes3.dex */
    public final class C28396b extends C29735w1 {

        /* renamed from: b */
        public final C34432Mb2 f109292b;

        /* renamed from: c */
        public final /* synthetic */ C48862so1 f109293c;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: so1$b$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C28397a extends FunctionReferenceImpl implements Function1<View, Unit> {

            /* renamed from: b */
            public final /* synthetic */ C48862so1 f109294b;

            /* renamed from: c */
            public final /* synthetic */ C28396b f109295c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28397a(C48862so1 c48862so1, C28396b c28396b) {
                super(1, C28396b.class, "onClick", "_init_$onClick(Lco/bird/android/feature/fleetstatus/state/list/adapters/FleetListAdapter;Lco/bird/android/feature/fleetstatus/state/list/adapters/FleetListAdapter$TitleViewHolder;Landroid/view/View;)V", 0);
                this.f109294b = c48862so1;
                this.f109295c = c28396b;
            }

            /* renamed from: a */
            public final void m13635a(View view) {
                C28396b.m13637a(this.f109294b, this.f109295c, view);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                m13635a(view);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: so1$b$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C28398b extends FunctionReferenceImpl implements Function1<View, Unit> {

            /* renamed from: b */
            public final /* synthetic */ C48862so1 f109296b;

            /* renamed from: c */
            public final /* synthetic */ C28396b f109297c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28398b(C48862so1 c48862so1, C28396b c28396b) {
                super(1, C28396b.class, "onClick", "_init_$onClick(Lco/bird/android/feature/fleetstatus/state/list/adapters/FleetListAdapter;Lco/bird/android/feature/fleetstatus/state/list/adapters/FleetListAdapter$TitleViewHolder;Landroid/view/View;)V", 0);
                this.f109296b = c48862so1;
                this.f109297c = c28396b;
            }

            /* renamed from: a */
            public final void m13634a(View view) {
                C28396b.m13637a(this.f109296b, this.f109297c, view);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                m13634a(view);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28396b(C48862so1 c48862so1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f109293c = c48862so1;
            C34432Mb2 m95149a = C34432Mb2.m95149a(view);
            Intrinsics.checkNotNullExpressionValue(m95149a, "bind(view)");
            this.f109292b = m95149a;
            TextView textView = m95149a.f23267b;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.sort");
            C34585Ms2.m94661j(textView, new C28397a(c48862so1, this));
            ImageView imageView = m95149a.f23268c;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.sortIcon");
            C34585Ms2.m94661j(imageView, new C28398b(c48862so1, this));
        }

        /* renamed from: a */
        public static final void m13637a(C48862so1 c48862so1, C28396b c28396b, View view) {
            Object m105816c = c48862so1.m94545o().m109397e(c28396b.getBindingAdapterPosition()).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                EnumC49795uN5 enumC49795uN5 = (EnumC49795uN5) pair.component2();
                C24558d c24558d = c48862so1.f109287c;
                EnumC49795uN5 enumC49795uN52 = EnumC49795uN5.ASCENDING;
                if (enumC49795uN5 == enumC49795uN52) {
                    enumC49795uN52 = EnumC49795uN5.DESCENDING;
                }
                c24558d.onNext(enumC49795uN52);
            }
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            int i2;
            Object m105816c = this.f109293c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                EnumC49795uN5 enumC49795uN5 = (EnumC49795uN5) pair.component2();
                this.f109292b.f23269d.setText((String) pair.component1());
                TextView textView = this.f109292b.f23267b;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.sort");
                boolean z2 = true;
                if (enumC49795uN5 != null) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(textView, z, 0, 2, null);
                ImageView imageView = this.f109292b.f23268c;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.sortIcon");
                if (enumC49795uN5 == null) {
                    z2 = false;
                }
                C49520tu6.show$default(imageView, z2, 0, 2, null);
                C34432Mb2 c34432Mb2 = this.f109292b;
                ImageView imageView2 = c34432Mb2.f23268c;
                Context context = c34432Mb2.getRoot().getContext();
                if (enumC49795uN5 == EnumC49795uN5.ASCENDING) {
                    i2 = C48193rg4.ic_sort_ascending;
                } else {
                    i2 = C48193rg4.ic_sort_descending;
                }
                imageView2.setImageDrawable(NA0.m94299e(context, i2));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0003\u0007\u000e\u000fB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m28432d2 = {"Lso1$c;", "Lw1;", "", "position", "", "bind", "LNb2;", "b", "LNb2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lso1;Landroid/view/View;)V", "c", DateTokenConverter.CONVERTER_KEY, "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetListAdapter.kt\nco/bird/android/feature/fleetstatus/state/list/adapters/FleetListAdapter$VehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,218:1\n18#2:219\n9#3,4:220\n*S KotlinDebug\n*F\n+ 1 FleetListAdapter.kt\nco/bird/android/feature/fleetstatus/state/list/adapters/FleetListAdapter$VehicleViewHolder\n*L\n140#1:219\n140#1:220,4\n*E\n"})
    /* renamed from: so1$c */
    /* loaded from: classes3.dex */
    public final class C28399c extends C29735w1 {

        /* renamed from: b */
        public final C34666Nb2 f109298b;

        /* renamed from: c */
        public final /* synthetic */ C48862so1 f109299c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nFleetListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetListAdapter.kt\nco/bird/android/feature/fleetstatus/state/list/adapters/FleetListAdapter$VehicleViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n18#2:219\n18#2:225\n9#3,4:220\n9#3,4:226\n1#4:224\n*S KotlinDebug\n*F\n+ 1 FleetListAdapter.kt\nco/bird/android/feature/fleetstatus/state/list/adapters/FleetListAdapter$VehicleViewHolder$1\n*L\n134#1:219\n135#1:225\n134#1:220,4\n135#1:226,4\n*E\n"})
        /* renamed from: so1$c$a */
        /* loaded from: classes3.dex */
        public static final class C28400a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C48862so1 f109300g;

            /* renamed from: h */
            public final /* synthetic */ C28399c f109301h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28400a(C48862so1 c48862so1, C28399c c28399c) {
                super(1);
                this.f109300g = c48862so1;
                this.f109301h = c28399c;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                FleetListAction action;
                Object m105816c = this.f109300g.m94545o().m109397e(this.f109301h.getBindingAdapterPosition()).m105816c();
                if (!(m105816c instanceof FleetListVehicle)) {
                    m105816c = null;
                }
                FleetListVehicle fleetListVehicle = (FleetListVehicle) m105816c;
                if (fleetListVehicle != null && (action = fleetListVehicle.getAction()) != null) {
                    this.f109300g.f109289e.onNext(action);
                }
                Object m105816c2 = this.f109300g.m94545o().m109397e(this.f109301h.getBindingAdapterPosition()).m105816c();
                FleetListVehicle fleetListVehicle2 = m105816c2 instanceof FleetListVehicle ? m105816c2 : null;
                if (fleetListVehicle2 != null) {
                    this.f109300g.f109288d.onNext(fleetListVehicle2);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u00020\u0001R\u00060\u0003R\u00020\u0004B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, m28432d2 = {"Lso1$c$b;", "Lso1$c$c;", "Lco/bird/android/model/persistence/nestedstructures/FleetListComplication$BatteryComplication;", "Lso1$c;", "Lso1;", "complication", "", C17296a.f69688o, "LAs0;", "b", "LAs0;", "binding", "Landroid/view/View;", "view", "<init>", "(Lso1$c;Landroid/view/View;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: so1$c$b */
        /* loaded from: classes3.dex */
        public final class C28401b extends AbstractC28402c<FleetListComplication.BatteryComplication> {

            /* renamed from: b */
            public final C31775As0 f109302b;

            /* renamed from: c */
            public final /* synthetic */ C28399c f109303c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28401b(C28399c c28399c, View view) {
                super();
                Intrinsics.checkNotNullParameter(view, "view");
                this.f109303c = c28399c;
                C31775As0 m115004a = C31775As0.m115004a(view);
                Intrinsics.checkNotNullExpressionValue(m115004a, "bind(view)");
                this.f109302b = m115004a;
            }

            /* renamed from: a */
            public void m13633a(FleetListComplication.BatteryComplication complication) {
                Intrinsics.checkNotNullParameter(complication, "complication");
                this.f109302b.f1285b.setBatteryLevel(complication.getBattery() / 100.0f);
                this.f109302b.f1286c.setText(this.f109303c.itemView.getContext().getString(C45871nl4.battery_percent, Integer.valueOf(complication.getBattery())));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b¢\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"Lso1$c$c;", "Lco/bird/android/model/persistence/nestedstructures/FleetListComplication;", "T", "", "<init>", "(Lso1$c;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: so1$c$c */
        /* loaded from: classes3.dex */
        public abstract class AbstractC28402c<T extends FleetListComplication> {
            public AbstractC28402c() {
            }
        }

        @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u00020\u0001R\u00060\u0003R\u00020\u0004B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, m28432d2 = {"Lso1$c$d;", "Lso1$c$c;", "Lco/bird/android/model/persistence/nestedstructures/FleetListComplication$IconComplication;", "Lso1$c;", "Lso1;", "complication", "", C17296a.f69688o, "LBs0;", "b", "LBs0;", "binding", "Landroid/view/View;", "view", "<init>", "(Lso1$c;Landroid/view/View;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: so1$c$d */
        /* loaded from: classes3.dex */
        public final class C28403d extends AbstractC28402c<FleetListComplication.IconComplication> {

            /* renamed from: b */
            public final C32009Bs0 f109305b;

            /* renamed from: c */
            public final /* synthetic */ C28399c f109306c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28403d(C28399c c28399c, View view) {
                super();
                Intrinsics.checkNotNullParameter(view, "view");
                this.f109306c = c28399c;
                C32009Bs0 m113426a = C32009Bs0.m113426a(view);
                Intrinsics.checkNotNullExpressionValue(m113426a, "bind(view)");
                this.f109305b = m113426a;
            }

            /* renamed from: a */
            public void m13632a(FleetListComplication.IconComplication complication) {
                int lightMode;
                Intrinsics.checkNotNullParameter(complication, "complication");
                int numIcons = complication.getNumIcons();
                C28399c c28399c = this.f109306c;
                for (int i = 0; i < numIcons; i++) {
                    Context context = this.f109305b.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "binding.root.context");
                    int i2 = C38125aj4.item_complication_icon;
                    LinearLayout root = this.f109305b.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "binding.root");
                    View m41761u = C40788fB0.m41761u(context, i2, root, false);
                    Intrinsics.checkNotNull(m41761u, "null cannot be cast to non-null type android.widget.ImageView");
                    ImageView imageView = (ImageView) m41761u;
                    this.f109305b.getRoot().addView(imageView);
                    ClientIcon icon = complication.getIcon();
                    Context context2 = c28399c.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "itemView.context");
                    imageView.setImageDrawable(C33341Hk0.m103484a(icon, context2));
                    if (i < complication.getNumFilled()) {
                        lightMode = complication.getFilledColor().getLightMode();
                    } else {
                        lightMode = complication.getUnfilledColor().getLightMode();
                    }
                    imageView.setImageTintList(ColorStateList.valueOf(lightMode));
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    if (i > 0) {
                        Context context3 = c28399c.itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "itemView.context");
                        layoutParams2.setMarginStart((int) C49347td3.m12002a(-2, context3));
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28399c(C48862so1 c48862so1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f109299c = c48862so1;
            C34666Nb2 m93728a = C34666Nb2.m93728a(view);
            Intrinsics.checkNotNullExpressionValue(m93728a, "bind(view)");
            this.f109298b = m93728a;
            ConstraintLayout root = m93728a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C28400a(c48862so1, this));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0151, code lost:
            if (r10 != co.bird.android.model.constant.FleetListActionKind.UNKNOWN) goto L30;
         */
        @Override // p000.C29735w1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void bind(int i) {
            boolean z;
            boolean z2;
            boolean z3;
            FleetListActionKind fleetListActionKind;
            Object m105816c = this.f109299c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof FleetListVehicle)) {
                m105816c = null;
            }
            FleetListVehicle fleetListVehicle = (FleetListVehicle) m105816c;
            if (fleetListVehicle != null) {
                this.f109298b.f24837h.setText(fleetListVehicle.getTitle());
                TextView textView = this.f109298b.f24831b;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.caption");
                boolean z4 = true;
                if (fleetListVehicle.getCaption() != null) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(textView, z, 0, 2, null);
                this.f109298b.f24831b.setText(fleetListVehicle.getCaption());
                this.f109298b.f24831b.setTextColor(fleetListVehicle.getCaptionColor().getLightMode());
                TextView textView2 = this.f109298b.f24832c;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.caption2");
                if (fleetListVehicle.getCaption2() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C49520tu6.show$default(textView2, z2, 0, 2, null);
                this.f109298b.f24832c.setText(fleetListVehicle.getCaption2());
                this.f109298b.f24832c.setTextColor(fleetListVehicle.getCaption2Color().getLightMode());
                ImageView imageView = this.f109298b.f24835f;
                ClientIcon icon = fleetListVehicle.getIcon();
                Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                imageView.setImageDrawable(C33341Hk0.m103484a(icon, context));
                this.f109298b.f24835f.setImageTintList(ColorStateList.valueOf(fleetListVehicle.getIconColor().getLightMode()));
                TextView textView3 = this.f109298b.f24836g;
                Intrinsics.checkNotNullExpressionValue(textView3, "binding.notification");
                if (fleetListVehicle.getNotification() != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C49520tu6.show$default(textView3, z3, 0, 2, null);
                this.f109298b.f24836g.setText(fleetListVehicle.getNotification());
                this.f109298b.getRoot().setBackgroundTintList(ColorStateList.valueOf(NA0.m94301c(getContext(), C32364Df4.baseBG)));
                this.f109298b.f24834e.removeAllViews();
                FleetListComplication complication = fleetListVehicle.getComplication();
                if (complication != null) {
                    Context context2 = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "itemView.context");
                    int m9729a = C50048uo1.m9729a(complication);
                    FrameLayout frameLayout = this.f109298b.f24834e;
                    Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.complication");
                    View m41761u = C40788fB0.m41761u(context2, m9729a, frameLayout, false);
                    this.f109298b.f24834e.addView(m41761u);
                    if (complication instanceof FleetListComplication.BatteryComplication) {
                        new C28401b(this, m41761u).m13633a((FleetListComplication.BatteryComplication) complication);
                    } else if (complication instanceof FleetListComplication.IconComplication) {
                        new C28403d(this, m41761u).m13632a((FleetListComplication.IconComplication) complication);
                    }
                }
                ImageView imageView2 = this.f109298b.f24833d;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.chevron");
                if (fleetListVehicle.getAction() != null) {
                    FleetListAction action = fleetListVehicle.getAction();
                    if (action != null) {
                        fleetListActionKind = action.getKind();
                    } else {
                        fleetListActionKind = null;
                    }
                }
                z4 = false;
                C49520tu6.show$default(imageView2, z4, 0, 2, null);
            }
        }
    }

    public C48862so1() {
        C24558d<EnumC49795uN5> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<SortOrdering>()");
        this.f109287c = m31902e;
        C24558d<FleetListVehicle> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<FleetListVehicle>()");
        this.f109288d = m31902e2;
        C24558d<FleetListAction> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<FleetListAction>()");
        this.f109289e = m31902e3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C53012zo1());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C49455to1();
    }

    /* renamed from: v */
    public final Observable<EnumC49795uN5> m13640v() {
        Observable<EnumC49795uN5> hide = this.f109287c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "sortOrderingSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<FleetListAction> m13639w() {
        Observable<FleetListAction> hide = this.f109289e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "vehicleSelectsActionSubject.hide()");
        return hide;
    }

    /* renamed from: x */
    public final Observable<FleetListVehicle> m13638x() {
        Observable<FleetListVehicle> hide = this.f109288d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "vehicleSelectsSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        m41761u.setTag(Integer.valueOf(i));
        return i == C38125aj4.item_fleet_list_message ? new C28395a(this, m41761u) : i == C38125aj4.item_fleet_list_title ? new C28396b(this, m41761u) : i == C38125aj4.item_fleet_list_vehicle ? new C28399c(this, m41761u) : new C29735w1(m41761u);
    }
}
