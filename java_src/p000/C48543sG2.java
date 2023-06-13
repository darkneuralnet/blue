package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0003H\u0007\u001a \u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u001a\b\u0010\u000e\u001a\u00020\rH\u0000\"\u001a\u0010\u0012\u001a\u00020\u00058\u0002X\u0082D¢\u0006\f\n\u0004\b\f\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m28432d2 = {"LqG2;", "", "factories", "LpG2;", "e", "", "c", "", "cause", "", "errorHint", "LsU2;", C17296a.f69688o, "", DateTokenConverter.CONVERTER_KEY, "Z", "getSUPPORT_MISSING$annotations", "()V", "SUPPORT_MISSING", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: sG2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48543sG2 {

    /* renamed from: a */
    public static final boolean f108526a = true;

    /* renamed from: a */
    public static final C48669sU2 m14490a(Throwable th, String str) {
        if (f108526a) {
            return new C48669sU2(th, str);
        }
        if (th != null) {
            throw th;
        }
        m14487d();
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public static /* synthetic */ C48669sU2 m14489b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m14490a(th, str);
    }

    /* renamed from: c */
    public static final boolean m14488c(AbstractC46765pG2 abstractC46765pG2) {
        return abstractC46765pG2.mo14156G() instanceof C48669sU2;
    }

    /* renamed from: d */
    public static final Void m14487d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final AbstractC46765pG2 m14486e(InterfaceC47358qG2 interfaceC47358qG2, List<? extends InterfaceC47358qG2> list) {
        try {
            return interfaceC47358qG2.mo12287c(list);
        } catch (Throwable th) {
            return m14490a(th, interfaceC47358qG2.mo12288b());
        }
    }
}
