package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.Bird;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u00192\u00020\u0001:\u0003\u001a\u001b\rB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0014\u0010\u000b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, m28432d2 = {"LNl6;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lkotlin/Function0;", "", "onDoneCLicks", "w", "LYP3;", "c", "LYP3;", "v", "()LYP3;", "x", "(LYP3;)V", "peekHelper", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function0;", "onDoneClicks", "<init>", "()V", "e", C17296a.f69688o, "b", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Nl6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34760Nl6 extends AbstractC52206yS0 {

    /* renamed from: e */
    public static final C5674a f25112e = new C5674a(null);

    /* renamed from: c */
    public YP3 f25113c;

    /* renamed from: d */
    public Function0<Unit> f25114d = C5678d.f25120g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LNl6$a;", "", "", "VEHICLE_PEEK_KEY", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Nl6$a */
    /* loaded from: classes3.dex */
    public static final class C5674a {
        public /* synthetic */ C5674a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5674a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LNl6$b;", "Lw1;", "", "position", "", "bind", "Lxf2;", "b", "Lxf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LNl6;Landroid/view/View;)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nVehicleInvolvedScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleInvolvedScanAdapter.kt\nco/bird/android/feature/complaintresolution/scanner/adapters/VehicleInvolvedScanAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,64:1\n18#2:65\n9#3,4:66\n*S KotlinDebug\n*F\n+ 1 VehicleInvolvedScanAdapter.kt\nco/bird/android/feature/complaintresolution/scanner/adapters/VehicleInvolvedScanAdapter$HeaderViewHolder\n*L\n46#1:65\n46#1:66,4\n*E\n"})
    /* renamed from: Nl6$b */
    /* loaded from: classes3.dex */
    public final class C5675b extends C29735w1 {

        /* renamed from: b */
        public final C51737xf2 f25115b;

        /* renamed from: c */
        public final /* synthetic */ C34760Nl6 f25116c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Nl6$b$a */
        /* loaded from: classes3.dex */
        public static final class C5676a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C34760Nl6 f25117g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5676a(C34760Nl6 c34760Nl6) {
                super(1);
                this.f25117g = c34760Nl6;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f25117g.f25114d.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5675b(C34760Nl6 c34760Nl6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f25116c = c34760Nl6;
            C51737xf2 m4896a = C51737xf2.m4896a(view);
            Intrinsics.checkNotNullExpressionValue(m4896a, "bind(view)");
            this.f25115b = m4896a;
            Button button = m4896a.f117946c;
            Intrinsics.checkNotNullExpressionValue(button, "binding.done");
            C34585Ms2.m94661j(button, new C5676a(c34760Nl6));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView textView = this.f25115b.f117945b;
            Object m105816c = this.f25116c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Integer)) {
                m105816c = null;
            }
            textView.setText(String.valueOf(m105816c));
            YP3 m93475v = this.f25116c.m93475v();
            if (m93475v != null) {
                View itemView = this.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                m93475v.m75093c("header", itemView);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LNl6$c;", "Lw1;", "", "position", "", "bind", "Lwf2;", "b", "Lwf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LNl6;Landroid/view/View;)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nVehicleInvolvedScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleInvolvedScanAdapter.kt\nco/bird/android/feature/complaintresolution/scanner/adapters/VehicleInvolvedScanAdapter$VehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,64:1\n18#2:65\n9#3,4:66\n*S KotlinDebug\n*F\n+ 1 VehicleInvolvedScanAdapter.kt\nco/bird/android/feature/complaintresolution/scanner/adapters/VehicleInvolvedScanAdapter$VehicleViewHolder\n*L\n55#1:65\n55#1:66,4\n*E\n"})
    /* renamed from: Nl6$c */
    /* loaded from: classes3.dex */
    public final class C5677c extends C29735w1 {

        /* renamed from: b */
        public final C51144wf2 f25118b;

        /* renamed from: c */
        public final /* synthetic */ C34760Nl6 f25119c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5677c(C34760Nl6 c34760Nl6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f25119c = c34760Nl6;
            C51144wf2 m6537a = C51144wf2.m6537a(view);
            Intrinsics.checkNotNullExpressionValue(m6537a, "bind(view)");
            this.f25118b = m6537a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f25119c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Bird)) {
                m105816c = null;
            }
            Bird bird = (Bird) m105816c;
            if (bird != null) {
                C34760Nl6 c34760Nl6 = this.f25119c;
                this.f25118b.f116317c.setText(bird.getCode());
                this.f25118b.f116318d.setText(bird.getModel());
                YP3 m93475v = c34760Nl6.m93475v();
                if (m93475v != null) {
                    View itemView = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    m93475v.m75093c("vehicle", itemView);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Nl6$d */
    /* loaded from: classes3.dex */
    public static final class C5678d extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public static final C5678d f25120g = new C5678d();

        public C5678d() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: v */
    public final YP3 m93475v() {
        return this.f25113c;
    }

    /* renamed from: w */
    public final void m93474w(Function0<Unit> onDoneCLicks) {
        Intrinsics.checkNotNullParameter(onDoneCLicks, "onDoneCLicks");
        this.f25114d = onDoneCLicks;
    }

    /* renamed from: x */
    public final void m93473x(YP3 yp3) {
        this.f25113c = yp3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C36603Vi4.item_scanner_header ? new C5675b(this, m41761u) : i == C36603Vi4.item_scanned_vehicle ? new C5677c(this, m41761u) : new C29735w1(m41761u);
    }
}
