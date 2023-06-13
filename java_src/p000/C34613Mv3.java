package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.persistence.nestedstructures.OperatorTask;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C34613Mv3;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\nR.\u0010\u0014\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f \u0011*\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u000b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u000e0\u000e0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m28432d2 = {"LMv3;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "", "v", "Lco/bird/android/model/persistence/nestedstructures/OperatorTask;", "w", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/a;", "searchPublisher", "Lio/reactivex/subjects/d;", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "taskPublisher", "<init>", "()V", C17296a.f69688o, "b", "task-list-v2_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Mv3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34613Mv3 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24552a<Optional<String>> f23807c;

    /* renamed from: d */
    public final C24558d<OperatorTask> f23808d;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"LMv3$a;", "Lw1;", "", "onAttachedToWindow", "b", "Landroid/view/View;", "Landroid/view/View;", "view", "Lee2;", "c", "Lee2;", "binding", "<init>", "(LMv3;Landroid/view/View;)V", "task-list-v2_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Mv3$a */
    /* loaded from: classes3.dex */
    public final class C5425a extends C29735w1 {

        /* renamed from: b */
        public final View f23809b;

        /* renamed from: c */
        public final C40462ee2 f23810c;

        /* renamed from: d */
        public final /* synthetic */ C34613Mv3 f23811d;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LHJ6;", "", C17296a.f69688o, "(LHJ6;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Mv3$a$a */
        /* loaded from: classes3.dex */
        public static final class C5426a extends Lambda implements Function1<HJ6, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C34613Mv3 f23812g;

            /* renamed from: h */
            public final /* synthetic */ C5425a f23813h;

            @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "charSequence", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "", C17296a.f69688o, "(Ljava/lang/CharSequence;III)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Mv3$a$a$a */
            /* loaded from: classes3.dex */
            public static final class C5427a extends Lambda implements Function4<CharSequence, Integer, Integer, Integer, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C34613Mv3 f23814g;

                /* renamed from: h */
                public final /* synthetic */ C5425a f23815h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C5427a(C34613Mv3 c34613Mv3, C5425a c5425a) {
                    super(4);
                    this.f23814g = c34613Mv3;
                    this.f23815h = c5425a;
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
                    if ((!r4) == true) goto L13;
                 */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
                /* renamed from: a */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void m94570a(CharSequence charSequence, int i, int i2, int i3) {
                    String str;
                    boolean z;
                    boolean isBlank;
                    boolean isBlank2;
                    C24552a c24552a = this.f23814g.f23807c;
                    Optional.C14443a c14443a = Optional.f63040c;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    c24552a.onNext(c14443a.m59033b(str));
                    TextView textView = this.f23815h.f23810c.f78647c;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.hint");
                    boolean z2 = true;
                    if (charSequence != null) {
                        isBlank2 = StringsKt__StringsJVMKt.isBlank(charSequence);
                        if (!isBlank2) {
                            z = true;
                            C49520tu6.show$default(textView, !z, 0, 2, null);
                            ImageView imageView = this.f23815h.f23810c.f78646b;
                            Intrinsics.checkNotNullExpressionValue(imageView, "binding.clear");
                            if (charSequence != null) {
                                isBlank = StringsKt__StringsJVMKt.isBlank(charSequence);
                            }
                            z2 = false;
                            C49520tu6.show$default(imageView, z2, 0, 2, null);
                        }
                    }
                    z = false;
                    C49520tu6.show$default(textView, !z, 0, 2, null);
                    ImageView imageView2 = this.f23815h.f23810c.f78646b;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "binding.clear");
                    if (charSequence != null) {
                    }
                    z2 = false;
                    C49520tu6.show$default(imageView2, z2, 0, 2, null);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    m94570a(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5426a(C34613Mv3 c34613Mv3, C5425a c5425a) {
                super(1);
                this.f23812g = c34613Mv3;
                this.f23813h = c5425a;
            }

            /* renamed from: a */
            public final void m94571a(HJ6 textChangedListener) {
                Intrinsics.checkNotNullParameter(textChangedListener, "$this$textChangedListener");
                textChangedListener.m104030b(new C5427a(this.f23812g, this.f23813h));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HJ6 hj6) {
                m94571a(hj6);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Mv3$a$b */
        /* loaded from: classes3.dex */
        public static final class C5428b extends Lambda implements Function1<View, Unit> {
            public C5428b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C5425a.this.f23810c.f78648d.getText().clear();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5425a(C34613Mv3 c34613Mv3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f23811d = c34613Mv3;
            this.f23809b = view;
            C40462ee2 m42669a = C40462ee2.m42669a(view);
            Intrinsics.checkNotNullExpressionValue(m42669a, "bind(view)");
            this.f23810c = m42669a;
        }

        /* renamed from: b */
        public final void m94572b() {
            EditText editText = this.f23810c.f78648d;
            Intrinsics.checkNotNullExpressionValue(editText, "binding.search");
            C34585Ms2.m94647x(editText, new C5426a(this.f23811d, this));
            ImageView imageView = this.f23810c.f78646b;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.clear");
            C34585Ms2.m94661j(imageView, new C5428b());
        }

        @Override // p000.C29735w1
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            m94572b();
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LMv3$b;", "Lw1;", "", "position", "", "bind", "LSb2;", "b", "LSb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LMv3;Landroid/view/View;)V", "task-list-v2_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorTaskListV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskListV2Adapter.kt\nco/bird/android/feature/operator/tasklistv2/adapter/OperatorTaskListV2Adapter$TaskViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n18#2:108\n18#2:114\n9#3,4:109\n9#3,4:115\n1#4:113\n*S KotlinDebug\n*F\n+ 1 OperatorTaskListV2Adapter.kt\nco/bird/android/feature/operator/tasklistv2/adapter/OperatorTaskListV2Adapter$TaskViewHolder\n*L\n86#1:108\n78#1:114\n86#1:109,4\n78#1:115,4\n*E\n"})
    /* renamed from: Mv3$b */
    /* loaded from: classes3.dex */
    public final class C5429b extends C29735w1 {

        /* renamed from: b */
        public final C35836Sb2 f23817b;

        /* renamed from: c */
        public final /* synthetic */ C34613Mv3 f23818c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5429b(final C34613Mv3 c34613Mv3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f23818c = c34613Mv3;
            C35836Sb2 m85209a = C35836Sb2.m85209a(view);
            Intrinsics.checkNotNullExpressionValue(m85209a, "bind(view)");
            this.f23817b = m85209a;
            m85209a.getRoot().setOnClickListener(new View.OnClickListener() { // from class: Nv3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C34613Mv3.C5429b.m94568b(C34613Mv3.C5429b.this, c34613Mv3, view2);
                }
            });
            ImageView imageView = m85209a.f33945e;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.more");
            C49520tu6.m11239l(imageView);
        }

        /* renamed from: b */
        public static final void m94568b(C5429b this$0, C34613Mv3 this$1, View view) {
            C2637G6 m109397e;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Integer safePosition = this$0.getSafePosition();
            if (safePosition != null && (m109397e = this$1.m94545o().m109397e(safePosition.intValue())) != null) {
                Object m105816c = m109397e.m105816c();
                if (!(m105816c instanceof OperatorTask)) {
                    m105816c = null;
                }
                OperatorTask operatorTask = (OperatorTask) m105816c;
                if (operatorTask != null) {
                    this$1.f23808d.onNext(operatorTask);
                }
            }
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            int i2;
            Object m105816c = this.f23818c.m94545o().m109394h().get(i).m105816c();
            Drawable drawable = null;
            if (!(m105816c instanceof OperatorTask)) {
                m105816c = null;
            }
            OperatorTask operatorTask = (OperatorTask) m105816c;
            if (operatorTask != null) {
                this.f23817b.f33944d.setText(operatorTask.getBirdCode());
                this.f23817b.f33948h.setText(operatorTask.getSubtitle());
                TextView textView = this.f23817b.f33948h;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.subtitle");
                if (operatorTask.getSubtitle() != null) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(textView, z, 0, 2, null);
                ThemedColors subtitleColor = operatorTask.getSubtitleColor();
                if (subtitleColor != null) {
                    int lightMode = subtitleColor.getLightMode();
                    TextView textView2 = this.f23817b.f33948h;
                    Intrinsics.checkNotNullExpressionValue(textView2, "binding.subtitle");
                    textView2.setTextColor(lightMode);
                }
                Integer batteryLevel = operatorTask.getBatteryLevel();
                if (batteryLevel != null) {
                    i2 = batteryLevel.intValue();
                } else {
                    i2 = 0;
                }
                this.f23817b.f33942b.setBatteryLevel(i2 / 100.0f);
                this.f23817b.f33943c.setText(this.itemView.getContext().getString(C45871nl4.battery_percent, Integer.valueOf(i2)));
                ImageView imageView = this.f23817b.f33946f;
                ClientIcon statusIcon = operatorTask.getStatusIcon();
                if (statusIcon != null) {
                    Context context = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                    drawable = C33341Hk0.m103484a(statusIcon, context);
                }
                imageView.setImageDrawable(drawable);
                ThemedColors statusIconBackgroundColor = operatorTask.getStatusIconBackgroundColor();
                if (statusIconBackgroundColor != null) {
                    this.f23817b.f33946f.setBackgroundTintList(ColorStateList.valueOf(statusIconBackgroundColor.getLightMode()));
                }
                this.f23817b.f33947g.setText(operatorTask.getStatusDisplayName());
            }
        }
    }

    public C34613Mv3() {
        C24552a<Optional<String>> m31921g = C24552a.m31921g(Optional.f63040c.m59034a());
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(Optional.absent<String>())");
        this.f23807c = m31921g;
        C24558d<OperatorTask> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<OperatorTask>()");
        this.f23808d = m31902e;
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C35081Ov3();
    }

    /* renamed from: v */
    public final Observable<Optional<String>> m94575v() {
        Observable<Optional<String>> hide = this.f23807c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "searchPublisher.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<OperatorTask> m94574w() {
        Observable<OperatorTask> hide = this.f23808d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "taskPublisher.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C51779xj4.item_operator_task_list_search_v2 ? new C5425a(this, m41761u) : i == C45268mk4.item_fleet_status_vehicle ? new C5429b(this, m41761u) : new C29735w1(m41761u);
    }
}
