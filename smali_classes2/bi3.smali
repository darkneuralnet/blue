.class public final enum Lbi3;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbi3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u000e\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lbi3;",
        "",
        "",
        "b",
        "I",
        "()I",
        "mode",
        "<init>",
        "(Ljava/lang/String;II)V",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum c:Lbi3;

.field public static final enum d:Lbi3;

.field public static final enum e:Lbi3;

.field public static final enum f:Lbi3;

.field public static final enum g:Lbi3;

.field public static final enum h:Lbi3;

.field public static final enum i:Lbi3;

.field public static final synthetic j:[Lbi3;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lbi3;

    const/high16 v1, -0x80000000

    const-string v2, "NO_OP"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lbi3;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbi3;->c:Lbi3;

    new-instance v0, Lbi3;

    const v1, -0x7fffffff

    const-string v2, "SCAN_LEGACY"

    const/4 v4, 0x1

    invoke-direct {v0, v2, v4, v1}, Lbi3;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbi3;->d:Lbi3;

    new-instance v0, Lbi3;

    const/4 v1, -0x1

    const-string v2, "SCAN_OPPORTUNISTIC"

    const/4 v5, 0x2

    invoke-direct {v0, v2, v5, v1}, Lbi3;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbi3;->e:Lbi3;

    new-instance v0, Lbi3;

    const-string v1, "SCAN_LOW_POWER"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v3}, Lbi3;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbi3;->f:Lbi3;

    new-instance v0, Lbi3;

    const-string v1, "SCAN_BALANCED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v4}, Lbi3;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbi3;->g:Lbi3;

    new-instance v0, Lbi3;

    const-string v1, "SCAN_LOW_LATENCY"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v5}, Lbi3;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbi3;->h:Lbi3;

    new-instance v0, Lbi3;

    const/4 v1, 0x6

    const v2, 0x7fffffff

    const-string v3, "CONNECT"

    invoke-direct {v0, v3, v1, v2}, Lbi3;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbi3;->i:Lbi3;

    invoke-static {}, Lbi3;->a()[Lbi3;

    move-result-object v0

    sput-object v0, Lbi3;->j:[Lbi3;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lbi3;->b:I

    return-void
.end method

.method public static final synthetic a()[Lbi3;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lbi3;

    const/4 v1, 0x0

    sget-object v2, Lbi3;->c:Lbi3;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lbi3;->d:Lbi3;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lbi3;->e:Lbi3;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lbi3;->f:Lbi3;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lbi3;->g:Lbi3;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lbi3;->h:Lbi3;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lbi3;->i:Lbi3;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lbi3;
    .locals 1

    const-class v0, Lbi3;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbi3;

    return-object p0
.end method

.method public static values()[Lbi3;
    .locals 1

    sget-object v0, Lbi3;->j:[Lbi3;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbi3;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, Lbi3;->b:I

    return v0
.end method
