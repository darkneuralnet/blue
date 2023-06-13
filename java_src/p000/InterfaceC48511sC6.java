package p000;

import android.view.View;
import androidx.compose.p003ui.platform.WindowRecomposer_androidKt;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m28432d2 = {"LsC6;", "", "Landroid/view/View;", "windowRootView", "Lqs4;", C17296a.f69688o, "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sC6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC48511sC6 {

    /* renamed from: a */
    public static final C28235a f108445a = C28235a.f108446a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\bR\u001d\u0010\t\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m28432d2 = {"LsC6$a;", "", "LsC6;", "b", "LsC6;", C17296a.f69688o, "()LsC6;", "getLifecycleAware$annotations", "()V", "LifecycleAware", "<init>", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: sC6$a */
    /* loaded from: classes.dex */
    public static final class C28235a {

        /* renamed from: a */
        public static final /* synthetic */ C28235a f108446a = new C28235a();

        /* renamed from: b */
        public static final InterfaceC48511sC6 f108447b = C28236a.f108448b;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, m28432d2 = {"Landroid/view/View;", "rootView", "Lqs4;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: sC6$a$a */
        /* loaded from: classes.dex */
        public static final class C28236a implements InterfaceC48511sC6 {

            /* renamed from: b */
            public static final C28236a f108448b = new C28236a();

            @Override // p000.InterfaceC48511sC6
            /* renamed from: a */
            public final C47720qs4 mo14562a(View rootView) {
                Intrinsics.checkNotNullParameter(rootView, "rootView");
                return WindowRecomposer_androidKt.m68506c(rootView, null, null, 3, null);
            }
        }

        private C28235a() {
        }

        /* renamed from: a */
        public final InterfaceC48511sC6 m14563a() {
            return f108447b;
        }
    }

    /* renamed from: a */
    C47720qs4 mo14562a(View view);
}
