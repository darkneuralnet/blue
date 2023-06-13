package p000;

import android.content.Context;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188BX\u0082\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\t\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"Lmj1;", "Llj1;", "", "event", "Landroid/os/Bundle;", "parameters", "", "logEvent", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LTq4;", "b", "LTq4;", "getReactiveConfig", "()LTq4;", "reactiveConfig", "LOh;", "c", "LOh;", "getAppBuildConfig", "()LOh;", "appBuildConfig", "LXi;", DateTokenConverter.CONVERTER_KEY, "LXi;", "()LXi;", "eventLogger", "<init>", "(Landroid/content/Context;LTq4;LOh;)V", "facebook_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mj1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45255mj1 implements InterfaceC44662lj1 {

    /* renamed from: a */
    public final Context f98627a;

    /* renamed from: b */
    public final C36207Tq4 f98628b;

    /* renamed from: c */
    public final InterfaceC6097Oh f98629c;

    /* renamed from: d */
    public final C9459Xi f98630d;

    public C45255mj1(Context context, C36207Tq4 reactiveConfig, InterfaceC6097Oh appBuildConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        this.f98627a = context;
        this.f98628b = reactiveConfig;
        this.f98629c = appBuildConfig;
        if (reactiveConfig.m82623f8().m73665a().getThirdPartyConfig().getFacebook().getEnabled()) {
            C17216a.m52747G(true);
            C17216a.m52743c();
            C17216a.m52748F(reactiveConfig.m82623f8().m73665a().getThirdPartyConfig().getFacebook().getAdvertiserIdCollectionEnabled());
            C17216a.m52746H(appBuildConfig.mo89921k());
        }
    }

    /* renamed from: a */
    public final C9459Xi m25138a() {
        if (this.f98630d == null && C17216a.m52722x()) {
            return C9459Xi.m76550h(this.f98627a);
        }
        return this.f98630d;
    }

    @Override // p000.InterfaceC44662lj1
    public void logEvent(String event, Bundle bundle) {
        Intrinsics.checkNotNullParameter(event, "event");
        C9459Xi m25138a = m25138a();
        if (m25138a != null) {
            m25138a.m76551g(event, bundle);
        }
    }
}
