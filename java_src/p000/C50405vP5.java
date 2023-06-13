package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.common.ConstantsKt;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
@Metadata(m28433d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a6\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000\"\u001a\u0010\u0012\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0015\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u0012\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, m28432d2 = {"T", "value", "LGX2;", C17296a.f69688o, "(Ljava/lang/Object;)LGX2;", "LtP5;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lk30;", "onBufferOverflow", "LEu1;", DateTokenConverter.CONVERTER_KEY, "LuX5;", "LuX5;", "getNONE$annotations", "()V", ConstantsKt.NONE, "b", "getPENDING$annotations", "PENDING", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: vP5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50405vP5 {

    /* renamed from: a */
    public static final C49885uX5 f114015a = new C49885uX5(ConstantsKt.NONE);

    /* renamed from: b */
    public static final C49885uX5 f114016b = new C49885uX5("PENDING");

    /* renamed from: a */
    public static final <T> GX2<T> m8742a(T t) {
        if (t == null) {
            t = (T) C46976pd3.f103863a;
        }
        return new C49813uP5(t);
    }

    /* renamed from: d */
    public static final <T> InterfaceC32730Eu1<T> m8739d(InterfaceC49220tP5<? extends T> interfaceC49220tP5, CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30) {
        boolean z = false;
        if (i >= 0 && i < 2) {
            z = true;
        }
        if ((z || i == -2) && enumC43674k30 == EnumC43674k30.DROP_OLDEST) {
            return interfaceC49220tP5;
        }
        return C36748Vy5.m79028e(interfaceC49220tP5, coroutineContext, i, enumC43674k30);
    }
}
