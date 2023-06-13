package p000;

import android.webkit.WebView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H&J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H&J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H&J\b\u0010\u0017\u001a\u00020\u0004H&J\b\u0010\u0018\u001a\u00020\u0004H&J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H&¨\u0006\u001a"}, m28432d2 = {"Lev0;", "", "", "config", "", "F", "Landroid/webkit/WebView$FindListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "A", "Lio/reactivex/Observable;", "LX26;", "y", "v", "u", "w", Entry.TYPE_TEXT, "B", "", "shown", "x", "D", "forward", "E", "z", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "t", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ev0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC40630ev0 {
    /* renamed from: A */
    void mo40556A(WebView.FindListener findListener);

    /* renamed from: B */
    void mo40555B(String str);

    /* renamed from: C */
    void mo40554C();

    /* renamed from: D */
    void mo40553D(String str);

    /* renamed from: E */
    void mo40552E(boolean z);

    /* renamed from: F */
    void mo40551F(String str);

    /* renamed from: t */
    void mo40550t(String str);

    /* renamed from: u */
    Observable<Unit> mo40549u();

    /* renamed from: v */
    Observable<Unit> mo40548v();

    /* renamed from: w */
    Observable<Unit> mo40547w();

    /* renamed from: x */
    void mo40546x(boolean z);

    /* renamed from: y */
    Observable<X26> mo40545y();

    /* renamed from: z */
    void mo40544z();
}
