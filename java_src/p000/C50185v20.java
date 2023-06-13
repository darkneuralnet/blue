package p000;

import bo.app.C12507a0;
import bo.app.C12521a5;
import bo.app.C12749j;
import bo.app.C13023p6;
import bo.app.EnumC12984o5;
import bo.app.InterfaceC12742i2;
import bo.app.InterfaceC13160u1;
import bo.app.InterfaceC13231y1;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.enums.Gender;
import com.appboy.enums.Month;
import com.appboy.enums.NotificationSubscriptionType;
import com.facebook.share.internal.C17296a;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010;\u001a\u00020\u0002\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rJ\u001e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010J\u0010\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001cJ\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0002J\u000e\u0010#\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0002J\u0010\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0002J\u0016\u0010(\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0005J\u0016\u0010)\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0010J\u0016\u0010*\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002J\u0016\u0010,\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020+J\u0016\u0010-\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002J\u0016\u0010.\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002J%\u00101\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020/¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\b\b\u0002\u00103\u001a\u00020\u0010H\u0007J\u001e\u00108\u001a\u0002072\u0006\u0010&\u001a\u00020\u00022\u0006\u00105\u001a\u00020+2\u0006\u00106\u001a\u00020+J\u0016\u00109\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0001R\u0016\u0010;\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R$\u0010@\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006O"}, m28432d2 = {"Lv20;", "", "", "alias", "label", "", C17296a.f69688o, "firstName", "s", "lastName", "w", "email", "q", "Lcom/appboy/enums/Gender;", "gender", "t", "", "year", "Lcom/appboy/enums/Month;", "month", "day", "p", "country", "i", "homeCity", "u", "language", "v", "Lcom/appboy/enums/NotificationSubscriptionType;", "emailNotificationSubscriptionType", "r", "pushNotificationSubscriptionType", "z", "subscriptionGroupId", "c", "h", "phoneNumber", "y", "key", "value", "o", "m", "n", "", "l", "b", "g", "", "values", "k", "(Ljava/lang/String;[Ljava/lang/String;)Z", "incrementValue", "e", "latitude", "longitude", "", "x", "j", "Ljava/lang/String;", "internalUserId", "Ljava/util/concurrent/locks/ReentrantLock;", "f", "Ljava/util/concurrent/locks/ReentrantLock;", "userIdLock", "userId", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "A", "(Ljava/lang/String;)V", "Lbo/app/p6;", "userCache", "Lbo/app/y1;", "brazeManager", "Lbo/app/i2;", "locationManager", "Lbo/app/a5;", "serverConfigStorageProvider", "<init>", "(Lbo/app/p6;Lbo/app/y1;Ljava/lang/String;Lbo/app/i2;Lbo/app/a5;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: v20  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50185v20 {

    /* renamed from: a */
    public final C13023p6 f113365a;

    /* renamed from: b */
    public final InterfaceC13231y1 f113366b;

    /* renamed from: c */
    public volatile String f113367c;

    /* renamed from: d */
    public final InterfaceC12742i2 f113368d;

    /* renamed from: e */
    public final C12521a5 f113369e;

    /* renamed from: f */
    public final ReentrantLock f113370f;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$A */
    /* loaded from: classes2.dex */
    public static final class C29359A extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113371g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29359A(String str) {
            super(0);
            this.f113371g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set country to: ", this.f113371g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$B */
    /* loaded from: classes2.dex */
    public static final class C29360B extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C29360B f113372g = new C29360B();

        public C29360B() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Invalid last name parameter: last name is required to be non-empty. Not setting last name.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$C */
    /* loaded from: classes2.dex */
    public static final class C29361C extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C29361C f113373g = new C29361C();

        public C29361C() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute key cannot be null.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$D */
    /* loaded from: classes2.dex */
    public static final class C29362D extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113374g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29362D(String str) {
            super(0);
            this.f113374g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set last name to: ", this.f113374g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$E */
    /* loaded from: classes2.dex */
    public static final class C29363E extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Object f113375g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29363E(Object obj) {
            super(0);
            this.f113375g = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Error parsing date ", this.f113375g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$F */
    /* loaded from: classes2.dex */
    public static final class C29364F extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C29364F f113376g = new C29364F();

        public C29364F() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Custom location attribute key was invalid. Not setting attribute.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$G */
    /* loaded from: classes2.dex */
    public static final class C29365G extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113377g;

        /* renamed from: h */
        public final /* synthetic */ Object f113378h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29365G(String str, Object obj) {
            super(0);
            this.f113377g = str;
            this.f113378h = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Could not add unsupported custom attribute type with key: " + this.f113377g + " and value: " + this.f113378h;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$H */
    /* loaded from: classes2.dex */
    public static final class C29366H extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ double f113379g;

        /* renamed from: h */
        public final /* synthetic */ double f113380h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29366H(double d, double d2) {
            super(0);
            this.f113379g = d;
            this.f113380h = d2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cannot set custom location attribute due with invalid latitude '" + this.f113379g + " and longitude '" + this.f113380h + CoreConstants.SINGLE_QUOTE_CHAR;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$I */
    /* loaded from: classes2.dex */
    public static final class C29367I extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113381g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29367I(String str) {
            super(0);
            this.f113381g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set custom attribute array with key: '" + this.f113381g + "'.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$J */
    /* loaded from: classes2.dex */
    public static final class C29368J extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113382g;

        /* renamed from: h */
        public final /* synthetic */ double f113383h;

        /* renamed from: i */
        public final /* synthetic */ double f113384i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29368J(String str, double d, double d2) {
            super(0);
            this.f113382g = str;
            this.f113383h = d;
            this.f113384i = d2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set custom location attribute with key '" + this.f113382g + "' and latitude '" + this.f113383h + "' and longitude '" + this.f113384i + CoreConstants.SINGLE_QUOTE_CHAR;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$K */
    /* loaded from: classes2.dex */
    public static final class C29369K extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113385g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29369K(String str) {
            super(0);
            this.f113385g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set custom boolean attribute " + this.f113385g + CoreConstants.DOT;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$L */
    /* loaded from: classes2.dex */
    public static final class C29370L extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C29370L f113386g = new C29370L();

        public C29370L() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Invalid phone number parameter: phone number is required to be non-empty. Not setting phone number.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$M */
    /* loaded from: classes2.dex */
    public static final class C29371M extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113387g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29371M(String str) {
            super(0);
            this.f113387g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set custom integer attribute " + this.f113387g + CoreConstants.DOT;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$N */
    /* loaded from: classes2.dex */
    public static final class C29372N extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113388g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29372N(String str) {
            super(0);
            this.f113388g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): ", this.f113388g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$O */
    /* loaded from: classes2.dex */
    public static final class C29373O extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113389g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29373O(String str) {
            super(0);
            this.f113389g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set phone number to: ", this.f113389g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$P */
    /* loaded from: classes2.dex */
    public static final class C29374P extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ NotificationSubscriptionType f113390g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29374P(NotificationSubscriptionType notificationSubscriptionType) {
            super(0);
            this.f113390g = notificationSubscriptionType;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set push notification subscription to: ", this.f113390g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$Q */
    /* loaded from: classes2.dex */
    public static final class C29375Q extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113391g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29375Q(String str) {
            super(0);
            this.f113391g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set custom string attribute " + this.f113391g + CoreConstants.DOT;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$R */
    /* loaded from: classes2.dex */
    public static final class C29376R extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113392g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29376R(String str) {
            super(0);
            this.f113392g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set custom double attribute " + this.f113392g + CoreConstants.DOT;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$a */
    /* loaded from: classes2.dex */
    public static final class C29377a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C29377a f113393g = new C29377a();

        public C29377a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Invalid alias parameter: alias is required to be non-null and non-empty. Not adding alias.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$b */
    /* loaded from: classes2.dex */
    public static final class C29378b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f113394g;

        /* renamed from: h */
        public final /* synthetic */ Month f113395h;

        /* renamed from: i */
        public final /* synthetic */ int f113396i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29378b(int i, Month month, int i2) {
            super(0);
            this.f113394g = i;
            this.f113395h = month;
            this.f113396i = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set date of birth to: " + this.f113394g + CoreConstants.DASH_CHAR + this.f113395h.getValue() + CoreConstants.DASH_CHAR + this.f113396i;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$c */
    /* loaded from: classes2.dex */
    public static final class C29379c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C29379c f113397g = new C29379c();

        public C29379c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Invalid label parameter: label is required to be non-null and non-empty. Not adding alias.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$d */
    /* loaded from: classes2.dex */
    public static final class C29380d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C29380d f113398g = new C29380d();

        public C29380d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Invalid email parameter: email is required to be non-empty. Not setting email.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$e */
    /* loaded from: classes2.dex */
    public static final class C29381e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113399g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29381e(String str) {
            super(0);
            this.f113399g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set alias: ", this.f113399g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$f */
    /* loaded from: classes2.dex */
    public static final class C29382f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113400g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29382f(String str) {
            super(0);
            this.f113400g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Email address is not valid: ", this.f113400g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$g */
    /* loaded from: classes2.dex */
    public static final class C29383g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113401g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29383g(String str) {
            super(0);
            this.f113401g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("User object user id set to: ", this.f113401g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$h */
    /* loaded from: classes2.dex */
    public static final class C29384h extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C29384h f113402g = new C29384h();

        public C29384h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute key was invalid. Not adding to attribute array.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$i */
    /* loaded from: classes2.dex */
    public static final class C29385i extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113403g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29385i(String str) {
            super(0);
            this.f113403g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set email to: ", this.f113403g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$j */
    /* loaded from: classes2.dex */
    public static final class C29386j extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113404g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29386j(String str) {
            super(0);
            this.f113404g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to add custom attribute with key '" + this.f113404g + "'.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$k */
    /* loaded from: classes2.dex */
    public static final class C29387k extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ NotificationSubscriptionType f113405g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29387k(NotificationSubscriptionType notificationSubscriptionType) {
            super(0);
            this.f113405g = notificationSubscriptionType;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set email notification subscription to: ", this.f113405g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$l */
    /* loaded from: classes2.dex */
    public static final class C29388l extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C29388l f113406g = new C29388l();

        public C29388l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not adding user to subscription group.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$m */
    /* loaded from: classes2.dex */
    public static final class C29389m extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113407g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29389m(String str) {
            super(0);
            this.f113407g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to add user to subscription group ", this.f113407g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$n */
    /* loaded from: classes2.dex */
    public static final class C29390n extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C29390n f113408g = new C29390n();

        public C29390n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Invalid first name parameter: first name is required to be non-empty. Not setting first name.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$o */
    /* loaded from: classes2.dex */
    public static final class C29391o extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113409g;

        /* renamed from: h */
        public final /* synthetic */ int f113410h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29391o(String str, int i) {
            super(0);
            this.f113409g = str;
            this.f113410h = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to increment custom attribute " + this.f113409g + " by " + this.f113410h + CoreConstants.DOT;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$p */
    /* loaded from: classes2.dex */
    public static final class C29392p extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113411g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29392p(String str) {
            super(0);
            this.f113411g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set first name to: ", this.f113411g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$q */
    /* loaded from: classes2.dex */
    public static final class C29393q extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C29393q f113412g = new C29393q();

        public C29393q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute key was invalid. Not removing from attribute array.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$r */
    /* loaded from: classes2.dex */
    public static final class C29394r extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Gender f113413g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29394r(Gender gender) {
            super(0);
            this.f113413g = gender;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set gender to: ", this.f113413g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$s */
    /* loaded from: classes2.dex */
    public static final class C29395s extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113414g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29395s(String str) {
            super(0);
            this.f113414g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to remove custom attribute with key '" + this.f113414g + "'.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$t */
    /* loaded from: classes2.dex */
    public static final class C29396t extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C29396t f113415g = new C29396t();

        public C29396t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Invalid home city parameter: home city is required to be non-blank. Not setting home city.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$u */
    /* loaded from: classes2.dex */
    public static final class C29397u extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C29397u f113416g = new C29397u();

        public C29397u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not removing user from subscription group.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$v */
    /* loaded from: classes2.dex */
    public static final class C29398v extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113417g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29398v(String str) {
            super(0);
            this.f113417g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set home city to: ", this.f113417g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$w */
    /* loaded from: classes2.dex */
    public static final class C29399w extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113418g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29399w(String str) {
            super(0);
            this.f113418g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to remove user from subscription group ", this.f113418g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$x */
    /* loaded from: classes2.dex */
    public static final class C29400x extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C29400x f113419g = new C29400x();

        public C29400x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Invalid language parameter: language is required to be non-empty. Not setting language.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$y */
    /* loaded from: classes2.dex */
    public static final class C29401y extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f113420g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29401y(String str) {
            super(0);
            this.f113420g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set language to: ", this.f113420g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: v20$z */
    /* loaded from: classes2.dex */
    public static final class C29402z extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C29402z f113421g = new C29402z();

        public C29402z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Invalid country parameter: country is required to be non-blank. Not setting country.";
        }
    }

    public C50185v20(C13023p6 userCache, InterfaceC13231y1 brazeManager, String internalUserId, InterfaceC12742i2 locationManager, C12521a5 serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(userCache, "userCache");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(internalUserId, "internalUserId");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.f113365a = userCache;
        this.f113366b = brazeManager;
        this.f113367c = internalUserId;
        this.f113368d = locationManager;
        this.f113369e = serverConfigStorageProvider;
        this.f113370f = new ReentrantLock();
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m9346f(C50185v20 c50185v20, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return c50185v20.m9347e(str, i);
    }

    /* renamed from: A */
    public final void m9352A(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C29383g(userId), 6, null);
        ReentrantLock reentrantLock = this.f113370f;
        reentrantLock.lock();
        try {
            if (!Intrinsics.areEqual(this.f113367c, "") && !Intrinsics.areEqual(this.f113367c, userId)) {
                throw new IllegalArgumentException("setExternalId can not be used to change the external ID of a UserCache from a non-empty value to a new value. Was: [" + this.f113367c + "], tried to change to: [" + userId + ']');
            }
            this.f113367c = userId;
            this.f113365a.m63123i(userId);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    public final boolean m9351a(String alias, String label) {
        boolean isBlank;
        boolean isBlank2;
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(label, "label");
        isBlank = StringsKt__StringsJVMKt.isBlank(alias);
        if (isBlank) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C29377a.f113393g, 6, null);
            return false;
        }
        isBlank2 = StringsKt__StringsJVMKt.isBlank(label);
        if (isBlank2) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C29379c.f113397g, 6, null);
            return false;
        }
        try {
            InterfaceC13160u1 m63545g = C12749j.f58647h.m63545g(alias, label);
            if (m63545g == null) {
                return false;
            }
            return this.f113366b.mo62756a(m63545g);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C29381e(alias), 4, null);
            return false;
        }
    }

    /* renamed from: b */
    public final boolean m9350b(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            if (!C12507a0.m63961a(key, this.f113369e.m63940b())) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C29384h.f113402g, 6, null);
                return false;
            } else if (!C12507a0.m63962a(value)) {
                return false;
            } else {
                InterfaceC13160u1 m63566a = C12749j.f58647h.m63566a(C51781xj6.m4786b(key), C51781xj6.m4786b(value));
                if (m63566a == null) {
                    return false;
                }
                return this.f113366b.mo62756a(m63566a);
            }
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29386j(key), 4, null);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean m9349c(String subscriptionGroupId) {
        boolean isBlank;
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        try {
            isBlank = StringsKt__StringsJVMKt.isBlank(subscriptionGroupId);
            if (isBlank) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C29388l.f113406g, 6, null);
                return false;
            }
            InterfaceC13160u1 m63567a = C12749j.f58647h.m63567a(subscriptionGroupId, EnumC12984o5.SUBSCRIBED);
            if (m63567a != null) {
                this.f113366b.mo62756a(m63567a);
                return true;
            }
            return true;
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29389m(subscriptionGroupId), 4, null);
            return false;
        }
    }

    /* renamed from: d */
    public final String m9348d() {
        ReentrantLock reentrantLock = this.f113370f;
        reentrantLock.lock();
        try {
            return this.f113367c;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: e */
    public final boolean m9347e(String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!C12507a0.m63961a(key, this.f113369e.m63940b())) {
                return false;
            }
            InterfaceC13160u1 m63568a = C12749j.f58647h.m63568a(C51781xj6.m4786b(key), i);
            if (m63568a == null) {
                return false;
            }
            return this.f113366b.mo62756a(m63568a);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29391o(key, i), 4, null);
            return false;
        }
    }

    /* renamed from: g */
    public final boolean m9345g(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            if (!C12507a0.m63961a(key, this.f113369e.m63940b())) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C29393q.f113412g, 6, null);
                return false;
            } else if (!C12507a0.m63962a(value)) {
                return false;
            } else {
                InterfaceC13160u1 m63547f = C12749j.f58647h.m63547f(C51781xj6.m4786b(key), C51781xj6.m4786b(value));
                if (m63547f == null) {
                    return false;
                }
                return this.f113366b.mo62756a(m63547f);
            }
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29395s(key), 4, null);
            return false;
        }
    }

    /* renamed from: h */
    public final boolean m9344h(String subscriptionGroupId) {
        boolean isBlank;
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        try {
            isBlank = StringsKt__StringsJVMKt.isBlank(subscriptionGroupId);
            if (isBlank) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C29397u.f113416g, 6, null);
                return false;
            }
            InterfaceC13160u1 m63567a = C12749j.f58647h.m63567a(subscriptionGroupId, EnumC12984o5.UNSUBSCRIBED);
            if (m63567a != null) {
                this.f113366b.mo62756a(m63567a);
                return true;
            }
            return true;
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29399w(subscriptionGroupId), 4, null);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:5:0x0005, B:10:0x0010, B:12:0x001f), top: B:17:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f A[Catch: Exception -> 0x0025, TRY_LEAVE, TryCatch #0 {Exception -> 0x0025, blocks: (B:5:0x0005, B:10:0x0010, B:12:0x001f), top: B:17:0x0005 }] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m9343i(String str) {
        boolean isBlank;
        boolean z;
        if (str != null) {
            try {
                isBlank = StringsKt__StringsJVMKt.isBlank(str);
                if (isBlank) {
                    z = true;
                    if (!z) {
                        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C29402z.f113421g, 6, null);
                        return false;
                    }
                    this.f113365a.m63144a(str);
                    return true;
                }
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29359A(str), 4, null);
                return false;
            }
        }
        z = false;
        if (!z) {
        }
    }

    /* renamed from: j */
    public final boolean m9342j(String key, Object value) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!C12507a0.m63961a(key, this.f113369e.m63940b())) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C29361C.f113373g, 6, null);
            return false;
        }
        String m4786b = C51781xj6.m4786b(key);
        boolean z4 = true;
        if (value instanceof Boolean) {
            z = true;
        } else {
            z = value instanceof Integer;
        }
        if (z) {
            z2 = true;
        } else {
            z2 = value instanceof Float;
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = value instanceof Long;
        }
        if (!z3) {
            z4 = value instanceof Double;
        }
        if (z4) {
            return this.f113365a.m63143a(m4786b, value);
        }
        if (value instanceof String) {
            return this.f113365a.m63143a(m4786b, C51781xj6.m4786b((String) value));
        } else if (value instanceof Date) {
            try {
                return this.f113365a.m63143a(m4786b, C46287oT0.m21031e((Date) value, EnumC37717a20.LONG, null, 2, null));
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C29363E(value), 4, null);
                return false;
            }
        } else {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C29365G(key, value), 6, null);
            return false;
        }
    }

    /* renamed from: k */
    public final boolean m9341k(String key, String[] values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        try {
            if (!C12507a0.m63961a(key, this.f113369e.m63940b())) {
                return false;
            }
            InterfaceC13160u1 m63560a = C12749j.f58647h.m63560a(C51781xj6.m4786b(key), C12507a0.m63960a(values));
            if (m63560a == null) {
                return false;
            }
            return this.f113366b.mo62756a(m63560a);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29367I(key), 4, null);
            return false;
        }
    }

    /* renamed from: l */
    public final boolean m9340l(String key, double d) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return m9342j(key, Double.valueOf(d));
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29376R(key), 4, null);
            return false;
        }
    }

    /* renamed from: m */
    public final boolean m9339m(String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return m9342j(key, Integer.valueOf(i));
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29371M(key), 4, null);
            return false;
        }
    }

    /* renamed from: n */
    public final boolean m9338n(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return m9342j(key, value);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29375Q(key), 4, null);
            return false;
        }
    }

    /* renamed from: o */
    public final boolean m9337o(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return m9342j(key, Boolean.valueOf(z));
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29369K(key), 4, null);
            return false;
        }
    }

    /* renamed from: p */
    public final boolean m9336p(int i, Month month, int i2) {
        Date m21035a;
        Intrinsics.checkNotNullParameter(month, "month");
        try {
            m21035a = C46287oT0.m21035a(i, month.getValue(), i2, (r13 & 8) != 0 ? 0 : 0, (r13 & 16) != 0 ? 0 : 0, (r13 & 32) != 0 ? 0 : 0);
            return this.f113365a.m63139b(C46287oT0.m21031e(m21035a, EnumC37717a20.SHORT, null, 2, null));
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29378b(i, month, i2), 4, null);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010 A[Catch: Exception -> 0x0079, TryCatch #0 {Exception -> 0x0079, blocks: (B:5:0x0005, B:10:0x0010, B:32:0x005a, B:35:0x0061, B:37:0x0072, B:14:0x0023, B:19:0x0031, B:26:0x0046, B:29:0x004c, B:30:0x004f), top: B:42:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m9335q(String str) {
        boolean isBlank;
        boolean z;
        String obj;
        int i;
        boolean z2;
        if (str != null) {
            try {
                isBlank = StringsKt__StringsJVMKt.isBlank(str);
                if (isBlank) {
                    z = true;
                    if (!z) {
                        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C29380d.f113398g, 6, null);
                        return false;
                    }
                    if (str == null) {
                        obj = null;
                    } else {
                        int length = str.length() - 1;
                        int i2 = 0;
                        boolean z3 = false;
                        while (i2 <= length) {
                            if (!z3) {
                                i = i2;
                            } else {
                                i = length;
                            }
                            if (Intrinsics.compare((int) str.charAt(i), 32) <= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z3) {
                                if (!z2) {
                                    z3 = true;
                                } else {
                                    i2++;
                                }
                            } else if (!z2) {
                                break;
                            } else {
                                length--;
                            }
                        }
                        obj = str.subSequence(i2, length + 1).toString();
                    }
                    if (obj != null && !C51781xj6.m4785c(obj)) {
                        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C29382f(str), 7, null);
                        return false;
                    }
                    return this.f113365a.m63136c(obj);
                }
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29385i(str), 4, null);
                return false;
            }
        }
        z = false;
        if (!z) {
        }
    }

    /* renamed from: r */
    public final boolean m9334r(NotificationSubscriptionType emailNotificationSubscriptionType) {
        Intrinsics.checkNotNullParameter(emailNotificationSubscriptionType, "emailNotificationSubscriptionType");
        try {
            this.f113365a.m63145a(emailNotificationSubscriptionType);
            return true;
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29387k(emailNotificationSubscriptionType), 4, null);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:5:0x0005, B:10:0x0010, B:12:0x001f), top: B:17:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f A[Catch: Exception -> 0x0025, TRY_LEAVE, TryCatch #0 {Exception -> 0x0025, blocks: (B:5:0x0005, B:10:0x0010, B:12:0x001f), top: B:17:0x0005 }] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m9333s(String str) {
        boolean isBlank;
        boolean z;
        if (str != null) {
            try {
                isBlank = StringsKt__StringsJVMKt.isBlank(str);
                if (isBlank) {
                    z = true;
                    if (!z) {
                        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C29390n.f113408g, 6, null);
                        return false;
                    }
                    this.f113365a.m63133d(str);
                    return true;
                }
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29392p(str), 4, null);
                return false;
            }
        }
        z = false;
        if (!z) {
        }
    }

    /* renamed from: t */
    public final boolean m9332t(Gender gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        try {
            this.f113365a.m63146a(gender);
            return true;
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29394r(gender), 4, null);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:5:0x0005, B:10:0x0010, B:12:0x001f), top: B:17:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f A[Catch: Exception -> 0x0025, TRY_LEAVE, TryCatch #0 {Exception -> 0x0025, blocks: (B:5:0x0005, B:10:0x0010, B:12:0x001f), top: B:17:0x0005 }] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m9331u(String str) {
        boolean isBlank;
        boolean z;
        if (str != null) {
            try {
                isBlank = StringsKt__StringsJVMKt.isBlank(str);
                if (isBlank) {
                    z = true;
                    if (!z) {
                        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C29396t.f113415g, 6, null);
                        return false;
                    }
                    this.f113365a.m63131e(str);
                    return true;
                }
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29398v(str), 4, null);
                return false;
            }
        }
        z = false;
        if (!z) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:5:0x0005, B:10:0x0010, B:12:0x001f), top: B:17:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f A[Catch: Exception -> 0x0025, TRY_LEAVE, TryCatch #0 {Exception -> 0x0025, blocks: (B:5:0x0005, B:10:0x0010, B:12:0x001f), top: B:17:0x0005 }] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m9330v(String str) {
        boolean isBlank;
        boolean z;
        if (str != null) {
            try {
                isBlank = StringsKt__StringsJVMKt.isBlank(str);
                if (isBlank) {
                    z = true;
                    if (!z) {
                        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C29400x.f113419g, 6, null);
                        return false;
                    }
                    this.f113365a.m63129f(str);
                    return true;
                }
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29401y(str), 4, null);
                return false;
            }
        }
        z = false;
        if (!z) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:5:0x0005, B:10:0x0010, B:12:0x001f), top: B:17:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f A[Catch: Exception -> 0x0025, TRY_LEAVE, TryCatch #0 {Exception -> 0x0025, blocks: (B:5:0x0005, B:10:0x0010, B:12:0x001f), top: B:17:0x0005 }] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m9329w(String str) {
        boolean isBlank;
        boolean z;
        if (str != null) {
            try {
                isBlank = StringsKt__StringsJVMKt.isBlank(str);
                if (isBlank) {
                    z = true;
                    if (!z) {
                        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C29360B.f113372g, 6, null);
                        return false;
                    }
                    this.f113365a.m63127g(str);
                    return true;
                }
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29362D(str), 4, null);
                return false;
            }
        }
        z = false;
        if (!z) {
        }
    }

    /* renamed from: x */
    public final void m9328x(String key, double d, double d2) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!C12507a0.m63961a(key, this.f113369e.m63940b())) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C29364F.f113376g, 6, null);
            } else if (!C51781xj6.m4784d(d, d2)) {
                try {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C29366H(d, d2), 6, null);
                } catch (Exception e) {
                    e = e;
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29368J(key, d, d2), 4, null);
                }
            } else {
                InterfaceC13160u1 m63569a = C12749j.f58647h.m63569a(C51781xj6.m4786b(key), d, d2);
                if (m63569a != null) {
                    this.f113366b.mo62756a(m63569a);
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010 A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:5:0x0005, B:10:0x0010, B:32:0x005a, B:35:0x0061, B:37:0x0073, B:14:0x0023, B:19:0x0031, B:26:0x0046, B:29:0x004c, B:30:0x004f), top: B:42:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m9327y(String str) {
        boolean isBlank;
        boolean z;
        String obj;
        int i;
        boolean z2;
        if (str != null) {
            try {
                isBlank = StringsKt__StringsJVMKt.isBlank(str);
                if (isBlank) {
                    z = true;
                    if (!z) {
                        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C29370L.f113386g, 6, null);
                        return false;
                    }
                    if (str == null) {
                        obj = null;
                    } else {
                        int length = str.length() - 1;
                        int i2 = 0;
                        boolean z3 = false;
                        while (i2 <= length) {
                            if (!z3) {
                                i = i2;
                            } else {
                                i = length;
                            }
                            if (Intrinsics.compare((int) str.charAt(i), 32) <= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z3) {
                                if (!z2) {
                                    z3 = true;
                                } else {
                                    i2++;
                                }
                            } else if (!z2) {
                                break;
                            } else {
                                length--;
                            }
                        }
                        obj = str.subSequence(i2, length + 1).toString();
                    }
                    if (obj != null && !C51781xj6.m4781g(obj)) {
                        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C29372N(obj), 6, null);
                        return false;
                    }
                    return this.f113365a.m63125h(obj);
                }
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29373O(str), 4, null);
                return false;
            }
        }
        z = false;
        if (!z) {
        }
    }

    /* renamed from: z */
    public final boolean m9326z(NotificationSubscriptionType pushNotificationSubscriptionType) {
        Intrinsics.checkNotNullParameter(pushNotificationSubscriptionType, "pushNotificationSubscriptionType");
        try {
            this.f113365a.m63141b(pushNotificationSubscriptionType);
            return true;
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C29374P(pushNotificationSubscriptionType), 4, null);
            return false;
        }
    }
}
