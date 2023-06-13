package co.bird.android.feature.notificationcenter.details;

import android.app.Application;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.TextView;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.notificationcenter.details.NotificationDetailsActivity;
import co.bird.android.model.constant.NotificationIconPinShape;
import co.bird.android.model.persistence.Notification;
import co.bird.android.model.persistence.nestedstructures.NotificationAction;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.subjects.C24567g;
import java.text.DateFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import org.joda.time.Days;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001(B\u0007¢\u0006\u0004\b%\u0010&J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010$\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\u000b0\u000b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, m28432d2 = {"Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LNc3;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LOc3;", TransferTable.COLUMN_STATE, "S", "Lio/reactivex/F;", "", "N3", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/nestedstructures/NotificationAction;", "c1", "LKc3;", "j", "LKc3;", "R", "()LKc3;", "setPresenter", "(LKc3;)V", "presenter", "Lt4;", "k", "Lt4;", "binding", "Lpa3;", "l", "Lpa3;", "component", "Lio/reactivex/subjects/g;", "kotlin.jvm.PlatformType", "m", "Lio/reactivex/subjects/g;", "notificationIdSubject", "<init>", "()V", "n", C17296a.f69688o, "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationDetailsActivity.kt\nco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
/* loaded from: classes3.dex */
public final class NotificationDetailsActivity extends BaseActivityLite implements InterfaceC34676Nc3 {

    /* renamed from: n */
    public static final C15010a f64268n = new C15010a(null);

    /* renamed from: o */
    public static final DateFormat f64269o = DateFormat.getTimeInstance(3);

    /* renamed from: j */
    public C33974Kc3 f64270j;

    /* renamed from: k */
    public C28514t4 f64271k;

    /* renamed from: l */
    public InterfaceC46946pa3 f64272l;

    /* renamed from: m */
    public final C24567g<String> f64273m;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"Lco/bird/android/feature/notificationcenter/details/NotificationDetailsActivity$a;", "", "Ljava/text/DateFormat;", "kotlin.jvm.PlatformType", "TIME_FORMATTER", "Ljava/text/DateFormat;", "<init>", "()V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.notificationcenter.details.NotificationDetailsActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15010a {
        public /* synthetic */ C15010a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C15010a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.notificationcenter.details.NotificationDetailsActivity$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15011b {
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

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "<anonymous parameter 0>", "LOc3;", TransferTable.COLUMN_STATE, "Lco/bird/android/model/persistence/nestedstructures/NotificationAction;", C17296a.f69688o, "(Lkotlin/Unit;LOc3;)Lco/bird/android/model/persistence/nestedstructures/NotificationAction;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.notificationcenter.details.NotificationDetailsActivity$c */
    /* loaded from: classes3.dex */
    public static final class C15012c extends Lambda implements Function2<Unit, C34910Oc3, NotificationAction> {

        /* renamed from: g */
        public static final C15012c f64274g = new C15012c();

        public C15012c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final NotificationAction invoke(Unit unit, C34910Oc3 state) {
            Object first;
            Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(state, "state");
            Notification m91848b = state.m91848b();
            Intrinsics.checkNotNull(m91848b);
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) m91848b.getActions());
            return (NotificationAction) first;
        }
    }

    public NotificationDetailsActivity() {
        C24567g<String> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<String>()");
        this.f64273m = m31882w0;
    }

    /* renamed from: Q */
    public static final NotificationAction m57893Q(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (NotificationAction) tmp0.invoke(obj, obj2);
    }

    @Override // p000.InterfaceC34676Nc3
    /* renamed from: N3 */
    public AbstractC23442F<String> mo57895N3() {
        AbstractC23442F<String> m33160F = this.f64273m.m33160F();
        Intrinsics.checkNotNullExpressionValue(m33160F, "notificationIdSubject.hide()");
        return m33160F;
    }

    /* renamed from: R */
    public final C33974Kc3 m57892R() {
        C33974Kc3 c33974Kc3 = this.f64270j;
        if (c33974Kc3 != null) {
            return c33974Kc3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: S */
    public void render(C34910Oc3 state) {
        Spanned spanned;
        String format;
        Object firstOrNull;
        Object firstOrNull2;
        String title;
        Intrinsics.checkNotNullParameter(state, "state");
        Notification m91848b = state.m91848b();
        if (m91848b != null) {
            C28514t4 c28514t4 = this.f64271k;
            C28514t4 c28514t42 = null;
            if (c28514t4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c28514t4 = null;
            }
            c28514t4.f109797h.setText(m91848b.getTitle());
            C28514t4 c28514t43 = this.f64271k;
            if (c28514t43 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c28514t43 = null;
            }
            c28514t43.f109795f.setText(m91848b.getShortDescription());
            C28514t4 c28514t44 = this.f64271k;
            if (c28514t44 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c28514t44 = null;
            }
            TextView textView = c28514t44.f109793d;
            String fullDescription = m91848b.getFullDescription();
            if (fullDescription != null) {
                spanned = C50976wN1.m6966a(fullDescription, 63);
            } else {
                spanned = null;
            }
            textView.setText(spanned);
            if (Math.abs(Days.daysBetween(DateTime.now().toLocalDate(), m91848b.getDate().toLocalDate()).getDays()) == 0) {
                format = C46880pT0.getElapsedTime$default(m91848b.getDate(), this, false, 2, null);
            } else {
                format = f64269o.format(m91848b.getDate().toDate());
            }
            C28514t4 c28514t45 = this.f64271k;
            if (c28514t45 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c28514t45 = null;
            }
            c28514t45.f109796g.setText(format);
            int i = C15011b.$EnumSwitchMapping$0[m91848b.getIcon().getPinShape().ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        LayoutInflater layoutInflater = getLayoutInflater();
                        C28514t4 c28514t46 = this.f64271k;
                        if (c28514t46 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            c28514t46 = null;
                        }
                        QT3 m88479c = QT3.m88479c(layoutInflater, c28514t46.f109794e, true);
                        Intrinsics.checkNotNullExpressionValue(m88479c, "inflate(layoutInflater, binding.pin, true)");
                        m88479c.f30425b.setImageDrawable(C33341Hk0.m103484a(m91848b.getIcon().getIcon(), this));
                        m88479c.f30425b.setImageTintList(ColorStateList.valueOf(m91848b.getIcon().getIconColor().getLightMode()));
                        m88479c.f30426c.setColor(m91848b.getIcon().getIconBackgroundColor().getLightMode());
                    }
                } else {
                    LayoutInflater layoutInflater2 = getLayoutInflater();
                    C28514t4 c28514t47 = this.f64271k;
                    if (c28514t47 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c28514t47 = null;
                    }
                    PT3 m90204c = PT3.m90204c(layoutInflater2, c28514t47.f109794e, true);
                    Intrinsics.checkNotNullExpressionValue(m90204c, "inflate(layoutInflater, binding.pin, true)");
                    m90204c.f28551b.setImageDrawable(C33341Hk0.m103484a(m91848b.getIcon().getIcon(), this));
                    m90204c.f28551b.setImageTintList(ColorStateList.valueOf(m91848b.getIcon().getIconColor().getLightMode()));
                    m90204c.f28552c.setColor(m91848b.getIcon().getIconBackgroundColor().getLightMode());
                }
            } else {
                LayoutInflater layoutInflater3 = getLayoutInflater();
                C28514t4 c28514t48 = this.f64271k;
                if (c28514t48 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c28514t48 = null;
                }
                OT3 m92243c = OT3.m92243c(layoutInflater3, c28514t48.f109794e, true);
                Intrinsics.checkNotNullExpressionValue(m92243c, "inflate(layoutInflater, binding.pin, true)");
                m92243c.f26623b.setImageDrawable(C33341Hk0.m103484a(m91848b.getIcon().getIcon(), this));
                m92243c.f26623b.setImageTintList(ColorStateList.valueOf(m91848b.getIcon().getIconColor().getLightMode()));
                m92243c.f26624c.setColor(m91848b.getIcon().getIconBackgroundColor().getLightMode());
            }
            C28514t4 c28514t49 = this.f64271k;
            if (c28514t49 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c28514t49 = null;
            }
            Button button = c28514t49.f109791b;
            Intrinsics.checkNotNullExpressionValue(button, "binding.action");
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) m91848b.getActions());
            if (firstOrNull == null) {
                z = false;
            }
            C49520tu6.show$default(button, z, 0, 2, null);
            firstOrNull2 = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) m91848b.getActions());
            NotificationAction notificationAction = (NotificationAction) firstOrNull2;
            if (notificationAction != null && (title = notificationAction.getTitle()) != null) {
                C28514t4 c28514t410 = this.f64271k;
                if (c28514t410 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    c28514t42 = c28514t410;
                }
                Button button2 = c28514t42.f109791b;
                Intrinsics.checkNotNullExpressionValue(button2, "binding.action");
                button2.setText(title);
            }
        }
    }

    @Override // p000.InterfaceC34676Nc3
    /* renamed from: c1 */
    public Observable<NotificationAction> mo57890c1() {
        C28514t4 c28514t4 = this.f64271k;
        if (c28514t4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c28514t4 = null;
        }
        Button button = c28514t4.f109791b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.action");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        Observable<C34910Oc3> m42276l = m57892R().m42276l();
        final C15012c c15012c = C15012c.f64274g;
        Observable<NotificationAction> withLatestFrom = clicksThrottle$default.withLatestFrom(m42276l, new InterfaceC23480c() { // from class: Dc3
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                NotificationAction m57893Q;
                m57893Q = NotificationDetailsActivity.m57893Q(Function2.this, obj, obj2);
                return m57893Q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(withLatestFrom, "binding.action.clicksThr…ation!!.actions.first() }");
        return withLatestFrom;
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C28514t4 m13158c = C28514t4.m13158c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m13158c, "inflate(layoutInflater)");
        this.f64271k = m13158c;
        C47539qa3 c47539qa3 = C47539qa3.f105440b;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        C28514t4 c28514t4 = null;
        InterfaceC46946pa3 interfaceC46946pa3 = (InterfaceC46946pa3) AbstractC31704Ak1.component$default(c47539qa3, application, null, 2, null);
        this.f64272l = interfaceC46946pa3;
        if (interfaceC46946pa3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            interfaceC46946pa3 = null;
        }
        interfaceC46946pa3.mo19100c(this);
        C28514t4 c28514t42 = this.f64271k;
        if (c28514t42 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c28514t4 = c28514t42;
        }
        setContentView(c28514t4.getRoot());
        m57892R().consume(this);
        String stringExtra = getIntent().getStringExtra("notification_id");
        if (stringExtra != null) {
            this.f64273m.onSuccess(stringExtra);
        }
    }
}
