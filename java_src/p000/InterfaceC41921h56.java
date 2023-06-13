package p000;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&J\u001c\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&JS\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m28432d2 = {"Lh56;", "", "", "message", "Lf56;", "duration", "", "topToast", "", "customLayout", Entry.TYPE_IMAGE, "body", "imageRes", "", "bodyText", "customToast", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lf56;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: h56  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC41921h56 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: h56$a */
    /* loaded from: classes2.dex */
    public static final class C22549a {
        public static /* synthetic */ void customToast$default(InterfaceC41921h56 interfaceC41921h56, int i, Integer num, Integer num2, Integer num3, String str, EnumC40735f56 enumC40735f56, int i2, Object obj) {
            Integer num4;
            Integer num5;
            Integer num6;
            EnumC40735f56 enumC40735f562;
            if (obj == null) {
                String str2 = null;
                if ((i2 & 2) != 0) {
                    num4 = null;
                } else {
                    num4 = num;
                }
                if ((i2 & 4) != 0) {
                    num5 = null;
                } else {
                    num5 = num2;
                }
                if ((i2 & 8) != 0) {
                    num6 = null;
                } else {
                    num6 = num3;
                }
                if ((i2 & 16) == 0) {
                    str2 = str;
                }
                if ((i2 & 32) != 0) {
                    enumC40735f562 = EnumC40735f56.LONG;
                } else {
                    enumC40735f562 = enumC40735f56;
                }
                interfaceC41921h56.customToast(i, num4, num5, num6, str2, enumC40735f562);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: customToast");
        }

        public static /* synthetic */ void topToast$default(InterfaceC41921h56 interfaceC41921h56, CharSequence charSequence, EnumC40735f56 enumC40735f56, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: topToast");
            }
            if ((i & 2) != 0) {
                enumC40735f56 = EnumC40735f56.LONG;
            }
            interfaceC41921h56.topToast(charSequence, enumC40735f56);
        }

        public static /* synthetic */ void topToast$default(InterfaceC41921h56 interfaceC41921h56, int i, EnumC40735f56 enumC40735f56, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: topToast");
            }
            if ((i2 & 2) != 0) {
                enumC40735f56 = EnumC40735f56.LONG;
            }
            interfaceC41921h56.topToast(i, enumC40735f56);
        }
    }

    void customToast(int i, Integer num, Integer num2, Integer num3, String str, EnumC40735f56 enumC40735f56);

    void topToast(int i, EnumC40735f56 enumC40735f56);

    void topToast(CharSequence charSequence, EnumC40735f56 enumC40735f56);
}
