package p000;

import android.app.ProgressDialog;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import io.reactivex.Observable;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b \u0010!J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, m28432d2 = {"LR30;", "LxE;", "Lio/reactivex/Observable;", "", "Pl", "", "c", "", "show", "Sl", "Ljava/io/File;", "file", "Ql", "Rl", "Tl", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", "screenshot", "Landroid/widget/EditText;", "Landroid/widget/EditText;", "description", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "submit", "Landroid/app/ProgressDialog;", "e", "Landroid/app/ProgressDialog;", "progressDialog", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/ImageView;Landroid/widget/EditText;Landroid/widget/Button;)V", "shaketoreport_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: R30 */
/* loaded from: classes3.dex */
public final class R30 extends AbstractC30071xE {

    /* renamed from: b */
    public final ImageView f31445b;

    /* renamed from: c */
    public final EditText f31446c;

    /* renamed from: d */
    public final Button f31447d;

    /* renamed from: e */
    public ProgressDialog f31448e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R30(BaseActivity activity, ImageView screenshot, EditText description, Button submit) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(submit, "submit");
        this.f31445b = screenshot;
        this.f31446c = description;
        this.f31447d = submit;
    }

    /* renamed from: Pl */
    public final Observable<CharSequence> m87380Pl() {
        return C40475ef5.m42643d(this.f31446c);
    }

    /* renamed from: Ql */
    public final void m87379Ql(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        C47971rI4<Drawable> m81655i = ComponentCallbacks2C17096a.m53136v(getActivity()).m81655i(file);
        YI4 yi4 = new YI4();
        yi4.m97533x0(true);
        yi4.m97554k(B41.f1616b);
        m81655i.mo16086d(yi4).m16096R0(this.f31445b);
    }

    /* renamed from: Rl */
    public final void m87378Rl() {
        error(getActivity().getString(C45871nl4.shake_to_report_error_writing_network_logs));
    }

    /* renamed from: Sl */
    public final void m87377Sl(boolean z) {
        ProgressDialog progressDialog;
        if (z) {
            progressDialog = new ProgressDialog(getActivity());
            progressDialog.setMessage(getActivity().getString(C45871nl4.shake_to_report_toast_writing_network_logs));
            progressDialog.setProgressStyle(0);
            progressDialog.show();
        } else {
            ProgressDialog progressDialog2 = this.f31448e;
            if (progressDialog2 != null) {
                progressDialog2.dismiss();
            }
            progressDialog = null;
        }
        this.f31448e = progressDialog;
    }

    /* renamed from: Tl */
    public final void m87376Tl() {
        Toast.makeText(getActivity(), getActivity().getString(C45871nl4.shake_to_report_sent), 0);
    }

    /* renamed from: c */
    public final Observable<Unit> m87375c() {
        return C44626lf5.clicksThrottle$default(this.f31447d, 0L, 1, null);
    }
}
