package com.stripe.android.stripe3ds2.init;

import com.stripe.android.stripe3ds2.init.SecurityCheck;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0017\b\u0000\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker;", "Lcom/stripe/android/stripe3ds2/init/SecurityChecker;", "securityChecks", "", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "(Ljava/util/List;)V", "getWarnings", "Lcom/stripe/android/stripe3ds2/init/Warning;", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DefaultSecurityChecker implements SecurityChecker {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final List<SecurityCheck> DEFAULT_CHECKS;
    private final List<SecurityCheck> securityChecks;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultSecurityChecker$Companion;", "", "()V", "DEFAULT_CHECKS", "", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "getDEFAULT_CHECKS", "()Ljava/util/List;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<SecurityCheck> getDEFAULT_CHECKS() {
            return DefaultSecurityChecker.DEFAULT_CHECKS;
        }

        private Companion() {
        }
    }

    static {
        List<SecurityCheck> listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new SecurityCheck[]{new SecurityCheck.RootedCheck(), new SecurityCheck.Tampered(), new SecurityCheck.Emulator(), new SecurityCheck.DebuggerAttached(false, 1, null), new SecurityCheck.UnsupportedOS()});
        DEFAULT_CHECKS = listOf;
    }

    public DefaultSecurityChecker() {
        this(null, 1, null);
    }

    @Override // com.stripe.android.stripe3ds2.init.SecurityChecker
    public List<Warning> getWarnings() {
        int collectionSizeOrDefault;
        ArrayList<SecurityCheck> arrayList = new ArrayList();
        for (Object obj : this.securityChecks) {
            if (((SecurityCheck) obj).check()) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (SecurityCheck securityCheck : arrayList) {
            arrayList2.add(securityCheck.getWarning());
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultSecurityChecker(List<? extends SecurityCheck> securityChecks) {
        Intrinsics.checkNotNullParameter(securityChecks, "securityChecks");
        this.securityChecks = securityChecks;
    }

    public /* synthetic */ DefaultSecurityChecker(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DEFAULT_CHECKS : list);
    }
}
