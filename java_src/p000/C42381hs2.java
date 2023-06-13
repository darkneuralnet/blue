package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LocalAsset;
import co.bird.android.model.QCInspection;
import co.bird.android.model.constant.AssetManagerType;
import co.bird.android.model.constant.QCStatus;
import co.bird.android.model.constant.TaskPriority;
import co.bird.android.widget.standardcomponents.InspectionV2CardView;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0003&'\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\u001a\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00110\u000eR\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\n0\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010!\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\n0\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR>\u0010#\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013 \u001c*\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00110\u00110\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001e¨\u0006("}, m28432d2 = {"Lhs2;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "I", "v", "Lkotlin/Pair;", "Lco/bird/android/model/QCInspection;", "", "w", "Lsu2;", "c", "Lsu2;", "localAssetManager", DateTokenConverter.CONVERTER_KEY, "Landroidx/recyclerview/widget/RecyclerView;", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "e", "Lio/reactivex/subjects/d;", "completeSubject", "f", "addIssuesSubject", "g", "qcUpdatesSubject", "<init>", "(Lsu2;)V", C17296a.f69688o, "b", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hs2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42381hs2 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final InterfaceC48923su2 f86021c;

    /* renamed from: d */
    public RecyclerView f86022d;

    /* renamed from: e */
    public final C24558d<Unit> f86023e;

    /* renamed from: f */
    public final C24558d<Unit> f86024f;

    /* renamed from: g */
    public final C24558d<Pair<QCInspection, Boolean>> f86025g;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lhs2$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "button", "Landroid/view/View;", "view", "<init>", "(Lhs2;Landroid/view/View;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nListQualityControlAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListQualityControlAdapter.kt\nco/bird/android/qualitycontrol/list/adapters/ListQualityControlAdapter$AddIssuesButtonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,114:1\n18#2:115\n9#3,4:116\n*S KotlinDebug\n*F\n+ 1 ListQualityControlAdapter.kt\nco/bird/android/qualitycontrol/list/adapters/ListQualityControlAdapter$AddIssuesButtonViewHolder\n*L\n110#1:115\n110#1:116,4\n*E\n"})
    /* renamed from: hs2$a */
    /* loaded from: classes4.dex */
    public final class C22773a extends C29735w1 {

        /* renamed from: b */
        public final Button f86026b;

        /* renamed from: c */
        public final /* synthetic */ C42381hs2 f86027c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: hs2$a$a */
        /* loaded from: classes4.dex */
        public static final class C22774a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42381hs2 f86028g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22774a(C42381hs2 c42381hs2) {
                super(1);
                this.f86028g = c42381hs2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f86028g.f86024f.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22773a(C42381hs2 c42381hs2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f86027c = c42381hs2;
            Button button = (Button) view;
            this.f86026b = button;
            C34585Ms2.m94661j(button, new C22774a(c42381hs2));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            Button button = this.f86026b;
            Object m105816c = this.f86027c.m94545o().m109397e(i).m105816c();
            if (m105816c != null) {
                z = m105816c instanceof CharSequence;
            } else {
                z = true;
            }
            if (!z) {
                m105816c = null;
            }
            button.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lhs2$b;", "Lw1;", "", "position", "", "bind", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "button", "Landroid/view/View;", "view", "<init>", "(Lhs2;Landroid/view/View;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nListQualityControlAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListQualityControlAdapter.kt\nco/bird/android/qualitycontrol/list/adapters/ListQualityControlAdapter$CompleteButtonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n18#2:115\n9#3,4:116\n1#4:120\n*S KotlinDebug\n*F\n+ 1 ListQualityControlAdapter.kt\nco/bird/android/qualitycontrol/list/adapters/ListQualityControlAdapter$CompleteButtonViewHolder\n*L\n95#1:115\n95#1:116,4\n*E\n"})
    /* renamed from: hs2$b */
    /* loaded from: classes4.dex */
    public final class C22775b extends C29735w1 {

        /* renamed from: b */
        public final Button f86029b;

        /* renamed from: c */
        public final /* synthetic */ C42381hs2 f86030c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: hs2$b$a */
        /* loaded from: classes4.dex */
        public static final class C22776a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42381hs2 f86031g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22776a(C42381hs2 c42381hs2) {
                super(1);
                this.f86031g = c42381hs2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f86031g.f86023e.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22775b(C42381hs2 c42381hs2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f86030c = c42381hs2;
            Button button = (Button) view;
            this.f86029b = button;
            C34585Ms2.m94661j(button, new C22776a(c42381hs2));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f86030c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                boolean booleanValue = ((Boolean) pair.component2()).booleanValue();
                this.f86029b.setText((String) pair.component1());
                this.f86029b.setEnabled(booleanValue);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lhs2$c;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/widget/standardcomponents/InspectionV2CardView;", "b", "Lco/bird/android/widget/standardcomponents/InspectionV2CardView;", "inspectionCard", "Landroid/view/View;", "view", "<init>", "(Lhs2;Landroid/view/View;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nListQualityControlAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListQualityControlAdapter.kt\nco/bird/android/qualitycontrol/list/adapters/ListQualityControlAdapter$InspectionItemViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n18#2:115\n9#3,4:116\n41#4:120\n1#5:121\n*S KotlinDebug\n*F\n+ 1 ListQualityControlAdapter.kt\nco/bird/android/qualitycontrol/list/adapters/ListQualityControlAdapter$InspectionItemViewHolder\n*L\n71#1:115\n71#1:116,4\n81#1:120\n*E\n"})
    /* renamed from: hs2$c */
    /* loaded from: classes4.dex */
    public final class C22777c extends C29735w1 {

        /* renamed from: b */
        public final InspectionV2CardView f86032b;

        /* renamed from: c */
        public final /* synthetic */ C42381hs2 f86033c;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "passed", "", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: hs2$c$a */
        /* loaded from: classes4.dex */
        public static final class C22778a extends Lambda implements Function1<Boolean, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C42381hs2 f86034g;

            /* renamed from: h */
            public final /* synthetic */ C22777c f86035h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C22778a(C42381hs2 c42381hs2, C22777c c22777c) {
                super(1);
                this.f86034g = c42381hs2;
                this.f86035h = c22777c;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                C24558d c24558d = this.f86034g.f86025g;
                Object m105816c = this.f86034g.m94545o().m109397e(this.f86035h.getAdapterPosition()).m105816c();
                Intrinsics.checkNotNull(m105816c, "null cannot be cast to non-null type co.bird.android.model.QCInspection");
                c24558d.onNext(TuplesKt.m28425to((QCInspection) m105816c, bool));
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: hs2$c$b */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C22779b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[QCStatus.values().length];
                try {
                    iArr[QCStatus.PASSED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[QCStatus.OPEN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[QCStatus.SKIPPED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[QCStatus.FAILED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22777c(C42381hs2 c42381hs2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f86033c = c42381hs2;
            InspectionV2CardView inspectionV2CardView = (InspectionV2CardView) view;
            this.f86032b = inspectionV2CardView;
            inspectionV2CardView.m53981C(new C22778a(c42381hs2, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Boolean bool;
            Unit unit;
            Object m105816c = this.f86033c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof QCInspection)) {
                m105816c = null;
            }
            QCInspection qCInspection = (QCInspection) m105816c;
            if (qCInspection != null) {
                C42381hs2 c42381hs2 = this.f86033c;
                this.f86032b.setTitle(qCInspection.getTitle());
                this.f86032b.setDescription(qCInspection.getDescription());
                InspectionV2CardView inspectionV2CardView = this.f86032b;
                int i2 = C22779b.$EnumSwitchMapping$0[qCInspection.getStatus().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        if (i2 == 4) {
                            bool = Boolean.FALSE;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        bool = null;
                    }
                } else {
                    bool = Boolean.TRUE;
                }
                inspectionV2CardView.setAccepted(bool);
                String assetId = qCInspection.getAssetId();
                if (assetId != null) {
                    AbstractC23442F<LocalAsset> mo13534a = c42381hs2.f86021c.mo13534a(assetId, AssetManagerType.REPAIR, TaskPriority.IMMEDIATE);
                    ImageView m53958E = this.f86032b.m53958E();
                    RecyclerView recyclerView = c42381hs2.f86022d;
                    if (recyclerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        recyclerView = null;
                    }
                    ScopeProvider m45202a = ViewScopeProvider.m45202a(recyclerView);
                    Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
                    C37279Yf5.m74583L(mo13534a, m53958E, m45202a);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    this.f86032b.m53958E().setImageDrawable(null);
                }
            }
        }
    }

    public C42381hs2(InterfaceC48923su2 localAssetManager) {
        Intrinsics.checkNotNullParameter(localAssetManager, "localAssetManager");
        this.f86021c = localAssetManager;
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f86023e = m31902e;
        C24558d<Unit> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Unit>()");
        this.f86024f = m31902e2;
        C24558d<Pair<QCInspection, Boolean>> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<Pair<QCInspection, Boolean?>>()");
        this.f86025g = m31902e3;
    }

    /* renamed from: I */
    public final Observable<Unit> m35690I() {
        Observable<Unit> hide = this.f86023e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "completeSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f86022d = recyclerView;
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C45939ns2());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C41788gs2();
    }

    /* renamed from: v */
    public final Observable<Unit> m35689v() {
        Observable<Unit> hide = this.f86024f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "addIssuesSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<Pair<QCInspection, Boolean>> m35688w() {
        Observable<Pair<QCInspection, Boolean>> hide = this.f86025g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "qcUpdatesSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C43489jk4.item_inspection_list_card ? new C22777c(this, m41761u) : i == C45268mk4.item_button_secondary ? new C22773a(this, m41761u) : i == C45268mk4.item_button_matte_black ? new C22775b(this, m41761u) : new C29735w1(m41761u);
    }
}
