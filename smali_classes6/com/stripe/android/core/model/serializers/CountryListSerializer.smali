.class public final Lcom/stripe/android/core/model/serializers/CountryListSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKj2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LKj2<",
        "Ljava/util/List<",
        "+",
        "Lcom/stripe/android/core/model/Country;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c7\u0002\u0018\u00002\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u0016\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0008\u001a\u00020\u00072\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R \u0010\r\u001a\u00020\u000c8\u0016X\u0096\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u0012\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/core/model/serializers/CountryListSerializer;",
        "LKj2;",
        "",
        "Lcom/stripe/android/core/model/Country;",
        "LGV0;",
        "decoder",
        "deserialize",
        "Lrb1;",
        "encoder",
        "value",
        "",
        "serialize",
        "LMs5;",
        "descriptor",
        "LMs5;",
        "getDescriptor",
        "()LMs5;",
        "getDescriptor$annotations",
        "()V",
        "<init>",
        "stripe-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCountryListSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryListSerializer.kt\ncom/stripe/android/core/model/serializers/CountryListSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 4 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,53:1\n488#2,2:54\n490#2,2:58\n32#3,2:56\n193#4:60\n*S KotlinDebug\n*F\n+ 1 CountryListSerializer.kt\ncom/stripe/android/core/model/serializers/CountryListSerializer\n*L\n43#1:54,2\n43#1:58,2\n46#1:56,2\n21#1:60\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/core/model/serializers/CountryListSerializer;

.field private static final descriptor:LMs5;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/core/model/serializers/CountryListSerializer;

    invoke-direct {v0}, Lcom/stripe/android/core/model/serializers/CountryListSerializer;-><init>()V

    sput-object v0, Lcom/stripe/android/core/model/serializers/CountryListSerializer;->INSTANCE:Lcom/stripe/android/core/model/serializers/CountryListSerializer;

    sget-object v0, LgS5;->a:LgS5;

    invoke-interface {v0}, LKj2;->getDescriptor()LMs5;

    move-result-object v1

    invoke-interface {v0}, LKj2;->getDescriptor()LMs5;

    move-result-object v0

    invoke-static {v1, v0}, LQs5;->d(LMs5;LMs5;)LMs5;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/core/model/serializers/CountryListSerializer;->descriptor:LMs5;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic getDescriptor$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public bridge synthetic deserialize(LGV0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/core/model/serializers/CountryListSerializer;->deserialize(LGV0;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public deserialize(LGV0;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGV0;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/core/model/Country;",
            ">;"
        }
    .end annotation

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/stripe/android/core/model/serializers/CountryListSerializer;->getDescriptor()LMs5;

    move-result-object v1

    invoke-interface {p1, v1}, LGV0;->b(LMs5;)LTt0;

    move-result-object p1

    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/core/model/serializers/CountryListSerializer;->getDescriptor()LMs5;

    move-result-object v1

    invoke-interface {p1, v1}, LTt0;->q(LMs5;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/core/model/serializers/CountryListSerializer;->getDescriptor()LMs5;

    move-result-object v2

    invoke-interface {p1, v2, v1}, LTt0;->e(LMs5;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/stripe/android/core/model/serializers/CountryListSerializer;->getDescriptor()LMs5;

    move-result-object v2

    invoke-virtual {p0}, Lcom/stripe/android/core/model/serializers/CountryListSerializer;->getDescriptor()LMs5;

    move-result-object v3

    invoke-interface {p1, v3}, LTt0;->q(LMs5;)I

    move-result v3

    invoke-interface {p1, v2, v3}, LTt0;->e(LMs5;I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/core/model/Country;

    new-instance v4, Lcom/stripe/android/core/model/CountryCode;

    invoke-direct {v4, v1}, Lcom/stripe/android/core/model/CountryCode;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4, v2}, Lcom/stripe/android/core/model/Country;-><init>(Lcom/stripe/android/core/model/CountryCode;Ljava/lang/String;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/core/model/serializers/CountryListSerializer;->getDescriptor()LMs5;

    move-result-object v1

    invoke-interface {p1, v1}, LTt0;->a(LMs5;)V

    return-object v0
.end method

.method public getDescriptor()LMs5;
    .locals 1

    sget-object v0, Lcom/stripe/android/core/model/serializers/CountryListSerializer;->descriptor:LMs5;

    return-object v0
.end method

.method public bridge synthetic serialize(Lrb1;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/core/model/serializers/CountryListSerializer;->serialize(Lrb1;Ljava/util/List;)V

    return-void
.end method

.method public serialize(Lrb1;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrb1;",
            "Ljava/util/List<",
            "Lcom/stripe/android/core/model/Country;",
            ">;)V"
        }
    .end annotation

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/core/model/serializers/CountryListSerializer;->getDescriptor()LMs5;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p1, v0, v1}, Lrb1;->z(LMs5;I)LUt0;

    move-result-object p1

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/core/model/Country;

    invoke-virtual {v2}, Lcom/stripe/android/core/model/Country;->component1()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v3

    invoke-virtual {v2}, Lcom/stripe/android/core/model/Country;->component2()Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lcom/stripe/android/core/model/serializers/CountryListSerializer;->INSTANCE:Lcom/stripe/android/core/model/serializers/CountryListSerializer;

    invoke-virtual {v4}, Lcom/stripe/android/core/model/serializers/CountryListSerializer;->getDescriptor()LMs5;

    move-result-object v5

    add-int/lit8 v6, v1, 0x1

    invoke-virtual {v3}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v5, v1, v3}, LUt0;->w(LMs5;ILjava/lang/String;)V

    invoke-virtual {v4}, Lcom/stripe/android/core/model/serializers/CountryListSerializer;->getDescriptor()LMs5;

    move-result-object v1

    add-int/lit8 v3, v6, 0x1

    invoke-interface {p1, v1, v6, v2}, LUt0;->w(LMs5;ILjava/lang/String;)V

    move v1, v3

    goto :goto_0

    :cond_0
    invoke-interface {p1, v0}, LUt0;->a(LMs5;)V

    return-void
.end method
