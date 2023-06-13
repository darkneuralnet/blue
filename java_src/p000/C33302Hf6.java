package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p000.C43664k20;
import p000.InterfaceC39721dO1;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0016\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000\u001a\u001c\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u001a\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002\"\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u000f"}, m28432d2 = {"Landroid/net/Uri;", "", "", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/os/Bundle;", "extras", "Landroid/content/Intent;", C17296a.f69688o, "className", "", "c", "Ljava/lang/String;", "TAG", "android-sdk-ui_release"}, m28431k = 2, m28430mv = {1, 6, 0})
@JvmName(name = "UriUtils")
/* renamed from: Hf6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33302Hf6 {

    /* renamed from: a */
    public static final String f13739a = C43664k20.f93782a.m29432o("UriUtils");

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Hf6$a */
    /* loaded from: classes5.dex */
    public static final class C3202a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<Uri> f13740g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3202a(Ref.ObjectRef<Uri> objectRef) {
            super(0);
            this.f13740g = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Encoded query is null for Uri: " + this.f13740g.element + " Returning empty map for query parameters";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Hf6$b */
    /* loaded from: classes5.dex */
    public static final class C3203b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<Uri> f13741g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3203b(Ref.ObjectRef<Uri> objectRef) {
            super(0);
            this.f13741g = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to map the query parameters of Uri: ", this.f13741g.element);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Hf6$c */
    /* loaded from: classes5.dex */
    public static final class C3204c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f13742g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3204c(String str) {
            super(0);
            this.f13742g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Could not find activity info for class with name: ", this.f13742g);
        }
    }

    /* renamed from: a */
    public static final Intent m103554a(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(C38310b20.f56803a.m65097a().mo44326a(InterfaceC39721dO1.EnumC19746a.URI_UTILS_GET_MAIN_ACTIVITY_INTENT));
        }
        if (bundle != null && launchIntentForPackage != null) {
            launchIntentForPackage.putExtras(bundle);
        }
        return launchIntentForPackage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v9, types: [T, android.net.Uri, java.lang.Object] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Map<String, String> m103553b(Uri uri) {
        boolean z;
        Map<String, String> emptyMap;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = uri;
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            C43664k20.m29441f(C43664k20.f93782a, f13739a, C43664k20.EnumC25082a.V, null, false, new C3202a(objectRef), 12, null);
            emptyMap = MapsKt__MapsKt.emptyMap();
            return emptyMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (((Uri) objectRef.element).isOpaque()) {
                ?? build = Uri.parse("://").buildUpon().encodedQuery(encodedQuery).build();
                Intrinsics.checkNotNullExpressionValue(build, "parse(\"://\")\n           …\n                .build()");
                objectRef.element = build;
            }
            Set<String> queryParameterNames = ((Uri) objectRef.element).getQueryParameterNames();
            Intrinsics.checkNotNullExpressionValue(queryParameterNames, "uri.queryParameterNames");
            ArrayList<String> arrayList = new ArrayList();
            Iterator<T> it = queryParameterNames.iterator();
            while (true) {
                boolean z2 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String str = (String) next;
                if (!((str == null || str.length() == 0) ? true : true)) {
                    arrayList.add(next);
                }
            }
            for (String queryParameterKey : arrayList) {
                String queryParameter = ((Uri) objectRef.element).getQueryParameter(queryParameterKey);
                if (queryParameter != null && queryParameter.length() != 0) {
                    z = false;
                    if (z) {
                        Intrinsics.checkNotNullExpressionValue(queryParameterKey, "queryParameterKey");
                        linkedHashMap.put(queryParameterKey, queryParameter);
                    }
                }
                z = true;
                if (z) {
                }
            }
        } catch (Exception e) {
            C43664k20.m29441f(C43664k20.f93782a, f13739a, C43664k20.EnumC25082a.E, e, false, new C3203b(objectRef), 8, null);
        }
        return linkedHashMap;
    }

    /* renamed from: c */
    public static final boolean m103552c(Context context, String className) {
        PackageManager.ComponentInfoFlags of;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                ComponentName componentName = new ComponentName(context, className);
                of = PackageManager.ComponentInfoFlags.of(0L);
                packageManager.getActivityInfo(componentName, of);
            } else {
                context.getPackageManager().getActivityInfo(new ComponentName(context, className), 0);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            C43664k20.m29441f(C43664k20.f93782a, f13739a, C43664k20.EnumC25082a.W, e, false, new C3204c(className), 8, null);
            return false;
        }
    }
}
