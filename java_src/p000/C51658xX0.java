package p000;

import android.content.res.Resources;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, m28432d2 = {"LxX0;", "LxO1;", "LwO1;", "inAppMessage", "Landroid/view/animation/Animation;", C17296a.f69688o, "b", "", "J", "shortAnimationDurationMs", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: xX0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C51658xX0 implements InterfaceC51578xO1 {

    /* renamed from: a */
    public final long f117756a = Resources.getSystem().getInteger(17694720);

    @Override // p000.InterfaceC51578xO1
    /* renamed from: a */
    public Animation mo5071a(InterfaceC50985wO1 inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        if (inAppMessage instanceof BZ1) {
            if (((BZ1) inAppMessage).m113865x0() == EnumC40227eE5.TOP) {
                return C27648qf.m17270a(-1.0f, 0.0f, this.f117756a, false);
            }
            return C27648qf.m17270a(1.0f, 0.0f, this.f117756a, false);
        }
        return C27648qf.m17269b(new AlphaAnimation(0.0f, 1.0f), this.f117756a, true);
    }

    @Override // p000.InterfaceC51578xO1
    /* renamed from: b */
    public Animation mo5070b(InterfaceC50985wO1 inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        if (inAppMessage instanceof BZ1) {
            if (((BZ1) inAppMessage).m113865x0() == EnumC40227eE5.TOP) {
                return C27648qf.m17270a(0.0f, -1.0f, this.f117756a, false);
            }
            return C27648qf.m17270a(0.0f, 1.0f, this.f117756a, false);
        }
        return C27648qf.m17269b(new AlphaAnimation(1.0f, 0.0f), this.f117756a, false);
    }
}
