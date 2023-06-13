.class public final enum LN24;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LN24;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LN24;

.field public static final enum c:LN24;

.field public static final enum d:LN24;

.field public static final synthetic e:[LN24;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, LN24;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LN24;-><init>(Ljava/lang/String;I)V

    sput-object v0, LN24;->b:LN24;

    new-instance v1, LN24;

    const-string v3, "VERY_LOW"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LN24;-><init>(Ljava/lang/String;I)V

    sput-object v1, LN24;->c:LN24;

    new-instance v3, LN24;

    const-string v5, "HIGHEST"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, LN24;-><init>(Ljava/lang/String;I)V

    sput-object v3, LN24;->d:LN24;

    const/4 v5, 0x3

    new-array v5, v5, [LN24;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, LN24;->e:[LN24;

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

.method public static valueOf(Ljava/lang/String;)LN24;
    .locals 1

    const-class v0, LN24;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LN24;

    return-object p0
.end method

.method public static values()[LN24;
    .locals 1

    sget-object v0, LN24;->e:[LN24;

    invoke-virtual {v0}, [LN24;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LN24;

    return-object v0
.end method
