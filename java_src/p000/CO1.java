package p000;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.braze.support.BrazeFunctionNotImplemented;
import com.facebook.share.internal.C17296a;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m28432d2 = {"LCO1;", "", "LwO1;", "inAppMessage", "LAZ1;", "h", "LjZ1;", "inAppMessageCloser", "", "c", "f", "LmT2;", "button", DateTokenConverter.CONVERTER_KEY, "e", "", "b", "Landroid/view/View;", "inAppMessageView", "i", "j", "g", C17296a.f69688o, "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: CO1 */
/* loaded from: classes5.dex */
public interface CO1 {
    /* renamed from: a */
    default void m112277a(InterfaceC50985wO1 inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
    }

    /* renamed from: b */
    default void m112276b(InterfaceC50985wO1 inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
    }

    @Deprecated(message = "InAppMessageCloser is deprecated", replaceWith = @ReplaceWith(expression = "onInAppMessageClicked(inAppMessage)", imports = {}))
    /* renamed from: c */
    default boolean m112275c(InterfaceC50985wO1 inAppMessage, C43377jZ1 c43377jZ1) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        throw BrazeFunctionNotImplemented.f69033b;
    }

    @Deprecated(message = "InAppMessageCloser is deprecated", replaceWith = @ReplaceWith(expression = "onInAppMessageButtonClicked(inAppMessage, button)", imports = {}))
    /* renamed from: d */
    default boolean m112274d(InterfaceC50985wO1 inAppMessage, C45103mT2 button, C43377jZ1 c43377jZ1) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(button, "button");
        throw BrazeFunctionNotImplemented.f69033b;
    }

    /* renamed from: e */
    default boolean m112273e(InterfaceC50985wO1 inAppMessage, C45103mT2 button) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(button, "button");
        return false;
    }

    /* renamed from: f */
    default boolean m112272f(InterfaceC50985wO1 inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        return false;
    }

    /* renamed from: g */
    default void m112271g(View inAppMessageView, InterfaceC50985wO1 inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
    }

    /* renamed from: h */
    default AZ1 mo112176h(InterfaceC50985wO1 inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        return AZ1.DISPLAY_NOW;
    }

    /* renamed from: i */
    default void m112270i(View inAppMessageView, InterfaceC50985wO1 inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
    }

    /* renamed from: j */
    default void m112269j(View inAppMessageView, InterfaceC50985wO1 inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
    }
}
