package p000;

import com.nimbusds.jose.shaded.json.parser.ParseException;
import java.io.IOException;
/* renamed from: fj2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC41105fj2<T> {

    /* renamed from: b */
    public static String f80493b = "Invalid or non Implemented status";

    /* renamed from: a */
    public final C40512ej2 f80494a;

    public AbstractC41105fj2(C40512ej2 c40512ej2) {
        this.f80494a = c40512ej2;
    }

    /* renamed from: a */
    public abstract void mo40997a(Object obj, Object obj2) throws ParseException, IOException;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public T mo36570b(Object obj) {
        return obj;
    }

    /* renamed from: c */
    public abstract Object mo40996c();

    /* renamed from: d */
    public Object mo40995d() {
        throw new RuntimeException(f80493b + " createObject() in " + getClass());
    }

    /* renamed from: e */
    public void mo40994e(Object obj, String str, Object obj2) throws ParseException, IOException {
        throw new RuntimeException(f80493b + " setValue in " + getClass() + " key=" + str);
    }

    /* renamed from: f */
    public AbstractC41105fj2<?> mo40993f(String str) throws ParseException, IOException {
        throw new RuntimeException(f80493b + " startArray in " + getClass() + " key=" + str);
    }

    /* renamed from: g */
    public AbstractC41105fj2<?> mo40992g(String str) throws ParseException, IOException {
        throw new RuntimeException(f80493b + " startObject(String key) in " + getClass() + " key=" + str);
    }
}
