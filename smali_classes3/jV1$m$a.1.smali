.class public final LjV1$m$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjV1$m;->b(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Long;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Long;)Lio/reactivex/h;",
        "<anonymous>"
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
        "SMAP\nIdentificationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationPresenter.kt\nco/bird/android/feature/identification/IdentificationPresenter$initializeStreams$18$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,511:1\n1#2:512\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LjV1;


# direct methods
.method public constructor <init>(LjV1;)V
    .locals 0

    iput-object p1, p0, LjV1$m$a;->g:LjV1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LjV1$m$a;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LjV1$m$a;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Long;)Lio/reactivex/h;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LjV1$m$a;->g:LjV1;

    invoke-static {p1}, LjV1;->access$getCurrentSessionIdentifier(LjV1;)Lco/bird/android/model/identification/IdentificationRequestIdentifier;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LjV1$m$a;->g:LjV1;

    invoke-static {v0}, LjV1;->access$getIdentificationManager$p(LjV1;)LmT1;

    move-result-object v0

    invoke-interface {v0, p1}, LmT1;->i(Lco/bird/android/model/identification/IdentificationRequestIdentifier;)Lio/reactivex/F;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, LjV1$m$a$a;->g:LjV1$m$a$a;

    new-instance v1, LlV1;

    invoke-direct {v1, v0}, LlV1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, LjV1$m$a$b;->g:LjV1$m$a$b;

    new-instance v1, LmV1;

    invoke-direct {v1, v0}, LmV1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, LjV1$m$a;->invoke(Ljava/lang/Long;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
