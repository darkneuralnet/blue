package p000;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import com.appboy.models.push.BrazeNotificationPayload;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C38054ac3;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, m28432d2 = {"Lp20;", "LfO1;", "Lcom/appboy/models/push/BrazeNotificationPayload;", "payload", "Landroid/app/Notification;", "createNotification", "<init>", "()V", "Companion", C17296a.f69688o, "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: p20  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C46629p20 implements InterfaceC40906fO1 {
    public static final C27130a Companion = new C27130a(null);
    private static volatile C46629p20 internalInstance = new C46629p20();

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u001a\u0010\u000b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m28432d2 = {"Lp20$a;", "", "Lcom/appboy/models/push/BrazeNotificationPayload;", "payload", "Lac3$e;", "b", "Lp20;", C17296a.f69688o, "()Lp20;", "getInstance$annotations", "()V", "instance", "internalInstance", "Lp20;", "<init>", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: p20$a */
    /* loaded from: classes2.dex */
    public static final class C27130a {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: p20$a$a */
        /* loaded from: classes2.dex */
        public static final class C27131a extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ BrazeNotificationPayload f103022g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27131a(BrazeNotificationPayload brazeNotificationPayload) {
                super(0);
                this.f103022g = brazeNotificationPayload;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Using BrazeNotificationPayload: ", this.f103022g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: p20$a$b */
        /* loaded from: classes2.dex */
        public static final class C27132b extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27132b f103023g = new C27132b();

            public C27132b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "BrazeNotificationPayload has null context. Not creating notification";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: p20$a$c */
        /* loaded from: classes2.dex */
        public static final class C27133c extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C27133c f103024g = new C27133c();

            public C27133c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "BrazeNotificationPayload has null app configuration provider. Not creating notification";
            }
        }

        public /* synthetic */ C27130a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C46629p20 m20031a() {
            return C46629p20.internalInstance;
        }

        @JvmStatic
        /* renamed from: b */
        public final C38054ac3.C10770e m20030b(BrazeNotificationPayload payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            C43664k20 c43664k20 = C43664k20.f93782a;
            C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.V, null, false, new C27131a(payload), 6, null);
            Context context = payload.getContext();
            if (context == null) {
                C43664k20.m29442e(c43664k20, this, null, null, false, C27132b.f103023g, 7, null);
                return null;
            }
            X10 configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                C43664k20.m29442e(c43664k20, this, null, null, false, C27133c.f103024g, 7, null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            C47815r20.m16589r(payload);
            C38054ac3.C10770e m71053g = new C38054ac3.C10770e(context, C47815r20.m16601f(payload)).m71053g(true);
            Intrinsics.checkNotNullExpressionValue(m71053g, "Builder(context, notific…     .setAutoCancel(true)");
            C47815r20.m16610N(m71053g, payload);
            C47815r20.m16623A(m71053g, payload);
            C47815r20.m16611M(m71053g, payload);
            C47815r20.m16615I(m71053g, payload);
            C47815r20.m16622B(context, m71053g, notificationExtras);
            C47815r20.m16621C(context, m71053g, notificationExtras);
            C47815r20.m16614J(configurationProvider, m71053g);
            C47815r20.m16620D(m71053g, payload);
            C47815r20.m16613K(m71053g, payload);
            C47815r20.m16612L(m71053g, payload);
            C47815r20.m16617G(m71053g, payload);
            C47222q20.Companion.m18276l(m71053g, payload);
            C46036o20.m21963b(m71053g, payload);
            C47815r20.m16582y(m71053g, payload);
            C47815r20.m16581z(m71053g, payload);
            C47815r20.m16609O(m71053g, payload);
            C47815r20.m16616H(m71053g, payload);
            C47815r20.m16619E(m71053g, payload);
            return m71053g;
        }

        private C27130a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: p20$b */
    /* loaded from: classes2.dex */
    public static final class C27134b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C27134b f103025g = new C27134b();

        public C27134b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Notification could not be built. Returning null as created notification";
        }
    }

    @Override // p000.InterfaceC40906fO1
    public Notification createNotification(BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        C38054ac3.C10770e m20030b = Companion.m20030b(payload);
        if (m20030b != null) {
            return m20030b.m71057c();
        }
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C27134b.f103025g, 6, null);
        return null;
    }
}
