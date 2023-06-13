.class public final enum Lln9;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum c:Lln9;

.field public static final enum d:Lln9;

.field public static final enum e:Lln9;

.field public static final enum f:Lln9;

.field public static final enum g:Lln9;

.field public static final enum h:Lln9;

.field public static final enum i:Lln9;

.field public static final enum j:Lln9;

.field public static final enum k:Lln9;

.field public static final synthetic l:[Lln9;


# instance fields
.field public final b:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Lln9;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "INT"

    invoke-direct {v0, v3, v1, v2}, Lln9;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, Lln9;->c:Lln9;

    new-instance v2, Lln9;

    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "LONG"

    const/4 v5, 0x1

    invoke-direct {v2, v4, v5, v3}, Lln9;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v2, Lln9;->d:Lln9;

    new-instance v3, Lln9;

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const-string v6, "FLOAT"

    const/4 v7, 0x2

    invoke-direct {v3, v6, v7, v4}, Lln9;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v3, Lln9;->e:Lln9;

    new-instance v4, Lln9;

    const-wide/16 v8, 0x0

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    const-string v8, "DOUBLE"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, Lln9;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v4, Lln9;->f:Lln9;

    new-instance v6, Lln9;

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v10, "BOOLEAN"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, Lln9;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v6, Lln9;->g:Lln9;

    new-instance v8, Lln9;

    const-string v10, ""

    const-string v12, "STRING"

    const/4 v13, 0x5

    invoke-direct {v8, v12, v13, v10}, Lln9;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v8, Lln9;->h:Lln9;

    new-instance v10, Lln9;

    sget-object v12, LT69;->c:LT69;

    const-string v14, "BYTE_STRING"

    const/4 v15, 0x6

    invoke-direct {v10, v14, v15, v12}, Lln9;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v10, Lln9;->i:Lln9;

    new-instance v12, Lln9;

    const-string v14, "ENUM"

    const/4 v15, 0x7

    const/4 v13, 0x0

    invoke-direct {v12, v14, v15, v13}, Lln9;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v12, Lln9;->j:Lln9;

    new-instance v14, Lln9;

    const-string v15, "MESSAGE"

    const/16 v11, 0x8

    invoke-direct {v14, v15, v11, v13}, Lln9;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v14, Lln9;->k:Lln9;

    const/16 v13, 0x9

    new-array v13, v13, [Lln9;

    aput-object v0, v13, v1

    aput-object v2, v13, v5

    aput-object v3, v13, v7

    aput-object v4, v13, v9

    const/4 v0, 0x4

    aput-object v6, v13, v0

    const/4 v0, 0x5

    aput-object v8, v13, v0

    const/4 v0, 0x6

    aput-object v10, v13, v0

    const/4 v0, 0x7

    aput-object v12, v13, v0

    aput-object v14, v13, v11

    sput-object v13, Lln9;->l:[Lln9;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lln9;->b:Ljava/lang/Object;

    return-void
.end method

.method public static values()[Lln9;
    .locals 1

    sget-object v0, Lln9;->l:[Lln9;

    invoke-virtual {v0}, [Lln9;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lln9;

    return-object v0
.end method
