.class public final LOI$p;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOI;->t0(Lco/bird/android/model/VehicleDescriptor;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Long;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Long;)Lio/reactivex/h;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LOI;

.field public final synthetic h:Lkotlin/jvm/internal/Ref$IntRef;

.field public final synthetic i:Lco/bird/android/model/VehicleDescriptor;


# direct methods
.method public constructor <init>(LOI;Lkotlin/jvm/internal/Ref$IntRef;Lco/bird/android/model/VehicleDescriptor;)V
    .locals 0

    iput-object p1, p0, LOI$p;->g:LOI;

    iput-object p2, p0, LOI$p;->h:Lkotlin/jvm/internal/Ref$IntRef;

    iput-object p3, p0, LOI$p;->i:Lco/bird/android/model/VehicleDescriptor;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Long;)Lio/reactivex/h;
    .locals 28

    move-object/from16 v0, p0

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, LOI$p;->g:LOI;

    sget-object v1, Lco/bird/android/model/Command;->BIRD_AIR_INITIATE_OTA_UPDATE:Lco/bird/android/model/Command;

    invoke-virtual {v1}, Lco/bird/android/model/Command;->getData()[B

    move-result-object v3

    iget-object v1, v0, LOI$p;->h:Lkotlin/jvm/internal/Ref$IntRef;

    iget v4, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LOI;->V(LOI;[BI[BILjava/lang/Object;)[B

    move-result-object v1

    move-object v15, v1

    iget-object v2, v0, LOI$p;->h:Lkotlin/jvm/internal/Ref$IntRef;

    iget v3, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/lit8 v3, v3, 0x2

    iput v3, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget-object v2, v0, LOI$p;->g:LOI;

    invoke-virtual {v2}, LOI;->n0()La94;

    move-result-object v2

    iget-object v3, v0, LOI$p;->g:LOI;

    invoke-virtual {v3}, LOI;->n0()La94;

    move-result-object v3

    invoke-virtual {v3}, La94;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, LXn1;

    iget-object v3, v0, LOI$p;->h:Lkotlin/jvm/internal/Ref$IntRef;

    iget v9, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const v26, 0x1ffbe

    const/16 v27, 0x0

    invoke-static/range {v8 .. v27}, LXn1;->copy$default(LXn1;ILco/bird/android/model/persistence/Bird;Lco/bird/android/model/persistence/VehicleVersion;Lco/bird/android/model/VehicleDescriptor;LXn1$a;LXn1$b;[B[Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/Long;IIIZILjava/lang/String;Lorg/joda/time/DateTime;ILjava/lang/Object;)LXn1;

    move-result-object v3

    invoke-virtual {v2, v3}, La94;->accept(Ljava/lang/Object;)V

    iget-object v2, v0, LOI$p;->g:LOI;

    invoke-static {v2}, LOI;->access$getRxBleBirdBluetoothManager$p(LOI;)Lrd5;

    move-result-object v2

    iget-object v3, v0, LOI$p;->i:Lco/bird/android/model/VehicleDescriptor;

    invoke-interface {v2, v3, v1}, Lrd5;->m(Lco/bird/android/model/VehicleDescriptor;[B)Lio/reactivex/c;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, LOI$p;->invoke(Ljava/lang/Long;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
