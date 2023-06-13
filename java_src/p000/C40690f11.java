package p000;

import android.content.Intent;
import android.net.Uri;
import co.bird.android.model.DestinationDeeplinkParams;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lf11;", "LMV0;", "Landroid/content/Intent;", "intent", "Lio/reactivex/c;", C17296a.f69688o, "Le13;", "Le13;", "navigator", "<init>", "(Le13;)V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: f11  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40690f11 implements MV0 {

    /* renamed from: a */
    public final InterfaceC40099e13 f79293a;

    public C40690f11(InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f79293a = navigator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        r5 = kotlin.text.StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(r5);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit m42273c(C40690f11 this$0, Intent intent) {
        Double d;
        Double d2;
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(intent, "$intent");
        InterfaceC40099e13 interfaceC40099e13 = this$0.f79293a;
        Uri data = intent.getData();
        Double d3 = null;
        if (data != null && (queryParameter3 = data.getQueryParameter("lat")) != null) {
            d = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(queryParameter3);
        } else {
            d = null;
        }
        Uri data2 = intent.getData();
        if (data2 == null || (r5 = data2.getQueryParameter("lng")) == null || d2 == null) {
            Uri data3 = intent.getData();
            if (data3 != null && (queryParameter2 = data3.getQueryParameter("lon")) != null) {
                d2 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(queryParameter2);
            } else {
                d2 = null;
            }
            if (d2 == null) {
                Uri data4 = intent.getData();
                if (data4 != null && (queryParameter = data4.getQueryParameter("long")) != null) {
                    d3 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(queryParameter);
                }
                InterfaceC40099e13.C19924a.goToRider$default(interfaceC40099e13, false, false, new DestinationDeeplinkParams(d, d3), 3, null);
                return Unit.INSTANCE;
            }
        }
        d3 = d2;
        InterfaceC40099e13.C19924a.goToRider$default(interfaceC40099e13, false, false, new DestinationDeeplinkParams(d, d3), 3, null);
        return Unit.INSTANCE;
    }

    @Override // p000.MV0
    /* renamed from: a */
    public AbstractC23461c mo4134a(final Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: e11
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m42273c;
                m42273c = C40690f11.m42273c(C40690f11.this, intent);
                return m42273c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable {\n    navig…Null(),\n      )\n    )\n  }");
        return m33078H;
    }
}
