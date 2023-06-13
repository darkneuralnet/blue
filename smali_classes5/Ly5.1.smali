.class public final enum LLy5;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lp31;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LLy5;",
        ">;",
        "Lp31;"
    }
.end annotation


# static fields
.field public static final enum c:LLy5;

.field public static final enum d:LLy5;

.field public static final enum e:LLy5;

.field public static final enum f:LLy5;

.field public static final enum g:LLy5;

.field public static final enum h:LLy5;

.field public static final synthetic i:[LLy5;


# instance fields
.field public b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    new-instance v0, LLy5;

    const v1, 0x1332b3a

    const-string v2, "SHARE_DIALOG"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LLy5;-><init>(Ljava/lang/String;II)V

    sput-object v0, LLy5;->c:LLy5;

    new-instance v1, LLy5;

    const v2, 0x13350ac

    const-string v4, "PHOTOS"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LLy5;-><init>(Ljava/lang/String;II)V

    sput-object v1, LLy5;->d:LLy5;

    new-instance v2, LLy5;

    const v4, 0x13353e4

    const-string v6, "VIDEO"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, LLy5;-><init>(Ljava/lang/String;II)V

    sput-object v2, LLy5;->e:LLy5;

    new-instance v4, LLy5;

    const-string v6, "MULTIMEDIA"

    const/4 v8, 0x3

    const v9, 0x1339f47

    invoke-direct {v4, v6, v8, v9}, LLy5;-><init>(Ljava/lang/String;II)V

    sput-object v4, LLy5;->f:LLy5;

    new-instance v6, LLy5;

    const-string v10, "HASHTAG"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v9}, LLy5;-><init>(Ljava/lang/String;II)V

    sput-object v6, LLy5;->g:LLy5;

    new-instance v10, LLy5;

    const-string v12, "LINK_SHARE_QUOTES"

    const/4 v13, 0x5

    invoke-direct {v10, v12, v13, v9}, LLy5;-><init>(Ljava/lang/String;II)V

    sput-object v10, LLy5;->h:LLy5;

    const/4 v9, 0x6

    new-array v9, v9, [LLy5;

    aput-object v0, v9, v3

    aput-object v1, v9, v5

    aput-object v2, v9, v7

    aput-object v4, v9, v8

    aput-object v6, v9, v11

    aput-object v10, v9, v13

    sput-object v9, LLy5;->i:[LLy5;

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

    iput p3, p0, LLy5;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LLy5;
    .locals 1

    const-class v0, LLy5;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LLy5;

    return-object p0
.end method

.method public static values()[LLy5;
    .locals 1

    sget-object v0, LLy5;->i:[LLy5;

    invoke-virtual {v0}, [LLy5;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LLy5;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LLy5;->b:I

    return v0
.end method

.method public getAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.facebook.platform.action.request.FEED_DIALOG"

    return-object v0
.end method
