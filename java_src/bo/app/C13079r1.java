package bo.app;

import com.facebook.share.internal.C17296a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, m28432d2 = {"Lbo/app/r1;", "", "Lbo/app/h2;", C17296a.f69688o, "()Lbo/app/h2;", "getHttpConnector$annotations", "()V", "httpConnector", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.r1 */
/* loaded from: classes.dex */
public final class C13079r1 {

    /* renamed from: a */
    public static final C13079r1 f59207a = new C13079r1();

    /* renamed from: b */
    private static final int f59208b = (int) TimeUnit.SECONDS.toMillis(5);

    /* renamed from: c */
    private static InterfaceC12715h2 f59209c;

    private C13079r1() {
    }

    /* renamed from: a */
    public static final InterfaceC12715h2 m63038a() {
        InterfaceC12715h2 interfaceC12715h2 = f59209c;
        return interfaceC12715h2 == null ? new C12716h3(new C13043q1(f59208b)) : interfaceC12715h2;
    }
}
