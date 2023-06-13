package co.bird.android.feature.rideendsummary;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.RetakeablePhotoView;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
@Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC39569d75.class})
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/rideendsummary/f;", "", "Lco/bird/android/feature/rideendsummary/RideSummaryActivity;", "activity", "", C17296a.f69688o, "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.feature.rideendsummary.f */
/* loaded from: classes3.dex */
public interface InterfaceC15290f {

    @Component.Factory
    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JV\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/feature/rideendsummary/f$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/widget/RetakeablePhotoView;", "retakeablePhotoView", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/lifecycle/f;", "lifecycle", "LR5;", "binding", "LEO4;", "reviewManager", "Lco/bird/android/feature/rideendsummary/f;", C17296a.f69688o, "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rideendsummary.f$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15291a {
        /* renamed from: a */
        InterfaceC15290f mo57441a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance RetakeablePhotoView retakeablePhotoView, @BindsInstance FragmentManager fragmentManager, @BindsInstance AbstractC11719f abstractC11719f, @BindsInstance C7063R5 c7063r5, @BindsInstance EO4 eo4);
    }

    /* renamed from: a */
    void mo57442a(RideSummaryActivity rideSummaryActivity);
}
