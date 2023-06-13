package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\u000b\u001a\u00020\u0007HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001f¨\u0006&"}, m28432d2 = {"LnB1;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "LFY3;", "positive", "b", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "e", "getMessage", "f", "LFY3;", "getPositive", "()LFY3;", "g", "Ljava/lang/Integer;", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "h", "getNegativeText", "negativeText", "<init>", "(Ljava/lang/String;Ljava/lang/String;LFY3;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nB1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45533nB1 extends AbstractC5751Ny {

    /* renamed from: d */
    public final String f99562d;

    /* renamed from: e */
    public final String f99563e;

    /* renamed from: f */
    public final FY3 f99564f;

    /* renamed from: g */
    public final Integer f99565g;

    /* renamed from: h */
    public final Integer f99566h;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nB1$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C26422a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FY3.values().length];
            try {
                iArr[FY3.CONFIRM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FY3.OK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FY3.OKAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45533nB1(String title, String message, FY3 positive) {
        super(null);
        int valueOf;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(positive, "positive");
        this.f99562d = title;
        this.f99563e = message;
        this.f99564f = positive;
        int i = C26422a.$EnumSwitchMapping$0[positive.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    valueOf = Integer.valueOf(C45871nl4.dialog_okay);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                valueOf = 17039370;
            }
        } else {
            valueOf = Integer.valueOf(C45871nl4.confirm_action);
        }
        this.f99565g = valueOf;
    }

    public static /* synthetic */ C45533nB1 copy$default(C45533nB1 c45533nB1, String str, String str2, FY3 fy3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c45533nB1.f99562d;
        }
        if ((i & 2) != 0) {
            str2 = c45533nB1.f99563e;
        }
        if ((i & 4) != 0) {
            fy3 = c45533nB1.f99564f;
        }
        return c45533nB1.m24210b(str, str2, fy3);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return this.f99565g;
    }

    /* renamed from: b */
    public final C45533nB1 m24210b(String title, String message, FY3 positive) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(positive, "positive");
        return new C45533nB1(title, message, positive);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45533nB1) {
            C45533nB1 c45533nB1 = (C45533nB1) obj;
            return Intrinsics.areEqual(this.f99562d, c45533nB1.f99562d) && Intrinsics.areEqual(this.f99563e, c45533nB1.f99563e) && this.f99564f == c45533nB1.f99564f;
        }
        return false;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f99566h;
    }

    public int hashCode() {
        return (((this.f99562d.hashCode() * 31) + this.f99563e.hashCode()) * 31) + this.f99564f.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f99563e;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f99562d;
    }

    public String toString() {
        String str = this.f99562d;
        String str2 = this.f99563e;
        FY3 fy3 = this.f99564f;
        return "GenericAlert(title=" + str + ", message=" + str2 + ", positive=" + fy3 + ")";
    }
}
