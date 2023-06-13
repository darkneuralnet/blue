package p000;

import android.database.Cursor;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.persistence.Tutorial;
import co.bird.android.model.persistence.TutorialUpdate;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import co.bird.android.model.persistence.nestedstructures.TutorialPage;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: Sv0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36014Sv0 extends AbstractC35780Rv0 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f34445a;

    /* renamed from: b */
    public final AbstractC39268cf1<Tutorial> f34446b;

    /* renamed from: c */
    public final AbstractC38675bf1<TutorialUpdate> f34447c;

    /* renamed from: d */
    public final AbstractC41861gz5 f34448d;

    /* renamed from: Sv0$a */
    /* loaded from: classes4.dex */
    public class CallableC7588a implements Callable<List<Tutorial>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f34449b;

        public CallableC7588a(C33265Hb5 c33265Hb5) {
            this.f34449b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<Tutorial> call() throws Exception {
            String string;
            boolean z;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            String string10;
            int i;
            String string11;
            int i2;
            String string12;
            int i3;
            String string13;
            Cursor m102673c = IF0.m102673c(C36014Sv0.this.f34445a, this.f34449b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, CoreConstants.CONTEXT_SCOPE_VALUE);
                int m41645e3 = C40824fF0.m41645e(m102673c, "skippable");
                int m41645e4 = C40824fF0.m41645e(m102673c, "view_count");
                int m41645e5 = C40824fF0.m41645e(m102673c, "header");
                int m41645e6 = C40824fF0.m41645e(m102673c, "title");
                int m41645e7 = C40824fF0.m41645e(m102673c, "asset");
                int m41645e8 = C40824fF0.m41645e(m102673c, "menu_title");
                int m41645e9 = C40824fF0.m41645e(m102673c, "menu_asset");
                int m41645e10 = C40824fF0.m41645e(m102673c, "button_text");
                int m41645e11 = C40824fF0.m41645e(m102673c, "bird_models");
                int m41645e12 = C40824fF0.m41645e(m102673c, "seen_count");
                int m41645e13 = C40824fF0.m41645e(m102673c, "pages");
                int m41645e14 = C40824fF0.m41645e(m102673c, "group_header");
                int m41645e15 = C40824fF0.m41645e(m102673c, "group_title");
                int m41645e16 = C40824fF0.m41645e(m102673c, "group_message");
                int m41645e17 = C40824fF0.m41645e(m102673c, "group_button_text");
                int i4 = m41645e13;
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    int i5 = m41645e;
                    ConfigurableTutorialContext m84632q = C36014Sv0.this.m84632q(m102673c.getString(m41645e2));
                    if (m102673c.getInt(m41645e3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i6 = m102673c.getInt(m41645e4);
                    if (m102673c.isNull(m41645e5)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e5);
                    }
                    if (m102673c.isNull(m41645e6)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e6);
                    }
                    if (m102673c.isNull(m41645e7)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e7);
                    }
                    LegacyAsset m87577c = C35546Qv0.m87577c(string4);
                    if (m102673c.isNull(m41645e8)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e8);
                    }
                    if (m102673c.isNull(m41645e9)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e9);
                    }
                    LegacyAsset m87577c2 = C35546Qv0.m87577c(string6);
                    if (m102673c.isNull(m41645e10)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e10);
                    }
                    if (m102673c.isNull(m41645e11)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e11);
                    }
                    List<String> m55267q = Converters.m55267q(string8);
                    int i7 = m102673c.getInt(m41645e12);
                    int i8 = i4;
                    if (m102673c.isNull(i8)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(i8);
                    }
                    List<TutorialPage> m87576d = C35546Qv0.m87576d(string9);
                    int i9 = m41645e14;
                    if (m102673c.isNull(i9)) {
                        i4 = i8;
                        i = m41645e15;
                        string10 = null;
                    } else {
                        i4 = i8;
                        string10 = m102673c.getString(i9);
                        i = m41645e15;
                    }
                    if (m102673c.isNull(i)) {
                        m41645e15 = i;
                        i2 = m41645e16;
                        string11 = null;
                    } else {
                        m41645e15 = i;
                        string11 = m102673c.getString(i);
                        i2 = m41645e16;
                    }
                    if (m102673c.isNull(i2)) {
                        m41645e16 = i2;
                        i3 = m41645e17;
                        string12 = null;
                    } else {
                        m41645e16 = i2;
                        string12 = m102673c.getString(i2);
                        i3 = m41645e17;
                    }
                    if (m102673c.isNull(i3)) {
                        m41645e17 = i3;
                        string13 = null;
                    } else {
                        m41645e17 = i3;
                        string13 = m102673c.getString(i3);
                    }
                    arrayList.add(new Tutorial(string, m84632q, z, i6, string2, string3, m87577c, string5, m87577c2, string7, m55267q, i7, m87576d, string10, string11, string12, string13));
                    m41645e14 = i9;
                    m41645e = i5;
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f34449b.release();
        }
    }

    /* renamed from: Sv0$b */
    /* loaded from: classes4.dex */
    public class CallableC7589b implements Callable<List<Tutorial>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f34451b;

        public CallableC7589b(C33265Hb5 c33265Hb5) {
            this.f34451b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<Tutorial> call() throws Exception {
            String string;
            boolean z;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            String string10;
            int i;
            String string11;
            int i2;
            String string12;
            int i3;
            String string13;
            Cursor m102673c = IF0.m102673c(C36014Sv0.this.f34445a, this.f34451b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, CoreConstants.CONTEXT_SCOPE_VALUE);
                int m41645e3 = C40824fF0.m41645e(m102673c, "skippable");
                int m41645e4 = C40824fF0.m41645e(m102673c, "view_count");
                int m41645e5 = C40824fF0.m41645e(m102673c, "header");
                int m41645e6 = C40824fF0.m41645e(m102673c, "title");
                int m41645e7 = C40824fF0.m41645e(m102673c, "asset");
                int m41645e8 = C40824fF0.m41645e(m102673c, "menu_title");
                int m41645e9 = C40824fF0.m41645e(m102673c, "menu_asset");
                int m41645e10 = C40824fF0.m41645e(m102673c, "button_text");
                int m41645e11 = C40824fF0.m41645e(m102673c, "bird_models");
                int m41645e12 = C40824fF0.m41645e(m102673c, "seen_count");
                int m41645e13 = C40824fF0.m41645e(m102673c, "pages");
                int m41645e14 = C40824fF0.m41645e(m102673c, "group_header");
                int m41645e15 = C40824fF0.m41645e(m102673c, "group_title");
                int m41645e16 = C40824fF0.m41645e(m102673c, "group_message");
                int m41645e17 = C40824fF0.m41645e(m102673c, "group_button_text");
                int i4 = m41645e13;
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    int i5 = m41645e;
                    ConfigurableTutorialContext m84632q = C36014Sv0.this.m84632q(m102673c.getString(m41645e2));
                    if (m102673c.getInt(m41645e3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i6 = m102673c.getInt(m41645e4);
                    if (m102673c.isNull(m41645e5)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e5);
                    }
                    if (m102673c.isNull(m41645e6)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e6);
                    }
                    if (m102673c.isNull(m41645e7)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e7);
                    }
                    LegacyAsset m87577c = C35546Qv0.m87577c(string4);
                    if (m102673c.isNull(m41645e8)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e8);
                    }
                    if (m102673c.isNull(m41645e9)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e9);
                    }
                    LegacyAsset m87577c2 = C35546Qv0.m87577c(string6);
                    if (m102673c.isNull(m41645e10)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e10);
                    }
                    if (m102673c.isNull(m41645e11)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e11);
                    }
                    List<String> m55267q = Converters.m55267q(string8);
                    int i7 = m102673c.getInt(m41645e12);
                    int i8 = i4;
                    if (m102673c.isNull(i8)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(i8);
                    }
                    List<TutorialPage> m87576d = C35546Qv0.m87576d(string9);
                    int i9 = m41645e14;
                    if (m102673c.isNull(i9)) {
                        i4 = i8;
                        i = m41645e15;
                        string10 = null;
                    } else {
                        i4 = i8;
                        string10 = m102673c.getString(i9);
                        i = m41645e15;
                    }
                    if (m102673c.isNull(i)) {
                        m41645e15 = i;
                        i2 = m41645e16;
                        string11 = null;
                    } else {
                        m41645e15 = i;
                        string11 = m102673c.getString(i);
                        i2 = m41645e16;
                    }
                    if (m102673c.isNull(i2)) {
                        m41645e16 = i2;
                        i3 = m41645e17;
                        string12 = null;
                    } else {
                        m41645e16 = i2;
                        string12 = m102673c.getString(i2);
                        i3 = m41645e17;
                    }
                    if (m102673c.isNull(i3)) {
                        m41645e17 = i3;
                        string13 = null;
                    } else {
                        m41645e17 = i3;
                        string13 = m102673c.getString(i3);
                    }
                    arrayList.add(new Tutorial(string, m84632q, z, i6, string2, string3, m87577c, string5, m87577c2, string7, m55267q, i7, m87576d, string10, string11, string12, string13));
                    m41645e14 = i9;
                    m41645e = i5;
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f34451b.release();
        }
    }

    /* renamed from: Sv0$c */
    /* loaded from: classes4.dex */
    public class CallableC7590c implements Callable<List<Tutorial>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f34453b;

        public CallableC7590c(C33265Hb5 c33265Hb5) {
            this.f34453b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<Tutorial> call() throws Exception {
            String string;
            boolean z;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            String string10;
            int i;
            String string11;
            int i2;
            String string12;
            int i3;
            String string13;
            Cursor m102673c = IF0.m102673c(C36014Sv0.this.f34445a, this.f34453b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, CoreConstants.CONTEXT_SCOPE_VALUE);
                int m41645e3 = C40824fF0.m41645e(m102673c, "skippable");
                int m41645e4 = C40824fF0.m41645e(m102673c, "view_count");
                int m41645e5 = C40824fF0.m41645e(m102673c, "header");
                int m41645e6 = C40824fF0.m41645e(m102673c, "title");
                int m41645e7 = C40824fF0.m41645e(m102673c, "asset");
                int m41645e8 = C40824fF0.m41645e(m102673c, "menu_title");
                int m41645e9 = C40824fF0.m41645e(m102673c, "menu_asset");
                int m41645e10 = C40824fF0.m41645e(m102673c, "button_text");
                int m41645e11 = C40824fF0.m41645e(m102673c, "bird_models");
                int m41645e12 = C40824fF0.m41645e(m102673c, "seen_count");
                int m41645e13 = C40824fF0.m41645e(m102673c, "pages");
                int m41645e14 = C40824fF0.m41645e(m102673c, "group_header");
                int m41645e15 = C40824fF0.m41645e(m102673c, "group_title");
                int m41645e16 = C40824fF0.m41645e(m102673c, "group_message");
                int m41645e17 = C40824fF0.m41645e(m102673c, "group_button_text");
                int i4 = m41645e13;
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    int i5 = m41645e;
                    ConfigurableTutorialContext m84632q = C36014Sv0.this.m84632q(m102673c.getString(m41645e2));
                    if (m102673c.getInt(m41645e3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i6 = m102673c.getInt(m41645e4);
                    if (m102673c.isNull(m41645e5)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e5);
                    }
                    if (m102673c.isNull(m41645e6)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e6);
                    }
                    if (m102673c.isNull(m41645e7)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e7);
                    }
                    LegacyAsset m87577c = C35546Qv0.m87577c(string4);
                    if (m102673c.isNull(m41645e8)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e8);
                    }
                    if (m102673c.isNull(m41645e9)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e9);
                    }
                    LegacyAsset m87577c2 = C35546Qv0.m87577c(string6);
                    if (m102673c.isNull(m41645e10)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e10);
                    }
                    if (m102673c.isNull(m41645e11)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e11);
                    }
                    List<String> m55267q = Converters.m55267q(string8);
                    int i7 = m102673c.getInt(m41645e12);
                    int i8 = i4;
                    if (m102673c.isNull(i8)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(i8);
                    }
                    List<TutorialPage> m87576d = C35546Qv0.m87576d(string9);
                    int i9 = m41645e14;
                    if (m102673c.isNull(i9)) {
                        i4 = i8;
                        i = m41645e15;
                        string10 = null;
                    } else {
                        i4 = i8;
                        string10 = m102673c.getString(i9);
                        i = m41645e15;
                    }
                    if (m102673c.isNull(i)) {
                        m41645e15 = i;
                        i2 = m41645e16;
                        string11 = null;
                    } else {
                        m41645e15 = i;
                        string11 = m102673c.getString(i);
                        i2 = m41645e16;
                    }
                    if (m102673c.isNull(i2)) {
                        m41645e16 = i2;
                        i3 = m41645e17;
                        string12 = null;
                    } else {
                        m41645e16 = i2;
                        string12 = m102673c.getString(i2);
                        i3 = m41645e17;
                    }
                    if (m102673c.isNull(i3)) {
                        m41645e17 = i3;
                        string13 = null;
                    } else {
                        m41645e17 = i3;
                        string13 = m102673c.getString(i3);
                    }
                    arrayList.add(new Tutorial(string, m84632q, z, i6, string2, string3, m87577c, string5, m87577c2, string7, m55267q, i7, m87576d, string10, string11, string12, string13));
                    m41645e14 = i9;
                    m41645e = i5;
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f34453b.release();
        }
    }

    /* renamed from: Sv0$d */
    /* loaded from: classes4.dex */
    public class CallableC7591d implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ String[] f34455b;

        public CallableC7591d(String[] strArr) {
            this.f34455b = strArr;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            String[] strArr;
            StringBuilder m33905b = C42725iS5.m33905b();
            m33905b.append("DELETE FROM configurable_tutorial WHERE id NOT IN (");
            C42725iS5.m33906a(m33905b, this.f34455b.length);
            m33905b.append(")");
            InterfaceC47496qV5 m108729d = C36014Sv0.this.f34445a.m108729d(m33905b.toString());
            int i = 1;
            for (String str : this.f34455b) {
                if (str == null) {
                    m108729d.mo20954m1(i);
                } else {
                    m108729d.mo20958G0(i, str);
                }
                i++;
            }
            C36014Sv0.this.f34445a.m108730c();
            try {
                m108729d.mo17482M();
                C36014Sv0.this.f34445a.m108734A();
                C36014Sv0.this.f34445a.m108728g();
                return null;
            } catch (Throwable th) {
                C36014Sv0.this.f34445a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: Sv0$e */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C7592e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34457a;

        static {
            int[] iArr = new int[ConfigurableTutorialContext.values().length];
            f34457a = iArr;
            try {
                iArr[ConfigurableTutorialContext.CABLE_LOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34457a[ConfigurableTutorialContext.CABLE_UNLOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34457a[ConfigurableTutorialContext.HELMET_LOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34457a[ConfigurableTutorialContext.HELMET_UNLOCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34457a[ConfigurableTutorialContext.RIDER_ONBOARDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34457a[ConfigurableTutorialContext.RIDE_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34457a[ConfigurableTutorialContext.RIDE_END.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34457a[ConfigurableTutorialContext.AR_NEST_SETUP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34457a[ConfigurableTutorialContext.GOOGLE_AR_PARKING_RESOLUTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34457a[ConfigurableTutorialContext.QUIZ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34457a[ConfigurableTutorialContext.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* renamed from: Sv0$f */
    /* loaded from: classes4.dex */
    public class C7593f extends AbstractC39268cf1<Tutorial> {
        public C7593f(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR IGNORE INTO `configurable_tutorial` (`id`,`context`,`skippable`,`view_count`,`header`,`title`,`asset`,`menu_title`,`menu_asset`,`button_text`,`bird_models`,`seen_count`,`pages`,`group_header`,`group_title`,`group_message`,`group_button_text`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, Tutorial tutorial) {
            if (tutorial.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, tutorial.getId());
            }
            if (tutorial.getContext() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, C36014Sv0.this.m84633p(tutorial.getContext()));
            }
            interfaceC47496qV5.mo20956S0(3, tutorial.getSkippable() ? 1L : 0L);
            interfaceC47496qV5.mo20956S0(4, tutorial.getViewCount());
            if (tutorial.getHeader() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, tutorial.getHeader());
            }
            if (tutorial.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, tutorial.getTitle());
            }
            C35546Qv0 c35546Qv0 = C35546Qv0.f31222a;
            String m87579a = C35546Qv0.m87579a(tutorial.getAsset());
            if (m87579a == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m87579a);
            }
            if (tutorial.getMenuTitle() == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, tutorial.getMenuTitle());
            }
            String m87579a2 = C35546Qv0.m87579a(tutorial.getMenuAsset());
            if (m87579a2 == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, m87579a2);
            }
            if (tutorial.getButtonText() == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, tutorial.getButtonText());
            }
            Converters converters = Converters.f66822a;
            String m55269o = Converters.m55269o(tutorial.getBirdModels());
            if (m55269o == null) {
                interfaceC47496qV5.mo20954m1(11);
            } else {
                interfaceC47496qV5.mo20958G0(11, m55269o);
            }
            interfaceC47496qV5.mo20956S0(12, tutorial.getSeenCount());
            String m87578b = C35546Qv0.m87578b(tutorial.getPages());
            if (m87578b == null) {
                interfaceC47496qV5.mo20954m1(13);
            } else {
                interfaceC47496qV5.mo20958G0(13, m87578b);
            }
            if (tutorial.getGroupHeader() == null) {
                interfaceC47496qV5.mo20954m1(14);
            } else {
                interfaceC47496qV5.mo20958G0(14, tutorial.getGroupHeader());
            }
            if (tutorial.getGroupTitle() == null) {
                interfaceC47496qV5.mo20954m1(15);
            } else {
                interfaceC47496qV5.mo20958G0(15, tutorial.getGroupTitle());
            }
            if (tutorial.getGroupMessage() == null) {
                interfaceC47496qV5.mo20954m1(16);
            } else {
                interfaceC47496qV5.mo20958G0(16, tutorial.getGroupMessage());
            }
            if (tutorial.getGroupButtonText() == null) {
                interfaceC47496qV5.mo20954m1(17);
            } else {
                interfaceC47496qV5.mo20958G0(17, tutorial.getGroupButtonText());
            }
        }
    }

    /* renamed from: Sv0$g */
    /* loaded from: classes4.dex */
    public class C7594g extends AbstractC38675bf1<TutorialUpdate> {
        public C7594g(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE OR ABORT `configurable_tutorial` SET `id` = ?,`context` = ?,`skippable` = ?,`header` = ?,`title` = ?,`asset` = ?,`menu_title` = ?,`menu_asset` = ?,`button_text` = ?,`bird_models` = ?,`pages` = ?,`group_header` = ?,`group_title` = ?,`group_message` = ?,`group_button_text` = ? WHERE `id` = ?";
        }

        @Override // p000.AbstractC38675bf1
        /* renamed from: m */
        public void mo42179i(InterfaceC47496qV5 interfaceC47496qV5, TutorialUpdate tutorialUpdate) {
            if (tutorialUpdate.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, tutorialUpdate.getId());
            }
            if (tutorialUpdate.getContext() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, C36014Sv0.this.m84633p(tutorialUpdate.getContext()));
            }
            interfaceC47496qV5.mo20956S0(3, tutorialUpdate.getSkippable() ? 1L : 0L);
            if (tutorialUpdate.getHeader() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, tutorialUpdate.getHeader());
            }
            if (tutorialUpdate.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, tutorialUpdate.getTitle());
            }
            C35546Qv0 c35546Qv0 = C35546Qv0.f31222a;
            String m87579a = C35546Qv0.m87579a(tutorialUpdate.getAsset());
            if (m87579a == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, m87579a);
            }
            if (tutorialUpdate.getMenuTitle() == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, tutorialUpdate.getMenuTitle());
            }
            String m87579a2 = C35546Qv0.m87579a(tutorialUpdate.getMenuAsset());
            if (m87579a2 == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, m87579a2);
            }
            if (tutorialUpdate.getButtonText() == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, tutorialUpdate.getButtonText());
            }
            Converters converters = Converters.f66822a;
            String m55269o = Converters.m55269o(tutorialUpdate.getBirdModels());
            if (m55269o == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, m55269o);
            }
            String m87578b = C35546Qv0.m87578b(tutorialUpdate.getPages());
            if (m87578b == null) {
                interfaceC47496qV5.mo20954m1(11);
            } else {
                interfaceC47496qV5.mo20958G0(11, m87578b);
            }
            if (tutorialUpdate.getGroupHeader() == null) {
                interfaceC47496qV5.mo20954m1(12);
            } else {
                interfaceC47496qV5.mo20958G0(12, tutorialUpdate.getGroupHeader());
            }
            if (tutorialUpdate.getGroupTitle() == null) {
                interfaceC47496qV5.mo20954m1(13);
            } else {
                interfaceC47496qV5.mo20958G0(13, tutorialUpdate.getGroupTitle());
            }
            if (tutorialUpdate.getGroupMessage() == null) {
                interfaceC47496qV5.mo20954m1(14);
            } else {
                interfaceC47496qV5.mo20958G0(14, tutorialUpdate.getGroupMessage());
            }
            if (tutorialUpdate.getGroupButtonText() == null) {
                interfaceC47496qV5.mo20954m1(15);
            } else {
                interfaceC47496qV5.mo20958G0(15, tutorialUpdate.getGroupButtonText());
            }
            if (tutorialUpdate.getId() == null) {
                interfaceC47496qV5.mo20954m1(16);
            } else {
                interfaceC47496qV5.mo20958G0(16, tutorialUpdate.getId());
            }
        }
    }

    /* renamed from: Sv0$h */
    /* loaded from: classes4.dex */
    public class C7595h extends AbstractC41861gz5 {
        public C7595h(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE configurable_tutorial SET seen_count = seen_count + 1 WHERE id = ?";
        }
    }

    /* renamed from: Sv0$i */
    /* loaded from: classes4.dex */
    public class CallableC7596i implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f34461b;

        public CallableC7596i(List list) {
            this.f34461b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C36014Sv0.this.f34445a.m108730c();
            try {
                C36014Sv0.this.f34446b.m61089j(this.f34461b);
                C36014Sv0.this.f34445a.m108734A();
                C36014Sv0.this.f34445a.m108728g();
                return null;
            } catch (Throwable th) {
                C36014Sv0.this.f34445a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: Sv0$j */
    /* loaded from: classes4.dex */
    public class CallableC7597j implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f34463b;

        public CallableC7597j(List list) {
            this.f34463b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C36014Sv0.this.f34445a.m108730c();
            try {
                C36014Sv0.this.f34447c.m64206k(this.f34463b);
                C36014Sv0.this.f34445a.m108734A();
                C36014Sv0.this.f34445a.m108728g();
                return null;
            } catch (Throwable th) {
                C36014Sv0.this.f34445a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: Sv0$k */
    /* loaded from: classes4.dex */
    public class CallableC7598k implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ String f34465b;

        public CallableC7598k(String str) {
            this.f34465b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C36014Sv0.this.f34448d.m37254b();
            String str = this.f34465b;
            if (str == null) {
                m37254b.mo20954m1(1);
            } else {
                m37254b.mo20958G0(1, str);
            }
            C36014Sv0.this.f34445a.m108730c();
            try {
                m37254b.mo17482M();
                C36014Sv0.this.f34445a.m108734A();
                C36014Sv0.this.f34445a.m108728g();
                C36014Sv0.this.f34448d.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C36014Sv0.this.f34445a.m108728g();
                C36014Sv0.this.f34448d.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Sv0$l */
    /* loaded from: classes4.dex */
    public class CallableC7599l implements Callable<List<Tutorial>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f34467b;

        public CallableC7599l(C33265Hb5 c33265Hb5) {
            this.f34467b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<Tutorial> call() throws Exception {
            String string;
            boolean z;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            String string10;
            int i;
            String string11;
            int i2;
            String string12;
            int i3;
            String string13;
            Cursor m102673c = IF0.m102673c(C36014Sv0.this.f34445a, this.f34467b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, CoreConstants.CONTEXT_SCOPE_VALUE);
                int m41645e3 = C40824fF0.m41645e(m102673c, "skippable");
                int m41645e4 = C40824fF0.m41645e(m102673c, "view_count");
                int m41645e5 = C40824fF0.m41645e(m102673c, "header");
                int m41645e6 = C40824fF0.m41645e(m102673c, "title");
                int m41645e7 = C40824fF0.m41645e(m102673c, "asset");
                int m41645e8 = C40824fF0.m41645e(m102673c, "menu_title");
                int m41645e9 = C40824fF0.m41645e(m102673c, "menu_asset");
                int m41645e10 = C40824fF0.m41645e(m102673c, "button_text");
                int m41645e11 = C40824fF0.m41645e(m102673c, "bird_models");
                int m41645e12 = C40824fF0.m41645e(m102673c, "seen_count");
                int m41645e13 = C40824fF0.m41645e(m102673c, "pages");
                int m41645e14 = C40824fF0.m41645e(m102673c, "group_header");
                int m41645e15 = C40824fF0.m41645e(m102673c, "group_title");
                int m41645e16 = C40824fF0.m41645e(m102673c, "group_message");
                int m41645e17 = C40824fF0.m41645e(m102673c, "group_button_text");
                int i4 = m41645e13;
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    int i5 = m41645e;
                    ConfigurableTutorialContext m84632q = C36014Sv0.this.m84632q(m102673c.getString(m41645e2));
                    if (m102673c.getInt(m41645e3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i6 = m102673c.getInt(m41645e4);
                    if (m102673c.isNull(m41645e5)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e5);
                    }
                    if (m102673c.isNull(m41645e6)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e6);
                    }
                    if (m102673c.isNull(m41645e7)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e7);
                    }
                    LegacyAsset m87577c = C35546Qv0.m87577c(string4);
                    if (m102673c.isNull(m41645e8)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e8);
                    }
                    if (m102673c.isNull(m41645e9)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e9);
                    }
                    LegacyAsset m87577c2 = C35546Qv0.m87577c(string6);
                    if (m102673c.isNull(m41645e10)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e10);
                    }
                    if (m102673c.isNull(m41645e11)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e11);
                    }
                    List<String> m55267q = Converters.m55267q(string8);
                    int i7 = m102673c.getInt(m41645e12);
                    int i8 = i4;
                    if (m102673c.isNull(i8)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(i8);
                    }
                    List<TutorialPage> m87576d = C35546Qv0.m87576d(string9);
                    int i9 = m41645e14;
                    if (m102673c.isNull(i9)) {
                        i4 = i8;
                        i = m41645e15;
                        string10 = null;
                    } else {
                        i4 = i8;
                        string10 = m102673c.getString(i9);
                        i = m41645e15;
                    }
                    if (m102673c.isNull(i)) {
                        m41645e15 = i;
                        i2 = m41645e16;
                        string11 = null;
                    } else {
                        m41645e15 = i;
                        string11 = m102673c.getString(i);
                        i2 = m41645e16;
                    }
                    if (m102673c.isNull(i2)) {
                        m41645e16 = i2;
                        i3 = m41645e17;
                        string12 = null;
                    } else {
                        m41645e16 = i2;
                        string12 = m102673c.getString(i2);
                        i3 = m41645e17;
                    }
                    if (m102673c.isNull(i3)) {
                        m41645e17 = i3;
                        string13 = null;
                    } else {
                        m41645e17 = i3;
                        string13 = m102673c.getString(i3);
                    }
                    arrayList.add(new Tutorial(string, m84632q, z, i6, string2, string3, m87577c, string5, m87577c2, string7, m55267q, i7, m87576d, string10, string11, string12, string13));
                    m41645e14 = i9;
                    m41645e = i5;
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f34467b.release();
        }
    }

    /* renamed from: Sv0$m */
    /* loaded from: classes4.dex */
    public class CallableC7600m implements Callable<List<Tutorial>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f34469b;

        public CallableC7600m(C33265Hb5 c33265Hb5) {
            this.f34469b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<Tutorial> call() throws Exception {
            String string;
            boolean z;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            String string10;
            int i;
            String string11;
            int i2;
            String string12;
            int i3;
            String string13;
            Cursor m102673c = IF0.m102673c(C36014Sv0.this.f34445a, this.f34469b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, CoreConstants.CONTEXT_SCOPE_VALUE);
                int m41645e3 = C40824fF0.m41645e(m102673c, "skippable");
                int m41645e4 = C40824fF0.m41645e(m102673c, "view_count");
                int m41645e5 = C40824fF0.m41645e(m102673c, "header");
                int m41645e6 = C40824fF0.m41645e(m102673c, "title");
                int m41645e7 = C40824fF0.m41645e(m102673c, "asset");
                int m41645e8 = C40824fF0.m41645e(m102673c, "menu_title");
                int m41645e9 = C40824fF0.m41645e(m102673c, "menu_asset");
                int m41645e10 = C40824fF0.m41645e(m102673c, "button_text");
                int m41645e11 = C40824fF0.m41645e(m102673c, "bird_models");
                int m41645e12 = C40824fF0.m41645e(m102673c, "seen_count");
                int m41645e13 = C40824fF0.m41645e(m102673c, "pages");
                int m41645e14 = C40824fF0.m41645e(m102673c, "group_header");
                int m41645e15 = C40824fF0.m41645e(m102673c, "group_title");
                int m41645e16 = C40824fF0.m41645e(m102673c, "group_message");
                int m41645e17 = C40824fF0.m41645e(m102673c, "group_button_text");
                int i4 = m41645e13;
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    int i5 = m41645e;
                    ConfigurableTutorialContext m84632q = C36014Sv0.this.m84632q(m102673c.getString(m41645e2));
                    if (m102673c.getInt(m41645e3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i6 = m102673c.getInt(m41645e4);
                    if (m102673c.isNull(m41645e5)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e5);
                    }
                    if (m102673c.isNull(m41645e6)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e6);
                    }
                    if (m102673c.isNull(m41645e7)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e7);
                    }
                    LegacyAsset m87577c = C35546Qv0.m87577c(string4);
                    if (m102673c.isNull(m41645e8)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e8);
                    }
                    if (m102673c.isNull(m41645e9)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e9);
                    }
                    LegacyAsset m87577c2 = C35546Qv0.m87577c(string6);
                    if (m102673c.isNull(m41645e10)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e10);
                    }
                    if (m102673c.isNull(m41645e11)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e11);
                    }
                    List<String> m55267q = Converters.m55267q(string8);
                    int i7 = m102673c.getInt(m41645e12);
                    int i8 = i4;
                    if (m102673c.isNull(i8)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(i8);
                    }
                    List<TutorialPage> m87576d = C35546Qv0.m87576d(string9);
                    int i9 = m41645e14;
                    if (m102673c.isNull(i9)) {
                        i4 = i8;
                        i = m41645e15;
                        string10 = null;
                    } else {
                        i4 = i8;
                        string10 = m102673c.getString(i9);
                        i = m41645e15;
                    }
                    if (m102673c.isNull(i)) {
                        m41645e15 = i;
                        i2 = m41645e16;
                        string11 = null;
                    } else {
                        m41645e15 = i;
                        string11 = m102673c.getString(i);
                        i2 = m41645e16;
                    }
                    if (m102673c.isNull(i2)) {
                        m41645e16 = i2;
                        i3 = m41645e17;
                        string12 = null;
                    } else {
                        m41645e16 = i2;
                        string12 = m102673c.getString(i2);
                        i3 = m41645e17;
                    }
                    if (m102673c.isNull(i3)) {
                        m41645e17 = i3;
                        string13 = null;
                    } else {
                        m41645e17 = i3;
                        string13 = m102673c.getString(i3);
                    }
                    arrayList.add(new Tutorial(string, m84632q, z, i6, string2, string3, m87577c, string5, m87577c2, string7, m55267q, i7, m87576d, string10, string11, string12, string13));
                    m41645e14 = i9;
                    m41645e = i5;
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f34469b.release();
        }
    }

    public C36014Sv0(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f34445a = abstractC32563Eb5;
        this.f34446b = new C7593f(abstractC32563Eb5);
        this.f34447c = new C7594g(abstractC32563Eb5);
        this.f34448d = new C7595h(abstractC32563Eb5);
    }

    /* renamed from: r */
    public static List<Class<?>> m84631r() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC35780Rv0
    /* renamed from: a */
    public AbstractC23461c mo84648a(String... strArr) {
        return AbstractC23461c.m33078H(new CallableC7591d(strArr));
    }

    @Override // p000.AbstractC35780Rv0
    /* renamed from: b */
    public AbstractC23442F<List<Tutorial>> mo84647b(ConfigurableTutorialContext configurableTutorialContext) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM configurable_tutorial WHERE context = ? ORDER BY skippable", 1);
        if (configurableTutorialContext == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, m84633p(configurableTutorialContext));
        }
        return C37504Ze5.m72806e(new CallableC7599l(m103680c));
    }

    @Override // p000.AbstractC35780Rv0
    /* renamed from: c */
    public AbstractC23442F<List<Tutorial>> mo84646c(ConfigurableTutorialContext configurableTutorialContext, String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM configurable_tutorial WHERE context = ? AND (instr(bird_models, ?) OR trim(bird_models) = '[]') ORDER BY skippable", 2);
        if (configurableTutorialContext == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, m84633p(configurableTutorialContext));
        }
        if (str == null) {
            m103680c.mo20954m1(2);
        } else {
            m103680c.mo20958G0(2, str);
        }
        return C37504Ze5.m72806e(new CallableC7588a(m103680c));
    }

    @Override // p000.AbstractC35780Rv0
    /* renamed from: d */
    public AbstractC23442F<List<Tutorial>> mo84645d(ConfigurableTutorialContext configurableTutorialContext, String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM configurable_tutorial WHERE context = ? AND (instr(bird_models, ?) OR trim(bird_models) = '[]')  AND seen_count < view_count ORDER BY skippable", 2);
        if (configurableTutorialContext == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, m84633p(configurableTutorialContext));
        }
        if (str == null) {
            m103680c.mo20954m1(2);
        } else {
            m103680c.mo20958G0(2, str);
        }
        return C37504Ze5.m72806e(new CallableC7589b(m103680c));
    }

    @Override // p000.AbstractC35780Rv0
    /* renamed from: e */
    public AbstractC23442F<List<Tutorial>> mo84644e(ConfigurableTutorialContext configurableTutorialContext) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM configurable_tutorial WHERE context = ? AND seen_count < view_count ORDER BY skippable", 1);
        if (configurableTutorialContext == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, m84633p(configurableTutorialContext));
        }
        return C37504Ze5.m72806e(new CallableC7600m(m103680c));
    }

    @Override // p000.AbstractC35780Rv0
    /* renamed from: f */
    public AbstractC23442F<List<Tutorial>> mo84643f(String... strArr) {
        StringBuilder m33905b = C42725iS5.m33905b();
        m33905b.append("SELECT * FROM configurable_tutorial WHERE id in (");
        int length = strArr.length;
        C42725iS5.m33906a(m33905b, length);
        m33905b.append(")");
        C33265Hb5 m103680c = C33265Hb5.m103680c(m33905b.toString(), length + 0);
        int i = 1;
        for (String str : strArr) {
            if (str == null) {
                m103680c.mo20954m1(i);
            } else {
                m103680c.mo20958G0(i, str);
            }
            i++;
        }
        return C37504Ze5.m72806e(new CallableC7590c(m103680c));
    }

    @Override // p000.AbstractC35780Rv0
    /* renamed from: g */
    public AbstractC23461c mo84642g(String str) {
        return AbstractC23461c.m33078H(new CallableC7598k(str));
    }

    @Override // p000.AbstractC35780Rv0
    /* renamed from: h */
    public AbstractC23461c mo84641h(List<Tutorial> list) {
        return AbstractC23461c.m33078H(new CallableC7596i(list));
    }

    @Override // p000.AbstractC35780Rv0
    /* renamed from: i */
    public AbstractC23461c mo84640i(List<TutorialUpdate> list) {
        return AbstractC23461c.m33078H(new CallableC7597j(list));
    }

    /* renamed from: p */
    public final String m84633p(ConfigurableTutorialContext configurableTutorialContext) {
        if (configurableTutorialContext == null) {
            return null;
        }
        switch (C7592e.f34457a[configurableTutorialContext.ordinal()]) {
            case 1:
                return "CABLE_LOCK";
            case 2:
                return "CABLE_UNLOCK";
            case 3:
                return "HELMET_LOCK";
            case 4:
                return "HELMET_UNLOCK";
            case 5:
                return "RIDER_ONBOARDING";
            case 6:
                return "RIDE_START";
            case 7:
                return "RIDE_END";
            case 8:
                return "AR_NEST_SETUP";
            case 9:
                return "GOOGLE_AR_PARKING_RESOLUTION";
            case 10:
                return "QUIZ";
            case 11:
                return "UNKNOWN";
            default:
                throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + configurableTutorialContext);
        }
    }

    /* renamed from: q */
    public final ConfigurableTutorialContext m84632q(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1944269811:
                if (str.equals("CABLE_LOCK")) {
                    c = 0;
                    break;
                }
                break;
            case -773015107:
                if (str.equals("HELMET_LOCK")) {
                    c = 1;
                    break;
                }
                break;
            case -741777164:
                if (str.equals("RIDE_END")) {
                    c = 2;
                    break;
                }
                break;
            case -647904005:
                if (str.equals("GOOGLE_AR_PARKING_RESOLUTION")) {
                    c = 3;
                    break;
                }
                break;
            case -25813728:
                if (str.equals("RIDER_ONBOARDING")) {
                    c = 4;
                    break;
                }
                break;
            case 2497109:
                if (str.equals("QUIZ")) {
                    c = 5;
                    break;
                }
                break;
            case 124498342:
                if (str.equals("CABLE_UNLOCK")) {
                    c = 6;
                    break;
                }
                break;
            case 129824315:
                if (str.equals("RIDE_START")) {
                    c = 7;
                    break;
                }
                break;
            case 418837334:
                if (str.equals("HELMET_UNLOCK")) {
                    c = '\b';
                    break;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    c = '\t';
                    break;
                }
                break;
            case 1547172484:
                if (str.equals("AR_NEST_SETUP")) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return ConfigurableTutorialContext.CABLE_LOCK;
            case 1:
                return ConfigurableTutorialContext.HELMET_LOCK;
            case 2:
                return ConfigurableTutorialContext.RIDE_END;
            case 3:
                return ConfigurableTutorialContext.GOOGLE_AR_PARKING_RESOLUTION;
            case 4:
                return ConfigurableTutorialContext.RIDER_ONBOARDING;
            case 5:
                return ConfigurableTutorialContext.QUIZ;
            case 6:
                return ConfigurableTutorialContext.CABLE_UNLOCK;
            case 7:
                return ConfigurableTutorialContext.RIDE_START;
            case '\b':
                return ConfigurableTutorialContext.HELMET_UNLOCK;
            case '\t':
                return ConfigurableTutorialContext.UNKNOWN;
            case '\n':
                return ConfigurableTutorialContext.AR_NEST_SETUP;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
        }
    }
}
