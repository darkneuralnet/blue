package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.OperatorNotificationCategory;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: so3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48864so3 extends AbstractC48272ro3 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f109353a;

    /* renamed from: b */
    public final AbstractC39268cf1<OperatorNotificationCategory> f109354b;

    /* renamed from: c */
    public final AbstractC41861gz5 f109355c;

    /* renamed from: so3$a */
    /* loaded from: classes4.dex */
    public class C28409a extends AbstractC39268cf1<OperatorNotificationCategory> {
        public C28409a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `categories` (`category`,`title`) VALUES (?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, OperatorNotificationCategory operatorNotificationCategory) {
            if (operatorNotificationCategory.getCategory() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, operatorNotificationCategory.getCategory());
            }
            if (operatorNotificationCategory.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, operatorNotificationCategory.getTitle());
            }
        }
    }

    /* renamed from: so3$b */
    /* loaded from: classes4.dex */
    public class C28410b extends AbstractC41861gz5 {
        public C28410b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM categories";
        }
    }

    /* renamed from: so3$c */
    /* loaded from: classes4.dex */
    public class CallableC28411c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ OperatorNotificationCategory[] f109358b;

        public CallableC28411c(OperatorNotificationCategory[] operatorNotificationCategoryArr) {
            this.f109358b = operatorNotificationCategoryArr;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C48864so3.this.f109353a.m108730c();
            try {
                C48864so3.this.f109354b.m61087l(this.f109358b);
                C48864so3.this.f109353a.m108734A();
                C48864so3.this.f109353a.m108728g();
                return null;
            } catch (Throwable th) {
                C48864so3.this.f109353a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: so3$d */
    /* loaded from: classes4.dex */
    public class CallableC28412d implements Callable<List<OperatorNotificationCategory>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f109360b;

        public CallableC28412d(C33265Hb5 c33265Hb5) {
            this.f109360b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<OperatorNotificationCategory> call() throws Exception {
            String string;
            String string2;
            Cursor m102673c = IF0.m102673c(C48864so3.this.f109353a, this.f109360b, false, null);
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
                    arrayList.add(new OperatorNotificationCategory(string, string2));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f109360b.release();
        }
    }

    public C48864so3(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f109353a = abstractC32563Eb5;
        this.f109354b = new C28409a(abstractC32563Eb5);
        this.f109355c = new C28410b(abstractC32563Eb5);
    }

    /* renamed from: e */
    public static List<Class<?>> m13620e() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC48272ro3
    /* renamed from: a */
    public AbstractC23461c mo13624a(OperatorNotificationCategory... operatorNotificationCategoryArr) {
        return AbstractC23461c.m33078H(new CallableC28411c(operatorNotificationCategoryArr));
    }

    @Override // p000.AbstractC48272ro3
    /* renamed from: b */
    public Observable<List<OperatorNotificationCategory>> mo13623b() {
        return C37504Ze5.m72808c(this.f109353a, false, new String[]{"categories"}, new CallableC28412d(C33265Hb5.m103680c("SELECT `categories`.`category` AS `category`, `categories`.`title` AS `title` FROM categories", 0)));
    }
}
