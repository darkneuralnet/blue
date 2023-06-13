package p000;

import androidx.compose.p003ui.input.key.OnKeyEventElement;
import androidx.compose.p003ui.input.key.OnPreviewKeyEvent;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001ø\u0001\u0000\u001a!\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m28432d2 = {"LgV2;", "Lkotlin/Function1;", "Lik2;", "", "onKeyEvent", C17296a.f69688o, "onPreviewKeyEvent", "b", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: qk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47638qk2 {
    /* renamed from: a */
    public static final InterfaceC41563gV2 m17173a(InterfaceC41563gV2 interfaceC41563gV2, Function1<? super C42894ik2, Boolean> onKeyEvent) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(onKeyEvent, "onKeyEvent");
        return interfaceC41563gV2.mo39266t0(new OnKeyEventElement(onKeyEvent));
    }

    /* renamed from: b */
    public static final InterfaceC41563gV2 m17172b(InterfaceC41563gV2 interfaceC41563gV2, Function1<? super C42894ik2, Boolean> onPreviewKeyEvent) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(onPreviewKeyEvent, "onPreviewKeyEvent");
        return interfaceC41563gV2.mo39266t0(new OnPreviewKeyEvent(onPreviewKeyEvent));
    }
}
