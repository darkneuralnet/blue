.class public final enum LeV7;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LeV7;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:LeV7;

.field public static final enum f:LeV7;

.field public static final enum g:LeV7;

.field public static final enum h:LeV7;

.field public static final enum i:LeV7;

.field public static final enum j:LeV7;

.field public static final enum k:LeV7;

.field public static final enum l:LeV7;

.field public static final enum m:LeV7;

.field public static final enum n:LeV7;

.field public static final synthetic o:[LeV7;


# instance fields
.field public final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final d:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 26

    new-instance v6, LeV7;

    const-string v1, "VOID"

    const/4 v2, 0x0

    const-class v3, Ljava/lang/Void;

    const-class v4, Ljava/lang/Void;

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LeV7;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V

    sput-object v6, LeV7;->e:LeV7;

    new-instance v0, LeV7;

    const-string v8, "INT"

    const/4 v9, 0x1

    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v11, Ljava/lang/Integer;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    move-object v7, v0

    move-object v10, v13

    invoke-direct/range {v7 .. v12}, LeV7;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V

    sput-object v0, LeV7;->f:LeV7;

    new-instance v2, LeV7;

    const-string v15, "LONG"

    const/16 v16, 0x2

    sget-object v17, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v18, Ljava/lang/Long;

    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v19

    move-object v14, v2

    invoke-direct/range {v14 .. v19}, LeV7;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V

    sput-object v2, LeV7;->g:LeV7;

    new-instance v3, LeV7;

    const-string v8, "FLOAT"

    const/4 v9, 0x3

    sget-object v10, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class v11, Ljava/lang/Float;

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    move-object v7, v3

    invoke-direct/range {v7 .. v12}, LeV7;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V

    sput-object v3, LeV7;->h:LeV7;

    new-instance v4, LeV7;

    const-string v15, "DOUBLE"

    const/16 v16, 0x4

    sget-object v17, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class v18, Ljava/lang/Double;

    const-wide/16 v7, 0x0

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v19

    move-object v14, v4

    invoke-direct/range {v14 .. v19}, LeV7;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V

    sput-object v4, LeV7;->i:LeV7;

    new-instance v5, LeV7;

    const-string v8, "BOOLEAN"

    const/4 v9, 0x5

    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v11, Ljava/lang/Boolean;

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object v7, v5

    invoke-direct/range {v7 .. v12}, LeV7;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V

    sput-object v5, LeV7;->j:LeV7;

    new-instance v7, LeV7;

    const-string v15, "STRING"

    const/16 v16, 0x6

    const-class v17, Ljava/lang/String;

    const-class v18, Ljava/lang/String;

    const-string v19, ""

    move-object v14, v7

    invoke-direct/range {v14 .. v19}, LeV7;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V

    sput-object v7, LeV7;->k:LeV7;

    new-instance v8, LeV7;

    const-string v21, "BYTE_STRING"

    const/16 v22, 0x7

    const-class v23, LTD7;

    const-class v24, LTD7;

    sget-object v25, LTD7;->c:LTD7;

    move-object/from16 v20, v8

    invoke-direct/range {v20 .. v25}, LeV7;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V

    sput-object v8, LeV7;->l:LeV7;

    new-instance v9, LeV7;

    const-string v11, "ENUM"

    const/16 v12, 0x8

    const-class v14, Ljava/lang/Integer;

    const/4 v15, 0x0

    move-object v10, v9

    invoke-direct/range {v10 .. v15}, LeV7;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V

    sput-object v9, LeV7;->m:LeV7;

    new-instance v10, LeV7;

    const-string v17, "MESSAGE"

    const/16 v18, 0x9

    const-class v19, Ljava/lang/Object;

    const-class v20, Ljava/lang/Object;

    const/16 v21, 0x0

    move-object/from16 v16, v10

    invoke-direct/range {v16 .. v21}, LeV7;-><init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V

    sput-object v10, LeV7;->n:LeV7;

    const/16 v11, 0xa

    new-array v11, v11, [LeV7;

    aput-object v6, v11, v1

    const/4 v1, 0x1

    aput-object v0, v11, v1

    const/4 v0, 0x2

    aput-object v2, v11, v0

    const/4 v0, 0x3

    aput-object v3, v11, v0

    const/4 v0, 0x4

    aput-object v4, v11, v0

    const/4 v0, 0x5

    aput-object v5, v11, v0

    const/4 v0, 0x6

    aput-object v7, v11, v0

    const/4 v0, 0x7

    aput-object v8, v11, v0

    const/16 v0, 0x8

    aput-object v9, v11, v0

    const/16 v0, 0x9

    aput-object v10, v11, v0

    sput-object v11, LeV7;->o:[LeV7;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LeV7;->b:Ljava/lang/Class;

    iput-object p4, p0, LeV7;->c:Ljava/lang/Class;

    iput-object p5, p0, LeV7;->d:Ljava/lang/Object;

    return-void
.end method

.method public static values()[LeV7;
    .locals 1

    sget-object v0, LeV7;->o:[LeV7;

    invoke-virtual {v0}, [LeV7;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LeV7;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, LeV7;->c:Ljava/lang/Class;

    return-object v0
.end method
