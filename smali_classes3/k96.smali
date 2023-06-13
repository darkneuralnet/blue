.class public final Lk96;
.super LyW4;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\n"
    }
    d2 = {
        "Lk96;",
        "LyW4;",
        "Lco/bird/android/model/persistence/RidePassView;",
        "a",
        "Lco/bird/android/model/persistence/RidePassView;",
        "getPass",
        "()Lco/bird/android/model/persistence/RidePassView;",
        "pass",
        "<init>",
        "(Lco/bird/android/model/persistence/RidePassView;)V",
        "ride-pass_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/model/persistence/RidePassView;


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/RidePassView;)V
    .locals 1

    const-string v0, "pass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LyW4;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lk96;->a:Lco/bird/android/model/persistence/RidePassView;

    return-void
.end method
