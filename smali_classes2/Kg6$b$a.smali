.class public final LKg6$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKg6$b;->c(Lco/bird/android/model/Agreement;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/disposables/c;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/reactivex/disposables/c;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lio/reactivex/disposables/c;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LKg6;

.field public final synthetic h:Lco/bird/android/model/Agreement;


# direct methods
.method public constructor <init>(LKg6;Lco/bird/android/model/Agreement;)V
    .locals 0

    iput-object p1, p0, LKg6$b$a;->g:LKg6;

    iput-object p2, p0, LKg6$b$a;->h:Lco/bird/android/model/Agreement;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lio/reactivex/disposables/c;)V
    .locals 1

    iget-object p1, p0, LKg6$b$a;->g:LKg6;

    invoke-virtual {p1}, LKg6;->m()Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, LKg6$b$a;->g:LKg6;

    invoke-virtual {p1}, LKg6;->n()LRg6;

    move-result-object p1

    iget-object v0, p0, LKg6$b$a;->h:Lco/bird/android/model/Agreement;

    invoke-virtual {v0}, Lco/bird/android/model/Agreement;->getRole()Lco/bird/android/model/AgreementRole;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lco/bird/android/model/AgreementRole;->UNKNOWN:Lco/bird/android/model/AgreementRole;

    :goto_0
    invoke-virtual {v0}, Lco/bird/android/model/AgreementRole;->getTitle()I

    move-result v0

    invoke-interface {p1, v0}, LRg6;->setTitle(I)V

    :cond_1
    iget-object p1, p0, LKg6$b$a;->g:LKg6;

    invoke-virtual {p1}, LKg6;->n()LRg6;

    move-result-object p1

    iget-object v0, p0, LKg6$b$a;->h:Lco/bird/android/model/Agreement;

    invoke-virtual {v0}, Lco/bird/android/model/Agreement;->getContent()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, LRg6;->Ad(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/disposables/c;

    invoke-virtual {p0, p1}, LKg6$b$a;->a(Lio/reactivex/disposables/c;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
