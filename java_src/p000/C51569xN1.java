package p000;

import android.text.Html;
import android.text.Spanned;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m28432d2 = {"", "LX10;", "configurationProvider", "", C17296a.f69688o, "Ljava/lang/String;", "TAG", "android-sdk-ui_release"}, m28431k = 2, m28430mv = {1, 6, 0})
@JvmName(name = "HtmlUtils")
/* renamed from: xN1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51569xN1 {

    /* renamed from: a */
    public static final String f117473a = C43664k20.f93782a.m29432o("HtmlUtils");

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: xN1$a */
    /* loaded from: classes2.dex */
    public static final class C30139a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C30139a f117474g = new C30139a();

        public C30139a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Cannot create html spanned text on blank text. Returning blank string.";
        }
    }

    /* renamed from: a */
    public static final CharSequence m5358a(String str, X10 configurationProvider) {
        boolean isBlank;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        isBlank = StringsKt__StringsJVMKt.isBlank(str);
        if (isBlank) {
            C43664k20.m29441f(C43664k20.f93782a, f117473a, null, null, false, C30139a.f117474g, 14, null);
            return str;
        } else if (configurationProvider.isPushNotificationHtmlRenderingEnabled()) {
            Spanned fromHtml = Html.fromHtml(str, 0);
            Intrinsics.checkNotNullExpressionValue(fromHtml, "{\n        if (Build.VERS…tml(this)\n        }\n    }");
            return fromHtml;
        } else {
            return str;
        }
    }
}
