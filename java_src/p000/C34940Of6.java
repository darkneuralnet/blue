package p000;

import android.content.Intent;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LOf6;", "LMV0;", "Landroid/content/Intent;", "intent", "Lio/reactivex/c;", C17296a.f69688o, "Le13;", "Le13;", "navigator", "LTq4;", "b", "LTq4;", "reactiveConfig", "<init>", "(Le13;LTq4;)V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Of6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34940Of6 implements MV0 {

    /* renamed from: a */
    public final InterfaceC40099e13 f27021a;

    /* renamed from: b */
    public final C36207Tq4 f27022b;

    public C34940Of6(InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f27021a = navigator;
        this.f27022b = reactiveConfig;
    }

    /* renamed from: c */
    public static final Object m91718c(C34940Of6 this$0, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(intent, "$intent");
        String scannerUrlRedirect = this$0.f27022b.m82623f8().m73665a().getScannerUrlRedirect(String.valueOf(intent.getData()));
        if (scannerUrlRedirect != null) {
            this$0.f27021a.mo36983m2(scannerUrlRedirect);
            return Unit.INSTANCE;
        }
        InterfaceC40099e13.C19924a.goToRider$default(this$0.f27021a, false, false, null, 7, null);
        return Unit.INSTANCE;
    }

    @Override // p000.MV0
    /* renamed from: a */
    public AbstractC23461c mo4134a(final Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: Nf6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object m91718c;
                m91718c = C34940Of6.m91718c(C34940Of6.this, intent);
                return m91718c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable {\n    // No…navigator.goToRider()\n  }");
        return m33078H;
    }
}
