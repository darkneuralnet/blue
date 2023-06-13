package p000;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.VehicleSummaryView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004+\u001e\"&B\u0007¢\u0006\u0004\b)\u0010*J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J*\u0010\u0014\u001a&\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u0012 \u0013*\u0012\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u0012\u0018\u00010\u00110\u0011J\u0014\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u0006\u0010\u001c\u001a\u00020\u000bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006,"}, m28432d2 = {"LEA4;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lw1;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "getItemViewType", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "t", "", "LH6;", "adapterSections", "r", "p", "", "q", "o", "LE6;", "b", "LE6;", "adapterData", "Lio/reactivex/subjects/d;", "c", "Lio/reactivex/subjects/d;", "viewDetailSubject", "Landroid/widget/EditText;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/EditText;", "otherDescription", "<init>", "()V", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/repairlist/adapters/RepairListAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,151:1\n1549#2:152\n1620#2,2:153\n1622#2:160\n288#2,2:161\n18#3:155\n9#4,4:156\n*S KotlinDebug\n*F\n+ 1 RepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/repairlist/adapters/RepairListAdapter\n*L\n72#1:152\n72#1:153,2\n72#1:160\n73#1:161,2\n72#1:155\n72#1:156,4\n*E\n"})
/* renamed from: EA4 */
/* loaded from: classes3.dex */
public final class EA4 extends RecyclerView.AbstractC11843h<C29735w1> {

    /* renamed from: b */
    public final C1737E6 f7044b = new C1737E6(this);

    /* renamed from: c */
    public final C24558d<WireBird> f7045c;

    /* renamed from: d */
    public EditText f7046d;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LEA4$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "button", "Landroid/view/View;", "view", "<init>", "(LEA4;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: EA4$a */
    /* loaded from: classes3.dex */
    public final class C1749a extends C29735w1 {

        /* renamed from: b */
        public final Button f7047b;

        /* renamed from: c */
        public final /* synthetic */ EA4 f7048c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nRepairListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/repairlist/adapters/RepairListAdapter$ButtonViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n18#2:152\n9#3,4:153\n1#4:157\n*S KotlinDebug\n*F\n+ 1 RepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/repairlist/adapters/RepairListAdapter$ButtonViewHolder$1\n*L\n117#1:152\n117#1:153,4\n*E\n"})
        /* renamed from: EA4$a$a */
        /* loaded from: classes3.dex */
        public static final class C1750a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ EA4 f7049g;

