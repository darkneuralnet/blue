package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.VehicleHibernationCategory;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.nestedstructures.HibernationMessage;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00182\u00020\u0001:\u0003\u0019\u001a\u0011B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\bJ\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\t0\bR:\u0010\u0013\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b \u0010*\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t0\t0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R:\u0010\u0015\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r \u0010*\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t0\t0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u001b"}, m28432d2 = {"LdM1;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "", "v", "Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;", "g0", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "dotsClicksSubject", DateTokenConverter.CONVERTER_KEY, "infoClicksSubject", "<init>", "()V", "e", C17296a.f69688o, "b", "hibernation-scan_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dM1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39703dM1 extends AbstractC52206yS0 {

    /* renamed from: e */
    public static final C19738a f76488e = new C19738a(null);

    /* renamed from: f */
    public static final Set<VehicleHibernationCategory> f76489f;

    /* renamed from: c */
    public final C24558d<Pair<Bird, String>> f76490c;

    /* renamed from: d */
    public final C24558d<Pair<Bird, HibernationMessage>> f76491d;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"LdM1$a;", "", "", "Lco/bird/android/model/constant/VehicleHibernationCategory;", "FAILED_STATES", "Ljava/util/Set;", "<init>", "()V", "hibernation-scan_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: dM1$a */
    /* loaded from: classes3.dex */
    public static final class C19738a {
        public /* synthetic */ C19738a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C19738a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LdM1$b;", "Lw1;", "", "position", "", "bind", "Lnc2;", "b", "Lnc2;", "binding", "Landroid/view/View;", "view", "<init>", "(LdM1;Landroid/view/View;)V", "hibernation-scan_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHibernationScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HibernationScanAdapter.kt\nco/bird/android/feature/hibernationscan/adapter/HibernationScanAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n18#2:94\n9#3,4:95\n1#4:99\n*S KotlinDebug\n*F\n+ 1 HibernationScanAdapter.kt\nco/bird/android/feature/hibernationscan/adapter/HibernationScanAdapter$HeaderViewHolder\n*L\n48#1:94\n48#1:95,4\n*E\n"})
    /* renamed from: dM1$b */
    /* loaded from: classes3.dex */
    public final class C19739b extends C29735w1 {

        /* renamed from: b */
        public final C45779nc2 f76492b;

        /* renamed from: c */
        public final /* synthetic */ C39703dM1 f76493c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19739b(C39703dM1 c39703dM1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f76493c = c39703dM1;
            C45779nc2 m23435a = C45779nc2.m23435a(view);
            Intrinsics.checkNotNullExpressionValue(m23435a, "bind(view)");
            this.f76492b = m23435a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            Object m105816c = this.f76493c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                int intValue = ((Number) pair.component1()).intValue();
                int intValue2 = ((Number) pair.component2()).intValue();
                this.f76492b.f100210f.setText(String.valueOf(intValue));
                Group group = this.f76492b.f100208d;
                Intrinsics.checkNotNullExpressionValue(group, "binding.failedGroup");
                if (intValue2 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(group, z, 0, 2, null);
                this.f76492b.f100207c.setText(String.valueOf(intValue2));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LdM1$c;", "Lw1;", "", "position", "", "bind", "Loc2;", "b", "Loc2;", "binding", "Landroid/view/View;", "view", "<init>", "(LdM1;Landroid/view/View;)V", "hibernation-scan_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHibernationScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HibernationScanAdapter.kt\nco/bird/android/feature/hibernationscan/adapter/HibernationScanAdapter$VehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,93:1\n18#2:94\n9#3,4:95\n*S KotlinDebug\n*F\n+ 1 HibernationScanAdapter.kt\nco/bird/android/feature/hibernationscan/adapter/HibernationScanAdapter$VehicleViewHolder\n*L\n78#1:94\n78#1:95,4\n*E\n"})
    /* renamed from: dM1$c */
    /* loaded from: classes3.dex */
    public final class C19740c extends C29735w1 {

        /* renamed from: b */
        public final C46372oc2 f76494b;

        /* renamed from: c */
        public final /* synthetic */ C39703dM1 f76495c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nHibernationScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HibernationScanAdapter.kt\nco/bird/android/feature/hibernationscan/adapter/HibernationScanAdapter$VehicleViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,93:1\n18#2:94\n9#3,4:95\n*S KotlinDebug\n*F\n+ 1 HibernationScanAdapter.kt\nco/bird/android/feature/hibernationscan/adapter/HibernationScanAdapter$VehicleViewHolder$1\n*L\n63#1:94\n63#1:95,4\n*E\n"})
        /* renamed from: dM1$c$a */
        /* loaded from: classes3.dex */
        public static final class C19741a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C39703dM1 f76497h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19741a(C39703dM1 c39703dM1) {
                super(1);
                this.f76497h = c39703dM1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                int adapterPosition = C19740c.this.getAdapterPosition();
                if (adapterPosition == -1) {
                    return;
                }
                Object m105816c = this.f76497h.m94545o().m109397e(adapterPosition).m105816c();
                if (!(m105816c instanceof HM1)) {
                    m105816c = null;
                }
                HM1 hm1 = (HM1) m105816c;
                if (hm1 != null) {
                    C39703dM1 c39703dM1 = this.f76497h;
                    Bird m103963c = hm1.m103963c();
                    if (m103963c == null) {
                        return;
                    }
                    String m103958h = hm1.m103958h();
                    HibernationMessage m103960f = hm1.m103960f();
                    if (m103958h != null) {
                        c39703dM1.f76490c.onNext(TuplesKt.m28425to(m103963c, m103958h));
                    } else if (m103960f != null) {
                        c39703dM1.f76491d.onNext(TuplesKt.m28425to(m103963c, m103960f));
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19740c(C39703dM1 c39703dM1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f76495c = c39703dM1;
            C46372oc2 m20795a = C46372oc2.m20795a(view);
            Intrinsics.checkNotNullExpressionValue(m20795a, "bind(view)");
            this.f76494b = m20795a;
            ConstraintLayout root = m20795a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C19741a(c39703dM1));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f76495c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof HM1)) {
                m105816c = null;
            }
            HM1 hm1 = (HM1) m105816c;
            if (hm1 != null) {
                this.f76494b.f102194e.setText(hm1.m103961e());
                this.f76494b.f102191b.setBatteryLevel(hm1.m103964b() / 100.0f);
                boolean z = true;
                this.f76494b.f102192c.setText(this.itemView.getContext().getString(C45871nl4.battery_percent, Integer.valueOf(hm1.m103964b())));
                this.f76494b.f102197h.setText(hm1.m103957i());
                this.f76494b.f102197h.setTextColor(hm1.m103956j());
                ImageView imageView = this.f76494b.f102195f;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.icon");
                C49520tu6.show$default(imageView, C39703dM1.f76489f.contains(hm1.m103962d()), 0, 2, null);
                ImageView imageView2 = this.f76494b.f102196g;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.moreIcon");
                if (hm1.m103959g() == null) {
                    z = false;
                }
                C49520tu6.show$default(imageView2, z, 0, 2, null);
                this.f76494b.f102196g.setImageDrawable(hm1.m103959g());
            }
        }
    }

    static {
        Set<VehicleHibernationCategory> of;
        of = SetsKt__SetsKt.setOf((Object[]) new VehicleHibernationCategory[]{VehicleHibernationCategory.FAILED, VehicleHibernationCategory.NOT_HIBERNATED});
        f76489f = of;
    }

    public C39703dM1() {
        C24558d<Pair<Bird, String>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<Bird, String>>()");
        this.f76490c = m31902e;
        C24558d<Pair<Bird, HibernationMessage>> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Pair<Bird, HibernationMessage>>()");
        this.f76491d = m31902e2;
    }

    /* renamed from: g0 */
    public final Observable<Pair<Bird, HibernationMessage>> m44358g0() {
        Observable<Pair<Bird, HibernationMessage>> hide = this.f76491d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "infoClicksSubject.hide()");
        return hide;
    }

    /* renamed from: v */
    public final Observable<Pair<Bird, String>> m44357v() {
        Observable<Pair<Bird, String>> hide = this.f76490c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "dotsClicksSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C41700gj4.item_hibernation_header ? new C19739b(this, m41761u) : i == C41700gj4.item_hibernation_vehicle ? new C19740c(this, m41761u) : new C29735w1(m41761u);
    }
}
