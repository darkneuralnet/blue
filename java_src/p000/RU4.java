package p000;

import android.content.Intent;
import android.net.Uri;
import co.bird.android.model.GoRidePassDeepLinkParams;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"LRU4;", "LMV0;", "Landroid/content/Intent;", "intent", "Lio/reactivex/c;", C17296a.f69688o, "Le13;", "Le13;", "navigator", "<init>", "(Le13;)V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: RU4 */
/* loaded from: classes3.dex */
public final class RU4 implements MV0 {

    /* renamed from: a */
    public final InterfaceC40099e13 f32104a;

    public RU4(InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f32104a = navigator;
    }

    /* renamed from: c */
    public static final Unit m86698c(RU4 this$0, Intent intent) {
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(intent, "$intent");
        InterfaceC40099e13 interfaceC40099e13 = this$0.f32104a;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getQueryParameter("link_code");
        } else {
            str = null;
        }
        InterfaceC40099e13.C19924a.goToRider$default(interfaceC40099e13, false, false, new GoRidePassDeepLinkParams(str), 3, null);
        return Unit.INSTANCE;
    }

    @Override // p000.MV0
    /* renamed from: a */
    public AbstractC23461c mo4134a(final Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: QU4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m86698c;
                m86698c = RU4.m86698c(RU4.this, intent);
                return m86698c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable {\n    navig…ter(LINK_CODE))\n    )\n  }");
        return m33078H;
    }
}
