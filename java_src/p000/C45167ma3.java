package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.OperatorNotification;
import co.bird.android.model.constant.NotificationIconPinShape;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
import com.facebook.share.internal.C17296a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000eR\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, m28432d2 = {"Lma3;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lkotlin/Function1;", "Lco/bird/android/model/OperatorNotification;", "onNotificationClick", "v", "c", "Lkotlin/jvm/functions/Function1;", "<init>", "()V", C17296a.f69688o, "b", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ma3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45167ma3 extends AbstractC52206yS0 {

    /* renamed from: c */
    public Function1<? super OperatorNotification, Unit> f98353c = C26125c.f98366g;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lma3$a;", "Lw1;", "", "position", "", "bind", "LFb2;", "b", "LFb2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lma3;Landroid/view/View;)V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNotificationCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/NotificationCenterAdapter$DateHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,155:1\n18#2:156\n9#3,4:157\n*S KotlinDebug\n*F\n+ 1 NotificationCenterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/NotificationCenterAdapter$DateHeaderViewHolder\n*L\n59#1:156\n59#1:157,4\n*E\n"})
    /* renamed from: ma3$a */
    /* loaded from: classes3.dex */
    public final class C26118a extends C29735w1 {

        /* renamed from: b */
        public final C32794Fb2 f98354b;

        /* renamed from: c */
        public final /* synthetic */ C45167ma3 f98355c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26118a(C45167ma3 c45167ma3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f98355c = c45167ma3;
            C32794Fb2 m106919a = C32794Fb2.m106919a(view);
            Intrinsics.checkNotNullExpressionValue(m106919a, "bind(view)");
            this.f98354b = m106919a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView textView = this.f98354b.f9748b;
            Object m105816c = this.f98355c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            textView.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\t\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0011R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u001c"}, m28432d2 = {"Lma3$b;", "Lw1;", "", "position", "", "bind", "LOT3;", "Lco/bird/android/model/OperatorNotification;", TransferService.INTENT_KEY_NOTIFICATION, "j", "LLd2;", "b", "LLd2;", "binding", "", "c", "Lkotlin/Lazy;", "()[LOT3;", "circlePins", DateTokenConverter.CONVERTER_KEY, "e", "squarePins", "i", "teardropPins", "Landroid/view/View;", "view", "<init>", "(Lma3;Landroid/view/View;)V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNotificationCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/NotificationCenterAdapter$NotificationViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,155:1\n18#2:156\n9#3,4:157\n1#4:161\n13579#5,2:162\n13579#5,2:164\n13579#5,2:166\n*S KotlinDebug\n*F\n+ 1 NotificationCenterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/NotificationCenterAdapter$NotificationViewHolder\n*L\n109#1:156\n109#1:157,4\n120#1:162,2\n127#1:164,2\n134#1:166,2\n*E\n"})
    /* renamed from: ma3$b */
    /* loaded from: classes3.dex */
    public final class C26119b extends C29735w1 {

        /* renamed from: b */
        public final C34216Ld2 f98356b;

        /* renamed from: c */
        public final Lazy f98357c;

        /* renamed from: d */
        public final Lazy f98358d;

        /* renamed from: e */
        public final Lazy f98359e;

        /* renamed from: f */
        public final /* synthetic */ C45167ma3 f98360f;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nNotificationCenterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/NotificationCenterAdapter$NotificationViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n18#2:156\n9#3,4:157\n1#4:161\n*S KotlinDebug\n*F\n+ 1 NotificationCenterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/NotificationCenterAdapter$NotificationViewHolder$1\n*L\n102#1:156\n102#1:157,4\n*E\n"})
        /* renamed from: ma3$b$a */
        /* loaded from: classes3.dex */
        public static final class C26120a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C45167ma3 f98361g;

            /* renamed from: h */
            public final /* synthetic */ C26119b f98362h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C26120a(C45167ma3 c45167ma3, C26119b c26119b) {
                super(1);
                this.f98361g = c45167ma3;
                this.f98362h = c26119b;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                OperatorNotification operatorNotification;
                Object m105816c = this.f98361g.m94545o().m109397e(this.f98362h.getBindingAdapterPosition()).m105816c();
                if (!(m105816c instanceof Pair)) {
                    m105816c = null;
                }
                Pair pair = (Pair) m105816c;
                if (pair == null || (operatorNotification = (OperatorNotification) pair.getFirst()) == null) {
                    return;
                }
                this.f98361g.f98353c.invoke(operatorNotification);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ma3$b$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C26121b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NotificationIconPinShape.values().length];
                try {
                    iArr[NotificationIconPinShape.CIRCLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NotificationIconPinShape.SQUARE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[NotificationIconPinShape.TEARDROP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"", "LOT3;", "b", "()[LOT3;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ma3$b$c */
        /* loaded from: classes3.dex */
        public static final class C26122c extends Lambda implements Function0<OT3[]> {
            public C26122c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b */
            public final OT3[] invoke() {
                OT3[] ot3Arr = new OT3[3];
                for (int i = 0; i < 3; i++) {
                    OT3 m92243c = OT3.m92243c(C40788fB0.m41772j(C26119b.this.getContext()), C26119b.this.f98356b.f21820c, false);
                    Intrinsics.checkNotNullExpressionValue(m92243c, "inflate(context.layoutIn…ter, binding.icon, false)");
                    ViewGroup.LayoutParams layoutParams = m92243c.getRoot().getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = (2 - i) * ((int) C49347td3.m12001b(4));
                    m92243c.getRoot().setLayoutParams(layoutParams2);
                    ot3Arr[i] = m92243c;
                }
                return ot3Arr;
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"", "LOT3;", "b", "()[LOT3;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ma3$b$d */
        /* loaded from: classes3.dex */
        public static final class C26123d extends Lambda implements Function0<OT3[]> {
            public C26123d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b */
            public final OT3[] invoke() {
                OT3[] ot3Arr = new OT3[3];
                for (int i = 0; i < 3; i++) {
                    PT3 m90204c = PT3.m90204c(C40788fB0.m41772j(C26119b.this.getContext()), C26119b.this.f98356b.f21820c, false);
                    Intrinsics.checkNotNullExpressionValue(m90204c, "inflate(context.layoutIn…ter, binding.icon, false)");
                    ViewGroup.LayoutParams layoutParams = m90204c.getRoot().getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = (2 - i) * ((int) C49347td3.m12001b(4));
                    m90204c.getRoot().setLayoutParams(layoutParams2);
                    ot3Arr[i] = OT3.m92245a(m90204c.getRoot());
                }
                return ot3Arr;
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"", "LOT3;", "b", "()[LOT3;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ma3$b$e */
        /* loaded from: classes3.dex */
        public static final class C26124e extends Lambda implements Function0<OT3[]> {
            public C26124e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b */
            public final OT3[] invoke() {
                OT3[] ot3Arr = new OT3[3];
                for (int i = 0; i < 3; i++) {
                    QT3 m88479c = QT3.m88479c(C40788fB0.m41772j(C26119b.this.getContext()), C26119b.this.f98356b.f21820c, false);
                    Intrinsics.checkNotNullExpressionValue(m88479c, "inflate(context.layoutIn…ter, binding.icon, false)");
                    ViewGroup.LayoutParams layoutParams = m88479c.getRoot().getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = (2 - i) * ((int) C49347td3.m12001b(4));
                    m88479c.getRoot().setLayoutParams(layoutParams2);
                    ot3Arr[i] = OT3.m92245a(m88479c.getRoot());
                }
                return ot3Arr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26119b(C45167ma3 c45167ma3, View view) {
            super(view);
            Lazy lazy;
            Lazy lazy2;
            Lazy lazy3;
            Intrinsics.checkNotNullParameter(view, "view");
            this.f98360f = c45167ma3;
            C34216Ld2 m96538a = C34216Ld2.m96538a(view);
            Intrinsics.checkNotNullExpressionValue(m96538a, "bind(view)");
            this.f98356b = m96538a;
            lazy = LazyKt__LazyJVMKt.lazy(new C26122c());
            this.f98357c = lazy;
            lazy2 = LazyKt__LazyJVMKt.lazy(new C26123d());
            this.f98358d = lazy2;
            lazy3 = LazyKt__LazyJVMKt.lazy(new C26124e());
            this.f98359e = lazy3;
            ConstraintLayout root = m96538a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C26120a(c45167ma3, this));
        }

        /* renamed from: b */
        public final OT3[] m25419b() {
            return (OT3[]) this.f98357c.getValue();
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f98360f.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                OperatorNotification operatorNotification = (OperatorNotification) pair.component1();
                this.f98356b.f21822e.setText(operatorNotification.getTitle());
                this.f98356b.f21819b.setText(operatorNotification.getDescription());
                this.f98356b.f21821d.setText((String) pair.component2());
                this.f98356b.f21820c.removeAllViews();
                int i2 = C26121b.$EnumSwitchMapping$0[operatorNotification.getIcon().getPinShape().ordinal()];
                int i3 = 0;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            if (operatorNotification instanceof OperatorNotification.NotificationGroup) {
                                OT3[] m25417i = m25417i();
                                int length = m25417i.length;
                                while (i3 < length) {
                                    OT3 teardropPin = m25417i[i3];
                                    Intrinsics.checkNotNullExpressionValue(teardropPin, "teardropPin");
                                    m25416j(teardropPin, operatorNotification);
                                    i3++;
                                }
                                return;
                            }
                            OT3 ot3 = m25417i()[0];
                            Intrinsics.checkNotNullExpressionValue(ot3, "teardropPins[0]");
                            m25416j(ot3, operatorNotification);
                        }
                    } else if (operatorNotification instanceof OperatorNotification.NotificationGroup) {
                        OT3[] m25418e = m25418e();
                        int length2 = m25418e.length;
                        while (i3 < length2) {
                            OT3 squarePin = m25418e[i3];
                            Intrinsics.checkNotNullExpressionValue(squarePin, "squarePin");
                            m25416j(squarePin, operatorNotification);
                            i3++;
                        }
                    } else {
                        OT3 ot32 = m25418e()[0];
                        Intrinsics.checkNotNullExpressionValue(ot32, "squarePins[0]");
                        m25416j(ot32, operatorNotification);
                    }
                } else if (operatorNotification instanceof OperatorNotification.NotificationGroup) {
                    OT3[] m25419b = m25419b();
                    int length3 = m25419b.length;
                    while (i3 < length3) {
                        m25416j(m25419b[i3], operatorNotification);
                        i3++;
                    }
                } else {
                    m25416j(m25419b()[0], operatorNotification);
                }
            }
        }

        /* renamed from: e */
        public final OT3[] m25418e() {
            return (OT3[]) this.f98358d.getValue();
        }

        /* renamed from: i */
        public final OT3[] m25417i() {
            return (OT3[]) this.f98359e.getValue();
        }

        /* renamed from: j */
        public final void m25416j(OT3 ot3, OperatorNotification operatorNotification) {
            ot3.f26624c.setColor(operatorNotification.getIcon().getIconBackgroundColor().getLightMode());
            ot3.f26623b.setImageDrawable(C33341Hk0.m103484a(operatorNotification.getIcon().getIcon(), getContext()));
            ot3.f26623b.setImageTintList(ColorStateList.valueOf(operatorNotification.getIcon().getIconColor().getLightMode()));
            if (!Intrinsics.areEqual(ot3.getRoot().getParent(), this.f98356b.f21820c)) {
                this.f98356b.f21820c.addView(ot3.getRoot());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/OperatorNotification;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/OperatorNotification;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ma3$c */
    /* loaded from: classes3.dex */
    public static final class C26125c extends Lambda implements Function1<OperatorNotification, Unit> {

        /* renamed from: g */
        public static final C26125c f98366g = new C26125c();

        public C26125c() {
            super(1);
        }

        /* renamed from: a */
        public final void m25412a(OperatorNotification it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OperatorNotification operatorNotification) {
            m25412a(operatorNotification);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C32084Ca3());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C45760na3();
    }

    /* renamed from: v */
    public final void m25421v(Function1<? super OperatorNotification, Unit> onNotificationClick) {
        Intrinsics.checkNotNullParameter(onNotificationClick, "onNotificationClick");
        this.f98353c = onNotificationClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C48815sj4.item_date_header ? new C26118a(this, m41761u) : i == C48815sj4.item_notification ? new C26119b(this, m41761u) : new C29735w1(m41761u);
    }
}
