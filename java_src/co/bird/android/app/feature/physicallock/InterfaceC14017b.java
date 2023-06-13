package co.bird.android.app.feature.physicallock;

import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
@Component(dependencies = {InterfaceC44393lG2.class}, modules = {FS3.class})
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/b;", "", "Lco/bird/android/app/feature/physicallock/PhysicalLockActivity;", "activity", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.physicallock.b */
/* loaded from: classes2.dex */
public interface InterfaceC14017b {

    @Component.Factory
    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J2\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\r"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/b$a;", "", "LlG2;", "mainComponent", "LFS3;", "module", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", Action.SCOPE_ATTRIBUTE, "Lco/bird/android/app/feature/physicallock/b;", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.b$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC14018a {
        /* renamed from: a */
        InterfaceC14017b mo60170a(InterfaceC44393lG2 interfaceC44393lG2, FS3 fs3, @BindsInstance BaseActivity baseActivity, @BindsInstance LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider);
    }

    /* renamed from: a */
    void mo60171a(PhysicalLockActivity physicalLockActivity);
}
