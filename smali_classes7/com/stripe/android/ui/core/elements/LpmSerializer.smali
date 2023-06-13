.class public final Lcom/stripe/android/ui/core/elements/LpmSerializer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J$\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0016\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/LpmSerializer;",
        "",
        "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
        "data",
        "Lxi2;",
        "serialize",
        "",
        "str",
        "Lkotlin/Result;",
        "deserialize-IoAF18A",
        "(Ljava/lang/String;)Ljava/lang/Object;",
        "deserialize",
        "",
        "deserializeList",
        "Lbi2;",
        "format",
        "Lbi2;",
        "<init>",
        "()V",
        "payments-ui-core_release"
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
        "SMAP\nLpmSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LpmSerializer.kt\ncom/stripe/android/ui/core/elements/LpmSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"
    }
.end annotation


# instance fields
.field private final format:Lbi2;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/stripe/android/ui/core/elements/LpmSerializer$format$1;->INSTANCE:Lcom/stripe/android/ui/core/elements/LpmSerializer$format$1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, LJi2;->b(Lbi2;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lbi2;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/LpmSerializer;->format:Lbi2;

    return-void
.end method


# virtual methods
.method public final deserialize-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    const-string v0, "str"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/LpmSerializer;->format:Lbi2;

    sget-object v1, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->Companion:Lcom/stripe/android/ui/core/elements/SharedDataSpec$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/SharedDataSpec$Companion;->serializer()LKj2;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lbi2;->b(LE01;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    return-object p1
.end method

.method public final deserializeList(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
            ">;"
        }
    .end annotation

    const-string v0, "str"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/LpmSerializer;->format:Lbi2;

    new-instance v1, Lro;

    sget-object v2, Lcom/stripe/android/ui/core/elements/SharedDataSpec$$serializer;->INSTANCE:Lcom/stripe/android/ui/core/elements/SharedDataSpec$$serializer;

    invoke-direct {v1, v2}, Lro;-><init>(LKj2;)V

    invoke-virtual {v0, v1, p1}, Lbi2;->b(LE01;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const-string v0, "STRIPE"

    const-string v1, "Error parsing LPMs"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public final serialize(Lcom/stripe/android/ui/core/elements/SharedDataSpec;)Lxi2;
    .locals 2

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/LpmSerializer;->format:Lbi2;

    sget-object v1, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->Companion:Lcom/stripe/android/ui/core/elements/SharedDataSpec$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/SharedDataSpec$Companion;->serializer()LKj2;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lbi2;->c(Let5;Ljava/lang/Object;)Lxi2;

    move-result-object p1

    return-object p1
.end method
