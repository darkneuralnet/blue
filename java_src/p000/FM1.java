package p000;

import android.content.DialogInterface;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.nestedstructures.HibernationMessage;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.C53094zw3;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001!B!\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006J\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u00070\u0006J\u0014\u0010\u0010\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u0011\u001a\u00020\u0004J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\tH\u0002R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\""}, m28432d2 = {"LFM1;", "LjE;", "", "enabled", "", "gm", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "", "Bm", "Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;", "Cm", "", "LH6;", "sections", "b", "Em", "message", "Dm", "LdM1;", "q", "LdM1;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lf00;", "binding", "Landroid/content/DialogInterface;", "dialog", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lf00;Landroid/content/DialogInterface;)V", "r", C17296a.f69688o, "hibernation-scan_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FM1 */
/* loaded from: classes3.dex */
public final class FM1 extends C24739jE {

    /* renamed from: r */
    public static final C2230a f9236r = new C2230a(null);

    /* renamed from: q */
    public final C39703dM1 f9237q;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LFM1$a;", "", "", "PEEK_HEIGHT_DP", "I", "<init>", "()V", "hibernation-scan_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: FM1$a */
    /* loaded from: classes3.dex */
    public static final class C2230a {
        public /* synthetic */ C2230a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2230a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FM1(BaseActivity activity, C40679f00 binding, DialogInterface dialog) {
        super(activity, binding, dialog);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        C39703dM1 c39703dM1 = new C39703dM1();
        this.f9237q = c39703dM1;
        mo86379gm(true);
        m86366sm(false);
        m86365tm(true);
        binding.f79260c.setText(activity.getString(C45871nl4.general_done));
        RecyclerView _init_$lambda$0 = binding.f79266i;
        Intrinsics.checkNotNullExpressionValue(_init_$lambda$0, "_init_$lambda$0");
        C49520tu6.show$default(_init_$lambda$0, true, 0, 2, null);
        _init_$lambda$0.setLayoutManager(new LinearLayoutManager(activity));
        _init_$lambda$0.setItemAnimator(new C11894g());
        _init_$lambda$0.setAdapter(c39703dM1);
    }

    /* renamed from: Bm */
    public final Observable<Pair<Bird, String>> m107289Bm() {
        return this.f9237q.m44357v();
    }

    /* renamed from: Cm */
    public final Observable<Pair<Bird, HibernationMessage>> m107288Cm() {
        return this.f9237q.m44358g0();
    }

    /* renamed from: Dm */
    public final void m107287Dm(String str) {
        C53094zw3.C31593a.makeText$default(C53094zw3.f122502a, getActivity(), str, 1, 48, null, 16, null).show();
    }

    /* renamed from: Em */
    public final void m107286Em() {
        String string = getActivity().getString(C45871nl4.hibernation_batch_copied_toast);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…ation_batch_copied_toast)");
        m107287Dm(string);
    }

    /* renamed from: b */
    public final void m107285b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f9237q.mo24871u(sections);
    }

    @Override // p000.C35686Rk5
    /* renamed from: gm */
    public void mo86379gm(boolean z) {
        int i;
        if (z) {
            i = (int) C49347td3.m12002a(126, getActivity());
        } else {
            i = 0;
        }
        m86368qm(i);
        super.mo86379gm(z);
    }
}
