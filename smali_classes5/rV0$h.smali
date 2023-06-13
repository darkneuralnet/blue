.class public final enum LrV0$h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LrV0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LrV0$h;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LrV0$h;

.field public static final enum c:LrV0$h;

.field public static final enum d:LrV0$h;

.field public static final enum e:LrV0$h;

.field public static final enum f:LrV0$h;

.field public static final enum g:LrV0$h;

.field public static final synthetic h:[LrV0$h;


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    new-instance v0, LrV0$h;

    const-string v1, "INITIALIZE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LrV0$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, LrV0$h;->b:LrV0$h;

    new-instance v1, LrV0$h;

    const-string v3, "RESOURCE_CACHE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LrV0$h;-><init>(Ljava/lang/String;I)V

    sput-object v1, LrV0$h;->c:LrV0$h;

    new-instance v3, LrV0$h;

    const-string v5, "DATA_CACHE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, LrV0$h;-><init>(Ljava/lang/String;I)V

    sput-object v3, LrV0$h;->d:LrV0$h;

    new-instance v5, LrV0$h;

    const-string v7, "SOURCE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, LrV0$h;-><init>(Ljava/lang/String;I)V

    sput-object v5, LrV0$h;->e:LrV0$h;

    new-instance v7, LrV0$h;

    const-string v9, "ENCODE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, LrV0$h;-><init>(Ljava/lang/String;I)V

    sput-object v7, LrV0$h;->f:LrV0$h;

    new-instance v9, LrV0$h;

    const-string v11, "FINISHED"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, LrV0$h;-><init>(Ljava/lang/String;I)V

    sput-object v9, LrV0$h;->g:LrV0$h;

    const/4 v11, 0x6

    new-array v11, v11, [LrV0$h;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, LrV0$h;->h:[LrV0$h;

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

.method public static valueOf(Ljava/lang/String;)LrV0$h;
    .locals 1

    const-class v0, LrV0$h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LrV0$h;

    return-object p0
.end method

.method public static values()[LrV0$h;
    .locals 1

    sget-object v0, LrV0$h;->h:[LrV0$h;

    invoke-virtual {v0}, [LrV0$h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LrV0$h;

    return-object v0
.end method
