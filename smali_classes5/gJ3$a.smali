.class public final enum LgJ3$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LgJ3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LgJ3$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LgJ3$a;

.field public static final enum d:LgJ3$a;

.field public static final enum e:LgJ3$a;

.field public static final enum f:LgJ3$a;

.field public static final enum g:LgJ3$a;

.field public static final synthetic h:[LgJ3$a;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 12

    new-instance v0, LgJ3$a;

    const-string v1, "ID"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, LgJ3$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LgJ3$a;->c:LgJ3$a;

    new-instance v1, LgJ3$a;

    const-string v4, "TEXT"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, LgJ3$a;-><init>(Ljava/lang/String;II)V

    sput-object v1, LgJ3$a;->d:LgJ3$a;

    new-instance v4, LgJ3$a;

    const-string v6, "TAG"

    const/4 v7, 0x4

    invoke-direct {v4, v6, v5, v7}, LgJ3$a;-><init>(Ljava/lang/String;II)V

    sput-object v4, LgJ3$a;->e:LgJ3$a;

    new-instance v6, LgJ3$a;

    const/16 v8, 0x8

    const-string v9, "DESCRIPTION"

    const/4 v10, 0x3

    invoke-direct {v6, v9, v10, v8}, LgJ3$a;-><init>(Ljava/lang/String;II)V

    sput-object v6, LgJ3$a;->f:LgJ3$a;

    new-instance v8, LgJ3$a;

    const-string v9, "HINT"

    const/16 v11, 0x10

    invoke-direct {v8, v9, v7, v11}, LgJ3$a;-><init>(Ljava/lang/String;II)V

    sput-object v8, LgJ3$a;->g:LgJ3$a;

    const/4 v9, 0x5

    new-array v9, v9, [LgJ3$a;

    aput-object v0, v9, v2

    aput-object v1, v9, v3

    aput-object v4, v9, v5

    aput-object v6, v9, v10

    aput-object v8, v9, v7

    sput-object v9, LgJ3$a;->h:[LgJ3$a;

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

    iput p3, p0, LgJ3$a;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LgJ3$a;
    .locals 1

    const-class v0, LgJ3$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LgJ3$a;

    return-object p0
.end method

.method public static values()[LgJ3$a;
    .locals 1

    sget-object v0, LgJ3$a;->h:[LgJ3$a;

    invoke-virtual {v0}, [LgJ3$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LgJ3$a;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LgJ3$a;->b:I

    return v0
.end method
