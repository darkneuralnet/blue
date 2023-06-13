package p000;

import android.app.Dialog;
import android.view.View;
import android.widget.ImageView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.material.snackbar.Snackbar;
import de.mateware.snacky.Snacky;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC24578y;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C39659dH2;
import p000.H31;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m28432d2 = {"LdH2;", "LxE;", "LbH2;", "Lcom/google/android/gms/common/GoogleApiAvailability;", "api", "", "resultCode", "", "Sf", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "m6", "Lio/reactivex/Observable;", "Mc", "Qg", "F8", "Lcom/google/android/material/snackbar/Snackbar;", "b", "Lcom/google/android/material/snackbar/Snackbar;", "errorSnackBar", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "logoImageView", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dH2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39659dH2 extends AbstractC30071xE implements InterfaceC38455bH2 {

    /* renamed from: b */
    public Snackbar f76377b;

    /* renamed from: c */
    public final ImageView f76378c;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/y;", "", "emitter", "b", "(Lio/reactivex/y;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: dH2$a */
    /* loaded from: classes2.dex */
    public static final class C19713a extends Lambda implements Function1<InterfaceC24578y<Unit>, Unit> {
        public C19713a() {
            super(1);
        }

        /* renamed from: c */
        public static final void m44442c(InterfaceC24578y emitter, View view) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            emitter.onNext(Unit.INSTANCE);
        }

        /* renamed from: b */
        public final void m44443b(final InterfaceC24578y<Unit> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            Snacky.builder().setView(C39659dH2.this.getActivity().findViewById(16908290)).setDuration(-2).setActionText(C45871nl4.error_generic_retry_action).setActionClickListener(new View.OnClickListener() { // from class: cH2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C39659dH2.C19713a.m44442c(InterfaceC24578y.this, view);
                }
            }).error().mo48864Y();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC24578y<Unit> interfaceC24578y) {
            m44443b(interfaceC24578y);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39659dH2(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f76378c = (ImageView) C40788fB0.m41779c(activity, C36585Vg4.app_logo);
    }

    @Override // p000.InterfaceC38455bH2
    /* renamed from: F8 */
    public Observable<Unit> mo44449F8() {
        return C45219mf5.m25214a(this.f76378c);
    }

    @Override // p000.InterfaceC38455bH2
    /* renamed from: Mc */
    public Observable<Unit> mo44448Mc() {
        return C45832nh5.m23307i(new C19713a());
    }

    @Override // p000.InterfaceC38455bH2
    /* renamed from: Qg */
    public void mo44447Qg() {
        Snackbar snackbar = this.f76377b;
        if (snackbar != null) {
            snackbar.mo48847x();
        }
    }

    @Override // p000.InterfaceC38455bH2
    /* renamed from: Sf */
    public void mo44446Sf(GoogleApiAvailability api, int i) {
        Intrinsics.checkNotNullParameter(api, "api");
        Dialog errorDialog = api.getErrorDialog(getActivity(), i, 291);
        if (errorDialog != null) {
            errorDialog.setCancelable(false);
        }
        if (errorDialog != null) {
            errorDialog.show();
        }
    }

    @Override // p000.InterfaceC38455bH2
    /* renamed from: m6 */
    public AbstractC23442F<DialogResponse> mo44445m6() {
        return H31.C3014a.dialog$default(this, AU2.f624d, false, false, 4, null);
    }
}
