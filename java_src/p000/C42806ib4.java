package p000;

import android.content.DialogInterface;
import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m28432d2 = {"Lib4;", "LxE;", "Lhb4;", "Lio/reactivex/Observable;", "", "doneClicks", "", "LH6;", "sections", "b", "dismiss", "Landroid/content/DialogInterface;", "Landroid/content/DialogInterface;", "dialog", "LE31;", "c", "LE31;", "binding", "LQa4;", DateTokenConverter.CONVERTER_KEY, "LQa4;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/content/DialogInterface;LE31;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ib4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42806ib4 extends AbstractC30071xE implements InterfaceC42213hb4 {

    /* renamed from: b */
    public final DialogInterface f87511b;

    /* renamed from: c */
    public final E31 f87512c;

    /* renamed from: d */
    public final C35361Qa4 f87513d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42806ib4(BaseActivity activity, DialogInterface dialog, E31 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f87511b = dialog;
        this.f87512c = binding;
        C35361Qa4 c35361Qa4 = new C35361Qa4();
        this.f87513d = c35361Qa4;
        binding.f6902e.setAdapter(c35361Qa4);
        binding.f6902e.setLayoutManager(new LinearLayoutManager(activity));
        binding.f6902e.setItemAnimator(new C11894g());
    }

    @Override // p000.InterfaceC42213hb4
    /* renamed from: b */
    public void mo33768b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f87513d.mo24871u(sections);
    }

    @Override // p000.InterfaceC42213hb4
    public void dismiss() {
        this.f87511b.dismiss();
    }

    @Override // p000.InterfaceC42213hb4
    public Observable<Unit> doneClicks() {
        Button button = this.f87512c.f6900c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.done");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }
}
