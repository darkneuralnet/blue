package co.bird.android.runtime.logging;

import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11733l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/runtime/logging/ApplicationVisibilityTracker;", "LFq2;", "", "onApplicationForegrounded", "onApplicationBackgrounded", "Lgl;", "b", "Lgl;", "preference", "<init>", "(Lgl;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ApplicationVisibilityTracker implements InterfaceC32929Fq2 {

    /* renamed from: b */
    public final C22454gl f66986b;

    public ApplicationVisibilityTracker(C22454gl preference) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        this.f66986b = preference;
    }

    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_STOP)
    public final void onApplicationBackgrounded() {
        C22454gl c22454gl = this.f66986b;
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        c22454gl.m37741D1(now);
    }

    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_START)
    public final void onApplicationForegrounded() {
        C22454gl c22454gl = this.f66986b;
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        c22454gl.m37737E1(now);
    }
}
