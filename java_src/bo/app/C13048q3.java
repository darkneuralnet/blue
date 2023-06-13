package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0007\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m28432d2 = {"Lbo/app/q3;", "", "", "userId", "", C17296a.f69688o, "()Ljava/lang/String;", "lastUserId", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.q3 */
/* loaded from: classes.dex */
public final class C13048q3 {

    /* renamed from: b */
    public static final C13049a f59126b = new C13049a(null);

    /* renamed from: a */
    private final SharedPreferences f59127a;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u0012\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\n"}, m28432d2 = {"Lbo/app/q3$a;", "", "", "EMPTY_USER_ID", "Ljava/lang/String;", "LAST_USER_KEY", "getLAST_USER_KEY$annotations", "()V", "SHARED_PREFERENCES_NAME", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.q3$a */
    /* loaded from: classes.dex */
    public static final class C13049a {
        public /* synthetic */ C13049a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13049a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.q3$b */
    /* loaded from: classes.dex */
    public static final class C13050b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59128b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13050b(String str) {
            super(0);
            this.f59128b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Stored user ID is longer than 997 bytes. Truncating. Original user ID: ", this.f59128b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.q3$c */
    /* loaded from: classes.dex */
    public static final class C13051c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13051c f59129b = new C13051c();

        public C13051c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "userId is empty in updateLastUserId. Rejecting.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.q3$d */
    /* loaded from: classes.dex */
    public static final class C13052d extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59130b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13052d(String str) {
            super(0);
            this.f59130b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Offline user storage provider was given user ID longer than 997. Rejecting. User ID: ", this.f59130b);
        }
    }

    public C13048q3(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.offline.storagemap", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f59127a = sharedPreferences;
    }

    /* renamed from: a */
    public final String m63095a() {
        String string = this.f59127a.getString("last_user", "");
        String str = string != null ? string : "";
        if (C43318jS5.m30603a(str) > 997) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C13050b(str), 6, null);
            String m30595i = C43318jS5.m30595i(str, 997);
            m63094a(m30595i);
            return m30595i;
        }
        return str;
    }

    /* renamed from: a */
    public final void m63094a(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        if (userId.length() == 0) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C13051c.f59129b, 6, null);
        } else if (C43318jS5.m30603a(userId) > 997) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C13052d(userId), 6, null);
        } else {
            SharedPreferences.Editor edit = this.f59127a.edit();
            edit.putString("last_user", userId);
            edit.apply();
        }
    }
}
