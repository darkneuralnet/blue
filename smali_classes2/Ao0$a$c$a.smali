.class public final LAo0$a$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAo0$a$c;->invoke(Lkotlin/Pair;)Lio/reactivex/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/VehicleConnection;",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/Bird;",
        "+",
        "Lco/bird/android/model/VehicleCommand;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a2\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0005 \u0004*\u0018\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/android/model/VehicleConnection;",
        "it",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/Bird;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/VehicleCommand;",
        "a",
        "(Lco/bird/android/model/VehicleConnection;)Lkotlin/Pair;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/persistence/Bird;

.field public final synthetic h:Lco/bird/android/model/VehicleCommand;


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/Bird;Lco/bird/android/model/VehicleCommand;)V
    .locals 0

    iput-object p1, p0, LAo0$a$c$a;->g:Lco/bird/android/model/persistence/Bird;

    iput-object p2, p0, LAo0$a$c$a;->h:Lco/bird/android/model/VehicleCommand;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/VehicleConnection;)Lkotlin/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/VehicleConnection;",
            ")",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/Bird;",
            "Lco/bird/android/model/VehicleCommand;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lkotlin/Pair;

    iget-object v0, p0, LAo0$a$c$a;->g:Lco/bird/android/model/persistence/Bird;

    iget-object v1, p0, LAo0$a$c$a;->h:Lco/bird/android/model/VehicleCommand;

    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/VehicleConnection;

    invoke-virtual {p0, p1}, LAo0$a$c$a;->a(Lco/bird/android/model/VehicleConnection;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
