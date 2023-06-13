package kotlin.reflect.full;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KClass;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a \u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b¢\u0006\u0002\u0010\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b\u001a*\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00010\bH\u0007\u001a\u0019\u0010\t\u001a\u00020\n\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b¨\u0006\u000b"}, m28432d2 = {"findAnnotation", "T", "", "Lkotlin/reflect/KAnnotatedElement;", "(Lkotlin/reflect/KAnnotatedElement;)Ljava/lang/annotation/Annotation;", "findAnnotations", "", "klass", "Lkotlin/reflect/KClass;", "hasAnnotation", "", "kotlin-reflection"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@JvmName(name = "KAnnotatedElements")
@SourceDebugExtension({"SMAP\nKAnnotatedElements.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KAnnotatedElements.kt\nkotlin/reflect/full/KAnnotatedElements\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n20#1:105\n288#2,2:103\n288#2,2:106\n288#2,2:108\n*S KotlinDebug\n*F\n+ 1 KAnnotatedElements.kt\nkotlin/reflect/full/KAnnotatedElements\n*L\n29#1:105\n20#1:103,2\n29#1:106,2\n62#1:108,2\n*E\n"})
/* loaded from: classes8.dex */
public final class KAnnotatedElements {
    @SinceKotlin(version = "1.1")
    public static final /* synthetic */ <T extends Annotation> T findAnnotation(KAnnotatedElement kAnnotatedElement) {
        Object obj;
        Intrinsics.checkNotNullParameter(kAnnotatedElement, "<this>");
        Iterator<T> it = kAnnotatedElement.getAnnotations().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Intrinsics.reifiedOperationMarker(3, "T");
                if (((Annotation) obj) instanceof Annotation) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Intrinsics.reifiedOperationMarker(1, "T?");
        return (T) obj;
    }

    @SinceKotlin(version = "1.7")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final /* synthetic */ <T extends Annotation> List<T> findAnnotations(KAnnotatedElement kAnnotatedElement) {
        Intrinsics.checkNotNullParameter(kAnnotatedElement, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        return findAnnotations(kAnnotatedElement, Reflection.getOrCreateKotlinClass(Annotation.class));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final /* synthetic */ <T extends Annotation> boolean hasAnnotation(KAnnotatedElement kAnnotatedElement) {
        Object obj;
        Intrinsics.checkNotNullParameter(kAnnotatedElement, "<this>");
        Iterator<T> it = kAnnotatedElement.getAnnotations().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Intrinsics.reifiedOperationMarker(3, "T");
                if (((Annotation) obj) instanceof Annotation) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Intrinsics.reifiedOperationMarker(1, "T?");
        if (((Annotation) obj) != null) {
            return true;
        }
        return false;
    }

    @SinceKotlin(version = "1.7")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T extends Annotation> List<T> findAnnotations(KAnnotatedElement kAnnotatedElement, KClass<T> klass) {
        List<T> filterIsInstance;
        List<T> emptyList;
        Object obj;
        List<T> asList;
        Intrinsics.checkNotNullParameter(kAnnotatedElement, "<this>");
        Intrinsics.checkNotNullParameter(klass, "klass");
        filterIsInstance = CollectionsKt___CollectionsJvmKt.filterIsInstance(kAnnotatedElement.getAnnotations(), JvmClassMappingKt.getJavaClass((KClass) klass));
        if (!filterIsInstance.isEmpty()) {
            return filterIsInstance;
        }
        Class<? extends Annotation> loadRepeatableContainer = Java8RepeatableContainerLoader.INSTANCE.loadRepeatableContainer(JvmClassMappingKt.getJavaClass((KClass) klass));
        if (loadRepeatableContainer != null) {
            Iterator<T> it = kAnnotatedElement.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass((Annotation) obj)), loadRepeatableContainer)) {
                    break;
                }
            }
            Annotation annotation = (Annotation) obj;
            if (annotation != null) {
                Object invoke = annotation.getClass().getMethod("value", new Class[0]).invoke(annotation, new Object[0]);
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.Array<T of kotlin.reflect.full.KAnnotatedElements.findAnnotations>");
                asList = ArraysKt___ArraysJvmKt.asList((Annotation[]) invoke);
                return asList;
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }
}