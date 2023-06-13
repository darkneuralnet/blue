.class public final LvM1$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LvM1;->V(Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanIntention;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "batchName",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Ljava/lang/String;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LvM1;


# direct methods
.method public constructor <init>(LvM1;)V
    .locals 0

    iput-object p1, p0, LvM1$e;->g:LvM1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LvM1;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, LvM1$e;->c(LvM1;Ljava/lang/String;)V

    return-void
.end method

.method public static final c(LvM1;Ljava/lang/String;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$batchName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LvM1;->access$getClipboardManager$p(LvM1;)LTk0;

    move-result-object v0

    const-string v1, "batch id"

    invoke-interface {v0, v1, p1}, LTk0;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, LvM1;->U()LFM1;

    move-result-object p1

    invoke-virtual {p1}, LFM1;->Em()V

    invoke-virtual {p0}, LvM1;->U()LFM1;

    move-result-object p0

    invoke-virtual {p0}, LRk5;->dismiss()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Lio/reactivex/h;
    .locals 3

    const-string v0, "batchName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LvM1$e;->g:LvM1;

    invoke-static {v0}, LvM1;->access$getOperatorManager(LvM1;)Lom3;

    move-result-object v0

    invoke-interface {v0}, Lom3;->f()Lio/reactivex/c;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->P(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, LvM1$e;->g:LvM1;

    new-instance v2, LyM1;

    invoke-direct {v2, v1, p1}, LyM1;-><init>(LvM1;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LvM1$e;->b(Ljava/lang/String;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
