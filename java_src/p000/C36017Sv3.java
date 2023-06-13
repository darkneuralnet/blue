package p000;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.C11925l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.BirdTaskAction;
import co.bird.android.model.persistence.nestedstructures.OperatorTask;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24578y;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24558d;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C36017Sv3;
import p000.C49495ts1;
import p000.InterfaceC37187Xv3;
import p000.S74;
@Metadata(m28433d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001RB\u0007¢\u0006\u0004\bO\u0010PJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b1\u00102R\"\u00109\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u00010505048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R&\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0@0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>R \u0010H\u001a\b\u0012\u0004\u0012\u00020E0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010<\u001a\u0004\bG\u0010>R!\u0010K\u001a\b\u0012\u0004\u0012\u00020E0:8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bI\u0010\"\u001a\u0004\bJ\u0010>R \u0010N\u001a\b\u0012\u0004\u0012\u0002050:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010<\u001a\u0004\bM\u0010>¨\u0006S"}, m28432d2 = {"LSv3;", "Landroidx/fragment/app/Fragment;", "Ltw3;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Luw3;", TransferTable.COLUMN_STATE, "D9", "Lio/reactivex/h;", "T0", "Llw3;", "b", "Llw3;", "A9", "()Llw3;", "setPresenter", "(Llw3;)V", "presenter", "Luy1;", "c", "Luy1;", "binding", "Lsx4;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "N6", "()Lsx4;", "delegate", "LMv3;", "e", "LMv3;", "adapter", "LmX5;", "f", "B9", "()LmX5;", "swipeHelper", "Landroidx/recyclerview/widget/l;", "g", "t8", "()Landroidx/recyclerview/widget/l;", "itemTouchHelper", "Lio/reactivex/subjects/d;", "LSc0;", "kotlin.jvm.PlatformType", "h", "Lio/reactivex/subjects/d;", "cancelTaskOkResponse", "Lio/reactivex/Observable;", "i", "Lio/reactivex/Observable;", "r0", "()Lio/reactivex/Observable;", "swipeRefreshed", "Lco/bird/android/buava/Optional;", "", "j", "P2", "searchTermChanges", "Lco/bird/android/model/persistence/nestedstructures/OperatorTask;", "k", "C6", "taskClicks", "l", "r2", "swipeToDelete", "m", "X4", "cancelTaskDialogOkResponse", "<init>", "()V", "n", C17296a.f69688o, "task-list-v2_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorTaskListV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskListV2Fragment.kt\nco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Fragment\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,142:1\n64#2:143\n64#2:145\n199#3:144\n*S KotlinDebug\n*F\n+ 1 OperatorTaskListV2Fragment.kt\nco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Fragment\n*L\n125#1:143\n139#1:145\n125#1:144\n*E\n"})
/* renamed from: Sv3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36017Sv3 extends Fragment implements InterfaceC49537tw3 {

    /* renamed from: n */
    public static final C7601a f34472n = new C7601a(null);

    /* renamed from: b */
    public C44794lw3 f34473b;

    /* renamed from: c */
    public C50148uy1 f34474c;

    /* renamed from: d */
    public final Lazy f34475d;

    /* renamed from: e */
    public final C34613Mv3 f34476e;

    /* renamed from: f */
    public final Lazy f34477f;

    /* renamed from: g */
    public final Lazy f34478g;

    /* renamed from: h */
    public final C24558d<C35843Sc0> f34479h;

    /* renamed from: i */
    public final Observable<Unit> f34480i;

    /* renamed from: j */
    public final Observable<Optional<String>> f34481j;

    /* renamed from: k */
    public final Observable<OperatorTask> f34482k;

    /* renamed from: l */
    public final Lazy f34483l;

    /* renamed from: m */
    public final Observable<C35843Sc0> f34484m;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m28432d2 = {"LSv3$a;", "", "", "taskGroupTitle", "LSv3;", C17296a.f69688o, "<init>", "()V", "task-list-v2_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Sv3$a */
    /* loaded from: classes3.dex */
    public static final class C7601a {
        public /* synthetic */ C7601a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C36017Sv3 m84611a(String taskGroupTitle) {
            Intrinsics.checkNotNullParameter(taskGroupTitle, "taskGroupTitle");
            C36017Sv3 c36017Sv3 = new C36017Sv3();
            Bundle bundle = new Bundle();
            bundle.putString("operator_task_group_title", taskGroupTitle);
            c36017Sv3.setArguments(bundle);
            return c36017Sv3;
        }

        private C7601a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lsx4;", "b", "()Lsx4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Sv3$b */
    /* loaded from: classes3.dex */
    public static final class C7602b extends Lambda implements Function0<C48955sx4> {
        public C7602b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C48955sx4 invoke() {
            FragmentActivity activity = C36017Sv3.this.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            return new C48955sx4((AppCompatActivity) activity);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/recyclerview/widget/l;", "b", "()Landroidx/recyclerview/widget/l;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Sv3$c */
    /* loaded from: classes3.dex */
    public static final class C7603c extends Lambda implements Function0<C11925l> {
        public C7603c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C11925l invoke() {
            return new C11925l(C36017Sv3.this.m84617B9());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Sv3$d */
    /* loaded from: classes3.dex */
    public static final class C7604d extends Lambda implements Function1<DialogResponse, Unit> {

        /* renamed from: h */
        public final /* synthetic */ AbstractC50130uw3 f34488h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Sv3$d$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C7605a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DialogResponse.values().length];
                try {
                    iArr[DialogResponse.OK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7604d(AbstractC50130uw3 abstractC50130uw3) {
            super(1);
            this.f34488h = abstractC50130uw3;
        }

        /* renamed from: a */
        public final void m84608a(DialogResponse dialogResponse) {
            int i;
            if (dialogResponse == null) {
                i = -1;
            } else {
                i = C7605a.$EnumSwitchMapping$0[dialogResponse.ordinal()];
            }
            if (i == 1) {
                C36017Sv3.this.f34479h.onNext(((C37802aA5) this.f34488h).m71806b());
            } else {
                C36017Sv3.this.f34476e.notifyDataSetChanged();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m84608a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LmX5;", "b", "()LmX5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Sv3$e */
    /* loaded from: classes3.dex */
    public static final class C7606e extends Lambda implements Function0<C45142mX5> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroidx/recyclerview/widget/RecyclerView$D;", "viewHolder", "", C17296a.f69688o, "(Landroidx/recyclerview/widget/RecyclerView$D;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nOperatorTaskListV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskListV2Fragment.kt\nco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Fragment$swipeHelper$2$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n18#2:143\n9#3,4:144\n1747#4,3:148\n*S KotlinDebug\n*F\n+ 1 OperatorTaskListV2Fragment.kt\nco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Fragment$swipeHelper$2$1\n*L\n62#1:143\n62#1:144,4\n62#1:148,3\n*E\n"})
        /* renamed from: Sv3$e$a */
        /* loaded from: classes3.dex */
        public static final class C7607a extends Lambda implements Function1<RecyclerView.AbstractC11834D, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ C36017Sv3 f34490g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7607a(C36017Sv3 c36017Sv3) {
                super(1);
                this.f34490g = c36017Sv3;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(RecyclerView.AbstractC11834D viewHolder) {
                List<BirdTaskAction> actions;
                boolean z;
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                if (viewHolder.getBindingAdapterPosition() == 0) {
                    return Boolean.FALSE;
                }
                Object m105816c = this.f34490g.f34476e.m94544p(viewHolder.getBindingAdapterPosition()).m105816c();
                if (!(m105816c instanceof OperatorTask)) {
                    m105816c = null;
                }
                OperatorTask operatorTask = (OperatorTask) m105816c;
                boolean z2 = false;
                if (operatorTask != null && (actions = operatorTask.getActions()) != null) {
                    List<BirdTaskAction> list = actions;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (BirdTaskAction birdTaskAction : list) {
                            if (BirdTaskAction.Companion.getCANCEL_ACTIONS().contains(birdTaskAction)) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            }
        }

        public C7606e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C45142mX5 invoke() {
            FragmentActivity requireActivity = C36017Sv3.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            return new C45142mX5(requireActivity, 0, new C7607a(C36017Sv3.this), null, 10, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/y;", "", "emitter", "b", "(Lio/reactivex/y;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Sv3$f */
    /* loaded from: classes3.dex */
    public static final class C7608f extends Lambda implements Function1<InterfaceC24578y<Unit>, Unit> {
        public C7608f() {
            super(1);
        }

        /* renamed from: c */
        public static final void m84603c(InterfaceC24578y emitter) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            emitter.onNext(Unit.INSTANCE);
        }

        /* renamed from: b */
        public final void m84604b(final InterfaceC24578y<Unit> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            C50148uy1 c50148uy1 = C36017Sv3.this.f34474c;
            if (c50148uy1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c50148uy1 = null;
            }
            c50148uy1.f113253d.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC11985j() { // from class: Tv3
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC11985j
                public final void onRefresh() {
                    C36017Sv3.C7608f.m84603c(InterfaceC24578y.this);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC24578y<Unit> interfaceC24578y) {
            m84604b(interfaceC24578y);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/nestedstructures/OperatorTask;", "kotlin.jvm.PlatformType", "c", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Sv3$g */
    /* loaded from: classes3.dex */
    public static final class C7609g extends Lambda implements Function0<Observable<OperatorTask>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Sv3$g$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C7610a extends FunctionReferenceImpl implements Function1<Integer, C2637G6> {
            public C7610a(Object obj) {
                super(1, obj, C34613Mv3.class, "getAdapterItem", "getAdapterItem(I)Lco/bird/android/widget/adapter/AdapterItem;", 0);
            }

            /* renamed from: a */
            public final C2637G6 m84597a(int i) {
                return ((C34613Mv3) this.receiver).m94544p(i);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C2637G6 invoke(Integer num) {
                return m84597a(num.intValue());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LG6;", "item", "Lco/bird/android/model/persistence/nestedstructures/OperatorTask;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LG6;)Lco/bird/android/model/persistence/nestedstructures/OperatorTask;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Sv3$g$b */
        /* loaded from: classes3.dex */
        public static final class C7611b extends Lambda implements Function1<C2637G6, OperatorTask> {

            /* renamed from: g */
            public static final C7611b f34493g = new C7611b();

            public C7611b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final OperatorTask invoke(C2637G6 item) {
                Intrinsics.checkNotNullParameter(item, "item");
                Object m105816c = item.m105816c();
                Intrinsics.checkNotNull(m105816c, "null cannot be cast to non-null type co.bird.android.model.persistence.nestedstructures.OperatorTask");
                return (OperatorTask) m105816c;
            }
        }

        public C7609g() {
            super(0);
        }

        /* renamed from: d */
        public static final C2637G6 m84599d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (C2637G6) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final OperatorTask m84598e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (OperatorTask) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c */
        public final Observable<OperatorTask> invoke() {
            Observable<Integer> m25451b = C36017Sv3.this.m84617B9().m25451b();
            final C7610a c7610a = new C7610a(C36017Sv3.this.f34476e);
            Observable<R> map = m25451b.map(new InterfaceC23492o() { // from class: Uv3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    C2637G6 m84599d;
                    m84599d = C36017Sv3.C7609g.m84599d(Function1.this, obj);
                    return m84599d;
                }
            });
            final C7611b c7611b = C7611b.f34493g;
            return map.map(new InterfaceC23492o() { // from class: Vv3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    OperatorTask m84598e;
                    m84598e = C36017Sv3.C7609g.m84598e(Function1.this, obj);
                    return m84598e;
                }
            });
        }
    }

    public C36017Sv3() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        lazy = LazyKt__LazyJVMKt.lazy(new C7602b());
        this.f34475d = lazy;
        C34613Mv3 c34613Mv3 = new C34613Mv3();
        this.f34476e = c34613Mv3;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C7606e());
        this.f34477f = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C7603c());
        this.f34478g = lazy3;
        C24558d<C35843Sc0> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<CancelTaskData>()");
        this.f34479h = m31902e;
        this.f34480i = C45832nh5.m23307i(new C7608f());
        this.f34481j = c34613Mv3.m94575v();
        this.f34482k = c34613Mv3.m94574w();
        lazy4 = LazyKt__LazyJVMKt.lazy(new C7609g());
        this.f34483l = lazy4;
        Observable<C35843Sc0> hide = m31902e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "cancelTaskOkResponse.hide()");
        this.f34484m = hide;
    }

    /* renamed from: E9 */
    public static final void m84615E9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A9 */
    public final C44794lw3 m84618A9() {
        C44794lw3 c44794lw3 = this.f34473b;
        if (c44794lw3 != null) {
            return c44794lw3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: B9 */
    public final C45142mX5 m84617B9() {
        return (C45142mX5) this.f34477f.getValue();
    }

    @Override // p000.InterfaceC49537tw3
    /* renamed from: C6 */
    public Observable<OperatorTask> mo11195C6() {
        return this.f34482k;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: D9 */
    public void render(AbstractC50130uw3 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C38849bw5) {
            this.f34476e.mo24871u(((C38849bw5) state).m62114b());
            return;
        }
        C50148uy1 c50148uy1 = null;
        if (state instanceof C50863wA5) {
            C50148uy1 c50148uy12 = this.f34474c;
            if (c50148uy12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c50148uy1 = c50148uy12;
            }
            c50148uy1.f113253d.setRefreshing(((C50863wA5) state).m7315b());
        } else if (state instanceof C32956Ft2) {
            S74.C7343a.showProgress$default(m84614N6(), ((C32956Ft2) state).m106321b(), 0, 2, null);
        } else if (state instanceof C45528nA5) {
            m84614N6().snackToast(getResources().getString(C45871nl4.operator_task_list_v2_pull_to_refersh));
        } else if (state instanceof C40784fA5) {
            m84614N6().errorGeneric();
        } else if (state instanceof C42563iA5) {
            C49495ts1 newInstance$default = C49495ts1.C28846a.newInstance$default(C49495ts1.f111173f, ((C42563iA5) state).m34381b(), false, 2, null);
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type co.bird.android.core.mrp.BaseActivityLite");
            newInstance$default.show(((BaseActivityLite) activity).getSupportFragmentManager(), "FlightSheetBottomSheetFragment");
        } else if (state instanceof C37802aA5) {
            AbstractC23442F<DialogResponse> birdDialog = m84614N6().birdDialog(C35609Rc0.f32300d, true, true);
            AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
            Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
            Object m33135e = birdDialog.m33135e(AutoDispose.m45239a(m45195i));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C7604d c7604d = new C7604d(state);
            ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: Rv3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C36017Sv3.m84615E9(Function1.this, obj);
                }
            });
        } else if (state instanceof IL4) {
            this.f34476e.notifyDataSetChanged();
        }
    }

    /* renamed from: N6 */
    public final C48955sx4 m84614N6() {
        return (C48955sx4) this.f34475d.getValue();
    }

    @Override // p000.InterfaceC49537tw3
    /* renamed from: P2 */
    public Observable<Optional<String>> mo11194P2() {
        return this.f34481j;
    }

    @Override // com.uber.autodispose.ScopeProvider
    /* renamed from: T0 */
    public InterfaceC23496h mo231T0() {
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        InterfaceC23496h mo231T0 = m45195i.mo231T0();
        Intrinsics.checkNotNullExpressionValue(mo231T0, "scope(FragmentLifecycleResolver).requestScope()");
        return mo231T0;
    }

    @Override // p000.InterfaceC49537tw3
    /* renamed from: X4 */
    public Observable<C35843Sc0> mo11193X4() {
        return this.f34484m;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        InterfaceC37187Xv3.InterfaceC9553a m34053a = C42675iN0.m34053a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "requireActivity().application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("operator_task_group_title");
        } else {
            str = null;
        }
        m34053a.mo34052a(m21419a, str).mo34051a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C50148uy1 m9423c = C50148uy1.m9423c(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(m9423c, "inflate(inflater, container, false)");
        this.f34474c = m9423c;
        if (m9423c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m9423c = null;
        }
        return m9423c.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C50148uy1 c50148uy1 = this.f34474c;
        if (c50148uy1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c50148uy1 = null;
        }
        RecyclerView recyclerView = c50148uy1.f113252c;
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(this.f34476e);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        m84612t8().m66204g(recyclerView);
        m84618A9().consume(this);
    }

    @Override // p000.InterfaceC49537tw3
    /* renamed from: r0 */
    public Observable<Unit> mo11192r0() {
        return this.f34480i;
    }

    @Override // p000.InterfaceC49537tw3
    /* renamed from: r2 */
    public Observable<OperatorTask> mo11191r2() {
        Object value = this.f34483l.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-swipeToDelete>(...)");
        return (Observable) value;
    }

    /* renamed from: t8 */
    public final C11925l m84612t8() {
        return (C11925l) this.f34478g.getValue();
    }
}
