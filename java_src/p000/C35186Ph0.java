package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¨\u0006\n"}, m28432d2 = {"E", "", "capacity", "Lk30;", "onBufferOverflow", "Lkotlin/Function1;", "", "onUndeliveredElement", "LFh0;", C17296a.f69688o, "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: Ph0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C35186Ph0 {
    /* renamed from: a */
    public static final <E> InterfaceC32846Fh0<E> m89919a(int i, EnumC43674k30 enumC43674k30, Function1<? super E, Unit> function1) {
        int i2 = 1;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != Integer.MAX_VALUE) {
                        if (i == 1 && enumC43674k30 == EnumC43674k30.DROP_OLDEST) {
                            return new C37670Zx0(function1);
                        }
                        return new C26596no(i, enumC43674k30, function1);
                    }
                    return new C36214Tr2(function1);
                } else if (enumC43674k30 == EnumC43674k30.SUSPEND) {
                    return new C49548tx4(function1);
                } else {
                    return new C26596no(1, enumC43674k30, function1);
                }
            }
            if (enumC43674k30 != EnumC43674k30.SUSPEND) {
                i2 = 0;
            }
            if (i2 != 0) {
                return new C37670Zx0(function1);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (enumC43674k30 == EnumC43674k30.SUSPEND) {
            i2 = InterfaceC32846Fh0.f9955L.m106750a();
        }
        return new C26596no(i2, enumC43674k30, function1);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC32846Fh0 m89918b(int i, EnumC43674k30 enumC43674k30, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            enumC43674k30 = EnumC43674k30.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        return m89919a(i, enumC43674k30, function1);
    }
}
