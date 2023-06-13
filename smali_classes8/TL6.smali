.class public final enum LTL6;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LTL6;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LTL6;

.field public static final enum d:LTL6;

.field public static final enum e:LTL6;

.field public static final enum f:LTL6;

.field public static final enum g:LTL6;

.field public static final synthetic h:[LTL6;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 12

    new-instance v0, LTL6;

    const-string v1, "audit"

    const-string v2, "AUDIT_KEY"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LTL6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LTL6;->c:LTL6;

    new-instance v1, LTL6;

    const-string v2, "type"

    const-string v4, "FEATURE"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LTL6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LTL6;->d:LTL6;

    new-instance v2, LTL6;

    const-string v4, "payload"

    const-string v6, "PAYLOAD"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, LTL6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, LTL6;->e:LTL6;

    new-instance v4, LTL6;

    const-string v6, "t"

    const-string v8, "SENSOR_TYPE"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, LTL6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, LTL6;->f:LTL6;

    new-instance v6, LTL6;

    const-string v8, "p"

    const-string v10, "SENSOR_PAYLOAD"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, LTL6;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, LTL6;->g:LTL6;

    const/4 v8, 0x5

    new-array v8, v8, [LTL6;

    aput-object v0, v8, v3

    aput-object v1, v8, v5

    aput-object v2, v8, v7

    aput-object v4, v8, v9

    aput-object v6, v8, v11

    sput-object v8, LTL6;->h:[LTL6;

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

    iput-object p3, p0, LTL6;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LTL6;
    .locals 1

    const-class v0, LTL6;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LTL6;

    return-object p0
.end method

.method public static values()[LTL6;
    .locals 1

    sget-object v0, LTL6;->h:[LTL6;

    invoke-virtual {v0}, [LTL6;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LTL6;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, LTL6;->b:Ljava/lang/String;

    return-object v0
.end method
