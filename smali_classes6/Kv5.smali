.class public final enum LKv5;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/t$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LKv5$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LKv5;",
        ">;",
        "Lcom/google/protobuf/t$c;"
    }
.end annotation


# static fields
.field public static final enum c:LKv5;

.field public static final enum d:LKv5;

.field public static final e:Lcom/google/protobuf/t$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/t$d<",
            "LKv5;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic f:[LKv5;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, LKv5;

    const-string v1, "SESSION_VERBOSITY_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LKv5;-><init>(Ljava/lang/String;II)V

    sput-object v0, LKv5;->c:LKv5;

    new-instance v1, LKv5;

    const-string v3, "GAUGES_AND_SYSTEM_EVENTS"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LKv5;-><init>(Ljava/lang/String;II)V

    sput-object v1, LKv5;->d:LKv5;

    const/4 v3, 0x2

    new-array v3, v3, [LKv5;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, LKv5;->f:[LKv5;

    new-instance v0, LKv5$a;

    invoke-direct {v0}, LKv5$a;-><init>()V

    sput-object v0, LKv5;->e:Lcom/google/protobuf/t$d;

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

    iput p3, p0, LKv5;->b:I

    return-void
.end method

.method public static a(I)LKv5;
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LKv5;->d:LKv5;

    return-object p0

    :cond_1
    sget-object p0, LKv5;->c:LKv5;

    return-object p0
.end method

.method public static b()Lcom/google/protobuf/t$e;
    .locals 1

    sget-object v0, LKv5$b;->a:Lcom/google/protobuf/t$e;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LKv5;
    .locals 1

    const-class v0, LKv5;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LKv5;

    return-object p0
.end method

.method public static values()[LKv5;
    .locals 1

    sget-object v0, LKv5;->f:[LKv5;

    invoke-virtual {v0}, [LKv5;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LKv5;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 1

    iget v0, p0, LKv5;->b:I

    return v0
.end method
