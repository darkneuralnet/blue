package p000;

import co.bird.android.model.constant.FilterLogicToggleOption;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"LYx2;", "Lco/bird/android/model/constant/FilterLogicToggleOption;", C17296a.f69688o, "filters_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: kl3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44091kl3 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: kl3$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C25227a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC37438Yx2.values().length];
            try {
                iArr[EnumC37438Yx2.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC37438Yx2.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final FilterLogicToggleOption m28488a(EnumC37438Yx2 enumC37438Yx2) {
        Intrinsics.checkNotNullParameter(enumC37438Yx2, "<this>");
        int i = C25227a.$EnumSwitchMapping$0[enumC37438Yx2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return FilterLogicToggleOption.OR;
            }
            throw new NoWhenBranchMatchedException();
        }
        return FilterLogicToggleOption.AND;
    }
}
