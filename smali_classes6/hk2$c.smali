.class public final enum Lhk2$c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/v$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhk2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhk2$c;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/v$c;"
    }
.end annotation


# static fields
.field public static final enum c:Lhk2$c;

.field public static final enum d:Lhk2$c;

.field public static final enum e:Lhk2$c;

.field public static final enum f:Lhk2$c;

.field public static final enum g:Lhk2$c;

.field public static final enum h:Lhk2$c;

.field public static final i:Lcom/google/crypto/tink/shaded/protobuf/v$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/v$d<",
            "Lhk2$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic j:[Lhk2$c;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    new-instance v0, Lhk2$c;

    const-string v1, "UNKNOWN_KEYMATERIAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lhk2$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhk2$c;->c:Lhk2$c;

    new-instance v1, Lhk2$c;

    const-string v3, "SYMMETRIC"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lhk2$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lhk2$c;->d:Lhk2$c;

    new-instance v3, Lhk2$c;

    const-string v5, "ASYMMETRIC_PRIVATE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lhk2$c;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lhk2$c;->e:Lhk2$c;

    new-instance v5, Lhk2$c;

    const-string v7, "ASYMMETRIC_PUBLIC"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lhk2$c;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lhk2$c;->f:Lhk2$c;

    new-instance v7, Lhk2$c;

    const-string v9, "REMOTE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lhk2$c;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lhk2$c;->g:Lhk2$c;

    new-instance v9, Lhk2$c;

    const/4 v11, -0x1

    const-string v12, "UNRECOGNIZED"

    const/4 v13, 0x5

    invoke-direct {v9, v12, v13, v11}, Lhk2$c;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lhk2$c;->h:Lhk2$c;

    const/4 v11, 0x6

    new-array v11, v11, [Lhk2$c;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v13

    sput-object v11, Lhk2$c;->j:[Lhk2$c;

    new-instance v0, Lhk2$c$a;

    invoke-direct {v0}, Lhk2$c$a;-><init>()V

    sput-object v0, Lhk2$c;->i:Lcom/google/crypto/tink/shaded/protobuf/v$d;

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

    iput p3, p0, Lhk2$c;->b:I

    return-void
.end method

.method public static a(I)Lhk2$c;
    .locals 1

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lhk2$c;->g:Lhk2$c;

    return-object p0

    :cond_1
    sget-object p0, Lhk2$c;->f:Lhk2$c;

    return-object p0

    :cond_2
    sget-object p0, Lhk2$c;->e:Lhk2$c;

    return-object p0

    :cond_3
    sget-object p0, Lhk2$c;->d:Lhk2$c;

    return-object p0

    :cond_4
    sget-object p0, Lhk2$c;->c:Lhk2$c;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lhk2$c;
    .locals 1

    const-class v0, Lhk2$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhk2$c;

    return-object p0
.end method

.method public static values()[Lhk2$c;
    .locals 1

    sget-object v0, Lhk2$c;->j:[Lhk2$c;

    invoke-virtual {v0}, [Lhk2$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhk2$c;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 2

    sget-object v0, Lhk2$c;->h:Lhk2$c;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lhk2$c;->b:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
