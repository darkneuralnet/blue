.class public final enum LmB5$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LmB5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LmB5$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LmB5$a;

.field public static final enum c:LmB5$a;

.field public static final enum d:LmB5$a;

.field public static final enum e:LmB5$a;

.field public static final enum f:LmB5$a;

.field public static final enum g:LmB5$a;

.field public static final synthetic h:[LmB5$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    new-instance v0, LmB5$a;

    const-string v1, "PENDING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LmB5$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LmB5$a;->b:LmB5$a;

    new-instance v1, LmB5$a;

    const-string v3, "RUNNING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LmB5$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, LmB5$a;->c:LmB5$a;

    new-instance v3, LmB5$a;

    const-string v5, "WAITING_FOR_SIZE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, LmB5$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, LmB5$a;->d:LmB5$a;

    new-instance v5, LmB5$a;

    const-string v7, "COMPLETE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, LmB5$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, LmB5$a;->e:LmB5$a;

    new-instance v7, LmB5$a;

    const-string v9, "FAILED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, LmB5$a;-><init>(Ljava/lang/String;I)V

    sput-object v7, LmB5$a;->f:LmB5$a;

    new-instance v9, LmB5$a;

    const-string v11, "CLEARED"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, LmB5$a;-><init>(Ljava/lang/String;I)V

    sput-object v9, LmB5$a;->g:LmB5$a;

    const/4 v11, 0x6

    new-array v11, v11, [LmB5$a;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, LmB5$a;->h:[LmB5$a;

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

.method public static valueOf(Ljava/lang/String;)LmB5$a;
    .locals 1

    const-class v0, LmB5$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LmB5$a;

    return-object p0
.end method

.method public static values()[LmB5$a;
    .locals 1

    sget-object v0, LmB5$a;->h:[LmB5$a;

    invoke-virtual {v0}, [LmB5$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LmB5$a;

    return-object v0
.end method
