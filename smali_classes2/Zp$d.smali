.class public final LZp$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZp;->t(Ljava/lang/String;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/TokenPairState;",
        "Lco/bird/android/model/TokenPairState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lco/bird/android/model/TokenPairState;",
        "it",
        "a",
        "(Lco/bird/android/model/TokenPairState;)Lco/bird/android/model/TokenPairState;"
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
        "SMAP\nAuthManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthManagerImpl.kt\nco/bird/android/auth/manager/AuthManagerImpl$loginWithGoogle$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lsa1;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:LZp;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;LZp;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lsa1;",
            ">;",
            "LZp;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LZp$d;->g:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, LZp$d;->h:LZp;

    iput-object p3, p0, LZp$d;->i:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/TokenPairState;)Lco/bird/android/model/TokenPairState;
    .locals 3

    iget-object p1, p0, LZp$d;->g:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, p0, LZp$d;->h:LZp;

    invoke-static {v0}, LZp;->access$getClient$p(LZp;)LLp;

    move-result-object v0

    new-instance v1, LYy2;

    iget-object v2, p0, LZp$d;->i:Ljava/lang/String;

    invoke-direct {v1, v2}, LYy2;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LLp;->d(LYy2;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/F;->g()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "client.loginWithGoogle(L\u2026t(idToken)).blockingGet()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iget-object p1, p0, LZp$d;->g:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "result"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    goto :goto_0

    :cond_0
    check-cast p1, Lsa1;

    :goto_0
    invoke-virtual {p1}, Lsa1;->b()Lco/bird/android/model/TokenPair;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v0, Lco/bird/android/model/TokenPairState;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lco/bird/android/model/TokenPairState;-><init>(Lco/bird/android/model/TokenPair;Z)V

    :cond_1
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/TokenPairState;

    invoke-virtual {p0, p1}, LZp$d;->a(Lco/bird/android/model/TokenPairState;)Lco/bird/android/model/TokenPairState;

    move-result-object p1

    return-object p1
.end method
