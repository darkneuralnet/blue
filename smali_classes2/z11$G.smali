.class public final Lz11$G;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz11;-><init>(LQ11;LO01;Lcom/uber/autodispose/ScopeProvider;LEa;Lbn;LpU4;Ldr4;Le13;Lgl;LTq4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz11$G$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lz11$B;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/model/destination/Destination;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lz11$B;",
        "state",
        "Lio/reactivex/B;",
        "Lco/bird/android/model/destination/Destination;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lz11$B;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lz11;


# direct methods
.method public constructor <init>(Lz11;)V
    .locals 0

    iput-object p1, p0, Lz11$G;->g:Lz11;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/destination/Destination;
    .locals 0

    invoke-static {p0, p1}, Lz11$G;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/destination/Destination;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/destination/Destination;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/destination/Destination;

    return-object p0
.end method


# virtual methods
.method public final b(Lz11$B;)Lio/reactivex/B;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz11$B;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/model/destination/Destination;",
            ">;"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lz11$G$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lz11$G;->g:Lz11;

    invoke-static {p1}, Lz11;->access$getManager$p(Lz11;)LO01;

    move-result-object p1

    invoke-interface {p1}, LO01;->getDestination()Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lz11$G$a;->g:Lz11$G$a;

    new-instance v1, LA11;

    invoke-direct {v1, v0}, LA11;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lz11$G;->g:Lz11;

    invoke-static {p1}, Lz11;->access$getMapCenterDestinationSubject$p(Lz11;)Lio/reactivex/subjects/a;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz11$B;

    invoke-virtual {p0, p1}, Lz11$G;->b(Lz11$B;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
