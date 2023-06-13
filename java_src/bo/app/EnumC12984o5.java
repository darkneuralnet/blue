package bo.app;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m28432d2 = {"Lbo/app/o5;", "", "LaP1;", "", "v", "<init>", "(Ljava/lang/String;I)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.o5 */
/* loaded from: classes.dex */
public enum EnumC12984o5 implements InterfaceC37933aP1<String> {
    SUBSCRIBED,
    UNSUBSCRIBED;

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: bo.app.o5$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C12985a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59032a;

        static {
            int[] iArr = new int[EnumC12984o5.values().length];
            iArr[EnumC12984o5.SUBSCRIBED.ordinal()] = 1;
            iArr[EnumC12984o5.UNSUBSCRIBED.ordinal()] = 2;
            f59032a = iArr;
        }
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: v */
    public String forJsonPut() {
        int i = C12985a.f59032a[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "unsubscribed";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "subscribed";
    }
}
