package p000;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m28432d2 = {"LNs1;", "Lf1;", "LOs1;", "LPs1;", "renderer", "", "n", "Lgl;", "e", "Lgl;", "preference", "<init>", "(Lgl;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlightSheetQuickCaptureReadyPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetQuickCaptureReadyPresenter.kt\nco/bird/android/flightsheet/dialogs/quickcapture/FlightSheetQuickCaptureReadyPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,22:1\n180#2:23\n*S KotlinDebug\n*F\n+ 1 FlightSheetQuickCaptureReadyPresenter.kt\nco/bird/android/flightsheet/dialogs/quickcapture/FlightSheetQuickCaptureReadyPresenter\n*L\n18#1:23\n*E\n"})
/* renamed from: Ns1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34818Ns1 extends AbstractC20169f1<InterfaceC35052Os1, C35286Ps1> {

    /* renamed from: e */
    public final C22454gl f25316e;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LPs1;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LPs1;)LPs1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ns1$a */
    /* loaded from: classes3.dex */
    public static final class C5727a extends Lambda implements Function1<C35286Ps1, C35286Ps1> {
        public C5727a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C35286Ps1 invoke(C35286Ps1 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return state.m89669a(C34818Ns1.this.f25316e.m37550y1());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ns1$b */
    /* loaded from: classes3.dex */
    public static final class C5728b extends Lambda implements Function1<Boolean, Unit> {
        public C5728b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enabled) {
            C22454gl c22454gl = C34818Ns1.this.f25316e;
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            c22454gl.m37744C2(enabled.booleanValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34818Ns1(C22454gl preference) {
        super(new C35286Ps1(false, 1, null));
        Intrinsics.checkNotNullParameter(preference, "preference");
        this.f25316e = preference;
    }

    /* renamed from: f */
    public static final void m93265f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: n */
    public void consume(InterfaceC35052Os1 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        m42279i(new C5727a());
        Object m33094as = renderer.mo91273G8().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5728b c5728b = new C5728b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Ms1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34818Ns1.m93265f(Function1.this, obj);
            }
        });
    }
}
