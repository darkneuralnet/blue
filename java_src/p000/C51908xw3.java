package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.OperatorTaskBanner;
import co.bird.android.model.persistence.OperatorTaskGroup;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: xw3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51908xw3 extends AbstractC51315ww3 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f118367a;

    /* renamed from: b */
    public final AbstractC39268cf1<OperatorTaskGroup> f118368b;

    /* renamed from: c */
    public final AbstractC39268cf1<OperatorTaskBanner> f118369c;

    /* renamed from: d */
    public final AbstractC41861gz5 f118370d;

    /* renamed from: e */
    public final AbstractC41861gz5 f118371e;

    /* renamed from: xw3$a */
    /* loaded from: classes4.dex */
    public class CallableC30342a implements Callable<List<OperatorTaskGroup>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f118372b;

        public CallableC30342a(C33265Hb5 c33265Hb5) {
            this.f118372b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<OperatorTaskGroup> call() throws Exception {
            String string;
            String string2;
            Cursor m102673c = IF0.m102673c(C51908xw3.this.f118367a, this.f118372b, false, null);
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
                    arrayList.add(new OperatorTaskGroup(string, C50722vw3.m7732c(string2)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f118372b.release();
        }
    }

    /* renamed from: xw3$b */
    /* loaded from: classes4.dex */
    public class CallableC30343b implements Callable<OperatorTaskGroup> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f118374b;

        public CallableC30343b(C33265Hb5 c33265Hb5) {
            this.f118374b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public OperatorTaskGroup call() throws Exception {
            String string;
            OperatorTaskGroup operatorTaskGroup = null;
            String string2 = null;
            Cursor m102673c = IF0.m102673c(C51908xw3.this.f118367a, this.f118374b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "title");
                int m41645e2 = C40824fF0.m41645e(m102673c, "tasks");
                if (m102673c.moveToFirst()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    if (!m102673c.isNull(m41645e2)) {
                        string2 = m102673c.getString(m41645e2);
                    }
                    operatorTaskGroup = new OperatorTaskGroup(string, C50722vw3.m7732c(string2));
                }
                return operatorTaskGroup;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f118374b.release();
        }
    }

    /* renamed from: xw3$c */
    /* loaded from: classes4.dex */
    public class CallableC30344c implements Callable<List<OperatorTaskBanner>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f118376b;

        public CallableC30344c(C33265Hb5 c33265Hb5) {
            this.f118376b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<OperatorTaskBanner> call() throws Exception {
            String string;
            String string2;
            String string3;
            Cursor m102673c = IF0.m102673c(C51908xw3.this.f118367a, this.f118376b, false, null);
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
                    ThemedColors m55266r = Converters.m55266r(string2);
                    if (m102673c.isNull(2)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(2);
                    }
                    arrayList.add(new OperatorTaskBanner(string, m55266r, Converters.m55266r(string3)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f118376b.release();
        }
    }

    /* renamed from: xw3$d */
    /* loaded from: classes4.dex */
    public class C30345d extends AbstractC39268cf1<OperatorTaskGroup> {
        public C30345d(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `operator_task_group` (`title`,`tasks`) VALUES (?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, OperatorTaskGroup operatorTaskGroup) {
            if (operatorTaskGroup.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, operatorTaskGroup.getTitle());
            }
            C50722vw3 c50722vw3 = C50722vw3.f114919a;
            String m7733b = C50722vw3.m7733b(operatorTaskGroup.getTasks());
            if (m7733b == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m7733b);
            }
        }
    }

    /* renamed from: xw3$e */
    /* loaded from: classes4.dex */
    public class C30346e extends AbstractC39268cf1<OperatorTaskBanner> {
        public C30346e(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `operator_task_banners` (`title`,`title_color`,`background_color`) VALUES (?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, OperatorTaskBanner operatorTaskBanner) {
            if (operatorTaskBanner.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, operatorTaskBanner.getTitle());
            }
            Converters converters = Converters.f66822a;
            String m55270n = Converters.m55270n(operatorTaskBanner.getTitleColor());
            if (m55270n == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m55270n);
            }
            String m55270n2 = Converters.m55270n(operatorTaskBanner.getBackgroundColor());
            if (m55270n2 == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m55270n2);
            }
        }
    }

    /* renamed from: xw3$f */
    /* loaded from: classes4.dex */
    public class C30347f extends AbstractC41861gz5 {
        public C30347f(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM operator_task_group";
        }
    }

    /* renamed from: xw3$g */
    /* loaded from: classes4.dex */
    public class C30348g extends AbstractC41861gz5 {
        public C30348g(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM operator_task_banners";
        }
    }

    /* renamed from: xw3$h */
    /* loaded from: classes4.dex */
    public class CallableC30349h implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f118382b;

        public CallableC30349h(List list) {
            this.f118382b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C51908xw3.this.f118367a.m108730c();
            try {
                C51908xw3.this.f118368b.m61089j(this.f118382b);
                C51908xw3.this.f118367a.m108734A();
                C51908xw3.this.f118367a.m108728g();
                return null;
            } catch (Throwable th) {
                C51908xw3.this.f118367a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: xw3$i */
    /* loaded from: classes4.dex */
    public class CallableC30350i implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ OperatorTaskBanner f118384b;

        public CallableC30350i(OperatorTaskBanner operatorTaskBanner) {
            this.f118384b = operatorTaskBanner;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C51908xw3.this.f118367a.m108730c();
            try {
                C51908xw3.this.f118369c.m61088k(this.f118384b);
                C51908xw3.this.f118367a.m108734A();
                C51908xw3.this.f118367a.m108728g();
                return null;
            } catch (Throwable th) {
                C51908xw3.this.f118367a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: xw3$j */
    /* loaded from: classes4.dex */
    public class CallableC30351j implements Callable<Void> {
        public CallableC30351j() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C51908xw3.this.f118370d.m37254b();
            C51908xw3.this.f118367a.m108730c();
            try {
                m37254b.mo17482M();
                C51908xw3.this.f118367a.m108734A();
                C51908xw3.this.f118367a.m108728g();
                C51908xw3.this.f118370d.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C51908xw3.this.f118367a.m108728g();
                C51908xw3.this.f118370d.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: xw3$k */
    /* loaded from: classes4.dex */
    public class CallableC30352k implements Callable<Void> {
        public CallableC30352k() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C51908xw3.this.f118371e.m37254b();
            C51908xw3.this.f118367a.m108730c();
            try {
                m37254b.mo17482M();
                C51908xw3.this.f118367a.m108734A();
                C51908xw3.this.f118367a.m108728g();
                C51908xw3.this.f118371e.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C51908xw3.this.f118367a.m108728g();
                C51908xw3.this.f118371e.m37249h(m37254b);
                throw th;
            }
        }
    }

    public C51908xw3(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f118367a = abstractC32563Eb5;
        this.f118368b = new C30345d(abstractC32563Eb5);
        this.f118369c = new C30346e(abstractC32563Eb5);
        this.f118370d = new C30347f(abstractC32563Eb5);
        this.f118371e = new C30348g(abstractC32563Eb5);
    }

    /* renamed from: m */
    public static List<Class<?>> m4427m() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC51315ww3
    /* renamed from: a */
    public AbstractC23461c mo4439a() {
        return AbstractC23461c.m33078H(new CallableC30352k());
    }

    @Override // p000.AbstractC51315ww3
    /* renamed from: b */
    public AbstractC23461c mo4438b() {
        return AbstractC23461c.m33078H(new CallableC30351j());
    }

    @Override // p000.AbstractC51315ww3
    /* renamed from: c */
    public AbstractC23461c mo4437c(OperatorTaskBanner operatorTaskBanner) {
        return AbstractC23461c.m33078H(new CallableC30350i(operatorTaskBanner));
    }

    @Override // p000.AbstractC51315ww3
    /* renamed from: d */
    public AbstractC23461c mo4436d(List<OperatorTaskGroup> list) {
        return AbstractC23461c.m33078H(new CallableC30349h(list));
    }

    @Override // p000.AbstractC51315ww3
    /* renamed from: e */
    public Observable<List<OperatorTaskBanner>> mo4435e() {
        return C37504Ze5.m72808c(this.f118367a, false, new String[]{"operator_task_banners"}, new CallableC30344c(C33265Hb5.m103680c("SELECT `operator_task_banners`.`title` AS `title`, `operator_task_banners`.`title_color` AS `title_color`, `operator_task_banners`.`background_color` AS `background_color` FROM operator_task_banners", 0)));
    }

    @Override // p000.AbstractC51315ww3
    /* renamed from: f */
    public Observable<List<OperatorTaskGroup>> mo4434f() {
        return C37504Ze5.m72808c(this.f118367a, false, new String[]{"operator_task_group"}, new CallableC30342a(C33265Hb5.m103680c("SELECT `operator_task_group`.`title` AS `title`, `operator_task_group`.`tasks` AS `tasks` FROM operator_task_group", 0)));
    }

    @Override // p000.AbstractC51315ww3
    /* renamed from: g */
    public Observable<OperatorTaskGroup> mo4433g(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM operator_task_group WHERE title IS (?)", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f118367a, false, new String[]{"operator_task_group"}, new CallableC30343b(m103680c));
    }
}
