.class public final enum LXL6$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXL6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LXL6$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LXL6$a;

.field public static final enum d:LXL6$a;

.field public static final enum e:LXL6$a;

.field public static final enum f:LXL6$a;

.field public static final enum g:LXL6$a;

.field public static final enum h:LXL6$a;

.field public static final enum i:LXL6$a;

.field public static final synthetic j:[LXL6$a;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, LXL6$a;

    const-string v1, "current"

    const-string v2, "CURRENT"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LXL6$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LXL6$a;->c:LXL6$a;

    new-instance v1, LXL6$a;

    const-string v2, "level"

    const-string v4, "LEVEL"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LXL6$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LXL6$a;->d:LXL6$a;

    new-instance v2, LXL6$a;

    const-string v4, "method"

    const-string v6, "METHOD"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, LXL6$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, LXL6$a;->e:LXL6$a;

    new-instance v4, LXL6$a;

    const-string v6, "low_power"

    const-string v8, "LOW_POWER"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, LXL6$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, LXL6$a;->f:LXL6$a;

    new-instance v6, LXL6$a;

    const-string v8, "state"

    const-string v10, "STATE"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, LXL6$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, LXL6$a;->g:LXL6$a;

    new-instance v8, LXL6$a;

    const-string v10, "temp"

    const-string v12, "TEMP"

    const/4 v13, 0x5

    invoke-direct {v8, v12, v13, v10}, LXL6$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, LXL6$a;->h:LXL6$a;

    new-instance v10, LXL6$a;

    const-string v12, "voltage"

    const-string v14, "VOLTAGE"

    const/4 v15, 0x6

    invoke-direct {v10, v14, v15, v12}, LXL6$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, LXL6$a;->i:LXL6$a;

    const/4 v12, 0x7

    new-array v12, v12, [LXL6$a;

    aput-object v0, v12, v3

    aput-object v1, v12, v5

    aput-object v2, v12, v7

    aput-object v4, v12, v9

    aput-object v6, v12, v11

    aput-object v8, v12, v13

    aput-object v10, v12, v15

    sput-object v12, LXL6$a;->j:[LXL6$a;

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

    iput-object p3, p0, LXL6$a;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LXL6$a;
    .locals 1

    const-class v0, LXL6$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LXL6$a;

    return-object p0
.end method

.method public static values()[LXL6$a;
    .locals 1

    sget-object v0, LXL6$a;->j:[LXL6$a;

    invoke-virtual {v0}, [LXL6$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LXL6$a;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, LXL6$a;->b:Ljava/lang/String;

    return-object v0
.end method
