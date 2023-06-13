package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.base.Configuration;
import com.adyen.checkout.core.api.Environment;
import com.adyen.checkout.core.exception.CheckoutException;
import com.facebook.share.internal.C17296a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eB\u0019\b\u0016\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\"J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006#"}, m28432d2 = {"LuA;", "Lcom/adyen/checkout/components/base/Configuration;", "ConfigurationT", "", "Lcom/adyen/checkout/core/api/Environment;", "builderEnvironment", "f", "b", "()Lcom/adyen/checkout/components/base/Configuration;", C17296a.f69688o, "Ljava/util/Locale;", "Ljava/util/Locale;", "e", "()Ljava/util/Locale;", "setBuilderShopperLocale", "(Ljava/util/Locale;)V", "builderShopperLocale", "Lcom/adyen/checkout/core/api/Environment;", DateTokenConverter.CONVERTER_KEY, "()Lcom/adyen/checkout/core/api/Environment;", "setBuilderEnvironment", "(Lcom/adyen/checkout/core/api/Environment;)V", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "setBuilderClientKey", "(Ljava/lang/String;)V", "builderClientKey", "<init>", "(Ljava/util/Locale;Lcom/adyen/checkout/core/api/Environment;Ljava/lang/String;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "clientKey", "(Landroid/content/Context;Ljava/lang/String;)V", "components-core_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: uA */
/* loaded from: classes.dex */
public abstract class AbstractC29103uA<ConfigurationT extends Configuration> {

    /* renamed from: a */
    public Locale f111864a;

    /* renamed from: b */
    public Environment f111865b;

    /* renamed from: c */
    public String f111866c;

    public AbstractC29103uA(Locale builderShopperLocale, Environment builderEnvironment, String builderClientKey) {
        Intrinsics.checkNotNullParameter(builderShopperLocale, "builderShopperLocale");
        Intrinsics.checkNotNullParameter(builderEnvironment, "builderEnvironment");
        Intrinsics.checkNotNullParameter(builderClientKey, "builderClientKey");
        this.f111864a = builderShopperLocale;
        this.f111865b = builderEnvironment;
        this.f111866c = builderClientKey;
        if (!C52967zj6.f122125a.m468b(builderClientKey)) {
            throw new CheckoutException("Client key is not valid.");
        }
    }

    /* renamed from: a */
    public final ConfigurationT m10726a() {
        if (C52967zj6.f122125a.m469a(this.f111866c, this.f111865b)) {
            return mo10725b();
        }
        throw new CheckoutException("Client key does not match the environment.");
    }

    /* renamed from: b */
    public abstract ConfigurationT mo10725b();

    /* renamed from: c */
    public final String m10724c() {
        return this.f111866c;
    }

    /* renamed from: d */
    public final Environment m10723d() {
        return this.f111865b;
    }

    /* renamed from: e */
    public final Locale m10722e() {
        return this.f111864a;
    }

    /* renamed from: f */
    public AbstractC29103uA<ConfigurationT> m10721f(Environment builderEnvironment) {
        Intrinsics.checkNotNullParameter(builderEnvironment, "builderEnvironment");
        this.f111865b = builderEnvironment;
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC29103uA(Context context, String clientKey) {
        this(r3, TEST, clientKey);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientKey, "clientKey");
        Locale m108214a = C32740Ev2.m108214a(context);
        Intrinsics.checkNotNullExpressionValue(m108214a, "getLocale(context)");
        Environment TEST = Environment.f68430c;
        Intrinsics.checkNotNullExpressionValue(TEST, "TEST");
    }
}
