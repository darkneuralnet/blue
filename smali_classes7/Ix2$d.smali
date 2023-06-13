.class public final enum LIx2$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIx2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LIx2$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LIx2$d;

.field public static final enum d:LIx2$d;

.field public static final enum e:LIx2$d;

.field public static final enum f:LIx2$d;

.field public static final enum g:LIx2$d;

.field public static final synthetic h:[LIx2$d;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    new-instance v0, LIx2$d;

    const-string v1, "VERBOSE"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, LIx2$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, LIx2$d;->c:LIx2$d;

    new-instance v1, LIx2$d;

    const-string v4, "DEBUG"

    const/4 v5, 0x1

    const/4 v6, 0x3

    invoke-direct {v1, v4, v5, v6}, LIx2$d;-><init>(Ljava/lang/String;II)V

    sput-object v1, LIx2$d;->d:LIx2$d;

    new-instance v4, LIx2$d;

    const-string v7, "INFO"

    const/4 v8, 0x4

    invoke-direct {v4, v7, v3, v8}, LIx2$d;-><init>(Ljava/lang/String;II)V

    sput-object v4, LIx2$d;->e:LIx2$d;

    new-instance v7, LIx2$d;

    const-string v9, "WARN"

    const/4 v10, 0x5

    invoke-direct {v7, v9, v6, v10}, LIx2$d;-><init>(Ljava/lang/String;II)V

    sput-object v7, LIx2$d;->f:LIx2$d;

    new-instance v9, LIx2$d;

    const-string v11, "ERROR"

    const/4 v12, 0x6

    invoke-direct {v9, v11, v8, v12}, LIx2$d;-><init>(Ljava/lang/String;II)V

    sput-object v9, LIx2$d;->g:LIx2$d;

    new-array v10, v10, [LIx2$d;

    aput-object v0, v10, v2

    aput-object v1, v10, v5

    aput-object v4, v10, v3

    aput-object v7, v10, v6

    aput-object v9, v10, v8

    sput-object v10, LIx2$d;->h:[LIx2$d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LIx2$d;->b:I

    return-void
.end method

.method public static synthetic a(LIx2$d;)I
    .locals 0

    iget p0, p0, LIx2$d;->b:I

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)LIx2$d;
    .locals 1

    const-class v0, LIx2$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LIx2$d;

    return-object p0
.end method

.method public static values()[LIx2$d;
    .locals 1

    sget-object v0, LIx2$d;->h:[LIx2$d;

    invoke-virtual {v0}, [LIx2$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LIx2$d;

    return-object v0
.end method
