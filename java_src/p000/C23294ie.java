package p000;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Lie;", "LOr6;", "Landroid/app/Application;", "T", "getApplication", "()Landroid/app/Application;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "lifecycle-viewmodel_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ie */
/* loaded from: classes.dex */
public class C23294ie extends AbstractC35048Or6 {
    private final Application application;

    public C23294ie(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
    }

    public <T extends Application> T getApplication() {
        T t = (T) this.application;
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t;
    }
}
