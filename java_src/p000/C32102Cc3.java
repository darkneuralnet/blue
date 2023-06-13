package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.Notification;
import co.bird.android.model.persistence.nestedstructures.OperatorNotificationIcon;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.joda.time.DateTime;
/* renamed from: Cc3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32102Cc3 extends AbstractC31868Bc3 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f4319a;

    /* renamed from: b */
    public final AbstractC39268cf1<Notification> f4320b;

    /* renamed from: c */
    public final AbstractC41861gz5 f4321c;

    /* renamed from: Cc3$a */
    /* loaded from: classes4.dex */
    public class C1076a extends AbstractC39268cf1<Notification> {
        public C1076a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `notifications` (`id`,`group_id`,`category`,`kind`,`title`,`short_description`,`full_description`,`icon`,`date`,`actions`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, Notification notification) {
            if (notification.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, notification.getId());
            }
            if (notification.getGroupId() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, notification.getGroupId());
            }
            if (notification.getCategory() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, notification.getCategory());
            }
            if (notification.getKind() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, notification.getKind());
            }
            if (notification.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, notification.getTitle());
            }
            if (notification.getShortDescription() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, notification.getShortDescription());
            }
            if (notification.getFullDescription() == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, notification.getFullDescription());
            }
            C49317ta3 c49317ta3 = C49317ta3.f110767a;
            String m12032b = C49317ta3.m12032b(notification.getIcon());
            if (m12032b == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, m12032b);
            }
            Converters converters = Converters.f66822a;
            String m55279e = Converters.m55279e(notification.getDate());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, m55279e);
            }
            String m12031c = C49317ta3.m12031c(notification.getActions());
            if (m12031c == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, m12031c);
            }
        }
    }

    /* renamed from: Cc3$b */
    /* loaded from: classes4.dex */
    public class C1077b extends AbstractC41861gz5 {
        public C1077b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM notifications";
        }
    }

    /* renamed from: Cc3$c */
    /* loaded from: classes4.dex */
    public class CallableC1078c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ Notification[] f4324b;

        public CallableC1078c(Notification[] notificationArr) {
            this.f4324b = notificationArr;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C32102Cc3.this.f4319a.m108730c();
            try {
                C32102Cc3.this.f4320b.m61087l(this.f4324b);
                C32102Cc3.this.f4319a.m108734A();
                C32102Cc3.this.f4319a.m108728g();
                return null;
            } catch (Throwable th) {
                C32102Cc3.this.f4319a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: Cc3$d */
    /* loaded from: classes4.dex */
    public class CallableC1079d implements Callable<Void> {
        public CallableC1079d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C32102Cc3.this.f4321c.m37254b();
            C32102Cc3.this.f4319a.m108730c();
            try {
                m37254b.mo17482M();
                C32102Cc3.this.f4319a.m108734A();
                C32102Cc3.this.f4319a.m108728g();
                C32102Cc3.this.f4321c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C32102Cc3.this.f4319a.m108728g();
                C32102Cc3.this.f4321c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Cc3$e */
    /* loaded from: classes4.dex */
    public class CallableC1080e implements Callable<List<Notification>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f4327b;

        public CallableC1080e(C33265Hb5 c33265Hb5) {
            this.f4327b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<Notification> call() throws Exception {
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
            Cursor m102673c = IF0.m102673c(C32102Cc3.this.f4319a, this.f4327b, false, null);
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
                    if (m102673c.isNull(2)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(2);
                    }
                    if (m102673c.isNull(3)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(3);
                    }
                    if (m102673c.isNull(4)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(4);
                    }
                    if (m102673c.isNull(5)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(5);
                    }
                    if (m102673c.isNull(6)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(6);
                    }
                    if (m102673c.isNull(7)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(7);
                    }
                    OperatorNotificationIcon m12029e = C49317ta3.m12029e(string8);
                    if (m102673c.isNull(8)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(8);
                    }
                    DateTime m55278f = Converters.m55278f(string9);
                    if (m102673c.isNull(9)) {
                        string10 = null;
                    } else {
                        string10 = m102673c.getString(9);
                    }
                    arrayList.add(new Notification(string, string2, string3, string4, string5, string6, string7, m12029e, m55278f, C49317ta3.m12030d(string10)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f4327b.release();
        }
    }

    /* renamed from: Cc3$f */
    /* loaded from: classes4.dex */
    public class CallableC1081f implements Callable<Notification> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f4329b;

        public CallableC1081f(C33265Hb5 c33265Hb5) {
            this.f4329b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Notification call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            Notification notification = null;
            String string10 = null;
            Cursor m102673c = IF0.m102673c(C32102Cc3.this.f4319a, this.f4329b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "group_id");
                int m41645e3 = C40824fF0.m41645e(m102673c, "category");
                int m41645e4 = C40824fF0.m41645e(m102673c, "kind");
                int m41645e5 = C40824fF0.m41645e(m102673c, "title");
                int m41645e6 = C40824fF0.m41645e(m102673c, "short_description");
                int m41645e7 = C40824fF0.m41645e(m102673c, "full_description");
                int m41645e8 = C40824fF0.m41645e(m102673c, "icon");
                int m41645e9 = C40824fF0.m41645e(m102673c, "date");
                int m41645e10 = C40824fF0.m41645e(m102673c, "actions");
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
                    if (m102673c.isNull(m41645e3)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e3);
                    }
                    if (m102673c.isNull(m41645e4)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e4);
                    }
                    if (m102673c.isNull(m41645e5)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e5);
                    }
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
                    if (m102673c.isNull(m41645e8)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e8);
                    }
                    OperatorNotificationIcon m12029e = C49317ta3.m12029e(string8);
                    if (m102673c.isNull(m41645e9)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(m41645e9);
                    }
                    DateTime m55278f = Converters.m55278f(string9);
                    if (!m102673c.isNull(m41645e10)) {
                        string10 = m102673c.getString(m41645e10);
                    }
                    notification = new Notification(string, string2, string3, string4, string5, string6, string7, m12029e, m55278f, C49317ta3.m12030d(string10));
                }
                return notification;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f4329b.release();
        }
    }

    /* renamed from: Cc3$g */
    /* loaded from: classes4.dex */
    public class CallableC1082g implements Callable<List<Notification>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f4331b;

        public CallableC1082g(C33265Hb5 c33265Hb5) {
            this.f4331b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<Notification> call() throws Exception {
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
            Cursor m102673c = IF0.m102673c(C32102Cc3.this.f4319a, this.f4331b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "group_id");
                int m41645e3 = C40824fF0.m41645e(m102673c, "category");
                int m41645e4 = C40824fF0.m41645e(m102673c, "kind");
                int m41645e5 = C40824fF0.m41645e(m102673c, "title");
                int m41645e6 = C40824fF0.m41645e(m102673c, "short_description");
                int m41645e7 = C40824fF0.m41645e(m102673c, "full_description");
                int m41645e8 = C40824fF0.m41645e(m102673c, "icon");
                int m41645e9 = C40824fF0.m41645e(m102673c, "date");
                int m41645e10 = C40824fF0.m41645e(m102673c, "actions");
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
                    if (m102673c.isNull(m41645e3)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e3);
                    }
                    if (m102673c.isNull(m41645e4)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e4);
                    }
                    if (m102673c.isNull(m41645e5)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e5);
                    }
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
                    if (m102673c.isNull(m41645e8)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e8);
                    }
                    OperatorNotificationIcon m12029e = C49317ta3.m12029e(string8);
                    if (m102673c.isNull(m41645e9)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(m41645e9);
                    }
                    DateTime m55278f = Converters.m55278f(string9);
                    if (m102673c.isNull(m41645e10)) {
                        string10 = null;
                    } else {
                        string10 = m102673c.getString(m41645e10);
                    }
                    arrayList.add(new Notification(string, string2, string3, string4, string5, string6, string7, m12029e, m55278f, C49317ta3.m12030d(string10)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f4331b.release();
        }
    }

    /* renamed from: Cc3$h */
    /* loaded from: classes4.dex */
    public class CallableC1083h implements Callable<DateTime> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f4333b;

        public CallableC1083h(C33265Hb5 c33265Hb5) {
            this.f4333b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public DateTime call() throws Exception {
            DateTime dateTime = null;
            String string = null;
            Cursor m102673c = IF0.m102673c(C32102Cc3.this.f4319a, this.f4333b, false, null);
            try {
                if (m102673c.moveToFirst()) {
                    if (!m102673c.isNull(0)) {
                        string = m102673c.getString(0);
                    }
                    dateTime = Converters.m55278f(string);
                }
                return dateTime;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f4333b.release();
        }
    }

    public C32102Cc3(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f4319a = abstractC32563Eb5;
        this.f4320b = new C1076a(abstractC32563Eb5);
        this.f4321c = new C1077b(abstractC32563Eb5);
    }

    /* renamed from: j */
    public static List<Class<?>> m112042j() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC31868Bc3
    /* renamed from: a */
    public AbstractC23461c mo112051a() {
        return AbstractC23461c.m33078H(new CallableC1079d());
    }

    @Override // p000.AbstractC31868Bc3
    /* renamed from: b */
    public AbstractC24507p<DateTime> mo112050b() {
        return AbstractC24507p.m32071D(new CallableC1083h(C33265Hb5.m103680c("SELECT date FROM notifications ORDER BY date DESC LIMIT 1", 0)));
    }

    @Override // p000.AbstractC31868Bc3
    /* renamed from: c */
    public AbstractC23461c mo112049c(Notification... notificationArr) {
        return AbstractC23461c.m33078H(new CallableC1078c(notificationArr));
    }

    @Override // p000.AbstractC31868Bc3
    /* renamed from: d */
    public Observable<Notification> mo112048d(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM notifications WHERE id = ?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f4319a, false, new String[]{"notifications"}, new CallableC1081f(m103680c));
    }

    @Override // p000.AbstractC31868Bc3
    /* renamed from: e */
    public Observable<List<Notification>> mo112047e(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM notifications WHERE group_id = ?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f4319a, false, new String[]{"notifications"}, new CallableC1082g(m103680c));
    }

    @Override // p000.AbstractC31868Bc3
    /* renamed from: f */
    public Observable<List<Notification>> mo112046f() {
        return C37504Ze5.m72808c(this.f4319a, false, new String[]{"notifications"}, new CallableC1080e(C33265Hb5.m103680c("SELECT `notifications`.`id` AS `id`, `notifications`.`group_id` AS `group_id`, `notifications`.`category` AS `category`, `notifications`.`kind` AS `kind`, `notifications`.`title` AS `title`, `notifications`.`short_description` AS `short_description`, `notifications`.`full_description` AS `full_description`, `notifications`.`icon` AS `icon`, `notifications`.`date` AS `date`, `notifications`.`actions` AS `actions` FROM notifications WHERE group_id IS NULL", 0)));
    }
}
