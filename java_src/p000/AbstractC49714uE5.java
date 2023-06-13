package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import io.reactivex.AbstractC23461c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC43228jI5;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u000e"}, m28432d2 = {"LuE5;", "LjI5;", "T", "LVy;", "", "disconnectOnSuccess", "Lio/reactivex/c;", "U", "LZC0;", Action.SCOPE_ATTRIBUTE, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(LZC0;Landroid/content/Context;)V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uE5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC49714uE5<T extends InterfaceC43228jI5> extends AbstractC8883Vy<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC49714uE5(ZC0 scope, Context context) {
        super(scope, context);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ AbstractC23461c unlock$default(AbstractC49714uE5 abstractC49714uE5, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            return abstractC49714uE5.mo3764U(z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
    }

    /* renamed from: U */
    public abstract AbstractC23461c mo3764U(boolean z);
}
