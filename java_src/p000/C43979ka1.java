package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aG\u0010\u0007\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u000b\"\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"Lne;", "Lk61;", "target", "Ld62;", "from", "to", "", DateTokenConverter.CONVERTER_KEY, "(Lne;FLd62;Ld62;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltb6;", C17296a.f69688o, "Ltb6;", "DefaultIncomingSpec", "b", "DefaultOutgoingSpec", "c", "HoveredOutgoingSpec", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: ka1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43979ka1 {

    /* renamed from: a */
    public static final C49330tb6<C43705k61> f94529a = new C49330tb6<>(120, 0, C42549i91.m34395b(), 2, null);

    /* renamed from: b */
    public static final C49330tb6<C43705k61> f94530b = new C49330tb6<>(150, 0, new UE0(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* renamed from: c */
    public static final C49330tb6<C43705k61> f94531c = new C49330tb6<>(120, 0, new UE0(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* renamed from: d */
    public static final Object m28821d(C26560ne<C43705k61, ?> c26560ne, float f, InterfaceC39556d62 interfaceC39556d62, InterfaceC39556d62 interfaceC39556d622, Continuation<? super Unit> continuation) {
        InterfaceC25753lf<C43705k61> interfaceC25753lf;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        if (interfaceC39556d622 != null) {
            interfaceC25753lf = C43386ja1.f92946a.m30297a(interfaceC39556d622);
        } else if (interfaceC39556d62 != null) {
            interfaceC25753lf = C43386ja1.f92946a.m30296b(interfaceC39556d62);
        } else {
            interfaceC25753lf = null;
        }
        InterfaceC25753lf<C43705k61> interfaceC25753lf2 = interfaceC25753lf;
        if (interfaceC25753lf2 != null) {
            Object m23393f = C26560ne.m23393f(c26560ne, C43705k61.m29306d(f), interfaceC25753lf2, null, null, continuation, 12, null);
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (m23393f == coroutine_suspended2) {
                return m23393f;
            }
            return Unit.INSTANCE;
        }
        Object m23378u = c26560ne.m23378u(C43705k61.m29306d(f), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m23378u == coroutine_suspended) {
            return m23378u;
        }
        return Unit.INSTANCE;
    }
}
