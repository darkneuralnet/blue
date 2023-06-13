package p000;

import android.database.Cursor;
import co.bird.android.model.constant.RidePassViewIneligibleReason;
import co.bird.android.model.constant.RidePassViewStatus;
import co.bird.android.model.persistence.RidePassView;
import co.bird.android.model.persistence.nestedstructures.RidePassSubscriptionPlanView;
import co.bird.android.model.persistence.nestedstructures.RidePassUserSubscriptionView;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.joda.time.DateTime;
/* renamed from: DX4 */
/* loaded from: classes4.dex */
public final class DX4 extends CX4 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f5860a;

    /* renamed from: b */
    public final AbstractC39268cf1<RidePassView> f5861b;

    /* renamed from: c */
    public final AbstractC41861gz5 f5862c;

    /* renamed from: d */
    public final AbstractC41861gz5 f5863d;

    /* renamed from: DX4$a */
    /* loaded from: classes4.dex */
    public class CallableC1511a implements Callable<RidePassView> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f5864b;

        public CallableC1511a(C33265Hb5 c33265Hb5) {
            this.f5864b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public RidePassView call() throws Exception {
            RidePassView ridePassView;
            Long valueOf;
            String string;
            String string2;
            Long valueOf2;
            Long valueOf3;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            String string10;
            String string11;
            Integer valueOf4;
            int i;
            String string12;
            int i2;
            String string13;
            int i3;
            String string14;
            int i4;
            String string15;
            int i5;
            String string16;
            int i6;
            String string17;
            String string18;
            int i7;
            String string19;
            String string20;
            String string21;
            String string22;
            Cursor m102673c = IF0.m102673c(DX4.this.f5860a, this.f5864b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "id");
                int m41645e2 = C40824fF0.m41645e(m102673c, "link_code");
                int m41645e3 = C40824fF0.m41645e(m102673c, "user_ride_pass_id");
                int m41645e4 = C40824fF0.m41645e(m102673c, "price");
                int m41645e5 = C40824fF0.m41645e(m102673c, "price_tax");
                int m41645e6 = C40824fF0.m41645e(m102673c, "previous_price");
                int m41645e7 = C40824fF0.m41645e(m102673c, "currency");
                int m41645e8 = C40824fF0.m41645e(m102673c, "banner_image_url");
                int m41645e9 = C40824fF0.m41645e(m102673c, "banner_action");
                int m41645e10 = C40824fF0.m41645e(m102673c, "title");
                int m41645e11 = C40824fF0.m41645e(m102673c, "zendesk_article_id");
                int m41645e12 = C40824fF0.m41645e(m102673c, "confirmation_toast");
                int m41645e13 = C40824fF0.m41645e(m102673c, "label");
                int m41645e14 = C40824fF0.m41645e(m102673c, "status");
                int m41645e15 = C40824fF0.m41645e(m102673c, "ineligible_reason");
                int m41645e16 = C40824fF0.m41645e(m102673c, "remaining_device_transfer_count");
                int m41645e17 = C40824fF0.m41645e(m102673c, "cancel_article_id");
                int m41645e18 = C40824fF0.m41645e(m102673c, "footer");
                int m41645e19 = C40824fF0.m41645e(m102673c, "detail_body");
                int m41645e20 = C40824fF0.m41645e(m102673c, "detail_image_url");
                int m41645e21 = C40824fF0.m41645e(m102673c, "detail_action");
                int m41645e22 = C40824fF0.m41645e(m102673c, "detail_body_list");
                int m41645e23 = C40824fF0.m41645e(m102673c, "detail_footer");
                int m41645e24 = C40824fF0.m41645e(m102673c, "subscription_plan");
                int m41645e25 = C40824fF0.m41645e(m102673c, "user_subscription");
                int m41645e26 = C40824fF0.m41645e(m102673c, "created_at");
                int m41645e27 = C40824fF0.m41645e(m102673c, "expires_at");
                if (m102673c.moveToFirst()) {
                    if (m102673c.isNull(m41645e)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(m102673c.getLong(m41645e));
                    }
                    if (m102673c.isNull(m41645e2)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e2);
                    }
                    if (m102673c.isNull(m41645e3)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e3);
                    }
                    long j = m102673c.getLong(m41645e4);
                    if (m102673c.isNull(m41645e5)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(m102673c.getLong(m41645e5));
                    }
                    if (m102673c.isNull(m41645e6)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(m102673c.getLong(m41645e6));
                    }
                    if (m102673c.isNull(m41645e7)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e7);
                    }
                    if (m102673c.isNull(m41645e8)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e8);
                    }
                    if (m102673c.isNull(m41645e9)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e9);
                    }
                    if (m102673c.isNull(m41645e10)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e10);
                    }
                    if (m102673c.isNull(m41645e11)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e11);
                    }
                    if (m102673c.isNull(m41645e12)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e12);
                    }
                    if (m102673c.isNull(m41645e13)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(m41645e13);
                    }
                    if (m102673c.isNull(m41645e14)) {
                        string10 = null;
                    } else {
                        string10 = m102673c.getString(m41645e14);
                    }
                    RidePassViewStatus m113886h = BX4.m113886h(string10);
                    if (m102673c.isNull(m41645e15)) {
                        string11 = null;
                    } else {
                        string11 = m102673c.getString(m41645e15);
                    }
                    RidePassViewIneligibleReason m113887g = BX4.m113887g(string11);
                    if (m102673c.isNull(m41645e16)) {
                        i = m41645e17;
                        valueOf4 = null;
                    } else {
                        valueOf4 = Integer.valueOf(m102673c.getInt(m41645e16));
                        i = m41645e17;
                    }
                    if (m102673c.isNull(i)) {
                        i2 = m41645e18;
                        string12 = null;
                    } else {
                        string12 = m102673c.getString(i);
                        i2 = m41645e18;
                    }
                    if (m102673c.isNull(i2)) {
                        i3 = m41645e19;
                        string13 = null;
                    } else {
                        string13 = m102673c.getString(i2);
                        i3 = m41645e19;
                    }
                    if (m102673c.isNull(i3)) {
                        i4 = m41645e20;
                        string14 = null;
                    } else {
                        string14 = m102673c.getString(i3);
                        i4 = m41645e20;
                    }
                    if (m102673c.isNull(i4)) {
                        i5 = m41645e21;
                        string15 = null;
                    } else {
                        string15 = m102673c.getString(i4);
                        i5 = m41645e21;
                    }
                    if (m102673c.isNull(i5)) {
                        i6 = m41645e22;
                        string16 = null;
                    } else {
                        string16 = m102673c.getString(i5);
                        i6 = m41645e22;
                    }
                    if (m102673c.isNull(i6)) {
                        string17 = null;
                    } else {
                        string17 = m102673c.getString(i6);
                    }
                    List<String> m55267q = Converters.m55267q(string17);
                    if (m102673c.isNull(m41645e23)) {
                        i7 = m41645e24;
                        string18 = null;
                    } else {
                        string18 = m102673c.getString(m41645e23);
                        i7 = m41645e24;
                    }
                    if (m102673c.isNull(i7)) {
                        string19 = null;
                    } else {
                        string19 = m102673c.getString(i7);
                    }
                    RidePassSubscriptionPlanView m113889e = BX4.m113889e(string19);
                    if (m102673c.isNull(m41645e25)) {
                        string20 = null;
                    } else {
                        string20 = m102673c.getString(m41645e25);
                    }
                    RidePassUserSubscriptionView m113888f = BX4.m113888f(string20);
                    if (m102673c.isNull(m41645e26)) {
                        string21 = null;
                    } else {
                        string21 = m102673c.getString(m41645e26);
                    }
                    DateTime m55278f = Converters.m55278f(string21);
                    if (m102673c.isNull(m41645e27)) {
                        string22 = null;
                    } else {
                        string22 = m102673c.getString(m41645e27);
                    }
                    ridePassView = new RidePassView(valueOf, string, string2, j, valueOf2, valueOf3, string3, string4, string5, string6, string7, string8, string9, m113886h, m113887g, valueOf4, string12, string13, string14, string15, string16, m55267q, string18, m113889e, m113888f, m55278f, Converters.m55278f(string22));
                } else {
                    ridePassView = null;
                }
                return ridePassView;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f5864b.release();
        }
    }

    /* renamed from: DX4$b */
    /* loaded from: classes4.dex */
    public class C1512b extends AbstractC39268cf1<RidePassView> {
        public C1512b(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `ride_pass_view` (`id`,`link_code`,`user_ride_pass_id`,`price`,`price_tax`,`previous_price`,`currency`,`banner_image_url`,`banner_action`,`title`,`zendesk_article_id`,`confirmation_toast`,`label`,`status`,`ineligible_reason`,`remaining_device_transfer_count`,`cancel_article_id`,`footer`,`detail_body`,`detail_image_url`,`detail_action`,`detail_body_list`,`detail_footer`,`subscription_plan`,`user_subscription`,`created_at`,`expires_at`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, RidePassView ridePassView) {
            if (ridePassView.getId() == null) {
                interfaceC47496qV5.mo20954m1(1);
            } else {
                interfaceC47496qV5.mo20956S0(1, ridePassView.getId().longValue());
            }
            if (ridePassView.getLinkCode() == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, ridePassView.getLinkCode());
            }
            if (ridePassView.getUserRidePassId() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, ridePassView.getUserRidePassId());
            }
            interfaceC47496qV5.mo20956S0(4, ridePassView.getPrice());
            if (ridePassView.getPriceTax() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20956S0(5, ridePassView.getPriceTax().longValue());
            }
            if (ridePassView.getPreviousPrice() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20956S0(6, ridePassView.getPreviousPrice().longValue());
            }
            if (ridePassView.getCurrency() == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, ridePassView.getCurrency());
            }
            if (ridePassView.getBannerImageUrl() == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, ridePassView.getBannerImageUrl());
            }
            if (ridePassView.getBannerAction() == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, ridePassView.getBannerAction());
            }
            if (ridePassView.getTitle() == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, ridePassView.getTitle());
            }
            if (ridePassView.getZendeskArticleId() == null) {
                interfaceC47496qV5.mo20954m1(11);
            } else {
                interfaceC47496qV5.mo20958G0(11, ridePassView.getZendeskArticleId());
            }
            if (ridePassView.getConfirmationToast() == null) {
                interfaceC47496qV5.mo20954m1(12);
            } else {
                interfaceC47496qV5.mo20958G0(12, ridePassView.getConfirmationToast());
            }
            if (ridePassView.getLabel() == null) {
                interfaceC47496qV5.mo20954m1(13);
            } else {
                interfaceC47496qV5.mo20958G0(13, ridePassView.getLabel());
            }
            BX4 bx4 = BX4.f2484a;
            String m113892b = BX4.m113892b(ridePassView.getStatus());
            if (m113892b == null) {
                interfaceC47496qV5.mo20954m1(14);
            } else {
                interfaceC47496qV5.mo20958G0(14, m113892b);
            }
            String m113893a = BX4.m113893a(ridePassView.getIneligibleReason());
            if (m113893a == null) {
                interfaceC47496qV5.mo20954m1(15);
            } else {
                interfaceC47496qV5.mo20958G0(15, m113893a);
            }
            if (ridePassView.getRemainingDeviceTransferCount() == null) {
                interfaceC47496qV5.mo20954m1(16);
            } else {
                interfaceC47496qV5.mo20956S0(16, ridePassView.getRemainingDeviceTransferCount().intValue());
            }
            if (ridePassView.getCancelArticleId() == null) {
                interfaceC47496qV5.mo20954m1(17);
            } else {
                interfaceC47496qV5.mo20958G0(17, ridePassView.getCancelArticleId());
            }
            if (ridePassView.getFooter() == null) {
                interfaceC47496qV5.mo20954m1(18);
            } else {
                interfaceC47496qV5.mo20958G0(18, ridePassView.getFooter());
            }
            if (ridePassView.getDetailBody() == null) {
                interfaceC47496qV5.mo20954m1(19);
            } else {
                interfaceC47496qV5.mo20958G0(19, ridePassView.getDetailBody());
            }
            if (ridePassView.getDetailImageUrl() == null) {
                interfaceC47496qV5.mo20954m1(20);
            } else {
                interfaceC47496qV5.mo20958G0(20, ridePassView.getDetailImageUrl());
            }
            if (ridePassView.getDetailAction() == null) {
                interfaceC47496qV5.mo20954m1(21);
            } else {
                interfaceC47496qV5.mo20958G0(21, ridePassView.getDetailAction());
            }
            Converters converters = Converters.f66822a;
            String m55269o = Converters.m55269o(ridePassView.getDetailBodyList());
            if (m55269o == null) {
                interfaceC47496qV5.mo20954m1(22);
            } else {
                interfaceC47496qV5.mo20958G0(22, m55269o);
            }
            if (ridePassView.getDetailFooter() == null) {
                interfaceC47496qV5.mo20954m1(23);
            } else {
                interfaceC47496qV5.mo20958G0(23, ridePassView.getDetailFooter());
            }
            String m113891c = BX4.m113891c(ridePassView.getSubscriptionPlan());
            if (m113891c == null) {
                interfaceC47496qV5.mo20954m1(24);
            } else {
                interfaceC47496qV5.mo20958G0(24, m113891c);
            }
            String m113890d = BX4.m113890d(ridePassView.getUserSubscription());
            if (m113890d == null) {
                interfaceC47496qV5.mo20954m1(25);
            } else {
                interfaceC47496qV5.mo20958G0(25, m113890d);
            }
            String m55279e = Converters.m55279e(ridePassView.getCreatedAt());
            if (m55279e == null) {
                interfaceC47496qV5.mo20954m1(26);
            } else {
                interfaceC47496qV5.mo20958G0(26, m55279e);
            }
            String m55279e2 = Converters.m55279e(ridePassView.getExpiresAt());
            if (m55279e2 == null) {
                interfaceC47496qV5.mo20954m1(27);
            } else {
                interfaceC47496qV5.mo20958G0(27, m55279e2);
            }
        }
    }

    /* renamed from: DX4$c */
    /* loaded from: classes4.dex */
    public class C1513c extends AbstractC41861gz5 {
        public C1513c(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE ride_pass_view SET status = 'active' WHERE link_code = ?";
        }
    }

    /* renamed from: DX4$d */
    /* loaded from: classes4.dex */
    public class C1514d extends AbstractC41861gz5 {
        public C1514d(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM ride_pass_view";
        }
    }

    /* renamed from: DX4$e */
    /* loaded from: classes4.dex */
    public class CallableC1515e implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f5869b;

        public CallableC1515e(List list) {
            this.f5869b = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            DX4.this.f5860a.m108730c();
            try {
                DX4.this.f5861b.m61089j(this.f5869b);
                DX4.this.f5860a.m108734A();
                DX4.this.f5860a.m108728g();
                return null;
            } catch (Throwable th) {
                DX4.this.f5860a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: DX4$f */
    /* loaded from: classes4.dex */
    public class CallableC1516f implements Callable<Void> {
        public CallableC1516f() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = DX4.this.f5863d.m37254b();
            DX4.this.f5860a.m108730c();
            try {
                m37254b.mo17482M();
                DX4.this.f5860a.m108734A();
                DX4.this.f5860a.m108728g();
                DX4.this.f5863d.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                DX4.this.f5860a.m108728g();
                DX4.this.f5863d.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: DX4$g */
    /* loaded from: classes4.dex */
    public class CallableC1517g implements Callable<Void> {
        public CallableC1517g() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = DX4.this.f5863d.m37254b();
            DX4.this.f5860a.m108730c();
            try {
                m37254b.mo17482M();
                DX4.this.f5860a.m108734A();
                DX4.this.f5860a.m108728g();
                DX4.this.f5863d.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                DX4.this.f5860a.m108728g();
                DX4.this.f5863d.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: DX4$h */
    /* loaded from: classes4.dex */
    public class CallableC1518h implements Callable<List<RidePassView>> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f5873b;

        public CallableC1518h(C33265Hb5 c33265Hb5) {
            this.f5873b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<RidePassView> call() throws Exception {
            Long valueOf;
            String string;
            String string2;
            Long valueOf2;
            Long valueOf3;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            String string10;
            String string11;
            Integer valueOf4;
            String string12;
            String string13;
            String string14;
            String string15;
            String string16;
            String string17;
            String string18;
            String string19;
            String string20;
            String string21;
            String string22;
            Cursor m102673c = IF0.m102673c(DX4.this.f5860a, this.f5873b, false, null);
            try {
                ArrayList arrayList = new ArrayList(m102673c.getCount());
                while (m102673c.moveToNext()) {
                    if (m102673c.isNull(0)) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(m102673c.getLong(0));
                    }
                    if (m102673c.isNull(1)) {
                        string = null;
                    } else {
                        string = m102673c.getString(1);
                    }
                    if (m102673c.isNull(2)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(2);
                    }
                    long j = m102673c.getLong(3);
                    if (m102673c.isNull(4)) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(m102673c.getLong(4));
                    }
                    if (m102673c.isNull(5)) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(m102673c.getLong(5));
                    }
                    if (m102673c.isNull(6)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(6);
                    }
                    if (m102673c.isNull(7)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(7);
                    }
                    if (m102673c.isNull(8)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(8);
                    }
                    if (m102673c.isNull(9)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(9);
                    }
                    if (m102673c.isNull(10)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(10);
                    }
                    if (m102673c.isNull(11)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(11);
                    }
                    if (m102673c.isNull(12)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(12);
                    }
                    if (m102673c.isNull(13)) {
                        string10 = null;
                    } else {
                        string10 = m102673c.getString(13);
                    }
                    RidePassViewStatus m113886h = BX4.m113886h(string10);
                    if (m102673c.isNull(14)) {
                        string11 = null;
                    } else {
                        string11 = m102673c.getString(14);
                    }
                    RidePassViewIneligibleReason m113887g = BX4.m113887g(string11);
                    if (m102673c.isNull(15)) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Integer.valueOf(m102673c.getInt(15));
                    }
                    if (m102673c.isNull(16)) {
                        string12 = null;
                    } else {
                        string12 = m102673c.getString(16);
                    }
                    if (m102673c.isNull(17)) {
                        string13 = null;
                    } else {
                        string13 = m102673c.getString(17);
                    }
                    if (m102673c.isNull(18)) {
                        string14 = null;
                    } else {
                        string14 = m102673c.getString(18);
                    }
                    if (m102673c.isNull(19)) {
                        string15 = null;
                    } else {
                        string15 = m102673c.getString(19);
                    }
                    if (m102673c.isNull(20)) {
                        string16 = null;
                    } else {
                        string16 = m102673c.getString(20);
                    }
                    if (m102673c.isNull(21)) {
                        string17 = null;
                    } else {
                        string17 = m102673c.getString(21);
                    }
                    List<String> m55267q = Converters.m55267q(string17);
                    if (m102673c.isNull(22)) {
                        string18 = null;
                    } else {
                        string18 = m102673c.getString(22);
                    }
                    if (m102673c.isNull(23)) {
                        string19 = null;
                    } else {
                        string19 = m102673c.getString(23);
                    }
                    RidePassSubscriptionPlanView m113889e = BX4.m113889e(string19);
                    if (m102673c.isNull(24)) {
                        string20 = null;
                    } else {
                        string20 = m102673c.getString(24);
                    }
                    RidePassUserSubscriptionView m113888f = BX4.m113888f(string20);
                    if (m102673c.isNull(25)) {
                        string21 = null;
                    } else {
                        string21 = m102673c.getString(25);
                    }
                    DateTime m55278f = Converters.m55278f(string21);
                    if (m102673c.isNull(26)) {
                        string22 = null;
                    } else {
                        string22 = m102673c.getString(26);
                    }
                    arrayList.add(new RidePassView(valueOf, string, string2, j, valueOf2, valueOf3, string3, string4, string5, string6, string7, string8, string9, m113886h, m113887g, valueOf4, string12, string13, string14, string15, string16, m55267q, string18, m113889e, m113888f, m55278f, Converters.m55278f(string22)));
                }
                return arrayList;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f5873b.release();
        }
    }

    public DX4(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f5860a = abstractC32563Eb5;
        this.f5861b = new C1512b(abstractC32563Eb5);
        this.f5862c = new C1513c(abstractC32563Eb5);
        this.f5863d = new C1514d(abstractC32563Eb5);
    }

    /* renamed from: i */
    public static List<Class<?>> m110272i() {
        return Collections.emptyList();
    }

    @Override // p000.CX4
    /* renamed from: a */
    public AbstractC23461c mo110280a() {
        return AbstractC23461c.m33078H(new CallableC1517g());
    }

    @Override // p000.CX4
    /* renamed from: b */
    public AbstractC23461c mo110279b() {
        return AbstractC23461c.m33078H(new CallableC1516f());
    }

    @Override // p000.CX4
    /* renamed from: c */
    public Observable<List<RidePassView>> mo110278c() {
        return C37504Ze5.m72808c(this.f5860a, false, new String[]{"ride_pass_view"}, new CallableC1518h(C33265Hb5.m103680c("SELECT `ride_pass_view`.`id` AS `id`, `ride_pass_view`.`link_code` AS `link_code`, `ride_pass_view`.`user_ride_pass_id` AS `user_ride_pass_id`, `ride_pass_view`.`price` AS `price`, `ride_pass_view`.`price_tax` AS `price_tax`, `ride_pass_view`.`previous_price` AS `previous_price`, `ride_pass_view`.`currency` AS `currency`, `ride_pass_view`.`banner_image_url` AS `banner_image_url`, `ride_pass_view`.`banner_action` AS `banner_action`, `ride_pass_view`.`title` AS `title`, `ride_pass_view`.`zendesk_article_id` AS `zendesk_article_id`, `ride_pass_view`.`confirmation_toast` AS `confirmation_toast`, `ride_pass_view`.`label` AS `label`, `ride_pass_view`.`status` AS `status`, `ride_pass_view`.`ineligible_reason` AS `ineligible_reason`, `ride_pass_view`.`remaining_device_transfer_count` AS `remaining_device_transfer_count`, `ride_pass_view`.`cancel_article_id` AS `cancel_article_id`, `ride_pass_view`.`footer` AS `footer`, `ride_pass_view`.`detail_body` AS `detail_body`, `ride_pass_view`.`detail_image_url` AS `detail_image_url`, `ride_pass_view`.`detail_action` AS `detail_action`, `ride_pass_view`.`detail_body_list` AS `detail_body_list`, `ride_pass_view`.`detail_footer` AS `detail_footer`, `ride_pass_view`.`subscription_plan` AS `subscription_plan`, `ride_pass_view`.`user_subscription` AS `user_subscription`, `ride_pass_view`.`created_at` AS `created_at`, `ride_pass_view`.`expires_at` AS `expires_at` FROM ride_pass_view", 0)));
    }

    @Override // p000.CX4
    /* renamed from: d */
    public AbstractC23461c mo110277d(List<RidePassView> list) {
        return AbstractC23461c.m33078H(new CallableC1515e(list));
    }

    @Override // p000.CX4
    /* renamed from: e */
    public Observable<RidePassView> mo110276e(String str) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM ride_pass_view WHERE link_code = ?", 1);
        if (str == null) {
            m103680c.mo20954m1(1);
        } else {
            m103680c.mo20958G0(1, str);
        }
        return C37504Ze5.m72808c(this.f5860a, false, new String[]{"ride_pass_view"}, new CallableC1511a(m103680c));
    }
}
