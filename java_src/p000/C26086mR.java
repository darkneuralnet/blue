package p000;

import android.database.Cursor;
import co.bird.android.model.constant.BirdPlusSubscriptionViewIneligibleReason;
import co.bird.android.model.constant.BirdPlusSubscriptionViewStatus;
import co.bird.android.model.persistence.BirdPlusDisplayView;
import co.bird.android.model.persistence.BirdPlusSubscriptionPlanView;
import co.bird.android.model.persistence.BirdPlusUserSubscriptionView;
import co.bird.android.model.persistence.BirdPlusView;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: mR */
/* loaded from: classes4.dex */
public final class C26086mR extends AbstractC25698lR {

    /* renamed from: a */
    public final AbstractC32563Eb5 f97991a;

    /* renamed from: b */
    public final AbstractC39268cf1<BirdPlusView> f97992b;

    /* renamed from: c */
    public final AbstractC41861gz5 f97993c;

    /* renamed from: d */
    public final AbstractC41861gz5 f97994d;

    /* renamed from: mR$a */
    /* loaded from: classes4.dex */
    public class CallableC26087a implements Callable<BirdPlusView> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f97995b;

        public CallableC26087a(C33265Hb5 c33265Hb5) {
            this.f97995b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public BirdPlusView call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            BirdPlusView birdPlusView = null;
            String string9 = null;
            Cursor m102673c = IF0.m102673c(C26086mR.this.f97991a, this.f97995b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "status");
                int m41645e2 = C40824fF0.m41645e(m102673c, "subscription_plan_id");
                int m41645e3 = C40824fF0.m41645e(m102673c, "user_subscription_id");
                int m41645e4 = C40824fF0.m41645e(m102673c, "codename");
                int m41645e5 = C40824fF0.m41645e(m102673c, "subscription_plan");
                int m41645e6 = C40824fF0.m41645e(m102673c, "user_subscription");
                int m41645e7 = C40824fF0.m41645e(m102673c, "ineligible_reason");
                int m41645e8 = C40824fF0.m41645e(m102673c, "display");
                int m41645e9 = C40824fF0.m41645e(m102673c, "zendesk_article_id");
                if (m102673c.moveToFirst()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    BirdPlusSubscriptionViewStatus m28968e = C25161kR.m28968e(string);
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
                    BirdPlusSubscriptionPlanView m28971b = C25161kR.m28971b(string5);
                    if (m102673c.isNull(m41645e6)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e6);
                    }
                    BirdPlusUserSubscriptionView m28970c = C25161kR.m28970c(string6);
                    if (m102673c.isNull(m41645e7)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e7);
                    }
                    BirdPlusSubscriptionViewIneligibleReason m28969d = C25161kR.m28969d(string7);
                    if (m102673c.isNull(m41645e8)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e8);
                    }
                    BirdPlusDisplayView m28972a = C25161kR.m28972a(string8);
                    if (!m102673c.isNull(m41645e9)) {
                        string9 = m102673c.getString(m41645e9);
                    }
                    birdPlusView = new BirdPlusView(m28968e, string2, string3, string4, m28971b, m28970c, m28969d, m28972a, string9);
                }
                return birdPlusView;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f97995b.release();
        }
    }

    /* renamed from: mR$b */
    /* loaded from: classes4.dex */
    public class CallableC26088b implements Callable<BirdPlusView> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f97997b;

        public CallableC26088b(C33265Hb5 c33265Hb5) {
            this.f97997b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public BirdPlusView call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            BirdPlusView birdPlusView = null;
            String string9 = null;
            Cursor m102673c = IF0.m102673c(C26086mR.this.f97991a, this.f97997b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "status");
                int m41645e2 = C40824fF0.m41645e(m102673c, "subscription_plan_id");
                int m41645e3 = C40824fF0.m41645e(m102673c, "user_subscription_id");
                int m41645e4 = C40824fF0.m41645e(m102673c, "codename");
                int m41645e5 = C40824fF0.m41645e(m102673c, "subscription_plan");
                int m41645e6 = C40824fF0.m41645e(m102673c, "user_subscription");
                int m41645e7 = C40824fF0.m41645e(m102673c, "ineligible_reason");
                int m41645e8 = C40824fF0.m41645e(m102673c, "display");
                int m41645e9 = C40824fF0.m41645e(m102673c, "zendesk_article_id");
                if (m102673c.moveToFirst()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    BirdPlusSubscriptionViewStatus m28968e = C25161kR.m28968e(string);
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
                    BirdPlusSubscriptionPlanView m28971b = C25161kR.m28971b(string5);
                    if (m102673c.isNull(m41645e6)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e6);
                    }
                    BirdPlusUserSubscriptionView m28970c = C25161kR.m28970c(string6);
                    if (m102673c.isNull(m41645e7)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e7);
                    }
                    BirdPlusSubscriptionViewIneligibleReason m28969d = C25161kR.m28969d(string7);
                    if (m102673c.isNull(m41645e8)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e8);
                    }
                    BirdPlusDisplayView m28972a = C25161kR.m28972a(string8);
                    if (!m102673c.isNull(m41645e9)) {
                        string9 = m102673c.getString(m41645e9);
                    }
                    birdPlusView = new BirdPlusView(m28968e, string2, string3, string4, m28971b, m28970c, m28969d, m28972a, string9);
                }
                return birdPlusView;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f97997b.release();
        }
    }

    /* renamed from: mR$c */
    /* loaded from: classes4.dex */
    public class CallableC26089c implements Callable<BirdPlusView> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f97999b;

        public CallableC26089c(C33265Hb5 c33265Hb5) {
            this.f97999b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public BirdPlusView call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            BirdPlusView birdPlusView = null;
            String string9 = null;
            Cursor m102673c = IF0.m102673c(C26086mR.this.f97991a, this.f97999b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "status");
                int m41645e2 = C40824fF0.m41645e(m102673c, "subscription_plan_id");
                int m41645e3 = C40824fF0.m41645e(m102673c, "user_subscription_id");
                int m41645e4 = C40824fF0.m41645e(m102673c, "codename");
                int m41645e5 = C40824fF0.m41645e(m102673c, "subscription_plan");
                int m41645e6 = C40824fF0.m41645e(m102673c, "user_subscription");
                int m41645e7 = C40824fF0.m41645e(m102673c, "ineligible_reason");
                int m41645e8 = C40824fF0.m41645e(m102673c, "display");
                int m41645e9 = C40824fF0.m41645e(m102673c, "zendesk_article_id");
                if (m102673c.moveToFirst()) {
                    if (m102673c.isNull(m41645e)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e);
                    }
                    BirdPlusSubscriptionViewStatus m28968e = C25161kR.m28968e(string);
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
                    BirdPlusSubscriptionPlanView m28971b = C25161kR.m28971b(string5);
                    if (m102673c.isNull(m41645e6)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e6);
                    }
                    BirdPlusUserSubscriptionView m28970c = C25161kR.m28970c(string6);
                    if (m102673c.isNull(m41645e7)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e7);
                    }
                    BirdPlusSubscriptionViewIneligibleReason m28969d = C25161kR.m28969d(string7);
                    if (m102673c.isNull(m41645e8)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e8);
                    }
                    BirdPlusDisplayView m28972a = C25161kR.m28972a(string8);
                    if (!m102673c.isNull(m41645e9)) {
                        string9 = m102673c.getString(m41645e9);
                    }
                    birdPlusView = new BirdPlusView(m28968e, string2, string3, string4, m28971b, m28970c, m28969d, m28972a, string9);
                }
                return birdPlusView;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f97999b.release();
        }
    }

    /* renamed from: mR$d */
    /* loaded from: classes4.dex */
    public class C26090d extends AbstractC39268cf1<BirdPlusView> {
        public C26090d(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `bird_plus_view` (`status`,`subscription_plan_id`,`user_subscription_id`,`codename`,`subscription_plan`,`user_subscription`,`ineligible_reason`,`display`,`zendesk_article_id`) VALUES (?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, BirdPlusView birdPlusView) {
            C25161kR c25161kR = C25161kR.f94374a;
            String m28966g = C25161kR.m28966g(birdPlusView.getStatus());
            if (m28966g == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20958G0(1, m28966g);
            }
            if (birdPlusView.getSubscriptionPlanId() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, birdPlusView.getSubscriptionPlanId());
            }
            if (birdPlusView.getUserSubscriptionId() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, birdPlusView.getUserSubscriptionId());
            }
            if (birdPlusView.getCodename() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, birdPlusView.getCodename());
            }
            String m28964i = C25161kR.m28964i(birdPlusView.getSubscriptionPlan());
            if (m28964i == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, m28964i);
            }
            String m28963j = C25161kR.m28963j(birdPlusView.getUserSubscription());
            if (m28963j == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, m28963j);
            }
            String m28967f = C25161kR.m28967f(birdPlusView.getIneligibleReason());
            if (m28967f == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, m28967f);
            }
            String m28965h = C25161kR.m28965h(birdPlusView.getDisplay());
            if (m28965h == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, m28965h);
            }
            if (birdPlusView.getZendeskArticleId() == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, birdPlusView.getZendeskArticleId());
            }
        }
    }

    /* renamed from: mR$e */
    /* loaded from: classes4.dex */
    public class C26091e extends AbstractC41861gz5 {
        public C26091e(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE bird_plus_view SET status = 'active' WHERE user_subscription_id = ?";
        }
    }

    /* renamed from: mR$f */
    /* loaded from: classes4.dex */
    public class C26092f extends AbstractC41861gz5 {
        public C26092f(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM bird_plus_view";
        }
    }

    /* renamed from: mR$g */
    /* loaded from: classes4.dex */
    public class CallableC26093g implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f98004b;

        public CallableC26093g(List list) {
            this.f98004b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C26086mR.this.f97991a.m108730c();
            try {
                C26086mR.this.f97992b.m61089j(this.f98004b);
                C26086mR.this.f97991a.m108734A();
                C26086mR.this.f97991a.m108728g();
                return null;
            } catch (Throwable th) {
                C26086mR.this.f97991a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: mR$h */
    /* loaded from: classes4.dex */
    public class CallableC26094h implements Callable<Void> {
        public CallableC26094h() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C26086mR.this.f97994d.m37254b();
            C26086mR.this.f97991a.m108730c();
            try {
                m37254b.mo17482M();
                C26086mR.this.f97991a.m108734A();
                C26086mR.this.f97991a.m108728g();
                C26086mR.this.f97994d.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C26086mR.this.f97991a.m108728g();
                C26086mR.this.f97994d.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: mR$i */
    /* loaded from: classes4.dex */
    public class CallableC26095i implements Callable<Void> {
        public CallableC26095i() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C26086mR.this.f97994d.m37254b();
            C26086mR.this.f97991a.m108730c();
            try {
                m37254b.mo17482M();
                C26086mR.this.f97991a.m108734A();
                C26086mR.this.f97991a.m108728g();
                C26086mR.this.f97994d.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C26086mR.this.f97991a.m108728g();
                C26086mR.this.f97994d.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: mR$j */
    /* loaded from: classes4.dex */
    public class CallableC26096j implements Callable<List<BirdPlusView>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f98008b;

        public CallableC26096j(C33265Hb5 c33265Hb5) {
            this.f98008b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<BirdPlusView> call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            Cursor m102673c = IF0.m102673c(C26086mR.this.f97991a, this.f98008b, false, null);
            try {
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(0)) {
                        string = null;
                    } else {
                        string = m102673c.getString(0);
                    }
                    BirdPlusSubscriptionViewStatus m28968e = C25161kR.m28968e(string);
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
                    BirdPlusSubscriptionPlanView m28971b = C25161kR.m28971b(string5);
                    if (m102673c.isNull(5)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(5);
                    }
                    BirdPlusUserSubscriptionView m28970c = C25161kR.m28970c(string6);
                    if (m102673c.isNull(6)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(6);
                    }
                    BirdPlusSubscriptionViewIneligibleReason m28969d = C25161kR.m28969d(string7);
                    if (m102673c.isNull(7)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(7);
                    }
                    BirdPlusDisplayView m28972a = C25161kR.m28972a(string8);
                    if (m102673c.isNull(8)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(8);
                    }
                    arrayList.add(new BirdPlusView(m28968e, string2, string3, string4, m28971b, m28970c, m28969d, m28972a, string9));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f98008b.release();
        }
    }

    public C26086mR(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f97991a = abstractC32563Eb5;
        this.f97992b = new C26090d(abstractC32563Eb5);
        this.f97993c = new C26091e(abstractC32563Eb5);
        this.f97994d = new C26092f(abstractC32563Eb5);
    }

    /* renamed from: k */
    public static List<Class<?>> m25637k() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC25698lR
    /* renamed from: a */
    public AbstractC23461c mo25647a() {
        return AbstractC23461c.m33078H(new CallableC26095i());
    }

    @Override // p000.AbstractC25698lR
    /* renamed from: b */
    public AbstractC23461c mo25646b() {
        return AbstractC23461c.m33078H(new CallableC26094h());
    }

    @Override // p000.AbstractC25698lR
    /* renamed from: c */
    public Observable<List<BirdPlusView>> mo25645c() {
        return C37504Ze5.m72808c(this.f97991a, false, new String[]{"bird_plus_view"}, new CallableC26096j(C33265Hb5.m103680c("SELECT `bird_plus_view`.`status` AS `status`, `bird_plus_view`.`subscription_plan_id` AS `subscription_plan_id`, `bird_plus_view`.`user_subscription_id` AS `user_subscription_id`, `bird_plus_view`.`codename` AS `codename`, `bird_plus_view`.`subscription_plan` AS `subscription_plan`, `bird_plus_view`.`user_subscription` AS `user_subscription`, `bird_plus_view`.`ineligible_reason` AS `ineligible_reason`, `bird_plus_view`.`display` AS `display`, `bird_plus_view`.`zendesk_article_id` AS `zendesk_article_id` FROM bird_plus_view", 0)));
    }

    @Override // p000.AbstractC25698lR
    /* renamed from: d */
    public AbstractC23461c mo25644d(List<BirdPlusView> list) {
        return AbstractC23461c.m33078H(new CallableC26093g(list));
    }

    @Override // p000.AbstractC25698lR
    /* renamed from: e */
    public Observable<BirdPlusView> mo25643e(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM bird_plus_view WHERE codename = ?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f97991a, false, new String[]{"bird_plus_view"}, new CallableC26089c(m103680c));
    }

    @Override // p000.AbstractC25698lR
    /* renamed from: f */
    public Observable<BirdPlusView> mo25642f(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM bird_plus_view WHERE subscription_plan_id = ?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f97991a, false, new String[]{"bird_plus_view"}, new CallableC26088b(m103680c));
    }

    @Override // p000.AbstractC25698lR
    /* renamed from: g */
    public Observable<BirdPlusView> mo25641g(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM bird_plus_view WHERE user_subscription_id = ?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f97991a, false, new String[]{"bird_plus_view"}, new CallableC26087a(m103680c));
    }
}
