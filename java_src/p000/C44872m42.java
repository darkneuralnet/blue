package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.InspectionIssue;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J&\u0010\u000e\u001a\u00020\f2\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0004\u0012\u00020\f0\bJ&\u0010\u000f\u001a\u00020\f2\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\f0\bR0\u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0004\u0012\u00020\f\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R0\u0010\u0014\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\f\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0018"}, m28432d2 = {"Lm42;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lkotlin/Function1;", "Lkotlin/Pair;", "", "", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "v", "w", "c", "Lkotlin/jvm/functions/Function1;", "issueListener", DateTokenConverter.CONVERTER_KEY, "warningListener", "<init>", "()V", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: m42  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44872m42 extends AbstractC52206yS0 {

    /* renamed from: c */
    public Function1<? super Pair<String, Boolean>, Unit> f97271c;

    /* renamed from: d */
    public Function1<? super Pair<String, String>, Unit> f97272d;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lm42$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/CheckBox;", "b", "Landroid/widget/CheckBox;", "checkbox", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(Lm42;Landroid/view/View;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectionV3IssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3IssueAdapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3IssueAdapter$IssueViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,67:1\n18#2:68\n9#3,4:69\n*S KotlinDebug\n*F\n+ 1 InspectionV3IssueAdapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3IssueAdapter$IssueViewHolder\n*L\n56#1:68\n56#1:69,4\n*E\n"})
    /* renamed from: m42$a */
    /* loaded from: classes3.dex */
    public final class C25903a extends C29735w1 {

        /* renamed from: b */
        public final CheckBox f97273b;

        /* renamed from: c */
        public boolean f97274c;

        /* renamed from: d */
        public final /* synthetic */ C44872m42 f97275d;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nInspectionV3IssueAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3IssueAdapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3IssueAdapter$IssueViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,67:1\n18#2:68\n9#3,4:69\n*S KotlinDebug\n*F\n+ 1 InspectionV3IssueAdapter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3IssueAdapter$IssueViewHolder$1\n*L\n43#1:68\n43#1:69,4\n*E\n"})
        /* renamed from: m42$a$a */
        /* loaded from: classes3.dex */
        public static final class C25904a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C44872m42 f97277h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25904a(C44872m42 c44872m42) {
                super(2);
                this.f97277h = c44872m42;
            }

            /* renamed from: a */
            public final void m26390a(CompoundButton compoundButton, boolean z) {
                Function1 function1;
                int adapterPosition = C25903a.this.getAdapterPosition();
                if (adapterPosition != -1 && !C25903a.this.f97274c) {
                    Object m105816c = this.f97277h.m94545o().m109397e(adapterPosition).m105816c();
                    if (!(m105816c instanceof InspectionIssue)) {
                        m105816c = null;
                    }
                    InspectionIssue inspectionIssue = (InspectionIssue) m105816c;
                    if (inspectionIssue != null) {
                        C44872m42 c44872m42 = this.f97277h;
                        Function1 function12 = c44872m42.f97271c;
                        if (function12 != null) {
                            function12.invoke(TuplesKt.m28425to(inspectionIssue.getId(), Boolean.valueOf(!z)));
                        }
                        String warningMessage = inspectionIssue.getWarningMessage();
                        if (!z && warningMessage != null && (function1 = c44872m42.f97272d) != null) {
                            function1.invoke(TuplesKt.m28425to(inspectionIssue.getId(), warningMessage));
                        }
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m26390a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25903a(C44872m42 c44872m42, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f97275d = c44872m42;
            CheckBox checkBox = (CheckBox) view;
            this.f97273b = checkBox;
            C34585Ms2.m94663h(checkBox, new C25904a(c44872m42));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f97275d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof InspectionIssue)) {
                m105816c = null;
            }
            InspectionIssue inspectionIssue = (InspectionIssue) m105816c;
            if (inspectionIssue != null) {
                this.f97274c = true;
                this.f97273b.setText(inspectionIssue.getDisplay());
                this.f97273b.setChecked(inspectionIssue.getSelected());
                this.f97273b.setEnabled(inspectionIssue.getMutable());
                this.f97273b.setTextColor(inspectionIssue.getTextColor().getLightMode());
                this.f97274c = false;
            }
        }
    }

    /* renamed from: v */
    public final void m26393v(Function1<? super Pair<String, Boolean>, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f97271c = listener;
    }

    /* renamed from: w */
    public final void m26392w(Function1<? super Pair<String, String>, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f97272d = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C37080Xj4.item_inspection_issue ? new C25903a(this, m41761u) : new C29735w1(m41761u);
    }
}
