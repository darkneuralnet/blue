package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.content.ContentResolver;
import android.content.Context;
import android.location.LocationManager;
import io.reactivex.AbstractC23437E;
import io.reactivex.Observable;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p000.C21;
import p000.InterfaceC41706gk0;
import p000.InterfaceC41846gy0;
import p000.InterfaceC44023ke5;
/* renamed from: IH0 */
/* loaded from: classes6.dex */
public final class IH0 {

    /* renamed from: IH0$b */
    /* loaded from: classes6.dex */
    public static final class C3461b implements InterfaceC41706gk0.InterfaceC22419a {

        /* renamed from: a */
        public Context f14954a;

        private C3461b() {
        }

        @Override // p000.InterfaceC41706gk0.InterfaceC22419a
        /* renamed from: b */
        public C3461b mo37861a(Context context) {
            this.f14954a = (Context) C52272yZ3.m3259b(context);
            return this;
        }

        @Override // p000.InterfaceC41706gk0.InterfaceC22419a
        public InterfaceC41706gk0 build() {
            C52272yZ3.m3260a(this.f14954a, Context.class);
            return new C3462c(this.f14954a);
        }
    }

    /* renamed from: IH0$c */
    /* loaded from: classes6.dex */
    public static final class C3462c implements InterfaceC41706gk0 {

        /* renamed from: A */
        public Z94<D21> f14955A;

        /* renamed from: B */
        public Z94<C21.InterfaceC0844a> f14956B;

        /* renamed from: C */
        public Z94<C48766se5> f14957C;

        /* renamed from: D */
        public Z94<Z92> f14958D;

        /* renamed from: E */
        public Z94<C49635u62> f14959E;

        /* renamed from: F */
        public Z94<C37558Zk5> f14960F;

        /* renamed from: G */
        public Z94<C39943dl5> f14961G;

        /* renamed from: H */
        public Z94<C3717Id> f14962H;

        /* renamed from: I */
        public Z94<C41128fl5> f14963I;

        /* renamed from: J */
        public Z94<C42314hl5> f14964J;

        /* renamed from: K */
        public Z94<InterfaceC39332cl5> f14965K;

        /* renamed from: L */
        public Z94<C50604vk5> f14966L;

        /* renamed from: M */
        public Z94<C51790xk5> f14967M;

        /* renamed from: N */
        public Z94<InterfaceC50012uk5> f14968N;

        /* renamed from: O */
        public Z94<C51413x62> f14969O;

        /* renamed from: P */
        public Z94<AbstractC23437E> f14970P;

        /* renamed from: Q */
        public Z94<ExecutorService> f14971Q;

        /* renamed from: R */
        public Z94<InterfaceC41706gk0.InterfaceC22420b> f14972R;

        /* renamed from: S */
        public Z94<C20146ew> f14973S;

        /* renamed from: T */
        public Z94<String[][]> f14974T;

        /* renamed from: U */
        public Z94<C50579vi0> f14975U;

        /* renamed from: V */
        public Z94<C42837ie5> f14976V;

        /* renamed from: W */
        public Z94<AbstractC39873de5> f14977W;

        /* renamed from: a */
        public final Context f14978a;

        /* renamed from: b */
        public final C3462c f14979b;

        /* renamed from: c */
        public Z94<Context> f14980c;

        /* renamed from: d */
        public Z94<ContentResolver> f14981d;

        /* renamed from: e */
        public Z94<LocationManager> f14982e;

        /* renamed from: f */
        public Z94<C51765xi0> f14983f;

        /* renamed from: g */
        public Z94<C52951zi0> f14984g;

        /* renamed from: h */
        public Z94<Integer> f14985h;

        /* renamed from: i */
        public Z94<Boolean> f14986i;

        /* renamed from: j */
        public Z94<String[][]> f14987j;

        /* renamed from: k */
        public Z94<C31919Bi0> f14988k;

        /* renamed from: l */
        public Z94<Boolean> f14989l;

        /* renamed from: m */
        public Z94<C35557Qw2> f14990m;

        /* renamed from: n */
        public Z94<C36025Sw2> f14991n;

