package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH'J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH'J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H'¨\u0006\u0013"}, m28432d2 = {"LXX5;", "", "LWX5;", "systemIdInfo", "", "e", "", "workSpecId", "", "generation", "b", "LTC6;", "id", DateTokenConverter.CONVERTER_KEY, "f", "g", C17296a.f69688o, "", "c", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: XX5 */
/* loaded from: classes.dex */
public interface XX5 {

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: XX5$a */
    /* loaded from: classes.dex */
    public static final class C9424a {
        /* renamed from: a */
        public static WX5 m76895a(XX5 xx5, TC6 id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return xx5.mo74927b(id.m84208b(), id.m84209a());
        }

        /* renamed from: b */
        public static void m76894b(XX5 xx5, TC6 id) {
            Intrinsics.checkNotNullParameter(id, "id");
            xx5.mo74923f(id.m84208b(), id.m84209a());
        }
    }

    /* renamed from: a */
    void mo74928a(TC6 tc6);

    /* renamed from: b */
    WX5 mo74927b(String str, int i);

    /* renamed from: c */
    List<String> mo74926c();

    /* renamed from: d */
    WX5 mo74925d(TC6 tc6);

    /* renamed from: e */
    void mo74924e(WX5 wx5);

    /* renamed from: f */
    void mo74923f(String str, int i);

    /* renamed from: g */
    void mo74922g(String str);
}
