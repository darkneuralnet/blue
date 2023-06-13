package p000;

import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R$\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\bj\b\u0012\u0004\u0012\u00020\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000e"}, m28432d2 = {"LfY3;", "", "LeY3;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", C17296a.f69688o, "c", "b", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "listeners", "<init>", "()V", "customview-poolingcontainer_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: fY3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40998fY3 {

    /* renamed from: a */
    public final ArrayList<InterfaceC40405eY3> f80312a = new ArrayList<>();

    /* renamed from: a */
    public final void m41205a(InterfaceC40405eY3 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f80312a.add(listener);
    }

    /* renamed from: b */
    public final void m41204b() {
        int lastIndex;
        for (lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this.f80312a); -1 < lastIndex; lastIndex--) {
            this.f80312a.get(lastIndex).mo42798b();
        }
    }

    /* renamed from: c */
    public final void m41203c(InterfaceC40405eY3 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f80312a.remove(listener);
    }
}
