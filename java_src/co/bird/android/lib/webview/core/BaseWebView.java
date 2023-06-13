package co.bird.android.lib.webview.core;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.buava.Optional;
import co.bird.android.lib.webview.bridge.C16022a;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import io.reactivex.AbstractC23442F;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0015\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0015\u0010\u001cJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016JN\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072<\u0010\u000e\u001a8\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\r0\f0\tH\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/lib/webview/core/BaseWebView;", "Landroid/webkit/WebView;", "LUz6;", "Lwi2;", "deserializer", "", "b", "", "commandName", "Lkotlin/Function1;", "", "", "Lio/reactivex/F;", "Lco/bird/android/buava/Optional;", "handler", C17296a.f69688o, "LOz6;", "LOz6;", "bridge", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseWebView.kt\nco/bird/android/lib/webview/core/BaseWebView\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n*L\n1#1,35:1\n41#2:36\n*S KotlinDebug\n*F\n+ 1 BaseWebView.kt\nco/bird/android/lib/webview/core/BaseWebView\n*L\n24#1:36\n*E\n"})
/* loaded from: classes3.dex */
public final class BaseWebView extends WebView implements InterfaceC36524Uz6 {

    /* renamed from: b */
    public InterfaceC35120Oz6 f66096b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p000.InterfaceC35120Oz6
    /* renamed from: a */
    public void mo56048a(String commandName, Function1<? super Map<String, ? extends Object>, ? extends AbstractC23442F<Optional<Map<String, Object>>>> handler) {
        Unit unit;
        Intrinsics.checkNotNullParameter(commandName, "commandName");
        Intrinsics.checkNotNullParameter(handler, "handler");
        InterfaceC35120Oz6 interfaceC35120Oz6 = this.f66096b;
        if (interfaceC35120Oz6 != null) {
            interfaceC35120Oz6.mo56048a(commandName, handler);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit != null) {
            return;
        }
        throw new IllegalStateException("Please call initBridge() first");
    }

    @Override // p000.InterfaceC36524Uz6
    /* renamed from: b */
    public void mo56047b(C51174wi2 deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        ScopeProvider m45202a = ViewScopeProvider.m45202a(this);
        Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
        this.f66096b = new C16022a(this, deserializer, m45202a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
