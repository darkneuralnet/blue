package p000;

import android.database.Cursor;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.AnnouncementContentType;
import co.bird.android.model.constant.AnnouncementContext;
import co.bird.android.model.constant.AnnouncementDisplayType;
import co.bird.android.model.persistence.Announcement;
import co.bird.android.model.persistence.nestedstructures.AnnouncementContextParameters;
import co.bird.android.model.persistence.nestedstructures.AnnouncementPage;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: fg */
/* loaded from: classes4.dex */
public final class C20482fg extends AbstractC20087eg {

    /* renamed from: a */
    public final AbstractC32563Eb5 f80415a;

    /* renamed from: b */
    public final AbstractC39268cf1<Announcement> f80416b;

    /* renamed from: c */
    public final AbstractC41861gz5 f80417c;

    /* renamed from: d */
    public final AbstractC41861gz5 f80418d;

    /* renamed from: fg$a */
    /* loaded from: classes4.dex */
    public class C20483a extends AbstractC39268cf1<Announcement> {
        public C20483a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `announcement` (`id`,`context`,`context_parameters`,`display_type`,`content_type`,`title`,`title_asset`,`message`,`message_url`,`button_text`,`analytics_title`,`button_url`,`open_in_webview`,`auxiliary_title`,`auxiliary_body`,`auxiliary_asset`,`share_content`,`learn_more_url`,`pages`,`navigation_title`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, Announcement announcement) {
            Integer valueOf;
            if (announcement.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, announcement.getId());
            }
            C19837dg c19837dg = C19837dg.f77020a;
            String m43915g = C19837dg.m43915g(announcement.getContext());
            if (m43915g == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m43915g);
            }
            String m43913i = C19837dg.m43913i(announcement.getContextParameters());
            if (m43913i == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m43913i);
            }
            String m43914h = C19837dg.m43914h(announcement.getDisplayType());
            if (m43914h == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, m43914h);
            }
            String m43916f = C19837dg.m43916f(announcement.getContentType());
            if (m43916f == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m43916f);
            }
            if (announcement.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, announcement.getTitle());
            }
            String m43912j = C19837dg.m43912j(announcement.getTitleAsset());
            if (m43912j == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m43912j);
            }
            if (announcement.getMessage() == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, announcement.getMessage());
            }
            if (announcement.getMessageUrl() == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, announcement.getMessageUrl());
            }
            if (announcement.getButtonText() == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, announcement.getButtonText());
            }
            if (announcement.getAnalyticsTitle() == null) {
                interfaceC47496qV5.mo20954m1(11);
            } else {
                interfaceC47496qV5.mo20958G0(11, announcement.getAnalyticsTitle());
            }
            if (announcement.getButtonUrl() == null) {
                interfaceC47496qV5.mo20954m1(12);
            } else {
                interfaceC47496qV5.mo20958G0(12, announcement.getButtonUrl());
            }
            if (announcement.getOpenInWebview() == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(announcement.getOpenInWebview().booleanValue() ? 1 : 0);
            }
            if (valueOf == null) {
                interfaceC47496qV5.mo20954m1(13);
            } else {
                interfaceC47496qV5.mo20956S0(13, valueOf.intValue());
            }
            if (announcement.getAuxiliaryTitle() == null) {
                interfaceC47496qV5.mo20954m1(14);
            } else {
                interfaceC47496qV5.mo20958G0(14, announcement.getAuxiliaryTitle());
            }
            if (announcement.getAuxiliaryBody() == null) {
                interfaceC47496qV5.mo20954m1(15);
            } else {
                interfaceC47496qV5.mo20958G0(15, announcement.getAuxiliaryBody());
            }
            String m43912j2 = C19837dg.m43912j(announcement.getAuxiliaryAsset());
            if (m43912j2 == null) {
                interfaceC47496qV5.mo20954m1(16);
            } else {
                interfaceC47496qV5.mo20958G0(16, m43912j2);
            }
            if (announcement.getShareContent() == null) {
                interfaceC47496qV5.mo20954m1(17);
            } else {
                interfaceC47496qV5.mo20958G0(17, announcement.getShareContent());
            }
            if (announcement.getLearnMoreUrl() == null) {
                interfaceC47496qV5.mo20954m1(18);
            } else {
                interfaceC47496qV5.mo20958G0(18, announcement.getLearnMoreUrl());
            }
            String m43911k = C19837dg.m43911k(announcement.getPages());
            if (m43911k == null) {
                interfaceC47496qV5.mo20954m1(19);
            } else {
                interfaceC47496qV5.mo20958G0(19, m43911k);
            }
            if (announcement.getNavigationTitle() == null) {
                interfaceC47496qV5.mo20954m1(20);
            } else {
                interfaceC47496qV5.mo20958G0(20, announcement.getNavigationTitle());
            }
        }
    }

    /* renamed from: fg$b */
    /* loaded from: classes4.dex */
    public class C20484b extends AbstractC41861gz5 {
        public C20484b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM announcement WHERE id = ?";
        }
    }

    /* renamed from: fg$c */
    /* loaded from: classes4.dex */
    public class C20485c extends AbstractC41861gz5 {
        public C20485c(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM announcement";
        }
    }

    /* renamed from: fg$d */
    /* loaded from: classes4.dex */
    public class CallableC20486d implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ Announcement[] f80422b;

        public CallableC20486d(Announcement[] announcementArr) {
            this.f80422b = announcementArr;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C20482fg.this.f80415a.m108730c();
            try {
                C20482fg.this.f80416b.m61087l(this.f80422b);
                C20482fg.this.f80415a.m108734A();
                C20482fg.this.f80415a.m108728g();
                return null;
            } catch (Throwable th) {
                C20482fg.this.f80415a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: fg$e */
    /* loaded from: classes4.dex */
    public class CallableC20487e implements Callable<Void> {
        public CallableC20487e() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C20482fg.this.f80418d.m37254b();
            C20482fg.this.f80415a.m108730c();
            try {
                m37254b.mo17482M();
                C20482fg.this.f80415a.m108734A();
                C20482fg.this.f80415a.m108728g();
                C20482fg.this.f80418d.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C20482fg.this.f80415a.m108728g();
                C20482fg.this.f80418d.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: fg$f */
    /* loaded from: classes4.dex */
    public class CallableC20488f implements Callable<List<Announcement>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f80425b;

        public CallableC20488f(C33265Hb5 c33265Hb5) {
            this.f80425b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<Announcement> call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            String string10;
            String string11;
            String string12;
            Integer valueOf;
            boolean z;
            Boolean valueOf2;
            int i;
            String string13;
            String string14;
            String string15;
            String string16;
            int i2;
            String string17;
            int i3;
            String string18;
            String string19;
            Cursor m102673c = IF0.m102673c(C20482fg.this.f80415a, this.f80425b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, CoreConstants.CONTEXT_SCOPE_VALUE);
                int m41645e3 = C40824fF0.m41645e(m102673c, "context_parameters");
                int m41645e4 = C40824fF0.m41645e(m102673c, "display_type");
                int m41645e5 = C40824fF0.m41645e(m102673c, "content_type");
                int m41645e6 = C40824fF0.m41645e(m102673c, "title");
                int m41645e7 = C40824fF0.m41645e(m102673c, "title_asset");
                int m41645e8 = C40824fF0.m41645e(m102673c, "message");
                int m41645e9 = C40824fF0.m41645e(m102673c, "message_url");
                int m41645e10 = C40824fF0.m41645e(m102673c, "button_text");
                int m41645e11 = C40824fF0.m41645e(m102673c, "analytics_title");
                int m41645e12 = C40824fF0.m41645e(m102673c, "button_url");
                int m41645e13 = C40824fF0.m41645e(m102673c, "open_in_webview");
                int m41645e14 = C40824fF0.m41645e(m102673c, "auxiliary_title");
                int m41645e15 = C40824fF0.m41645e(m102673c, "auxiliary_body");
                int m41645e16 = C40824fF0.m41645e(m102673c, "auxiliary_asset");
                int m41645e17 = C40824fF0.m41645e(m102673c, "share_content");
                int m41645e18 = C40824fF0.m41645e(m102673c, "learn_more_url");
                int m41645e19 = C40824fF0.m41645e(m102673c, "pages");
                int m41645e20 = C40824fF0.m41645e(m102673c, "navigation_title");
                int i4 = m41645e14;
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
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
                    AnnouncementContext m43920b = C19837dg.m43920b(string2);
                    if (m102673c.isNull(m41645e3)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e3);
                    }
                    AnnouncementContextParameters m43919c = C19837dg.m43919c(string3);
                    if (m102673c.isNull(m41645e4)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e4);
                    }
                    AnnouncementDisplayType m43918d = C19837dg.m43918d(string4);
                    if (m102673c.isNull(m41645e5)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e5);
                    }
                    AnnouncementContentType m43921a = C19837dg.m43921a(string5);
                    if (m102673c.isNull(m41645e6)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e6);
                    }
                    if (m102673c.isNull(m41645e7)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e7);
                    }
                    LegacyAsset m43910l = C19837dg.m43910l(string7);
                    if (m102673c.isNull(m41645e8)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e8);
                    }
                    if (m102673c.isNull(m41645e9)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(m41645e9);
                    }
                    if (m102673c.isNull(m41645e10)) {
                        string10 = null;
                    } else {
                        string10 = m102673c.getString(m41645e10);
                    }
                    if (m102673c.isNull(m41645e11)) {
                        string11 = null;
                    } else {
                        string11 = m102673c.getString(m41645e11);
                    }
                    if (m102673c.isNull(m41645e12)) {
                        string12 = null;
                    } else {
                        string12 = m102673c.getString(m41645e12);
                    }
                    if (m102673c.isNull(m41645e13)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(m102673c.getInt(m41645e13));
                    }
                    if (valueOf == null) {
                        i = i4;
                        valueOf2 = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        valueOf2 = Boolean.valueOf(z);
                        i = i4;
                    }
                    if (m102673c.isNull(i)) {
                        string13 = null;
                    } else {
                        string13 = m102673c.getString(i);
                    }
                    int i5 = m41645e15;
                    int i6 = m41645e;
                    if (m102673c.isNull(i5)) {
                        string14 = null;
                    } else {
                        string14 = m102673c.getString(i5);
                    }
                    int i7 = m41645e16;
                    if (m102673c.isNull(i7)) {
                        string15 = null;
                    } else {
                        string15 = m102673c.getString(i7);
                    }
                    LegacyAsset m43910l2 = C19837dg.m43910l(string15);
                    int i8 = m41645e17;
                    if (m102673c.isNull(i8)) {
                        m41645e17 = i8;
                        i2 = m41645e18;
                        string16 = null;
                    } else {
                        string16 = m102673c.getString(i8);
                        m41645e17 = i8;
                        i2 = m41645e18;
                    }
                    if (m102673c.isNull(i2)) {
                        m41645e18 = i2;
                        i3 = m41645e19;
                        string17 = null;
                    } else {
                        string17 = m102673c.getString(i2);
                        m41645e18 = i2;
                        i3 = m41645e19;
                    }
                    if (m102673c.isNull(i3)) {
                        string18 = null;
                    } else {
                        string18 = m102673c.getString(i3);
                    }
                    List<AnnouncementPage> m43917e = C19837dg.m43917e(string18);
                    m41645e19 = i3;
                    int i9 = m41645e20;
                    if (m102673c.isNull(i9)) {
                        m41645e20 = i9;
                        string19 = null;
                    } else {
                        string19 = m102673c.getString(i9);
                        m41645e20 = i9;
                    }
                    arrayList.add(new Announcement(string, m43920b, m43919c, m43918d, m43921a, string6, m43910l, string8, string9, string10, string11, string12, valueOf2, string13, string14, m43910l2, string16, string17, m43917e, string19));
                    m41645e = i6;
                    m41645e15 = i5;
                    m41645e16 = i7;
                    i4 = i;
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f80425b.release();
        }
    }

    /* renamed from: fg$g */
    /* loaded from: classes4.dex */
    public class CallableC20489g implements Callable<List<Announcement>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f80427b;

        public CallableC20489g(C33265Hb5 c33265Hb5) {
            this.f80427b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<Announcement> call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            String string10;
            String string11;
            String string12;
            Integer valueOf;
            boolean z;
            Boolean valueOf2;
            int i;
            String string13;
            String string14;
            String string15;
            String string16;
            int i2;
            String string17;
            int i3;
            String string18;
            String string19;
            Cursor m102673c = IF0.m102673c(C20482fg.this.f80415a, this.f80427b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, CoreConstants.CONTEXT_SCOPE_VALUE);
                int m41645e3 = C40824fF0.m41645e(m102673c, "context_parameters");
                int m41645e4 = C40824fF0.m41645e(m102673c, "display_type");
                int m41645e5 = C40824fF0.m41645e(m102673c, "content_type");
                int m41645e6 = C40824fF0.m41645e(m102673c, "title");
                int m41645e7 = C40824fF0.m41645e(m102673c, "title_asset");
                int m41645e8 = C40824fF0.m41645e(m102673c, "message");
                int m41645e9 = C40824fF0.m41645e(m102673c, "message_url");
                int m41645e10 = C40824fF0.m41645e(m102673c, "button_text");
                int m41645e11 = C40824fF0.m41645e(m102673c, "analytics_title");
                int m41645e12 = C40824fF0.m41645e(m102673c, "button_url");
                int m41645e13 = C40824fF0.m41645e(m102673c, "open_in_webview");
                int m41645e14 = C40824fF0.m41645e(m102673c, "auxiliary_title");
                int m41645e15 = C40824fF0.m41645e(m102673c, "auxiliary_body");
                int m41645e16 = C40824fF0.m41645e(m102673c, "auxiliary_asset");
                int m41645e17 = C40824fF0.m41645e(m102673c, "share_content");
                int m41645e18 = C40824fF0.m41645e(m102673c, "learn_more_url");
                int m41645e19 = C40824fF0.m41645e(m102673c, "pages");
                int m41645e20 = C40824fF0.m41645e(m102673c, "navigation_title");
                int i4 = m41645e14;
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
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
                    AnnouncementContext m43920b = C19837dg.m43920b(string2);
                    if (m102673c.isNull(m41645e3)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e3);
                    }
                    AnnouncementContextParameters m43919c = C19837dg.m43919c(string3);
                    if (m102673c.isNull(m41645e4)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e4);
                    }
                    AnnouncementDisplayType m43918d = C19837dg.m43918d(string4);
                    if (m102673c.isNull(m41645e5)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e5);
                    }
                    AnnouncementContentType m43921a = C19837dg.m43921a(string5);
                    if (m102673c.isNull(m41645e6)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e6);
                    }
                    if (m102673c.isNull(m41645e7)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e7);
                    }
                    LegacyAsset m43910l = C19837dg.m43910l(string7);
                    if (m102673c.isNull(m41645e8)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e8);
                    }
                    if (m102673c.isNull(m41645e9)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(m41645e9);
                    }
                    if (m102673c.isNull(m41645e10)) {
                        string10 = null;
                    } else {
                        string10 = m102673c.getString(m41645e10);
                    }
                    if (m102673c.isNull(m41645e11)) {
                        string11 = null;
                    } else {
                        string11 = m102673c.getString(m41645e11);
                    }
                    if (m102673c.isNull(m41645e12)) {
                        string12 = null;
                    } else {
                        string12 = m102673c.getString(m41645e12);
                    }
                    if (m102673c.isNull(m41645e13)) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(m102673c.getInt(m41645e13));
                    }
                    if (valueOf == null) {
                        i = i4;
                        valueOf2 = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        valueOf2 = Boolean.valueOf(z);
                        i = i4;
                    }
                    if (m102673c.isNull(i)) {
                        string13 = null;
                    } else {
                        string13 = m102673c.getString(i);
                    }
                    int i5 = m41645e15;
                    int i6 = m41645e;
                    if (m102673c.isNull(i5)) {
                        string14 = null;
                    } else {
                        string14 = m102673c.getString(i5);
                    }
                    int i7 = m41645e16;
                    if (m102673c.isNull(i7)) {
                        string15 = null;
                    } else {
                        string15 = m102673c.getString(i7);
                    }
                    LegacyAsset m43910l2 = C19837dg.m43910l(string15);
                    int i8 = m41645e17;
                    if (m102673c.isNull(i8)) {
                        m41645e17 = i8;
                        i2 = m41645e18;
                        string16 = null;
                    } else {
                        string16 = m102673c.getString(i8);
                        m41645e17 = i8;
                        i2 = m41645e18;
                    }
                    if (m102673c.isNull(i2)) {
                        m41645e18 = i2;
                        i3 = m41645e19;
                        string17 = null;
                    } else {
                        string17 = m102673c.getString(i2);
                        m41645e18 = i2;
                        i3 = m41645e19;
                    }
                    if (m102673c.isNull(i3)) {
                        string18 = null;
                    } else {
                        string18 = m102673c.getString(i3);
                    }
                    List<AnnouncementPage> m43917e = C19837dg.m43917e(string18);
                    m41645e19 = i3;
                    int i9 = m41645e20;
                    if (m102673c.isNull(i9)) {
                        m41645e20 = i9;
                        string19 = null;
                    } else {
                        string19 = m102673c.getString(i9);
                        m41645e20 = i9;
                    }
                    arrayList.add(new Announcement(string, m43920b, m43919c, m43918d, m43921a, string6, m43910l, string8, string9, string10, string11, string12, valueOf2, string13, string14, m43910l2, string16, string17, m43917e, string19));
                    m41645e = i6;
                    m41645e15 = i5;
                    m41645e16 = i7;
                    i4 = i;
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f80427b.release();
        }
    }

    /* renamed from: fg$h */
    /* loaded from: classes4.dex */
    public class CallableC20490h implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f80429b;

        public CallableC20490h(List list) {
            this.f80429b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            StringBuilder m33905b = C42725iS5.m33905b();
            m33905b.append("DELETE FROM announcement WHERE id NOT IN (");
            C42725iS5.m33906a(m33905b, this.f80429b.size());
            m33905b.append(")");
            InterfaceC47496qV5 m108729d = C20482fg.this.f80415a.m108729d(m33905b.toString());
            int i = 1;
            for (String str : this.f80429b) {
                if (str == null) {
                    m108729d.mo20954m1(i);
                } else {
                    m108729d.mo20958G0(i, str);
                }
                i++;
            }
            C20482fg.this.f80415a.m108730c();
            try {
                m108729d.mo17482M();
                C20482fg.this.f80415a.m108734A();
                C20482fg.this.f80415a.m108728g();
                return null;
            } catch (Throwable th) {
                C20482fg.this.f80415a.m108728g();
                throw th;
            }
        }
    }

    public C20482fg(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f80415a = abstractC32563Eb5;
        this.f80416b = new C20483a(abstractC32563Eb5);
        this.f80417c = new C20484b(abstractC32563Eb5);
        this.f80418d = new C20485c(abstractC32563Eb5);
    }

    /* renamed from: i */
    public static List<Class<?>> m41052i() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC20087eg
    /* renamed from: a */
    public Observable<List<Announcement>> mo41060a(AnnouncementContext announcementContext) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM announcement WHERE context = ?", 1);
        String m43915g = C19837dg.m43915g(announcementContext);
        if (m43915g == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, m43915g);
        }
        return C37504Ze5.m72808c(this.f80415a, false, new String[]{"announcement"}, new CallableC20488f(m103680c));
    }

    @Override // p000.AbstractC20087eg
    /* renamed from: b */
    public Observable<List<Announcement>> mo41059b(AnnouncementDisplayType announcementDisplayType) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM announcement WHERE display_type = ?", 1);
        String m43914h = C19837dg.m43914h(announcementDisplayType);
        if (m43914h == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, m43914h);
        }
        return C37504Ze5.m72808c(this.f80415a, false, new String[]{"announcement"}, new CallableC20489g(m103680c));
    }

    @Override // p000.AbstractC20087eg
    /* renamed from: c */
    public AbstractC23461c mo41058c() {
        return AbstractC23461c.m33078H(new CallableC20487e());
    }

    @Override // p000.AbstractC20087eg
    /* renamed from: d */
    public AbstractC23461c mo41057d(Announcement... announcementArr) {
        return AbstractC23461c.m33078H(new CallableC20486d(announcementArr));
    }

    @Override // p000.AbstractC20087eg
    /* renamed from: e */
    public AbstractC23461c mo41056e(List<String> list) {
        return AbstractC23461c.m33078H(new CallableC20490h(list));
    }
}
