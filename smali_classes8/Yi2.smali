.class public abstract LYi2;
.super Lxi2;
.source "SourceFile"


# annotations
.annotation runtime LWs5;
    with = Lcj2;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYi2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \t2\u00020\u0001:\u0001\u0004B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u0082\u0001\u0002\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "LYi2;",
        "Lxi2;",
        "",
        "toString",
        "a",
        "()Ljava/lang/String;",
        "content",
        "<init>",
        "()V",
        "Companion",
        "LKi2;",
        "LPi2;",
        "kotlinx-serialization-json"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:LYi2$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LYi2$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYi2$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LYi2;->Companion:LYi2$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lxi2;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, LYi2;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LYi2;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
