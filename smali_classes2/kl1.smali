.class public final enum Lkl1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkl1;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lkl1;

.field public static final enum d:Lkl1;

.field public static final synthetic e:[Lkl1;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkl1;

    const/4 v1, 0x0

    const-string v2, ".json"

    const-string v3, "JSON"

    invoke-direct {v0, v3, v1, v2}, Lkl1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkl1;->c:Lkl1;

    new-instance v0, Lkl1;

    const/4 v1, 0x1

    const-string v2, ".zip"

    const-string v3, "ZIP"

    invoke-direct {v0, v3, v1, v2}, Lkl1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lkl1;->d:Lkl1;

    invoke-static {}, Lkl1;->a()[Lkl1;

    move-result-object v0

    sput-object v0, Lkl1;->e:[Lkl1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lkl1;->b:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a()[Lkl1;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lkl1;

    const/4 v1, 0x0

    sget-object v2, Lkl1;->c:Lkl1;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lkl1;->d:Lkl1;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lkl1;
    .locals 1

    const-class v0, Lkl1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkl1;

    return-object p0
.end method

.method public static values()[Lkl1;
    .locals 1

    sget-object v0, Lkl1;->e:[Lkl1;

    invoke-virtual {v0}, [Lkl1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkl1;

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ".temp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkl1;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkl1;->b:Ljava/lang/String;

    return-object v0
.end method