        /* renamed from: o */
        public Z94<BluetoothManager> f14992o;

        /* renamed from: p */
        public Z94<C8307UX> f14993p;

        /* renamed from: q */
        public Z94<C46978pd5> f14994q;

        /* renamed from: r */
        public Z94<ExecutorService> f14995r;

        /* renamed from: s */
        public Z94<AbstractC23437E> f14996s;

        /* renamed from: t */
        public Z94<C34277Lk0> f14997t;

        /* renamed from: u */
        public Z94<InterfaceC34043Kk0> f14998u;

        /* renamed from: v */
        public Z94<C45792nd5> f14999v;

        /* renamed from: w */
        public Z94<InterfaceC34855Nw2> f15000w;

        /* renamed from: x */
        public Z94<C34153Kw2> f15001x;

        /* renamed from: y */
        public Z94<Observable<Boolean>> f15002y;

        /* renamed from: z */
        public Z94<C34979Ok0> f15003z;

        /* renamed from: IH0$c$a */
        /* loaded from: classes6.dex */
        public class C3463a implements Z94<C21.InterfaceC0844a> {
            public C3463a() {
            }

            @Override // p000.Z94
            /* renamed from: a */
            public C21.InterfaceC0844a get() {
                return new C3466f(C3462c.this.f14979b);
            }
        }

        @Override // p000.InterfaceC41706gk0
        /* renamed from: g */
        public AbstractC39873de5 mo37862g() {
            return this.f14977W.get();
        }

