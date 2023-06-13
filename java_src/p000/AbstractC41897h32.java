package p000;

import androidx.work.C12124b;
import java.util.List;
/* renamed from: h32  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC41897h32 {

    /* renamed from: a */
    public static final String f84663a = AbstractC32056Bx2.m113270i("InputMerger");

    /* renamed from: a */
    public static AbstractC41897h32 m36878a(String str) {
        try {
            return (AbstractC41897h32) Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            String str2 = f84663a;
            m113272e.mo113266d(str2, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    /* renamed from: b */
    public abstract C12124b mo36877b(List<C12124b> list);
}
