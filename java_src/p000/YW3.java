package p000;

import android.view.MotionEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b \u0010!B\u0017\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b \u0010\"J\u0018\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u00020\u00118\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\f\u0010\u0004R \u0010\u0016\u001a\u00020\u00148\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0015\u0010\u0004R3\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00028\u0006@@X\u0086\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0004\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001e\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, m28432d2 = {"LYW3;", "", "LbX3;", C17296a.f69688o, "()I", "", "LjX3;", "Ljava/util/List;", "c", "()Ljava/util/List;", "changes", "Lt62;", "b", "Lt62;", DateTokenConverter.CONVERTER_KEY, "()Lt62;", "internalPointerEvent", "LWW3;", "I", "buttons", "LxX3;", "getKeyboardModifiers-k7X9c1A", "keyboardModifiers", "<set-?>", "e", "f", "g", "(I)V", "type", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "<init>", "(Ljava/util/List;Lt62;)V", "(Ljava/util/List;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,202:1\n33#2,6:203\n33#2,6:209\n151#2,3:215\n33#2,4:218\n154#2,2:222\n38#2:224\n156#2:225\n*S KotlinDebug\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n*L\n72#1:203,6\n96#1:209,6\n99#1:215,3\n99#1:218,4\n99#1:222,2\n99#1:224\n99#1:225\n*E\n"})
/* renamed from: YW3 */
/* loaded from: classes.dex */
public final class YW3 {

    /* renamed from: a */
    public final List<C43361jX3> f45962a;

    /* renamed from: b */
    public final C49042t62 f45963b;

    /* renamed from: c */
    public final int f45964c;

    /* renamed from: d */
    public final int f45965d;

    /* renamed from: e */
    public int f45966e;

    public YW3(List<C43361jX3> changes, C49042t62 c49042t62) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        this.f45962a = changes;
        this.f45963b = c49042t62;
        MotionEvent m74943e = m74943e();
        this.f45964c = WW3.m78256a(m74943e != null ? m74943e.getButtonState() : 0);
        MotionEvent m74943e2 = m74943e();
        this.f45965d = C51661xX3.m5063b(m74943e2 != null ? m74943e2.getMetaState() : 0);
        this.f45966e = m74947a();
    }

    /* renamed from: a */
    public final int m74947a() {
        MotionEvent m74943e = m74943e();
        if (m74943e != null) {
            int actionMasked = m74943e.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return C38600bX3.f57620a.m64468f();
                            case 9:
                                return C38600bX3.f57620a.m64473a();
                            case 10:
                                return C38600bX3.f57620a.m64472b();
                            default:
                                return C38600bX3.f57620a.m64467g();
                        }
                    }
                    return C38600bX3.f57620a.m64471c();
                }
                return C38600bX3.f57620a.m64469e();
            }
            return C38600bX3.f57620a.m64470d();
        }
        List<C43361jX3> list = this.f45962a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C43361jX3 c43361jX3 = list.get(i);
            if (ZW3.m72995d(c43361jX3)) {
                return C38600bX3.f57620a.m64469e();
            }
            if (ZW3.m72997b(c43361jX3)) {
                return C38600bX3.f57620a.m64470d();
            }
        }
        return C38600bX3.f57620a.m64471c();
    }

    /* renamed from: b */
    public final int m74946b() {
        return this.f45964c;
    }

    /* renamed from: c */
    public final List<C43361jX3> m74945c() {
        return this.f45962a;
    }

    /* renamed from: d */
    public final C49042t62 m74944d() {
        return this.f45963b;
    }

    /* renamed from: e */
    public final MotionEvent m74943e() {
        C49042t62 c49042t62 = this.f45963b;
        if (c49042t62 != null) {
            return c49042t62.m13076b();
        }
        return null;
    }

    /* renamed from: f */
    public final int m74942f() {
        return this.f45966e;
    }

    /* renamed from: g */
    public final void m74941g(int i) {
        this.f45966e = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YW3(List<C43361jX3> changes) {
        this(changes, null);
        Intrinsics.checkNotNullParameter(changes, "changes");
    }
}
