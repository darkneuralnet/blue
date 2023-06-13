.class public final enum Ln66;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln66;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Ln66;

.field public static final enum f:Ln66;

.field public static final enum g:Ln66;

.field public static final enum h:Ln66;

.field public static final enum i:Ln66;

.field public static final synthetic j:[Ln66;


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 17

    new-instance v0, Ln66;

    const-string v1, "browser"

    const-string v2, "SwitchToBrowser"

    const/4 v3, 0x0

    const-string v4, "switchaway"

    invoke-direct {v0, v2, v3, v4, v1}, Ln66;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ln66;->e:Ln66;

    new-instance v1, Ln66;

    const-string v2, "wallet"

    const-string v5, "SwitchToWallet"

    const/4 v6, 0x1

    invoke-direct {v1, v5, v6, v4, v2}, Ln66;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v1, Ln66;->f:Ln66;

    new-instance v2, Ln66;

    const-string v4, "cancel"

    const-string v5, "Cancel"

    const/4 v7, 0x2

    const-string v8, "switchback"

    invoke-direct {v2, v5, v7, v8, v4}, Ln66;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v2, Ln66;->g:Ln66;

    new-instance v4, Ln66;

    const-string v5, "return"

    const-string v9, "Return"

    const/4 v10, 0x3

    invoke-direct {v4, v9, v10, v8, v5}, Ln66;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v4, Ln66;->h:Ln66;

    new-instance v5, Ln66;

    const-string v12, "Error"

    const/4 v13, 0x4

    const-string v14, "switchback"

    const-string v15, "cancel"

    const/16 v16, 0x1

    move-object v11, v5

    invoke-direct/range {v11 .. v16}, Ln66;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    sput-object v5, Ln66;->i:Ln66;

    const/4 v8, 0x5

    new-array v8, v8, [Ln66;

    aput-object v0, v8, v3

    aput-object v1, v8, v6

    aput-object v2, v8, v7

    aput-object v4, v8, v10

    const/4 v0, 0x4

    aput-object v5, v8, v0

    sput-object v8, Ln66;->j:[Ln66;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Ln66;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ln66;->b:Ljava/lang/String;

    iput-object p4, p0, Ln66;->c:Ljava/lang/String;

    iput-boolean p5, p0, Ln66;->d:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ln66;
    .locals 1

    const-class v0, Ln66;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln66;

    return-object p0
.end method

.method public static values()[Ln66;
    .locals 1

    sget-object v0, Ln66;->j:[Ln66;

    invoke-virtual {v0}, [Ln66;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln66;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ln66;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln66;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Ln66;->d:Z

    return v0
.end method
