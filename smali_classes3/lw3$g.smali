.class public final Llw3$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llw3;->z(Ltw3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lkotlin/Unit;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Llw3;


# direct methods
.method public constructor <init>(Llw3;)V
    .locals 0

    iput-object p1, p0, Llw3$g;->g:Llw3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Llw3;)V
    .locals 0

    invoke-static {p0}, Llw3$g;->d(Llw3;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Llw3$g;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Llw3;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LFt2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LFt2;-><init>(Z)V

    invoke-virtual {p0, v0}, Lf1;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lkotlin/Unit;)Lio/reactivex/h;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Llw3$g;->g:Llw3;

    invoke-static {p1}, Llw3;->access$getOperatorManager$p(Llw3;)Lom3;

    move-result-object p1

    invoke-interface {p1}, Lom3;->M0()Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, Llw3$g;->g:Llw3;

    new-instance v1, Lmw3;

    invoke-direct {v1, v0}, Lmw3;-><init>(Llw3;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, Llw3$g$a;

    iget-object v1, p0, Llw3$g;->g:Llw3;

    invoke-direct {v0, v1}, Llw3$g$a;-><init>(Ljava/lang/Object;)V

    new-instance v1, Lnw3;

    invoke-direct {v1, v0}, Lnw3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Llw3$g;->c(Lkotlin/Unit;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
