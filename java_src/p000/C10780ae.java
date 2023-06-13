package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"Lae;", "LDf6;", "", "uri", "", "openUri", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ae */
/* loaded from: classes.dex */
public final class C10780ae implements InterfaceC32366Df6 {

    /* renamed from: a */
    public final Context f50848a;

    public C10780ae(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50848a = context;
    }

    @Override // p000.InterfaceC32366Df6
    public void openUri(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f50848a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uri)));
    }
}
