package p000;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.buava.Optional;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.jakewharton.processphoenix.ProcessPhoenix;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC36709Vu2;
@Metadata(m28433d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001=B\u0007¢\u0006\u0004\b:\u0010;J&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0016J\u001a\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00170\u0013H\u0016J\u001c\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00170\u0013H\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u0013H\u0016R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006>"}, m28432d2 = {"LTu2;", "Lhc5;", "Ldv2;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Lio/reactivex/h;", "T0", "Lev2;", TransferTable.COLUMN_STATE, "t8", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "", "y5", "Lkotlin/Pair;", "LfN1;", "", "I7", "", "j8", "H0", "Landroid/content/Intent;", "e", "Landroid/content/Intent;", "a5", "()Landroid/content/Intent;", "setMainActivityIntent", "(Landroid/content/Intent;)V", "mainActivityIntent", "Lbv2;", "f", "Lbv2;", "N6", "()Lbv2;", "setPresenter", "(Lbv2;)V", "presenter", "LQZ;", "g", "LQZ;", "binding", "LRu2;", "h", "LRu2;", "adapter", "LWu2;", "i", "LWu2;", "converter", "<init>", "()V", "j", C17296a.f69688o, "co.bird.android.feature.localhost"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLocalHostBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalHostBottomSheet.kt\nco/bird/android/feature/localhost/LocalHostBottomSheet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,87:1\n1#2:88\n64#3:89\n*S KotlinDebug\n*F\n+ 1 LocalHostBottomSheet.kt\nco/bird/android/feature/localhost/LocalHostBottomSheet\n*L\n60#1:89\n*E\n"})
/* renamed from: Tu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36241Tu2 extends AbstractC42224hc5 implements InterfaceC40039dv2 {

    /* renamed from: j */
    public static final C8145a f36431j = new C8145a(null);

    /* renamed from: e */
    public Intent f36432e;

    /* renamed from: f */
    public C38836bv2 f36433f;

    /* renamed from: g */
    public C6799QZ f36434g;

    /* renamed from: h */
    public final C35773Ru2 f36435h = new C35773Ru2();

    /* renamed from: i */
    public final C36943Wu2 f36436i = new C36943Wu2();

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LTu2$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.feature.localhost"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Tu2$a */
    /* loaded from: classes3.dex */
    public static final class C8145a {
        public /* synthetic */ C8145a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C8145a() {
        }
    }

    @Override // p000.InterfaceC40039dv2
    /* renamed from: H0 */
    public Observable<Unit> mo43505H0() {
        C6799QZ c6799qz = this.f36434g;
        if (c6799qz == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6799qz = null;
        }
        Button button = c6799qz.f30521b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.apply");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC40039dv2
    /* renamed from: I7 */
    public Observable<Pair<EnumC40897fN1, Boolean>> mo43504I7() {
        return this.f36435h.m86240I7();
    }

    /* renamed from: N6 */
    public final C38836bv2 m82276N6() {
        C38836bv2 c38836bv2 = this.f36433f;
        if (c38836bv2 != null) {
            return c38836bv2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // com.uber.autodispose.ScopeProvider
    /* renamed from: T0 */
    public InterfaceC23496h mo231T0() {
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        InterfaceC23496h mo231T0 = m45195i.mo231T0();
        Intrinsics.checkNotNullExpressionValue(mo231T0, "scope(FragmentLifecycleResolver).requestScope()");
        return mo231T0;
    }

    /* renamed from: a5 */
    public final Intent m82275a5() {
        Intent intent = this.f36432e;
        if (intent != null) {
            return intent;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainActivityIntent");
        return null;
    }

    @Override // p000.InterfaceC40039dv2
    /* renamed from: j8 */
    public Observable<Pair<EnumC40897fN1, Integer>> mo43503j8() {
        return this.f36435h.m86239j8();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C6799QZ it = C6799QZ.m88403c(getLayoutInflater(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this.f36434g = it;
        return it.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        InterfaceC36709Vu2.InterfaceC8812a m86841a = RL0.m86841a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = activity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        m86841a.mo79243a(c46172oG2.m21419a(application)).mo79244a(this);
        C6799QZ c6799qz = this.f36434g;
        C6799QZ c6799qz2 = null;
        if (c6799qz == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6799qz = null;
        }
        c6799qz.f30523d.setAdapter(this.f36435h);
        C6799QZ c6799qz3 = this.f36434g;
        if (c6799qz3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6799qz3 = null;
        }
        c6799qz3.f30523d.setLayoutManager(new LinearLayoutManager(activity));
        C6799QZ c6799qz4 = this.f36434g;
        if (c6799qz4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c6799qz2 = c6799qz4;
        }
        c6799qz2.f30523d.setItemAnimator(new C11894g());
        m82276N6().consume(this);
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: t8 */
    public void render(InterfaceC40632ev2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        boolean z = false;
        if (state instanceof C36101Te6) {
            this.f36435h.mo24871u(this.f36436i.m77719a(state.mo20529a(), state.mo20528b(), state.mo20527c()));
            C6799QZ c6799qz = this.f36434g;
            if (c6799qz == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6799qz = null;
            }
            Button button = c6799qz.f30521b;
            if (state.mo20529a() != null) {
                z = true;
            }
            button.setEnabled(z);
        } else if (state instanceof C27056om) {
            Thread.sleep(500L);
            m82275a5().setFlags(268468224);
            ProcessPhoenix.m45924b(getContext(), m82275a5());
        }
    }

    @Override // p000.InterfaceC40039dv2
    /* renamed from: y5 */
    public Observable<Optional<String>> mo43502y5() {
        return this.f36435h.m86238y5();
    }
}
