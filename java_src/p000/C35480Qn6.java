package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C35480Qn6;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u0014B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000eR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\n0\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u000f0\u000f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u001d"}, m28432d2 = {"LQn6;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBird;", "w", "v", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "addBirdsClickSubject", DateTokenConverter.CONVERTER_KEY, "birdClicksSubject", "<init>", "()V", C17296a.f69688o, "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qn6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35480Qn6 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<Unit> f30949c;

    /* renamed from: d */
    public final C24558d<WireBird> f30950d;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LQn6$a;", "Lw1;", "", "position", "", "bind", "LYa2;", "b", "LYa2;", "binding", "Landroid/view/View;", "view", "<init>", "(LQn6;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nVehiclesInBatchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclesInBatchAdapter.kt\nco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchAdapter$BirdViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n18#2:98\n18#2:103\n9#3,4:99\n9#3,4:104\n1#4:108\n*S KotlinDebug\n*F\n+ 1 VehiclesInBatchAdapter.kt\nco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchAdapter$BirdViewHolder\n*L\n79#1:98\n72#1:103\n79#1:99,4\n72#1:104,4\n*E\n"})
    /* renamed from: Qn6$a */
    /* loaded from: classes3.dex */
    public final class C6906a extends C29735w1 {

        /* renamed from: b */
        public final C37231Ya2 f30951b;

        /* renamed from: c */
        public final /* synthetic */ C35480Qn6 f30952c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6906a(final C35480Qn6 c35480Qn6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f30952c = c35480Qn6;
            C37231Ya2 m74891a = C37231Ya2.m74891a(view);
            Intrinsics.checkNotNullExpressionValue(m74891a, "bind(view)");
            this.f30951b = m74891a;
            m74891a.getRoot().setOnClickListener(new View.OnClickListener() { // from class: Pn6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C35480Qn6.C6906a.m87918b(C35480Qn6.C6906a.this, c35480Qn6, view2);
                }
            });
        }

        /* renamed from: b */
        public static final void m87918b(C6906a this$0, C35480Qn6 this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (this$0.getAdapterPosition() != -1) {
                Object m105816c = this$1.m94545o().m109394h().get(this$0.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof WireBird)) {
                    m105816c = null;
                }
                WireBird wireBird = (WireBird) m105816c;
                if (wireBird != null) {
                    this$1.f30950d.onNext(wireBird);
                }
            }
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f30952c.m94545o().m109394h().get(i).m105816c();
            String str = null;
            if (!(m105816c instanceof WireBird)) {
                m105816c = null;
            }
            WireBird wireBird = (WireBird) m105816c;
            TextView textView = this.f30951b.f46034e;
            if (wireBird != null) {
                str = wireBird.getCode();
            }
            textView.setText(str);
            if (wireBird != null) {
                int batteryLevel = wireBird.getBatteryLevel();
                this.f30951b.f46033d.setColor(NA0.m94301c(getContext(), C32364Df4.colorPrimary));
                this.f30951b.f46033d.setPercent(batteryLevel);
                this.f30951b.f46032c.setText(C51916xx1.f118396a.m4411a(getContext(), wireBird.getBatteryLevel(), true));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LQn6$b;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "button", "Landroid/view/View;", "view", "<init>", "(LQn6;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nVehiclesInBatchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclesInBatchAdapter.kt\nco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchAdapter$ButtonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,97:1\n18#2:98\n9#3,4:99\n*S KotlinDebug\n*F\n+ 1 VehiclesInBatchAdapter.kt\nco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchAdapter$ButtonViewHolder\n*L\n62#1:98\n62#1:99,4\n*E\n"})
    /* renamed from: Qn6$b */
    /* loaded from: classes3.dex */
    public final class C6907b extends C29735w1 {

        /* renamed from: b */
        public final Button f30953b;

        /* renamed from: c */
        public final /* synthetic */ C35480Qn6 f30954c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6907b(final C35480Qn6 c35480Qn6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f30954c = c35480Qn6;
            Button button = (Button) view;
            this.f30953b = button;
            button.setOnClickListener(new View.OnClickListener() { // from class: Rn6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C35480Qn6.C6907b.m87916b(C35480Qn6.this, view2);
                }
            });
        }

        /* renamed from: b */
        public static final void m87916b(C35480Qn6 this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f30949c.onNext(Unit.INSTANCE);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f30954c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            this.f30953b.setText((String) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LQn6$c;", "Lw1;", "", "position", "", "bind", "Lkc2;", "b", "Lkc2;", "binding", "Landroid/view/View;", "view", "<init>", "(LQn6;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nVehiclesInBatchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclesInBatchAdapter.kt\nco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,97:1\n18#2:98\n9#3,4:99\n*S KotlinDebug\n*F\n+ 1 VehiclesInBatchAdapter.kt\nco/bird/android/feature/servicecenter/batches/vehiclesinbatch/VehiclesInBatchAdapter$HeaderViewHolder\n*L\n93#1:98\n93#1:99,4\n*E\n"})
    /* renamed from: Qn6$c */
    /* loaded from: classes3.dex */
    public final class C6908c extends C29735w1 {

        /* renamed from: b */
        public final C44000kc2 f30955b;

        /* renamed from: c */
        public final /* synthetic */ C35480Qn6 f30956c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6908c(C35480Qn6 c35480Qn6, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f30956c = c35480Qn6;
            C44000kc2 m28795a = C44000kc2.m28795a(view);
            Intrinsics.checkNotNullExpressionValue(m28795a, "bind(view)");
            this.f30955b = m28795a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView textView = this.f30955b.f94636b;
            Object m105816c = this.f30956c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            textView.setText((CharSequence) m105816c);
        }
    }

    public C35480Qn6() {
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f30949c = m31902e;
        C24558d<WireBird> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<WireBird>()");
        this.f30950d = m31902e2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C36884Wn6());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C35948Sn6();
    }

    /* renamed from: v */
    public final Observable<Unit> m87921v() {
        Observable<Unit> hide = this.f30949c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "addBirdsClickSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<WireBird> m87920w() {
        Observable<WireBird> hide = this.f30950d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "birdClicksSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C45268mk4.item_button ? new C6907b(this, m41761u) : i == C34740Nj4.item_bird_with_battery ? new C6906a(this, m41761u) : i == C34740Nj4.item_header ? new C6908c(this, m41761u) : new C29735w1(m41761u);
    }
}
