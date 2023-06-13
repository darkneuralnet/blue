package co.bird.android.feature.birdratinghistory;

import android.app.Activity;
import co.bird.android.feature.birdratinghistory.InterfaceC14583a;
/* renamed from: co.bird.android.feature.birdratinghistory.b */
/* loaded from: classes3.dex */
public final class C14585b {

    /* renamed from: co.bird.android.feature.birdratinghistory.b$a */
    /* loaded from: classes3.dex */
    public static final class C14586a implements InterfaceC14583a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f63377a;

        /* renamed from: b */
        public final String f63378b;

        /* renamed from: c */
        public final C14586a f63379c;

        @Override // co.bird.android.feature.birdratinghistory.InterfaceC14583a
        /* renamed from: a */
        public void mo58674a(BirdRatingHistoryActivity birdRatingHistoryActivity) {
            m58672c(birdRatingHistoryActivity);
        }

        /* renamed from: b */
        public final C4078JR m58673b() {
            return new C4078JR((InterfaceC46473om3) C51679xZ3.m5003d(this.f63377a.mo27584F0()), new C0091AR(), this.f63378b);
        }

        /* renamed from: c */
        public final BirdRatingHistoryActivity m58672c(BirdRatingHistoryActivity birdRatingHistoryActivity) {
            C4650Ky.m98043b(birdRatingHistoryActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63377a.mo27461w2()));
            C4650Ky.m98042c(birdRatingHistoryActivity, (C22454gl) C51679xZ3.m5003d(this.f63377a.mo27479r()));
            C4650Ky.m98041d(birdRatingHistoryActivity, (C36207Tq4) C51679xZ3.m5003d(this.f63377a.mo27595B1()));
            C29877wR.m6840c(birdRatingHistoryActivity, m58673b());
            C29877wR.m6842a(birdRatingHistoryActivity, new C30169xR());
            return birdRatingHistoryActivity;
        }

        public C14586a(InterfaceC44393lG2 interfaceC44393lG2, Activity activity, String str) {
            this.f63379c = this;
            this.f63377a = interfaceC44393lG2;
            this.f63378b = str;
        }
    }

    /* renamed from: co.bird.android.feature.birdratinghistory.b$b */
    /* loaded from: classes3.dex */
    public static final class C14587b implements InterfaceC14583a.InterfaceC14584a {
        @Override // co.bird.android.feature.birdratinghistory.InterfaceC14583a.InterfaceC14584a
        /* renamed from: a */
        public InterfaceC14583a mo58671a(InterfaceC44393lG2 interfaceC44393lG2, Activity activity, String str) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(activity);
            C51679xZ3.m5005b(str);
            return new C14586a(interfaceC44393lG2, activity, str);
        }

        private C14587b() {
        }
    }

    private C14585b() {
    }

    /* renamed from: a */
    public static InterfaceC14583a.InterfaceC14584a m58675a() {
        return new C14587b();
    }
}
