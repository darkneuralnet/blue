package androidx.camera.view;

import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.C11243o;
import androidx.camera.view.PreviewView;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
/* renamed from: androidx.camera.view.c */
/* loaded from: classes.dex */
public abstract class AbstractC11275c {

    /* renamed from: a */
    public Size f52883a;

    /* renamed from: b */
    public FrameLayout f52884b;

    /* renamed from: c */
    public final C11273b f52885c;

    /* renamed from: d */
    public boolean f52886d = false;

    /* renamed from: androidx.camera.view.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC11276a {
        /* renamed from: a */
        void mo28009a();
    }

    public AbstractC11275c(FrameLayout frameLayout, C11273b c11273b) {
        this.f52884b = frameLayout;
        this.f52885c = c11273b;
    }

    /* renamed from: a */
    public abstract View mo68919a();

    /* renamed from: b */
    public abstract void mo68918b();

    /* renamed from: c */
    public abstract void mo68917c();

    /* renamed from: d */
    public void m68932d() {
        this.f52886d = true;
        m68931f();
    }

    /* renamed from: e */
    public abstract void mo68916e(C11243o c11243o, InterfaceC11276a interfaceC11276a);

    /* renamed from: f */
    public void m68931f() {
        View mo68919a = mo68919a();
        if (mo68919a != null && this.f52886d) {
            this.f52885c.m68933q(new Size(this.f52884b.getWidth(), this.f52884b.getHeight()), this.f52884b.getLayoutDirection(), mo68919a);
        }
    }

    /* renamed from: g */
    public abstract void mo68915g(Executor executor, PreviewView.InterfaceC11266e interfaceC11266e);

    /* renamed from: h */
    public abstract ListenableFuture<Void> mo68914h();
}