        /* renamed from: m */
        public final void m102647m(Context context) {
            InterfaceC49405tj1 m43292a = C40138e52.m43292a(context);
            this.f14980c = m43292a;
            this.f14981d = C46450ok0.m20556a(m43292a);
            C51785xk0 m4762a = C51785xk0.m4762a(this.f14980c);
            this.f14982e = m4762a;
            this.f14983f = C52358yi0.m2893a(this.f14981d, m4762a);
            this.f14984g = W51.m78852b(C31685Ai0.m115383a(this.f14980c));
            this.f14985h = C32639Ek0.m108543a(this.f14980c);
            this.f14986i = W51.m78852b(C51192wk0.m6426a(this.f14980c));
            C31937Bk0 m113566a = C31937Bk0.m113566a(C47043pk0.m18871a(), this.f14985h, this.f14986i);
            this.f14987j = m113566a;
            this.f14988k = W51.m78852b(C32153Ci0.m111830a(this.f14984g, m113566a));
            this.f14989l = C50007uk0.m9820a(this.f14980c, C47043pk0.m18871a());
            this.f14990m = C35791Rw2.m86189a(this.f14983f, this.f14988k, this.f14985h, C47043pk0.m18871a(), this.f14989l);
            this.f14991n = C36259Tw2.m82235a(this.f14983f, this.f14988k, this.f14989l, this.f14986i);
            C44671lk0 m26897a = C44671lk0.m26897a(this.f14980c);
            this.f14992o = m26897a;
            this.f14993p = C8663VX.m79827a(m26897a);
            this.f14994q = C47571qd5.m17313a(C42299hk0.m35937a());
            Z94<ExecutorService> m78852b = W51.m78852b(C43485jk0.m30017a());
            this.f14995r = m78852b;
            Z94<AbstractC23437E> m78852b2 = W51.m78852b(C44078kk0.m28558a(m78852b));
            this.f14996s = m78852b2;
            C34511Mk0 m94984a = C34511Mk0.m94984a(m78852b2);
            this.f14997t = m94984a;
            this.f14998u = W51.m78852b(m94984a);
            this.f14999v = C46385od5.m20766a(this.f14980c);
            C52971zk0 m462a = C52971zk0.m462a(C47043pk0.m18871a(), C35323Pw2.m89364a(), this.f14990m, this.f14991n);
            this.f15000w = m462a;
            this.f15001x = C34387Lw2.m96103a(this.f14980c, m462a);
            C52378yk0 m2712a = C52378yk0.m2712a(C47043pk0.m18871a(), this.f15001x);
            this.f15002y = m2712a;
            this.f15003z = C35213Pk0.m89879a(this.f14994q, this.f14999v, m2712a, this.f15000w, C45264mk0.m25129a());
            this.f14955A = W51.m78852b(E21.m109487a());
            C3463a c3463a = new C3463a();
            this.f14956B = c3463a;
            this.f14957C = W51.m78852b(C49359te5.m11979a(this.f14955A, c3463a));
            this.f14958D = W51.m78852b(C50599vk0.m8213a(C47043pk0.m18871a(), C38626ba2.m64349a(), C40422ea2.m42742a()));
            this.f14959E = W51.m78852b(C50227v62.m9193a(C33346Hk5.m103483a(), this.f14958D));
            C38146al5 m70780a = C38146al5.m70780a(C45264mk0.m25129a());
            this.f14960F = m70780a;
            this.f14961G = C40535el5.m42572a(this.f14994q, this.f14959E, m70780a);
            C4168Jd m100110a = C4168Jd.m100110a(C47043pk0.m18871a());
            this.f14962H = m100110a;
            this.f14963I = C41721gl5.m37531a(this.f14994q, this.f14959E, this.f14960F, m100110a);
            this.f14964J = C42907il5.m33512a(this.f14994q, this.f14959E, this.f14960F, this.f14962H);
            this.f14965K = W51.m78852b(C32405Dk0.m109989a(C47043pk0.m18871a(), this.f14961G, this.f14963I, this.f14964J));
            C51197wk5 m6417a = C51197wk5.m6417a(this.f14994q, this.f15000w);
            this.f14966L = m6417a;
            this.f14967M = C52383yk5.m2706a(m6417a, C45264mk0.m25129a());
            this.f14968N = C32171Ck0.m111763a(C47043pk0.m18871a(), this.f14966L, this.f14967M);
            this.f14969O = C52006y62.m4143a(this.f14957C);
            this.f14970P = W51.m78852b(C42892ik0.m33527a());
            Z94<ExecutorService> m78852b3 = W51.m78852b(C45857nk0.m23248a());
            this.f14971Q = m78852b3;
            this.f14972R = C49414tk0.m11833a(this.f14995r, this.f14970P, m78852b3);
            this.f14973S = C20663fw.m40439a(this.f14994q, this.f14962H, this.f14959E, this.f14969O);
            C31703Ak0 m115332a = C31703Ak0.m115332a(C47043pk0.m18871a(), this.f14985h);
            this.f14974T = m115332a;
            this.f14975U = W51.m78852b(C51172wi0.m6464a(this.f14984g, m115332a));
            C43430je5 m30144a = C43430je5.m30144a(this.f14993p, this.f14994q, this.f14998u, this.f14999v, C33346Hk5.m103483a(), this.f15000w, this.f15003z, this.f14957C, this.f14965K, this.f14968N, this.f14969O, this.f14996s, this.f14972R, this.f14973S, this.f14988k, this.f14975U);
            this.f14976V = m30144a;
            this.f14977W = W51.m78852b(m30144a);
        }

        /* renamed from: n */
        public final C46978pd5 m102646n() {
            return new C46978pd5(InterfaceC41706gk0.AbstractC22421c.m37860a());
        }

        public C3462c(Context context) {
            this.f14979b = this;
            this.f14978a = context;
            m102647m(context);
        }
    }

    /* renamed from: IH0$d */
    /* loaded from: classes6.dex */
    public static final class C3464d implements InterfaceC41846gy0.InterfaceC22520a {

        /* renamed from: a */
        public final C3462c f15005a;

        /* renamed from: b */
        public final C3467g f15006b;

        /* renamed from: c */
        public Boolean f15007c;

        /* renamed from: d */
        public Boolean f15008d;

        /* renamed from: e */
        public K46 f15009e;

        @Override // p000.InterfaceC41846gy0.InterfaceC22520a
        public InterfaceC41846gy0 build() {
            C52272yZ3.m3260a(this.f15007c, Boolean.class);
            C52272yZ3.m3260a(this.f15008d, Boolean.class);
            C52272yZ3.m3260a(this.f15009e, K46.class);
            return new C3465e(this.f15005a, this.f15006b, this.f15007c, this.f15008d, this.f15009e);
        }

