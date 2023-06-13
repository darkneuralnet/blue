.class public final LF34$y$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF34$y;->b(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lio/reactivex/K<",
        "+",
        "LXn1$a;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "otaCompleted",
        "Lio/reactivex/K;",
        "LXn1$a;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Ljava/lang/Boolean;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LF34;

.field public final synthetic h:Lco/bird/android/model/VehicleDescriptor;


# direct methods
.method public constructor <init>(LF34;Lco/bird/android/model/VehicleDescriptor;)V
    .locals 0

    iput-object p1, p0, LF34$y$a;->g:LF34;

    iput-object p2, p0, LF34$y$a;->h:Lco/bird/android/model/VehicleDescriptor;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LF34$y$a;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LXn1$a;
    .locals 0

    invoke-static {p0, p1}, LF34$y$a;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LXn1$a;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LXn1$a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LXn1$a;

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Boolean;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "LXn1$a;",
            ">;"
        }
    .end annotation

    const-string v0, "otaCompleted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF34$y$a;->g:LF34;

    invoke-virtual {v0}, LtC3;->J0()LkI;

    move-result-object v0

    iget-object v1, p0, LF34$y$a;->h:Lco/bird/android/model/VehicleDescriptor;

    invoke-interface {v0, v1}, LkI;->i(Lco/bird/android/model/VehicleDescriptor;)LXn1$a;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, LXn1$a;->c:LXn1$a;

    if-ne v0, v1, :cond_0

    iget-object p1, p0, LF34$y$a;->g:LF34;

    invoke-virtual {p1}, LtC3;->W0()LUC3;

    move-result-object p1

    invoke-virtual {p1}, LUC3;->xm()Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    new-instance v1, LF34$y$a$a;

    iget-object v2, p0, LF34$y$a;->g:LF34;

    invoke-direct {v1, v2}, LF34$y$a$a;-><init>(LF34;)V

    new-instance v2, LS34;

    invoke-direct {v2, v1}, LS34;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    new-instance v1, LF34$y$a$b;

    invoke-direct {v1, v0}, LF34$y$a$b;-><init>(LXn1$a;)V

    new-instance v0, LT34;

    invoke-direct {v0, v1}, LT34;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LF34$y$a;->g:LF34;

    iget-object v1, p0, LF34$y$a;->h:Lco/bird/android/model/VehicleDescriptor;

    invoke-static {p1, v1}, LF34;->access$queryFirmwareAfterOTAWithDelay(LF34;Lco/bird/android/model/VehicleDescriptor;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {v0}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LF34$y$a;->c(Ljava/lang/Boolean;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
