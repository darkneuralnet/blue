package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
@SourceDebugExtension({"SMAP\nKotlinTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTarget.kt\norg/jetbrains/kotlin/descriptors/annotations/KotlinTarget\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,140:1\n3792#2:141\n4307#2,2:142\n*S KotlinDebug\n*F\n+ 1 KotlinTarget.kt\norg/jetbrains/kotlin/descriptors/annotations/KotlinTarget\n*L\n81#1:141\n81#1:142,2\n*E\n"})
/* loaded from: classes8.dex */
public enum KotlinTarget {
    CLASS(Action.CLASS_ATTRIBUTE, false, 2, null),
    ANNOTATION_CLASS("annotation class", false, 2, null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, null),
    FIELD("field", false, 2, null),
    LOCAL_VARIABLE("local variable", false, 2, null),
    VALUE_PARAMETER("value parameter", false, 2, null),
    CONSTRUCTOR("constructor", false, 2, null),
    FUNCTION("function", false, 2, null),
    PROPERTY_GETTER("getter", false, 2, null),
    PROPERTY_SETTER("setter", false, 2, null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE("file", false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY(Action.CLASS_ATTRIBUTE, false),
    OBJECT("object", false),
    STANDALONE_OBJECT("standalone object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    BACKING_FIELD("backing field", false, 2, null),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);
    
    private static final Set<KotlinTarget> ALL_TARGET_SET;
    private static final List<KotlinTarget> ANNOTATION_CLASS_LIST;
    private static final List<KotlinTarget> CLASS_LIST;
    private static final List<KotlinTarget> COMPANION_OBJECT_LIST;
    private static final Set<KotlinTarget> DEFAULT_TARGET_SET;
    private static final List<KotlinTarget> ENUM_ENTRY_LIST;
    private static final List<KotlinTarget> ENUM_LIST;
    private static final List<KotlinTarget> FILE_LIST;
    private static final List<KotlinTarget> FUNCTION_LIST;
    private static final List<KotlinTarget> INTERFACE_LIST;
    private static final List<KotlinTarget> LOCAL_CLASS_LIST;
    private static final List<KotlinTarget> OBJECT_LIST;
    private static final List<KotlinTarget> PROPERTY_GETTER_LIST;
    private static final List<KotlinTarget> PROPERTY_SETTER_LIST;
    private static final Map<AnnotationUseSiteTarget, KotlinTarget> USE_SITE_MAPPING;
    private final String description;
    private final boolean isDefault;
    public static final Companion Companion = new Companion(null);
    private static final HashMap<String, KotlinTarget> map = new HashMap<>();

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        KotlinTarget[] values;
        Set<KotlinTarget> set;
        Set<KotlinTarget> set2;
        List<KotlinTarget> listOf;
        List<KotlinTarget> listOf2;
        List<KotlinTarget> listOf3;
        List<KotlinTarget> listOf4;
        List<KotlinTarget> listOf5;
        List<KotlinTarget> listOf6;
        List<KotlinTarget> listOf7;
        List<KotlinTarget> listOf8;
        List<KotlinTarget> listOf9;
        List<KotlinTarget> listOf10;
        List<KotlinTarget> listOf11;
        List<KotlinTarget> listOf12;
        Map<AnnotationUseSiteTarget, KotlinTarget> mapOf;
        for (KotlinTarget kotlinTarget : values()) {
            map.put(kotlinTarget.name(), kotlinTarget);
        }
        KotlinTarget[] values2 = values();
        ArrayList arrayList = new ArrayList();
        for (KotlinTarget kotlinTarget2 : values2) {
            if (kotlinTarget2.isDefault) {
                arrayList.add(kotlinTarget2);
            }
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        DEFAULT_TARGET_SET = set;
        set2 = ArraysKt___ArraysKt.toSet(values());
        ALL_TARGET_SET = set2;
        KotlinTarget kotlinTarget3 = CLASS;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{ANNOTATION_CLASS, kotlinTarget3});
        ANNOTATION_CLASS_LIST = listOf;
        listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{LOCAL_CLASS, kotlinTarget3});
        LOCAL_CLASS_LIST = listOf2;
        listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{CLASS_ONLY, kotlinTarget3});
        CLASS_LIST = listOf3;
        KotlinTarget kotlinTarget4 = OBJECT;
        listOf4 = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{COMPANION_OBJECT, kotlinTarget4, kotlinTarget3});
        COMPANION_OBJECT_LIST = listOf4;
        listOf5 = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{STANDALONE_OBJECT, kotlinTarget4, kotlinTarget3});
        OBJECT_LIST = listOf5;
        listOf6 = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{INTERFACE, kotlinTarget3});
        INTERFACE_LIST = listOf6;
        listOf7 = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{ENUM_CLASS, kotlinTarget3});
        ENUM_LIST = listOf7;
        KotlinTarget kotlinTarget5 = PROPERTY;
        KotlinTarget kotlinTarget6 = FIELD;
        listOf8 = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{ENUM_ENTRY, kotlinTarget5, kotlinTarget6});
        ENUM_ENTRY_LIST = listOf8;
        KotlinTarget kotlinTarget7 = PROPERTY_SETTER;
        listOf9 = CollectionsKt__CollectionsJVMKt.listOf(kotlinTarget7);
        PROPERTY_SETTER_LIST = listOf9;
        KotlinTarget kotlinTarget8 = PROPERTY_GETTER;
        listOf10 = CollectionsKt__CollectionsJVMKt.listOf(kotlinTarget8);
        PROPERTY_GETTER_LIST = listOf10;
        listOf11 = CollectionsKt__CollectionsJVMKt.listOf(FUNCTION);
        FUNCTION_LIST = listOf11;
        KotlinTarget kotlinTarget9 = FILE;
        listOf12 = CollectionsKt__CollectionsJVMKt.listOf(kotlinTarget9);
        FILE_LIST = listOf12;
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER;
        KotlinTarget kotlinTarget10 = VALUE_PARAMETER;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(annotationUseSiteTarget, kotlinTarget10), TuplesKt.m28425to(AnnotationUseSiteTarget.FIELD, kotlinTarget6), TuplesKt.m28425to(AnnotationUseSiteTarget.PROPERTY, kotlinTarget5), TuplesKt.m28425to(AnnotationUseSiteTarget.FILE, kotlinTarget9), TuplesKt.m28425to(AnnotationUseSiteTarget.PROPERTY_GETTER, kotlinTarget8), TuplesKt.m28425to(AnnotationUseSiteTarget.PROPERTY_SETTER, kotlinTarget7), TuplesKt.m28425to(AnnotationUseSiteTarget.RECEIVER, kotlinTarget10), TuplesKt.m28425to(AnnotationUseSiteTarget.SETTER_PARAMETER, kotlinTarget10), TuplesKt.m28425to(AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, kotlinTarget6));
        USE_SITE_MAPPING = mapOf;
    }

    KotlinTarget(String str, boolean z) {
        this.description = str;
        this.isDefault = z;
    }

    /* synthetic */ KotlinTarget(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
