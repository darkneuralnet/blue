package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"LDI4;", "Lqz5;", "Lrz5;", "command", "", "callback", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lrz5;", "getCommand", "()Lrz5;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Lrz5;Ljava/lang/String;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: DI4 */
/* loaded from: classes2.dex */
public final class DI4 implements InterfaceC47791qz5 {
    @JsonProperty("callback")
    @InterfaceC41208ft5("callback")
    private final String callback;
    @JsonProperty("command")
    @InterfaceC41208ft5("command")
    private final EnumC48383rz5 command;

    public DI4(EnumC48383rz5 command, String callback) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.command = command;
        this.callback = callback;
    }

    public static /* synthetic */ DI4 copy$default(DI4 di4, EnumC48383rz5 enumC48383rz5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC48383rz5 = di4.command;
        }
        if ((i & 2) != 0) {
            str = di4.callback;
        }
        return di4.m110599a(enumC48383rz5, str);
    }

    /* renamed from: a */
    public final DI4 m110599a(EnumC48383rz5 command, String callback) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new DI4(command, callback);
    }

    /* renamed from: b */
    public final String m110598b() {
        return this.callback;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DI4) {
            DI4 di4 = (DI4) obj;
            return this.command == di4.command && Intrinsics.areEqual(this.callback, di4.callback);
        }
        return false;
    }

    @Override // p000.InterfaceC47791qz5
    public EnumC48383rz5 getCommand() {
        return this.command;
    }

    public int hashCode() {
        return (this.command.hashCode() * 31) + this.callback.hashCode();
    }

    public String toString() {
        EnumC48383rz5 enumC48383rz5 = this.command;
        String str = this.callback;
        return "RequestContext(command=" + enumC48383rz5 + ", callback=" + str + ")";
    }

    public /* synthetic */ DI4(EnumC48383rz5 enumC48383rz5, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC48383rz5, (i & 2) != 0 ? "" : str);
    }
}
