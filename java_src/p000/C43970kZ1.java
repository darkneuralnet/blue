package p000;

import bo.app.C12749j;
import bo.app.InterfaceC13160u1;
import bo.app.InterfaceC13231y1;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, m28432d2 = {"LkZ1;", "LhZ1;", "", "logImpression", "Ljava/util/concurrent/atomic/AtomicBoolean;", "A", "Ljava/util/concurrent/atomic/AtomicBoolean;", "controlImpressionLogged", "LzT2;", "h0", "()LzT2;", ChallengeRequestData.FIELD_MESSAGE_TYPE, "Lorg/json/JSONObject;", "jsonObject", "Lbo/app/y1;", "brazeManager", "<init>", "(Lorg/json/JSONObject;Lbo/app/y1;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: kZ1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43970kZ1 extends AbstractC42191hZ1 {

    /* renamed from: A */
    public final AtomicBoolean f94499A;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: kZ1$a */
    /* loaded from: classes2.dex */
    public static final class C25179a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C25179a f94500g = new C25179a();

        public C25179a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Control impression already logged for this in-app message. Ignoring.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: kZ1$b */
    /* loaded from: classes2.dex */
    public static final class C25180b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C25180b f94501g = new C25180b();

        public C25180b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Trigger Id not found (this is expected for test sends). Not logging in-app message control impression.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: kZ1$c */
    /* loaded from: classes2.dex */
    public static final class C25181c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C25181c f94502g = new C25181c();

        public C25181c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cannot log an in-app message control impression because the BrazeManager is null.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: kZ1$d */
    /* loaded from: classes2.dex */
    public static final class C25182d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C25182d f94503g = new C25182d();

        public C25182d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Logging control in-app message impression event";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43970kZ1(JSONObject jsonObject, InterfaceC13231y1 brazeManager) {
        super(jsonObject, brazeManager, false, false, 12, null);
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f94499A = new AtomicBoolean(false);
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: h0 */
    public EnumC52810zT2 mo5008h0() {
        return EnumC52810zT2.CONTROL;
    }

    @Override // p000.AbstractC42191hZ1, p000.InterfaceC50985wO1
    public boolean logImpression() {
        boolean z;
        InterfaceC13160u1 m63544h;
        if (this.f94499A.get()) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C25179a.f94500g, 6, null);
            return false;
        }
        String m36213G = m36213G();
        if (m36213G != null && m36213G.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C25180b.f94501g, 6, null);
            return false;
        } else if (m36217A() == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C25181c.f94502g, 6, null);
            return false;
        } else {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, C25182d.f94503g, 6, null);
            String m36213G2 = m36213G();
            if (m36213G2 == null) {
                m63544h = null;
            } else {
                m63544h = C12749j.f58647h.m63544h(m36213G2);
            }
            if (m63544h != null) {
                InterfaceC13231y1 m36217A = m36217A();
                if (m36217A != null) {
                    m36217A.mo62756a(m63544h);
                }
                this.f94499A.set(true);
            }
            return true;
        }
    }
}
