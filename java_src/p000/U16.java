package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJI\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0006H\u0016ø\u0001\u0000J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0007J\b\u0010\u0012\u001a\u00020\tH\u0007R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R(\u0010\u001a\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0017j\n\u0012\u0006\u0012\u0004\u0018\u00010\r`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, m28432d2 = {"LU16;", "", "LF16;", "value", "LGY1;", "imeOptions", "Lkotlin/Function1;", "", "LN91;", "", "onEditCommand", "LFY1;", "onImeActionPerformed", "La26;", DateTokenConverter.CONVERTER_KEY, "session", "e", "c", "b", "LkW3;", C17296a.f69688o, "LkW3;", "platformTextInputService", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/text/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "_currentInputSession", "()La26;", "currentInputSession", "<init>", "(LkW3;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: U16 */
/* loaded from: classes.dex */
public class U16 {

    /* renamed from: c */
    public static final /* synthetic */ int f36708c = 0;

    /* renamed from: a */
    public final InterfaceC43945kW3 f36709a;

    /* renamed from: b */
    public final AtomicReference<C37723a26> f36710b;

    public U16(InterfaceC43945kW3 platformTextInputService) {
        Intrinsics.checkNotNullParameter(platformTextInputService, "platformTextInputService");
        this.f36709a = platformTextInputService;
        this.f36710b = new AtomicReference<>(null);
    }

    /* renamed from: a */
    public final C37723a26 m82107a() {
        return this.f36710b.get();
    }

    @Deprecated(message = "Use SoftwareKeyboardController.hide or TextInputSession.hideSoftwareKeyboard instead.", replaceWith = @ReplaceWith(expression = "textInputSession.hideSoftwareKeyboard()", imports = {}))
    /* renamed from: b */
    public final void m82106b() {
        this.f36709a.mo28879c();
    }

    @Deprecated(message = "Use SoftwareKeyboardController.show or TextInputSession.showSoftwareKeyboard instead.", replaceWith = @ReplaceWith(expression = "textInputSession.showSoftwareKeyboard()", imports = {}))
    /* renamed from: c */
    public final void m82105c() {
        if (this.f36710b.get() != null) {
            this.f36709a.mo28877e();
        }
    }

    /* renamed from: d */
    public C37723a26 m82104d(F16 value, GY1 imeOptions, Function1<? super List<? extends N91>, Unit> onEditCommand, Function1<? super FY1, Unit> onImeActionPerformed) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(onEditCommand, "onEditCommand");
        Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
        this.f36709a.mo28876f(value, imeOptions, onEditCommand, onImeActionPerformed);
        C37723a26 c37723a26 = new C37723a26(this, this.f36709a);
        this.f36710b.set(c37723a26);
        return c37723a26;
    }

    /* renamed from: e */
    public void m82103e(C37723a26 session) {
        Intrinsics.checkNotNullParameter(session, "session");
        if (C42482i24.m35337a(this.f36710b, session, null)) {
            this.f36709a.mo28881a();
        }
    }
}
