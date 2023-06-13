.class public final enum LbA7;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LbA7;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LbA7;

.field public static final enum d:LbA7;

.field public static final enum e:LbA7;

.field public static final enum f:LbA7;

.field public static final synthetic g:[LbA7;


# instance fields
.field public final b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, LbA7;

    const-string v1, "SCALAR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LbA7;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LbA7;->c:LbA7;

    new-instance v1, LbA7;

    const-string v3, "VECTOR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LbA7;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, LbA7;->d:LbA7;

    new-instance v3, LbA7;

    const-string v5, "PACKED_VECTOR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v4}, LbA7;-><init>(Ljava/lang/String;IZ)V

    sput-object v3, LbA7;->e:LbA7;

    new-instance v5, LbA7;

    const-string v7, "MAP"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v2}, LbA7;-><init>(Ljava/lang/String;IZ)V

    sput-object v5, LbA7;->f:LbA7;

    const/4 v7, 0x4

    new-array v7, v7, [LbA7;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, LbA7;->g:[LbA7;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, LbA7;->b:Z

    return-void
.end method

.method public static values()[LbA7;
    .locals 1

    sget-object v0, LbA7;->g:[LbA7;

    invoke-virtual {v0}, [LbA7;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LbA7;

    return-object v0
.end method
