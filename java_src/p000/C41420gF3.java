package p000;

import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J-\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0016R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m28432d2 = {"LgF3;", "LxE;", "LfF3;", "", "show", "", "Ah", "", "title", "", "", "formatArgs", "hh", "(I[Ljava/lang/Object;)V", "ji", "U3", "Lio/reactivex/Observable;", "e", "LH4;", "b", "LH4;", "binding", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LH4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gF3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41420gF3 extends AbstractC30071xE implements InterfaceC40827fF3 {

    /* renamed from: b */
    public final C3020H4 f81847b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41420gF3(BaseActivity activity, C3020H4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f81847b = binding;
    }

    @Override // p000.InterfaceC40827fF3
    /* renamed from: Ah */
    public void mo39788Ah(boolean z) {
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70245B(z);
        }
        ActionBar supportActionBar2 = getActivity().getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.mo70212v(z);
        }
        ActionBar supportActionBar3 = getActivity().getSupportActionBar();
        if (supportActionBar3 != null) {
            supportActionBar3.mo70210x(z);
        }
    }

    @Override // p000.InterfaceC40827fF3
    /* renamed from: U3 */
    public void mo39787U3(int i) {
        this.f81847b.f12796b.setText(getString(i, new Object[0]));
    }

    @Override // p000.InterfaceC40827fF3
    /* renamed from: e */
    public Observable<Unit> mo39786e() {
        Button button = this.f81847b.f12796b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.button");
        return C45219mf5.m25214a(button);
    }

    @Override // p000.InterfaceC40827fF3
    /* renamed from: hh */
    public void mo39785hh(int i, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        this.f81847b.f12800f.setText(getString(i, Arrays.copyOf(formatArgs, formatArgs.length)));
    }

    @Override // p000.InterfaceC40827fF3
    /* renamed from: ji */
    public void mo39784ji(int i, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        this.f81847b.f12798d.setText(getString(i, Arrays.copyOf(formatArgs, formatArgs.length)));
    }
}
