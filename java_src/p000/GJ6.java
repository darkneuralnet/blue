package p000;

import android.view.View;
import android.widget.AdapterView;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u000b\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J4\u0010\u000e\u001a\u00020\n2,\u0010\r\u001a(\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\fJ\u0016\u0010\u000f\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J \u0010\u0011\u001a\u00020\n2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\n0\u0010R>\u0010\u0013\u001a*\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R*\u0010\u0016\u001a\u0016\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"LGJ6;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "Landroid/widget/AdapterView;", "p0", "Landroid/view/View;", "p1", "", "p2", "", "p3", "", "onItemSelected", "Lkotlin/Function4;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, C17296a.f69688o, "onNothingSelected", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function4;", "_onItemSelected", "c", "Lkotlin/jvm/functions/Function1;", "_onNothingSelected", "<init>", "()V", "extension_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: GJ6 */
/* loaded from: classes3.dex */
public final class GJ6 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    public Function4<? super AdapterView<?>, ? super View, ? super Integer, ? super Long, Unit> f11617b;

    /* renamed from: c */
    public Function1<? super AdapterView<?>, Unit> f11618c;

    /* renamed from: a */
    public final void m105404a(Function4<? super AdapterView<?>, ? super View, ? super Integer, ? super Long, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f11617b = listener;
    }

    /* renamed from: b */
    public final void m105403b(Function1<? super AdapterView<?>, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f11618c = listener;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        Function4<? super AdapterView<?>, ? super View, ? super Integer, ? super Long, Unit> function4 = this.f11617b;
        if (function4 != null) {
            function4.invoke(adapterView, view, Integer.valueOf(i), Long.valueOf(j));
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
        Function1<? super AdapterView<?>, Unit> function1 = this.f11618c;
        if (function1 != null) {
            function1.invoke(adapterView);
        }
    }
}
