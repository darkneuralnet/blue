package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.library.flow.FlowActivity;
import co.bird.android.model.wire.WirePhysicalLockTutorialStep;
import io.reactivex.Observable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096\u0001J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096\u0001J\u0017\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096\u0001J\u0011\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0001J\u0006\u0010\u0013\u001a\u00020\u0005J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00050\u00050\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006!"}, m28432d2 = {"Lt65;", "LdT3;", "", "l4", "Lio/reactivex/Observable;", "", "r0", "u", "", "Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;", "steps", "Je", "position", "N3", "titleRes", "setTitle", "", "show", "Q4", "c", "b", "Lco/bird/android/library/flow/FlowActivity;", "Lco/bird/android/library/flow/FlowActivity;", "flowActivity", "Lma4;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lma4;", "faqButtonClicks", "LUS3;", "binding", "<init>", "(Lco/bird/android/library/flow/FlowActivity;LUS3;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: t65  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49045t65 implements InterfaceC39768dT3 {

    /* renamed from: b */
    public final FlowActivity f109872b;

    /* renamed from: c */
    public final /* synthetic */ C40360eT3 f109873c;

    /* renamed from: d */
    public final C45168ma4<Unit> f109874d;

    public C49045t65(FlowActivity flowActivity, US3 binding) {
        Intrinsics.checkNotNullParameter(flowActivity, "flowActivity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f109872b = flowActivity;
        this.f109873c = new C40360eT3(flowActivity, binding);
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f109874d = m25409g;
    }

    /* renamed from: d */
    public static final void m13061d(C49045t65 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f109874d.accept(Unit.INSTANCE);
    }

    @Override // p000.InterfaceC39768dT3
    /* renamed from: Je */
    public void mo13067Je(List<WirePhysicalLockTutorialStep> steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f109873c.mo13067Je(steps);
    }

    @Override // p000.InterfaceC39768dT3
    /* renamed from: N3 */
    public void mo13066N3(int i) {
        this.f109873c.mo13066N3(i);
    }

    @Override // p000.InterfaceC39768dT3
    /* renamed from: Q4 */
    public void mo13065Q4(boolean z) {
        this.f109873c.mo13065Q4(z);
    }

    /* renamed from: b */
    public final Observable<Unit> m13063b() {
        Observable<Unit> throttleFirst = this.f109874d.throttleFirst(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(throttleFirst, "faqButtonClicks.throttle…0, TimeUnit.MILLISECONDS)");
        return throttleFirst;
    }

    /* renamed from: c */
    public final void m13062c() {
        View inflate = LayoutInflater.from(this.f109872b).inflate(C45268mk4.menu_text_item, (ViewGroup) null);
        Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        textView.setText(this.f109872b.getResources().getString(C45871nl4.menu_faq));
        textView.setOnClickListener(new View.OnClickListener() { // from class: s65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C49045t65.m13061d(C49045t65.this, view);
            }
        });
        this.f109872b.setCustomNavView(textView);
    }

    @Override // p000.InterfaceC39768dT3
    /* renamed from: l4 */
    public int mo13060l4() {
        return this.f109873c.mo13060l4();
    }

    @Override // p000.InterfaceC39768dT3
    /* renamed from: r0 */
    public Observable<Unit> mo13059r0() {
        return this.f109873c.mo13059r0();
    }

    @Override // p000.InterfaceC39768dT3
    public void setTitle(int i) {
        this.f109873c.setTitle(i);
    }

    @Override // p000.InterfaceC39768dT3
    /* renamed from: u */
    public Observable<Unit> mo13058u() {
        return this.f109873c.mo13058u();
    }
}
