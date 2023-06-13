package p000;

import android.database.Cursor;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.ColoredIcon;
import co.bird.android.model.constant.FilterLogicToggleOption;
import co.bird.android.model.constant.OperatorFilterType;
import co.bird.android.model.constant.OperatorMapKind;
import co.bird.android.model.persistence.OperatorOptionFilter;
import co.bird.android.model.persistence.nestedstructures.OperatorFilterOption;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: xo3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51828xo3 extends AbstractC51235wo3 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f118166a;

    /* renamed from: b */
    public final AbstractC39268cf1<OperatorOptionFilter> f118167b;

    /* renamed from: c */
    public final AbstractC41861gz5 f118168c;

    /* renamed from: xo3$a */
    /* loaded from: classes4.dex */
    public class C30310a extends AbstractC39268cf1<OperatorOptionFilter> {
        public C30310a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `operator_option_filters` (`id`,`kind`,`ordinal_num`,`type`,`label`,`options`,`logic_operator`,`icon`,`icon_color`,`colored_icon`,`icon_background_color`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, OperatorOptionFilter operatorOptionFilter) {
            if (operatorOptionFilter.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, operatorOptionFilter.getId());
            }
            C37088Xk3 c37088Xk3 = C37088Xk3.f43786a;
            String m76479c = C37088Xk3.m76479c(operatorOptionFilter.getKind());
            if (m76479c == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m76479c);
            }
            interfaceC47496qV5.mo20956S0(3, operatorOptionFilter.getOrdinal());
            String m76480b = C37088Xk3.m76480b(operatorOptionFilter.getType());
            if (m76480b == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, m76480b);
            }
            if (operatorOptionFilter.getLabel() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, operatorOptionFilter.getLabel());
            }
            String m76478d = C37088Xk3.m76478d(operatorOptionFilter.getOptions());
            if (m76478d == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, m76478d);
            }
            if (operatorOptionFilter.getLogicOperator() == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, C51828xo3.this.m4617n(operatorOptionFilter.getLogicOperator()));
            }
            Converters converters = Converters.f66822a;
            String m55274j = Converters.m55274j(operatorOptionFilter.getIcon());
            if (m55274j == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, m55274j);
            }
            String m55270n = Converters.m55270n(operatorOptionFilter.getIconColor());
            if (m55270n == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, m55270n);
            }
            if (operatorOptionFilter.getColoredIcon() == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, C51828xo3.this.m4619l(operatorOptionFilter.getColoredIcon()));
            }
            String m55270n2 = Converters.m55270n(operatorOptionFilter.getIconBackgroundColor());
            if (m55270n2 == null) {
                interfaceC47496qV5.mo20954m1(11);
            } else {
                interfaceC47496qV5.mo20958G0(11, m55270n2);
            }
        }
    }

    /* renamed from: xo3$b */
    /* loaded from: classes4.dex */
    public class C30311b extends AbstractC41861gz5 {
        public C30311b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM operator_option_filters";
        }
    }

    /* renamed from: xo3$c */
    /* loaded from: classes4.dex */
    public class CallableC30312c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f118171b;

        public CallableC30312c(List list) {
            this.f118171b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C51828xo3.this.f118166a.m108730c();
            try {
                C51828xo3.this.f118167b.m61089j(this.f118171b);
                C51828xo3.this.f118166a.m108734A();
                C51828xo3.this.f118166a.m108728g();
                return null;
            } catch (Throwable th) {
                C51828xo3.this.f118166a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: xo3$d */
    /* loaded from: classes4.dex */
    public class CallableC30313d implements Callable<Void> {
        public CallableC30313d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C51828xo3.this.f118168c.m37254b();
            C51828xo3.this.f118166a.m108730c();
            try {
                m37254b.mo17482M();
                C51828xo3.this.f118166a.m108734A();
                C51828xo3.this.f118166a.m108728g();
                C51828xo3.this.f118168c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C51828xo3.this.f118166a.m108728g();
                C51828xo3.this.f118168c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: xo3$e */
    /* loaded from: classes4.dex */
    public class CallableC30314e implements Callable<List<OperatorOptionFilter>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f118174b;

        public CallableC30314e(C33265Hb5 c33265Hb5) {
            this.f118174b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<OperatorOptionFilter> call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            Cursor m102673c = IF0.m102673c(C51828xo3.this.f118166a, this.f118174b, false, null);
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
                    List<OperatorFilterOption> m76477e = C37088Xk3.m76477e(string5);
                    FilterLogicToggleOption m4616o = C51828xo3.this.m4616o(m102673c.getString(6));
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
                    ColoredIcon m4618m = C51828xo3.this.m4618m(m102673c.getString(9));
                    if (m102673c.isNull(10)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(10);
                    }
                    arrayList.add(new OperatorOptionFilter(string, m76475g, i, m76476f, string4, m76477e, m4616o, m55281c, m55266r, m4618m, Converters.m55266r(string8)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f118174b.release();
        }
    }

    /* renamed from: xo3$f */
    /* loaded from: classes4.dex */
    public class CallableC30315f implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f118176b;

        public CallableC30315f(List list) {
            this.f118176b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            StringBuilder m33905b = C42725iS5.m33905b();
            m33905b.append("DELETE FROM operator_option_filters WHERE id NOT IN (");
            C42725iS5.m33906a(m33905b, this.f118176b.size());
            m33905b.append(")");
            InterfaceC47496qV5 m108729d = C51828xo3.this.f118166a.m108729d(m33905b.toString());
            int i = 1;
            for (String str : this.f118176b) {
                if (str == null) {
                    m108729d.mo20954m1(i);
                } else {
                    m108729d.mo20958G0(i, str);
                }
                i++;
            }
            C51828xo3.this.f118166a.m108730c();
            try {
                m108729d.mo17482M();
                C51828xo3.this.f118166a.m108734A();
                C51828xo3.this.f118166a.m108728g();
                return null;
            } catch (Throwable th) {
                C51828xo3.this.f118166a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: xo3$g */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C30316g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f118178a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f118179b;

        static {
            int[] iArr = new int[ColoredIcon.values().length];
            f118179b = iArr;
            try {
                iArr[ColoredIcon.IC_SCOOTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f118179b[ColoredIcon.IC_STAR_EMOJI_BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f118179b[ColoredIcon.IC_STAR_EMOJI_GOLD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f118179b[ColoredIcon.IC_STAR_EMOJI_SILVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f118179b[ColoredIcon.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[FilterLogicToggleOption.values().length];
            f118178a = iArr2;
            try {
                iArr2[FilterLogicToggleOption.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f118178a[FilterLogicToggleOption.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f118178a[FilterLogicToggleOption.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public C51828xo3(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f118166a = abstractC32563Eb5;
        this.f118167b = new C30310a(abstractC32563Eb5);
        this.f118168c = new C30311b(abstractC32563Eb5);
    }

    /* renamed from: p */
    public static List<Class<?>> m4615p() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC51235wo3
    /* renamed from: a */
    public AbstractC23461c mo4630a() {
        return AbstractC23461c.m33078H(new CallableC30313d());
    }

    @Override // p000.AbstractC51235wo3
    /* renamed from: b */
    public AbstractC23461c mo4629b(List<OperatorOptionFilter> list) {
        return AbstractC23461c.m33078H(new CallableC30312c(list));
    }

    @Override // p000.AbstractC51235wo3
    /* renamed from: c */
    public Observable<List<OperatorOptionFilter>> mo4628c() {
        return C37504Ze5.m72808c(this.f118166a, false, new String[]{"operator_option_filters"}, new CallableC30314e(C33265Hb5.m103680c("SELECT `operator_option_filters`.`id` AS `id`, `operator_option_filters`.`kind` AS `kind`, `operator_option_filters`.`ordinal_num` AS `ordinal_num`, `operator_option_filters`.`type` AS `type`, `operator_option_filters`.`label` AS `label`, `operator_option_filters`.`options` AS `options`, `operator_option_filters`.`logic_operator` AS `logic_operator`, `operator_option_filters`.`icon` AS `icon`, `operator_option_filters`.`icon_color` AS `icon_color`, `operator_option_filters`.`colored_icon` AS `colored_icon`, `operator_option_filters`.`icon_background_color` AS `icon_background_color` FROM operator_option_filters", 0)));
    }

    @Override // p000.AbstractC51235wo3
    /* renamed from: d */
    public AbstractC23461c mo4627d(List<String> list) {
        return AbstractC23461c.m33078H(new CallableC30315f(list));
    }

    /* renamed from: l */
    public final String m4619l(ColoredIcon coloredIcon) {
        if (coloredIcon == null) {
            return null;
        }
        int i = C30316g.f118179b[coloredIcon.ordinal()];
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

    /* renamed from: m */
    public final ColoredIcon m4618m(String str) {
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

    /* renamed from: n */
    public final String m4617n(FilterLogicToggleOption filterLogicToggleOption) {
        if (filterLogicToggleOption == null) {
            return null;
        }
        int i = C30316g.f118178a[filterLogicToggleOption.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "UNKNOWN";
                }
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + filterLogicToggleOption);
            }
            return "OR";
        }
        return "AND";
    }

    /* renamed from: o */
    public final FilterLogicToggleOption m4616o(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 2531:
                if (str.equals("OR")) {
                    c = 0;
                    break;
                }
                break;
            case 64951:
                if (str.equals("AND")) {
                    c = 1;
                    break;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return FilterLogicToggleOption.OR;
            case 1:
                return FilterLogicToggleOption.AND;
            case 2:
                return FilterLogicToggleOption.UNKNOWN;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
        }
    }
}
