.class public final Lie1$m$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lie1$m;->c(Lco/bird/android/model/SetupIntentStatus;)Lio/reactivex/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/DialogResponse;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/SetupIntentStatus;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/DialogResponse;",
        "response",
        "Lio/reactivex/u;",
        "Lco/bird/android/model/SetupIntentStatus;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lie1;

.field public final synthetic h:Lco/bird/android/model/SetupIntentStatus;


# direct methods
.method public constructor <init>(Lie1;Lco/bird/android/model/SetupIntentStatus;)V
    .locals 0

    iput-object p1, p0, Lie1$m$a;->g:Lie1;

    iput-object p2, p0, Lie1$m$a;->h:Lco/bird/android/model/SetupIntentStatus;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lie1$m$a;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/DialogResponse;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/SetupIntentStatus;",
            ">;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/model/DialogResponse;->CANCEL:Lco/bird/android/model/DialogResponse;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lie1$m$a;->g:Lie1;

    invoke-static {p1}, Lie1;->access$getUserStream$p(Lie1;)LRh6;

    move-result-object p1

    invoke-interface {p1}, LRh6;->e()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lco/bird/android/model/SetupIntentStatus;->UNEXPECTED:Lco/bird/android/model/SetupIntentStatus;

    invoke-static {p1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lie1$m$a;->g:Lie1;

    invoke-static {v0}, Lie1;->access$getBrainTreeManager$p(Lie1;)Lw10;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/PaymentProvider;->BRAINTREE:Lco/bird/android/model/constant/PaymentProvider;

    invoke-interface {v0, p1, v1}, Lw10;->d(Ljava/lang/String;Lco/bird/android/model/constant/PaymentProvider;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lie1$m$a$a;

    iget-object v1, p0, Lie1$m$a;->g:Lie1;

    invoke-direct {v0, v1}, Lie1$m$a$a;-><init>(Lie1;)V

    new-instance v1, Lle1;

    invoke-direct {v1, v0}, Lle1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->C(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lie1$m$a;->h:Lco/bird/android/model/SetupIntentStatus;

    invoke-static {p1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/DialogResponse;

    invoke-virtual {p0, p1}, Lie1$m$a;->b(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
