package p000;
/* renamed from: J80 */
/* loaded from: classes5.dex */
public final class J80 extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public J80(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
