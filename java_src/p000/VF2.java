package p000;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Size;
import lib.android.paypal.com.magnessdk.InvalidInputException;
/* renamed from: VF2 */
/* loaded from: classes8.dex */
public class VF2 {

    /* renamed from: a */
    public int f38783a;

    /* renamed from: b */
    public String f38784b;

    /* renamed from: c */
    public String f38785c;

    /* renamed from: d */
    public Context f38786d;

    /* renamed from: e */
    public SF2 f38787e;

    /* renamed from: f */
    public boolean f38788f;

    /* renamed from: g */
    public boolean f38789g;

    /* renamed from: h */
    public boolean f38790h;

    /* renamed from: i */
    public EnumC51736xf1 f38791i;

    /* renamed from: VF2$b */
    /* loaded from: classes8.dex */
    public static class C8588b {

        /* renamed from: b */
        public String f38793b;

        /* renamed from: c */
        public String f38794c;

        /* renamed from: e */
        public boolean f38796e;

        /* renamed from: g */
        public SF2 f38798g;

        /* renamed from: h */
        public Context f38799h;

        /* renamed from: a */
        public int f38792a = -1;

        /* renamed from: d */
        public boolean f38795d = false;

        /* renamed from: f */
        public boolean f38797f = false;

        /* renamed from: i */
        public EnumC51736xf1 f38800i = EnumC51736xf1.LIVE;

        public C8588b(@NonNull Context context) {
            this.f38799h = context;
        }

        /* renamed from: j */
        public VF2 m80145j() {
            return new VF2(this);
        }

        @NonNull
        /* renamed from: k */
        public C8588b m80144k(boolean z) {
            this.f38797f = z;
            return this;
        }

        @NonNull
        /* renamed from: l */
        public C8588b m80143l(@Size(max = 36) @NonNull String str) throws InvalidInputException {
            if (str.length() <= 36) {
                this.f38793b = str;
                return this;
            }
            throw new InvalidInputException(UL6.APPGUID_EXCEPTION_MESSAGE.toString());
        }

        @NonNull
        /* renamed from: m */
        public C8588b m80142m(@NonNull EnumC51736xf1 enumC51736xf1) {
            this.f38800i = enumC51736xf1;
            return this;
        }

        @NonNull
        /* renamed from: n */
        public C8588b m80141n(WF2 wf2) {
            this.f38792a = wf2.m78677a();
            return this;
        }
    }

    public VF2(C8588b c8588b) {
        this.f38783a = -1;
        this.f38789g = false;
        this.f38790h = false;
        this.f38783a = c8588b.f38792a;
        this.f38784b = c8588b.f38793b;
        this.f38785c = c8588b.f38794c;
        this.f38789g = c8588b.f38795d;
        this.f38790h = c8588b.f38797f;
        this.f38786d = c8588b.f38799h;
        this.f38787e = c8588b.f38798g;
        this.f38788f = c8588b.f38796e;
        this.f38791i = c8588b.f38800i;
    }

    /* renamed from: a */
    public String m80163a() {
        return this.f38784b;
    }

    /* renamed from: b */
    public Context m80162b() {
        return this.f38786d;
    }

    /* renamed from: c */
    public EnumC51736xf1 m80161c() {
        return this.f38791i;
    }

    /* renamed from: d */
    public SF2 m80160d() {
        return this.f38787e;
    }

    /* renamed from: e */
    public int m80159e() {
        return this.f38783a;
    }

    /* renamed from: f */
    public String m80158f() {
        return this.f38785c;
    }

    /* renamed from: g */
    public boolean m80157g() {
        return this.f38790h;
    }

    /* renamed from: h */
    public boolean m80156h() {
        return this.f38789g;
    }

    /* renamed from: i */
    public boolean m80155i() {
        return this.f38788f;
    }
}
