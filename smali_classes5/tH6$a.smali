.class public final enum LtH6$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LtH6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LtH6$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LtH6$a;

.field public static final enum c:LtH6$a;

.field public static final enum d:LtH6$a;

.field public static final enum e:LtH6$a;

.field public static final enum f:LtH6$a;

.field public static final synthetic g:[LtH6$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    new-instance v0, LtH6$a;

    const-string v1, "TOP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LtH6$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LtH6$a;->b:LtH6$a;

    new-instance v1, LtH6$a;

    const-string v3, "BOTTOM"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LtH6$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, LtH6$a;->c:LtH6$a;

    new-instance v3, LtH6$a;

    const-string v5, "BOTH_SIDED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, LtH6$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, LtH6$a;->d:LtH6$a;

    new-instance v5, LtH6$a;

    const-string v7, "TOP_INSIDE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, LtH6$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, LtH6$a;->e:LtH6$a;

    new-instance v7, LtH6$a;

    const-string v9, "BOTTOM_INSIDE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, LtH6$a;-><init>(Ljava/lang/String;I)V

    sput-object v7, LtH6$a;->f:LtH6$a;

    const/4 v9, 0x5

    new-array v9, v9, [LtH6$a;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, LtH6$a;->g:[LtH6$a;

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

.method public static valueOf(Ljava/lang/String;)LtH6$a;
    .locals 1

    const-class v0, LtH6$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LtH6$a;

    return-object p0
.end method

.method public static values()[LtH6$a;
    .locals 1

    sget-object v0, LtH6$a;->g:[LtH6$a;

    invoke-virtual {v0}, [LtH6$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LtH6$a;

    return-object v0
.end method
