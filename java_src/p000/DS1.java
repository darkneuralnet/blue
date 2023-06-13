package p000;

import android.content.Intent;
import android.net.Uri;
import co.bird.android.model.OperatorRole;
import co.bird.android.model.User;
import co.bird.android.model.UserRoleItem;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LDS1;", "LMV0;", "Landroid/content/Intent;", "intent", "Lio/reactivex/c;", C17296a.f69688o, "", "j", "Llh6;", "Llh6;", "userManager", "Lgl;", "b", "Lgl;", "preference", "Le13;", "c", "Le13;", "navigator", "<init>", "(Llh6;Lgl;Le13;)V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdToolsNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsNavigator.kt\nco/bird/android/lib/deeplink/navigators/IdToolsNavigator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
/* renamed from: DS1 */
/* loaded from: classes3.dex */
public final class DS1 implements MV0 {

    /* renamed from: a */
    public final InterfaceC44647lh6 f5717a;

    /* renamed from: b */
    public final C22454gl f5718b;

    /* renamed from: c */
    public final InterfaceC40099e13 f5719c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "user", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIdToolsNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsNavigator.kt\nco/bird/android/lib/deeplink/navigators/IdToolsNavigator$navigate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n288#2,2:63\n*S KotlinDebug\n*F\n+ 1 IdToolsNavigator.kt\nco/bird/android/lib/deeplink/navigators/IdToolsNavigator$navigate$1\n*L\n25#1:63,2\n*E\n"})
    /* renamed from: DS1$a */
    /* loaded from: classes3.dex */
    public static final class C1480a extends Lambda implements Function1<User, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f5721h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1480a(String str) {
            super(1);
            this.f5721h = str;
        }

        /* renamed from: a */
        public final void m110422a(User user) {
            Object obj;
            UserRoleItem userRoleItem;
            List<OperatorRole> operatorRoles = user.getOperatorRoles();
            Unit unit = null;
            if (operatorRoles != null) {
                String str = this.f5721h;
                Iterator<T> it = operatorRoles.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(((OperatorRole) obj).getRole(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                OperatorRole operatorRole = (OperatorRole) obj;
                if (operatorRole != null && (userRoleItem = operatorRole.toUserRoleItem()) != null) {
                    DS1 ds1 = DS1.this;
                    ds1.f5718b.m37736E2(userRoleItem);
                    ds1.f5718b.m37732F2(userRoleItem);
                    unit = Unit.INSTANCE;
                }
            }
            if (unit == null) {
                DS1.this.m110423j();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m110422a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: DS1$b */
    /* loaded from: classes3.dex */
    public static final class C1481b extends Lambda implements Function1<Throwable, Unit> {
        public C1481b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            DS1.this.m110423j();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: DS1$c */
    /* loaded from: classes3.dex */
    public static final class C1482c extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C1482c() {
            super(1);
        }

        /* renamed from: a */
        public final void m110421a(InterfaceC23465c interfaceC23465c) {
            DS1.this.m110423j();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m110421a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    public DS1(InterfaceC44647lh6 userManager, C22454gl preference, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f5717a = userManager;
        this.f5718b = preference;
        this.f5719c = navigator;
    }

    /* renamed from: f */
    public static final void m110427f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m110426g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m110425h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m110424i(DS1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC40099e13.C19924a.goToOperator$default(this$0.f5719c, false, null, null, 6, null);
        InterfaceC40099e13.C19924a.goToIdTools$default(this$0.f5719c, null, false, 3, null);
    }

    @Override // p000.MV0
    /* renamed from: a */
    public AbstractC23461c mo4134a(Intent intent) {
        String str;
        AbstractC23461c m33081E;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Uri data = intent.getData();
        if (data != null) {
            str = data.getQueryParameter("role");
        } else {
            str = null;
        }
        if (str != null) {
            AbstractC23442F<User> user = this.f5717a.getUser();
            final C1480a c1480a = new C1480a(str);
            AbstractC23442F<User> m33101w = user.m33101w(new InterfaceC23484g() { // from class: zS1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    DS1.m110427f(Function1.this, obj);
                }
            });
            final C1481b c1481b = new C1481b();
            m33081E = m33101w.m33106t(new InterfaceC23484g() { // from class: AS1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    DS1.m110426g(Function1.this, obj);
                }
            }).m33159G().m33069Q();
        } else {
            AbstractC23461c m33039p = AbstractC23461c.m33039p();
            final C1482c c1482c = new C1482c();
            m33081E = m33039p.m33081E(new InterfaceC23484g() { // from class: BS1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    DS1.m110425h(Function1.this, obj);
                }
            });
        }
        AbstractC23461c m33029z = m33081E.m33029z(new InterfaceC23478a() { // from class: CS1
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                DS1.m110424i(DS1.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "override fun navigate(in…goToIdTools()\n      }\n  }");
        return m33029z;
    }

    /* renamed from: j */
    public final void m110423j() {
        UserRoleItem m37579r0 = this.f5718b.m37579r0();
        if (m37579r0 != null) {
            this.f5718b.m37732F2(m37579r0);
        }
    }
}
