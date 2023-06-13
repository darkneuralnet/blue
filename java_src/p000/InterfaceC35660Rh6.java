package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.User;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Deprecated;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H&R\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00048&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001b0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001b0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006!"}, m28432d2 = {"LRh6;", "", "", "b", "Lco/bird/android/model/User;", "user", "q1", "Lio/reactivex/Observable;", "i", "c", "f", "", "g", "()Z", "isLoggedIn", "", "e", "()Ljava/lang/String;", "currentUserId", DateTokenConverter.CONVERTER_KEY, "currentUserLocale", C17296a.f69688o, "()Lco/bird/android/model/User;", "getCurrentUser$annotations", "()V", "currentUser", "LZ84;", "Lco/bird/android/buava/Optional;", "h", "()LZ84;", "currentUserStream", "j", "stripePublicKey", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Rh6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC35660Rh6 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Rh6$a */
    /* loaded from: classes2.dex */
    public static final class C7242a {
        /* renamed from: a */
        public static boolean m86437a(InterfaceC35660Rh6 interfaceC35660Rh6) {
            return interfaceC35660Rh6.mo76580e() != null;
        }

        @Deprecated(message = "Use currentUserStream instead")
        public static /* synthetic */ void getCurrentUser$annotations() {
        }
    }

    /* renamed from: a */
    User mo76584a();

    /* renamed from: b */
    void mo76583b();

    /* renamed from: c */
    Observable<User> mo76582c();

    /* renamed from: d */
    String mo76581d();

    /* renamed from: e */
    String mo76580e();

    /* renamed from: f */
    Observable<User> mo76579f();

    /* renamed from: g */
    boolean mo76578g();

    /* renamed from: h */
    Z84<Optional<User>> mo76577h();

    /* renamed from: i */
    Observable<User> mo76576i();

    /* renamed from: j */
    Z84<Optional<String>> mo76575j();

    /* renamed from: q1 */
    void mo76567q1(User user);
}
