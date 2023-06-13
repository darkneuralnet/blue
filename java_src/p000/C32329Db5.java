package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.AbstractC32563Eb5;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0002*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007J8\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0002*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0013"}, m28432d2 = {"LDb5;", "", "T", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Ljava/lang/Class;", "klass", "", "suffix", "b", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "LEb5;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LEb5$a;", "c", "name", C17296a.f69688o, "<init>", "()V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Db5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32329Db5 {

    /* renamed from: a */
    public static final C32329Db5 f6025a = new C32329Db5();

    private C32329Db5() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    @JvmStatic
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends AbstractC32563Eb5> AbstractC32563Eb5.C1898a<T> m110126a(Context context, Class<T> klass, String str) {
        boolean z;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                z = false;
                if (!(true ^ z)) {
                    return new AbstractC32563Eb5.C1898a<>(context, klass, str);
                }
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
            }
        }
        z = true;
        if (!(true ^ z)) {
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final <T, C> T m110125b(Class<C> klass, String suffix) {
        boolean z;
        String replace$default;
        String str;
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Package r1 = klass.getPackage();
        Intrinsics.checkNotNull(r1);
        String fullPackage = r1.getName();
        String canonicalName = klass.getCanonicalName();
        Intrinsics.checkNotNull(canonicalName);
        Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
        boolean z2 = false;
        if (fullPackage.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str2 = canonicalName;
        StringBuilder sb = new StringBuilder();
        replace$default = StringsKt__StringsJVMKt.replace$default(str2, (char) CoreConstants.DOT, '_', false, 4, (Object) null);
        sb.append(replace$default);
        sb.append(suffix);
        String sb2 = sb.toString();
        try {
            if (fullPackage.length() == 0) {
                z2 = true;
            }
            if (z2) {
                str = sb2;
            } else {
                str = fullPackage + CoreConstants.DOT + sb2;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return (T) cls.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + sb2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass + ".canonicalName");
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final <T extends AbstractC32563Eb5> AbstractC32563Eb5.C1898a<T> m110124c(Context context, Class<T> klass) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        return new AbstractC32563Eb5.C1898a<>(context, klass, null);
    }
}
