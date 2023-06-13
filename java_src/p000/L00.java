package p000;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import co.bird.android.model.persistence.BountyFlightSheetDetails;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetHeader;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetMapButtonOverrides;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: L00 */
/* loaded from: classes4.dex */
public final class L00 extends K00 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f20559a;

    /* renamed from: b */
    public final AbstractC39268cf1<BountyFlightSheetDetails> f20560b;

    /* renamed from: c */
    public final AbstractC41861gz5 f20561c;

    /* renamed from: L00$a */
    /* loaded from: classes4.dex */
    public class C4685a extends AbstractC39268cf1<BountyFlightSheetDetails> {
        public C4685a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `bounty_flight_sheet` (`bounty_id`,`map_button_overrides`,`header`,`sections`) VALUES (?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, BountyFlightSheetDetails bountyFlightSheetDetails) {
            if (bountyFlightSheetDetails.getBountyId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, bountyFlightSheetDetails.getBountyId());
            }
            A00 a00 = A00.f0a;
            String m116205h = A00.m116205h(bountyFlightSheetDetails.getMapButtonOverrides());
            if (m116205h == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m116205h);
            }
            String m116207f = A00.m116207f(bountyFlightSheetDetails.getHeader());
            if (m116207f == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m116207f);
            }
            String m116206g = A00.m116206g(bountyFlightSheetDetails.getSections());
            if (m116206g == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, m116206g);
            }
        }
    }

    /* renamed from: L00$b */
    /* loaded from: classes4.dex */
    public class C4686b extends AbstractC41861gz5 {
        public C4686b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM bounty_flight_sheet";
        }
    }

    /* renamed from: L00$c */
    /* loaded from: classes4.dex */
    public class CallableC4687c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ BountyFlightSheetDetails f20564b;

        public CallableC4687c(BountyFlightSheetDetails bountyFlightSheetDetails) {
            this.f20564b = bountyFlightSheetDetails;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            L00.this.f20559a.m108730c();
            try {
                L00.this.f20560b.m61088k(this.f20564b);
                L00.this.f20559a.m108734A();
                L00.this.f20559a.m108728g();
                return null;
            } catch (Throwable th) {
                L00.this.f20559a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: L00$d */
    /* loaded from: classes4.dex */
    public class CallableC4688d implements Callable<Void> {
        public CallableC4688d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = L00.this.f20561c.m37254b();
            L00.this.f20559a.m108730c();
            try {
                m37254b.mo17482M();
                L00.this.f20559a.m108734A();
                L00.this.f20559a.m108728g();
                L00.this.f20561c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                L00.this.f20559a.m108728g();
                L00.this.f20561c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: L00$e */
    /* loaded from: classes4.dex */
    public class CallableC4689e implements Callable<BountyFlightSheetDetails> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f20567b;

        public CallableC4689e(C33265Hb5 c33265Hb5) {
            this.f20567b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public BountyFlightSheetDetails call() throws Exception {
            String string;
            String string2;
            String string3;
            BountyFlightSheetDetails bountyFlightSheetDetails = null;
            String string4 = null;
            Cursor m102673c = IF0.m102673c(L00.this.f20559a, this.f20567b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "bounty_id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "map_button_overrides");
                int m41645e3 = C40824fF0.m41645e(m102673c, "header");
                int m41645e4 = C40824fF0.m41645e(m102673c, "sections");
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
                    List<BountyFlightSheetMapButtonOverrides> m116209d = A00.m116209d(string2);
                    if (m102673c.isNull(m41645e3)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e3);
                    }
                    BountyFlightSheetHeader m116210c = A00.m116210c(string3);
                    if (!m102673c.isNull(m41645e4)) {
                        string4 = m102673c.getString(m41645e4);
                    }
                    bountyFlightSheetDetails = new BountyFlightSheetDetails(string, m116209d, m116210c, A00.m116208e(string4));
                }
                if (bountyFlightSheetDetails != null) {
                    return bountyFlightSheetDetails;
                }
                throw new EmptyResultSetException("Query returned empty result set: " + this.f20567b.mo19174a());
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f20567b.release();
        }
    }

    public L00(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f20559a = abstractC32563Eb5;
        this.f20560b = new C4685a(abstractC32563Eb5);
        this.f20561c = new C4686b(abstractC32563Eb5);
    }

    /* renamed from: g */
    public static List<Class<?>> m97945g() {
        return Collections.emptyList();
    }

    @Override // p000.K00
    /* renamed from: a */
    public AbstractC23442F<BountyFlightSheetDetails> mo97951a(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM bounty_flight_sheet WHERE bounty_id = ? LIMIT 1", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72806e(new CallableC4689e(m103680c));
    }

    @Override // p000.K00
    /* renamed from: b */
    public AbstractC23461c mo97950b() {
        return AbstractC23461c.m33078H(new CallableC4688d());
    }

    @Override // p000.K00
    /* renamed from: c */
    public AbstractC23461c mo97949c(BountyFlightSheetDetails bountyFlightSheetDetails) {
        return AbstractC23461c.m33078H(new CallableC4687c(bountyFlightSheetDetails));
    }
}
