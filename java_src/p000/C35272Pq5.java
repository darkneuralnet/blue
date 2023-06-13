package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, m28432d2 = {"LOq5;", "", "isSecureFlagSetOnParent", C17296a.f69688o, "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Pq5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35272Pq5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Pq5$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C6503a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC35038Oq5.values().length];
            try {
                iArr[EnumC35038Oq5.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC35038Oq5.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC35038Oq5.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final boolean m89705a(EnumC35038Oq5 enumC35038Oq5, boolean z) {
        Intrinsics.checkNotNullParameter(enumC35038Oq5, "<this>");
        int i = C6503a.$EnumSwitchMapping$0[enumC35038Oq5.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return z;
        }
        return false;
    }
}
