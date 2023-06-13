package co.bird.android.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001$B\u0011\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001b\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u001b\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006%"}, m28432d2 = {"Lco/bird/android/widget/RemovableImageView;", "Landroid/widget/FrameLayout;", "", "imageUrl", "", "setImage", "Landroid/net/Uri;", "uri", "b", "Ljava/lang/String;", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "c", "Landroid/net/Uri;", "getImageUri", "()Landroid/net/Uri;", "setImageUri", "(Landroid/net/Uri;)V", "imageUri", "Lbt6;", DateTokenConverter.CONVERTER_KEY, "Lbt6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "e", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class RemovableImageView extends FrameLayout {

    /* renamed from: e */
    public static final C16573a f67616e = new C16573a(null);

    /* renamed from: b */
    public String f67617b;

    /* renamed from: c */
    public Uri f67618c;

    /* renamed from: d */
    public final C38820bt6 f67619d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lco/bird/android/widget/RemovableImageView$a;", "", "", "PADDING_START_DP", "I", "PADDING_VERTICAL_DP", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.RemovableImageView$a */
    /* loaded from: classes4.dex */
    public static final class C16573a {
        public /* synthetic */ C16573a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16573a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemovableImageView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C38820bt6 m62196b = C38820bt6.m62196b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m62196b, "inflate(context.layoutInflater, this)");
        this.f67619d = m62196b;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        setPaddingRelative((int) C49347td3.m12002a(10, context3), (int) C49347td3.m12002a(12, context4), 0, (int) C49347td3.m12002a(12, context5));
    }

    public final void setImage(String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f67617b = imageUrl;
        YI4 m97561f = new YI4().m97561f();
        Intrinsics.checkNotNullExpressionValue(m97561f, "RequestOptions().centerCrop()");
        ComponentCallbacks2C17096a.m53138t(getContext()).m81653k(imageUrl).mo16086d(m97561f).m16096R0(this.f67619d.f59721b);
    }

    public final void setImageUri(Uri uri) {
        this.f67618c = uri;
    }

    public final void setImageUrl(String str) {
        this.f67617b = str;
    }

    public final void setImage(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f67618c = uri;
        YI4 m97561f = new YI4().m97561f();
        Intrinsics.checkNotNullExpressionValue(m97561f, "RequestOptions().centerCrop()");
        ComponentCallbacks2C17096a.m53138t(getContext()).m81656h(uri).mo16086d(m97561f).m16096R0(this.f67619d.f59721b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemovableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C38820bt6 m62196b = C38820bt6.m62196b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m62196b, "inflate(context.layoutInflater, this)");
        this.f67619d = m62196b;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        setPaddingRelative((int) C49347td3.m12002a(10, context3), (int) C49347td3.m12002a(12, context4), 0, (int) C49347td3.m12002a(12, context5));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemovableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C38820bt6 m62196b = C38820bt6.m62196b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m62196b, "inflate(context.layoutInflater, this)");
        this.f67619d = m62196b;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        setPaddingRelative((int) C49347td3.m12002a(10, context3), (int) C49347td3.m12002a(12, context4), 0, (int) C49347td3.m12002a(12, context5));
    }
}
