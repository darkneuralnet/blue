.class public final Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$p;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;-><init>(Landroid/content/Context;LLc2;LOh;Lwi2;LEa;LGI3;LTq4;LLifecycleOwner;Lgl;LYR4;LaM;Ldr4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LZ84<",
        "Ljava/util/Map<",
        "Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        ">;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0008\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "LZ84;",
        "",
        "Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
        "",
        "Lco/bird/android/model/wire/WireBird;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "()LZ84;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$p;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/util/Map<",
            "Lco/bird/android/model/itemlease/enum/ItemLeaseType;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$p;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;

    invoke-static {v0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->access$getMutableReadyToLeaseBirds$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)La94;

    move-result-object v0

    invoke-static {v0}, Lb94;->a(La94;)LZ84;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$p;->invoke()LZ84;

    move-result-object v0

    return-object v0
.end method
