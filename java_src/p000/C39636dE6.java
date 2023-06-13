package p000;

import android.content.DialogInterface;
import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"LdE6;", "LcE6;", "Lio/reactivex/Observable;", "", "doneClicks", "", "LH6;", "sections", "b", "dismiss", "Lco/bird/android/core/mvp/BaseActivity;", C17296a.f69688o, "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Landroid/content/DialogInterface;", "Landroid/content/DialogInterface;", "dialog", "Lt31;", "c", "Lt31;", "binding", "LQD6;", DateTokenConverter.CONVERTER_KEY, "LQD6;", "adapter", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/content/DialogInterface;Lt31;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dE6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39636dE6 implements InterfaceC39025cE6 {

    /* renamed from: a */
    public final BaseActivity f76304a;

    /* renamed from: b */
    public final DialogInterface f76305b;

    /* renamed from: c */
    public final C49011t31 f76306c;

    /* renamed from: d */
    public final QD6 f76307d;

    public C39636dE6(BaseActivity activity, DialogInterface dialog, C49011t31 binding) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f76304a = activity;
        this.f76305b = dialog;
        this.f76306c = binding;
        QD6 qd6 = new QD6();
        this.f76307d = qd6;
        binding.f109776d.setAdapter(qd6);
        binding.f109776d.setLayoutManager(new LinearLayoutManager(activity));
        binding.f109776d.setItemAnimator(new C11894g());
    }

    @Override // p000.InterfaceC39025cE6
    /* renamed from: b */
    public void mo44497b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f76307d.mo24871u(sections);
    }

    @Override // p000.InterfaceC39025cE6
    public void dismiss() {
        this.f76305b.dismiss();
    }

    @Override // p000.InterfaceC39025cE6
    public Observable<Unit> doneClicks() {
        Button button = this.f76306c.f109775c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.done");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }
}
