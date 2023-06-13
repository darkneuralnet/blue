package p000;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.C11939n;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003J\u0014\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\rR\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, m28432d2 = {"Lpz2;", "T", "LxE;", "", "title", "", "setTitle", "", "windows", "Rl", "", "id", "Ql", "Lio/reactivex/Observable;", "Pl", "", "show", "Sl", "J8", "LLC2;", "b", "LLC2;", "binding", "LOr5;", "c", "LOr5;", "adapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", DateTokenConverter.CONVERTER_KEY, "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LLC2;LOr5;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLongTermRentalListSelectionUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalListSelectionUi.kt\nco/bird/android/app/feature/longterm/LongTermRentalListSelectionUi\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n350#2,7:55\n*S KotlinDebug\n*F\n+ 1 LongTermRentalListSelectionUi.kt\nco/bird/android/app/feature/longterm/LongTermRentalListSelectionUi\n*L\n41#1:55,7\n*E\n"})
/* renamed from: pz2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47195pz2<T> extends AbstractC30071xE {

    /* renamed from: b */
    public final LC2 f104447b;

    /* renamed from: c */
    public final AbstractC35047Or5<T> f104448c;

    /* renamed from: d */
    public final LinearLayoutManager f104449d;

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, m28432d2 = {"pz2$a", "Landroidx/recyclerview/widget/n;", "", "getVerticalSnapPreference", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pz2$a */
    /* loaded from: classes2.dex */
    public static final class C27447a extends C11939n {
        public C27447a(BaseActivity baseActivity) {
            super(baseActivity);
        }

        @Override // androidx.recyclerview.widget.C11939n
        public int getVerticalSnapPreference() {
            return 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47195pz2(BaseActivity activity, LC2 binding, AbstractC35047Or5<T> adapter) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f104447b = binding;
        this.f104448c = adapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
        this.f104449d = linearLayoutManager;
        binding.f20891c.setLayoutManager(linearLayoutManager);
        binding.f20891c.setItemAnimator(new C11894g());
        binding.f20891c.setAdapter(adapter);
    }

    /* renamed from: J8 */
    public final Observable<Unit> m18356J8() {
        Button button = this.f104447b.f20890b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.learnMore");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Pl */
    public final Observable<T> m18355Pl() {
        return this.f104448c.m91278E();
    }

    /* renamed from: Ql */
    public final void m18354Ql(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f104448c.m91275J(id);
        C27447a c27447a = new C27447a(getActivity());
        Iterator<T> it = this.f104448c.getItems().iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(this.f104448c.getId(it.next()), id)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        c27447a.setTargetPosition(i);
        this.f104449d.m66598b2(c27447a);
    }

    /* renamed from: Rl */
    public final void m18353Rl(List<? extends T> windows) {
        Intrinsics.checkNotNullParameter(windows, "windows");
        this.f104448c.m44899C(windows);
    }

    /* renamed from: Sl */
    public final void m18352Sl(boolean z) {
        Button button = this.f104447b.f20890b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.learnMore");
        C49520tu6.show$default(button, z, 0, 2, null);
        View view = this.f104447b.f20894f;
        Intrinsics.checkNotNullExpressionValue(view, "binding.separator");
        C49520tu6.show$default(view, z, 0, 2, null);
    }

    public final void setTitle(int i) {
        this.f104447b.f20892d.setText(getActivity().getString(i));
    }
}
