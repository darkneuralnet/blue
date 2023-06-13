package p000;

import androidx.lifecycle.C11747p;
import com.facebook.share.internal.C17296a;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, m28432d2 = {"LTv;", "LOr6;", "", "onCleared", "", C17296a.f69688o, "Ljava/lang/String;", "IdKey", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "e", "()Ljava/util/UUID;", "id", "Ljava/lang/ref/WeakReference;", "LEi5;", "c", "Ljava/lang/ref/WeakReference;", "f", "()Ljava/lang/ref/WeakReference;", "g", "(Ljava/lang/ref/WeakReference;)V", "saveableStateHolderRef", "Landroidx/lifecycle/p;", "handle", "<init>", "(Landroidx/lifecycle/p;)V", "navigation-compose_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Tv */
/* loaded from: classes.dex */
public final class C8146Tv extends AbstractC35048Or6 {

    /* renamed from: a */
    public final String f36444a;

    /* renamed from: b */
    public final UUID f36445b;

    /* renamed from: c */
    public WeakReference<InterfaceC32626Ei5> f36446c;

    public C8146Tv(C11747p handle) {
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f36444a = "SaveableStateHolder_BackStackEntryKey";
        UUID uuid = (UUID) handle.m66947f("SaveableStateHolder_BackStackEntryKey");
        if (uuid == null) {
            uuid = UUID.randomUUID();
            handle.m66940m("SaveableStateHolder_BackStackEntryKey", uuid);
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().also { handle.set(IdKey, it) }");
        }
        this.f36445b = uuid;
    }

    /* renamed from: e */
    public final UUID m82267e() {
        return this.f36445b;
    }

    /* renamed from: f */
    public final WeakReference<InterfaceC32626Ei5> m82266f() {
        WeakReference<InterfaceC32626Ei5> weakReference = this.f36446c;
        if (weakReference != null) {
            return weakReference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("saveableStateHolderRef");
        return null;
    }

    /* renamed from: g */
    public final void m82265g(WeakReference<InterfaceC32626Ei5> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.f36446c = weakReference;
    }

    @Override // p000.AbstractC35048Or6
    public void onCleared() {
        super.onCleared();
        InterfaceC32626Ei5 interfaceC32626Ei5 = m82266f().get();
        if (interfaceC32626Ei5 != null) {
            interfaceC32626Ei5.mo99677e(this.f36445b);
        }
        m82266f().clear();
    }
}
