package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.api.Environment;
import com.facebook.share.internal.C17296a;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u001c\u0010\f\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u001c\u0010\u000e\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u001c\u0010\u0010\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0013"}, m28432d2 = {"Lzj6;", "", "", "clientKey", "", "b", "Lcom/adyen/checkout/core/api/Environment;", "environment", C17296a.f69688o, "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "EMAIL_PATTERN", "c", "PHONE_PATTERN", DateTokenConverter.CONVERTER_KEY, "CLIENT_KEY_PATTERN", "<init>", "()V", "components-core_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: zj6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52967zj6 {

    /* renamed from: a */
    public static final C52967zj6 f122125a = new C52967zj6();

    /* renamed from: b */
    public static final Pattern f122126b = Pattern.compile("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", 2);

    /* renamed from: c */
    public static final Pattern f122127c = Pattern.compile("^\\D*(\\d\\D*){9,14}$");

    /* renamed from: d */
    public static final Pattern f122128d = Pattern.compile("([a-z]){4}\\_([A-z]|\\d){32}");

    private C52967zj6() {
    }

    /* renamed from: a */
    public final boolean m469a(String clientKey, Environment environment) {
        boolean z;
        boolean startsWith$default;
        boolean startsWith$default2;
        Intrinsics.checkNotNullParameter(clientKey, "clientKey");
        Intrinsics.checkNotNullParameter(environment, "environment");
        boolean areEqual = Intrinsics.areEqual(environment, Environment.f68430c);
        if (!Intrinsics.areEqual(environment, Environment.f68431d) && !Intrinsics.areEqual(environment, Environment.f68433f) && !Intrinsics.areEqual(environment, Environment.f68432e)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(clientKey, "live_", false, 2, null);
            if (startsWith$default2) {
                return true;
            }
        }
        if (areEqual) {
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(clientKey, "test_", false, 2, null);
            if (startsWith$default) {
                return true;
            }
        }
        if (!z && !areEqual) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m468b(String clientKey) {
        Intrinsics.checkNotNullParameter(clientKey, "clientKey");
        return f122128d.matcher(clientKey).matches();
    }
}
