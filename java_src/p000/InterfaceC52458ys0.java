package p000;

import co.bird.android.model.NonComplianceWarning;
import co.bird.android.model.NonComplianceWarningKind;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JG\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m28432d2 = {"Lys0;", "", "Lco/bird/android/model/NonComplianceWarningKind;", "warningKind", "", "rideId", "currency", "", "amount", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/NonComplianceWarning;", "c", "(Lco/bird/android/model/NonComplianceWarningKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/F;", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ys0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC52458ys0 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ys0$a */
    /* loaded from: classes2.dex */
    public static final class C30762a {
        public static /* synthetic */ AbstractC23442F logWarningShown$default(InterfaceC52458ys0 interfaceC52458ys0, NonComplianceWarningKind nonComplianceWarningKind, String str, String str2, Integer num, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                if ((i & 4) != 0) {
                    str2 = null;
                }
                if ((i & 8) != 0) {
                    num = null;
                }
                return interfaceC52458ys0.mo211c(nonComplianceWarningKind, str, str2, num);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logWarningShown");
        }
    }

    /* renamed from: c */
    AbstractC23442F<HM4<NonComplianceWarning>> mo211c(NonComplianceWarningKind nonComplianceWarningKind, String str, String str2, Integer num);
}
