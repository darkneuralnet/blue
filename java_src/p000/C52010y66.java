package p000;

import android.content.Intent;
import android.net.Uri;
import co.bird.android.model.GoTransactionDeepLinkParams;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Ly66;", "LMV0;", "Landroid/content/Intent;", "intent", "Lio/reactivex/c;", C17296a.f69688o, "Le13;", "Le13;", "navigator", "<init>", "(Le13;)V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: y66  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52010y66 implements MV0 {

    /* renamed from: a */
    public final InterfaceC40099e13 f118758a;

    public C52010y66(InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f118758a = navigator;
    }

    /* renamed from: c */
    public static final Object m4132c(Intent intent, C52010y66 this$0) {
        String str;
        Intrinsics.checkNotNullParameter(intent, "$intent");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Uri data = intent.getData();
        String str2 = null;
        if (data != null) {
            str = data.getQueryParameter("ride_id");
        } else {
            str = null;
        }
        Uri data2 = intent.getData();
        if (data2 != null) {
            str2 = data2.getQueryParameter("receipt_id");
        }
        if (str == null && str2 == null) {
            AbstractC23461c m33080F = AbstractC23461c.m33080F(new NullPointerException("Transaction deeplink missing 'ride_id' or 'receipt_id' query string parameter"));
            Intrinsics.checkNotNullExpressionValue(m33080F, "{\n      Completable.erro…string parameter\"))\n    }");
            return m33080F;
        }
        InterfaceC40099e13.C19924a.goToRider$default(this$0.f118758a, false, false, new GoTransactionDeepLinkParams(str, str2), 3, null);
        return Unit.INSTANCE;
    }

    @Override // p000.MV0
    /* renamed from: a */
    public AbstractC23461c mo4134a(final Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: x66
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object m4132c;
                m4132c = C52010y66.m4132c(intent, this);
                return m4132c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable {\n    val r…      )\n      )\n    }\n  }");
        return m33078H;
    }
}
