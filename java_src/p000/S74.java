package p000;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0006H&J\u0012\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¨\u0006\n"}, m28432d2 = {"LS74;", "", "", "show", "", "hiddenState", "", "showProgress", "startProgress", "stopProgress", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: S74 */
/* loaded from: classes2.dex */
public interface S74 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: S74$a */
    /* loaded from: classes2.dex */
    public static final class C7343a {
        public static /* synthetic */ void showProgress$default(S74 s74, boolean z, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showProgress");
            }
            if ((i2 & 2) != 0) {
                i = 8;
            }
            s74.showProgress(z, i);
        }

        public static /* synthetic */ void stopProgress$default(S74 s74, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopProgress");
            }
            if ((i2 & 1) != 0) {
                i = 8;
            }
            s74.stopProgress(i);
        }
    }

    void showProgress(boolean z, int i);

    void startProgress();

    void stopProgress(int i);
}
