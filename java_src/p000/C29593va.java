package p000;

import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.analytics.AnalyticsDebugEvent;
import com.facebook.share.internal.C17296a;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\n\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007H\u0016R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m28432d2 = {"Lva;", "Lua;", "", "Lco/bird/android/model/analytics/AnalyticsDebugEvent;", "analyticsEvents", "", C17296a.f69688o, "Lio/reactivex/subjects/d;", "", "kotlin.jvm.PlatformType", "b", "Lla;", "Lla;", "getAdapter", "()Lla;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LQ2;", "binding", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LQ2;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: va */
/* loaded from: classes2.dex */
public final class C29593va implements InterfaceC29255ua {

    /* renamed from: a */
    public final C25719la f114291a;

    public C29593va(BaseActivity activity, C6646Q2 binding) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        C25719la c25719la = new C25719la(activity);
        this.f114291a = c25719la;
        binding.f29712b.setLayoutManager(new LinearLayoutManager(activity));
        binding.f29712b.setAdapter(c25719la);
    }

    @Override // p000.InterfaceC29255ua
    /* renamed from: a */
    public void mo8440a(List<AnalyticsDebugEvent> analyticsEvents) {
        Intrinsics.checkNotNullParameter(analyticsEvents, "analyticsEvents");
        this.f114291a.m44899C(analyticsEvents);
        this.f114291a.notifyDataSetChanged();
    }

    @Override // p000.InterfaceC29255ua
    /* renamed from: b */
    public C24558d<Integer> analyticsEventClicks() {
        return this.f114291a.m27146E();
    }
}
