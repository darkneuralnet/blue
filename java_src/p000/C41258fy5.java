package p000;

import co.bird.android.model.User;
import co.bird.android.model.constant.UserRole;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\"\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\f²\u0006\f\u0010\u000b\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, m28432d2 = {"Lco/bird/android/model/User;", "Lco/bird/android/model/wire/configs/Config;", "config", "Lgl;", "preference", "", C17296a.f69688o, "", "", "Ljava/util/Set;", "BIRD_DOMAINS", "canShakeOperator", "shaketoreport_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: fy5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41258fy5 {

    /* renamed from: a */
    public static final Set<String> f81235a;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fy5$a */
    /* loaded from: classes3.dex */
    public static final class C20669a extends Lambda implements Function0<Boolean> {

        /* renamed from: g */
        public final /* synthetic */ C22454gl f81236g;

        /* renamed from: h */
        public final /* synthetic */ Config f81237h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20669a(C22454gl c22454gl, Config config) {
            super(0);
            this.f81236g = c22454gl;
            this.f81237h = config;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f81236g.m37575s0().getUserRole() == UserRole.OPERATOR && this.f81237h.getOperatorConfig().getFeatures().getEnableShakeToReport());
        }
    }

    static {
        Set<String> of;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"bird.co", "bird-ext.co", "circ.com"});
        f81235a = of;
    }

    /* renamed from: a */
    public static final boolean m40397a(User user, Config config, C22454gl preference) {
        boolean z;
        Lazy lazy;
        boolean z2;
        boolean z3;
        List split$default;
        int lastIndex;
        Intrinsics.checkNotNullParameter(user, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(preference, "preference");
        if (preference.m37575s0().getUserRole() == UserRole.RIDER && config.getRideConfig().getEnableShakeToReport()) {
            z = true;
        } else {
            z = false;
        }
        lazy = LazyKt__LazyJVMKt.lazy(new C20669a(preference, config));
        if (!z && !m40396b(lazy)) {
            z2 = false;
        } else {
            z2 = true;
        }
        String email = user.getEmail();
        if (email != null) {
            split$default = StringsKt__StringsKt.split$default((CharSequence) email, new String[]{"@"}, false, 0, 6, (Object) null);
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(split$default);
            z3 = f81235a.contains((String) split$default.get(lastIndex));
        } else {
            z3 = false;
        }
        if (z2 && (user.getTester() || z3)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m40396b(Lazy<Boolean> lazy) {
        return lazy.getValue().booleanValue();
    }
}
