.class public final enum Lt13;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/widget/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lt13;",
        ">;",
        "Lco/bird/android/widget/d;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B=\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0003\u0010\u000b\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u0003\u0012\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u0008\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0005\u001a\u0004\u0008\n\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0005\u001a\u0004\u0008\r\u0010\u0007R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\t\u0010\u0007R\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0004\u0010\u0015j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lt13;",
        "",
        "Lco/bird/android/widget/d;",
        "",
        "b",
        "I",
        "a",
        "()Ljava/lang/Integer;",
        "text",
        "c",
        "getColor",
        "color",
        "d",
        "getIcon",
        "icon",
        "e",
        "Ljava/lang/Integer;",
        "iconTintColor",
        "",
        "f",
        "Z",
        "()Z",
        "center",
        "<init>",
        "(Ljava/lang/String;IIIILjava/lang/Integer;Z)V",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final enum g:Lt13;

.field public static final enum h:Lt13;

.field public static final enum i:Lt13;

.field public static final enum j:Lt13;

.field public static final enum k:Lt13;

.field public static final enum l:Lt13;

.field public static final synthetic m:[Lt13;


# instance fields
.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:Ljava/lang/Integer;

.field public final f:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 22

    new-instance v10, Lt13;

    const-string v1, "COPY_CODE"

    const/4 v2, 0x0

    sget v3, Lnl4;->nearby_birds_copy_code_action:I

    const/4 v4, 0x0

    sget v5, Lyg4;->ic_code_scooter_dark:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x1a

    const/4 v9, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lt13;-><init>(Ljava/lang/String;IIIILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v10, Lt13;->g:Lt13;

    new-instance v0, Lt13;

    const-string v12, "COPY_SN"

    const/4 v13, 0x1

    sget v14, Lnl4;->nearby_birds_copy_sn_action:I

    const/4 v15, 0x0

    sget v16, Lrg4;->ic_barcode_scooter_dark:I

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1a

    const/16 v20, 0x0

    move-object v11, v0

    invoke-direct/range {v11 .. v20}, Lt13;-><init>(Ljava/lang/String;IIIILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lt13;->h:Lt13;

    new-instance v0, Lt13;

    const-string v2, "CHIRP"

    const/4 v3, 0x2

    sget v4, Lnl4;->nearby_birds_alarm_action:I

    const/4 v5, 0x0

    sget v6, Lrg4;->ic_alarm:I

    sget v11, LDf4;->primaryText:I

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x0

    const/16 v9, 0x12

    const/4 v10, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, Lt13;-><init>(Ljava/lang/String;IIIILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lt13;->i:Lt13;

    new-instance v0, Lt13;

    const-string v13, "REPORT_FRAUD"

    const/4 v14, 0x3

    sget v15, Lnl4;->nearby_birds_report_fraud_action:I

    const/16 v16, 0x0

    sget v17, Lrg4;->ic_report_fraud:I

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    const/16 v19, 0x0

    const/16 v20, 0x12

    const/16 v21, 0x0

    move-object v12, v0

    invoke-direct/range {v12 .. v21}, Lt13;-><init>(Ljava/lang/String;IIIILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lt13;->j:Lt13;

    new-instance v0, Lt13;

    const-string v2, "ADD_VEHICLE"

    const/4 v3, 0x4

    sget v4, Lnl4;->nearby_birds_select_vehicle:I

    sget v6, Lrg4;->ic_add_circle:I

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, Lt13;-><init>(Ljava/lang/String;IIIILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lt13;->k:Lt13;

    new-instance v0, Lt13;

    const-string v13, "VIEW_FLIGHT_SHEET"

    const/4 v14, 0x5

    sget v15, Lnl4;->nearby_birds_view_flight_sheet:I

    sget v17, Lrg4;->ic_options:I

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    move-object v12, v0

    invoke-direct/range {v12 .. v21}, Lt13;-><init>(Ljava/lang/String;IIIILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lt13;->l:Lt13;

    invoke-static {}, Lt13;->f()[Lt13;

    move-result-object v0

    sput-object v0, Lt13;->m:[Lt13;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIIILjava/lang/Integer;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Ljava/lang/Integer;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lt13;->b:I

    iput p4, p0, Lt13;->c:I

    iput p5, p0, Lt13;->d:I

    iput-object p6, p0, Lt13;->e:Ljava/lang/Integer;

    iput-boolean p7, p0, Lt13;->f:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIIILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    sget v0, LDf4;->primaryText:I

    move v5, v0

    goto :goto_0

    :cond_0
    move v5, p4

    :goto_0
    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move-object v7, v0

    goto :goto_1

    :cond_1
    move-object v7, p6

    :goto_1
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move v8, v0

    goto :goto_2

    :cond_2
    move/from16 v8, p7

    :goto_2
    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v6, p5

    invoke-direct/range {v1 .. v8}, Lt13;-><init>(Ljava/lang/String;IIIILjava/lang/Integer;Z)V

    return-void
.end method

.method public static final synthetic f()[Lt13;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lt13;

    const/4 v1, 0x0

    sget-object v2, Lt13;->g:Lt13;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lt13;->h:Lt13;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lt13;->i:Lt13;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lt13;->j:Lt13;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lt13;->k:Lt13;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lt13;->l:Lt13;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lt13;
    .locals 1

    const-class v0, Lt13;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lt13;

    return-object p0
.end method

.method public static values()[Lt13;
    .locals 1

    sget-object v0, Lt13;->m:[Lt13;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt13;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    iget v0, p0, Lt13;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lt13;->f:Z

    return v0
.end method

.method public c()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lt13;->e:Ljava/lang/Integer;

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

    iget v0, p0, Lt13;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getIcon()Ljava/lang/Integer;
    .locals 1

    iget v0, p0, Lt13;->d:I

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
