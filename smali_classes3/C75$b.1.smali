.class public final enum LC75$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC75;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC75$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LC75$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u000f\u0008\u0086\u0001\u0018\u0000 \u00142\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B7\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0002\u0012\n\u0008\u0003\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\t\u001a\u0004\u0008\u0008\u0010\u000bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000f\u001a\u0004\u0008\u0003\u0010\u0010j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "LC75$b;",
        "",
        "",
        "b",
        "I",
        "e",
        "()I",
        "title",
        "c",
        "Ljava/lang/Integer;",
        "d",
        "()Ljava/lang/Integer;",
        "subtitle",
        "image",
        "",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "animation",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V",
        "f",
        "a",
        "h",
        "i",
        "j",
        "k",
        "l",
        "m",
        "n",
        "ride-end-summary_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final f:LC75$b$a;

.field public static final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LC75$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum h:LC75$b;

.field public static final enum i:LC75$b;

.field public static final enum j:LC75$b;

.field public static final enum k:LC75$b;

.field public static final enum l:LC75$b;

.field public static final enum m:LC75$b;

.field public static final enum n:LC75$b;

.field public static final synthetic o:[LC75$b;


# instance fields
.field public final b:I

.field public final c:Ljava/lang/Integer;

.field public final d:Ljava/lang/Integer;

.field public final e:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 28

    new-instance v9, LC75$b;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    sget v3, Lnl4;->ride_summary_message_title:I

    sget v0, Lnl4;->ride_summary_message_subtitle:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    const-string v6, "end_ride_trees.json"

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, LC75$b;-><init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v9, LC75$b;->h:LC75$b;

    new-instance v0, LC75$b;

    const-string v11, "DEFAULT_2"

    const/4 v12, 0x1

    sget v13, Lnl4;->one_less_car:I

    sget v1, Lnl4;->took_car_off_the_road:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/4 v15, 0x0

    const-string v16, "end_ride_car.json"

    const/16 v17, 0x4

    const/16 v18, 0x0

    move-object v10, v0

    invoke-direct/range {v10 .. v18}, LC75$b;-><init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LC75$b;->i:LC75$b;

    new-instance v1, LC75$b;

    const-string v20, "DEFAULT_3"

    const/16 v21, 0x2

    sget v22, Lnl4;->clean_the_air:I

    sget v2, Lnl4;->gave_world_a_breather:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v23

    const/16 v24, 0x0

    const-string v25, "end_ride_smog.json"

    const/16 v26, 0x4

    const/16 v27, 0x0

    move-object/from16 v19, v1

    invoke-direct/range {v19 .. v27}, LC75$b;-><init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, LC75$b;->j:LC75$b;

    new-instance v2, LC75$b;

    const-string v11, "PARKING_INCENTIVE"

    const/4 v12, 0x3

    sget v13, Lnl4;->ride_summary_parking_incentive_title:I

    const/4 v14, 0x0

    sget v3, Lrg4;->ic_good_parking:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v16, 0x0

    const/16 v17, 0xa

    move-object v10, v2

    invoke-direct/range {v10 .. v18}, LC75$b;-><init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, LC75$b;->k:LC75$b;

    new-instance v2, LC75$b;

    const-string v20, "PARKING_PHOTO_REVIEW"

    const/16 v21, 0x4

    sget v22, Lnl4;->ride_summary_parking_photo_review_title:I

    sget v3, Lnl4;->ride_summary_parking_photo_review_subtitle:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v23

    const/16 v25, 0x0

    const/16 v26, 0xc

    move-object/from16 v19, v2

    invoke-direct/range {v19 .. v27}, LC75$b;-><init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, LC75$b;->l:LC75$b;

    new-instance v2, LC75$b;

    const-string v11, "GROUP_RIDE_WITH_ONE_REMAINING"

    const/4 v12, 0x5

    sget v3, Lnl4;->ended_one_ride:I

    sget v4, Lnl4;->more_rides_in_progress_single:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    sget v4, Lrg4;->illustration_group_ride_tutorial_add_riders:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v17, 0x8

    move-object v10, v2

    move v13, v3

    invoke-direct/range {v10 .. v18}, LC75$b;-><init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, LC75$b;->m:LC75$b;

    new-instance v2, LC75$b;

    const-string v14, "GROUP_RIDE_WITH_MORE_REMAINING"

    const/4 v15, 0x6

    sget v5, Lnl4;->more_rides_in_progress_plural:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    const/16 v19, 0x0

    const/16 v20, 0x8

    const/16 v21, 0x0

    move-object v13, v2

    move/from16 v16, v3

    invoke-direct/range {v13 .. v21}, LC75$b;-><init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, LC75$b;->n:LC75$b;

    invoke-static {}, LC75$b;->a()[LC75$b;

    move-result-object v2

    sput-object v2, LC75$b;->o:[LC75$b;

    new-instance v2, LC75$b$a;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, LC75$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, LC75$b;->f:LC75$b$a;

    const/4 v2, 0x3

    new-array v2, v2, [LC75$b;

    const/4 v3, 0x0

    aput-object v9, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LC75$b;->g:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LC75$b;->b:I

    iput-object p4, p0, LC75$b;->c:Ljava/lang/Integer;

    iput-object p5, p0, LC75$b;->d:Ljava/lang/Integer;

    iput-object p6, p0, LC75$b;->e:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p7, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, p4

    :goto_0
    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_1

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object v7, p5

    :goto_1
    and-int/lit8 v0, p7, 0x8

    if-eqz v0, :cond_2

    move-object v8, v1

    goto :goto_2

    :cond_2
    move-object v8, p6

    :goto_2
    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    invoke-direct/range {v2 .. v8}, LC75$b;-><init>(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic a()[LC75$b;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [LC75$b;

    const/4 v1, 0x0

    sget-object v2, LC75$b;->h:LC75$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LC75$b;->i:LC75$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, LC75$b;->j:LC75$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, LC75$b;->k:LC75$b;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, LC75$b;->l:LC75$b;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, LC75$b;->m:LC75$b;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, LC75$b;->n:LC75$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static final synthetic access$getDEFAULTS$cp()Ljava/util/List;
    .locals 1

    sget-object v0, LC75$b;->g:Ljava/util/List;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LC75$b;
    .locals 1

    const-class v0, LC75$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LC75$b;

    return-object p0
.end method

.method public static values()[LC75$b;
    .locals 1

    sget-object v0, LC75$b;->o:[LC75$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LC75$b;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LC75$b;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, LC75$b;->d:Ljava/lang/Integer;

    return-object v0
.end method

.method public final d()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, LC75$b;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, LC75$b;->b:I

    return v0
.end method
