package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC31776As1;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096\u0001J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0096\u0001J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0096\u0001J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LDs1;", "LAs1;", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBird;", "f", "", "birdId", "", "refresh", "Lio/reactivex/c;", DateTokenConverter.CONVERTER_KEY, "", C17296a.f69688o, "b", "onResume", "LAs1;", "delegate", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(LAs1;Lcom/uber/autodispose/ScopeProvider;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlightSheetFragmentPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetFragmentPresenter.kt\nco/bird/android/flightsheet/dialogs/FlightSheetFragmentPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,23:1\n237#2:24\n*S KotlinDebug\n*F\n+ 1 FlightSheetFragmentPresenter.kt\nco/bird/android/flightsheet/dialogs/FlightSheetFragmentPresenter\n*L\n15#1:24\n*E\n"})
/* renamed from: Ds1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32478Ds1 implements InterfaceC31776As1 {

    /* renamed from: a */
    public final InterfaceC31776As1 f6448a;

    /* renamed from: b */
    public final ScopeProvider f6449b;

    public C32478Ds1(InterfaceC31776As1 delegate, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f6448a = delegate;
        this.f6449b = scopeProvider;
    }

    @Override // p000.InterfaceC31776As1
    /* renamed from: a */
    public Observable<Unit> mo23177a() {
        return this.f6448a.mo23177a();
    }

    /* renamed from: b */
    public final void m109837b(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Object m33041n = InterfaceC31776As1.C0293a.populateFlightSheet$default(this, birdId, false, 2, null).m33041n(AutoDispose.m45239a(this.f6449b));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    @Override // p000.InterfaceC31776As1
    /* renamed from: d */
    public AbstractC23461c mo23174d(String birdId, boolean z) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return this.f6448a.mo23174d(birdId, z);
    }

    @Override // p000.InterfaceC31776As1
    /* renamed from: f */
    public Observable<WireBird> mo23172f() {
        return this.f6448a.mo23172f();
    }

    @Override // p000.InterfaceC31776As1
    public void onResume() {
        this.f6448a.onResume();
    }
}
