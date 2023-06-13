package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.widget.PillButton;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LLT3;", "LKT3;", "", "visible", "", C17296a.f69688o, "", Entry.TYPE_TEXT, "b", "c", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/widget/PillButton;", "Lco/bird/android/widget/PillButton;", "pillButton", "Lio/reactivex/Observable;", "Lio/reactivex/Observable;", "e", "()Lio/reactivex/Observable;", "pillButtonClicks", "<init>", "(Lco/bird/android/widget/PillButton;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPillButtonUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PillButtonUi.kt\nco/bird/android/app/feature/pill/PillButtonUiImpl\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,37:1\n262#2,2:38\n*S KotlinDebug\n*F\n+ 1 PillButtonUi.kt\nco/bird/android/app/feature/pill/PillButtonUiImpl\n*L\n22#1:38,2\n*E\n"})
/* renamed from: LT3 */
/* loaded from: classes2.dex */
public final class LT3 implements KT3 {

    /* renamed from: a */
    public final PillButton f21468a;

    /* renamed from: b */
    public final Observable<Unit> f21469b;

    public LT3(PillButton pillButton) {
        Intrinsics.checkNotNullParameter(pillButton, "pillButton");
        this.f21468a = pillButton;
        this.f21469b = C44626lf5.clicksThrottle$default(pillButton, 0L, 1, null);
    }

    @Override // p000.KT3
    /* renamed from: a */
    public void mo96904a(boolean z) {
        int i;
        PillButton pillButton = this.f21468a;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        pillButton.setVisibility(i);
    }

    @Override // p000.KT3
    /* renamed from: b */
    public void mo96903b(String str) {
        this.f21468a.setMainTitleText(str);
    }

    @Override // p000.KT3
    /* renamed from: c */
    public void mo96902c(String str) {
        this.f21468a.setSecondaryTitleText(str);
    }

    @Override // p000.KT3
    /* renamed from: d */
    public void mo96901d(boolean z) {
        this.f21468a.setSecondaryTextVisible(z);
    }

    @Override // p000.KT3
    /* renamed from: e */
    public Observable<Unit> mo96900e() {
        return this.f21469b;
    }
}