        @Override // p000.InterfaceC41846gy0.InterfaceC22520a
        /* renamed from: d */
        public C3464d mo37279a(boolean z) {
            this.f15007c = (Boolean) C52272yZ3.m3259b(Boolean.valueOf(z));
            return this;
        }

        @Override // p000.InterfaceC41846gy0.InterfaceC22520a
        /* renamed from: e */
        public C3464d mo37278b(K46 k46) {
            this.f15009e = (K46) C52272yZ3.m3259b(k46);
            return this;
        }

        @Override // p000.InterfaceC41846gy0.InterfaceC22520a
        /* renamed from: f */
        public C3464d mo37277c(boolean z) {
            this.f15008d = (Boolean) C52272yZ3.m3259b(Boolean.valueOf(z));
            return this;
        }

        public C3464d(C3462c c3462c, C3467g c3467g) {
            this.f15005a = c3462c;
            this.f15006b = c3467g;
        }
    }

    /* renamed from: IH0$e */
    /* loaded from: classes6.dex */
    public static final class C3465e implements InterfaceC41846gy0 {

        /* renamed from: A */
        public Z94<C47501qW1> f15010A;

        /* renamed from: B */
        public Z94<C48428s41> f15011B;

        /* renamed from: C */
        public Z94 f15012C;

        /* renamed from: a */
        public final Boolean f15013a;

        /* renamed from: b */
        public final C3462c f15014b;

        /* renamed from: c */
        public final C3467g f15015c;

        /* renamed from: d */
        public final C3465e f15016d;

        /* renamed from: e */
        public Z94<C25174kX> f15017e;

        /* renamed from: f */
        public Z94 f15018f;

        /* renamed from: g */
        public Z94<C50544ve5> f15019g;

        /* renamed from: h */
        public Z94<C48368ry0> f15020h;

        /* renamed from: i */
        public Z94<BluetoothGatt> f15021i;

        /* renamed from: j */
        public Z94<C35332Px2> f15022j;

        /* renamed from: k */
        public Z94<K46> f15023k;

        /* renamed from: l */
        public Z94<L46> f15024l;

        /* renamed from: m */
        public Z94<C35982Sr4> f15025m;

        /* renamed from: n */
        public Z94<C41096fi3> f15026n;

        /* renamed from: o */
        public Z94 f15027o;

        /* renamed from: p */
        public Z94 f15028p;

        /* renamed from: q */
        public Z94 f15029q;

        /* renamed from: r */
        public Z94 f15030r;

        /* renamed from: s */
        public Z94<C44616le5> f15031s;

        /* renamed from: t */
        public Z94 f15032t;

        /* renamed from: u */
        public Z94<EC2> f15033u;

        /* renamed from: v */
        public Z94<Boolean> f15034v;

        /* renamed from: w */
        public Z94<C49279tW1> f15035w;

        /* renamed from: x */
        public Z94<C36502Ux2> f15036x;

        /* renamed from: y */
        public Z94<V36> f15037y;

        /* renamed from: z */
        public Z94<AbstractC48686sW1> f15038z;

        @Override // p000.InterfaceC41846gy0
        /* renamed from: a */
        public Set<InterfaceC52518yy0> mo37283a() {
            return C34615Mv5.m94564c(3).m94566a((InterfaceC52518yy0) this.f15030r.get()).m94566a((InterfaceC52518yy0) this.f15012C.get()).m94566a(this.f15020h.get()).m94565b();
        }

        @Override // p000.InterfaceC41846gy0
        /* renamed from: b */
        public C50544ve5 mo37282b() {
            return this.f15019g.get();
        }

        @Override // p000.InterfaceC41846gy0
        /* renamed from: c */
        public InterfaceC44023ke5 mo37281c() {
            return this.f15031s.get();
        }

