.class public final Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/LinkActivityViewModel$Factory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FallbackInitializeParam"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0016\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0080\u0008\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000c\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000f\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000cH\u00c6\u0003JM\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000cH\u00c6\u0001J\u0013\u0010 \u001a\u00020\u00072\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0015\u00a8\u0006%"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;",
        "",
        "application",
        "Landroid/app/Application;",
        "starterArgs",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "enableLogging",
        "",
        "publishableKey",
        "",
        "stripeAccountId",
        "productUsage",
        "",
        "(Landroid/app/Application;Lcom/stripe/android/link/LinkActivityContract$Args;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Set;)V",
        "getApplication",
        "()Landroid/app/Application;",
        "getEnableLogging",
        "()Z",
        "getProductUsage",
        "()Ljava/util/Set;",
        "getPublishableKey",
        "()Ljava/lang/String;",
        "getStarterArgs",
        "()Lcom/stripe/android/link/LinkActivityContract$Args;",
        "getStripeAccountId",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "link_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final application:Landroid/app/Application;

.field private final enableLogging:Z

.field private final productUsage:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final publishableKey:Ljava/lang/String;

.field private final starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

.field private final stripeAccountId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/stripe/android/link/LinkActivityContract$Args;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "starterArgs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsage"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->application:Landroid/app/Application;

    iput-object p2, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

    iput-boolean p3, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->enableLogging:Z

    iput-object p4, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->publishableKey:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->stripeAccountId:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->productUsage:Ljava/util/Set;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;Landroid/app/Application;Lcom/stripe/android/link/LinkActivityContract$Args;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Set;ILjava/lang/Object;)Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->application:Landroid/app/Application;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->enableLogging:Z

    :cond_2
    move v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->publishableKey:Ljava/lang/String;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->stripeAccountId:Ljava/lang/String;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->productUsage:Ljava/util/Set;

    :cond_5
    move-object v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move p5, v0

    move-object p6, v1

    move-object p7, v2

    move-object p8, v3

    invoke-virtual/range {p2 .. p8}, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->copy(Landroid/app/Application;Lcom/stripe/android/link/LinkActivityContract$Args;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroid/app/Application;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->application:Landroid/app/Application;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/link/LinkActivityContract$Args;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->enableLogging:Z

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->publishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->stripeAccountId:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->productUsage:Ljava/util/Set;

    return-object v0
.end method

.method public final copy(Landroid/app/Application;Lcom/stripe/android/link/LinkActivityContract$Args;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;"
        }
    .end annotation

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "starterArgs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsage"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;-><init>(Landroid/app/Application;Lcom/stripe/android/link/LinkActivityContract$Args;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Set;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->application:Landroid/app/Application;

    iget-object v3, p1, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->application:Landroid/app/Application;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

    iget-object v3, p1, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->enableLogging:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->enableLogging:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->publishableKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->publishableKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->stripeAccountId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->stripeAccountId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->productUsage:Ljava/util/Set;

    iget-object p1, p1, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->productUsage:Ljava/util/Set;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getApplication()Landroid/app/Application;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->application:Landroid/app/Application;

    return-object v0
.end method

.method public final getEnableLogging()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->enableLogging:Z

    return v0
.end method

.method public final getProductUsage()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->productUsage:Ljava/util/Set;

    return-object v0
.end method

.method public final getPublishableKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->publishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getStarterArgs()Lcom/stripe/android/link/LinkActivityContract$Args;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

    return-object v0
.end method

.method public final getStripeAccountId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->stripeAccountId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->application:Landroid/app/Application;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkActivityContract$Args;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->enableLogging:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->publishableKey:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->stripeAccountId:Ljava/lang/String;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->productUsage:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->application:Landroid/app/Application;

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->starterArgs:Lcom/stripe/android/link/LinkActivityContract$Args;

    iget-boolean v2, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->enableLogging:Z

    iget-object v3, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->publishableKey:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->stripeAccountId:Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/link/LinkActivityViewModel$Factory$FallbackInitializeParam;->productUsage:Ljava/util/Set;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "FallbackInitializeParam(application="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", starterArgs="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", enableLogging="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", publishableKey="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", stripeAccountId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", productUsage="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
