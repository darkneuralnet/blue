package p000;

import android.content.DialogInterface;
import android.widget.Button;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.Issue;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LvE6;", "LsE6;", "Lco/bird/android/model/Issue;", "issue", "", C17296a.f69688o, "Lio/reactivex/Observable;", "Lco/bird/android/model/DialogResponse;", "B1", "dismiss", "Lco/bird/android/core/mvp/BaseActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Landroid/content/DialogInterface;", "b", "Landroid/content/DialogInterface;", "dialog", "Lu31;", "c", "Lu31;", "binding", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/content/DialogInterface;Lu31;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vE6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50307vE6 implements InterfaceC48529sE6 {

    /* renamed from: a */
    public final BaseActivity f113730a;

    /* renamed from: b */
    public final DialogInterface f113731b;

    /* renamed from: c */
    public final C49604u31 f113732c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/DialogResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vE6$a */
    /* loaded from: classes3.dex */
    public static final class C29458a extends Lambda implements Function1<Unit, DialogResponse> {

        /* renamed from: g */
        public static final C29458a f113733g = new C29458a();

        public C29458a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DialogResponse invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return DialogResponse.OK;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/DialogResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vE6$b */
    /* loaded from: classes3.dex */
    public static final class C29459b extends Lambda implements Function1<Unit, DialogResponse> {

        /* renamed from: g */
        public static final C29459b f113734g = new C29459b();

        public C29459b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DialogResponse invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return DialogResponse.CANCEL;
        }
    }

    public C50307vE6(BaseActivity activity, DialogInterface dialog, C49604u31 binding) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f113730a = activity;
        this.f113731b = dialog;
        this.f113732c = binding;
    }

    /* renamed from: d */
    public static final DialogResponse m8977d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DialogResponse) tmp0.invoke(obj);
    }

    /* renamed from: e */
    public static final DialogResponse m8976e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DialogResponse) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC48529sE6
    /* renamed from: B1 */
    public Observable<DialogResponse> mo8981B1() {
        Button button = this.f113732c.f111627e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.noRepairNeeded");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
        final C29458a c29458a = C29458a.f113733g;
        Observable map = clicksThrottle$default.map(new InterfaceC23492o() { // from class: tE6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                DialogResponse m8977d;
                m8977d = C50307vE6.m8977d(Function1.this, obj);
                return m8977d;
            }
        });
        Button button2 = this.f113732c.f111624b;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.cancel");
        Observable clicksThrottle$default2 = C44626lf5.clicksThrottle$default(button2, 0L, 1, null);
        final C29459b c29459b = C29459b.f113734g;
        Observable<DialogResponse> merge = Observable.merge(map, clicksThrottle$default2.map(new InterfaceC23492o() { // from class: uE6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                DialogResponse m8976e;
                m8976e = C50307vE6.m8976e(Function1.this, obj);
                return m8976e;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      binding.noR…ogResponse.CANCEL }\n    )");
        return merge;
    }

    @Override // p000.InterfaceC48529sE6
    /* renamed from: a */
    public void mo8980a(Issue issue) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        this.f113732c.f111626d.setText(this.f113730a.getString(C45871nl4.work_order_inspection_dispute_issue_format, issue.getDisplay()));
    }

    @Override // p000.InterfaceC48529sE6
    public void dismiss() {
        this.f113731b.dismiss();
    }
}
