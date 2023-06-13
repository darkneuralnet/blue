package p000;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireServiceCenterStatus;
import co.bird.android.widget.EditTextBox;
import co.bird.android.widget.VehicleSummaryView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C47148pu5;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0004'(\u0018\u001cB\u0007¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eJ\u0006\u0010\u0015\u001a\u00020\nR\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00130\u00130\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u000f0\u000f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00110\u00110\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u001c\u0010$\u001a\b\u0018\u00010!R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, m28432d2 = {"Lpu5;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "w", "", "z", "Lco/bird/android/model/wire/WireBird;", "x", "v", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "viewDetailSubject", "Lio/reactivex/subjects/a;", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/a;", "statusSubject", "e", "notesSubject", "Lpu5$c;", "f", "Lpu5$c;", "noteViewHolder", "<init>", "()V", C17296a.f69688o, "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pu5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47148pu5 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<WireBird> f104279c;

    /* renamed from: d */
    public final C24552a<WireServiceCenterStatus> f104280d;

    /* renamed from: e */
    public final C24552a<String> f104281e;

    /* renamed from: f */
    public C27413c f104282f;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lpu5$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "button", "Landroid/view/View;", "view", "<init>", "(Lpu5;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pu5$a */
    /* loaded from: classes3.dex */
    public final class C27410a extends C29735w1 {

        /* renamed from: b */
        public final Button f104283b;

        /* renamed from: c */
        public final /* synthetic */ C47148pu5 f104284c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nServiceProgressListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceProgressListAdapter.kt\nco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressListAdapter$ButtonViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n18#2:145\n9#3,4:146\n1#4:150\n*S KotlinDebug\n*F\n+ 1 ServiceProgressListAdapter.kt\nco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressListAdapter$ButtonViewHolder$1\n*L\n79#1:145\n79#1:146,4\n*E\n"})
        /* renamed from: pu5$a$a */
        /* loaded from: classes3.dex */
        public static final class C27411a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C47148pu5 f104285g;

            /* renamed from: h */
            public final /* synthetic */ C27410a f104286h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27411a(C47148pu5 c47148pu5, C27410a c27410a) {
                super(1);
                this.f104285g = c47148pu5;
                this.f104286h = c27410a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f104285g.m94545o().m109394h().get(this.f104286h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof WireBird)) {
                    m105816c = null;
                }
                WireBird wireBird = (WireBird) m105816c;
                if (wireBird != null) {
                    this.f104285g.f104279c.onNext(wireBird);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27410a(C47148pu5 c47148pu5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f104284c = c47148pu5;
            Button button = (Button) view;
            this.f104283b = button;
            C34585Ms2.m94661j(button, new C27411a(c47148pu5, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Button button = this.f104283b;
            button.setText(button.getContext().getString(C45871nl4.bird_status_view_command_center));
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m28432d2 = {"Lpu5$b;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/TextView;", "header", "Landroid/view/View;", "view", "<init>", "(Lpu5;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pu5$b */
    /* loaded from: classes3.dex */
    public final class C27412b extends C29735w1 {

        /* renamed from: b */
        public final TextView f104287b;

        /* renamed from: c */
        public final /* synthetic */ C47148pu5 f104288c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27412b(C47148pu5 c47148pu5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f104288c = c47148pu5;
            this.f104287b = (TextView) view.findViewById(C52955zi4.headerText);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f104287b.setText(this.itemView.getContext().getString(C45871nl4.service_center_status_statuses_header));
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m28432d2 = {"Lpu5$c;", "Lw1;", "", "position", "", "bind", "LGf2;", "b", "LGf2;", "i", "()LGf2;", "viewBinding", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(Lpu5;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nServiceProgressListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceProgressListAdapter.kt\nco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressListAdapter$StatusViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n18#2:145\n18#2:151\n9#3,4:146\n9#3,4:152\n1#4:150\n*S KotlinDebug\n*F\n+ 1 ServiceProgressListAdapter.kt\nco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressListAdapter$StatusViewHolder\n*L\n125#1:145\n106#1:151\n125#1:146,4\n106#1:152,4\n*E\n"})
    /* renamed from: pu5$c */
    /* loaded from: classes3.dex */
    public final class C27413c extends C29735w1 {

        /* renamed from: b */
        public final C33064Gf2 f104289b;

        /* renamed from: c */
        public boolean f104290c;

        /* renamed from: d */
        public final /* synthetic */ C47148pu5 f104291d;

        @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, m28432d2 = {"pu5$c$a", "Ld36;", "", "s", "", "start", "before", "count", "", "onTextChanged", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: pu5$c$a */
        /* loaded from: classes3.dex */
        public static final class C27414a extends C39530d36 {

            /* renamed from: c */
            public final /* synthetic */ C47148pu5 f104293c;

            public C27414a(C47148pu5 c47148pu5) {
                this.f104293c = c47148pu5;
            }

            @Override // p000.C39530d36, android.text.TextWatcher
            public void onTextChanged(CharSequence s, int i, int i2, int i3) {
                Intrinsics.checkNotNullParameter(s, "s");
                if (C27413c.this.f104290c) {
                    return;
                }
                this.f104293c.f104281e.onNext(s.toString());
                C27413c.this.m18437i().f12218b.setError(false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27413c(final C47148pu5 c47148pu5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f104291d = c47148pu5;
            C33064Gf2 m104931a = C33064Gf2.m104931a(view);
            Intrinsics.checkNotNullExpressionValue(m104931a, "bind(view)");
            this.f104289b = m104931a;
            m104931a.f12219c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qu5
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    C47148pu5.C27413c.m18439b(C47148pu5.C27413c.this, c47148pu5, compoundButton, z);
                }
            });
            m104931a.f12218b.addTextChangedListener(new C27414a(c47148pu5));
        }

        /* renamed from: b */
        public static final void m18439b(C27413c this$0, C47148pu5 this$1, CompoundButton compoundButton, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            int adapterPosition = this$0.getAdapterPosition();
            if (!this$0.f104290c && adapterPosition != -1) {
                Object m105816c = this$1.m94545o().m109394h().get(this$0.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof Pair)) {
                    m105816c = null;
                }
                Pair pair = (Pair) m105816c;
                if (pair != null) {
                    WireServiceCenterStatus wireServiceCenterStatus = (WireServiceCenterStatus) pair.component1();
                    if (z && !Intrinsics.areEqual(this$1.f104280d.getValue(), wireServiceCenterStatus)) {
                        this$1.f104280d.onNext(wireServiceCenterStatus);
                        this$1.f104281e.onNext("");
                    }
                }
            }
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z = true;
            this.f104290c = true;
            Object m105816c = this.f104291d.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                C47148pu5 c47148pu5 = this.f104291d;
                WireServiceCenterStatus wireServiceCenterStatus = (WireServiceCenterStatus) pair.component1();
                boolean booleanValue = ((Boolean) pair.component2()).booleanValue();
                this.f104289b.f12219c.setText(wireServiceCenterStatus.getDisplayName());
                this.f104289b.f12219c.setChecked(booleanValue);
                Integer color = wireServiceCenterStatus.getColor();
                if (color != null) {
                    RadioButton radioButton = this.f104289b.f12219c;
                    Intrinsics.checkNotNullExpressionValue(radioButton, "viewBinding.statusName");
                    radioButton.setTextColor(color.intValue());
                }
                Editable text = this.f104289b.f12218b.getText();
                if (text != null) {
                    text.clear();
                }
                EditTextBox editTextBox = this.f104289b.f12218b;
                Intrinsics.checkNotNullExpressionValue(editTextBox, "viewBinding.notes");
                if (!wireServiceCenterStatus.getRequireNotes() || !booleanValue) {
                    z = false;
                }
                C49520tu6.show$default(editTextBox, z, 0, 2, null);
                if (wireServiceCenterStatus.getRequireNotes() && booleanValue) {
                    String singularHintText = wireServiceCenterStatus.getSingularHintText();
                    if (singularHintText != null) {
                        this.f104289b.f12218b.setHint(singularHintText);
                    }
                    c47148pu5.f104282f = this;
                } else if (Intrinsics.areEqual(c47148pu5.f104282f, this)) {
                    c47148pu5.f104282f = null;
                }
            }
            this.f104290c = false;
        }

        /* renamed from: i */
        public final C33064Gf2 m18437i() {
            return this.f104289b;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lpu5$d;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/VehicleSummaryView;", "b", "Lco/bird/android/widget/VehicleSummaryView;", "vehicleSummaryView", "Landroid/view/View;", "view", "<init>", "(Lpu5;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nServiceProgressListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceProgressListAdapter.kt\nco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressListAdapter$VehicleSummaryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n18#2:145\n9#3,4:146\n1#4:150\n*S KotlinDebug\n*F\n+ 1 ServiceProgressListAdapter.kt\nco/bird/android/feature/servicecenter/status/single/update/adapters/ServiceProgressListAdapter$VehicleSummaryViewHolder\n*L\n70#1:145\n70#1:146,4\n*E\n"})
    /* renamed from: pu5$d */
    /* loaded from: classes3.dex */
    public final class C27415d extends C29735w1 {

        /* renamed from: b */
        public final VehicleSummaryView f104294b;

        /* renamed from: c */
        public final /* synthetic */ C47148pu5 f104295c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27415d(C47148pu5 c47148pu5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f104295c = c47148pu5;
            this.f104294b = (VehicleSummaryView) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f104295c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof C50043un6)) {
                m105816c = null;
            }
            C50043un6 c50043un6 = (C50043un6) m105816c;
            if (c50043un6 != null) {
                this.f104294b.m54355e(c50043un6);
            }
        }
    }

    public C47148pu5() {
        C24558d<WireBird> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<WireBird>()");
        this.f104279c = m31902e;
        C24552a<WireServiceCenterStatus> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<WireServiceCenterStatus>()");
        this.f104280d = m31922e;
        C24552a<String> m31921g = C24552a.m31921g("");
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault<String>(\"\")");
        this.f104281e = m31921g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new JA4());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C49519tu5();
    }

    /* renamed from: v */
    public final void m18444v() {
        C33064Gf2 m18437i;
        C27413c c27413c = this.f104282f;
        EditTextBox editTextBox = (c27413c == null || (m18437i = c27413c.m18437i()) == null) ? null : m18437i.f12218b;
        if (editTextBox == null) {
            return;
        }
        editTextBox.setError(true);
    }

    /* renamed from: w */
    public final Observable<WireServiceCenterStatus> m18443w() {
        Observable<WireServiceCenterStatus> hide = this.f104280d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "statusSubject.hide()");
        return hide;
    }

    /* renamed from: x */
    public final Observable<WireBird> m18442x() {
        Observable<WireBird> hide = this.f104279c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "viewDetailSubject.hide()");
        return hide;
    }

    /* renamed from: z */
    public final Observable<String> m18441z() {
        Observable<String> hide = this.f104281e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "notesSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C34740Nj4.item_vehicle_summary ? new C27415d(this, m41761u) : i == C45268mk4.item_button_secondary ? new C27410a(this, m41761u) : i == C45268mk4.view_list_header ? new C27412b(this, m41761u) : i == C34740Nj4.item_service_center_status ? new C27413c(this, m41761u) : new C29735w1(m41761u);
    }
}
