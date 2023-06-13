package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.wire.WireTutorialResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¨\u0006\t"}, m28432d2 = {"LEa6;", "", "Lco/bird/android/model/constant/ConfigurableTutorialContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "birdId", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireTutorialResponse;", C17296a.f69688o, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ea6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC32555Ea6 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ea6$a */
    /* loaded from: classes4.dex */
    public static final class C1895a {
        public static /* synthetic */ AbstractC23442F getTutorials$default(InterfaceC32555Ea6 interfaceC32555Ea6, ConfigurableTutorialContext configurableTutorialContext, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    configurableTutorialContext = null;
                }
                if ((i & 2) != 0) {
                    str = null;
                }
                return interfaceC32555Ea6.m108744a(configurableTutorialContext, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTutorials");
        }
    }

    @NA1("v1/tutorial/active")
    /* renamed from: a */
    AbstractC23442F<WireTutorialResponse> m108744a(@InterfaceC37017Xc4("context") ConfigurableTutorialContext configurableTutorialContext, @InterfaceC37017Xc4("bird_id") String str);
}
