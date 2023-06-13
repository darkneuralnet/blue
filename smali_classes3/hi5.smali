.class public final enum Lhi5;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhi5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0014\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B;\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\r\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0004\u001a\u0004\u0008\t\u0010\u0006R\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0004\u001a\u0004\u0008\u0008\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0004\u001a\u0004\u0008\u000b\u0010\u0006j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lhi5;",
        "",
        "",
        "b",
        "I",
        "f",
        "()I",
        "titleRes",
        "c",
        "e",
        "subtitleRes",
        "d",
        "buttonRes",
        "background",
        "icon",
        "<init>",
        "(Ljava/lang/String;IIIIII)V",
        "g",
        "h",
        "i",
        "j",
        "k",
        "save-money_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum g:Lhi5;

.field public static final enum h:Lhi5;

.field public static final enum i:Lhi5;

.field public static final enum j:Lhi5;

.field public static final enum k:Lhi5;

.field public static final synthetic l:[Lhi5;


# instance fields
.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 18

    new-instance v8, Lhi5;

    const-string v1, "BIRD_PLUS"

    const/4 v2, 0x0

    sget v3, Lnl4;->save_money_bird_plus_titlecased:I

    sget v4, Lnl4;->save_money_bird_plus_subtitle:I

    sget v5, Lnl4;->save_money_bird_plus_cta_titlecased:I

    sget v17, Lig4;->background_gradient_bird_plus:I

    sget v7, Lrg4;->ic_save_money_birdplus:I

    move-object v0, v8

    move/from16 v6, v17

    invoke-direct/range {v0 .. v7}, Lhi5;-><init>(Ljava/lang/String;IIIIII)V

    sput-object v8, Lhi5;->g:Lhi5;

    new-instance v0, Lhi5;

    const-string v10, "RIDE_PASS"

    const/4 v11, 0x1

    sget v12, Lnl4;->save_money_ride_pass_titlecased:I

    sget v13, Lnl4;->save_money_ride_pass_subtitle:I

    sget v14, Lnl4;->save_money_ride_pass_cta_titlecased:I

    sget v16, Lrg4;->ic_save_money_ridepass:I

    move-object v9, v0

    move/from16 v15, v17

    invoke-direct/range {v9 .. v16}, Lhi5;-><init>(Ljava/lang/String;IIIIII)V

    sput-object v0, Lhi5;->h:Lhi5;

    new-instance v0, Lhi5;

    const-string v10, "G1G1"

    const/4 v11, 0x2

    sget v12, Lnl4;->save_money_refer_a_friend_title_titlecased:I

    sget v13, Lnl4;->save_money_refer_a_friend_subtitle:I

    sget v14, Lnl4;->save_money_refer_a_friend_cta_titlecased:I

    sget v16, Lrg4;->ic_save_money_g1g1:I

    move-object v9, v0

    invoke-direct/range {v9 .. v16}, Lhi5;-><init>(Ljava/lang/String;IIIIII)V

    sput-object v0, Lhi5;->i:Lhi5;

    new-instance v0, Lhi5;

    const-string v10, "PRELOAD"

    const/4 v11, 0x3

    sget v12, Lnl4;->save_money_preload_title_titlecased:I

    sget v13, Lnl4;->save_money_preload_subtitle:I

    sget v14, Lnl4;->save_money_preload_cta_titlecased:I

    sget v16, Lrg4;->ic_save_money_preload:I

    move-object v9, v0

    invoke-direct/range {v9 .. v16}, Lhi5;-><init>(Ljava/lang/String;IIIIII)V

    sput-object v0, Lhi5;->j:Lhi5;

    new-instance v0, Lhi5;

    const-string v10, "NOTIFICATIONS"

    const/4 v11, 0x4

    sget v12, Lnl4;->save_money_push_notification_title_titlecased:I

    sget v13, Lnl4;->save_money_push_notification_subtitle:I

    sget v14, Lnl4;->save_money_push_notification_cta_titlecased:I

    sget v16, Lrg4;->ic_save_money_push:I

    move-object v9, v0

    invoke-direct/range {v9 .. v16}, Lhi5;-><init>(Ljava/lang/String;IIIIII)V

    sput-object v0, Lhi5;->k:Lhi5;

    invoke-static {}, Lhi5;->a()[Lhi5;

    move-result-object v0

    sput-object v0, Lhi5;->l:[Lhi5;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIIIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIII)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lhi5;->b:I

    iput p4, p0, Lhi5;->c:I

    iput p5, p0, Lhi5;->d:I

    iput p6, p0, Lhi5;->e:I

    iput p7, p0, Lhi5;->f:I

    return-void
.end method

.method public static final synthetic a()[Lhi5;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lhi5;

    const/4 v1, 0x0

    sget-object v2, Lhi5;->g:Lhi5;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lhi5;->h:Lhi5;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lhi5;->i:Lhi5;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lhi5;->j:Lhi5;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lhi5;->k:Lhi5;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhi5;
    .locals 1

    const-class v0, Lhi5;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhi5;

    return-object p0
.end method

.method public static values()[Lhi5;
    .locals 1

    sget-object v0, Lhi5;->l:[Lhi5;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhi5;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, Lhi5;->e:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lhi5;->d:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lhi5;->f:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lhi5;->c:I

    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lhi5;->b:I

    return v0
.end method
