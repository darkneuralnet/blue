.class public final LtC3$r$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LtC3$r;->c(Lkotlin/Triple;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/BirdActionsAndSettings;",
        "Lwb4<",
        "+",
        "Lco/bird/android/model/persistence/Bird;",
        "+",
        "Ljava/lang/String;",
        "+",
        "Lco/bird/android/model/BirdActionsAndSettings;",
        "+",
        "Lco/bird/android/model/persistence/VehicleVersion;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001aZ\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0000\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00060\u0006 \u0004*,\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0000\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lco/bird/android/model/BirdActionsAndSettings;",
        "actionSettings",
        "Lwb4;",
        "Lco/bird/android/model/persistence/Bird;",
        "kotlin.jvm.PlatformType",
        "",
        "Lco/bird/android/model/persistence/VehicleVersion;",
        "a",
        "(Lco/bird/android/model/BirdActionsAndSettings;)Lwb4;"
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

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lco/bird/android/model/persistence/VehicleVersion;


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/Bird;Ljava/lang/String;Lco/bird/android/model/persistence/VehicleVersion;)V
    .locals 0

    iput-object p1, p0, LtC3$r$a;->g:Lco/bird/android/model/persistence/Bird;

    iput-object p2, p0, LtC3$r$a;->h:Ljava/lang/String;

    iput-object p3, p0, LtC3$r$a;->i:Lco/bird/android/model/persistence/VehicleVersion;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/BirdActionsAndSettings;)Lwb4;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/BirdActionsAndSettings;",
            ")",
            "Lwb4<",
            "Lco/bird/android/model/persistence/Bird;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/BirdActionsAndSettings;",
            "Lco/bird/android/model/persistence/VehicleVersion;",
            ">;"
        }
    .end annotation

    const-string v0, "actionSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwb4;

    iget-object v1, p0, LtC3$r$a;->g:Lco/bird/android/model/persistence/Bird;

    iget-object v2, p0, LtC3$r$a;->h:Ljava/lang/String;

    iget-object v3, p0, LtC3$r$a;->i:Lco/bird/android/model/persistence/VehicleVersion;

    invoke-direct {v0, v1, v2, p1, v3}, Lwb4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/BirdActionsAndSettings;

    invoke-virtual {p0, p1}, LtC3$r$a;->a(Lco/bird/android/model/BirdActionsAndSettings;)Lwb4;

    move-result-object p1

    return-object p1
.end method
