.class public final Luf1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luf1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002J\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0004\u00a8\u0006\u0008"
    }
    d2 = {
        "Luf1$a;",
        "",
        "Luf1;",
        "a",
        "",
        "b",
        "<init>",
        "()V",
        "config_release"
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

    invoke-direct {p0}, Luf1$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Luf1;
    .locals 1

    sget-object v0, Luf1;->k:Luf1;

    return-object v0
.end method

.method public final b(I)I
    .locals 3

    const/4 v0, 0x5

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gt v2, p1, :cond_0

    if-ge p1, v0, :cond_0

    move v1, v2

    :cond_0
    if-eqz v1, :cond_1

    move p1, v2

    goto :goto_0

    :cond_1
    if-ne p1, v0, :cond_2

    const/4 p1, 0x2

    :cond_2
    :goto_0
    return p1
.end method
