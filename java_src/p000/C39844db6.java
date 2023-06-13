package p000;

import co.bird.android.config.tweaks.dsl.Tweaks;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.full.KClassifiers;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, m28432d2 = {"Ldb6;", "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;", "Lco/bird/android/config/tweaks/dsl/Tweaks;", "Lcom/fasterxml/jackson/core/JsonParser;", "p", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "ctxt", C17296a.f69688o, "b", "Lco/bird/android/config/tweaks/dsl/Tweaks;", "tweaks", "<init>", "(Lco/bird/android/config/tweaks/dsl/Tweaks;)V", "c", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTweaksMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksMapper.kt\nco/bird/android/config/tweaks/TweaksDeserializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1549#2:96\n1620#2,2:97\n1622#2:101\n1282#3,2:99\n1#4:102\n*S KotlinDebug\n*F\n+ 1 TweaksMapper.kt\nco/bird/android/config/tweaks/TweaksDeserializer\n*L\n70#1:96\n70#1:97,2\n70#1:101\n82#1:99,2\n*E\n"})
/* renamed from: db6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39844db6 extends StdDeserializer<Tweaks> {

    /* renamed from: c */
    public static final C19806a f76858c = new C19806a(null);

    /* renamed from: d */
    public static final String f76859d = KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Integer.TYPE), null, false, null, 7, null).toString();

    /* renamed from: e */
    public static final String f76860e = KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(String.class), null, false, null, 7, null).toString();

    /* renamed from: f */
    public static final String f76861f = KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Boolean.TYPE), null, false, null, 7, null).toString();

    /* renamed from: g */
    public static final String f76862g = KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Float.TYPE), null, false, null, 7, null).toString();

    /* renamed from: h */
    public static final String f76863h = KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Long.TYPE), null, false, null, 7, null).toString();

    /* renamed from: i */
    public static final String f76864i = KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Double.TYPE), null, false, null, 7, null).toString();

    /* renamed from: b */
    public final Tweaks f76865b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, m28432d2 = {"Ldb6$a;", "", "", "booleanTypeString", "Ljava/lang/String;", "doubleTypeString", "floatTypeString", "intTypeString", "longTypeString", "stringTypeString", "<init>", "()V", "config_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: db6$a */
    /* loaded from: classes2.dex */
    public static final class C19806a {
        public /* synthetic */ C19806a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C19806a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39844db6(Tweaks tweaks) {
        super(Tweaks.class);
        Intrinsics.checkNotNullParameter(tweaks, "tweaks");
        this.f76865b = tweaks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: a */
    public Tweaks deserialize(JsonParser p, DeserializationContext ctxt) {
        int collectionSizeOrDefault;
        Map<String, ?> map;
        Object obj;
        Object[] enumConstants;
        Enum r8;
        String str;
        Intrinsics.checkNotNullParameter(p, "p");
        Intrinsics.checkNotNullParameter(ctxt, "ctxt");
        JsonNode node = (JsonNode) p.getCodec().readTree(p);
        Intrinsics.checkNotNullExpressionValue(node, "node");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(node, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (JsonNode jsonNode : node) {
            String asText = jsonNode.get("key").asText();
            String asText2 = jsonNode.get("type").asText();
            if (Intrinsics.areEqual(asText2, f76859d)) {
                obj = Integer.valueOf(jsonNode.get("value").asInt());
            } else if (Intrinsics.areEqual(asText2, f76860e)) {
                obj = jsonNode.get("value").asText();
            } else if (Intrinsics.areEqual(asText2, f76861f)) {
                obj = Boolean.valueOf(jsonNode.get("value").asBoolean());
            } else if (Intrinsics.areEqual(asText2, f76862g)) {
                obj = Float.valueOf((float) jsonNode.get("value").asDouble());
            } else if (Intrinsics.areEqual(asText2, f76863h)) {
                obj = Long.valueOf(jsonNode.get("value").asLong());
            } else if (Intrinsics.areEqual(asText2, f76864i)) {
                obj = Double.valueOf(jsonNode.get("value").asDouble());
            } else {
                Class<?> cls = Class.forName(asText2);
                if (cls.isEnum() && (enumConstants = cls.getEnumConstants()) != null) {
                    Intrinsics.checkNotNullExpressionValue(enumConstants, "enumConstants");
                    for (Object[] objArr : enumConstants) {
                        if (objArr instanceof Enum) {
                            r8 = (Enum) objArr;
                        } else {
                            r8 = null;
                        }
                        if (r8 != null) {
                            str = r8.name();
                        } else {
                            str = null;
                        }
                        if (Intrinsics.areEqual(str, jsonNode.get("value").asText())) {
                            obj = objArr;
                            break;
                        }
                    }
                }
                obj = null;
            }
            arrayList.add(TuplesKt.m28425to(asText, obj));
        }
        map = MapsKt__MapsKt.toMap(arrayList);
        this.f76865b.restoreTweaks(map);
        return this.f76865b;
    }
}
