package p000;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"LuT0;", "", "Lik2;", "event", "", C17296a.f69688o, "(Landroid/view/KeyEvent;)Ljava/lang/Integer;", "Ljava/lang/Integer;", "deadKeyCode", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeadKeyCombiner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeadKeyCombiner.android.kt\nandroidx/compose/foundation/text/DeadKeyCombiner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* renamed from: uT0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49844uT0 {

    /* renamed from: a */
    public Integer f112415a;

    /* renamed from: a */
    public final Integer m10247a(KeyEvent event) {
        boolean z;
        Intrinsics.checkNotNullParameter(event, "event");
        int m25123c = C45266mk2.m25123c(event);
        Integer num = null;
        if ((Integer.MIN_VALUE & m25123c) != 0) {
            this.f112415a = Integer.valueOf(m25123c & Integer.MAX_VALUE);
            return null;
        }
        Integer num2 = this.f112415a;
        if (num2 != null) {
            this.f112415a = null;
            Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num2.intValue(), m25123c));
            if (valueOf.intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                num = valueOf;
            }
            if (num == null) {
                return Integer.valueOf(m25123c);
            }
            return num;
        }
        return Integer.valueOf(m25123c);
    }
}
