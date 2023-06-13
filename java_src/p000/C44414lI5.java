package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\u0006HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"LlI5;", "", "LTk5;", "scanResult", "LnI5;", TransferTable.COLUMN_STATE, "", "metadata", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LTk5;", "c", "()LTk5;", "b", "LnI5;", DateTokenConverter.CONVERTER_KEY, "()LnI5;", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(LTk5;LnI5;Ljava/lang/String;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lI5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44414lI5 {

    /* renamed from: a */
    public final C36154Tk5 f95856a;

    /* renamed from: b */
    public final EnumC45600nI5 f95857b;

    /* renamed from: c */
    public final String f95858c;

    public C44414lI5(C36154Tk5 scanResult, EnumC45600nI5 state, String str) {
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f95856a = scanResult;
        this.f95857b = state;
        this.f95858c = str;
    }

    public static /* synthetic */ C44414lI5 copy$default(C44414lI5 c44414lI5, C36154Tk5 c36154Tk5, EnumC45600nI5 enumC45600nI5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            c36154Tk5 = c44414lI5.f95856a;
        }
        if ((i & 2) != 0) {
            enumC45600nI5 = c44414lI5.f95857b;
        }
        if ((i & 4) != 0) {
            str = c44414lI5.f95858c;
        }
        return c44414lI5.m27438a(c36154Tk5, enumC45600nI5, str);
    }

    /* renamed from: a */
    public final C44414lI5 m27438a(C36154Tk5 scanResult, EnumC45600nI5 state, String str) {
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        Intrinsics.checkNotNullParameter(state, "state");
        return new C44414lI5(scanResult, state, str);
    }

    /* renamed from: b */
    public final String m27437b() {
        return this.f95858c;
    }

    /* renamed from: c */
    public final C36154Tk5 m27436c() {
        return this.f95856a;
    }

    /* renamed from: d */
    public final EnumC45600nI5 m27435d() {
        return this.f95857b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44414lI5) {
            C44414lI5 c44414lI5 = (C44414lI5) obj;
            return Intrinsics.areEqual(this.f95856a, c44414lI5.f95856a) && this.f95857b == c44414lI5.f95857b && Intrinsics.areEqual(this.f95858c, c44414lI5.f95858c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f95856a.hashCode() * 31) + this.f95857b.hashCode()) * 31;
        String str = this.f95858c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        C36154Tk5 c36154Tk5 = this.f95856a;
        EnumC45600nI5 enumC45600nI5 = this.f95857b;
        String str = this.f95858c;
        return "SmartlockItem(scanResult=" + c36154Tk5 + ", state=" + enumC45600nI5 + ", metadata=" + str + ")";
    }

    public /* synthetic */ C44414lI5(C36154Tk5 c36154Tk5, EnumC45600nI5 enumC45600nI5, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c36154Tk5, enumC45600nI5, (i & 4) != 0 ? null : str);
    }
}
