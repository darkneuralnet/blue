.class public final LcR1$f;
.super Ljava/lang/Throwable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LcR1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\n"
    }
    d2 = {
        "LcR1$f;",
        "",
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        "b",
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        "a",
        "()Lco/bird/android/model/persistence/BrainSwapRecord;",
        "record",
        "<init>",
        "(Lco/bird/android/model/persistence/BrainSwapRecord;)V",
        "servicecenter_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/model/persistence/BrainSwapRecord;


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/BrainSwapRecord;)V
    .locals 1

    const-string v0, "record"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Throwable;-><init>()V

    iput-object p1, p0, LcR1$f;->b:Lco/bird/android/model/persistence/BrainSwapRecord;

    return-void
.end method


# virtual methods
.method public final a()Lco/bird/android/model/persistence/BrainSwapRecord;
    .locals 1

    iget-object v0, p0, LcR1$f;->b:Lco/bird/android/model/persistence/BrainSwapRecord;

    return-object v0
.end method
