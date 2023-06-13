.class public final enum Lkj5;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkj5;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lkj5;

.field public static final enum c:Lkj5;

.field public static final enum d:Lkj5;

.field public static final enum e:Lkj5;

.field public static final enum f:Lkj5;

.field public static final enum g:Lkj5;

.field public static final synthetic h:[Lkj5;


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    new-instance v0, Lkj5;

    const-string v1, "CALLBACK_TYPE_ALL_MATCHES"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkj5;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkj5;->b:Lkj5;

    new-instance v1, Lkj5;

    const-string v3, "CALLBACK_TYPE_FIRST_MATCH"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lkj5;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkj5;->c:Lkj5;

    new-instance v3, Lkj5;

    const-string v5, "CALLBACK_TYPE_MATCH_LOST"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lkj5;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lkj5;->d:Lkj5;

    new-instance v5, Lkj5;

    const-string v7, "CALLBACK_TYPE_BATCH"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lkj5;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lkj5;->e:Lkj5;

    new-instance v7, Lkj5;

    const-string v9, "CALLBACK_TYPE_UNSPECIFIED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lkj5;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lkj5;->f:Lkj5;

    new-instance v9, Lkj5;

    const-string v11, "CALLBACK_TYPE_UNKNOWN"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lkj5;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lkj5;->g:Lkj5;

    const/4 v11, 0x6

    new-array v11, v11, [Lkj5;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lkj5;->h:[Lkj5;

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

.method public static valueOf(Ljava/lang/String;)Lkj5;
    .locals 1

    const-class v0, Lkj5;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkj5;

    return-object p0
.end method

.method public static values()[Lkj5;
    .locals 1

    sget-object v0, Lkj5;->h:[Lkj5;

    invoke-virtual {v0}, [Lkj5;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkj5;

    return-object v0
.end method
