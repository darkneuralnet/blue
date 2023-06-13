.class public final LTH$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTH;->a(Ljava/lang/String;)Lio/reactivex/F;
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
        "Lco/bird/android/model/BirdActionsAndSettings;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "doesOwnOrRent",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/BirdActionsAndSettings;",
        "kotlin.jvm.PlatformType",
        "b",
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
.field public final synthetic g:LTH;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LTH;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LTH$b;->g:LTH;

    iput-object p2, p0, LTH$b;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/BirdActionsAndSettings;
    .locals 0

    invoke-static {p0, p1}, LTH$b;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/BirdActionsAndSettings;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/BirdActionsAndSettings;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/BirdActionsAndSettings;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/Boolean;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/BirdActionsAndSettings;",
            ">;"
        }
    .end annotation

    const-string v0, "doesOwnOrRent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You can only get actions for birds you rent, or own."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LTH$b;->g:LTH;

    invoke-static {p1}, LTH;->access$getBirdActionsApi$p(LTH;)LfH;

    move-result-object p1

    iget-object v0, p0, LTH$b;->h:Ljava/lang/String;

    invoke-interface {p1, v0}, LfH;->b(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1}, Lio/reactivex/F;->T(J)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, LTH$b$a;->g:LTH$b$a;

    new-instance v1, LUH;

    invoke-direct {v1, v0}, LUH;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LTH$b;->b(Ljava/lang/Boolean;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
