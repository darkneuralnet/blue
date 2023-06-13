package com.braze.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.appboy.Appboy;
import com.appboy.BrazeInternal;
import com.braze.push.BrazePushReceiver;
import com.facebook.share.internal.C17296a;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\r"}, m28432d2 = {"Lcom/braze/push/BrazeFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "", "newToken", "", "s", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "q", "<init>", "()V", "h", C17296a.f69688o, "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes2.dex */
public class BrazeFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: h */
    public static final C17010a f68961h = new C17010a(null);

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, m28432d2 = {"Lcom/braze/push/BrazeFirebaseMessagingService$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "", C17296a.f69688o, "b", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: com.braze.push.BrazeFirebaseMessagingService$a */
    /* loaded from: classes2.dex */
    public static final class C17010a {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazeFirebaseMessagingService$a$a */
        /* loaded from: classes2.dex */
        public static final class C17011a extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ RemoteMessage f68962g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17011a(RemoteMessage remoteMessage) {
                super(0);
                this.f68962g = remoteMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Remote message did not originate from Braze. Not consuming remote message: ", this.f68962g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazeFirebaseMessagingService$a$b */
        /* loaded from: classes2.dex */
        public static final class C17012b extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ Map<String, String> f68963g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17012b(Map<String, String> map) {
                super(0);
                this.f68963g = map;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Got remote message from FCM: ", this.f68963g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazeFirebaseMessagingService$a$c */
        /* loaded from: classes2.dex */
        public static final class C17013c extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ String f68964g;

            /* renamed from: h */
            public final /* synthetic */ String f68965h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17013c(String str, String str2) {
                super(0);
                this.f68964g = str;
                this.f68965h = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Adding bundle item from FCM remote data with key: " + ((Object) this.f68964g) + " and value: " + ((Object) this.f68965h);
            }
        }

        public /* synthetic */ C17010a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean m53254a(Context context, RemoteMessage remoteMessage) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            if (!m53253b(remoteMessage)) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, new C17011a(remoteMessage), 6, null);
                return false;
            }
            Map<String, String> m47208s = remoteMessage.m47208s();
            Intrinsics.checkNotNullExpressionValue(m47208s, "remoteMessage.data");
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, new C17012b(m47208s), 6, null);
            Intent intent = new Intent("firebase_messaging_service_routing_action");
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : m47208s.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C17013c(key, value), 6, null);
                bundle.putString(key, value);
            }
            intent.putExtras(bundle);
            BrazePushReceiver.C17017a.m53242k(BrazePushReceiver.f68969a, context, intent, false, 4, null);
            return true;
        }

        @JvmStatic
        /* renamed from: b */
        public final boolean m53253b(RemoteMessage remoteMessage) {
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            Map<String, String> m47208s = remoteMessage.m47208s();
            Intrinsics.checkNotNullExpressionValue(m47208s, "remoteMessage.data");
            return Intrinsics.areEqual("true", m47208s.get("_ab"));
        }

        private C17010a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: com.braze.push.BrazeFirebaseMessagingService$b */
    /* loaded from: classes2.dex */
    public static final class C17014b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f68966g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17014b(String str) {
            super(0);
            this.f68966g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("No configured API key, not registering token in onNewToken. Token: ", this.f68966g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: com.braze.push.BrazeFirebaseMessagingService$c */
    /* loaded from: classes2.dex */
    public static final class C17015c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f68967g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17015c(String str) {
            super(0);
            this.f68967g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Automatic FirebaseMessagingService.OnNewToken() registration disabled, not registering token: ", this.f68967g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: com.braze.push.BrazeFirebaseMessagingService$d */
    /* loaded from: classes2.dex */
    public static final class C17016d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f68968g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17016d(String str) {
            super(0);
            this.f68968g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Registering Firebase push token in onNewToken. Token: ", this.f68968g);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: q */
    public void mo47215q(RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        super.mo47215q(remoteMessage);
        f68961h.m53254a(this, remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: s */
    public void mo47213s(String newToken) {
        boolean z;
        Intrinsics.checkNotNullParameter(newToken, "newToken");
        super.mo47213s(newToken);
        BrazeInternal.applyPendingRuntimeConfiguration(this);
        X10 x10 = new X10(this);
        String configuredApiKey = Appboy.getConfiguredApiKey(x10);
        if (configuredApiKey != null && configuredApiKey.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C17014b(newToken), 6, null);
        } else if (!x10.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled()) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C17015c(newToken), 6, null);
        } else {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C17016d(newToken), 6, null);
            P10.getInstance(this).registerPushToken(newToken);
        }
    }
}
