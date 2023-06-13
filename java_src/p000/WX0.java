package p000;

import com.facebook.share.internal.C17296a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\b\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R*\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LWX0;", "LAv2;", "", "b", "Z", "()Z", "setInitial", "(Z)V", "isInitial", "Ljava/util/Locale;", "value", "c", "Ljava/util/Locale;", C17296a.f69688o, "()Ljava/util/Locale;", "setCurrentLocale", "(Ljava/util/Locale;)V", "currentLocale", "<init>", "()V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: WX0 */
/* loaded from: classes7.dex */
public final class WX0 implements InterfaceC31804Av2 {

    /* renamed from: a */
    public static final WX0 f41228a = new WX0();

    /* renamed from: b */
    public static boolean f41229b = true;

    /* renamed from: c */
    public static Locale f41230c;

    static {
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        f41230c = locale;
    }

    private WX0() {
    }

    @Override // p000.InterfaceC31804Av2
    /* renamed from: a */
    public Locale mo78255a() {
        if (mo78254b()) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            return locale;
        }
        return f41230c;
    }

    @Override // p000.InterfaceC31804Av2
    /* renamed from: b */
    public boolean mo78254b() {
        return f41229b;
    }
}
