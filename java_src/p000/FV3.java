package p000;

import android.os.Build;
import android.view.View;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\ba\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&R\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m28432d2 = {"LFV3;", "", "LaG2;", "style", "Landroid/view/View;", "view", "Lg01;", "density", "", "initialZoom", "LEV3;", C17296a.f69688o, "", "b", "()Z", "canUpdateZoom", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FV3 */
/* loaded from: classes.dex */
public interface FV3 {

    /* renamed from: a */
    public static final C2318a f9526a = C2318a.f9527a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, m28432d2 = {"LFV3$a;", "", "LFV3;", C17296a.f69688o, "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: FV3$a */
    /* loaded from: classes.dex */
    public static final class C2318a {

        /* renamed from: a */
        public static final /* synthetic */ C2318a f9527a = new C2318a();

        private C2318a() {
        }

        /* renamed from: a */
        public final FV3 m107073a() {
            if (ZF2.m73515c(0, 1, null)) {
                if (Build.VERSION.SDK_INT == 28) {
                    return NV3.f24683b;
                }
                return YV3.f45944b;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    /* renamed from: a */
    EV3 mo74972a(C37853aG2 c37853aG2, View view, InterfaceC41273g01 interfaceC41273g01, float f);

    /* renamed from: b */
    boolean mo74971b();
}
