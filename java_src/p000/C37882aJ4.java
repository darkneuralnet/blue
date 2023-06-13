package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b$\u0010%JK\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b \u0010\u0019R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, m28432d2 = {"LaJ4;", "Lqz5;", "Lrz5;", "command", "", "callback", "", "allowDefaultSource", "", "totalAmount", "currency", "", "", "products", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lrz5;", "getCommand", "()Lrz5;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Z", "b", "()Z", "J", "e", "()J", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getProducts", "()Ljava/util/List;", "<init>", "(Lrz5;Ljava/lang/String;ZJLjava/lang/String;Ljava/util/List;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: aJ4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37882aJ4 implements InterfaceC47791qz5 {
    @JsonProperty("allow_default_source")
    @InterfaceC41208ft5("allow_default_source")
    private final boolean allowDefaultSource;
    @JsonProperty("callback")
    @InterfaceC41208ft5("callback")
    private final String callback;
    @JsonProperty("command")
    @InterfaceC41208ft5("command")
    private final EnumC48383rz5 command;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("product")
    @InterfaceC41208ft5("product")
    private final List<Object> products;
    @JsonProperty("total_amount")
    @InterfaceC41208ft5("total_amount")
    private final long totalAmount;

    public C37882aJ4(EnumC48383rz5 command, String callback, boolean z, long j, String currency, List<Object> products) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(products, "products");
        this.command = command;
        this.callback = callback;
        this.allowDefaultSource = z;
        this.totalAmount = j;
        this.currency = currency;
        this.products = products;
    }

    public static /* synthetic */ C37882aJ4 copy$default(C37882aJ4 c37882aJ4, EnumC48383rz5 enumC48383rz5, String str, boolean z, long j, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC48383rz5 = c37882aJ4.command;
        }
        if ((i & 2) != 0) {
            str = c37882aJ4.callback;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            z = c37882aJ4.allowDefaultSource;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            j = c37882aJ4.totalAmount;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            str2 = c37882aJ4.currency;
        }
        String str4 = str2;
        List<Object> list2 = list;
        if ((i & 32) != 0) {
            list2 = c37882aJ4.products;
        }
        return c37882aJ4.m71662a(enumC48383rz5, str3, z2, j2, str4, list2);
    }

    /* renamed from: a */
    public final C37882aJ4 m71662a(EnumC48383rz5 command, String callback, boolean z, long j, String currency, List<Object> products) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(products, "products");
        return new C37882aJ4(command, callback, z, j, currency, products);
    }

    /* renamed from: b */
    public final boolean m71661b() {
        return this.allowDefaultSource;
    }

    /* renamed from: c */
    public final String m71660c() {
        return this.callback;
    }

    /* renamed from: d */
    public final String m71659d() {
        return this.currency;
    }

    /* renamed from: e */
    public final long m71658e() {
        return this.totalAmount;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37882aJ4) {
            C37882aJ4 c37882aJ4 = (C37882aJ4) obj;
            return this.command == c37882aJ4.command && Intrinsics.areEqual(this.callback, c37882aJ4.callback) && this.allowDefaultSource == c37882aJ4.allowDefaultSource && this.totalAmount == c37882aJ4.totalAmount && Intrinsics.areEqual(this.currency, c37882aJ4.currency) && Intrinsics.areEqual(this.products, c37882aJ4.products);
        }
        return false;
    }

    @Override // p000.InterfaceC47791qz5
    public EnumC48383rz5 getCommand() {
        return this.command;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.command.hashCode() * 31) + this.callback.hashCode()) * 31;
        boolean z = this.allowDefaultSource;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((hashCode + i) * 31) + Long.hashCode(this.totalAmount)) * 31) + this.currency.hashCode()) * 31) + this.products.hashCode();
    }

    public String toString() {
        EnumC48383rz5 enumC48383rz5 = this.command;
        String str = this.callback;
        boolean z = this.allowDefaultSource;
        long j = this.totalAmount;
        String str2 = this.currency;
        List<Object> list = this.products;
        return "RequestPayment(command=" + enumC48383rz5 + ", callback=" + str + ", allowDefaultSource=" + z + ", totalAmount=" + j + ", currency=" + str2 + ", products=" + list + ")";
    }

    public /* synthetic */ C37882aJ4(EnumC48383rz5 enumC48383rz5, String str, boolean z, long j, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC48383rz5, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? true : z, (i & 8) != 0 ? 0L : j, (i & 16) == 0 ? str2 : "", (i & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
