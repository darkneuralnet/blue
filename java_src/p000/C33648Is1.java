package p000;

import android.content.Intent;
import android.os.Parcelable;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC31776As1;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LIs1;", "", "Landroid/content/Intent;", "intent", "", C17296a.f69688o, "b", "LAs1;", "LAs1;", "flightSheetDelegate", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/model/wire/WireBird;", "c", "Lco/bird/android/model/wire/WireBird;", "bird", "<init>", "(LAs1;Lcom/uber/autodispose/ScopeProvider;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlightSheetPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetPresenter.kt\nco/bird/android/app/feature/flightsheet/FlightSheetPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,30:1\n237#2:31\n*S KotlinDebug\n*F\n+ 1 FlightSheetPresenter.kt\nco/bird/android/app/feature/flightsheet/FlightSheetPresenter\n*L\n22#1:31\n*E\n"})
/* renamed from: Is1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33648Is1 {

    /* renamed from: a */
    public final InterfaceC31776As1 f16348a;

    /* renamed from: b */
    public final ScopeProvider f16349b;

    /* renamed from: c */
    public WireBird f16350c;

    public C33648Is1(InterfaceC31776As1 flightSheetDelegate, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(flightSheetDelegate, "flightSheetDelegate");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f16348a = flightSheetDelegate;
        this.f16349b = scopeProvider;
    }

    /* renamed from: a */
    public final void m101578a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Parcelable parcelableExtra = intent.getParcelableExtra("bird");
        Intrinsics.checkNotNull(parcelableExtra);
        WireBird wireBird = (WireBird) parcelableExtra;
        this.f16350c = wireBird;
        InterfaceC31776As1 interfaceC31776As1 = this.f16348a;
        if (wireBird == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        }
        Object m33041n = InterfaceC31776As1.C0293a.populateFlightSheet$default(interfaceC31776As1, wireBird.getId(), false, 2, null).m33041n(AutoDispose.m45239a(this.f16349b));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: b */
    public final void m101577b() {
        this.f16348a.onResume();
    }
}
