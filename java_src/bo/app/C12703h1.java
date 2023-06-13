package bo.app;

import android.content.Context;
import bo.app.C12703h1;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u000e"}, m28432d2 = {"Lbo/app/h1;", "", "", "firebaseSenderId", "", "b", C17296a.f69688o, "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lbo/app/j2;", "registrationDataProvider", "<init>", "(Landroid/content/Context;Lbo/app/j2;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.h1 */
/* loaded from: classes.dex */
public final class C12703h1 {

    /* renamed from: e */
    public static final C12704a f58584e = new C12704a(null);

    /* renamed from: a */
    private final Context f58585a;

    /* renamed from: b */
    private final InterfaceC12792j2 f58586b;

    /* renamed from: c */
    private final boolean f58587c;

    /* renamed from: d */
    private final boolean f58588d;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m28432d2 = {"Lbo/app/h1$a;", "", "", "FIREBASE_INSTANCE_SCOPE", "Ljava/lang/String;", "INSTANCE_ID_CLASSPATH", "MESSAGING_INSTANCE_CLASSPATH", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h1$a */
    /* loaded from: classes.dex */
    public static final class C12704a {
        public /* synthetic */ C12704a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12704a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h1$b */
    /* loaded from: classes.dex */
    public static final class C12705b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12705b f58589b = new C12705b();

        public C12705b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Firebase Cloud Messaging requires the Google Play Store to be installed.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h1$c */
    /* loaded from: classes.dex */
    public static final class C12706c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Task<String> f58590b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12706c(Task<String> task) {
            super(0);
            this.f58590b = task;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Fetching registration token failed using FirebaseMessaging instance with default Firebase installation with exception ", this.f58590b.getException());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h1$d */
    /* loaded from: classes.dex */
    public static final class C12707d extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58591b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12707d(String str) {
            super(0);
            this.f58591b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Automatically obtained Firebase Cloud Messaging token: ", this.f58591b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h1$e */
    /* loaded from: classes.dex */
    public static final class C12708e extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12708e f58592b = new C12708e();

        public C12708e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to register for Firebase Cloud Messaging";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h1$f */
    /* loaded from: classes.dex */
    public static final class C12709f extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58593b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12709f(String str) {
            super(0);
            this.f58593b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Registering for Firebase Cloud Messaging token using sender id: ", this.f58593b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h1$g */
    /* loaded from: classes.dex */
    public static final class C12710g extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12710g f58594b = new C12710g();

        public C12710g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Firebase Cloud Messaging 'getInstance' method could not obtained. Not registering for Firebase Cloud Messaging.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h1$h */
    /* loaded from: classes.dex */
    public static final class C12711h extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12711h f58595b = new C12711h();

        public C12711h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Firebase Cloud Messaging 'InstanceId' object could not be invoked. Not registering for Firebase Cloud Messaging.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h1$i */
    /* loaded from: classes.dex */
    public static final class C12712i extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12712i f58596b = new C12712i();

        public C12712i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Firebase Cloud Messaging 'FirebaseInstanceId.getInstance().getToken()' method could not obtained. Not registering for Firebase Cloud Messaging.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h1$j */
    /* loaded from: classes.dex */
    public static final class C12713j extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Object f58597b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12713j(Object obj) {
            super(0);
            this.f58597b = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Automatically obtained Firebase Cloud Messaging token: ", this.f58597b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.h1$k */
    /* loaded from: classes.dex */
    public static final class C12714k extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12714k f58598b = new C12714k();

        public C12714k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to get push token via instance id";
        }
    }

    public C12703h1(Context context, InterfaceC12792j2 registrationDataProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(registrationDataProvider, "registrationDataProvider");
        this.f58585a = context;
        this.f58586b = registrationDataProvider;
        this.f58587c = C12795j4.m63481a("com.google.firebase.iid.FirebaseInstanceId", "getToken", String.class, String.class);
        this.f58588d = C12795j4.m63481a("com.google.firebase.messaging.FirebaseMessaging", "getToken", new Class[0]);
    }

    /* renamed from: a */
    public final void m63633a(String firebaseSenderId) {
        Intrinsics.checkNotNullParameter(firebaseSenderId, "firebaseSenderId");
        try {
            if (this.f58588d) {
                FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: NN6
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        C12703h1.m63634a(C12703h1.this, task);
                    }
                });
            } else if (this.f58587c) {
                m63631b(firebaseSenderId);
            }
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12708e.f58592b, 4, null);
        }
    }

    /* renamed from: b */
    private final void m63631b(String str) {
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.EnumC25082a enumC25082a = C43664k20.EnumC25082a.V;
        C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, new C12709f(str), 6, null);
        try {
            Method m63480b = C12795j4.m63480b("com.google.firebase.iid.FirebaseInstanceId", "getInstance", new Class[0]);
            if (m63480b == null) {
                C43664k20.m29442e(c43664k20, this, null, null, false, C12710g.f58594b, 7, null);
                return;
            }
            Object m63482a = C12795j4.m63482a((Object) null, m63480b, new Object[0]);
            if (m63482a == null) {
                C43664k20.m29442e(c43664k20, this, null, null, false, C12711h.f58595b, 7, null);
                return;
            }
            Method m63483a = C12795j4.m63483a(m63482a.getClass(), "getToken", String.class, String.class);
            if (m63483a == null) {
                C43664k20.m29442e(c43664k20, this, null, null, false, C12712i.f58596b, 7, null);
                return;
            }
            Object m63482a2 = C12795j4.m63482a(m63482a, m63483a, str, FirebaseMessaging.INSTANCE_ID_SCOPE);
            if (m63482a2 instanceof String) {
                C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, new C12713j(m63482a2), 6, null);
                this.f58586b.mo63487a((String) m63482a2);
            }
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12714k.f58598b, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m63634a(C12703h1 this$0, Task task) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isSuccessful()) {
            C43664k20.m29442e(C43664k20.f93782a, this$0, C43664k20.EnumC25082a.W, null, false, new C12706c(task), 6, null);
            return;
        }
        String str = (String) task.getResult();
        C43664k20.m29442e(C43664k20.f93782a, this$0, C43664k20.EnumC25082a.V, null, false, new C12707d(str), 6, null);
        this$0.f58586b.mo63487a(str);
    }

    /* renamed from: a */
    public final boolean m63635a() {
        if (C13014p1.m63156b(this.f58585a)) {
            return this.f58587c || this.f58588d;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C12705b.f58589b, 6, null);
        return false;
    }
}
