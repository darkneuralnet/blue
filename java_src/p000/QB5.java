package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.QB5;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R:\u0010\u0010\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \r*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m28432d2 = {"LQB5;", "LyS0;", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "v", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "missingSkuReasonInputSubject", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "b", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: QB5 */
/* loaded from: classes3.dex */
public final class QB5 extends AbstractC52206yS0 {

    /* renamed from: d */
    public static final C6709a f30000d = new C6709a(null);

    /* renamed from: c */
    public final C24558d<Pair<String, String>> f30001c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LQB5$a;", "", "", "LOST_IN_TRANSIT", "Ljava/lang/String;", "VEHICLE_LEFT_BEHIND", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: QB5$a */
    /* loaded from: classes3.dex */
    public static final class C6709a {
        public /* synthetic */ C6709a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C6709a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LQB5$b;", "Lw1;", "", "position", "", "bind", "LHf2;", "b", "LHf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LQB5;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSkuInvestigationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuInvestigationAdapter.kt\nco/bird/android/feature/transferorder/sku/investigation/adapters/SkuInvestigationAdapter$MissingSkuViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,82:1\n18#2:83\n18#2:88\n18#2:93\n18#2:98\n9#3,4:84\n9#3,4:89\n9#3,4:94\n9#3,4:99\n*S KotlinDebug\n*F\n+ 1 SkuInvestigationAdapter.kt\nco/bird/android/feature/transferorder/sku/investigation/adapters/SkuInvestigationAdapter$MissingSkuViewHolder\n*L\n75#1:83\n40#1:88\n48#1:93\n56#1:98\n75#1:84,4\n40#1:89,4\n48#1:94,4\n56#1:99,4\n*E\n"})
    /* renamed from: QB5$b */
    /* loaded from: classes3.dex */
    public final class C6710b extends C29735w1 {

        /* renamed from: b */
        public final C33298Hf2 f30002b;

        /* renamed from: c */
        public final /* synthetic */ QB5 f30003c;

        @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, m28432d2 = {"QB5$b$a", "Ld36;", "", "s", "", "start", "before", "count", "", "onTextChanged", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nSkuInvestigationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuInvestigationAdapter.kt\nco/bird/android/feature/transferorder/sku/investigation/adapters/SkuInvestigationAdapter$MissingSkuViewHolder$4\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,82:1\n18#2:83\n9#3,4:84\n*S KotlinDebug\n*F\n+ 1 SkuInvestigationAdapter.kt\nco/bird/android/feature/transferorder/sku/investigation/adapters/SkuInvestigationAdapter$MissingSkuViewHolder$4\n*L\n66#1:83\n66#1:84,4\n*E\n"})
        /* renamed from: QB5$b$a */
        /* loaded from: classes3.dex */
        public static final class C6711a extends C39530d36 {

            /* renamed from: c */
            public final /* synthetic */ QB5 f30005c;

            public C6711a(QB5 qb5) {
                this.f30005c = qb5;
            }

            @Override // p000.C39530d36, android.text.TextWatcher
            public void onTextChanged(CharSequence s, int i, int i2, int i3) {
                Intrinsics.checkNotNullParameter(s, "s");
                if (C6710b.this.f30002b.f13734f.isChecked()) {
                    Object m105816c = this.f30005c.m94545o().m109397e(C6710b.this.getAdapterPosition()).m105816c();
                    if (!(m105816c instanceof C41988hC5)) {
                        m105816c = null;
                    }
                    C41988hC5 c41988hC5 = (C41988hC5) m105816c;
                    if (c41988hC5 != null) {
                        this.f30005c.f30001c.onNext(TuplesKt.m28425to(c41988hC5.m36627b(), s.toString()));
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6710b(final QB5 qb5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f30003c = qb5;
            C33298Hf2 m103556a = C33298Hf2.m103556a(view);
            Intrinsics.checkNotNullExpressionValue(m103556a, "bind(view)");
            this.f30002b = m103556a;
            m103556a.f13731c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: RB5
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    QB5.C6710b.m88789i(QB5.this, this, compoundButton, z);
                }
            });
            m103556a.f13730b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: SB5
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    QB5.C6710b.m88788j(QB5.this, this, compoundButton, z);
                }
            });
            m103556a.f13734f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: TB5
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    QB5.C6710b.m88787k(QB5.this, this, compoundButton, z);
                }
            });
            m103556a.f13733e.addTextChangedListener(new C6711a(qb5));
        }

        /* renamed from: i */
        public static final void m88789i(QB5 this$0, C6710b this$1, CompoundButton compoundButton, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (z) {
                Object m105816c = this$0.m94545o().m109397e(this$1.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof C41988hC5)) {
                    m105816c = null;
                }
                C41988hC5 c41988hC5 = (C41988hC5) m105816c;
                if (c41988hC5 != null) {
                    this$0.f30001c.onNext(TuplesKt.m28425to(c41988hC5.m36627b(), "Lost in transit"));
                }
            }
        }

        /* renamed from: j */
        public static final void m88788j(QB5 this$0, C6710b this$1, CompoundButton compoundButton, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (z) {
                Object m105816c = this$0.m94545o().m109397e(this$1.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof C41988hC5)) {
                    m105816c = null;
                }
                C41988hC5 c41988hC5 = (C41988hC5) m105816c;
                if (c41988hC5 != null) {
                    this$0.f30001c.onNext(TuplesKt.m28425to(c41988hC5.m36627b(), "Vehicle left at origin"));
                }
            }
        }

        /* renamed from: k */
        public static final void m88787k(QB5 this$0, C6710b this$1, CompoundButton compoundButton, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (z) {
                Object m105816c = this$0.m94545o().m109397e(this$1.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof C41988hC5)) {
                    m105816c = null;
                }
                C41988hC5 c41988hC5 = (C41988hC5) m105816c;
                if (c41988hC5 != null) {
                    this$0.f30001c.onNext(TuplesKt.m28425to(c41988hC5.m36627b(), this$1.f30002b.f13733e.getText().toString()));
                }
            }
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f30003c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C41988hC5)) {
                m105816c = null;
            }
            C41988hC5 c41988hC5 = (C41988hC5) m105816c;
            if (c41988hC5 != null) {
                this.f30002b.f13737i.setText(c41988hC5.m36625d());
                this.f30002b.f13735g.setImageDrawable(c41988hC5.m36626c());
            }
        }
    }

    public QB5() {
        C24558d<Pair<String, String>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<String, String>>()");
        this.f30001c = m31902e;
    }

    /* renamed from: v */
    public final Observable<Pair<String, String>> m88793v() {
        return this.f30001c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C35442Qj4.item_sku_investigation_missing ? new C6710b(this, m41761u) : new C29735w1(m41761u);
    }
}
