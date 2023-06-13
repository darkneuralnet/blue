package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u001b\u0010\u000e\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, m28432d2 = {"LVk0;", "LTk0;", "", "label", "content", "", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/ClipboardManager;", "b", "Lkotlin/Lazy;", "()Landroid/content/ClipboardManager;", "androidClipboardManager", "<init>", "(Landroid/content/Context;)V", "clipboard_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Vk0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36617Vk0 implements InterfaceC36149Tk0 {

    /* renamed from: a */
    public final Context f39672a;

    /* renamed from: b */
    public final Lazy f39673b;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroid/content/ClipboardManager;", "b", "()Landroid/content/ClipboardManager;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Vk0$a */
    /* loaded from: classes4.dex */
    public static final class C8769a extends Lambda implements Function0<ClipboardManager> {
        public C8769a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final ClipboardManager invoke() {
            Object systemService = C36617Vk0.this.f39672a.getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            return (ClipboardManager) systemService;
        }
    }

    public C36617Vk0(Context context) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39672a = context;
        lazy = LazyKt__LazyJVMKt.lazy(new C8769a());
        this.f39673b = lazy;
    }

    @Override // p000.InterfaceC36149Tk0
    /* renamed from: a */
    public void mo79490a(CharSequence label, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(label, "label");
        m79489b().setPrimaryClip(ClipData.newPlainText(label, charSequence));
    }

    /* renamed from: b */
    public final ClipboardManager m79489b() {
        return (ClipboardManager) this.f39673b.getValue();
    }
}
