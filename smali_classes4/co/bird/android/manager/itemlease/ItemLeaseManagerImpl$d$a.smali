.class public final Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$d$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$d;->a(Ljava/util/Set;)Ljava/util/Set;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/itemlease/ItemLeaseExemption;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/android/model/itemlease/ItemLeaseExemption;",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/itemlease/ItemLeaseExemption;)Ljava/lang/Boolean;"
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

    iput-object p1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$d$a;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/itemlease/ItemLeaseExemption;)Ljava/lang/Boolean;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$d$a;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;

    invoke-static {v0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->access$getReactiveConfig$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)LTq4;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/itemlease/ItemLeaseExemption;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    invoke-static {v0, v1}, LUq4;->c(LTq4;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v0

    invoke-virtual {p1, v0}, Lco/bird/android/model/itemlease/ItemLeaseExemption;->isValid(Lco/bird/android/model/wire/configs/Config;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/itemlease/ItemLeaseExemption;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$d$a;->a(Lco/bird/android/model/itemlease/ItemLeaseExemption;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
