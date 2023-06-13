package p000;

import android.content.Intent;
import co.bird.android.model.BirdPaymentKt;
import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import co.bird.android.model.UserRoleItem;
import co.bird.android.model.constant.UserRole;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Lmm3;", "LMV0;", "Landroid/content/Intent;", "intent", "Lio/reactivex/c;", C17296a.f69688o, "Lgl;", "Lgl;", "preference", "Llh6;", "b", "Llh6;", "userManager", "Le13;", "c", "Le13;", "navigator", "<init>", "(Lgl;Llh6;Le13;)V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mm3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45287mm3 implements MV0 {

    /* renamed from: a */
    public final C22454gl f98727a;

    /* renamed from: b */
    public final InterfaceC44647lh6 f98728b;

    /* renamed from: c */
    public final InterfaceC40099e13 f98729c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "user", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorMainAppStartNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorMainAppStartNavigator.kt\nco/bird/android/lib/deeplink/OperatorMainAppStartNavigator$navigate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n766#2:48\n857#2,2:49\n*S KotlinDebug\n*F\n+ 1 OperatorMainAppStartNavigator.kt\nco/bird/android/lib/deeplink/OperatorMainAppStartNavigator$navigate$1\n*L\n27#1:48\n27#1:49,2\n*E\n"})
    /* renamed from: mm3$a */
    /* loaded from: classes3.dex */
    public static final class C26213a extends Lambda implements Function1<User, Unit> {
        public C26213a() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
            if (co.bird.android.model.BirdPaymentKt.isOneOf(r9, r3) != false) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m25025a(User user) {
            UserRoleItem userRoleItem;
            UserRole userRole;
            List listOf;
            List listOf2;
            Intrinsics.checkNotNullExpressionValue(user, "user");
            ArrayList arrayList = null;
            boolean z = true;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : UserKt.getRoles$default(user, null, 1, null)) {
                UserRole userRole2 = ((UserRoleItem) obj).getUserRole();
                listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new UserRole[]{UserRole.RIDER, UserRole.MECHANIC});
                if (!BirdPaymentKt.isOneOf(userRole2, listOf2)) {
                    arrayList2.add(obj);
                }
            }
            C45287mm3 c45287mm3 = C45287mm3.this;
            if (!arrayList2.isEmpty()) {
                if (c45287mm3.f98727a.m37579r0() != null) {
                    UserRoleItem m37579r0 = c45287mm3.f98727a.m37579r0();
                    if (m37579r0 != null) {
                        userRole = m37579r0.getUserRole();
                    } else {
                        userRole = null;
                    }
                    listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new UserRole[]{UserRole.RIDER, UserRole.MECHANIC});
                }
                if (z) {
                    arrayList = arrayList2;
                }
                if (arrayList == null && (userRoleItem = (UserRoleItem) arrayList.get(0)) != null) {
                    C45287mm3 c45287mm32 = C45287mm3.this;
                    c45287mm32.f98727a.m37736E2(userRoleItem);
                    c45287mm32.f98727a.m37732F2(userRoleItem);
                    return;
                }
            }
            z = false;
            if (z) {
            }
            if (arrayList == null) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m25025a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mm3$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C26214b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C26214b f98731b = new C26214b();

        public C26214b() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    public C45287mm3(C22454gl preference, InterfaceC44647lh6 userManager, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f98727a = preference;
        this.f98728b = userManager;
        this.f98729c = navigator;
    }

    /* renamed from: e */
    public static final void m25028e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m25027f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m25026g(C45287mm3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC40099e13.C19924a.goToOperator$default(this$0.f98729c, false, null, null, 6, null);
    }

    @Override // p000.MV0
    /* renamed from: a */
    public AbstractC23461c mo4134a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        AbstractC23442F<User> user = this.f98728b.getUser();
        final C26213a c26213a = new C26213a();
        AbstractC23442F<User> m33101w = user.m33101w(new InterfaceC23484g() { // from class: jm3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45287mm3.m25028e(Function1.this, obj);
            }
        });
        final C26214b c26214b = C26214b.f98731b;
        AbstractC23461c m33029z = m33101w.m33106t(new InterfaceC23484g() { // from class: km3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C45287mm3.m25027f(Function1.this, obj);
            }
        }).m33159G().m33069Q().m33029z(new InterfaceC23478a() { // from class: lm3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C45287mm3.m25026g(C45287mm3.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "override fun navigate(\n …tart = false)\n      }\n  }");
        return m33029z;
    }
}
