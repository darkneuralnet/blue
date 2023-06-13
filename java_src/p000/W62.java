package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0004"}, m28432d2 = {"LgV2;", "Lb72;", "intrinsicSize", C17296a.f69688o, "foundation-layout_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: W62 */
/* loaded from: classes.dex */
public final class W62 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: W62$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C8935a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC38362b72.values().length];
            try {
                iArr[EnumC38362b72.Min.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC38362b72.Max.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m78829a(InterfaceC41563gV2 interfaceC41563gV2, EnumC38362b72 intrinsicSize) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicSize, "intrinsicSize");
        int i = C8935a.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return interfaceC41563gV2.mo39266t0(C39111cO2.f60490b);
            }
            throw new NoWhenBranchMatchedException();
        }
        return interfaceC41563gV2.mo39266t0(C46298oU2.f102060b);
    }
}
