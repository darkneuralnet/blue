.class public final enum Lcom/google/protobuf/r$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/protobuf/r$f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/google/protobuf/r$f;

.field public static final enum c:Lcom/google/protobuf/r$f;

.field public static final enum d:Lcom/google/protobuf/r$f;

.field public static final enum e:Lcom/google/protobuf/r$f;

.field public static final enum f:Lcom/google/protobuf/r$f;

.field public static final enum g:Lcom/google/protobuf/r$f;

.field public static final enum h:Lcom/google/protobuf/r$f;

.field public static final synthetic i:[Lcom/google/protobuf/r$f;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/protobuf/r$f;

    const-string v1, "GET_MEMOIZED_IS_INITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/r$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/r$f;->b:Lcom/google/protobuf/r$f;

    new-instance v0, Lcom/google/protobuf/r$f;

    const-string v1, "SET_MEMOIZED_IS_INITIALIZED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/r$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/r$f;->c:Lcom/google/protobuf/r$f;

    new-instance v0, Lcom/google/protobuf/r$f;

    const-string v1, "BUILD_MESSAGE_INFO"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/r$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/r$f;->d:Lcom/google/protobuf/r$f;

    new-instance v0, Lcom/google/protobuf/r$f;

    const-string v1, "NEW_MUTABLE_INSTANCE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/r$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/r$f;->e:Lcom/google/protobuf/r$f;

    new-instance v0, Lcom/google/protobuf/r$f;

    const-string v1, "NEW_BUILDER"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/r$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/r$f;->f:Lcom/google/protobuf/r$f;

    new-instance v0, Lcom/google/protobuf/r$f;

    const-string v1, "GET_DEFAULT_INSTANCE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/r$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/r$f;->g:Lcom/google/protobuf/r$f;

    new-instance v0, Lcom/google/protobuf/r$f;

    const-string v1, "GET_PARSER"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/r$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/protobuf/r$f;->h:Lcom/google/protobuf/r$f;

    invoke-static {}, Lcom/google/protobuf/r$f;->a()[Lcom/google/protobuf/r$f;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/r$f;->i:[Lcom/google/protobuf/r$f;

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

.method public static synthetic a()[Lcom/google/protobuf/r$f;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/google/protobuf/r$f;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/protobuf/r$f;->b:Lcom/google/protobuf/r$f;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/google/protobuf/r$f;->c:Lcom/google/protobuf/r$f;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/google/protobuf/r$f;->d:Lcom/google/protobuf/r$f;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/google/protobuf/r$f;->e:Lcom/google/protobuf/r$f;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/google/protobuf/r$f;->f:Lcom/google/protobuf/r$f;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/google/protobuf/r$f;->g:Lcom/google/protobuf/r$f;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/google/protobuf/r$f;->h:Lcom/google/protobuf/r$f;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/r$f;
    .locals 1

    const-class v0, Lcom/google/protobuf/r$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/r$f;

    return-object p0
.end method

.method public static values()[Lcom/google/protobuf/r$f;
    .locals 1

    sget-object v0, Lcom/google/protobuf/r$f;->i:[Lcom/google/protobuf/r$f;

    invoke-virtual {v0}, [Lcom/google/protobuf/r$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/protobuf/r$f;

    return-object v0
.end method
