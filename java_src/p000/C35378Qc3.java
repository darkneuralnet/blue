package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.NotificationGroup;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.joda.time.DateTime;
/* renamed from: Qc3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35378Qc3 extends AbstractC35144Pc3 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f30574a;

    /* renamed from: b */
    public final AbstractC39268cf1<NotificationGroup> f30575b;

    /* renamed from: c */
    public final AbstractC41861gz5 f30576c;

    /* renamed from: Qc3$a */
    /* loaded from: classes4.dex */
    public class C6810a extends AbstractC39268cf1<NotificationGroup> {
        public C6810a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `notification_groups` (`id`,`title`,`description`,`category`,`date`,`icon`) VALUES (?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, NotificationGroup notificationGroup) {
            if (notificationGroup.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, notificationGroup.getId());
            }
            if (notificationGroup.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, notificationGroup.getTitle());
            }
            if (notificationGroup.getDescription() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, notificationGroup.getDescription());
            }
            if (notificationGroup.getCategory() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, notificationGroup.getCategory());
            }
            Converters converters = Converters.f66822a;
            String m55279e = Converters.m55279e(notificationGroup.getDate());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m55279e);
            }
            C49317ta3 c49317ta3 = C49317ta3.f110767a;
            String m12032b = C49317ta3.m12032b(notificationGroup.getIcon());
            if (m12032b == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, m12032b);
            }
        }
    }

    /* renamed from: Qc3$b */
    /* loaded from: classes4.dex */
    public class C6811b extends AbstractC41861gz5 {
        public C6811b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM notification_groups";
        }
    }

    /* renamed from: Qc3$c */
    /* loaded from: classes4.dex */
    public class CallableC6812c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ NotificationGroup[] f30579b;

        public CallableC6812c(NotificationGroup[] notificationGroupArr) {
            this.f30579b = notificationGroupArr;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C35378Qc3.this.f30574a.m108730c();
            try {
                C35378Qc3.this.f30575b.m61087l(this.f30579b);
                C35378Qc3.this.f30574a.m108734A();
                C35378Qc3.this.f30574a.m108728g();
                return null;
            } catch (Throwable th) {
                C35378Qc3.this.f30574a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: Qc3$d */
    /* loaded from: classes4.dex */
    public class CallableC6813d implements Callable<Void> {
        public CallableC6813d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C35378Qc3.this.f30576c.m37254b();
            C35378Qc3.this.f30574a.m108730c();
            try {
                m37254b.mo17482M();
                C35378Qc3.this.f30574a.m108734A();
                C35378Qc3.this.f30574a.m108728g();
                C35378Qc3.this.f30576c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C35378Qc3.this.f30574a.m108728g();
                C35378Qc3.this.f30576c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Qc3$e */
    /* loaded from: classes4.dex */
    public class CallableC6814e implements Callable<List<NotificationGroup>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f30582b;

        public CallableC6814e(C33265Hb5 c33265Hb5) {
            this.f30582b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<NotificationGroup> call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            Cursor m102673c = IF0.m102673c(C35378Qc3.this.f30574a, this.f30582b, false, null);
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
                    DateTime m55278f = Converters.m55278f(string5);
                    if (m102673c.isNull(5)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(5);
                    }
                    arrayList.add(new NotificationGroup(string, string2, string3, string4, m55278f, C49317ta3.m12029e(string6)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f30582b.release();
        }
    }

    public C35378Qc3(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f30574a = abstractC32563Eb5;
        this.f30575b = new C6810a(abstractC32563Eb5);
        this.f30576c = new C6811b(abstractC32563Eb5);
    }

    /* renamed from: g */
    public static List<Class<?>> m88335g() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC35144Pc3
    /* renamed from: a */
    public AbstractC23461c mo88341a() {
        return AbstractC23461c.m33078H(new CallableC6813d());
    }

    @Override // p000.AbstractC35144Pc3
    /* renamed from: b */
    public AbstractC23461c mo88340b(NotificationGroup... notificationGroupArr) {
        return AbstractC23461c.m33078H(new CallableC6812c(notificationGroupArr));
    }

    @Override // p000.AbstractC35144Pc3
    /* renamed from: c */
    public Observable<List<NotificationGroup>> mo88339c() {
        return C37504Ze5.m72808c(this.f30574a, false, new String[]{"notification_groups"}, new CallableC6814e(C33265Hb5.m103680c("SELECT `notification_groups`.`id` AS `id`, `notification_groups`.`title` AS `title`, `notification_groups`.`description` AS `description`, `notification_groups`.`category` AS `category`, `notification_groups`.`date` AS `date`, `notification_groups`.`icon` AS `icon` FROM notification_groups", 0)));
    }
}
