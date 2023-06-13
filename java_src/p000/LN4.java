package p000;
/* renamed from: LN4 */
/* loaded from: classes5.dex */
public final class LN4 {
    private LN4() {
    }

    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m96990a(int i, TInput tinput, InterfaceC50266vA1<TInput, TResult, TException> interfaceC50266vA1, RN4<TInput, TResult> rn4) throws Throwable {
        TResult apply;
        if (i < 1) {
            return interfaceC50266vA1.apply(tinput);
        }
        do {
            apply = interfaceC50266vA1.apply(tinput);
            tinput = rn4.mo86798a(tinput, apply);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return apply;
    }
}
