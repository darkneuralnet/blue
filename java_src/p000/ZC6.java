package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C12120a;
import java.util.Collections;
import java.util.List;
@SuppressLint({"AddedAbstractMethod"})
/* renamed from: ZC6 */
/* loaded from: classes.dex */
public abstract class ZC6 {

    /* renamed from: ZC6$a */
    /* loaded from: classes.dex */
    public enum EnumC10128a {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    /* renamed from: h */
    public static ZC6 m73614h(Context context) {
        return C37830aD6.m71761p(context);
    }

    /* renamed from: i */
    public static void m73613i(Context context, C12120a c12120a) {
        C37830aD6.m71768i(context, c12120a);
    }

    /* renamed from: a */
    public abstract IC6 mo71773a(List<C32849Fh3> list);

    /* renamed from: b */
    public abstract InterfaceC37061Xh3 mo71772b(String str);

    /* renamed from: c */
    public final InterfaceC37061Xh3 m73616c(EG6 eg6) {
        return mo71771d(Collections.singletonList(eg6));
    }

    /* renamed from: d */
    public abstract InterfaceC37061Xh3 mo71771d(List<? extends EG6> list);

    /* renamed from: e */
    public abstract InterfaceC37061Xh3 mo71770e(String str, EnumC40501ei1 enumC40501ei1, C46856pQ3 c46856pQ3);

    /* renamed from: f */
    public InterfaceC37061Xh3 m73615f(String str, EnumC41094fi1 enumC41094fi1, C32849Fh3 c32849Fh3) {
        return mo71769g(str, enumC41094fi1, Collections.singletonList(c32849Fh3));
    }

    /* renamed from: g */
    public abstract InterfaceC37061Xh3 mo71769g(String str, EnumC41094fi1 enumC41094fi1, List<C32849Fh3> list);
}
