.class public final enum Lox2$b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LF94;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lox2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lox2$b;",
        ">;",
        "LF94;"
    }
.end annotation


# static fields
.field public static final enum c:Lox2$b;

.field public static final enum d:Lox2$b;

.field public static final enum e:Lox2$b;

.field public static final enum f:Lox2$b;

.field public static final enum g:Lox2$b;

.field public static final enum h:Lox2$b;

.field public static final enum i:Lox2$b;

.field public static final synthetic j:[Lox2$b;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    new-instance v0, Lox2$b;

    const-string v1, "REASON_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lox2$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lox2$b;->c:Lox2$b;

    new-instance v1, Lox2$b;

    const-string v3, "MESSAGE_TOO_OLD"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lox2$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lox2$b;->d:Lox2$b;

    new-instance v3, Lox2$b;

    const-string v5, "CACHE_FULL"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lox2$b;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lox2$b;->e:Lox2$b;

    new-instance v5, Lox2$b;

    const-string v7, "PAYLOAD_TOO_BIG"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lox2$b;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lox2$b;->f:Lox2$b;

    new-instance v7, Lox2$b;

    const-string v9, "MAX_RETRIES_REACHED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lox2$b;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lox2$b;->g:Lox2$b;

    new-instance v9, Lox2$b;

    const-string v11, "INVALID_PAYLOD"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, Lox2$b;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lox2$b;->h:Lox2$b;

    new-instance v11, Lox2$b;

    const-string v13, "SERVER_ERROR"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v14}, Lox2$b;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lox2$b;->i:Lox2$b;

    const/4 v13, 0x7

    new-array v13, v13, [Lox2$b;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, Lox2$b;->j:[Lox2$b;

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

    iput p3, p0, Lox2$b;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lox2$b;
    .locals 1

    const-class v0, Lox2$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lox2$b;

    return-object p0
.end method

.method public static values()[Lox2$b;
    .locals 1

    sget-object v0, Lox2$b;->j:[Lox2$b;

    invoke-virtual {v0}, [Lox2$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lox2$b;

    return-object v0
.end method


# virtual methods
.method public getNumber()I
    .locals 1

    iget v0, p0, Lox2$b;->b:I

    return v0
.end method
