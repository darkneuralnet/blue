.class public final Lz33$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function5;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz33;->v(LA33;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function5<",
        "Lkotlin/Unit;",
        "Ljava/lang/String;",
        "Lco/bird/android/model/wire/WireFlagNestReason;",
        "Lco/bird/android/buava/Optional<",
        "Ljava/lang/String;",
        ">;",
        "Lco/bird/android/buava/Optional<",
        "Ljava/lang/Integer;",
        ">;",
        "Lwb4<",
        "+",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/Integer;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00080\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0006H\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000c"
    }
    d2 = {
        "",
        "<anonymous parameter 0>",
        "",
        "nestId",
        "Lco/bird/android/model/wire/WireFlagNestReason;",
        "selectedReason",
        "Lco/bird/android/buava/Optional;",
        "comment",
        "",
        "capacity",
        "Lwb4;",
        "a",
        "(Lkotlin/Unit;Ljava/lang/String;Lco/bird/android/model/wire/WireFlagNestReason;Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Lwb4;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lz33$f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz33$f;

    invoke-direct {v0}, Lz33$f;-><init>()V

    sput-object v0, Lz33$f;->g:Lz33$f;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Unit;Ljava/lang/String;Lco/bird/android/model/wire/WireFlagNestReason;Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Lwb4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Unit;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireFlagNestReason;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lwb4<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "nestId"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "selectedReason"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "comment"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "capacity"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lwb4;

    invoke-virtual {p3}, Lco/bird/android/model/wire/WireFlagNestReason;->getCode()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p4

    invoke-virtual {p5}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p5

    invoke-direct {p1, p2, p3, p4, p5}, Lwb4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Lco/bird/android/model/wire/WireFlagNestReason;

    check-cast p4, Lco/bird/android/buava/Optional;

    check-cast p5, Lco/bird/android/buava/Optional;

    invoke-virtual/range {p0 .. p5}, Lz33$f;->a(Lkotlin/Unit;Ljava/lang/String;Lco/bird/android/model/wire/WireFlagNestReason;Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Lwb4;

    move-result-object p1

    return-object p1
.end method
