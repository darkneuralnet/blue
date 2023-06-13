.class public final Ljz5$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljz5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\r\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0008\u001a\u0004\u0008\u000c\u0010\n\u00a8\u0006\u0010"
    }
    d2 = {
        "Ljz5$a;",
        "",
        "",
        "stopTimeoutMillis",
        "replayExpirationMillis",
        "Ljz5;",
        "a",
        "b",
        "Ljz5;",
        "c",
        "()Ljz5;",
        "Eagerly",
        "d",
        "Lazily",
        "<init>",
        "()V",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final synthetic a:Ljz5$a;

.field public static final b:Ljz5;

.field public static final c:Ljz5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljz5$a;

    invoke-direct {v0}, Ljz5$a;-><init>()V

    sput-object v0, Ljz5$a;->a:Ljz5$a;

    new-instance v0, LmP5;

    invoke-direct {v0}, LmP5;-><init>()V

    sput-object v0, Ljz5$a;->b:Ljz5;

    new-instance v0, LnP5;

    invoke-direct {v0}, LnP5;-><init>()V

    sput-object v0, Ljz5$a;->c:Ljz5;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Ljz5$a;JJILjava/lang/Object;)Ljz5;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    const-wide p3, 0x7fffffffffffffffL

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Ljz5$a;->a(JJ)Ljz5;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(JJ)Ljz5;
    .locals 1

    new-instance v0, LoP5;

    invoke-direct {v0, p1, p2, p3, p4}, LoP5;-><init>(JJ)V

    return-object v0
.end method

.method public final c()Ljz5;
    .locals 1

    sget-object v0, Ljz5$a;->b:Ljz5;

    return-object v0
.end method

.method public final d()Ljz5;
    .locals 1

    sget-object v0, Ljz5$a;->c:Ljz5;

    return-object v0
.end method