            /* renamed from: h */
            public final /* synthetic */ C1749a f7050h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1750a(EA4 ea4, C1749a c1749a) {
                super(1);
                this.f7049g = ea4;
                this.f7050h = c1749a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f7049g.f7044b.m109394h().get(this.f7050h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof WireBird)) {
                    m105816c = null;
                }
                WireBird wireBird = (WireBird) m105816c;
                if (wireBird != null) {
                    this.f7049g.f7045c.onNext(wireBird);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1749a(EA4 ea4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f7048c = ea4;
            Button button = (Button) view;
            this.f7047b = button;
            C34585Ms2.m94661j(button, new C1750a(ea4, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Button button = this.f7047b;
            button.setText(button.getContext().getString(C45871nl4.bird_status_view_command_center));
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LEA4$b;", "Lw1;", "", "position", "", "bind", "LLr6;", "b", "LLr6;", "binding", "Landroid/view/View;", "view", "<init>", "(LEA4;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/repairlist/adapters/RepairListAdapter$RepairHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,151:1\n18#2:152\n9#3,4:153\n*S KotlinDebug\n*F\n+ 1 RepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/repairlist/adapters/RepairListAdapter$RepairHeaderViewHolder\n*L\n131#1:152\n131#1:153,4\n*E\n"})
    /* renamed from: EA4$b */
    /* loaded from: classes3.dex */
    public final class C1751b extends C29735w1 {

        /* renamed from: b */
        public final C34346Lr6 f7051b;

        /* renamed from: c */
        public final /* synthetic */ EA4 f7052c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1751b(EA4 ea4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f7052c = ea4;
            C34346Lr6 m96265a = C34346Lr6.m96265a(view);
            Intrinsics.checkNotNullExpressionValue(m96265a, "bind(view)");
            this.f7051b = m96265a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            int i2;
            TextView textView = this.f7051b.f22150b;
            Context context = this.itemView.getContext();
            int i3 = C45871nl4.repair_logger_repair_header;
            Object[] objArr = new Object[1];
            Object m105816c = this.f7052c.f7044b.m109394h().get(i).m105816c();
            if (!(m105816c instanceof Integer)) {
                m105816c = null;
            }
            Integer num = (Integer) m105816c;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            objArr[0] = Integer.valueOf(i2);
            textView.setText(context.getString(i3, objArr));
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LEA4$c;", "Lw1;", "", "position", "", "bind", "Ljt6;", "b", "Ljt6;", "binding", "Landroid/view/View;", "view", "<init>", "(LEA4;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/repairlist/adapters/RepairListAdapter$RepairViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,151:1\n18#2:152\n9#3,4:153\n*S KotlinDebug\n*F\n+ 1 RepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/repairlist/adapters/RepairListAdapter$RepairViewHolder\n*L\n141#1:152\n141#1:153,4\n*E\n"})
    /* renamed from: EA4$c */
    /* loaded from: classes3.dex */
    public final class C1752c extends C29735w1 {

        /* renamed from: b */
        public final C43581jt6 f7053b;

        /* renamed from: c */
        public final /* synthetic */ EA4 f7054c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1752c(EA4 ea4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f7054c = ea4;
            C43581jt6 m29777a = C43581jt6.m29777a(view);
            Intrinsics.checkNotNullExpressionValue(m29777a, "bind(view)");
            this.f7053b = m29777a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            String str;
            String str2;
            String key;
            String key2;
            super.bind(i);
            Object m105816c = this.f7054c.f7044b.m109394h().get(i).m105816c();
            String str3 = null;
            if (!(m105816c instanceof LegacyRepairType)) {
                m105816c = null;
            }
            LegacyRepairType legacyRepairType = (LegacyRepairType) m105816c;
            TextView textView = this.f7053b.f93510c;
            if (legacyRepairType != null) {
                str = legacyRepairType.getDisplay();
            } else {
                str = null;
            }
            textView.setText(str);
            EditText editText = this.f7053b.f93509b;
            Intrinsics.checkNotNullExpressionValue(editText, "binding.otherDescription");
            if (legacyRepairType != null && (key2 = legacyRepairType.getKey()) != null) {
                str2 = key2.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String).toLowerCase()");
            } else {
                str2 = null;
            }
            C49520tu6.show$default(editText, Intrinsics.areEqual(str2, LegacyRepairType.OTHER_KEY), 0, 2, null);
            if (legacyRepairType != null && (key = legacyRepairType.getKey()) != null) {
                str3 = key.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(str3, "this as java.lang.String).toLowerCase()");
            }
            if (Intrinsics.areEqual(str3, LegacyRepairType.OTHER_KEY)) {
                this.f7054c.f7046d = this.f7053b.f93509b;
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LEA4$d;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/VehicleSummaryView;", "b", "Lco/bird/android/widget/VehicleSummaryView;", "vehicleSummaryView", "Landroid/view/View;", "view", "<init>", "(LEA4;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/repairlist/adapters/RepairListAdapter$VehicleSummaryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n18#2:152\n9#3,4:153\n1#4:157\n*S KotlinDebug\n*F\n+ 1 RepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/repairlist/adapters/RepairListAdapter$VehicleSummaryViewHolder\n*L\n108#1:152\n108#1:153,4\n*E\n"})
    /* renamed from: EA4$d */
    /* loaded from: classes3.dex */
    public final class C1753d extends C29735w1 {

        /* renamed from: b */
        public final VehicleSummaryView f7055b;

        /* renamed from: c */
        public final /* synthetic */ EA4 f7056c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1753d(EA4 ea4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f7056c = ea4;
            this.f7055b = (VehicleSummaryView) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f7056c.f7044b.m109394h().get(i).m105816c();
            if (!(m105816c instanceof C50043un6)) {
                m105816c = null;
            }
            C50043un6 c50043un6 = (C50043un6) m105816c;
            if (c50043un6 != null) {
                this.f7055b.m54355e(c50043un6);
            }
        }
    }

    public EA4() {
        C24558d<WireBird> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<WireBird>()");
        this.f7045c = m31902e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f7044b.m109395g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemViewType(int i) {
        return this.f7044b.m109394h().get(i).m105817b();
    }

    /* renamed from: o */
    public final void m109330o() {
        Context context;
        int parseColor = Color.parseColor("#FA5050");
        EditText editText = this.f7046d;
        if (editText != null) {
            editText.setHintTextColor(parseColor);
        }
        EditText editText2 = this.f7046d;
        if (editText2 != null) {
            if (editText2 != null) {
                context = editText2.getContext();
            } else {
                context = null;
            }
            if (context == null) {
                return;
            }
            editText2.setBackground(NA0.m94299e(context, C43449jg4.other_description_text_error));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new JA4());
        }
    }

    /* renamed from: p */
    public final List<C3023H6> m109329p() {
        return new ArrayList(this.f7044b.m109392j());
    }

    /* renamed from: q */
    public final String m109328q() {
        Editable text;
        EditText editText = this.f7046d;
        if (editText == null || (text = editText.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    /* renamed from: r */
    public final void m109327r(List<C3023H6> adapterSections) {
        int collectionSizeOrDefault;
        Object obj;
        String str;
        Intrinsics.checkNotNullParameter(adapterSections, "adapterSections");
        if (this.f7044b.m109392j().isEmpty()) {
            this.f7044b.m109400b(adapterSections);
        } else {
            this.f7044b.m109398d();
            this.f7044b.m109400b(adapterSections);
        }
        List<C2637G6> m109394h = this.f7044b.m109394h();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(m109394h, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = m109394h.iterator();
        while (true) {
            LegacyRepairType legacyRepairType = null;
            if (!it.hasNext()) {
                break;
            }
            Object m105816c = ((C2637G6) it.next()).m105816c();
            if (m105816c instanceof LegacyRepairType) {
                legacyRepairType = m105816c;
            }
            arrayList.add(legacyRepairType);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                LegacyRepairType legacyRepairType2 = (LegacyRepairType) obj;
                if (legacyRepairType2 != null) {
                    str = legacyRepairType2.getKey();
                } else {
                    str = null;
                }
                if (Intrinsics.areEqual(str, LegacyRepairType.OTHER_KEY)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (((LegacyRepairType) obj) == null) {
            this.f7046d = null;
        }
    }

    /* renamed from: t */
    public final Observable<WireBird> m109326t() {
        return this.f7045c.hide();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onBindViewHolder(C29735w1 holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C34740Nj4.item_vehicle_summary ? new C1753d(this, m41761u) : i == C45268mk4.item_hollow_button ? new C1749a(this, m41761u) : i == C45268mk4.view_list_header ? new C1751b(this, m41761u) : i == C34740Nj4.view_repair_logger_list_repair ? new C1752c(this, m41761u) : new C29735w1(m41761u);
    }
}
