.class public final Lco/bird/android/buava/Optional$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/buava/Optional;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ#\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\u0008\u0001\u0010\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J!\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\u0008\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J\u0012\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/buava/Optional$a;",
        "",
        "T",
        "t",
        "Lco/bird/android/buava/Optional;",
        "b",
        "(Ljava/lang/Object;)Lco/bird/android/buava/Optional;",
        "c",
        "a",
        "<init>",
        "()V",
        "buava_release"
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

    invoke-direct {p0}, Lco/bird/android/buava/Optional$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lco/bird/android/buava/Optional;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lco/bird/android/buava/Optional<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/buava/Optional;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/buava/Optional;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lco/bird/android/buava/Optional<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/buava/Optional;

    invoke-direct {v0, p1}, Lco/bird/android/buava/Optional;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lco/bird/android/buava/Optional<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lco/bird/android/buava/Optional;

    invoke-direct {v0, p1}, Lco/bird/android/buava/Optional;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
