package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0006R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LLA0;", "", "Landroid/content/Context;", DateTokenConverter.CONVERTER_KEY, "Lmf3;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", C17296a.f69688o, "e", CoreConstants.CONTEXT_SCOPE_VALUE, "c", "b", "", "Ljava/util/Set;", "listeners", "Landroid/content/Context;", "<init>", "()V", "activity_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: LA0 */
/* loaded from: classes.dex */
public final class LA0 {

    /* renamed from: a */
    public final Set<InterfaceC45217mf3> f20835a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public volatile Context f20836b;

    /* renamed from: a */
    public final void m97640a(InterfaceC45217mf3 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = this.f20836b;
        if (context != null) {
            listener.mo25215a(context);
        }
        this.f20835a.add(listener);
    }

    /* renamed from: b */
    public final void m97639b() {
        this.f20836b = null;
    }

    /* renamed from: c */
    public final void m97638c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20836b = context;
        for (InterfaceC45217mf3 interfaceC45217mf3 : this.f20835a) {
            interfaceC45217mf3.mo25215a(context);
        }
    }

    /* renamed from: d */
    public final Context m97637d() {
        return this.f20836b;
    }

    /* renamed from: e */
    public final void m97636e(InterfaceC45217mf3 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f20835a.remove(listener);
    }
}
