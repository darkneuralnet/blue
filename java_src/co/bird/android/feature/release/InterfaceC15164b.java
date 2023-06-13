package co.bird.android.feature.release;

import android.app.Activity;
import co.bird.android.model.PhotoBannerViewModel;
import com.facebook.share.internal.C17296a;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
@Component(dependencies = {InterfaceC44393lG2.class})
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/release/b;", "", "Lco/bird/android/feature/release/ReleaseScanActivity;", "activity", "", C17296a.f69688o, "release_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.feature.release.b */
/* loaded from: classes3.dex */
public interface InterfaceC15164b {

    @Component.Factory
    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/release/b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/model/PhotoBannerViewModel;", "photoBannerViewModel", "Landroid/app/Activity;", "activity", "LDQ3;", "permissionManager", "Lco/bird/android/feature/release/b;", C17296a.f69688o, "release_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.release.b$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15165a {
        /* renamed from: a */
        InterfaceC15164b mo57613a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance PhotoBannerViewModel photoBannerViewModel, @BindsInstance Activity activity, @BindsInstance DQ3 dq3);
    }

    /* renamed from: a */
    void mo57614a(ReleaseScanActivity releaseScanActivity);
}
