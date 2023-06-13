package p000;

import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0002¨\u0006\t"}, m28432d2 = {"Landroid/content/Intent;", "intent", "LKV0;", "b", "LcW0;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, C17296a.f69688o, "", DateTokenConverter.CONVERTER_KEY, "deeplink_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeepLinkNavigatorResolverImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeepLinkNavigatorResolverImpl.kt\nco/bird/android/lib/deeplink/DeepLinkNavigatorResolverImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,537:1\n1#2:538\n*E\n"})
/* renamed from: aW0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37995aW0 {
    /* renamed from: a */
    public static final Intent m71272a(Intent intent, AbstractC39181cW0 abstractC39181cW0) {
        KV0 kv0;
        Uri m98829d;
        Intent intent2 = new Intent(intent);
        if (abstractC39181cW0 instanceof KV0) {
            kv0 = (KV0) abstractC39181cW0;
        } else {
            kv0 = null;
        }
        if (kv0 != null && (m98829d = kv0.m98829d()) != null) {
            intent2.setData(m98829d);
        }
        return intent2;
    }

    /* renamed from: b */
    public static final KV0 m71271b(Intent intent) {
        Uri uri;
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        return new KV0(uri, uri, null);
    }

    /* renamed from: c */
    public static /* synthetic */ KV0 m71270c(Intent intent, int i, Object obj) {
        if ((i & 1) != 0) {
            intent = null;
        }
        return m71271b(intent);
    }

    /* renamed from: d */
    public static final boolean m71269d(Intent intent) {
        if (!intent.hasExtra("com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA") && intent.getData() == null) {
            return false;
        }
        return true;
    }
}
