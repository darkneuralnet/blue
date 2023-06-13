package p000;

import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Deal;
import co.bird.android.model.User;
import co.bird.android.model.analytics.BonusDealPushed;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"LQT0;", "LMV0;", "Landroid/content/Intent;", "intent", "Lio/reactivex/c;", C17296a.f69688o, "Lgl;", "Lgl;", "preference", "LJT0;", "b", "LJT0;", "dealManager", "Lwi2;", "c", "Lwi2;", "deserializer", "LEa;", DateTokenConverter.CONVERTER_KEY, "LEa;", "analyticsManager", "Le13;", "e", "Le13;", "navigator", "<init>", "(Lgl;LJT0;Lwi2;LEa;Le13;)V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: QT0 */
/* loaded from: classes3.dex */
public final class QT0 implements MV0 {

    /* renamed from: a */
    public final C22454gl f30411a;

    /* renamed from: b */
    public final JT0 f30412b;

    /* renamed from: c */
    public final C51174wi2 f30413c;

    /* renamed from: d */
    public final InterfaceC1880Ea f30414d;

    /* renamed from: e */
    public final InterfaceC40099e13 f30415e;

    public QT0(C22454gl preference, JT0 dealManager, C51174wi2 deserializer, InterfaceC1880Ea analyticsManager, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(dealManager, "dealManager");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f30411a = preference;
        this.f30412b = dealManager;
        this.f30413c = deserializer;
        this.f30414d = analyticsManager;
        this.f30415e = navigator;
    }

    /* renamed from: c */
    public static final Object m88490c(QT0 this$0, Intent intent) {
        Object obj;
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(intent, "$intent");
        InterfaceC40099e13.C19924a.goToRider$default(this$0.f30415e, false, false, null, 7, null);
        Bundle extras = intent.getExtras();
        if (extras == null || (obj = extras.get("deal")) == null) {
            return null;
        }
        Deal deal = (Deal) this$0.f30413c.m6459c((String) obj, Reflection.getOrCreateKotlinClass(Deal.class));
        InterfaceC1880Ea interfaceC1880Ea = this$0.f30414d;
        User m37750B0 = this$0.f30411a.m37750B0();
        if (m37750B0 != null) {
            str = m37750B0.getId();
        } else {
            str = null;
        }
        interfaceC1880Ea.mo55956N(new BonusDealPushed(deal, str));
        this$0.f30412b.mo92270f(deal);
        InterfaceC40099e13.C19924a.goToDeal$default(this$0.f30415e, null, 1, null);
        return Unit.INSTANCE;
    }

    @Override // p000.MV0
    /* renamed from: a */
    public AbstractC23461c mo4134a(final Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: PT0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object m88490c;
                m88490c = QT0.m88490c(QT0.this, intent);
                return m88490c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable {\n    navig…ator.goToDeal()\n    }\n  }");
        return m33078H;
    }
}
