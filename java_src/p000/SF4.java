package p000;

import android.widget.Button;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C52471yt3;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J/\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0018"}, m28432d2 = {"LSF4;", "", "Lio/reactivex/Observable;", "", C17296a.f69688o, "Lco/bird/android/model/constant/ScanMode;", "mode", "Lco/bird/android/model/constant/ScanIntention;", "intention", "", "instructionsStringRes", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireBird;", "b", "(Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanIntention;Ljava/lang/Integer;)Lio/reactivex/F;", "Lco/bird/android/core/mvp/BaseActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lvy1;", "Lvy1;", "binding", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lvy1;)V", "c", "co.bird.android.feature.maintenance"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairsOverviewUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairsOverviewUi.kt\nco/bird/android/feature/repairs/RepairsOverviewUi\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
/* renamed from: SF4 */
/* loaded from: classes3.dex */
public final class SF4 {

    /* renamed from: c */
    public static final C7367a f33393c = new C7367a(null);

    /* renamed from: a */
    public final BaseActivity f33394a;

    /* renamed from: b */
    public final C50740vy1 f33395b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LSF4$a;", "", "", "SCAN_TAG", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.feature.maintenance"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: SF4$a */
    /* loaded from: classes3.dex */
    public static final class C7367a {
        public /* synthetic */ C7367a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7367a() {
        }
    }

    public SF4(BaseActivity activity, C50740vy1 binding) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f33394a = activity;
        this.f33395b = binding;
    }

    /* renamed from: a */
    public final Observable<Unit> m85800a() {
        Button button = this.f33395b.f115016c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.inspectionButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: b */
    public final AbstractC23442F<WireBird> m85799b(ScanMode mode, ScanIntention scanIntention, Integer num) {
        String str;
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (num != null) {
            str = this.f33394a.getString(num.intValue());
        } else {
            str = null;
        }
        C52471yt3 newInstance$default = C52471yt3.C30765a.newInstance$default(C52471yt3.f120367g, mode, scanIntention, str, null, false, null, 56, null);
        newInstance$default.show(this.f33394a.getSupportFragmentManager(), "BIRD_SCAN_TAG");
        return newInstance$default.m2331N6();
    }
}
