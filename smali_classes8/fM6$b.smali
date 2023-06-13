.class public final enum LfM6$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LfM6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LfM6$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LfM6$b;

.field public static final enum d:LfM6$b;

.field public static final enum e:LfM6$b;

.field public static final enum f:LfM6$b;

.field public static final enum g:LfM6$b;

.field public static final enum h:LfM6$b;

.field public static final enum i:LfM6$b;

.field public static final enum j:LfM6$b;

.field public static final synthetic k:[LfM6$b;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, LfM6$b;

    const-string v1, "NUMBER_OF_ROOTED_FLAGS"

    const/4 v2, 0x0

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3}, LfM6$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, LfM6$b;->c:LfM6$b;

    new-instance v1, LfM6$b;

    const-string v4, "IS_TEST_KEYS_FOUND"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LfM6$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, LfM6$b;->d:LfM6$b;

    new-instance v4, LfM6$b;

    const-string v6, "IS_SU_FOUND"

    const/4 v7, 0x2

    invoke-direct {v4, v6, v7, v5}, LfM6$b;-><init>(Ljava/lang/String;II)V

    sput-object v4, LfM6$b;->e:LfM6$b;

    new-instance v6, LfM6$b;

    const-string v8, "IS_SUPER_USER_APK_FOUND"

    const/4 v9, 0x3

    invoke-direct {v6, v8, v9, v7}, LfM6$b;-><init>(Ljava/lang/String;II)V

    sput-object v6, LfM6$b;->f:LfM6$b;

    new-instance v8, LfM6$b;

    const-string v10, "DETECT_ROOT_MANAGEMENT_APPS"

    const/4 v11, 0x4

    invoke-direct {v8, v10, v11, v9}, LfM6$b;-><init>(Ljava/lang/String;II)V

    sput-object v8, LfM6$b;->g:LfM6$b;

    new-instance v10, LfM6$b;

    const-string v12, "CHECK_FOR_BINARY_SU"

    const/4 v13, 0x5

    invoke-direct {v10, v12, v13, v11}, LfM6$b;-><init>(Ljava/lang/String;II)V

    sput-object v10, LfM6$b;->h:LfM6$b;

    new-instance v12, LfM6$b;

    const-string v14, "CHECK_FOR_BINARY_BUSYBOX"

    const/4 v15, 0x6

    invoke-direct {v12, v14, v15, v13}, LfM6$b;-><init>(Ljava/lang/String;II)V

    sput-object v12, LfM6$b;->i:LfM6$b;

    new-instance v14, LfM6$b;

    const-string v13, "CHECK_FOR_BINARY_MAGISK"

    invoke-direct {v14, v13, v3, v15}, LfM6$b;-><init>(Ljava/lang/String;II)V

    sput-object v14, LfM6$b;->j:LfM6$b;

    const/16 v13, 0x8

    new-array v13, v13, [LfM6$b;

    aput-object v0, v13, v2

    aput-object v1, v13, v5

    aput-object v4, v13, v7

    aput-object v6, v13, v9

    aput-object v8, v13, v11

    const/4 v0, 0x5

    aput-object v10, v13, v0

    aput-object v12, v13, v15

    aput-object v14, v13, v3

    sput-object v13, LfM6$b;->k:[LfM6$b;

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

    iput p3, p0, LfM6$b;->b:I

    return-void
.end method

.method public static b(I)LfM6$b;
    .locals 2

    sget-object v0, LfM6$b;->d:LfM6$b;

    invoke-virtual {v0}, LfM6$b;->a()I

    move-result v1

    if-ne p0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, LfM6$b;->e:LfM6$b;

    invoke-virtual {v0}, LfM6$b;->a()I

    move-result v1

    if-ne p0, v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, LfM6$b;->f:LfM6$b;

    invoke-virtual {v0}, LfM6$b;->a()I

    move-result v1

    if-ne p0, v1, :cond_2

    return-object v0

    :cond_2
    sget-object v0, LfM6$b;->g:LfM6$b;

    invoke-virtual {v0}, LfM6$b;->a()I

    move-result v1

    if-ne p0, v1, :cond_3

    return-object v0

    :cond_3
    sget-object v0, LfM6$b;->h:LfM6$b;

    invoke-virtual {v0}, LfM6$b;->a()I

    move-result v1

    if-ne p0, v1, :cond_4

    return-object v0

    :cond_4
    sget-object v0, LfM6$b;->i:LfM6$b;

    invoke-virtual {v0}, LfM6$b;->a()I

    move-result v1

    if-ne p0, v1, :cond_5

    return-object v0

    :cond_5
    sget-object v0, LfM6$b;->j:LfM6$b;

    invoke-virtual {v0}, LfM6$b;->a()I

    move-result v1

    if-ne p0, v1, :cond_6

    return-object v0

    :cond_6
    const/4 p0, 0x0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LfM6$b;
    .locals 1

    const-class v0, LfM6$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LfM6$b;

    return-object p0
.end method

.method public static values()[LfM6$b;
    .locals 1

    sget-object v0, LfM6$b;->k:[LfM6$b;

    invoke-virtual {v0}, [LfM6$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LfM6$b;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LfM6$b;->b:I

    return v0
.end method
