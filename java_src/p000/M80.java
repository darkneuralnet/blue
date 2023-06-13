package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \n2\u00020\u0001:\u0003\u0005\u000b\nB\u0007¢\u0006\u0004\b\b\u0010\tR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m28432d2 = {"LM80;", "", "", "", "LM80$a;", C17296a.f69688o, "Ljava/util/Map;", "callbacks", "<init>", "()V", "c", "b", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: M80 */
/* loaded from: classes5.dex */
public final class M80 {

    /* renamed from: a */
    public final Map<Integer, InterfaceC5208a> f22695a = new HashMap();

    /* renamed from: c */
    public static final C5209b f22694c = new C5209b(null);

    /* renamed from: b */
    public static final Map<Integer, InterfaceC5208a> f22693b = new HashMap();

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m28432d2 = {"LM80$a;", "", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: M80$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC5208a {
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m28432d2 = {"LM80$b;", "", "", "requestCode", "LM80$a;", "callback", "", C17296a.f69688o, "", "staticCallbacks", "Ljava/util/Map;", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: M80$b */
    /* loaded from: classes5.dex */
    public static final class C5209b {
        private C5209b() {
        }

        @JvmStatic
        /* renamed from: a */
        public final synchronized void m95692a(int i, InterfaceC5208a callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (M80.f22693b.containsKey(Integer.valueOf(i))) {
                return;
            }
            M80.f22693b.put(Integer.valueOf(i), callback);
        }

        public /* synthetic */ C5209b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m28432d2 = {"LM80$c;", "", "", C17296a.f69688o, "b", "I", "offset", "<init>", "(Ljava/lang/String;II)V", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: M80$c */
    /* loaded from: classes5.dex */
    public enum EnumC5210c {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11);
        

        /* renamed from: b */
        public final int f22709b;

        EnumC5210c(int i) {
            this.f22709b = i;
        }

        /* renamed from: a */
        public final int m95691a() {
            return C17216a.m52734l() + this.f22709b;
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final synchronized void m95693b(int i, InterfaceC5208a interfaceC5208a) {
        synchronized (M80.class) {
            f22694c.m95692a(i, interfaceC5208a);
        }
    }
}
