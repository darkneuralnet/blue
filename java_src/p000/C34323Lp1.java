package p000;

import android.content.Intent;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"LLp1;", "LMV0;", "Landroid/content/Intent;", "intent", "Lio/reactivex/c;", C17296a.f69688o, "Le13;", "Le13;", "navigator", "<init>", "(Le13;)V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Lp1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34323Lp1 implements MV0 {

    /* renamed from: a */
    public final InterfaceC40099e13 f22091a;

    public C34323Lp1(InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f22091a = navigator;
    }

    /* renamed from: c */
    public static final Unit m96314c(C34323Lp1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f22091a.mo37060Z2();
        return Unit.INSTANCE;
    }

    @Override // p000.MV0
    /* renamed from: a */
    public AbstractC23461c mo4134a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: Kp1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m96314c;
                m96314c = C34323Lp1.m96314c(C34323Lp1.this);
                return m96314c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable {\n      nav…r.goToFleetReport()\n    }");
        return m33078H;
    }
}