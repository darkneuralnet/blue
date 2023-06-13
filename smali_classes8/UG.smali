.class public final enum LUG;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LWZ3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LUG;",
        ">;",
        "LWZ3;"
    }
.end annotation


# static fields
.field public static final enum d:LUG;

.field public static final enum e:LUG;

.field public static final enum f:LUG;

.field public static final enum g:LUG;

.field public static final enum h:LUG;

.field public static final enum i:LUG;

.field public static final enum j:LUG;

.field public static final enum k:LUG;

.field public static final synthetic l:[LUG;


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, LUG;

    const-string v1, "KIBI"

    const/4 v2, 0x0

    const-string v3, "Ki"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, LUG;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, LUG;->d:LUG;

    new-instance v1, LUG;

    const-string v3, "MEBI"

    const-string v5, "Mi"

    const/4 v6, 0x2

    invoke-direct {v1, v3, v4, v5, v6}, LUG;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v1, LUG;->e:LUG;

    new-instance v3, LUG;

    const-string v5, "GIBI"

    const-string v7, "Gi"

    const/4 v8, 0x3

    invoke-direct {v3, v5, v6, v7, v8}, LUG;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v3, LUG;->f:LUG;

    new-instance v5, LUG;

    const-string v7, "TEBI"

    const-string v9, "Ti"

    const/4 v10, 0x4

    invoke-direct {v5, v7, v8, v9, v10}, LUG;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v5, LUG;->g:LUG;

    new-instance v7, LUG;

    const-string v9, "PEBI"

    const-string v11, "Pi"

    const/4 v12, 0x5

    invoke-direct {v7, v9, v10, v11, v12}, LUG;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v7, LUG;->h:LUG;

    new-instance v9, LUG;

    const-string v11, "EXBI"

    const-string v13, "Ei"

    const/4 v14, 0x6

    invoke-direct {v9, v11, v12, v13, v14}, LUG;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v9, LUG;->i:LUG;

    new-instance v11, LUG;

    const-string v13, "ZEBI"

    const-string v15, "Zi"

    const/4 v12, 0x7

    invoke-direct {v11, v13, v14, v15, v12}, LUG;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v11, LUG;->j:LUG;

    new-instance v13, LUG;

    const-string v15, "YOBI"

    const-string v14, "Yi"

    const/16 v10, 0x8

    invoke-direct {v13, v15, v12, v14, v10}, LUG;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v13, LUG;->k:LUG;

    new-array v10, v10, [LUG;

    aput-object v0, v10, v2

    aput-object v1, v10, v4

    aput-object v3, v10, v6

    aput-object v5, v10, v8

    const/4 v0, 0x4

    aput-object v7, v10, v0

    const/4 v0, 0x5

    aput-object v9, v10, v0

    const/4 v0, 0x6

    aput-object v11, v10, v0

    aput-object v13, v10, v12

    sput-object v10, LUG;->l:[LUG;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LUG;->b:Ljava/lang/String;

    iput p4, p0, LUG;->c:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LUG;
    .locals 1

    const-class v0, LUG;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LUG;

    return-object p0
.end method

.method public static values()[LUG;
    .locals 1

    sget-object v0, LUG;->l:[LUG;

    invoke-virtual {v0}, [LUG;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LUG;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LUG;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, LUG;->c:I

    return v0
.end method

.method public c()Ljava/lang/Integer;
    .locals 1

    const/16 v0, 0x400

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Number;
    .locals 1

    invoke-virtual {p0}, LUG;->c()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
