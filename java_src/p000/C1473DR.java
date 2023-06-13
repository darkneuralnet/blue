package p000;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import co.bird.android.model.persistence.BirdRatingHistory;
import co.bird.android.model.persistence.nestedstructures.FlightSheetRideRating;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: DR */
/* loaded from: classes4.dex */
public final class C1473DR extends AbstractC1025CR {

    /* renamed from: a */
    public final AbstractC32563Eb5 f5692a;

    /* renamed from: b */
    public final AbstractC39268cf1<BirdRatingHistory> f5693b;

    /* renamed from: c */
    public final AbstractC41861gz5 f5694c;

    /* renamed from: DR$a */
    /* loaded from: classes4.dex */
    public class C1474a extends AbstractC39268cf1<BirdRatingHistory> {
        public C1474a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `bird_rating_history` (`bird_id`,`bird_code`,`rating_average`,`ratings`,`tags`) VALUES (?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, BirdRatingHistory birdRatingHistory) {
            if (birdRatingHistory.getBirdId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, birdRatingHistory.getBirdId());
            }
            if (birdRatingHistory.getBirdCode() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, birdRatingHistory.getBirdCode());
            }
            interfaceC47496qV5.mo20957M1(3, birdRatingHistory.getRatingAverage());
            C0608BR c0608br = C0608BR.f2311a;
            String m114038c = C0608BR.m114038c(birdRatingHistory.getRatings());
            if (m114038c == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, m114038c);
            }
            String m114037d = C0608BR.m114037d(birdRatingHistory.getTags());
            if (m114037d == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m114037d);
            }
        }
    }

    /* renamed from: DR$b */
    /* loaded from: classes4.dex */
    public class C1475b extends AbstractC41861gz5 {
        public C1475b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM bird_rating_history";
        }
    }

    /* renamed from: DR$c */
    /* loaded from: classes4.dex */
    public class CallableC1476c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ BirdRatingHistory f5697b;

        public CallableC1476c(BirdRatingHistory birdRatingHistory) {
            this.f5697b = birdRatingHistory;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C1473DR.this.f5692a.m108730c();
            try {
                C1473DR.this.f5693b.m61088k(this.f5697b);
                C1473DR.this.f5692a.m108734A();
                C1473DR.this.f5692a.m108728g();
                return null;
            } catch (Throwable th) {
                C1473DR.this.f5692a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: DR$d */
    /* loaded from: classes4.dex */
    public class CallableC1477d implements Callable<Void> {
        public CallableC1477d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C1473DR.this.f5694c.m37254b();
            C1473DR.this.f5692a.m108730c();
            try {
                m37254b.mo17482M();
                C1473DR.this.f5692a.m108734A();
                C1473DR.this.f5692a.m108728g();
                C1473DR.this.f5694c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C1473DR.this.f5692a.m108728g();
                C1473DR.this.f5694c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: DR$e */
    /* loaded from: classes4.dex */
    public class CallableC1478e implements Callable<BirdRatingHistory> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f5700b;

        public CallableC1478e(C33265Hb5 c33265Hb5) {
            this.f5700b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public BirdRatingHistory call() throws Exception {
            String string;
            String string2;
            String string3;
            BirdRatingHistory birdRatingHistory = null;
            String string4 = null;
            Cursor m102673c = IF0.m102673c(C1473DR.this.f5692a, this.f5700b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "bird_id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "bird_code");
                int m41645e3 = C40824fF0.m41645e(m102673c, "rating_average");
                int m41645e4 = C40824fF0.m41645e(m102673c, "ratings");
                int m41645e5 = C40824fF0.m41645e(m102673c, "tags");
                if (m102673c.moveToFirst()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    if (m102673c.isNull(m41645e2)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e2);
                    }
                    double d = m102673c.getDouble(m41645e3);
                    if (m102673c.isNull(m41645e4)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e4);
                    }
                    List<FlightSheetRideRating> m114039b = C0608BR.m114039b(string3);
                    if (!m102673c.isNull(m41645e5)) {
                        string4 = m102673c.getString(m41645e5);
                    }
                    birdRatingHistory = new BirdRatingHistory(string, string2, d, m114039b, C0608BR.m114040a(string4));
                }
                if (birdRatingHistory != null) {
                    return birdRatingHistory;
                }
                throw new EmptyResultSetException("Query returned empty result set: " + this.f5700b.mo19174a());
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f5700b.release();
        }
    }

    public C1473DR(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f5692a = abstractC32563Eb5;
        this.f5693b = new C1474a(abstractC32563Eb5);
        this.f5694c = new C1475b(abstractC32563Eb5);
    }

    /* renamed from: g */
    public static List<Class<?>> m110456g() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC1025CR
    /* renamed from: a */
    public AbstractC23442F<BirdRatingHistory> mo110462a(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM bird_rating_history WHERE bird_id = ?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72806e(new CallableC1478e(m103680c));
    }

    @Override // p000.AbstractC1025CR
    /* renamed from: b */
    public AbstractC23461c mo110461b() {
        return AbstractC23461c.m33078H(new CallableC1477d());
    }

    @Override // p000.AbstractC1025CR
    /* renamed from: c */
    public AbstractC23461c mo110460c(BirdRatingHistory birdRatingHistory) {
        return AbstractC23461c.m33078H(new CallableC1476c(birdRatingHistory));
    }
}
