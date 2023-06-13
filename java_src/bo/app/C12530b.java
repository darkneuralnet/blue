package bo.app;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.amazon.device.messaging.ADM;
import com.amazon.device.messaging.development.ADMManifest;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, m28432d2 = {"Lbo/app/b;", "", "", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lbo/app/j2;", "admRegistrationDataProvider", "<init>", "(Landroid/content/Context;Lbo/app/j2;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.b */
/* loaded from: classes.dex */
public final class C12530b {

    /* renamed from: c */
    public static final C12531a f58242c = new C12531a(null);

    /* renamed from: a */
    private final Context f58243a;

    /* renamed from: b */
    private final InterfaceC12792j2 f58244b;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, m28432d2 = {"Lbo/app/b$a;", "", "", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "b", "", "ADM_INSTANCE_CLASSPATH", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.b$a */
    /* loaded from: classes.dex */
    public static final class C12531a {

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.b$a$a */
        /* loaded from: classes.dex */
        public static final class C12532a extends Lambda implements Function0<String> {

            /* renamed from: b */
            public static final C12532a f58245b = new C12532a();

            public C12532a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "com.amazon.device.messaging.ADM not found";
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.b$a$b */
        /* loaded from: classes.dex */
        public static final class C12533b extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ Exception f58246b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12533b(Exception exc) {
                super(0);
                this.f58246b = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return Intrinsics.stringPlus("Manifest not authored properly to support ADM. ADM manifest exception: ", this.f58246b);
            }
        }

        public /* synthetic */ C12531a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final boolean m63912b(Context context) {
            try {
                ADMManifest.checkManifestAuthoredProperly(context);
                return true;
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, new C12533b(e), 6, null);
                return false;
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean m63913a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return m63914a() && m63912b(context);
        }

        private C12531a() {
        }

        /* renamed from: a */
        private final boolean m63914a() {
            try {
                Class.forName("com.amazon.device.messaging.ADM");
                return true;
            } catch (Exception unused) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C12532a.f58245b, 6, null);
                return false;
            }
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.b$b */
    /* loaded from: classes.dex */
    public static final class C12534b extends Lambda implements Function0<String> {
        public C12534b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("The device is already registered with the ADM server and is eligible to receive ADM messages.ADM registration id: ", C12530b.this.f58244b.mo63488a());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.b$c */
    /* loaded from: classes.dex */
    public static final class C12535c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12535c f58248b = new C12535c();

        public C12535c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Registering with ADM server...";
        }
    }

    public C12530b(Context context, InterfaceC12792j2 admRegistrationDataProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(admRegistrationDataProvider, "admRegistrationDataProvider");
        this.f58243a = context;
        this.f58244b = admRegistrationDataProvider;
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m63916a(Context context) {
        return f58242c.m63913a(context);
    }

    /* renamed from: a */
    public final void m63917a() {
        if (this.f58244b.mo63488a() != null) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, new C12534b(), 6, null);
            InterfaceC12792j2 interfaceC12792j2 = this.f58244b;
            interfaceC12792j2.mo63487a(interfaceC12792j2.mo63488a());
            return;
        }
        ADM adm = new ADM(this.f58243a);
        if (adm.isSupported()) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C12535c.f58248b, 6, null);
            adm.startRegister();
        }
    }
}
