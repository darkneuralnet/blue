package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"Luf1;", "", C17296a.f69688o, "auth_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Af1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C31659Af1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Af1$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0170a {
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
    public static final String m115411a(EnumC49958uf1 enumC49958uf1) {
        Intrinsics.checkNotNullParameter(enumC49958uf1, "<this>");
        int i = C0170a.$EnumSwitchMapping$0[enumC49958uf1.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "http://localhost:8080/";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "https://api-auth.dev.birdapp.com";
        }
        return "https://api-auth.prod.birdapp.com";
    }
}
