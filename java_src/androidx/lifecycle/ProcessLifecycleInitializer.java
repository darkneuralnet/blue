package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.C11736n;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u00070\u0006H\u0016¨\u0006\u000b"}, m28432d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "LE22;", "LLifecycleOwner;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, C17296a.f69688o, "", "Ljava/lang/Class;", "dependencies", "<init>", "()V", "lifecycle-process_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements E22<LifecycleOwner> {
    @Override // p000.E22
    /* renamed from: a */
    public LifecycleOwner create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C19846dj m43856e = C19846dj.m43856e(context);
        Intrinsics.checkNotNullExpressionValue(m43856e, "getInstance(context)");
        if (m43856e.m43854g(ProcessLifecycleInitializer.class)) {
            C11726h.m67009a(context);
            C11736n.C11738b c11738b = C11736n.f54943j;
            c11738b.m66964b(context);
            return c11738b.m66965a();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }

    @Override // p000.E22
    public List<Class<? extends E22<?>>> dependencies() {
        List<Class<? extends E22<?>>> emptyList;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }
}
