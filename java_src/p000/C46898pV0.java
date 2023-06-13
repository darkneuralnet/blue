package p000;

import android.os.Parcel;
import android.util.Base64;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p000.R06;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010'\u001a\u00020!¢\u0006\u0004\b(\u0010)J\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0018\u0010\u001e\u001a\u00020\u001dH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\b\u0010 \u001a\u00020\u001fH\u0002J\n\u0010\"\u001a\u0004\u0018\u00010!H\u0002J\b\u0010#\u001a\u00020\u001bH\u0002R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, m28432d2 = {"LpV0;", "", "LGN5;", "k", "Lpm0;", DateTokenConverter.CONVERTER_KEY, "()J", "LM26;", "o", "LJw1;", "h", "LEw1;", "f", "()I", "LFw1;", "g", "LHE;", "b", "()F", "LL16;", "n", "LR06;", "m", "LPx5;", "j", "", "c", "", "i", "Lkotlin/ULong;", "p", "", "e", "", "l", C17296a.f69688o, "Landroid/os/Parcel;", "Landroid/os/Parcel;", "parcel", "string", "<init>", "(Ljava/lang/String;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pV0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46898pV0 {

    /* renamed from: a */
    public final Parcel f103749a;

    public C46898pV0(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        this.f103749a = obtain;
        byte[] decode = Base64.decode(string, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    /* renamed from: a */
    public final int m19192a() {
        return this.f103749a.dataAvail();
    }

    /* renamed from: b */
    public final float m19191b() {
        return C3091HE.m104160c(m19188e());
    }

    /* renamed from: c */
    public final byte m19190c() {
        return this.f103749a.readByte();
    }

    /* renamed from: d */
    public final long m19189d() {
        return C47063pm0.m18746j(m19177p());
    }

    /* renamed from: e */
    public final float m19188e() {
        return this.f103749a.readFloat();
    }

    /* renamed from: f */
    public final int m19187f() {
        byte m19190c = m19190c();
        if (m19190c == 0) {
            return C32748Ew1.f8309b.m108201b();
        }
        if (m19190c == 1) {
            return C32748Ew1.f8309b.m108202a();
        }
        return C32748Ew1.f8309b.m108201b();
    }

    /* renamed from: g */
    public final int m19186g() {
        byte m19190c = m19190c();
        if (m19190c == 0) {
            return C32982Fw1.f10526b.m106231b();
        }
        if (m19190c == 1) {
            return C32982Fw1.f10526b.m106232a();
        }
        if (m19190c == 3) {
            return C32982Fw1.f10526b.m106230c();
        }
        if (m19190c == 2) {
            return C32982Fw1.f10526b.m106229d();
        }
        return C32982Fw1.f10526b.m106231b();
    }

    /* renamed from: h */
    public final C33918Jw1 m19185h() {
        return new C33918Jw1(m19184i());
    }

    /* renamed from: i */
    public final int m19184i() {
        return this.f103749a.readInt();
    }

    /* renamed from: j */
    public final C35335Px5 m19183j() {
        return new C35335Px5(m19189d(), C33056Ge3.m104938a(m19188e(), m19188e()), m19188e(), null);
    }

    /* renamed from: k */
    public final GN5 m19182k() {
        DX2 dx2;
        DX2 dx22 = r15;
        DX2 dx23 = new DX2(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.f103749a.dataAvail() > 1) {
            byte m19190c = m19190c();
            if (m19190c == 1) {
                if (m19192a() < 8) {
                    break;
                }
                dx22.m110296c(m19189d());
            } else {
                dx2 = dx22;
                if (m19190c == 2) {
                    if (m19192a() < 5) {
                        break;
                    }
                    dx2.m110294e(m19178o());
                    dx22 = dx2;
                } else if (m19190c == 3) {
                    if (m19192a() < 4) {
                        break;
                    }
                    dx2.m110291h(m19185h());
                    dx22 = dx2;
                } else if (m19190c == 4) {
                    if (m19192a() < 1) {
                        break;
                    }
                    dx2.m110293f(C32748Ew1.m108209c(m19187f()));
                    dx22 = dx2;
                } else if (m19190c == 5) {
                    if (m19192a() < 1) {
                        break;
                    }
                    dx2.m110292g(C32982Fw1.m106241e(m19186g()));
                    dx22 = dx2;
                } else {
                    if (m19190c == 6) {
                        dx2.m110295d(m19181l());
                    } else if (m19190c == 7) {
                        if (m19192a() < 5) {
                            break;
                        }
                        dx2.m110290i(m19178o());
                    } else if (m19190c == 8) {
                        if (m19192a() < 4) {
                            break;
                        }
                        dx2.m110297b(C3091HE.m104161b(m19191b()));
                    } else if (m19190c == 9) {
                        if (m19192a() < 8) {
                            break;
                        }
                        dx2.m110287l(m19179n());
                    } else if (m19190c == 10) {
                        if (m19192a() < 8) {
                            break;
                        }
                        dx2.m110298a(m19189d());
                    } else if (m19190c == 11) {
                        if (m19192a() < 4) {
                            break;
                        }
                        dx2.m110288k(m19180m());
                    } else if (m19190c == 12) {
                        if (m19192a() < 20) {
                            break;
                        }
                        dx2.m110289j(m19183j());
                    }
                    dx22 = dx2;
                }
            }
        }
        dx2 = dx22;
        return dx2.m110286m();
    }

    /* renamed from: l */
    public final String m19181l() {
        return this.f103749a.readString();
    }

    /* renamed from: m */
    public final R06 m19180m() {
        boolean z;
        boolean z2;
        List<R06> listOf;
        int m19184i = m19184i();
        R06.C7050a c7050a = R06.f31395b;
        if ((c7050a.m87429b().m87431e() & m19184i) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((m19184i & c7050a.m87427d().m87431e()) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new R06[]{c7050a.m87429b(), c7050a.m87427d()});
            return c7050a.m87430a(listOf);
        } else if (z) {
            return c7050a.m87429b();
        } else {
            if (z2) {
                return c7050a.m87427d();
            }
            return c7050a.m87428c();
        }
    }

    /* renamed from: n */
    public final L16 m19179n() {
        return new L16(m19188e(), m19188e());
    }

    /* renamed from: o */
    public final long m19178o() {
        long m92969c;
        byte m19190c = m19190c();
        if (m19190c == 1) {
            m92969c = O26.f25571b.m92970b();
        } else if (m19190c == 2) {
            m92969c = O26.f25571b.m92971a();
        } else {
            m92969c = O26.f25571b.m92969c();
        }
        if (O26.m92975g(m92969c, O26.f25571b.m92969c())) {
            return M26.f22473b.m95968a();
        }
        return N26.m94419a(m19188e(), m92969c);
    }

    /* renamed from: p */
    public final long m19177p() {
        return ULong.m116957constructorimpl(this.f103749a.readLong());
    }
}
