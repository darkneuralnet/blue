package p000;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.facebook.share.internal.C17296a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\"\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0000\u001a\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\u0000\u001a\u0012\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r\u001a\n\u0010\u0010\u001a\u00020\u0000*\u00020\u0000\u001a \u0010\u0014\u001a\u00020\u0012*\u0004\u0018\u00010\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00120\u0011\u001a\u001c\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0002\"\u0014\u0010\u0018\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017¨\u0006\u0019"}, m28432d2 = {"", "reference", "", "h", "g", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "userId", "apiKey", "c", "b", "", C17296a.f69688o, "", "desiredByteLength", "i", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Function1;", "", "block", "f", "userIdHash", "e", "Ljava/lang/String;", "TAG", "android-sdk-base_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: jS5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43318jS5 {

    /* renamed from: a */
    public static final String f92736a = C43664k20.f93782a.m29432o("StringUtils");

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: jS5$a */
    /* loaded from: classes2.dex */
    public static final class C24843a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C24843a f92737g = new C24843a();

        public C24843a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "The saved user id hash was null or empty.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: jS5$b */
    /* loaded from: classes2.dex */
    public static final class C24844b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f92738g;

        /* renamed from: h */
        public final /* synthetic */ String f92739h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24844b(String str, String str2) {
            super(0);
            this.f92738g = str;
            this.f92739h = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Generating MD5 for user id: " + this.f92738g + " apiKey: " + ((Object) this.f92739h);
        }
    }

    /* renamed from: a */
    public static final long m30603a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes.length;
    }

    /* renamed from: b */
    public static final String m30602b(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m30601c(context, str, null);
    }

    /* renamed from: c */
    public static final String m30601c(Context context, String str, String str2) {
        String str3;
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null) {
            str3 = "null";
        } else {
            str3 = str;
        }
        if (Intrinsics.areEqual(str3, "null")) {
            return m30599e("37a6259cc0c1dae299a7866489dff0bd", str2);
        }
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.support.stringutils.cachefilesuffix", 0);
        String string = sharedPreferences.getString("user_id_key", null);
        if (string != null && Intrinsics.areEqual(string, str3)) {
            String string2 = sharedPreferences.getString("user_id_hash_value", null);
            if (!((string2 == null || string2.length() == 0) ? true : true)) {
                return m30599e(string2, str2);
            }
            C43664k20.m29441f(C43664k20.f93782a, f92736a, null, null, false, C24843a.f92737g, 14, null);
        }
        C43664k20.m29441f(C43664k20.f93782a, f92736a, C43664k20.EnumC25082a.V, null, false, new C24844b(str3, str2), 12, null);
        String m30600d = m30600d(str3);
        sharedPreferences.edit().putString("user_id_key", str3).putString("user_id_hash_value", m30600d).apply();
        return m30599e(m30600d, str2);
    }

    /* renamed from: d */
    public static final String m30600d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        BigInteger bigInteger = new BigInteger(1, messageDigest.digest(bytes));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%032x", Arrays.copyOf(new Object[]{bigInteger}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return format;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m30599e(String str, String str2) {
        boolean z;
        boolean isBlank;
        if (str2 != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str2);
            if (!isBlank) {
                z = false;
                if (!z) {
                    return Intrinsics.stringPlus(InstructionFileId.DOT, str);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(CoreConstants.DOT);
                sb.append((Object) str);
                sb.append(CoreConstants.DOT);
                sb.append((Object) str2);
                return sb.toString();
            }
        }
        z = true;
        if (!z) {
        }
    }

    /* renamed from: f */
    public static final void m30598f(String str, Function1<? super String, Unit> block) {
        boolean z;
        Intrinsics.checkNotNullParameter(block, "block");
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            block.invoke(str);
        }
    }

    /* renamed from: g */
    public static final boolean m30597g(String str) {
        boolean isBlank;
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static final boolean m30596h(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: i */
    public static final String m30595i(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (m30603a(str) <= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        int length = charArray.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c = charArray[i2];
            i2++;
            i3 += (int) m30603a(String.valueOf(c));
            if (i3 > i) {
                break;
            }
            sb.append(c);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "truncatedStringBuilder.toString()");
        return sb2;
    }
}