        @Override // p000.InterfaceC41846gy0
        /* renamed from: d */
        public C38271ay0 mo37280d() {
            return C38864by0.m62066a(this.f15015c.m102629i(), m102641e(), this.f15019g.get(), this.f15017e.get(), this.f15015c.m102627k(), this.f15013a.booleanValue(), (InterfaceC51925xy0) this.f15015c.f15050j.get());
        }

        /* renamed from: e */
        public final C28721tU m102641e() {
            return new C28721tU(this.f15014b.f14978a);
        }

        /* renamed from: f */
        public final void m102640f(Boolean bool, Boolean bool2, K46 k46) {
            this.f15017e = W51.m78852b(C25714lX.m27186a());
            this.f15018f = W51.m78852b(C51392x41.m5880a(this.f15015c.f15044d, this.f15014b.f14994q, this.f15014b.f14999v));
            this.f15019g = W51.m78852b(C51137we5.m6558a(this.f15014b.f14970P, this.f15017e, this.f15018f, C49298tY2.m12065a()));
            this.f15020h = W51.m78852b(C48961sy0.m13306a(this.f15015c.f15044d, this.f15018f, this.f15014b.f14971Q, this.f15014b.f14996s));
            this.f15021i = C44218ky0.m28090a(this.f15017e);
            this.f15022j = C35566Qx2.m87556a(C44811ly0.m26592a());
            this.f15023k = C40138e52.m43292a(k46);
            C45997ny0 m22050a = C45997ny0.m22050a(C45264mk0.m25129a(), this.f15023k);
            this.f15024l = m22050a;
            this.f15025m = C36216Tr4.m82353a(this.f15019g, this.f15021i, m22050a);
            C41689gi3 m37883a = C41689gi3.m37883a(this.f15019g, this.f15021i, this.f15022j, this.f15024l, this.f15014b.f14996s, C45264mk0.m25129a(), this.f15025m);
            this.f15026n = m37883a;
            this.f15027o = W51.m78852b(C36235Tt5.m82300a(this.f15020h, this.f15021i, m37883a));
            this.f15028p = W51.m78852b(B01.m114798a(this.f15020h, this.f15026n));
            this.f15029q = W51.m78852b(C38627ba3.m64345a(C48821sk0.m13742a(), C48229rk0.m15488a(), C47636qk0.m17177a(), this.f15021i, this.f15019g, this.f15028p));
            this.f15030r = W51.m78852b(C48095rW2.m15833a(this.f15019g, C43625jy0.m29590a()));
            C52862zZ0 c52862zZ0 = new C52862zZ0();
            this.f15031s = c52862zZ0;
            Z94 m78852b = W51.m78852b(C45130mW2.m25474a(c52862zZ0, C43032iy0.m31558a()));
            this.f15032t = m78852b;
            this.f15033u = FC2.m107442a(this.f15020h, m78852b, this.f15031s, this.f15026n);
            this.f15034v = C40138e52.m43292a(bool2);
            C49872uW1 m10155a = C49872uW1.m10155a(C44811ly0.m26592a());
            this.f15035w = m10155a;
            this.f15036x = C36736Vx2.m79090a(m10155a);
            W36 m78879a = W36.m78879a(this.f15035w);
            this.f15037y = m78879a;
            C45404my0 m24625a = C45404my0.m24625a(this.f15034v, this.f15036x, m78879a);
            this.f15038z = m24625a;
            this.f15010A = C48094rW1.m15836a(m24625a);
            C52862zZ0.m1115a(this.f15031s, W51.m78852b(C45209me5.m25236a(this.f15020h, this.f15019g, this.f15021i, this.f15027o, this.f15029q, this.f15030r, this.f15028p, this.f15026n, this.f15033u, this.f15014b.f14996s, this.f15010A)));
            this.f15011B = C49021t41.m13156a(this.f15019g, this.f15017e, this.f15015c.f15044d, this.f15014b.f14992o, this.f15014b.f14996s, this.f15015c.f15051k, this.f15015c.f15050j);
            this.f15012C = W51.m78852b(C47836r41.m16545a(this.f15014b.f14998u, this.f15011B));
        }

