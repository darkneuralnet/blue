package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.NonRepair;
import co.bird.android.model.NonRepairReason;
import co.bird.android.widget.EditTextBox;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0003\u001c\u001d\u0015B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eR\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u000f0\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00110\u00110\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u001e"}, m28432d2 = {"Lc93;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "Lco/bird/android/model/NonRepairReason;", "v", "", "z", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "nonRepairReasonSelectsSubject", DateTokenConverter.CONVERTER_KEY, "noteChangesSubject", "<init>", "()V", C17296a.f69688o, "b", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: c93  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38976c93 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<NonRepairReason> f60199c;

    /* renamed from: d */
    public final C24558d<String> f60200d;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lc93$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/CheckBox;", "b", "Landroid/widget/CheckBox;", "checkbox", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(Lc93;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNonRepairAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/adapters/NonRepairAdapter$NonRepairReasonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,107:1\n18#2:108\n9#3,4:109\n*S KotlinDebug\n*F\n+ 1 NonRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/adapters/NonRepairAdapter$NonRepairReasonViewHolder\n*L\n76#1:108\n76#1:109,4\n*E\n"})
    /* renamed from: c93$a */
    /* loaded from: classes3.dex */
    public final class C13415a extends C29735w1 {

        /* renamed from: b */
        public final CheckBox f60201b;

        /* renamed from: c */
        public boolean f60202c;

        /* renamed from: d */
        public final /* synthetic */ C38976c93 f60203d;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "checked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nNonRepairAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/adapters/NonRepairAdapter$NonRepairReasonViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n18#2:108\n9#3,4:109\n1#4:113\n*S KotlinDebug\n*F\n+ 1 NonRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/adapters/NonRepairAdapter$NonRepairReasonViewHolder$1\n*L\n69#1:108\n69#1:109,4\n*E\n"})
        /* renamed from: c93$a$a */
        /* loaded from: classes3.dex */
        public static final class C13416a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C38976c93 f60205h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13416a(C38976c93 c38976c93) {
                super(2);
                this.f60205h = c38976c93;
            }

            /* renamed from: a */
            public final void m61881a(CompoundButton compoundButton, boolean z) {
                int adapterPosition = C13415a.this.getAdapterPosition();
                if (!C13415a.this.f60202c && adapterPosition != -1 && z) {
                    Object m105816c = this.f60205h.m94545o().m109397e(adapterPosition).m105816c();
                    if (!(m105816c instanceof NonRepairReason)) {
                        m105816c = null;
                    }
                    NonRepairReason nonRepairReason = (NonRepairReason) m105816c;
                    if (nonRepairReason != null) {
                        this.f60205h.f60199c.onNext(nonRepairReason);
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m61881a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13415a(C38976c93 c38976c93, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f60203d = c38976c93;
            CheckBox checkBox = (CheckBox) view;
            this.f60201b = checkBox;
            C34585Ms2.m94663h(checkBox, new C13416a(c38976c93));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f60202c = true;
            Object m105816c = this.f60203d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof NonRepairReason)) {
                m105816c = null;
            }
            NonRepairReason nonRepairReason = (NonRepairReason) m105816c;
            if (nonRepairReason != null) {
                this.f60201b.setText(nonRepairReason.getDisplay());
                this.f60201b.setChecked(nonRepairReason.getSelected());
                this.f60201b.setEnabled(!nonRepairReason.getSelected());
            }
            this.f60202c = false;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lc93$b;", "Lw1;", "", "position", "", "bind", "LId2;", "b", "LId2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lc93;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNonRepairAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/adapters/NonRepairAdapter$NonRepairViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,107:1\n18#2:108\n9#3,4:109\n*S KotlinDebug\n*F\n+ 1 NonRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/adapters/NonRepairAdapter$NonRepairViewHolder\n*L\n54#1:108\n54#1:109,4\n*E\n"})
    /* renamed from: c93$b */
    /* loaded from: classes3.dex */
    public final class C13417b extends C29735w1 {

        /* renamed from: b */
        public final C33514Id2 f60206b;

        /* renamed from: c */
        public final /* synthetic */ C38976c93 f60207c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13417b(C38976c93 c38976c93, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f60207c = c38976c93;
            C33514Id2 m101876a = C33514Id2.m101876a(view);
            Intrinsics.checkNotNullExpressionValue(m101876a, "bind(view)");
            this.f60206b = m101876a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f60207c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof NonRepair)) {
                m105816c = null;
            }
            NonRepair nonRepair = (NonRepair) m105816c;
            if (nonRepair != null) {
                this.f60206b.f15955c.setText(nonRepair.getDisplay());
                this.f60206b.f15954b.setText(nonRepair.getDescription());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lc93$c;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/EditTextBox;", "b", "Lco/bird/android/widget/EditTextBox;", "editText", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(Lc93;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNonRepairAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/adapters/NonRepairAdapter$NotesViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,107:1\n18#2:108\n9#3,4:109\n*S KotlinDebug\n*F\n+ 1 NonRepairAdapter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/nonrepair/adapters/NonRepairAdapter$NotesViewHolder\n*L\n102#1:108\n102#1:109,4\n*E\n"})
    /* renamed from: c93$c */
    /* loaded from: classes3.dex */
    public final class C13418c extends C29735w1 {

        /* renamed from: b */
        public final EditTextBox f60208b;

        /* renamed from: c */
        public boolean f60209c;

        /* renamed from: d */
        public final /* synthetic */ C38976c93 f60210d;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LHJ6;", "", C17296a.f69688o, "(LHJ6;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: c93$c$a */
        /* loaded from: classes3.dex */
        public static final class C13419a extends Lambda implements Function1<HJ6, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C38976c93 f60212h;

            @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "charSequence", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "", C17296a.f69688o, "(Ljava/lang/CharSequence;III)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: c93$c$a$a */
            /* loaded from: classes3.dex */
            public static final class C13420a extends Lambda implements Function4<CharSequence, Integer, Integer, Integer, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C13418c f60213g;

                /* renamed from: h */
                public final /* synthetic */ C38976c93 f60214h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C13420a(C13418c c13418c, C38976c93 c38976c93) {
                    super(4);
                    this.f60213g = c13418c;
                    this.f60214h = c38976c93;
                }

                /* renamed from: a */
                public final void m61878a(CharSequence charSequence, int i, int i2, int i3) {
                    int adapterPosition = this.f60213g.getAdapterPosition();
                    if (!this.f60213g.f60209c && adapterPosition != -1) {
                        this.f60214h.f60200d.onNext(String.valueOf(charSequence));
                    }
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    m61878a(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13419a(C38976c93 c38976c93) {
                super(1);
                this.f60212h = c38976c93;
            }

            /* renamed from: a */
            public final void m61879a(HJ6 textChangedListener) {
                Intrinsics.checkNotNullParameter(textChangedListener, "$this$textChangedListener");
                textChangedListener.m104030b(new C13420a(C13418c.this, this.f60212h));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HJ6 hj6) {
                m61879a(hj6);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13418c(C38976c93 c38976c93, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f60210d = c38976c93;
            EditTextBox editTextBox = (EditTextBox) view;
            this.f60208b = editTextBox;
            C34585Ms2.m94647x(editTextBox, new C13419a(c38976c93));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f60209c = true;
            EditTextBox editTextBox = this.f60208b;
            Object m105816c = this.f60210d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            editTextBox.setText((CharSequence) m105816c);
            this.f60209c = false;
        }
    }

    public C38976c93() {
        C24558d<NonRepairReason> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<NonRepairReason>()");
        this.f60199c = m31902e;
        C24558d<String> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<String>()");
        this.f60200d = m31902e2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C41958h93());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C39587d93();
    }

    /* renamed from: v */
    public final Observable<NonRepairReason> m61884v() {
        Observable<NonRepairReason> hide = this.f60199c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "nonRepairReasonSelectsSubject.hide()");
        return hide;
    }

    /* renamed from: z */
    public final Observable<String> m61883z() {
        Observable<String> hide = this.f60200d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "noteChangesSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C32634Ej4.item_non_repair ? new C13417b(this, m41761u) : i == C32634Ej4.item_non_repair_reason ? new C13415a(this, m41761u) : i == C32634Ej4.item_non_repair_notes ? new C13418c(this, m41761u) : new C29735w1(m41761u);
    }
}
