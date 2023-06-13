package p000;

import android.app.Application;
import com.facebook.share.internal.C17296a;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\b\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000b\u001a\u00020\nJ/\u0010\f\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H$¢\u0006\u0004\b\f\u0010\tR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LAk1;", "T", "", "Landroid/app/Application;", "application", "", "", "extras", "b", "(Landroid/app/Application;Ljava/util/Map;)Ljava/lang/Object;", "", C17296a.f69688o, "instantiateComponent", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "component", "<init>", "()V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFeatureComponentHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureComponentHolder.kt\nco/bird/android/coreinterface/FeatureComponentHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
/* renamed from: Ak1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC31704Ak1<T> {

    /* renamed from: a */
    public WeakReference<T> f1003a;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object component$default(AbstractC31704Ak1 abstractC31704Ak1, Application application, Map map, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                map = null;
            }
            return abstractC31704Ak1.m115328b(application, map);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: component");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object instantiateComponent$default(AbstractC31704Ak1 abstractC31704Ak1, Application application, Map map, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                map = null;
            }
            return abstractC31704Ak1.instantiateComponent(application, map);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: instantiateComponent");
    }

    /* renamed from: a */
    public final void m115329a() {
        this.f1003a = null;
    }

    /* renamed from: b */
    public final T m115328b(Application application, Map<String, ? extends Object> map) {
        T t;
        Intrinsics.checkNotNullParameter(application, "application");
        WeakReference<T> weakReference = this.f1003a;
        if (weakReference == null || (t = weakReference.get()) == null) {
            T instantiateComponent = instantiateComponent(application, map);
            this.f1003a = new WeakReference<>(instantiateComponent);
            return instantiateComponent;
        }
        return t;
    }

    public abstract T instantiateComponent(Application application, Map<String, ? extends Object> map);
}
