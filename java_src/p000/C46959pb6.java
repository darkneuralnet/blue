package p000;

import co.bird.android.config.tweaks.dsl.Tweaks;
import com.facebook.share.internal.C17296a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.full.KClassifiers;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m28432d2 = {"Lpb6;", "LBb6;", "Lco/bird/android/config/tweaks/dsl/Tweaks;", "Lcom/google/gson/stream/JsonWriter;", "out", "value", "", "f", "Lcom/google/gson/stream/JsonReader;", "in", "e", C17296a.f69688o, "Lco/bird/android/config/tweaks/dsl/Tweaks;", "tweaks", "<init>", "(Lco/bird/android/config/tweaks/dsl/Tweaks;)V", "b", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTweaksTypeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksTypeAdapter.kt\nco/bird/android/config/tweaks/TweaksTypeAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,118:1\n766#2:119\n857#2,2:120\n1855#2,2:122\n1282#3,2:124\n*S KotlinDebug\n*F\n+ 1 TweaksTypeAdapter.kt\nco/bird/android/config/tweaks/TweaksTypeAdapter\n*L\n33#1:119\n33#1:120,2\n34#1:122,2\n96#1:124,2\n*E\n"})
/* renamed from: pb6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46959pb6 extends AbstractC31862Bb6<Tweaks> {

    /* renamed from: b */
    public static final C27320a f103837b = new C27320a(null);

    /* renamed from: a */
    public final Tweaks f103838a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m28432d2 = {"Lpb6$a;", "", "", "KEY", "Ljava/lang/String;", "TYPE", "VALUE", "<init>", "()V", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: pb6$a */
    /* loaded from: classes2.dex */
    public static final class C27320a {
        public /* synthetic */ C27320a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C27320a() {
        }
    }

    public C46959pb6(Tweaks tweaks) {
        Intrinsics.checkNotNullParameter(tweaks, "tweaks");
        this.f103838a = tweaks;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00da, code lost:
        if (r6.isEnum() == true) goto L41;
     */
    @Override // p000.AbstractC31862Bb6
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Tweaks read(JsonReader in) {
        Class cls;
        boolean z;
        Enum r11;
        String str;
        Intrinsics.checkNotNullParameter(in, "in");
        in.beginArray();
        HashMap hashMap = new HashMap();
        while (in.hasNext()) {
            in.beginObject();
            KClass kClass = null;
            String str2 = null;
            Object obj = null;
            while (true) {
                if (!in.hasNext()) {
                    break;
                }
                String nextName = in.nextName();
                if (nextName != null) {
                    int hashCode = nextName.hashCode();
                    if (hashCode != 106079) {
                        if (hashCode != 3575610) {
                            if (hashCode == 111972721 && nextName.equals("value")) {
                                if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                                    obj = Integer.valueOf(in.nextInt());
                                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(String.class))) {
                                    obj = in.nextString();
                                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                                    obj = Boolean.valueOf(in.nextBoolean());
                                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                                    obj = Long.valueOf(in.nextLong());
                                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                                    obj = Float.valueOf((float) in.nextDouble());
                                } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                                    obj = Double.valueOf(in.nextDouble());
                                } else {
                                    if (kClass != null) {
                                        cls = JvmClassMappingKt.getJavaClass(kClass);
                                    } else {
                                        cls = null;
                                    }
                                    if (cls != null) {
                                        z = true;
                                    }
                                    z = false;
                                    if (z) {
                                        String nextString = in.nextString();
                                        Object[] enumConstants = cls.getEnumConstants();
                                        if (enumConstants != null) {
                                            for (Object obj2 : enumConstants) {
                                                if (obj2 instanceof Enum) {
                                                    r11 = (Enum) obj2;
                                                } else {
                                                    r11 = null;
                                                }
                                                if (r11 != null) {
                                                    str = r11.name();
                                                } else {
                                                    str = null;
                                                }
                                                if (Intrinsics.areEqual(str, nextString)) {
                                                    obj = obj2;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    obj = null;
                                }
                            }
                        } else if (nextName.equals("type")) {
                            String nextString2 = in.nextString();
                            Class cls2 = Integer.TYPE;
                            if (Intrinsics.areEqual(nextString2, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(cls2), null, false, null, 7, null).toString())) {
                                kClass = Reflection.getOrCreateKotlinClass(cls2);
                            } else if (Intrinsics.areEqual(nextString2, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(String.class), null, false, null, 7, null).toString())) {
                                kClass = Reflection.getOrCreateKotlinClass(String.class);
                            } else {
                                Class cls3 = Boolean.TYPE;
                                if (Intrinsics.areEqual(nextString2, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(cls3), null, false, null, 7, null).toString())) {
                                    kClass = Reflection.getOrCreateKotlinClass(cls3);
                                } else {
                                    Class cls4 = Long.TYPE;
                                    if (Intrinsics.areEqual(nextString2, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(cls4), null, false, null, 7, null).toString())) {
                                        kClass = Reflection.getOrCreateKotlinClass(cls4);
                                    } else {
                                        Class cls5 = Float.TYPE;
                                        if (Intrinsics.areEqual(nextString2, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(cls5), null, false, null, 7, null).toString())) {
                                            kClass = Reflection.getOrCreateKotlinClass(cls5);
                                        } else if (Intrinsics.areEqual(nextString2, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Double.TYPE), null, false, null, 7, null).toString())) {
                                            kClass = Reflection.getOrCreateKotlinClass(Double.TYPE);
                                        } else {
                                            Class<?> cls6 = Class.forName(nextString2);
                                            Intrinsics.checkNotNullExpressionValue(cls6, "forName(typeString)");
                                            kClass = JvmClassMappingKt.getKotlinClass(cls6);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (nextName.equals("key")) {
                        str2 = in.nextString();
                    }
                }
                if (str2 != null && obj != null) {
                    hashMap.put(str2, obj);
                    in.endObject();
                    break;
                }
            }
        }
        in.endArray();
        this.f103838a.restoreTweaks(hashMap);
        return this.f103838a;
    }

    @Override // p000.AbstractC31862Bb6
    /* renamed from: f */
    public void write(JsonWriter out, Tweaks value) {
        boolean z;
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(value, "value");
        out.beginArray();
        ArrayList<C35597Ra6> arrayList = new ArrayList();
        for (Object obj : value.tweaks()) {
            if (((C35597Ra6) obj).m86599e() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        for (C35597Ra6 c35597Ra6 : arrayList) {
            out.beginObject();
            out.name("key").value(c35597Ra6.m86601c());
            out.name("type").value(c35597Ra6.m86600d().toString());
            JsonWriter name = out.name("value");
            String obj2 = c35597Ra6.m86600d().toString();
            if (Intrinsics.areEqual(obj2, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Integer.TYPE), null, false, null, 7, null).toString())) {
                Object m86599e = c35597Ra6.m86599e();
                Intrinsics.checkNotNull(m86599e, "null cannot be cast to non-null type kotlin.Int");
                name.value((Integer) m86599e);
            } else if (Intrinsics.areEqual(obj2, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(String.class), null, false, null, 7, null).toString())) {
                Object m86599e2 = c35597Ra6.m86599e();
                Intrinsics.checkNotNull(m86599e2, "null cannot be cast to non-null type kotlin.String");
                name.value((String) m86599e2);
            } else if (Intrinsics.areEqual(obj2, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Boolean.TYPE), null, false, null, 7, null).toString())) {
                Object m86599e3 = c35597Ra6.m86599e();
                Intrinsics.checkNotNull(m86599e3, "null cannot be cast to non-null type kotlin.Boolean");
                name.value(((Boolean) m86599e3).booleanValue());
            } else if (Intrinsics.areEqual(obj2, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Float.TYPE), null, false, null, 7, null).toString())) {
                Object m86599e4 = c35597Ra6.m86599e();
                Intrinsics.checkNotNull(m86599e4, "null cannot be cast to non-null type kotlin.Float");
                name.value(((Float) m86599e4).floatValue());
            } else if (Intrinsics.areEqual(obj2, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Long.TYPE), null, false, null, 7, null).toString())) {
                Object m86599e5 = c35597Ra6.m86599e();
                Intrinsics.checkNotNull(m86599e5, "null cannot be cast to non-null type kotlin.Long");
                name.value(((Long) m86599e5).longValue());
            } else if (Intrinsics.areEqual(obj2, KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Double.TYPE), null, false, null, 7, null).toString())) {
                Object m86599e6 = c35597Ra6.m86599e();
                Intrinsics.checkNotNull(m86599e6, "null cannot be cast to non-null type kotlin.Double");
                name.value(((Double) m86599e6).doubleValue());
            } else if (Class.forName(c35597Ra6.m86600d().toString()).isEnum()) {
                Object m86599e7 = c35597Ra6.m86599e();
                Intrinsics.checkNotNull(m86599e7, "null cannot be cast to non-null type kotlin.Enum<*>");
                name.value(((Enum) m86599e7).name());
            } else {
                name.nullValue();
            }
            out.endObject();
        }
        out.endArray();
    }
}
