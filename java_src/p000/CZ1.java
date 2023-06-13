package p000;

import android.content.Context;
import android.webkit.JavascriptInterface;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.enums.Gender;
import com.appboy.enums.Month;
import com.appboy.enums.NotificationSubscriptionType;
import com.appboy.events.SimpleValueCallback;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ;2\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010>\u001a\u00020<¢\u0006\u0004\b?\u0010@J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0007J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0007J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002H\u0007J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002H\u0007J\u0012\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0007J\u001a\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\"\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0007J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0007J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0002H\u0007J \u0010)\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0007J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0007J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002H\u0007J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002H\u0007J\u0012\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u000e\u001a\u00020\fH\u0007J\u0014\u00103\u001a\u0004\u0018\u0001022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0007J \u00106\u001a\u00020\u00042\u0006\u00105\u001a\u0002042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0007J#\u00108\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u0001072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b8\u00109J\u0012\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010\n\u001a\u00020\u0002H\u0007R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010=¨\u0006A"}, m28432d2 = {"LCZ1;", "", "", "firstName", "", "setFirstName", "lastName", "setLastName", "email", "setEmail", "genderString", "setGender", "", "year", "monthInt", "day", "setDateOfBirth", "country", "setCountry", "language", "setLanguage", "homeCity", "setHomeCity", "subscriptionType", "setEmailNotificationSubscriptionType", "setPushNotificationSubscriptionType", "phoneNumber", "setPhoneNumber", "key", "jsonStringValue", "setCustomUserAttributeJSON", "jsonArrayString", "setCustomUserAttributeArray", "value", "addToCustomAttributeArray", "removeFromCustomAttributeArray", "attribute", "incrementCustomUserAttribute", "", "latitude", "longitude", "setCustomLocationAttribute", "alias", "label", "addAlias", "subscriptionGroupId", "addToSubscriptionGroup", "removeFromSubscriptionGroup", "Lcom/appboy/enums/Month;", C17296a.f69688o, "Lcom/appboy/enums/NotificationSubscriptionType;", "e", "Lv20;", "user", DateTokenConverter.CONVERTER_KEY, "", "c", "(Ljava/lang/String;)[Ljava/lang/String;", "Lcom/appboy/enums/Gender;", "b", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: CZ1 */
/* loaded from: classes5.dex */
public final class CZ1 {

    /* renamed from: b */
    public static final C1042a f4203b = new C1042a(null);

    /* renamed from: a */
    public final Context f4204a;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$A */
    /* loaded from: classes5.dex */
    public static final class C1039A extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f4205g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1039A(String str) {
            super(1);
            this.f4205g = str;
        }

        /* renamed from: a */
        public final void m112140a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9327y(this.f4205g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112140a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: CZ1$B */
    /* loaded from: classes5.dex */
    public static final class C1040B extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f4206g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1040B(String str) {
            super(0);
            this.f4206g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to parse push subscription type in Braze HTML in-app message javascript interface with subscription: ", this.f4206g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$C */
    /* loaded from: classes5.dex */
    public static final class C1041C extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ NotificationSubscriptionType f4207g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1041C(NotificationSubscriptionType notificationSubscriptionType) {
            super(1);
            this.f4207g = notificationSubscriptionType;
        }

        /* renamed from: a */
        public final void m112139a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9326z(this.f4207g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112139a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\n\u001a\u00020\b*\u00020\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003H\u0002R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"LCZ1$a;", "", "LP10;", "Lkotlin/Function1;", "Lv20;", "Lkotlin/ParameterName;", "name", "user", "", "block", "b", "", "JS_BRIDGE_ATTRIBUTE_VALUE", "Ljava/lang/String;", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$a */
    /* loaded from: classes5.dex */
    public static final class C1042a {

        @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"CZ1$a$a", "Lcom/appboy/events/SimpleValueCallback;", "Lv20;", "user", "", C17296a.f69688o, "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
        /* renamed from: CZ1$a$a */
        /* loaded from: classes5.dex */
        public static final class C1043a extends SimpleValueCallback<C50185v20> {

            /* renamed from: a */
            public final /* synthetic */ Function1<C50185v20, Unit> f4208a;

            /* JADX WARN: Multi-variable type inference failed */
            public C1043a(Function1<? super C50185v20, Unit> function1) {
                this.f4208a = function1;
            }

            @Override // com.appboy.events.SimpleValueCallback, com.appboy.events.IValueCallback
            /* renamed from: a */
            public void onSuccess(C50185v20 user) {
                Intrinsics.checkNotNullParameter(user, "user");
                super.onSuccess(user);
                this.f4208a.invoke(user);
            }
        }

        public /* synthetic */ C1042a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final void m112137b(P10 p10, Function1<? super C50185v20, Unit> function1) {
            p10.getCurrentUser(new C1043a(function1));
        }

        private C1042a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$b */
    /* loaded from: classes5.dex */
    public static final class C1044b extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f4209g;

        /* renamed from: h */
        public final /* synthetic */ String f4210h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1044b(String str, String str2) {
            super(1);
            this.f4209g = str;
            this.f4210h = str2;
        }

        /* renamed from: a */
        public final void m112135a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9351a(this.f4209g, this.f4210h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112135a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$c */
    /* loaded from: classes5.dex */
    public static final class C1045c extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f4211g;

        /* renamed from: h */
        public final /* synthetic */ String f4212h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1045c(String str, String str2) {
            super(1);
            this.f4211g = str;
            this.f4212h = str2;
        }

        /* renamed from: a */
        public final void m112134a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9350b(this.f4211g, this.f4212h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112134a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$d */
    /* loaded from: classes5.dex */
    public static final class C1046d extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f4213g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1046d(String str) {
            super(1);
            this.f4213g = str;
        }

        /* renamed from: a */
        public final void m112133a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9349c(this.f4213g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112133a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$e */
    /* loaded from: classes5.dex */
    public static final class C1047e extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f4214g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1047e(String str) {
            super(1);
            this.f4214g = str;
        }

        /* renamed from: a */
        public final void m112132a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C50185v20.m9346f(it, this.f4214g, 0, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112132a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: CZ1$f */
    /* loaded from: classes5.dex */
    public static final class C1048f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C1048f f4215g = new C1048f();

        public C1048f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to parse custom attribute array";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$g */
    /* loaded from: classes5.dex */
    public static final class C1049g extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f4216g;

        /* renamed from: h */
        public final /* synthetic */ String f4217h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1049g(String str, String str2) {
            super(1);
            this.f4216g = str;
            this.f4217h = str2;
        }

        /* renamed from: a */
        public final void m112131a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9345g(this.f4216g, this.f4217h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112131a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$h */
    /* loaded from: classes5.dex */
    public static final class C1050h extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f4218g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1050h(String str) {
            super(1);
            this.f4218g = str;
        }

        /* renamed from: a */
        public final void m112130a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9344h(this.f4218g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112130a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$i */
    /* loaded from: classes5.dex */
    public static final class C1051i extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f4219g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1051i(String str) {
            super(1);
            this.f4219g = str;
        }

        /* renamed from: a */
        public final void m112129a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9343i(this.f4219g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112129a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: CZ1$j */
    /* loaded from: classes5.dex */
    public static final class C1052j extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f4220g;

        /* renamed from: h */
        public final /* synthetic */ String f4221h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1052j(String str, String str2) {
            super(0);
            this.f4220g = str;
            this.f4221h = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to parse custom attribute type for key: " + this.f4220g + " and json string value: " + this.f4221h;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: CZ1$k */
    /* loaded from: classes5.dex */
    public static final class C1053k extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f4222g;

        /* renamed from: h */
        public final /* synthetic */ String f4223h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1053k(String str, String str2) {
            super(0);
            this.f4222g = str;
            this.f4223h = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to parse custom attribute type for key: " + this.f4222g + " and json string value: " + this.f4223h;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$l */
    /* loaded from: classes5.dex */
    public static final class C1054l extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f4224g;

        /* renamed from: h */
        public final /* synthetic */ double f4225h;

        /* renamed from: i */
        public final /* synthetic */ double f4226i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1054l(String str, double d, double d2) {
            super(1);
            this.f4224g = str;
            this.f4225h = d;
            this.f4226i = d2;
        }

        /* renamed from: a */
        public final void m112128a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9328x(this.f4224g, this.f4225h, this.f4226i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112128a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: CZ1$m */
    /* loaded from: classes5.dex */
    public static final class C1055m extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f4227g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1055m(String str) {
            super(0);
            this.f4227g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set custom attribute array for key ", this.f4227g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$n */
    /* loaded from: classes5.dex */
    public static final class C1056n extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f4228g;

        /* renamed from: h */
        public final /* synthetic */ String[] f4229h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1056n(String str, String[] strArr) {
            super(1);
            this.f4228g = str;
            this.f4229h = strArr;
        }

        /* renamed from: a */
        public final void m112127a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9341k(this.f4228g, this.f4229h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112127a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$o */
    /* loaded from: classes5.dex */
    public static final class C1057o extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f4231h;

        /* renamed from: i */
        public final /* synthetic */ String f4232i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1057o(String str, String str2) {
            super(1);
            this.f4231h = str;
            this.f4232i = str2;
        }

        /* renamed from: a */
        public final void m112126a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            CZ1.this.m112142d(it, this.f4231h, this.f4232i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112126a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: CZ1$p */
    /* loaded from: classes5.dex */
    public static final class C1058p extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f4233g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1058p(int i) {
            super(0);
            this.f4233g = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to parse month for value ", Integer.valueOf(this.f4233g));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$q */
    /* loaded from: classes5.dex */
    public static final class C1059q extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ int f4234g;

        /* renamed from: h */
        public final /* synthetic */ Month f4235h;

        /* renamed from: i */
        public final /* synthetic */ int f4236i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1059q(int i, Month month, int i2) {
            super(1);
            this.f4234g = i;
            this.f4235h = month;
            this.f4236i = i2;
        }

        /* renamed from: a */
        public final void m112125a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9336p(this.f4234g, this.f4235h, this.f4236i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112125a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$r */
    /* loaded from: classes5.dex */
    public static final class C1060r extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f4237g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1060r(String str) {
            super(1);
            this.f4237g = str;
        }

        /* renamed from: a */
        public final void m112124a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9335q(this.f4237g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112124a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: CZ1$s */
    /* loaded from: classes5.dex */
    public static final class C1061s extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f4238g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1061s(String str) {
            super(0);
            this.f4238g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to parse email subscription type in Braze HTML in-app message javascript interface with subscription ", this.f4238g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$t */
    /* loaded from: classes5.dex */
    public static final class C1062t extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ NotificationSubscriptionType f4239g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1062t(NotificationSubscriptionType notificationSubscriptionType) {
            super(1);
            this.f4239g = notificationSubscriptionType;
        }

        /* renamed from: a */
        public final void m112123a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9334r(this.f4239g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112123a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$u */
    /* loaded from: classes5.dex */
    public static final class C1063u extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f4240g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1063u(String str) {
            super(1);
            this.f4240g = str;
        }

        /* renamed from: a */
        public final void m112122a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9333s(this.f4240g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112122a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: CZ1$v */
    /* loaded from: classes5.dex */
    public static final class C1064v extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f4241g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1064v(String str) {
            super(0);
            this.f4241g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to parse gender in Braze HTML in-app message javascript interface with gender: ", this.f4241g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$w */
    /* loaded from: classes5.dex */
    public static final class C1065w extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Gender f4242g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1065w(Gender gender) {
            super(1);
            this.f4242g = gender;
        }

        /* renamed from: a */
        public final void m112121a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9332t(this.f4242g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112121a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$x */
    /* loaded from: classes5.dex */
    public static final class C1066x extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f4243g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1066x(String str) {
            super(1);
            this.f4243g = str;
        }

        /* renamed from: a */
        public final void m112120a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9331u(this.f4243g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112120a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$y */
    /* loaded from: classes5.dex */
    public static final class C1067y extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f4244g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1067y(String str) {
            super(1);
            this.f4244g = str;
        }

        /* renamed from: a */
        public final void m112119a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9330v(this.f4244g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112119a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: CZ1$z */
    /* loaded from: classes5.dex */
    public static final class C1068z extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f4245g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1068z(String str) {
            super(1);
            this.f4245g = str;
        }

        /* renamed from: a */
        public final void m112118a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9329w(this.f4245g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m112118a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    public CZ1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f4204a = context;
    }

    /* renamed from: a */
    public final Month m112145a(int i) {
        if (i < 1 || i > 12) {
            return null;
        }
        return Month.Companion.getMonth(i - 1);
    }

    @JavascriptInterface
    public final void addAlias(String alias, String label) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(label, "label");
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1044b(alias, label));
    }

    @JavascriptInterface
    public final void addToCustomAttributeArray(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1045c(key, value));
    }

    @JavascriptInterface
    public final void addToSubscriptionGroup(String subscriptionGroupId) {
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1046d(subscriptionGroupId));
    }

    /* renamed from: b */
    public final Gender m112144b(String genderString) {
        Intrinsics.checkNotNullParameter(genderString, "genderString");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = genderString.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        Gender gender = Gender.MALE;
        if (Intrinsics.areEqual(lowerCase, gender.forJsonPut())) {
            return gender;
        }
        Gender gender2 = Gender.FEMALE;
        if (Intrinsics.areEqual(lowerCase, gender2.forJsonPut())) {
            return gender2;
        }
        Gender gender3 = Gender.OTHER;
        if (Intrinsics.areEqual(lowerCase, gender3.forJsonPut())) {
            return gender3;
        }
        Gender gender4 = Gender.UNKNOWN;
        if (Intrinsics.areEqual(lowerCase, gender4.forJsonPut())) {
            return gender4;
        }
        Gender gender5 = Gender.NOT_APPLICABLE;
        if (Intrinsics.areEqual(lowerCase, gender5.forJsonPut())) {
            return gender5;
        }
        Gender gender6 = Gender.PREFER_NOT_TO_SAY;
        if (Intrinsics.areEqual(lowerCase, gender6.forJsonPut())) {
            return gender6;
        }
        return null;
    }

    /* renamed from: c */
    public final String[] m112143c(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.getString(i));
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C1048f.f4215g, 4, null);
            return null;
        }
    }

    /* renamed from: d */
    public final void m112142d(C50185v20 user, String key, String jsonStringValue) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(jsonStringValue, "jsonStringValue");
        try {
            Object obj = new JSONObject(jsonStringValue).get("value");
            if (obj instanceof String) {
                user.m9338n(key, (String) obj);
            } else if (obj instanceof Boolean) {
                user.m9337o(key, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                user.m9339m(key, ((Number) obj).intValue());
            } else if (obj instanceof Double) {
                user.m9340l(key, ((Number) obj).doubleValue());
            } else {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C1052j(key, jsonStringValue), 6, null);
            }
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C1053k(key, jsonStringValue), 4, null);
        }
    }

    /* renamed from: e */
    public final NotificationSubscriptionType m112141e(String str) {
        return NotificationSubscriptionType.Companion.fromValue(str);
    }

    @JavascriptInterface
    public final void incrementCustomUserAttribute(String attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1047e(attribute));
    }

    @JavascriptInterface
    public final void removeFromCustomAttributeArray(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1049g(key, value));
    }

    @JavascriptInterface
    public final void removeFromSubscriptionGroup(String subscriptionGroupId) {
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1050h(subscriptionGroupId));
    }

    @JavascriptInterface
    public final void setCountry(String str) {
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1051i(str));
    }

    @JavascriptInterface
    public final void setCustomLocationAttribute(String attribute, double d, double d2) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1054l(attribute, d, d2));
    }

    @JavascriptInterface
    public final void setCustomUserAttributeArray(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        String[] m112143c = m112143c(str);
        if (m112143c == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C1055m(key), 6, null);
            return;
        }
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1056n(key, m112143c));
    }

    @JavascriptInterface
    public final void setCustomUserAttributeJSON(String key, String jsonStringValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(jsonStringValue, "jsonStringValue");
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1057o(key, jsonStringValue));
    }

    @JavascriptInterface
    public final void setDateOfBirth(int i, int i2, int i3) {
        Month m112145a = m112145a(i2);
        if (m112145a == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C1058p(i2), 6, null);
            return;
        }
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1059q(i, m112145a, i3));
    }

    @JavascriptInterface
    public final void setEmail(String str) {
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1060r(str));
    }

    @JavascriptInterface
    public final void setEmailNotificationSubscriptionType(String subscriptionType) {
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        NotificationSubscriptionType m112141e = m112141e(subscriptionType);
        if (m112141e == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C1061s(subscriptionType), 6, null);
            return;
        }
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1062t(m112141e));
    }

    @JavascriptInterface
    public final void setFirstName(String str) {
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1063u(str));
    }

    @JavascriptInterface
    public final void setGender(String genderString) {
        Intrinsics.checkNotNullParameter(genderString, "genderString");
        Gender m112144b = m112144b(genderString);
        if (m112144b == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C1064v(genderString), 6, null);
            return;
        }
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1065w(m112144b));
    }

    @JavascriptInterface
    public final void setHomeCity(String str) {
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1066x(str));
    }

    @JavascriptInterface
    public final void setLanguage(String str) {
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1067y(str));
    }

    @JavascriptInterface
    public final void setLastName(String str) {
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1068z(str));
    }

    @JavascriptInterface
    public final void setPhoneNumber(String str) {
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1039A(str));
    }

    @JavascriptInterface
    public final void setPushNotificationSubscriptionType(String subscriptionType) {
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        NotificationSubscriptionType m112141e = m112141e(subscriptionType);
        if (m112141e == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C1040B(subscriptionType), 6, null);
            return;
        }
        C1042a c1042a = f4203b;
        P10 p10 = P10.getInstance(this.f4204a);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c1042a.m112137b(p10, new C1041C(m112141e));
    }
}
