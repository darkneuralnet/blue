.class public final Lv92$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv92;->A(Lco/bird/android/model/constant/HealthStatus;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireInventoryPart;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireInventoryPart;",
        "kotlin.jvm.PlatformType",
        "part",
        "",
        "a",
        "(Lco/bird/android/model/wire/WireInventoryPart;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lv92;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lv92;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lv92$g;->g:Lv92;

    iput-object p2, p0, Lv92$g;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireInventoryPart;)V
    .locals 2

    iget-object v0, p0, Lv92$g;->g:Lv92;

    invoke-static {v0}, Lv92;->access$getNavigator$p(Lv92;)Le13;

    move-result-object v0

    iget-object v1, p0, Lv92$g;->h:Ljava/lang/String;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireInventoryPart;->getSku()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Le13;->n2(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireInventoryPart;

    invoke-virtual {p0, p1}, Lv92$g;->a(Lco/bird/android/model/wire/WireInventoryPart;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
