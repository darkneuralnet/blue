.class public final enum LVL6;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LVL6;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LVL6;

.field public static final enum d:LVL6;

.field public static final synthetic e:[LVL6;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, LVL6;

    const-string v1, "ramp"

    const-string v2, "RAMP"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LVL6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LVL6;->c:LVL6;

    new-instance v1, LVL6;

    const-string v2, "remote"

    const-string v4, "REMOTE"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LVL6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LVL6;->d:LVL6;

    const/4 v2, 0x2

    new-array v2, v2, [LVL6;

    aput-object v0, v2, v3

    aput-object v1, v2, v5

    sput-object v2, LVL6;->e:[LVL6;

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

    iput-object p3, p0, LVL6;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LVL6;
    .locals 1

    const-class v0, LVL6;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LVL6;

    return-object p0
.end method

.method public static values()[LVL6;
    .locals 1

    sget-object v0, LVL6;->e:[LVL6;

    invoke-virtual {v0}, [LVL6;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LVL6;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, LVL6;->b:Ljava/lang/String;

    return-object v0
.end method
