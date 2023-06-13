package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LOi1;", "LMV0;", "Landroid/content/Intent;", "intent", "Lio/reactivex/c;", C17296a.f69688o, "Le13;", "Le13;", "navigator", "Landroid/content/Context;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Le13;Landroid/content/Context;)V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Oi1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34962Oi1 implements MV0 {

    /* renamed from: a */
    public final InterfaceC40099e13 f27075a;

    /* renamed from: b */
    public final Context f27076b;

    public C34962Oi1(InterfaceC40099e13 navigator, Context context) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27075a = navigator;
        this.f27076b = context;
    }

    /* renamed from: c */
    public static final Unit m91667c(C34962Oi1 this$0, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(intent, "$intent");
        try {
            Activity mo36934u3 = this$0.f27075a.mo36934u3();
            if (mo36934u3 != null) {
                mo36934u3.startActivity(intent);
            } else {
                intent.addFlags(268435456);
                this$0.f27076b.startActivity(intent);
            }
        } catch (Exception e) {
            Uri data = intent.getData();
            C41318g46.m40161c(e, "caught exception while attempting to start activity in deep link navigator, falling back to browser if " + data + " is not null ", new Object[0]);
            if (data != null) {
                InterfaceC40099e13 interfaceC40099e13 = this$0.f27075a;
                String uri = data.toString();
                Intrinsics.checkNotNullExpressionValue(uri, "uri.toString()");
                interfaceC40099e13.mo36983m2(uri);
            } else {
                throw new LV0();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // p000.MV0
    /* renamed from: a */
    public AbstractC23461c mo4134a(final Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: Ni1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m91667c;
                m91667c = C34962Oi1.m91667c(C34962Oi1.this, intent);
                return m91667c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable {\n    try {…ption()\n      }\n    }\n  }");
        return m33078H;
    }
}
