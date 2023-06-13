.class public final LwP2$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LwP2;->a(Lco/bird/android/model/persistence/nestedstructures/AssetMedia;Landroid/widget/ImageView;II)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/e;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lio/reactivex/e;",
        "emitter",
        "",
        "b",
        "(Lio/reactivex/e;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LwP2;

.field public final synthetic h:Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(LwP2;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;IILandroid/widget/ImageView;)V
    .locals 0

    iput-object p1, p0, LwP2$b;->g:LwP2;

    iput-object p2, p0, LwP2$b;->h:Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    iput p3, p0, LwP2$b;->i:I

    iput p4, p0, LwP2$b;->j:I

    iput-object p5, p0, LwP2$b;->k:Landroid/widget/ImageView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LwP2;LwP2$b$a;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;IILandroid/widget/ImageView;)V
    .locals 0

    invoke-static/range {p0 .. p5}, LwP2$b;->c(LwP2;LwP2$b$a;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;IILandroid/widget/ImageView;)V

    return-void
.end method

.method public static final c(LwP2;LwP2$b$a;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;IILandroid/widget/ImageView;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$media"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$view"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LwP2;->access$getGlide$p(LwP2;)LUI4;

    move-result-object p0

    invoke-virtual {p0}, LUI4;->c()LrI4;

    move-result-object p0

    sget-object v0, LB41;->a:LB41;

    invoke-static {v0}, LYI4;->H0(LB41;)LYI4;

    move-result-object v0

    invoke-virtual {p0, v0}, LrI4;->G0(LLD;)LrI4;

    move-result-object p0

    invoke-virtual {p0, p1}, LrI4;->T0(LTI4;)LrI4;

    move-result-object p0

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LrI4;->a1(Ljava/lang/String;)LrI4;

    move-result-object p0

    const-string p1, "glide\n          .asDrawa\u2026    .load(media.mediaUrl)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-lez p3, :cond_0

    if-lez p4, :cond_0

    invoke-static {p3, p4}, LYI4;->I0(II)LYI4;

    move-result-object p1

    invoke-virtual {p0, p1}, LrI4;->G0(LLD;)LrI4;

    move-result-object p0

    :cond_0
    invoke-virtual {p0, p5}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    return-void
.end method


# virtual methods
.method public final b(Lio/reactivex/e;)V
    .locals 8

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, LwP2$b$a;

    iget-object v0, p0, LwP2$b;->h:Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    invoke-direct {v3, p1, v0}, LwP2$b$a;-><init>(Lio/reactivex/e;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;)V

    iget-object p1, p0, LwP2$b;->g:LwP2;

    invoke-static {p1}, LwP2;->access$getHandler$p(LwP2;)Landroid/os/Handler;

    move-result-object p1

    iget-object v2, p0, LwP2$b;->g:LwP2;

    iget-object v4, p0, LwP2$b;->h:Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    iget v5, p0, LwP2$b;->i:I

    iget v6, p0, LwP2$b;->j:I

    iget-object v7, p0, LwP2$b;->k:Landroid/widget/ImageView;

    new-instance v0, LxP2;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, LxP2;-><init>(LwP2;LwP2$b$a;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;IILandroid/widget/ImageView;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/e;

    invoke-virtual {p0, p1}, LwP2$b;->b(Lio/reactivex/e;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
