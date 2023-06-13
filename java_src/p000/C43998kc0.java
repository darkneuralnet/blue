package p000;

import androidx.lifecycle.LiveData;
import java.util.Objects;
import p000.AbstractC43405jc0;
import p000.InterfaceC34196Lb0;
/* renamed from: kc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C43998kc0 {

    /* renamed from: a */
    public final C45777nc0 f94632a;

    /* renamed from: b */
    public final C49882uX2<AbstractC43405jc0> f94633b;

    /* renamed from: kc0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C25193a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f94634a;

        static {
            int[] iArr = new int[InterfaceC34196Lb0.EnumC5034a.values().length];
            f94634a = iArr;
            try {
                iArr[InterfaceC34196Lb0.EnumC5034a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94634a[InterfaceC34196Lb0.EnumC5034a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94634a[InterfaceC34196Lb0.EnumC5034a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94634a[InterfaceC34196Lb0.EnumC5034a.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94634a[InterfaceC34196Lb0.EnumC5034a.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f94634a[InterfaceC34196Lb0.EnumC5034a.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f94634a[InterfaceC34196Lb0.EnumC5034a.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f94634a[InterfaceC34196Lb0.EnumC5034a.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public C43998kc0(C45777nc0 c45777nc0) {
        this.f94632a = c45777nc0;
        C49882uX2<AbstractC43405jc0> c49882uX2 = new C49882uX2<>();
        this.f94633b = c49882uX2;
        c49882uX2.postValue(AbstractC43405jc0.m30210a(AbstractC43405jc0.EnumC24957b.CLOSED));
    }

    /* renamed from: a */
    public LiveData<AbstractC43405jc0> m28800a() {
        return this.f94633b;
    }

    /* renamed from: b */
    public final AbstractC43405jc0 m28799b() {
        if (this.f94632a.m23451c()) {
            return AbstractC43405jc0.m30210a(AbstractC43405jc0.EnumC24957b.OPENING);
        }
        return AbstractC43405jc0.m30210a(AbstractC43405jc0.EnumC24957b.PENDING_OPEN);
    }

    /* renamed from: c */
    public void m28798c(InterfaceC34196Lb0.EnumC5034a enumC5034a, AbstractC43405jc0.AbstractC24956a abstractC24956a) {
        AbstractC43405jc0 m28799b;
        switch (C25193a.f94634a[enumC5034a.ordinal()]) {
            case 1:
                m28799b = m28799b();
                break;
            case 2:
                m28799b = AbstractC43405jc0.m30209b(AbstractC43405jc0.EnumC24957b.OPENING, abstractC24956a);
                break;
            case 3:
            case 4:
                m28799b = AbstractC43405jc0.m30209b(AbstractC43405jc0.EnumC24957b.OPEN, abstractC24956a);
                break;
            case 5:
            case 6:
                m28799b = AbstractC43405jc0.m30209b(AbstractC43405jc0.EnumC24957b.CLOSING, abstractC24956a);
                break;
            case 7:
            case 8:
                m28799b = AbstractC43405jc0.m30209b(AbstractC43405jc0.EnumC24957b.CLOSED, abstractC24956a);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + enumC5034a);
        }
        C33928Jx2.m99533a("CameraStateMachine", "New public camera state " + m28799b + " from " + enumC5034a + " and " + abstractC24956a);
        if (!Objects.equals(this.f94633b.getValue(), m28799b)) {
            C33928Jx2.m99533a("CameraStateMachine", "Publishing new public camera state " + m28799b);
            this.f94633b.postValue(m28799b);
        }
    }
}
