.class public final enum LWL6$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LWL6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LWL6$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LWL6$e;

.field public static final enum d:LWL6$e;

.field public static final enum e:LWL6$e;

.field public static final enum f:LWL6$e;

.field public static final enum g:LWL6$e;

.field public static final enum h:LWL6$e;

.field public static final enum i:LWL6$e;

.field public static final synthetic j:[LWL6$e;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, LWL6$e;

    const-string v1, "mec"

    const-string v2, "FIFO_MAX_EVENT_COUNT"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LWL6$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LWL6$e;->c:LWL6$e;

    new-instance v1, LWL6$e;

    const-string v2, "mr"

    const-string v4, "MAX_RANGE"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LWL6$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LWL6$e;->d:LWL6$e;

    new-instance v2, LWL6$e;

    const-string v4, "n"

    const-string v6, "NAME"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, LWL6$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, LWL6$e;->e:LWL6$e;

    new-instance v4, LWL6$e;

    const-string v6, "pwr"

    const-string v8, "POWER"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, LWL6$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, LWL6$e;->f:LWL6$e;

    new-instance v6, LWL6$e;

    const-string v8, "re"

    const-string v10, "RESOLUTION"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, LWL6$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, LWL6$e;->g:LWL6$e;

    new-instance v8, LWL6$e;

    const-string v10, "v"

    const-string v12, "VENDOR"

    const/4 v13, 0x5

    invoke-direct {v8, v12, v13, v10}, LWL6$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, LWL6$e;->h:LWL6$e;

    new-instance v10, LWL6$e;

    const-string v12, "ver"

    const-string v14, "VERSION"

    const/4 v15, 0x6

    invoke-direct {v10, v14, v15, v12}, LWL6$e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, LWL6$e;->i:LWL6$e;

    const/4 v12, 0x7

    new-array v12, v12, [LWL6$e;

    aput-object v0, v12, v3

    aput-object v1, v12, v5

    aput-object v2, v12, v7

    aput-object v4, v12, v9

    aput-object v6, v12, v11

    aput-object v8, v12, v13

    aput-object v10, v12, v15

    sput-object v12, LWL6$e;->j:[LWL6$e;

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

    iput-object p3, p0, LWL6$e;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LWL6$e;
    .locals 1

    const-class v0, LWL6$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LWL6$e;

    return-object p0
.end method

.method public static values()[LWL6$e;
    .locals 1

    sget-object v0, LWL6$e;->j:[LWL6$e;

    invoke-virtual {v0}, [LWL6$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LWL6$e;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, LWL6$e;->b:Ljava/lang/String;

    return-object v0
.end method
