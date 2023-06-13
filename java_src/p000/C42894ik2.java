package p000;

import android.view.KeyEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0016\u0012\n\u0010\u0012\u001a\u00060\fj\u0002`\rø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0012\u001a\u00060\fj\u0002`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0012\u0092\u0001\u00060\fj\u0002`\rø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m28432d2 = {"Lik2;", "", "", "e", "(Landroid/view/KeyEvent;)Ljava/lang/String;", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/KeyEvent;)I", LegacyRepairType.OTHER_KEY, "", "c", "(Landroid/view/KeyEvent;Ljava/lang/Object;)Z", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", C17296a.f69688o, "Landroid/view/KeyEvent;", "getNativeKeyEvent", "()Landroid/view/KeyEvent;", "nativeKeyEvent", "b", "(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@JvmInline
/* renamed from: ik2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42894ik2 {

    /* renamed from: a */
    public final KeyEvent f87804a;

    public /* synthetic */ C42894ik2(KeyEvent keyEvent) {
        this.f87804a = keyEvent;
    }

    /* renamed from: a */
    public static final /* synthetic */ C42894ik2 m33523a(KeyEvent keyEvent) {
        return new C42894ik2(keyEvent);
    }

    /* renamed from: b */
    public static KeyEvent m33522b(KeyEvent nativeKeyEvent) {
        Intrinsics.checkNotNullParameter(nativeKeyEvent, "nativeKeyEvent");
        return nativeKeyEvent;
    }

    /* renamed from: c */
    public static boolean m33521c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof C42894ik2) && Intrinsics.areEqual(keyEvent, ((C42894ik2) obj).m33518f());
    }

    /* renamed from: d */
    public static int m33520d(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* renamed from: e */
    public static String m33519e(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m33521c(this.f87804a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ KeyEvent m33518f() {
        return this.f87804a;
    }

    public int hashCode() {
        return m33520d(this.f87804a);
    }

    public String toString() {
        return m33519e(this.f87804a);
    }
}
