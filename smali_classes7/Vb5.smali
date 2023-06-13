.class public final enum LVb5;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LVb5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B!\u0008\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0004\u001a\u0004\u0008\u0008\u0010\u0006j\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "LVb5;",
        "",
        "LUj6;",
        "b",
        "LUj6;",
        "d",
        "()LUj6;",
        "yaw",
        "c",
        "pitch",
        "roll",
        "<init>",
        "(Ljava/lang/String;ILUj6;LUj6;LUj6;)V",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "sceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final enum e:LVb5;

.field public static final enum f:LVb5;

.field public static final enum g:LVb5;

.field public static final enum h:LVb5;

.field public static final enum i:LVb5;

.field public static final enum j:LVb5;

.field public static final synthetic k:[LVb5;


# instance fields
.field public final b:LUj6;

.field public final c:LUj6;

.field public final d:LUj6;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v6, LVb5;

    const-string v1, "XYZ"

    const/4 v2, 0x0

    sget-object v13, LUj6;->b:LUj6;

    sget-object v14, LUj6;->c:LUj6;

    sget-object v15, LUj6;->d:LUj6;

    move-object v0, v6

    move-object v3, v13

    move-object v4, v14

    move-object v5, v15

    invoke-direct/range {v0 .. v5}, LVb5;-><init>(Ljava/lang/String;ILUj6;LUj6;LUj6;)V

    sput-object v6, LVb5;->e:LVb5;

    new-instance v0, LVb5;

    const-string v8, "XZY"

    const/4 v9, 0x1

    move-object v7, v0

    move-object v10, v13

    move-object v11, v15

    move-object v12, v14

    invoke-direct/range {v7 .. v12}, LVb5;-><init>(Ljava/lang/String;ILUj6;LUj6;LUj6;)V

    sput-object v0, LVb5;->f:LVb5;

    new-instance v0, LVb5;

    const-string v8, "YXZ"

    const/4 v9, 0x2

    move-object v7, v0

    move-object v10, v14

    move-object v11, v13

    move-object v12, v15

    invoke-direct/range {v7 .. v12}, LVb5;-><init>(Ljava/lang/String;ILUj6;LUj6;LUj6;)V

    sput-object v0, LVb5;->g:LVb5;

    new-instance v0, LVb5;

    const-string v8, "YZX"

    const/4 v9, 0x3

    move-object v7, v0

    move-object v11, v15

    move-object v12, v13

    invoke-direct/range {v7 .. v12}, LVb5;-><init>(Ljava/lang/String;ILUj6;LUj6;LUj6;)V

    sput-object v0, LVb5;->h:LVb5;

    new-instance v0, LVb5;

    const-string v8, "ZXY"

    const/4 v9, 0x4

    move-object v7, v0

    move-object v10, v15

    move-object v11, v13

    move-object v12, v14

    invoke-direct/range {v7 .. v12}, LVb5;-><init>(Ljava/lang/String;ILUj6;LUj6;LUj6;)V

    sput-object v0, LVb5;->i:LVb5;

    new-instance v0, LVb5;

    const-string v8, "ZYX"

    const/4 v9, 0x5

    move-object v7, v0

    move-object v11, v14

    move-object v12, v13

    invoke-direct/range {v7 .. v12}, LVb5;-><init>(Ljava/lang/String;ILUj6;LUj6;LUj6;)V

    sput-object v0, LVb5;->j:LVb5;

    invoke-static {}, LVb5;->a()[LVb5;

    move-result-object v0

    sput-object v0, LVb5;->k:[LVb5;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILUj6;LUj6;LUj6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LUj6;",
            "LUj6;",
            "LUj6;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LVb5;->b:LUj6;

    iput-object p4, p0, LVb5;->c:LUj6;

    iput-object p5, p0, LVb5;->d:LUj6;

    return-void
.end method

.method public static final synthetic a()[LVb5;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [LVb5;

    const/4 v1, 0x0

    sget-object v2, LVb5;->e:LVb5;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LVb5;->f:LVb5;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LVb5;->g:LVb5;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LVb5;->h:LVb5;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LVb5;->i:LVb5;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LVb5;->j:LVb5;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LVb5;
    .locals 1

    const-class v0, LVb5;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LVb5;

    return-object p0
.end method

.method public static values()[LVb5;
    .locals 1

    sget-object v0, LVb5;->k:[LVb5;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LVb5;

    return-object v0
.end method


# virtual methods
.method public final b()LUj6;
    .locals 1

    iget-object v0, p0, LVb5;->c:LUj6;

    return-object v0
.end method

.method public final c()LUj6;
    .locals 1

    iget-object v0, p0, LVb5;->d:LUj6;

    return-object v0
.end method

.method public final d()LUj6;
    .locals 1

    iget-object v0, p0, LVb5;->b:LUj6;

    return-object v0
.end method
