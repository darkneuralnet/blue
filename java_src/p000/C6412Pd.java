package p000;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, m28432d2 = {"LPd;", "LhW3;", "LPd$a;", "LfW3;", "platformTextInput", "Landroid/view/View;", "view", "b", "<init>", "()V", C17296a.f69688o, "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Pd */
/* loaded from: classes.dex */
public final class C6412Pd implements InterfaceC42166hW3<C6413a> {

    /* renamed from: a */
    public static final C6412Pd f28754a = new C6412Pd();

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u0010"}, m28432d2 = {"LPd$a;", "LgW3;", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", C17296a.f69688o, "LU16;", "LU16;", "b", "()LU16;", "service", "LW16;", "LW16;", "androidService", "<init>", "(LU16;LW16;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Pd$a */
    /* loaded from: classes.dex */
    public static final class C6413a implements InterfaceC41573gW3 {

        /* renamed from: a */
        public final U16 f28755a;

        /* renamed from: b */
        public final W16 f28756b;

        public C6413a(U16 service, W16 androidService) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(androidService, "androidService");
            this.f28755a = service;
            this.f28756b = androidService;
        }

        @Override // p000.InterfaceC41573gW3
        /* renamed from: a */
        public InputConnection mo39200a(EditorInfo outAttrs) {
            Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
            return this.f28756b.m78920l(outAttrs);
        }

        /* renamed from: b */
        public final U16 m90056b() {
            return this.f28755a;
        }
    }

    private C6412Pd() {
    }

    @Override // p000.InterfaceC42166hW3
    /* renamed from: b */
    public C6413a mo36254a(InterfaceC40980fW3 platformTextInput, View view) {
        Intrinsics.checkNotNullParameter(platformTextInput, "platformTextInput");
        Intrinsics.checkNotNullParameter(view, "view");
        W16 w16 = new W16(view, platformTextInput);
        return new C6413a(C30240xc.m4954e().invoke(w16), w16);
    }
}
