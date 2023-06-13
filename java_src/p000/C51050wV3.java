package p000;

import android.graphics.Typeface;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC32105Cc6;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LwV3;", "", "LAc6;", "typefaceRequest", "LxV3;", "platformFontLoader", "Lkotlin/Function1;", "LCc6$b;", "", "onAsyncCompletion", "createDefaultTypeface", "LCc6;", C17296a.f69688o, "LmW3;", "LmW3;", "platformTypefaceResolver", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wV3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51050wV3 {

    /* renamed from: a */
    public final InterfaceC45131mW3 f116053a = C46910pW3.m19153a();

    /* renamed from: a */
    public InterfaceC32105Cc6 m6768a(C31637Ac6 typefaceRequest, InterfaceC51643xV3 platformFontLoader, Function1<? super InterfaceC32105Cc6.C1107b, Unit> onAsyncCompletion, Function1<? super C31637Ac6, ? extends Object> createDefaultTypeface) {
        boolean z;
        Typeface mo78117a;
        Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        Intrinsics.checkNotNullParameter(onAsyncCompletion, "onAsyncCompletion");
        Intrinsics.checkNotNullParameter(createDefaultTypeface, "createDefaultTypeface");
        AbstractC44199kw1 m115435c = typefaceRequest.m115435c();
        if (m115435c == null) {
            z = true;
        } else {
            z = m115435c instanceof C45137mX0;
        }
        if (z) {
            mo78117a = this.f116053a.mo20950a(typefaceRequest.m115432f(), typefaceRequest.m115434d());
        } else if (m115435c instanceof C49090tB1) {
            mo78117a = this.f116053a.mo20949b((C49090tB1) typefaceRequest.m115435c(), typefaceRequest.m115432f(), typefaceRequest.m115434d());
        } else if (!(m115435c instanceof C47728qt2)) {
            return null;
        } else {
            InterfaceC33500Ib6 m16809b = ((C47728qt2) typefaceRequest.m115435c()).m16809b();
            Intrinsics.checkNotNull(m16809b, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            mo78117a = ((InterfaceC8707Vd) m16809b).mo78117a(typefaceRequest.m115432f(), typefaceRequest.m115434d(), typefaceRequest.m115433e());
        }
        return new InterfaceC32105Cc6.C1107b(mo78117a, false, 2, null);
    }
}
