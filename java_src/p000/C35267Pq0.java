package p000;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import co.bird.android.model.persistence.ComplaintResolutionForm;
import co.bird.android.model.persistence.nestedstructures.ComplaintActionTakenRequiredField;
import co.bird.android.model.persistence.nestedstructures.ComplaintIssueOption;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: Pq0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35267Pq0 extends AbstractC35033Oq0 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f29137a;

    /* renamed from: b */
    public final AbstractC39268cf1<ComplaintResolutionForm> f29138b;

    /* renamed from: c */
    public final AbstractC41861gz5 f29139c;

    /* renamed from: Pq0$a */
    /* loaded from: classes4.dex */
    public class C6498a extends AbstractC39268cf1<ComplaintResolutionForm> {
        public C6498a(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `complaint_resolution_form` (`action_taken_required_fields`,`no_action_taken_required_fields`,`issue_options`,`action_taken_options`) VALUES (?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, ComplaintResolutionForm complaintResolutionForm) {
            C34331Lq0 c34331Lq0 = C34331Lq0.f22100a;
            String m96306e = C34331Lq0.m96306e(complaintResolutionForm.getActionTakenRequiredFields());
            if (m96306e == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, m96306e);
            }
            String m96306e2 = C34331Lq0.m96306e(complaintResolutionForm.getNoActionTakenRequiredFields());
            if (m96306e2 == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m96306e2);
            }
            String m96305f = C34331Lq0.m96305f(complaintResolutionForm.getIssueOptions());
            if (m96305f == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, m96305f);
            }
            String m96305f2 = C34331Lq0.m96305f(complaintResolutionForm.getActionTakenOptions());
            if (m96305f2 == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, m96305f2);
            }
        }
    }

    /* renamed from: Pq0$b */
    /* loaded from: classes4.dex */
    public class C6499b extends AbstractC41861gz5 {
        public C6499b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM complaint_resolution_form";
        }
    }

    /* renamed from: Pq0$c */
    /* loaded from: classes4.dex */
    public class CallableC6500c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ ComplaintResolutionForm f29142b;

        public CallableC6500c(ComplaintResolutionForm complaintResolutionForm) {
            this.f29142b = complaintResolutionForm;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C35267Pq0.this.f29137a.m108730c();
            try {
                C35267Pq0.this.f29138b.m61088k(this.f29142b);
                C35267Pq0.this.f29137a.m108734A();
                C35267Pq0.this.f29137a.m108728g();
                return null;
            } catch (Throwable th) {
                C35267Pq0.this.f29137a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: Pq0$d */
    /* loaded from: classes4.dex */
    public class CallableC6501d implements Callable<Void> {
        public CallableC6501d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C35267Pq0.this.f29139c.m37254b();
            C35267Pq0.this.f29137a.m108730c();
            try {
                m37254b.mo17482M();
                C35267Pq0.this.f29137a.m108734A();
                C35267Pq0.this.f29137a.m108728g();
                C35267Pq0.this.f29139c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C35267Pq0.this.f29137a.m108728g();
                C35267Pq0.this.f29139c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Pq0$e */
    /* loaded from: classes4.dex */
    public class CallableC6502e implements Callable<ComplaintResolutionForm> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f29145b;

        public CallableC6502e(C33265Hb5 c33265Hb5) {
            this.f29145b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ComplaintResolutionForm call() throws Exception {
            String string;
            String string2;
            String string3;
            ComplaintResolutionForm complaintResolutionForm = null;
            String string4 = null;
            Cursor m102673c = IF0.m102673c(C35267Pq0.this.f29137a, this.f29145b, false, null);
            try {
                if (m102673c.moveToFirst()) {
                    if (m102673c.isNull(0)) {
                        string = null;
                    } else {
                        string = m102673c.getString(0);
                    }
                    List<ComplaintActionTakenRequiredField> m96308c = C34331Lq0.m96308c(string);
                    if (m102673c.isNull(1)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(1);
                    }
                    List<ComplaintActionTakenRequiredField> m96308c2 = C34331Lq0.m96308c(string2);
                    if (m102673c.isNull(2)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(2);
                    }
                    List<ComplaintIssueOption> m96307d = C34331Lq0.m96307d(string3);
                    if (!m102673c.isNull(3)) {
                        string4 = m102673c.getString(3);
                    }
                    complaintResolutionForm = new ComplaintResolutionForm(m96308c, m96308c2, m96307d, C34331Lq0.m96307d(string4));
                }
                if (complaintResolutionForm != null) {
                    return complaintResolutionForm;
                }
                throw new EmptyResultSetException("Query returned empty result set: " + this.f29145b.mo19174a());
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f29145b.release();
        }
    }

    public C35267Pq0(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f29137a = abstractC32563Eb5;
        this.f29138b = new C6498a(abstractC32563Eb5);
        this.f29139c = new C6499b(abstractC32563Eb5);
    }

    /* renamed from: g */
    public static List<Class<?>> m89712g() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC35033Oq0
    /* renamed from: a */
    public AbstractC23461c mo89718a() {
        return AbstractC23461c.m33078H(new CallableC6501d());
    }

    @Override // p000.AbstractC35033Oq0
    /* renamed from: b */
    public AbstractC23442F<ComplaintResolutionForm> mo89717b() {
        return C37504Ze5.m72806e(new CallableC6502e(C33265Hb5.m103680c("SELECT `complaint_resolution_form`.`action_taken_required_fields` AS `action_taken_required_fields`, `complaint_resolution_form`.`no_action_taken_required_fields` AS `no_action_taken_required_fields`, `complaint_resolution_form`.`issue_options` AS `issue_options`, `complaint_resolution_form`.`action_taken_options` AS `action_taken_options` FROM complaint_resolution_form LIMIT 1", 0)));
    }

    @Override // p000.AbstractC35033Oq0
    /* renamed from: c */
    public AbstractC23461c mo89716c(ComplaintResolutionForm complaintResolutionForm) {
        return AbstractC23461c.m33078H(new CallableC6500c(complaintResolutionForm));
    }
}
