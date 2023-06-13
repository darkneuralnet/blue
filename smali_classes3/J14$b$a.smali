.class public final LJ14$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ14$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ2\u0010\u000b\u001a\u00020\n2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\t\u001a\u00020\u0005\u00a8\u0006\u000e"
    }
    d2 = {
        "LJ14$b$a;",
        "",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/api/response/ReloadConfigResponse;",
        "reloadOptional",
        "",
        "includePayPerRide",
        "LS04;",
        "optionModelSelectedOptional",
        "includeAutoReloadSection",
        "LJ14$b;",
        "a",
        "<init>",
        "()V",
        "co.bird.android.feature.payment"
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

    invoke-direct {p0}, LJ14$b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;ZLco/bird/android/buava/Optional;Z)LJ14$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/api/response/ReloadConfigResponse;",
            ">;Z",
            "Lco/bird/android/buava/Optional<",
            "LS04;",
            ">;Z)",
            "LJ14$b;"
        }
    .end annotation

    const-string v0, "reloadOptional"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionModelSelectedOptional"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LJ14$b;

    invoke-direct {v0, p1, p2, p3, p4}, LJ14$b;-><init>(Lco/bird/android/buava/Optional;ZLco/bird/android/buava/Optional;Z)V

    return-object v0
.end method
