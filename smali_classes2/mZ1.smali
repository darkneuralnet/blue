.class public final enum LmZ1;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LaP1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LmZ1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LmZ1;",
        ">;",
        "LaP1<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0087\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0008\u0010\u0004\u001a\u00020\u0003H\u0016j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "LmZ1;",
        "",
        "LaP1;",
        "",
        "v",
        "<init>",
        "(Ljava/lang/String;I)V",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
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
.field public static final enum b:LmZ1;

.field public static final enum c:LmZ1;

.field public static final enum d:LmZ1;

.field public static final enum e:LmZ1;

.field public static final enum f:LmZ1;

.field public static final enum g:LmZ1;

.field public static final synthetic h:[LmZ1;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LmZ1;

    const-string v1, "IMAGE_DOWNLOAD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LmZ1;-><init>(Ljava/lang/String;I)V

    sput-object v0, LmZ1;->b:LmZ1;

    new-instance v0, LmZ1;

    const-string v1, "TEMPLATE_REQUEST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LmZ1;-><init>(Ljava/lang/String;I)V

    sput-object v0, LmZ1;->c:LmZ1;

    new-instance v0, LmZ1;

    const-string v1, "ZIP_ASSET_DOWNLOAD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LmZ1;-><init>(Ljava/lang/String;I)V

    sput-object v0, LmZ1;->d:LmZ1;

    new-instance v0, LmZ1;

    const-string v1, "DISPLAY_VIEW_GENERATION"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LmZ1;-><init>(Ljava/lang/String;I)V

    sput-object v0, LmZ1;->e:LmZ1;

    new-instance v0, LmZ1;

    const-string v1, "INTERNAL_TIMEOUT_EXCEEDED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LmZ1;-><init>(Ljava/lang/String;I)V

    sput-object v0, LmZ1;->f:LmZ1;

    new-instance v0, LmZ1;

    const-string v1, "UNKNOWN_MESSAGE_TYPE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LmZ1;-><init>(Ljava/lang/String;I)V

    sput-object v0, LmZ1;->g:LmZ1;

    invoke-static {}, LmZ1;->e()[LmZ1;

    move-result-object v0

    sput-object v0, LmZ1;->h:[LmZ1;

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

.method public static final synthetic e()[LmZ1;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [LmZ1;

    sget-object v1, LmZ1;->b:LmZ1;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LmZ1;->c:LmZ1;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LmZ1;->d:LmZ1;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LmZ1;->e:LmZ1;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, LmZ1;->f:LmZ1;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, LmZ1;->g:LmZ1;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LmZ1;
    .locals 1

    const-class v0, LmZ1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LmZ1;

    return-object p0
.end method

.method public static values()[LmZ1;
    .locals 1

    sget-object v0, LmZ1;->h:[LmZ1;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LmZ1;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic forJsonPut()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LmZ1;->v()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v()Ljava/lang/String;
    .locals 2

    sget-object v0, LmZ1$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    const-string v0, "umt"

    goto :goto_0

    :pswitch_1
    const-string v0, "te"

    goto :goto_0

    :pswitch_2
    const-string v0, "vf"

    goto :goto_0

    :pswitch_3
    const-string v0, "zf"

    goto :goto_0

    :pswitch_4
    const-string v0, "tf"

    goto :goto_0

    :pswitch_5
    const-string v0, "if"

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
