.class public final enum LL73$e;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/t$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL73;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL73$e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LL73$e;",
        ">;",
        "Lcom/google/protobuf/t$c;"
    }
.end annotation


# static fields
.field public static final enum c:LL73$e;

.field public static final enum d:LL73$e;

.field public static final e:Lcom/google/protobuf/t$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/t$d<",
            "LL73$e;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic f:[LL73$e;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, LL73$e;

    const-string v1, "NETWORK_CLIENT_ERROR_REASON_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LL73$e;-><init>(Ljava/lang/String;II)V

    sput-object v0, LL73$e;->c:LL73$e;

    new-instance v1, LL73$e;

    const-string v3, "GENERIC_CLIENT_ERROR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LL73$e;-><init>(Ljava/lang/String;II)V

    sput-object v1, LL73$e;->d:LL73$e;

    const/4 v3, 0x2

    new-array v3, v3, [LL73$e;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, LL73$e;->f:[LL73$e;

    new-instance v0, LL73$e$a;

    invoke-direct {v0}, LL73$e$a;-><init>()V

    sput-object v0, LL73$e;->e:Lcom/google/protobuf/t$d;

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

    iput p3, p0, LL73$e;->b:I

    return-void
.end method

.method public static a(I)LL73$e;
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LL73$e;->d:LL73$e;

    return-object p0

    :cond_1
    sget-object p0, LL73$e;->c:LL73$e;

    return-object p0
.end method

.method public static b()Lcom/google/protobuf/t$e;
    .locals 1

    sget-object v0, LL73$e$b;->a:Lcom/google/protobuf/t$e;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LL73$e;
    .locals 1

    const-class v0, LL73$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LL73$e;

    return-object p0
.end method

.method public static values()[LL73$e;
    .locals 1

    sget-object v0, LL73$e;->f:[LL73$e;

    invoke-virtual {v0}, [LL73$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LL73$e;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 1

    iget v0, p0, LL73$e;->b:I

    return v0
.end method
