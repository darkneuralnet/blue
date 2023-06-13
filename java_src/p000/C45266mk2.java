package p000;

import android.view.KeyEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\u000b\u001a\u00020\t*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\"\u0018\u0010\u000f\u001a\u00020\f*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\f*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\"\u0018\u0010\u0013\u001a\u00020\f*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e*\n\u0010\u0015\"\u00020\u00142\u00020\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"Lik2;", "LWj2;", C17296a.f69688o, "(Landroid/view/KeyEvent;)J", "key", "", "c", "(Landroid/view/KeyEvent;)I", "utf16CodePoint", "Llk2;", "b", "type", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/KeyEvent;)Z", "isAltPressed", "e", "isCtrlPressed", "f", "isShiftPressed", "Landroid/view/KeyEvent;", "NativeKeyEvent", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: mk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45266mk2 {
    /* renamed from: a */
    public static final long m25125a(KeyEvent key) {
        Intrinsics.checkNotNullParameter(key, "$this$key");
        return C36853Wk2.m77894a(key.getKeyCode());
    }

    /* renamed from: b */
    public static final int m25124b(KeyEvent type) {
        Intrinsics.checkNotNullParameter(type, "$this$type");
        int action = type.getAction();
        if (action != 0) {
            if (action != 1) {
                return C44673lk2.f96650a.m26887c();
            }
            return C44673lk2.f96650a.m26888b();
        }
        return C44673lk2.f96650a.m26889a();
    }

    /* renamed from: c */
    public static final int m25123c(KeyEvent utf16CodePoint) {
        Intrinsics.checkNotNullParameter(utf16CodePoint, "$this$utf16CodePoint");
        return utf16CodePoint.getUnicodeChar();
    }

    /* renamed from: d */
    public static final boolean m25122d(KeyEvent isAltPressed) {
        Intrinsics.checkNotNullParameter(isAltPressed, "$this$isAltPressed");
        return isAltPressed.isAltPressed();
    }

    /* renamed from: e */
    public static final boolean m25121e(KeyEvent isCtrlPressed) {
        Intrinsics.checkNotNullParameter(isCtrlPressed, "$this$isCtrlPressed");
        return isCtrlPressed.isCtrlPressed();
    }

    /* renamed from: f */
    public static final boolean m25120f(KeyEvent isShiftPressed) {
        Intrinsics.checkNotNullParameter(isShiftPressed, "$this$isShiftPressed");
        return isShiftPressed.isShiftPressed();
    }
}
