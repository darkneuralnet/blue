package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.models.cards.Card;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J2\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J.\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J,\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, m28432d2 = {"LeO1;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LwO1;", "inAppMessage", "", "imageUrl", "Landroid/widget/ImageView;", "imageView", "Lw20;", "viewBounds", "", C17296a.f69688o, "Lcom/appboy/models/cards/Card;", "card", "c", "Landroid/os/Bundle;", "extras", "Landroid/graphics/Bitmap;", "e", "b", "", "isOffline", DateTokenConverter.CONVERTER_KEY, "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: eO1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC40313eO1 {
    /* renamed from: a */
    void mo10199a(Context context, InterfaceC50985wO1 interfaceC50985wO1, String str, ImageView imageView, EnumC50778w20 enumC50778w20);

    /* renamed from: b */
    Bitmap mo10198b(Context context, InterfaceC50985wO1 interfaceC50985wO1, String str, EnumC50778w20 enumC50778w20);

    /* renamed from: c */
    void mo10197c(Context context, Card card, String str, ImageView imageView, EnumC50778w20 enumC50778w20);

    /* renamed from: d */
    void mo10196d(boolean z);

    /* renamed from: e */
    Bitmap mo10195e(Context context, Bundle bundle, String str, EnumC50778w20 enumC50778w20);
}
