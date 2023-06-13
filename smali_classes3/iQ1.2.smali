.class public final enum LiQ1;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/widget/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LiQ1;",
        ">;",
        "Lco/bird/android/widget/d;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0014\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B9\u0008\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u000e\u001a\u00020\t\u0012\u0008\u0008\u0003\u0010\u0011\u001a\u00020\t\u0012\u0008\u0008\u0001\u0010\u0014\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0008\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0011\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u000b\u001a\u0004\u0008\u0010\u0010\rR\u001a\u0010\u0014\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000b\u001a\u0004\u0008\u0013\u0010\rR\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0004\u0010\u0018j\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u0006j\u0002\u0008\u001fj\u0002\u0008 j\u0002\u0008!j\u0002\u0008\"j\u0002\u0008#j\u0002\u0008$j\u0002\u0008%j\u0002\u0008&j\u0002\u0008\'j\u0002\u0008(\u00a8\u0006)"
    }
    d2 = {
        "LiQ1;",
        "",
        "Lco/bird/android/widget/d;",
        "Lco/bird/android/model/IdToolOption;",
        "b",
        "Lco/bird/android/model/IdToolOption;",
        "j",
        "()Lco/bird/android/model/IdToolOption;",
        "option",
        "",
        "c",
        "I",
        "a",
        "()Ljava/lang/Integer;",
        "text",
        "d",
        "getColor",
        "color",
        "e",
        "getIcon",
        "icon",
        "",
        "f",
        "Z",
        "()Z",
        "center",
        "<init>",
        "(Ljava/lang/String;ILco/bird/android/model/IdToolOption;IIIZ)V",
        "g",
        "h",
        "i",
        "k",
        "l",
        "m",
        "n",
        "o",
        "p",
        "q",
        "r",
        "s",
        "t",
        "servicecenter_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum g:LiQ1;

.field public static final enum h:LiQ1;

.field public static final enum i:LiQ1;

.field public static final enum j:LiQ1;

.field public static final enum k:LiQ1;

.field public static final enum l:LiQ1;

.field public static final enum m:LiQ1;

.field public static final enum n:LiQ1;

.field public static final enum o:LiQ1;

.field public static final enum p:LiQ1;

.field public static final enum q:LiQ1;

.field public static final enum r:LiQ1;

.field public static final enum s:LiQ1;

.field public static final enum t:LiQ1;

.field public static final synthetic u:[LiQ1;


# instance fields
.field public final b:Lco/bird/android/model/IdToolOption;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 22

    new-instance v10, LiQ1;

    const-string v1, "QR_CODE"

    const/4 v2, 0x0

    sget-object v3, Lco/bird/android/model/IdToolOption;->QR_CODE:Lco/bird/android/model/IdToolOption;

    sget v4, Lnl4;->id_tools_qr_code_label:I

    const/4 v5, 0x0

    sget v6, Lrg4;->ic_qr_code:I

    const/4 v7, 0x0

    const/16 v8, 0x14

    const/4 v9, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, LiQ1;-><init>(Ljava/lang/String;ILco/bird/android/model/IdToolOption;IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v10, LiQ1;->g:LiQ1;

    new-instance v0, LiQ1;

    const-string v12, "LICENSE_PLATE"

    const/4 v13, 0x1

    sget-object v14, Lco/bird/android/model/IdToolOption;->LICENSE_PLATE:Lco/bird/android/model/IdToolOption;

    sget v15, Lnl4;->id_tools_license_plate_label:I

    const/16 v16, 0x0

    sget v21, Lrg4;->ic_license_plate:I

    const/16 v18, 0x0

    const/16 v19, 0x14

    const/16 v20, 0x0

    move-object v11, v0

    move/from16 v17, v21

    invoke-direct/range {v11 .. v20}, LiQ1;-><init>(Ljava/lang/String;ILco/bird/android/model/IdToolOption;IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LiQ1;->h:LiQ1;

    new-instance v0, LiQ1;

    const-string v2, "BRAIN"

    const/4 v3, 0x2

    sget-object v4, Lco/bird/android/model/IdToolOption;->BRAIN:Lco/bird/android/model/IdToolOption;

    sget v5, Lnl4;->id_tools_brain_label:I

    const/4 v6, 0x0

    sget v7, Lrg4;->ic_vehicle_brain_dark:I

    const/4 v8, 0x0

    const/16 v9, 0x14

    const/4 v10, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, LiQ1;-><init>(Ljava/lang/String;ILco/bird/android/model/IdToolOption;IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LiQ1;->i:LiQ1;

    new-instance v0, LiQ1;

    const-string v12, "HANDLEBAR"

    const/4 v13, 0x3

    sget-object v14, Lco/bird/android/model/IdToolOption;->HANDLEBAR:Lco/bird/android/model/IdToolOption;

    sget v15, Lnl4;->id_tools_handlebar_label:I

    sget v17, Lrg4;->ic_handlebars:I

    move-object v11, v0

    invoke-direct/range {v11 .. v20}, LiQ1;-><init>(Ljava/lang/String;ILco/bird/android/model/IdToolOption;IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LiQ1;->j:LiQ1;

    new-instance v0, LiQ1;

    const-string v2, "GERMAN_LICENSE_PLATE"

    const/4 v3, 0x4

    sget-object v4, Lco/bird/android/model/IdToolOption;->GERMAN_LICENSE_PLATE:Lco/bird/android/model/IdToolOption;

    sget v5, Lnl4;->id_tools_german_license_plate_label:I

    move-object v1, v0

    move/from16 v7, v21

    invoke-direct/range {v1 .. v10}, LiQ1;-><init>(Ljava/lang/String;ILco/bird/android/model/IdToolOption;IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LiQ1;->k:LiQ1;

    new-instance v0, LiQ1;

    const-string v2, "IL_LICENSE_PLATE"

    const/4 v3, 0x5

    sget-object v4, Lco/bird/android/model/IdToolOption;->IL_LICENSE_PLATE:Lco/bird/android/model/IdToolOption;

    sget v5, Lnl4;->id_tools_il_license_plate_label:I

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, LiQ1;-><init>(Ljava/lang/String;ILco/bird/android/model/IdToolOption;IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LiQ1;->l:LiQ1;

    new-instance v0, LiQ1;

    const-string v12, "ONE_CODE"

    const/4 v13, 0x6

    sget-object v14, Lco/bird/android/model/IdToolOption;->ONE_CODE:Lco/bird/android/model/IdToolOption;

    sget v15, Lnl4;->id_tools_one_code_label:I

    sget v17, Lrg4;->ic_stickers:I

    move-object v11, v0

    invoke-direct/range {v11 .. v20}, LiQ1;-><init>(Ljava/lang/String;ILco/bird/android/model/IdToolOption;IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LiQ1;->m:LiQ1;

    new-instance v0, LiQ1;

    const-string v2, "BATTERY_SERIAL"

    const/4 v3, 0x7

    sget-object v4, Lco/bird/android/model/IdToolOption;->BATTERY_SERIAL:Lco/bird/android/model/IdToolOption;

    sget v5, Lnl4;->id_tools_battery_serial_label:I

    sget v7, Lrg4;->ic_battery:I

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, LiQ1;-><init>(Ljava/lang/String;ILco/bird/android/model/IdToolOption;IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LiQ1;->n:LiQ1;

    new-instance v0, LiQ1;

    const-string v2, "US_CA_PLATE"

    const/16 v3, 0x8

    sget-object v4, Lco/bird/android/model/IdToolOption;->US_CA_PLATE:Lco/bird/android/model/IdToolOption;

    sget v5, Lnl4;->id_tools_us_ca_plate_label:I

    move-object v1, v0

    move/from16 v7, v21

    invoke-direct/range {v1 .. v10}, LiQ1;-><init>(Ljava/lang/String;ILco/bird/android/model/IdToolOption;IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LiQ1;->o:LiQ1;

    new-instance v0, LiQ1;

    const-string v12, "MOTOR"

    const/16 v13, 0x9

    sget-object v14, Lco/bird/android/model/IdToolOption;->MOTOR:Lco/bird/android/model/IdToolOption;

    sget v15, Lnl4;->id_tools_motor_label:I

    sget v17, Lrg4;->ic_motor:I

    move-object v11, v0

    invoke-direct/range {v11 .. v20}, LiQ1;-><init>(Ljava/lang/String;ILco/bird/android/model/IdToolOption;IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LiQ1;->p:LiQ1;

    new-instance v0, LiQ1;

    const-string v2, "PCM"

    const/16 v3, 0xa

    sget-object v4, Lco/bird/android/model/IdToolOption;->PCM:Lco/bird/android/model/IdToolOption;

    sget v5, Lnl4;->id_tools_pcm_label:I

    sget v7, Lrg4;->ic_plug:I

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, LiQ1;-><init>(Ljava/lang/String;ILco/bird/android/model/IdToolOption;IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LiQ1;->q:LiQ1;

    new-instance v0, LiQ1;

    const-string v12, "BEACON"

    const/16 v13, 0xb

    sget-object v14, Lco/bird/android/model/IdToolOption;->BEACON:Lco/bird/android/model/IdToolOption;

    sget v15, Lnl4;->id_tools_beacon_label:I

    sget v17, Lrg4;->ic_cellular:I

    move-object v11, v0

    invoke-direct/range {v11 .. v20}, LiQ1;-><init>(Ljava/lang/String;ILco/bird/android/model/IdToolOption;IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LiQ1;->r:LiQ1;

    new-instance v0, LiQ1;

    const-string v2, "HELMET"

    const/16 v3, 0xc

    sget-object v4, Lco/bird/android/model/IdToolOption;->HELMET:Lco/bird/android/model/IdToolOption;

    sget v5, Lnl4;->part_helmet:I

    sget v7, Lrg4;->ic_helmet:I

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, LiQ1;-><init>(Ljava/lang/String;ILco/bird/android/model/IdToolOption;IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LiQ1;->s:LiQ1;

    new-instance v0, LiQ1;

    const-string v12, "PHYSICAL_LOCK_STICKER"

    const/16 v13, 0xd

    sget-object v14, Lco/bird/android/model/IdToolOption;->PHYSICAL_LOCK_STICKER:Lco/bird/android/model/IdToolOption;

    sget v15, Lnl4;->part_physical_lock_sticker:I

    sget v17, Lrg4;->ic_qr_code_with_lock:I

    move-object v11, v0

    invoke-direct/range {v11 .. v20}, LiQ1;-><init>(Ljava/lang/String;ILco/bird/android/model/IdToolOption;IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LiQ1;->t:LiQ1;

    invoke-static {}, LiQ1;->f()[LiQ1;

    move-result-object v0

    sput-object v0, LiQ1;->u:[LiQ1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILco/bird/android/model/IdToolOption;IIIZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/IdToolOption;",
            "IIIZ)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LiQ1;->b:Lco/bird/android/model/IdToolOption;

    iput p4, p0, LiQ1;->c:I

    iput p5, p0, LiQ1;->d:I

    iput p6, p0, LiQ1;->e:I

    iput-boolean p7, p0, LiQ1;->f:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILco/bird/android/model/IdToolOption;IIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_0

    sget v0, LDf4;->birdNewRoad:I

    move v6, v0

    goto :goto_0

    :cond_0
    move v6, p5

    :goto_0
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move v8, v0

    goto :goto_1

    :cond_1
    move/from16 v8, p7

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v7, p6

    invoke-direct/range {v1 .. v8}, LiQ1;-><init>(Ljava/lang/String;ILco/bird/android/model/IdToolOption;IIIZ)V

    return-void
.end method

.method public static final synthetic f()[LiQ1;
    .locals 3

    const/16 v0, 0xe

    new-array v0, v0, [LiQ1;

    const/4 v1, 0x0

    sget-object v2, LiQ1;->g:LiQ1;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LiQ1;->h:LiQ1;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LiQ1;->i:LiQ1;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LiQ1;->j:LiQ1;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LiQ1;->k:LiQ1;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LiQ1;->l:LiQ1;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, LiQ1;->m:LiQ1;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, LiQ1;->n:LiQ1;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, LiQ1;->o:LiQ1;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, LiQ1;->p:LiQ1;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, LiQ1;->q:LiQ1;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, LiQ1;->r:LiQ1;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, LiQ1;->s:LiQ1;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, LiQ1;->t:LiQ1;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LiQ1;
    .locals 1

    const-class v0, LiQ1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LiQ1;

    return-object p0
.end method

.method public static values()[LiQ1;
    .locals 1

    sget-object v0, LiQ1;->u:[LiQ1;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LiQ1;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget v0, p0, LiQ1;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, LiQ1;->f:Z

    return v0
.end method

.method public c()Ljava/lang/Integer;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->e(Lco/bird/android/widget/d;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->f(Lco/bird/android/widget/d;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->j(Lco/bird/android/widget/d;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->h(Lco/bird/android/widget/d;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getColor()Ljava/lang/Integer;
    .locals 1

    iget v0, p0, LiQ1;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getIcon()Ljava/lang/Integer;
    .locals 1

    iget v0, p0, LiQ1;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/Integer;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->d(Lco/bird/android/widget/d;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/lang/Integer;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->g(Lco/bird/android/widget/d;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lco/bird/android/model/IdToolOption;
    .locals 1

    iget-object v0, p0, LiQ1;->b:Lco/bird/android/model/IdToolOption;

    return-object v0
.end method
