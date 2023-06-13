package p000;

import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* renamed from: fc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41033fc0 {

    /* renamed from: a */
    public final Object f80350a = new Object();

    /* renamed from: b */
    public final Map<String, InterfaceC34196Lb0> f80351b = new LinkedHashMap();

    /* renamed from: c */
    public final Set<InterfaceC34196Lb0> f80352c = new HashSet();

    /* renamed from: a */
    public LinkedHashSet<InterfaceC34196Lb0> m41120a() {
        LinkedHashSet<InterfaceC34196Lb0> linkedHashSet;
        synchronized (this.f80350a) {
            linkedHashSet = new LinkedHashSet<>(this.f80351b.values());
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public void m41119b(InterfaceC32792Fb0 interfaceC32792Fb0) throws InitializationException {
        synchronized (this.f80350a) {
            try {
                try {
                    for (String str : interfaceC32792Fb0.mo10789b()) {
                        C33928Jx2.m99533a("CameraRepository", "Added camera: " + str);
                        this.f80351b.put(str, interfaceC32792Fb0.mo10790a(str));
                    }
                } catch (CameraUnavailableException e) {
                    throw new InitializationException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