        public C3465e(C3462c c3462c, C3467g c3467g, Boolean bool, Boolean bool2, K46 k46) {
            this.f15016d = this;
            this.f15014b = c3462c;
            this.f15015c = c3467g;
            this.f15013a = bool;
            m102640f(bool, bool2, k46);
        }
    }

    /* renamed from: IH0$f */
    /* loaded from: classes6.dex */
    public static final class C3466f implements C21.InterfaceC0844a {

        /* renamed from: a */
        public final C3462c f15039a;

        /* renamed from: b */
        public String f15040b;

        @Override // p000.C21.InterfaceC0844a
        /* renamed from: b */
        public C3466f mo102639a(String str) {
            this.f15040b = (String) C52272yZ3.m3259b(str);
            return this;
        }

        @Override // p000.C21.InterfaceC0844a
        public C21 build() {
            C52272yZ3.m3260a(this.f15040b, String.class);
            return new C3467g(this.f15039a, this.f15040b);
        }

        public C3466f(C3462c c3462c) {
            this.f15039a = c3462c;
        }
    }

    /* renamed from: IH0$g */
    /* loaded from: classes6.dex */
    public static final class C3467g implements C21 {

        /* renamed from: a */
        public final String f15041a;

        /* renamed from: b */
        public final C3462c f15042b;

        /* renamed from: c */
        public final C3467g f15043c;

        /* renamed from: d */
        public Z94<String> f15044d;

        /* renamed from: e */
        public Z94<BluetoothDevice> f15045e;

        /* renamed from: f */
        public Z94<InterfaceC41846gy0.InterfaceC22520a> f15046f;

        /* renamed from: g */
        public Z94<C34403Ly0> f15047g;

        /* renamed from: h */
        public Z94<C0058AG<InterfaceC44023ke5.EnumC25197a>> f15048h;

        /* renamed from: i */
        public Z94 f15049i;

        /* renamed from: j */
        public Z94<InterfaceC51925xy0> f15050j;

        /* renamed from: k */
        public Z94<L46> f15051k;

        /* renamed from: IH0$g$a */
        /* loaded from: classes6.dex */
        public class C3468a implements Z94<InterfaceC41846gy0.InterfaceC22520a> {
            public C3468a() {
            }

            @Override // p000.Z94
            /* renamed from: a */
            public InterfaceC41846gy0.InterfaceC22520a get() {
                return new C3464d(C3467g.this.f15042b, C3467g.this.f15043c);
            }
        }

        @Override // p000.C21
        /* renamed from: a */
        public InterfaceC45802ne5 mo102637a() {
            return (InterfaceC45802ne5) this.f15049i.get();
        }

        /* renamed from: i */
        public final BluetoothDevice m102629i() {
            return J21.m101284c(this.f15041a, this.f15042b.m102646n());
        }

        /* renamed from: j */
        public final void m102628j(String str) {
            InterfaceC49405tj1 m43292a = C40138e52.m43292a(str);
            this.f15044d = m43292a;
            this.f15045e = J21.m101286a(m43292a, this.f15042b.f14994q);
            this.f15046f = new C3468a();
            this.f15047g = C34637My0.m94541a(this.f15042b.f14998u, this.f15046f, this.f15042b.f14970P);
            Z94<C0058AG<InterfaceC44023ke5.EnumC25197a>> m78852b = W51.m78852b(L21.m97912a());
            this.f15048h = m78852b;
            this.f15049i = W51.m78852b(C48174re5.m15632a(this.f15045e, this.f15047g, m78852b, this.f15042b.f14975U));
            this.f15050j = W51.m78852b(K21.m99318a(this.f15048h));
            this.f15051k = N21.m94441a(C45264mk0.m25129a());
        }

        /* renamed from: k */
        public final L46 m102627k() {
            return M21.m95988a(C45264mk0.m25127c());
        }

        public C3467g(C3462c c3462c, String str) {
            this.f15043c = this;
            this.f15042b = c3462c;
            this.f15041a = str;
            m102628j(str);
        }
    }

    private IH0() {
    }

    /* renamed from: a */
    public static InterfaceC41706gk0.InterfaceC22419a m102660a() {
        return new C3461b();
    }
}
