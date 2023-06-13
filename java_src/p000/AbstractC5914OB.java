package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import co.bird.android.model.UserRoleItem;
import co.bird.android.model.constant.UserRole;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \f2\u00020\u0001:\u0001\u0013Bu\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00107\u001a\u000202\u0012\u0006\u0010;\u001a\u000208\u0012\u0006\u0010?\u001a\u00020<\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010D¢\u0006\u0004\bH\u0010IJ\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0016\u0010\u000b\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0016\u0010\f\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\bH\u0017J\b\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\bH&R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u0004\u0018\u00010@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010G\u001a\u0004\u0018\u00010D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006J"}, m28432d2 = {"LOB;", "LaZ2;", "Lco/bird/android/model/User;", "user", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/UserRoleItem;", "r", "", "o", "userRoles", "n", "m", "t", "p", "Lco/bird/android/model/constant/UserRole;", "userRole", "", "u", C17296a.f69688o, "onResume", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LOh;", "LOh;", "appBuildConfig", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "b", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Lgl;", "c", "Lgl;", "preference", "LTq4;", DateTokenConverter.CONVERTER_KEY, "LTq4;", "reactiveConfig", "LZ03;", "e", "LZ03;", "ui", "Le13;", "f", "Le13;", "navigator", "LEa;", "g", "LEa;", "analyticsManager", "LZ85;", "h", "LZ85;", "q", "()LZ85;", "riderDemandManager", "LaS2;", "i", "LaS2;", "merchantManager", "LRh6;", "j", "LRh6;", "userStream", "LOi;", "k", "LOi;", "appContextStream", "LGI3;", "l", "LGI3;", "partnerManager", "<init>", "(LOh;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lgl;LTq4;LZ03;Le13;LEa;LZ85;LaS2;LRh6;LOi;LGI3;)V", "nav-drawer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseNavigationDrawerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseNavigationDrawerPresenter.kt\nco/bird/android/library/navigation/drawer/BaseNavigationDrawerPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,257:1\n180#2:258\n180#2:259\n180#2:260\n180#2:261\n180#2:262\n180#2:263\n766#3:264\n857#3,2:265\n1855#3,2:267\n766#3:269\n857#3,2:270\n*S KotlinDebug\n*F\n+ 1 BaseNavigationDrawerPresenter.kt\nco/bird/android/library/navigation/drawer/BaseNavigationDrawerPresenter\n*L\n78#1:258\n86#1:259\n104#1:260\n110#1:261\n124#1:262\n135#1:263\n202#1:264\n202#1:265,2\n206#1:267,2\n227#1:269\n227#1:270,2\n*E\n"})
/* renamed from: OB */
/* loaded from: classes3.dex */
public abstract class AbstractC5914OB implements InterfaceC38024aZ2 {

    /* renamed from: m */
    public static final C5915a f26099m = new C5915a(null);

    /* renamed from: a */
    public final InterfaceC6097Oh f26100a;

    /* renamed from: b */
    public final LifecycleScopeProvider<EnumC7097RE> f26101b;

    /* renamed from: c */
    public final C22454gl f26102c;

    /* renamed from: d */
    public final C36207Tq4 f26103d;

    /* renamed from: e */
    public final Z03 f26104e;

    /* renamed from: f */
    public final InterfaceC40099e13 f26105f;

    /* renamed from: g */
    public final InterfaceC1880Ea f26106g;

    /* renamed from: h */
    public final Z85 f26107h;

    /* renamed from: i */
    public final InterfaceC37961aS2 f26108i;

    /* renamed from: j */
    public final InterfaceC35660Rh6 f26109j;

    /* renamed from: k */
    public final InterfaceC6098Oi f26110k;

