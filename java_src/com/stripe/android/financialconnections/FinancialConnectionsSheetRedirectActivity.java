package com.stripe.android.financialconnections;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.stripe.android.financialconnections.debug.DebugConfiguration;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0002J\f\u0010\n\u001a\u00020\t*\u00020\tH\u0002J\u000e\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\tH\u0002¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetRedirectActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "isFinancialConnectionsScheme", "", "Landroid/net/Uri;", "overrideWithDebugConfiguration", "toIntent", "Landroid/content/Intent;", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nFinancialConnectionsSheetRedirectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetRedirectActivity.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetRedirectActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetRedirectActivity extends AppCompatActivity {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String HOST_AUTH_REDIRECT = "auth-redirect";
    @Deprecated
    private static final String HOST_LINK_ACCOUNTS = "link-accounts";
    @Deprecated
    private static final String HOST_NATIVE_LINK_ACCOUNTS = "link-native-accounts";
    @Deprecated
    private static final String HOST_NATIVE_REDIRECT = "native-redirect";

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetRedirectActivity$Companion;", "", "()V", "HOST_AUTH_REDIRECT", "", "HOST_LINK_ACCOUNTS", "HOST_NATIVE_LINK_ACCOUNTS", "HOST_NATIVE_REDIRECT", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final boolean isFinancialConnectionsScheme(Uri uri) {
        return Intrinsics.areEqual(uri.getScheme(), "stripe-auth") || Intrinsics.areEqual(uri.getScheme(), "stripe");
    }

    private final Uri overrideWithDebugConfiguration(Uri uri) {
        String replace$default;
        String replace$default2;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        Boolean overridenNative$financial_connections_release = new DebugConfiguration(application).getOverridenNative$financial_connections_release();
        if (Intrinsics.areEqual(overridenNative$financial_connections_release, Boolean.TRUE)) {
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "toString()");
            replace$default2 = StringsKt__StringsJVMKt.replace$default(uri2, HOST_LINK_ACCOUNTS, HOST_NATIVE_LINK_ACCOUNTS, false, 4, (Object) null);
            Uri parse = Uri.parse(replace$default2);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(toString().replace…ST_NATIVE_LINK_ACCOUNTS))");
            return parse;
        } else if (Intrinsics.areEqual(overridenNative$financial_connections_release, Boolean.FALSE)) {
            String uri3 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri3, "toString()");
            replace$default = StringsKt__StringsJVMKt.replace$default(uri3, HOST_NATIVE_LINK_ACCOUNTS, HOST_LINK_ACCOUNTS, false, 4, (Object) null);
            Uri parse2 = Uri.parse(replace$default);
            Intrinsics.checkNotNullExpressionValue(parse2, "parse(toString().replace…NTS, HOST_LINK_ACCOUNTS))");
            return parse2;
        } else if (overridenNative$financial_connections_release == null) {
            return uri;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.getHost(), com.stripe.android.financialconnections.FinancialConnectionsSheetRedirectActivity.HOST_NATIVE_REDIRECT) != false) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Intent toIntent(Uri uri) {
        Class cls;
        if (isFinancialConnectionsScheme(uri)) {
            cls = FinancialConnectionsSheetNativeActivity.class;
            if (!Intrinsics.areEqual(uri.getHost(), HOST_AUTH_REDIRECT) && !Intrinsics.areEqual(uri.getHost(), HOST_NATIVE_LINK_ACCOUNTS)) {
                cls = FinancialConnectionsSheetActivity.class;
                if (!Intrinsics.areEqual(uri.getHost(), HOST_LINK_ACCOUNTS)) {
                }
            }
            if (cls != null) {
                return null;
            }
            return new Intent(this, cls);
        }
        cls = null;
        if (cls != null) {
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent;
        Intent flags;
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        if (data != null && (intent = toIntent(overrideWithDebugConfiguration(data))) != null && (flags = intent.setFlags(603979776)) != null) {
            flags.setData(getIntent().getData());
            startActivity(flags);
        }
        finish();
    }
}
