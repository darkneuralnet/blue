.class public final Lyg6$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyg6;-><init>(Llh6;Lkg6;LVg6;LTq4;LEa;LRh6;)V
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
        "Ljava/lang/Boolean;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/User;",
        "it",
        "Lio/reactivex/B;",
        "",
        "kotlin.jvm.PlatformType",
        "b",
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
        "SMAP\nUserAgreementManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAgreementManagerImpl.kt\nco/bird/android/manager/agreements/UserAgreementManagerImpl$2\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,287:1\n22#2,2:288\n*S KotlinDebug\n*F\n+ 1 UserAgreementManagerImpl.kt\nco/bird/android/manager/agreements/UserAgreementManagerImpl$2\n*L\n62#1:288,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lyg6;


# direct methods
.method public constructor <init>(Lyg6;)V
    .locals 0

    iput-object p1, p0, Lyg6$b;->g:Lyg6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lyg6$b;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/User;)Lio/reactivex/B;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/User;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/reactivex/rxkotlin/e;->a:Lio/reactivex/rxkotlin/e;

    iget-object p1, p0, Lyg6$b;->g:Lyg6;

    invoke-static {p1}, Lyg6;->access$getReactiveConfig$p(Lyg6;)LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->D2()Lio/reactivex/Observable;

    move-result-object p1

    iget-object v0, p0, Lyg6$b;->g:Lyg6;

    invoke-static {v0}, Lyg6;->access$getUserManager$p(Lyg6;)Llh6;

    move-result-object v0

    invoke-interface {v0}, Llh6;->K()LZ84;

    move-result-object v0

    sget-object v1, Lyg6$b$a;->g:Lyg6$b$a;

    new-instance v2, Lzg6;

    invoke-direct {v2, v1}, Lzg6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "userManager.balance.map \u2026 }.distinctUntilChanged()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lyg6$b$b;

    invoke-direct {v1}, Lyg6$b$b;-><init>()V

    invoke-static {p1, v0, v1}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "Observable.combineLatest\u2026ombineFunction(t1, t2) })"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/User;

    invoke-virtual {p0, p1}, Lyg6$b;->b(Lco/bird/android/model/User;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
