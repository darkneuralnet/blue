package com.braze.push;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.BrazeInternal;
import com.appboy.models.push.BrazeNotificationPayload;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, m28432d2 = {"Lcom/braze/push/BrazePushReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "", "onReceive", "<init>", "()V", C17296a.f69688o, "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes2.dex */
public class BrazePushReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final C17017a f68969a = new C17017a(null);

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007J \u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0007J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0014\u0010 \u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0017R\u0014\u0010!\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0017¨\u0006$"}, m28432d2 = {"Lcom/braze/push/BrazePushReceiver$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "", "runOnThread", "", "j", "LX10;", "appConfigurationProvider", "c", DateTokenConverter.CONVERTER_KEY, "g", "Landroid/os/Bundle;", "notificationExtras", "brazeExtras", "Lcom/appboy/models/push/BrazeNotificationPayload;", "b", "e", "", "ADM_ERROR_DESCRIPTION_KEY", "Ljava/lang/String;", "ADM_ERROR_KEY", "ADM_RECEIVE_INTENT_ACTION", "ADM_REGISTRATION_ID_KEY", "ADM_REGISTRATION_INTENT_ACTION", "ADM_UNREGISTERED_KEY", "DELETED_MESSAGES_KEY", "FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION", "HMS_PUSH_SERVICE_ROUTING_ACTION", "MESSAGE_TYPE_KEY", "NUMBER_OF_MESSAGES_DELETED_KEY", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: com.braze.push.BrazePushReceiver$a */
    /* loaded from: classes2.dex */
    public static final class C17017a {

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$A */
        /* loaded from: classes2.dex */
        public static final class C17018A extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C17018A f68970g = new C17018A();

            public C17018A() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Push notifications are not enabled. Cannot display push notification.";
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
        @DebugMetadata(m28419c = "com.braze.push.BrazePushReceiver$Companion$handleReceivedIntent$1", m28418f = "BrazePushReceiver.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: com.braze.push.BrazePushReceiver$a$B */
        /* loaded from: classes2.dex */
        public static final class C17019B extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f68971h;

            /* renamed from: i */
            public final /* synthetic */ Context f68972i;

            /* renamed from: j */
            public final /* synthetic */ Intent f68973j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17019B(Context context, Intent intent, Continuation<? super C17019B> continuation) {
                super(2, continuation);
                this.f68972i = context;
                this.f68973j = intent;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C17019B(this.f68972i, this.f68973j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C17019B) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f68971h == 0) {
                    ResultKt.throwOnFailure(obj);
                    C17017a c17017a = BrazePushReceiver.f68969a;
                    Context applicationContext = this.f68972i.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                    c17017a.m53248e(applicationContext, this.f68973j);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$a */
        /* loaded from: classes2.dex */
        public static final class C17020a extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ Intent f68974g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17020a(Intent intent) {
                super(0);
                this.f68974g = intent;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Received ADM registration. Message: ", this.f68974g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$b */
        /* loaded from: classes2.dex */
        public static final class C17021b extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C17021b f68975g = new C17021b();

            public C17021b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "ADM enabled in braze.xml. Continuing to process ADM registration intent.";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$c */
        /* loaded from: classes2.dex */
        public static final class C17022c extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C17022c f68976g = new C17022c();

            public C17022c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "ADM not enabled in braze.xml. Ignoring ADM registration intent. Note: you must set com_braze_push_adm_messaging_registration_enabled to true in your braze.xml to enable ADM.";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$d */
        /* loaded from: classes2.dex */
        public static final class C17023d extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ String f68977g;

            /* renamed from: h */
            public final /* synthetic */ String f68978h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17023d(String str, String str2) {
                super(0);
                this.f68977g = str;
                this.f68978h = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Error during ADM registration: " + ((Object) this.f68977g) + " description: " + ((Object) this.f68978h);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$e */
        /* loaded from: classes2.dex */
        public static final class C17024e extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ String f68979g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17024e(String str) {
                super(0);
                this.f68979g = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Registering for ADM messages with registrationId: ", this.f68979g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$f */
        /* loaded from: classes2.dex */
        public static final class C17025f extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ String f68980g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17025f(String str) {
                super(0);
                this.f68980g = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("The device was un-registered from ADM: ", this.f68980g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$g */
        /* loaded from: classes2.dex */
        public static final class C17026g extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C17026g f68981g = new C17026g();

            public C17026g() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$h */
        /* loaded from: classes2.dex */
        public static final class C17027h extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ String f68982g;

            /* renamed from: h */
            public final /* synthetic */ Intent f68983h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17027h(String str, Intent intent) {
                super(0);
                this.f68982g = str;
                this.f68983h = intent;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Caught exception while performing the push notification handling work. Action: " + ((Object) this.f68982g) + " Intent: " + this.f68983h;
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$i */
        /* loaded from: classes2.dex */
        public static final class C17028i extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ Intent f68984g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17028i(Intent intent) {
                super(0);
                this.f68984g = intent;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Received broadcast message. Message: ", this.f68984g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$j */
        /* loaded from: classes2.dex */
        public static final class C17029j extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ Intent f68985g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17029j(Intent intent) {
                super(0);
                this.f68985g = intent;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Push action is null. Not handling intent: ", this.f68985g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$k */
        /* loaded from: classes2.dex */
        public static final class C17030k extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C17030k f68986g = new C17030k();

            public C17030k() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Received a message not sent from Braze. Ignoring the message.";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$l */
        /* loaded from: classes2.dex */
        public static final class C17031l extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ BrazeNotificationPayload f68987g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17031l(BrazeNotificationPayload brazeNotificationPayload) {
                super(0);
                this.f68987g = brazeNotificationPayload;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Creating notification with payload:\n", this.f68987g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$m */
        /* loaded from: classes2.dex */
        public static final class C17032m extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C17032m f68988g = new C17032m();

            public C17032m() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Notification created by notification factory was null. Not displaying notification.";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$n */
        /* loaded from: classes2.dex */
        public static final class C17033n extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C17033n f68989g = new C17033n();

            public C17033n() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Received silent push";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$o */
        /* loaded from: classes2.dex */
        public static final class C17034o extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C17034o f68990g = new C17034o();

            public C17034o() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Notifications enabled";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$p */
        /* loaded from: classes2.dex */
        public static final class C17035p extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C17035p f68991g = new C17035p();

            public C17035p() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Notifications disabled";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$q */
        /* loaded from: classes2.dex */
        public static final class C17036q extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C17036q f68992g = new C17036q();

            public C17036q() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Notification isn't valid. Skipping.";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$r */
        /* loaded from: classes2.dex */
        public static final class C17037r extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ Bundle f68993g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17037r(Bundle bundle) {
                super(0);
                this.f68993g = bundle;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Push message payload received: ", this.f68993g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$s */
        /* loaded from: classes2.dex */
        public static final class C17038s extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C17038s f68994g = new C17038s();

            public C17038s() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Push message is uninstall tracking push. Doing nothing. Not forwarding this notification to broadcast receivers.";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$t */
        /* loaded from: classes2.dex */
        public static final class C17039t extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C17039t f68995g = new C17039t();

            public C17039t() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Bypassing push display due to test in-app message presence and eager test in-app message display configuration setting.";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$u */
        /* loaded from: classes2.dex */
        public static final class C17040u extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C17040u f68996g = new C17040u();

            public C17040u() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Received notification push";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$v */
        /* loaded from: classes2.dex */
        public static final class C17041v extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C17041v f68997g = new C17041v();

            public C17041v() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Push stories not supported on Amazon devices.";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$w */
        /* loaded from: classes2.dex */
        public static final class C17042w extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C17042w f68998g = new C17042w();

            public C17042w() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Received the initial Push Story notification.";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$x */
        /* loaded from: classes2.dex */
        public static final class C17043x extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ Intent f68999g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17043x(Intent intent) {
                super(0);
                this.f68999g = intent;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Unable to parse FCM message. Intent: ", this.f68999g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$y */
        /* loaded from: classes2.dex */
        public static final class C17044y extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ int f69000g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C17044y(int i) {
                super(0);
                this.f69000g = i;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "FCM deleted " + this.f69000g + " messages. Fetch them from Braze.";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: com.braze.push.BrazePushReceiver$a$z */
        /* loaded from: classes2.dex */
        public static final class C17045z extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C17045z f69001g = new C17045z();

            public C17045z() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Not handling non-Braze push message.";
            }
        }

        public /* synthetic */ C17017a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
            if (r10.equals("hms_push_service_routing_action") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
            if (r10.equals("com.amazon.device.messaging.intent.RECEIVE") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
            if (r10.equals("com.appboy.action.STORY_TRAVERSE") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
            if (r10.equals("firebase_messaging_service_routing_action") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00ba, code lost:
            r9.m53246g(r11, r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
            return;
         */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void m53247f(String str, Context context, Intent intent) {
            boolean z;
            C43664k20 c43664k20 = C43664k20.f93782a;
            C17017a c17017a = BrazePushReceiver.f68969a;
            C43664k20.m29442e(c43664k20, c17017a, C43664k20.EnumC25082a.I, null, false, new C17028i(intent), 6, null);
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C43664k20.m29442e(c43664k20, c17017a, C43664k20.EnumC25082a.W, null, false, new C17029j(intent), 6, null);
                return;
            }
            BrazeInternal.applyPendingRuntimeConfiguration(context);
            switch (str.hashCode()) {
                case -1584985748:
                    break;
                case -1189411212:
                    if (str.equals("com.appboy.action.APPBOY_PUSH_CLICKED")) {
                        C47815r20.m16595l(context, intent);
                        return;
                    }
                    C43664k20.m29442e(c43664k20, c17017a, C43664k20.EnumC25082a.W, null, false, C17030k.f68986g, 6, null);
                    return;
                case -743092218:
                    if (str.equals("com.amazon.device.messaging.intent.REGISTRATION")) {
                        c17017a.m53250c(new X10(context), context, intent);
                        return;
                    }
                    C43664k20.m29442e(c43664k20, c17017a, C43664k20.EnumC25082a.W, null, false, C17030k.f68986g, 6, null);
                    return;
                case -499472794:
                    if (str.equals("com.appboy.action.APPBOY_PUSH_DELETED")) {
                        C47815r20.m16596k(context, intent);
                        return;
                    }
                    C43664k20.m29442e(c43664k20, c17017a, C43664k20.EnumC25082a.W, null, false, C17030k.f68986g, 6, null);
                    return;
                case -478038018:
                    break;
                case 431884654:
                    if (str.equals("com.appboy.action.CANCEL_NOTIFICATION")) {
                        C47815r20.m16598i(context, intent);
                        return;
                    }
                    C43664k20.m29442e(c43664k20, c17017a, C43664k20.EnumC25082a.W, null, false, C17030k.f68986g, 6, null);
                    return;
                case 465410320:
                    if (str.equals("com.appboy.action.APPBOY_ACTION_CLICKED")) {
                        C46036o20.m21962c(context, intent);
                        return;
                    }
                    C43664k20.m29442e(c43664k20, c17017a, C43664k20.EnumC25082a.W, null, false, C17030k.f68986g, 6, null);
                    return;
                case 1060266838:
                    break;
                case 1740454061:
                    break;
                case 1908841035:
                    if (str.equals("com.appboy.action.APPBOY_STORY_CLICKED")) {
                        C47815r20.m16594m(context, intent);
                        return;
                    }
                    C43664k20.m29442e(c43664k20, c17017a, C43664k20.EnumC25082a.W, null, false, C17030k.f68986g, 6, null);
                    return;
                default:
                    C43664k20.m29442e(c43664k20, c17017a, C43664k20.EnumC25082a.W, null, false, C17030k.f68986g, 6, null);
                    return;
            }
        }

        /* renamed from: h */
        public static final void m53245h(Intent intent) {
            int intExtra = intent.getIntExtra("total_deleted", -1);
            if (intExtra == -1) {
                C43664k20.m29442e(C43664k20.f93782a, BrazePushReceiver.f68969a, C43664k20.EnumC25082a.W, null, false, new C17043x(intent), 6, null);
            } else {
                C43664k20.m29442e(C43664k20.f93782a, BrazePushReceiver.f68969a, C43664k20.EnumC25082a.I, null, false, new C17044y(intExtra), 6, null);
            }
        }

        /* renamed from: i */
        public static final boolean m53244i(Intent intent, NotificationManagerCompat notificationManagerCompat, boolean z) {
            if (!C47815r20.m16593n(intent)) {
                C43664k20.m29442e(C43664k20.f93782a, BrazePushReceiver.f68969a, null, null, false, C17045z.f69001g, 7, null);
                return false;
            } else if (!notificationManagerCompat.areNotificationsEnabled() && z) {
                C43664k20.m29442e(C43664k20.f93782a, BrazePushReceiver.f68969a, C43664k20.EnumC25082a.I, null, false, C17018A.f68970g, 6, null);
                return false;
            } else if (Intrinsics.areEqual("deleted_messages", intent.getStringExtra("message_type"))) {
                m53245h(intent);
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: k */
        public static /* synthetic */ void m53242k(C17017a c17017a, Context context, Intent intent, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            c17017a.m53243j(context, intent, z);
        }

        @JvmStatic
        /* renamed from: b */
        public final BrazeNotificationPayload m53251b(Context context, X10 appConfigurationProvider, Bundle notificationExtras, Bundle brazeExtras) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(brazeExtras, "brazeExtras");
            if (C36977Wy0.m77599a()) {
                return new BrazeNotificationPayload(notificationExtras, BrazeNotificationPayload.Companion.getAttachedBrazeExtras(notificationExtras), context, appConfigurationProvider);
            }
            return new BrazeNotificationPayload(notificationExtras, brazeExtras, context, appConfigurationProvider);
        }

        @JvmStatic
        /* renamed from: c */
        public final boolean m53250c(X10 appConfigurationProvider, Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            C43664k20 c43664k20 = C43664k20.f93782a;
            C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.I, null, false, new C17020a(intent), 6, null);
            if (C36977Wy0.m77599a() && appConfigurationProvider.isAdmMessagingRegistrationEnabled()) {
                C43664k20.m29442e(c43664k20, this, null, null, false, C17021b.f68975g, 7, null);
                m53249d(context, intent);
                return true;
            }
            C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.W, null, false, C17022c.f68976g, 6, null);
            return false;
        }

        @JvmStatic
        /* renamed from: d */
        public final boolean m53249d(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            String stringExtra = intent.getStringExtra("error");
            String stringExtra2 = intent.getStringExtra("error_description");
            String stringExtra3 = intent.getStringExtra("registration_id");
            String stringExtra4 = intent.getStringExtra("unregistered");
            if (stringExtra != null) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C17023d(stringExtra, stringExtra2), 6, null);
                return true;
            } else if (stringExtra3 != null) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, new C17024e(stringExtra3), 6, null);
                P10.getInstance(context).registerPushToken(stringExtra3);
                return true;
            } else if (stringExtra4 != null) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C17025f(stringExtra4), 6, null);
                return true;
            } else {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C17026g.f68981g, 6, null);
                return false;
            }
        }

        /* renamed from: e */
        public final void m53248e(Context context, Intent intent) {
            String action = intent.getAction();
            try {
                m53247f(action, context, intent);
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C17027h(action, intent), 4, null);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x015d  */
        @JvmStatic
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean m53246g(Context context, Intent intent) {
            X10 x10;
            boolean z;
            Notification createNotification;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            NotificationManagerCompat from = NotificationManagerCompat.from(context);
            Intrinsics.checkNotNullExpressionValue(from, "from(context)");
            if (from.areNotificationsEnabled()) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C17034o.f68990g, 6, null);
            } else {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C17035p.f68991g, 6, null);
            }
            boolean m16592o = C47815r20.m16592o(intent);
            if (!m53244i(intent, from, m16592o)) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C17036q.f68992g, 7, null);
                return false;
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return false;
            }
            C43664k20 c43664k20 = C43664k20.f93782a;
            C43664k20.EnumC25082a enumC25082a = C43664k20.EnumC25082a.I;
            C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, new C17037r(extras), 6, null);
            Bundle attachedBrazeExtras = BrazeNotificationPayload.Companion.getAttachedBrazeExtras(extras);
            extras.putBundle("extra", attachedBrazeExtras);
            if (!extras.containsKey("appboy_push_received_timestamp")) {
                extras.putLong("appboy_push_received_timestamp", System.currentTimeMillis());
            }
            if (C47815r20.m16591p(extras)) {
                C43664k20.m29442e(c43664k20, this, enumC25082a, null, false, C17038s.f68994g, 6, null);
                return false;
            }
            X10 x102 = new X10(context);
            BrazeNotificationPayload m53251b = m53251b(context, x102, extras, attachedBrazeExtras);
            if (x102.isInAppMessageTestPushEagerDisplayEnabled() && m53251b.getShouldFetchTestTriggers() && C42478i20.m35358s().m6659a() != null) {
                C43664k20.m29442e(c43664k20, this, null, null, false, C17039t.f68995g, 7, null);
                BrazeInternal.handleInAppMessageTestPush(context, intent);
                return false;
            }
            C47815r20.m16597j(m53251b);
            if (m16592o) {
                C43664k20.m29442e(c43664k20, this, null, null, false, C17040u.f68996g, 7, null);
                int m16604c = C47815r20.m16604c(m53251b);
                extras.putInt("nid", m16604c);
                if (m53251b.isPushStory()) {
                    if (C36977Wy0.m77599a()) {
                        C43664k20.m29442e(c43664k20, this, null, null, false, C17041v.f68997g, 7, null);
                        return false;
                    } else if (!extras.containsKey("appboy_story_newly_received")) {
                        x10 = x102;
                        z = true;
                        C43664k20.m29442e(c43664k20, this, null, null, false, C17042w.f68998g, 7, null);
                        extras.putBoolean("appboy_story_newly_received", true);
                        C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.V, null, false, new C17031l(m53251b), 6, null);
                        createNotification = C47815r20.m16605b().createNotification(m53251b);
                        if (createNotification != null) {
                            C43664k20.m29442e(c43664k20, this, null, null, false, C17032m.f68988g, 7, null);
                            return false;
                        }
                        from.notify("appboy_notification", m16604c, createNotification);
                        C47815r20.m16583x(context, extras);
                        C47815r20.m16608P(context, x10, extras);
                        Integer pushDuration = m53251b.getPushDuration();
                        if (pushDuration != null) {
                            C47815r20.m16618F(context, BrazePushReceiver.class, m16604c, pushDuration.intValue());
                        }
                        return z;
                    }
                }
                x10 = x102;
                z = true;
                C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.V, null, false, new C17031l(m53251b), 6, null);
                createNotification = C47815r20.m16605b().createNotification(m53251b);
                if (createNotification != null) {
                }
            } else {
                C43664k20.m29442e(c43664k20, this, null, null, false, C17033n.f68989g, 7, null);
                C47815r20.m16583x(context, extras);
                C47815r20.m16588s(m53251b);
                return false;
            }
        }

        @JvmStatic
        @JvmOverloads
        /* renamed from: j */
        public final void m53243j(Context context, Intent intent, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (z) {
                Z30.m73800d(Z10.f47750b, null, null, new C17019B(context, intent, null), 3, null);
            } else {
                m53248e(context, intent);
            }
        }

        private C17017a() {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        C17017a.m53242k(f68969a, context, intent, false, 4, null);
    }
}
