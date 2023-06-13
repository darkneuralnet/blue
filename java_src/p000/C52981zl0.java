package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Lzl0;", "Lqz5;", "Lrz5;", "command", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lrz5;", "getCommand", "()Lrz5;", "<init>", "(Lrz5;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: zl0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52981zl0 implements InterfaceC47791qz5 {
    @JsonProperty("command")
    @InterfaceC41208ft5("command")
    private final EnumC48383rz5 command;

    public C52981zl0(EnumC48383rz5 command) {
        Intrinsics.checkNotNullParameter(command, "command");
        this.command = command;
    }

    public static /* synthetic */ C52981zl0 copy$default(C52981zl0 c52981zl0, EnumC48383rz5 enumC48383rz5, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC48383rz5 = c52981zl0.command;
        }
        return c52981zl0.m455a(enumC48383rz5);
    }

    /* renamed from: a */
    public final C52981zl0 m455a(EnumC48383rz5 command) {
        Intrinsics.checkNotNullParameter(command, "command");
        return new C52981zl0(command);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C52981zl0) && this.command == ((C52981zl0) obj).command;
    }

    @Override // p000.InterfaceC47791qz5
    public EnumC48383rz5 getCommand() {
        return this.command;
    }

    public int hashCode() {
        return this.command.hashCode();
    }

    public String toString() {
        EnumC48383rz5 enumC48383rz5 = this.command;
        return "CloseView(command=" + enumC48383rz5 + ")";
    }
}
