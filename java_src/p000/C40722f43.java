package p000;

import android.database.Cursor;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.NestIcon;
import co.bird.android.model.constant.NestProminence;
import co.bird.android.model.constant.NestViewState;
import co.bird.android.model.persistence.NestMarker;
import co.bird.android.model.persistence.nestedstructures.Coordinate;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.joda.time.DateTime;
/* renamed from: f43  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40722f43 extends AbstractC40129e43 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f79364a;

    /* renamed from: b */
    public final AbstractC39268cf1<NestMarker> f79365b;

    /* renamed from: c */
    public final AbstractC39268cf1<NestMarker> f79366c;

    /* renamed from: d */
    public final AbstractC38675bf1<NestMarker> f79367d;

    /* renamed from: e */
    public final AbstractC38675bf1<NestMarker> f79368e;

    /* renamed from: f */
    public final AbstractC41861gz5 f79369f;

    /* renamed from: f43$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C20185a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f79370a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f79371b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f79372c;

        static {
            int[] iArr = new int[NestProminence.values().length];
            f79372c = iArr;
            try {
                iArr[NestProminence.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79372c[NestProminence.MINIMIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[NestIcon.values().length];
            f79371b = iArr2;
            try {
                iArr2[NestIcon.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f79371b[NestIcon.BIRD.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f79371b[NestIcon.BIKE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f79371b[NestIcon.BLUE_HEART.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f79371b[NestIcon.BLUE_STAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f79371b[NestIcon.EMPTY_SQUARE.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f79371b[NestIcon.FLAG.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f79371b[NestIcon.GOLD_HEART.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f79371b[NestIcon.GOLD_STAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f79371b[NestIcon.HEART.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f79371b[NestIcon.LOCK.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f79371b[NestIcon.REBALANCE.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f79371b[NestIcon.SILVER_HEART.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f79371b[NestIcon.SILVER_STAR.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f79371b[NestIcon.TRIAL.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f79371b[NestIcon.UNKNOWN.ordinal()] = 16;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr3 = new int[NestViewState.values().length];
            f79370a = iArr3;
            try {
                iArr3[NestViewState.FLAGGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f79370a[NestViewState.LOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f79370a[NestViewState.RECOMMENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f79370a[NestViewState.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    /* renamed from: f43$b */
    /* loaded from: classes4.dex */
    public class C20186b extends AbstractC39268cf1<NestMarker> {
        public C20186b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR ABORT INTO `nest_markers` (`id`,`location`,`capacity`,`state`,`icon`,`secondary_icon`,`secondary_icon_color`,`secondary_icon_background_color`,`prominence`,`updated_at`,`available_space_details`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, NestMarker nestMarker) {
            if (nestMarker.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, nestMarker.getId());
            }
            Converters converters = Converters.f66822a;
            String m55272l = Converters.m55272l(nestMarker.getLocation());
            if (m55272l == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m55272l);
            }
            interfaceC47496qV5.mo20956S0(3, nestMarker.getCapacity());
            if (nestMarker.getState() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, C40722f43.this.m42186w(nestMarker.getState()));
            }
            if (nestMarker.getIcon() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, C40722f43.this.m42190s(nestMarker.getIcon()));
            }
            String m55274j = Converters.m55274j(nestMarker.getSecondaryIcon());
            if (m55274j == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, m55274j);
            }
            String m55270n = Converters.m55270n(nestMarker.getSecondaryIconColor());
            if (m55270n == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m55270n);
            }
            String m55270n2 = Converters.m55270n(nestMarker.getSecondaryIconBackgroundColor());
            if (m55270n2 == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, m55270n2);
            }
            if (nestMarker.getProminence() == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, C40722f43.this.m42188u(nestMarker.getProminence()));
            }
            String m55279e = Converters.m55279e(nestMarker.getUpdatedAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, m55279e);
            }
            C39537d43 c39537d43 = C39537d43.f76097a;
            String m44644b = C39537d43.m44644b(nestMarker.getAvailableSpaceDetails());
            if (m44644b == null) {
                interfaceC47496qV5.mo20954m1(11);
            } else {
                interfaceC47496qV5.mo20958G0(11, m44644b);
            }
        }
    }

    /* renamed from: f43$c */
    /* loaded from: classes4.dex */
    public class C20187c extends AbstractC39268cf1<NestMarker> {
        public C20187c(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `nest_markers` (`id`,`location`,`capacity`,`state`,`icon`,`secondary_icon`,`secondary_icon_color`,`secondary_icon_background_color`,`prominence`,`updated_at`,`available_space_details`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, NestMarker nestMarker) {
            if (nestMarker.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, nestMarker.getId());
            }
            Converters converters = Converters.f66822a;
            String m55272l = Converters.m55272l(nestMarker.getLocation());
            if (m55272l == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m55272l);
            }
            interfaceC47496qV5.mo20956S0(3, nestMarker.getCapacity());
            if (nestMarker.getState() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, C40722f43.this.m42186w(nestMarker.getState()));
            }
            if (nestMarker.getIcon() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, C40722f43.this.m42190s(nestMarker.getIcon()));
            }
            String m55274j = Converters.m55274j(nestMarker.getSecondaryIcon());
            if (m55274j == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, m55274j);
            }
            String m55270n = Converters.m55270n(nestMarker.getSecondaryIconColor());
            if (m55270n == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m55270n);
            }
            String m55270n2 = Converters.m55270n(nestMarker.getSecondaryIconBackgroundColor());
            if (m55270n2 == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, m55270n2);
            }
            if (nestMarker.getProminence() == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, C40722f43.this.m42188u(nestMarker.getProminence()));
            }
            String m55279e = Converters.m55279e(nestMarker.getUpdatedAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, m55279e);
            }
            C39537d43 c39537d43 = C39537d43.f76097a;
            String m44644b = C39537d43.m44644b(nestMarker.getAvailableSpaceDetails());
            if (m44644b == null) {
                interfaceC47496qV5.mo20954m1(11);
            } else {
                interfaceC47496qV5.mo20958G0(11, m44644b);
            }
        }
    }

    /* renamed from: f43$d */
    /* loaded from: classes4.dex */
    public class C20188d extends AbstractC38675bf1<NestMarker> {
        public C20188d(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM `nest_markers` WHERE `id` = ?";
        }

        @Override // p000.AbstractC38675bf1
        /* renamed from: m */
        public void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, NestMarker nestMarker) {
            if (nestMarker.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, nestMarker.getId());
            }
        }
    }

    /* renamed from: f43$e */
    /* loaded from: classes4.dex */
    public class C20189e extends AbstractC38675bf1<NestMarker> {
        public C20189e(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE OR IGNORE `nest_markers` SET `id` = ?,`location` = ?,`capacity` = ?,`state` = ?,`icon` = ?,`secondary_icon` = ?,`secondary_icon_color` = ?,`secondary_icon_background_color` = ?,`prominence` = ?,`updated_at` = ?,`available_space_details` = ? WHERE `id` = ?";
        }

        @Override // p000.AbstractC38675bf1
        /* renamed from: m */
        public void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, NestMarker nestMarker) {
            if (nestMarker.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, nestMarker.getId());
            }
            Converters converters = Converters.f66822a;
            String m55272l = Converters.m55272l(nestMarker.getLocation());
            if (m55272l == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m55272l);
            }
            interfaceC47496qV5.mo20956S0(3, nestMarker.getCapacity());
            if (nestMarker.getState() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, C40722f43.this.m42186w(nestMarker.getState()));
            }
            if (nestMarker.getIcon() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, C40722f43.this.m42190s(nestMarker.getIcon()));
            }
            String m55274j = Converters.m55274j(nestMarker.getSecondaryIcon());
            if (m55274j == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, m55274j);
            }
            String m55270n = Converters.m55270n(nestMarker.getSecondaryIconColor());
            if (m55270n == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m55270n);
            }
            String m55270n2 = Converters.m55270n(nestMarker.getSecondaryIconBackgroundColor());
            if (m55270n2 == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, m55270n2);
            }
            if (nestMarker.getProminence() == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, C40722f43.this.m42188u(nestMarker.getProminence()));
            }
            String m55279e = Converters.m55279e(nestMarker.getUpdatedAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, m55279e);
            }
            C39537d43 c39537d43 = C39537d43.f76097a;
            String m44644b = C39537d43.m44644b(nestMarker.getAvailableSpaceDetails());
            if (m44644b == null) {
                interfaceC47496qV5.mo20954m1(11);
            } else {
                interfaceC47496qV5.mo20958G0(11, m44644b);
            }
            if (nestMarker.getId() == null) {
                interfaceC47496qV5.mo20954m1(12);
            } else {
                interfaceC47496qV5.mo20958G0(12, nestMarker.getId());
            }
        }
    }

    /* renamed from: f43$f */
    /* loaded from: classes4.dex */
    public class C20190f extends AbstractC41861gz5 {
        public C20190f(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM nest_markers";
        }
    }

    /* renamed from: f43$g */
    /* loaded from: classes4.dex */
    public class CallableC20191g implements Callable<Void> {
        public CallableC20191g() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C40722f43.this.f79369f.m37254b();
            C40722f43.this.f79364a.m108730c();
            try {
                m37254b.mo17482M();
                C40722f43.this.f79364a.m108734A();
                C40722f43.this.f79364a.m108728g();
                C40722f43.this.f79369f.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C40722f43.this.f79364a.m108728g();
                C40722f43.this.f79369f.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: f43$h */
    /* loaded from: classes4.dex */
    public class CallableC20192h implements Callable<List<NestMarker>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f79379b;

        public CallableC20192h(C33265Hb5 c33265Hb5) {
            this.f79379b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<NestMarker> call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            C40722f43.this.f79364a.m108730c();
            try {
                Cursor m102673c = IF0.m102673c(C40722f43.this.f79364a, this.f79379b, false, null);
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(0)) {
                        string = null;
                    } else {
                        string = m102673c.getString(0);
                    }
                    if (m102673c.isNull(1)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(1);
                    }
                    Coordinate m55280d = Converters.m55280d(string2);
                    int i = m102673c.getInt(2);
                    NestViewState m42185x = C40722f43.this.m42185x(m102673c.getString(3));
                    NestIcon m42189t = C40722f43.this.m42189t(m102673c.getString(4));
                    if (m102673c.isNull(5)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(5);
                    }
                    ClientIcon m55281c = Converters.m55281c(string3);
                    if (m102673c.isNull(6)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(6);
                    }
                    ThemedColors m55266r = Converters.m55266r(string4);
                    if (m102673c.isNull(7)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(7);
                    }
                    ThemedColors m55266r2 = Converters.m55266r(string5);
                    NestProminence m42187v = C40722f43.this.m42187v(m102673c.getString(8));
                    if (m102673c.isNull(9)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(9);
                    }
                    DateTime m55278f = Converters.m55278f(string6);
                    if (m102673c.isNull(10)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(10);
                    }
                    arrayList.add(new NestMarker(string, m55280d, i, m42185x, m42189t, m55281c, m55266r, m55266r2, m42187v, m55278f, C39537d43.m44643c(string7)));
                }
                C40722f43.this.f79364a.m108734A();
                m102673c.close();
                return arrayList;
            } finally {
                C40722f43.this.f79364a.m108728g();
            }
        }

        public void finalize() {
            this.f79379b.release();
        }
    }

    public C40722f43(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f79364a = abstractC32563Eb5;
        this.f79365b = new C20186b(abstractC32563Eb5);
        this.f79366c = new C20187c(abstractC32563Eb5);
        this.f79367d = new C20188d(abstractC32563Eb5);
        this.f79368e = new C20189e(abstractC32563Eb5);
        this.f79369f = new C20190f(abstractC32563Eb5);
    }

    /* renamed from: A */
    public static List<Class<?>> m42209A() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC40129e43
    /* renamed from: a */
    public AbstractC23461c mo42208a() {
        return AbstractC23461c.m33078H(new CallableC20191g());
    }

    @Override // p000.AbstractC40129e43
    /* renamed from: b */
    public List<String> mo42207b(List<Long> list) {
        String string;
        StringBuilder m33905b = C42725iS5.m33905b();
        m33905b.append("SELECT `id` from nest_markers WHERE rowid in (");
        int size = list.size();
        C42725iS5.m33906a(m33905b, size);
        m33905b.append(")");
        C33265Hb5 m103680c = C33265Hb5.m103680c(m33905b.toString(), size + 0);
        int i = 1;
        for (Long l : list) {
            if (l == null) {
                m103680c.mo20954m1(i);
            } else {
                m103680c.mo20956S0(i, l.longValue());
            }
            i++;
        }
        this.f79364a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f79364a, m103680c, false, null);
        try {
            ArrayList arrayList = new ArrayList(m102673c.getCount());
            while (m102673c.moveToNext()) {
                if (m102673c.isNull(0)) {
                    string = null;
                } else {
                    string = m102673c.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            m102673c.close();
            m103680c.release();
        }
    }

    @Override // p000.AbstractC40129e43
    /* renamed from: c */
    public List<Long> mo42206c(NestMarker... nestMarkerArr) {
        this.f79364a.m108731b();
        this.f79364a.m108730c();
        try {
            List<Long> m61084o = this.f79366c.m61084o(nestMarkerArr);
            this.f79364a.m108734A();
            return m61084o;
        } finally {
            this.f79364a.m108728g();
        }
    }

    @Override // p000.AbstractC40129e43
    /* renamed from: d */
    public AbstractC24490k<List<NestMarker>> mo42205d() {
        return C37504Ze5.m72810a(this.f79364a, true, new String[]{"nest_markers"}, new CallableC20192h(C33265Hb5.m103680c("SELECT `nest_markers`.`id` AS `id`, `nest_markers`.`location` AS `location`, `nest_markers`.`capacity` AS `capacity`, `nest_markers`.`state` AS `state`, `nest_markers`.`icon` AS `icon`, `nest_markers`.`secondary_icon` AS `secondary_icon`, `nest_markers`.`secondary_icon_color` AS `secondary_icon_color`, `nest_markers`.`secondary_icon_background_color` AS `secondary_icon_background_color`, `nest_markers`.`prominence` AS `prominence`, `nest_markers`.`updated_at` AS `updated_at`, `nest_markers`.`available_space_details` AS `available_space_details` FROM nest_markers", 0)));
    }

    @Override // p000.AbstractC40129e43
    /* renamed from: e */
    public List<NestMarker> mo42204e() {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT `nest_markers`.`id` AS `id`, `nest_markers`.`location` AS `location`, `nest_markers`.`capacity` AS `capacity`, `nest_markers`.`state` AS `state`, `nest_markers`.`icon` AS `icon`, `nest_markers`.`secondary_icon` AS `secondary_icon`, `nest_markers`.`secondary_icon_color` AS `secondary_icon_color`, `nest_markers`.`secondary_icon_background_color` AS `secondary_icon_background_color`, `nest_markers`.`prominence` AS `prominence`, `nest_markers`.`updated_at` AS `updated_at`, `nest_markers`.`available_space_details` AS `available_space_details` FROM nest_markers", 0);
        this.f79364a.m108731b();
        Cursor m102673c = IF0.m102673c(this.f79364a, m103680c, false, null);
        try {
            ArrayList arrayList = new ArrayList(m102673c.getCount());
            while (m102673c.moveToNext()) {
                if (m102673c.isNull(0)) {
                    string = null;
                } else {
                    string = m102673c.getString(0);
                }
                if (m102673c.isNull(1)) {
                    string2 = null;
                } else {
                    string2 = m102673c.getString(1);
                }
                Coordinate m55280d = Converters.m55280d(string2);
                int i = m102673c.getInt(2);
                NestViewState m42185x = m42185x(m102673c.getString(3));
                NestIcon m42189t = m42189t(m102673c.getString(4));
                if (m102673c.isNull(5)) {
                    string3 = null;
                } else {
                    string3 = m102673c.getString(5);
                }
                ClientIcon m55281c = Converters.m55281c(string3);
                if (m102673c.isNull(6)) {
                    string4 = null;
                } else {
                    string4 = m102673c.getString(6);
                }
                ThemedColors m55266r = Converters.m55266r(string4);
                if (m102673c.isNull(7)) {
                    string5 = null;
                } else {
                    string5 = m102673c.getString(7);
                }
                ThemedColors m55266r2 = Converters.m55266r(string5);
                NestProminence m42187v = m42187v(m102673c.getString(8));
                if (m102673c.isNull(9)) {
                    string6 = null;
                } else {
                    string6 = m102673c.getString(9);
                }
                DateTime m55278f = Converters.m55278f(string6);
                if (m102673c.isNull(10)) {
                    string7 = null;
                } else {
                    string7 = m102673c.getString(10);
                }
                arrayList.add(new NestMarker(string, m55280d, i, m42185x, m42189t, m55281c, m55266r, m55266r2, m42187v, m55278f, C39537d43.m44643c(string7)));
            }
            return arrayList;
        } finally {
            m102673c.close();
            m103680c.release();
        }
    }

    @Override // p000.AbstractC40129e43
    /* renamed from: f */
    public void mo42203f(List<NestMarker> list) {
        this.f79364a.m108731b();
        this.f79364a.m108730c();
        try {
            this.f79367d.m64206k(list);
            this.f79364a.m108734A();
        } finally {
            this.f79364a.m108728g();
        }
    }

    @Override // p000.AbstractC40129e43
    /* renamed from: g */
    public void mo42202g(List<String> list) {
        this.f79364a.m108731b();
        StringBuilder m33905b = C42725iS5.m33905b();
        m33905b.append("DELETE FROM nest_markers WHERE id NOT in (");
        C42725iS5.m33906a(m33905b, list.size());
        m33905b.append(")");
        InterfaceC47496qV5 m108729d = this.f79364a.m108729d(m33905b.toString());
        int i = 1;
        for (String str : list) {
            if (str == null) {
                m108729d.mo20954m1(i);
            } else {
                m108729d.mo20958G0(i, str);
            }
            i++;
        }
        this.f79364a.m108730c();
        try {
            m108729d.mo17482M();
            this.f79364a.m108734A();
        } finally {
            this.f79364a.m108728g();
        }
    }

    @Override // p000.AbstractC40129e43
    /* renamed from: h */
    public void mo42201h(List<String> list) {
        this.f79364a.m108730c();
        try {
            super.mo42201h(list);
            this.f79364a.m108734A();
        } finally {
            this.f79364a.m108728g();
        }
    }

    @Override // p000.AbstractC40129e43
    /* renamed from: i */
    public void mo42200i(NestMarker... nestMarkerArr) {
        this.f79364a.m108731b();
        this.f79364a.m108730c();
        try {
            this.f79368e.m64205l(nestMarkerArr);
            this.f79364a.m108734A();
        } finally {
            this.f79364a.m108728g();
        }
    }

    @Override // p000.AbstractC40129e43
    /* renamed from: j */
    public void mo42199j(List<NestMarker> list) {
        this.f79364a.m108730c();
        try {
            super.mo42199j(list);
            this.f79364a.m108734A();
        } finally {
            this.f79364a.m108728g();
        }
    }

    /* renamed from: s */
    public final String m42190s(NestIcon nestIcon) {
        if (nestIcon == null) {
            return null;
        }
        switch (C20185a.f79371b[nestIcon.ordinal()]) {
            case 1:
                return "AVAILABLE";
            case 2:
                return "BIRD";
            case 3:
                return "BIKE";
            case 4:
                return "BLUE_HEART";
            case 5:
                return "BLUE_STAR";
            case 6:
                return "EMPTY_SQUARE";
            case 7:
                return "FLAG";
            case 8:
                return "GOLD_HEART";
            case 9:
                return "GOLD_STAR";
            case 10:
                return "HEART";
            case 11:
                return "LOCK";
            case 12:
                return "REBALANCE";
            case 13:
                return "SILVER_HEART";
            case 14:
                return "SILVER_STAR";
            case 15:
                return "TRIAL";
            case 16:
                return "UNKNOWN";
            default:
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + nestIcon);
        }
    }

    /* renamed from: t */
    public final NestIcon m42189t(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1808752343:
                if (str.equals("REBALANCE")) {
                    c = 0;
                    break;
                }
                break;
            case -1402318780:
                if (str.equals("SILVER_STAR")) {
                    c = 1;
                    break;
                }
                break;
            case -532814732:
                if (str.equals("SILVER_HEART")) {
                    c = 2;
                    break;
                }
                break;
            case 2038753:
                if (str.equals("BIKE")) {
                    c = 3;
                    break;
                }
                break;
            case 2038969:
                if (str.equals("BIRD")) {
                    c = 4;
                    break;
                }
                break;
            case 2160492:
                if (str.equals("FLAG")) {
                    c = 5;
                    break;
                }
                break;
            case 2342187:
                if (str.equals("LOCK")) {
                    c = 6;
                    break;
                }
                break;
            case 68614182:
                if (str.equals("HEART")) {
                    c = 7;
                    break;
                }
                break;
            case 80090870:
                if (str.equals("TRIAL")) {
                    c = '\b';
                    break;
                }
                break;
            case 196152199:
                if (str.equals("GOLD_HEART")) {
                    c = '\t';
                    break;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    c = '\n';
                    break;
                }
                break;
            case 470791959:
                if (str.equals("BLUE_STAR")) {
                    c = 11;
                    break;
                }
                break;
            case 705364079:
                if (str.equals("EMPTY_SQUARE")) {
                    c = '\f';
                    break;
                }
                break;
            case 1530690257:
                if (str.equals("GOLD_STAR")) {
                    c = '\r';
                    break;
                }
                break;
            case 1699043329:
                if (str.equals("BLUE_HEART")) {
                    c = 14;
                    break;
                }
                break;
            case 2052692649:
                if (str.equals("AVAILABLE")) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return NestIcon.REBALANCE;
            case 1:
                return NestIcon.SILVER_STAR;
            case 2:
                return NestIcon.SILVER_HEART;
            case 3:
                return NestIcon.BIKE;
            case 4:
                return NestIcon.BIRD;
            case 5:
                return NestIcon.FLAG;
            case 6:
                return NestIcon.LOCK;
            case 7:
                return NestIcon.HEART;
            case '\b':
                return NestIcon.TRIAL;
            case '\t':
                return NestIcon.GOLD_HEART;
            case '\n':
                return NestIcon.UNKNOWN;
            case 11:
                return NestIcon.BLUE_STAR;
            case '\f':
                return NestIcon.EMPTY_SQUARE;
            case '\r':
                return NestIcon.GOLD_STAR;
            case 14:
                return NestIcon.BLUE_HEART;
            case 15:
                return NestIcon.AVAILABLE;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
        }
    }

    /* renamed from: u */
    public final String m42188u(NestProminence nestProminence) {
        if (nestProminence == null) {
            return null;
        }
        int i = C20185a.f79372c[nestProminence.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "MINIMIZED";
            }
            throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + nestProminence);
        }
        return "FULL";
    }

    /* renamed from: v */
    public final NestProminence m42187v(String str) {
        if (str == null) {
            return null;
        }
        if (!str.equals("MINIMIZED")) {
            if (str.equals("FULL")) {
                return NestProminence.FULL;
            }
            throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
        }
        return NestProminence.MINIMIZED;
    }

    /* renamed from: w */
    public final String m42186w(NestViewState nestViewState) {
        if (nestViewState == null) {
            return null;
        }
        int i = C20185a.f79370a[nestViewState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return "UNKNOWN";
                    }
                    throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + nestViewState);
                }
                return "RECOMMENDED";
            }
            return "LOCKED";
        }
        return "FLAGGED";
    }

    /* renamed from: x */
    public final NestViewState m42185x(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2044123382:
                if (str.equals("LOCKED")) {
                    c = 0;
                    break;
                }
                break;
            case -704089541:
                if (str.equals("RECOMMENDED")) {
                    c = 1;
                    break;
                }
                break;
            case -61221830:
                if (str.equals("FLAGGED")) {
                    c = 2;
                    break;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return NestViewState.LOCKED;
            case 1:
                return NestViewState.RECOMMENDED;
            case 2:
                return NestViewState.FLAGGED;
            case 3:
                return NestViewState.UNKNOWN;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
        }
    }
}
