package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.annotation.Annotation;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC36226Ts5;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a'\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b*\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u001a\u0014\u0010\u0019\u001a\u00020\u0004*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¨\u0006\u001a"}, m28432d2 = {"Let5;", "serializer", "", "actualSerializer", "", "classDiscriminator", "", "f", "LTs5;", "kind", "b", "T", "Lsi2;", "LE01;", "deserializer", DateTokenConverter.CONVERTER_KEY, "(Lsi2;LE01;)Ljava/lang/Object;", "type", "LSi2;", "jsonTree", "", "e", "LMs5;", "Lbi2;", "json", "c", "kotlinx-serialization-json"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPolymorphic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 2 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n*L\n1#1,92:1\n247#2,7:93\n*S KotlinDebug\n*F\n+ 1 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n*L\n65#1:93,7\n*E\n"})
/* renamed from: PX3 */
/* loaded from: classes8.dex */
public final class PX3 {
    /* renamed from: b */
    public static final void m90161b(AbstractC36226Ts5 kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (!(kind instanceof AbstractC36226Ts5.C8136b)) {
            if (!(kind instanceof E24)) {
                if (!(kind instanceof OX3)) {
                    return;
                }
                throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
            }
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
    }

    /* renamed from: c */
    public static final String m90160c(InterfaceC34588Ms5 interfaceC34588Ms5, AbstractC38706bi2 json) {
        Intrinsics.checkNotNullParameter(interfaceC34588Ms5, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : interfaceC34588Ms5.getAnnotations()) {
            if (annotation instanceof InterfaceC42874ii2) {
                return ((InterfaceC42874ii2) annotation).discriminator();
            }
        }
        return json.m64102e().m30071c();
    }

    /* renamed from: d */
    public static final <T> T m90159d(InterfaceC48803si2 interfaceC48803si2, E01<? extends T> deserializer) {
        String str;
        AbstractC37303Yi2 m521l;
        Intrinsics.checkNotNullParameter(interfaceC48803si2, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if ((deserializer instanceof AbstractC12270b1) && !interfaceC48803si2.mo13803d().m64102e().m30062l()) {
            String m90160c = m90160c(deserializer.getDescriptor(), interfaceC48803si2.mo13803d());
            AbstractC51767xi2 mo13802v = interfaceC48803si2.mo13802v();
            InterfaceC34588Ms5 descriptor = deserializer.getDescriptor();
            if (mo13802v instanceof C35899Si2) {
                C35899Si2 c35899Si2 = (C35899Si2) mo13802v;
                AbstractC51767xi2 abstractC51767xi2 = (AbstractC51767xi2) c35899Si2.get(m90160c);
                if (abstractC51767xi2 != null && (m521l = C52953zi2.m521l(abstractC51767xi2)) != null) {
                    str = m521l.mo74434a();
                } else {
                    str = null;
                }
                E01<T> mo29846c = ((AbstractC12270b1) deserializer).mo29846c(interfaceC48803si2, str);
                if (mo29846c != null) {
                    return (T) C45170ma6.m25405b(interfaceC48803si2.mo13803d(), m90160c, c35899Si2, mo29846c);
                }
                m90158e(str, c35899Si2);
                throw new KotlinNothingValueException();
            }
            throw C32857Fi2.m106731e(-1, "Expected " + Reflection.getOrCreateKotlinClass(C35899Si2.class) + " as the serialized body of " + descriptor.mo10456h() + ", but had " + Reflection.getOrCreateKotlinClass(mo13802v.getClass()));
        }
        return deserializer.deserialize(interfaceC48803si2);
    }

    @JvmName(name = "throwSerializerNotFound")
    /* renamed from: e */
    public static final Void m90158e(String str, C35899Si2 jsonTree) {
        String str2;
        Intrinsics.checkNotNullParameter(jsonTree, "jsonTree");
        if (str == null) {
            str2 = "missing class discriminator ('null')";
        } else {
            str2 = "class discriminator '" + str + CoreConstants.SINGLE_QUOTE_CHAR;
        }
        throw C32857Fi2.m106730f(-1, "Polymorphic serializer was not found for " + str2, jsonTree.toString());
    }

    /* renamed from: f */
    public static final void m90157f(InterfaceC40615et5<?> interfaceC40615et5, InterfaceC40615et5<Object> interfaceC40615et52, String str) {
        if (!(interfaceC40615et5 instanceof C43550jq5) || !C33559Ii2.m101757a(interfaceC40615et52.getDescriptor()).contains(str)) {
            return;
        }
        String mo10456h = interfaceC40615et5.getDescriptor().mo10456h();
        String mo10456h2 = interfaceC40615et52.getDescriptor().mo10456h();
        throw new IllegalStateException(("Sealed class '" + mo10456h2 + "' cannot be serialized as base class '" + mo10456h + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
    }
}
