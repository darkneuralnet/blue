.class public final enum Lw20;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw20;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0011\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0006j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lw20;",
        "",
        "",
        "b",
        "I",
        "c",
        "()I",
        "widthDp",
        "heightDp",
        "<init>",
        "(Ljava/lang/String;III)V",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final enum d:Lw20;

.field public static final enum e:Lw20;

.field public static final enum f:Lw20;

.field public static final enum g:Lw20;

.field public static final enum h:Lw20;

.field public static final enum i:Lw20;

.field public static final enum j:Lw20;

.field public static final enum k:Lw20;

.field public static final synthetic l:[Lw20;


# instance fields
.field public final b:I

.field public final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lw20;

    const-string v1, "NOTIFICATION_EXPANDED_IMAGE"

    const/4 v2, 0x0

    const/16 v3, 0x1de

    const/16 v4, 0x100

    invoke-direct {v0, v1, v2, v3, v4}, Lw20;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lw20;->d:Lw20;

    new-instance v0, Lw20;

    const/4 v1, 0x1

    const/16 v3, 0x180

    const-string v5, "NOTIFICATION_INLINE_PUSH_IMAGE"

    invoke-direct {v0, v5, v1, v3, v4}, Lw20;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lw20;->e:Lw20;

    new-instance v0, Lw20;

    const/4 v1, 0x2

    const/16 v3, 0x40

    const-string v5, "NOTIFICATION_LARGE_ICON"

    invoke-direct {v0, v5, v1, v3, v3}, Lw20;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lw20;->f:Lw20;

    new-instance v0, Lw20;

    const/4 v1, 0x3

    const/16 v3, 0x80

    const-string v5, "NOTIFICATION_ONE_IMAGE_STORY"

    invoke-direct {v0, v5, v1, v4, v3}, Lw20;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lw20;->g:Lw20;

    new-instance v0, Lw20;

    const/4 v1, 0x4

    const/16 v3, 0x200

    const-string v4, "BASE_CARD_VIEW"

    invoke-direct {v0, v4, v1, v3, v3}, Lw20;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lw20;->h:Lw20;

    new-instance v0, Lw20;

    const/4 v1, 0x5

    const/16 v3, 0x244

    const-string v4, "IN_APP_MESSAGE_MODAL"

    invoke-direct {v0, v4, v1, v3, v3}, Lw20;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lw20;->i:Lw20;

    new-instance v0, Lw20;

    const/4 v1, 0x6

    const/16 v3, 0x64

    const-string v4, "IN_APP_MESSAGE_SLIDEUP"

    invoke-direct {v0, v4, v1, v3, v3}, Lw20;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lw20;->j:Lw20;

    new-instance v0, Lw20;

    const-string v1, "NO_BOUNDS"

    const/4 v3, 0x7

    invoke-direct {v0, v1, v3, v2, v2}, Lw20;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lw20;->k:Lw20;

    invoke-static {}, Lw20;->a()[Lw20;

    move-result-object v0

    sput-object v0, Lw20;->l:[Lw20;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lw20;->b:I

    iput p4, p0, Lw20;->c:I

    return-void
.end method

.method public static final synthetic a()[Lw20;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Lw20;

    sget-object v1, Lw20;->d:Lw20;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lw20;->e:Lw20;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lw20;->f:Lw20;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lw20;->g:Lw20;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lw20;->h:Lw20;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lw20;->i:Lw20;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lw20;->j:Lw20;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lw20;->k:Lw20;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lw20;
    .locals 1

    const-class v0, Lw20;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw20;

    return-object p0
.end method

.method public static values()[Lw20;
    .locals 1

    sget-object v0, Lw20;->l:[Lw20;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw20;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, Lw20;->c:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lw20;->b:I

    return v0
.end method
