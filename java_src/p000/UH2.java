package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.rider.impl.RiderMapDataManagerImpl;
import co.bird.android.manager.analytics.RiderDemandManagerImpl;
import co.bird.android.manager.helmet.HelmetSelfieManagerImpl;
import co.bird.android.manager.itemlease.ItemLeaseManagerImpl;
import co.bird.android.manager.localization.OtaManagerImpl;
import co.bird.android.manager.payment.StripeResolverManagerImpl;
import co.bird.android.manager.ride.EndRideManagerImpl;
import co.bird.android.manager.ride.RidePassManagerImpl;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0080\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH'J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH'J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0012H'J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0015H'J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0018H'J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001bH'J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001eH'J\u0010\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020!H'J\u0010\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020$H'J\u0010\u0010)\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020'H'J\u0010\u0010,\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020*H'J\u0010\u0010/\u001a\u00020.2\u0006\u0010\u0003\u001a\u00020-H'J\u0010\u00102\u001a\u0002012\u0006\u0010\u0003\u001a\u000200H'J\u0010\u00105\u001a\u0002042\u0006\u0010\u0003\u001a\u000203H'J\u0010\u00108\u001a\u0002072\u0006\u0010\u0003\u001a\u000206H'J\u0010\u0010;\u001a\u00020:2\u0006\u0010\u0003\u001a\u000209H'J\u0010\u0010>\u001a\u00020=2\u0006\u0010\u0003\u001a\u00020<H'J\u0010\u0010A\u001a\u00020@2\u0006\u0010\u0003\u001a\u00020?H'J\u0010\u0010D\u001a\u00020C2\u0006\u0010\u0003\u001a\u00020BH'J\u0010\u0010G\u001a\u00020F2\u0006\u0010\u0003\u001a\u00020EH'J\u0010\u0010J\u001a\u00020I2\u0006\u0010\u0003\u001a\u00020HH'J\u0010\u0010M\u001a\u00020L2\u0006\u0010\u0003\u001a\u00020KH'J\u0010\u0010P\u001a\u00020O2\u0006\u0010\u0003\u001a\u00020NH'J\u0010\u0010S\u001a\u00020R2\u0006\u0010\u0003\u001a\u00020QH'J\u0010\u0010V\u001a\u00020U2\u0006\u0010\u0003\u001a\u00020TH'J\u0010\u0010Y\u001a\u00020X2\u0006\u0010\u0003\u001a\u00020WH'J\u0010\u0010\\\u001a\u00020[2\u0006\u0010\u0003\u001a\u00020ZH'J\u0010\u0010_\u001a\u00020^2\u0006\u0010\u0003\u001a\u00020]H'J\u0010\u0010b\u001a\u00020a2\u0006\u0010\u0003\u001a\u00020`H'J\u0010\u0010e\u001a\u00020d2\u0006\u0010\u0003\u001a\u00020cH'J\u0010\u0010h\u001a\u00020g2\u0006\u0010\u0003\u001a\u00020fH'J\u0010\u0010k\u001a\u00020j2\u0006\u0010\u0003\u001a\u00020iH'J\u0010\u0010n\u001a\u00020m2\u0006\u0010\u0003\u001a\u00020lH'J\u0010\u0010q\u001a\u00020p2\u0006\u0010\u0003\u001a\u00020oH'J\u0010\u0010t\u001a\u00020s2\u0006\u0010\u0003\u001a\u00020rH'J\u0010\u0010w\u001a\u00020v2\u0006\u0010\u0003\u001a\u00020uH'J\u0010\u0010z\u001a\u00020y2\u0006\u0010\u0003\u001a\u00020xH'J\u0010\u0010}\u001a\u00020|2\u0006\u0010\u0003\u001a\u00020{H'J\u0011\u0010\u0080\u0001\u001a\u00020\u007f2\u0006\u0010\u0003\u001a\u00020~H'J\u0013\u0010\u0083\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0003\u001a\u00030\u0081\u0001H'J\u000f\u0010\u0086\u0001\u001a\u00030\u0085\u0001*\u00030\u0084\u0001H'J\u000f\u0010\u0089\u0001\u001a\u00030\u0088\u0001*\u00030\u0087\u0001H'J\u000f\u0010\u008c\u0001\u001a\u00030\u008b\u0001*\u00030\u008a\u0001H'J\u000f\u0010\u008f\u0001\u001a\u00030\u008e\u0001*\u00030\u008d\u0001H'J\u000f\u0010\u0092\u0001\u001a\u00030\u0091\u0001*\u00030\u0090\u0001H'J\u000f\u0010\u0095\u0001\u001a\u00030\u0094\u0001*\u00030\u0093\u0001H'J\u000f\u0010\u0098\u0001\u001a\u00030\u0097\u0001*\u00030\u0096\u0001H'J\u000f\u0010\u009b\u0001\u001a\u00030\u009a\u0001*\u00030\u0099\u0001H'J\u000f\u0010\u009e\u0001\u001a\u00030\u009d\u0001*\u00030\u009c\u0001H'J\u000f\u0010¡\u0001\u001a\u00030 \u0001*\u00030\u009f\u0001H'J\u000f\u0010¤\u0001\u001a\u00030£\u0001*\u00030¢\u0001H'J\u0014\u0010¨\u0001\u001a\u00030§\u00012\b\u0010¦\u0001\u001a\u00030¥\u0001H'J\u0014\u0010ª\u0001\u001a\u00030§\u00012\b\u0010¦\u0001\u001a\u00030©\u0001H'J\u0013\u0010\u00ad\u0001\u001a\u00030¬\u00012\u0007\u0010\u0003\u001a\u00030«\u0001H'J\u0013\u0010°\u0001\u001a\u00030¯\u00012\u0007\u0010\u0003\u001a\u00030®\u0001H'J\u0013\u0010³\u0001\u001a\u00030²\u00012\u0007\u0010\u0003\u001a\u00030±\u0001H'J\u0013\u0010¶\u0001\u001a\u00030µ\u00012\u0007\u0010\u0003\u001a\u00030´\u0001H'J\u0013\u0010¹\u0001\u001a\u00030¸\u00012\u0007\u0010\u0003\u001a\u00030·\u0001H'J\u0013\u0010¼\u0001\u001a\u00030»\u00012\u0007\u0010\u0003\u001a\u00030º\u0001H'J\u0013\u0010¿\u0001\u001a\u00030¾\u00012\u0007\u0010\u0003\u001a\u00030½\u0001H'¨\u0006Â\u0001"}, m28432d2 = {"LUH2;", "", "Lwg;", "impl", "Lqg;", C17296a.f69688o, "LZ01;", "LO01;", "o", "LAQ3;", "LuQ3;", "I", "LQi;", "LOi;", "b", "LOI;", "LkI;", "e", "LlO;", "LiO;", "i", "LtS2;", "LaS2;", "z", "LZX2;", "LWX2;", "A", "Lmi3;", "Lji3;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LUz1;", "LQz1;", "u", "LIT4;", "LYR4;", "X", "Lco/bird/android/manager/ride/EndRideManagerImpl;", "LXc1;", "q", "Ljg5;", "Lgg5;", "c0", "Lsn6;", "Lrn6;", "i0", "LJz6;", "LAz6;", "k0", "LPl5;", "LBl5;", "d0", "LLn6;", "LKn6;", "j0", "LCq1;", "LBq1;", "t", "Lmy2;", "Liy2;", "y", "LF54;", "Lq54;", "P", "Lwt5;", "Lot5;", "e0", "Lvm3;", "Lom3;", "E", "LWL;", "LTL;", "g", "LVk0;", "LTk0;", "k", "Lip0;", "LTo0;", "l", "LFe5;", "LAe5;", "b0", "LFn;", "Lbn;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/manager/ride/RidePassManagerImpl;", "LWU4;", "Y", "LPQ;", "LJQ;", "j", "LUl3;", "LTl3;", "D", "Ltp1;", "Lsp1;", "r", "LAk6;", "Lxk6;", "h0", "LeI4;", "LcI4;", "W", "Lco/bird/android/manager/localization/OtaManagerImpl;", "LLy3;", "F", "Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl;", "LBL1;", "w", "Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;", "LMc2;", "x", "LV86;", "LO86;", "g0", "LrD1;", "LiD1;", "v", "Low0;", "Llw0;", "m", "LUB0;", "LTB0;", "n", "Lju4;", "Liu4;", "V", "LIp1;", "LHp1;", "s", "Lvm;", "Ltm;", "c", "Lh43;", "Lg43;", "M", "Lu43;", "Ls43;", "L", "LHs5;", "LFs5;", "S", "LTI6;", "LQI6;", "U", "LEa3;", "LDa3;", "N", "LFX;", "LDX;", "J", "Lo10;", "Ln10;", "K", "Laz6;", "LYy6;", "T", "LJF3;", "LoF3;", "O", "LB55;", "LJ35;", "Q", "Lco/bird/android/manager/analytics/RiderDemandManagerImpl;", "LZ85;", "R", "LE95;", "rider", "LBK2;", "a0", "Lu83;", "B", "LoL;", "LfL;", "f", "Lz21;", "Lo21;", "p", "LWM;", "LSM;", "h", "Lco/bird/android/manager/payment/StripeResolverManagerImpl;", "LBS5;", "f0", "LHL3;", "LDL3;", "G", "LvM3;", "LpM3;", "H", "Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;", "Lq95;", "Z", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module
/* renamed from: UH2 */
/* loaded from: classes4.dex */
public abstract class UH2 {
    @Binds
    /* renamed from: A */
    public abstract WX2 m81751A(ZX2 zx2);

    @Binds
    /* renamed from: B */
    public abstract BK2 m81750B(C49656u83 c49656u83);

    @Binds
    /* renamed from: C */
    public abstract InterfaceC43468ji3 m81749C(C45247mi3 c45247mi3);

    @Binds
    /* renamed from: D */
    public abstract InterfaceC36161Tl3 m81748D(C36395Ul3 c36395Ul3);

    @Binds
    /* renamed from: E */
    public abstract InterfaceC46473om3 m81747E(C50622vm3 c50622vm3);

    @Binds
    /* renamed from: F */
    public abstract InterfaceC34406Ly3 m81746F(OtaManagerImpl otaManagerImpl);

    @Binds
    /* renamed from: G */
    public abstract DL3 m81745G(HL3 hl3);

    @Binds
    /* renamed from: H */
    public abstract InterfaceC46820pM3 m81744H(C50376vM3 c50376vM3);

    @Binds
    /* renamed from: I */
    public abstract InterfaceC49820uQ3 m81743I(AQ3 aq3);

    @Binds
    /* renamed from: J */
    public abstract InterfaceC1510DX m81742J(C2320FX c2320fx);

    @Binds
    /* renamed from: K */
    public abstract InterfaceC45433n10 m81741K(C46026o10 c46026o10);

    @Binds
    /* renamed from: L */
    public abstract InterfaceC48430s43 m81740L(C49616u43 c49616u43);

    @Binds
    /* renamed from: M */
    public abstract InterfaceC41315g43 m81739M(C41908h43 c41908h43);

    @Binds
    /* renamed from: N */
    public abstract InterfaceC32318Da3 m81738N(C32552Ea3 c32552Ea3);

    @Binds
    /* renamed from: O */
    public abstract InterfaceC46164oF3 m81737O(JF3 jf3);

    @Binds
    /* renamed from: P */
    public abstract InterfaceC47256q54 m81736P(F54 f54);

    @Binds
    /* renamed from: Q */
    public abstract J35 m81735Q(B55 b55);

    @Binds
    /* renamed from: R */
    public abstract Z85 m81734R(RiderDemandManagerImpl riderDemandManagerImpl);

    @Binds
    /* renamed from: S */
    public abstract InterfaceC32950Fs5 m81733S(C33418Hs5 c33418Hs5);

    @Binds
    /* renamed from: T */
    public abstract InterfaceC37451Yy6 m81732T(C38287az6 c38287az6);

    @Binds
    /* renamed from: U */
    public abstract QI6 m81731U(TI6 ti6);

    @Binds
    /* renamed from: V */
    public abstract InterfaceC42996iu4 m81730V(C43589ju4 c43589ju4);

    @Binds
    /* renamed from: W */
    public abstract InterfaceC39059cI4 m81729W(C40262eI4 c40262eI4);

    @Binds
    /* renamed from: X */
    public abstract YR4 m81728X(IT4 it4);

    @Binds
    /* renamed from: Y */
    public abstract WU4 m81727Y(RidePassManagerImpl ridePassManagerImpl);

    @Binds
    /* renamed from: Z */
    public abstract InterfaceC47297q95 m81726Z(RiderMapDataManagerImpl riderMapDataManagerImpl);

    @Binds
    /* renamed from: a */
    public abstract InterfaceC27649qg m81725a(C29933wg c29933wg);

    @Binds
    /* renamed from: a0 */
    public abstract BK2 m81724a0(E95 e95);

    @Binds
    /* renamed from: b */
    public abstract InterfaceC6098Oi m81723b(C6846Qi c6846Qi);

    @Binds
    /* renamed from: b0 */
    public abstract InterfaceC31654Ae5 m81722b0(C32824Fe5 c32824Fe5);

    @Binds
    /* renamed from: c */
    public abstract InterfaceC28816tm m81721c(C29621vm c29621vm);

    @Binds
    /* renamed from: c0 */
    public abstract InterfaceC41671gg5 m81720c0(C43450jg5 c43450jg5);

    @Binds
    /* renamed from: d */
    public abstract InterfaceC12495bn m81719d(C2422Fn c2422Fn);

    @Binds
    /* renamed from: d0 */
    public abstract InterfaceC31951Bl5 m81718d0(C35227Pl5 c35227Pl5);

    @Binds
    /* renamed from: e */
    public abstract InterfaceC25134kI m81717e(C5939OI c5939oi);

    @Binds
    /* renamed from: e0 */
    public abstract InterfaceC46545ot5 m81716e0(C51287wt5 c51287wt5);

    @Binds
    /* renamed from: f */
    public abstract InterfaceC20357fL m81715f(C26907oL c26907oL);

    @Binds
    /* renamed from: f0 */
    public abstract BS5 m81714f0(StripeResolverManagerImpl stripeResolverManagerImpl);

    @Binds
    /* renamed from: g */
    public abstract InterfaceC7807TL m81713g(C8984WL c8984wl);

    @Binds
    /* renamed from: g0 */
    public abstract O86 m81712g0(V86 v86);

    @Binds
    /* renamed from: h */
    public abstract InterfaceC7381SM m81711h(C8997WM c8997wm);

    @Binds
    /* renamed from: h0 */
    public abstract InterfaceC51791xk6 m81710h0(C31709Ak6 c31709Ak6);

    @Binds
    /* renamed from: i */
    public abstract InterfaceC23227iO m81709i(C25684lO c25684lO);

    @Binds
    /* renamed from: i0 */
    public abstract InterfaceC48265rn6 m81708i0(C48857sn6 c48857sn6);

    @Binds
    /* renamed from: j */
    public abstract InterfaceC4077JQ m81707j(C6337PQ c6337pq);

    @Binds
    /* renamed from: j0 */
    public abstract InterfaceC34076Kn6 m81706j0(C34310Ln6 c34310Ln6);

    @Binds
    /* renamed from: k */
    public abstract InterfaceC36149Tk0 m81705k(C36617Vk0 c36617Vk0);

    @Binds
    /* renamed from: k0 */
    public abstract InterfaceC31844Az6 m81704k0(C33950Jz6 c33950Jz6);

    @Binds
    /* renamed from: l */
    public abstract InterfaceC36185To0 m81703l(C42942ip0 c42942ip0);

    @Binds
    /* renamed from: m */
    public abstract InterfaceC44791lw0 m81702m(C46570ow0 c46570ow0);

    @Binds
    /* renamed from: n */
    public abstract TB0 m81701n(UB0 ub0);

    @Binds
    /* renamed from: o */
    public abstract O01 m81700o(Z01 z01);

    @Binds
    /* renamed from: p */
    public abstract InterfaceC46037o21 m81699p(C52558z21 c52558z21);

    @Binds
    /* renamed from: q */
    public abstract InterfaceC37014Xc1 m81698q(EndRideManagerImpl endRideManagerImpl);

    @Binds
    /* renamed from: r */
    public abstract InterfaceC48872sp1 m81697r(C49465tp1 c49465tp1);

    @Binds
    /* renamed from: s */
    public abstract InterfaceC33387Hp1 m81696s(C33621Ip1 c33621Ip1);

    @Binds
    /* renamed from: t */
    public abstract InterfaceC31992Bq1 m81695t(C32226Cq1 c32226Cq1);

    @Binds
    /* renamed from: u */
    public abstract InterfaceC35583Qz1 m81694u(C36519Uz1 c36519Uz1);

    @Binds
    /* renamed from: v */
    public abstract InterfaceC42586iD1 m81693v(C47923rD1 c47923rD1);

    @Binds
    /* renamed from: w */
    public abstract BL1 m81692w(HelmetSelfieManagerImpl helmetSelfieManagerImpl);

    @Binds
    /* renamed from: x */
    public abstract InterfaceC34441Mc2 m81691x(ItemLeaseManagerImpl itemLeaseManagerImpl);

    @Binds
    /* renamed from: y */
    public abstract InterfaceC43034iy2 m81690y(C45406my2 c45406my2);

    @Binds
    /* renamed from: z */
    public abstract InterfaceC37961aS2 m81689z(C49244tS2 c49244tS2);
}
