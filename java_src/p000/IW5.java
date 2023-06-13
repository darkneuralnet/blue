package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.C11947r;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LocalAsset;
import co.bird.android.model.QCInspection;
import co.bird.android.model.constant.AssetManagerType;
import co.bird.android.model.constant.QCStatus;
import co.bird.android.model.constant.TaskPriority;
import co.bird.android.qualitycontrol.widgets.InspectionCardView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.subjects.C24552a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import p000.IW5;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001.B\u0011\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b,\u0010-J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0017\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0015R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010+\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010\u00130\u00130'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006/"}, m28432d2 = {"LIW5;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "", "LH6;", "sections", "u", "LF6;", "r", "Lio/reactivex/Observable;", "Lco/bird/android/model/QCInspection;", "B", "", "passed", "x", "(Ljava/lang/Boolean;)V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lsu2;", "c", "Lsu2;", "localAssetManager", DateTokenConverter.CONVERTER_KEY, "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/r;", "e", "Landroidx/recyclerview/widget/r;", "snapHelper", "f", "I", "edgeMargin", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "g", "Lio/reactivex/subjects/a;", "qcInspectionScrollSubject", "<init>", "(Lsu2;)V", C17296a.f69688o, "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeQualityControlAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeQualityControlAdapter.kt\nco/bird/android/qualitycontrol/swipe/adapters/SwipeQualityControlAdapter\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n18#2:145\n9#3,4:146\n9#3,4:151\n1#4:150\n288#5,2:155\n*S KotlinDebug\n*F\n+ 1 SwipeQualityControlAdapter.kt\nco/bird/android/qualitycontrol/swipe/adapters/SwipeQualityControlAdapter\n*L\n74#1:145\n74#1:146,4\n86#1:151,4\n100#1:155,2\n*E\n"})
/* renamed from: IW5 */
/* loaded from: classes4.dex */
public final class IW5 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final InterfaceC48923su2 f15843c;

    /* renamed from: d */
    public RecyclerView f15844d;

    /* renamed from: e */
    public final C11947r f15845e;

    /* renamed from: f */
    public int f15846f;

    /* renamed from: g */
    public final C24552a<QCInspection> f15847g;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LIW5$a;", "Lw1;", "", "position", "", "bind", "Lco/bird/android/qualitycontrol/widgets/InspectionCardView;", "b", "Lco/bird/android/qualitycontrol/widgets/InspectionCardView;", "inspectionCard", "Landroid/view/View;", "view", "<init>", "(LIW5;Landroid/view/View;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSwipeQualityControlAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeQualityControlAdapter.kt\nco/bird/android/qualitycontrol/swipe/adapters/SwipeQualityControlAdapter$InspectionItemViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n18#2:145\n9#3,4:146\n41#4:150\n1#5:151\n*S KotlinDebug\n*F\n+ 1 SwipeQualityControlAdapter.kt\nco/bird/android/qualitycontrol/swipe/adapters/SwipeQualityControlAdapter$InspectionItemViewHolder\n*L\n128#1:145\n128#1:146,4\n138#1:150\n*E\n"})
    /* renamed from: IW5$a */
    /* loaded from: classes4.dex */
    public final class C3698a extends C29735w1 {

        /* renamed from: b */
        public final InspectionCardView f15848b;

        /* renamed from: c */
        public final /* synthetic */ IW5 f15849c;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: IW5$a$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C3699a {
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
        public C3698a(final IW5 iw5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f15849c = iw5;
            this.f15848b = (InspectionCardView) view;
            RecyclerView recyclerView = iw5.f15844d;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                recyclerView = null;
            }
            recyclerView.post(new Runnable() { // from class: HW5
                @Override // java.lang.Runnable
                public final void run() {
                    IW5.C3698a.m101953b(IW5.C3698a.this, iw5);
                }
            });
        }

        /* renamed from: b */
        public static final void m101953b(C3698a this$0, IW5 this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            ViewGroup.LayoutParams layoutParams = this$0.f15848b.getLayoutParams();
            RecyclerView recyclerView = this$1.f15844d;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                recyclerView = null;
            }
            layoutParams.width = recyclerView.getMeasuredWidth() - (this$1.f15846f * 2);
            this$0.f15848b.requestLayout();
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Boolean bool;
            Unit unit;
            Object m105816c = this.f15849c.m94545o().m109394h().get(i).m105816c();
            if (!(m105816c instanceof QCInspection)) {
                m105816c = null;
            }
            QCInspection qCInspection = (QCInspection) m105816c;
            if (qCInspection != null) {
                IW5 iw5 = this.f15849c;
                this.f15848b.setTitle(qCInspection.getTitle());
                this.f15848b.setDescription(qCInspection.getDescription());
                InspectionCardView inspectionCardView = this.f15848b;
                int i2 = C3699a.$EnumSwitchMapping$0[qCInspection.getStatus().ordinal()];
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
                inspectionCardView.setAccepted(bool);
                String assetId = qCInspection.getAssetId();
                if (assetId != null) {
                    AbstractC23442F<LocalAsset> mo13534a = iw5.f15843c.mo13534a(assetId, AssetManagerType.REPAIR, TaskPriority.IMMEDIATE);
                    ImageView m54978A = this.f15848b.m54978A();
                    RecyclerView recyclerView = iw5.f15844d;
                    if (recyclerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        recyclerView = null;
                    }
                    ScopeProvider m45202a = ViewScopeProvider.m45202a(recyclerView);
                    Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
                    C37279Yf5.m74583L(mo13534a, m54978A, m45202a);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    this.f15848b.m54978A().setImageDrawable(null);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", TransferTable.COLUMN_STATE, "", C17296a.f69688o, "(Ljava/lang/Integer;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IW5$b */
    /* loaded from: classes4.dex */
    public static final class C3700b extends Lambda implements Function1<Integer, Boolean> {

        /* renamed from: g */
        public static final C3700b f15850g = new C3700b();

        public C3700b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Integer state) {
            boolean z;
            Intrinsics.checkNotNullParameter(state, "state");
            if (state.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "Landroid/view/View;", C17296a.f69688o, "(Ljava/lang/Integer;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IW5$c */
    /* loaded from: classes4.dex */
    public static final class C3701c extends Lambda implements Function1<Integer, View> {

        /* renamed from: h */
        public final /* synthetic */ RecyclerView f15852h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3701c(RecyclerView recyclerView) {
            super(1);
            this.f15852h = recyclerView;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Integer num) {
            return IW5.this.f15845e.mo65647g(this.f15852h.getLayoutManager());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/view/View;", "child", "Lco/bird/android/model/QCInspection;", C17296a.f69688o, "(Landroid/view/View;)Lco/bird/android/model/QCInspection;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSwipeQualityControlAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeQualityControlAdapter.kt\nco/bird/android/qualitycontrol/swipe/adapters/SwipeQualityControlAdapter$onAttachedToRecyclerView$scrollListener$1$3\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,144:1\n18#2:145\n9#3,4:146\n*S KotlinDebug\n*F\n+ 1 SwipeQualityControlAdapter.kt\nco/bird/android/qualitycontrol/swipe/adapters/SwipeQualityControlAdapter$onAttachedToRecyclerView$scrollListener$1$3\n*L\n59#1:145\n59#1:146,4\n*E\n"})
    /* renamed from: IW5$d */
    /* loaded from: classes4.dex */
    public static final class C3702d extends Lambda implements Function1<View, QCInspection> {

        /* renamed from: g */
        public final /* synthetic */ RecyclerView f15853g;

        /* renamed from: h */
        public final /* synthetic */ IW5 f15854h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3702d(RecyclerView recyclerView, IW5 iw5) {
            super(1);
            this.f15853g = recyclerView;
            this.f15854h = iw5;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final QCInspection invoke(View child) {
            Intrinsics.checkNotNullParameter(child, "child");
            Object m105816c = this.f15854h.m94545o().m109394h().get(this.f15853g.getChildAdapterPosition(child)).m105816c();
            if (!(m105816c instanceof QCInspection)) {
                m105816c = null;
            }
            return (QCInspection) m105816c;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IW5$e */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C3703e extends FunctionReferenceImpl implements Function1<QCInspection, Unit> {
        public C3703e(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m101949a(QCInspection p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(QCInspection qCInspection) {
            m101949a(qCInspection);
            return Unit.INSTANCE;
        }
    }

    public IW5(InterfaceC48923su2 localAssetManager) {
        Intrinsics.checkNotNullParameter(localAssetManager, "localAssetManager");
        this.f15843c = localAssetManager;
        this.f15845e = new C11947r();
        C24552a<QCInspection> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<QCInspection>()");
        this.f15847g = m31922e;
    }

    /* renamed from: A */
    public static final void m101961A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final boolean m101955y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: B */
    public final Observable<QCInspection> m101960B() {
        Observable<QCInspection> hide = this.f15847g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "qcInspectionScrollSubject.hide()");
        return hide;
    }

    /* renamed from: C */
    public final boolean m101959C() {
        IntRange until;
        Integer num;
        boolean z;
        RecyclerView recyclerView = this.f15844d;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView = null;
        }
        RecyclerView.AbstractC11855p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return false;
        }
        View mo65647g = this.f15845e.mo65647g(layoutManager);
        if (mo65647g != null) {
            RecyclerView recyclerView3 = this.f15844d;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                recyclerView3 = null;
            }
            int childAdapterPosition = recyclerView3.getChildAdapterPosition(mo65647g);
            RecyclerView recyclerView4 = this.f15844d;
            if (recyclerView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                recyclerView4 = null;
            }
            until = RangesKt___RangesKt.until(0, recyclerView4.getChildCount());
            Iterator<Integer> it = until.iterator();
            while (true) {
                if (it.hasNext()) {
                    num = it.next();
                    int intValue = num.intValue();
                    RecyclerView recyclerView5 = this.f15844d;
                    if (recyclerView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        recyclerView5 = null;
                    }
                    View childAt = recyclerView5.getChildAt(intValue);
                    RecyclerView recyclerView6 = this.f15844d;
                    if (recyclerView6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        recyclerView6 = null;
                    }
                    if (recyclerView6.getChildAdapterPosition(childAt) == childAdapterPosition + 1) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    num = null;
                    break;
                }
            }
            Integer num2 = num;
            if (num2 == null) {
                return false;
            }
            int intValue2 = num2.intValue();
            RecyclerView recyclerView7 = this.f15844d;
            if (recyclerView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                recyclerView7 = null;
            }
            int[] mo66131c = this.f15845e.mo66131c(layoutManager, recyclerView7.getChildAt(intValue2));
            if (mo66131c == null) {
                return false;
            }
            Intrinsics.checkNotNullExpressionValue(mo66131c, "snapHelper.calculateDist…          ?: return false");
            RecyclerView recyclerView8 = this.f15844d;
            if (recyclerView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            } else {
                recyclerView2 = recyclerView8;
            }
            recyclerView2.smoothScrollBy(mo66131c[0], mo66131c[1]);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f15844d = recyclerView;
        this.f15846f = recyclerView.getContext().getResources().getDimensionPixelSize(C37044Xf4.quality_control_card_margin);
        RecyclerView recyclerView2 = this.f15844d;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView2 = null;
        }
        if (recyclerView2.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new QW5());
            this.f15845e.m66132b(recyclerView);
            C42177hX5 c42177hX5 = new C42177hX5();
            Observable<Integer> m36225b = c42177hX5.m36225b();
            final C3700b c3700b = C3700b.f15850g;
            Observable<Integer> filter = m36225b.filter(new InterfaceC23494q() { // from class: FW5
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m101955y;
                    m101955y = IW5.m101955y(Function1.this, obj);
                    return m101955y;
                }
            });
            Intrinsics.checkNotNullExpressionValue(filter, "scrollStateChanges().fil…rView.SCROLL_STATE_IDLE }");
            Observable distinctUntilChanged = C37279Yf5.m74575T(C37279Yf5.m74575T(filter, new C3701c(recyclerView)), new C3702d(recyclerView, this)).distinctUntilChanged();
            final C3703e c3703e = new C3703e(this.f15847g);
            distinctUntilChanged.subscribe(new InterfaceC23484g() { // from class: GW5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    IW5.m101961A(Function1.this, obj);
                }
            });
            recyclerView.addOnScrollListener(c42177hX5);
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new JW5();
    }

    @Override // p000.AbstractC5440My
    /* renamed from: u */
    public void mo24871u(Collection<C3023H6> sections) {
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(sections, "sections");
        boolean m109391k = m94545o().m109391k();
        super.mo24871u(sections);
        if (m109391k) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) m94545o().m109394h());
            C2637G6 c2637g6 = (C2637G6) firstOrNull;
            if (c2637g6 != null) {
                Object m105816c = c2637g6.m105816c();
                if (!(m105816c instanceof QCInspection)) {
                    m105816c = null;
                }
                QCInspection qCInspection = (QCInspection) m105816c;
                if (qCInspection != null) {
                    this.f15847g.onNext(qCInspection);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* renamed from: x */
    public final void m101956x(Boolean bool) {
        C11947r c11947r = this.f15845e;
        RecyclerView recyclerView = this.f15844d;
        InspectionCardView inspectionCardView = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView = null;
        }
        View mo65647g = c11947r.mo65647g(recyclerView.getLayoutManager());
        if (mo65647g != null) {
            if (mo65647g instanceof InspectionCardView) {
                inspectionCardView = mo65647g;
            }
            inspectionCardView = inspectionCardView;
        }
        if (inspectionCardView != null) {
            inspectionCardView.setAccepted(bool);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C43489jk4.item_inspection_card ? new C3698a(this, m41761u) : new C29735w1(m41761u);
    }
}
