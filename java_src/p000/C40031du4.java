package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Point;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.persistence.ZoneAssignmentGroup;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.persistence.nestedstructures.ZoneAssignmentCappedReservationGroup;
import co.bird.android.model.persistence.nestedstructures.ZoneAssignmentCappedZoneReservation;
import co.bird.android.model.persistence.nestedstructures.ZoneAssignmentReleaseAssignment;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0005\u001e\u001f\u0010\u0018 B\t\b\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R.\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R.\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015¨\u0006!"}, m28432d2 = {"Ldu4;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lkotlin/Function1;", "Lco/bird/android/model/Point;", "c", "Lkotlin/jvm/functions/Function1;", "w", "()Lkotlin/jvm/functions/Function1;", "y", "(Lkotlin/jvm/functions/Function1;)V", "directionClicks", "", DateTokenConverter.CONVERTER_KEY, "v", "x", "cancelClicks", "<init>", "()V", C17296a.f69688o, "b", "e", "release-assignment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: du4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40031du4 extends AbstractC52206yS0 {

    /* renamed from: c */
    public Function1<? super Point, Unit> f77380c = C19900g.f77400g;

    /* renamed from: d */
    public Function1<? super String, Unit> f77381d = C19899f.f77399g;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Ldu4$a;", "Lw1;", "", "position", "", "bind", "LWm2;", "b", "LWm2;", "groupTitleBinding", "Landroid/view/View;", "view", "<init>", "(Ldu4;Landroid/view/View;)V", "release-assignment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReleaseAssignmentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$CappedZoneReservationHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n18#2:158\n9#3,4:159\n1#4:163\n*S KotlinDebug\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$CappedZoneReservationHeaderViewHolder\n*L\n128#1:158\n128#1:159,4\n*E\n"})
    /* renamed from: du4$a */
    /* loaded from: classes3.dex */
    public final class C19891a extends C29735w1 {

        /* renamed from: b */
        public final C36871Wm2 f77382b;

        /* renamed from: c */
        public final /* synthetic */ C40031du4 f77383c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nReleaseAssignmentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$CappedZoneReservationHeaderViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,157:1\n1#2:158\n18#3:159\n9#4,4:160\n*S KotlinDebug\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$CappedZoneReservationHeaderViewHolder$1\n*L\n120#1:159\n120#1:160,4\n*E\n"})
        /* renamed from: du4$a$a */
        /* loaded from: classes3.dex */
        public static final class C19892a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C40031du4 f77385h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19892a(C40031du4 c40031du4) {
                super(1);
                this.f77385h = c40031du4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C2637G6 m109397e;
                ZoneAssignmentCappedReservationGroup zoneAssignmentCappedReservationGroup;
                Point zoneCenterPoint;
                Integer safePosition = C19891a.this.getSafePosition();
                if (safePosition == null || (m109397e = this.f77385h.m94545o().m109397e(safePosition.intValue())) == null) {
                    return;
                }
                Object m105816c = m109397e.m105816c();
                if (!(m105816c instanceof Pair)) {
                    m105816c = null;
                }
                Pair pair = (Pair) m105816c;
                if (pair == null || (zoneAssignmentCappedReservationGroup = (ZoneAssignmentCappedReservationGroup) pair.getFirst()) == null || (zoneCenterPoint = zoneAssignmentCappedReservationGroup.getZoneCenterPoint()) == null) {
                    return;
                }
                this.f77385h.m43519w().invoke(zoneCenterPoint);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19891a(C40031du4 c40031du4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f77383c = c40031du4;
            C36871Wm2 m77836a = C36871Wm2.m77836a(view);
            Intrinsics.checkNotNullExpressionValue(m77836a, "bind(view)");
            this.f77382b = m77836a;
            ImageView imageView = m77836a.f42097b;
            Intrinsics.checkNotNullExpressionValue(imageView, "groupTitleBinding.directions");
            C34585Ms2.m94661j(imageView, new C19892a(c40031du4));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f77383c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                this.f77382b.f42098c.setText(((ZoneAssignmentCappedReservationGroup) pair.component1()).getTitle());
                this.f77382b.f42098c.setBackgroundTintList(ColorStateList.valueOf(((ZoneAssignmentGroup) pair.component2()).getColor().getLightMode()));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Ldu4$b;", "Lw1;", "", "position", "", "bind", "Lmb2;", "b", "Lmb2;", "binding", "Landroid/view/View;", "view", "<init>", "(Ldu4;Landroid/view/View;)V", "release-assignment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReleaseAssignmentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$CappedZoneReservationViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,157:1\n18#2:158\n9#3,4:159\n*S KotlinDebug\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$CappedZoneReservationViewHolder\n*L\n148#1:158\n148#1:159,4\n*E\n"})
    /* renamed from: du4$b */
    /* loaded from: classes3.dex */
    public final class C19893b extends C29735w1 {

        /* renamed from: b */
        public final C45176mb2 f77386b;

        /* renamed from: c */
        public final /* synthetic */ C40031du4 f77387c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nReleaseAssignmentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$CappedZoneReservationViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,157:1\n1#2:158\n18#3:159\n9#4,4:160\n*S KotlinDebug\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$CappedZoneReservationViewHolder$1\n*L\n141#1:159\n141#1:160,4\n*E\n"})
        /* renamed from: du4$b$a */
        /* loaded from: classes3.dex */
        public static final class C19894a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C40031du4 f77389h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19894a(C40031du4 c40031du4) {
                super(1);
                this.f77389h = c40031du4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C2637G6 m109397e;
                String id;
                Integer safePosition = C19893b.this.getSafePosition();
                if (safePosition == null || (m109397e = this.f77389h.m94545o().m109397e(safePosition.intValue())) == null) {
                    return;
                }
                Object m105816c = m109397e.m105816c();
                if (!(m105816c instanceof ZoneAssignmentCappedZoneReservation)) {
                    m105816c = null;
                }
                ZoneAssignmentCappedZoneReservation zoneAssignmentCappedZoneReservation = (ZoneAssignmentCappedZoneReservation) m105816c;
                if (zoneAssignmentCappedZoneReservation == null || (id = zoneAssignmentCappedZoneReservation.getId()) == null) {
                    return;
                }
                this.f77389h.m43520v().invoke(id);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19893b(C40031du4 c40031du4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f77387c = c40031du4;
            C45176mb2 m25373a = C45176mb2.m25373a(view);
            Intrinsics.checkNotNullExpressionValue(m25373a, "bind(view)");
            this.f77386b = m25373a;
            TextView textView = m25373a.f98379e;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.cancel");
            C34585Ms2.m94661j(textView, new C19894a(c40031du4));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f77387c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof ZoneAssignmentCappedZoneReservation)) {
                m105816c = null;
            }
            ZoneAssignmentCappedZoneReservation zoneAssignmentCappedZoneReservation = (ZoneAssignmentCappedZoneReservation) m105816c;
            if (zoneAssignmentCappedZoneReservation != null) {
                this.f77386b.f98381g.setText(zoneAssignmentCappedZoneReservation.getBirdCode());
                this.f77386b.f98383i.setText(zoneAssignmentCappedZoneReservation.getTimeRemaining());
                this.f77386b.f98376b.setBatteryLevel(zoneAssignmentCappedZoneReservation.getBatteryLevel() / 100.0f);
                this.f77386b.f98377c.setText(getContext().getString(C45871nl4.battery_percent, Integer.valueOf(zoneAssignmentCappedZoneReservation.getBatteryLevel())));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Ldu4$c;", "Lw1;", "", "position", "", "bind", "Lic2;", "b", "Lic2;", "binding", "Landroid/view/View;", "view", "<init>", "(Ldu4;Landroid/view/View;)V", "release-assignment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReleaseAssignmentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$EmptyTextViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,157:1\n18#2:158\n9#3,4:159\n*S KotlinDebug\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$EmptyTextViewHolder\n*L\n78#1:158\n78#1:159,4\n*E\n"})
    /* renamed from: du4$c */
    /* loaded from: classes3.dex */
    public final class C19895c extends C29735w1 {

        /* renamed from: b */
        public final C42814ic2 f77390b;

        /* renamed from: c */
        public final /* synthetic */ C40031du4 f77391c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19895c(C40031du4 c40031du4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f77391c = c40031du4;
            C42814ic2 m33754a = C42814ic2.m33754a(view);
            Intrinsics.checkNotNullExpressionValue(m33754a, "bind(view)");
            this.f77390b = m33754a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView root = this.f77390b.getRoot();
            Object m105816c = this.f77391c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            root.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Ldu4$d;", "Lw1;", "", "position", "", "bind", "Ljc2;", "b", "Ljc2;", "binding", "Landroid/view/View;", "view", "<init>", "(Ldu4;Landroid/view/View;)V", "release-assignment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReleaseAssignmentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n18#2:158\n9#3,4:159\n1#4:163\n*S KotlinDebug\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$HeaderViewHolder\n*L\n62#1:158\n62#1:159,4\n*E\n"})
    /* renamed from: du4$d */
    /* loaded from: classes3.dex */
    public final class C19896d extends C29735w1 {

        /* renamed from: b */
        public final C43407jc2 f77392b;

        /* renamed from: c */
        public final /* synthetic */ C40031du4 f77393c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19896d(C40031du4 c40031du4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f77393c = c40031du4;
            C43407jc2 m30204a = C43407jc2.m30204a(view);
            Intrinsics.checkNotNullExpressionValue(m30204a, "bind(view)");
            this.f77392b = m30204a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Drawable drawable;
            Object m105816c = this.f77393c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof ZoneAssignmentGroup)) {
                m105816c = null;
            }
            ZoneAssignmentGroup zoneAssignmentGroup = (ZoneAssignmentGroup) m105816c;
            if (zoneAssignmentGroup != null) {
                this.f77392b.f93019c.setText(zoneAssignmentGroup.getTitle());
                Drawable m94299e = NA0.m94299e(getContext(), C39892dg4.ic_filled_dot_16);
                if (m94299e != null && (drawable = m94299e.mutate()) != null) {
                    drawable.setTint(zoneAssignmentGroup.getColor().getLightMode());
                } else {
                    drawable = null;
                }
                this.f77392b.f93019c.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                TextView textView = this.f77392b.f93018b;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.description");
                C49520tu6.setTextAndVisibility$default(textView, zoneAssignmentGroup.getDescription(), 0, 2, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Ldu4$e;", "Lw1;", "", "position", "", "bind", "LVe2;", "b", "LVe2;", "binding", "LWm2;", "c", "LWm2;", "groupTitleBinding", "Landroid/view/View;", "view", "<init>", "(Ldu4;Landroid/view/View;)V", "release-assignment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReleaseAssignmentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$ReleaseAssignmentViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n18#2:158\n9#3,4:159\n1#4:163\n*S KotlinDebug\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$ReleaseAssignmentViewHolder\n*L\n97#1:158\n97#1:159,4\n*E\n"})
    /* renamed from: du4$e */
    /* loaded from: classes3.dex */
    public final class C19897e extends C29735w1 {

        /* renamed from: b */
        public final C36565Ve2 f77394b;

        /* renamed from: c */
        public final C36871Wm2 f77395c;

        /* renamed from: d */
        public final /* synthetic */ C40031du4 f77396d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nReleaseAssignmentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$ReleaseAssignmentViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,157:1\n1#2:158\n18#3:159\n9#4,4:160\n*S KotlinDebug\n*F\n+ 1 ReleaseAssignmentAdapter.kt\nco/bird/android/feature/operator/releaseassignment/adapter/ReleaseAssignmentAdapter$ReleaseAssignmentViewHolder$1\n*L\n89#1:159\n89#1:160,4\n*E\n"})
        /* renamed from: du4$e$a */
        /* loaded from: classes3.dex */
        public static final class C19898a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C40031du4 f77398h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19898a(C40031du4 c40031du4) {
                super(1);
                this.f77398h = c40031du4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C2637G6 m109397e;
                ZoneAssignmentReleaseAssignment zoneAssignmentReleaseAssignment;
                Point zoneCenterPoint;
                Integer safePosition = C19897e.this.getSafePosition();
                if (safePosition == null || (m109397e = this.f77398h.m94545o().m109397e(safePosition.intValue())) == null) {
                    return;
                }
                Object m105816c = m109397e.m105816c();
                if (!(m105816c instanceof Pair)) {
                    m105816c = null;
                }
                Pair pair = (Pair) m105816c;
                if (pair == null || (zoneAssignmentReleaseAssignment = (ZoneAssignmentReleaseAssignment) pair.getFirst()) == null || (zoneCenterPoint = zoneAssignmentReleaseAssignment.getZoneCenterPoint()) == null) {
                    return;
                }
                this.f77398h.m43519w().invoke(zoneCenterPoint);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19897e(C40031du4 c40031du4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f77396d = c40031du4;
            C36565Ve2 m79619a = C36565Ve2.m79619a(view);
            Intrinsics.checkNotNullExpressionValue(m79619a, "bind(view)");
            this.f77394b = m79619a;
            C36871Wm2 m77836a = C36871Wm2.m77836a(view);
            Intrinsics.checkNotNullExpressionValue(m77836a, "bind(view)");
            this.f77395c = m77836a;
            ImageView imageView = m77836a.f42097b;
            Intrinsics.checkNotNullExpressionValue(imageView, "groupTitleBinding.directions");
            C34585Ms2.m94661j(imageView, new C19898a(c40031du4));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            Drawable drawable;
            ColorStateList colorStateList;
            Drawable drawable2;
            Object m105816c = this.f77396d.m94545o().m109397e(i).m105816c();
            ColorStateList colorStateList2 = null;
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                ZoneAssignmentReleaseAssignment zoneAssignmentReleaseAssignment = (ZoneAssignmentReleaseAssignment) pair.component1();
                this.f77395c.f42098c.setText(zoneAssignmentReleaseAssignment.getTitle());
                this.f77395c.f42098c.setBackgroundTintList(ColorStateList.valueOf(((ZoneAssignmentGroup) pair.component2()).getColor().getLightMode()));
                ImageView imageView = this.f77394b.f39375c;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.descriptionIcon");
                boolean z2 = true;
                if (zoneAssignmentReleaseAssignment.getDescriptionLeadingIcon() != null) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(imageView, z, 0, 2, null);
                ImageView imageView2 = this.f77394b.f39375c;
                ClientIcon descriptionLeadingIcon = zoneAssignmentReleaseAssignment.getDescriptionLeadingIcon();
                if (descriptionLeadingIcon != null) {
                    drawable = C33341Hk0.m103484a(descriptionLeadingIcon, getContext());
                } else {
                    drawable = null;
                }
                imageView2.setImageDrawable(drawable);
                ImageView imageView3 = this.f77394b.f39375c;
                ThemedColors descriptionLeadingIconColor = zoneAssignmentReleaseAssignment.getDescriptionLeadingIconColor();
                if (descriptionLeadingIconColor != null) {
                    colorStateList = ColorStateList.valueOf(descriptionLeadingIconColor.getLightMode());
                } else {
                    colorStateList = null;
                }
                imageView3.setImageTintList(colorStateList);
                this.f77394b.f39374b.setText(zoneAssignmentReleaseAssignment.getDescription());
                this.f77394b.f39381i.setText(zoneAssignmentReleaseAssignment.getDescriptionSubtitle());
                this.f77394b.f39377e.setText(zoneAssignmentReleaseAssignment.getDueAt());
                ImageView imageView4 = this.f77394b.f39380h;
                Intrinsics.checkNotNullExpressionValue(imageView4, "binding.status");
                if (zoneAssignmentReleaseAssignment.getDueAtTrailingIcon() == null) {
                    z2 = false;
                }
                C49520tu6.show$default(imageView4, z2, 0, 2, null);
                ImageView imageView5 = this.f77394b.f39380h;
                ClientIcon dueAtTrailingIcon = zoneAssignmentReleaseAssignment.getDueAtTrailingIcon();
                if (dueAtTrailingIcon != null) {
                    drawable2 = C33341Hk0.m103484a(dueAtTrailingIcon, getContext());
                } else {
                    drawable2 = null;
                }
                imageView5.setImageDrawable(drawable2);
                ImageView imageView6 = this.f77394b.f39380h;
                ThemedColors dueAtTrailingIconColor = zoneAssignmentReleaseAssignment.getDueAtTrailingIconColor();
                if (dueAtTrailingIconColor != null) {
                    colorStateList2 = ColorStateList.valueOf(dueAtTrailingIconColor.getLightMode());
                }
                imageView6.setImageTintList(colorStateList2);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: du4$f */
    /* loaded from: classes3.dex */
    public static final class C19899f extends Lambda implements Function1<String, Unit> {

        /* renamed from: g */
        public static final C19899f f77399g = new C19899f();

        public C19899f() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/Point;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Point;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: du4$g */
    /* loaded from: classes3.dex */
    public static final class C19900g extends Lambda implements Function1<Point, Unit> {

        /* renamed from: g */
        public static final C19900g f77400g = new C19900g();

        public C19900g() {
            super(1);
        }

        /* renamed from: a */
        public final void m43516a(Point it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Point point) {
            m43516a(point);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C42403hu4());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C40624eu4();
    }

    /* renamed from: v */
    public final Function1<String, Unit> m43520v() {
        return this.f77381d;
    }

    /* renamed from: w */
    public final Function1<Point, Unit> m43519w() {
        return this.f77380c;
    }

    /* renamed from: x */
    public final void m43518x(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f77381d = function1;
    }

    /* renamed from: y */
    public final void m43517y(Function1<? super Point, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f77380c = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C50001uj4.item_group_header ? new C19896d(this, m41761u) : i == C50001uj4.item_group_empty_text ? new C19895c(this, m41761u) : i == C50001uj4.item_release_assignment ? new C19897e(this, m41761u) : i == C50001uj4.item_capped_zone_reservation_group_header ? new C19891a(this, m41761u) : i == C50001uj4.item_capped_zone_reservation ? new C19893b(this, m41761u) : new C29735w1(m41761u);
    }
}
