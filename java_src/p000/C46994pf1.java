package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.annotation.SerializedEnumDefault;
import com.facebook.share.internal.C17296a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Enum;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001f\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R0\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u00000\u0012j\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u0000`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R0\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0012j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0018\u0010\u001c\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006!"}, m28432d2 = {"Lpf1;", "", "E", "LBb6;", "Lcom/google/gson/stream/JsonReader;", "reader", "e", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Enum;", "Lcom/google/gson/stream/JsonWriter;", "writer", "value", "", "f", "(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Enum;)V", "", C17296a.f69688o, "Ljava/lang/String;", "unknown", "Ljava/util/HashMap;", "LZj2;", "Lkotlin/collections/HashMap;", "b", "Ljava/util/HashMap;", "nameToEnum", "c", "enumToName", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Enum;", "enumDefaultConstant", "Ljava/lang/Class;", "clazz", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "gson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEnumTypeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumTypeAdapter.kt\nco/bird/gson/android/typeadapters/EnumTypeAdapter\n+ 2 EnumTypeAdapter.kt\nco/bird/gson/android/typeadapters/EnumTypeAdapterKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,117:1\n81#2,4:118\n81#2,4:122\n1#3:126\n11335#4:127\n11670#4,3:128\n*S KotlinDebug\n*F\n+ 1 EnumTypeAdapter.kt\nco/bird/gson/android/typeadapters/EnumTypeAdapter\n*L\n31#1:118,4\n37#1:122,4\n45#1:127\n45#1:128,3\n*E\n"})
/* renamed from: pf1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46994pf1<E extends Enum<E>> extends AbstractC31862Bb6<E> {

    /* renamed from: a */
    public final String f103887a;

    /* renamed from: b */
    public final HashMap<C37546Zj2, E> f103888b;

    /* renamed from: c */
    public final HashMap<E, String> f103889c;

    /* renamed from: d */
    public E f103890d;

    public /* synthetic */ C46994pf1(Class cls, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, (i & 2) != 0 ? "UNKNOWN" : str);
    }

    @Override // p000.AbstractC31862Bb6
    /* renamed from: e */
    public E read(JsonReader reader) throws IOException {
        C37546Zj2 m17267b;
        C37546Zj2 m17267b2;
        Intrinsics.checkNotNullParameter(reader, "reader");
        if (reader.peek() == JsonToken.NULL) {
            reader.nextNull();
            return null;
        }
        String nextString = reader.nextString();
        Intrinsics.checkNotNullExpressionValue(nextString, "reader.nextString()");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = nextString.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        HashMap<C37546Zj2, E> hashMap = this.f103888b;
        m17267b = C47587qf1.m17267b(lowerCase);
        E e = hashMap.get(m17267b);
        if (e == null) {
            HashMap<C37546Zj2, E> hashMap2 = this.f103888b;
            m17267b2 = C47587qf1.m17267b(this.f103887a);
            return hashMap2.get(m17267b2);
        }
        return e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r4 != false) goto L6;
     */
    @Override // p000.AbstractC31862Bb6
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void write(JsonWriter writer, E e) throws IOException {
        boolean z;
        Intrinsics.checkNotNullParameter(writer, "writer");
        String str = this.f103889c.get(e);
        if (str != null) {
            if (e != null) {
                z = true;
            } else {
                z = false;
            }
        }
        str = null;
        writer.value(str);
    }

    public C46994pf1(Class<E> clazz, String unknown) {
        C37546Zj2 m17267b;
        Annotation annotation;
        String lowerCase;
        C37546Zj2 m17267b2;
        boolean equals;
        C37546Zj2 m17267b3;
        Annotation annotation2;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(unknown, "unknown");
        this.f103887a = unknown;
        this.f103888b = new HashMap<>();
        this.f103889c = new HashMap<>();
        E[] enumConstants = clazz.getEnumConstants();
        if (enumConstants != null) {
            for (E e : enumConstants) {
                try {
                    annotation = clazz.getField(e.name()).getAnnotation(InterfaceC41208ft5.class);
                } catch (NoSuchFieldException unused) {
                    annotation = null;
                }
                InterfaceC41208ft5 interfaceC41208ft5 = (InterfaceC41208ft5) annotation;
                if (interfaceC41208ft5 == null || (lowerCase = interfaceC41208ft5.value()) == null) {
                    String name = e.name();
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    lowerCase = name.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                }
                if (this.f103890d == null) {
                    try {
                        annotation2 = clazz.getField(e.name()).getAnnotation(SerializedEnumDefault.class);
                    } catch (NoSuchFieldException unused2) {
                        annotation2 = null;
                    }
                    this.f103890d = Boolean.valueOf(annotation2 != null).booleanValue() ? e : null;
                }
                HashMap<C37546Zj2, E> hashMap = this.f103888b;
                m17267b2 = C47587qf1.m17267b(lowerCase);
                if (hashMap.put(m17267b2, e) == null) {
                    this.f103889c.put(e, lowerCase);
                    if (interfaceC41208ft5 != null) {
                        String[] alternate = interfaceC41208ft5.alternate();
                        ArrayList<String> arrayList = new ArrayList(alternate.length);
                        for (String str : alternate) {
                            Locale US2 = Locale.US;
                            Intrinsics.checkNotNullExpressionValue(US2, "US");
                            String lowerCase2 = str.toLowerCase(US2);
                            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                            arrayList.add(lowerCase2);
                        }
                        for (String str2 : arrayList) {
                            HashMap<C37546Zj2, E> hashMap2 = this.f103888b;
                            m17267b3 = C47587qf1.m17267b(str2);
                            if (hashMap2.put(m17267b3, e) != null) {
                                C47587qf1.m17268a(str2);
                                throw new KotlinNothingValueException();
                            }
                        }
                    }
                    equals = StringsKt__StringsJVMKt.equals(e.name(), this.f103887a, true);
                    if (equals && this.f103890d == null) {
                        this.f103890d = e;
                    }
                } else {
                    C47587qf1.m17268a(lowerCase);
                    throw new KotlinNothingValueException();
                }
            }
            E e2 = this.f103890d;
            if (e2 != null) {
                HashMap<C37546Zj2, E> hashMap3 = this.f103888b;
                m17267b = C47587qf1.m17267b(this.f103887a);
                hashMap3.put(m17267b, e2);
            }
        }
    }
}
