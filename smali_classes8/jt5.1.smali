.class public final synthetic Ljt5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0007\u00a8\u0006\u0005"
    }
    d2 = {
        "",
        "T",
        "Lkotlin/reflect/KClass;",
        "LKj2;",
        "a",
        "kotlinx-serialization-core"
    }
    k = 0x5
    mv = {
        0x1,
        0x8,
        0x0
    }
    xs = "kotlinx/serialization/SerializersKt"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,303:1\n80#2:304\n80#2:305\n80#2:311\n1549#3:306\n1620#3,2:307\n1622#3:310\n1549#3:312\n1620#3,3:313\n1549#3:316\n1620#3,3:317\n1#4:309\n37#5,2:320\n*S KotlinDebug\n*F\n+ 1 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n*L\n35#1:304\n54#1:305\n164#1:311\n138#1:306\n138#1:307,2\n138#1:310\n175#1:312\n175#1:313,3\n177#1:316\n177#1:317,3\n242#1:320,2\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lkotlin/reflect/KClass;)LKj2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/reflect/KClass<",
            "TT;>;)",
            "LKj2<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LAV3;->b(Lkotlin/reflect/KClass;)LKj2;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, LM24;->b(Lkotlin/reflect/KClass;)LKj2;

    move-result-object v0

    :cond_0
    return-object v0
.end method
