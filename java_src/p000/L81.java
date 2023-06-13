package p000;

import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
/* renamed from: L81 */
/* loaded from: classes6.dex */
public class L81 {
    private L81() {
    }

    /* renamed from: a */
    public static boolean m97673a(BigInteger bigInteger, BigInteger bigInteger2, ECParameterSpec eCParameterSpec) {
        EllipticCurve curve = eCParameterSpec.getCurve();
        BigInteger a = curve.getA();
        BigInteger b = curve.getB();
        BigInteger p = ((ECFieldFp) curve.getField()).getP();
        return bigInteger2.pow(2).mod(p).equals(bigInteger.pow(3).add(a.multiply(bigInteger)).add(b).mod(p));
    }

    /* renamed from: b */
    public static boolean m97672b(ECPublicKey eCPublicKey, ECParameterSpec eCParameterSpec) {
        ECPoint w = eCPublicKey.getW();
        return m97673a(w.getAffineX(), w.getAffineY(), eCParameterSpec);
    }
}
