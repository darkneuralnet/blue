.class public final enum LoT2;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lp31;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LoT2;",
        ">;",
        "Lp31;"
    }
.end annotation


# static fields
.field public static final enum c:LoT2;

.field public static final enum d:LoT2;

.field public static final enum e:LoT2;

.field public static final enum f:LoT2;

.field public static final enum g:LoT2;

.field public static final enum h:LoT2;

.field public static final synthetic i:[LoT2;


# instance fields
.field public b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    new-instance v0, LoT2;

    const v1, 0x13350ac

    const-string v2, "MESSAGE_DIALOG"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LoT2;-><init>(Ljava/lang/String;II)V

    sput-object v0, LoT2;->c:LoT2;

    new-instance v1, LoT2;

    const v2, 0x1335124

    const-string v4, "PHOTOS"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LoT2;-><init>(Ljava/lang/String;II)V

    sput-object v1, LoT2;->d:LoT2;

    new-instance v2, LoT2;

    const v4, 0x13354a2

    const-string v6, "VIDEO"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, LoT2;-><init>(Ljava/lang/String;II)V

    sput-object v2, LoT2;->e:LoT2;

    new-instance v4, LoT2;

    const-string v6, "MESSENGER_GENERIC_TEMPLATE"

    const/4 v8, 0x3

    const v9, 0x133c96b

    invoke-direct {v4, v6, v8, v9}, LoT2;-><init>(Ljava/lang/String;II)V

    sput-object v4, LoT2;->f:LoT2;

    new-instance v6, LoT2;

    const-string v10, "MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v9}, LoT2;-><init>(Ljava/lang/String;II)V

    sput-object v6, LoT2;->g:LoT2;

    new-instance v10, LoT2;

    const-string v12, "MESSENGER_MEDIA_TEMPLATE"

    const/4 v13, 0x5

    invoke-direct {v10, v12, v13, v9}, LoT2;-><init>(Ljava/lang/String;II)V

    sput-object v10, LoT2;->h:LoT2;

    const/4 v9, 0x6

    new-array v9, v9, [LoT2;

    aput-object v0, v9, v3

    aput-object v1, v9, v5

    aput-object v2, v9, v7

    aput-object v4, v9, v8

    aput-object v6, v9, v11

    aput-object v10, v9, v13

    sput-object v9, LoT2;->i:[LoT2;

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

    iput p3, p0, LoT2;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LoT2;
    .locals 1

    const-class v0, LoT2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LoT2;

    return-object p0
.end method

.method public static values()[LoT2;
    .locals 1

    sget-object v0, LoT2;->i:[LoT2;

    invoke-virtual {v0}, [LoT2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LoT2;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LoT2;->b:I

    return v0
.end method

.method public getAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.facebook.platform.action.request.MESSAGE_DIALOG"

    return-object v0
.end method
