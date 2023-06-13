package p000;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.feature.notificationcenter.NotificationCenterActivity;
import co.bird.android.model.OperatorNotification;
import co.bird.android.model.persistence.OperatorNotificationCategory;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.subjects.C24556c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC52874za3;
@Metadata(m28433d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0001ZB\u0007¢\u0006\u0004\bW\u0010XJ&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016R\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\"\u0010I\u001a\u0010\u0012\f\u0012\n F*\u0004\u0018\u00010\u000f0\u000f0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010N\u001a\u0010\u0012\f\u0012\n F*\u0004\u0018\u00010K0K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR.\u0010P\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 F*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00120J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010MR\"\u0010R\u001a\u0010\u0012\f\u0012\n F*\u0004\u0018\u00010\f0\f0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010MR\u0014\u0010V\u001a\u00020S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006["}, m28432d2 = {"Lya3;", "Landroidx/fragment/app/Fragment;", "Ldb3;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Lio/reactivex/p;", "", "y4", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/persistence/OperatorNotificationCategory;", "e1", "N8", "E5", "A8", "Lob3;", TransferTable.COLUMN_STATE, "da", "Lio/reactivex/h;", "T0", "Lab3;", "b", "Lab3;", "I9", "()Lab3;", "setPresenter", "(Lab3;)V", "presenter", "Lsa3;", "c", "Lsa3;", "B9", "()Lsa3;", "setConverter", "(Lsa3;)V", "converter", "LOl1;", DateTokenConverter.CONVERTER_KEY, "LOl1;", "G9", "()LOl1;", "setFilterConverter", "(LOl1;)V", "filterConverter", "LDl1;", "e", "LDl1;", "E9", "()LDl1;", "setFilterAdapter", "(LDl1;)V", "filterAdapter", "Lqy1;", "f", "Lqy1;", "binding", "Lma3;", "g", "Lma3;", "adapter", "Lio/reactivex/subjects/c;", "kotlin.jvm.PlatformType", "h", "Lio/reactivex/subjects/c;", "groupIdRelay", "Lma4;", "Lco/bird/android/model/OperatorNotification;", "i", "Lma4;", "notificationRelay", "j", "filterRelay", "k", "scrollToEndRelay", "Lsx4;", "D9", "()Lsx4;", "delegate", "<init>", "()V", "l", C17296a.f69688o, "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationCenterFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterFragment.kt\nco/bird/android/feature/notificationcenter/fragment/NotificationCenterFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,167:1\n1#2:168\n64#3:169\n*S KotlinDebug\n*F\n+ 1 NotificationCenterFragment.kt\nco/bird/android/feature/notificationcenter/fragment/NotificationCenterFragment\n*L\n153#1:169\n*E\n"})
/* renamed from: ya3 */
/* loaded from: classes3.dex */
public final class C52281ya3 extends Fragment implements InterfaceC39841db3 {

    /* renamed from: l */
    public static final C30624a f119758l = new C30624a(null);

    /* renamed from: b */
    public C38044ab3 f119759b;

    /* renamed from: c */
    public C48724sa3 f119760c;

    /* renamed from: d */
    public C34989Ol1 f119761d;

    /* renamed from: e */
    public C32415Dl1 f119762e;

    /* renamed from: f */
    public C47777qy1 f119763f;

    /* renamed from: g */
    public final C45167ma3 f119764g = new C45167ma3();

    /* renamed from: h */
    public final C24556c<String> f119765h;

    /* renamed from: i */
    public final C45168ma4<OperatorNotification> f119766i;

    /* renamed from: j */
    public final C45168ma4<Optional<OperatorNotificationCategory>> f119767j;

    /* renamed from: k */
    public final C45168ma4<Unit> f119768k;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m28432d2 = {"Lya3$a;", "", "", "groupId", "Lya3;", C17296a.f69688o, "(Ljava/lang/String;)Lya3;", "<init>", "()V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ya3$a */
    /* loaded from: classes3.dex */
    public static final class C30624a {
        public /* synthetic */ C30624a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C52281ya3 newInstance$notification_center_release$default(C30624a c30624a, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return c30624a.m3222a(str);
        }

        /* renamed from: a */
        public final C52281ya3 m3222a(String str) {
            C52281ya3 c52281ya3 = new C52281ya3();
            Bundle bundle = new Bundle();
            bundle.putString("group_id", str);
            c52281ya3.setArguments(bundle);
            return c52281ya3;
        }

        private C30624a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/OperatorNotification;", TransferService.INTENT_KEY_NOTIFICATION, "", C17296a.f69688o, "(Lco/bird/android/model/OperatorNotification;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ya3$b */
    /* loaded from: classes3.dex */
    public static final class C30625b extends Lambda implements Function1<OperatorNotification, Boolean> {

        /* renamed from: g */
        public static final C30625b f119769g = new C30625b();

        public C30625b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(OperatorNotification notification) {
            Intrinsics.checkNotNullParameter(notification, "notification");
            return Boolean.valueOf(notification instanceof OperatorNotification.Notification);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/OperatorNotification;", TransferService.INTENT_KEY_NOTIFICATION, "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/OperatorNotification;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ya3$c */
    /* loaded from: classes3.dex */
    public static final class C30626c extends Lambda implements Function1<OperatorNotification, String> {

        /* renamed from: g */
        public static final C30626c f119770g = new C30626c();

        public C30626c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(OperatorNotification notification) {
            Intrinsics.checkNotNullParameter(notification, "notification");
            return ((OperatorNotification.Notification) notification).getId();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/OperatorNotification;", TransferService.INTENT_KEY_NOTIFICATION, "", C17296a.f69688o, "(Lco/bird/android/model/OperatorNotification;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ya3$d */
    /* loaded from: classes3.dex */
    public static final class C30627d extends Lambda implements Function1<OperatorNotification, Boolean> {

        /* renamed from: g */
        public static final C30627d f119771g = new C30627d();

        public C30627d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(OperatorNotification notification) {
            Intrinsics.checkNotNullParameter(notification, "notification");
            return Boolean.valueOf(notification instanceof OperatorNotification.NotificationGroup);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/OperatorNotification;", TransferService.INTENT_KEY_NOTIFICATION, "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/OperatorNotification;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ya3$e */
    /* loaded from: classes3.dex */
    public static final class C30628e extends Lambda implements Function1<OperatorNotification, String> {

        /* renamed from: g */
        public static final C30628e f119772g = new C30628e();

        public C30628e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(OperatorNotification notification) {
            Intrinsics.checkNotNullParameter(notification, "notification");
            return ((OperatorNotification.NotificationGroup) notification).getGroupId();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ya3$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30629f extends FunctionReferenceImpl implements Function1<OperatorNotification, Unit> {
        public C30629f(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m3217a(OperatorNotification p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OperatorNotification operatorNotification) {
            m3217a(operatorNotification);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\t"}, m28432d2 = {"ya3$g", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ya3$g */
    /* loaded from: classes3.dex */
    public static final class C30630g extends RecyclerView.AbstractC11863t {
        public C30630g() {
            C52281ya3.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C47777qy1 c47777qy1 = C52281ya3.this.f119763f;
            if (c47777qy1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c47777qy1 = null;
            }
            if (!c47777qy1.f106135e.canScrollVertically(1)) {
                C52281ya3.this.f119768k.accept(Unit.INSTANCE);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/persistence/OperatorNotificationCategory;", "filter", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/OperatorNotificationCategory;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ya3$h */
    /* loaded from: classes3.dex */
    public static final class C30631h extends Lambda implements Function1<OperatorNotificationCategory, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30631h() {
            super(1);
            C52281ya3.this = r1;
        }

        /* renamed from: a */
        public final void m3216a(OperatorNotificationCategory operatorNotificationCategory) {
            C52281ya3.this.f119767j.accept(Optional.f63040c.m59033b(operatorNotificationCategory));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OperatorNotificationCategory operatorNotificationCategory) {
            m3216a(operatorNotificationCategory);
            return Unit.INSTANCE;
        }
    }

    public C52281ya3() {
        C24556c<String> m31906k0 = C24556c.m31906k0();
        Intrinsics.checkNotNullExpressionValue(m31906k0, "create<String>()");
        this.f119765h = m31906k0;
        C45168ma4<OperatorNotification> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<OperatorNotification>()");
        this.f119766i = m25409g;
        C45168ma4<Optional<OperatorNotificationCategory>> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Optional<OperatorNotificationCategory>>()");
        this.f119767j = m25409g2;
        C45168ma4<Unit> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<Unit>()");
        this.f119768k = m25409g3;
    }

    /* renamed from: J9 */
    public static final boolean m3233J9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: P9 */
    public static final String m3230P9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: S9 */
    public static final boolean m3229S9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: T9 */
    public static final String m3228T9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC39841db3
    /* renamed from: A8 */
    public Observable<Unit> mo3241A8() {
        Observable<Unit> hide = this.f119768k.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "scrollToEndRelay.hide()");
        return hide;
    }

    /* renamed from: B9 */
    public final C48724sa3 m3239B9() {
        C48724sa3 c48724sa3 = this.f119760c;
        if (c48724sa3 != null) {
            return c48724sa3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("converter");
        return null;
    }

    /* renamed from: D9 */
    public final C48955sx4 m3238D9() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type co.bird.android.feature.notificationcenter.NotificationCenterActivity");
        return ((NotificationCenterActivity) activity).m58990F();
    }

    @Override // p000.InterfaceC39841db3
    /* renamed from: E5 */
    public Observable<String> mo3237E5() {
        Observable<OperatorNotification> hide = this.f119766i.hide();
        final C30625b c30625b = C30625b.f119769g;
        Observable<OperatorNotification> filter = hide.filter(new InterfaceC23494q() { // from class: ua3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m3233J9;
                m3233J9 = C52281ya3.m3233J9(Function1.this, obj);
                return m3233J9;
            }
        });
        final C30626c c30626c = C30626c.f119770g;
        Observable map = filter.map(new InterfaceC23492o() { // from class: va3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m3230P9;
                m3230P9 = C52281ya3.m3230P9(Function1.this, obj);
                return m3230P9;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "notificationRelay.hide()…cation.Notification).id }");
        return map;
    }

    /* renamed from: E9 */
    public final C32415Dl1 m3236E9() {
        C32415Dl1 c32415Dl1 = this.f119762e;
        if (c32415Dl1 != null) {
            return c32415Dl1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("filterAdapter");
        return null;
    }

    /* renamed from: G9 */
    public final C34989Ol1 m3235G9() {
        C34989Ol1 c34989Ol1 = this.f119761d;
        if (c34989Ol1 != null) {
            return c34989Ol1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("filterConverter");
        return null;
    }

    /* renamed from: I9 */
    public final C38044ab3 m3234I9() {
        C38044ab3 c38044ab3 = this.f119759b;
        if (c38044ab3 != null) {
            return c38044ab3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC39841db3
    /* renamed from: N8 */
    public Observable<String> mo3231N8() {
        Observable<OperatorNotification> hide = this.f119766i.hide();
        final C30627d c30627d = C30627d.f119771g;
        Observable<OperatorNotification> filter = hide.filter(new InterfaceC23494q() { // from class: wa3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m3229S9;
                m3229S9 = C52281ya3.m3229S9(Function1.this, obj);
                return m3229S9;
            }
        });
        final C30628e c30628e = C30628e.f119772g;
        Observable map = filter.map(new InterfaceC23492o() { // from class: xa3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m3228T9;
                m3228T9 = C52281ya3.m3228T9(Function1.this, obj);
                return m3228T9;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "notificationRelay.hide()…ificationGroup).groupId }");
        return map;
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

    @Override // p000.InterfaceC48362rx4
    /* renamed from: da */
    public void render(C46363ob3 state) {
        boolean z;
        Intrinsics.checkNotNullParameter(state, "state");
        C47777qy1 c47777qy1 = this.f119763f;
        if (c47777qy1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c47777qy1 = null;
        }
        RecyclerView recyclerView = c47777qy1.f106132b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.filters");
        C49520tu6.show$default(recyclerView, state.m20810c(), 0, 2, null);
        C47777qy1 c47777qy12 = this.f119763f;
        if (c47777qy12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c47777qy12 = null;
        }
        ViewGroup.LayoutParams layoutParams = c47777qy12.f106135e.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (state.m20810c()) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) C49347td3.m12001b(56);
        } else {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
        }
        C47777qy1 c47777qy13 = this.f119763f;
        if (c47777qy13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c47777qy13 = null;
        }
        c47777qy13.f106135e.setLayoutParams(layoutParams2);
        this.f119764g.mo24871u(m3239B9().m13978a(state.m20807f()));
        m3236E9().mo24871u(m3235G9().m91551a(state.m20806g(), state.m20811b()));
        C47777qy1 c47777qy14 = this.f119763f;
        if (c47777qy14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c47777qy14 = null;
        }
        LinearProgressIndicator linearProgressIndicator = c47777qy14.f106134d;
        Intrinsics.checkNotNullExpressionValue(linearProgressIndicator, "binding.progressBar");
        if (state.m20808e() > 0) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(linearProgressIndicator, z, 0, 2, null);
        Throwable m20809d = state.m20809d();
        if (m20809d != null) {
            C38689bg5.m64178c(m3238D9(), m20809d);
        }
    }

    @Override // p000.InterfaceC39841db3
    /* renamed from: e1 */
    public Observable<Optional<OperatorNotificationCategory>> mo3225e1() {
        Observable<Optional<OperatorNotificationCategory>> hide = this.f119767j.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "filterRelay.hide()");
        return hide;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C47777qy1 binding = C47777qy1.m16725c(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(binding, "binding");
        this.f119763f = binding;
        return binding.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        NotificationCenterActivity notificationCenterActivity;
        String string;
        InterfaceC46946pa3 m57898Q;
        InterfaceC52874za3.InterfaceC31046a mo19099d;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        Unit unit = null;
        if (activity instanceof NotificationCenterActivity) {
            notificationCenterActivity = (NotificationCenterActivity) activity;
        } else {
            notificationCenterActivity = null;
        }
        if (notificationCenterActivity != null && (m57898Q = notificationCenterActivity.m57898Q()) != null && (mo19099d = m57898Q.mo19099d()) != null) {
            C47777qy1 c47777qy1 = this.f119763f;
            if (c47777qy1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c47777qy1 = null;
            }
            View view2 = c47777qy1.f106133c;
            Intrinsics.checkNotNullExpressionValue(view2, "binding.overlay");
            InterfaceC52874za3 mo1082a = mo19099d.mo1082a(view2);
            if (mo1082a != null) {
                mo1082a.mo1083a(this);
            }
        }
        C47777qy1 c47777qy12 = this.f119763f;
        if (c47777qy12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c47777qy12 = null;
        }
        LayoutTransition layoutTransition = c47777qy12.getRoot().getLayoutTransition();
        if (layoutTransition != null) {
            layoutTransition.enableTransitionType(4);
        }
        C47777qy1 c47777qy13 = this.f119763f;
        if (c47777qy13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c47777qy13 = null;
        }
        c47777qy13.f106135e.setAdapter(this.f119764g);
        C47777qy1 c47777qy14 = this.f119763f;
        if (c47777qy14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c47777qy14 = null;
        }
        c47777qy14.f106135e.setLayoutManager(new LinearLayoutManager(getActivity()));
        C47777qy1 c47777qy15 = this.f119763f;
        if (c47777qy15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c47777qy15 = null;
        }
        c47777qy15.f106135e.setItemAnimator(new C11894g());
        this.f119764g.m25421v(new C30629f(this.f119766i));
        C47777qy1 c47777qy16 = this.f119763f;
        if (c47777qy16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c47777qy16 = null;
        }
        c47777qy16.f106135e.addOnScrollListener(new C30630g());
        C47777qy1 c47777qy17 = this.f119763f;
        if (c47777qy17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c47777qy17 = null;
        }
        c47777qy17.f106132b.setAdapter(m3236E9());
        C47777qy1 c47777qy18 = this.f119763f;
        if (c47777qy18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c47777qy18 = null;
        }
        c47777qy18.f106132b.setLayoutManager(new LinearLayoutManager(getActivity()));
        C47777qy1 c47777qy19 = this.f119763f;
        if (c47777qy19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c47777qy19 = null;
        }
        c47777qy19.f106132b.setItemAnimator(new C11894g());
        m3236E9().m109983v(new C30631h());
        m3234I9().consume(this);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("group_id")) != null) {
            this.f119765h.onSuccess(string);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f119765h.onComplete();
        }
    }

    @Override // p000.InterfaceC39841db3
    /* renamed from: y4 */
    public AbstractC24507p<String> mo3223y4() {
        AbstractC24507p<String> m32070E = this.f119765h.m32070E();
        Intrinsics.checkNotNullExpressionValue(m32070E, "groupIdRelay.hide()");
        return m32070E;
    }
}
