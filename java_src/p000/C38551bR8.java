package p000;

import java.util.NoSuchElementException;
/* renamed from: bR8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38551bR8 {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T> T m64526a(Iterable<T> iterable) {
        if (!iterable.isEmpty()) {
            return (T) iterable.get(iterable.size() - 1);
        }
        throw new NoSuchElementException();
    }
}
