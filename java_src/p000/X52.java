package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import co.bird.android.navigator.ActivityResult;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
@Metadata(m28433d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012&\u0010\u0005\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u00030\u0002\"\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001aN\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\t2&\u0010\u0005\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u00030\u0002\"\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003H\u0086\b¢\u0006\u0004\b\u0007\u0010\u000b\u001a9\u0010\f\u001a\u00020\u0006*\u00020\u00062&\u0010\u0005\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u00030\u0002\"\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e\u001a\u001f\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\u000e*\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012\u001a,\u0010\u0015\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b\u0015\u0010\u0016\u001a6\u0010\u0015\u001a\u00020\u0006\"\n\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0017*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0087\n¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m28432d2 = {"T", "Landroid/content/Context;", "", "Lkotlin/Pair;", "", "extras", "Landroid/content/Intent;", "intent", "(Landroid/content/Context;[Lkotlin/Pair;)Landroid/content/Intent;", "Landroid/net/Uri;", MessageExtension.FIELD_DATA, "(Landroid/content/Context;Landroid/net/Uri;[Lkotlin/Pair;)Landroid/content/Intent;", "c", "(Landroid/content/Intent;[Lkotlin/Pair;)Landroid/content/Intent;", "Lco/bird/android/navigator/ActivityResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, C17296a.f69688o, "b", "(Landroid/content/Intent;)Lco/bird/android/navigator/ActivityResult;", "name", "value", "set", "(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Object;)Landroid/content/Intent;", "Landroid/os/Parcelable;", "Ljava/util/ArrayList;", "setArrayListParcelable", "(Landroid/content/Intent;Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;", "navigator_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIntentBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntentBuilder.kt\nco/bird/android/navigator/IntentBuilderKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n61#1,26:111\n61#1,26:139\n61#1,26:167\n61#1,26:195\n13579#2:110\n13580#2:137\n13579#2:138\n13580#2:165\n13579#2:166\n13580#2:193\n1#3:194\n*S KotlinDebug\n*F\n+ 1 IntentBuilder.kt\nco/bird/android/navigator/IntentBuilderKt\n*L\n32#1:111,26\n41#1:139,26\n47#1:167,26\n52#1:195,26\n31#1:110\n31#1:137\n40#1:138\n40#1:165\n47#1:166\n47#1:193\n*E\n"})
/* renamed from: X52 */
/* loaded from: classes4.dex */
public final class X52 {
    /* renamed from: a */
    public static final Intent m77424a(ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intent intent = new Intent();
        if (result instanceof Integer) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra("activity_result", ((Number) result).intValue()), "putExtra(name, value)");
        } else if (result instanceof Long) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra("activity_result", ((Number) result).longValue()), "putExtra(name, value)");
        } else if (result instanceof Float) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra("activity_result", ((Number) result).floatValue()), "putExtra(name, value)");
        } else if (result instanceof Double) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra("activity_result", ((Number) result).doubleValue()), "putExtra(name, value)");
        } else if (result instanceof Byte) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra("activity_result", ((Number) result).byteValue()), "putExtra(name, value)");
        } else if (result instanceof Character) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra("activity_result", ((Character) result).charValue()), "putExtra(name, value)");
        } else if (result instanceof int[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra("activity_result", (int[]) result), "putExtra(name, value)");
        } else if (result instanceof long[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra("activity_result", (long[]) result), "putExtra(name, value)");
        } else if (result instanceof float[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra("activity_result", (float[]) result), "putExtra(name, value)");
        } else if (result instanceof double[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra("activity_result", (double[]) result), "putExtra(name, value)");
        } else if (result instanceof byte[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra("activity_result", (byte[]) result), "putExtra(name, value)");
        } else if (result instanceof char[]) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra("activity_result", (char[]) result), "putExtra(name, value)");
        } else if (result instanceof String) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra("activity_result", (String) result), "putExtra(name, value)");
        } else if (result instanceof Bundle) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra("activity_result", (Bundle) result), "putExtra(name, value)");
        } else if (result instanceof Parcelable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra("activity_result", result), "putExtra(name, value)");
        } else if (result instanceof Enum) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra("activity_result", ((Enum) result).name()), "putExtra(name, value.name)");
        } else if (result instanceof Serializable) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra("activity_result", (Serializable) result), "putExtra(name, value)");
        } else if (result instanceof CharSequence) {
            Intrinsics.checkNotNullExpressionValue(intent.putExtra("activity_result", (CharSequence) result), "putExtra(name, value)");
        } else {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResult.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
        return intent;
    }

    /* renamed from: b */
    public static final <T extends ActivityResult> T m77423b(Intent intent) {
        if (intent != null) {
            return (T) intent.getParcelableExtra("activity_result");
        }
        return null;
    }

    /* renamed from: c */
    public static final Intent m77422c(Intent intent, Pair<String, ?>... extras) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(extras, "extras");
        for (Pair<String, ?> pair : extras) {
            String component1 = pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                throw new IllegalArgumentException("<T> of type " + Reflection.getOrCreateKotlinClass(Object.class) + " is not supported.");
            }
        }
        return intent;
    }

    public static final /* synthetic */ <T> Intent intent(Context context, Pair<String, ?>... extras) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.reifiedOperationMarker(4, "T");
        Intent intent = new Intent(context, Object.class);
        for (Pair<String, ?> pair : extras) {
            String component1 = pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                throw new IllegalArgumentException("<T> of type " + Reflection.getOrCreateKotlinClass(Object.class) + " is not supported.");
            }
        }
        return intent;
    }

    @JvmName(name = "set")
    public static final /* synthetic */ <T> Intent set(Intent intent, String name, T t) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (t instanceof Integer) {
            Intent putExtra = intent.putExtra(name, ((Number) t).intValue());
            Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(name, value)");
            return putExtra;
        } else if (t instanceof Long) {
            Intent putExtra2 = intent.putExtra(name, ((Number) t).longValue());
            Intrinsics.checkNotNullExpressionValue(putExtra2, "putExtra(name, value)");
            return putExtra2;
        } else if (t instanceof Float) {
            Intent putExtra3 = intent.putExtra(name, ((Number) t).floatValue());
            Intrinsics.checkNotNullExpressionValue(putExtra3, "putExtra(name, value)");
            return putExtra3;
        } else if (t instanceof Double) {
            Intent putExtra4 = intent.putExtra(name, ((Number) t).doubleValue());
            Intrinsics.checkNotNullExpressionValue(putExtra4, "putExtra(name, value)");
            return putExtra4;
        } else if (t instanceof Byte) {
            Intent putExtra5 = intent.putExtra(name, ((Number) t).byteValue());
            Intrinsics.checkNotNullExpressionValue(putExtra5, "putExtra(name, value)");
            return putExtra5;
        } else if (t instanceof Character) {
            Intent putExtra6 = intent.putExtra(name, ((Character) t).charValue());
            Intrinsics.checkNotNullExpressionValue(putExtra6, "putExtra(name, value)");
            return putExtra6;
        } else if (t instanceof int[]) {
            Intent putExtra7 = intent.putExtra(name, (int[]) t);
            Intrinsics.checkNotNullExpressionValue(putExtra7, "putExtra(name, value)");
            return putExtra7;
        } else if (t instanceof long[]) {
            Intent putExtra8 = intent.putExtra(name, (long[]) t);
            Intrinsics.checkNotNullExpressionValue(putExtra8, "putExtra(name, value)");
            return putExtra8;
        } else if (t instanceof float[]) {
            Intent putExtra9 = intent.putExtra(name, (float[]) t);
            Intrinsics.checkNotNullExpressionValue(putExtra9, "putExtra(name, value)");
            return putExtra9;
        } else if (t instanceof double[]) {
            Intent putExtra10 = intent.putExtra(name, (double[]) t);
            Intrinsics.checkNotNullExpressionValue(putExtra10, "putExtra(name, value)");
            return putExtra10;
        } else if (t instanceof byte[]) {
            Intent putExtra11 = intent.putExtra(name, (byte[]) t);
            Intrinsics.checkNotNullExpressionValue(putExtra11, "putExtra(name, value)");
            return putExtra11;
        } else if (t instanceof char[]) {
            Intent putExtra12 = intent.putExtra(name, (char[]) t);
            Intrinsics.checkNotNullExpressionValue(putExtra12, "putExtra(name, value)");
            return putExtra12;
        } else if (t instanceof String) {
            Intent putExtra13 = intent.putExtra(name, (String) t);
            Intrinsics.checkNotNullExpressionValue(putExtra13, "putExtra(name, value)");
            return putExtra13;
        } else if (t instanceof Bundle) {
            Intent putExtra14 = intent.putExtra(name, (Bundle) t);
            Intrinsics.checkNotNullExpressionValue(putExtra14, "putExtra(name, value)");
            return putExtra14;
        } else if (t instanceof Parcelable) {
            Intent putExtra15 = intent.putExtra(name, (Parcelable) t);
            Intrinsics.checkNotNullExpressionValue(putExtra15, "putExtra(name, value)");
            return putExtra15;
        } else if (t instanceof Enum) {
            Intent putExtra16 = intent.putExtra(name, ((Enum) t).name());
            Intrinsics.checkNotNullExpressionValue(putExtra16, "putExtra(name, value.name)");
            return putExtra16;
        } else if (t instanceof Serializable) {
            Intent putExtra17 = intent.putExtra(name, (Serializable) t);
            Intrinsics.checkNotNullExpressionValue(putExtra17, "putExtra(name, value)");
            return putExtra17;
        } else if (t instanceof CharSequence) {
            Intent putExtra18 = intent.putExtra(name, (CharSequence) t);
            Intrinsics.checkNotNullExpressionValue(putExtra18, "putExtra(name, value)");
            return putExtra18;
        } else if (t == null) {
            return intent;
        } else {
            Intrinsics.reifiedOperationMarker(4, "T");
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            throw new IllegalArgumentException("<T> of type " + orCreateKotlinClass + " is not supported.");
        }
    }

    @JvmName(name = "setArrayListParcelable")
    public static final /* synthetic */ <T extends Parcelable> Intent setArrayListParcelable(Intent intent, String name, ArrayList<T> value) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intent putParcelableArrayListExtra = intent.putParcelableArrayListExtra(name, value);
        Intrinsics.checkNotNullExpressionValue(putParcelableArrayListExtra, "putParcelableArrayListExtra(name, value)");
        return putParcelableArrayListExtra;
    }

    public static final /* synthetic */ <T> Intent intent(Context context, Uri uri, Pair<String, ?>... extras) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.reifiedOperationMarker(4, "T");
        Intent intent = new Intent(context, Object.class);
        intent.setData(uri);
        for (Pair<String, ?> pair : extras) {
            String component1 = pair.component1();
            Object component2 = pair.component2();
            if (component2 instanceof Integer) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Number) component2).intValue()), "putExtra(name, value)");
            } else if (component2 instanceof Long) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Number) component2).longValue()), "putExtra(name, value)");
            } else if (component2 instanceof Float) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Number) component2).floatValue()), "putExtra(name, value)");
            } else if (component2 instanceof Double) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Number) component2).doubleValue()), "putExtra(name, value)");
            } else if (component2 instanceof Byte) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Number) component2).byteValue()), "putExtra(name, value)");
            } else if (component2 instanceof Character) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Character) component2).charValue()), "putExtra(name, value)");
            } else if (component2 instanceof int[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (int[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof long[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (long[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof float[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (float[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof double[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (double[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof byte[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (byte[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof char[]) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (char[]) component2), "putExtra(name, value)");
            } else if (component2 instanceof String) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (String) component2), "putExtra(name, value)");
            } else if (component2 instanceof Bundle) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (Bundle) component2), "putExtra(name, value)");
            } else if (component2 instanceof Parcelable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (Parcelable) component2), "putExtra(name, value)");
            } else if (component2 instanceof Enum) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, ((Enum) component2).name()), "putExtra(name, value.name)");
            } else if (component2 instanceof Serializable) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (Serializable) component2), "putExtra(name, value)");
            } else if (component2 instanceof CharSequence) {
                Intrinsics.checkNotNullExpressionValue(intent.putExtra(component1, (CharSequence) component2), "putExtra(name, value)");
            } else if (component2 != null) {
                throw new IllegalArgumentException("<T> of type " + Reflection.getOrCreateKotlinClass(Object.class) + " is not supported.");
            }
        }
        return intent;
    }
}
