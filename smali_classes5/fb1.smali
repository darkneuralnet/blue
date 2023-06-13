.class public final enum Lfb1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfb1;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lfb1;

.field public static final enum c:Lfb1;

.field public static final enum d:Lfb1;

.field public static final synthetic e:[Lfb1;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lfb1;

    const-string v1, "SOURCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfb1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfb1;->b:Lfb1;

    new-instance v1, Lfb1;

    const-string v3, "TRANSFORMED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lfb1;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lfb1;->c:Lfb1;

    new-instance v3, Lfb1;

    const-string v5, "NONE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lfb1;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lfb1;->d:Lfb1;

    const/4 v5, 0x3

    new-array v5, v5, [Lfb1;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lfb1;->e:[Lfb1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lfb1;
    .locals 1

    const-class v0, Lfb1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfb1;

    return-object p0
.end method

.method public static values()[Lfb1;
    .locals 1

    sget-object v0, Lfb1;->e:[Lfb1;

    invoke-virtual {v0}, [Lfb1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfb1;

    return-object v0
.end method
