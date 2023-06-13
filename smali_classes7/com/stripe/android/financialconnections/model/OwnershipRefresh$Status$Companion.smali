.class public final Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status$Companion;",
        "",
        "LKj2;",
        "Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;",
        "serializer",
        "<init>",
        "()V",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status$Companion;-><init>()V

    return-void
.end method

.method private final synthetic get$cachedSerializer$delegate()Lkotlin/Lazy;
    .locals 1

    invoke-static {}, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;->access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final serializer()LKj2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LKj2<",
            "Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status$Companion;->get$cachedSerializer$delegate()Lkotlin/Lazy;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKj2;

    return-object v0
.end method
