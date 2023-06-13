package p000;

import androidx.lifecycle.AbstractC11719f;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¨\u0006\u0003"}, m28432d2 = {"Landroidx/lifecycle/f$a;", "LtK2;", C17296a.f69688o, "rx_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: WJ2 */
/* loaded from: classes3.dex */
public final class WJ2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WJ2$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C8982a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC11719f.EnumC11720a.values().length];
            try {
                iArr[AbstractC11719f.EnumC11720a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC11719f.EnumC11720a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC11719f.EnumC11720a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC11719f.EnumC11720a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC11719f.EnumC11720a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC11719f.EnumC11720a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC11719f.EnumC11720a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final EnumC49172tK2 m78598a(AbstractC11719f.EnumC11720a enumC11720a) {
        switch (C8982a.$EnumSwitchMapping$0[enumC11720a.ordinal()]) {
            case 1:
                return EnumC49172tK2.ON_CREATE;
            case 2:
                return EnumC49172tK2.ON_START;
            case 3:
                return EnumC49172tK2.ON_RESUME;
            case 4:
                return EnumC49172tK2.ON_PAUSE;
            case 5:
                return EnumC49172tK2.ON_STOP;
            case 6:
                return EnumC49172tK2.ON_DESTROY;
            case 7:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
