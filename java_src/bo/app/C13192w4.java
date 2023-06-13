package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.EnumSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004J&\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u00042\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004¨\u0006\u0011"}, m28432d2 = {"Lbo/app/w4;", "", "Ljava/util/EnumSet;", "Lu20;", "Lcom/braze/enums/MetadataTags;", "sdkMetadata", "", C17296a.f69688o, "newSdkMetadata", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "userId", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.w4 */
/* loaded from: classes.dex */
public final class C13192w4 {

    /* renamed from: b */
    public static final C13193a f59394b = new C13193a(null);

    /* renamed from: a */
    private final SharedPreferences f59395a;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lbo/app/w4$a;", "", "", "DATA_KEY", "Ljava/lang/String;", "STORAGE_PREFIX", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.w4$a */
    /* loaded from: classes.dex */
    public static final class C13193a {
        public /* synthetic */ C13193a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13193a() {
        }
    }

    public C13192w4(Context context, String userId, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.braze.storage.sdk_metadata_cache", C43318jS5.m30601c(context, userId, apiKey)), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…y), Context.MODE_PRIVATE)");
        this.f59395a = sharedPreferences;
    }

    /* renamed from: a */
    public final void m62842a(EnumSet<EnumC49593u20> sdkMetadata) {
        Intrinsics.checkNotNullParameter(sdkMetadata, "sdkMetadata");
        this.f59395a.edit().putStringSet("tags", C13109s0.m62985a(sdkMetadata)).apply();
    }

    /* renamed from: b */
    public final EnumSet<EnumC49593u20> m62841b(EnumSet<EnumC49593u20> newSdkMetadata) {
        Set<String> emptySet;
        Intrinsics.checkNotNullParameter(newSdkMetadata, "newSdkMetadata");
        SharedPreferences sharedPreferences = this.f59395a;
        emptySet = SetsKt__SetsKt.emptySet();
        if (Intrinsics.areEqual(C13109s0.m62985a(newSdkMetadata), sharedPreferences.getStringSet("tags", emptySet))) {
            return null;
        }
        return newSdkMetadata;
    }
}
