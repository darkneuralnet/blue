package p000;

import android.database.Cursor;
import co.bird.android.model.persistence.ComplaintResolution;
import co.bird.android.persistence.common.impl.Converters;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: Nq0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34799Nq0 extends AbstractC34565Mq0 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f25238a;

    /* renamed from: b */
    public final AbstractC39268cf1<ComplaintResolution> f25239b;

    /* renamed from: c */
    public final AbstractC41861gz5 f25240c;

    /* renamed from: d */
    public final AbstractC41861gz5 f25241d;

    /* renamed from: e */
    public final AbstractC41861gz5 f25242e;

    /* renamed from: f */
    public final AbstractC41861gz5 f25243f;

    /* renamed from: g */
    public final AbstractC41861gz5 f25244g;

    /* renamed from: h */
    public final AbstractC41861gz5 f25245h;

    /* renamed from: i */
    public final AbstractC41861gz5 f25246i;

    /* renamed from: j */
    public final AbstractC41861gz5 f25247j;

    /* renamed from: Nq0$a */
    /* loaded from: classes4.dex */
    public class CallableC5703a implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ ComplaintResolution f25248b;

        public CallableC5703a(ComplaintResolution complaintResolution) {
            this.f25248b = complaintResolution;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C34799Nq0.this.f25238a.m108730c();
            try {
                C34799Nq0.this.f25239b.m61088k(this.f25248b);
                C34799Nq0.this.f25238a.m108734A();
                C34799Nq0.this.f25238a.m108728g();
                return null;
            } catch (Throwable th) {
                C34799Nq0.this.f25238a.m108728g();
                throw th;
            }
        }
    }

    /* renamed from: Nq0$b */
    /* loaded from: classes4.dex */
    public class CallableC5704b implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ String f25250b;

        /* renamed from: c */
        public final /* synthetic */ String f25251c;

        /* renamed from: d */
        public final /* synthetic */ int f25252d;

        public CallableC5704b(String str, String str2, int i) {
            this.f25250b = str;
            this.f25251c = str2;
            this.f25252d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C34799Nq0.this.f25240c.m37254b();
            String str = this.f25250b;
            if (str == null) {
                m37254b.mo20954m1(1);
            } else {
                m37254b.mo20958G0(1, str);
            }
            String str2 = this.f25251c;
            if (str2 == null) {
                m37254b.mo20954m1(2);
            } else {
                m37254b.mo20958G0(2, str2);
            }
            m37254b.mo20956S0(3, this.f25252d);
            C34799Nq0.this.f25238a.m108730c();
            try {
                m37254b.mo17482M();
                C34799Nq0.this.f25238a.m108734A();
                C34799Nq0.this.f25238a.m108728g();
                C34799Nq0.this.f25240c.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C34799Nq0.this.f25238a.m108728g();
                C34799Nq0.this.f25240c.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Nq0$c */
    /* loaded from: classes4.dex */
    public class CallableC5705c implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ String f25254b;

        /* renamed from: c */
        public final /* synthetic */ String f25255c;

        /* renamed from: d */
        public final /* synthetic */ int f25256d;

        public CallableC5705c(String str, String str2, int i) {
            this.f25254b = str;
            this.f25255c = str2;
            this.f25256d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C34799Nq0.this.f25241d.m37254b();
            String str = this.f25254b;
            if (str == null) {
                m37254b.mo20954m1(1);
            } else {
                m37254b.mo20958G0(1, str);
            }
            String str2 = this.f25255c;
            if (str2 == null) {
                m37254b.mo20954m1(2);
            } else {
                m37254b.mo20958G0(2, str2);
            }
            m37254b.mo20956S0(3, this.f25256d);
            C34799Nq0.this.f25238a.m108730c();
            try {
                m37254b.mo17482M();
                C34799Nq0.this.f25238a.m108734A();
                C34799Nq0.this.f25238a.m108728g();
                C34799Nq0.this.f25241d.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C34799Nq0.this.f25238a.m108728g();
                C34799Nq0.this.f25241d.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Nq0$d */
    /* loaded from: classes4.dex */
    public class CallableC5706d implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f25258b;

        /* renamed from: c */
        public final /* synthetic */ int f25259c;

        public CallableC5706d(List list, int i) {
            this.f25258b = list;
            this.f25259c = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C34799Nq0.this.f25242e.m37254b();
            Converters converters = Converters.f66822a;
            String m55269o = Converters.m55269o(this.f25258b);
            if (m55269o == null) {
                m37254b.mo20954m1(1);
            } else {
                m37254b.mo20958G0(1, m55269o);
            }
            m37254b.mo20956S0(2, this.f25259c);
            C34799Nq0.this.f25238a.m108730c();
            try {
                m37254b.mo17482M();
                C34799Nq0.this.f25238a.m108734A();
                C34799Nq0.this.f25238a.m108728g();
                C34799Nq0.this.f25242e.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C34799Nq0.this.f25238a.m108728g();
                C34799Nq0.this.f25242e.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Nq0$e */
    /* loaded from: classes4.dex */
    public class CallableC5707e implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ int f25261b;

        public CallableC5707e(int i) {
            this.f25261b = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C34799Nq0.this.f25243f.m37254b();
            m37254b.mo20956S0(1, this.f25261b);
            C34799Nq0.this.f25238a.m108730c();
            try {
                m37254b.mo17482M();
                C34799Nq0.this.f25238a.m108734A();
                C34799Nq0.this.f25238a.m108728g();
                C34799Nq0.this.f25243f.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C34799Nq0.this.f25238a.m108728g();
                C34799Nq0.this.f25243f.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Nq0$f */
    /* loaded from: classes4.dex */
    public class CallableC5708f implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ String f25263b;

        /* renamed from: c */
        public final /* synthetic */ int f25264c;

        public CallableC5708f(String str, int i) {
            this.f25263b = str;
            this.f25264c = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C34799Nq0.this.f25244g.m37254b();
            String str = this.f25263b;
            if (str == null) {
                m37254b.mo20954m1(1);
            } else {
                m37254b.mo20958G0(1, str);
            }
            m37254b.mo20956S0(2, this.f25264c);
            C34799Nq0.this.f25238a.m108730c();
            try {
                m37254b.mo17482M();
                C34799Nq0.this.f25238a.m108734A();
                C34799Nq0.this.f25238a.m108728g();
                C34799Nq0.this.f25244g.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C34799Nq0.this.f25238a.m108728g();
                C34799Nq0.this.f25244g.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Nq0$g */
    /* loaded from: classes4.dex */
    public class CallableC5709g implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ String f25266b;

        /* renamed from: c */
        public final /* synthetic */ int f25267c;

        public CallableC5709g(String str, int i) {
            this.f25266b = str;
            this.f25267c = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C34799Nq0.this.f25245h.m37254b();
            String str = this.f25266b;
            if (str == null) {
                m37254b.mo20954m1(1);
            } else {
                m37254b.mo20958G0(1, str);
            }
            m37254b.mo20956S0(2, this.f25267c);
            C34799Nq0.this.f25238a.m108730c();
            try {
                m37254b.mo17482M();
                C34799Nq0.this.f25238a.m108734A();
                C34799Nq0.this.f25238a.m108728g();
                C34799Nq0.this.f25245h.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C34799Nq0.this.f25238a.m108728g();
                C34799Nq0.this.f25245h.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Nq0$h */
    /* loaded from: classes4.dex */
    public class CallableC5710h implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ List f25269b;

        /* renamed from: c */
        public final /* synthetic */ int f25270c;

        public CallableC5710h(List list, int i) {
            this.f25269b = list;
            this.f25270c = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C34799Nq0.this.f25246i.m37254b();
            Converters converters = Converters.f66822a;
            String m55269o = Converters.m55269o(this.f25269b);
            if (m55269o == null) {
                m37254b.mo20954m1(1);
            } else {
                m37254b.mo20958G0(1, m55269o);
            }
            m37254b.mo20956S0(2, this.f25270c);
            C34799Nq0.this.f25238a.m108730c();
            try {
                m37254b.mo17482M();
                C34799Nq0.this.f25238a.m108734A();
                C34799Nq0.this.f25238a.m108728g();
                C34799Nq0.this.f25246i.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C34799Nq0.this.f25238a.m108728g();
                C34799Nq0.this.f25246i.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Nq0$i */
    /* loaded from: classes4.dex */
    public class CallableC5711i implements Callable<Void> {
        public CallableC5711i() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            InterfaceC47496qV5 m37254b = C34799Nq0.this.f25247j.m37254b();
            C34799Nq0.this.f25238a.m108730c();
            try {
                m37254b.mo17482M();
                C34799Nq0.this.f25238a.m108734A();
                C34799Nq0.this.f25238a.m108728g();
                C34799Nq0.this.f25247j.m37249h(m37254b);
                return null;
            } catch (Throwable th) {
                C34799Nq0.this.f25238a.m108728g();
                C34799Nq0.this.f25247j.m37249h(m37254b);
                throw th;
            }
        }
    }

    /* renamed from: Nq0$j */
    /* loaded from: classes4.dex */
    public class CallableC5712j implements Callable<ComplaintResolution> {

        /* renamed from: b */
        public final /* synthetic */ C33265Hb5 f25273b;

        public CallableC5712j(C33265Hb5 c33265Hb5) {
            this.f25273b = c33265Hb5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ComplaintResolution call() throws Exception {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            boolean z = false;
            ComplaintResolution complaintResolution = null;
            String string10 = null;
            Cursor m102673c = IF0.m102673c(C34799Nq0.this.f25238a, this.f25273b, false, null);
            try {
                int m41645e = C40824fF0.m41645e(m102673c, "complaint_hash");
                int m41645e2 = C40824fF0.m41645e(m102673c, "complaint_ids");
                int m41645e3 = C40824fF0.m41645e(m102673c, "situation");
                int m41645e4 = C40824fF0.m41645e(m102673c, "before_photo_asset_id");
                int m41645e5 = C40824fF0.m41645e(m102673c, "before_photo_url");
                int m41645e6 = C40824fF0.m41645e(m102673c, "after_photo_asset_id");
                int m41645e7 = C40824fF0.m41645e(m102673c, "after_photo_url");
                int m41645e8 = C40824fF0.m41645e(m102673c, "issues");
                int m41645e9 = C40824fF0.m41645e(m102673c, "action_taken");
                int m41645e10 = C40824fF0.m41645e(m102673c, "vehicle_ids_involved");
                int m41645e11 = C40824fF0.m41645e(m102673c, "additional_notes");
                int m41645e12 = C40824fF0.m41645e(m102673c, "submitted");
                if (m102673c.moveToFirst()) {
                    int i = m102673c.getInt(m41645e);
                    if (m102673c.isNull(m41645e2)) {
                        string = null;
                    } else {
                        string = m102673c.getString(m41645e2);
                    }
                    List<String> m55267q = Converters.m55267q(string);
                    if (m102673c.isNull(m41645e3)) {
                        string2 = null;
                    } else {
                        string2 = m102673c.getString(m41645e3);
                    }
                    if (m102673c.isNull(m41645e4)) {
                        string3 = null;
                    } else {
                        string3 = m102673c.getString(m41645e4);
                    }
                    if (m102673c.isNull(m41645e5)) {
                        string4 = null;
                    } else {
                        string4 = m102673c.getString(m41645e5);
                    }
                    if (m102673c.isNull(m41645e6)) {
                        string5 = null;
                    } else {
                        string5 = m102673c.getString(m41645e6);
                    }
                    if (m102673c.isNull(m41645e7)) {
                        string6 = null;
                    } else {
                        string6 = m102673c.getString(m41645e7);
                    }
                    if (m102673c.isNull(m41645e8)) {
                        string7 = null;
                    } else {
                        string7 = m102673c.getString(m41645e8);
                    }
                    List<String> m55267q2 = Converters.m55267q(string7);
                    if (m102673c.isNull(m41645e9)) {
                        string8 = null;
                    } else {
                        string8 = m102673c.getString(m41645e9);
                    }
                    if (m102673c.isNull(m41645e10)) {
                        string9 = null;
                    } else {
                        string9 = m102673c.getString(m41645e10);
                    }
                    List<String> m55267q3 = Converters.m55267q(string9);
                    if (!m102673c.isNull(m41645e11)) {
                        string10 = m102673c.getString(m41645e11);
                    }
                    String str = string10;
                    if (m102673c.getInt(m41645e12) != 0) {
                        z = true;
                    }
                    complaintResolution = new ComplaintResolution(i, m55267q, string2, string3, string4, string5, string6, m55267q2, string8, m55267q3, str, z);
                }
                return complaintResolution;
            } finally {
                m102673c.close();
            }
        }

        public void finalize() {
            this.f25273b.release();
        }
    }

    /* renamed from: Nq0$k */
    /* loaded from: classes4.dex */
    public class C5713k extends AbstractC39268cf1<ComplaintResolution> {
        public C5713k(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "INSERT OR REPLACE INTO `complaint_resolution` (`complaint_hash`,`complaint_ids`,`situation`,`before_photo_asset_id`,`before_photo_url`,`after_photo_asset_id`,`after_photo_url`,`issues`,`action_taken`,`vehicle_ids_involved`,`additional_notes`,`submitted`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p000.AbstractC39268cf1
        /* renamed from: p */
        public void mo3701i(InterfaceC47496qV5 interfaceC47496qV5, ComplaintResolution complaintResolution) {
            interfaceC47496qV5.mo20956S0(1, complaintResolution.getComplaintHash());
            Converters converters = Converters.f66822a;
            String m55269o = Converters.m55269o(complaintResolution.getComplaintIds());
            if (m55269o == null) {
                interfaceC47496qV5.mo20954m1(2);
            } else {
                interfaceC47496qV5.mo20958G0(2, m55269o);
            }
            if (complaintResolution.getSituation() == null) {
                interfaceC47496qV5.mo20954m1(3);
            } else {
                interfaceC47496qV5.mo20958G0(3, complaintResolution.getSituation());
            }
            if (complaintResolution.getBeforePhotoAssetId() == null) {
                interfaceC47496qV5.mo20954m1(4);
            } else {
                interfaceC47496qV5.mo20958G0(4, complaintResolution.getBeforePhotoAssetId());
            }
            if (complaintResolution.getBeforePhotoUrl() == null) {
                interfaceC47496qV5.mo20954m1(5);
            } else {
                interfaceC47496qV5.mo20958G0(5, complaintResolution.getBeforePhotoUrl());
            }
            if (complaintResolution.getAfterPhotoAssetId() == null) {
                interfaceC47496qV5.mo20954m1(6);
            } else {
                interfaceC47496qV5.mo20958G0(6, complaintResolution.getAfterPhotoAssetId());
            }
            if (complaintResolution.getAfterPhotoUrl() == null) {
                interfaceC47496qV5.mo20954m1(7);
            } else {
                interfaceC47496qV5.mo20958G0(7, complaintResolution.getAfterPhotoUrl());
            }
            String m55269o2 = Converters.m55269o(complaintResolution.getIssues());
            if (m55269o2 == null) {
                interfaceC47496qV5.mo20954m1(8);
            } else {
                interfaceC47496qV5.mo20958G0(8, m55269o2);
            }
            if (complaintResolution.getActionTaken() == null) {
                interfaceC47496qV5.mo20954m1(9);
            } else {
                interfaceC47496qV5.mo20958G0(9, complaintResolution.getActionTaken());
            }
            String m55269o3 = Converters.m55269o(complaintResolution.getVehicleIdsInvolved());
            if (m55269o3 == null) {
                interfaceC47496qV5.mo20954m1(10);
            } else {
                interfaceC47496qV5.mo20958G0(10, m55269o3);
            }
            if (complaintResolution.getAdditionalNotes() == null) {
                interfaceC47496qV5.mo20954m1(11);
            } else {
                interfaceC47496qV5.mo20958G0(11, complaintResolution.getAdditionalNotes());
            }
            interfaceC47496qV5.mo20956S0(12, complaintResolution.getSubmitted() ? 1L : 0L);
        }
    }

    /* renamed from: Nq0$l */
    /* loaded from: classes4.dex */
    public class C5714l extends AbstractC41861gz5 {
        public C5714l(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE complaint_resolution SET before_photo_url = ?, before_photo_asset_id = ? WHERE complaint_hash = ?";
        }
    }

    /* renamed from: Nq0$m */
    /* loaded from: classes4.dex */
    public class C5715m extends AbstractC41861gz5 {
        public C5715m(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE complaint_resolution SET after_photo_url = ?, after_photo_asset_id = ?  WHERE complaint_hash = ?";
        }
    }

    /* renamed from: Nq0$n */
    /* loaded from: classes4.dex */
    public class C5716n extends AbstractC41861gz5 {
        public C5716n(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE complaint_resolution SET issues = ? WHERE complaint_hash = ?";
        }
    }

    /* renamed from: Nq0$o */
    /* loaded from: classes4.dex */
    public class C5717o extends AbstractC41861gz5 {
        public C5717o(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE complaint_resolution SET submitted = 1 WHERE complaint_hash = ?";
        }
    }

    /* renamed from: Nq0$p */
    /* loaded from: classes4.dex */
    public class C5718p extends AbstractC41861gz5 {
        public C5718p(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE complaint_resolution SET action_taken = ? WHERE complaint_hash = ?";
        }
    }

    /* renamed from: Nq0$q */
    /* loaded from: classes4.dex */
    public class C5719q extends AbstractC41861gz5 {
        public C5719q(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE complaint_resolution SET additional_notes = ? WHERE complaint_hash = ?";
        }
    }

    /* renamed from: Nq0$r */
    /* loaded from: classes4.dex */
    public class C5720r extends AbstractC41861gz5 {
        public C5720r(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "UPDATE complaint_resolution SET vehicle_ids_involved = ? WHERE complaint_hash = ?";
        }
    }

    /* renamed from: Nq0$s */
    /* loaded from: classes4.dex */
    public class C5721s extends AbstractC41861gz5 {
        public C5721s(AbstractC32563Eb5 abstractC32563Eb5) {
            super(abstractC32563Eb5);
        }

        @Override // p000.AbstractC41861gz5
        /* renamed from: e */
        public String mo3699e() {
            return "DELETE FROM complaint_resolution";
        }
    }

    public C34799Nq0(AbstractC32563Eb5 abstractC32563Eb5) {
        this.f25238a = abstractC32563Eb5;
        this.f25239b = new C5713k(abstractC32563Eb5);
        this.f25240c = new C5714l(abstractC32563Eb5);
        this.f25241d = new C5715m(abstractC32563Eb5);
        this.f25242e = new C5716n(abstractC32563Eb5);
        this.f25243f = new C5717o(abstractC32563Eb5);
        this.f25244g = new C5718p(abstractC32563Eb5);
        this.f25245h = new C5719q(abstractC32563Eb5);
        this.f25246i = new C5720r(abstractC32563Eb5);
        this.f25247j = new C5721s(abstractC32563Eb5);
    }

    /* renamed from: u */
    public static List<Class<?>> m93319u() {
        return Collections.emptyList();
    }

    @Override // p000.AbstractC34565Mq0
    /* renamed from: a */
    public AbstractC23461c mo93339a() {
        return AbstractC23461c.m33078H(new CallableC5711i());
    }

    @Override // p000.AbstractC34565Mq0
    /* renamed from: b */
    public AbstractC24507p<ComplaintResolution> mo93338b(int i) {
        C33265Hb5 m103680c = C33265Hb5.m103680c("SELECT * FROM complaint_resolution WHERE complaint_hash = ? LIMIT 1", 1);
        m103680c.mo20956S0(1, i);
        return AbstractC24507p.m32071D(new CallableC5712j(m103680c));
    }

    @Override // p000.AbstractC34565Mq0
    /* renamed from: c */
    public AbstractC23461c mo93337c(ComplaintResolution complaintResolution) {
        return AbstractC23461c.m33078H(new CallableC5703a(complaintResolution));
    }

    @Override // p000.AbstractC34565Mq0
    /* renamed from: d */
    public AbstractC23461c mo93336d(int i) {
        return AbstractC23461c.m33078H(new CallableC5707e(i));
    }

    @Override // p000.AbstractC34565Mq0
    /* renamed from: e */
    public AbstractC23461c mo93335e(int i, String str) {
        return AbstractC23461c.m33078H(new CallableC5708f(str, i));
    }

    @Override // p000.AbstractC34565Mq0
    /* renamed from: f */
    public AbstractC23461c mo93334f(int i, String str, String str2) {
        return AbstractC23461c.m33078H(new CallableC5705c(str, str2, i));
    }

    @Override // p000.AbstractC34565Mq0
    /* renamed from: g */
    public AbstractC23461c mo93333g(int i, String str, String str2) {
        return AbstractC23461c.m33078H(new CallableC5704b(str, str2, i));
    }

    @Override // p000.AbstractC34565Mq0
    /* renamed from: h */
    public AbstractC23461c mo93332h(int i, List<String> list) {
        return AbstractC23461c.m33078H(new CallableC5706d(list, i));
    }

    @Override // p000.AbstractC34565Mq0
    /* renamed from: i */
    public AbstractC23461c mo93331i(int i, String str) {
        return AbstractC23461c.m33078H(new CallableC5709g(str, i));
    }

    @Override // p000.AbstractC34565Mq0
    /* renamed from: j */
    public AbstractC23461c mo93330j(int i, List<String> list) {
        return AbstractC23461c.m33078H(new CallableC5710h(list, i));
    }
}
