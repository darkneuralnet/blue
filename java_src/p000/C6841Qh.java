package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, m28432d2 = {"LOh;", "Luf1;", "environment", "", C17296a.f69688o, "core-interface_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Qh */
/* loaded from: classes2.dex */
public final class C6841Qh {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Qh$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C6842a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC49958uf1.values().length];
            try {
                iArr[EnumC49958uf1.f112718k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC49958uf1.f112719l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC49958uf1.f112720m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final String m88190a(InterfaceC6097Oh interfaceC6097Oh, EnumC49958uf1 environment) {
        Intrinsics.checkNotNullParameter(interfaceC6097Oh, "<this>");
        Intrinsics.checkNotNullParameter(environment, "environment");
        int i = C6842a.$EnumSwitchMapping$0[environment.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return interfaceC6097Oh.mo89928d();
        }
        return interfaceC6097Oh.mo89922j();
    }
}
