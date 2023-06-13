package co.bird.android.model;

import com.stripe.android.financialconnections.domain.Entry;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/model/PrivateBirdAction;", "", "(Ljava/lang/String;I)V", "toString", "", "LIGHTS", "LOCK", "SLEEP", "TAMPER", "UNKNOWN", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum PrivateBirdAction {
    LIGHTS,
    LOCK,
    SLEEP,
    TAMPER,
    UNKNOWN;
    
    public static final Companion Companion = new Companion(null);
    private static final PrivateBirdAction[] all = values();

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0011\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0002\u0010\rR\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/model/PrivateBirdAction$Companion;", "", "()V", "all", "", "Lco/bird/android/model/PrivateBirdAction;", "getAll", "()[Lco/bird/android/model/PrivateBirdAction;", "[Lco/bird/android/model/PrivateBirdAction;", "from", Entry.TYPE_TEXT, "", "strings", "()[Ljava/lang/String;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPrivateBirdAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdAction.kt\nco/bird/android/model/PrivateBirdAction$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,35:1\n11335#2:36\n11670#2,3:37\n1282#2,2:42\n37#3,2:40\n*S KotlinDebug\n*F\n+ 1 PrivateBirdAction.kt\nco/bird/android/model/PrivateBirdAction$Companion\n*L\n30#1:36\n30#1:37,3\n31#1:42,2\n30#1:40,2\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PrivateBirdAction from(String str) {
            PrivateBirdAction privateBirdAction;
            PrivateBirdAction[] all = getAll();
            int length = all.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    privateBirdAction = all[i];
                    if (Intrinsics.areEqual(privateBirdAction.toString(), str)) {
                        break;
                    }
                    i++;
                } else {
                    privateBirdAction = null;
                    break;
                }
            }
            if (privateBirdAction == null) {
                return PrivateBirdAction.UNKNOWN;
            }
            return privateBirdAction;
        }

        public final PrivateBirdAction[] getAll() {
            return PrivateBirdAction.all;
        }

        public final String[] strings() {
            PrivateBirdAction[] all = getAll();
            ArrayList arrayList = new ArrayList(all.length);
            for (PrivateBirdAction privateBirdAction : all) {
                arrayList.add(privateBirdAction.toString());
            }
            return (String[]) arrayList.toArray(new String[0]);
        }

        private Companion() {
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        String lowerCase = name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }
}
