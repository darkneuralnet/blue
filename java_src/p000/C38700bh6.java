package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.User;
import co.bird.android.model.wire.WireUserGuest;
import co.bird.api.request.UserGuestRequest;
import co.bird.api.response.UserGuestResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
import p000.C38700bh6;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\bH\u0002J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR'\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001f0\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0011\u0010\"R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001f0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010(¨\u0006,"}, m28432d2 = {"Lbh6;", "LWg6;", "", "email", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireUserGuest;", "e", "userGuestId", "", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "k", "m", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LVg6;", "b", "LVg6;", "userGuestClient", "Lgl;", "c", "Lgl;", "preference", "LRh6;", "LRh6;", "userStream", "LTq4;", "LTq4;", "reactiveConfig", "LZ84;", "", "f", "Lkotlin/Lazy;", "()LZ84;", "activeUserGuests", "La94;", "g", "La94;", "mutableActiveGuests", "()Lco/bird/android/model/wire/WireUserGuest;", "nextUserGuestAvailableForStartingRide", "<init>", "(Landroid/content/Context;LVg6;Lgl;LRh6;LTq4;)V", "user_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nUserGuestManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserGuestManagerImpl.kt\nco/bird/android/manager/user/UserGuestManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1963#2,14:99\n288#2,2:113\n288#2,2:115\n*S KotlinDebug\n*F\n+ 1 UserGuestManagerImpl.kt\nco/bird/android/manager/user/UserGuestManagerImpl\n*L\n32#1:99,14\n35#1:113,2\n50#1:115,2\n*E\n"})
/* renamed from: bh6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38700bh6 implements InterfaceC36821Wg6 {

    /* renamed from: a */
    public final Context f57907a;

    /* renamed from: b */
    public final InterfaceC36587Vg6 f57908b;

    /* renamed from: c */
    public final C22454gl f57909c;

    /* renamed from: d */
    public final InterfaceC35660Rh6 f57910d;

    /* renamed from: e */
    public final C36207Tq4 f57911e;

    /* renamed from: f */
    public final Lazy f57912f;

    /* renamed from: g */
    public final C37791a94<List<WireUserGuest>> f57913g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bh6$a */
    /* loaded from: classes4.dex */
    public static final class C12475a extends Lambda implements Function1<User, Unit> {
        public C12475a() {
            super(1);
        }

        /* renamed from: a */
        public final void m64123a(User user) {
            C38700bh6.this.m64128k();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m64123a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lco/bird/android/model/wire/WireUserGuest;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bh6$b */
    /* loaded from: classes4.dex */
    public static final class C12476b extends Lambda implements Function0<Z84<List<? extends WireUserGuest>>> {
        public C12476b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends WireUserGuest>> invoke2() {
            return Z84.f47888d.m73663b(C38700bh6.this.f57913g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireUserGuest;", "guests", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nUserGuestManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserGuestManagerImpl.kt\nco/bird/android/manager/user/UserGuestManagerImpl$removeGuestFromAvailableToStart$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1549#2:99\n1620#2,3:100\n*S KotlinDebug\n*F\n+ 1 UserGuestManagerImpl.kt\nco/bird/android/manager/user/UserGuestManagerImpl$removeGuestFromAvailableToStart$1\n*L\n80#1:99\n80#1:100,3\n*E\n"})
    /* renamed from: bh6$c */
    /* loaded from: classes4.dex */
    public static final class C12477c extends Lambda implements Function1<List<? extends WireUserGuest>, List<? extends WireUserGuest>> {

        /* renamed from: g */
        public final /* synthetic */ String f57916g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12477c(String str) {
            super(1);
            this.f57916g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<WireUserGuest> invoke(List<WireUserGuest> guests) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(guests, "guests");
            List<WireUserGuest> list = guests;
            String str = this.f57916g;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireUserGuest wireUserGuest : list) {
                if (Intrinsics.areEqual(wireUserGuest.getId(), str)) {
                    wireUserGuest = WireUserGuest.copy$default(wireUserGuest, null, null, null, true, 7, null);
                }
                arrayList.add(wireUserGuest);
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/UserGuestResponse;", "it", "Lco/bird/android/model/wire/WireUserGuest;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/UserGuestResponse;)Lco/bird/android/model/wire/WireUserGuest;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bh6$d */
    /* loaded from: classes4.dex */
    public static final class C12478d extends Lambda implements Function1<UserGuestResponse, WireUserGuest> {

        /* renamed from: g */
        public static final C12478d f57917g = new C12478d();

        public C12478d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireUserGuest invoke(UserGuestResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getUserGuest();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireUserGuest;", "kotlin.jvm.PlatformType", "it", "", "b", "(Lco/bird/android/model/wire/WireUserGuest;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bh6$e */
    /* loaded from: classes4.dex */
    public static final class C12479e extends Lambda implements Function1<WireUserGuest, Unit> {
        public C12479e() {
            super(1);
        }

        /* renamed from: c */
        public static final int m64118c(WireUserGuest wireUserGuest, WireUserGuest wireUserGuest2) {
            return wireUserGuest.getId().compareTo(wireUserGuest2.getId());
        }

        /* renamed from: b */
        public final void m64119b(WireUserGuest it) {
            C37791a94 c37791a94 = C38700bh6.this.f57913g;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            C38384b94.m64920b(c37791a94, it, new Comparator() { // from class: ch6
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m64118c;
                    m64118c = C38700bh6.C12479e.m64118c((WireUserGuest) obj, (WireUserGuest) obj2);
                    return m64118c;
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireUserGuest wireUserGuest) {
            m64119b(wireUserGuest);
            return Unit.INSTANCE;
        }
    }

    public C38700bh6(Context context, InterfaceC36587Vg6 userGuestClient, C22454gl preference, InterfaceC35660Rh6 userStream, C36207Tq4 reactiveConfig) {
        Lazy lazy;
        List emptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userGuestClient, "userGuestClient");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f57907a = context;
        this.f57908b = userGuestClient;
        this.f57909c = preference;
        this.f57910d = userStream;
        this.f57911e = reactiveConfig;
        lazy = LazyKt__LazyJVMKt.lazy(new C12476b());
        this.f57912f = lazy;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f57913g = C37791a94.C10586a.create$default(c10586a, emptyList, null, 2, null);
        Observable<User> mo76576i = userStream.mo76576i();
        final C12475a c12475a = new C12475a();
        mo76576i.subscribe(new InterfaceC23484g() { // from class: Xg6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38700bh6.m64129j(Function1.this, obj);
            }
        });
    }

    /* renamed from: j */
    public static final void m64129j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final int m64127l(WireUserGuest wireUserGuest, WireUserGuest wireUserGuest2) {
        return wireUserGuest.getId().compareTo(wireUserGuest2.getId());
    }

    /* renamed from: n */
    public static final WireUserGuest m64125n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireUserGuest) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m64124o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC36821Wg6
    /* renamed from: a */
    public void mo64138a(String userGuestId) {
        Intrinsics.checkNotNullParameter(userGuestId, "userGuestId");
        this.f57913g.m71837i(new C12477c(userGuestId));
    }

    @Override // p000.InterfaceC36821Wg6
    /* renamed from: b */
    public Z84<List<WireUserGuest>> mo64137b() {
        return (Z84) this.f57912f.getValue();
    }

    @Override // p000.InterfaceC36821Wg6
    /* renamed from: c */
    public WireUserGuest mo64136c() {
        Object obj;
        Iterator<T> it = mo64137b().m73665a().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!((WireUserGuest) obj).getStartRideAttempted()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (WireUserGuest) obj;
    }

    @Override // p000.InterfaceC36821Wg6
    /* renamed from: d */
    public void mo64135d(String userGuestId, String str) {
        Object obj;
        WireUserGuest copy$default;
        Intrinsics.checkNotNullParameter(userGuestId, "userGuestId");
        Iterator<T> it = mo64137b().m73665a().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((WireUserGuest) obj).getId(), userGuestId)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        WireUserGuest wireUserGuest = (WireUserGuest) obj;
        if (wireUserGuest != null && (copy$default = WireUserGuest.copy$default(wireUserGuest, null, str, null, false, 13, null)) != null) {
            C41318g46.m40163a("Updating user guest " + userGuestId + "'s email to " + str, new Object[0]);
            C38384b94.m64920b(this.f57913g, copy$default, new Comparator() { // from class: ah6
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int m64127l;
                    m64127l = C38700bh6.m64127l((WireUserGuest) obj2, (WireUserGuest) obj3);
                    return m64127l;
                }
            });
        }
    }

    @Override // p000.InterfaceC36821Wg6
    /* renamed from: e */
    public AbstractC23442F<WireUserGuest> mo64134e(String str) {
        return m64126m(str);
    }

    /* renamed from: k */
    public final void m64128k() {
        this.f57913g.m71836j();
    }

    /* renamed from: m */
    public final AbstractC23442F<WireUserGuest> m64126m(String str) {
        AbstractC23442F<UserGuestResponse> m79573c = this.f57908b.m79573c(new UserGuestRequest(str));
        final C12478d c12478d = C12478d.f57917g;
        AbstractC23442F<R> m33157I = m79573c.m33157I(new InterfaceC23492o() { // from class: Yg6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireUserGuest m64125n;
                m64125n = C38700bh6.m64125n(Function1.this, obj);
                return m64125n;
            }
        });
        final C12479e c12479e = new C12479e();
        AbstractC23442F<WireUserGuest> m33101w = m33157I.m33101w(new InterfaceC23484g() { // from class: Zg6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38700bh6.m64124o(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "private fun upsertUserGu…eTo(o2.id) })\n      }\n  }");
        return m33101w;
    }
}
