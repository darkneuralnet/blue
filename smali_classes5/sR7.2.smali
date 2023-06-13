.class public final enum LsR7;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:LsR7;

.field public static final enum c:LsR7;

.field public static final enum d:LsR7;

.field public static final synthetic e:[LsR7;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, LsR7;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LsR7;-><init>(Ljava/lang/String;I)V

    sput-object v0, LsR7;->b:LsR7;

    new-instance v1, LsR7;

    const-string v3, "SIGNED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LsR7;-><init>(Ljava/lang/String;I)V

    sput-object v1, LsR7;->c:LsR7;

    new-instance v3, LsR7;

    const-string v5, "FIXED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, LsR7;-><init>(Ljava/lang/String;I)V

    sput-object v3, LsR7;->d:LsR7;

    const/4 v5, 0x3

    new-array v5, v5, [LsR7;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, LsR7;->e:[LsR7;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[LsR7;
    .locals 1

    sget-object v0, LsR7;->e:[LsR7;

    invoke-virtual {v0}, [LsR7;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LsR7;

    return-object v0
.end method
