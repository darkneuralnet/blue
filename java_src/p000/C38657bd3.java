package p000;

import androidx.fragment.app.FragmentManager;
import com.facebook.share.internal.C17296a;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, m28432d2 = {"Lbd3;", "", "LAa3;", C17296a.f69688o, "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "b", "I", "containerId", "<init>", "(Landroidx/fragment/app/FragmentManager;I)V", "c", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module(subcomponents = {InterfaceC52874za3.class})
/* renamed from: bd3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38657bd3 {

    /* renamed from: c */
    public static final C12458a f57769c = new C12458a(null);

    /* renamed from: a */
    public final FragmentManager f57770a;

    /* renamed from: b */
    public final int f57771b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lbd3$a;", "", "", "CONTAINER_ID", "Ljava/lang/String;", "FRAGMENT_MANAGER", "<init>", "()V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: bd3$a */
    /* loaded from: classes3.dex */
    public static final class C12458a {
        public /* synthetic */ C12458a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12458a() {
        }
    }

    public C38657bd3(FragmentManager fragmentManager, int i) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f57770a = fragmentManager;
        this.f57771b = i;
    }

    @Provides
    /* renamed from: a */
    public final C31616Aa3 m64263a() {
        return new C31616Aa3(this.f57770a, this.f57771b);
    }
}