    /* renamed from: l */
    public final GI3 f26111l;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, m28432d2 = {"LOB$a;", "", "", "Lco/bird/android/model/UserRoleItem;", "", C17296a.f69688o, "", "NUM_ROLES_TO_SHOW_DROPDOWN_SELECTOR", "I", "NUM_ROLES_TO_SHOW_ROLE_SWITCH", "<init>", "()V", "nav-drawer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: OB$a */
    /* loaded from: classes3.dex */
    public static final class C5915a {
        public /* synthetic */ C5915a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean m92645a(List<UserRoleItem> list) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            if (list.size() >= 3) {
                return true;
            }
            return false;
        }

        private C5915a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: OB$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5916b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserRole.values().length];
            try {
                iArr[UserRole.RIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserRole.OPERATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserRole.MERCHANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: OB$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5917c extends FunctionReferenceImpl implements Function1<Boolean, List<? extends UserRoleItem>> {
        public C5917c(Object obj) {
            super(1, obj, UserKt.class, "getRoles", "getRoles(Lco/bird/android/model/User;Ljava/lang/Boolean;)Ljava/util/List;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<UserRoleItem> invoke(Boolean bool) {
            return UserKt.getRoles((User) this.receiver, bool);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "user", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OB$d */
    /* loaded from: classes3.dex */
    public static final class C5918d extends Lambda implements Function1<User, Unit> {
        public C5918d() {
            super(1);
        }

        /* renamed from: a */
        public final void m92643a(User user) {
            Z03 z03 = AbstractC5914OB.this.f26104e;
            Intrinsics.checkNotNullExpressionValue(user, "user");
            z03.mo73871q1(user);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m92643a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lio/reactivex/B;", "", "Lco/bird/android/model/UserRoleItem;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OB$e */
    /* loaded from: classes3.dex */
    public static final class C5919e extends Lambda implements Function1<User, InterfaceC23434B<? extends List<? extends UserRoleItem>>> {
        public C5919e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends List<UserRoleItem>> invoke(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            return AbstractC5914OB.this.m92654r(user);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "userRoles", "", "Lco/bird/android/model/UserRoleItem;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: OB$f */
    /* loaded from: classes3.dex */
    public static final class C5920f extends Lambda implements Function1<List<? extends UserRoleItem>, Unit> {
        public C5920f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends UserRoleItem> list) {
            invoke2((List<UserRoleItem>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<UserRoleItem> userRoles) {
            if (UserRole.MERCHANT == AbstractC5914OB.this.f26102c.m37546z1().getUserRole() && AbstractC5914OB.this.f26108i.mo12335l() > 1) {
                AbstractC5914OB abstractC5914OB = AbstractC5914OB.this;
                Intrinsics.checkNotNullExpressionValue(userRoles, "userRoles");
                abstractC5914OB.m92659m(userRoles);
                return;
            }
            if (AbstractC5914OB.this.f26103d.m82623f8().getValue().getEnableRolesDropDown()) {
                C5915a c5915a = AbstractC5914OB.f26099m;
                Intrinsics.checkNotNullExpressionValue(userRoles, "userRoles");
                if (c5915a.m92645a(userRoles)) {
                    AbstractC5914OB.this.m92659m(userRoles);
                    return;
                }
            }
            AbstractC5914OB abstractC5914OB2 = AbstractC5914OB.this;
            Intrinsics.checkNotNullExpressionValue(userRoles, "userRoles");
            abstractC5914OB2.m92658n(userRoles);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: OB$g */
    /* loaded from: classes3.dex */
    public static final class C5921g extends Lambda implements Function1<Unit, Unit> {
        public C5921g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            AbstractC5914OB.this.f26104e.mo73876b7(!AbstractC5914OB.this.f26104e.mo73882Ge());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/UserRoleItem;", "kotlin.jvm.PlatformType", "selectedUserRoleItem", "", C17296a.f69688o, "(Lco/bird/android/model/UserRoleItem;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: OB$h */
    /* loaded from: classes3.dex */
    public static final class C5922h extends Lambda implements Function1<UserRoleItem, Unit> {
        public C5922h() {
            super(1);
        }

        /* renamed from: a */
        public final void m92641a(UserRoleItem selectedUserRoleItem) {
            if (selectedUserRoleItem.getUserRole() == UserRole.OPERATOR) {
                C22454gl c22454gl = AbstractC5914OB.this.f26102c;
                Intrinsics.checkNotNullExpressionValue(selectedUserRoleItem, "selectedUserRoleItem");
                c22454gl.m37736E2(selectedUserRoleItem);
            }
            C22454gl c22454gl2 = AbstractC5914OB.this.f26102c;
            Intrinsics.checkNotNullExpressionValue(selectedUserRoleItem, "selectedUserRoleItem");
            c22454gl2.m37732F2(selectedUserRoleItem);
            if (AbstractC5914OB.this.m92651u(selectedUserRoleItem.getUserRole())) {
                AbstractC5914OB.this.f26104e.success(C45871nl4.navigation_drawer_switching_role);
            }
            InterfaceC6098Oi interfaceC6098Oi = AbstractC5914OB.this.f26110k;
            if (interfaceC6098Oi != null) {
                interfaceC6098Oi.mo88172a(C39428ct3.f75785b);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UserRoleItem userRoleItem) {
            m92641a(userRoleItem);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: OB$i */
    /* loaded from: classes3.dex */
    public static final class C5923i extends Lambda implements Function1<Unit, Unit> {
        public C5923i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            boolean enableGiveFreeRides = AbstractC5914OB.this.f26103d.m82623f8().m73665a().getEnableGiveFreeRides();
            AbstractC5914OB.this.f26106g.mo55905y(new C52190yQ2(null, null, null, Boolean.valueOf(enableGiveFreeRides), Boolean.valueOf(enableGiveFreeRides), 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: OB$j */
    /* loaded from: classes3.dex */
    public static final class C5924j extends Lambda implements Function1<Boolean, Unit> {
        public C5924j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            if (bool.booleanValue()) {
                return;
            }
            AbstractC5914OB.this.mo92668C();
        }
    }

    public AbstractC5914OB(InterfaceC6097Oh appBuildConfig, LifecycleScopeProvider<EnumC7097RE> scopeProvider, C22454gl preference, C36207Tq4 reactiveConfig, Z03 ui, InterfaceC40099e13 navigator, InterfaceC1880Ea analyticsManager, Z85 riderDemandManager, InterfaceC37961aS2 merchantManager, InterfaceC35660Rh6 userStream, InterfaceC6098Oi interfaceC6098Oi, GI3 gi3) {
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(riderDemandManager, "riderDemandManager");
        Intrinsics.checkNotNullParameter(merchantManager, "merchantManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        this.f26100a = appBuildConfig;
        this.f26101b = scopeProvider;
        this.f26102c = preference;
        this.f26103d = reactiveConfig;
        this.f26104e = ui;
        this.f26105f = navigator;
        this.f26106g = analyticsManager;
        this.f26107h = riderDemandManager;
        this.f26108i = merchantManager;
        this.f26109j = userStream;
        this.f26110k = interfaceC6098Oi;
        this.f26111l = gi3;
    }

    /* renamed from: A */
    public static final void m92670A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m92669B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final List m92653s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m92650v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC23434B m92649w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m92648x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m92647y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m92646z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public abstract void mo92668C();

    @Override // p000.InterfaceC38024aZ2
    /* renamed from: a */
    public void mo71220a() {
        Observable<User> observeOn = this.f26109j.mo76579f().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "userStream.updateEvents(…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f26101b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5918d c5918d = new C5918d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: HB
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC5914OB.m92650v(Function1.this, obj);
            }
        });
        Observable<User> mo76579f = this.f26109j.mo76579f();
        final C5919e c5919e = new C5919e();
        Observable observeOn2 = mo76579f.switchMap(new InterfaceC23492o() { // from class: IB
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m92649w;
                m92649w = AbstractC5914OB.m92649w(Function1.this, obj);
                return m92649w;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "@CallSuper\n  override fu…f()\n        }\n      }\n  }");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f26101b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5920f c5920f = new C5920f();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: JB
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC5914OB.m92648x(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f26104e.mo73877Uf().m33094as(AutoDispose.m45239a(this.f26101b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5921g c5921g = new C5921g();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: KB
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC5914OB.m92647y(Function1.this, obj);
            }
        });
        Object m33094as4 = this.f26104e.mo73874g4().m33094as(AutoDispose.m45239a(this.f26101b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5922h c5922h = new C5922h();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: LB
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC5914OB.m92646z(Function1.this, obj);
            }
        });
        Object m33094as5 = this.f26104e.mo73883G8().m33094as(AutoDispose.m45239a(this.f26101b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5923i c5923i = new C5923i();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: MB
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC5914OB.m92670A(Function1.this, obj);
            }
        });
        Object m33094as6 = this.f26103d.m82690Z6().m33094as(AutoDispose.m45239a(this.f26101b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5924j c5924j = new C5924j();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: NB
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AbstractC5914OB.m92669B(Function1.this, obj);
            }
        });
    }

    /* renamed from: m */
    public final void m92659m(List<UserRoleItem> list) {
        this.f26104e.mo73872ml(false);
        this.f26104e.mo73870qd(true);
        this.f26104e.mo73873gi(m92652t(m92656p(list)));
        m92657o();
    }

    /* renamed from: n */
    public final void m92658n(List<UserRoleItem> list) {
        boolean z;
        Z03 z03 = this.f26104e;
        if (list.size() >= 2) {
            z = true;
        } else {
            z = false;
        }
        z03.mo73872ml(z);
        this.f26104e.mo73870qd(false);
        this.f26104e.mo73876b7(true);
    }

    /* renamed from: o */
    public final void m92657o() {
        int i;
        UserRoleItem m37575s0 = this.f26102c.m37575s0();
        int i2 = C5916b.$EnumSwitchMapping$0[m37575s0.getUserRole().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    Z03 z03 = this.f26104e;
                    if (this.f26108i.mo12335l() > 1) {
                        i = C45871nl4.drawer_ride_switch_merchant_many;
                    } else {
                        i = C45871nl4.drawer_ride_switch_merchant;
                    }
                    z03.mo73880Le(i);
                    this.f26104e.setIcon(this.f26100a.mo89923i());
                }
            } else {
                this.f26104e.mo73875cc(m37575s0);
                this.f26104e.setIcon(this.f26100a.mo89923i());
            }
        } else {
            this.f26104e.mo73880Le(C45871nl4.drawer_ride_switch_rider);
            this.f26104e.setIcon(this.f26100a.mo89925g());
        }
        this.f26104e.mo73879Mj(true);
    }

    @Override // p000.InterfaceC38024aZ2
    public void onResume() {
    }

    /* renamed from: p */
    public final List<UserRoleItem> m92656p(List<UserRoleItem> list) {
        boolean equals;
        UserRoleItem m37546z1 = this.f26102c.m37546z1();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            equals = StringsKt__StringsJVMKt.equals(((UserRoleItem) obj).getUserRoleCode(), m37546z1.getUserRoleCode(), true);
            if (!equals) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    public final Z85 m92655q() {
        return this.f26107h;
    }

    /* renamed from: r */
    public final Observable<List<UserRoleItem>> m92654r(User user) {
        Observable<Boolean> mo12337j = this.f26108i.mo12337j();
        final C5917c c5917c = new C5917c(user);
        Observable map = mo12337j.map(new InterfaceC23492o() { // from class: GB
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m92653s;
                m92653s = AbstractC5914OB.m92653s(Function1.this, obj);
                return m92653s;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "merchantManager.isMerchant.map(user::getRoles)");
        return map;
    }

    /* renamed from: t */
    public final List<UserRoleItem> m92652t(List<UserRoleItem> list) {
        Integer valueOf;
        int i;
        ArrayList arrayList = new ArrayList();
        ArrayList<UserRoleItem> arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            UserRoleItem userRoleItem = (UserRoleItem) next;
            if (this.f26100a.mo89930b() && userRoleItem.getUserRole() == UserRole.RIDER) {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        for (UserRoleItem userRoleItem2 : arrayList2) {
            int i2 = C5916b.$EnumSwitchMapping$0[userRoleItem2.getUserRole().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        valueOf = userRoleItem2.getUserRoleTitleStringRes();
                    } else {
                        if (this.f26108i.mo12335l() > 1) {
                            i = C45871nl4.drawer_ride_switch_merchant_many;
                        } else {
                            i = C45871nl4.drawer_ride_switch_merchant;
                        }
                        valueOf = Integer.valueOf(i);
                    }
                } else {
                    valueOf = Integer.valueOf(C45871nl4.drawer_ride_switch_operator);
                }
            } else {
                valueOf = Integer.valueOf(C45871nl4.drawer_ride_switch_rider);
            }
            arrayList.add(UserRoleItem.copy$default(userRoleItem2, null, null, null, valueOf, 7, null));
        }
        return arrayList;
    }

    /* renamed from: u */
    public final boolean m92651u(UserRole userRole) {
        int i = C5916b.$EnumSwitchMapping$0[userRole.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                this.f26105f.mo37072X0(false);
            } else {
                InterfaceC40099e13.C19924a.goToOperator$default(this.f26105f, true, null, null, 6, null);
            }
        } else {
            InterfaceC40099e13.C19924a.goToRider$default(this.f26105f, true, false, null, 6, null);
            this.f26107h.mo55890b("mode_switch");
        }
        this.f26106g.mo55905y(new OU2(null, null, null, userRole.name(), 7, null));
        return true;
    }

    public /* synthetic */ AbstractC5914OB(InterfaceC6097Oh interfaceC6097Oh, LifecycleScopeProvider lifecycleScopeProvider, C22454gl c22454gl, C36207Tq4 c36207Tq4, Z03 z03, InterfaceC40099e13 interfaceC40099e13, InterfaceC1880Ea interfaceC1880Ea, Z85 z85, InterfaceC37961aS2 interfaceC37961aS2, InterfaceC35660Rh6 interfaceC35660Rh6, InterfaceC6098Oi interfaceC6098Oi, GI3 gi3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6097Oh, lifecycleScopeProvider, c22454gl, c36207Tq4, z03, interfaceC40099e13, interfaceC1880Ea, z85, interfaceC37961aS2, interfaceC35660Rh6, (i & 1024) != 0 ? null : interfaceC6098Oi, (i & 2048) != 0 ? null : gi3);
    }
}
