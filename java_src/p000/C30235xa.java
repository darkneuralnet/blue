package p000;

import android.content.Intent;
import co.bird.android.model.analytics.AnalyticsDebugEvent;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\f\u001a\u00020\t\u0012\b\b\u0001\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Lxa;", "", "Landroid/content/Intent;", "intent", "", C17296a.f69688o, "LEa;", "LEa;", "analyticsManager", "Le13;", "b", "Le13;", "navigator", "LBa;", "c", "LBa;", "ui", "<init>", "(LEa;Le13;LBa;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnalyticsEventDetailDebuggerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsEventDetailDebuggerPresenter.kt\nco/bird/android/app/feature/settings/analytics/AnalyticsEventDetailDebuggerPresenter\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,38:1\n215#2,2:39\n*S KotlinDebug\n*F\n+ 1 AnalyticsEventDetailDebuggerPresenter.kt\nco/bird/android/app/feature/settings/analytics/AnalyticsEventDetailDebuggerPresenter\n*L\n30#1:39,2\n*E\n"})
/* renamed from: xa */
/* loaded from: classes2.dex */
public final class C30235xa {

    /* renamed from: a */
    public final InterfaceC1880Ea f117816a;

    /* renamed from: b */
    public final InterfaceC40099e13 f117817b;

    /* renamed from: c */
    public final InterfaceC0647Ba f117818c;

    public C30235xa(InterfaceC1880Ea analyticsManager, InterfaceC40099e13 navigator, InterfaceC0647Ba ui) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f117816a = analyticsManager;
        this.f117817b = navigator;
        this.f117818c = ui;
    }

    /* renamed from: a */
    public final void m5001a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        int intExtra = intent.getIntExtra("item_index", -1);
        if (intExtra >= 0) {
            AnalyticsDebugEvent analyticsDebugEvent = this.f117816a.mo55935e().m73665a().get(intExtra);
            this.f117818c.mo112106b(analyticsDebugEvent.getEvent().getName());
            for (Map.Entry<String, Object> entry : analyticsDebugEvent.getEvent().getProperties().entrySet()) {
                this.f117818c.mo112107a(entry.getKey(), String.valueOf(entry.getValue()));
            }
            return;
        }
        this.f117817b.close();
    }
}
