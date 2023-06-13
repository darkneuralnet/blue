package com.stripe.android.stripe3ds2.security;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum TestRsa uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\u0001\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB3\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018j\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/security/DirectoryServer;", "", "", "", "ids", "Ljava/util/List;", "getIds", "()Ljava/util/List;", "Lcom/stripe/android/stripe3ds2/security/Algorithm;", "algorithm", "Lcom/stripe/android/stripe3ds2/security/Algorithm;", "getAlgorithm", "()Lcom/stripe/android/stripe3ds2/security/Algorithm;", "fileName", "Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "LRk2;", "keyUse", "LRk2;", "getKeyUse", "()LRk2;", "", "isCertificate", "()Z", "<init>", "(Ljava/lang/String;ILjava/util/List;Lcom/stripe/android/stripe3ds2/security/Algorithm;Ljava/lang/String;LRk2;)V", "Companion", "TestRsa", "TestEc", "Visa", "Mastercard", "Amex", "Discover", "CartesBancaires", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class DirectoryServer {
    private static final /* synthetic */ DirectoryServer[] $VALUES;
    public static final DirectoryServer Amex;
    private static final Set<String> CERTIFICATE_EXTENSIONS;
    public static final DirectoryServer CartesBancaires;
    public static final Companion Companion;
    public static final DirectoryServer Discover;
    public static final DirectoryServer Mastercard;
    public static final DirectoryServer TestEc;
    public static final DirectoryServer TestRsa;
    public static final DirectoryServer Visa;
    private final Algorithm algorithm;
    private final String fileName;
    private final List<String> ids;
    private final C35683Rk2 keyUse;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/security/DirectoryServer$Companion;", "", "()V", "CERTIFICATE_EXTENSIONS", "", "", "lookup", "Lcom/stripe/android/stripe3ds2/security/DirectoryServer;", "directoryServerId", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DirectoryServer lookup(String directoryServerId) {
            DirectoryServer directoryServer;
            Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
            DirectoryServer[] values = DirectoryServer.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    directoryServer = values[i];
                    if (directoryServer.getIds().contains(directoryServerId)) {
                        break;
                    }
                    i++;
                } else {
                    directoryServer = null;
                    break;
                }
            }
            if (directoryServer != null) {
                return directoryServer;
            }
            throw new SDKRuntimeException(new IllegalArgumentException("Unknown directory server id: " + directoryServerId));
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ DirectoryServer[] $values() {
        return new DirectoryServer[]{TestRsa, TestEc, Visa, Mastercard, Amex, Discover, CartesBancaires};
    }

    static {
        List listOf;
        List listOf2;
        List listOf3;
        List listOf4;
        List listOf5;
        List listOf6;
        List listOf7;
        Set<String> of;
        listOf = CollectionsKt__CollectionsJVMKt.listOf("F055545342");
        Algorithm algorithm = Algorithm.RSA;
        TestRsa = new DirectoryServer("TestRsa", 0, listOf, algorithm, "ds-test-rsa.txt", null, 8, null);
        listOf2 = CollectionsKt__CollectionsJVMKt.listOf("F155545342");
        TestEc = new DirectoryServer("TestEc", 1, listOf2, Algorithm.EC, "ds-test-ec.txt", null, 8, null);
        listOf3 = CollectionsKt__CollectionsJVMKt.listOf("A000000003");
        Visa = new DirectoryServer("Visa", 2, listOf3, algorithm, "ds-visa.crt", null, 8, null);
        listOf4 = CollectionsKt__CollectionsJVMKt.listOf("A000000004");
        Mastercard = new DirectoryServer("Mastercard", 3, listOf4, algorithm, "ds-mastercard.crt", null, 8, null);
        listOf5 = CollectionsKt__CollectionsJVMKt.listOf("A000000025");
        Amex = new DirectoryServer("Amex", 4, listOf5, algorithm, "ds-amex.pem", null, 8, null);
        listOf6 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"A000000152", "A000000324"});
        Discover = new DirectoryServer("Discover", 5, listOf6, algorithm, "ds-discover.cer", null);
        listOf7 = CollectionsKt__CollectionsJVMKt.listOf("A000000042");
        CartesBancaires = new DirectoryServer("CartesBancaires", 6, listOf7, algorithm, "ds-cartesbancaires.pem", null, 8, null);
        $VALUES = $values();
        Companion = new Companion(null);
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{".crt", ".cer", ".pem"});
        CERTIFICATE_EXTENSIONS = of;
    }

    private DirectoryServer(String str, int i, List list, Algorithm algorithm, String str2, C35683Rk2 c35683Rk2) {
        this.ids = list;
        this.algorithm = algorithm;
        this.fileName = str2;
        this.keyUse = c35683Rk2;
    }

    public static DirectoryServer valueOf(String str) {
        return (DirectoryServer) Enum.valueOf(DirectoryServer.class, str);
    }

    public static DirectoryServer[] values() {
        return (DirectoryServer[]) $VALUES.clone();
    }

    public final Algorithm getAlgorithm() {
        return this.algorithm;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final List<String> getIds() {
        return this.ids;
    }

    public final C35683Rk2 getKeyUse() {
        return this.keyUse;
    }

    public final boolean isCertificate() {
        boolean endsWith$default;
        Set<String> set = CERTIFICATE_EXTENSIONS;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (String str : set) {
            endsWith$default = StringsKt__StringsJVMKt.endsWith$default(this.fileName, str, false, 2, null);
            if (endsWith$default) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ DirectoryServer(String str, int i, List list, Algorithm algorithm, String str2, C35683Rk2 c35683Rk2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, list, algorithm, str2, (i2 & 8) != 0 ? C35683Rk2.f32497c : c35683Rk2);
    }
}
