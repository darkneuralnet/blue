package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004R%\u0010\u0012\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00018\u00008\u00000\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"LOr5;", "T", "Lct4;", "item", "", "getId", "(Ljava/lang/Object;)Ljava/lang/String;", "", "H", "(Ljava/lang/Object;)V", "id", "J", "Lma4;", "kotlin.jvm.PlatformType", "g", "Lma4;", "E", "()Lma4;", "itemSelectedEvents", "", "h", "I", "F", "()I", "setSelectedIndex", "(I)V", "selectedIndex", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSelectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionAdapter.kt\nco/bird/android/app/feature/longterm/SelectionAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n350#2,7:29\n1#3:36\n*S KotlinDebug\n*F\n+ 1 SelectionAdapter.kt\nco/bird/android/app/feature/longterm/SelectionAdapter\n*L\n21#1:29,7\n*E\n"})
/* renamed from: Or5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC35047Or5<T> extends AbstractC39429ct4<T> {

    /* renamed from: g */
    public final C45168ma4<T> f27477g;

    /* renamed from: h */
    public int f27478h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC35047Or5(Context context) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        C45168ma4<T> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<T>()");
        this.f27477g = m25409g;
    }

    /* renamed from: E */
    public final C45168ma4<T> m91278E() {
        return this.f27477g;
    }

    /* renamed from: F */
    public final int m91277F() {
        return this.f27478h;
    }

    /* renamed from: H */
    public final void m91276H(T t) {
        this.f27477g.accept(t);
    }

    /* renamed from: J */
    public final void m91275J(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        int i = this.f27478h;
        Iterator<T> it = getItems().iterator();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(getId(it.next()), id)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i2);
        if (valueOf.intValue() >= 0) {
            z = true;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            this.f27478h = intValue;
            notifyItemChanged(i);
            notifyItemChanged(intValue);
        }
    }

    public abstract String getId(T t);
}
