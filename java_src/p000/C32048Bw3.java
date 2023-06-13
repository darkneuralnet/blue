package p000;

import android.database.Cursor;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.ColoredIcon;
import co.bird.android.model.constant.OperatorFilterType;
import co.bird.android.model.constant.OperatorMapKind;
import co.bird.android.model.persistence.OperatorToggleFilter;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: Bw3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32048Bw3 extends AbstractC31814Aw3 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f3055a;

    /* renamed from: b */
    public final AbstractC39268cf1<OperatorToggleFilter> f3056b;

    /* renamed from: c */
    public final AbstractC41861gz5 f3057c;

    /* renamed from: Bw3$a */
    /* loaded from: classes4.dex */
    public class C0767a extends AbstractC39268cf1<OperatorToggleFilter> {
        public C0767a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `operator_toggle_filters` (`id`,`kind`,`ordinal_num`,`type`,`title`,`toggle_title`,`enabled`,`icon`,`icon_color`,`colored_icon`,`icon_background_color`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, OperatorToggleFilter operatorToggleFilter) {
            if (operatorToggleFilter.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, operatorToggleFilter.getId());
            }
            C37088Xk3 c37088Xk3 = C37088Xk3.f43786a;
            String m76479c = C37088Xk3.m76479c(operatorToggleFilter.getKind());
            if (m76479c == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m76479c);
            }
            interfaceC47496qV5.mo20956S0(3, operatorToggleFilter.getOrdinal());
            String m76480b = C37088Xk3.m76480b(operatorToggleFilter.getType());
            if (m76480b == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, m76480b);
            }
            if (operatorToggleFilter.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, operatorToggleFilter.getTitle());
            }
            if (operatorToggleFilter.getToggleTitle() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, operatorToggleFilter.getToggleTitle());
            }
            interfaceC47496qV5.mo20956S0(7, operatorToggleFilter.getEnabled() ? 1L : 0L);
            Converters converters = Converters.f66822a;
            String m55274j = Converters.m55274j(operatorToggleFilter.getIcon());
            if (m55274j == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, m55274j);
            }
            String m55270n = Converters.m55270n(operatorToggleFilter.getIconColor());
            if (m55270n == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, m55270n);
            }
            if (operatorToggleFilter.getColoredIcon() == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, C32048Bw3.this.m113318j(operatorToggleFilter.getColoredIcon()));
            }
            String m55270n2 = Converters.m55270n(operatorToggleFilter.getIconBackgroundColor());
            if (m55270n2 == null) {
                interfaceC47496qV5.mo20954m1(11);
            } else {
                interfaceC47496qV5.mo20958G0(11, m55270n2);
            }
        }
    }

    /* renamed from: Bw3$b */
    /* loaded from: classes4.dex */
    public class C0768b extends AbstractC41861gz5 {
        public C0768b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM operator_toggle_filters";
        }
    }

    /* renamed from: Bw3$c */
    /* loaded from: classes4.dex */
    public class CallableC0769c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f3060b;

        public CallableC0769c(List list) {
            this.f3060b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C32048Bw3.this.f3055a.m108730c();
            try {
                C32048Bw3.this.f3056b.m61089j(this.f3060b);
                C32048Bw3.this.f3055a.m108734A();
                C32048Bw3.this.f3055a.m108728g();
                return null;
            } catch (Throwable th) {
                C32048Bw3.this.f3055a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: Bw3$d */
    /* loaded from: classes4.dex */
    public class CallableC0770d implements Callable<Void> {
        public CallableC0770d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C32048Bw3.this.f3057c.m37254b();
            C32048Bw3.this.f3055a.m108730c();
            try {
                m37254b.mo17482M();
                C32048Bw3.this.f3055a.m108734A();
                C32048Bw3.this.f3055a.m108728g();
                C32048Bw3.this.f3057c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C32048Bw3.this.f3055a.m108728g();
                C32048Bw3.this.f3057c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Bw3$e */
    /* loaded from: classes4.dex */
    public class CallableC0771e implements Callable<List<OperatorToggleFilter>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f3063b;

        public CallableC0771e(C33265Hb5 c33265Hb5) {
            this.f3063b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<OperatorToggleFilter> call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            boolean z;
            String string6;
            String string7;
            String string8;
            Cursor m102673c = IF0.m102673c(C32048Bw3.this.f3055a, this.f3063b, false, null);
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
                    OperatorMapKind m76475g = C37088Xk3.m76475g(string2);
                    int i = m102673c.getInt(2);
                    if (m102673c.isNull(3)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(3);
                    }
                    OperatorFilterType m76476f = C37088Xk3.m76476f(string3);
                    if (m102673c.isNull(4)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(4);
                    }
                    if (m102673c.isNull(5)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(5);
                    }
                    if (m102673c.getInt(6) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (m102673c.isNull(7)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(7);
                    }
                    ClientIcon m55281c = Converters.m55281c(string6);
                    if (m102673c.isNull(8)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(8);
                    }
                    ThemedColors m55266r = Converters.m55266r(string7);
                    ColoredIcon m113317k = C32048Bw3.this.m113317k(m102673c.getString(9));
                    if (m102673c.isNull(10)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(10);
                    }
                    arrayList.add(new OperatorToggleFilter(string, m76475g, i, m76476f, string4, string5, z, m55281c, m55266r, m113317k, Converters.m55266r(string8)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f3063b.release();
        }
    }

    /* renamed from: Bw3$f */
    /* loaded from: classes4.dex */
    public class CallableC0772f implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f3065b;

        public CallableC0772f(List list) {
            this.f3065b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            StringBuilder m33905b = C42725iS5.m33905b();
            m33905b.append("DELETE FROM operator_toggle_filters WHERE id NOT IN (");
            C42725iS5.m33906a(m33905b, this.f3065b.size());
            m33905b.append(")");
            InterfaceC47496qV5 m108729d = C32048Bw3.this.f3055a.m108729d(m33905b.toString());
            int i = 1;
            for (String str : this.f3065b) {
                if (str == null) {
                    m108729d.mo20954m1(i);
                } else {
                    m108729d.mo20958G0(i, str);
                }
                i++;
            }
            C32048Bw3.this.f3055a.m108730c();
            try {
                m108729d.mo17482M();
                C32048Bw3.this.f3055a.m108734A();
                C32048Bw3.this.f3055a.m108728g();
                return null;
            } catch (Throwable th) {
                C32048Bw3.this.f3055a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: Bw3$g */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C0773g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3067a;

        static {
            int[] iArr = new int[ColoredIcon.values().length];
            f3067a = iArr;
            try {
                iArr[ColoredIcon.IC_SCOOTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3067a[ColoredIcon.IC_STAR_EMOJI_BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3067a[ColoredIcon.IC_STAR_EMOJI_GOLD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3067a[ColoredIcon.IC_STAR_EMOJI_SILVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3067a[ColoredIcon.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C32048Bw3(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f3055a = abstractC32563Eb5;
        this.f3056b = new C0767a(abstractC32563Eb5);
        this.f3057c = new C0768b(abstractC32563Eb5);
    }

    /* renamed from: l */
    public static List<Class<?>> m113316l() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC31814Aw3
    /* renamed from: a */
    public AbstractC23461c mo113327a() {
        return AbstractC23461c.m33078H(new CallableC0770d());
    }

    @Override // p000.AbstractC31814Aw3
    /* renamed from: b */
    public AbstractC23461c mo113326b(List<OperatorToggleFilter> list) {
        return AbstractC23461c.m33078H(new CallableC0769c(list));
    }

    @Override // p000.AbstractC31814Aw3
    /* renamed from: c */
    public Observable<List<OperatorToggleFilter>> mo113325c() {
        return C37504Ze5.m72808c(this.f3055a, false, new String[]{"operator_toggle_filters"}, new CallableC0771e(C33265Hb5.m103680c("SELECT `operator_toggle_filters`.`id` AS `id`, `operator_toggle_filters`.`kind` AS `kind`, `operator_toggle_filters`.`ordinal_num` AS `ordinal_num`, `operator_toggle_filters`.`type` AS `type`, `operator_toggle_filters`.`title` AS `title`, `operator_toggle_filters`.`toggle_title` AS `toggle_title`, `operator_toggle_filters`.`enabled` AS `enabled`, `operator_toggle_filters`.`icon` AS `icon`, `operator_toggle_filters`.`icon_color` AS `icon_color`, `operator_toggle_filters`.`colored_icon` AS `colored_icon`, `operator_toggle_filters`.`icon_background_color` AS `icon_background_color` FROM operator_toggle_filters", 0)));
    }

    @Override // p000.AbstractC31814Aw3
    /* renamed from: d */
    public AbstractC23461c mo113324d(List<String> list) {
        return AbstractC23461c.m33078H(new CallableC0772f(list));
    }

    /* renamed from: j */
    public final String m113318j(ColoredIcon coloredIcon) {
        if (coloredIcon == null) {
            return null;
        }
        int i = C0773g.f3067a[coloredIcon.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return "UNKNOWN";
                        }
                        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + coloredIcon);
                    }
                    return "IC_STAR_EMOJI_SILVER";
                }
                return "IC_STAR_EMOJI_GOLD";
            }
            return "IC_STAR_EMOJI_BLUE";
        }
        return "IC_SCOOTER";
    }

    /* renamed from: k */
    public final ColoredIcon m113317k(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1765915090:
                if (str.equals("IC_STAR_EMOJI_SILVER")) {
                    c = 0;
                    break;
                }
                break;
            case -1595782228:
                if (str.equals("IC_SCOOTER")) {
                    c = 1;
                    break;
                }
                break;
            case -1334182981:
                if (str.equals("IC_STAR_EMOJI_BLUE")) {
                    c = 2;
                    break;
                }
                break;
            case -1334031423:
                if (str.equals("IC_STAR_EMOJI_GOLD")) {
                    c = 3;
                    break;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return ColoredIcon.IC_STAR_EMOJI_SILVER;
            case 1:
                return ColoredIcon.IC_SCOOTER;
            case 2:
                return ColoredIcon.IC_STAR_EMOJI_BLUE;
            case 3:
                return ColoredIcon.IC_STAR_EMOJI_GOLD;
            case 4:
                return ColoredIcon.UNKNOWN;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
        }
    }
}
