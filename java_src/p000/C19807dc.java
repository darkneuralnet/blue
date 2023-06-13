package p000;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\u0011"}, m28432d2 = {"Ldc;", "LUk0;", "LDf;", "annotatedString", "", "b", C17296a.f69688o, "", "c", "Landroid/content/ClipboardManager;", "Landroid/content/ClipboardManager;", "clipboardManager", "<init>", "(Landroid/content/ClipboardManager;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dc */
/* loaded from: classes.dex */
public final class C19807dc implements InterfaceC36383Uk0 {

    /* renamed from: a */
    public final ClipboardManager f76868a;

    public C19807dc(ClipboardManager clipboardManager) {
        Intrinsics.checkNotNullParameter(clipboardManager, "clipboardManager");
        this.f76868a = clipboardManager;
    }

    @Override // p000.InterfaceC36383Uk0
    /* renamed from: a */
    public C1577Df mo44027a() {
        ClipData primaryClip = this.f76868a.getPrimaryClip();
        CharSequence charSequence = null;
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (itemAt != null) {
            charSequence = itemAt.getText();
        }
        return C20078ec.m42728a(charSequence);
    }

    @Override // p000.InterfaceC36383Uk0
    /* renamed from: b */
    public void mo44026b(C1577Df annotatedString) {
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        this.f76868a.setPrimaryClip(ClipData.newPlainText("plain text", C20078ec.m42727b(annotatedString)));
    }

    @Override // p000.InterfaceC36383Uk0
    /* renamed from: c */
    public boolean mo44025c() {
        ClipDescription primaryClipDescription = this.f76868a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C19807dc(Context context) {
        this((ClipboardManager) r2);
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
    }
}
