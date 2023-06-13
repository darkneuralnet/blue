.class public final enum Lim;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/t$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lim$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lim;",
        ">;",
        "Lcom/google/protobuf/t$c;"
    }
.end annotation


# static fields
.field public static final enum c:Lim;

.field public static final enum d:Lim;

.field public static final enum e:Lim;

.field public static final enum f:Lim;

.field public static final g:Lcom/google/protobuf/t$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/t$d<",
            "Lim;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic h:[Lim;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lim;

    const-string v1, "APPLICATION_PROCESS_STATE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lim;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lim;->c:Lim;

    new-instance v1, Lim;

    const-string v3, "FOREGROUND"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lim;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lim;->d:Lim;

    new-instance v3, Lim;

    const-string v5, "BACKGROUND"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lim;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lim;->e:Lim;

    new-instance v5, Lim;

    const-string v7, "FOREGROUND_BACKGROUND"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lim;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lim;->f:Lim;

    const/4 v7, 0x4

    new-array v7, v7, [Lim;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lim;->h:[Lim;

    new-instance v0, Lim$a;

    invoke-direct {v0}, Lim$a;-><init>()V

    sput-object v0, Lim;->g:Lcom/google/protobuf/t$d;

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

    iput p3, p0, Lim;->b:I

    return-void
.end method

.method public static a(I)Lim;
    .locals 1

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lim;->f:Lim;

    return-object p0

    :cond_1
    sget-object p0, Lim;->e:Lim;

    return-object p0

    :cond_2
    sget-object p0, Lim;->d:Lim;

    return-object p0

    :cond_3
    sget-object p0, Lim;->c:Lim;

    return-object p0
.end method

.method public static b()Lcom/google/protobuf/t$e;
    .locals 1

    sget-object v0, Lim$b;->a:Lcom/google/protobuf/t$e;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lim;
    .locals 1

    const-class v0, Lim;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lim;

    return-object p0
.end method

.method public static values()[Lim;
    .locals 1

    sget-object v0, Lim;->h:[Lim;

    invoke-virtual {v0}, [Lim;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lim;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 1

    iget v0, p0, Lim;->b:I

    return v0
.end method
