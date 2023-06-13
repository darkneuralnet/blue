package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\"\u001a\u0010\u0007\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, m28432d2 = {"", "propertyName", "b", "", C17296a.f69688o, "I", "()I", "AVAILABLE_PROCESSORS", "kotlinx-coroutines-core"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* renamed from: jY5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C43372jY5 {

    /* renamed from: a */
    public static final int f92921a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m30345a() {
        return f92921a;
    }

    /* renamed from: b */
    public static final String m30344b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
