package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import p000.BA1;
@Metadata(m28433d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a$\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\t\u001a\u00020\b\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m28432d2 = {"T", "LEu1;", "", "capacity", "Lk30;", "onBufferOverflow", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "e", "", "c", "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: Zu1 */
/* loaded from: classes8.dex */
public final /* synthetic */ class C37644Zu1 {
    /* renamed from: a */
    public static final <T> InterfaceC32730Eu1<T> m72329a(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, int i, EnumC43674k30 enumC43674k30) {
        boolean z;
        int i2;
        EnumC43674k30 enumC43674k302;
        boolean z2 = true;
        if (i < 0 && i != -2 && i != -1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (i == -1 && enumC43674k30 != EnumC43674k30.SUSPEND) {
                z2 = false;
            }
            if (z2) {
                if (i == -1) {
                    enumC43674k302 = EnumC43674k30.DROP_OLDEST;
                    i2 = 0;
                } else {
                    i2 = i;
                    enumC43674k302 = enumC43674k30;
                }
                if (interfaceC32730Eu1 instanceof BA1) {
                    return BA1.C0543a.m114314a((BA1) interfaceC32730Eu1, null, i2, enumC43674k302, 1, null);
                }
                return new C34484Mh0(interfaceC32730Eu1, null, i2, enumC43674k302, 2, null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC32730Eu1 m72328b(InterfaceC32730Eu1 interfaceC32730Eu1, int i, EnumC43674k30 enumC43674k30, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            enumC43674k30 = EnumC43674k30.SUSPEND;
        }
        return C36708Vu1.m79268c(interfaceC32730Eu1, i, enumC43674k30);
    }

    /* renamed from: c */
    public static final void m72327c(CoroutineContext coroutineContext) {
        boolean z;
        if (coroutineContext.get(InterfaceC52943zh2.f122077a0) == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    /* renamed from: d */
    public static final <T> InterfaceC32730Eu1<T> m72326d(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1) {
        InterfaceC32730Eu1<T> m72328b;
        m72328b = m72328b(interfaceC32730Eu1, -1, null, 2, null);
        return m72328b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static final <T> InterfaceC32730Eu1<T> m72325e(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, CoroutineContext coroutineContext) {
        m72327c(coroutineContext);
        if (!Intrinsics.areEqual(coroutineContext, EmptyCoroutineContext.INSTANCE)) {
            if (interfaceC32730Eu1 instanceof BA1) {
                return BA1.C0543a.m114314a((BA1) interfaceC32730Eu1, coroutineContext, 0, null, 6, null);
            }
            return new C34484Mh0(interfaceC32730Eu1, coroutineContext, 0, null, 12, null);
        }
        return interfaceC32730Eu1;
    }
}
