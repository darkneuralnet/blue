package co.bird.android.persistence.notificationcenter.impl;

import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase;", "LEb5;", "Lro3;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()Lro3;", "categoriesDao", "LPc3;", "E", "()LPc3;", "notificationGroupDao", "LBc3;", "D", "()LBc3;", "notificationDao", "<init>", "()V", "p", C17296a.f69688o, "co.bird.android.lib.persistence.notificationcenter.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public abstract class NotificationCenterDatabase extends AbstractC32563Eb5 {

    /* renamed from: p */
    public static final C16304a f66861p = new C16304a(null);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase$a;", "", "", "DATABASE_NAME", "Ljava/lang/String;", "<init>", "()V", "co.bird.android.lib.persistence.notificationcenter.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.persistence.notificationcenter.impl.NotificationCenterDatabase$a */
    /* loaded from: classes4.dex */
    public static final class C16304a {
        public /* synthetic */ C16304a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16304a() {
        }
    }

    /* renamed from: C */
    public abstract AbstractC48272ro3 mo55159C();

    /* renamed from: D */
    public abstract AbstractC31868Bc3 mo55158D();

    /* renamed from: E */
    public abstract AbstractC35144Pc3 mo55157E();
}
