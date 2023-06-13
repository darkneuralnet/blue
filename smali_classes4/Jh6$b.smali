.class public final LJh6$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJh6;-><init>(Landroid/content/Context;LTg6;Lgl;LRp;Lef6;Ll20;Lm46;Lwi2;LRh6;LTq4;LOh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/User;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/Balance;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/android/model/User;",
        "it",
        "Lio/reactivex/B;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/Balance;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/User;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nUserManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserManagerImpl.kt\nco/bird/android/manager/user/UserManagerImpl$2\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,449:1\n22#2,2:450\n*S KotlinDebug\n*F\n+ 1 UserManagerImpl.kt\nco/bird/android/manager/user/UserManagerImpl$2\n*L\n119#1:450,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LJh6;


# direct methods
.method public constructor <init>(LJh6;)V
    .locals 0

    iput-object p1, p0, LJh6$b;->g:LJh6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/User;)Lio/reactivex/B;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/User;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/Balance;",
            ">;>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/reactivex/rxkotlin/e;->a:Lio/reactivex/rxkotlin/e;

    iget-object p1, p0, LJh6$b;->g:LJh6;

    invoke-static {p1}, LJh6;->access$getReactiveConfig$p(LJh6;)LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->Y8()Lio/reactivex/Observable;

    move-result-object p1

    iget-object v0, p0, LJh6$b;->g:LJh6;

    invoke-virtual {v0}, LJh6;->U()LZ84;

    move-result-object v0

    new-instance v1, LJh6$b$a;

    invoke-direct {v1}, LJh6$b$a;-><init>()V

    invoke-static {p1, v0, v1}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "Observable.combineLatest\u2026ombineFunction(t1, t2) })"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/User;

    invoke-virtual {p0, p1}, LJh6$b;->a(Lco/bird/android/model/User;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
