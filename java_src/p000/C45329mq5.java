package p000;

import com.facebook.share.internal.C17296a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.full.KClassifiers;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"Lmq5;", "", "T", "LBb6;", "Lcom/google/gson/stream/JsonReader;", "jsonReader", "read", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;", "Lcom/google/gson/stream/JsonWriter;", "out", "value", "", "write", "(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V", "Lkotlin/reflect/KClass;", C17296a.f69688o, "Lkotlin/reflect/KClass;", "kclass", "LoE1;", "b", "LoE1;", "gson", "LCb6;", "c", "LCb6;", "factory", "<init>", "(Lkotlin/reflect/KClass;LoE1;LCb6;)V", "co.bird.android.lib.persistence.common"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSealedClassTypeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SealedClassTypeAdapter.kt\nco/bird/android/persistence/common/impl/serialization/SealedClassTypeAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n288#2,2:52\n*S KotlinDebug\n*F\n+ 1 SealedClassTypeAdapter.kt\nco/bird/android/persistence/common/impl/serialization/SealedClassTypeAdapter\n*L\n23#1:52,2\n*E\n"})
/* renamed from: mq5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45329mq5<T> extends AbstractC31862Bb6<T> {

    /* renamed from: a */
    public final KClass<Object> f98888a;

    /* renamed from: b */
    public final C46153oE1 f98889b;

    /* renamed from: c */
    public final InterfaceC32096Cb6 f98890c;

    public C45329mq5(KClass<Object> kclass, C46153oE1 gson, InterfaceC32096Cb6 factory) {
        Intrinsics.checkNotNullParameter(kclass, "kclass");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f98888a = kclass;
        this.f98889b = gson;
        this.f98890c = factory;
    }

    @Override // p000.AbstractC31862Bb6
    public T read(JsonReader jsonReader) {
        Object obj;
        T t;
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        jsonReader.beginObject();
        String nextName = jsonReader.nextName();
        Iterator<T> it = this.f98888a.getSealedSubclasses().iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                t = it.next();
                if (Intrinsics.areEqual(KClassifiers.createType$default((KClass) t, null, false, null, 7, null).toString(), nextName)) {
                    break;
                }
            } else {
                t = null;
                break;
            }
        }
        KClass kClass = (KClass) t;
        if (kClass != null) {
            AbstractC31862Bb6<T> m21551r = this.f98889b.m21551r(this.f98890c, C32798Fb6.get(JvmClassMappingKt.getJavaClass(kClass)));
            Intrinsics.checkNotNull(m21551r, "null cannot be cast to non-null type com.google.gson.TypeAdapter<T of co.bird.android.persistence.common.impl.serialization.SealedClassTypeAdapter>");
            T sealedObject = m21551r.read(jsonReader);
            jsonReader.endObject();
            Object objectInstance = kClass.getObjectInstance();
            if (objectInstance != null) {
                obj = objectInstance;
            }
            if (obj == null) {
                Intrinsics.checkNotNullExpressionValue(sealedObject, "sealedObject");
                return sealedObject;
            }
            return (T) obj;
        }
        throw new Exception(nextName + " is not found to be a subclass of the sealed class " + this.f98888a.getQualifiedName());
    }

    @Override // p000.AbstractC31862Bb6
    public void write(JsonWriter out, T t) {
        Intrinsics.checkNotNullParameter(out, "out");
        if (t == null) {
            out.nullValue();
            return;
        }
        AbstractC31862Bb6<T> m21551r = this.f98889b.m21551r(this.f98890c, C32798Fb6.get((Class) t.getClass()));
        Intrinsics.checkNotNull(m21551r, "null cannot be cast to non-null type com.google.gson.TypeAdapter<T of co.bird.android.persistence.common.impl.serialization.SealedClassTypeAdapter>");
        String m113813b = m21551r.m113813b(t);
        out.beginObject();
        out.name(KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(t.getClass()), null, false, null, 7, null).toString()).jsonValue(m113813b);
        out.endObject();
    }
}
