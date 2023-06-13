package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.persistence.Tutorial;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38466bI4;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J0\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH&J/\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000e\"\u00020\u0006H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0006H&¨\u0006\u0014"}, m28432d2 = {"LGw0;", "LbI4;", "Lio/reactivex/c;", "g", "Lco/bird/android/model/constant/ConfigurableTutorialContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "birdModel", "", "filterSeen", "Lio/reactivex/F;", "", "Lco/bird/android/model/persistence/Tutorial;", "i0", "", "tutorialIds", "W0", "([Ljava/lang/String;)Lio/reactivex/F;", "id", "B", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Gw0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC33215Gw0 extends InterfaceC38466bI4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Gw0$a */
    /* loaded from: classes2.dex */
    public static final class C2988a {
        /* renamed from: a */
        public static AbstractC23461c m104574a(InterfaceC33215Gw0 interfaceC33215Gw0, AbstractC23461c receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64706f(interfaceC33215Gw0, receiver);
        }

        /* renamed from: b */
        public static <T> AbstractC23442F<T> m104573b(InterfaceC33215Gw0 interfaceC33215Gw0, AbstractC23442F<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64702j(interfaceC33215Gw0, receiver);
        }

        public static /* synthetic */ AbstractC23442F getTutorialsByContext$default(InterfaceC33215Gw0 interfaceC33215Gw0, ConfigurableTutorialContext configurableTutorialContext, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                return interfaceC33215Gw0.mo101465i0(configurableTutorialContext, str, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTutorialsByContext");
        }
    }

    /* renamed from: B */
    AbstractC23461c mo101472B(String str);

    /* renamed from: W0 */
    AbstractC23442F<List<Tutorial>> mo101467W0(String... strArr);

    /* renamed from: g */
    AbstractC23461c mo101466g();

    /* renamed from: i0 */
    AbstractC23442F<List<Tutorial>> mo101465i0(ConfigurableTutorialContext configurableTutorialContext, String str, boolean z);
}
