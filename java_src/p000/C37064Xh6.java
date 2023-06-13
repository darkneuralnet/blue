package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.User;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.subjects.C24552a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C37791a94;
import p000.InterfaceC35660Rh6;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00040\u00040\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R5\u0010!\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0019 \u0016*\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00130\u00130\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R&\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00130\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010 R\u0016\u0010&\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010%R\u0016\u0010'\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010(¨\u0006,"}, m28432d2 = {"LXh6;", "LRh6;", "", "b", "Lco/bird/android/model/User;", "user", "q1", "Lio/reactivex/Observable;", "i", "c", "f", "s", "Lgl;", C17296a.f69688o, "Lgl;", "getPreference", "()Lgl;", "preference", "La94;", "Lco/bird/android/buava/Optional;", "La94;", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/a;", "lastLoggedOutUser", "", DateTokenConverter.CONVERTER_KEY, "mutableStripePublicKey", "LZ84;", "e", "Lkotlin/Lazy;", "j", "()LZ84;", "stripePublicKey", "LZ84;", "h", "currentUserStream", "()Ljava/lang/String;", "currentUserId", "currentUserLocale", "()Lco/bird/android/model/User;", "currentUser", "<init>", "(Lgl;)V", "user_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Xh6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37064Xh6 implements InterfaceC35660Rh6 {

    /* renamed from: a */
    public final C22454gl f43685a;

    /* renamed from: b */
    public final C37791a94<Optional<User>> f43686b;

    /* renamed from: c */
    public final C24552a<User> f43687c;

    /* renamed from: d */
    public final C37791a94<Optional<String>> f43688d;

    /* renamed from: e */
    public final Lazy f43689e;

    /* renamed from: f */
    public final Z84<Optional<User>> f43690f;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/User;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xh6$a */
    /* loaded from: classes4.dex */
    public static final class C9453a extends Lambda implements Function1<Optional<User>, Boolean> {

        /* renamed from: g */
        public static final C9453a f43691g = new C9453a();

        public C9453a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<User> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/User;", "user", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xh6$b */
    /* loaded from: classes4.dex */
    public static final class C9454b extends Lambda implements Function1<Optional<User>, String> {

        /* renamed from: g */
        public static final C9454b f43692g = new C9454b();

        public C9454b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Optional<User> user) {
            Intrinsics.checkNotNullParameter(user, "user");
            return user.m59038b().getId();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/User;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/User;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xh6$c */
    /* loaded from: classes4.dex */
    public static final class C9455c extends Lambda implements Function1<Optional<User>, User> {

        /* renamed from: g */
        public static final C9455c f43693g = new C9455c();

        public C9455c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final User invoke(Optional<User> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xh6$d */
    /* loaded from: classes4.dex */
    public static final class C9456d extends Lambda implements Function0<Z84<Optional<String>>> {
        public C9456d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<String>> invoke() {
            return Z84.f47888d.m73663b(C37064Xh6.this.f43688d);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/User;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xh6$e */
    /* loaded from: classes4.dex */
    public static final class C9457e extends Lambda implements Function1<Optional<User>, Boolean> {

        /* renamed from: g */
        public static final C9457e f43695g = new C9457e();

        public C9457e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<User> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/User;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/User;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xh6$f */
    /* loaded from: classes4.dex */
    public static final class C9458f extends Lambda implements Function1<Optional<User>, User> {

        /* renamed from: g */
        public static final C9458f f43696g = new C9458f();

        public C9458f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final User invoke(Optional<User> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b();
        }
    }

    public C37064Xh6(C22454gl preference) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(preference, "preference");
        this.f43685a = preference;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        Optional.C14443a c14443a = Optional.f63040c;
        C37791a94<Optional<User>> create$default = C37791a94.C10586a.create$default(c10586a, c14443a.m59033b(preference.m37750B0()), null, 2, null);
        this.f43686b = create$default;
        C24552a<User> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<User>()");
        this.f43687c = m31922e;
        this.f43688d = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        lazy = LazyKt__LazyJVMKt.lazy(new C9456d());
        this.f43689e = lazy;
        this.f43690f = Z84.f47888d.m73663b(create$default);
    }

    /* renamed from: p */
    public static final boolean m76569p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: q */
    public static final String m76568q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final User m76566r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (User) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final boolean m76564t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: u */
    public static final User m76563u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (User) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC35660Rh6
    /* renamed from: a */
    public User mo76584a() {
        return this.f43686b.getValue().m59035e();
    }

    @Override // p000.InterfaceC35660Rh6
    /* renamed from: b */
    public void mo76583b() {
        User m59035e = this.f43686b.getValue().m59035e();
        if (m59035e != null) {
            this.f43687c.onNext(m59035e);
        }
        C37791a94<Optional<User>> c37791a94 = this.f43686b;
        Optional.C14443a c14443a = Optional.f63040c;
        c37791a94.accept(c14443a.m59034a());
        this.f43688d.accept(c14443a.m59034a());
    }

    @Override // p000.InterfaceC35660Rh6
    /* renamed from: c */
    public Observable<User> mo76582c() {
        C37791a94<Optional<User>> c37791a94 = this.f43686b;
        final C9453a c9453a = C9453a.f43691g;
        Observable<Optional<User>> filter = c37791a94.filter(new InterfaceC23494q() { // from class: Sh6
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m76569p;
                m76569p = C37064Xh6.m76569p(Function1.this, obj);
                return m76569p;
            }
        });
        final C9454b c9454b = C9454b.f43692g;
        Observable<Optional<User>> distinct = filter.distinct(new InterfaceC23492o() { // from class: Th6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m76568q;
                m76568q = C37064Xh6.m76568q(Function1.this, obj);
                return m76568q;
            }
        });
        final C9455c c9455c = C9455c.f43693g;
        Observable map = distinct.map(new InterfaceC23492o() { // from class: Uh6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                User m76566r;
                m76566r = C37064Xh6.m76566r(Function1.this, obj);
                return m76566r;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "user\n      .filter { it.…}\n      .map { it.get() }");
        return map;
    }

    @Override // p000.InterfaceC35660Rh6
    /* renamed from: d */
    public String mo76581d() {
        User m59035e = this.f43686b.getValue().m59035e();
        if (m59035e != null) {
            return m59035e.getLocale();
        }
        return null;
    }

    @Override // p000.InterfaceC35660Rh6
    /* renamed from: e */
    public String mo76580e() {
        User m59035e = this.f43686b.getValue().m59035e();
        if (m59035e != null) {
            return m59035e.getId();
        }
        return null;
    }

    @Override // p000.InterfaceC35660Rh6
    /* renamed from: f */
    public Observable<User> mo76579f() {
        C37791a94<Optional<User>> c37791a94 = this.f43686b;
        final C9457e c9457e = C9457e.f43695g;
        Observable<Optional<User>> filter = c37791a94.filter(new InterfaceC23494q() { // from class: Vh6
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m76564t;
                m76564t = C37064Xh6.m76564t(Function1.this, obj);
                return m76564t;
            }
        });
        final C9458f c9458f = C9458f.f43696g;
        Observable map = filter.map(new InterfaceC23492o() { // from class: Wh6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                User m76563u;
                m76563u = C37064Xh6.m76563u(Function1.this, obj);
                return m76563u;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "user.filter { it.isPresent }.map { it.get() }");
        return map;
    }

    @Override // p000.InterfaceC35660Rh6
    /* renamed from: g */
    public boolean mo76578g() {
        return InterfaceC35660Rh6.C7242a.m86437a(this);
    }

    @Override // p000.InterfaceC35660Rh6
    /* renamed from: h */
    public Z84<Optional<User>> mo76577h() {
        return this.f43690f;
    }

    @Override // p000.InterfaceC35660Rh6
    /* renamed from: i */
    public Observable<User> mo76576i() {
        Observable<User> hide = this.f43687c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "lastLoggedOutUser.hide()");
        return hide;
    }

    @Override // p000.InterfaceC35660Rh6
    /* renamed from: j */
    public Z84<Optional<String>> mo76575j() {
        return (Z84) this.f43689e.getValue();
    }

    @Override // p000.InterfaceC35660Rh6
    /* renamed from: q1 */
    public void mo76567q1(User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        User m59035e = this.f43686b.getValue().m59035e();
        if (m59035e != null && !Intrinsics.areEqual(user.getId(), m59035e.getId())) {
            this.f43687c.onNext(m59035e);
        }
        m76565s(user);
        this.f43686b.accept(Optional.f63040c.m59032c(user));
    }

    /* renamed from: s */
    public final void m76565s(User user) {
        String str;
        String stripePublicKey = user.getStripePublicKey();
        if (stripePublicKey != null) {
            Optional<String> value = mo76575j().getValue();
            if (value != null) {
                str = value.m59035e();
            } else {
                str = null;
            }
            if (str == null || !Intrinsics.areEqual(stripePublicKey, str)) {
                this.f43688d.accept(Optional.f63040c.m59032c(stripePublicKey));
            }
        }
    }
}
