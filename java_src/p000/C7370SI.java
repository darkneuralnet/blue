package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.share.internal.C17296a;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\r\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m28432d2 = {"LSI;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/subjects/d;", "LTk5;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "vehicleSubject", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.bird-air-diagnostics"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: SI */
/* loaded from: classes3.dex */
public final class C7370SI extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<C36154Tk5> f33429c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LSI$a;", "Lw1;", "", "position", "", "bind", "LPa2;", "b", "LPa2;", "binding", "Landroid/view/View;", "view", "<init>", "(LSI;Landroid/view/View;)V", "co.bird.android.feature.bird-air-diagnostics"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBirdAirScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdAirScanAdapter.kt\nco/bird/android/feature/birdairdiagnostics/BirdAirScanAdapter$BirdAirViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,47:1\n18#2:48\n9#3,4:49\n*S KotlinDebug\n*F\n+ 1 BirdAirScanAdapter.kt\nco/bird/android/feature/birdairdiagnostics/BirdAirScanAdapter$BirdAirViewHolder\n*L\n40#1:48\n40#1:49,4\n*E\n"})
    /* renamed from: SI$a */
    /* loaded from: classes3.dex */
    public final class C7371a extends C29735w1 {

        /* renamed from: b */
        public final C35125Pa2 f33430b;

        /* renamed from: c */
        public final /* synthetic */ C7370SI f33431c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nBirdAirScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdAirScanAdapter.kt\nco/bird/android/feature/birdairdiagnostics/BirdAirScanAdapter$BirdAirViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n18#2:48\n9#3,4:49\n1#4:53\n*S KotlinDebug\n*F\n+ 1 BirdAirScanAdapter.kt\nco/bird/android/feature/birdairdiagnostics/BirdAirScanAdapter$BirdAirViewHolder$1\n*L\n35#1:48\n35#1:49,4\n*E\n"})
        /* renamed from: SI$a$a */
        /* loaded from: classes3.dex */
        public static final class C7372a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C7370SI f33432g;

            /* renamed from: h */
            public final /* synthetic */ C7371a f33433h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7372a(C7370SI c7370si, C7371a c7371a) {
                super(1);
                this.f33432g = c7370si;
                this.f33433h = c7371a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f33432g.m94545o().m109397e(this.f33433h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof C36154Tk5)) {
                    m105816c = null;
                }
                C36154Tk5 c36154Tk5 = (C36154Tk5) m105816c;
                if (c36154Tk5 != null) {
                    this.f33432g.f33429c.onNext(c36154Tk5);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7371a(C7370SI c7370si, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f33431c = c7370si;
            C35125Pa2 m90083a = C35125Pa2.m90083a(view);
            Intrinsics.checkNotNullExpressionValue(m90083a, "bind(view)");
            this.f33430b = m90083a;
            C34585Ms2.m94661j(view, new C7372a(c7370si, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f33431c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C36154Tk5)) {
                m105816c = null;
            }
            C36154Tk5 c36154Tk5 = (C36154Tk5) m105816c;
            if (c36154Tk5 != null) {
                this.f33430b.f28709c.setText(C36388Uk5.m80922c(c36154Tk5));
                this.f33430b.f28708b.setText(c36154Tk5.m83016a().mo17280e());
            }
        }
    }

    public C7370SI() {
        C24558d<C36154Tk5> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<ScanResult>()");
        this.f33429c = m31902e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C41117fk4.item_bird_air_scanned ? new C7371a(this, m41761u) : new C29735w1(m41761u);
    }
}
