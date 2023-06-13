.class public final enum Lyu3;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lyu3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\n\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lyu3;",
        "",
        "",
        "b",
        "I",
        "()I",
        "tabIdx",
        "<init>",
        "(Ljava/lang/String;II)V",
        "c",
        "d",
        "e",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum c:Lyu3;

.field public static final enum d:Lyu3;

.field public static final enum e:Lyu3;

.field public static final synthetic f:[Lyu3;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lyu3;

    const-string v1, "ALL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lyu3;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lyu3;->c:Lyu3;

    new-instance v0, Lyu3;

    const-string v1, "VEHICLES"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lyu3;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lyu3;->d:Lyu3;

    new-instance v0, Lyu3;

    const-string v1, "NESTS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lyu3;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lyu3;->e:Lyu3;

    invoke-static {}, Lyu3;->a()[Lyu3;

    move-result-object v0

    sput-object v0, Lyu3;->f:[Lyu3;

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

    iput p3, p0, Lyu3;->b:I

    return-void
.end method

.method public static final synthetic a()[Lyu3;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lyu3;

    const/4 v1, 0x0

    sget-object v2, Lyu3;->c:Lyu3;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lyu3;->d:Lyu3;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lyu3;->e:Lyu3;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lyu3;
    .locals 1

    const-class v0, Lyu3;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyu3;

    return-object p0
.end method

.method public static values()[Lyu3;
    .locals 1

    sget-object v0, Lyu3;->f:[Lyu3;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyu3;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, Lyu3;->b:I

    return v0
.end method
