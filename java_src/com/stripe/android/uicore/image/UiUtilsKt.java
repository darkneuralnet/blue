package com.stripe.android.uicore.image;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p053io.CloseableKt;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m28432d2 = {"TAG", "", "getDrawableFromUri", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "getResourceId", "Lkotlin/Pair;", "Landroid/content/res/Resources;", "", "isSupportedImageUrl", "", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiUtils.kt\ncom/stripe/android/uicore/image/UiUtilsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n12744#2:125\n12745#2:129\n1747#3,3:126\n*S KotlinDebug\n*F\n+ 1 UiUtils.kt\ncom/stripe/android/uicore/image/UiUtilsKt\n*L\n86#1:125\n86#1:129\n87#1:126,3\n*E\n"})
/* loaded from: classes7.dex */
public final class UiUtilsKt {
    private static final String TAG = "stripe_ui_core_utils";

    public static final Drawable getDrawableFromUri(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String scheme = uri.getScheme();
        if (Intrinsics.areEqual("android.resource", scheme)) {
            try {
                Pair<Resources, Integer> resourceId = getResourceId(context, uri);
                return resourceId.component1().getDrawable(resourceId.component2().intValue(), context.getTheme());
            } catch (Resources.NotFoundException e) {
                Log.e(TAG, "Unable to open content: " + uri, e);
            }
        } else if (!Intrinsics.areEqual("content", scheme) && !Intrinsics.areEqual("file", scheme)) {
            return Drawable.createFromPath(uri.toString());
        } else {
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                Drawable createFromStream = Drawable.createFromStream(openInputStream, uri.toString());
                CloseableKt.closeFinally(openInputStream, null);
                return createFromStream;
            } catch (IOException e2) {
                Log.w(TAG, "Unable to open content: " + uri, e2);
            }
        }
        return null;
    }

    @SuppressLint({"DiscouragedApi"})
    public static final Pair<Resources, Integer> getResourceId(Context context, Uri uri) {
        int parseInt;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!TextUtils.isEmpty(uri.getAuthority())) {
            String authority = uri.getAuthority();
            if (authority != null) {
                Intrinsics.checkNotNullExpressionValue(authority, "requireNotNull(uri.authority)");
                Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(authority);
                Intrinsics.checkNotNullExpressionValue(resourcesForApplication, "packageManager.getResour…ForApplication(authority)");
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size != 1) {
                        if (size == 2) {
                            parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                        } else {
                            throw new FileNotFoundException("More than two path segments: " + uri);
                        }
                    } else {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    }
                    if (parseInt != 0) {
                        return TuplesKt.m28425to(resourcesForApplication, Integer.valueOf(parseInt));
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final boolean isSupportedImageUrl(String str) {
        boolean endsWith;
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        for (ImageType imageType : ImageType.values()) {
            List<String> suffixes = imageType.getSuffixes();
            if (!(suffixes instanceof Collection) || !suffixes.isEmpty()) {
                for (String str2 : suffixes) {
                    endsWith = StringsKt__StringsJVMKt.endsWith(str, str2, true);
                    if (endsWith) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }
}
