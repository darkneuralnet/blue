package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C11905h;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.RepairType;
import co.bird.android.widget.EditTextBox;
import co.bird.android.widget.standardcomponents.CheckableItemView;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0002+,B\u0007¢\u0006\u0004\b)\u0010*J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000eJ\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u000f0\u000eR:\u0010\u0019\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011 \u0016*\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f0\u000f0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R:\u0010\u001b\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013 \u0016*\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f0\u000f0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R \u0010 \u001a\f\u0012\b\u0012\u00060\u001dR\u00020\u00000\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR*\u0010(\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006-"}, m28432d2 = {"LyC4;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/RepairType;", "", "w", "", "x", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/a;", "repairsCheckedSubject", DateTokenConverter.CONVERTER_KEY, "repairsNotesSubject", "", "LyC4$a;", "e", "Ljava/util/List;", "commentsViewHolders", "value", "f", "Z", "v", "()Z", "y", "(Z)V", "showErrors", "<init>", "()V", C17296a.f69688o, "b", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairSearchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSearchAdapter.kt\nco/bird/android/feature/repair/v1/search/adapters/RepairSearchAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n1855#2,2:130\n*S KotlinDebug\n*F\n+ 1 RepairSearchAdapter.kt\nco/bird/android/feature/repair/v1/search/adapters/RepairSearchAdapter\n*L\n28#1:130,2\n*E\n"})
/* renamed from: yC4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52066yC4 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24552a<Pair<RepairType, Boolean>> f118956c;

    /* renamed from: d */
    public final C24552a<Pair<RepairType, String>> f118957d;

    /* renamed from: e */
    public List<C30477a> f118958e;

    /* renamed from: f */
    public boolean f118959f;

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LyC4$a;", "Lw1;", "", "position", "", "bind", "e", "Lco/bird/android/widget/EditTextBox;", "b", "Lco/bird/android/widget/EditTextBox;", "comments", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(LyC4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairSearchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSearchAdapter.kt\nco/bird/android/feature/repair/v1/search/adapters/RepairSearchAdapter$CommentsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n18#2:130\n18#2:136\n9#3,4:131\n9#3,4:137\n1#4:135\n*S KotlinDebug\n*F\n+ 1 RepairSearchAdapter.kt\nco/bird/android/feature/repair/v1/search/adapters/RepairSearchAdapter$CommentsViewHolder\n*L\n115#1:130\n122#1:136\n115#1:131,4\n122#1:137,4\n*E\n"})
    /* renamed from: yC4$a */
    /* loaded from: classes3.dex */
    public final class C30477a extends C29735w1 {

        /* renamed from: b */
        public final EditTextBox f118960b;

        /* renamed from: c */
        public boolean f118961c;

        /* renamed from: d */
        public final /* synthetic */ C52066yC4 f118962d;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LHJ6;", "", C17296a.f69688o, "(LHJ6;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: yC4$a$a */
        /* loaded from: classes3.dex */
        public static final class C30478a extends Lambda implements Function1<HJ6, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C52066yC4 f118964h;

            @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", Entry.TYPE_TEXT, "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "", C17296a.f69688o, "(Ljava/lang/CharSequence;III)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nRepairSearchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSearchAdapter.kt\nco/bird/android/feature/repair/v1/search/adapters/RepairSearchAdapter$CommentsViewHolder$1$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,129:1\n18#2:130\n9#3,4:131\n*S KotlinDebug\n*F\n+ 1 RepairSearchAdapter.kt\nco/bird/android/feature/repair/v1/search/adapters/RepairSearchAdapter$CommentsViewHolder$1$1\n*L\n104#1:130\n104#1:131,4\n*E\n"})
            /* renamed from: yC4$a$a$a */
            /* loaded from: classes3.dex */
            public static final class C30479a extends Lambda implements Function4<CharSequence, Integer, Integer, Integer, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C30477a f118965g;

                /* renamed from: h */
                public final /* synthetic */ C52066yC4 f118966h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C30479a(C30477a c30477a, C52066yC4 c52066yC4) {
                    super(4);
                    this.f118965g = c30477a;
                    this.f118966h = c52066yC4;
                }

                /* renamed from: a */
                public final void m3844a(CharSequence charSequence, int i, int i2, int i3) {
                    if (!this.f118965g.f118961c) {
                        Object m105816c = this.f118966h.m94545o().m109394h().get(this.f118965g.getAdapterPosition()).m105816c();
                        if (!(m105816c instanceof RepairType)) {
                            m105816c = null;
                        }
                        RepairType repairType = (RepairType) m105816c;
                        if (repairType != null) {
                            C30477a c30477a = this.f118965g;
                            C52066yC4 c52066yC4 = this.f118966h;
                            c30477a.f118960b.setError(false);
                            c52066yC4.f118957d.onNext(TuplesKt.m28425to(repairType, String.valueOf(charSequence)));
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    m3844a(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30478a(C52066yC4 c52066yC4) {
                super(1);
                this.f118964h = c52066yC4;
            }

            /* renamed from: a */
            public final void m3845a(HJ6 textChangedListener) {
                Intrinsics.checkNotNullParameter(textChangedListener, "$this$textChangedListener");
                textChangedListener.m104030b(new C30479a(C30477a.this, this.f118964h));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HJ6 hj6) {
                m3845a(hj6);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30477a(C52066yC4 c52066yC4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f118962d = c52066yC4;
            EditTextBox editTextBox = (EditTextBox) view;
            this.f118960b = editTextBox;
            c52066yC4.f118958e.add(this);
            C34585Ms2.m94647x(editTextBox, new C30478a(c52066yC4));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f118961c = true;
            Object m105816c = this.f118962d.m94545o().m109394h().get(i).m105816c();
            String str = null;
            if (!(m105816c instanceof RepairType)) {
                m105816c = null;
            }
            RepairType repairType = (RepairType) m105816c;
            if (repairType != null) {
                str = repairType.getNotes();
            }
            this.f118960b.setText(str);
            m3846e();
            this.f118961c = false;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m3846e() {
            boolean z;
            boolean isBlank;
            if (this.f118962d.m3852v()) {
                EditTextBox editTextBox = this.f118960b;
                Object m105816c = this.f118962d.m94545o().m109394h().get(getAdapterPosition()).m105816c();
                if (!(m105816c instanceof RepairType)) {
                    m105816c = null;
                }
                RepairType repairType = (RepairType) m105816c;
                boolean z2 = false;
                if (repairType != null && repairType.getRequireNotes()) {
                    String notes = repairType.getNotes();
                    if (notes != null) {
                        isBlank = StringsKt__StringsJVMKt.isBlank(notes);
                        if (!isBlank) {
                            z = false;
                            if (z) {
                                z2 = true;
                            }
                        }
                    }
                    z = true;
                    if (z) {
                    }
                }
                editTextBox.setError(z2);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LyC4$b;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "b", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "checkableItemView", "", "c", "Z", "binding", "Landroid/view/View;", "view", "<init>", "(LyC4;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairSearchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSearchAdapter.kt\nco/bird/android/feature/repair/v1/search/adapters/RepairSearchAdapter$RepairViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,129:1\n18#2:130\n9#3,4:131\n*S KotlinDebug\n*F\n+ 1 RepairSearchAdapter.kt\nco/bird/android/feature/repair/v1/search/adapters/RepairSearchAdapter$RepairViewHolder\n*L\n88#1:130\n88#1:131,4\n*E\n"})
    /* renamed from: yC4$b */
    /* loaded from: classes3.dex */
    public final class C30480b extends C29735w1 {

        /* renamed from: b */
        public final CheckableItemView f118967b;

        /* renamed from: c */
        public boolean f118968c;

        /* renamed from: d */
        public final /* synthetic */ C52066yC4 f118969d;

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"yC4$b$a", "Lco/bird/android/widget/standardcomponents/CheckableItemView$b;", "Lco/bird/android/widget/standardcomponents/CheckableItemView;", "view", "", "isChecked", "", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nRepairSearchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSearchAdapter.kt\nco/bird/android/feature/repair/v1/search/adapters/RepairSearchAdapter$RepairViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,129:1\n18#2:130\n9#3,4:131\n*S KotlinDebug\n*F\n+ 1 RepairSearchAdapter.kt\nco/bird/android/feature/repair/v1/search/adapters/RepairSearchAdapter$RepairViewHolder$1\n*L\n79#1:130\n79#1:131,4\n*E\n"})
        /* renamed from: yC4$b$a */
        /* loaded from: classes3.dex */
        public static final class C30481a implements CheckableItemView.InterfaceC16699b {

            /* renamed from: b */
            public final /* synthetic */ C52066yC4 f118971b;

            public C30481a(C52066yC4 c52066yC4) {
                this.f118971b = c52066yC4;
            }

            @Override // co.bird.android.widget.standardcomponents.CheckableItemView.InterfaceC16699b
            /* renamed from: a */
            public void mo3842a(CheckableItemView view, boolean z) {
                Intrinsics.checkNotNullParameter(view, "view");
                if (C30480b.this.f118968c) {
                    return;
                }
                Object m105816c = this.f118971b.m94545o().m109394h().get(C30480b.this.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof HF4)) {
                    m105816c = null;
                }
                HF4 hf4 = (HF4) m105816c;
                if (hf4 != null) {
                    this.f118971b.f118956c.onNext(TuplesKt.m28425to(hf4.m104097e(), Boolean.valueOf(z)));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30480b(C52066yC4 c52066yC4, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f118969d = c52066yC4;
            CheckableItemView checkableItemView = (CheckableItemView) view;
            this.f118967b = checkableItemView;
            checkableItemView.setOnCheckChangedListener(new C30481a(c52066yC4));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f118968c = true;
            Object m105816c = this.f118969d.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof HF4)) {
                m105816c = null;
            }
            HF4 hf4 = (HF4) m105816c;
            if (hf4 != null) {
                this.f118967b.m53967e(hf4);
            }
            this.f118968c = false;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\n"}, m28432d2 = {"yC4$c", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairSearchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSearchAdapter.kt\nco/bird/android/feature/repair/v1/search/adapters/RepairSearchAdapter$getDiffCallback$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,129:1\n18#2:130\n18#2:135\n18#2:140\n18#2:145\n9#3,4:131\n9#3,4:136\n9#3,4:141\n9#3,4:146\n*S KotlinDebug\n*F\n+ 1 RepairSearchAdapter.kt\nco/bird/android/feature/repair/v1/search/adapters/RepairSearchAdapter$getDiffCallback$1\n*L\n44#1:130\n45#1:135\n51#1:140\n52#1:145\n44#1:131,4\n45#1:136,4\n51#1:141,4\n52#1:146,4\n*E\n"})
    /* renamed from: yC4$c */
    /* loaded from: classes3.dex */
    public static final class C30482c implements InterfaceC2152F6 {
        @Override // p000.InterfaceC2152F6
        /* renamed from: a */
        public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
            return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // p000.InterfaceC2152F6
        /* renamed from: b */
        public String mo29b(C2637G6 adapterItem) {
            RepairType m104097e;
            String id;
            Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
            int m105817b = adapterItem.m105817b();
            String str = 0;
            if (m105817b == C32634Ej4.item_checkable_repair_item) {
                Object m105816c = adapterItem.m105816c();
                if (m105816c instanceof HF4) {
                    str = m105816c;
                }
                HF4 hf4 = (HF4) str;
                if (hf4 == null || (m104097e = hf4.m104097e()) == null || (id = m104097e.getId()) == null) {
                    return "";
                }
                return id;
            } else if (m105817b != C32634Ej4.item_repair_text_box) {
                return "";
            } else {
                Object m105816c2 = adapterItem.m105816c();
                if (!(m105816c2 instanceof RepairType)) {
                    m105816c2 = null;
                }
                RepairType repairType = (RepairType) m105816c2;
                if (repairType != null) {
                    str = repairType.getId();
                }
                return str + "-notes";
            }
        }

        @Override // p000.InterfaceC2152F6
        /* renamed from: c */
        public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            Object m105816c = oldItem.m105816c();
            Boolean bool4 = null;
            if (!(m105816c instanceof HF4)) {
                m105816c = null;
            }
            HF4 hf4 = (HF4) m105816c;
            Object m105816c2 = newItem.m105816c();
            if (!(m105816c2 instanceof HF4)) {
                m105816c2 = null;
            }
            HF4 hf42 = (HF4) m105816c2;
            if (hf4 != null) {
                bool = Boolean.valueOf(hf4.mo3250a());
            } else {
                bool = null;
            }
            if (hf42 != null) {
                bool2 = Boolean.valueOf(hf42.mo3250a());
            } else {
                bool2 = null;
            }
            if (Intrinsics.areEqual(bool, bool2)) {
                if (hf4 != null) {
                    bool3 = Boolean.valueOf(hf4.mo3248c());
                } else {
                    bool3 = null;
                }
                if (hf42 != null) {
                    bool4 = Boolean.valueOf(hf42.mo3248c());
                }
                if (Intrinsics.areEqual(bool3, bool4)) {
                    return false;
                }
            }
            return true;
        }
    }

    public C52066yC4() {
        C24552a<Pair<RepairType, Boolean>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Pair<RepairType, Boolean>>()");
        this.f118956c = m31922e;
        C24552a<Pair<RepairType, String>> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<Pair<RepairType, String>>()");
        this.f118957d = m31922e2;
        this.f118958e = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new DC4());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C30482c();
    }

    /* renamed from: v */
    public final boolean m3852v() {
        return this.f118959f;
    }

    /* renamed from: w */
    public final Observable<Pair<RepairType, Boolean>> m3851w() {
        Observable<Pair<RepairType, Boolean>> hide = this.f118956c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "repairsCheckedSubject.hide()");
        return hide;
    }

    /* renamed from: x */
    public final Observable<Pair<RepairType, String>> m3850x() {
        Observable<Pair<RepairType, String>> hide = this.f118957d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "repairsNotesSubject.hide()");
        return hide;
    }

    /* renamed from: y */
    public final void m3849y(boolean z) {
        this.f118959f = z;
        for (C30477a c30477a : this.f118958e) {
            c30477a.m3846e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C32634Ej4.item_checkable_repair_item ? new C30480b(this, m41761u) : i == C32634Ej4.item_repair_text_box ? new C30477a(this, m41761u) : new C29735w1(m41761u);
    }
}
