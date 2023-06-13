.class public final enum Lom7;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:Lom7;

.field public static final enum c:Lom7;

.field public static final enum d:Lom7;

.field public static final synthetic e:[Lom7;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lom7;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lom7;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lom7;->b:Lom7;

    new-instance v1, Lom7;

    const-string v3, "SIGNED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lom7;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lom7;->c:Lom7;

    new-instance v3, Lom7;

    const-string v5, "FIXED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lom7;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lom7;->d:Lom7;

    const/4 v5, 0x3

    new-array v5, v5, [Lom7;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lom7;->e:[Lom7;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lom7;
    .locals 1

    sget-object v0, Lom7;->e:[Lom7;

    invoke-virtual {v0}, [Lom7;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lom7;

    return-object v0
.end method
