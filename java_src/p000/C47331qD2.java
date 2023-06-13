package p000;

import android.graphics.drawable.Drawable;
import co.bird.android.model.persistence.nestedstructures.AssetMedia;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a \u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001¨\u0006\u0006"}, m28432d2 = {"Lcom/airbnb/lottie/LottieAnimationView;", "Lco/bird/android/model/persistence/nestedstructures/AssetMedia;", "media", "fallbackMedia", "", C17296a.f69688o, "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLottieAnimationView+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieAnimationView+.kt\nco/bird/android/library/extension/LottieAnimationView_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
/* renamed from: qD2 */
/* loaded from: classes3.dex */
public final class C47331qD2 {
    /* renamed from: a */
    public static final void m17898a(LottieAnimationView lottieAnimationView, AssetMedia assetMedia, AssetMedia assetMedia2) {
        boolean z;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(lottieAnimationView, "<this>");
        boolean z2 = true;
        if (assetMedia != null && assetMedia.isLottieJson()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            lottieAnimationView.setAnimationFromUrl(assetMedia.getMediaUrl());
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.m53539y();
            return;
        }
        Drawable drawable = null;
        if (assetMedia != null) {
            str = assetMedia.getMediaUrl();
        } else {
            str = null;
        }
        if (str != null) {
            if (assetMedia2 != null) {
                if (!(true ^ assetMedia2.isLottieJson())) {
                    assetMedia2 = null;
                }
                if (assetMedia2 != null) {
                    try {
                        drawable = ComponentCallbacks2C17096a.m53137u(lottieAnimationView).m81653k(assetMedia2.getMediaUrl()).m16085d1().get();
                    } catch (Throwable th) {
                        C41318g46.m40161c(th, "Failed to load fallback media, ignoring", new Object[0]);
                    }
                }
            }
            ComponentCallbacks2C17096a.m53137u(lottieAnimationView).m81653k(assetMedia.getMediaUrl()).m97548n0(drawable).m97547o(drawable).m16096R0(lottieAnimationView);
            return;
        }
        if (assetMedia2 == null || !assetMedia2.isLottieJson()) {
            z2 = false;
        }
        if (z2) {
            lottieAnimationView.setAnimationFromUrl(assetMedia2.getMediaUrl());
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.m53539y();
            return;
        }
        if (assetMedia2 != null) {
            str2 = assetMedia2.getMediaUrl();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            ComponentCallbacks2C17096a.m53137u(lottieAnimationView).m81653k(assetMedia2.getMediaUrl()).m16096R0(lottieAnimationView);
        } else {
            lottieAnimationView.setImageDrawable(null);
        }
    }

    public static /* synthetic */ void setMedia$default(LottieAnimationView lottieAnimationView, AssetMedia assetMedia, AssetMedia assetMedia2, int i, Object obj) {
        if ((i & 2) != 0) {
            assetMedia2 = null;
        }
        m17898a(lottieAnimationView, assetMedia, assetMedia2);
    }
}
