.class public final Lfv6$m;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfv6;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/uber/autodispose/ScopeProvider;Lrv6;Le13;Lgl;LTq4;Ldr4;Landroid/hardware/SensorManager;LEa;LDQ3;LYR4;LoF3;Ltm;Lbn;LcD1;Lco/bird/android/model/wire/WireRide;Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lio/github/sceneview/ar/node/ArModelNode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lio/github/sceneview/ar/node/ArModelNode;",
        "b",
        "()Lio/github/sceneview/ar/node/ArModelNode;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lfv6$m;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfv6$m;

    invoke-direct {v0}, Lfv6$m;-><init>()V

    sput-object v0, Lfv6$m;->g:Lfv6$m;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lio/github/sceneview/ar/node/ArModelNode;
    .locals 13

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "creating Ar Model Node"

    invoke-static {v2, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v1, Lio/github/sceneview/ar/node/ArModelNode;

    sget-object v4, LYU3;->j:LYU3;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Lio/github/sceneview/ar/node/ArModelNode;-><init>(LYU3;Lhu1;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lio/github/sceneview/ar/node/ArNode;->t1(Z)V

    invoke-virtual {v1, v0}, Lio/github/sceneview/ar/node/ArNode;->w1(Z)V

    const-string v4, "models/bird_sphere.glb"

    const/4 v5, 0x1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    new-instance v0, Lhu1;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x5

    const/4 v12, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lhu1;-><init>(FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v8, Lfv6$m$a;->g:Lfv6$m$a;

    sget-object v9, Lfv6$m$b;->g:Lfv6$m$b;

    invoke-virtual/range {v3 .. v9}, Lio/github/sceneview/node/ModelNode;->Z0(Ljava/lang/String;ZLjava/lang/Float;Lhu1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lio/github/sceneview/node/ModelNode;

    return-object v1
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfv6$m;->b()Lio/github/sceneview/ar/node/ArModelNode;

    move-result-object v0

    return-object v0
.end method
