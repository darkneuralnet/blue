.class public final enum Lpq2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpq2;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum d:Lpq2;

.field public static final enum e:Lpq2;

.field public static final enum f:Lpq2;

.field public static final enum g:Lpq2;

.field public static final enum h:Lpq2;

.field public static final synthetic i:[Lpq2;


# instance fields
.field public b:I

.field public c:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    new-instance v0, Lpq2;

    const/16 v1, 0x28

    const-string v2, "ERROR"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1, v2}, Lpq2;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lpq2;->d:Lpq2;

    new-instance v1, Lpq2;

    const/16 v2, 0x1e

    const-string v4, "WARN"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2, v4}, Lpq2;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v1, Lpq2;->e:Lpq2;

    new-instance v2, Lpq2;

    const/16 v4, 0x14

    const-string v6, "INFO"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4, v6}, Lpq2;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v2, Lpq2;->f:Lpq2;

    new-instance v4, Lpq2;

    const/16 v6, 0xa

    const-string v8, "DEBUG"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6, v8}, Lpq2;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v4, Lpq2;->g:Lpq2;

    new-instance v6, Lpq2;

    const-string v8, "TRACE"

    const/4 v10, 0x4

    invoke-direct {v6, v8, v10, v3, v8}, Lpq2;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v6, Lpq2;->h:Lpq2;

    const/4 v8, 0x5

    new-array v8, v8, [Lpq2;

    aput-object v0, v8, v3

    aput-object v1, v8, v5

    aput-object v2, v8, v7

    aput-object v4, v8, v9

    aput-object v6, v8, v10

    sput-object v8, Lpq2;->i:[Lpq2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lpq2;->b:I

    iput-object p4, p0, Lpq2;->c:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lpq2;
    .locals 1

    const-class v0, Lpq2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpq2;

    return-object p0
.end method

.method public static values()[Lpq2;
    .locals 1

    sget-object v0, Lpq2;->i:[Lpq2;

    invoke-virtual {v0}, [Lpq2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpq2;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lpq2;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpq2;->c:Ljava/lang/String;

    return-object v0
.end method
