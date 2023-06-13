package p000;

import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"LFS3;", "", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LgT3;", C17296a.f69688o, "LES3;", "LES3;", "lockMode", "<init>", "(LES3;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module(includes = {InterfaceC2278a.class})
/* renamed from: FS3 */
/* loaded from: classes2.dex */
public final class FS3 {

    /* renamed from: a */
    public final ES3 f9395a;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0006"}, m28432d2 = {"LFS3$a;", "", "LPS3;", "impl", "LHS3;", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: FS3$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC2278a {
        @Binds
        /* renamed from: a */
        HS3 m107132a(PS3 ps3);
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FS3$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C2279b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ES3.values().length];
            try {
                iArr[ES3.LOCKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ES3.UNLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ES3.UNLOCKING_BLUR_CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FS3(ES3 lockMode) {
        Intrinsics.checkNotNullParameter(lockMode, "lockMode");
        this.f9395a = lockMode;
    }

    @Provides
    /* renamed from: a */
    public final InterfaceC41546gT3 m107133a(BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i = C2279b.$EnumSwitchMapping$0[this.f9395a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C4329K4 m99273c = C4329K4.m99273c(activity.getLayoutInflater());
                    Intrinsics.checkNotNullExpressionValue(m99273c, "inflate(activity.layoutInflater)");
                    activity.setContentView(m99273c.getRoot());
                    return new C48652sS3(activity, m99273c);
                }
                throw new NoWhenBranchMatchedException();
            }
            C5176M4 m95886c = C5176M4.m95886c(activity.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(m95886c, "inflate(activity.layoutInflater)");
            activity.setContentView(m95886c.getRoot());
            return new C42139hT3(activity, m95886c);
        }
        C4699L4 m97881c = C4699L4.m97881c(activity.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m97881c, "inflate(activity.layoutInflater)");
        activity.setContentView(m97881c.getRoot());
        return new DS3(activity, m97881c);
    }
}
