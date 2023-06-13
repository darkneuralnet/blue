.class public final enum LyX5;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LyX5;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LyX5;

.field public static final enum c:LyX5;

.field public static final enum d:LyX5;

.field public static final synthetic e:[LyX5;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, LyX5;

    const-string v1, "FORCE_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LyX5;-><init>(Ljava/lang/String;I)V

    sput-object v0, LyX5;->b:LyX5;

    new-instance v1, LyX5;

    const-string v3, "FORCE_SQUARE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LyX5;-><init>(Ljava/lang/String;I)V

    sput-object v1, LyX5;->c:LyX5;

    new-instance v3, LyX5;

    const-string v5, "FORCE_RECTANGLE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, LyX5;-><init>(Ljava/lang/String;I)V

    sput-object v3, LyX5;->d:LyX5;

    const/4 v5, 0x3

    new-array v5, v5, [LyX5;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, LyX5;->e:[LyX5;

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

.method public static valueOf(Ljava/lang/String;)LyX5;
    .locals 1

    const-class v0, LyX5;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LyX5;

    return-object p0
.end method

.method public static values()[LyX5;
    .locals 1

    sget-object v0, LyX5;->e:[LyX5;

    invoke-virtual {v0}, [LyX5;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LyX5;

    return-object v0
.end method
