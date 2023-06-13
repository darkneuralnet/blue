.class public final LO12$c;
.super LO12$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO12;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005\u00a8\u0006\t"
    }
    d2 = {
        "LO12$c;",
        "LO12$a;",
        "Lco/bird/android/model/wire/WirePhysicalLock;",
        "a",
        "Lco/bird/android/model/wire/WirePhysicalLock;",
        "()Lco/bird/android/model/wire/WirePhysicalLock;",
        "physicalLock",
        "<init>",
        "(Lco/bird/android/model/wire/WirePhysicalLock;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/model/wire/WirePhysicalLock;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/wire/WirePhysicalLock;)V
    .locals 1

    const-string v0, "physicalLock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LO12$a;-><init>()V

    iput-object p1, p0, LO12$c;->a:Lco/bird/android/model/wire/WirePhysicalLock;

    return-void
.end method


# virtual methods
.method public a()Lco/bird/android/model/wire/WirePhysicalLock;
    .locals 1

    iget-object v0, p0, LO12$c;->a:Lco/bird/android/model/wire/WirePhysicalLock;

    return-object v0
.end method
