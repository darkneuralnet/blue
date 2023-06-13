.class public final LoI5$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LoI5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\n"
    }
    d2 = {
        "LoI5$a;",
        "",
        "Ljava/util/UUID;",
        "b",
        "Ljava/util/UUID;",
        "a",
        "()Ljava/util/UUID;",
        "LOCK_SERVICE",
        "<init>",
        "()V",
        "core-interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final synthetic a:LoI5$a;

.field public static final b:Ljava/util/UUID;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LoI5$a;

    invoke-direct {v0}, LoI5$a;-><init>()V

    sput-object v0, LoI5$a;->a:LoI5$a;

    const-string v0, "0000fee7-0000-1000-8000-00805f9b34fb"

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    const-string v1, "fromString(\"0000fee7-0000-1000-8000-00805f9b34fb\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LoI5$a;->b:Ljava/util/UUID;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/UUID;
    .locals 1

    sget-object v0, LoI5$a;->b:Ljava/util/UUID;

    return-object v0
.end method
