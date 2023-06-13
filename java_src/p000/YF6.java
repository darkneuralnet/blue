package p000;

import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.android.schedulers.C23454a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LYF6;", "LXF6;", "", "LH6;", "sections", "", "b", "Lio/reactivex/k;", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "dismiss", "LHy1;", "LHy1;", "binding", "Lni;", "Lni;", "dialogFragment", "LHF6;", "c", "LHF6;", "adapter", "<init>", "(LHy1;Lni;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: YF6 */
/* loaded from: classes3.dex */
public final class YF6 implements XF6 {

    /* renamed from: a */
    public final C33468Hy1 f44916a;

    /* renamed from: b */
    public final C26572ni f44917b;

    /* renamed from: c */
    public final HF6 f44918c;

    public YF6(C33468Hy1 binding, C26572ni dialogFragment) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(dialogFragment, "dialogFragment");
        this.f44916a = binding;
        this.f44917b = dialogFragment;
        HF6 hf6 = new HF6();
        this.f44918c = hf6;
        binding.f14255e.setLayoutManager(new LinearLayoutManager(dialogFragment.getContext()));
        binding.f14255e.setItemAnimator(new C11894g());
        binding.f14255e.setAdapter(hf6);
    }

    @Override // p000.XF6
    /* renamed from: a */
    public AbstractC24490k<Unit> mo75293a() {
        Button button = this.f44916a.f14254d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.proceedButton");
        AbstractC24490k<Unit> m32108t0 = C44626lf5.clicksThrottle$default(button, 0L, 1, null).toFlowable(EnumC23460b.DROP).m32108t0(C23454a.m33087a(), false, 1);
        Intrinsics.checkNotNullExpressionValue(m32108t0, "binding.proceedButton.cl…s.mainThread(), false, 1)");
        return m32108t0;
    }

    @Override // p000.XF6
    /* renamed from: b */
    public void mo75292b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f44918c.mo24871u(sections);
    }

    @Override // p000.XF6
    /* renamed from: d */
    public AbstractC24490k<Unit> mo75291d() {
        Button button = this.f44916a.f14252b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.cancelButton");
        AbstractC24490k<Unit> m32108t0 = C44626lf5.clicksThrottle$default(button, 0L, 1, null).toFlowable(EnumC23460b.DROP).m32108t0(C23454a.m33087a(), false, 1);
        Intrinsics.checkNotNullExpressionValue(m32108t0, "binding.cancelButton.cli…s.mainThread(), false, 1)");
        return m32108t0;
    }

    @Override // p000.XF6
    public void dismiss() {
        this.f44917b.dismiss();
    }
}
